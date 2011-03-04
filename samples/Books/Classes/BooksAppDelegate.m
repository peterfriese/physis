//
//  BooksAppDelegate.m
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "BooksAppDelegate.h"
#import "BookViewController.h"
#import "PhysisResource.h"
#import "Book.h"
#import "DataManager.h"
#import <CoreData/CoreData.h>

@implementation BooksAppDelegate

@synthesize window;
@synthesize navigationController;

#pragma mark -
#pragma mark Application lifecycle

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {    
	
	BookViewController *booksViewController = [[BookViewController alloc] initWithStyle:UITableViewStylePlain];
	booksViewController.title = @"Bookshelf";
	booksViewController.scopes = [NSArray arrayWithObjects:@"Title", @"Author", @"Publisher", nil];
    booksViewController.placeholderText = @"Search Books";
    
	
	// Init Core Data
    PhysisDataManager *dataManager = [DataManager sharedInstance];
    [dataManager.mappingRegistry registerURL:@"http://peterfriese.local/~peterfriese/books/books.json" forEntity:@"Book" verb:@"findAll"];
    
    /*
	NSManagedObjectModel *mom = [dataManager managedObjectModel];
	NSLog(@"The managed object model is defined as follows:\n%@", mom);
	NSManagedObjectContext *moc = [dataManager managedObjectContext];	
	NSEntityDescription *bookEntity = [[mom entitiesByName] objectForKey:@"Book"];	
	
	NSError *error = nil;
	NSString *jsonString = [[NSString alloc] 
							initWithContentsOfFile:[[NSBundle mainBundle] 
													pathForResource:@"sampledata" 
													ofType:@"json"] 
							encoding:NSUTF8StringEncoding error:&error];
	NSLog(@"JSON loaded from file: %@", jsonString);
	*/
/*    
	NSFetchRequest *countRequest = [[[NSFetchRequest alloc] init] autorelease];
	[countRequest setEntity:bookEntity];	
	NSError *error = nil;
	NSArray *sampleData = [moc executeFetchRequest:countRequest error:&error];
	if ([sampleData count] < 1) {
		NSLog(@"Creating sample data");
		// Create sample data
		Book *book1 = [Book bookWithTitle:@"The Bible" author:@"God" publisher:@"The church"];
		Book *book2 = [Book bookWithTitle:@"Tapworthy" author:@"Josh Clark" publisher:@"O'Reilly"];
		
		if (![moc save:&error]) {
			NSLog(@"Error while saving\n%@",
				  ([error localizedDescription] != nil
				   ? [error localizedDescription]
				   : @"Unknown error"));
			exit(1);
		}		
	}
*/
    
    [Book findAllRemote];
/*	
	// now fetch that data!
	NSFetchRequest *request = [[[NSFetchRequest alloc] init] autorelease];
	[request setEntity:bookEntity];	
	//NSError *error = nil;
	NSArray *booksArray = [moc executeFetchRequest:request error:&error];
	if ((error != nil) || (booksArray == nil)) {
		NSLog(@"Error while fetching\n%@",
			  ([error localizedDescription] != nil
			   ? [error localizedDescription]
			   : @"Unknown error"));
		exit(1);
	}	
	for (Book *book in booksArray) {
		NSLog(@"Book %@", book.title);
	}
	NSString *json = [booksArray JSONRepresentation];
	NSLog(@"JSON: %@", json);
*/		
	navigationController = [[UINavigationController alloc] initWithRootViewController:booksViewController];
	navigationController.navigationBar.barStyle = UIBarStyleBlackOpaque;
	[booksViewController release];
	
	[self.window addSubview:navigationController.view];    
    [self.window makeKeyAndVisible];
    
    return YES;
}

#pragma mark -
#pragma mark Memory management

- (void)applicationDidReceiveMemoryWarning:(UIApplication *)application {
    /*
     Free up as much memory as possible by purging cached data objects that can be recreated (or reloaded from disk) later.
     */
}


- (void)dealloc {
	[navigationController release];
    [window release];
    [super dealloc];
}


@end
