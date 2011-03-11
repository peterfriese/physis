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
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__TYPES = 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.TypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.MappingClauseImpl <em>Mapping Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.MappingClauseImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getMappingClause()
   * @generated
   */
  int MAPPING_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Mapped Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CLAUSE__MAPPED_TYPE = 0;

  /**
   * The feature id for the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CLAUSE__PLATFORM = 1;

  /**
   * The number of structural features of the '<em>Mapping Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.SimpleTypeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__MAPPINGS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.EntityImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.itemis.mobile.physis.physis.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.itemis.mobile.physis.physis.impl.AttributeImpl
   * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
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
  int PLATFORM = 7;


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
   * Returns the meta object for the containment reference list '{@link com.itemis.mobile.physis.physis.DataModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see com.itemis.mobile.physis.physis.DataModel#getTypes()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Types();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.itemis.mobile.physis.physis.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.itemis.mobile.physis.physis.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.MappingClause <em>Mapping Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Clause</em>'.
   * @see com.itemis.mobile.physis.physis.MappingClause
   * @generated
   */
  EClass getMappingClause();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.MappingClause#getMappedType <em>Mapped Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped Type</em>'.
   * @see com.itemis.mobile.physis.physis.MappingClause#getMappedType()
   * @see #getMappingClause()
   * @generated
   */
  EAttribute getMappingClause_MappedType();

  /**
   * Returns the meta object for the attribute '{@link com.itemis.mobile.physis.physis.MappingClause#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform</em>'.
   * @see com.itemis.mobile.physis.physis.MappingClause#getPlatform()
   * @see #getMappingClause()
   * @generated
   */
  EAttribute getMappingClause_Platform();

  /**
   * Returns the meta object for class '{@link com.itemis.mobile.physis.physis.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see com.itemis.mobile.physis.physis.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the containment reference list '{@link com.itemis.mobile.physis.physis.SimpleType#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see com.itemis.mobile.physis.physis.SimpleType#getMappings()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_Mappings();

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
   * Returns the meta object for the reference '{@link com.itemis.mobile.physis.physis.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
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
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__TYPES = eINSTANCE.getDataModel_Types();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.TypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.MappingClauseImpl <em>Mapping Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.MappingClauseImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getMappingClause()
     * @generated
     */
    EClass MAPPING_CLAUSE = eINSTANCE.getMappingClause();

    /**
     * The meta object literal for the '<em><b>Mapped Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_CLAUSE__MAPPED_TYPE = eINSTANCE.getMappingClause_MappedType();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_CLAUSE__PLATFORM = eINSTANCE.getMappingClause_Platform();

    /**
     * The meta object literal for the '{@link com.itemis.mobile.physis.physis.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.itemis.mobile.physis.physis.impl.SimpleTypeImpl
     * @see com.itemis.mobile.physis.physis.impl.PhysisPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__MAPPINGS = eINSTANCE.getSimpleType_Mappings();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
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
