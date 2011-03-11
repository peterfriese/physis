package com.itemis.mobile.physis.generator.iOS

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.Date
import com.itemis.mobile.physis.generator.AbstractBaseGenerator

/**
 * Abstract base generator class for code generators for iOS.
 */
class AbstractIOSBaseGenerator extends AbstractBaseGenerator {

	fileheaderComment(EObject object, boolean header) {
		val Date date = new Date();
		val String today = date.toLocaleString;
		val filename = if (header) object.headerFileName else object.moduleFileName
		'''
			//
			//  «filename»
			//  [TODO: projectName]
			//
			//  Created by [TODO: authorname] on «today».
			//  [TODO: copyright string]
			//
		'''
	}	
	
	String baseFileName(EObject object) {
		throw new RuntimeException("You need to override baseFileName in your generator class!")
	}
	
	headerFileName(EObject object) {
		object.baseFileName + ".h"
	}
	
	moduleFileName(EObject object) {
		object.baseFileName + ".m"
	}
	
}