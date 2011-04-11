package com.itemis.mobile.physis.generator.iOS

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import com.itemis.mobile.physis.physis.Entity
import com.itemis.mobile.physis.physis.Type
import com.itemis.mobile.physis.physis.Attribute
import java.util.Date
import com.itemis.mobile.physis.PhysisMetamodelExtensions
import com.itemis.mobile.physis.physis.Reference
import com.itemis.mobile.physis.physis.TypeReference

class GeneratorExtensions {
	
	@Inject extension PhysisMetamodelExtensions
	
	className(Entity e) {
		e.name.toFirstUpper
	}
	
	entityName(Entity e) {
		e.className.toLowerCase + "Entity"
	}
	
	typeDeclaration(Attribute attribute, ImportManager importManager) {
		if (attribute.type instanceof TypeReference) {
			importManager.addImport(attribute.typeName)
		}		
		if (attribute.isMultiplicity())
			attribute.type.collectionTypeDeclaration()
		else {
			attribute.type.typeDeclaration();			
		}
	}
	
	collectionTypeDeclaration(Reference reference) {
		reference.collectionTypeName +  " *"
	}
	
	typeDeclaration(Reference reference) {
		reference.typeName + if(reference.isPrimitiveType()) ' ' else ' *'
	}
	
}