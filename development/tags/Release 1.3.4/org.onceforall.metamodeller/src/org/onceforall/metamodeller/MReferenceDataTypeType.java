/**
 * <copyright>
 * </copyright>
 *
 * $Id: MReferenceDataTypeType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MReference Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType <em>MObject Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceDataTypeType()
 * @model kind="class"
 * @generated
 */
public class MReferenceDataTypeType extends MValueDataTypeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MReferenceDataTypeType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MREFERENCE_DATA_TYPE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MObject Type</b></em>' container reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType <em>MReference Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MObject Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MObject Type</em>' container reference.
	 * @see #setMObjectType(MObjectType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceDataTypeType_MObjectType()
	 * @see org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType
	 * @model opposite="mReferenceDataTypeType" required="true"
	 * @generated
	 */
	public MObjectType getMObjectType() {
		if (eContainerFeatureID != MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE)
			return null;
		return (MObjectType) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMObjectType(MObjectType newMObjectType,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMObjectType,
				MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE,
				msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType <em>MObject Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MObject Type</em>' container reference.
	 * @see #getMObjectType()
	 * @generated
	 */
	public void setMObjectType(MObjectType newMObjectType) {
		if (newMObjectType != eInternalContainer()
				|| (eContainerFeatureID != MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE && newMObjectType != null)) {
			if (EcoreUtil.isAncestor(this, newMObjectType))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMObjectType != null)
				msgs = ((InternalEObject) newMObjectType)
						.eInverseAdd(
								this,
								MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE,
								MObjectType.class, msgs);
			msgs = basicSetMObjectType(newMObjectType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE,
					newMObjectType, newMObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMObjectType((MObjectType) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			return basicSetMObjectType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			return eInternalContainer()
					.eInverseRemove(
							this,
							MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE,
							MObjectType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			return getMObjectType();
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
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			setMObjectType((MObjectType) newValue);
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
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			setMObjectType((MObjectType) null);
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
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE:
			return getMObjectType() != null;
		}
		return super.eIsSet(featureID);
	}

} // MReferenceDataTypeType