//
//  BooksAppDelegate.m
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "BooksAppDelegate.h"
#import "BooksViewController.h"
#import "Book.h"
#import "DataManager.h"
#import <CoreData/CoreData.h>

@implementation BooksAppDelegate

@synthesize window;
@synthesize navigationController;


#pragma mark -
#pragma mark Application lifecycle

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {    
	
	BooksViewController *booksViewController = [[BooksViewController alloc] initWithStyle:UITableViewStylePlain];
	booksViewController.title = @"Bookshelf";
	
	// Init Core Data
	NSManagedObjectModel *mom = [DataManager managedObjectModel];
	NSLog(@"The managed object model is defined as follows:\n%@", mom);
	NSManagedObjectContext *moc = [DataManager managedObjectContext];	
	NSEntityDescription *bookEntity = [[mom entitiesByName] objectForKey:@"Book"];	
	
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
	
	
	// now fetch that data!
	NSFetchRequest *request = [[[NSFetchRequest alloc] init] autorelease];
	[request setEntity:bookEntity];	
	NSError *error = nil;
	NSArray *booksArray = [moc executeFetchRequest:request error:&error];
	if ((error != nil) || (booksArray == nil)) {
		NSLog(@"Error while fetching\n%@",
			  ([error localizedDescription] != nil
			   ? [error localizedDescription]
			   : @"Unknown error"));
		exit(1);
	}	
	booksViewController.list = booksArray;
	for (Book *book in booksArray) {
		NSLog(@"Book %@", book.title);
	}
	
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
