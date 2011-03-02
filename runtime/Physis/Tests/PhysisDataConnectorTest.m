//
//  PhysisDataConnectorTest.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "PhysisDataConnector.h"
#import "PhysisDataTransformer.h"

@interface PhysisDataConnectorTest : GHAsyncTestCase { }
@end

@implementation PhysisDataConnectorTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testFetchWithTransformer {
	[self prepare];
	
	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
	PhysisDataConnector *connector = [[PhysisDataConnector alloc] init];
	[connector setTransformer:transformer];
	NSURL *url = [NSURL URLWithString:@"http://localhost/~peterfriese/books/books.json"];
	[connector setResultsAvailableBlock:^(NSArray *results) {
		if (results == nil) {
			[self notify:kGHUnitWaitStatusFailure];
		}
		else {
			NSLog(@"Result: %@", results);
			[self notify:kGHUnitWaitStatusSuccess];
		}		
	}];
	
	[connector fetch:url];
	[self waitForStatus:kGHUnitWaitStatusSuccess timeout:10.0];

	[transformer release];	
	[connector release];
}


@end
