package com.itemis.mobile.physis

import static com.itemis.mobile.physis.generator.PlatformAwareGenerator.*

class PhysisMetamodelExtensions {
	
	@Inject generator.TypeMapper
	
	platform() {
		return getPlatform();
	}	
	
	entity(physis.Attribute attribute) {
		attribute.eContainer as physis.Entity
	}
	
	simpleAttributes(physis.Entity entity) {
		entity.attributes.filter(a|a.isBuiltInType())
	}
	
	relationShips(physis.Entity entity) {
		entity.attributes.filter(a|a.isRelationship())
	}
	
	toManyRelationships(physis.Entity entity) {
		entity.attributes.filter(a|a.isMultiplicity())
	}
	
	isRelationship(physis.Attribute attribute) {
		attribute.type instanceof physis.TypeReference
	}
	
	isBuiltInType(physis.Attribute attribute) {
		attribute.type instanceof physis.BuiltInType
	}
	
	dispatch String typeName(physis.Attribute attribute) {
		attribute.type.typeName
	}
	
	dispatch String typeName(physis.TypeReference reference) {
		reference.type.name
	}
	
	dispatch String typeName(physis.BuiltInType builtintype) {
		typeMapper.getTypeName(builtintype)
	}
	
	dispatch String collectionTypeName(physis.Attribute attribute) {
		attribute.type.collectionTypeName
	}
	
	dispatch String collectionTypeName(physis.Reference reference) {
		"NSSet"
	}
	
	dispatch String dbTypeName(physis.Attribute attribute) {
		attribute.type.dbTypeName
	}
	
	dispatch String dbTypeName(physis.BuiltInType builtintype) {
		typeMapper.getDBMappingTypeName(builtintype)
	}

	dispatch String dbTypeName(physis.TypeReference reference) {
		reference.type.name
	}
	
	isPrimitiveType(physis.Reference reference) {
		typeMapper.isPrimitiveType(reference)
	}
			
}