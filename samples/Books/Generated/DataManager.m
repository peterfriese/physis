//
//  DataManager.m
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import "DataManager.h"

@implementation DataManager

-(NSManagedObjectModel *)createManagedObjectModel {
	NSManagedObjectModel *mom = [[[NSManagedObjectModel alloc] init] autorelease];
	
    NSMutableArray *entities = [[NSMutableArray alloc] init];
    
	// Entity Book
	NSEntityDescription *BookEntity = [[[NSEntityDescription alloc] init] autorelease];
	[BookEntity setName:@"Book"];
	[BookEntity setManagedObjectClassName:@"Book"];
    [entities addObject:BookEntity];
    
	NSMutableArray *bookProperties = [[NSMutableArray alloc] init];
	
	// primary key
	NSAttributeDescription *idAttribute = [[[NSAttributeDescription alloc] init] autorelease];
	[idAttribute setName:@"ID"];
	[idAttribute setAttributeType:NSInteger16AttributeType];
	[idAttribute setOptional:NO];
	[bookProperties addObject:idAttribute];
	
	// Attribute Book::title
	NSAttributeDescription *titleAttribute = [[[NSAttributeDescription alloc] init] autorelease];
	[titleAttribute setName:@"title"];
	[titleAttribute setAttributeType:NSStringAttributeType];
	[titleAttribute setOptional:NO];
	[bookProperties addObject:titleAttribute];

	// Attribute Book::author
	NSAttributeDescription *authorAttribute = [[[NSAttributeDescription alloc] init] autorelease];
	[authorAttribute setName:@"author"];
	[authorAttribute setAttributeType:NSStringAttributeType];
	[authorAttribute setOptional:NO];
	[bookProperties addObject:authorAttribute];

	// Attribute Book::publisher
	NSAttributeDescription *publisherAttribute = [[[NSAttributeDescription alloc] init] autorelease];
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

@end
