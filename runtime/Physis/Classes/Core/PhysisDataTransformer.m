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

#import "PhysisDataTransformer.h"
#import "JSONKit.h"

@interface PhysisDataTransformer()
- (id)transformDictionary:(NSDictionary *)dictionary;
- (id)transformArray:(NSArray *)array;
@end

// wir können mehrere transformer hinter diesem transformer verstecken:
// 1) alle transformer werden bei dem root transformer angemeldet
// 2) der root transformer fragt alle, ob sie was mit dem string anfangen könne und delegiert an denjenigen, der das kann
@implementation PhysisDataTransformer

- (id)transform:(NSString *)sourceString {
	id input = [sourceString objectFromJSONString];
    id result = nil;
    if ([input isKindOfClass:[NSArray class]]) {
        result = [self transformArray:input];
    }
    else if ([input isKindOfClass:[NSDictionary class]]) {
        result = [self transformDictionary:input];
    }
    
    return result;
}

- (id)transformDictionary:(NSDictionary *)dictionary {
    NSMutableDictionary *result = [NSMutableDictionary dictionaryWithCapacity:[dictionary count]];
    
    
    // special case for handling Rails-flavoured JSON 
    if ([dictionary count] == 1) {
        id firstElement = [[dictionary allValues] objectAtIndex:0];
        if ([firstElement isKindOfClass:[NSDictionary class]]) {
            dictionary = (NSDictionary *)firstElement;
        }
    }
    
    for (id key in [dictionary allKeys]) {
        id element = [dictionary objectForKey:key];
        if ([element isKindOfClass:[NSArray class]]) {
            [result setObject:[self transformArray:element] forKey:key];
        }
        else if ([element isKindOfClass:[NSDictionary class]]) {
            [result setObject:[self transformDictionary:element] forKey:key];
        }
        else {
            [result setObject:element forKey:key];
        }
    }
    return result;
}

- (id)transformArray:(NSArray *)array {
    NSMutableArray *result = [NSMutableArray arrayWithCapacity:[array count]];
    for (id element in array) {
        if ([element isKindOfClass:[NSArray class]]) {
            [result addObject:[self transformArray:element]];
        }
        else if ([element isKindOfClass:[NSDictionary class]]) {
            [result addObject:[self transformDictionary:element]];
        }
    }
    return result;
}

@end

