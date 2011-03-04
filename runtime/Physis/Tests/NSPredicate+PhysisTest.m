//
//  NSPredicate+PhysisTest.m
//  Physis
//
//  Created by Peter Friese on 04.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "NSPredicate+Physis.h"

@interface NSPredicate_PhysisTest : GHTestCase { }
@end

@implementation NSPredicate_PhysisTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testMyTest {
	NSDictionary *parameters = [NSDictionary dictionaryWithObjectsAndKeys:@"17", @"id", @"peter", @"name", nil];
	NSPredicate *predicate = [NSPredicate predicateWithParameters:parameters];
	GHAssertEqualStrings(@"id == \"17\" AND name == \"peter\"", [predicate description], nil);
}

@end

