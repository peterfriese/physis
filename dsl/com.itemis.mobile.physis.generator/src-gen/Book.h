//
//  Book.h
//  [TODO: projectName]
//
//  Created by [TODO: authorname] on [TODO: generatedDate].
//  [TODO: copyright string]
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@interface Book: NSManagedObject {
	NSString *title;
	NSString *author;
	NSString *publisher;
}

@property(nonatomic, retain) NSString *title;
@property(nonatomic, retain) NSString *author;
@property(nonatomic, retain) NSString *publisher;

@end
