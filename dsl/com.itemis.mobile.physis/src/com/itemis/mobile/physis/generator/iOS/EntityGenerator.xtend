package com.itemis.mobile.physis.generator.iOS

import org.eclipse.xtext.generator.IFileSystemAccess
import com.itemis.mobile.physis.physis.Entity
import org.eclipse.emf.ecore.EObject

class EntityGenerator extends com.itemis.mobile.physis.generator.iOS.AbstractIOSBaseGenerator {
	
	@Inject extension GeneratorExtensions
	
	generate(Entity object, IFileSystemAccess fsa) {
		fsa.generateFile(object.headerFileName, object.headerFile);
		fsa.generateFile(object.moduleFileName, object.moduleFile);
	}	
	
	override baseFileName(EObject object) {
		(object as Entity).className
	}	
	
	headerFile(Entity entity) { 
		'''
			«entity.fileheaderComment(true)»
			
			#import <Foundation/Foundation.h>
			#import <CoreData/CoreData.h>
			
			@interface «entity.className»: NSManagedObject {
				«FOR attribute : entity.attributes»
					«attribute.typeDeclaration»«attribute.name»;
				«ENDFOR»
			}
		'''
	}
	
	moduleFile(Entity entity) {
		'''
			«entity.fileheaderComment(false)»
			
			#import "«entity.headerFileName»"
			
			@implementation «entity.className»
			
			«FOR attribute: entity.attributes»
			@dynamic «attribute.name»
			«ENDFOR»
			
			@end
		'''
	}
		
}