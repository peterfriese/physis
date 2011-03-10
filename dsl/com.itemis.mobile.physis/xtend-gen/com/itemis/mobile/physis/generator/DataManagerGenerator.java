package com.itemis.mobile.physis.generator;

import com.itemis.mobile.physis.PhysisMetamodelExtensions;
import com.itemis.mobile.physis.generator.AbstractBaseGenerator;
import com.itemis.mobile.physis.generator.GeneratorExtensions;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.DataModel;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DataManagerGenerator extends AbstractBaseGenerator {
  private final DataManagerGenerator _this = this;
  @com.google.inject.Inject private GeneratorExtensions generatorExtensions;
  @com.google.inject.Inject private PhysisMetamodelExtensions physisMetamodelExtensions;
  
  public void generate(final DataModel object, final IFileSystemAccess fsa) {
    {
      final DataModel typeConverted_object = (DataModel)object;
      String _headerFileName = _this.headerFileName(typeConverted_object);
      StringConcatenation _headerFile = _this.headerFile(object);
      fsa.generateFile(_headerFileName, _headerFile);
      final DataModel typeConverted_object_1 = (DataModel)object;
      String _moduleFileName = _this.moduleFileName(typeConverted_object_1);
      StringConcatenation _moduleFile = _this.moduleFile(object);
      fsa.generateFile(_moduleFileName, _moduleFile);
    }
  }
  
  public String baseFileName(final EObject model) {
    return "DataManager";
  }
  
  public StringConcatenation headerFile(final DataModel model) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("#import <Foundation/Foundation.h>");
    builder.newLine();
    builder.append("#import <CoreData/CoreData.h>");
    builder.newLine();
    builder.append("#import \"PhysisDataManager.h\"");
    builder.newLine();
    builder.newLine();
    builder.append("@interface DataManager : PhysisDataManager {");
    builder.newLine();
    builder.newLine();
    builder.append("}");
    builder.newLine();
    builder.newLine();
    builder.append("@end");
    builder.newLine();
    return builder;
  }
  
  public StringConcatenation moduleFile(final DataModel model) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("#import \"DataManager.h\"");
    builder.newLine();
    builder.newLine();
    builder.append("@implementation DataManager");
    builder.newLine();
    builder.newLine();
    builder.append("-(NSManagedObjectModel *)createManagedObjectModel {");
    builder.newLine();
    builder.append("\t");
    builder.append("NSManagedObjectModel *mom = [[[NSManagedObjectModel alloc] init] autorelease];");
    builder.newLine();
    builder.append("\t");
    builder.newLine();
    builder.append("\t");
    StringConcatenation _entityDescriptions = _this.entityDescriptions(model);
    builder.append(_entityDescriptions, "	");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.newLine();
    builder.append("\t");
    builder.append("return mom;");
    builder.newLine();
    builder.append("}");
    builder.newLine();
    builder.newLine();
    builder.append("@end");
    builder.newLine();
    return builder;
  }
  
  public StringConcatenation entityDescriptions(final DataModel model) {
    StringConcatenation builder = new StringConcatenation();
    builder.append("NSMutableArray *entities = [[NSMutableArray alloc] init];");
    builder.newLine();
    {
      EList<Type> _types = model.getTypes();
      for(com.itemis.mobile.physis.physis.Type type : _types) {
        builder.newLineIfNotEmpty();
        StringConcatenation _typeDescription = _this.typeDescription(type);
        builder.append(_typeDescription, "");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("[mom setEntities:entities];");
    builder.newLine();
    builder.append("[entities release];");
    builder.newLine();
    return builder;
  }
  
  public StringConcatenation _typeDescription(final Entity entity) {
    StringConcatenation builder = new StringConcatenation();
    builder.newLine();
    builder.append("// Entity ");
    GeneratorExtensions _generatorExtensions = generatorExtensions;
    String _className = _generatorExtensions.className(entity);
    builder.append(_className, "");
    builder.newLineIfNotEmpty();
    builder.append("NSEntityDescription *");
    GeneratorExtensions _generatorExtensions_1 = generatorExtensions;
    String _entityName = _generatorExtensions_1.entityName(entity);
    builder.append(_entityName, "");
    builder.append(" = [[[NSEntityDescription alloc] init] autorelease];");
    builder.newLineIfNotEmpty();
    builder.append("[");
    GeneratorExtensions _generatorExtensions_2 = generatorExtensions;
    String _entityName_1 = _generatorExtensions_2.entityName(entity);
    builder.append(_entityName_1, "");
    builder.append(" setName:@\"");
    GeneratorExtensions _generatorExtensions_3 = generatorExtensions;
    String _className_1 = _generatorExtensions_3.className(entity);
    builder.append(_className_1, "");
    builder.append("\"];");
    builder.newLineIfNotEmpty();
    builder.append("[");
    GeneratorExtensions _generatorExtensions_4 = generatorExtensions;
    String _entityName_2 = _generatorExtensions_4.entityName(entity);
    builder.append(_entityName_2, "");
    builder.append(" setManagedObjectClassName:@\"");
    GeneratorExtensions _generatorExtensions_5 = generatorExtensions;
    String _className_2 = _generatorExtensions_5.className(entity);
    builder.append(_className_2, "");
    builder.append("\"];");
    builder.newLineIfNotEmpty();
    builder.append("[entities addObject:");
    GeneratorExtensions _generatorExtensions_6 = generatorExtensions;
    String _entityName_3 = _generatorExtensions_6.entityName(entity);
    builder.append(_entityName_3, "");
    builder.append("];");
    builder.newLineIfNotEmpty();
    builder.newLine();
    StringConcatenation _attributeDescriptions = _this.attributeDescriptions(entity);
    builder.append(_attributeDescriptions, "");
    builder.newLineIfNotEmpty();
    return builder;
  }
  
  public void _typeDescription(final Type type) {
  }
  
  public String attributeName(final Attribute attribute) {
    String _name = attribute.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Attribute");
    return _operator_plus;
  }
  
  public StringConcatenation attributeDescriptions(final Entity entity) {
    StringConcatenation _xblockexpression = null;
    {
      final Entity typeConverted_entity = (Entity)entity;
      String _name = typeConverted_entity.getName();
      String _lowerCase = _name.toLowerCase();
      String _operator_plus = StringExtensions.operator_plus(_lowerCase, "Properties");
      final String arrayName = _operator_plus;
      StringConcatenation builder = new StringConcatenation();
      builder.append("NSMutableArray *");
      builder.append(arrayName, "");
      builder.append(" = [[NSMutableArray alloc] init];");
      builder.newLineIfNotEmpty();
      {
        EList<Attribute> _attributes = entity.getAttributes();
        for(com.itemis.mobile.physis.physis.Attribute attribute : _attributes) {
          builder.newLineIfNotEmpty();
          StringConcatenation _attributeDescription = _this.attributeDescription(attribute);
          builder.append(_attributeDescription, "");
          builder.newLineIfNotEmpty();
          builder.append("[");
          builder.append(arrayName, "");
          builder.append(" addObject:");
          String _attributeName = _this.attributeName(attribute);
          builder.append(_attributeName, "");
          builder.append("];");
          builder.newLineIfNotEmpty();
        }
      }
      builder.newLineIfNotEmpty();
      builder.newLine();
      builder.append("[");
      GeneratorExtensions _generatorExtensions = generatorExtensions;
      String _entityName = _generatorExtensions.entityName(entity);
      builder.append(_entityName, "");
      builder.append(" setProperties:");
      builder.append(arrayName, "");
      builder.append("];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(arrayName, "");
      builder.append(" release];");
      builder.newLineIfNotEmpty();
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
  
  public String attributeType(final Attribute attribute) {
    PhysisMetamodelExtensions _physisMetamodelExtensions = physisMetamodelExtensions;
    String _typeName = _physisMetamodelExtensions.typeName(attribute);
    String _operator_plus = StringExtensions.operator_plus(_typeName, "AttributeType");
    return _operator_plus;
  }
  
  public StringConcatenation attributeDescription(final Attribute attribute) {
    StringConcatenation _xblockexpression = null;
    {
      String _attributeName = _this.attributeName(attribute);
      final String attributeName = _attributeName;
      StringConcatenation builder = new StringConcatenation();
      builder.newLine();
      builder.append("// Attribute ");
      GeneratorExtensions _generatorExtensions = generatorExtensions;
      PhysisMetamodelExtensions _physisMetamodelExtensions = physisMetamodelExtensions;
      Entity _entity = _physisMetamodelExtensions.entity(attribute);
      String _className = _generatorExtensions.className(_entity);
      builder.append(_className, "");
      builder.append("::");
      String _name = attribute.getName();
      builder.append(_name, "");
      builder.newLineIfNotEmpty();
      builder.append("NSAttributeDescription *");
      builder.append(attributeName, "");
      builder.append(" = [[[NSAttributeDescription alloc] init] autorelease];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(attributeName, "");
      builder.append(" setName:@\"");
      String _name_1 = attribute.getName();
      builder.append(_name_1, "");
      builder.append("\"];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(attributeName, "");
      builder.append(" setAttributeType:");
      String _attributeType = _this.attributeType(attribute);
      builder.append(_attributeType, "");
      builder.append("];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(attributeName, "");
      builder.append(" setOptional:NO];");
      builder.newLineIfNotEmpty();
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation typeDescription(final Type entity) {
    if ((entity instanceof Entity)) {
      return _typeDescription((Entity)entity);
    } else if ((entity instanceof Type)) {
      _typeDescription((Type)entity);
      return null;
    } else {
      throw new IllegalArgumentException();
    }
  }
}