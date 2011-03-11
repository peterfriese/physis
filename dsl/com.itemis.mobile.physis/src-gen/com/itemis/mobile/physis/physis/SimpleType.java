/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.itemis.mobile.physis.physis.SimpleType#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.itemis.mobile.physis.physis.PhysisPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type
{
  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.itemis.mobile.physis.physis.MappingClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getSimpleType_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<MappingClause> getMappings();

} // SimpleType
