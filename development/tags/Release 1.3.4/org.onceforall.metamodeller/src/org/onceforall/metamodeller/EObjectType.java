/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.EObjectType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getEObjectType()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class EObjectType extends EObjectImpl implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.EOBJECT_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEObjectType_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.EObjectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.EOBJECT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.EOBJECT_TYPE__NAME:
			return getName();
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
		case MetaModellerPackage.EOBJECT_TYPE__NAME:
			setName((String) newValue);
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
		case MetaModellerPackage.EOBJECT_TYPE__NAME:
			setName(NAME_EDEFAULT);
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
		case MetaModellerPackage.EOBJECT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns the XPath to this type, e.g. <code>//enterstep/MEnterServiceInformationStep</code>.
	 * 
	 * @return Returns the XPath to this type.
	 */
	public String getETypeXPath() {
		String result = getName();

		if (this instanceof MStepType && eContainer() != null
				&& eContainer() instanceof MObjectType)
			result = "/" + ((MObjectType) eContainer()).getName() + result;
		else
			result = "/" + result;

		// Constructs the XPath by finding first the Ecore parent package and then adding the XPath to the Ecore parent package.
		EObjectType eObjectType = (EObjectType) eContainer();
		while (eObjectType != null) {
			if (eObjectType instanceof EPackageType)
				return "/" + eObjectType.getETypeXPath() + result;

			eObjectType = (EObjectType) eObjectType.eContainer();
		}

		return "/" + result;
	}

	/**
	 * Gets the XPath to this Ecore element in the Ecore model. The Generator model uses the returned expression to reference
	 * elements in the Ecore model.
	 * 
	 * @return Returns the XPath to this Ecore element in the Ecore model.
	 */
	public String getEcoreXPath() {
		String result = "/" + getName();

		/*if(this instanceof MStepType && eContainer() != null && eContainer() instanceof MObjectType)
		 result = "$"+result;
		 else
		 result = "/"+result;*/

		EObjectType eObjectType = (EObjectType) eContainer();
		while (eObjectType != null
				&& !(eObjectType instanceof ERootPackageType)) {
			result = "/" + eObjectType.getName() + result;
			eObjectType = (EObjectType) eObjectType.eContainer();
		}

		return "/" + result;
	}

} // EObjectType