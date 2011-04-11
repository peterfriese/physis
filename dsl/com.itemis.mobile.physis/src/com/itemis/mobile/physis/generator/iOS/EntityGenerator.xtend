package com.itemis.mobile.physis.generator.iOS

import org.eclipse.xtext.generator.IFileSystemAccess
import com.itemis.mobile.physis.physis.Entity
import org.eclipse.emf.ecore.EObject
import com.itemis.mobile.physis.physis.Attribute
import com.itemis.mobile.physis.PhysisMetamodelExtensions

class EntityGenerator extends com.itemis.mobile.physis.generator.iOS.AbstractIOSBaseGenerator {
	
	@Inject extension GeneratorExtensions
	@Inject extension PhysisMetamodelExtensions
	
	generate(Entity object, IFileSystemAccess fsa) {
		fsa.generateFile(object.headerFileName, object.headerFile);
		fsa.generateFile(object.moduleFileName, object.moduleFile);
	}	
	
	override baseFileName(EObject object) {
		(object as Entity).className
	}
	
	headerFile(Entity entity) { 
		val importManager = new ImportManager();
		val interfaceBody = entity.compileHeaderFileInterfaceBody(importManager);
		'''
			«entity.fileheaderComment(true)»
			«entity.compileHeaderFileImportSection(importManager)»
			«interfaceBody»
			«entity.compileHeaderFileToManyRelationships()»
		'''
	}
	
	compileHeaderFileImportSection(Entity entity, ImportManager importManager) {
		'''
			#import <Foundation/Foundation.h>
			#import <CoreData/CoreData.h>
			#import "PhysisResource.h"
			«FOR String importedClassname : importManager.getImports()»
				#import "«importedClassname».h"
			«ENDFOR»
			
		'''
	}
	
	propertyModifiers(Attribute attribute) {
		"nonatomic" + if (attribute.type.isPrimitiveType) "" else ", retain"
	}
	
	compileHeaderFileInterfaceBody(Entity entity, ImportManager importManager) {
		'''
			@interface «entity.className»: PhysisResource {
				«FOR attribute : entity.attributes»
					«attribute.typeDeclaration(importManager)»«attribute.name»;
				«ENDFOR»
			}
			«FOR attribute: entity.attributes»
				@property («attribute.propertyModifiers() ») «attribute.typeDeclaration(importManager)»«attribute.name»;
			«ENDFOR»
			@end
		'''
	}
	
	relationshipName(Attribute relationship) {
		relationship.name.toFirstUpper
	}
	
	compileHeaderFileToManyRelationships(Entity entity) { 
		'''
			«FOR relationship : entity.toManyRelationships»
			
			@interface «entity.className» («relationship.typeName»Accessors)
			- (void)add«relationship.relationshipName»Object:(«relationship.typeName» *)value;
			- (void)remove«relationship.relationshipName»Object:(«relationship.typeName» *)value;
			- (void)add«relationship.relationshipName»:(«relationship.collectionTypeName» *)value;
			- (void)remove«relationship.relationshipName»:(«relationship.collectionTypeName» *)value;
			@end
			«ENDFOR»
		'''
	}
	
	moduleFile(Entity entity) {
		'''
			«entity.fileheaderComment(false)»
			
			#import "«entity.headerFileName»"
			
			@implementation «entity.className»
			
			«FOR attribute: entity.attributes»
			@dynamic «attribute.name»;
			«ENDFOR»
			
			@end
		'''
	}
		
}