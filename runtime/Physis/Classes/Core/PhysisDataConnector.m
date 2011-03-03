//
//  PhysisDataConnector.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataConnector.h"
#import "ASIHTTPRequest.h"
#import "PhysisDataManager.h"

@implementation PhysisDataConnector

@synthesize transformer;

- (PhysisDataTransformer *)transformer {
	if (transformer == nil) {
		self.transformer = [[PhysisDataManager sharedInstance] dataTransformer];
	}
	return transformer;
}

- (void)fetch:(NSURL *)url withBlock:(ResultsAvailableBlock)block {
    __block ASIHTTPRequest *request = [ASIHTTPRequest requestWithURL:url];
    [request setCompletionBlock: ^{
        NSString *responseString = [request responseString];		
		if (self.transformer) {
			id results = [self.transformer transform:responseString];
			if (block) {
				block(results);			
			}			
		}
    }];
    [request startAsynchronous];
}

- (void)dealloc {
	[transformer release];
	[super dealloc];
}

@end
