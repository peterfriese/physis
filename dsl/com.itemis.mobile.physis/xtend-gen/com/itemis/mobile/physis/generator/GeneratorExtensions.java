package com.itemis.mobile.physis.generator;

import com.itemis.mobile.physis.PhysisMetamodelExtensions;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Type;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions {
  private final GeneratorExtensions _this = this;
  @com.google.inject.Inject private PhysisMetamodelExtensions physisMetamodelExtensions;
  
  public String className(final Entity e) {
    final Entity typeConverted_e = (Entity)e;
    String _name = typeConverted_e.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public String entityName(final Entity e) {
    String _className = _this.className(e);
    String _operator_plus = StringExtensions.operator_plus(_className, "Entity");
    return _operator_plus;
  }
  
  public String typeDeclaration(final Attribute attribute) {
    Type _type = attribute.getType();
    String _typeDeclaration = _this.typeDeclaration(_type);
    return _typeDeclaration;
  }
  
  public String typeDeclaration(final Type type) {
    String _name = type.getName();
    String _xifexpression = null;
    Boolean _isPrimitiveType = _this.isPrimitiveType(type);
    if (_isPrimitiveType) {
      _xifexpression = "";
    } else {
      _xifexpression = " *";
    }
    String _operator_plus = StringExtensions.operator_plus(_name, _xifexpression);
    return _operator_plus;
  }
  
  public Boolean isPrimitiveType(final Type type) {
    Boolean switchResult = null;
    String _name = type.getName();
    final String __valOfSwitchOver = _name;
    boolean matched = false;
    if (!matched) {
      if (org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_equals(__valOfSwitchOver,"NSInteger")) {
        matched=true;
        switchResult = true;
      }
    }
    if (!matched) {
      switchResult = false;
    }
    return switchResult;
  }
}