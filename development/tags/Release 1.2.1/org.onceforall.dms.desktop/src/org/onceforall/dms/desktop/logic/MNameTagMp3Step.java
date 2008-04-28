/*
 * Revision History:
 * $Log: MNameTagMp3Step.java,v $
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagConstant;
import org.farng.mp3.TagOptionSingleton;
import org.farng.mp3.id3.ID3v1;
import org.farng.mp3.id3.ID3v1_1;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MName Tag Mp3 Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getDirectoryParameter <em>Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMTaggedMp3FileNameParameter <em>MTagged Mp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getTaggedMp3FileNameParameter <em>Tagged Mp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMRecordingMp3FileParameter <em>MRecording Mp3 File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getRecordingMp3FileParameter <em>Recording Mp3 File Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Tag MP3' description='Copies the given recording file to the specified directory, gives it the specified name and sets the ID3 tags.' iconFilePath='Image Files/Convert to MP3 step.gif' actionName='Tag' actionIconFilePath='Image Files/Convert.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MNameTagMp3Step extends MTagStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MNameTagMp3Step.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MNameTagMp3Step.TYPE_NAME, new ReferenceType("Reference to "+MNameTagMp3Step.TYPE_NAME, "Specifies a reference to a "+MNameTagMp3Step.TYPE_NAME_FOR_UI, MNameTagMp3Step.class));
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
	 * The cached value of the '{@link #getMTaggedMp3FileNameParameter() <em>MTagged Mp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTaggedMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTaggedMp3FileNameParameter = null;

	/**
	 * The default value of the '{@link #getTaggedMp3FileNameParameter() <em>Tagged Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File TAGGED_MP3_FILE_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTaggedMp3FileNameParameter() <em>Tagged Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTaggedMp3FileNameParameter() <em>Tagged Mp3 File Name Parameter</em>}' attribute.
	 * @see #getTaggedMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultTaggedMp3FileNameParameter() {
		return TAGGED_MP3_FILE_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTaggedMp3FileNameParameter() <em>Tagged Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected File taggedMp3FileNameParameter = TAGGED_MP3_FILE_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingMp3FileParameter() <em>MRecording Mp3 File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingMp3FileParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingMp3FileParameter = null;

	/**
	 * The default value of the '{@link #getRecordingMp3FileParameter() <em>Recording Mp3 File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingMp3FileParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File RECORDING_MP3_FILE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingMp3FileParameter() <em>Recording Mp3 File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingMp3FileParameter() <em>Recording Mp3 File Parameter</em>}' attribute.
	 * @see #getRecordingMp3FileParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultRecordingMp3FileParameter() {
		return RECORDING_MP3_FILE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingMp3FileParameter() <em>Recording Mp3 File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingMp3FileParameter()
	 * @generated
	 * @ordered
	 */
	protected File recordingMp3FileParameter = RECORDING_MP3_FILE_PARAMETER_EDEFAULT;

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
		return "Copies the given recording file to the specified directory, gives it the specified name and sets the ID3 tags.";
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
	 * Get the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultName() {
		return "Tag MP3";
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
	 * Get the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultActionName() {
		return "Tag";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MNameTagMp3Step() {
		super();
		
		firstMNameTagMp3StepConstructorHook();
				
		description = "Copies the given recording file to the specified directory, gives it the specified name and sets the ID3 tags.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert.gif");
		name = "Tag MP3";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert to MP3 step.gif");
		terminatable = false;
		interruptable = false;
		actionName = "Tag";
					 
		setMDirectoryParameter(new MParameter(false, "Directory", "Specifies the directory where the renamed and tagged MP3 file should be copied to.", null));			 
		setMTaggedMp3FileNameParameter(new MParameter(false, "Tagged MP3 file name", "Specifies the name of the MP3 file to be named and tagged.", null));			 
		setMRecordingMp3FileParameter(new MParameter(false, "Recording MP3 file path", "Specifies the path of the MP3 file to be named and tagged.", null));

		lastMNameTagMp3StepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMNameTagMp3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMNameTagMp3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MNAME_TAG_MP3_STEP;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_MDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory' description='Specifies the directory where the renamed and tagged MP3 file should be copied to.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER, oldMDirectoryParameter, newMDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
			if (newMDirectoryParameter != null) {				
				newMDirectoryParameter.setDefaultDescription("Specifies the directory where the renamed and tagged MP3 file should be copied to.");
				newMDirectoryParameter.setDefaultName("Directory");
				newMDirectoryParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER));
				newMDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER, newMDirectoryParameter, newMDirectoryParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_DirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getDirectoryParameter() {
		return directoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getDirectoryParameter <em>Directory Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER, oldDirectoryParameter, directoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MTagged Mp3 File Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTagged Mp3 File Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTagged Mp3 File Name Parameter</em>' containment reference.
	 * @see #setMTaggedMp3FileNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_MTaggedMp3FileNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Tagged MP3 file name' description='Specifies the name of the MP3 file to be named and tagged.'"
	 * @generated
	 */
	public MParameter getMTaggedMp3FileNameParameter() {
		return mTaggedMp3FileNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTaggedMp3FileNameParameter(MParameter newMTaggedMp3FileNameParameter, NotificationChain msgs) {
		MParameter oldMTaggedMp3FileNameParameter = mTaggedMp3FileNameParameter;
		mTaggedMp3FileNameParameter = newMTaggedMp3FileNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER, oldMTaggedMp3FileNameParameter, newMTaggedMp3FileNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMTaggedMp3FileNameParameter <em>MTagged Mp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMTaggedMp3FileNameParameter the new value of the '<em>MTagged Mp3 File Name Parameter</em>' containment reference.
	 * @see #getMTaggedMp3FileNameParameter()
	 * @generated
	 */
	public void setMTaggedMp3FileNameParameter(MParameter newMTaggedMp3FileNameParameter) {
		if (newMTaggedMp3FileNameParameter != mTaggedMp3FileNameParameter) {
			NotificationChain msgs = null;
			if (mTaggedMp3FileNameParameter != null)
				msgs = ((InternalEObject)mTaggedMp3FileNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER, null, msgs);
			if (newMTaggedMp3FileNameParameter != null) {				
				newMTaggedMp3FileNameParameter.setDefaultDescription("Specifies the name of the MP3 file to be named and tagged.");
				newMTaggedMp3FileNameParameter.setDefaultName("Tagged MP3 file name");
				newMTaggedMp3FileNameParameter.setValueType(Type.getTypeForName("File"));
				newMTaggedMp3FileNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER));
				newMTaggedMp3FileNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTaggedMp3FileNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTaggedMp3FileNameParameter != null) {
				if(newMTaggedMp3FileNameParameter != null)
					newMTaggedMp3FileNameParameter.eAdapters().addAll(mTaggedMp3FileNameParameter.eAdapters());			
			
				mTaggedMp3FileNameParameter.eAdapters().clear();
			}
			msgs = basicSetMTaggedMp3FileNameParameter(newMTaggedMp3FileNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER, newMTaggedMp3FileNameParameter, newMTaggedMp3FileNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Tagged Mp3 File Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Mp3 File Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Mp3 File Name Parameter</em>' attribute.
	 * @see #setTaggedMp3FileNameParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_TaggedMp3FileNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getTaggedMp3FileNameParameter() {
		return taggedMp3FileNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getTaggedMp3FileNameParameter <em>Tagged Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newTaggedMp3FileNameParameter the new value of the '<em>Tagged Mp3 File Name Parameter</em>' attribute.
	 * @see #getTaggedMp3FileNameParameter()
	 * @generated
	 */
	public void setTaggedMp3FileNameParameter(File newTaggedMp3FileNameParameter) {
		File oldTaggedMp3FileNameParameter = taggedMp3FileNameParameter;
		taggedMp3FileNameParameter = newTaggedMp3FileNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER, oldTaggedMp3FileNameParameter, taggedMp3FileNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MRecording Mp3 File Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Mp3 File Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Mp3 File Parameter</em>' containment reference.
	 * @see #setMRecordingMp3FileParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_MRecordingMp3FileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording MP3 file path' description='Specifies the path of the MP3 file to be named and tagged.'"
	 * @generated
	 */
	public MParameter getMRecordingMp3FileParameter() {
		return mRecordingMp3FileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingMp3FileParameter(MParameter newMRecordingMp3FileParameter, NotificationChain msgs) {
		MParameter oldMRecordingMp3FileParameter = mRecordingMp3FileParameter;
		mRecordingMp3FileParameter = newMRecordingMp3FileParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER, oldMRecordingMp3FileParameter, newMRecordingMp3FileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getMRecordingMp3FileParameter <em>MRecording Mp3 File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRecordingMp3FileParameter the new value of the '<em>MRecording Mp3 File Parameter</em>' containment reference.
	 * @see #getMRecordingMp3FileParameter()
	 * @generated
	 */
	public void setMRecordingMp3FileParameter(MParameter newMRecordingMp3FileParameter) {
		if (newMRecordingMp3FileParameter != mRecordingMp3FileParameter) {
			NotificationChain msgs = null;
			if (mRecordingMp3FileParameter != null)
				msgs = ((InternalEObject)mRecordingMp3FileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER, null, msgs);
			if (newMRecordingMp3FileParameter != null) {				
				newMRecordingMp3FileParameter.setDefaultDescription("Specifies the path of the MP3 file to be named and tagged.");
				newMRecordingMp3FileParameter.setDefaultName("Recording MP3 file path");
				newMRecordingMp3FileParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMRecordingMp3FileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER));
				newMRecordingMp3FileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingMp3FileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingMp3FileParameter != null) {
				if(newMRecordingMp3FileParameter != null)
					newMRecordingMp3FileParameter.eAdapters().addAll(mRecordingMp3FileParameter.eAdapters());			
			
				mRecordingMp3FileParameter.eAdapters().clear();
			}
			msgs = basicSetMRecordingMp3FileParameter(newMRecordingMp3FileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER, newMRecordingMp3FileParameter, newMRecordingMp3FileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording Mp3 File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Mp3 File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Mp3 File Parameter</em>' attribute.
	 * @see #setRecordingMp3FileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMNameTagMp3Step_RecordingMp3FileParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getRecordingMp3FileParameter() {
		return recordingMp3FileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step#getRecordingMp3FileParameter <em>Recording Mp3 File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newRecordingMp3FileParameter the new value of the '<em>Recording Mp3 File Parameter</em>' attribute.
	 * @see #getRecordingMp3FileParameter()
	 * @generated
	 */
	public void setRecordingMp3FileParameter(File newRecordingMp3FileParameter) {
		File oldRecordingMp3FileParameter = recordingMp3FileParameter;
		recordingMp3FileParameter = newRecordingMp3FileParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER, oldRecordingMp3FileParameter, recordingMp3FileParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:
				return basicSetMDirectoryParameter(null, msgs);
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:
				return basicSetMTaggedMp3FileNameParameter(null, msgs);
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:
				return basicSetMRecordingMp3FileParameter(null, msgs);
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
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:
				return getMDirectoryParameter();
			case LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER:
				return getDirectoryParameter();
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:
				return getMTaggedMp3FileNameParameter();
			case LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER:
				return getTaggedMp3FileNameParameter();
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:
				return getMRecordingMp3FileParameter();
			case LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER:
				return getRecordingMp3FileParameter();
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
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:    
				setMDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER:    
				setDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:    
				setMTaggedMp3FileNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER:    
				setTaggedMp3FileNameParameter((File)newValue);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:    
				setMRecordingMp3FileParameter((MParameter)newValue);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER:    
				setRecordingMp3FileParameter((File)newValue);
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
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter(getDefaultDirectoryParameter());
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:
				setMTaggedMp3FileNameParameter((MParameter)null);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER:
				setTaggedMp3FileNameParameter(getDefaultTaggedMp3FileNameParameter());
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:
				setMRecordingMp3FileParameter((MParameter)null);
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER:
				setRecordingMp3FileParameter(getDefaultRecordingMp3FileParameter());
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
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:
				return mDirectoryParameter != null;
			case LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER:
				return getDefaultDirectoryParameter() == null ? directoryParameter != null : !getDefaultDirectoryParameter().equals(directoryParameter);
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:
				return mTaggedMp3FileNameParameter != null;
			case LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER:
				return getDefaultTaggedMp3FileNameParameter() == null ? taggedMp3FileNameParameter != null : !getDefaultTaggedMp3FileNameParameter().equals(taggedMp3FileNameParameter);
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:
				return mRecordingMp3FileParameter != null;
			case LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER:
				return getDefaultRecordingMp3FileParameter() == null ? recordingMp3FileParameter != null : !getDefaultRecordingMp3FileParameter().equals(recordingMp3FileParameter);
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
		result.append(", taggedMp3FileNameParameter: ");
		result.append(taggedMp3FileNameParameter);
		result.append(", recordingMp3FileParameter: ");
		result.append(recordingMp3FileParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
	    String title = getMTitleParameter().getValueForUI();
	    String album = getMAlbumParameter().getValueForUI();
	    String artist = getMArtistParameter().getValueForUI();
	    String year = getMYearParameter().getValueForUI();
	    String genreName = getMGenreParameter().getValueForUI();
	    String comment = getMCommentParameter().getValueForUIOrNull();

	    File inputFile = getRecordingMp3FileParameter();
	    File directory = getDirectoryParameter();
	    File taggedMp3File = new File(directory.getPath()+File.separator+getTaggedMp3FileNameParameter().getName());
	    
	    // Copies the file and renames it.
	    byte[] buffer = new byte[4096];
	    FileOutputStream outputStream = new FileOutputStream(taggedMp3File);
	    FileInputStream inputStream = new FileInputStream(inputFile);
	    int length = inputStream.read(buffer);
	    while(length >= 0) {
	    	outputStream.write(buffer, 0, length);
	    	length = inputStream.read(buffer);
	    }
	    outputStream.close();
	    inputStream.close();
	    
	    // Tags the copied and renamed file.
	    TagOptionSingleton.getInstance().setId3v2Save(true);
	    TagOptionSingleton.getInstance().setId3v1Save(true);
	    TagOptionSingleton.getInstance().setId3v1SaveTrack(false);
	    TagOptionSingleton.getInstance().setLyrics3Save(false);
	    TagOptionSingleton.getInstance().setOriginalSavedAfterAdjustingID3v2Padding(false);
	    TagOptionSingleton.getInstance().setDefaultSaveMode(TagConstant.MP3_FILE_SAVE_OVERWRITE);

	    MP3File mp3file = new MP3File(taggedMp3File, true);
	    /*AbstractID3v2 id3v2Tag = new ID3v2_2();
	    id3v2Tag.setSongTitle(title);
	    id3v2Tag.setAlbumTitle(album);
	    id3v2Tag.setLeadArtist(artist);
	    id3v2Tag.setYearReleased(year);
	    id3v2Tag.setSongGenre(genre);
	    if(comment != null)
	    	id3v2Tag.setSongComment(comment);*/
	    mp3file.setID3v2Tag(null);
	    ID3v1 id3v1Tag = new ID3v1_1();
	    id3v1Tag.setTitle(title);
	    id3v1Tag.setAlbum(album);
	    id3v1Tag.setArtist(artist);
	    id3v1Tag.setYear(year);
	    String genre = GENRES_BY_NAME.get(genreName);
	    
	    if(genre != null)
	    	id3v1Tag.setSongGenre(genre);
	    else
	    	Logger.getLogger().warning("The genre '"+genreName+"' is not a valid ID3 V1 genre name and therefore has been ignored. The ID3 specification contains a list of valid names.");
	    
	    if(comment != null)
	    	id3v1Tag.setComment(comment);
	    
	    mp3file.setID3v1Tag(id3v1Tag);
	    mp3file.save(taggedMp3File);

	    MMp3 newMMp3 = null;
	    
	    // Checks whether an entry with the same name already exists.
	    for(MMp3 mMp3: (List<MMp3>)getMp3FolderReferenceParameter().getMMp3s())
	    	if(mMp3.getName() != null && mMp3.getName().equals(getMp3EntryNameParameter())) {
	    		newMMp3 = mMp3;
		    	newMMp3.setFileProperty(taggedMp3File);
	    		break;
	    	}	
	    
	    if(newMMp3 == null) {
	    	newMMp3 = new MMp3();
	    	newMMp3.setName(getMp3EntryNameParameter());
	    	newMMp3.setFileProperty(taggedMp3File);
	    	getMp3FolderReferenceParameter().getMMp3s().add(newMMp3);
	    }
	    
	    setMp3EntryReferenceResult(newMMp3);
	    setMp3FilePathResult(taggedMp3File);
	}
	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {
		if(getMTaggedMp3FileNameParameter().equals(mOwnerValue)) {
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

} // MNameTagMp3Step