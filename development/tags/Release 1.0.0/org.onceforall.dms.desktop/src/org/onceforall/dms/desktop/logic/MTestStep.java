
/**
 * <copyright>
 * </copyright>
 *
 * $Id: MTestStep.java,v 1.1 2007/05/12 10:56:30 marc Exp $
 */
package org.onceforall.dms.desktop.logic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTest Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTestStep#getMPersistentStringParameter <em>MPersistent String Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTestStep#getPersistentStringParameter <em>Persistent String Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTestStep#getMStringParameter <em>MString Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTestStep#getStringParameter <em>String Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Test' description='Serves as test step for automatic tests.' actionName='Test' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MTestStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MTestStep.class.getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MTestStep.TYPE_NAME, new ReferenceType("Reference to "+MTestStep.TYPE_NAME, "Specifies a reference to a "+MTestStep.TYPE_NAME_FOR_UI, MTestStep.class));
	}
	/**
	 * The cached value of the '{@link #getMPersistentStringParameter() <em>MPersistent String Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPersistentStringParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPersistentStringParameter = null;

	/**
	 * The default value of the '{@link #getPersistentStringParameter() <em>Persistent String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentStringParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENT_STRING_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPersistentStringParameter() <em>Persistent String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPersistentStringParameter() <em>Persistent String Parameter</em>}' attribute.
	 * @see #getPersistentStringParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPersistentStringParameter() {
		return PERSISTENT_STRING_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPersistentStringParameter() <em>Persistent String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentStringParameter()
	 * @generated
	 * @ordered
	 */
	protected String persistentStringParameter = PERSISTENT_STRING_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMStringParameter() <em>MString Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStringParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mStringParameter = null;

	/**
	 * The default value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
	 * @see #getStringParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultStringParameter() {
		return STRING_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getStringParameter() <em>String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringParameter()
	 * @generated
	 * @ordered
	 */
	protected String stringParameter = STRING_PARAMETER_EDEFAULT;


	/**
	 * Get the default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultInterruptable() {
		return false;
	}

	/**
	 * Get the default value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * @see #isTerminatable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultTerminatable() {
		return false;
	}

	/**
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescription() {
		return "Serves as test step for automatic tests.";
	}

	/**
	 * Get the default value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * @see #isStoppable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultStoppable() {
		return false;
	}

	/**
	 * Get the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultActionName() {
		return "Test";
	}

	/**
	 * Get the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultName() {
		return "Test";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTestStep() {
		super();
		
		firstMTestStepConstructorHook();
				
		interruptable = false;
		terminatable = false;
		description = "Serves as test step for automatic tests.";
		stoppable = false;
		actionName = "Test";
		name = "Test";
					 
		setMPersistentStringParameter(new MParameter(false, "Persistent string", "Specifies a string that is saved with the application data.", null));			 
		setMStringParameter(new MParameter(false, "String", "Specifies a string that is not saved with the application data.", null));

		lastMTestStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMTestStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMTestStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MTEST_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MPersistent String Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPersistent String Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPersistent String Parameter</em>' containment reference.
	 * @see #setMPersistentStringParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep_MPersistentStringParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Persistent string' description='Specifies a string that is saved with the application data.'"
	 * @generated
	 */
	public MParameter getMPersistentStringParameter() {
		return mPersistentStringParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPersistentStringParameter(MParameter newMPersistentStringParameter, NotificationChain msgs) {
		MParameter oldMPersistentStringParameter = mPersistentStringParameter;
		mPersistentStringParameter = newMPersistentStringParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER, oldMPersistentStringParameter, newMPersistentStringParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTestStep#getMPersistentStringParameter <em>MPersistent String Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPersistentStringParameter the new value of the '<em>MPersistent String Parameter</em>' containment reference.
	 * @see #getMPersistentStringParameter()
	 * @generated
	 */
	public void setMPersistentStringParameter(MParameter newMPersistentStringParameter) {
		if (newMPersistentStringParameter != mPersistentStringParameter) {
			NotificationChain msgs = null;
			if (mPersistentStringParameter != null)
				msgs = ((InternalEObject)mPersistentStringParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER, null, msgs);
			if (newMPersistentStringParameter != null) {				
				newMPersistentStringParameter.setDefaultDescription("Specifies a string that is saved with the application data.");
				newMPersistentStringParameter.setDefaultName("Persistent string");
				newMPersistentStringParameter.setValueType(Type.getTypeForName("Text"));
				newMPersistentStringParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER));
				newMPersistentStringParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPersistentStringParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPersistentStringParameter != null) {
				if(newMPersistentStringParameter != null)
					newMPersistentStringParameter.eAdapters().addAll(mPersistentStringParameter.eAdapters());			
			
				mPersistentStringParameter.eAdapters().clear();
			}
			msgs = basicSetMPersistentStringParameter(newMPersistentStringParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER, newMPersistentStringParameter, newMPersistentStringParameter));
	}

	/**
	 * Returns the value of the '<em><b>Persistent String Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent String Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent String Parameter</em>' attribute.
	 * @see #setPersistentStringParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep_PersistentStringParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getPersistentStringParameter() {
		return persistentStringParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTestStep#getPersistentStringParameter <em>Persistent String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPersistentStringParameter the new value of the '<em>Persistent String Parameter</em>' attribute.
	 * @see #getPersistentStringParameter()
	 * @generated
	 */
	public void setPersistentStringParameter(String newPersistentStringParameter) {
		String oldPersistentStringParameter = persistentStringParameter;
		persistentStringParameter = newPersistentStringParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER, oldPersistentStringParameter, persistentStringParameter));
	}

	/**
	 * Returns the value of the '<em><b>MString Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MString Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MString Parameter</em>' containment reference.
	 * @see #setMStringParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep_MStringParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='String' description='Specifies a string that is not saved with the application data.'"
	 * @generated
	 */
	public MParameter getMStringParameter() {
		return mStringParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStringParameter(MParameter newMStringParameter, NotificationChain msgs) {
		MParameter oldMStringParameter = mStringParameter;
		mStringParameter = newMStringParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__MSTRING_PARAMETER, oldMStringParameter, newMStringParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTestStep#getMStringParameter <em>MString Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMStringParameter the new value of the '<em>MString Parameter</em>' containment reference.
	 * @see #getMStringParameter()
	 * @generated
	 */
	public void setMStringParameter(MParameter newMStringParameter) {
		if (newMStringParameter != mStringParameter) {
			NotificationChain msgs = null;
			if (mStringParameter != null)
				msgs = ((InternalEObject)mStringParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTEST_STEP__MSTRING_PARAMETER, null, msgs);
			if (newMStringParameter != null) {				
				newMStringParameter.setDefaultDescription("Specifies a string that is not saved with the application data.");
				newMStringParameter.setDefaultName("String");
				newMStringParameter.setValueType(Type.getTypeForName("Text"));
				newMStringParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTEST_STEP__STRING_PARAMETER));
				newMStringParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMStringParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTEST_STEP__MSTRING_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mStringParameter != null) {
				if(newMStringParameter != null)
					newMStringParameter.eAdapters().addAll(mStringParameter.eAdapters());			
			
				mStringParameter.eAdapters().clear();
			}
			msgs = basicSetMStringParameter(newMStringParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__MSTRING_PARAMETER, newMStringParameter, newMStringParameter));
	}

	/**
	 * Returns the value of the '<em><b>String Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Parameter</em>' attribute.
	 * @see #setStringParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep_StringParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getStringParameter() {
		return stringParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTestStep#getStringParameter <em>String Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newStringParameter the new value of the '<em>String Parameter</em>' attribute.
	 * @see #getStringParameter()
	 * @generated
	 */
	public void setStringParameter(String newStringParameter) {
		String oldStringParameter = stringParameter;
		stringParameter = newStringParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTEST_STEP__STRING_PARAMETER, oldStringParameter, stringParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER:
				return basicSetMPersistentStringParameter(null, msgs);
			case LogicPackage.MTEST_STEP__MSTRING_PARAMETER:
				return basicSetMStringParameter(null, msgs);
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
			case LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER:
				return getMPersistentStringParameter();
			case LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER:
				return getPersistentStringParameter();
			case LogicPackage.MTEST_STEP__MSTRING_PARAMETER:
				return getMStringParameter();
			case LogicPackage.MTEST_STEP__STRING_PARAMETER:
				return getStringParameter();
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
			case LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER:    
				setMPersistentStringParameter((MParameter)newValue);
				return;
			case LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER:    
				setPersistentStringParameter((String)newValue);
				return;
			case LogicPackage.MTEST_STEP__MSTRING_PARAMETER:    
				setMStringParameter((MParameter)newValue);
				return;
			case LogicPackage.MTEST_STEP__STRING_PARAMETER:    
				setStringParameter((String)newValue);
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
			case LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER:
				setMPersistentStringParameter((MParameter)null);
				return;
			case LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER:
				setPersistentStringParameter(getDefaultPersistentStringParameter());
				return;
			case LogicPackage.MTEST_STEP__MSTRING_PARAMETER:
				setMStringParameter((MParameter)null);
				return;
			case LogicPackage.MTEST_STEP__STRING_PARAMETER:
				setStringParameter(getDefaultStringParameter());
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
			case LogicPackage.MTEST_STEP__MPERSISTENT_STRING_PARAMETER:
				return mPersistentStringParameter != null;
			case LogicPackage.MTEST_STEP__PERSISTENT_STRING_PARAMETER:
				return getDefaultPersistentStringParameter() == null ? persistentStringParameter != null : !getDefaultPersistentStringParameter().equals(persistentStringParameter);
			case LogicPackage.MTEST_STEP__MSTRING_PARAMETER:
				return mStringParameter != null;
			case LogicPackage.MTEST_STEP__STRING_PARAMETER:
				return getDefaultStringParameter() == null ? stringParameter != null : !getDefaultStringParameter().equals(stringParameter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (persistentStringParameter: ");
		result.append(persistentStringParameter);
		result.append(", stringParameter: ");
		result.append(stringParameter);
		result.append(')');
		return result.toString();
	}

} // MTestStep