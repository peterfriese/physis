//
//  BooksViewController.m
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "BooksViewController.h"
#import "Book.h"

@implementation BooksViewController

@synthesize list;
@synthesize filteredList;
@synthesize searchDisplayController;

#pragma mark -
#pragma mark Initialization

#pragma mark -
#pragma mark View lifecycle

- (void)viewDidLoad {
    [super viewDidLoad];
	
	UISearchBar *searchBar = [[UISearchBar alloc] init];
	searchBar.scopeButtonTitles = [NSArray arrayWithObjects:@"Title", @"Author", @"Publisher", nil];
	searchBar.placeholder = @"Search Books";
	[searchBar sizeToFit];
	self.tableView.tableHeaderView = searchBar;	
	
	searchDisplayController = [[UISearchDisplayController alloc] initWithSearchBar:searchBar contentsController:self];
	[self setSearchDisplayController:searchDisplayController];
	searchDisplayController.delegate = self;
	searchDisplayController.searchResultsDataSource = self;
	[searchBar release];
}

// Override to allow orientations other than the default portrait orientation.
- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation {
    return YES;
}


#pragma mark -
#pragma mark Table view data source

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

#pragma mark -
#pragma mark UISearchDisplayController delegate 

-(void) filterListForSearchString:(NSString *)searchString scope:(NSString *)scope {
	NSPredicate *predicate;
	if ([scope isEqualToString:@"Title"]) {
		predicate = [NSPredicate predicateWithFormat:@"title CONTAINS[cd] %@", searchString];
	}
	else if ([scope isEqualToString:@"Author"]) {
		predicate = [NSPredicate predicateWithFormat:@"author CONTAINS[cd] %@", searchString];
	}
	else if ([scope isEqualToString:@"Publisher"]) {
		predicate = [NSPredicate predicateWithFormat:@"publisher CONTAINS[cd] %@", searchString];
	}
	self.filteredList = [list filteredArrayUsingPredicate:predicate];
}

-(BOOL) searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchString:(NSString *)searchString {
	NSInteger scopeIndex = self.searchDisplayController.searchBar.selectedScopeButtonIndex;
	NSString *scope = [self.searchDisplayController.searchBar.scopeButtonTitles objectAtIndex:scopeIndex];
	[self filterListForSearchString:searchString scope:scope];
	return YES;
}

-(BOOL) searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchScope:(NSInteger)searchOption {
	NSString *scope = [self.searchDisplayController.searchBar.scopeButtonTitles objectAtIndex:searchOption];
	NSString *searchString = self.searchDisplayController.searchBar.text;
	[self filterListForSearchString:searchString scope:scope];
	return YES;	
}


#pragma mark -
#pragma mark Memory management

- (void)dealloc {
	[searchDisplayController release];
	[list release];
	[filteredList release];
    [super dealloc];
}


@end

