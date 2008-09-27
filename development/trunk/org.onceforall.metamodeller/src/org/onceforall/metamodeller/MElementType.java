/**
 * <copyright>
 * </copyright>
 *
 * $Id: MElementType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MElement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MElementType#getMSuperType <em>MSuper Type</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MElementType#getDefaultName <em>Default Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MElementType#getDefaultDescription <em>Default Description</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MElementType#getDefaultIconFilePath <em>Default Icon File Path</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MElementType#getNameForUI <em>Name For UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class MElementType extends EObjectType implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getMSuperType() <em>MSuper Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSuperType()
	 * @generated
	 * @ordered
	 */
	protected MElementType mSuperType = null;

	/**
	 * The default value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultName()
	 * @generated
	 * @ordered
	 */
	protected String defaultName = DEFAULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDescription() <em>Default Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultDescription() <em>Default Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDescription()
	 * @generated
	 * @ordered
	 */
	protected String defaultDescription = DEFAULT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIconFilePath() <em>Default Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ICON_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultIconFilePath() <em>Default Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected String defaultIconFilePath = DEFAULT_ICON_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameForUI() <em>Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameForUI()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FOR_UI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameForUI() <em>Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameForUI()
	 * @generated
	 * @ordered
	 */
	protected String nameForUI = NAME_FOR_UI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MElementType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MELEMENT_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSuper Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSuper Type</em>' reference.
	 * @see #setMSuperType(MElementType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType_MSuperType()
	 * @model resolveProxies="false"
	 * @generated
	 */
	public MElementType getMSuperType() {
		return mSuperType;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MElementType#getMSuperType <em>MSuper Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSuper Type</em>' reference.
	 * @see #getMSuperType()
	 * @generated
	 */
	public void setMSuperType(MElementType newMSuperType) {
		MElementType oldMSuperType = mSuperType;
		mSuperType = newMSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MELEMENT_TYPE__MSUPER_TYPE,
					oldMSuperType, mSuperType));
	}

	/**
	 * Returns the value of the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Name</em>' attribute.
	 * @see #setDefaultName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType_DefaultName()
	 * @model required="true"
	 * @generated
	 */
	public String getDefaultName() {
		return defaultName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MElementType#getDefaultName <em>Default Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Name</em>' attribute.
	 * @see #getDefaultName()
	 * @generated
	 */
	public void setDefaultName(String newDefaultName) {
		String oldDefaultName = defaultName;
		defaultName = newDefaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME,
					oldDefaultName, defaultName));
	}

	/**
	 * Returns the value of the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Description</em>' attribute.
	 * @see #setDefaultDescription(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType_DefaultDescription()
	 * @model
	 * @generated
	 */
	public String getDefaultDescription() {
		return defaultDescription;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MElementType#getDefaultDescription <em>Default Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Description</em>' attribute.
	 * @see #getDefaultDescription()
	 * @generated
	 */
	public void setDefaultDescription(String newDefaultDescription) {
		String oldDefaultDescription = defaultDescription;
		defaultDescription = newDefaultDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION,
					oldDefaultDescription, defaultDescription));
	}

	/**
	 * Returns the value of the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Icon File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Icon File Path</em>' attribute.
	 * @see #setDefaultIconFilePath(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType_DefaultIconFilePath()
	 * @model
	 * @generated
	 */
	public String getDefaultIconFilePath() {
		return defaultIconFilePath;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MElementType#getDefaultIconFilePath <em>Default Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Icon File Path</em>' attribute.
	 * @see #getDefaultIconFilePath()
	 * @generated
	 */
	public void setDefaultIconFilePath(String newDefaultIconFilePath) {
		String oldDefaultIconFilePath = defaultIconFilePath;
		defaultIconFilePath = newDefaultIconFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH,
					oldDefaultIconFilePath, defaultIconFilePath));
	}

	/**
	 * Returns the value of the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name For UI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name For UI</em>' attribute.
	 * @see #setNameForUI(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType_NameForUI()
	 * @model
	 * @generated
	 */
	public String getNameForUI() {
		return nameForUI;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MElementType#getNameForUI <em>Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name For UI</em>' attribute.
	 * @see #getNameForUI()
	 * @generated
	 */
	public void setNameForUI(String newNameForUI) {
		String oldNameForUI = nameForUI;
		nameForUI = newNameForUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI,
					oldNameForUI, nameForUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.MELEMENT_TYPE__MSUPER_TYPE:
			return getMSuperType();
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME:
			return getDefaultName();
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION:
			return getDefaultDescription();
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH:
			return getDefaultIconFilePath();
		case MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI:
			return getNameForUI();
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
		case MetaModellerPackage.MELEMENT_TYPE__MSUPER_TYPE:
			setMSuperType((MElementType) newValue);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME:
			setDefaultName((String) newValue);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION:
			setDefaultDescription((String) newValue);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH:
			setDefaultIconFilePath((String) newValue);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI:
			setNameForUI((String) newValue);
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
		case MetaModellerPackage.MELEMENT_TYPE__MSUPER_TYPE:
			setMSuperType((MElementType) null);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME:
			setDefaultName(DEFAULT_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION:
			setDefaultDescription(DEFAULT_DESCRIPTION_EDEFAULT);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH:
			setDefaultIconFilePath(DEFAULT_ICON_FILE_PATH_EDEFAULT);
			return;
		case MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI:
			setNameForUI(NAME_FOR_UI_EDEFAULT);
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
		case MetaModellerPackage.MELEMENT_TYPE__MSUPER_TYPE:
			return mSuperType != null;
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME:
			return DEFAULT_NAME_EDEFAULT == null ? defaultName != null
					: !DEFAULT_NAME_EDEFAULT.equals(defaultName);
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION:
			return DEFAULT_DESCRIPTION_EDEFAULT == null ? defaultDescription != null
					: !DEFAULT_DESCRIPTION_EDEFAULT.equals(defaultDescription);
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH:
			return DEFAULT_ICON_FILE_PATH_EDEFAULT == null ? defaultIconFilePath != null
					: !DEFAULT_ICON_FILE_PATH_EDEFAULT
							.equals(defaultIconFilePath);
		case MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI:
			return NAME_FOR_UI_EDEFAULT == null ? nameForUI != null
					: !NAME_FOR_UI_EDEFAULT.equals(nameForUI);
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
		result.append(" (defaultName: ");
		result.append(defaultName);
		result.append(", defaultDescription: ");
		result.append(defaultDescription);
		result.append(", defaultIconFilePath: ");
		result.append(defaultIconFilePath);
		result.append(", nameForUI: ");
		result.append(nameForUI);
		result.append(')');
		return result.toString();
	}

	/**
	 * Gets the XPath to super type of this element type, e.g. <code>//MStep</code>.
	 * 
	 * @return Returns the XPath to super type of this element type. It returns <code>null</code> if managed element type has no super type.
	 */
	public String getESuperTypeXPath() {
		MElementType mSuperType = getMSuperType();
		if (mSuperType == null)
			return null;

		return mSuperType.getETypeXPath();
	}

	/**
	 * Gets the name of the Ecore reference feature to this managed element type.
	 * All managed objects use the Ecore reference feature to hold their managed
	 * properties. E.g. the name of a managed element type that is called <code>MStateProperty</code>
	 * is <code>mStateProperty</code>. 
	 *  
	 * @return Returns the name of the Ecore reference feature to this managed element type.
	 */
	public String getReferenceName() {
		String name = getName();
		if (name == null || name.length() == 0)
			return name;

		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}

} // MElementType