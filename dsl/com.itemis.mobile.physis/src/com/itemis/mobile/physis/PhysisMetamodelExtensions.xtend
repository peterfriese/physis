package com.itemis.mobile.physis

class PhysisMetamodelExtensions {
	
	entity(physis.Attribute attribute) {
		attribute.eContainer as physis.Entity
	}
	
	typeName(physis.Attribute this) {
		type.name
	}
	
	
}