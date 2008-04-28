/*
 * Revision History:
 * $Log: MConvertToMP3Step.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.interfaces.CommandLineInterface;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConvert To MP3 Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter <em>Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter <em>MMp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter <em>Mp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter <em>MRecording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter <em>Recording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter <em>MMp3 Encoder Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter <em>Mp3 Encoder Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter <em>MAverage Bit Rate Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter <em>Average Bit Rate Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Convert to MP3' description='Converts a WAVE file to MP3 format using the LAME encoder.' iconFilePath='Image Files/Convert to MP3 step.gif' actionName='Convert' actionIconFilePath='Image Files/Convert.gif' interruptable='false' stoppable='false' terminatable='true'"
 * @generated
 */
public class MConvertToMP3Step extends MTagStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MConvertToMP3Step.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MConvertToMP3Step.TYPE_NAME, new ReferenceType("Reference to "+MConvertToMP3Step.TYPE_NAME, "Specifies a reference to a "+MConvertToMP3Step.TYPE_NAME_FOR_UI, MConvertToMP3Step.class));
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
	 * The cached value of the '{@link #getMMp3FileNameParameter() <em>MMp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3FileNameParameter = null;

	/**
	 * The default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_FILE_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3FileNameParameter() {
		return MP3_FILE_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected File mp3FileNameParameter = MP3_FILE_NAME_PARAMETER_EDEFAULT;

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
	protected static final File RECORDING_FILE_PARAMETER_EDEFAULT = null;

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
	 * The cached value of the '{@link #getMMp3EncoderPathParameter() <em>MMp3 Encoder Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3EncoderPathParameter = null;

	/**
	 * The default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_ENCODER_PATH_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3EncoderPathParameter() {
		return MP3_ENCODER_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected File mp3EncoderPathParameter = MP3_ENCODER_PATH_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMAverageBitRateParameter() <em>MAverage Bit Rate Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mAverageBitRateParameter = null;

	/**
	 * The default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BIT_RATE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultAverageBitRateParameter() {
		return AVERAGE_BIT_RATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected Long averageBitRateParameter = AVERAGE_BIT_RATE_PARAMETER_EDEFAULT;

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
		return "Convert";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert to MP3 step.gif");
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
		return "Converts a WAVE file to MP3 format using the LAME encoder.";
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
		return "Convert to MP3";
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
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MConvertToMP3Step() {
		super();
		
		firstMConvertToMP3StepConstructorHook();
				
		description = "Converts a WAVE file to MP3 format using the LAME encoder.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert.gif");
		name = "Convert to MP3";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert to MP3 step.gif");
		terminatable = true;
		interruptable = false;
		actionName = "Convert";
					 
		setMDirectoryParameter(new MParameter(false, "Directory", "Specifies the directory where the converted MP3 file should be saved.", null));			 
		setMMp3FileNameParameter(new MParameter(false, "MP3 file name", "Specifies the name of the MP3 file.", null));			 
		setMRecordingFileParameter(new MParameter(false, "Recording file", "Contains the name of the recorded WAVE file.", null));			 
		setMMp3EncoderPathParameter(new MParameter(false, "MP3 encoder path", "Specifies the path to the directory that contains the \'lame.exe\'.", null));			 
		setMAverageBitRateParameter(new MParameter(false, "Average bit rate", "Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.", null));

		lastMConvertToMP3StepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMConvertToMP3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMConvertToMP3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MCONVERT_TO_MP3_STEP;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory' description='Specifies the directory where the converted MP3 file should be saved.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, oldMDirectoryParameter, newMDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
			if (newMDirectoryParameter != null) {				
				newMDirectoryParameter.setDefaultDescription("Specifies the directory where the converted MP3 file should be saved.");
				newMDirectoryParameter.setDefaultName("Directory");
				newMDirectoryParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER));
				newMDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, newMDirectoryParameter, newMDirectoryParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_DirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getDirectoryParameter() {
		return directoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter <em>Directory Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER, oldDirectoryParameter, directoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 File Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 File Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 File Name Parameter</em>' containment reference.
	 * @see #setMMp3FileNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3FileNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 file name' description='Specifies the name of the MP3 file.'"
	 * @generated
	 */
	public MParameter getMMp3FileNameParameter() {
		return mMp3FileNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FileNameParameter(MParameter newMMp3FileNameParameter, NotificationChain msgs) {
		MParameter oldMMp3FileNameParameter = mMp3FileNameParameter;
		mMp3FileNameParameter = newMMp3FileNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, oldMMp3FileNameParameter, newMMp3FileNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter <em>MMp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FileNameParameter the new value of the '<em>MMp3 File Name Parameter</em>' containment reference.
	 * @see #getMMp3FileNameParameter()
	 * @generated
	 */
	public void setMMp3FileNameParameter(MParameter newMMp3FileNameParameter) {
		if (newMMp3FileNameParameter != mMp3FileNameParameter) {
			NotificationChain msgs = null;
			if (mMp3FileNameParameter != null)
				msgs = ((InternalEObject)mMp3FileNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, null, msgs);
			if (newMMp3FileNameParameter != null) {				
				newMMp3FileNameParameter.setDefaultDescription("Specifies the name of the MP3 file.");
				newMMp3FileNameParameter.setDefaultName("MP3 file name");
				newMMp3FileNameParameter.setValueType(Type.getTypeForName("File"));
				newMMp3FileNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER));
				newMMp3FileNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FileNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FileNameParameter != null) {
				if(newMMp3FileNameParameter != null)
					newMMp3FileNameParameter.eAdapters().addAll(mMp3FileNameParameter.eAdapters());			
			
				mMp3FileNameParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3FileNameParameter(newMMp3FileNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, newMMp3FileNameParameter, newMMp3FileNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 File Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 File Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 File Name Parameter</em>' attribute.
	 * @see #setMp3FileNameParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3FileNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getMp3FileNameParameter() {
		return mp3FileNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FileNameParameter the new value of the '<em>Mp3 File Name Parameter</em>' attribute.
	 * @see #getMp3FileNameParameter()
	 * @generated
	 */
	public void setMp3FileNameParameter(File newMp3FileNameParameter) {
		File oldMp3FileNameParameter = mp3FileNameParameter;
		mp3FileNameParameter = newMp3FileNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER, oldMp3FileNameParameter, mp3FileNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MRecordingFileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording file' description='Contains the name of the recorded WAVE file.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, oldMRecordingFileParameter, newMRecordingFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter <em>MRecording File Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mRecordingFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
			if (newMRecordingFileParameter != null) {				
				newMRecordingFileParameter.setDefaultDescription("Contains the name of the recorded WAVE file.");
				newMRecordingFileParameter.setDefaultName("Recording file");
				newMRecordingFileParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMRecordingFileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER));
				newMRecordingFileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, newMRecordingFileParameter, newMRecordingFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording File Parameter</em>' attribute.
	 * @see #setRecordingFileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_RecordingFileParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getRecordingFileParameter() {
		return recordingFileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter <em>Recording File Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER, oldRecordingFileParameter, recordingFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Encoder Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Encoder Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Encoder Path Parameter</em>' containment reference.
	 * @see #setMMp3EncoderPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3EncoderPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 encoder path' description='Specifies the path to the directory that contains the \'lame.exe\'.'"
	 * @generated
	 */
	public MParameter getMMp3EncoderPathParameter() {
		return mMp3EncoderPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EncoderPathParameter(MParameter newMMp3EncoderPathParameter, NotificationChain msgs) {
		MParameter oldMMp3EncoderPathParameter = mMp3EncoderPathParameter;
		mMp3EncoderPathParameter = newMMp3EncoderPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, oldMMp3EncoderPathParameter, newMMp3EncoderPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter <em>MMp3 Encoder Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EncoderPathParameter the new value of the '<em>MMp3 Encoder Path Parameter</em>' containment reference.
	 * @see #getMMp3EncoderPathParameter()
	 * @generated
	 */
	public void setMMp3EncoderPathParameter(MParameter newMMp3EncoderPathParameter) {
		if (newMMp3EncoderPathParameter != mMp3EncoderPathParameter) {
			NotificationChain msgs = null;
			if (mMp3EncoderPathParameter != null)
				msgs = ((InternalEObject)mMp3EncoderPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, null, msgs);
			if (newMMp3EncoderPathParameter != null) {				
				newMMp3EncoderPathParameter.setDefaultDescription("Specifies the path to the directory that contains the \'lame.exe\'.");
				newMMp3EncoderPathParameter.setDefaultName("MP3 encoder path");
				newMMp3EncoderPathParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMMp3EncoderPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER));
				newMMp3EncoderPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EncoderPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EncoderPathParameter != null) {
				if(newMMp3EncoderPathParameter != null)
					newMMp3EncoderPathParameter.eAdapters().addAll(mMp3EncoderPathParameter.eAdapters());			
			
				mMp3EncoderPathParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3EncoderPathParameter(newMMp3EncoderPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, newMMp3EncoderPathParameter, newMMp3EncoderPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Encoder Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Encoder Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Encoder Path Parameter</em>' attribute.
	 * @see #setMp3EncoderPathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3EncoderPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getMp3EncoderPathParameter() {
		return mp3EncoderPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EncoderPathParameter the new value of the '<em>Mp3 Encoder Path Parameter</em>' attribute.
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 */
	public void setMp3EncoderPathParameter(File newMp3EncoderPathParameter) {
		File oldMp3EncoderPathParameter = mp3EncoderPathParameter;
		mp3EncoderPathParameter = newMp3EncoderPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER, oldMp3EncoderPathParameter, mp3EncoderPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MAverage Bit Rate Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAverage Bit Rate Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAverage Bit Rate Parameter</em>' containment reference.
	 * @see #setMAverageBitRateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MAverageBitRateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Average bit rate' description='Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.'"
	 * @generated
	 */
	public MParameter getMAverageBitRateParameter() {
		return mAverageBitRateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAverageBitRateParameter(MParameter newMAverageBitRateParameter, NotificationChain msgs) {
		MParameter oldMAverageBitRateParameter = mAverageBitRateParameter;
		mAverageBitRateParameter = newMAverageBitRateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, oldMAverageBitRateParameter, newMAverageBitRateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter <em>MAverage Bit Rate Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMAverageBitRateParameter the new value of the '<em>MAverage Bit Rate Parameter</em>' containment reference.
	 * @see #getMAverageBitRateParameter()
	 * @generated
	 */
	public void setMAverageBitRateParameter(MParameter newMAverageBitRateParameter) {
		if (newMAverageBitRateParameter != mAverageBitRateParameter) {
			NotificationChain msgs = null;
			if (mAverageBitRateParameter != null)
				msgs = ((InternalEObject)mAverageBitRateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, null, msgs);
			if (newMAverageBitRateParameter != null) {				
				newMAverageBitRateParameter.setDefaultDescription("Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.");
				newMAverageBitRateParameter.setDefaultName("Average bit rate");
				newMAverageBitRateParameter.setValueType(Type.getTypeForName("Number"));
				newMAverageBitRateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER));
				newMAverageBitRateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMAverageBitRateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mAverageBitRateParameter != null) {
				if(newMAverageBitRateParameter != null)
					newMAverageBitRateParameter.eAdapters().addAll(mAverageBitRateParameter.eAdapters());			
			
				mAverageBitRateParameter.eAdapters().clear();
			}
			msgs = basicSetMAverageBitRateParameter(newMAverageBitRateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, newMAverageBitRateParameter, newMAverageBitRateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Average Bit Rate Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Bit Rate Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Bit Rate Parameter</em>' attribute.
	 * @see #setAverageBitRateParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_AverageBitRateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" required="true"
	 * @generated
	 */
	public Long getAverageBitRateParameter() {
		return averageBitRateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newAverageBitRateParameter the new value of the '<em>Average Bit Rate Parameter</em>' attribute.
	 * @see #getAverageBitRateParameter()
	 * @generated
	 */
	public void setAverageBitRateParameter(Long newAverageBitRateParameter) {
		Long oldAverageBitRateParameter = averageBitRateParameter;
		averageBitRateParameter = newAverageBitRateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER, oldAverageBitRateParameter, averageBitRateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return basicSetMDirectoryParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return basicSetMMp3FileNameParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return basicSetMRecordingFileParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return basicSetMMp3EncoderPathParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return basicSetMAverageBitRateParameter(null, msgs);
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return getMDirectoryParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				return getDirectoryParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return getMMp3FileNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				return getMp3FileNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return getMRecordingFileParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				return getRecordingFileParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return getMMp3EncoderPathParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				return getMp3EncoderPathParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return getMAverageBitRateParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				return getAverageBitRateParameter();
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:    
				setMDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:    
				setDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:    
				setMMp3FileNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:    
				setMp3FileNameParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:    
				setMRecordingFileParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:    
				setRecordingFileParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:    
				setMMp3EncoderPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:    
				setMp3EncoderPathParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:    
				setMAverageBitRateParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:    
				setAverageBitRateParameter((Long)newValue);
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter(getDefaultDirectoryParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				setMMp3FileNameParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				setMp3FileNameParameter(getDefaultMp3FileNameParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				setMRecordingFileParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				setRecordingFileParameter(getDefaultRecordingFileParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				setMMp3EncoderPathParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				setMp3EncoderPathParameter(getDefaultMp3EncoderPathParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				setMAverageBitRateParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				setAverageBitRateParameter(getDefaultAverageBitRateParameter());
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return mDirectoryParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				return getDefaultDirectoryParameter() == null ? directoryParameter != null : !getDefaultDirectoryParameter().equals(directoryParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return mMp3FileNameParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				return getDefaultMp3FileNameParameter() == null ? mp3FileNameParameter != null : !getDefaultMp3FileNameParameter().equals(mp3FileNameParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return mRecordingFileParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				return getDefaultRecordingFileParameter() == null ? recordingFileParameter != null : !getDefaultRecordingFileParameter().equals(recordingFileParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return mMp3EncoderPathParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				return getDefaultMp3EncoderPathParameter() == null ? mp3EncoderPathParameter != null : !getDefaultMp3EncoderPathParameter().equals(mp3EncoderPathParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return mAverageBitRateParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				return getDefaultAverageBitRateParameter() == null ? averageBitRateParameter != null : !getDefaultAverageBitRateParameter().equals(averageBitRateParameter);
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
		result.append(", mp3FileNameParameter: ");
		result.append(mp3FileNameParameter);
		result.append(", recordingFileParameter: ");
		result.append(recordingFileParameter);
		result.append(", mp3EncoderPathParameter: ");
		result.append(mp3EncoderPathParameter);
		result.append(", averageBitRateParameter: ");
		result.append(averageBitRateParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {    
	    String title = CommandLineInterface.escapeArgument(getMTitleParameter().getValueForUI());
	    String album = CommandLineInterface.escapeArgument(getMAlbumParameter().getValueForUI());
	    String artist = CommandLineInterface.escapeArgument(getMArtistParameter().getValueForUI());
	    String year = CommandLineInterface.escapeArgument(getMYearParameter().getValueForUI());
	    String genre = CommandLineInterface.escapeArgument(getMGenreParameter().getValueForUI());
	    String comment = CommandLineInterface.escapeArgument(getMCommentParameter().getValueForUI());
	    
	    String commentParameter = getMCommentParameter().getValue() != null ? "--tc \""+comment+"\"" : "";
	    
	    File inputFile = getRecordingFileParameter();
	    File directory = getDirectoryParameter();
	    File outputFile = new File(directory.getPath()+File.separator+getMp3FileNameParameter().getName());
	    
	    //* new File("Service Files\\MP3 Files").mkdirs();
	    String lameEncoderPath = getMp3EncoderPathParameter().getCanonicalPath();
	    CommandLineInterface.execute(new String[] {"\""+lameEncoderPath+File.separator+
	            "lame.exe\"", "-h", "-m j", "--abr "+getAverageBitRateParameter(),
	            "--tt \""+title+"\"",
	            "--ta \""+artist+"\"",
	            "--tl \""+album+"\"",
	            "--ty \""+year+"\"",
	            "--tg \""+genre+"\"",
	            commentParameter, 
	            "--resample 22.050",
	            "\""+inputFile.getAbsolutePath()+"\"", "\""+outputFile.getAbsolutePath()+"\""},
	            this,
	            null);
	    
	    MMp3 newMMp3 = null;
	    
	    // Checks whether an entry with the same name already exists.
	    for(MMp3 mMp3: (List<MMp3>)getMp3FolderReferenceParameter().getMMp3s())
	    	if(mMp3.getName() != null && mMp3.getName().equals(getMp3EntryNameParameter())) {
	    		newMMp3 = mMp3;
	    		newMMp3.setFileProperty(outputFile);
	    		break;
	    	}	
	    
	    if(newMMp3 == null) {
	    	newMMp3 = new MMp3();
	    	newMMp3.setName(getMp3EntryNameParameter());
	    	newMMp3.setFileProperty(outputFile);
	    	getMp3FolderReferenceParameter().getMMp3s().add(newMMp3);
	    }
	    
	    setMp3EntryReferenceResult(newMMp3);
	    setMp3FilePathResult(outputFile);
	}
	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {		
		if(getMMp3FileNameParameter().equals(mOwnerValue)) {
            String[] texts = new String[4];
            texts[0] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
            texts[1] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
            texts[2] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT);
            texts[3] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
            
            String valueText = Utilities.concatenate(texts, " - ");
            if(valueText == null)
                return null;
            
            return new File(Utilities.convertToFileName(valueText)+".mp3");
		}
		else
			return super.convertMInputValues(mOwnerValue);
	}
	
	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#stop()
	 */
	@Override
	public void stop() {
        setStateProperty(MStepStateType.STOPPING_STATE);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#terminate()
	 */
	@Override
	public void terminate() {
        setStateProperty(MStepStateType.TERMINATING_STATE);
	}

} // MConvertToMP3Step