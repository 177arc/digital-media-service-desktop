/*
 * Revision History:
 * $Log: MScript.java,v $
 * Revision 1.4  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MScript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getMSteps <em>MSteps</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getStateProperty <em>State Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getMProgressProperty <em>MProgress Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getProgressProperty <em>Progress Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getMProgressStatusProperty <em>MProgress Status Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MScript#getProgressStatusProperty <em>Progress Status Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='Script' name='Script' description='Contains a number of tasks that should be completed.' iconFilePath='Image Files\\Script.gif'"
 * @generated
 */
public class MScript extends MStatefulObject {
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "Script";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MScript.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MScript.TYPE_NAME, new ReferenceType("Reference to "+MScript.TYPE_NAME, "Specifies a reference to a "+MScript.TYPE_NAME_FOR_UI, MScript.class));
	}





















































































































































































	
	/**
	 * The cached value of the '{@link #getMSteps() <em>MSteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSteps()
	 * @generated
	 * @ordered
	 */
	protected EList mSteps;

	/**
	 * The default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_PROPERTY_EDEFAULT = (State)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMStepState(), "Pending");

	/**
	 * Get the default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	public State getDefaultStateProperty() {
		return STATE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	protected State stateProperty = STATE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMProgressProperty() <em>MProgress Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mProgressProperty;

	/**
	 * The default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROGRESS_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultProgressProperty() {
		return PROGRESS_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected Long progressProperty = PROGRESS_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMProgressStatusProperty() <em>MProgress Status Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mProgressStatusProperty;

	/**
	 * The default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRESS_STATUS_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultProgressStatusProperty() {
		return PROGRESS_STATUS_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected String progressStatusProperty = PROGRESS_STATUS_PROPERTY_EDEFAULT;

	/**
	 * Get the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTypeNameForUI() {
		return "Script";
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
		return "Script";
	}

	/**
	 * Get the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultIconFilePath() {
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Script.gif");
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
		return "Contains a number of tasks that should be completed.";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MScript() {
		super();
		
		firstMScriptConstructorHook();
				
		typeNameForUI = "Script";
		description = "Contains a number of tasks that should be completed.";
		name = "Script";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Script.gif");
			 
		setMStateProperty(new MProperty(true, "State", "Specifies the current state.", null));			 
		setMProgressProperty(new MProperty(true, "Progress", "Specifies the progress of the processing in %.", null));			 
		setMProgressStatusProperty(new MProperty(true, "Progress status", "Specifies a textual representation of the progress.", null));

		lastMScriptConstructorHook();		
	}
	
		/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMScriptConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
		/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMScriptConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MSCRIPT;
	}
			
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMStateProperty(MProperty newMStateProperty) {				
		if(newMStateProperty != null) {
				newMStateProperty.setDefaultName("State");
				newMStateProperty.setDefaultDescription("Specifies the current state.");
			newMStateProperty.setValueType(Type.getTypeForName("Step state"));
			newMStateProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSCRIPT__STATE_PROPERTY));
			newMStateProperty.setHistoricValuesEFeature(null);
		}
		
		// Transfers the adpaters from the old managed value to the new one.
		if(mStateProperty != null) {
			if(newMStateProperty != null)
				newMStateProperty.eAdapters().addAll(mStateProperty.eAdapters());			
			
			mStateProperty.eAdapters().clear();
		} 
		
		super.setMStateProperty(newMStateProperty);	  		
	}
    		
	/**
	 * Returns the value of the '<em><b>MSteps</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSteps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSteps</em>' containment reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_MSteps()
	 * @model type="org.onceforall.dms.desktop.logic.MStep" containment="true"
	 * @generated
	 */
	public EList getMSteps() {
		if (mSteps == null) {
			mSteps = new EObjectContainmentEList(MStep.class, this, LogicPackage.MSCRIPT__MSTEPS);
		}
		return mSteps;
	}

	/**
	 * Returns the value of the '<em><b>State Property</b></em>' attribute.
	 * The default value is <code>"Pending"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Property</em>' attribute.
	 * @see #setStateProperty(State)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_StateProperty()
	 * @model default="Pending" dataType="org.onceforall.dms.desktop.logic.MStepState" required="true" transient="true"
	 * @generated
	 */
	public State getStateProperty() {
		return stateProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MScript#getStateProperty <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newStateProperty the new value of the '<em>State Property</em>' attribute.
	 * @see #getStateProperty()
	 * @generated
	 */
	public void setStateProperty(State newStateProperty) {
		State oldStateProperty = stateProperty;
		stateProperty = newStateProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__STATE_PROPERTY, oldStateProperty, stateProperty));
	}

	/**
	 * Returns the value of the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProgress Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProgress Property</em>' containment reference.
	 * @see #setMProgressProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_MProgressProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Progress' description='Specifies the progress of the processing in %.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMProgressProperty() {
		return mProgressProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMProgressProperty(MProperty newMProgressProperty, NotificationChain msgs) {
		MProperty oldMProgressProperty = mProgressProperty;
		mProgressProperty = newMProgressProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__MPROGRESS_PROPERTY, oldMProgressProperty, newMProgressProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MScript#getMProgressProperty <em>MProgress Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMProgressProperty the new value of the '<em>MProgress Property</em>' containment reference.
	 * @see #getMProgressProperty()
	 * @generated
	 */
	public void setMProgressProperty(MProperty newMProgressProperty) {
		if (newMProgressProperty != mProgressProperty) {
			NotificationChain msgs = null;
			if (mProgressProperty != null)
				msgs = ((InternalEObject)mProgressProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSCRIPT__MPROGRESS_PROPERTY, null, msgs);
			if (newMProgressProperty != null) {				
				newMProgressProperty.setDefaultName("Progress");
				newMProgressProperty.setDefaultDescription("Specifies the progress of the processing in %.");
				newMProgressProperty.setValueType(Type.getTypeForName("Number"));
				newMProgressProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSCRIPT__PROGRESS_PROPERTY));
				newMProgressProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMProgressProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSCRIPT__MPROGRESS_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mProgressProperty != null) {
				if(newMProgressProperty != null)
					newMProgressProperty.eAdapters().addAll(mProgressProperty.eAdapters());			
			
				mProgressProperty.eAdapters().clear();
			}
			msgs = basicSetMProgressProperty(newMProgressProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__MPROGRESS_PROPERTY, newMProgressProperty, newMProgressProperty));
	}

	/**
	 * Returns the value of the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Property</em>' attribute.
	 * @see #setProgressProperty(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_ProgressProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" transient="true"
	 * @generated
	 */
	public Long getProgressProperty() {
		return progressProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MScript#getProgressProperty <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newProgressProperty the new value of the '<em>Progress Property</em>' attribute.
	 * @see #getProgressProperty()
	 * @generated
	 */
	public void setProgressProperty(Long newProgressProperty) {
		Long oldProgressProperty = progressProperty;
		progressProperty = newProgressProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__PROGRESS_PROPERTY, oldProgressProperty, progressProperty));
	}

	/**
	 * Returns the value of the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProgress Status Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProgress Status Property</em>' containment reference.
	 * @see #setMProgressStatusProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_MProgressStatusProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Progress status' description='Specifies a textual representation of the progress.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMProgressStatusProperty() {
		return mProgressStatusProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMProgressStatusProperty(MProperty newMProgressStatusProperty, NotificationChain msgs) {
		MProperty oldMProgressStatusProperty = mProgressStatusProperty;
		mProgressStatusProperty = newMProgressStatusProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY, oldMProgressStatusProperty, newMProgressStatusProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MScript#getMProgressStatusProperty <em>MProgress Status Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMProgressStatusProperty the new value of the '<em>MProgress Status Property</em>' containment reference.
	 * @see #getMProgressStatusProperty()
	 * @generated
	 */
	public void setMProgressStatusProperty(MProperty newMProgressStatusProperty) {
		if (newMProgressStatusProperty != mProgressStatusProperty) {
			NotificationChain msgs = null;
			if (mProgressStatusProperty != null)
				msgs = ((InternalEObject)mProgressStatusProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY, null, msgs);
			if (newMProgressStatusProperty != null) {				
				newMProgressStatusProperty.setDefaultName("Progress status");
				newMProgressStatusProperty.setDefaultDescription("Specifies a textual representation of the progress.");
				newMProgressStatusProperty.setValueType(Type.getTypeForName("Text"));
				newMProgressStatusProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY));
				newMProgressStatusProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMProgressStatusProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mProgressStatusProperty != null) {
				if(newMProgressStatusProperty != null)
					newMProgressStatusProperty.eAdapters().addAll(mProgressStatusProperty.eAdapters());			
			
				mProgressStatusProperty.eAdapters().clear();
			}
			msgs = basicSetMProgressStatusProperty(newMProgressStatusProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY, newMProgressStatusProperty, newMProgressStatusProperty));
	}

	/**
	 * Returns the value of the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Status Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Status Property</em>' attribute.
	 * @see #setProgressStatusProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript_ProgressStatusProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getProgressStatusProperty() {
		return progressStatusProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MScript#getProgressStatusProperty <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newProgressStatusProperty the new value of the '<em>Progress Status Property</em>' attribute.
	 * @see #getProgressStatusProperty()
	 * @generated
	 */
	public void setProgressStatusProperty(String newProgressStatusProperty) {
		String oldProgressStatusProperty = progressStatusProperty;
		progressStatusProperty = newProgressStatusProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY, oldProgressStatusProperty, progressStatusProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MSCRIPT__MSTEPS:
				return ((InternalEList)getMSteps()).basicRemove(otherEnd, msgs);
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
				return basicSetMProgressProperty(null, msgs);
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
				return basicSetMProgressStatusProperty(null, msgs);
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
			case LogicPackage.MSCRIPT__MSTEPS:
				return getMSteps();
			case LogicPackage.MSCRIPT__STATE_PROPERTY:
				return getStateProperty();
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
				return getMProgressProperty();
			case LogicPackage.MSCRIPT__PROGRESS_PROPERTY:
				return getProgressProperty();
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
				return getMProgressStatusProperty();
			case LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY:
				return getProgressStatusProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MSCRIPT__MSTEPS:
				getMSteps().clear();
				for(MStep mStep: (List<MStep>) getMSteps())
					mStep.eAdapters().remove(this);
				getMSteps().addAll((Collection)newValue);
				for(MStep mStep: (List<MStep>) getMSteps())
					mStep.eAdapters().add(this);
				return;
			case LogicPackage.MSCRIPT__STATE_PROPERTY:
				setStateProperty((State)newValue);
				return;
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
				setMProgressProperty((MProperty)newValue);
				return;
			case LogicPackage.MSCRIPT__PROGRESS_PROPERTY:
				setProgressProperty((Long)newValue);
				return;
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
				setMProgressStatusProperty((MProperty)newValue);
				return;
			case LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY:
				setProgressStatusProperty((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MSCRIPT__MSTEPS:
				getMSteps().clear();
				for(MStep mStep: (List<MStep>) getMSteps())
					mStep.eAdapters().remove(this);
				return;
			case LogicPackage.MSCRIPT__STATE_PROPERTY:
				setStateProperty(STATE_PROPERTY_EDEFAULT);
				return;
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
				setMProgressProperty((MProperty)null);
				return;
			case LogicPackage.MSCRIPT__PROGRESS_PROPERTY:
				setProgressProperty(PROGRESS_PROPERTY_EDEFAULT);
				return;
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
				setMProgressStatusProperty((MProperty)null);
				return;
			case LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY:
				setProgressStatusProperty(PROGRESS_STATUS_PROPERTY_EDEFAULT);
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
			case LogicPackage.MSCRIPT__MSTEPS:
				return mSteps != null && !mSteps.isEmpty();
			case LogicPackage.MSCRIPT__STATE_PROPERTY:
				return getDefaultStateProperty() == null ? stateProperty != null : !getDefaultStateProperty().equals(stateProperty);
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
				return mProgressProperty != null;
			case LogicPackage.MSCRIPT__PROGRESS_PROPERTY:
				return getDefaultProgressProperty() == null ? progressProperty != null : !getDefaultProgressProperty().equals(progressProperty);
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
				return mProgressStatusProperty != null;
			case LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY:
				return getDefaultProgressStatusProperty() == null ? progressStatusProperty != null : !getDefaultProgressStatusProperty().equals(progressStatusProperty);
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
		result.append(" (stateProperty: ");
		result.append(stateProperty);
		result.append(", progressProperty: ");
		result.append(progressProperty);
		result.append(", progressStatusProperty: ");
		result.append(progressStatusProperty);
		result.append(')');
		return result.toString();
	}

	/**
	 * Gets the step before the {@link #getCurrentMStep() current step}.
	 * 
	 * @return Returns the step before the current step.
	 */
	public MStep getPreviousMStep() {
		MStep result = null;
		
		Iterator iterator = mSteps.iterator();
		while(iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if(MStep.class.isAssignableFrom(eObject.getClass())
					&& ((MStep) eObject).isInProcessingState())
				return result;
			
			result = (MStep) eObject;
		}
        
        return(null);
	}


	/**
	 * Gets the current step. The current step is the first step in this script
	 * that is processing.
	 * 
	 * @return Returns the current step.
	 */
	public MStep getCurrentMStep() {
		Iterator iterator = mSteps.iterator();
		while(iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if(MStep.class.isAssignableFrom(eObject.getClass())
					&& ((MStep) eObject).isInProcessingState())
				return (MStep) eObject;
		}
        
        return(null);
	}


	/**
	 * Gets the step after the {@link #getCurrentMStep() current step}.
	 * 
	 * @return Returns the step after the current step.
	 */
	public MStep getNextMStep() {
		boolean foundCurrentStep = false;

		Iterator iterator = mSteps.iterator();
		while(iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if(MStep.class.isAssignableFrom(eObject.getClass())) {
				MStep step = (MStep) eObject;
				if(!foundCurrentStep && step.isInProcessingState())
					foundCurrentStep = true;
				
				if(foundCurrentStep && !step.isInProcessingState())
					return (MStep) eObject;				
			}
		}
        
        return(null);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
		if(MApplication.state != MApplication.LOADING_STATE 
				&& notification.getEventType() == Notification.SET  
				&& notification.getNotifier() instanceof MValue) {
			MValue mValue = (MValue) notification.getNotifier();
			if(mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_PROPERTY) {
				long progress = 0;
				int mStepCount = 0;
				for(MStep mStep: (List<MStep>) getMSteps())
					if(mStep.getStateProperty() == MStepStateType.COMPLETED_STATE || mStep.getStateProperty() == MStepStateType.PAUSED_STATE
							 || mStep.getStateProperty() == MStepStateType.PAUSING_STATE || mStep.getStateProperty() == MStepStateType.PROCESSING_STATE
							 || mStep.getStateProperty() == MStepStateType.STOPPING_STATE || mStep.getStateProperty() == MStepStateType.STOPPED_STATE
							 || mStep.getStateProperty() == MStepStateType.PENDING_STATE) {
						progress += mStep.getProgressProperty() != null ? mStep.getProgressProperty() : 0;
						++mStepCount;
					}
				
				setProgressProperty(progress/mStepCount);
			}
			if(mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY) {
				setProgressStatusProperty(((MStep)mValue.eContainer()).getNameForUI()+": "+mValue.getValueForUI());
			}
		}
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		super.eNotify(notification);
		
		if(notification.getEventType() == Notification.ADD && notification.getFeature() == eClass().getEStructuralFeature(LogicPackage.MSCRIPT__MSTEPS) 
				&& notification.getNewValue() != null) {
			((MStep) notification.getNewValue()).getMStateProperty().eAdapters().add(this);
			((MStep) notification.getNewValue()).getMProgressProperty().eAdapters().add(this);
			((MStep) notification.getNewValue()).getMProgressStatusProperty().eAdapters().add(this);
			
		}
		
		if(notification.getEventType() == Notification.REMOVE && notification.getFeature() == eClass().getEStructuralFeature(LogicPackage.MSCRIPT__MSTEPS) 
				&& notification.getNewValue() != null) {
			((MStep) notification.getNewValue()).getMProgressStatusProperty().eAdapters().remove(this);
			((MStep) notification.getNewValue()).getMProgressProperty().eAdapters().remove(this);
			((MStep) notification.getOldValue()).getMStateProperty().eAdapters().remove(this);
		}
	}

} // MScript