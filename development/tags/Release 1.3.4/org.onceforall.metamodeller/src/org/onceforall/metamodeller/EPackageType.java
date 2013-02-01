/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.EPackageType#getEPackageTypes <em>EPackage Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.EPackageType#getMObjectTypes <em>MObject Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getEPackageType()
 * @model kind="class"
 * @generated
 */
public class EPackageType extends EObjectType implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getEPackageTypes() <em>EPackage Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList ePackageTypes = null;

	/**
	 * The cached value of the '{@link #getMObjectTypes() <em>MObject Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mObjectTypes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.EPACKAGE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>EPackage Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.EPackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEPackageType_EPackageTypes()
	 * @model type="org.onceforall.metamodeller.EPackageType" containment="true"
	 * @generated
	 */
	public EList getEPackageTypes() {
		if (ePackageTypes == null) {
			ePackageTypes = new EObjectContainmentEList(EPackageType.class,
					this, MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES);
		}
		return ePackageTypes;
	}

	/**
	 * Returns the value of the '<em><b>MObject Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MObject Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MObject Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEPackageType_MObjectTypes()
	 * @model type="org.onceforall.metamodeller.MObjectType" containment="true"
	 * @generated
	 */
	public EList getMObjectTypes() {
		if (mObjectTypes == null) {
			mObjectTypes = new EObjectContainmentEList(MObjectType.class, this,
					MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES);
		}
		return mObjectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES:
			return ((InternalEList) getEPackageTypes()).basicRemove(otherEnd,
					msgs);
		case MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES:
			return ((InternalEList) getMObjectTypes()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES:
			return getEPackageTypes();
		case MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES:
			return getMObjectTypes();
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
		case MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES:
			getEPackageTypes().clear();
			getEPackageTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES:
			getMObjectTypes().clear();
			getMObjectTypes().addAll((Collection) newValue);
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
		case MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES:
			getEPackageTypes().clear();
			return;
		case MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES:
			getMObjectTypes().clear();
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
		case MetaModellerPackage.EPACKAGE_TYPE__EPACKAGE_TYPES:
			return ePackageTypes != null && !ePackageTypes.isEmpty();
		case MetaModellerPackage.EPACKAGE_TYPE__MOBJECT_TYPES:
			return mObjectTypes != null && !mObjectTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Returns the XPath to this type, e.g. <code>//enterstep</code>.
	 * 
	 * @return Returns the XPath to this type.
	 */
	@Override
	public String getETypeXPath() {
		String result = "";

		// Constructs the XPath but excludes the root.
		EObjectType eObjectType = this;
		while (eObjectType != null && eObjectType.eContainer() != null) {
			if (eObjectType instanceof EPackageType) {
				EPackageType ePackageType = (EPackageType) eObjectType;
				result = "/" + ePackageType.getName() + result;
			}

			eObjectType = (EObjectType) eObjectType.eContainer();
		}

		if (result.length() == 0)
			return result;
		else
			return "/" + result;
	}

	/**
	 * Gets the package prefix, which is derived from the package name.
	 * 
	 * @return Returns the package prefix, which is derived from the package name.
	 */
	public String getPrefix() {
		String result = name.substring(0, 1).toUpperCase();

		if (name.length() > 1)
			result += name.substring(1);

		return result;
	}

} // EPackageType