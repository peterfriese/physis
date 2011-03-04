//
// physis - A DSL and runtime for describing data structures in mobile apps.
// http://github.com/peterfriese/physis
// 
// Created by Peter Friese on 15.02.11.
// Copyright (c) 2011 Peter Friese, itemis AG
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

#import "PhysisDataManager.h"


@implementation PhysisDataManager

#pragma mark -
#pragma mark Properties

@synthesize mappingRegistry;
@synthesize dataTransformer;
@synthesize dataConnector;
@synthesize cacheManager;

@synthesize storeFilename;
@synthesize managedObjectModel;
@synthesize managedObjectContext;

#pragma mark -
#pragma mark Singleton handling

static PhysisDataManager *instance = nil;	

+(PhysisDataManager *)sharedInstance {
	if (instance == nil) {
		instance = [[[self class] alloc] init];
	}
    return instance;
}

+(void)setSharedInstance:(PhysisDataManager *)newInstance {
	[instance release];
    instance = newInstance;
}

- (id) init {
    if ((self = [super init])) {
        self.storeFilename = @"physis.sqlite";
		self.mappingRegistry = [[PhysisDataMappingRegistry alloc] init];
		self.dataTransformer = [[PhysisDataTransformer alloc] init];
		self.dataConnector = [[PhysisDataConnector alloc] init];
		self.cacheManager = [[PhysisCacheManager alloc] init];
		
        self.managedObjectModel = [self createManagedObjectModel];
        self.managedObjectContext = [self createManagedObjectContext];
    }
    return self;
}

- (void)dealloc {
    [storeFilename release];
	[mappingRegistry release];    
	[dataTransformer release];
	[dataConnector release];
	[cacheManager release];
    [managedObjectModel release];
    [managedObjectContext release];
	
	[super dealloc];
}

#pragma mark -
#pragma mark Environment Management

+(NSString *)applicationDocumentsDirectory {
	return [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) lastObject];
}

#pragma mark -
#pragma mark Object Model

-(NSManagedObjectModel *) createManagedObjectModel {
	return nil;
}

-(NSManagedObjectContext *) createManagedObjectContext {
	NSManagedObjectContext *moc = [[[NSManagedObjectContext alloc] init] autorelease];
	NSPersistentStoreCoordinator *coordinator = [[NSPersistentStoreCoordinator alloc] initWithManagedObjectModel:[self managedObjectModel]];
	[moc setPersistentStoreCoordinator:coordinator];
	
	NSString *STORE_TYPE = NSSQLiteStoreType;
	NSString *STORE_FILENAME = self.storeFilename;
	
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
