//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 11.02.11.
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
    
	BookViewController *booksViewController = [[BookViewController alloc] initWithStyle:UITableViewStylePlain];
	booksViewController.title = @"Bookshelf";
	booksViewController.scopes = [NSArray arrayWithObjects:@"Title", @"Author", @"Publisher", nil];
    booksViewController.placeholderText = @"Search Books";
        
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
