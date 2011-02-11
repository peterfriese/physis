//
//  DataManager.h
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@interface DataManager : NSObject {
    
}

+(NSURL *) applicationLogDirectory;
+(NSManagedObjectModel *) managedObjectModel;
+(NSManagedObjectContext *) managedObjectContext;

@end
