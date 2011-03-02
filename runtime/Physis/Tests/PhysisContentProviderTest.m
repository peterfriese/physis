//
//  PhysisContentProviderTest.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "PhysisContentProvider.h"

@interface PhysisContentProviderTest : GHAsyncTestCase { }
@end

@implementation PhysisContentProviderTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testFetchData {
	[self prepare];
	
	PhysisContentProvider *contentProvider = [[PhysisContentProvider alloc] init];
	[contentProvider findAll:@"Book" withBlock: ^(id results) {
		[self notify:kGHUnitWaitStatusFailure];
	}];
	[self waitForStatus:kGHUnitWaitStatusSuccess timeout:2.0];
}

@end


// 1 find out whether we need to update the data
// 2 if yes, 
//	2.1 fetch data from remote
//	2.2 transform the data to objects
//	2.3 pump the data into the cache
//		2.3.1 transform objects into nsmanagedobjects
//		2.3.2 put nsmanagedobjects into cache db
// 3 select the data form the cache
