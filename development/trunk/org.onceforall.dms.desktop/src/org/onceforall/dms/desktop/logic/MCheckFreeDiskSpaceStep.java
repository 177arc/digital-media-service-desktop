/*
 * Revision History:
 * $Log: MCheckFreeDiskSpaceStep.java,v $
 * Revision 1.3  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;


import java.io.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.types.LongType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCheck Free Disk Space Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMRequiredFreeDiskSpaceParameter <em>MRequired Free Disk Space Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getRequiredFreeDiskSpaceParameter <em>Required Free Disk Space Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMDirectoryParameter <em>MDirectory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getDirectoryParameter <em>Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMFreeDiskSpaceResult <em>MFree Disk Space Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getFreeDiskSpaceResult <em>Free Disk Space Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Check free disk space' description='Please make sure that there is enough disk space free on this computer. There must be at least 1 GB (i.e. 1024 MB) available for the recordings. If not enough disk space is available, please delete the oldest services till enough disk space is free.' iconFilePath='Image Files/Task.gif' actionName='Check' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MCheckFreeDiskSpaceStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MCheckFreeDiskSpaceStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MCheckFreeDiskSpaceStep.TYPE_NAME, new ReferenceType("Reference to "+MCheckFreeDiskSpaceStep.TYPE_NAME, "Specifies a reference to a "+MCheckFreeDiskSpaceStep.TYPE_NAME_FOR_UI, MCheckFreeDiskSpaceStep.class));
	}












































	/**
	 * The cached value of the '{@link #getMRequiredFreeDiskSpaceParameter() <em>MRequired Free Disk Space Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRequiredFreeDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRequiredFreeDiskSpaceParameter = null;

	/**
	 * The default value of the '{@link #getRequiredFreeDiskSpaceParameter() <em>Required Free Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFreeDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUIRED_FREE_DISK_SPACE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRequiredFreeDiskSpaceParameter() <em>Required Free Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRequiredFreeDiskSpaceParameter() <em>Required Free Disk Space Parameter</em>}' attribute.
	 * @see #getRequiredFreeDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultRequiredFreeDiskSpaceParameter() {
		return REQUIRED_FREE_DISK_SPACE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRequiredFreeDiskSpaceParameter() <em>Required Free Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFreeDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected Long requiredFreeDiskSpaceParameter = REQUIRED_FREE_DISK_SPACE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMDirectoryParameter() <em>MDirectory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDirectoryParameter = null;

	/**
	 * The default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File DIRECTORY_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDirectoryParameter() {
		return DIRECTORY_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected File directoryParameter = DIRECTORY_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMFreeDiskSpaceResult() <em>MFree Disk Space Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFreeDiskSpaceResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mFreeDiskSpaceResult = null;

	/**
	 * The default value of the '{@link #getFreeDiskSpaceResult() <em>Free Disk Space Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeDiskSpaceResult()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_DISK_SPACE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFreeDiskSpaceResult() <em>Free Disk Space Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFreeDiskSpaceResult() <em>Free Disk Space Result</em>}' attribute.
	 * @see #getFreeDiskSpaceResult()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultFreeDiskSpaceResult() {
		return FREE_DISK_SPACE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFreeDiskSpaceResult() <em>Free Disk Space Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeDiskSpaceResult()
	 * @generated
	 * @ordered
	 */
	protected Long freeDiskSpaceResult = FREE_DISK_SPACE_RESULT_EDEFAULT;


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
		return "Check";
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
	 * Get the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultIconFilePath() {
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Task.gif");
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
		return "Please make sure that there is enough disk space free on this computer. There must be at least 1 GB (i.e. 1024 MB) available for the recordings. If not enough disk space is available, please delete the oldest services till enough disk space is free.";
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
		return "Check free disk space";
	}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCheckFreeDiskSpaceStep() {
		super();
		
		firstMCheckFreeDiskSpaceStepConstructorHook();
				
		actionName = "Check";
		stoppable = false;
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Task.gif");
		description = "Please make sure that there is enough disk space free on this computer. There must be at least 1 GB (i.e. 1024 MB) available for the recordings. If not enough disk space is available, please delete the oldest services till enough disk space is free.";
		name = "Check free disk space";
		interruptable = false;
		terminatable = false;
					 
		setMRequiredFreeDiskSpaceParameter(new MParameter(false, "Required free disk space", "Specifies the estimated required free disk space in bytes on the drive where the recording will be stored.", null));			 
		setMDirectoryParameter(new MParameter(false, "Directory", "Specifies the path of the created directory where the recordings will be stored.", null));			 
		setMFreeDiskSpaceResult(new MResult(false, "Free disk space", "Specifies the actual free disk space on the drive where the recording will be stored.", null));

		lastMCheckFreeDiskSpaceStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMCheckFreeDiskSpaceStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMCheckFreeDiskSpaceStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MRequired Free Disk Space Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRequired Free Disk Space Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRequired Free Disk Space Parameter</em>' containment reference.
	 * @see #setMRequiredFreeDiskSpaceParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_MRequiredFreeDiskSpaceParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Required free disk space' description='Specifies the estimated required free disk space in bytes on the drive where the recording will be stored.'"
	 * @generated
	 */
	public MParameter getMRequiredFreeDiskSpaceParameter() {
		return mRequiredFreeDiskSpaceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRequiredFreeDiskSpaceParameter(MParameter newMRequiredFreeDiskSpaceParameter, NotificationChain msgs) {
		MParameter oldMRequiredFreeDiskSpaceParameter = mRequiredFreeDiskSpaceParameter;
		mRequiredFreeDiskSpaceParameter = newMRequiredFreeDiskSpaceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER, oldMRequiredFreeDiskSpaceParameter, newMRequiredFreeDiskSpaceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMRequiredFreeDiskSpaceParameter <em>MRequired Free Disk Space Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRequiredFreeDiskSpaceParameter the new value of the '<em>MRequired Free Disk Space Parameter</em>' containment reference.
	 * @see #getMRequiredFreeDiskSpaceParameter()
	 * @generated
	 */
	public void setMRequiredFreeDiskSpaceParameter(MParameter newMRequiredFreeDiskSpaceParameter) {
		if (newMRequiredFreeDiskSpaceParameter != mRequiredFreeDiskSpaceParameter) {
			NotificationChain msgs = null;
			if (mRequiredFreeDiskSpaceParameter != null)
				msgs = ((InternalEObject)mRequiredFreeDiskSpaceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER, null, msgs);
			if (newMRequiredFreeDiskSpaceParameter != null) {				
				newMRequiredFreeDiskSpaceParameter.setDefaultDescription("Specifies the estimated required free disk space in bytes on the drive where the recording will be stored.");
				newMRequiredFreeDiskSpaceParameter.setDefaultName("Required free disk space");
				newMRequiredFreeDiskSpaceParameter.setValueType(Type.getTypeForName("Number"));
				newMRequiredFreeDiskSpaceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER));
				newMRequiredFreeDiskSpaceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRequiredFreeDiskSpaceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRequiredFreeDiskSpaceParameter != null) {
				if(newMRequiredFreeDiskSpaceParameter != null)
					newMRequiredFreeDiskSpaceParameter.eAdapters().addAll(mRequiredFreeDiskSpaceParameter.eAdapters());			
			
				mRequiredFreeDiskSpaceParameter.eAdapters().clear();
			}
			msgs = basicSetMRequiredFreeDiskSpaceParameter(newMRequiredFreeDiskSpaceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER, newMRequiredFreeDiskSpaceParameter, newMRequiredFreeDiskSpaceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Required Free Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Free Disk Space Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Free Disk Space Parameter</em>' attribute.
	 * @see #setRequiredFreeDiskSpaceParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_RequiredFreeDiskSpaceParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" required="true"
	 * @generated
	 */
	public Long getRequiredFreeDiskSpaceParameter() {
		return requiredFreeDiskSpaceParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getRequiredFreeDiskSpaceParameter <em>Required Free Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newRequiredFreeDiskSpaceParameter the new value of the '<em>Required Free Disk Space Parameter</em>' attribute.
	 * @see #getRequiredFreeDiskSpaceParameter()
	 * @generated
	 */
	public void setRequiredFreeDiskSpaceParameter(Long newRequiredFreeDiskSpaceParameter) {
		Long oldRequiredFreeDiskSpaceParameter = requiredFreeDiskSpaceParameter;
		requiredFreeDiskSpaceParameter = newRequiredFreeDiskSpaceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER, oldRequiredFreeDiskSpaceParameter, requiredFreeDiskSpaceParameter));
	}

	/**
	 * Returns the value of the '<em><b>MDirectory Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDirectory Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDirectory Parameter</em>' containment reference.
	 * @see #setMDirectoryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_MDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory' description='Specifies the path of the created directory where the recordings will be stored.'"
	 * @generated
	 */
	public MParameter getMDirectoryParameter() {
		return mDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDirectoryParameter(MParameter newMDirectoryParameter, NotificationChain msgs) {
		MParameter oldMDirectoryParameter = mDirectoryParameter;
		mDirectoryParameter = newMDirectoryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER, oldMDirectoryParameter, newMDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMDirectoryParameter <em>MDirectory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDirectoryParameter the new value of the '<em>MDirectory Parameter</em>' containment reference.
	 * @see #getMDirectoryParameter()
	 * @generated
	 */
	public void setMDirectoryParameter(MParameter newMDirectoryParameter) {
		if (newMDirectoryParameter != mDirectoryParameter) {
			NotificationChain msgs = null;
			if (mDirectoryParameter != null)
				msgs = ((InternalEObject)mDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER, null, msgs);
			if (newMDirectoryParameter != null) {				
				newMDirectoryParameter.setDefaultDescription("Specifies the path of the created directory where the recordings will be stored.");
				newMDirectoryParameter.setDefaultName("Directory");
				newMDirectoryParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER));
				newMDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDirectoryParameter != null) {
				if(newMDirectoryParameter != null)
					newMDirectoryParameter.eAdapters().addAll(mDirectoryParameter.eAdapters());			
			
				mDirectoryParameter.eAdapters().clear();
			}
			msgs = basicSetMDirectoryParameter(newMDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER, newMDirectoryParameter, newMDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Parameter</em>' attribute.
	 * @see #setDirectoryParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_DirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getDirectoryParameter() {
		return directoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getDirectoryParameter <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDirectoryParameter the new value of the '<em>Directory Parameter</em>' attribute.
	 * @see #getDirectoryParameter()
	 * @generated
	 */
	public void setDirectoryParameter(File newDirectoryParameter) {
		File oldDirectoryParameter = directoryParameter;
		directoryParameter = newDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER, oldDirectoryParameter, directoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MFree Disk Space Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFree Disk Space Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFree Disk Space Result</em>' containment reference.
	 * @see #setMFreeDiskSpaceResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_MFreeDiskSpaceResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Free disk space' description='Specifies the actual free disk space on the drive where the recording will be stored.'"
	 * @generated
	 */
	public MResult getMFreeDiskSpaceResult() {
		return mFreeDiskSpaceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFreeDiskSpaceResult(MResult newMFreeDiskSpaceResult, NotificationChain msgs) {
		MResult oldMFreeDiskSpaceResult = mFreeDiskSpaceResult;
		mFreeDiskSpaceResult = newMFreeDiskSpaceResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT, oldMFreeDiskSpaceResult, newMFreeDiskSpaceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMFreeDiskSpaceResult <em>MFree Disk Space Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFreeDiskSpaceResult the new value of the '<em>MFree Disk Space Result</em>' containment reference.
	 * @see #getMFreeDiskSpaceResult()
	 * @generated
	 */
	public void setMFreeDiskSpaceResult(MResult newMFreeDiskSpaceResult) {
		if (newMFreeDiskSpaceResult != mFreeDiskSpaceResult) {
			NotificationChain msgs = null;
			if (mFreeDiskSpaceResult != null)
				msgs = ((InternalEObject)mFreeDiskSpaceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT, null, msgs);
			if (newMFreeDiskSpaceResult != null) {				
				newMFreeDiskSpaceResult.setDefaultDescription("Specifies the actual free disk space on the drive where the recording will be stored.");
				newMFreeDiskSpaceResult.setDefaultName("Free disk space");
				newMFreeDiskSpaceResult.setValueType(Type.getTypeForName("Number"));
				newMFreeDiskSpaceResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT));
				newMFreeDiskSpaceResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFreeDiskSpaceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFreeDiskSpaceResult != null) {
				if(newMFreeDiskSpaceResult != null)
					newMFreeDiskSpaceResult.eAdapters().addAll(mFreeDiskSpaceResult.eAdapters());			
			
				mFreeDiskSpaceResult.eAdapters().clear();
			}
			msgs = basicSetMFreeDiskSpaceResult(newMFreeDiskSpaceResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT, newMFreeDiskSpaceResult, newMFreeDiskSpaceResult));
	}

	/**
	 * Returns the value of the '<em><b>Free Disk Space Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Disk Space Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Disk Space Result</em>' attribute.
	 * @see #setFreeDiskSpaceResult(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep_FreeDiskSpaceResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" transient="true"
	 * @generated
	 */
	public Long getFreeDiskSpaceResult() {
		return freeDiskSpaceResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getFreeDiskSpaceResult <em>Free Disk Space Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFreeDiskSpaceResult the new value of the '<em>Free Disk Space Result</em>' attribute.
	 * @see #getFreeDiskSpaceResult()
	 * @generated
	 */
	public void setFreeDiskSpaceResult(Long newFreeDiskSpaceResult) {
		Long oldFreeDiskSpaceResult = freeDiskSpaceResult;
		freeDiskSpaceResult = newFreeDiskSpaceResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT, oldFreeDiskSpaceResult, freeDiskSpaceResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
				return basicSetMRequiredFreeDiskSpaceParameter(null, msgs);
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
				return basicSetMDirectoryParameter(null, msgs);
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
				return basicSetMFreeDiskSpaceResult(null, msgs);
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
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
				return getMRequiredFreeDiskSpaceParameter();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER:
				return getRequiredFreeDiskSpaceParameter();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
				return getMDirectoryParameter();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER:
				return getDirectoryParameter();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
				return getMFreeDiskSpaceResult();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT:
				return getFreeDiskSpaceResult();
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
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
				setMRequiredFreeDiskSpaceParameter((MParameter)newValue);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER:
				setRequiredFreeDiskSpaceParameter((Long)newValue);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
				setMFreeDiskSpaceResult((MResult)newValue);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT:
				setFreeDiskSpaceResult((Long)newValue);
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
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
				setMRequiredFreeDiskSpaceParameter((MParameter)null);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER:
				setRequiredFreeDiskSpaceParameter(getDefaultRequiredFreeDiskSpaceParameter());
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter(getDefaultDirectoryParameter());
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
				setMFreeDiskSpaceResult((MResult)null);
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT:
				setFreeDiskSpaceResult(getDefaultFreeDiskSpaceResult());
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
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
				return mRequiredFreeDiskSpaceParameter != null;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER:
				return getDefaultRequiredFreeDiskSpaceParameter() == null ? requiredFreeDiskSpaceParameter != null : !getDefaultRequiredFreeDiskSpaceParameter().equals(requiredFreeDiskSpaceParameter);
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
				return mDirectoryParameter != null;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER:
				return getDefaultDirectoryParameter() == null ? directoryParameter != null : !getDefaultDirectoryParameter().equals(directoryParameter);
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
				return mFreeDiskSpaceResult != null;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT:
				return getDefaultFreeDiskSpaceResult() == null ? freeDiskSpaceResult != null : !getDefaultFreeDiskSpaceResult().equals(freeDiskSpaceResult);
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
		result.append(" (requiredFreeDiskSpaceParameter: ");
		result.append(requiredFreeDiskSpaceParameter);
		result.append(", directoryParameter: ");
		result.append(directoryParameter);
		result.append(", freeDiskSpaceResult: ");
		result.append(freeDiskSpaceResult);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
		long freeDiskSpace = getDirectoryParameter().getUsableSpace();
		long requiredDiskSpace = getRequiredFreeDiskSpaceParameter();
		
		setFreeDiskSpaceResult(getDirectoryParameter().getFreeSpace());

		if(freeDiskSpace < requiredDiskSpace)
			throw new DesktopException("There are only "+LongType.NUMBER_FORMATTER.format(freeDiskSpace)+" bytes free in '"+getDirectoryParameter().getAbsolutePath()+"',\nbut "+LongType.NUMBER_FORMATTER.format(requiredDiskSpace)+" bytes are required.", "Please make more disk space available before proceeding.", DesktopException.ERROR_SEVERITY, null);

		if(freeDiskSpace < requiredDiskSpace*2.2f)
			throw new DesktopException("There is enough disk space but it will soon run out.", "Please make more disk space available soon.", DesktopException.WARNING_SEVERITY, null);
	}

} // MCheckFreeDiskSpaceStep