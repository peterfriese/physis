//
//  NSObject+Dump.m
//  Physis
//
//  Created by Peter Friese on 15.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "NSObject+Dump.h"
#import <objc/runtime.h>

@implementation NSObject (Dump)

-(void)dump {
    Class clazz = [self class];
    if ([clazz isSubclassOfClass:[NSArray class]]) {
        NSArray *array = (NSArray *) self;
        NSLog(@"NSArray (size:%d)", [array count]);
        for (id element in array) {
            [element dump];
        }
    }
    if ([clazz isSubclassOfClass:[NSDictionary class]]) {
        NSDictionary *dict = (NSDictionary *)self;
        NSLog(@"NSDictionary (keys: %d)", [dict count]);
        for (id key in [dict allKeys]) {
            NSLog(@"%@: %@", key, [dict valueForKey:key]);
        }
    }
}

@end
