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

#import "PhysisDataMappingRegistry.h"


@implementation PhysisDataMappingRegistry

NSMutableDictionary *registry;

- (id)init {
	if (self = [super init]) {
		registry = [[NSMutableDictionary alloc] init];
	}
	return self;
}

- (void)registerURL:(NSString *)url forEntity:(NSString *)entity verb:(NSString *)verb {
	NSMutableDictionary *entityVerbs = [registry valueForKey:entity];
	if (entityVerbs == nil) {
		entityVerbs = [NSMutableDictionary dictionary];
		[registry setObject:entityVerbs forKey:entity];
	}
	[entityVerbs setObject:url forKey:verb];
}

- (NSString *)URLForEntity:(NSString *)entity verb:(NSString *)verb {
	NSDictionary *entityVerbs = [registry objectForKey:entity];
	if (entityVerbs) {
		return [entityVerbs objectForKey:verb];
	}
	return nil;
}

- (void)dealloc {
	[registry release];
	[super dealloc];
}

@end
