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

}

+(NSString *)applicationDocumentsDirectory;
+(NSManagedObjectModel *) managedObjectModel;
+(NSManagedObjectContext *) managedObjectContext;

@end
