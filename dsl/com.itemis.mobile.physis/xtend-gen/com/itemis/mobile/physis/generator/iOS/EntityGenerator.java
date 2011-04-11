package com.itemis.mobile.physis.generator.iOS;

import com.itemis.mobile.physis.PhysisMetamodelExtensions;
import com.itemis.mobile.physis.generator.iOS.AbstractIOSBaseGenerator;
import com.itemis.mobile.physis.generator.iOS.GeneratorExtensions;
import com.itemis.mobile.physis.generator.iOS.ImportManager;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Reference;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityGenerator extends AbstractIOSBaseGenerator {
  private final EntityGenerator _this = this;
  @com.google.inject.Inject private GeneratorExtensions generatorExtensions;
  @com.google.inject.Inject private PhysisMetamodelExtensions physisMetamodelExtensions;
  
  public void generate(final Entity object, final IFileSystemAccess fsa) {
    {
      final Entity typeConverted_object = (Entity)object;
      String _headerFileName = _this.headerFileName(typeConverted_object);
      StringConcatenation _headerFile = _this.headerFile(object);
      fsa.generateFile(_headerFileName, _headerFile);
      final Entity typeConverted_object_1 = (Entity)object;
      String _moduleFileName = _this.moduleFileName(typeConverted_object_1);
      StringConcatenation _moduleFile = _this.moduleFile(object);
      fsa.generateFile(_moduleFileName, _moduleFile);
    }
  }
  
  public String baseFileName(final EObject object) {
    String _className = generatorExtensions.className(((com.itemis.mobile.physis.physis.Entity) object));
    return _className;
  }
  
  public StringConcatenation headerFile(final Entity entity) {
    StringConcatenation _xblockexpression = null;
    {
      ImportManager _importManager = new ImportManager();
      final ImportManager importManager = _importManager;
      StringConcatenation _compileHeaderFileInterfaceBody = _this.compileHeaderFileInterfaceBody(entity, importManager);
      final StringConcatenation interfaceBody = _compileHeaderFileInterfaceBody;
      StringConcatenation builder = new StringConcatenation();
      final Entity typeConverted_entity = (Entity)entity;
      StringConcatenation _fileheaderComment = _this.fileheaderComment(typeConverted_entity, true);
      builder.append(_fileheaderComment, "");
      builder.newLineIfNotEmpty();
      StringConcatenation _compileHeaderFileImportSection = _this.compileHeaderFileImportSection(entity, importManager);
      builder.append(_compileHeaderFileImportSection, "");
      builder.newLineIfNotEmpty();
      builder.append(interfaceBody, "");
      builder.newLineIfNotEmpty();
      StringConcatenation _compileHeaderFileToManyRelationships = _this.compileHeaderFileToManyRelationships(entity);
      builder.append(_compileHeaderFileToManyRelationships, "");
      builder.newLineIfNotEmpty();
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileHeaderFileImportSection(final Entity entity, final ImportManager importManager) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("#import <Foundation/Foundation.h>");
    builder.newLine();
    builder.append("#import <CoreData/CoreData.h>");
    builder.newLine();
    builder.append("#import \"PhysisResource.h\"");
    builder.newLine();
    {
      Set<String> _imports = importManager.getImports();
      for(java.lang.String importedClassname : _imports) {
        builder.newLineIfNotEmpty();
        builder.append("#import \"");
        builder.append(importedClassname, "");
        builder.append(".h\"");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.newLine();
    return builder;
  }
  
  public String propertyModifiers(final Attribute attribute) {
    String _xifexpression = null;
    Reference _type = attribute.getType();
    boolean _isPrimitiveType = physisMetamodelExtensions.isPrimitiveType(_type);
    if (((Boolean)_isPrimitiveType)) {
      _xifexpression = "";
    } else {
      _xifexpression = ", retain";
    }
    String _operator_plus = StringExtensions.operator_plus("nonatomic", _xifexpression);
    return _operator_plus;
  }
  
  public StringConcatenation compileHeaderFileInterfaceBody(final Entity entity, final ImportManager importManager) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("@interface ");
    String _className = generatorExtensions.className(entity);
    builder.append(_className, "");
    builder.append(": PhysisResource {");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(com.itemis.mobile.physis.physis.Attribute attribute : _attributes) {
        builder.newLineIfNotEmpty();
        builder.append("\t");
        String _typeDeclaration = generatorExtensions.typeDeclaration(attribute, importManager);
        builder.append(_typeDeclaration, "	");
        String _name = attribute.getName();
        builder.append(_name, "	");
        builder.append(";");
        builder.newLineIfNotEmpty();
        builder.append("\t");
      }
    }
    builder.newLineIfNotEmpty();
    builder.append("}");
    builder.newLine();
    {
      EList<Attribute> _attributes_1 = entity.getAttributes();
      for(com.itemis.mobile.physis.physis.Attribute attribute_1 : _attributes_1) {
        builder.newLineIfNotEmpty();
        builder.append("@property (");
        String _propertyModifiers = _this.propertyModifiers(attribute_1);
        builder.append(_propertyModifiers, "");
        builder.append(") ");
        String _typeDeclaration_1 = generatorExtensions.typeDeclaration(attribute_1, importManager);
        builder.append(_typeDeclaration_1, "");
        String _name_1 = attribute_1.getName();
        builder.append(_name_1, "");
        builder.append(";");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.append("@end");
    builder.newLine();
    return builder;
  }
  
  public String relationshipName(final Attribute relationship) {
    String _name = relationship.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public StringConcatenation compileHeaderFileToManyRelationships(final Entity entity) {
    StringConcatenation builder = new StringConcatenation();
    {
      Iterable<Attribute> _manyRelationships = physisMetamodelExtensions.toManyRelationships(entity);
      for(com.itemis.mobile.physis.physis.Attribute relationship : _manyRelationships) {
        builder.newLineIfNotEmpty();
        builder.newLine();
        builder.append("@interface ");
        String _className = generatorExtensions.className(entity);
        builder.append(_className, "");
        builder.append(" (");
        final Attribute typeConverted_relationship = (Attribute)relationship;
        String _typeName = physisMetamodelExtensions.typeName(typeConverted_relationship);
        builder.append(_typeName, "");
        builder.append("Accessors)");
        builder.newLineIfNotEmpty();
        builder.append("- (void)add");
        String _relationshipName = _this.relationshipName(relationship);
        builder.append(_relationshipName, "");
        builder.append("Object:(");
        final Attribute typeConverted_relationship_1 = (Attribute)relationship;
        String _typeName_1 = physisMetamodelExtensions.typeName(typeConverted_relationship_1);
        builder.append(_typeName_1, "");
        builder.append(" *)value;");
        builder.newLineIfNotEmpty();
        builder.append("- (void)remove");
        String _relationshipName_1 = _this.relationshipName(relationship);
        builder.append(_relationshipName_1, "");
        builder.append("Object:(");
        final Attribute typeConverted_relationship_2 = (Attribute)relationship;
        String _typeName_2 = physisMetamodelExtensions.typeName(typeConverted_relationship_2);
        builder.append(_typeName_2, "");
        builder.append(" *)value;");
        builder.newLineIfNotEmpty();
        builder.append("- (void)add");
        String _relationshipName_2 = _this.relationshipName(relationship);
        builder.append(_relationshipName_2, "");
        builder.append(":(");
        final Attribute typeConverted_relationship_3 = (Attribute)relationship;
        String _collectionTypeName = physisMetamodelExtensions.collectionTypeName(typeConverted_relationship_3);
        builder.append(_collectionTypeName, "");
        builder.append(" *)value;");
        builder.newLineIfNotEmpty();
        builder.append("- (void)remove");
        String _relationshipName_3 = _this.relationshipName(relationship);
        builder.append(_relationshipName_3, "");
        builder.append(":(");
        final Attribute typeConverted_relationship_4 = (Attribute)relationship;
        String _collectionTypeName_1 = physisMetamodelExtensions.collectionTypeName(typeConverted_relationship_4);
        builder.append(_collectionTypeName_1, "");
        builder.append(" *)value;");
        builder.newLineIfNotEmpty();
        builder.append("@end");
        builder.newLine();
      }
    }
    builder.newLineIfNotEmpty();
    return builder;
  }
  
  public StringConcatenation moduleFile(final Entity entity) {
    StringConcatenation builder = new StringConcatenation();
    final Entity typeConverted_entity = (Entity)entity;
    StringConcatenation _fileheaderComment = _this.fileheaderComment(typeConverted_entity, false);
    builder.append(_fileheaderComment, "");
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("#import \"");
    final Entity typeConverted_entity_1 = (Entity)entity;
    String _headerFileName = _this.headerFileName(typeConverted_entity_1);
    builder.append(_headerFileName, "");
    builder.append("\"");
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("@implementation ");
    String _className = generatorExtensions.className(entity);
    builder.append(_className, "");
    builder.newLineIfNotEmpty();
    builder.newLine();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(com.itemis.mobile.physis.physis.Attribute attribute : _attributes) {
        builder.newLineIfNotEmpty();
        builder.append("@dynamic ");
        String _name = attribute.getName();
        builder.append(_name, "");
        builder.append(";");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("@end");
    builder.newLine();
    return builder;
  }
}