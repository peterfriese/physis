//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 15.02.11.
// Copyright (c) 2011 Peter Friese, itemis AG
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

#import "PhysisUITableViewController.h"

@implementation PhysisUITableViewController

@synthesize fetchedResultsController;
@synthesize filteredFetchedResultsController;
@synthesize searchDisplayController;

@synthesize searchWasActive;
@synthesize savedSearchScope;
@synthesize savedSearchScopeIndex;
@synthesize savedSearchTerm;

@synthesize scopes;
@synthesize placeholderText;

#pragma mark -
#pragma mark Data Management
-(PhysisDataManager *)dataManager {
	return [PhysisDataManager sharedInstance];
}

#pragma mark -
#pragma mark View lifecycle

-(void) viewDidLoad {
	// create the search bar
	UISearchBar *searchBar = [[[UISearchBar alloc] init] autorelease];
	searchBar.autoresizingMask = UIViewAutoresizingFlexibleWidth;
	searchBar.autocorrectionType = UITextAutocorrectionTypeNo;
	[searchBar sizeToFit];
	if (scopes != nil) {
		searchBar.scopeButtonTitles = scopes;
	}
	if (placeholderText != nil) {
		searchBar.placeholder = placeholderText;
	}
	self.tableView.tableHeaderView = searchBar;	
	
	// create search display controller (CAVE: requires iOS 4.x)
	self.searchDisplayController = [[UISearchDisplayController alloc] initWithSearchBar:searchBar contentsController:self];
	self.searchDisplayController.delegate = self;	
	self.searchDisplayController.searchResultsDataSource = self;
	self.searchDisplayController.searchResultsDelegate = self;
    [super viewDidLoad];
}

#pragma mark -
#pragma mark Core Data

- (NSString *)entityName {
	NSMutableString *className = [NSMutableString stringWithString:NSStringFromClass([self class])];
	NSRange match = [className rangeOfString:@"UITableViewController"];
	if (match.location == NSNotFound) {
		match = [className rangeOfString:@"UIViewController"];
		if (match.location == NSNotFound) {
			match = [className rangeOfString:@"ViewController"];
		}		
	}
	if (match.location != NSNotFound) {
		[className deleteCharactersInRange:match];
		NSLog(@"Entity name: %@", className);
		return className;
	}
	[NSException raise:@"PHEntityNameException" format:@"You need to override PhysisUITableViewController:entityName or name your controller EntityNameUIViewController, EntityViewController or EntityUITableViewController!"];
	return nil;
}

- (NSEntityDescription *)entityDescription {
	NSManagedObjectContext *moc = [[self dataManager] managedObjectContext];
	NSEntityDescription *myEntityDescription = [NSEntityDescription entityForName:[self entityName] inManagedObjectContext:moc];
	return myEntityDescription;
}

- (NSSortDescriptor *)sortDescriptor {
    return [[[NSSortDescriptor alloc] initWithKey:@"title" ascending:YES] autorelease];
}

- (NSPredicate *)predicateForSearchString:(NSString *)searchString scope:(NSString *)scope {
    // TODO: make sure this also works when we do not have a scopes bar (need to search SELF then)
	return [NSPredicate predicateWithFormat:@"%K CONTAINS[cd] %@", [scope lowercaseString], searchString];
}

- (NSFetchRequest *)fetchRequestWithSearchPredicate:(NSPredicate *)searchPredicate {
	NSFetchRequest *fetchRequest = [[[NSFetchRequest alloc] init] autorelease];
	
	NSEntityDescription *myEntityDescription = [self entityDescription];
	[fetchRequest setEntity:myEntityDescription];
	
	[fetchRequest setFetchBatchSize:20];
	
	NSSortDescriptor *mySortDescriptor = [self sortDescriptor];
	NSArray *sortDescriptors = [NSArray arrayWithObject:mySortDescriptor];									
	[fetchRequest setSortDescriptors:sortDescriptors];
	
	if (searchPredicate != nil) {
		[fetchRequest setPredicate:searchPredicate];
	}
	
	return fetchRequest;	
}

- (NSFetchedResultsController *)newFetchedResultsControllerWithSearchPredicate:(NSPredicate *)searchPredicate {
	NSManagedObjectContext *moc = [[self dataManager] managedObjectContext];
	NSFetchRequest *myFetchRequest = [self fetchRequestWithSearchPredicate:searchPredicate];
		
	NSFetchedResultsController *myFetchedResultsController = [[NSFetchedResultsController alloc] initWithFetchRequest:myFetchRequest 
																								 managedObjectContext:moc 
																								   sectionNameKeyPath:nil 
																											cacheName:nil];
	myFetchedResultsController.delegate = self;
	NSError *error = nil;
	
	// THIS IS WHERE WE FETCH THE DATA!
	if (![myFetchedResultsController performFetch:&error]) {
		NSLog(@"Unresolved error %@, %@", error, [error userInfo]);
		abort();
	}			
	return myFetchedResultsController;	
}

- (void)refresh {

    NSError *error = nil;
    if (![[self fetchedResultsController] performFetch:&error]) {
		NSLog(@"Unresolved error %@, %@", error, [error userInfo]);
		abort();
	}			
    [self stopLoading];
}

- (NSFetchedResultsController *)fetchedResultsControllerForTableView:(UITableView *)tableView {
	if (tableView == self.tableView) {
		return self.fetchedResultsController;
	}
	else {
		return self.filteredFetchedResultsController;
	}
	
}

- (NSFetchedResultsController *)fetchedResultsController {
	if (fetchedResultsController != nil) {
		return fetchedResultsController;
	}
	fetchedResultsController = [self newFetchedResultsControllerWithSearchPredicate:nil];
	return [[fetchedResultsController retain] autorelease];	
}

- (NSFetchedResultsController *)filteredFetchedResultsController {
	if (filteredFetchedResultsController != nil) {
		return filteredFetchedResultsController;
	}
	NSPredicate *searchPredicate = [self predicateForSearchString:savedSearchTerm scope:savedSearchScope];	
	filteredFetchedResultsController = [self newFetchedResultsControllerWithSearchPredicate:searchPredicate];
	return [[fetchedResultsController retain] autorelease];
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
	NSUInteger count = [[[self fetchedResultsControllerForTableView:tableView] sections] count];
	if (count == 0) {
		count = 1;
	}
	return count;
}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	NSArray *sections = [[self fetchedResultsControllerForTableView:tableView] sections];
	NSUInteger count = 0;
	if ([sections count]) {
		id <NSFetchedResultsSectionInfo> sectionInfo = [sections objectAtIndex:section];
		count = [sectionInfo numberOfObjects];
	}
	return count;		
}

- (void)tableView:(UITableView *)tableView 
				 customizeCell:(UITableViewCell *)cell 
			 withManagedObject:(NSManagedObject *)managedObject 
			 forRowAtIndexPath:(NSIndexPath *)indexPath {
// do nothing	
}


// Customize the appearance of table view cells.
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	static NSString *CellIdentifier = @"Cell";
    
	UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
	if (cell == nil) {
		cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:CellIdentifier] autorelease];
	}
    
	// Configure the cell.
	NSManagedObject *managedObject = [[self fetchedResultsControllerForTableView:tableView] objectAtIndexPath:indexPath];
	[self tableView:tableView customizeCell:cell withManagedObject:managedObject forRowAtIndexPath:indexPath];
	
	return cell;
}

#pragma mark -
#pragma mark UISearchDisplayController delegate 

-(void) searchDisplayController:(UISearchDisplayController *)controller willUnloadSearchResultsTableView:(UITableView *)tableView {
	searchWasActive = NO;
	savedSearchTerm = nil;
	savedSearchScope = nil;
	savedSearchScopeIndex = -1;
	self.filteredFetchedResultsController.delegate = nil;
	self.filteredFetchedResultsController = nil;
}

-(BOOL) searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchString:(NSString *)searchString {
	searchWasActive = YES;
	savedSearchTerm = searchString;
	savedSearchScopeIndex = self.searchDisplayController.searchBar.selectedScopeButtonIndex;
	savedSearchScope = [self.searchDisplayController.searchBar.scopeButtonTitles objectAtIndex:savedSearchScopeIndex];
	self.filteredFetchedResultsController.delegate = nil;
	self.filteredFetchedResultsController = nil;	
	
	// by returning YES, we make sure the table view gets reloaded:
	return YES;
}

-(BOOL) searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchScope:(NSInteger)searchOption {
	searchWasActive = YES;
	savedSearchTerm = self.searchDisplayController.searchBar.text;
	savedSearchScopeIndex = searchOption;
	savedSearchScope = [self.searchDisplayController.searchBar.scopeButtonTitles objectAtIndex:searchOption];
	self.filteredFetchedResultsController.delegate = nil;
	self.filteredFetchedResultsController = nil;
	

	// by returning YES, we make sure the table view gets reloaded:	
	return YES;	
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
    [fetchedResultsController release];
    [filteredFetchedResultsController release];
    [searchDisplayController release];
    
    [scopes release];
    [placeholderText release];
    [super dealloc];
}


@end

