//
//  Book.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "Book.h"
#import "DataManager.h"

@implementation Book

@dynamic title;
@dynamic author;
@dynamic publisher;

+(Book *)bookWithTitle:(NSString *)title author:(NSString *)author publisher:(NSString *)publisher {
	NSManagedObjectModel *mom = [DataManager managedObjectModel];
	NSManagedObjectContext *moc = [DataManager managedObjectContext];
	NSEntityDescription *bookEntity = [[mom entitiesByName] objectForKey:@"Book"];
	Book *book = [[Book alloc] initWithEntity:bookEntity insertIntoManagedObjectContext:moc];
	book.title = title;
	book.author = author;
	book.publisher = publisher;
	return book;	
}

- (id)proxyForJson {
	return [NSDictionary dictionaryWithObjectsAndKeys:
		title, @"title",
		author, @"author",
		publisher, @"publisher",
		nil
	];
}
@end
