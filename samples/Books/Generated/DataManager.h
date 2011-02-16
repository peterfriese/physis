//
//  DataManager.h
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>
#import "PhysisDataManager.h"

@interface DataManager : PhysisDataManager {
    
}

+(NSManagedObjectModel *) managedObjectModel;

@end
