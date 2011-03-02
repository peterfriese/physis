//
//  PhysisDataMappingRegistry.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
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
