//
//  PhysisUITableViewController.m
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisUITableViewController.h"
#import "DataManager.h"

@implementation PhysisUITableViewController
@synthesize fetchedResultsController;
@synthesize fetchRequest;

#pragma mark -
#pragma mark View lifecycle

-(void) viewDidLoad {
	NSError *error = nil;
	if (![[self fetchedResultsController] performFetch:&error]) {
		NSLog(@"Unresolved error %@, %@", error, [error userInfo]);
		exit(-1);
	}
}

#pragma mark -
#pragma mark Core Data

// either derive from class name or let subclasses override:
- (NSString *)entityName {
	return @"Book";
}

- (NSEntityDescription *)entityDescription {
	NSManagedObjectContext *moc = [DataManager managedObjectContext];
	NSEntityDescription *myEntityDescription = [NSEntityDescription entityForName:[self entityName] inManagedObjectContext:moc];
	return myEntityDescription;
}

- (NSSortDescriptor *)sortDescriptor {
	NSSortDescriptor *mySortDescriptor = [[[NSSortDescriptor alloc] initWithKey:@"title" ascending:YES] autorelease];
	return mySortDescriptor;
}

- (NSFetchRequest *)fetchRequest {
	if (fetchRequest == nil) {
		NSFetchRequest *myFetchRequest = [[NSFetchRequest alloc] init];

		NSEntityDescription *myEntityDescription = [self entityDescription];
		[myFetchRequest setEntity:myEntityDescription];
		
		[myFetchRequest setFetchBatchSize:20];
		
		NSSortDescriptor *mySortDescriptor = [self sortDescriptor];
		NSArray *sortDescriptors = [NSArray arrayWithObject:mySortDescriptor];									
		[myFetchRequest setSortDescriptors:sortDescriptors];
		
		self.fetchRequest = myFetchRequest;
		[myFetchRequest release];
	}
	return fetchRequest;
}

- (NSFetchedResultsController *)fetchedResultsController {
	if (fetchedResultsController != nil) {
		return fetchedResultsController;
	}
	
	NSManagedObjectContext *moc = [DataManager managedObjectContext];
	NSFetchRequest *myFetchRequest = [self fetchRequest];	
	
	NSFetchedResultsController *myFetchedResultsController = [[NSFetchedResultsController alloc] initWithFetchRequest:myFetchRequest 
																								 managedObjectContext:moc 
																								   sectionNameKeyPath:nil 
																											cacheName:@"Root"];
	myFetchedResultsController.delegate = self;
	self.fetchedResultsController = myFetchedResultsController;
	[fetchedResultsController release];
	return fetchedResultsController;
}

#pragma mark -
#pragma mark NSFetchedResultsControllerDelegate

- (void) controllerWillChangeContent:(NSFetchedResultsController *)controller {
	[self.tableView beginUpdates];
}

- (void) controllerDidChangeContent:(NSFetchedResultsController *)controller {
	[self.tableView endUpdates];
}

- (void)controller:(NSFetchedResultsController *)controller didChangeObject:(id)anObject atIndexPath:(NSIndexPath *)indexPath forChangeType:(NSFetchedResultsChangeType)type newIndexPath:(NSIndexPath *)newIndexPath {
	switch(type) {
		case NSFetchedResultsChangeInsert:
            [self.tableView insertRowsAtIndexPaths:[NSArray arrayWithObject:newIndexPath] withRowAnimation:UITableViewRowAnimationFade];
			break;
		case NSFetchedResultsChangeDelete:
			[self.tableView deleteRowsAtIndexPaths:[NSArray arrayWithObject:indexPath] withRowAnimation:UITableViewRowAnimationFade];
			break;
        case NSFetchedResultsChangeUpdate: {
            NSString *sectionKeyPath = [controller sectionNameKeyPath];
            if (sectionKeyPath == nil)
                break;
            NSManagedObject *changedObject = [controller objectAtIndexPath:indexPath];
            NSArray *keyParts = [sectionKeyPath componentsSeparatedByString:@"."];
            id currentKeyValue = [changedObject valueForKeyPath:sectionKeyPath];
            for (int i = 0; i < [keyParts count] - 1; i++) {
                NSString *onePart = [keyParts objectAtIndex:i];
                changedObject = [changedObject valueForKey:onePart];
            }
            sectionKeyPath = [keyParts lastObject];
            NSDictionary *committedValues = [changedObject committedValuesForKeys:nil];
            
            if ([[committedValues valueForKeyPath:sectionKeyPath] isEqual:currentKeyValue])
                break;
            
            NSUInteger tableSectionCount = [self.tableView numberOfSections];
            NSUInteger frcSectionCount = [[controller sections] count];
            if (tableSectionCount != frcSectionCount) {
                // Need to insert a section
                NSArray *sections = controller.sections;
                NSInteger newSectionLocation = -1;
                for (id oneSection in sections) {
                    NSString *sectionName = [oneSection name];
                    if ([currentKeyValue isEqual:sectionName]) {
                        newSectionLocation = [sections indexOfObject:oneSection];
                        break;
                    }
                }
                if (newSectionLocation == -1)
                    return; // uh oh
                
                if (!((newSectionLocation == 0) && (tableSectionCount == 1) && ([self.tableView numberOfRowsInSection:0] == 0)))
                    [self.tableView insertSections:[NSIndexSet indexSetWithIndex:newSectionLocation] withRowAnimation:UITableViewRowAnimationFade];
                NSUInteger indices[2] = {newSectionLocation, 0};
                newIndexPath = [[[NSIndexPath alloc] initWithIndexes:indices length:2] autorelease];
            }
        }
		case NSFetchedResultsChangeMove:
            if (newIndexPath != nil) {
                [self.tableView deleteRowsAtIndexPaths:[NSArray arrayWithObject:indexPath] withRowAnimation:UITableViewRowAnimationFade];
                [self.tableView insertRowsAtIndexPaths: [NSArray arrayWithObject:newIndexPath]
                                      withRowAnimation: UITableViewRowAnimationRight];
                
            }
            else {
                [self.tableView reloadSections:[NSIndexSet indexSetWithIndex:[indexPath section]] withRowAnimation:UITableViewRowAnimationFade];
            }
			break;
        default:
			break;
	}
}


#pragma mark -
#pragma mark Table view data source

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	NSUInteger count = [[fetchedResultsController sections] count];
	if (count == 0) {
		count = 1;
	}
	return count;
}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	NSArray *sections = [fetchedResultsController sections];
	NSUInteger count = 0;
	if ([sections count]) {
		id <NSFetchedResultsSectionInfo> sectionInfo = [sections objectAtIndex:section];
		count = [sectionInfo numberOfObjects];
	}
	return count;
}

// Customize the appearance of table view cells.
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	static NSString *CellIdentifier = @"Cell";
    
	UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
	if (cell == nil) {
		cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier] autorelease];
	}
    
	// Configure the cell.
	NSManagedObject *managedObject = [fetchedResultsController objectAtIndexPath:indexPath];
	cell.textLabel.text = [[managedObject valueForKey:@"title"] description];
	
	return cell;
}

#pragma mark -
#pragma mark Memory management

- (void)didReceiveMemoryWarning {
    // Releases the view if it doesn't have a superview.
    [super didReceiveMemoryWarning];
    
    // Relinquish ownership any cached data, images, etc. that aren't in use.
}

- (void)viewDidUnload {
    // Relinquish ownership of anything that can be recreated in viewDidLoad or on demand.
    // For example: self.myOutlet = nil;
}


- (void)dealloc {
	[fetchRequest release];
	[fetchedResultsController release];
    [super dealloc];
}


@end

