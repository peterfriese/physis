//
//  PhysisDataManager.h
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

#import "PhysisDataMappingRegistry.h"
#import "PhysisDataTransformer.h"
#import "PhysisDataConnector.h"
#import "PhysisCacheManager.h"

@interface PhysisDataManager : NSObject {
    NSManagedObjectModel *managedObjectModel;
    NSManagedObjectContext *managedObjectContext;
	
    NSString *remoteSiteURL;   
    NSString *remoteSiteProtocol;
	NSDate *created;
	
	PhysisDataMappingRegistry *mappingRegistry;
	PhysisDataTransformer *dataTransformer;
	PhysisDataConnector *dataConnector;
	PhysisCacheManager *cacheManager;
}

#pragma mark -
#pragma mark Singleton management
+(PhysisDataManager *)sharedInstance;
+(void)setSharedInstance:(PhysisDataManager *)newInstance;
- (id) init;

#pragma mark -
+(NSString *)applicationDocumentsDirectory;
@property (nonatomic, retain) NSDate *created;

#pragma mark -
#pragma mark The Network of Workers(tm)
@property (nonatomic, retain) PhysisDataMappingRegistry *mappingRegistry;
@property (nonatomic, retain) PhysisDataTransformer *dataTransformer;
@property (nonatomic, retain) PhysisDataConnector *dataConnector;
@property (nonatomic, retain) PhysisCacheManager *cacheManager;

#pragma mark -
#pragma mark Object Model
-(NSManagedObjectModel *) createManagedObjectModel;
-(NSManagedObjectContext *) createManagedObjectContext;

@property (nonatomic, retain) NSManagedObjectModel *managedObjectModel;
@property (nonatomic, retain) NSManagedObjectContext *managedObjectContext;

#pragma mark -
#pragma mark Remote Data Access
@property (nonatomic, retain) NSString *remoteSiteURL;
@property (nonatomic, retain) NSString *remoteSiteProtocol;

@end
