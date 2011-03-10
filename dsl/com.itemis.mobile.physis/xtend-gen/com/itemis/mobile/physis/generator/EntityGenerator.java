package com.itemis.mobile.physis.generator;

import com.itemis.mobile.physis.generator.AbstractBaseGenerator;
import com.itemis.mobile.physis.generator.GeneratorExtensions;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityGenerator extends AbstractBaseGenerator {
  private final EntityGenerator _this = this;
  @com.google.inject.Inject private GeneratorExtensions generatorExtensions;
  
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
    GeneratorExtensions _generatorExtensions = generatorExtensions;
    String _className = _generatorExtensions.className(((com.itemis.mobile.physis.physis.Entity) object));
    return _className;
  }
  
  public StringConcatenation headerFile(final Entity entity) {
    StringConcatenation builder = new StringConcatenation();
    final Entity typeConverted_entity = (Entity)entity;
    StringConcatenation _fileheaderComment = _this.fileheaderComment(typeConverted_entity, true);
    builder.append(_fileheaderComment, "");
    builder.newLineIfNotEmpty();
    builder.newLine();
    builder.append("#import <Foundation/Foundation.h>");
    builder.newLine();
    builder.append("#import <CoreData/CoreData.h>");
    builder.newLine();
    builder.newLine();
    builder.append("@interface ");
    GeneratorExtensions _generatorExtensions = generatorExtensions;
    String _className = _generatorExtensions.className(entity);
    builder.append(_className, "");
    builder.append(": NSManagedObject {");
    builder.newLineIfNotEmpty();
    builder.append("\t");
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(com.itemis.mobile.physis.physis.Attribute attribute : _attributes) {
        builder.newLineIfNotEmpty();
        builder.append("\t");
        GeneratorExtensions _generatorExtensions_1 = generatorExtensions;
        String _typeDeclaration = _generatorExtensions_1.typeDeclaration(attribute);
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
    GeneratorExtensions _generatorExtensions = generatorExtensions;
    String _className = _generatorExtensions.className(entity);
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