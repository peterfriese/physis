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
#pragma mark Table view data source
/*
- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
    return 1;
}


- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if (tableView == self.searchDisplayController.searchResultsTableView) {
		return [filteredList count];
	}
	else {
	    return [list count];
	}
}


// Customize the appearance of table view cells.
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    
    static NSString *CellIdentifier = @"Cell";
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    if (cell == nil) {
        cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:CellIdentifier] autorelease];
    }
    
    // Configure the cell...
	Book *book;
	if (tableView == self.searchDisplayController.searchResultsTableView) {
		book = [filteredList objectAtIndex:[indexPath row]];
	}
	else {
		book = [list objectAtIndex:[indexPath row]];
	}
	
	cell.textLabel.text = book.title;
	cell.detailTextLabel.text = [NSString stringWithFormat:@"by %@", book.author];
    
    return cell;
}
*/

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

