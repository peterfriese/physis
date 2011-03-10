package com.itemis.mobile.physis.generator;

import com.itemis.mobile.physis.generator.DataManagerGenerator;
import com.itemis.mobile.physis.generator.EntityGenerator;
import com.itemis.mobile.physis.generator.GeneratorExtensions;
import com.itemis.mobile.physis.physis.DataModel;
import com.itemis.mobile.physis.physis.Entity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class PhysisGenerator implements IGenerator {
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
          EntityGenerator _entityGenerator = entityGenerator;
          _entityGenerator.generate(entity, fsa);
        }
      } else {
        if ((element instanceof com.itemis.mobile.physis.physis.DataModel)) {
          {
            final DataModel datamodel = ((com.itemis.mobile.physis.physis.DataModel) element);
            DataManagerGenerator _dataManagerGenerator = dataManagerGenerator;
            _dataManagerGenerator.generate(datamodel, fsa);
          }
        }
      }
    }
  }
}