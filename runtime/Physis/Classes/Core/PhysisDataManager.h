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

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

#import "PhysisDataMappingRegistry.h"
#import "PhysisDataTransformer.h"
#import "PhysisDataConnector.h"
#import "PhysisCacheManager.h"

@interface PhysisDataManager : NSObject {
}

#pragma mark -
#pragma mark Singleton management

+(PhysisDataManager *)sharedInstance;
+(void)setSharedInstance:(PhysisDataManager *)newInstance;
- (id) init;


#pragma mark -
#pragma mark Environment management

+(NSString *)applicationDocumentsDirectory;


#pragma mark -
#pragma mark The Network of Workers(tm)

@property (nonatomic, retain) PhysisDataMappingRegistry *mappingRegistry;
@property (nonatomic, retain) PhysisDataTransformer *dataTransformer;
@property (nonatomic, retain) PhysisDataConnector *dataConnector;
@property (nonatomic, retain) PhysisCacheManager *cacheManager;


#pragma mark -
#pragma mark Object Model

@property (nonatomic, retain) NSString *storeFilename;
@property (nonatomic, retain) NSManagedObjectModel *managedObjectModel;
@property (nonatomic, retain) NSManagedObjectContext *managedObjectContext;
-(NSManagedObjectModel *) createManagedObjectModel;
-(NSManagedObjectContext *) createManagedObjectContext;

@end
