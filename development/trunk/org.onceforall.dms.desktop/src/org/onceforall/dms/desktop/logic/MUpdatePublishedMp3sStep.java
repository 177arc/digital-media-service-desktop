/*
 * Revision History:
 * $Log: MUpdatePublishedMp3sStep.java,v $
 * Revision 1.3  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MUpdate Published Mp3s Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMRepublishMp3Files <em>MRepublish Mp3 Files</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getRepublishMp3Files <em>Republish Mp3 Files</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceResult <em>MMp3 Folder Reference Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceResult <em>Mp3 Folder Reference Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Update published MP3s' description='Updates the published MP3 recordings on the Christ Chruch Bromley web site and updates the podcast RSS file accordingly. It reads the states of the MP3 entries to determine whether to publish or unpublish.' actionName='Update published MP3s' actionIconFilePath='Image Files/Publish.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MUpdatePublishedMp3sStep extends MPublishMp3sStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MUpdatePublishedMp3sStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MUpdatePublishedMp3sStep.TYPE_NAME, new ReferenceType("Reference to "+MUpdatePublishedMp3sStep.TYPE_NAME, "Specifies a reference to a "+MUpdatePublishedMp3sStep.TYPE_NAME_FOR_UI, MUpdatePublishedMp3sStep.class));
	}
	/**
	 * The cached value of the '{@link #getMRepublishMp3Files() <em>MRepublish Mp3 Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRepublishMp3Files()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRepublishMp3Files;

	/**
	 * The default value of the '{@link #getRepublishMp3Files() <em>Republish Mp3 Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMp3Files()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPUBLISH_MP3_FILES_EDEFAULT = Boolean.FALSE;

	/**
	 * Get the default value of the '{@link #getRepublishMp3Files() <em>Republish Mp3 Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRepublishMp3Files() <em>Republish Mp3 Files</em>}' attribute.
	 * @see #getRepublishMp3Files()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultRepublishMp3Files() {
		return REPUBLISH_MP3_FILES_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRepublishMp3Files() <em>Republish Mp3 Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepublishMp3Files()
	 * @generated
	 * @ordered
	 */
	protected Boolean republishMp3Files = REPUBLISH_MP3_FILES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMMp3FolderReferenceParameter() <em>MMp3 Folder Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FolderReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3FolderReferenceParameter;

	/**
	 * The cached value of the '{@link #getMp3FolderReferenceParameter() <em>Mp3 Folder Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FolderReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MMp3Folder mp3FolderReferenceParameter;

	/**
	 * The cached value of the '{@link #getMMp3FolderReferenceResult() <em>MMp3 Folder Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FolderReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mMp3FolderReferenceResult;

	/**
	 * The cached value of the '{@link #getMp3FolderReferenceResult() <em>Mp3 Folder Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FolderReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MMp3Folder mp3FolderReferenceResult;

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
		return "Updates the published MP3 recordings on the Christ Chruch Bromley web site and updates the podcast RSS file accordingly. It reads the states of the MP3 entries to determine whether to publish or unpublish.";
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
		return "Update published MP3s";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish.gif");
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
		return "Update published MP3s";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MUpdatePublishedMp3sStep() {
		super();
		
		firstMUpdatePublishedMp3sStepConstructorHook();
				
		actionName = "Update published MP3s";
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish.gif");
		stoppable = false;
		description = "Updates the published MP3 recordings on the Christ Chruch Bromley web site and updates the podcast RSS file accordingly. It reads the states of the MP3 entries to determine whether to publish or unpublish.";
		name = "Update published MP3s";
		interruptable = false;
		terminatable = false;
			 
		setMRepublishMp3Files(new MParameter(false, "Republish MP3 files", "Specifies whether all already published MP3 files should be uploaded to the web site again.", null));			 
		setMMp3FolderReferenceParameter(new MParameter(false, "MP3 folder reference", "Speficies a reference to the MP3 folder that contains the MP3 entries to be published or unpublished.", null));			 
		setMMp3FolderReferenceResult(new MResult(false, "MP3 folder reference", "Speficies a reference to the MP3 folder that contains the MP3 entries that were published or unpublished.", null));

		lastMUpdatePublishedMp3sStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMUpdatePublishedMp3sStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMUpdatePublishedMp3sStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MRepublish Mp3 Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRepublish Mp3 Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRepublish Mp3 Files</em>' containment reference.
	 * @see #setMRepublishMp3Files(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_MRepublishMp3Files()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Republish MP3 files' description='Specifies whether all already published MP3 files should be uploaded to the web site again.'"
	 * @generated
	 */
	public MParameter getMRepublishMp3Files() {
		return mRepublishMp3Files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRepublishMp3Files(MParameter newMRepublishMp3Files, NotificationChain msgs) {
		MParameter oldMRepublishMp3Files = mRepublishMp3Files;
		mRepublishMp3Files = newMRepublishMp3Files;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES, oldMRepublishMp3Files, newMRepublishMp3Files);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMRepublishMp3Files <em>MRepublish Mp3 Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRepublishMp3Files the new value of the '<em>MRepublish Mp3 Files</em>' containment reference.
	 * @see #getMRepublishMp3Files()
	 * @generated
	 */
	public void setMRepublishMp3Files(MParameter newMRepublishMp3Files) {
		if (newMRepublishMp3Files != mRepublishMp3Files) {
			NotificationChain msgs = null;
			if (mRepublishMp3Files != null)
				msgs = ((InternalEObject)mRepublishMp3Files).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES, null, msgs);
			if (newMRepublishMp3Files != null) {				
				newMRepublishMp3Files.setDefaultDescription("Specifies whether all already published MP3 files should be uploaded to the web site again.");
				newMRepublishMp3Files.setDefaultName("Republish MP3 files");
				newMRepublishMp3Files.setValueType(Type.getTypeForName("Yes/No"));
				newMRepublishMp3Files.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES));
				newMRepublishMp3Files.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRepublishMp3Files).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRepublishMp3Files != null) {
				if(newMRepublishMp3Files != null)
					newMRepublishMp3Files.eAdapters().addAll(mRepublishMp3Files.eAdapters());			
			
				mRepublishMp3Files.eAdapters().clear();
			}
			msgs = basicSetMRepublishMp3Files(newMRepublishMp3Files, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES, newMRepublishMp3Files, newMRepublishMp3Files));
	}

	/**
	 * Returns the value of the '<em><b>Republish Mp3 Files</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Republish Mp3 Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Republish Mp3 Files</em>' attribute.
	 * @see #setRepublishMp3Files(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_RepublishMp3Files()
	 * @model default="false" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true"
	 * @generated
	 */
	public Boolean getRepublishMp3Files() {
		return republishMp3Files;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getRepublishMp3Files <em>Republish Mp3 Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newRepublishMp3Files the new value of the '<em>Republish Mp3 Files</em>' attribute.
	 * @see #getRepublishMp3Files()
	 * @generated
	 */
	public void setRepublishMp3Files(Boolean newRepublishMp3Files) {
		Boolean oldRepublishMp3Files = republishMp3Files;
		republishMp3Files = newRepublishMp3Files;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES, oldRepublishMp3Files, republishMp3Files));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Folder Reference Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Folder Reference Parameter</em>' containment reference.
	 * @see #setMMp3FolderReferenceParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_MMp3FolderReferenceParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 folder reference' description='Speficies a reference to the MP3 folder that contains the MP3 entries to be published or unpublished.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMMp3FolderReferenceParameter() {
		return mMp3FolderReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FolderReferenceParameter(MParameter newMMp3FolderReferenceParameter, NotificationChain msgs) {
		MParameter oldMMp3FolderReferenceParameter = mMp3FolderReferenceParameter;
		mMp3FolderReferenceParameter = newMMp3FolderReferenceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, oldMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FolderReferenceParameter the new value of the '<em>MMp3 Folder Reference Parameter</em>' containment reference.
	 * @see #getMMp3FolderReferenceParameter()
	 * @generated
	 */
	public void setMMp3FolderReferenceParameter(MParameter newMMp3FolderReferenceParameter) {
		if (newMMp3FolderReferenceParameter != mMp3FolderReferenceParameter) {
			NotificationChain msgs = null;
			if (mMp3FolderReferenceParameter != null)
				msgs = ((InternalEObject)mMp3FolderReferenceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
			if (newMMp3FolderReferenceParameter != null) {				
				newMMp3FolderReferenceParameter.setDefaultName("MP3 folder reference");
				newMMp3FolderReferenceParameter.setDefaultDescription("Speficies a reference to the MP3 folder that contains the MP3 entries to be published or unpublished.");
				newMMp3FolderReferenceParameter.setValueType(Type.getTypeForName("Reference to "+MMp3Folder.TYPE_NAME));
				newMMp3FolderReferenceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER));
				newMMp3FolderReferenceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FolderReferenceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FolderReferenceParameter != null) {
				if(newMMp3FolderReferenceParameter != null)
					newMMp3FolderReferenceParameter.eAdapters().addAll(mMp3FolderReferenceParameter.eAdapters());			
			
				mMp3FolderReferenceParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3FolderReferenceParameter(newMMp3FolderReferenceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, newMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Folder Reference Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Folder Reference Parameter</em>' reference.
	 * @see #setMp3FolderReferenceParameter(MMp3Folder)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_Mp3FolderReferenceParameter()
	 * @model required="true"
	 * @generated
	 */
	public MMp3Folder getMp3FolderReferenceParameter() {
		if (mp3FolderReferenceParameter != null && ((EObject)mp3FolderReferenceParameter).eIsProxy()) {
			InternalEObject oldMp3FolderReferenceParameter = (InternalEObject)mp3FolderReferenceParameter;
			mp3FolderReferenceParameter = (MMp3Folder)eResolveProxy(oldMp3FolderReferenceParameter);
			if (mp3FolderReferenceParameter != oldMp3FolderReferenceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
			}
		}
		return mp3FolderReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3Folder basicGetMp3FolderReferenceParameter() {
		return mp3FolderReferenceParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FolderReferenceParameter the new value of the '<em>Mp3 Folder Reference Parameter</em>' reference.
	 * @see #getMp3FolderReferenceParameter()
	 * @generated
	 */
	public void setMp3FolderReferenceParameter(MMp3Folder newMp3FolderReferenceParameter) {
		MMp3Folder oldMp3FolderReferenceParameter = mp3FolderReferenceParameter;
		mp3FolderReferenceParameter = newMp3FolderReferenceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Folder Reference Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Folder Reference Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Folder Reference Result</em>' containment reference.
	 * @see #setMMp3FolderReferenceResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_MMp3FolderReferenceResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 folder reference' description='Speficies a reference to the MP3 folder that contains the MP3 entries that were published or unpublished.'"
	 * @generated
	 */
	public MResult getMMp3FolderReferenceResult() {
		return mMp3FolderReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FolderReferenceResult(MResult newMMp3FolderReferenceResult, NotificationChain msgs) {
		MResult oldMMp3FolderReferenceResult = mMp3FolderReferenceResult;
		mMp3FolderReferenceResult = newMMp3FolderReferenceResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT, oldMMp3FolderReferenceResult, newMMp3FolderReferenceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceResult <em>MMp3 Folder Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FolderReferenceResult the new value of the '<em>MMp3 Folder Reference Result</em>' containment reference.
	 * @see #getMMp3FolderReferenceResult()
	 * @generated
	 */
	public void setMMp3FolderReferenceResult(MResult newMMp3FolderReferenceResult) {
		if (newMMp3FolderReferenceResult != mMp3FolderReferenceResult) {
			NotificationChain msgs = null;
			if (mMp3FolderReferenceResult != null)
				msgs = ((InternalEObject)mMp3FolderReferenceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT, null, msgs);
			if (newMMp3FolderReferenceResult != null) {				
				newMMp3FolderReferenceResult.setDefaultDescription("Speficies a reference to the MP3 folder that contains the MP3 entries that were published or unpublished.");
				newMMp3FolderReferenceResult.setDefaultName("MP3 folder reference");
				newMMp3FolderReferenceResult.setValueType(Type.getTypeForName("Reference to "+MMp3Folder.TYPE_NAME));
				newMMp3FolderReferenceResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT));
				newMMp3FolderReferenceResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FolderReferenceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FolderReferenceResult != null) {
				if(newMMp3FolderReferenceResult != null)
					newMMp3FolderReferenceResult.eAdapters().addAll(mMp3FolderReferenceResult.eAdapters());			
			
				mMp3FolderReferenceResult.eAdapters().clear();
			}
			msgs = basicSetMMp3FolderReferenceResult(newMMp3FolderReferenceResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT, newMMp3FolderReferenceResult, newMMp3FolderReferenceResult));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Folder Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Folder Reference Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Folder Reference Result</em>' reference.
	 * @see #setMp3FolderReferenceResult(MMp3Folder)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep_Mp3FolderReferenceResult()
	 * @model required="true" transient="true"
	 * @generated
	 */
	public MMp3Folder getMp3FolderReferenceResult() {
		if (mp3FolderReferenceResult != null && ((EObject)mp3FolderReferenceResult).eIsProxy()) {
			InternalEObject oldMp3FolderReferenceResult = (InternalEObject)mp3FolderReferenceResult;
			mp3FolderReferenceResult = (MMp3Folder)eResolveProxy(oldMp3FolderReferenceResult);
			if (mp3FolderReferenceResult != oldMp3FolderReferenceResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT, oldMp3FolderReferenceResult, mp3FolderReferenceResult));
			}
		}
		return mp3FolderReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3Folder basicGetMp3FolderReferenceResult() {
		return mp3FolderReferenceResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceResult <em>Mp3 Folder Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FolderReferenceResult the new value of the '<em>Mp3 Folder Reference Result</em>' reference.
	 * @see #getMp3FolderReferenceResult()
	 * @generated
	 */
	public void setMp3FolderReferenceResult(MMp3Folder newMp3FolderReferenceResult) {
		MMp3Folder oldMp3FolderReferenceResult = mp3FolderReferenceResult;
		mp3FolderReferenceResult = newMp3FolderReferenceResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT, oldMp3FolderReferenceResult, mp3FolderReferenceResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
				return basicSetMRepublishMp3Files(null, msgs);
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return basicSetMMp3FolderReferenceParameter(null, msgs);
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				return basicSetMMp3FolderReferenceResult(null, msgs);
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
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
				return getMRepublishMp3Files();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES:
				return getRepublishMp3Files();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return getMMp3FolderReferenceParameter();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				if (resolve) return getMp3FolderReferenceParameter();
				return basicGetMp3FolderReferenceParameter();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				return getMMp3FolderReferenceResult();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT:
				if (resolve) return getMp3FolderReferenceResult();
				return basicGetMp3FolderReferenceResult();
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
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
				setMRepublishMp3Files((MParameter)newValue);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES:
				setRepublishMp3Files((Boolean)newValue);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				setMMp3FolderReferenceParameter((MParameter)newValue);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				setMp3FolderReferenceParameter((MMp3Folder)newValue);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				setMMp3FolderReferenceResult((MResult)newValue);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT:
				setMp3FolderReferenceResult((MMp3Folder)newValue);
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
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
				setMRepublishMp3Files((MParameter)null);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES:
				setRepublishMp3Files(getDefaultRepublishMp3Files());
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				setMMp3FolderReferenceParameter((MParameter)null);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				setMp3FolderReferenceParameter((MMp3Folder)null);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				setMMp3FolderReferenceResult((MResult)null);
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT:
				setMp3FolderReferenceResult((MMp3Folder)null);
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
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
				return mRepublishMp3Files != null;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES:
				return getDefaultRepublishMp3Files() == null ? republishMp3Files != null : !getDefaultRepublishMp3Files().equals(republishMp3Files);
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return mMp3FolderReferenceParameter != null;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				return mp3FolderReferenceParameter != null;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				return mMp3FolderReferenceResult != null;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT:
				return mp3FolderReferenceResult != null;
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
		result.append(" (republishMp3Files: ");
		result.append(republishMp3Files);
		result.append(')');
		return result.toString();
	}

    /**
     * @see org.onceforall.dms.desktop.logic.MStep#validate()
     */
	@Override
    public DesktopExceptionList validate() {
		DesktopExceptionList validationExceptions = super.validate();
        
        if(getRepublishMp3Files())
        	validationExceptions.add(new DesktopException("Republishing all currently published MP3 files could take a few hours.", null, DesktopException.WARNING_SEVERITY, null));
        
        return validationExceptions;
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#executeFtpOperationsHook(FTPClient)
	 */
	@Override
	protected void executeFtpOperationsHook(FTPClient ftpClient) throws Throwable {
		publishMp3s(ftpClient, getMp3FolderReferenceParameter(), getRepublishMp3Files());
	}

} // MUpdatePublishedMp3sStep