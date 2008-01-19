/*
 * Revision History:
 * $Log: LogicFactory.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.onceforall.dms.desktop.logic.types.State;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.onceforall.dms.desktop.logic.LogicPackage
 * @generated
 */
public class LogicFactory extends EFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogicFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicFactory init() {
		try {
			LogicFactory theLogicFactory = (LogicFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.onceforall.org/dms/desktop/model.ecore"); 
			if (theLogicFactory != null) {
				return theLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicPackage.MOBJECT: return (EObject)createMObject();
			case LogicPackage.MPARAMETER: return (EObject)createMParameter();
			case LogicPackage.MPROPERTY: return (EObject)createMProperty();
			case LogicPackage.MRESULT: return (EObject)createMResult();
			case LogicPackage.MSCRIPT: return (EObject)createMScript();
			case LogicPackage.MDMS_APPLICATION: return (EObject)createMDmsApplication();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP: return (EObject)createMEnterWwxInformationStep();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP: return (EObject)createMEnterServiceInformationStep();
			case LogicPackage.MCREATE_DIRECTORY_STEP: return (EObject)createMCreateDirectoryStep();
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP: return (EObject)createMCheckFreeDiskSpaceStep();
			case LogicPackage.MCHECK_INPUT_LEVELS_STEP: return (EObject)createMCheckInputLevelsStep();
			case LogicPackage.MRECORD_STEP: return (EObject)createMRecordStep();
			case LogicPackage.MCONVERT_TO_MP3_STEP: return (EObject)createMConvertToMP3Step();
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP: return (EObject)createMUpdatePublishedMp3sStep();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP: return (EObject)createMPublishNewMp3Step();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP: return (EObject)createMEmailEventLogStep();
			case LogicPackage.MMP3_FOLDER: return (EObject)createMMp3Folder();
			case LogicPackage.MMP3: return (EObject)createMMp3();
			case LogicPackage.MBURN_CD_STEP: return (EObject)createMBurnCdStep();
			case LogicPackage.MTEST_STEP: return (EObject)createMTestStep();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP: return (EObject)createMDmsApplicationMGetDataUpgradeInfoStep();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP: return (EObject)createMDmsApplicationMUpgradeDataStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LogicPackage.MFILE:
				return createMFileFromString(eDataType, initialValue);
			case LogicPackage.MEXISTING_FILE:
				return createMExistingFileFromString(eDataType, initialValue);
			case LogicPackage.MSTATE:
				return createMStateFromString(eDataType, initialValue);
			case LogicPackage.MSTEP_STATE:
				return createMStepStateFromString(eDataType, initialValue);
			case LogicPackage.MBOOLEAN:
				return createMBooleanFromString(eDataType, initialValue);
			case LogicPackage.MDATE_TIME:
				return createMDateTimeFromString(eDataType, initialValue);
			case LogicPackage.MDATE:
				return createMDateFromString(eDataType, initialValue);
			case LogicPackage.MTIME:
				return createMTimeFromString(eDataType, initialValue);
			case LogicPackage.MDURATION:
				return createMDurationFromString(eDataType, initialValue);
			case LogicPackage.MLONG:
				return createMLongFromString(eDataType, initialValue);
			case LogicPackage.MPASSWORD:
				return createMPasswordFromString(eDataType, initialValue);
			case LogicPackage.MSTRING:
				return createMStringFromString(eDataType, initialValue);
			case LogicPackage.MURL:
				return createMUrlFromString(eDataType, initialValue);
			case LogicPackage.ETHROWABLE:
				return createEThrowableFromString(eDataType, initialValue);
			case LogicPackage.MMP3_STATE:
				return createMMp3StateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LogicPackage.MFILE:
				return convertMFileToString(eDataType, instanceValue);
			case LogicPackage.MEXISTING_FILE:
				return convertMExistingFileToString(eDataType, instanceValue);
			case LogicPackage.MSTATE:
				return convertMStateToString(eDataType, instanceValue);
			case LogicPackage.MSTEP_STATE:
				return convertMStepStateToString(eDataType, instanceValue);
			case LogicPackage.MBOOLEAN:
				return convertMBooleanToString(eDataType, instanceValue);
			case LogicPackage.MDATE_TIME:
				return convertMDateTimeToString(eDataType, instanceValue);
			case LogicPackage.MDATE:
				return convertMDateToString(eDataType, instanceValue);
			case LogicPackage.MTIME:
				return convertMTimeToString(eDataType, instanceValue);
			case LogicPackage.MDURATION:
				return convertMDurationToString(eDataType, instanceValue);
			case LogicPackage.MLONG:
				return convertMLongToString(eDataType, instanceValue);
			case LogicPackage.MPASSWORD:
				return convertMPasswordToString(eDataType, instanceValue);
			case LogicPackage.MSTRING:
				return convertMStringToString(eDataType, instanceValue);
			case LogicPackage.MURL:
				return convertMUrlToString(eDataType, instanceValue);
			case LogicPackage.ETHROWABLE:
				return convertEThrowableToString(eDataType, instanceValue);
			case LogicPackage.MMP3_STATE:
				return convertMMp3StateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MObject createMObject() {
		MObject mObject = new MObject();
		return mObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParameter createMParameter() {
		MParameter mParameter = new MParameter();
		return mParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MProperty createMProperty() {
		MProperty mProperty = new MProperty();
		return mProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MResult createMResult() {
		MResult mResult = new MResult();
		return mResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCheckFreeDiskSpaceStep createMCheckFreeDiskSpaceStep() {
		MCheckFreeDiskSpaceStep mCheckFreeDiskSpaceStep = new MCheckFreeDiskSpaceStep();
		return mCheckFreeDiskSpaceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCheckInputLevelsStep createMCheckInputLevelsStep() {
		MCheckInputLevelsStep mCheckInputLevelsStep = new MCheckInputLevelsStep();
		return mCheckInputLevelsStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRecordStep createMRecordStep() {
		MRecordStep mRecordStep = new MRecordStep();
		return mRecordStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MConvertToMP3Step createMConvertToMP3Step() {
		MConvertToMP3Step mConvertToMP3Step = new MConvertToMP3Step();
		return mConvertToMP3Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MUpdatePublishedMp3sStep createMUpdatePublishedMp3sStep() {
		MUpdatePublishedMp3sStep mUpdatePublishedMp3sStep = new MUpdatePublishedMp3sStep();
		return mUpdatePublishedMp3sStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPublishNewMp3Step createMPublishNewMp3Step() {
		MPublishNewMp3Step mPublishNewMp3Step = new MPublishNewMp3Step();
		return mPublishNewMp3Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEmailEventLogStep createMEmailEventLogStep() {
		MEmailEventLogStep mEmailEventLogStep = new MEmailEventLogStep();
		return mEmailEventLogStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3Folder createMMp3Folder() {
		MMp3Folder mMp3Folder = new MMp3Folder();
		return mMp3Folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3 createMMp3() {
		MMp3 mMp3 = new MMp3();
		return mMp3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBurnCdStep createMBurnCdStep() {
		MBurnCdStep mBurnCdStep = new MBurnCdStep();
		return mBurnCdStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTestStep createMTestStep() {
		MTestStep mTestStep = new MTestStep();
		return mTestStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDmsApplicationMGetDataUpgradeInfoStep createMDmsApplicationMGetDataUpgradeInfoStep() {
		MDmsApplicationMGetDataUpgradeInfoStep mDmsApplicationMGetDataUpgradeInfoStep = new MDmsApplicationMGetDataUpgradeInfoStep();
		return mDmsApplicationMGetDataUpgradeInfoStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDmsApplicationMUpgradeDataStep createMDmsApplicationMUpgradeDataStep() {
		MDmsApplicationMUpgradeDataStep mDmsApplicationMUpgradeDataStep = new MDmsApplicationMUpgradeDataStep();
		return mDmsApplicationMUpgradeDataStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCreateDirectoryStep createMCreateDirectoryStep() {
		MCreateDirectoryStep mCreateDirectoryStep = new MCreateDirectoryStep();
		return mCreateDirectoryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEnterWwxInformationStep createMEnterWwxInformationStep() {
		MEnterWwxInformationStep mEnterWwxInformationStep = new MEnterWwxInformationStep();
		return mEnterWwxInformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEnterServiceInformationStep createMEnterServiceInformationStep() {
		MEnterServiceInformationStep mEnterServiceInformationStep = new MEnterServiceInformationStep();
		return mEnterServiceInformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MScript createMScript() {
		MScript mScript = new MScript();
		return mScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDmsApplication createMDmsApplication() {
		MDmsApplication mDmsApplication = new MDmsApplication();
		return mDmsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createEThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createMFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createMExistingFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMExistingFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createMStateFromString(EDataType eDataType, String initialValue) {
		return (State)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMStateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createMStepStateFromString(EDataType eDataType, String initialValue) {
		return (State)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMStepStateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createMBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createMDateTimeFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createMDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createMTimeFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createMDurationFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createMLongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMPasswordFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPasswordToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createMUrlFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMUrlToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createMMp3StateFromString(EDataType eDataType, String initialValue) {
		return (State)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMMp3StateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicPackage getLogicPackage() {
		return (LogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LogicPackage getPackage() {
		return LogicPackage.eINSTANCE;
	}

} //LogicFactory
