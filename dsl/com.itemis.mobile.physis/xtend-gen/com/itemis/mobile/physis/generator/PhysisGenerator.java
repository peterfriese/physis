package com.itemis.mobile.physis.generator;

import com.itemis.mobile.physis.generator.PlatformAwareGenerator;
import com.itemis.mobile.physis.generator.iOS.DataManagerGenerator;
import com.itemis.mobile.physis.generator.iOS.EntityGenerator;
import com.itemis.mobile.physis.generator.iOS.GeneratorExtensions;
import com.itemis.mobile.physis.physis.DataModel;
import com.itemis.mobile.physis.physis.Entity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class PhysisGenerator extends PlatformAwareGenerator {
  private final PhysisGenerator _this = this;
  @com.google.inject.Inject private GeneratorExtensions generatorExtensions;
  @com.google.inject.Inject private DataManagerGenerator dataManagerGenerator;
  @com.google.inject.Inject private EntityGenerator entityGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    for (EObject element : _allContentsIterable) {
      if ((element instanceof com.itemis.mobile.physis.physis.Entity)) {
        {
          final Entity entity = ((com.itemis.mobile.physis.physis.Entity) element);
          entityGenerator.generate(entity, fsa);
        }
      } else {
        if ((element instanceof com.itemis.mobile.physis.physis.DataModel)) {
          {
            final DataModel datamodel = ((com.itemis.mobile.physis.physis.DataModel) element);
            dataManagerGenerator.generate(datamodel, fsa);
          }
        }
      }
    }
  }
}