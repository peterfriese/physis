package com.itemis.mobile.physis.generator.iOS;

import com.itemis.mobile.physis.PhysisMetamodelExtensions;
import com.itemis.mobile.physis.generator.iOS.ImportManager;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Reference;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions {
  private final GeneratorExtensions _this = this;
  @com.google.inject.Inject private PhysisMetamodelExtensions physisMetamodelExtensions;
  
  public String className(final Entity e) {
    String _name = e.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public String entityName(final Entity e) {
    String _className = _this.className(e);
    String _lowerCase = _className.toLowerCase();
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, "Entity");
    return _operator_plus;
  }
  
  public String typeDeclaration(final Attribute attribute, final ImportManager importManager) {
    String _xblockexpression = null;
    {
      Reference _type = attribute.getType();
      if ((_type instanceof com.itemis.mobile.physis.physis.TypeReference)) {
        final Attribute typeConverted_attribute = (Attribute)attribute;
        String _typeName = physisMetamodelExtensions.typeName(typeConverted_attribute);
        importManager.addImport(_typeName);
      }
      String _xifexpression = null;
      boolean _isMultiplicity = attribute.isMultiplicity();
      if (((Boolean)_isMultiplicity)) {
        Reference _type_1 = attribute.getType();
        String _collectionTypeDeclaration = _this.collectionTypeDeclaration(_type_1);
        _xifexpression = _collectionTypeDeclaration;
      } else {
        Reference _type_2 = attribute.getType();
        String _typeDeclaration = _this.typeDeclaration(_type_2);
        _xifexpression = _typeDeclaration;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String collectionTypeDeclaration(final Reference reference) {
    final Reference typeConverted_reference = (Reference)reference;
    String _collectionTypeName = physisMetamodelExtensions.collectionTypeName(typeConverted_reference);
    String _operator_plus = StringExtensions.operator_plus(_collectionTypeName, " *");
    return _operator_plus;
  }
  
  public String typeDeclaration(final Reference reference) {
    final Reference typeConverted_reference = (Reference)reference;
    String _typeName = physisMetamodelExtensions.typeName(typeConverted_reference);
    String _xifexpression = null;
    boolean _isPrimitiveType = physisMetamodelExtensions.isPrimitiveType(reference);
    if (((Boolean)_isPrimitiveType)) {
      _xifexpression = " ";
    } else {
      _xifexpression = " *";
    }
    String _operator_plus = StringExtensions.operator_plus(_typeName, _xifexpression);
    return _operator_plus;
  }
}