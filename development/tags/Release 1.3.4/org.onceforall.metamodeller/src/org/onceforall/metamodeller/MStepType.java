/**
 * <copyright>
 * </copyright>
 *
 * $Id: MStepType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MStep Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getMParameterTypes <em>MParameter Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getMResultTypes <em>MResult Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getDefaultActionName <em>Default Action Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getDefaultActionIconFilePath <em>Default Action Icon File Path</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getStoppable <em>Stoppable</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MStepType#getTerminatable <em>Terminatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType()
 * @model kind="class"
 * @generated
 */
public class MStepType extends MStatefulObjectType implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getMParameterTypes() <em>MParameter Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mParameterTypes = null;

	/**
	 * The cached value of the '{@link #getMResultTypes() <em>MResult Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMResultTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mResultTypes = null;

	/**
	 * The default value of the '{@link #getDefaultActionName() <em>Default Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTION_NAME_EDEFAULT = "Mark as completed";

	/**
	 * The cached value of the '{@link #getDefaultActionName() <em>Default Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionName()
	 * @generated
	 * @ordered
	 */
	protected String defaultActionName = DEFAULT_ACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultActionIconFilePath() <em>Default Action Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTION_ICON_FILE_PATH_EDEFAULT = "Image Files\\Mark as completed.gif";

	/**
	 * The cached value of the '{@link #getDefaultActionIconFilePath() <em>Default Action Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected String defaultActionIconFilePath = DEFAULT_ACTION_ICON_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERRUPTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptable()
	 * @generated
	 * @ordered
	 */
	protected Boolean interruptable = INTERRUPTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STOPPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppable()
	 * @generated
	 * @ordered
	 */
	protected Boolean stoppable = STOPPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminatable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TERMINATABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminatable()
	 * @generated
	 * @ordered
	 */
	protected Boolean terminatable = TERMINATABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MStepType() {
		super();

		// Sets the defaults.
		setInterruptable(false);
		setStoppable(false);
		setTerminatable(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MSTEP_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MParameter Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MParameter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MParameter Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_MParameterTypes()
	 * @model type="org.onceforall.metamodeller.MParameterType" containment="true"
	 * @generated
	 */
	public EList getMParameterTypes() {
		if (mParameterTypes == null) {
			mParameterTypes = new EObjectContainmentEList(MParameterType.class,
					this, MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES);
		}
		return mParameterTypes;
	}

	/**
	 * Returns the value of the '<em><b>MResult Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MResult Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MResult Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_MResultTypes()
	 * @model type="org.onceforall.metamodeller.MResultType" containment="true"
	 * @generated
	 */
	public EList getMResultTypes() {
		if (mResultTypes == null) {
			mResultTypes = new EObjectContainmentEList(MResultType.class, this,
					MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES);
		}
		return mResultTypes;
	}

	/**
	 * Returns the value of the '<em><b>Default Action Name</b></em>' attribute.
	 * The default value is <code>"Mark as completed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Action Name</em>' attribute.
	 * @see #setDefaultActionName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_DefaultActionName()
	 * @model default="Mark as completed" required="true"
	 * @generated
	 */
	public String getDefaultActionName() {
		return defaultActionName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MStepType#getDefaultActionName <em>Default Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Action Name</em>' attribute.
	 * @see #getDefaultActionName()
	 * @generated
	 */
	public void setDefaultActionName(String newDefaultActionName) {
		String oldDefaultActionName = defaultActionName;
		defaultActionName = newDefaultActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME,
					oldDefaultActionName, defaultActionName));
	}

	/**
	 * Returns the value of the '<em><b>Default Action Icon File Path</b></em>' attribute.
	 * The default value is <code>"Image Files\\Mark as completed.gif"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Action Icon File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Action Icon File Path</em>' attribute.
	 * @see #setDefaultActionIconFilePath(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_DefaultActionIconFilePath()
	 * @model default="Image Files\\Mark as completed.gif"
	 * @generated
	 */
	public String getDefaultActionIconFilePath() {
		return defaultActionIconFilePath;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MStepType#getDefaultActionIconFilePath <em>Default Action Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Action Icon File Path</em>' attribute.
	 * @see #getDefaultActionIconFilePath()
	 * @generated
	 */
	public void setDefaultActionIconFilePath(String newDefaultActionIconFilePath) {
		String oldDefaultActionIconFilePath = defaultActionIconFilePath;
		defaultActionIconFilePath = newDefaultActionIconFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH,
					oldDefaultActionIconFilePath, defaultActionIconFilePath));
	}

	/**
	 * Returns the value of the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interruptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interruptable</em>' attribute.
	 * @see #setInterruptable(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_Interruptable()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getInterruptable() {
		return interruptable;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MStepType#getInterruptable <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interruptable</em>' attribute.
	 * @see #getInterruptable()
	 * @generated
	 */
	public void setInterruptable(Boolean newInterruptable) {
		Boolean oldInterruptable = interruptable;
		interruptable = newInterruptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE,
					oldInterruptable, interruptable));
	}

	/**
	 * Returns the value of the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stoppable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stoppable</em>' attribute.
	 * @see #setStoppable(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_Stoppable()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getStoppable() {
		return stoppable;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MStepType#getStoppable <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stoppable</em>' attribute.
	 * @see #getStoppable()
	 * @generated
	 */
	public void setStoppable(Boolean newStoppable) {
		Boolean oldStoppable = stoppable;
		stoppable = newStoppable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MSTEP_TYPE__STOPPABLE, oldStoppable,
					stoppable));
	}

	/**
	 * Returns the value of the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminatable</em>' attribute.
	 * @see #setTerminatable(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType_Terminatable()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getTerminatable() {
		return terminatable;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MStepType#getTerminatable <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminatable</em>' attribute.
	 * @see #getTerminatable()
	 * @generated
	 */
	public void setTerminatable(Boolean newTerminatable) {
		Boolean oldTerminatable = terminatable;
		terminatable = newTerminatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MSTEP_TYPE__TERMINATABLE,
					oldTerminatable, terminatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
			return ((InternalEList) getMParameterTypes()).basicRemove(otherEnd,
					msgs);
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
			return ((InternalEList) getMResultTypes()).basicRemove(otherEnd,
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
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
			return getMParameterTypes();
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
			return getMResultTypes();
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME:
			return getDefaultActionName();
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH:
			return getDefaultActionIconFilePath();
		case MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE:
			return getInterruptable();
		case MetaModellerPackage.MSTEP_TYPE__STOPPABLE:
			return getStoppable();
		case MetaModellerPackage.MSTEP_TYPE__TERMINATABLE:
			return getTerminatable();
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
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
			getMParameterTypes().clear();
			getMParameterTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
			getMResultTypes().clear();
			getMResultTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME:
			setDefaultActionName((String) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH:
			setDefaultActionIconFilePath((String) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE:
			setInterruptable((Boolean) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__STOPPABLE:
			setStoppable((Boolean) newValue);
			return;
		case MetaModellerPackage.MSTEP_TYPE__TERMINATABLE:
			setTerminatable((Boolean) newValue);
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
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
			getMParameterTypes().clear();
			return;
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
			getMResultTypes().clear();
			return;
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME:
			setDefaultActionName(DEFAULT_ACTION_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH:
			setDefaultActionIconFilePath(DEFAULT_ACTION_ICON_FILE_PATH_EDEFAULT);
			return;
		case MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE:
			setInterruptable(INTERRUPTABLE_EDEFAULT);
			return;
		case MetaModellerPackage.MSTEP_TYPE__STOPPABLE:
			setStoppable(STOPPABLE_EDEFAULT);
			return;
		case MetaModellerPackage.MSTEP_TYPE__TERMINATABLE:
			setTerminatable(TERMINATABLE_EDEFAULT);
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
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
			return mParameterTypes != null && !mParameterTypes.isEmpty();
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
			return mResultTypes != null && !mResultTypes.isEmpty();
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME:
			return DEFAULT_ACTION_NAME_EDEFAULT == null ? defaultActionName != null
					: !DEFAULT_ACTION_NAME_EDEFAULT.equals(defaultActionName);
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH:
			return DEFAULT_ACTION_ICON_FILE_PATH_EDEFAULT == null ? defaultActionIconFilePath != null
					: !DEFAULT_ACTION_ICON_FILE_PATH_EDEFAULT
							.equals(defaultActionIconFilePath);
		case MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE:
			return INTERRUPTABLE_EDEFAULT == null ? interruptable != null
					: !INTERRUPTABLE_EDEFAULT.equals(interruptable);
		case MetaModellerPackage.MSTEP_TYPE__STOPPABLE:
			return STOPPABLE_EDEFAULT == null ? stoppable != null
					: !STOPPABLE_EDEFAULT.equals(stoppable);
		case MetaModellerPackage.MSTEP_TYPE__TERMINATABLE:
			return TERMINATABLE_EDEFAULT == null ? terminatable != null
					: !TERMINATABLE_EDEFAULT.equals(terminatable);
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
		result.append(" (defaultActionName: ");
		result.append(defaultActionName);
		result.append(", defaultActionIconFilePath: ");
		result.append(defaultActionIconFilePath);
		result.append(", interruptable: ");
		result.append(interruptable);
		result.append(", stoppable: ");
		result.append(stoppable);
		result.append(", terminatable: ");
		result.append(terminatable);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.metamodeller.MElementType#getESuperTypeXPath()
	 */
	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MStep" : getMSuperType()
				.getETypeXPath();
	}

} // MStepType