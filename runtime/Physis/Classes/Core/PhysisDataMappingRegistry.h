//
//  PhysisDataMappingRegistry.h
//  Physis
//
//  Created by Peter Friese on 02.03.11.
//  Copyright 2011 itemis. All rights reserved.
//

#import <Foundation/Foundation.h>


@interface PhysisDataMappingRegistry : NSObject {

}

- (void)registerURL:(NSString *)url forEntity:(NSString *)entity verb:(NSString *)verb;
- (NSString *)URLForEntity:(NSString *)entity verb:(NSString *)verb;
	
@end
