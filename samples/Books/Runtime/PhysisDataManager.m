//
//  PhysisDataManager.m
//  Books
//
//  Created by Peter Friese on 15.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisDataManager.h"


@implementation PhysisDataManager

+(NSString *)applicationDocumentsDirectory {
	return [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) lastObject];
}

+(NSManagedObjectModel *) managedObjectModel {
	return nil;
}

+(NSManagedObjectContext *) managedObjectContext {
	static NSManagedObjectContext *moc = nil;
	if (moc != nil) {
		return moc;
	}
	moc = [[NSManagedObjectContext alloc] init];
	NSPersistentStoreCoordinator *coordinator = [[NSPersistentStoreCoordinator alloc] initWithManagedObjectModel:[self managedObjectModel]];
	[moc setPersistentStoreCoordinator:coordinator];
	
	NSString *STORE_TYPE = NSSQLiteStoreType;
	NSString *STORE_FILENAME = @"default.sqlite";
	
	NSError *error = nil;
	NSURL *url = [NSURL fileURLWithPath: [[self applicationDocumentsDirectory] stringByAppendingPathComponent:STORE_FILENAME]];
	
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
