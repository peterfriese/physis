//
//  PhysisDataTransformerTest.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "PhysisDataTransformer.h"

@interface PhysisDataTransformerTest : GHTestCase { }
@end

@implementation PhysisDataTransformerTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testTransformOneElement {
	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
	NSString *sourceString = @"{\"name\": \"Peter\"}";
	NSDictionary *result = [transformer transform:sourceString];

	GHAssertEquals((NSUInteger) 1,  [result count], nil);
	GHAssertEqualStrings(@"Peter", [result valueForKey:@"name"], nil);
	
	[transformer release];
}

- (void)testTransformTwoElements {
	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
	NSString *sourceString = @"{\"name\": \"Peter\", \n \"surName\": \"Friese\"}";
	NSDictionary *result = [transformer transform:sourceString];

	GHAssertEquals((NSUInteger) 2,  [result count], nil);
	GHAssertEqualStrings(@"Peter", [result valueForKey:@"name"], nil);
	GHAssertEqualStrings(@"Friese", [result valueForKey:@"surName"], nil);
	
	[transformer release];	
}

- (void)testTransformArray {
	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
	NSString *sourceString = @"[{\"name\": \"Peter\", \n \"surName\": \"Friese\"}, {\"name\": \"Heiko\", \n \"surName\": \"Behrens\"}]";
	NSArray *result = [transformer transform:sourceString];

	GHAssertEquals((NSUInteger) 2,  [result count], nil);
	NSDictionary *dict1 = [result objectAtIndex:0];
	GHAssertEqualStrings(@"Peter", [dict1 valueForKey:@"name"], nil);
	
	[transformer release];	
}


@end
