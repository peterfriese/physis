//
//  PhysisDataManager.m
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataManager.h"


@implementation PhysisDataManager

@synthesize created;

#pragma mark -
#pragma mark Singleton handling

static PhysisDataManager *instance = nil;	

+(PhysisDataManager *)sharedInstance {
	if (instance == nil) {
		instance = [[[self class] alloc] init];
		[instance setCreated:[NSDate date]];
		NSLog(@"Created manager at %@", [instance created]);
	}
    return instance;
}

+(void)setSharedInstance:(PhysisDataManager *)newInstance {
	[instance release];
    instance = newInstance;
}

- (id) init {
    if ((self = [super init])) {
		// set up defaults
		mappingRegistry = [[PhysisDataMappingRegistry alloc] init];
		dataTransformer = [[PhysisDataTransformer alloc] init];
		dataConnector = [[PhysisDataConnector alloc] init];
		cacheManager = [[PhysisCacheManager alloc] init];
		
        self.managedObjectModel = [self createManagedObjectModel];
        self.managedObjectContext = [self createManagedObjectContext];
    }
    return self;
}

- (void)dealloc {
	[created release];
	[cacheManager release];
	[mappingRegistry release];
	[dataTransformer release];
	[dataConnector release];
	
	[super dealloc];
}

#pragma mark -

+(NSString *)applicationDocumentsDirectory {
	return [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) lastObject];
}

#pragma mark -
#pragma mark The Network of Helpers(tm)
@synthesize mappingRegistry;
@synthesize dataTransformer;
@synthesize dataConnector;
@synthesize cacheManager;


#pragma mark -
#pragma mark Object Model

@synthesize managedObjectModel;
@synthesize managedObjectContext;

-(NSManagedObjectModel *) createManagedObjectModel {
	return nil;
}

-(NSManagedObjectContext *) createManagedObjectContext {
	NSManagedObjectContext *moc = [[[NSManagedObjectContext alloc] init] autorelease];
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
        if ([error code] == 134100) {
            NSLog(@"Data store incompatible.\n%@", 
                  ([error localizedDescription] != nil ?
                   [error localizedDescription] : @"Unknown error"));
        }
		NSLog(@"Store configuration failure\n%@",
			  ([error localizedDescription] != nil ?
			   [error localizedDescription] : @"Unknown error"));
	}
	else {
		NSLog(@"The persistence store will be place in %@", [url standardizedURL]);
	}
	[coordinator release];
	return moc;
}

@end
