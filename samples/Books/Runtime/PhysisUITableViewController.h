//
//  PhysisUITableViewController.h
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CoreData/CoreData.h>

@interface PhysisUITableViewController : UITableViewController<UISearchDisplayDelegate, NSFetchedResultsControllerDelegate> {
	NSFetchedResultsController *fetchedResultsController;
	NSFetchedResultsController *filteredFetchedResultsController;;
	UISearchDisplayController *searchDisplayController;
	
	NSString *savedSearchTerm;
	NSInteger savedSearchScopeIndex;
	NSString *savedSearchScope;
	BOOL searchWasActive;
	
}

@property (nonatomic, retain) NSFetchedResultsController *fetchedResultsController;
@property (nonatomic, retain) NSFetchedResultsController *filteredFetchedResultsController;
@property (nonatomic, retain) UISearchDisplayController *searchDisplayController;

@property (nonatomic, copy) NSString *savedSearchTerm;
@property (nonatomic) NSInteger savedSearchScopeIndex;
@property (nonatomic, copy) NSString *savedSearchScope;
@property (nonatomic) BOOL searchWasActive;


- (void)tableView:(UITableView *)tableView 
				 customizeCell:(UITableViewCell *)cell 
			 withManagedObject:(NSManagedObject *)managedObject 
			 forRowAtIndexPath:(NSIndexPath *)indexPath;


@end
