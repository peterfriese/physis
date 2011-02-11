/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.itemis.mobile.physis.physis.Model#getDatamodels <em>Datamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.itemis.mobile.physis.physis.PhysisPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Datamodels</b></em>' containment reference list.
   * The list contents are of type {@link com.itemis.mobile.physis.physis.DataModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datamodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datamodels</em>' containment reference list.
   * @see com.itemis.mobile.physis.physis.PhysisPackage#getModel_Datamodels()
   * @model containment="true"
   * @generated
   */
  EList<DataModel> getDatamodels();

} // Model
