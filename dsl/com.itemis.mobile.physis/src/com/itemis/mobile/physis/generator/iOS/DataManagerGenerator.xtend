package com.itemis.mobile.physis.generator.iOS

import com.itemis.mobile.physis.physis.DataModel
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.itemis.mobile.physis.physis.Entity
import com.itemis.mobile.physis.physis.Type
import com.itemis.mobile.physis.physis.Attribute
import com.itemis.mobile.physis.PhysisMetamodelExtensions

class DataManagerGenerator extends com.itemis.mobile.physis.generator.iOS.AbstractIOSBaseGenerator {
	
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
			
			#pragma mark -
			#pragma mark Entity description factory methods
			«FOR entity: model.entities»
				«entity.typeDescriptionMethod»
			«ENDFOR»
			
			#pragma mark -
			#pragma mark Managed Object Model factory method
			
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
			«FOR entity: model.entities»
				«entity.typeDescriptionCall»
			«ENDFOR»
			[mom setEntities:entities];
			[entities release];
		'''
	}
	
	typeDescriptionCall(Entity entity) {
		"[entities addObject:[self " + entity.typeDescriptionFactoryMethodname() + "]];"
	}
	
	typeDescriptionFactoryMethodname(Entity entity) {
		"create" + entity.className + "EntityDecription"
	}
	
	typeDescriptionMethod(Entity entity) {
		'''
			
			-(NSEntityDescription *)«entity.typeDescriptionFactoryMethodname()» {
				// Entity «entity.className»
				NSEntityDescription *«entity.entityName» = [[[NSEntityDescription alloc] init] autorelease];
				[«entity.entityName» setName:@"«entity.className»"];
				[«entity.entityName» setManagedObjectClassName:@"«entity.className»"];
			
				«attributeDescriptions(entity)»
				return «entity.entityName»;
			}
		'''
	}
	
	attributeDescriptions(Entity entity) {
		val arrayName = entity.name.toLowerCase + "Properties";
		'''
			NSMutableArray *«arrayName» = [[NSMutableArray alloc] init];
			«FOR attribute: entity.attributes»
				«IF attribute.isRelationship()»
					«attribute.relationshipDescription»
				«ELSE»
					«attribute.attributeDescription»
					[«arrayName» addObject:«attribute.attributeName»];					
				«ENDIF»
			«ENDFOR»
			
			[«entity.entityName» setProperties:«arrayName»];
			[«arrayName» release];
		'''
	}
	
	attributeType(Attribute attribute) {
		attribute.dbTypeName + "AttributeType"
	}
	
	attributeName(Attribute attribute) {
		attribute.name + "Attribute";
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
	
	relationshipName(Attribute attribute) {
		attribute.name + "Relationship";
	}	
	
	relationshipDescription(Attribute attribute) {
		val relationshipName = attribute.relationshipName;
		'''
			
			// Relationship «attribute.entity.className»::«attribute.name»
			NSRelationshipDescription *«relationshipName» = [[[NSRelationshipDescription alloc] init] autorelease];
			[«relationshipName» setName:@"«relationshipName»"];
			[«relationshipName» setMaxCount:-1];
		'''
		
	}
}