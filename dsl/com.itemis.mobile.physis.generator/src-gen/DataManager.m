//
//  DataManager.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "DataManager.h"

@implementation DataManager


+ (NSURL *) applicationLogDirectory {
    NSString *LOG_DIRECTORY = @"CDCLI";
    static NSURL *ald = nil;
	
    if (ald == nil) {
		
        NSFileManager *fileManager = [[NSFileManager alloc] init];
        NSError *error = nil;
        NSURL *libraryURL = [fileManager URLForDirectory:NSLibraryDirectory inDomain:NSUserDomainMask
									   appropriateForURL:nil create:YES error:&error];
        if (libraryURL == nil) {
            NSLog(@"Could not access Library directory\n%@", [error localizedDescription]);
        }
        else {
            ald = [libraryURL URLByAppendingPathComponent:@"Logs"];
            ald = [ald URLByAppendingPathComponent:LOG_DIRECTORY];
            NSDictionary *properties = [ald resourceValuesForKeys:
                                        [NSArray arrayWithObject:NSURLIsDirectoryKey] error:&error];
            if (properties == nil) {
                if (![fileManager createDirectoryAtPath:[ald path]
							withIntermediateDirectories:YES attributes:nil error:&error]) {
                    NSLog(@"Could not create directory %@\n%@",
						  [ald path], [error localizedDescription]);
                    ald = nil;
                }
            }
        }
    }
    return ald;
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
    
	NSArray *bookProperties = [[NSArray alloc] init];
	
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
    
	[mom setEntities:entities];
    [entities release];
    
	return mom;
}

+ (NSManagedObjectContext *) managedObjectContext {
	static NSManagedObjectContext *moc = nil;
	if (moc != nil) {
		return moc;
	}
	moc = [[NSManagedObjectContext alloc] init];
	NSPersistentStoreCoordinator *coordinator = [[NSPersistentStoreCoordinator alloc] initWithManagedObjectModel:[DataManager managedObjectModel]];
	[moc setPersistentStoreCoordinator:coordinator];
	
	NSString *STORE_TYPE = NSXMLStoreType;
	NSString *STORE_FILENAME = @"default.xml";
	
	NSError *error = nil;
	NSURL *url = [[self applicationLogDirectory] URLByAppendingPathComponent:STORE_FILENAME];
	
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
