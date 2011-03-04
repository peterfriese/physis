//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 01.03.11.
// Copyright (c) 2011 Peter Friese, itemis AG
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

#import <GHUnitIOS/GHUnit.h>
#import "Book.h"
#import "DataManager.h"

@interface PhysisResourceBasicTest : GHTestCase { }
@end

@implementation PhysisResourceBasicTest

- (void)setUp {
	// Run before each test method
	[DataManager sharedInstance];
}

- (void)tearDown {
	// Run after each test method
//	[DataManager setSharedInstance:nil];	
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
	GHAssertEquals((NSUInteger)4, [properties count], nil);
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
