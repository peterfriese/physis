//
//  BooksViewController.m
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "BookViewController.h"
#import "Book.h"

@implementation BookViewController

#pragma mark -
#pragma mark View lifecycle

// Override to allow orientations other than the default portrait orientation.
- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation {
    return YES;
}


#pragma mark -
#pragma mark Configure Cell

-(void) tableView:(UITableView *)tableView customizeCell:(UITableViewCell *)cell withManagedObject:(NSManagedObject *)managedObject forRowAtIndexPath:(NSIndexPath *)indexPath {
	cell.textLabel.text = [managedObject valueForKey:@"title"];
	cell.detailTextLabel.text = [managedObject valueForKey:@"author"];
}

#pragma mark -
#pragma mark Table view delegate

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    // Navigation logic may go here. Create and push another view controller.
    /*
    <#DetailViewController#> *detailViewController = [[<#DetailViewController#> alloc] initWithNibName:@"<#Nib name#>" bundle:nil];
     // ...
     // Pass the selected object to the new view controller.
    [self.navigationController pushViewController:detailViewController animated:YES];
    [detailViewController release];
    */
}

@end

