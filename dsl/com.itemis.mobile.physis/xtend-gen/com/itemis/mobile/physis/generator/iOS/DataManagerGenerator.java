package com.itemis.mobile.physis.generator.iOS;

import com.itemis.mobile.physis.PhysisMetamodelExtensions;
import com.itemis.mobile.physis.generator.iOS.AbstractIOSBaseGenerator;
import com.itemis.mobile.physis.generator.iOS.GeneratorExtensions;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.DataModel;
import com.itemis.mobile.physis.physis.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DataManagerGenerator extends AbstractIOSBaseGenerator {
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
    builder.append("#pragma mark -");
    builder.newLine();
    builder.append("#pragma mark Entity description factory methods");
    builder.newLine();
    {
      EList<Entity> _entities = model.getEntities();
      for(com.itemis.mobile.physis.physis.Entity entity : _entities) {
        builder.newLineIfNotEmpty();
        StringConcatenation _typeDescriptionMethod = _this.typeDescriptionMethod(entity);
        builder.append(_typeDescriptionMethod, "");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("#pragma mark -");
    builder.newLine();
    builder.append("#pragma mark Managed Object Model factory method");
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
      EList<Entity> _entities = model.getEntities();
      for(com.itemis.mobile.physis.physis.Entity entity : _entities) {
        builder.newLineIfNotEmpty();
        String _typeDescriptionCall = _this.typeDescriptionCall(entity);
        builder.append(_typeDescriptionCall, "");
        builder.newLineIfNotEmpty();
      }
    }
    builder.newLineIfNotEmpty();
    builder.append("[mom setEntities:entities];");
    builder.newLine();
    builder.append("[entities release];");
    builder.newLine();
    return builder;
  }
  
  public String typeDescriptionCall(final Entity entity) {
    String _typeDescriptionFactoryMethodname = _this.typeDescriptionFactoryMethodname(entity);
    String _operator_plus = StringExtensions.operator_plus("[entities addObject:[self ", _typeDescriptionFactoryMethodname);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "]];");
    return _operator_plus_1;
  }
  
  public String typeDescriptionFactoryMethodname(final Entity entity) {
    String _className = generatorExtensions.className(entity);
    String _operator_plus = StringExtensions.operator_plus("create", _className);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "EntityDecription");
    return _operator_plus_1;
  }
  
  public StringConcatenation typeDescriptionMethod(final Entity entity) {
    StringConcatenation builder = new StringConcatenation();
    builder.newLine();
    builder.append("-(NSEntityDescription *)");
    String _typeDescriptionFactoryMethodname = _this.typeDescriptionFactoryMethodname(entity);
    builder.append(_typeDescriptionFactoryMethodname, "");
    builder.append(" {");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.append("// Entity ");
    String _className = generatorExtensions.className(entity);
    builder.append(_className, "	");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.append("NSEntityDescription *");
    String _entityName = generatorExtensions.entityName(entity);
    builder.append(_entityName, "	");
    builder.append(" = [[[NSEntityDescription alloc] init] autorelease];");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.append("[");
    String _entityName_1 = generatorExtensions.entityName(entity);
    builder.append(_entityName_1, "	");
    builder.append(" setName:@\"");
    String _className_1 = generatorExtensions.className(entity);
    builder.append(_className_1, "	");
    builder.append("\"];");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.append("[");
    String _entityName_2 = generatorExtensions.entityName(entity);
    builder.append(_entityName_2, "	");
    builder.append(" setManagedObjectClassName:@\"");
    String _className_2 = generatorExtensions.className(entity);
    builder.append(_className_2, "	");
    builder.append("\"];");
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("\t");
    StringConcatenation _attributeDescriptions = _this.attributeDescriptions(entity);
    builder.append(_attributeDescriptions, "	");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    builder.append("return ");
    String _entityName_3 = generatorExtensions.entityName(entity);
    builder.append(_entityName_3, "	");
    builder.append(";");
    builder.newLineIfNotEmpty();
    builder.append("}");
    builder.newLine();
    return builder;
  }
  
  public StringConcatenation attributeDescriptions(final Entity entity) {
    StringConcatenation _xblockexpression = null;
    {
      String _name = entity.getName();
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
          {
            Boolean _isRelationship = physisMetamodelExtensions.isRelationship(attribute);
            if (_isRelationship) {
              builder.newLineIfNotEmpty();
              StringConcatenation _relationshipDescription = _this.relationshipDescription(attribute);
              builder.append(_relationshipDescription, "");
              builder.newLineIfNotEmpty();} else {
              builder.newLineIfNotEmpty();
              StringConcatenation _attributeDescription = _this.attributeDescription(attribute);
              builder.append(_attributeDescription, "");
              builder.newLineIfNotEmpty();
              builder.append("[");
              builder.append(arrayName, "");
              builder.append(" addObject:");
              String _attributeName = _this.attributeName(attribute);
              builder.append(_attributeName, "");
              builder.append("];\t\t\t\t\t");
              builder.newLineIfNotEmpty();
            }
          }
          builder.newLineIfNotEmpty();
        }
      }
      builder.newLineIfNotEmpty();
      builder.newLine();
      builder.append("[");
      String _entityName = generatorExtensions.entityName(entity);
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
    final Attribute typeConverted_attribute = (Attribute)attribute;
    String _dbTypeName = physisMetamodelExtensions.dbTypeName(typeConverted_attribute);
    String _operator_plus = StringExtensions.operator_plus(_dbTypeName, "AttributeType");
    return _operator_plus;
  }
  
  public String attributeName(final Attribute attribute) {
    String _name = attribute.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Attribute");
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
      Entity _entity = physisMetamodelExtensions.entity(attribute);
      String _className = generatorExtensions.className(_entity);
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
  
  public String relationshipName(final Attribute attribute) {
    String _name = attribute.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Relationship");
    return _operator_plus;
  }
  
  public StringConcatenation relationshipDescription(final Attribute attribute) {
    StringConcatenation _xblockexpression = null;
    {
      String _relationshipName = _this.relationshipName(attribute);
      final String relationshipName = _relationshipName;
      StringConcatenation builder = new StringConcatenation();
      builder.newLine();
      builder.append("// Relationship ");
      Entity _entity = physisMetamodelExtensions.entity(attribute);
      String _className = generatorExtensions.className(_entity);
      builder.append(_className, "");
      builder.append("::");
      String _name = attribute.getName();
      builder.append(_name, "");
      builder.newLineIfNotEmpty();
      builder.append("NSRelationshipDescription *");
      builder.append(relationshipName, "");
      builder.append(" = [[[NSRelationshipDescription alloc] init] autorelease];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(relationshipName, "");
      builder.append(" setName:@\"");
      builder.append(relationshipName, "");
      builder.append("\"];");
      builder.newLineIfNotEmpty();
      builder.append("[");
      builder.append(relationshipName, "");
      builder.append(" setMaxCount:-1];");
      builder.newLineIfNotEmpty();
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
}