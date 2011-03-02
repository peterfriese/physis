//
//  PhysisDataConnector.h
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "PhysisDataTransformer.h"

typedef void(^ResultsAvailableBlock)(NSArray *);

@interface PhysisDataConnector : NSObject {
	PhysisDataTransformer *transformer;
}

@property(nonatomic, retain) PhysisDataTransformer *transformer;
@property(nonatomic, copy) ResultsAvailableBlock resultsAvailableBlock;

- (void)fetch:(NSURL *)url;

@end