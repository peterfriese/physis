/*
 * generated by Xtext
 */
package com.itemis.mobile.physis.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PhysisExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.itemis.mobile.physis.ui.internal.PhysisActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.itemis.mobile.physis.ui.internal.PhysisActivator.getInstance().getInjector("com.itemis.mobile.physis.Physis");
	}
	
}
