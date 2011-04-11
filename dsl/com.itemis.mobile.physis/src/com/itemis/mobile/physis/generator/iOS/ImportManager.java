package com.itemis.mobile.physis.generator.iOS;

import java.util.HashSet;
import java.util.Set;

public class ImportManager {
	
	private HashSet<String> imports;

	public ImportManager() {
		imports = new HashSet<String>();
	}
	
	public void addImport(String importedClassName) {
		imports.add(importedClassName);
	}
	
	public Set<String> getImports() {
		return imports;
	}

}
