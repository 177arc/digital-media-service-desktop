/**
 * <copyright>
 * </copyright>
 *
 * $Id: MObjectType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MObject Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MObjectType#getMPropertyTypes <em>MProperty Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MObjectType#getMReferenceTypes <em>MReference Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MObjectType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MObjectType#getCompositeClassName <em>Composite Class Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType <em>MReference Data Type Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType()
 * @model kind="class"
 * @generated
 */
public class MObjectType extends MElementType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getMPropertyTypes() <em>MProperty Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mPropertyTypes = null;

	/**
	 * The cached value of the '{@link #getMReferenceTypes() <em>MReference Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReferenceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mReferenceTypes = null;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITE_CLASS_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	protected String compositeClassName = COMPOSITE_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMReferenceDataTypeType() <em>MReference Data Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReferenceDataTypeType()
	 * @generated
	 * @ordered
	 */
	protected MReferenceDataTypeType mReferenceDataTypeType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MObjectType() {
		super();

		// Sets the default values.
		setAbstract(false);

		mReferenceDataTypeType = new MReferenceDataTypeType();
		mReferenceDataTypeType.setMObjectType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MOBJECT_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MProperty Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProperty Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProperty Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType_MPropertyTypes()
	 * @model type="org.onceforall.metamodeller.MPropertyType" containment="true"
	 * @generated
	 */
	public EList getMPropertyTypes() {
		if (mPropertyTypes == null) {
			mPropertyTypes = new EObjectContainmentEList(MPropertyType.class,
					this, MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES);
		}
		return mPropertyTypes;
	}

	/**
	 * Returns the value of the '<em><b>MReference Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MReference Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReference Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType_MReferenceTypes()
	 * @model type="org.onceforall.metamodeller.MReferenceType" containment="true"
	 * @generated
	 */
	public EList getMReferenceTypes() {
		if (mReferenceTypes == null) {
			mReferenceTypes = new EObjectContainmentEList(MReferenceType.class,
					this, MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES);
		}
		return mReferenceTypes;
	}

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType_Abstract()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MObjectType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MOBJECT_TYPE__ABSTRACT, oldAbstract,
					abstract_));
	}

	/**
	 * Returns the value of the '<em><b>Composite Class Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Class Name</em>' attribute.
	 * @see #setCompositeClassName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType_CompositeClassName()
	 * @model default=""
	 * @generated
	 */
	public String getCompositeClassName() {
		return compositeClassName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MObjectType#getCompositeClassName <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Class Name</em>' attribute.
	 * @see #getCompositeClassName()
	 * @generated
	 */
	public void setCompositeClassName(String newCompositeClassName) {
		String oldCompositeClassName = compositeClassName;
		compositeClassName = newCompositeClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME,
					oldCompositeClassName, compositeClassName));
	}

	/**
	 * Returns the value of the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType <em>MObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MReference Data Type Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReference Data Type Type</em>' containment reference.
	 * @see #setMReferenceDataTypeType(MReferenceDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType_MReferenceDataTypeType()
	 * @see org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType
	 * @model opposite="mObjectType" containment="true" required="true"
	 * @generated
	 */
	public MReferenceDataTypeType getMReferenceDataTypeType() {
		return mReferenceDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMReferenceDataTypeType(
			MReferenceDataTypeType newMReferenceDataTypeType,
			NotificationChain msgs) {
		MReferenceDataTypeType oldMReferenceDataTypeType = mReferenceDataTypeType;
		mReferenceDataTypeType = newMReferenceDataTypeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE,
					oldMReferenceDataTypeType, newMReferenceDataTypeType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType <em>MReference Data Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MReference Data Type Type</em>' containment reference.
	 * @see #getMReferenceDataTypeType()
	 * @generated
	 */
	public void setMReferenceDataTypeType(
			MReferenceDataTypeType newMReferenceDataTypeType) {
		if (newMReferenceDataTypeType != mReferenceDataTypeType) {
			NotificationChain msgs = null;
			if (mReferenceDataTypeType != null)
				msgs = ((InternalEObject) mReferenceDataTypeType)
						.eInverseRemove(
								this,
								MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE,
								MReferenceDataTypeType.class, msgs);
			if (newMReferenceDataTypeType != null)
				msgs = ((InternalEObject) newMReferenceDataTypeType)
						.eInverseAdd(
								this,
								MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE,
								MReferenceDataTypeType.class, msgs);
			msgs = basicSetMReferenceDataTypeType(newMReferenceDataTypeType,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE,
					newMReferenceDataTypeType, newMReferenceDataTypeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			if (mReferenceDataTypeType != null)
				msgs = ((InternalEObject) mReferenceDataTypeType)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE,
								null, msgs);
			return basicSetMReferenceDataTypeType(
					(MReferenceDataTypeType) otherEnd, msgs);
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
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
			return ((InternalEList) getMPropertyTypes()).basicRemove(otherEnd,
					msgs);
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			return ((InternalEList) getMReferenceTypes()).basicRemove(otherEnd,
					msgs);
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			return basicSetMReferenceDataTypeType(null, msgs);
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
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
			return getMPropertyTypes();
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			return getMReferenceTypes();
		case MetaModellerPackage.MOBJECT_TYPE__ABSTRACT:
			return getAbstract();
		case MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME:
			return getCompositeClassName();
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			return getMReferenceDataTypeType();
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
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
			getMPropertyTypes().clear();
			getMPropertyTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			getMReferenceTypes().clear();
			getMReferenceTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__ABSTRACT:
			setAbstract((Boolean) newValue);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME:
			setCompositeClassName((String) newValue);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			setMReferenceDataTypeType((MReferenceDataTypeType) newValue);
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
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
			getMPropertyTypes().clear();
			return;
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			getMReferenceTypes().clear();
			return;
		case MetaModellerPackage.MOBJECT_TYPE__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME:
			setCompositeClassName(COMPOSITE_CLASS_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			setMReferenceDataTypeType((MReferenceDataTypeType) null);
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
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
			return mPropertyTypes != null && !mPropertyTypes.isEmpty();
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			return mReferenceTypes != null && !mReferenceTypes.isEmpty();
		case MetaModellerPackage.MOBJECT_TYPE__ABSTRACT:
			return ABSTRACT_EDEFAULT == null ? abstract_ != null
					: !ABSTRACT_EDEFAULT.equals(abstract_);
		case MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME:
			return COMPOSITE_CLASS_NAME_EDEFAULT == null ? compositeClassName != null
					: !COMPOSITE_CLASS_NAME_EDEFAULT.equals(compositeClassName);
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			return mReferenceDataTypeType != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", compositeClassName: ");
		result.append(compositeClassName);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.metamodeller.MElementType#getESuperTypeXPath()
	 */
	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MObject" : getMSuperType()
				.getETypeXPath();
	}

	/**
	 * @see org.onceforall.metamodeller.EObjectType#setName(java.lang.String)
	 */
	@Override
	public void setName(String newName) {
		super.setName(newName);

		if (mReferenceDataTypeType != null)
			mReferenceDataTypeType.setName(getName());
	}

} // MObjectType