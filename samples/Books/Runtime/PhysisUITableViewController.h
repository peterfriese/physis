//
//  PhysisUITableViewController.h
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CoreData/CoreData.h>

@interface PhysisUITableViewController : UITableViewController<NSFetchedResultsControllerDelegate> {
	NSFetchedResultsController *fetchedResultsController;
	NSFetchRequest *fetchRequest;
}

@property (nonatomic, retain) NSFetchedResultsController *fetchedResultsController;
@property (nonatomic, retain) NSFetchRequest *fetchRequest;

@end
