package com.itemis.mobile.physis.generator

import com.itemis.mobile.physis.physis.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.itemis.mobile.physis.physis.Entity
import com.itemis.mobile.physis.physis.Type
import com.itemis.mobile.physis.physis.Attribute
import com.itemis.mobile.physis.PhysisMetamodelExtensions

class DataManagerGenerator extends com.itemis.mobile.physis.generator.AbstractBaseGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension PhysisMetamodelExtensions
	
	generate(DataModel object, IFileSystemAccess fsa) {
		fsa.generateFile(object.headerFileName, object.headerFile);
		fsa.generateFile(object.moduleFileName, object.moduleFile);
	}	
	
	override baseFileName(EObject model) {
		"DataManager"
	}	
	
	headerFile(DataModel model) {
		'''
			#import <Foundation/Foundation.h>
			#import <CoreData/CoreData.h>
			#import "PhysisDataManager.h"
			
			@interface DataManager : PhysisDataManager {
			
			}
			
			@end
		'''
	}
	
	moduleFile(DataModel model) {
		'''
			#import "DataManager.h"
			
			@implementation DataManager
			
			-(NSManagedObjectModel *)createManagedObjectModel {
				NSManagedObjectModel *mom = [[[NSManagedObjectModel alloc] init] autorelease];
				
				«entityDescriptions(model)»
				
				return mom;
			}
			
			@end
		'''		
	}
	
	entityDescriptions(DataModel model) {
		'''
			NSMutableArray *entities = [[NSMutableArray alloc] init];
			«FOR type: model.types»
				«type.typeDescription»
			«ENDFOR»
			
			[mom setEntities:entities];
			[entities release];
		'''
	}
	
	dispatch typeDescription(Entity entity) {
		'''
			
			// Entity «entity.className»
			NSEntityDescription *«entity.entityName» = [[[NSEntityDescription alloc] init] autorelease];
			[«entity.entityName» setName:@"«entity.className»"];
			[«entity.entityName» setManagedObjectClassName:@"«entity.className»"];
			[entities addObject:«entity.entityName»];
			
			«attributeDescriptions(entity)»
		'''
	}
	
	dispatch typeDescription(Type type) {
		// do nothing
	}
	
	attributeName(Attribute attribute) {
		attribute.name + "Attribute";
	}
	
	attributeDescriptions(Entity entity) {
		val arrayName = entity.name.toLowerCase + "Properties";
		'''
			NSMutableArray *«arrayName» = [[NSMutableArray alloc] init];
			«FOR attribute: entity.attributes»
				«attribute.attributeDescription»
				[«arrayName» addObject:«attribute.attributeName»];
			«ENDFOR»
			
			[«entity.entityName» setProperties:«arrayName»];
			[«arrayName» release];
		'''
	}
	
	attributeType(Attribute attribute) {
		attribute.typeName + "AttributeType"
	}
	
	attributeDescription(Attribute attribute) {
		val attributeName = attribute.attributeName;
		'''
			
			// Attribute «attribute.entity.className»::«attribute.name»
			NSAttributeDescription *«attributeName» = [[[NSAttributeDescription alloc] init] autorelease];
			[«attributeName» setName:@"«attribute.name»"];
			[«attributeName» setAttributeType:«attribute.attributeType»];
			[«attributeName» setOptional:NO];
		'''
	}
}