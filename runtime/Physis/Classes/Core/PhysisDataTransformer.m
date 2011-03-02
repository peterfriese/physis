//
//  PhysisDataTransformer.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataTransformer.h"
#import "JSONKit.h"

// wir können mehrere transformer hinter diesem transformer verstecken:
// 1) alle transformer werden bei dem root transformer angemeldet
// 2) der root transformer fragt alle, ob sie was mit dem string anfangen könne und delegiert an denjenigen, der das kann
@implementation PhysisDataTransformer

- (id)transform:(NSString *)sourceString {
	return [sourceString objectFromJSONString];
}

@end

