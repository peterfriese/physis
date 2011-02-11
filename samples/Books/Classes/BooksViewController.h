//
//  BooksViewController.h
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <UIKit/UIKit.h>


@interface BooksViewController : UITableViewController {
	NSArray *list;
}

@property (nonatomic, retain) NSArray *list;

@end
