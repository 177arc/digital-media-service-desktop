/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.onceforall.metamodeller;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBusiness Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MBusinessObjectType#getMStepTypes <em>MStep Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMBusinessObjectType()
 * @model kind="class"
 * @generated
 */
public class MBusinessObjectType extends MStatefulObjectType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getMStepTypes() <em>MStep Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStepTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mStepTypes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBusinessObjectType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MBUSINESS_OBJECT_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MStep Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MStep Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStep Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMBusinessObjectType_MStepTypes()
	 * @model type="org.onceforall.metamodeller.MStepType" containment="true"
	 * @generated
	 */
	public EList getMStepTypes() {
		if (mStepTypes == null) {
			mStepTypes = new EObjectContainmentEList(MStepType.class, this,
					MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES);
		}
		return mStepTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES:
			return ((InternalEList) getMStepTypes())
					.basicRemove(otherEnd, msgs);
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
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES:
			return getMStepTypes();
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
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES:
			getMStepTypes().clear();
			getMStepTypes().addAll((Collection) newValue);
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
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES:
			getMStepTypes().clear();
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
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE__MSTEP_TYPES:
			return mStepTypes != null && !mStepTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MBusinessObjectType