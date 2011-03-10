//
//  Book.h
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on Mar 10, 2011 6:41:18 PM.
//  [TODO: copyright string]
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@interface Book: NSManagedObject {
	NSString *title;
	NSString *author;
	NSString *publisher;
}
