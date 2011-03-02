//
//  PhysisResourceBasicTest.m
//  Physis
//
//  Created by Peter Friese on 01.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <GHUnitIOS/GHUnit.h>
#import "Book.h"
#import "DataManager.h"

@interface PhysisResourceBasicTest : GHTestCase { }
@end

@implementation PhysisResourceBasicTest

- (void)setUp {
	// Run before each test method
	[[DataManager alloc] init];	
}

- (void)tearDown {
	// Run after each test method
	[DataManager setSharedInstance:nil];	
}

- (void)testEntityName {
	GHAssertEqualStrings(@"Book", [Book entityName], nil);
}

- (void)testEntityDescriptionExists {
	NSEntityDescription *desc = [Book entityDescription];
	GHAssertNotNil(desc, nil);
}

- (void)testEntityDescriptionHasProperName {
	NSEntityDescription *desc = [Book entityDescription];
	GHAssertEqualStrings(@"Book", [desc name], nil);
}

- (void)testEntityDescriptionHasAllAttributes {
	NSEntityDescription *desc = [Book entityDescription];
	
	NSArray *properties = [desc properties];
	GHAssertNotNil(properties, nil);
	GHAssertEquals((NSUInteger)3, [properties count], nil);
}

- (void)testEntityDescriptionAttributesSetupProperly {
	NSEntityDescription *desc = [Book entityDescription];

	NSArray *properties = [desc properties];	
	NSMutableDictionary *attrDict = [[NSMutableDictionary alloc] init];
	for (NSPropertyDescription *attrDesc in properties) {
		[attrDict setObject:attrDesc forKey:[attrDesc name]];
	}
	
	NSAttributeDescription *titleAttribute = [attrDict objectForKey:@"title"];
	NSAttributeType at = [titleAttribute attributeType];
	NSAttributeType sat = NSStringAttributeType;
	GHAssertEquals(sat, at, nil);
	
	GHAssertFalse([titleAttribute isOptional], nil);
}


@end
