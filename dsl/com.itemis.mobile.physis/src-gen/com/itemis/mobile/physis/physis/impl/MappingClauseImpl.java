/**
 * <copyright>
 * </copyright>
 *
 */
package com.itemis.mobile.physis.physis.impl;

import com.itemis.mobile.physis.physis.MappingClause;
import com.itemis.mobile.physis.physis.PhysisPackage;
import com.itemis.mobile.physis.physis.Platform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.itemis.mobile.physis.physis.impl.MappingClauseImpl#getMappedType <em>Mapped Type</em>}</li>
 *   <li>{@link com.itemis.mobile.physis.physis.impl.MappingClauseImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingClauseImpl extends MinimalEObjectImpl.Container implements MappingClause
{
  /**
   * The default value of the '{@link #getMappedType() <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedType()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedType() <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedType()
   * @generated
   * @ordered
   */
  protected String mappedType = MAPPED_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected static final Platform PLATFORM_EDEFAULT = Platform.IOS;

  /**
   * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected Platform platform = PLATFORM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingClauseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PhysisPackage.Literals.MAPPING_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMappedType()
  {
    return mappedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedType(String newMappedType)
  {
    String oldMappedType = mappedType;
    mappedType = newMappedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhysisPackage.MAPPING_CLAUSE__MAPPED_TYPE, oldMappedType, mappedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Platform getPlatform()
  {
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlatform(Platform newPlatform)
  {
    Platform oldPlatform = platform;
    platform = newPlatform == null ? PLATFORM_EDEFAULT : newPlatform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhysisPackage.MAPPING_CLAUSE__PLATFORM, oldPlatform, platform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PhysisPackage.MAPPING_CLAUSE__MAPPED_TYPE:
        return getMappedType();
      case PhysisPackage.MAPPING_CLAUSE__PLATFORM:
        return getPlatform();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PhysisPackage.MAPPING_CLAUSE__MAPPED_TYPE:
        setMappedType((String)newValue);
        return;
      case PhysisPackage.MAPPING_CLAUSE__PLATFORM:
        setPlatform((Platform)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PhysisPackage.MAPPING_CLAUSE__MAPPED_TYPE:
        setMappedType(MAPPED_TYPE_EDEFAULT);
        return;
      case PhysisPackage.MAPPING_CLAUSE__PLATFORM:
        setPlatform(PLATFORM_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PhysisPackage.MAPPING_CLAUSE__MAPPED_TYPE:
        return MAPPED_TYPE_EDEFAULT == null ? mappedType != null : !MAPPED_TYPE_EDEFAULT.equals(mappedType);
      case PhysisPackage.MAPPING_CLAUSE__PLATFORM:
        return platform != PLATFORM_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mappedType: ");
    result.append(mappedType);
    result.append(", platform: ");
    result.append(platform);
    result.append(')');
    return result.toString();
  }

} //MappingClauseImpl
