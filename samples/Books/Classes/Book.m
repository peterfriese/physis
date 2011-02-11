//
//  Book.m
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "Book.h"


@implementation Book

@synthesize title;
@synthesize author;
@synthesize publisher;

+ (Book)bookWithTitle:(NSString *)title author:(NSString *)author publisher:(NSString *)publisher {
	Book *book = [[[Book alloc] init] autorelease];
	book.title = title;
	book.author = author;
	book.publisher = publisher;
	return book;
}

@end
