package com.itemis.mobile.physis.generator;

import org.eclipse.xtext.generator.IGenerator;

public abstract class PlatformAwareGenerator implements IGenerator {

	private static String _platform;

	public static void setPlatform(String platform) {
		_platform = platform;
	}

	public static String getPlatform() {
		return _platform;
	}

}
