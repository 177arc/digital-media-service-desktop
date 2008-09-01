/*
 * Revision History:
 * $Log: LogicValidator.java,v $
 * Revision 1.2  2007/05/12 10:56:29  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.1  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.onceforall.dms.desktop.Plugin;
import org.onceforall.dms.desktop.logic.types.State;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.onceforall.dms.desktop.logic.LogicPackage
 * @generated
 */
public class LogicValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogicValidator INSTANCE = new LogicValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.onceforall.dms.desktop.logic";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'MApplication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAPPLICATION__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
	
	/** Specifies the default substitution label provider for managed elements. */
	public static final SubstitutionLabelProvider LABEL_PROVIDER = new SubstitutionLabelProvider() {

		public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
			return eStructuralFeature.getName();
		}

		public String getObjectLabel(EObject eObject) {
			return null;
		}

		public String getValueLabel(EDataType eDataType, Object value) {
			return null;
		}};

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return LogicPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case LogicPackage.MOBJECT:
				return validateMObject((MObject)value, diagnostics, context);
			case LogicPackage.MELEMENT:
				return validateMElement((MElement)value, diagnostics, context);
			case LogicPackage.MPARAMETER:
				return validateMParameter((MParameter)value, diagnostics, context);
			case LogicPackage.MPROPERTY:
				return validateMProperty((MProperty)value, diagnostics, context);
			case LogicPackage.MRESULT:
				return validateMResult((MResult)value, diagnostics, context);
			case LogicPackage.MSTATEFUL_OBJECT:
				return validateMStatefulObject((MStatefulObject)value, diagnostics, context);
			case LogicPackage.MSTEP:
				return validateMStep((MStep)value, diagnostics, context);
			case LogicPackage.MVALUE:
				return validateMValue((MValue)value, diagnostics, context);
			case LogicPackage.MAPPLICATION:
				return validateMApplication((MApplication)value, diagnostics, context);
			case LogicPackage.MSCRIPT:
				return validateMScript((MScript)value, diagnostics, context);
			case LogicPackage.MDMS_APPLICATION:
				return validateMDmsApplication((MDmsApplication)value, diagnostics, context);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP:
				return validateMDmsApplicationMGetDataUpgradeInfoStep((MDmsApplicationMGetDataUpgradeInfoStep)value, diagnostics, context);
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP:
				return validateMDmsApplicationMUpgradeDataStep((MDmsApplicationMUpgradeDataStep)value, diagnostics, context);
			case LogicPackage.MENTER_INFORMATION_STEP:
				return validateMEnterInformationStep((MEnterInformationStep)value, diagnostics, context);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP:
				return validateMEnterWwxInformationStep((MEnterWwxInformationStep)value, diagnostics, context);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP:
				return validateMEnterServiceInformationStep((MEnterServiceInformationStep)value, diagnostics, context);
			case LogicPackage.MCREATE_DIRECTORY_STEP:
				return validateMCreateDirectoryStep((MCreateDirectoryStep)value, diagnostics, context);
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP:
				return validateMCheckFreeDiskSpaceStep((MCheckFreeDiskSpaceStep)value, diagnostics, context);
			case LogicPackage.MAUDIO_STEP:
				return validateMAudioStep((MAudioStep)value, diagnostics, context);
			case LogicPackage.MCHECK_INPUT_LEVELS_STEP:
				return validateMCheckInputLevelsStep((MCheckInputLevelsStep)value, diagnostics, context);
			case LogicPackage.MRECORD_STEP:
				return validateMRecordStep((MRecordStep)value, diagnostics, context);
			case LogicPackage.MCONVERT_TO_MP3_STEP:
				return validateMConvertToMP3Step((MConvertToMP3Step)value, diagnostics, context);
			case LogicPackage.MPUBLISH_MP3S_STEP:
				return validateMPublishMp3sStep((MPublishMp3sStep)value, diagnostics, context);
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP:
				return validateMUpdatePublishedMp3sStep((MUpdatePublishedMp3sStep)value, diagnostics, context);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP:
				return validateMPublishNewMp3Step((MPublishNewMp3Step)value, diagnostics, context);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP:
				return validateMEmailEventLogStep((MEmailEventLogStep)value, diagnostics, context);
			case LogicPackage.MMP3_FOLDER:
				return validateMMp3Folder((MMp3Folder)value, diagnostics, context);
			case LogicPackage.MMP3:
				return validateMMp3((MMp3)value, diagnostics, context);
			case LogicPackage.MBURN_CD_STEP:
				return validateMBurnCdStep((MBurnCdStep)value, diagnostics, context);
			case LogicPackage.MFTP_STEP:
				return validateMFtpStep((MFtpStep)value, diagnostics, context);
			case LogicPackage.MTEST_STEP:
				return validateMTestStep((MTestStep)value, diagnostics, context);
			case LogicPackage.MNAME_TAG_MP3_STEP:
				return validateMNameTagMp3Step((MNameTagMp3Step)value, diagnostics, context);
			case LogicPackage.MTAG_STEP:
				return validateMTagStep((MTagStep)value, diagnostics, context);
			case LogicPackage.MDIRECTORY:
				return validateMDirectory((File)value, diagnostics, context);
			case LogicPackage.MEXISTING_DIRECTORY:
				return validateMExistingDirectory((File)value, diagnostics, context);
			case LogicPackage.MFILE:
				return validateMFile((File)value, diagnostics, context);
			case LogicPackage.MEXISTING_FILE:
				return validateMExistingFile((File)value, diagnostics, context);
			case LogicPackage.MSTATE:
				return validateMState((State)value, diagnostics, context);
			case LogicPackage.MSTEP_STATE:
				return validateMStepState((State)value, diagnostics, context);
			case LogicPackage.MBOOLEAN:
				return validateMBoolean((Boolean)value, diagnostics, context);
			case LogicPackage.MDATE_TIME:
				return validateMDateTime((Date)value, diagnostics, context);
			case LogicPackage.MDATE:
				return validateMDate((Date)value, diagnostics, context);
			case LogicPackage.MTIME:
				return validateMTime((Date)value, diagnostics, context);
			case LogicPackage.MDURATION:
				return validateMDuration((Long)value, diagnostics, context);
			case LogicPackage.MLONG:
				return validateMLong((Long)value, diagnostics, context);
			case LogicPackage.MPASSWORD:
				return validateMPassword((String)value, diagnostics, context);
			case LogicPackage.MSTRING:
				return validateMString((String)value, diagnostics, context);
			case LogicPackage.MURL:
				return validateMUrl((URL)value, diagnostics, context);
			case LogicPackage.ETHROWABLE:
				return validateEThrowable((Throwable)value, diagnostics, context);
			case LogicPackage.MMP3_STATE:
				return validateMMp3State((State)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMObject(MObject mObject, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMElement(MElement mElement, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMParameter(MParameter mParameter, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMProperty(MProperty mProperty, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMResult(MResult mResult, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMStatefulObject(MStatefulObject mStatefulObject, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mStatefulObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMStep(MStep mStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateMValue(MValue mValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_MultiplicityConforms((MObject) mValue.eContainer(), mValue.getValueEFeature(), diagnostics, context);
		if ((result || diagnostics != null) && mValue.getValueEFeature() instanceof EAttribute) result &= validate_DataValueConforms((MObject) mValue.eContainer(), (EAttribute) mValue.getValueEFeature(), diagnostics, context);
		//?if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((MObject) mValue.eContainer(), mValue.getValueEFeature(), diagnostics, context);
		//?if (result || diagnostics != null) result &= validate_EveryProxyResolves((MObject) mValue.eContainer(), mValue.getValueEFeature(), diagnostics, context);
		//?if (result || diagnostics != null) result &= validateMElement_validate((MObject) mValue.eContainer(), mValue.getValueEFeature(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMApplication(MApplication mApplication, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)mApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMApplication_validate(mApplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>MApplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMApplication_validate(MApplication mApplication, DiagnosticChain diagnostics, Map context) {
		return mApplication.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMScript(MScript mScript, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDmsApplication(MDmsApplication mDmsApplication, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)mDmsApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMApplication_validate(mDmsApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEnterInformationStep(MEnterInformationStep mEnterInformationStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mEnterInformationStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEnterWwxInformationStep(MEnterWwxInformationStep mEnterWwxInformationStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mEnterWwxInformationStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEnterServiceInformationStep(MEnterServiceInformationStep mEnterServiceInformationStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mEnterServiceInformationStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCreateDirectoryStep(MCreateDirectoryStep mCreateDirectoryStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mCreateDirectoryStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCheckFreeDiskSpaceStep(MCheckFreeDiskSpaceStep mCheckFreeDiskSpaceStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mCheckFreeDiskSpaceStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAudioStep(MAudioStep mAudioStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mAudioStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCheckInputLevelsStep(MCheckInputLevelsStep mCheckInputLevelsStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mCheckInputLevelsStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRecordStep(MRecordStep mRecordStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mRecordStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMConvertToMP3Step(MConvertToMP3Step mConvertToMP3Step, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mConvertToMP3Step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPublishMp3sStep(MPublishMp3sStep mPublishMp3sStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mPublishMp3sStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMUpdatePublishedMp3sStep(MUpdatePublishedMp3sStep mUpdatePublishedMp3sStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mUpdatePublishedMp3sStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPublishNewMp3Step(MPublishNewMp3Step mPublishNewMp3Step, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mPublishNewMp3Step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEmailEventLogStep(MEmailEventLogStep mEmailEventLogStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mEmailEventLogStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMp3Folder(MMp3Folder mMp3Folder, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mMp3Folder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMp3(MMp3 mMp3, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mMp3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBurnCdStep(MBurnCdStep mBurnCdStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mBurnCdStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFtpStep(MFtpStep mFtpStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mFtpStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTestStep(MTestStep mTestStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mTestStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMNameTagMp3Step(MNameTagMp3Step mNameTagMp3Step, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mNameTagMp3Step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTagStep(MTagStep mTagStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mTagStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDmsApplicationMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep mDmsApplicationMGetDataUpgradeInfoStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mDmsApplicationMGetDataUpgradeInfoStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDmsApplicationMUpgradeDataStep(MDmsApplicationMUpgradeDataStep mDmsApplicationMUpgradeDataStep, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint((EObject)mDmsApplicationMUpgradeDataStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDirectory(File mDirectory, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMExistingDirectory(File mExistingDirectory, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFile(File mFile, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMExistingFile(File mExistingFile, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMState(State mState, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMStepState(State mStepState, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBoolean(Boolean mBoolean, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDateTime(Date mDateTime, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDate(Date mDate, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTime(Date mTime, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDuration(Long mDuration, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLong(Long mLong, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPassword(String mPassword, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMString(String mString, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMUrl(URL mUrl, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEThrowable(Throwable eThrowable, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMp3State(State mMp3State, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * @see org.eclipse.emf.ecore.util.EObjectValidator#getEcoreResourceLocator()
	 */
	@Override
	protected ResourceLocator getEcoreResourceLocator() {
		return Plugin.INSTANCE;
	}
} //LogicValidator
