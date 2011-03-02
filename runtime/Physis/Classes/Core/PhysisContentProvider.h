//
//  PhysisContentProvider.h
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef void(^ResultsAvailableBlock)(id);

@interface PhysisContentProvider : NSObject {

}

- (void)findAll:(NSString *)entityName withBlock:(ResultsAvailableBlock)block;

@end