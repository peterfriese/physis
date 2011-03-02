//
//  NSString+Pluralizer.m
//  Books
//
//  Created by Peter Friese on 28.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "NSString+Pluralizer.h"


@implementation NSString (Pluralizer)

-(NSString *) pluralize {
    return [NSString stringWithFormat:@"%@s", self];
}

@end
