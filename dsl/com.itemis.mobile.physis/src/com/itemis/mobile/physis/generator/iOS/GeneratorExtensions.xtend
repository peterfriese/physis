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

class GeneratorExtensions {
	
	@Inject extension PhysisMetamodelExtensions
	
	className(Entity e) {
		e.name.toFirstUpper
	}
	
	entityName(Entity e) {
		e.className + "Entity"
	}
	
	typeDeclaration(Attribute attribute) {
		attribute.type.typeDeclaration();
	}
	
	typeDeclaration(Type type) {
		type.name + if (type.isPrimitiveType()) '' else ' *'
	}
	
	isPrimitiveType(Type type) {
		switch (type.name) {
			case 'NSInteger': true
			default: false
		}
	}
	
}