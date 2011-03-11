/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.itemis.mobile.physis.physis.MappingClause#getMappedType <em>Mapped Type</em>}</li>
 *   <li>{@link com.itemis.mobile.physis.physis.MappingClause#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.itemis.mobile.physis.physis.PhysisPackage#getMappingClause()
 * @model
 * @generated
 */
public interface MappingClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapped Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Type</em>' attribute.
   * @see #setMappedType(String)
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getMappingClause_MappedType()
   * @model
   * @generated
   */
  String getMappedType();

  /**
   * Sets the value of the '{@link com.itemis.mobile.physis.physis.MappingClause#getMappedType <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Type</em>' attribute.
   * @see #getMappedType()
   * @generated
   */
  void setMappedType(String value);

  /**
   * Returns the value of the '<em><b>Platform</b></em>' attribute.
   * The literals are from the enumeration {@link com.itemis.mobile.physis.physis.Platform}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform</em>' attribute.
   * @see com.itemis.mobile.physis.physis.Platform
   * @see #setPlatform(Platform)
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getMappingClause_Platform()
   * @model
   * @generated
   */
  Platform getPlatform();

  /**
   * Sets the value of the '{@link com.itemis.mobile.physis.physis.MappingClause#getPlatform <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' attribute.
   * @see com.itemis.mobile.physis.physis.Platform
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(Platform value);

} // MappingClause
