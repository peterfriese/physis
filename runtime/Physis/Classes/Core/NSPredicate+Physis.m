//
//  NSPredicate+Physis.m
//  Physis
//
//  Created by Peter Friese on 04.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "NSPredicate+Physis.h"


@implementation NSPredicate(Physis)

+ (NSPredicate *)predicateWithParameters:(NSDictionary *)parameters; {
	NSMutableString *predicateFormatString = [NSMutableString stringWithString:@""];
	NSMutableArray *argumentArray = [NSMutableArray array];
	NSArray *keys = [parameters allKeys];
	for (int i = 0; i < [keys count]; i++) {
		[predicateFormatString appendString:@"%K == %@"];
		if (i < [parameters count] - 1) {
			[predicateFormatString appendString:@" AND "];
		}
		id key = [keys objectAtIndex:i];
		[argumentArray addObject:key];
		[argumentArray addObject:[parameters valueForKey:key]];
	}
	return [NSPredicate predicateWithFormat:predicateFormatString argumentArray:argumentArray];
}

@end
