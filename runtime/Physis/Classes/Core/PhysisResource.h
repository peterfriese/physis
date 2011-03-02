//
//  PhysisResource.h
//  Books
//
//  Created by Peter Friese on 22.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>
#import "PhysisDataManager.h"

#import "ASIHTTPRequest.h"

@interface PhysisResource : NSManagedObject {
	NSMutableData *receivedData;
}

@property (nonatomic, retain) NSMutableData *receivedData;

#pragma mark -
#pragma mark Core Data 
+(PhysisDataManager *)dataManager;
+(NSManagedObjectModel *)managedObjectModel;
+(NSManagedObjectContext *)managedObjectContext;
+(NSEntityDescription *)entityDescription;
+(NSString *)entityName;

#pragma mark -
#pragma mark Fetching
+ (void) findAllRemote;


@end
