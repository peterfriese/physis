package com.itemis.mobile.physis;

import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Type;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class PhysisMetamodelExtensions {
  private final PhysisMetamodelExtensions _this = this;
  
  public Entity entity(final Attribute attribute) {
    final Attribute typeConverted_attribute = (Attribute)attribute;
    EObject _eContainer = typeConverted_attribute.eContainer();
    return ((com.itemis.mobile.physis.physis.Entity) _eContainer);
  }
  
  public String typeName(final Attribute _this) {
    Type _type = _this.getType();
    String _name = _type.getName();
    return _name;
  }
}