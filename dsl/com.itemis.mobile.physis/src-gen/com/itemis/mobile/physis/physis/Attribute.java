/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.itemis.mobile.physis.physis.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.itemis.mobile.physis.physis.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link com.itemis.mobile.physis.physis.Attribute#isMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.itemis.mobile.physis.physis.PhysisPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.itemis.mobile.physis.physis.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Reference)
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  Reference getType();

  /**
   * Sets the value of the '{@link com.itemis.mobile.physis.physis.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Reference value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(boolean)
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getAttribute_Multiplicity()
   * @model
   * @generated
   */
  boolean isMultiplicity();

  /**
   * Sets the value of the '{@link com.itemis.mobile.physis.physis.Attribute#isMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #isMultiplicity()
   * @generated
   */
  void setMultiplicity(boolean value);

} // Attribute
