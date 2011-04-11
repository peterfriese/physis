//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 02.03.11.
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
#import "PhysisDataTransformer.h"
#import "NSObject+Dump.h"

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

- (void)testTransformDefaultJSONArray {
    PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
    
    NSString *jsonFilePath = [[NSBundle mainBundle] pathForResource:@"DefaultJSONArray" ofType:@"json"];
    NSError *error = nil;
    NSString *sourceString = [NSString stringWithContentsOfFile:jsonFilePath encoding:NSUTF8StringEncoding error:&error];
    
    id result = [transformer transform:sourceString];
    GHAssertTrue([[result class] isSubclassOfClass:[NSArray class]], nil);

    NSArray *array = (NSArray *)result;
    GHAssertEquals((NSUInteger) 4, [array count], nil);
    
    for (NSDictionary *dict in array) {
        GHAssertTrue([[dict class] isSubclassOfClass:[NSDictionary class]], nil);
        
        GHAssertNotNil([dict objectForKey:@"id"], nil);
        GHAssertNotNil([dict objectForKey:@"author"], nil);
        GHAssertNotNil([dict objectForKey:@"title"], nil);
        GHAssertNotNil([dict objectForKey:@"publisher"], nil);        
    }
    
    [transformer release];
}

- (void)testTransformRailsJSONArray {
    PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
    
    NSString *jsonFilePath = [[NSBundle mainBundle] pathForResource:@"RailsJSONArray" ofType:@"json"];
    NSError *error = nil;
    NSString *sourceString = [NSString stringWithContentsOfFile:jsonFilePath encoding:NSUTF8StringEncoding error:&error];
    
    id result = [transformer transform:sourceString];
    GHAssertTrue([[result class] isSubclassOfClass:[NSArray class]], nil);
    
    NSArray *array = (NSArray *)result;
    GHAssertEquals((NSUInteger) 4, [array count], nil);
    
    for (NSDictionary *dict in array) {
        GHAssertTrue([[dict class] isSubclassOfClass:[NSDictionary class]], nil);

        GHAssertNotNil([dict objectForKey:@"id"], nil);
        GHAssertNotNil([dict objectForKey:@"author"], nil);
        GHAssertNotNil([dict objectForKey:@"title"], nil);
        GHAssertNotNil([dict objectForKey:@"publisher"], nil);
    }
    
    
    [transformer release];
}


@end
