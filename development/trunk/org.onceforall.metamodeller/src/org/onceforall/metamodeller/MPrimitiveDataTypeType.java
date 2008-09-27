/**
 * <copyright>
 * </copyright>
 *
 * $Id: MPrimitiveDataTypeType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPrimitive Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MPrimitiveDataTypeType#getDataTypeName <em>Data Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPrimitiveDataTypeType()
 * @model kind="class"
 * @generated
 */
public class MPrimitiveDataTypeType extends MValueDataTypeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The default value of the '{@link #getDataTypeName() <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTypeName() <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected String dataTypeName = DATA_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPrimitiveDataTypeType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MPRIMITIVE_DATA_TYPE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Data Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Name</em>' attribute.
	 * @see #setDataTypeName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPrimitiveDataTypeType_DataTypeName()
	 * @model required="true"
	 * @generated
	 */
	public String getDataTypeName() {
		return dataTypeName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType#getDataTypeName <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Name</em>' attribute.
	 * @see #getDataTypeName()
	 * @generated
	 */
	public void setDataTypeName(String newDataTypeName) {
		String oldDataTypeName = dataTypeName;
		dataTypeName = newDataTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME,
					oldDataTypeName, dataTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME:
			return getDataTypeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME:
			setDataTypeName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME:
			setDataTypeName(DATA_TYPE_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME:
			return DATA_TYPE_NAME_EDEFAULT == null ? dataTypeName != null
					: !DATA_TYPE_NAME_EDEFAULT.equals(dataTypeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataTypeName: ");
		result.append(dataTypeName);
		result.append(')');
		return result.toString();
	}

} // MPrimitiveDataTypeType