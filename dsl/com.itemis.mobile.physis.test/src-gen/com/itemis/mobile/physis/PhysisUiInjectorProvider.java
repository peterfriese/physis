/*
* generated by Xtext
*/
package com.itemis.mobile.physis;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PhysisUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.itemis.mobile.physis.ui.internal.PhysisActivator.getInstance().getInjector("com.itemis.mobile.physis.Physis");
	}
	
}
