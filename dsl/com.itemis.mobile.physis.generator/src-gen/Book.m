//
//  Book.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "Book.h"

@implementation Book

@synthesize title;
@synthesize author;
@synthesize publisher;

+(Book *)bookWithTitle:(NSString *)title author:(NSString *)author publisher:(NSString *)publisher {
	NSManagedObjectModel *mom = [DataManager managedObjectModel];
	NSManagedObjectContext *moc = [DataManager managedObjectContext];
	NSEntityDescription *BookEntity = [[mom entitiesByName] objectForKey:@"Book"];
	Book *book = [[Book alloc] initWithEntity:BookEntity insertIntoManagedObjectContext:moc];
	book.title = title;
	book.author = author;
	book.publisher = publisher;
	return book;	
}

@end
