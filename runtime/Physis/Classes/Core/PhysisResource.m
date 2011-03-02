//
//  PhysisResource.m
//  Books
//
//  Created by Peter Friese on 22.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisResource.h"
#import "NSString+Pluralizer.h"
#import "JSONKit.h"
#import "PhysisDataTransformer.h"
#import "PhysisDataConnector.h"

@implementation PhysisResource

@synthesize receivedData;

#pragma mark -
#pragma mark Core Data 

+(PhysisDataManager *)dataManager {
	return [PhysisDataManager sharedInstance];
}

+(NSManagedObjectModel *)managedObjectModel {
	return [[self dataManager] managedObjectModel];
}

+(NSManagedObjectContext *)managedObjectContext {
	return [[self dataManager] managedObjectContext];
}

+(NSEntityDescription *)entityDescription {
	return [[[self managedObjectModel] entitiesByName] objectForKey:[self entityName]];
}

+(NSString *)entityName {
	return NSStringFromClass([self class]);
}

+(NSString *)remoteSiteURL {
    return [[self dataManager] remoteSiteURL];
}

+(NSString *)remoteSiteProtocol {
    return [[self dataManager] remoteSiteProtocol];
}

+(NSURL *)resourceURL {
    return [NSURL URLWithString:[NSString stringWithFormat:@"%@/%@.%@", 
                                 [self remoteSiteURL], 
                                 [[[self entityName] lowercaseString] pluralize], 
                                 [self remoteSiteProtocol]]];
}

#pragma mark -
#pragma mark Finders / Remote handling

+ (void) fetchAllRemote {
	PhysisDataTransformer *transformer = [[PhysisDataTransformer alloc] init];
	PhysisDataConnector *connector = [[PhysisDataConnector alloc] init];
	[connector setTransformer:transformer];
	[connector setResultsAvailableBlock: ^(NSArray *results){
		
	}];
}

+ (void) findAllRemote {
	[self fetchAllRemote];
}

#pragma mark -
#pragma mark Memory management
-(void) dealloc {
	[receivedData release];
	[super dealloc];
}

@end
