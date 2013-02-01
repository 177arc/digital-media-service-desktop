/**
 * <copyright>
 * </copyright>
 *
 * $Id: MValueType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MValue Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getDefaultReadOnly <em>Default Read Only</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getTransient <em>Transient</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getHistoricValuesUpperBound <em>Historic Values Upper Bound</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getValueEFeatureName <em>Value EFeature Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#getHistoricValuesEFeatureName <em>Historic Values EFeature Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#isGenerateValueFeature <em>Generate Value Feature</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.MValueType#isGenerateMValueReference <em>Generate MValue Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class MValueType extends MElementType implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The default value of the '{@link #getDefaultReadOnly() <em>Default Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEFAULT_READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultReadOnly() <em>Default Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean defaultReadOnly = DEFAULT_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected MValueDataTypeType valueType = null;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = null;

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
	protected static final Integer UPPER_BOUND_EDEFAULT = null;

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
	protected static final Boolean DERIVED_EDEFAULT = Boolean.FALSE;

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
	 * The default value of the '{@link #getHistoricValuesUpperBound() <em>Historic Values Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoricValuesUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HISTORIC_VALUES_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHistoricValuesUpperBound() <em>Historic Values Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoricValuesUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer historicValuesUpperBound = HISTORIC_VALUES_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueEFeatureName() <em>Value EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueEFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EFEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueEFeatureName() <em>Value EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueEFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String valueEFeatureName = VALUE_EFEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHistoricValuesEFeatureName() <em>Historic Values EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoricValuesEFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String HISTORIC_VALUES_EFEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHistoricValuesEFeatureName() <em>Historic Values EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoricValuesEFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String historicValuesEFeatureName = HISTORIC_VALUES_EFEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateValueFeature() <em>Generate Value Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateValueFeature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_VALUE_FEATURE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateValueFeature() <em>Generate Value Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateValueFeature()
	 * @generated
	 * @ordered
	 */
	protected boolean generateValueFeature = GENERATE_VALUE_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateMValueReference() <em>Generate MValue Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateMValueReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_MVALUE_REFERENCE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateMValueReference() <em>Generate MValue Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateMValueReference()
	 * @generated
	 * @ordered
	 */
	protected boolean generateMValueReference = GENERATE_MVALUE_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MValueType() {
		super();

		// Sets the default values.
		setTransient(false);
		setDerived(false);
		setVolatile(false);
		setLowerBound(0);
		setUpperBound(1);
		setHistoricValuesUpperBound(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MVALUE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Default Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Read Only</em>' attribute.
	 * @see #setDefaultReadOnly(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_DefaultReadOnly()
	 * @model
	 * @generated
	 */
	public Boolean getDefaultReadOnly() {
		return defaultReadOnly;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getDefaultReadOnly <em>Default Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Read Only</em>' attribute.
	 * @see #getDefaultReadOnly()
	 * @generated
	 */
	public void setDefaultReadOnly(Boolean newDefaultReadOnly) {
		Boolean oldDefaultReadOnly = defaultReadOnly;
		defaultReadOnly = newDefaultReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY,
					oldDefaultReadOnly, defaultReadOnly));
	}

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_DefaultValue()
	 * @model
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(MValueDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_ValueType()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	public MValueDataTypeType getValueType() {
		return valueType;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	public void setValueType(MValueDataTypeType newValueType) {
		MValueDataTypeType oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE, oldValueType,
					valueType));
	}

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getLowerBound <em>Lower Bound</em>}' attribute.
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
					MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND,
					oldLowerBound, lowerBound));
	}

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getUpperBound <em>Upper Bound</em>}' attribute.
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
					MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND,
					oldUpperBound, upperBound));
	}

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(Boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_Derived()
	 * @model default="false" required="true"
	 * @generated
	 */
	public Boolean getDerived() {
		return derived;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getDerived <em>Derived</em>}' attribute.
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
					MetaModellerPackage.MVALUE_TYPE__DERIVED, oldDerived,
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
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_Transient()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getTransient() {
		return transient_;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getTransient <em>Transient</em>}' attribute.
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
					MetaModellerPackage.MVALUE_TYPE__TRANSIENT, oldTransient,
					transient_));
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
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_Volatile()
	 * @model required="true"
	 * @generated
	 */
	public Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getVolatile <em>Volatile</em>}' attribute.
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
					MetaModellerPackage.MVALUE_TYPE__VOLATILE, oldVolatile,
					volatile_));
	}

	/**
	 * Returns the value of the '<em><b>Historic Values Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historic Values Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historic Values Upper Bound</em>' attribute.
	 * @see #setHistoricValuesUpperBound(Integer)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_HistoricValuesUpperBound()
	 * @model required="true"
	 * @generated
	 */
	public Integer getHistoricValuesUpperBound() {
		return historicValuesUpperBound;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getHistoricValuesUpperBound <em>Historic Values Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historic Values Upper Bound</em>' attribute.
	 * @see #getHistoricValuesUpperBound()
	 * @generated
	 */
	public void setHistoricValuesUpperBound(Integer newHistoricValuesUpperBound) {
		Integer oldHistoricValuesUpperBound = historicValuesUpperBound;
		historicValuesUpperBound = newHistoricValuesUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND,
					oldHistoricValuesUpperBound, historicValuesUpperBound));
	}

	/**
	 * Returns the value of the '<em><b>Value EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value EFeature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value EFeature Name</em>' attribute.
	 * @see #setValueEFeatureName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_ValueEFeatureName()
	 * @model
	 * @generated
	 */
	public String getValueEFeatureName() {
		return valueEFeatureName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getValueEFeatureName <em>Value EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value EFeature Name</em>' attribute.
	 * @see #getValueEFeatureName()
	 * @generated
	 */
	public void setValueEFeatureName(String newValueEFeatureName) {
		String oldValueEFeatureName = valueEFeatureName;
		valueEFeatureName = newValueEFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME,
					oldValueEFeatureName, valueEFeatureName));
	}

	/**
	 * Returns the value of the '<em><b>Historic Values EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historic Values EFeature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historic Values EFeature Name</em>' attribute.
	 * @see #setHistoricValuesEFeatureName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_HistoricValuesEFeatureName()
	 * @model
	 * @generated
	 */
	public String getHistoricValuesEFeatureName() {
		return historicValuesEFeatureName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#getHistoricValuesEFeatureName <em>Historic Values EFeature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historic Values EFeature Name</em>' attribute.
	 * @see #getHistoricValuesEFeatureName()
	 * @generated
	 */
	public void setHistoricValuesEFeatureName(
			String newHistoricValuesEFeatureName) {
		String oldHistoricValuesEFeatureName = historicValuesEFeatureName;
		historicValuesEFeatureName = newHistoricValuesEFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME,
					oldHistoricValuesEFeatureName, historicValuesEFeatureName));
	}

	/**
	 * Returns the value of the '<em><b>Generate Value Feature</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Value Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Value Feature</em>' attribute.
	 * @see #setGenerateValueFeature(boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_GenerateValueFeature()
	 * @model default="true" required="true"
	 * @generated
	 */
	public boolean isGenerateValueFeature() {
		return generateValueFeature;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#isGenerateValueFeature <em>Generate Value Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Value Feature</em>' attribute.
	 * @see #isGenerateValueFeature()
	 * @generated
	 */
	public void setGenerateValueFeature(boolean newGenerateValueFeature) {
		boolean oldGenerateValueFeature = generateValueFeature;
		generateValueFeature = newGenerateValueFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE,
					oldGenerateValueFeature, generateValueFeature));
	}

	/**
	 * Returns the value of the '<em><b>Generate MValue Reference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate MValue Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate MValue Reference</em>' attribute.
	 * @see #setGenerateMValueReference(boolean)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType_GenerateMValueReference()
	 * @model default="true" required="true"
	 * @generated
	 */
	public boolean isGenerateMValueReference() {
		return generateMValueReference;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.MValueType#isGenerateMValueReference <em>Generate MValue Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate MValue Reference</em>' attribute.
	 * @see #isGenerateMValueReference()
	 * @generated
	 */
	public void setGenerateMValueReference(boolean newGenerateMValueReference) {
		boolean oldGenerateMValueReference = generateMValueReference;
		generateMValueReference = newGenerateMValueReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE,
					oldGenerateMValueReference, generateMValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY:
			return getDefaultReadOnly();
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE:
			return getDefaultValue();
		case MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE:
			return getValueType();
		case MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND:
			return getLowerBound();
		case MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND:
			return getUpperBound();
		case MetaModellerPackage.MVALUE_TYPE__DERIVED:
			return getDerived();
		case MetaModellerPackage.MVALUE_TYPE__TRANSIENT:
			return getTransient();
		case MetaModellerPackage.MVALUE_TYPE__VOLATILE:
			return getVolatile();
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND:
			return getHistoricValuesUpperBound();
		case MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME:
			return getValueEFeatureName();
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME:
			return getHistoricValuesEFeatureName();
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE:
			return isGenerateValueFeature() ? Boolean.TRUE : Boolean.FALSE;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE:
			return isGenerateMValueReference() ? Boolean.TRUE : Boolean.FALSE;
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
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY:
			setDefaultReadOnly((Boolean) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE:
			setValueType((MValueDataTypeType) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND:
			setLowerBound((Integer) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND:
			setUpperBound((Integer) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__DERIVED:
			setDerived((Boolean) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__TRANSIENT:
			setTransient((Boolean) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VOLATILE:
			setVolatile((Boolean) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND:
			setHistoricValuesUpperBound((Integer) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME:
			setValueEFeatureName((String) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME:
			setHistoricValuesEFeatureName((String) newValue);
			return;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE:
			setGenerateValueFeature(((Boolean) newValue).booleanValue());
			return;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE:
			setGenerateMValueReference(((Boolean) newValue).booleanValue());
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
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY:
			setDefaultReadOnly(DEFAULT_READ_ONLY_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE:
			setValueType((MValueDataTypeType) null);
			return;
		case MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__DERIVED:
			setDerived(DERIVED_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__TRANSIENT:
			setTransient(TRANSIENT_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VOLATILE:
			setVolatile(VOLATILE_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND:
			setHistoricValuesUpperBound(HISTORIC_VALUES_UPPER_BOUND_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME:
			setValueEFeatureName(VALUE_EFEATURE_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME:
			setHistoricValuesEFeatureName(HISTORIC_VALUES_EFEATURE_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE:
			setGenerateValueFeature(GENERATE_VALUE_FEATURE_EDEFAULT);
			return;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE:
			setGenerateMValueReference(GENERATE_MVALUE_REFERENCE_EDEFAULT);
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
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY:
			return DEFAULT_READ_ONLY_EDEFAULT == null ? defaultReadOnly != null
					: !DEFAULT_READ_ONLY_EDEFAULT.equals(defaultReadOnly);
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
					: !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE:
			return valueType != null;
		case MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND:
			return LOWER_BOUND_EDEFAULT == null ? lowerBound != null
					: !LOWER_BOUND_EDEFAULT.equals(lowerBound);
		case MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND:
			return UPPER_BOUND_EDEFAULT == null ? upperBound != null
					: !UPPER_BOUND_EDEFAULT.equals(upperBound);
		case MetaModellerPackage.MVALUE_TYPE__DERIVED:
			return DERIVED_EDEFAULT == null ? derived != null
					: !DERIVED_EDEFAULT.equals(derived);
		case MetaModellerPackage.MVALUE_TYPE__TRANSIENT:
			return TRANSIENT_EDEFAULT == null ? transient_ != null
					: !TRANSIENT_EDEFAULT.equals(transient_);
		case MetaModellerPackage.MVALUE_TYPE__VOLATILE:
			return VOLATILE_EDEFAULT == null ? volatile_ != null
					: !VOLATILE_EDEFAULT.equals(volatile_);
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND:
			return HISTORIC_VALUES_UPPER_BOUND_EDEFAULT == null ? historicValuesUpperBound != null
					: !HISTORIC_VALUES_UPPER_BOUND_EDEFAULT
							.equals(historicValuesUpperBound);
		case MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME:
			return VALUE_EFEATURE_NAME_EDEFAULT == null ? valueEFeatureName != null
					: !VALUE_EFEATURE_NAME_EDEFAULT.equals(valueEFeatureName);
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME:
			return HISTORIC_VALUES_EFEATURE_NAME_EDEFAULT == null ? historicValuesEFeatureName != null
					: !HISTORIC_VALUES_EFEATURE_NAME_EDEFAULT
							.equals(historicValuesEFeatureName);
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE:
			return generateValueFeature != GENERATE_VALUE_FEATURE_EDEFAULT;
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE:
			return generateMValueReference != GENERATE_MVALUE_REFERENCE_EDEFAULT;
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
		result.append(" (defaultReadOnly: ");
		result.append(defaultReadOnly);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", derived: ");
		result.append(derived);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", historicValuesUpperBound: ");
		result.append(historicValuesUpperBound);
		result.append(", valueEFeatureName: ");
		result.append(valueEFeatureName);
		result.append(", historicValuesEFeatureName: ");
		result.append(historicValuesEFeatureName);
		result.append(", generateValueFeature: ");
		result.append(generateValueFeature);
		result.append(", generateMValueReference: ");
		result.append(generateMValueReference);
		result.append(')');
		return result.toString();
	}

	/**
	 * Gets the name of the actual value attribute. If the <code>valueEAttributeName</code> feature is set,
	 * its value is returned. 
	 * 
	 * @return Returns the name of the actual value attribute.
	 */
	public String getFeatureName() {
		if (getValueEFeatureName() != null
				&& getValueEFeatureName().length() > 0)
			return getValueEFeatureName();

		String referenceName = getReferenceName();
		if (referenceName == null || referenceName.length() <= 2)
			return referenceName;

		return referenceName.substring(1, 2).toLowerCase()
				+ referenceName.substring(2);
	}

	/**
	 * Gets the name of the actual historic values attribute. It derives the name
	 * from the name of the actual value attribute by adding <code>HistoricValues</code>.
	 * If the <code>historicValueEAttributeName</code> feature is set,
	 * its value is returned instead.
	 * 
	 * @return Returns the name of the actual historic values attribute.
	 */
	public String getHistoricFeatureName() {
		if (getHistoricValuesEFeatureName() != null)
			return getHistoricValuesEFeatureName();

		String valueName = getFeatureName();
		if (valueName == null)
			return valueName;

		return valueName + "HistoricValues";
	}
} // MValueType