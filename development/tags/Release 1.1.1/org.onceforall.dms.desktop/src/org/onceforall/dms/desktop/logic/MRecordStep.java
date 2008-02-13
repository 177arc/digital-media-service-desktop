/*
 * Revision History:
 * $Log: MRecordStep.java,v $
 * Revision 1.3  2007/05/12 10:56:29  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Date;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.interfaces.AudioInterface;
import org.onceforall.dms.desktop.logic.types.DurationType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRecord Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getMDirectoryParameter <em>MDirectory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getDirectoryParameter <em>Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileParameter <em>MRecording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileParameter <em>Recording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileResult <em>MRecording File Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileResult <em>Recording File Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileSizeResult <em>MRecording File Size Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileSizeResult <em>Recording File Size Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingLengthResult <em>MRecording Length Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingLengthResult <em>Recording Length Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Record' description='Records from the main audio input line to an uncompressed WAV file. Please make sure that the input level will not exceed the maximum.' iconFilePath='Image Files/Record step.gif' actionName='Record' actionIconFilePath='Image Files/Record.gif' interruptable='true' stoppable='true' terminatable='false'"
 * @generated
 */
public class MRecordStep extends MAudioStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MRecordStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MRecordStep.TYPE_NAME, new ReferenceType("Reference to "+MRecordStep.TYPE_NAME, "Specifies a reference to a "+MRecordStep.TYPE_NAME_FOR_UI, MRecordStep.class));
	}
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
	 * The cached value of the '{@link #getMRecordingFileParameter() <em>MRecording File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingFileParameter = null;

	/**
	 * The default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File RECORDING_FILE_PARAMETER_EDEFAULT = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Recording.wav");

	/**
	 * Get the default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultRecordingFileParameter() {
		return RECORDING_FILE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected File recordingFileParameter = RECORDING_FILE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingFileResult() <em>MRecording File Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingFileResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mRecordingFileResult = null;

	/**
	 * The default value of the '{@link #getRecordingFileResult() <em>Recording File Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileResult()
	 * @generated
	 * @ordered
	 */
	protected static final File RECORDING_FILE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingFileResult() <em>Recording File Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingFileResult() <em>Recording File Result</em>}' attribute.
	 * @see #getRecordingFileResult()
	 * @generated
	 * @ordered
	 */
	public File getDefaultRecordingFileResult() {
		return RECORDING_FILE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingFileResult() <em>Recording File Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileResult()
	 * @generated
	 * @ordered
	 */
	protected File recordingFileResult = RECORDING_FILE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingFileSizeResult() <em>MRecording File Size Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingFileSizeResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mRecordingFileSizeResult = null;

	/**
	 * The default value of the '{@link #getRecordingFileSizeResult() <em>Recording File Size Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileSizeResult()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECORDING_FILE_SIZE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingFileSizeResult() <em>Recording File Size Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingFileSizeResult() <em>Recording File Size Result</em>}' attribute.
	 * @see #getRecordingFileSizeResult()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultRecordingFileSizeResult() {
		return RECORDING_FILE_SIZE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingFileSizeResult() <em>Recording File Size Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileSizeResult()
	 * @generated
	 * @ordered
	 */
	protected Long recordingFileSizeResult = RECORDING_FILE_SIZE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingLengthResult() <em>MRecording Length Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingLengthResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mRecordingLengthResult = null;

	/**
	 * The default value of the '{@link #getRecordingLengthResult() <em>Recording Length Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingLengthResult()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECORDING_LENGTH_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingLengthResult() <em>Recording Length Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingLengthResult() <em>Recording Length Result</em>}' attribute.
	 * @see #getRecordingLengthResult()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultRecordingLengthResult() {
		return RECORDING_LENGTH_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingLengthResult() <em>Recording Length Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingLengthResult()
	 * @generated
	 * @ordered
	 */
	protected Long recordingLengthResult = RECORDING_LENGTH_RESULT_EDEFAULT;

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
		return "Record";
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
		return true;
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Record.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Record step.gif");
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
		return "Records from the main audio input line to an uncompressed WAV file. Please make sure that the input level will not exceed the maximum.";
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
		return "Record";
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
		return true;
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
	protected MRecordStep() {
		super();
		
		firstMRecordStepConstructorHook();
				
		description = "Records from the main audio input line to an uncompressed WAV file. Please make sure that the input level will not exceed the maximum.";
		stoppable = true;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Record.gif");
		name = "Record";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Record step.gif");
		terminatable = false;
		interruptable = true;
		actionName = "Record";
					 
		setMDirectoryParameter(new MParameter(false, "Directory", "Specifies the path of the created directory where the recordings will be stored.", null));			 
		setMRecordingFileParameter(new MParameter(false, "Recording file", "Specifies the name of the WAVE file to be recorded.", null));			 
		setMRecordingFileResult(new MResult(false, "Recording file", "Specifies the path of the recorded WAVE file.", null));			 
		setMRecordingFileSizeResult(new MResult(false, "Recording file size", "Specifies the size of the recorded WAVE file in bytes.", null));			 
		setMRecordingLengthResult(new MResult(false, "Recording length", "Specifies the length of the recording.", null));

		lastMRecordStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMRecordStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMRecordStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MRECORD_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MRecording File Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording File Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording File Parameter</em>' containment reference.
	 * @see #setMRecordingFileParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_MRecordingFileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording file' description='Specifies the name of the WAVE file to be recorded.'"
	 * @generated
	 */
	public MParameter getMRecordingFileParameter() {
		return mRecordingFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingFileParameter(MParameter newMRecordingFileParameter, NotificationChain msgs) {
		MParameter oldMRecordingFileParameter = mRecordingFileParameter;
		mRecordingFileParameter = newMRecordingFileParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER, oldMRecordingFileParameter, newMRecordingFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileParameter <em>MRecording File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRecordingFileParameter the new value of the '<em>MRecording File Parameter</em>' containment reference.
	 * @see #getMRecordingFileParameter()
	 * @generated
	 */
	public void setMRecordingFileParameter(MParameter newMRecordingFileParameter) {
		if (newMRecordingFileParameter != mRecordingFileParameter) {
			NotificationChain msgs = null;
			if (mRecordingFileParameter != null)
				msgs = ((InternalEObject)mRecordingFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
			if (newMRecordingFileParameter != null) {				
				newMRecordingFileParameter.setDefaultDescription("Specifies the name of the WAVE file to be recorded.");
				newMRecordingFileParameter.setDefaultName("Recording file");
				newMRecordingFileParameter.setValueType(Type.getTypeForName("File"));
				newMRecordingFileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER));
				newMRecordingFileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingFileParameter != null) {
				if(newMRecordingFileParameter != null)
					newMRecordingFileParameter.eAdapters().addAll(mRecordingFileParameter.eAdapters());			
			
				mRecordingFileParameter.eAdapters().clear();
			}
			msgs = basicSetMRecordingFileParameter(newMRecordingFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER, newMRecordingFileParameter, newMRecordingFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording File Parameter</b></em>' attribute.
	 * The default value is <code>"Recording.wav"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording File Parameter</em>' attribute.
	 * @see #setRecordingFileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_RecordingFileParameter()
	 * @model default="Recording.wav" dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getRecordingFileParameter() {
		return recordingFileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileParameter <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecordingFileParameter the new value of the '<em>Recording File Parameter</em>' attribute.
	 * @see #getRecordingFileParameter()
	 * @generated
	 */
	public void setRecordingFileParameter(File newRecordingFileParameter) {
		File oldRecordingFileParameter = recordingFileParameter;
		recordingFileParameter = newRecordingFileParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER, oldRecordingFileParameter, recordingFileParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_MDirectoryParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER, oldMDirectoryParameter, newMDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMDirectoryParameter <em>MDirectory Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER, null, msgs);
			if (newMDirectoryParameter != null) {				
				newMDirectoryParameter.setDefaultDescription("Specifies the path of the created directory where the recordings will be stored.");
				newMDirectoryParameter.setDefaultName("Directory");
				newMDirectoryParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER));
				newMDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER, newMDirectoryParameter, newMDirectoryParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_DirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getDirectoryParameter() {
		return directoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getDirectoryParameter <em>Directory Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER, oldDirectoryParameter, directoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MRecording File Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording File Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording File Result</em>' containment reference.
	 * @see #setMRecordingFileResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_MRecordingFileResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording file' description='Specifies the path of the recorded WAVE file.'"
	 * @generated
	 */
	public MResult getMRecordingFileResult() {
		return mRecordingFileResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingFileResult(MResult newMRecordingFileResult, NotificationChain msgs) {
		MResult oldMRecordingFileResult = mRecordingFileResult;
		mRecordingFileResult = newMRecordingFileResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT, oldMRecordingFileResult, newMRecordingFileResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileResult <em>MRecording File Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRecordingFileResult the new value of the '<em>MRecording File Result</em>' containment reference.
	 * @see #getMRecordingFileResult()
	 * @generated
	 */
	public void setMRecordingFileResult(MResult newMRecordingFileResult) {
		if (newMRecordingFileResult != mRecordingFileResult) {
			NotificationChain msgs = null;
			if (mRecordingFileResult != null)
				msgs = ((InternalEObject)mRecordingFileResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT, null, msgs);
			if (newMRecordingFileResult != null) {				
				newMRecordingFileResult.setDefaultDescription("Specifies the path of the recorded WAVE file.");
				newMRecordingFileResult.setDefaultName("Recording file");
				newMRecordingFileResult.setValueType(Type.getTypeForName("File (must exist)"));
				newMRecordingFileResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT));
				newMRecordingFileResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFileResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingFileResult != null) {
				if(newMRecordingFileResult != null)
					newMRecordingFileResult.eAdapters().addAll(mRecordingFileResult.eAdapters());			
			
				mRecordingFileResult.eAdapters().clear();
			}
			msgs = basicSetMRecordingFileResult(newMRecordingFileResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT, newMRecordingFileResult, newMRecordingFileResult));
	}

	/**
	 * Returns the value of the '<em><b>Recording File Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording File Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording File Result</em>' attribute.
	 * @see #setRecordingFileResult(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_RecordingFileResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true" transient="true"
	 * @generated
	 */
	public File getRecordingFileResult() {
		return recordingFileResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileResult <em>Recording File Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecordingFileResult the new value of the '<em>Recording File Result</em>' attribute.
	 * @see #getRecordingFileResult()
	 * @generated
	 */
	public void setRecordingFileResult(File newRecordingFileResult) {
		File oldRecordingFileResult = recordingFileResult;
		recordingFileResult = newRecordingFileResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT, oldRecordingFileResult, recordingFileResult));
	}

	/**
	 * Returns the value of the '<em><b>MRecording File Size Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording File Size Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording File Size Result</em>' containment reference.
	 * @see #setMRecordingFileSizeResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_MRecordingFileSizeResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording file size' description='Specifies the size of the recorded WAVE file in bytes.'"
	 * @generated
	 */
	public MResult getMRecordingFileSizeResult() {
		return mRecordingFileSizeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingFileSizeResult(MResult newMRecordingFileSizeResult, NotificationChain msgs) {
		MResult oldMRecordingFileSizeResult = mRecordingFileSizeResult;
		mRecordingFileSizeResult = newMRecordingFileSizeResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT, oldMRecordingFileSizeResult, newMRecordingFileSizeResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileSizeResult <em>MRecording File Size Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRecordingFileSizeResult the new value of the '<em>MRecording File Size Result</em>' containment reference.
	 * @see #getMRecordingFileSizeResult()
	 * @generated
	 */
	public void setMRecordingFileSizeResult(MResult newMRecordingFileSizeResult) {
		if (newMRecordingFileSizeResult != mRecordingFileSizeResult) {
			NotificationChain msgs = null;
			if (mRecordingFileSizeResult != null)
				msgs = ((InternalEObject)mRecordingFileSizeResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT, null, msgs);
			if (newMRecordingFileSizeResult != null) {				
				newMRecordingFileSizeResult.setDefaultDescription("Specifies the size of the recorded WAVE file in bytes.");
				newMRecordingFileSizeResult.setDefaultName("Recording file size");
				newMRecordingFileSizeResult.setValueType(Type.getTypeForName("Number"));
				newMRecordingFileSizeResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT));
				newMRecordingFileSizeResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFileSizeResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingFileSizeResult != null) {
				if(newMRecordingFileSizeResult != null)
					newMRecordingFileSizeResult.eAdapters().addAll(mRecordingFileSizeResult.eAdapters());			
			
				mRecordingFileSizeResult.eAdapters().clear();
			}
			msgs = basicSetMRecordingFileSizeResult(newMRecordingFileSizeResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT, newMRecordingFileSizeResult, newMRecordingFileSizeResult));
	}

	/**
	 * Returns the value of the '<em><b>Recording File Size Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording File Size Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording File Size Result</em>' attribute.
	 * @see #setRecordingFileSizeResult(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_RecordingFileSizeResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" required="true" transient="true"
	 * @generated
	 */
	public Long getRecordingFileSizeResult() {
		return recordingFileSizeResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileSizeResult <em>Recording File Size Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecordingFileSizeResult the new value of the '<em>Recording File Size Result</em>' attribute.
	 * @see #getRecordingFileSizeResult()
	 * @generated
	 */
	public void setRecordingFileSizeResult(Long newRecordingFileSizeResult) {
		Long oldRecordingFileSizeResult = recordingFileSizeResult;
		recordingFileSizeResult = newRecordingFileSizeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT, oldRecordingFileSizeResult, recordingFileSizeResult));
	}

	/**
	 * Returns the value of the '<em><b>MRecording Length Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Length Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Length Result</em>' containment reference.
	 * @see #setMRecordingLengthResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_MRecordingLengthResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording length' description='Specifies the length of the recording.'"
	 * @generated
	 */
	public MResult getMRecordingLengthResult() {
		return mRecordingLengthResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingLengthResult(MResult newMRecordingLengthResult, NotificationChain msgs) {
		MResult oldMRecordingLengthResult = mRecordingLengthResult;
		mRecordingLengthResult = newMRecordingLengthResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT, oldMRecordingLengthResult, newMRecordingLengthResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingLengthResult <em>MRecording Length Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRecordingLengthResult the new value of the '<em>MRecording Length Result</em>' containment reference.
	 * @see #getMRecordingLengthResult()
	 * @generated
	 */
	public void setMRecordingLengthResult(MResult newMRecordingLengthResult) {
		if (newMRecordingLengthResult != mRecordingLengthResult) {
			NotificationChain msgs = null;
			if (mRecordingLengthResult != null)
				msgs = ((InternalEObject)mRecordingLengthResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT, null, msgs);
			if (newMRecordingLengthResult != null) {				
				newMRecordingLengthResult.setDefaultDescription("Specifies the length of the recording.");
				newMRecordingLengthResult.setDefaultName("Recording length");
				newMRecordingLengthResult.setValueType(Type.getTypeForName("Duration"));
				newMRecordingLengthResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT));
				newMRecordingLengthResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingLengthResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingLengthResult != null) {
				if(newMRecordingLengthResult != null)
					newMRecordingLengthResult.eAdapters().addAll(mRecordingLengthResult.eAdapters());			
			
				mRecordingLengthResult.eAdapters().clear();
			}
			msgs = basicSetMRecordingLengthResult(newMRecordingLengthResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT, newMRecordingLengthResult, newMRecordingLengthResult));
	}

	/**
	 * Returns the value of the '<em><b>Recording Length Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Length Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Length Result</em>' attribute.
	 * @see #setRecordingLengthResult(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep_RecordingLengthResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDuration" required="true" transient="true"
	 * @generated
	 */
	public Long getRecordingLengthResult() {
		return recordingLengthResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingLengthResult <em>Recording Length Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecordingLengthResult the new value of the '<em>Recording Length Result</em>' attribute.
	 * @see #getRecordingLengthResult()
	 * @generated
	 */
	public void setRecordingLengthResult(Long newRecordingLengthResult) {
		Long oldRecordingLengthResult = recordingLengthResult;
		recordingLengthResult = newRecordingLengthResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT, oldRecordingLengthResult, recordingLengthResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:
				return basicSetMDirectoryParameter(null, msgs);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:
				return basicSetMRecordingFileParameter(null, msgs);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:
				return basicSetMRecordingFileResult(null, msgs);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:
				return basicSetMRecordingFileSizeResult(null, msgs);
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:
				return basicSetMRecordingLengthResult(null, msgs);
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
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:
				return getMDirectoryParameter();
			case LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER:
				return getDirectoryParameter();
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:
				return getMRecordingFileParameter();
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER:
				return getRecordingFileParameter();
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:
				return getMRecordingFileResult();
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT:
				return getRecordingFileResult();
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:
				return getMRecordingFileSizeResult();
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT:
				return getRecordingFileSizeResult();
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:
				return getMRecordingLengthResult();
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT:
				return getRecordingLengthResult();
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
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:    
				setMDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER:    
				setDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:    
				setMRecordingFileParameter((MParameter)newValue);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER:    
				setRecordingFileParameter((File)newValue);
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:    
				setMRecordingFileResult((MResult)newValue);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT:    
				setRecordingFileResult((File)newValue);
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:    
				setMRecordingFileSizeResult((MResult)newValue);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT:    
				setRecordingFileSizeResult((Long)newValue);
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:    
				setMRecordingLengthResult((MResult)newValue);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT:    
				setRecordingLengthResult((Long)newValue);
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
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter(getDefaultDirectoryParameter());
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:
				setMRecordingFileParameter((MParameter)null);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER:
				setRecordingFileParameter(getDefaultRecordingFileParameter());
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:
				setMRecordingFileResult((MResult)null);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT:
				setRecordingFileResult(getDefaultRecordingFileResult());
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:
				setMRecordingFileSizeResult((MResult)null);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT:
				setRecordingFileSizeResult(getDefaultRecordingFileSizeResult());
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:
				setMRecordingLengthResult((MResult)null);
				return;
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT:
				setRecordingLengthResult(getDefaultRecordingLengthResult());
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
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:
				return mDirectoryParameter != null;
			case LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER:
				return getDefaultDirectoryParameter() == null ? directoryParameter != null : !getDefaultDirectoryParameter().equals(directoryParameter);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:
				return mRecordingFileParameter != null;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER:
				return getDefaultRecordingFileParameter() == null ? recordingFileParameter != null : !getDefaultRecordingFileParameter().equals(recordingFileParameter);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:
				return mRecordingFileResult != null;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT:
				return getDefaultRecordingFileResult() == null ? recordingFileResult != null : !getDefaultRecordingFileResult().equals(recordingFileResult);
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:
				return mRecordingFileSizeResult != null;
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT:
				return getDefaultRecordingFileSizeResult() == null ? recordingFileSizeResult != null : !getDefaultRecordingFileSizeResult().equals(recordingFileSizeResult);
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:
				return mRecordingLengthResult != null;
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT:
				return getDefaultRecordingLengthResult() == null ? recordingLengthResult != null : !getDefaultRecordingLengthResult().equals(recordingLengthResult);
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
		result.append(" (directoryParameter: ");
		result.append(directoryParameter);
		result.append(", recordingFileParameter: ");
		result.append(recordingFileParameter);
		result.append(", recordingFileResult: ");
		result.append(recordingFileResult);
		result.append(", recordingFileSizeResult: ");
		result.append(recordingFileSizeResult);
		result.append(", recordingLengthResult: ");
		result.append(recordingLengthResult);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
        File recordingFile = null;

        getDirectoryParameter().mkdirs();
        
        thread.setPriority(Thread.MAX_PRIORITY);

        AudioFileFormat audioFileFormat = new AudioFileFormat(AudioFileFormat.Type.WAVE, AudioInterface.FORMAT, AudioSystem.NOT_SPECIFIED);
        recordingFile = new File(getDirectoryParameter().getPath()+File.separator+getRecordingFileParameter().getName());
        
        // Starts the line and progress thread.
        (new ProgressMonitorThread()).start();
        
        // Writes the sound to the recording file, till the line is stopped.
        AudioSystem.write(audioInputStream, audioFileFormat.getType(), recordingFile);

        
        if(recordingFile != null) {
            setRecordingFileResult(recordingFile);
            setRecordingFileSizeResult(new Long(recordingFile.length()));            
            setRecordingLengthResult(new Long(AudioInterface.calculateLength(recordingFile)));
        }                
	}
	
	
    /**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {
		if(getMRecordingFileParameter().equals(mOwnerValue) ) {
		    String part = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
		   
		    if(part == null)
		        return super.convertMInputValues(mOwnerValue);
		    
		    return new File(Utilities.convertToFileName(part)+".wav");
		}
		else
			return super.convertMInputValues(mOwnerValue);
	}


	/** 
     * Defines the thread that updates the progress property with the lenght of the recording.
     */
    class ProgressMonitorThread extends Thread {
        /**
         * Creates a new progress monitor thread for this record step.
         */
        public ProgressMonitorThread() {
            super(name+" progress monitor");
        }
        
         /**
         * @see java.lang.Runnable#run()
         */
        public void run() {
            while(audioInputStream.getClosed())
                // Waits till the steps starts reading from the audio input stream.
                try {
                    Thread.sleep(200);
                } catch (InterruptedException exception) {}
            
            Date recordingTime = new Date();
            recordingTime.setTime(0);
            
            long startTime = System.currentTimeMillis();
            long pausedTime = 0;
            boolean pausedTimingStarted = false;
            
            String reordingTimeForUI = null;
            while(!audioInputStream.getClosed()) {
                if(!audioInputStream.getPaused()) {
                    if(pausedTimingStarted) {
                        startTime += System.currentTimeMillis()- pausedTime;
                        pausedTimingStarted = false;
                    }
                        
	                recordingTime.setTime(System.currentTimeMillis() - startTime);
	                
	                // Updates the progress property if the formatted recording time has changed.
	                String newReordingTimeForUI = DurationType.FORMATTER.format(recordingTime);
	                if(!newReordingTimeForUI.equals(reordingTimeForUI)) {
	                    reordingTimeForUI = newReordingTimeForUI;
	                    setProgressStatusProperty(reordingTimeForUI);
	                }
                }
                else if(!pausedTimingStarted) {
                        pausedTime = System.currentTimeMillis();
                        pausedTimingStarted = true;
                    }
  
                
                try {
                    sleep(100);
                } catch (InterruptedException exception) {
                }
            }

            setProgressStatusProperty(DurationType.FORMATTER.format(recordingTime));
        }
    }

} // MRecordStep