//
//  PhysisResource.m
//  Books
//
//  Created by Peter Friese on 22.02.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import "PhysisResource.h"
#import "NSString+Pluralizer.h"
#import "JSONKit.h"
#import "PhysisDataTransformer.h"
#import "PhysisDataConnector.h"
#import "NSPredicate+Physis.h"

@implementation PhysisResource

#pragma mark -
#pragma mark Core Data 

+(PhysisDataManager *)dataManager {
	PhysisDataManager *manager = [PhysisDataManager sharedInstance];
	NSLog(@"Manager: %@, date:%@", manager, [manager created]);
	return manager;
}

+(NSManagedObjectModel *)managedObjectModel {
	return [[self dataManager] managedObjectModel];
}

+(NSManagedObjectContext *)managedObjectContext {
	return [[self dataManager] managedObjectContext];
}

+(NSEntityDescription *)entityDescription {
	NSManagedObjectModel *mom = [self managedObjectModel];
	NSLog(@"MOM: %@", mom);
	NSDictionary *entities = [mom entitiesByName];
	return [entities objectForKey:[self entityName]];
}

+(NSString *)entityName {
	return NSStringFromClass([self class]);
}

+(NSString *)remoteSiteURL {
    return [[self dataManager] remoteSiteURL];
}

+(NSString *)remoteSiteProtocol {
    return [[self dataManager] remoteSiteProtocol];
}

+(NSURL *)resourceURL {
    return [NSURL URLWithString:[NSString stringWithFormat:@"%@/%@.%@", 
                                 [self remoteSiteURL], 
                                 [[[self entityName] lowercaseString] pluralize], 
                                 [self remoteSiteProtocol]]];
}

+ (PhysisDataMappingRegistry *)mappingRegistry {
	return [[self dataManager] mappingRegistry];
}

+ (PhysisDataConnector *)dataConnector {
	return [[self dataManager] dataConnector];
}

+ (PhysisCacheManager *)cacheManager {
	return [[self dataManager] cacheManager];
}

+ (NSString *)remoteIdField {
	return @"id";
}

+ (NSString *)localIdField {
	return @"ID";
}

#pragma mark -
#pragma mark Finders / Remote handling

+ (id)findLocalWithParameters:(NSDictionary *)parameters {
	NSEntityDescription *description = [self entityDescription];
	NSManagedObjectContext *context = [self managedObjectContext];	
	
	NSFetchRequest *request = [[[NSFetchRequest alloc] init] autorelease];
	[request setEntity:description];
	
	NSPredicate *predicate = [NSPredicate predicateWithParameters:parameters];
	[request setPredicate:predicate];

	NSError *error = nil;
	NSArray *results = [context executeFetchRequest:request error:&error];
	if ((error != nil) || (results == nil)) {
		NSLog(@"Error while fetching\n%@",
			  ([error localizedDescription] != nil
			   ? [error localizedDescription]
			   : @"Unknown error"));
	}	
	return results;	
}

+ (id)findLocalByID:(id)localId {
	NSDictionary *parameters = [NSDictionary dictionaryWithObjectsAndKeys:localId, [self localIdField], nil];
	return [self findLocalWithParameters:parameters];
}

+ (NSString *)localNameForRemoteField:(NSString *)remoteName {
	if ([remoteName isEqualToString:[self remoteIdField]]) {
		return [self localIdField];
	}
	else {
		return remoteName;
	}
}

+ (void)fetchAllRemote {
	// get the URL for this request from the registry
	NSString *urlString = [[self.class mappingRegistry] URLForEntity:[self entityName] verb:@"findAll"];
	NSURL *url = [NSURL URLWithString:urlString];
	
	// now go fetch the data
	[[self dataConnector] fetch:url withBlock: ^(id results) {

		NSEntityDescription *description = [self entityDescription];
		NSManagedObjectContext *context = [self managedObjectContext];
				
		// map data
		for (id element in results) {
			NSLog(@"Element is a %@: %@", [element class], element);

			if ([element isKindOfClass:[NSDictionary class]]) {
				PhysisResource *resource = nil;
				NSDictionary *properties = (NSDictionary *)element;
				
				// is it available locally?
				id remoteId = [properties valueForKey:[self remoteIdField]];
				
				// if there is a remote ID, try to find the matching local record
				if (remoteId != nil) {
					id results = [self findLocalByID:remoteId];
					if ([results isKindOfClass:[NSArray class]]) {
						NSArray *resultsArray = (NSArray *)results;
						if ([resultsArray count] > 0) {
							resource = [resultsArray objectAtIndex:0]; // uh-oh
						}
						else {
							NSLog(@"NO RESULTS, creating new resource");
							resource = [[self alloc] initWithEntity:description insertIntoManagedObjectContext:context];
						}
					}
				}
				// otherwise create new local record
				else {
					resource = [[self alloc] initWithEntity:description insertIntoManagedObjectContext:context];		
				}
				
				[properties enumerateKeysAndObjectsUsingBlock: ^(id key, id object, BOOL *stop){
					@try {
						NSString *propertyName = [self localNameForRemoteField:key];
						NSLog(@"Updating entity %@, setting value of local field %@ (mapped from remote field %@) to value %@", [self entityName], propertyName, key, object);
						[resource setValue:object forKey:propertyName];
					}
					@catch (NSException * e) {
						// An exception will be thrown when we try to set a vlue for an unknow key.
						// There are certainly nicer ways to ensure we do not wet unknown keys. In the future,
						// we should try to iterate all accessible fields of a resource and try to find matching 
						// fields in the results being fetched from the remote service.
						// For the time being, the exception approach is sufficient, however.
						// Unfortunately, the exception is untyped, so we cannot filter here. The name of the exception is NSUnknownKeyException.
					}

				}];
			}
		}
		
		
		// save to store
		NSError *error = nil;
		[context save:&error];
		if (error != nil) {
			NSLog(@"Error while saving\n%@",
				  ([error localizedDescription] != nil
				   ? [error localizedDescription]
				   : @"Unknown error"));			
		}
		
	}];
}

+ (void) findAllRemote {
	[self fetchAllRemote];
}


#pragma mark -
#pragma mark Memory management
-(void) dealloc {
	[super dealloc];
}

@end
