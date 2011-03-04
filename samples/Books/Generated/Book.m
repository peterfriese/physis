//
//  Book.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "Book.h"

@implementation Book

@dynamic ID;
@dynamic title;
@dynamic author;
@dynamic publisher;

+(Book *)bookWithTitle:(NSString *)title author:(NSString *)author publisher:(NSString *)publisher {
	NSEntityDescription *bookEntity = [self entityDescription];
	Book *book = [[[Book alloc] initWithEntity:bookEntity insertIntoManagedObjectContext:[self managedObjectContext]] autorelease];
	book.title = title;
	book.author = author;
	book.publisher = publisher;
	return book;
}

- (id)proxyForJson {
    return [NSDictionary dictionaryWithObjectsAndKeys:title, @"title", author, @"author", publisher, @"publisher", nil];
}

@end
