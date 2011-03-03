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
#import "DataManager.h"

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
	
	PhysisDataConnector *connector = [[PhysisDataConnector alloc] init];

	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];	
	[connector setTransformer:transformer];
	
	NSURL *url = [NSURL URLWithString:@"http://localhost/~peterfriese/books/books.json"];
	[connector fetch:url withBlock: ^(id results) {
		if (results == nil) {
			[self notify:kGHUnitWaitStatusFailure];
		}
		else {
			[self notify:kGHUnitWaitStatusSuccess];
		}		
	}];
	[self waitForStatus:kGHUnitWaitStatusSuccess timeout:10.0];

	[transformer release];	
	[connector release];
}

- (void)testFetchWithTransformerFetchedFromDataManager {
	[self prepare];
	
	// this time, the transformer will be fetched from the data connector manager:
	[DataManager sharedInstance];
	PhysisDataConnector *connector = [[PhysisDataConnector alloc] init];
	
	NSURL *url = [NSURL URLWithString:@"http://localhost/~peterfriese/books/books.json"];
	[connector fetch:url withBlock: ^(id results) {
		if (results == nil) {
			[self notify:kGHUnitWaitStatusFailure];
		}
		else {
			[self notify:kGHUnitWaitStatusSuccess];
		}		
	}];
	[self waitForStatus:kGHUnitWaitStatusSuccess timeout:10.0];
	
	[connector release];
	[DataManager setSharedInstance:nil];
}


@end
