/**
 * <copyright>
 * </copyright>
 *
 * $Id: MReferenceType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MReference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getMObjectType <em>MObject Type</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getTransient <em>Transient</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MReferenceType#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType()
 * @model kind="class"
 * @generated
 */
public class MReferenceType extends EObjectType implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getMObjectType() <em>MObject Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMObjectType()
	 * @generated
	 * @ordered
	 */
	protected MObjectType mObjectType = null;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerived()
	 * @generated
	 * @ordered
	 */
	protected Boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRANSIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected Boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected Boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MReferenceType() {
		super();

		setDerived(false);
		setTransient(false);
		setVolatile(false);
		setContainment(true);
		setUpperBound(0);
		setLowerBound(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MREFERENCE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MObject Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MObject Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MObject Type</em>' reference.
	 * @see #setMObjectType(MObjectType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_MObjectType()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	public MObjectType getMObjectType() {
		return mObjectType;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getMObjectType <em>MObject Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MObject Type</em>' reference.
	 * @see #getMObjectType()
	 * @generated
	 */
	public void setMObjectType(MObjectType newMObjectType) {
		MObjectType oldMObjectType = mObjectType;
		mObjectType = newMObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__MOBJECT_TYPE,
					oldMObjectType, mObjectType));
	}

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND,
					oldLowerBound, lowerBound));
	}

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND,
					oldUpperBound, upperBound));
	}

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_Derived()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getDerived() {
		return derived;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #getDerived()
	 * @generated
	 */
	public void setDerived(Boolean newDerived) {
		Boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__DERIVED, oldDerived,
					derived));
	}

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_Transient()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getTransient() {
		return transient_;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #getTransient()
	 * @generated
	 */
	public void setTransient(Boolean newTransient) {
		Boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT,
					oldTransient, transient_));
	}

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_Volatile()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #getVolatile()
	 * @generated
	 */
	public void setVolatile(Boolean newVolatile) {
		Boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__VOLATILE, oldVolatile,
					volatile_));
	}

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType_Containment()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getContainment() {
		return containment;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MReferenceType#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #getContainment()
	 * @generated
	 */
	public void setContainment(Boolean newContainment) {
		Boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT,
					oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.MREFERENCE_TYPE__MOBJECT_TYPE:
			return getMObjectType();
		case MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND:
			return getLowerBound();
		case MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND:
			return getUpperBound();
		case MetaModellerPackage.MREFERENCE_TYPE__DERIVED:
			return getDerived();
		case MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT:
			return getTransient();
		case MetaModellerPackage.MREFERENCE_TYPE__VOLATILE:
			return getVolatile();
		case MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT:
			return getContainment();
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
		case MetaModellerPackage.MREFERENCE_TYPE__MOBJECT_TYPE:
			setMObjectType((MObjectType) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND:
			setLowerBound((Integer) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND:
			setUpperBound((Integer) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__DERIVED:
			setDerived((Boolean) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT:
			setTransient((Boolean) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__VOLATILE:
			setVolatile((Boolean) newValue);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT:
			setContainment((Boolean) newValue);
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
		case MetaModellerPackage.MREFERENCE_TYPE__MOBJECT_TYPE:
			setMObjectType((MObjectType) null);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__DERIVED:
			setDerived(DERIVED_EDEFAULT);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT:
			setTransient(TRANSIENT_EDEFAULT);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__VOLATILE:
			setVolatile(VOLATILE_EDEFAULT);
			return;
		case MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT:
			setContainment(CONTAINMENT_EDEFAULT);
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
		case MetaModellerPackage.MREFERENCE_TYPE__MOBJECT_TYPE:
			return mObjectType != null;
		case MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND:
			return LOWER_BOUND_EDEFAULT == null ? lowerBound != null
					: !LOWER_BOUND_EDEFAULT.equals(lowerBound);
		case MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND:
			return UPPER_BOUND_EDEFAULT == null ? upperBound != null
					: !UPPER_BOUND_EDEFAULT.equals(upperBound);
		case MetaModellerPackage.MREFERENCE_TYPE__DERIVED:
			return DERIVED_EDEFAULT == null ? derived != null
					: !DERIVED_EDEFAULT.equals(derived);
		case MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT:
			return TRANSIENT_EDEFAULT == null ? transient_ != null
					: !TRANSIENT_EDEFAULT.equals(transient_);
		case MetaModellerPackage.MREFERENCE_TYPE__VOLATILE:
			return VOLATILE_EDEFAULT == null ? volatile_ != null
					: !VOLATILE_EDEFAULT.equals(volatile_);
		case MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT:
			return CONTAINMENT_EDEFAULT == null ? containment != null
					: !CONTAINMENT_EDEFAULT.equals(containment);
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", derived: ");
		result.append(derived);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", containment: ");
		result.append(containment);
		result.append(')');
		return result.toString();
	}

} // MReferenceType