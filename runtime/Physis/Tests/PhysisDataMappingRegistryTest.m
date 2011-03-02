//
//  PhysisDataMappingRegistryTest.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "PhysisDataMappingRegistry.h"

@interface PhysisDataMappingRegistryTest : GHTestCase { }
@end

@implementation PhysisDataMappingRegistryTest

- (void)setUp {
	// Run before each test method
}

- (void)tearDown {
	// Run after each test method
}

- (void)testRegisterMappings {
	PhysisDataMappingRegistry *registry = [[PhysisDataMappingRegistry alloc] init];
	[registry registerURL:@"http://localhost/~peterfriese/books/books.json" forEntity:@"Book" verb:@"findAll"];
	[registry registerURL:@"http://localhost/~peterfriese/books/authors.json" forEntity:@"Author" verb:@"findAll"];
	
	GHAssertEqualStrings(@"http://localhost/~peterfriese/books/books.json", [registry URLForEntity:@"Book" verb:@"findAll"], nil);
	GHAssertEqualStrings(@"http://localhost/~peterfriese/books/authors.json", [registry URLForEntity:@"Author" verb:@"findAll"], nil);
	[registry release];
}

@end

