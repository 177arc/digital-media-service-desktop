/*
 * Revision History:
 * $Log: MStatefulObject.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:26  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MStateful Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMStateProperty <em>MState Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMLastStateChangeProperty <em>MLast State Change Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStatefulObject#getLastStateChangeProperty <em>Last State Change Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class MStatefulObject extends MObject {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MStatefulObject.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MStatefulObject.TYPE_NAME, new ReferenceType("Reference to "+MStatefulObject.TYPE_NAME, "Specifies a reference to a "+MStatefulObject.TYPE_NAME_FOR_UI, MStatefulObject.class));
	}












































































































































	
	/**
	 * The cached value of the '{@link #getMStateProperty() <em>MState Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStateProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mStateProperty = null;

	/**
	 * The default value of the '{@link #getStateProperty() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMLastStateChangeProperty() <em>MLast State Change Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLastStateChangeProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLastStateChangeProperty = null;

	/**
	 * The default value of the '{@link #getLastStateChangeProperty() <em>Last State Change Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStateChangeProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STATE_CHANGE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLastStateChangeProperty() <em>Last State Change Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLastStateChangeProperty() <em>Last State Change Property</em>}' attribute.
	 * @see #getLastStateChangeProperty()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultLastStateChangeProperty() {
		return LAST_STATE_CHANGE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLastStateChangeProperty() <em>Last State Change Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStateChangeProperty()
	 * @generated
	 * @ordered
	 */
	protected Date lastStateChangeProperty = LAST_STATE_CHANGE_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MStatefulObject() {
		super();
		
		firstMStatefulObjectConstructorHook();
				
					 
		setMLastStateChangeProperty(new MProperty(true, "Last state change", "Specifies the date and time of the last state change.", null));

		lastMStatefulObjectConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMStatefulObjectConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 */
	private void lastMStatefulObjectConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MSTATEFUL_OBJECT;
	}

	/**
	 * Returns the value of the '<em><b>MState Property</b></em>' containment reference.
	 * The default value is <code>"Active"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MState Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MState Property</em>' containment reference.
	 * @see #setMStateProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject_MStateProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='State' description='Specifies the current state.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMStateProperty() {
		return mStateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStateProperty(MProperty newMStateProperty, NotificationChain msgs) {
		MProperty oldMStateProperty = mStateProperty;
		mStateProperty = newMStateProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY, oldMStateProperty, newMStateProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMStateProperty <em>MState Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMStateProperty the new value of the '<em>MState Property</em>' containment reference.
	 * @see #getMStateProperty()
	 */
	public void setMStateProperty(MProperty newMStateProperty) {
		if (newMStateProperty != mStateProperty) {
			NotificationChain msgs = null;
			if (mStateProperty != null)
				msgs = ((InternalEObject)mStateProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY, null, msgs);
			if (newMStateProperty != null) {
				msgs = ((InternalEObject)newMStateProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mStateProperty != null) {
				if(newMStateProperty != null)
					newMStateProperty.eAdapters().addAll(mStateProperty.eAdapters());			
			
				mStateProperty.eAdapters().clear();
			}
			
			if(!newMStateProperty.eAdapters().contains(this))
				newMStateProperty.eAdapters().add(this);
			
			msgs = basicSetMStateProperty(newMStateProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY, newMStateProperty, newMStateProperty));
	}

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setStateProperty(State)
	 */
	public abstract State getStateProperty();

	/**
	 * Sets the value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * 
	 * @param newState the new value of the '<em>State Property</em>' attribute.
	 * @see #getStateProperty()
	 */
	public abstract void setStateProperty(State newState);

	/**
	 * Returns the value of the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLast State Change Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLast State Change Property</em>' containment reference.
	 * @see #setMLastStateChangeProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject_MLastStateChangeProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Last state change' description='Specifies the date and time of the last state change.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMLastStateChangeProperty() {
		return mLastStateChangeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLastStateChangeProperty(MProperty newMLastStateChangeProperty, NotificationChain msgs) {
		MProperty oldMLastStateChangeProperty = mLastStateChangeProperty;
		mLastStateChangeProperty = newMLastStateChangeProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY, oldMLastStateChangeProperty, newMLastStateChangeProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMLastStateChangeProperty <em>MLast State Change Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMLastStateChangeProperty the new value of the '<em>MLast State Change Property</em>' containment reference.
	 * @see #getMLastStateChangeProperty()
	 * @generated
	 */
	public void setMLastStateChangeProperty(MProperty newMLastStateChangeProperty) {
		if (newMLastStateChangeProperty != mLastStateChangeProperty) {
			NotificationChain msgs = null;
			if (mLastStateChangeProperty != null)
				msgs = ((InternalEObject)mLastStateChangeProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY, null, msgs);
			if (newMLastStateChangeProperty != null) {				
				newMLastStateChangeProperty.setDefaultName("Last state change");
				newMLastStateChangeProperty.setDefaultDescription("Specifies the date and time of the last state change.");
				newMLastStateChangeProperty.setValueType(Type.getTypeForName("Date and time"));
				newMLastStateChangeProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY));
				newMLastStateChangeProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLastStateChangeProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLastStateChangeProperty != null) {
				if(newMLastStateChangeProperty != null)
					newMLastStateChangeProperty.eAdapters().addAll(mLastStateChangeProperty.eAdapters());			
			
				mLastStateChangeProperty.eAdapters().clear();
			}
			msgs = basicSetMLastStateChangeProperty(newMLastStateChangeProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY, newMLastStateChangeProperty, newMLastStateChangeProperty));
	}

	/**
	 * Returns the value of the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last State Change Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last State Change Property</em>' attribute.
	 * @see #setLastStateChangeProperty(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject_LastStateChangeProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime"
	 * @generated
	 */
	public Date getLastStateChangeProperty() {
		return lastStateChangeProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getLastStateChangeProperty <em>Last State Change Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLastStateChangeProperty the new value of the '<em>Last State Change Property</em>' attribute.
	 * @see #getLastStateChangeProperty()
	 * @generated
	 */
	public void setLastStateChangeProperty(Date newLastStateChangeProperty) {
		Date oldLastStateChangeProperty = lastStateChangeProperty;
		lastStateChangeProperty = newLastStateChangeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY, oldLastStateChangeProperty, lastStateChangeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY:
				return basicSetMStateProperty(null, msgs);
			case LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY:
				return basicSetMLastStateChangeProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY:
				return getMStateProperty();
			case LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY:
				return getMLastStateChangeProperty();
			case LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY:
				return getLastStateChangeProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY:    
				setMStateProperty((MProperty)newValue);
				return;
			case LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY:    
				setMLastStateChangeProperty((MProperty)newValue);
				return;
			case LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY:    
				setLastStateChangeProperty((Date)newValue);
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
			case LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY:
				setMStateProperty((MProperty)null);
				return;
			case LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY:
				setMLastStateChangeProperty((MProperty)null);
				return;
			case LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY:
				setLastStateChangeProperty(getDefaultLastStateChangeProperty());
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
			case LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY:
				return mStateProperty != null;
			case LogicPackage.MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY:
				return mLastStateChangeProperty != null;
			case LogicPackage.MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY:
				return getDefaultLastStateChangeProperty() == null ? lastStateChangeProperty != null : !getDefaultLastStateChangeProperty().equals(lastStateChangeProperty);
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
		result.append(" (lastStateChangeProperty: ");
		result.append(lastStateChangeProperty);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#getOverlayIconFilePath()
	 */
	@Override
	public File getOverlayIconFilePath() {
		return getStateProperty().getOverlayIconFilePath();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
        if(MApplication.state != MApplication.LOADING_STATE && notification.getEventType() == Notification.SET && getMStateProperty() == notification.getNotifier())
        	setLastStateChangeProperty(new Date());
        
		super.processNotification(notification);
	}

} // MStatefulObject