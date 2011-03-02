//
//  PhysisDataManager.m
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataManager.h"


@implementation PhysisDataManager

@synthesize remoteSiteURL;
@synthesize remoteSiteProtocol;

#pragma mark -
#pragma mark Singleton handling
static PhysisDataManager *instance;
+(PhysisDataManager *)sharedInstance {
    return instance;
}

+(void)setSharedInstance:(PhysisDataManager *)newInstance {
    instance = newInstance;
}

- (id) init {
    return [self initWithOptions:nil];
}

- (id) initWithOptions:(NSDictionary*)options {
    if ((self = [super init])) {
        if (instance == nil) {
            instance = self;
        }
        remoteSiteProtocol = @"json";
        managedObjectModel = [self createManagedObjectModel];
        managedObjectContext = [self createManagedObjectContext];
    }
    return self;
}


#pragma mark -

+(NSString *)applicationDocumentsDirectory {
	return [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) lastObject];
}

#pragma mark -
#pragma mark Object Model

@synthesize managedObjectModel;
@synthesize managedObjectContext;

-(NSManagedObjectModel *) createManagedObjectModel {
	return nil;
}

-(NSManagedObjectContext *) createManagedObjectContext {
	NSManagedObjectContext *moc = [[NSManagedObjectContext alloc] init];
	NSPersistentStoreCoordinator *coordinator = [[NSPersistentStoreCoordinator alloc] initWithManagedObjectModel:[self managedObjectModel]];
	[moc setPersistentStoreCoordinator:coordinator];
	
	NSString *STORE_TYPE = NSSQLiteStoreType;
	NSString *STORE_FILENAME = @"default.sqlite";
	
	NSError *error = nil;
	NSURL *url = [NSURL fileURLWithPath: [[PhysisDataManager applicationDocumentsDirectory] stringByAppendingPathComponent:STORE_FILENAME]];
	
	NSPersistentStore *newStore = [coordinator addPersistentStoreWithType:STORE_TYPE 
															configuration:nil 
																	  URL:url 
																  options:nil 
																	error:&error];
	if (newStore == nil) {
		NSLog(@"Store configuration failure\n%@",
			  ([error localizedDescription] != nil ?
			   [error localizedDescription] : @"Unknown error"));
	}
	return moc;
}

@end
