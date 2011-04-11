package com.itemis.mobile.physis;

import com.itemis.mobile.physis.generator.PlatformAwareGenerator;
import com.itemis.mobile.physis.generator.TypeMapper;
import com.itemis.mobile.physis.physis.Attribute;
import com.itemis.mobile.physis.physis.BuiltInType;
import com.itemis.mobile.physis.physis.Entity;
import com.itemis.mobile.physis.physis.Reference;
import com.itemis.mobile.physis.physis.TypeReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PhysisMetamodelExtensions {
  private final PhysisMetamodelExtensions _this = this;
  @com.google.inject.Inject private TypeMapper typeMapper;
  
  public String platform() {
    String _platform = PlatformAwareGenerator.getPlatform();
    return _platform;
  }
  
  public Entity entity(final Attribute attribute) {
    final Attribute typeConverted_attribute = (Attribute)attribute;
    EObject _eContainer = typeConverted_attribute.eContainer();
    return ((com.itemis.mobile.physis.physis.Entity) _eContainer);
  }
  
  public Iterable<Attribute> simpleAttributes(final Entity entity) {
    EList<Attribute> _attributes = entity.getAttributes();
    final Function1<Attribute,Boolean> function = new Function1<Attribute,Boolean>() {
        public Boolean apply(Attribute a) {
          Boolean _isBuiltInType = _this.isBuiltInType(a);
          return _isBuiltInType;
        }
      };
    Iterable<Attribute> _filter = IterableExtensions.filter(_attributes, function);
    return _filter;
  }
  
  public Iterable<Attribute> relationShips(final Entity entity) {
    EList<Attribute> _attributes = entity.getAttributes();
    final Function1<Attribute,Boolean> function = new Function1<Attribute,Boolean>() {
        public Boolean apply(Attribute a) {
          Boolean _isRelationship = _this.isRelationship(a);
          return _isRelationship;
        }
      };
    Iterable<Attribute> _filter = IterableExtensions.filter(_attributes, function);
    return _filter;
  }
  
  public Iterable<Attribute> toManyRelationships(final Entity entity) {
    EList<Attribute> _attributes = entity.getAttributes();
    final Function1<Attribute,Boolean> function = new Function1<Attribute,Boolean>() {
        public Boolean apply(Attribute a) {
          boolean _isMultiplicity = a.isMultiplicity();
          return ((Boolean)_isMultiplicity);
        }
      };
    Iterable<Attribute> _filter = IterableExtensions.filter(_attributes, function);
    return _filter;
  }
  
  public Boolean isRelationship(final Attribute attribute) {
    Reference _type = attribute.getType();
    return (_type instanceof com.itemis.mobile.physis.physis.TypeReference);
  }
  
  public Boolean isBuiltInType(final Attribute attribute) {
    Reference _type = attribute.getType();
    return (_type instanceof com.itemis.mobile.physis.physis.BuiltInType);
  }
  
  public String _typeName(final Attribute attribute) {
    Reference _type = attribute.getType();
    String _typeName = _this.typeName(_type);
    return _typeName;
  }
  
  public String _typeName(final TypeReference reference) {
    Entity _type = reference.getType();
    String _name = _type.getName();
    return _name;
  }
  
  public String _typeName(final BuiltInType builtintype) {
    String _typeName = _this.typeMapper.getTypeName(builtintype);
    return _typeName;
  }
  
  public String _collectionTypeName(final Attribute attribute) {
    Reference _type = attribute.getType();
    String _collectionTypeName = _this.collectionTypeName(_type);
    return _collectionTypeName;
  }
  
  public String _collectionTypeName(final Reference reference) {
    return "NSSet";
  }
  
  public String _dbTypeName(final Attribute attribute) {
    Reference _type = attribute.getType();
    String _dbTypeName = _this.dbTypeName(_type);
    return _dbTypeName;
  }
  
  public String _dbTypeName(final BuiltInType builtintype) {
    String _dBMappingTypeName = _this.typeMapper.getDBMappingTypeName(builtintype);
    return _dBMappingTypeName;
  }
  
  public String _dbTypeName(final TypeReference reference) {
    Entity _type = reference.getType();
    String _name = _type.getName();
    return _name;
  }
  
  public boolean isPrimitiveType(final Reference reference) {
    boolean _isPrimitiveType = _this.typeMapper.isPrimitiveType(reference);
    return _isPrimitiveType;
  }
  
  public String typeName(final EObject builtintype) {
    if ((builtintype instanceof BuiltInType)) {
      return _typeName((BuiltInType)builtintype);
    } else if ((builtintype instanceof TypeReference)) {
      return _typeName((TypeReference)builtintype);
    } else if ((builtintype instanceof Attribute)) {
      return _typeName((Attribute)builtintype);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public String collectionTypeName(final EObject attribute) {
    if ((attribute instanceof Attribute)) {
      return _collectionTypeName((Attribute)attribute);
    } else if ((attribute instanceof Reference)) {
      return _collectionTypeName((Reference)attribute);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public String dbTypeName(final EObject builtintype) {
    if ((builtintype instanceof BuiltInType)) {
      return _dbTypeName((BuiltInType)builtintype);
    } else if ((builtintype instanceof TypeReference)) {
      return _dbTypeName((TypeReference)builtintype);
    } else if ((builtintype instanceof Attribute)) {
      return _dbTypeName((Attribute)builtintype);
    } else {
      throw new IllegalArgumentException();
    }
  }
}