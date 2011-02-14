//
//  DataManager.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "DataManager.h"

@implementation DataManager


+(NSString *)applicationDocumentsDirectory {
	return [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) lastObject];
}

+(NSManagedObjectModel *) managedObjectModel {
	static NSManagedObjectModel *mom = nil;
	if (mom != nil) {
		return mom;
	}
	mom = [[NSManagedObjectModel alloc] init];
	
    NSMutableArray *entities = [[NSMutableArray alloc] init];
    
	// Entity Book
	NSEntityDescription *BookEntity = [[NSEntityDescription alloc] init];
	[BookEntity setName:@"Book"];
	[BookEntity setManagedObjectClassName:@"Book"];
    [entities addObject:BookEntity];
    
	NSMutableArray *bookProperties = [[NSMutableArray alloc] init];
	
	// Attribute Book::title
	NSAttributeDescription *titleAttribute = [[NSAttributeDescription alloc] init];
	[titleAttribute setName:@"title"];
	[titleAttribute setAttributeType:NSStringAttributeType];
	[titleAttribute setOptional:NO];
	[bookProperties addObject:titleAttribute];

	// Attribute Book::author
	NSAttributeDescription *authorAttribute = [[NSAttributeDescription alloc] init];
	[authorAttribute setName:@"author"];
	[authorAttribute setAttributeType:NSStringAttributeType];
	[authorAttribute setOptional:NO];
	[bookProperties addObject:authorAttribute];

	// Attribute Book::publisher
	NSAttributeDescription *publisherAttribute = [[NSAttributeDescription alloc] init];
	[publisherAttribute setName:@"publisher"];
	[publisherAttribute setAttributeType:NSStringAttributeType];
	[publisherAttribute setOptional:NO];
	[bookProperties addObject:publisherAttribute];

	[BookEntity setProperties:bookProperties];
	[bookProperties release];
    
	[mom setEntities:entities];
    [entities release];
    
	return mom;
}

+(NSManagedObjectContext *) managedObjectContext {
	static NSManagedObjectContext *moc = nil;
	if (moc != nil) {
		return moc;
	}
	moc = [[NSManagedObjectContext alloc] init];
	NSPersistentStoreCoordinator *coordinator = [[NSPersistentStoreCoordinator alloc] initWithManagedObjectModel:[DataManager managedObjectModel]];
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
