//
//  Book.h
//  Books
//
//  Created by Peter Friese on 11.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>


@interface Book : NSObject {
	NSString *title;
	NSString *author;
	NSString *publisher;
}

@property (nonatomic, retain) NSString title;
@property (nonatomic, retain) NSString author;
@property (nonatomic, retain) NSString publisher;

+ (Book)bookWithTitle:(NSString *)title author:(NSString *)author publisher:(NSString *)publisher;

@end
