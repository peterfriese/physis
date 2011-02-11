
package com.itemis.mobile.physis;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PhysisStandaloneSetup extends PhysisStandaloneSetupGenerated{

	public static void doSetup() {
		new PhysisStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

