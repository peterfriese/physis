/*
 * Originally generated by Xtext, enhanced by Peter.
 */
package com.itemis.mobile.physis.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.err.println("physis generator: illegal number of arguments!");
			return;
		}
		Injector injector = new com.itemis.mobile.physis.PhysisStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		
		String platform = args[0];
		String modelFile = args[1];
		String outputPath = args[2];
		
		Main main = injector.getInstance(Main.class);  
		main.runGenerator(platform, modelFile, outputPath);
	}
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private IGenerator generator;
	
	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String platform, String modelFile, String outputPath) {
		System.out.println("Running generator with model path " + modelFile + " and output path " + outputPath);
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(modelFile), true);
		
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}
		
		// configure and start the generator
		fileAccess.setOutputPath(outputPath);
		if (generator instanceof PlatformAwareGenerator) {
			PlatformAwareGenerator.setPlatform(platform);
		}
		generator.doGenerate(resource, fileAccess);
		
		System.out.println("Code generation finished.");
	}
}
