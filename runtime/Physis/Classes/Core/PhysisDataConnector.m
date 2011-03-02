//
//  PhysisDataConnector.m
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataConnector.h"
#import "ASIHTTPRequest.h"

@implementation PhysisDataConnector

@synthesize transformer;
@synthesize resultsAvailableBlock;

- (void)fetch:(NSURL *)url {
    __block ASIHTTPRequest *request = [ASIHTTPRequest requestWithURL:url];
    [request setCompletionBlock: ^{
        NSString *responseString = [request responseString];		
		if (transformer) {
			id results = [transformer transform:responseString];
			if (resultsAvailableBlock) {
				resultsAvailableBlock(results);			
			}			
		}
    }];
    [request startAsynchronous];
}

- (void)dealloc {
	[resultsAvailableBlock release];
	[transformer release];
	[super dealloc];
}

@end
