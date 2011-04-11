package com.itemis.mobile.physis.generator;

import org.eclipse.xtext.generator.IGenerator;

public interface IPlatformAwareGenerator extends IGenerator {
	
	void setPlatform(String platform);
	String getPlatform();

}
