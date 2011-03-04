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
