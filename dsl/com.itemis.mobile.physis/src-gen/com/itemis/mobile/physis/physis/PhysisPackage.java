/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.itemis.mobile.physis.physis.PhysisFactory
 * @model kind="package"
 * @generated
 */
public interface PhysisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "physis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itemis.com/mobile/physis/Physis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "physis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PhysisPackage eINSTANCE = com.itemis.mobile.physis.physis.impl.PhysisPackageImpl.init();

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.ModelImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Datamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATAMODELS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.DataModelImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__ENTITIES = 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.ReferenceImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 9;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.BuiltInTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 8;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.DateTypeImpl <em>Date Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.DateTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDateType()
   * @generated
   */
  int DATE_TYPE = 2;

  /**
   * The number of structural features of the '<em>Date Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.IntegerTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getIntegerType()
   * @generated
   */
  int INTEGER_TYPE = 3;

  /**
   * The number of structural features of the '<em>Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.DoubleTypeImpl <em>Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.DoubleTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDoubleType()
   * @generated
   */
  int DOUBLE_TYPE = 4;

  /**
   * The number of structural features of the '<em>Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.FloatTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 5;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.StringTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 6;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.BooleanTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 7;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = BUILT_IN_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.TypeReferenceImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.EntityImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.AttributeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTIPLICITY = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.Platform <em>Platform</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.Platform
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getPlatform()
   * @generated
   */
  int PLATFORM = 13;


  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.itemis.mobile.physis.physis.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.itemis.mobile.physis.physis.Model#getDatamodels <em>Datamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datamodels</em>'.
   * @see com.itemis.mobile.physis.physis.Model#getDatamodels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Datamodels();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see com.itemis.mobile.physis.physis.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.DataModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.itemis.mobile.physis.physis.DataModel#getName()
   * @see #getDataModel()
   * @generated
   */
  EAttribute getDataModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.itemis.mobile.physis.physis.DataModel#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.itemis.mobile.physis.physis.DataModel#getEntities()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Entities();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.DateType <em>Date Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Type</em>'.
   * @see com.itemis.mobile.physis.physis.DateType
   * @generated
   */
  EClass getDateType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Type</em>'.
   * @see com.itemis.mobile.physis.physis.IntegerType
   * @generated
   */
  EClass getIntegerType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Type</em>'.
   * @see com.itemis.mobile.physis.physis.DoubleType
   * @generated
   */
  EClass getDoubleType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see com.itemis.mobile.physis.physis.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see com.itemis.mobile.physis.physis.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see com.itemis.mobile.physis.physis.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see com.itemis.mobile.physis.physis.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.itemis.mobile.physis.physis.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see com.itemis.mobile.physis.physis.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link com.itemis.mobile.physis.physis.TypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.itemis.mobile.physis.physis.TypeReference#getType()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Type();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.itemis.mobile.physis.physis.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.itemis.mobile.physis.physis.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.itemis.mobile.physis.physis.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.itemis.mobile.physis.physis.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.itemis.mobile.physis.physis.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.itemis.mobile.physis.physis.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.itemis.mobile.physis.physis.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.itemis.mobile.physis.physis.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.Attribute#isMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see com.itemis.mobile.physis.physis.Attribute#isMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Multiplicity();

  /**
   * Returns the meta object for enum '{@link com.itemis.mobile.physis.physis.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Platform</em>'.
   * @see com.itemis.mobile.physis.physis.Platform
   * @generated
   */
  EEnum getPlatform();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PhysisFactory getPhysisFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.ModelImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Datamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DATAMODELS = eINSTANCE.getModel_Datamodels();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.DataModelImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MODEL__NAME = eINSTANCE.getDataModel_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__ENTITIES = eINSTANCE.getDataModel_Entities();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.DateTypeImpl <em>Date Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.DateTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDateType()
     * @generated
     */
    EClass DATE_TYPE = eINSTANCE.getDateType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.IntegerTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getIntegerType()
     * @generated
     */
    EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.DoubleTypeImpl <em>Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.DoubleTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getDoubleType()
     * @generated
     */
    EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.FloatTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.StringTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.BooleanTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.BuiltInTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getBuiltInType()
     * @generated
     */
    EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.ReferenceImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.TypeReferenceImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__TYPE = eINSTANCE.getTypeReference_Type();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.EntityImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.AttributeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.Platform <em>Platform</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.Platform
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getPlatform()
     * @generated
     */
    EEnum PLATFORM = eINSTANCE.getPlatform();

  }

} //PhysisPackage
