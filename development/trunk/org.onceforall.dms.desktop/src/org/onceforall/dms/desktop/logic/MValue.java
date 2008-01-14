/*
 * Revision History:
 * $Log: MValue.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.exception.ConversionException;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;
import org.onceforall.dms.desktop.notify.MInputValuesList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#getMInputValues <em>MInput Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#getValueForUI <em>Value For UI</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#getHistoricValues <em>Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#getHistoricValuesForUI <em>Historic Values For UI</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MValue#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class MValue extends MElement {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MValue.class.getName();

	/** Specifies a user-friendly representation of the name of this Java class. This name is 
     * intended for use in UI messages. */
	public static final String CLASS_NAME_FOR_UI = "Value";
	
	/** Specifies the character that is used to seperate multiple values for value features that can take more than one actual value. */
	public static final char VALUE_SEPARATOR = ';';

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";
    
	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MValue.TYPE_NAME, new ReferenceType("Reference to "+MValue.TYPE_NAME, "Specifies a reference to a "+MValue.TYPE_NAME_FOR_UI, MValue.class));
	}
	/**
	 * The cached value of the '{@link #getMInputValues() <em>MInput Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList mInputValues = null;

	/**
	 * The default value of the '{@link #getValueForUI() <em>Value For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueForUI()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FOR_UI_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getValueForUI() <em>Value For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getValueForUI() <em>Value For UI</em>}' attribute.
	 * @see #getValueForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultValueForUI() {
		return VALUE_FOR_UI_EDEFAULT;
	}
	
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/** Specifies an empty list that can be reused. */
	protected static EList EMPTY_ELIST = new BasicEList(0);
	
	/** Specifies the Ecore feature that holds the actual value.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressProperty</code> in its container (and superclasses of the container). */
	protected EStructuralFeature valueEFeature;

	/** Specifies the Ecore feature that holds the historic values.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressPropertyHistoricValues</code> in its container (and superclasses of the container). */
	protected EStructuralFeature historicValuesEFeature;
	
	/** Specifies the type of the field that holds the actual value in a subclass of {@link MValue}. */
	protected Class valueClass;
	
	/** Specifies the type of the managed value. */
	protected Type valueType;
	
	/** Specifies a user-friendly representation of valid values that can be assigned to the actual value. */
	protected String[] validObjectValuesForUI;
	
	/** Specifies the value converter that derives the acutal values of this managed values from the actual values of managed input values. */
	protected MValueConverter mValueConverter;

	/** Specifies the default value for the '{@link #getName() <em>Name</em>}' attribute. */
	private String defaultName = NAME_EDEFAULT;
	
	/**
	 * Get the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * 
	 * @return Returns the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 */
	@Override
	public String getDefaultName() {
		return defaultName;
	}

	/**
	 * Sets the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * 
	 * @param defaultName Specifies the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 */
	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
		if(name == null && NAME_EDEFAULT == null || name != null && name.equals(NAME_EDEFAULT))
			name = defaultName;
	}
	/** Specifies the default value for the '{@link #getDescription() <em>Description</em>}' attribute. */
	private String defaultDescription = DESCRIPTION_EDEFAULT;
	
	/**
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * 
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 */
	@Override
	public String getDefaultDescription() {
		return defaultDescription;
	}

	/**
	 * Sets the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * 
	 * @param defaultDescription Specifies the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 */
	public void setDefaultDescription(String defaultDescription) {
		this.defaultDescription = defaultDescription;
		if(description == null && DESCRIPTION_EDEFAULT == null || description != null && description.equals(DESCRIPTION_EDEFAULT))
			description = defaultDescription;
	}
	
	/** Specifies the default value for the '{@link #isReadOnly() <em>ReadOnly</em>}' attribute. */
	private boolean defaultReadOnly = READ_ONLY_EDEFAULT;
	
	/**
	 * Get the default value of the '{@link #isReadOnly() <em>ReadOnly</em>}' attribute.
	 * 
	 * @return Returns the default value of the '{@link #isReadOnly() <em>ReadOnly</em>}' attribute.
	 * @see #isReadOnly()
	 */
	public boolean getDefaultReadOnly() {
		return defaultReadOnly;
	}

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * Sets the default value of the '{@link #isReadOnly() <em>ReadOnly</em>}' attribute.
	 * 
	 * @param defaultReadOnly Specifies the default value of the '{@link #isReadOnly() <em>ReadOnly</em>}' attribute.
	 * @see #isReadOnly()
	 */
	public void setDefaultReadOnly(boolean defaultReadOnly) {
		this.defaultReadOnly = defaultReadOnly;
		if(!readOnly)
			readOnly = defaultReadOnly;
	}

	/** Specifies the default value for the '{@link #getIconFilePath() <em>IconFilePath</em>}' attribute. */
	private File defaultIconFilePath = ICON_FILE_PATH_EDEFAULT;
	
	/**
	 * Get the default value of the '{@link #getIconFilePath() <em>IconFilePath</em>}' attribute.
	 * 
	 * @return Returns the default value of the '{@link #getIconFilePath() <em>IconFilePath</em>}' attribute.
	 * @see #getIconFilePath()
	 */
	@Override
	public File getDefaultIconFilePath() {
		return defaultIconFilePath;
	}

	/**
	 * Sets the default value of the '{@link #getIconFilePath() <em>IconFilePath</em>}' attribute.
	 * 
	 * @param defaultIconFilePath Specifies the default value of the '{@link #getIconFilePath() <em>IconFilePath</em>}' attribute.
	 * @see #getIconFilePath()
	 */
	public void setDefaultIconFilePath(File defaultIconFilePath) {
		this.defaultIconFilePath = defaultIconFilePath;
		if(iconFilePath == null && ICON_FILE_PATH_EDEFAULT == null || iconFilePath != null && iconFilePath.equals(ICON_FILE_PATH_EDEFAULT))
			iconFilePath = defaultIconFilePath;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Creates a new managed value object.
	 * <!-- end-user-doc -->
	 */
	protected MValue() {
		super();

		firstMValueConstructorHook();
		lastMValueConstructorHook();
	}

	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMValueConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMValueConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * Creates a new managed value object.
	 *
	 * @param readOnly Specifies whether the user can modify the actual value or not.
	 * @param name Specifies the name of the managed value.
	 * @param description Specifies the description of the managed value. (optional)
	 * @param iconFilePath Specifies the file path to the icon of the managed value. (optional)
	 */
	public MValue(boolean readOnly, String name, String description, File iconFilePath) {
		this();

		if(name == null) throw new IllegalArgumentException("The parameter 'name' must not be null.");
		
		this.readOnly = readOnly;
		this.name = name;
		this.description = description;
		this.iconFilePath = iconFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MVALUE;
	}

	/**
	 * Returns the value of the '<em><b>MInput Values</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MInput Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInput Values</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_MInputValues()
	 * @model type="org.onceforall.dms.desktop.logic.MValue" resolveProxies="false"
	 */
	public EList getMInputValues() {
		if (mInputValues == null) {
			mInputValues = new MInputValuesList(this);
		}
		return mInputValues;
	}

																																																																																																																																							/**
	 * Returns the value of the '<em><b>Value For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value For UI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value For UI</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_ValueForUI()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 */
	public synchronized String getValueForUI() {
		if(valueEFeature.isMany()) {
			StringBuilder result = new StringBuilder();
			Iterator iterator = ((List) getValue()).iterator();
			while(iterator.hasNext()) {
				result.append(valueType.getValueForUI(iterator.next()));
				
				if(iterator.hasNext())
					result.append(VALUE_SEPARATOR);
			}
			 
			return result.toString();
		}
		else
			return valueType.getValueForUI(getValue());
	}
    
    /**
     * Gets a user friendly representation of the actual value object. In constrast to
     * <code>getValueforUI</code>, it returns <code>null</code> if the value is <code>null</code>.
     * 
     * @return Returns a user friendly representation of the actual value object.
     * @see #getValueForUI
     */
    public synchronized String getValueForUIOrNull() {       
        return getValue() != null ? getValueForUI() : null;
    }

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MValue#getValueForUI <em>Value For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newValueForUI the new value of the '<em>Value For UI</em>' attribute.
	 * @throws ConversionException Thrown if the value cannot be converted.
	 * @see #getValueForUI()
	 */
	public synchronized void setValueForUI(String newValueForUI) throws ConversionException {
		if(valueEFeature.isMany()) {
			ArrayList newValues = new ArrayList();
			
			if(!Type.NULL_FOR_UI.equals(newValueForUI) && newValueForUI.length() > 0) {
				int startIndex  = 0;
				while(true) {
					int endIndex = newValueForUI.indexOf(VALUE_SEPARATOR, startIndex);
					String valueForUI;
					if(endIndex < startIndex)
						valueForUI = newValueForUI.substring(startIndex);
					else
						valueForUI = newValueForUI.substring(startIndex, endIndex);
					
					newValues.add(valueType.getValueFromUI(valueForUI));
					
					if(endIndex < startIndex)
						break;
					
					startIndex = endIndex+1;
				}
			}
			
			List values = (List) getValue();
			values.clear();
			values.addAll(newValues);
		}
		else
			setValue(valueType.getValueFromUI(newValueForUI));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_Value()
	 * @model transient="true" volatile="true" derived="true"
	 */
	public synchronized Object getValue() {		
		return ((InternalEObject) eContainer()).eGet(valueEFeature.getFeatureID(), false, false);
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newValue the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 */
	public synchronized void setValue(Object newValue) {
		((InternalEObject) eContainer()).eSet(valueEFeature.getFeatureID(), newValue);
	}

	/**
	 * Returns the value of the '<em><b>Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_HistoricValues()
	 * @model type="java.lang.Object" transient="true" volatile="true" derived="true" ordered="false"
	 */
	public EList getHistoricValues() {
		if(historicValuesEFeature == null)
			return EMPTY_ELIST;

		return (EList) ((InternalEObject) eContainer()).eGet(historicValuesEFeature.getFeatureID(), false, false);
	}

	/**
	 * Returns the value of the '<em><b>Historic Values For UI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historic Values For UI</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historic Values For UI</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_HistoricValuesForUI()
	 * @model type="java.lang.String" transient="true" volatile="true" derived="true"
	 */
	public EList getHistoricValuesForUI() {
		// TODO: Optimise by caching return value.
		EList historicValues = getHistoricValues();
		if(historicValues == null)
			return EMPTY_ELIST;
		
		EList result = new BasicEList(historicValues.size());
		for(int index = 0; index < historicValues.size(); ++index)
			result.add(valueType.getValueForUI(historicValues.get(index)));
		
		return result;
	}

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue_ReadOnly()
	 * @model required="true"
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MValue#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReadOnly the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MVALUE__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MVALUE__MINPUT_VALUES:
				return getMInputValues();
			case LogicPackage.MVALUE__VALUE_FOR_UI:
				return getValueForUI();
			case LogicPackage.MVALUE__VALUE:
				return getValue();
			case LogicPackage.MVALUE__HISTORIC_VALUES:
				return getHistoricValues();
			case LogicPackage.MVALUE__HISTORIC_VALUES_FOR_UI:
				return getHistoricValuesForUI();
			case LogicPackage.MVALUE__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MVALUE__MINPUT_VALUES:
				getMInputValues().clear();
				getMInputValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MVALUE__VALUE_FOR_UI:
				setValueForUI((String)newValue);
				return;
			case LogicPackage.MVALUE__VALUE:
				setValue((Object)newValue);
				return;
			case LogicPackage.MVALUE__HISTORIC_VALUES:
				getHistoricValues().clear();
				getHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MVALUE__HISTORIC_VALUES_FOR_UI:
				getHistoricValuesForUI().clear();
				getHistoricValuesForUI().addAll((Collection)newValue);
				return;
			case LogicPackage.MVALUE__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MVALUE__MINPUT_VALUES:
				getMInputValues().clear();
				return;
			case LogicPackage.MVALUE__VALUE_FOR_UI:
				setValueForUI(getDefaultValueForUI());
				return;
			case LogicPackage.MVALUE__VALUE:
				setValue(getDefaultValue());
				return;
			case LogicPackage.MVALUE__HISTORIC_VALUES:
				getHistoricValues().clear();
				return;
			case LogicPackage.MVALUE__HISTORIC_VALUES_FOR_UI:
				getHistoricValuesForUI().clear();
				return;
			case LogicPackage.MVALUE__READ_ONLY:
				setReadOnly(getDefaultReadOnly());
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicPackage.MVALUE__MINPUT_VALUES:
				return mInputValues != null && !mInputValues.isEmpty();
			case LogicPackage.MVALUE__VALUE_FOR_UI:
				return getDefaultValueForUI() == null ? getValueForUI() != null : !getDefaultValueForUI().equals(getValueForUI());
			case LogicPackage.MVALUE__VALUE:
				return getDefaultValue() == null ? getValue() != null : !getDefaultValue().equals(getValue());
			case LogicPackage.MVALUE__HISTORIC_VALUES:
				return !getHistoricValues().isEmpty();
			case LogicPackage.MVALUE__HISTORIC_VALUES_FOR_UI:
				return !getHistoricValuesForUI().isEmpty();
			case LogicPackage.MVALUE__READ_ONLY:
				return readOnly != getDefaultReadOnly();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

	/**
	 * Gets valid values that can be assigned to the actual value.
	 * Subclasses can override this method to restrict the actual values that
	 * can be assigned.
	 * 
	 * @return Returns valid values that can be assigned to the actual value.
	 * It returns <code>null</code> if all values are acceptable.
	 */
	public Object[] getValidObjectValues() {
		return valueType.getValidValues();
	}
	
	/**
	 * Gets a user-friendly representation of valid values
	 * that can be assigned to the actual value.
	 * 
	 * @return Returns a user-friendly representation of valid values
	 * that can be assigned to the actual value.
	 * It returns <code>null</code> if all values are acceptable.
	 */
	public String[] getValidObjectValuesForUI() {
		return valueType.getValidValuesForUI();
	}

	/**
	 * Gets the Ecore feature that holds the actual value.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressProperty</code> in its container (and superclasses of the container).
	 * 
	 * @return Returns the Ecore feature that holds the actual value.
	 */
	public EStructuralFeature getValueEFeature() {
		return valueEFeature;
	}

	/**
	 * Sets the Ecore feature that holds the actual value.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressProperty</code> in its container (and superclasses of the container).
	 *
	 * @param valueEFeature Specifies the Ecore feature that holds the actual value.
	 */
	public void setValueEFeature(EStructuralFeature valueEFeature) {
		if(this.valueEFeature != null && this.valueEFeature.equals(valueEFeature))
			return;

		if(this.valueEFeature != null)
			throw new IllegalArgumentException("The field 'valueEFeature' can only be set once.");
		
		this.valueEFeature = valueEFeature;
	}

	/**
	 * Gets the Ecore feature that holds the historic values.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressPropertyHistoricValues</code> in its container (and superclasses of the container). 
	 *
	 * @return Returns the EMF feature that holds the historic values in the container of this managed value. 
	 */
	public EStructuralFeature getHistoricValuesEFeature() {
		return historicValuesEFeature;
	}

	/**
	 * Sets the Ecore feature that holds the historic values.
	 * If this parameter is <code>null</code>, the managed value searches for the corresponding
	 * Ecore feature using a name derived from its own containing feature name.
	 * For example, if the containing feature name is <code>mProgressProperty</code>,
	 * it looks for an Ecore feature with the name <code>progressPropertyHistoricValues</code> in its container (and superclasses of the container). 
	 *
	 * @param historicValuesEFeature Specifies the EMF feature that holds the historic values in the container of this managed value. 
	 */
	public void setHistoricValuesEFeature(EStructuralFeature historicValuesEFeature) {
		if(this.historicValuesEFeature != null && this.historicValuesEFeature.equals(historicValuesEFeature))
			return;

		if(this.historicValuesEFeature != null)
			throw new IllegalArgumentException("The field 'historicValuesEFeature' can only be set once.");

		this.historicValuesEFeature = historicValuesEFeature;
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#getDefaultValue()
	 */
	public Object getDefaultValue() {
		return valueEFeature.getDefaultValue();
	}

	/**
	 * @see org.eclipse.emf.ecore.ETypedElement#getLowerBound()
	 */
	public int getLowerBound() {
		return valueEFeature.getLowerBound();
	}

	/**
	 * @see org.eclipse.emf.ecore.ETypedElement#getUpperBound()
	 */
	public int getUpperBound() {
		return valueEFeature.getUpperBound();
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#isChangeable()
	 */
	public boolean isChangeable() {
		return valueEFeature.isChangeable();
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#isDerived()
	 */
	public boolean isDerived() {
		return valueEFeature.isDerived();
	}

	/**
	 * @see org.eclipse.emf.ecore.ETypedElement#isRequired()
	 */
	public boolean isRequired() {
		return valueEFeature.isRequired();
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#isTransient()
	 */
	public boolean isTransient() {
		return valueEFeature.isTransient();
	}

	/**
	 * @see org.eclipse.emf.ecore.ETypedElement#isUnique()
	 */
	public boolean isUnique() {
		return valueEFeature.isUnique();
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#isUnsettable()
	 */
	public boolean isUnsettable() {
		return valueEFeature.isUnsettable();
	}

	/**
	 * @see org.eclipse.emf.ecore.EStructuralFeature#isVolatile()
	 */
	public boolean isVolatile() {
		return valueEFeature.isVolatile();
	}

	/**
	 * Gets the type of the managed value.
	 *
	 * @return Returns the type of the managed value.
	 */
	public Type getValueType() {
		return valueType;
	}

	/**
	 * Sets the type of the managed value.
	 *
	 * @param valueType Specifies the type of the managed value.
	 */
	public void setValueType(Type valueType) {
		if(this.valueType != null && this.valueType.equals(valueType))
			return;
			
		if(this.valueType != null)
			throw new IllegalArgumentException("The field 'valueType' can only be set once.");
			
		this.valueType = valueType;
	}
	
	/**
	 * Adds the current value as an historic value if the managed value supports historic values.
	 */
	protected void addHistoricValue() {
		if(historicValuesEFeature != null) {
			EList historicValues = getHistoricValues();
			
			Object value = getValue();
			if(value != null) {
				if(!historicValues.contains(value)) {
					if(historicValues.size() >= historicValuesEFeature.getUpperBound()-historicValuesEFeature.getLowerBound())
						historicValues.remove(value);	
				}
				
				int valueIndex = historicValues.indexOf(value);
				if(valueIndex >= 0)
					historicValues.move(valueIndex, 0);
				else
					historicValues.add(0, value);
			}
		}		
	}
    
    /**
     * Tests whether the given value is not <code>null</null> if the managed values in not optional.
     *
     * @param value Holds the value to be tested.
     * @exception IllegalArgumentException Thrown is the value fails the test.
     */
    protected void validateOptionality(Object value) {
        if(valueEFeature.getLowerBound() == 1 && value == null)
            throw new IllegalArgumentException(getTypeNameForUI()+" '"+name+"' cannot be assigned an empty value.");  
    }
    
    /**
     * Tests whether the actual value of the managed value conforms to the constraints that were not enforced when
     * the value was set.
     * 
     * @exception IllegalArgumentException Thrown if the value does not conform to the constraints that were not enforced when
     * the value was set.
     */
    public void validate() {
    	Object value = getValue();
        validateOptionality(value);
        
        /*LogicValidator validator = LogicValidator.INSTANCE;
    	
    	BasicDiagnostic diagnosticChain = new BasicDiagnostic();
    	validator.validateMValue(this, diagnosticChain, ((MObject) eContainer()).validatorContext);
    	if(diagnosticChain.getSeverity() > Diagnostic.OK)
    		throw new DesktopException(((BasicDiagnostic) diagnosticChain.getChildren().get(0)).getMessage(), "Please correct your input.", DesktopException.ERROR_SEVERITY, null);*/

        if(valueEFeature.isMany()) {
        	List values = (List) value;
        	if(values.size() < valueEFeature.getLowerBound() || values.size() > valueEFeature.getUpperBound() && valueEFeature.getUpperBound() >= 0 )
                throw new IllegalArgumentException("The "+getTypeNameForUI()+" '"+getNameForUI()+"' must have between "+valueEFeature.getLowerBound()+" and "+valueEFeature.getUpperBound()+" values.");
        	
        	for(Object currentValue: values)
        		valueType.validate(currentValue);
        }
        else
        	valueType.validate(value);
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public synchronized void processNotification(Notification notification) {				
		if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MValue 
				&& mInputValues != null && mInputValues.contains(notification.getNotifier()) 
				&& ((EStructuralFeature) notification.getFeature()).getName().equals("value"))
			setValueFromMValue((MValue) notification.getNotifier());

		if(notification.getFeature() != null && notification.getFeature().equals(valueEFeature))
			eNotify(new ENotificationImpl(this, notification.getEventType(), LogicPackage.MVALUE__VALUE, notification.getOldValue(), notification.getNewValue()));
		
		if(notification.getFeature() != null && notification.getFeature().equals(historicValuesEFeature))
			eNotify(new ENotificationImpl(this, notification.getEventType(), LogicPackage.MVALUE__HISTORIC_VALUES, notification.getOldValue(), notification.getNewValue()));
	}
	
	/**
	 * Sets the actual value of this managed value to the actual value of the given managed value.
	 * If this managed value defines a value converter, the value converter is used to transform the actual value before it is assigned to this managed value.
	 * 
	 * @param mValue Specifies the managed value that holds the new actual value.
	 */
	protected void setValueFromMValue(MValue mValue) {
		if(eContainer() == null)
			return;
		
		try {
			// Converts the managed value.
			Object value;
			if(mValueConverter == null)
				value = ((MObject) eContainer()).convertMInputValues(this);
			else
				value = mValueConverter.convertValueFromMInputValues();
			
			
			// Updates the actual value depending on whether it is a list or not.
			if(valueEFeature.isMany()) {
				List values = (List) getValue();
				values.clear();
				if(value instanceof List)
					values.addAll((List) value);
				else
					values.add(value);
			}
			else
				setValue(value);
		}
		catch(ClassCastException exception) {
		}
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#eInverseAdd(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		NotificationChain result =  super.eInverseAdd(otherEnd, featureID, baseClass, msgs);
		
		// Gets the EMF attributes that store the actual value and the historic actual values
		// from the owner of this managed value.
		String valueAttributeName = eContainingFeature().getName().substring(1).toLowerCase();
		if(valueEFeature == null)
			valueEFeature = getEFeatureForName(valueAttributeName);
			
		((MObject) eContainer()).mValuesByValueEFeature.put(valueEFeature, this);	
		
		String historicValueAttributeName = valueAttributeName+"HistoricValues";
		if(historicValuesEFeature == null)
			historicValuesEFeature = getEFeatureForName(historicValueAttributeName);
		
		((MObject) eContainer()).mValuesByHistoricValuesEFeature.put(historicValuesEFeature, this);	

		// Updates the acutal value of this managed value depending on its input values.
		if(mInputValues != null)
			for(MValue mValue: (List<MValue>) mInputValues)
				setValueFromMValue(mValue);

		((MObject) eContainer()).eAdapters().add(this);
				
		assert valueEFeature != null : "Non-abstract managed objects that own this managed value must have an EMF attribute called '"+valueAttributeName+"'.";
		assert historicValuesEFeature == null || historicValuesEFeature != null && historicValuesEFeature.isMany() :
			"If a non-abstract managed object that owns this managed value has an EMF attribute called '"+historicValueAttributeName+"' then the 'Many' feature of '"+historicValueAttributeName+"' must be 'true'.";
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#eInverseRemove(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		eContainer().eAdapters().remove(this);
		
		valueEFeature = null;
		historicValuesEFeature = null;
		
		return super.eInverseRemove(otherEnd, featureID, baseClass, msgs);
	}

	/**
	 * Gets the value converter that derives the acutal values of this managed values from the actual values of managed input values.
	 *
	 * @return Returns the value converter that derives the acutal values of this managed values from the actual values of managed input values.
	 */
	public MValueConverter getMValueConverter() {
		return mValueConverter;
	}

	/**
	 * Sets the value converter that derives the acutal values of this managed values from the actual values of managed input values.
	 *
	 * @param valueConverter Specifies the value converter that derives the acutal values of this managed values from the actual values of managed input values.
	 */
	public void setMValueConverter(MValueConverter valueConverter) {
		mValueConverter = valueConverter;
	}
	
	/**
     * Gets the user-friendly representation of the managed input value for the given feature identifier.
     *
     * @param mValueFeatureID Holds the feature identifier of the <b>managed</b> input value.
     * @return Returns the user-friendly representation of the managed input value for the given feature identifier.
	 */
    public String getMInputValueForUI(int mValueFeatureID) {
		MValue mValue = getMInputValue(mValueFeatureID);
		
		if(mValue == null)
			return null;
		
		return mValue.getValueForUI();
     }
    
    
    /**
     * Gets the user-friendly representation of the managed input value for the given feature identifiers or <code>null</code>
     * if the input value is <code>null</null>. The input feature identifiers are considered in the order of the method parameters.
     *
     * @param mValueFeatureID1 Holds the first feature identifier of the <b>managed</b> input value.
     * @param mValueFeatureID2 Holds the second feature identifier of the <b>managed</b> input value.
     * @return Returns the user-friendly representation of the managed input values for the given feature identifier or <code>null</code>
     * if the input values are <code>null</null>.
     */
    protected String getMInputValueForUI(int mValueFeatureID1, int mValueFeatureID2) {
		MValue mValue = getMInputValue(mValueFeatureID1, mValueFeatureID2);
		
		if(mValue == null)
			return null;
		
		return mValue.getValueForUI();
    }
    
	
	/**
     * Gets the user-friendly representation of the managed input value for the given feature identifier or <code>null</code>
     * if the input value is <code>null</null>.
     *
     * @param mValueFeatureID Holds the feature identifier of the <b>managed</b> input value.
     * @return Returns the user-friendly representation of the managed input value for the given feature identifier or <code>null</code>
     * if the input value is <code>null</null>.
	 */
    public String getMInputValueForUIOrNull(int mValueFeatureID) {
		MValue mValue = getMInputValue(mValueFeatureID);
		
		if(mValue == null || mValue.getValue() == null)
			return null;
		
		return mValue.getValueForUI();
     }
    
    
    /**
     * Gets the user-friendly representation of the managed input value for the given feature identifiers or <code>null</code>
     * if the input value is <code>null</null>. The input feature identifiers are considered in the order of the method parameters.
     *
     * @param mValueFeatureID1 Holds the first feature identifier of the <b>managed</b> input value.
     * @param mValueFeatureID2 Holds the second feature identifier of the <b>managed</b> input value.
     * @return Returns the user-friendly representation of the managed input values for the given feature identifier or <code>null</code>
     * if the input values are <code>null</null>.
     */
    protected String getMInputValueForUIOrNull(int mValueFeatureID1, int mValueFeatureID2) {
		MValue mValue = getMInputValue(mValueFeatureID1, mValueFeatureID2);
		
		if(mValue == null || mValue.getValue() == null)
			return null;
		
		return mValue.getValueForUI();
    }
    
    /**
     * Gets the managed input value with given feature ID.
     * This method is intended as a helper for classes that extend this class.
     *
     * @param mValueFeatureID Holds feature identifier of the <b>managed</b> input value.
     * @return Returns the managed input value with given feature ID if it exists. Otherwise it returns <code>null</code>.
     */
    protected MValue getMInputValue(int mValueFeatureID) {
    	assert mValueFeatureID >= 0: "The parameter 'mValueFeatureID' must be a positive number.";

    	for(MValue mValue: (List<MValue>) getMInputValues())
    		if(mValue.eContainingFeatureID() == mValueFeatureID)
    			return mValue;
    	
    	return null;
    }
    
    /**
     * Gets the managed input value with given feature ID.
     * This method is intended as a helper for classes that extend this class.
     * The input value feature IDs are considered in the order of the method parameters.
     *
     * @param mValueFeatureID1 Holds the name of the first input value.
     * @param mValueFeatureID2 Holds the name of the second input value.
     * @return Returns tthe managed input value with given feature ID if it exists. Otherwise it returns <code>null</code>.
     */
    protected MValue getMInputValue(int mValueFeatureID1, int mValueFeatureID2) {
    	MValue result = getMInputValue(mValueFeatureID1);
    	if(result != null)
    		return result;
    	
    	return getMInputValue(mValueFeatureID2);
    }

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification) {
		super.eNotify(notification);
		
		if(notification.getEventType() == Notification.ADD && notification.getFeature() == eClass().getEStructuralFeature(LogicPackage.MVALUE__MINPUT_VALUES) 
				&& notification.getNewValue() != null) {
			((MValue) notification.getNewValue()).eAdapters().add(this);
			setValueFromMValue((MValue) notification.getNewValue());
		}
		
		if(notification.getEventType() == Notification.REMOVE && notification.getFeature() == eClass().getEStructuralFeature(LogicPackage.MVALUE__MINPUT_VALUES) 
				&& notification.getNewValue() != null)
			((MValue) notification.getOldValue()).eAdapters().remove(this);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		MValue result = (MValue) super.clone();
		
		/** TODO: Implement copying so that input values of copy refer to copied values.
		if(mInputValues != null)
			result.mInputValues = (MInputValuesList) ((MInputValuesList) mInputValues).clone();
		*/
		
		return result;
	}
    
	
} // MValue