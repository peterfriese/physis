//
//  PhysisContentProviderTest.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "Book.h"
#import "DataManager.h"

@interface PhysisResourceMappingTest : GHAsyncTestCase { }
@end

@implementation PhysisResourceMappingTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testFetchData {
	[self prepare];
	[DataManager sharedInstance];
	PhysisDataMappingRegistry *registry = [[DataManager sharedInstance] mappingRegistry];
	[registry registerURL:@"http://localhost/~peterfriese/books/books.json" forEntity:@"Book" verb:@"findAll"];
	
	[Book findAllRemote];
	[self waitForTimeout:1.0];
	
	[DataManager setSharedInstance:nil];
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
