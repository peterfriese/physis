//
//  PhysisDataManager.h
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@interface PhysisDataManager : NSObject {
    NSManagedObjectModel *managedObjectModel;
    NSManagedObjectContext *managedObjectContext;
    
    NSString *remoteSiteURL;   
    NSString *remoteSiteProtocol;
}

#pragma mark -
#pragma mark Singleton management
+(PhysisDataManager *)sharedInstance;
+(void)setSharedInstance:(PhysisDataManager *)newInstance;
- (id) init;
- (id) initWithOptions:(NSDictionary*)options;

#pragma mark -
+(NSString *)applicationDocumentsDirectory;

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
