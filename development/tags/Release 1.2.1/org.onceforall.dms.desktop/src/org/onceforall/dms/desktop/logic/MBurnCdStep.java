/*
 * Revision History:
 * $Log: MBurnCdStep.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.interfaces.AudioInterface;
import org.onceforall.dms.desktop.interfaces.CommandLineInterface;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBurn Cd Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMRecordingFilesParameter <em>MRecording Files Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getRecordingFilesParameter <em>Recording Files Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMBurningSoftwareDirectoryPathParameter <em>MBurning Software Directory Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getBurningSoftwareDirectoryPathParameter <em>Burning Software Directory Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMDriveParameter <em>MDrive Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getDriveParameter <em>Drive Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingLengthParameter <em>MTotal Recording Length Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingLengthParameter <em>Total Recording Length Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingFileSizeParameter <em>MTotal Recording File Size Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingFileSizeParameter <em>Total Recording File Size Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Burn CDs for sale' description='Burns the recordings on a writable CD for sale. Please insert a blank CD before initiating the burning process. Note that the post-sermon recording does not need to be included.' iconFilePath='Image Files/Burn CD step.gif' actionName='Burn' actionIconFilePath='Image Files/Burn CD.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MBurnCdStep extends MStep {

    /** Specifies the maximum total recording file size that will fit on one CD in bytes. */
    public static final long MAX_RECORDING_LENGTH = 80*60*1000;
    
    /** Specifies the maximum total recording length that will fit on one CD in milliseconds. */
    public static final long MAX_RECORDING_SIZE = 830*1024*1024;

	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MBurnCdStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MBurnCdStep.TYPE_NAME, new ReferenceType("Reference to "+MBurnCdStep.TYPE_NAME, "Specifies a reference to a "+MBurnCdStep.TYPE_NAME_FOR_UI, MBurnCdStep.class));
	}
	/**
	 * The cached value of the '{@link #getMRecordingFilesParameter() <em>MRecording Files Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingFilesParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingFilesParameter = null;

	/**
	 * The cached value of the '{@link #getRecordingFilesParameter() <em>Recording Files Parameter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFilesParameter()
	 * @generated
	 * @ordered
	 */
	protected EList recordingFilesParameter = null;

	/**
	 * The cached value of the '{@link #getMBurningSoftwareDirectoryPathParameter() <em>MBurning Software Directory Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBurningSoftwareDirectoryPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mBurningSoftwareDirectoryPathParameter = null;

	/**
	 * The default value of the '{@link #getBurningSoftwareDirectoryPathParameter() <em>Burning Software Directory Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurningSoftwareDirectoryPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getBurningSoftwareDirectoryPathParameter() <em>Burning Software Directory Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getBurningSoftwareDirectoryPathParameter() <em>Burning Software Directory Path Parameter</em>}' attribute.
	 * @see #getBurningSoftwareDirectoryPathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultBurningSoftwareDirectoryPathParameter() {
		return BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getBurningSoftwareDirectoryPathParameter() <em>Burning Software Directory Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurningSoftwareDirectoryPathParameter()
	 * @generated
	 * @ordered
	 */
	protected File burningSoftwareDirectoryPathParameter = BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMDriveParameter() <em>MDrive Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDriveParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDriveParameter = null;

	/**
	 * The default value of the '{@link #getDriveParameter() <em>Drive Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDriveParameter() <em>Drive Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDriveParameter() <em>Drive Parameter</em>}' attribute.
	 * @see #getDriveParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDriveParameter() {
		return DRIVE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDriveParameter() <em>Drive Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveParameter()
	 * @generated
	 * @ordered
	 */
	protected String driveParameter = DRIVE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTotalRecordingLengthParameter() <em>MTotal Recording Length Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTotalRecordingLengthParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTotalRecordingLengthParameter = null;

	/**
	 * The default value of the '{@link #getTotalRecordingLengthParameter() <em>Total Recording Length Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRecordingLengthParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_RECORDING_LENGTH_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTotalRecordingLengthParameter() <em>Total Recording Length Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTotalRecordingLengthParameter() <em>Total Recording Length Parameter</em>}' attribute.
	 * @see #getTotalRecordingLengthParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultTotalRecordingLengthParameter() {
		return TOTAL_RECORDING_LENGTH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTotalRecordingLengthParameter() <em>Total Recording Length Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRecordingLengthParameter()
	 * @generated
	 * @ordered
	 */
	protected Long totalRecordingLengthParameter = TOTAL_RECORDING_LENGTH_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTotalRecordingFileSizeParameter() <em>MTotal Recording File Size Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTotalRecordingFileSizeParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTotalRecordingFileSizeParameter = null;

	/**
	 * The default value of the '{@link #getTotalRecordingFileSizeParameter() <em>Total Recording File Size Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRecordingFileSizeParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_RECORDING_FILE_SIZE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTotalRecordingFileSizeParameter() <em>Total Recording File Size Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTotalRecordingFileSizeParameter() <em>Total Recording File Size Parameter</em>}' attribute.
	 * @see #getTotalRecordingFileSizeParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultTotalRecordingFileSizeParameter() {
		return TOTAL_RECORDING_FILE_SIZE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTotalRecordingFileSizeParameter() <em>Total Recording File Size Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRecordingFileSizeParameter()
	 * @generated
	 * @ordered
	 */
	protected Long totalRecordingFileSizeParameter = TOTAL_RECORDING_FILE_SIZE_PARAMETER_EDEFAULT;

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
		return "Burn";
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
	 * Get the default value of the '{@link #getActionIconFilePath() <em>Action Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionIconFilePath() <em>Action Icon File Path</em>}' attribute.
	 * @see #getActionIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultActionIconFilePath() {
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Burn CD.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Burn CD step.gif");
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
		return "Burns the recordings on a writable CD for sale. Please insert a blank CD before initiating the burning process. Note that the post-sermon recording does not need to be included.";
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
		return "Burn CDs for sale";
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
	 * Specifies an empty string array that can be used for typed conversions of collection.
	 * @see java.util.Collection#toArray(Object[])
	 */
	private static final String[] EMPTY_STRING_ARRAY = new String[0];
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBurnCdStep() {
		super();
		
		firstMBurnCdStepConstructorHook();
				
		description = "Burns the recordings on a writable CD for sale. Please insert a blank CD before initiating the burning process. Note that the post-sermon recording does not need to be included.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Burn CD.gif");
		name = "Burn CDs for sale";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Burn CD step.gif");
		terminatable = false;
		interruptable = false;
		actionName = "Burn";
					 
		setMRecordingFilesParameter(new MParameter(false, "Recording files", "Specifies the file paths (relative or absolute) of the recorded WAV files.", null));			 
		setMBurningSoftwareDirectoryPathParameter(new MParameter(false, "CD-ROM burning software directory path", "Specifies the path to the directory that contains the \'nerocmd.exe\'.", null));			 
		setMDriveParameter(new MParameter(false, "Drive", "Specifies either the full name of the CD-ROM drive or the drive letter.", null));			 
		setMTotalRecordingLengthParameter(new MParameter(false, "Total recording length", "Specifies the total length of the files to be burned to CD. The total length must not exceed 01:20:00.", null));			 
		setMTotalRecordingFileSizeParameter(new MParameter(false, "Total recording file size", "Specifies the total size of the files to be burned to CD. The total size must not exceed 870,318,080.", null));

		lastMBurnCdStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMBurnCdStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMBurnCdStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MBURN_CD_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MRecording Files Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Files Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Files Parameter</em>' containment reference.
	 * @see #setMRecordingFilesParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_MRecordingFilesParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording files' description='Specifies the file paths (relative or absolute) of the recorded WAV files.'"
	 * @generated
	 */
	public MParameter getMRecordingFilesParameter() {
		return mRecordingFilesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingFilesParameter(MParameter newMRecordingFilesParameter, NotificationChain msgs) {
		MParameter oldMRecordingFilesParameter = mRecordingFilesParameter;
		mRecordingFilesParameter = newMRecordingFilesParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER, oldMRecordingFilesParameter, newMRecordingFilesParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMRecordingFilesParameter <em>MRecording Files Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRecordingFilesParameter the new value of the '<em>MRecording Files Parameter</em>' containment reference.
	 * @see #getMRecordingFilesParameter()
	 * @generated
	 */
	public void setMRecordingFilesParameter(MParameter newMRecordingFilesParameter) {
		if (newMRecordingFilesParameter != mRecordingFilesParameter) {
			NotificationChain msgs = null;
			if (mRecordingFilesParameter != null)
				msgs = ((InternalEObject)mRecordingFilesParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER, null, msgs);
			if (newMRecordingFilesParameter != null) {				
				newMRecordingFilesParameter.setDefaultDescription("Specifies the file paths (relative or absolute) of the recorded WAV files.");
				newMRecordingFilesParameter.setDefaultName("Recording files");
				newMRecordingFilesParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMRecordingFilesParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER));
				newMRecordingFilesParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFilesParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingFilesParameter != null) {
				if(newMRecordingFilesParameter != null)
					newMRecordingFilesParameter.eAdapters().addAll(mRecordingFilesParameter.eAdapters());			
			
				mRecordingFilesParameter.eAdapters().clear();
			}
			msgs = basicSetMRecordingFilesParameter(newMRecordingFilesParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER, newMRecordingFilesParameter, newMRecordingFilesParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording Files Parameter</b></em>' attribute list.
	 * The list contents are of type {@link java.io.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Files Parameter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Files Parameter</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_RecordingFilesParameter()
	 * @model type="java.io.File" dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public EList getRecordingFilesParameter() {
		if (recordingFilesParameter == null) {
			recordingFilesParameter = new EDataTypeUniqueEList(File.class, this, LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER);
		}
		return recordingFilesParameter;
	}

	/**
	 * Returns the value of the '<em><b>MBurning Software Directory Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBurning Software Directory Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBurning Software Directory Path Parameter</em>' containment reference.
	 * @see #setMBurningSoftwareDirectoryPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_MBurningSoftwareDirectoryPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='CD-ROM burning software directory path' description='Specifies the path to the directory that contains the \'nerocmd.exe\'.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMBurningSoftwareDirectoryPathParameter() {
		return mBurningSoftwareDirectoryPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBurningSoftwareDirectoryPathParameter(MParameter newMBurningSoftwareDirectoryPathParameter, NotificationChain msgs) {
		MParameter oldMBurningSoftwareDirectoryPathParameter = mBurningSoftwareDirectoryPathParameter;
		mBurningSoftwareDirectoryPathParameter = newMBurningSoftwareDirectoryPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER, oldMBurningSoftwareDirectoryPathParameter, newMBurningSoftwareDirectoryPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMBurningSoftwareDirectoryPathParameter <em>MBurning Software Directory Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMBurningSoftwareDirectoryPathParameter the new value of the '<em>MBurning Software Directory Path Parameter</em>' containment reference.
	 * @see #getMBurningSoftwareDirectoryPathParameter()
	 * @generated
	 */
	public void setMBurningSoftwareDirectoryPathParameter(MParameter newMBurningSoftwareDirectoryPathParameter) {
		if (newMBurningSoftwareDirectoryPathParameter != mBurningSoftwareDirectoryPathParameter) {
			NotificationChain msgs = null;
			if (mBurningSoftwareDirectoryPathParameter != null)
				msgs = ((InternalEObject)mBurningSoftwareDirectoryPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER, null, msgs);
			if (newMBurningSoftwareDirectoryPathParameter != null) {				
				newMBurningSoftwareDirectoryPathParameter.setDefaultName("CD-ROM burning software directory path");
				newMBurningSoftwareDirectoryPathParameter.setDefaultDescription("Specifies the path to the directory that contains the \'nerocmd.exe\'.");
				newMBurningSoftwareDirectoryPathParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMBurningSoftwareDirectoryPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER));
				newMBurningSoftwareDirectoryPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMBurningSoftwareDirectoryPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mBurningSoftwareDirectoryPathParameter != null) {
				if(newMBurningSoftwareDirectoryPathParameter != null)
					newMBurningSoftwareDirectoryPathParameter.eAdapters().addAll(mBurningSoftwareDirectoryPathParameter.eAdapters());			
			
				mBurningSoftwareDirectoryPathParameter.eAdapters().clear();
			}
			msgs = basicSetMBurningSoftwareDirectoryPathParameter(newMBurningSoftwareDirectoryPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER, newMBurningSoftwareDirectoryPathParameter, newMBurningSoftwareDirectoryPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Burning Software Directory Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burning Software Directory Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burning Software Directory Path Parameter</em>' attribute.
	 * @see #setBurningSoftwareDirectoryPathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_BurningSoftwareDirectoryPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getBurningSoftwareDirectoryPathParameter() {
		return burningSoftwareDirectoryPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getBurningSoftwareDirectoryPathParameter <em>Burning Software Directory Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newBurningSoftwareDirectoryPathParameter the new value of the '<em>Burning Software Directory Path Parameter</em>' attribute.
	 * @see #getBurningSoftwareDirectoryPathParameter()
	 * @generated
	 */
	public void setBurningSoftwareDirectoryPathParameter(File newBurningSoftwareDirectoryPathParameter) {
		File oldBurningSoftwareDirectoryPathParameter = burningSoftwareDirectoryPathParameter;
		burningSoftwareDirectoryPathParameter = newBurningSoftwareDirectoryPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER, oldBurningSoftwareDirectoryPathParameter, burningSoftwareDirectoryPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MDrive Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDrive Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDrive Parameter</em>' containment reference.
	 * @see #setMDriveParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_MDriveParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Drive' description='Specifies either the full name of the CD-ROM drive or the drive letter.'"
	 * @generated
	 */
	public MParameter getMDriveParameter() {
		return mDriveParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDriveParameter(MParameter newMDriveParameter, NotificationChain msgs) {
		MParameter oldMDriveParameter = mDriveParameter;
		mDriveParameter = newMDriveParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER, oldMDriveParameter, newMDriveParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMDriveParameter <em>MDrive Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDriveParameter the new value of the '<em>MDrive Parameter</em>' containment reference.
	 * @see #getMDriveParameter()
	 * @generated
	 */
	public void setMDriveParameter(MParameter newMDriveParameter) {
		if (newMDriveParameter != mDriveParameter) {
			NotificationChain msgs = null;
			if (mDriveParameter != null)
				msgs = ((InternalEObject)mDriveParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER, null, msgs);
			if (newMDriveParameter != null) {				
				newMDriveParameter.setDefaultDescription("Specifies either the full name of the CD-ROM drive or the drive letter.");
				newMDriveParameter.setDefaultName("Drive");
				newMDriveParameter.setValueType(Type.getTypeForName("Text"));
				newMDriveParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER));
				newMDriveParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDriveParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDriveParameter != null) {
				if(newMDriveParameter != null)
					newMDriveParameter.eAdapters().addAll(mDriveParameter.eAdapters());			
			
				mDriveParameter.eAdapters().clear();
			}
			msgs = basicSetMDriveParameter(newMDriveParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER, newMDriveParameter, newMDriveParameter));
	}

	/**
	 * Returns the value of the '<em><b>Drive Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Parameter</em>' attribute.
	 * @see #setDriveParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_DriveParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getDriveParameter() {
		return driveParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getDriveParameter <em>Drive Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDriveParameter the new value of the '<em>Drive Parameter</em>' attribute.
	 * @see #getDriveParameter()
	 * @generated
	 */
	public void setDriveParameter(String newDriveParameter) {
		String oldDriveParameter = driveParameter;
		driveParameter = newDriveParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER, oldDriveParameter, driveParameter));
	}

	/**
	 * Returns the value of the '<em><b>MTotal Recording Length Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTotal Recording Length Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTotal Recording Length Parameter</em>' containment reference.
	 * @see #setMTotalRecordingLengthParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_MTotalRecordingLengthParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Total recording length' description='Specifies the total length of the files to be burned to CD. The total length must not exceed 01:20:00.'"
	 * @generated
	 */
	public MParameter getMTotalRecordingLengthParameter() {
		return mTotalRecordingLengthParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTotalRecordingLengthParameter(MParameter newMTotalRecordingLengthParameter, NotificationChain msgs) {
		MParameter oldMTotalRecordingLengthParameter = mTotalRecordingLengthParameter;
		mTotalRecordingLengthParameter = newMTotalRecordingLengthParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER, oldMTotalRecordingLengthParameter, newMTotalRecordingLengthParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingLengthParameter <em>MTotal Recording Length Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMTotalRecordingLengthParameter the new value of the '<em>MTotal Recording Length Parameter</em>' containment reference.
	 * @see #getMTotalRecordingLengthParameter()
	 * @generated
	 */
	public void setMTotalRecordingLengthParameter(MParameter newMTotalRecordingLengthParameter) {
		if (newMTotalRecordingLengthParameter != mTotalRecordingLengthParameter) {
			NotificationChain msgs = null;
			if (mTotalRecordingLengthParameter != null)
				msgs = ((InternalEObject)mTotalRecordingLengthParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER, null, msgs);
			if (newMTotalRecordingLengthParameter != null) {				
				newMTotalRecordingLengthParameter.setDefaultDescription("Specifies the total length of the files to be burned to CD. The total length must not exceed 01:20:00.");
				newMTotalRecordingLengthParameter.setDefaultName("Total recording length");
				newMTotalRecordingLengthParameter.setValueType(Type.getTypeForName("Duration"));
				newMTotalRecordingLengthParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER));
				newMTotalRecordingLengthParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTotalRecordingLengthParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTotalRecordingLengthParameter != null) {
				if(newMTotalRecordingLengthParameter != null)
					newMTotalRecordingLengthParameter.eAdapters().addAll(mTotalRecordingLengthParameter.eAdapters());			
			
				mTotalRecordingLengthParameter.eAdapters().clear();
			}
			msgs = basicSetMTotalRecordingLengthParameter(newMTotalRecordingLengthParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER, newMTotalRecordingLengthParameter, newMTotalRecordingLengthParameter));
	}

	/**
	 * Returns the value of the '<em><b>Total Recording Length Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Recording Length Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Recording Length Parameter</em>' attribute.
	 * @see #setTotalRecordingLengthParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_TotalRecordingLengthParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDuration"
	 * @generated
	 */
	public Long getTotalRecordingLengthParameter() {
		return totalRecordingLengthParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingLengthParameter <em>Total Recording Length Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newTotalRecordingLengthParameter the new value of the '<em>Total Recording Length Parameter</em>' attribute.
	 * @see #getTotalRecordingLengthParameter()
	 * @generated
	 */
	public void setTotalRecordingLengthParameter(Long newTotalRecordingLengthParameter) {
		Long oldTotalRecordingLengthParameter = totalRecordingLengthParameter;
		totalRecordingLengthParameter = newTotalRecordingLengthParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER, oldTotalRecordingLengthParameter, totalRecordingLengthParameter));
	}

	/**
	 * Returns the value of the '<em><b>MTotal Recording File Size Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTotal Recording File Size Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTotal Recording File Size Parameter</em>' containment reference.
	 * @see #setMTotalRecordingFileSizeParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_MTotalRecordingFileSizeParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Total recording file size' description='Specifies the total size of the files to be burned to CD. The total size must not exceed 870,318,080.'"
	 * @generated
	 */
	public MParameter getMTotalRecordingFileSizeParameter() {
		return mTotalRecordingFileSizeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTotalRecordingFileSizeParameter(MParameter newMTotalRecordingFileSizeParameter, NotificationChain msgs) {
		MParameter oldMTotalRecordingFileSizeParameter = mTotalRecordingFileSizeParameter;
		mTotalRecordingFileSizeParameter = newMTotalRecordingFileSizeParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER, oldMTotalRecordingFileSizeParameter, newMTotalRecordingFileSizeParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingFileSizeParameter <em>MTotal Recording File Size Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMTotalRecordingFileSizeParameter the new value of the '<em>MTotal Recording File Size Parameter</em>' containment reference.
	 * @see #getMTotalRecordingFileSizeParameter()
	 * @generated
	 */
	public void setMTotalRecordingFileSizeParameter(MParameter newMTotalRecordingFileSizeParameter) {
		if (newMTotalRecordingFileSizeParameter != mTotalRecordingFileSizeParameter) {
			NotificationChain msgs = null;
			if (mTotalRecordingFileSizeParameter != null)
				msgs = ((InternalEObject)mTotalRecordingFileSizeParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER, null, msgs);
			if (newMTotalRecordingFileSizeParameter != null) {				
				newMTotalRecordingFileSizeParameter.setDefaultDescription("Specifies the total size of the files to be burned to CD. The total size must not exceed 870,318,080.");
				newMTotalRecordingFileSizeParameter.setDefaultName("Total recording file size");
				newMTotalRecordingFileSizeParameter.setValueType(Type.getTypeForName("Number"));
				newMTotalRecordingFileSizeParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER));
				newMTotalRecordingFileSizeParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTotalRecordingFileSizeParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTotalRecordingFileSizeParameter != null) {
				if(newMTotalRecordingFileSizeParameter != null)
					newMTotalRecordingFileSizeParameter.eAdapters().addAll(mTotalRecordingFileSizeParameter.eAdapters());			
			
				mTotalRecordingFileSizeParameter.eAdapters().clear();
			}
			msgs = basicSetMTotalRecordingFileSizeParameter(newMTotalRecordingFileSizeParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER, newMTotalRecordingFileSizeParameter, newMTotalRecordingFileSizeParameter));
	}

	/**
	 * Returns the value of the '<em><b>Total Recording File Size Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Recording File Size Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Recording File Size Parameter</em>' attribute.
	 * @see #setTotalRecordingFileSizeParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep_TotalRecordingFileSizeParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong"
	 * @generated
	 */
	public Long getTotalRecordingFileSizeParameter() {
		return totalRecordingFileSizeParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingFileSizeParameter <em>Total Recording File Size Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newTotalRecordingFileSizeParameter the new value of the '<em>Total Recording File Size Parameter</em>' attribute.
	 * @see #getTotalRecordingFileSizeParameter()
	 * @generated
	 */
	public void setTotalRecordingFileSizeParameter(Long newTotalRecordingFileSizeParameter) {
		Long oldTotalRecordingFileSizeParameter = totalRecordingFileSizeParameter;
		totalRecordingFileSizeParameter = newTotalRecordingFileSizeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER, oldTotalRecordingFileSizeParameter, totalRecordingFileSizeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:
				return basicSetMRecordingFilesParameter(null, msgs);
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				return basicSetMBurningSoftwareDirectoryPathParameter(null, msgs);
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:
				return basicSetMDriveParameter(null, msgs);
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:
				return basicSetMTotalRecordingLengthParameter(null, msgs);
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:
				return basicSetMTotalRecordingFileSizeParameter(null, msgs);
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
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:
				return getMRecordingFilesParameter();
			case LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER:
				return getRecordingFilesParameter();
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				return getMBurningSoftwareDirectoryPathParameter();
			case LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				return getBurningSoftwareDirectoryPathParameter();
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:
				return getMDriveParameter();
			case LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER:
				return getDriveParameter();
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:
				return getMTotalRecordingLengthParameter();
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER:
				return getTotalRecordingLengthParameter();
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:
				return getMTotalRecordingFileSizeParameter();
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER:
				return getTotalRecordingFileSizeParameter();
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
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:    
				setMRecordingFilesParameter((MParameter)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER:
				getRecordingFilesParameter().clear();
				getRecordingFilesParameter().addAll((Collection)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:    
				setMBurningSoftwareDirectoryPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:    
				setBurningSoftwareDirectoryPathParameter((File)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:    
				setMDriveParameter((MParameter)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER:    
				setDriveParameter((String)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:    
				setMTotalRecordingLengthParameter((MParameter)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER:    
				setTotalRecordingLengthParameter((Long)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:    
				setMTotalRecordingFileSizeParameter((MParameter)newValue);
				return;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER:    
				setTotalRecordingFileSizeParameter((Long)newValue);
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
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:
				setMRecordingFilesParameter((MParameter)null);
				return;
			case LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER:
				getRecordingFilesParameter().clear();
				return;
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				setMBurningSoftwareDirectoryPathParameter((MParameter)null);
				return;
			case LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				setBurningSoftwareDirectoryPathParameter(getDefaultBurningSoftwareDirectoryPathParameter());
				return;
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:
				setMDriveParameter((MParameter)null);
				return;
			case LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER:
				setDriveParameter(getDefaultDriveParameter());
				return;
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:
				setMTotalRecordingLengthParameter((MParameter)null);
				return;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER:
				setTotalRecordingLengthParameter(getDefaultTotalRecordingLengthParameter());
				return;
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:
				setMTotalRecordingFileSizeParameter((MParameter)null);
				return;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER:
				setTotalRecordingFileSizeParameter(getDefaultTotalRecordingFileSizeParameter());
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
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:
				return mRecordingFilesParameter != null;
			case LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER:
				return recordingFilesParameter != null && !recordingFilesParameter.isEmpty();
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				return mBurningSoftwareDirectoryPathParameter != null;
			case LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
				return getDefaultBurningSoftwareDirectoryPathParameter() == null ? burningSoftwareDirectoryPathParameter != null : !getDefaultBurningSoftwareDirectoryPathParameter().equals(burningSoftwareDirectoryPathParameter);
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:
				return mDriveParameter != null;
			case LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER:
				return getDefaultDriveParameter() == null ? driveParameter != null : !getDefaultDriveParameter().equals(driveParameter);
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:
				return mTotalRecordingLengthParameter != null;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER:
				return getDefaultTotalRecordingLengthParameter() == null ? totalRecordingLengthParameter != null : !getDefaultTotalRecordingLengthParameter().equals(totalRecordingLengthParameter);
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:
				return mTotalRecordingFileSizeParameter != null;
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER:
				return getDefaultTotalRecordingFileSizeParameter() == null ? totalRecordingFileSizeParameter != null : !getDefaultTotalRecordingFileSizeParameter().equals(totalRecordingFileSizeParameter);
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
		result.append(" (recordingFilesParameter: ");
		result.append(recordingFilesParameter);
		result.append(", burningSoftwareDirectoryPathParameter: ");
		result.append(burningSoftwareDirectoryPathParameter);
		result.append(", driveParameter: ");
		result.append(driveParameter);
		result.append(", totalRecordingLengthParameter: ");
		result.append(totalRecordingLengthParameter);
		result.append(", totalRecordingFileSizeParameter: ");
		result.append(totalRecordingFileSizeParameter);
		result.append(')');
		return result.toString();
	}

    /**
     * @see org.onceforall.dms.desktop.logic.MStep#execute()
     */
    protected void execute() throws Throwable {   
	    List<File> recordingFiles = getRecordingFilesParameter();
	    if(recordingFiles.size() == 0)
	        return;
	    
	    List<String> commandLineParameters = new ArrayList(6+recordingFiles.size());
	    String burningPath = getBurningSoftwareDirectoryPathParameter().getCanonicalPath();
	    commandLineParameters.add(burningPath+File.separator+"nerocmd.exe");
	    commandLineParameters.add("--write");
	    commandLineParameters.add("--underrun_prot");
	    commandLineParameters.add("--detect_non_empty_disc");
	    commandLineParameters.add("--audio");
	    commandLineParameters.add("--enable_abort");

	    if(simulated) {
	    	File imageFile = new File("Test Output Files\\Service CD.img");
	    	imageFile.delete();
	    	imageFile.getParentFile().mkdirs();
		    commandLineParameters.add("--drivename \"Image Recorder\"");
	    	commandLineParameters.add("--output_image \""+imageFile.getCanonicalPath()+"\"");
	    }
	    else
		    commandLineParameters.add("--drivename \""+getDriveParameter()+"\"");
	    	
	    Iterator iterator = recordingFiles.iterator();
	    while(iterator.hasNext())
	    	commandLineParameters.add("\""+((File) iterator.next()).getCanonicalPath()+"\"");

	    String result = CommandLineInterface.execute(commandLineParameters.toArray(EMPTY_STRING_ARRAY), this, null);
	    Logger.getLogger().finest(result);
	}
    
    /**
     * Updates the total recording size and length according to the recording files parameter.
     * It reads the actual sizes of the files and calculates the length.
     */
    protected void updateTotalSizeAndLength() {
        boolean empty = true;
        long totalSize = 0;
        long totalLength = 0;
	    List<File> recordingFiles = getRecordingFilesParameter();
	    if(recordingFiles != null)
		    for(File recordingFile: recordingFiles)
		        if(recordingFile != null) {
		            totalSize += recordingFile.length();
		            totalLength += AudioInterface.calculateLength(recordingFile);
		            empty = false;
		        }
	    
	    if(!empty) {
		    // Calculates the total length of the recording in milliseconds.
	    	setTotalRecordingFileSizeParameter(new Long(totalSize));
	    	setTotalRecordingLengthParameter(new Long(totalLength));
	    }
	    else {
	    	setTotalRecordingFileSizeParameter(null);
	    	setTotalRecordingLengthParameter(null);
	    }
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#validate()
	 */
	@Override
	public void validate() throws DesktopException {
        super.validate();
        
        updateTotalSizeAndLength();
        
        if(getTotalRecordingFileSizeParameter() > MAX_RECORDING_SIZE
                || getTotalRecordingLengthParameter() > MAX_RECORDING_LENGTH)
            throw new DesktopException("The total length of the recordings must not exceed "+Type.DURATION_TYPE.getValueForUI(new Long(MAX_RECORDING_LENGTH))+" and the total recording file(s) length "
                    +Type.LONG_TYPE+" bytes.", "Please use a wave file editor to reduce the size of the recording files or burn less files to CD.", DesktopException.ERROR_SEVERITY, null);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#terminate()
	 */
	@Override
	public void terminate() {
        setStateProperty(MStepStateType.TERMINATING_STATE);
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification) {
		super.eNotify(notification);
		
		if(notification.getFeature() instanceof EStructuralFeature && ((EStructuralFeature) notification.getFeature()).getFeatureID() == LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER
				&& hasMValueChanged(notification)) {
				updateTotalSizeAndLength();	
		}
	}

} // MBurnCdStep