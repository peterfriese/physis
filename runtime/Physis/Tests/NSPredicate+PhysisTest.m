//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 04.03.11.
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

