/*
 * Revision History:
 * $Log: LogicSwitch.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.onceforall.dms.desktop.logic.LogicPackage
 * @generated
 */
public class LogicSwitch {
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
	protected static LogicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicPackage.MOBJECT: {
				MObject mObject = (MObject)theEObject;
				Object result = caseMObject(mObject);
				if (result == null) result = caseMElement(mObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MELEMENT: {
				MElement mElement = (MElement)theEObject;
				Object result = caseMElement(mElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MPARAMETER: {
				MParameter mParameter = (MParameter)theEObject;
				Object result = caseMParameter(mParameter);
				if (result == null) result = caseMValue(mParameter);
				if (result == null) result = caseMElement(mParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MPROPERTY: {
				MProperty mProperty = (MProperty)theEObject;
				Object result = caseMProperty(mProperty);
				if (result == null) result = caseMValue(mProperty);
				if (result == null) result = caseMElement(mProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MRESULT: {
				MResult mResult = (MResult)theEObject;
				Object result = caseMResult(mResult);
				if (result == null) result = caseMValue(mResult);
				if (result == null) result = caseMElement(mResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MSTATEFUL_OBJECT: {
				MStatefulObject mStatefulObject = (MStatefulObject)theEObject;
				Object result = caseMStatefulObject(mStatefulObject);
				if (result == null) result = caseMObject(mStatefulObject);
				if (result == null) result = caseMElement(mStatefulObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MSTEP: {
				MStep mStep = (MStep)theEObject;
				Object result = caseMStep(mStep);
				if (result == null) result = caseMStatefulObject(mStep);
				if (result == null) result = caseMObject(mStep);
				if (result == null) result = caseMElement(mStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MVALUE: {
				MValue mValue = (MValue)theEObject;
				Object result = caseMValue(mValue);
				if (result == null) result = caseMElement(mValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MAPPLICATION: {
				MApplication mApplication = (MApplication)theEObject;
				Object result = caseMApplication(mApplication);
				if (result == null) result = caseMObject(mApplication);
				if (result == null) result = caseMElement(mApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MSCRIPT: {
				MScript mScript = (MScript)theEObject;
				Object result = caseMScript(mScript);
				if (result == null) result = caseMStatefulObject(mScript);
				if (result == null) result = caseMObject(mScript);
				if (result == null) result = caseMElement(mScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MDMS_APPLICATION: {
				MDmsApplication mDmsApplication = (MDmsApplication)theEObject;
				Object result = caseMDmsApplication(mDmsApplication);
				if (result == null) result = caseMApplication(mDmsApplication);
				if (result == null) result = caseMObject(mDmsApplication);
				if (result == null) result = caseMElement(mDmsApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP: {
				MDmsApplicationMGetDataUpgradeInfoStep mDmsApplicationMGetDataUpgradeInfoStep = (MDmsApplicationMGetDataUpgradeInfoStep)theEObject;
				Object result = caseMDmsApplicationMGetDataUpgradeInfoStep(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = caseMFtpStep(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = caseMStep(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = caseMStatefulObject(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = caseMObject(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = caseMElement(mDmsApplicationMGetDataUpgradeInfoStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP: {
				MDmsApplicationMUpgradeDataStep mDmsApplicationMUpgradeDataStep = (MDmsApplicationMUpgradeDataStep)theEObject;
				Object result = caseMDmsApplicationMUpgradeDataStep(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = caseMFtpStep(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = caseMStep(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = caseMStatefulObject(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = caseMObject(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = caseMElement(mDmsApplicationMUpgradeDataStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MENTER_INFORMATION_STEP: {
				MEnterInformationStep mEnterInformationStep = (MEnterInformationStep)theEObject;
				Object result = caseMEnterInformationStep(mEnterInformationStep);
				if (result == null) result = caseMStep(mEnterInformationStep);
				if (result == null) result = caseMStatefulObject(mEnterInformationStep);
				if (result == null) result = caseMObject(mEnterInformationStep);
				if (result == null) result = caseMElement(mEnterInformationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MENTER_WWX_INFORMATION_STEP: {
				MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep)theEObject;
				Object result = caseMEnterWwxInformationStep(mEnterWwxInformationStep);
				if (result == null) result = caseMEnterInformationStep(mEnterWwxInformationStep);
				if (result == null) result = caseMStep(mEnterWwxInformationStep);
				if (result == null) result = caseMStatefulObject(mEnterWwxInformationStep);
				if (result == null) result = caseMObject(mEnterWwxInformationStep);
				if (result == null) result = caseMElement(mEnterWwxInformationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP: {
				MEnterServiceInformationStep mEnterServiceInformationStep = (MEnterServiceInformationStep)theEObject;
				Object result = caseMEnterServiceInformationStep(mEnterServiceInformationStep);
				if (result == null) result = caseMEnterInformationStep(mEnterServiceInformationStep);
				if (result == null) result = caseMStep(mEnterServiceInformationStep);
				if (result == null) result = caseMStatefulObject(mEnterServiceInformationStep);
				if (result == null) result = caseMObject(mEnterServiceInformationStep);
				if (result == null) result = caseMElement(mEnterServiceInformationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MCREATE_DIRECTORY_STEP: {
				MCreateDirectoryStep mCreateDirectoryStep = (MCreateDirectoryStep)theEObject;
				Object result = caseMCreateDirectoryStep(mCreateDirectoryStep);
				if (result == null) result = caseMStep(mCreateDirectoryStep);
				if (result == null) result = caseMStatefulObject(mCreateDirectoryStep);
				if (result == null) result = caseMObject(mCreateDirectoryStep);
				if (result == null) result = caseMElement(mCreateDirectoryStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP: {
				MCheckFreeDiskSpaceStep mCheckFreeDiskSpaceStep = (MCheckFreeDiskSpaceStep)theEObject;
				Object result = caseMCheckFreeDiskSpaceStep(mCheckFreeDiskSpaceStep);
				if (result == null) result = caseMStep(mCheckFreeDiskSpaceStep);
				if (result == null) result = caseMStatefulObject(mCheckFreeDiskSpaceStep);
				if (result == null) result = caseMObject(mCheckFreeDiskSpaceStep);
				if (result == null) result = caseMElement(mCheckFreeDiskSpaceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MAUDIO_STEP: {
				MAudioStep mAudioStep = (MAudioStep)theEObject;
				Object result = caseMAudioStep(mAudioStep);
				if (result == null) result = caseMStep(mAudioStep);
				if (result == null) result = caseMStatefulObject(mAudioStep);
				if (result == null) result = caseMObject(mAudioStep);
				if (result == null) result = caseMElement(mAudioStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MCHECK_INPUT_LEVELS_STEP: {
				MCheckInputLevelsStep mCheckInputLevelsStep = (MCheckInputLevelsStep)theEObject;
				Object result = caseMCheckInputLevelsStep(mCheckInputLevelsStep);
				if (result == null) result = caseMAudioStep(mCheckInputLevelsStep);
				if (result == null) result = caseMStep(mCheckInputLevelsStep);
				if (result == null) result = caseMStatefulObject(mCheckInputLevelsStep);
				if (result == null) result = caseMObject(mCheckInputLevelsStep);
				if (result == null) result = caseMElement(mCheckInputLevelsStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MRECORD_STEP: {
				MRecordStep mRecordStep = (MRecordStep)theEObject;
				Object result = caseMRecordStep(mRecordStep);
				if (result == null) result = caseMAudioStep(mRecordStep);
				if (result == null) result = caseMStep(mRecordStep);
				if (result == null) result = caseMStatefulObject(mRecordStep);
				if (result == null) result = caseMObject(mRecordStep);
				if (result == null) result = caseMElement(mRecordStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MCONVERT_TO_MP3_STEP: {
				MConvertToMP3Step mConvertToMP3Step = (MConvertToMP3Step)theEObject;
				Object result = caseMConvertToMP3Step(mConvertToMP3Step);
				if (result == null) result = caseMTagStep(mConvertToMP3Step);
				if (result == null) result = caseMStep(mConvertToMP3Step);
				if (result == null) result = caseMStatefulObject(mConvertToMP3Step);
				if (result == null) result = caseMObject(mConvertToMP3Step);
				if (result == null) result = caseMElement(mConvertToMP3Step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MPUBLISH_MP3S_STEP: {
				MPublishMp3sStep mPublishMp3sStep = (MPublishMp3sStep)theEObject;
				Object result = caseMPublishMp3sStep(mPublishMp3sStep);
				if (result == null) result = caseMFtpStep(mPublishMp3sStep);
				if (result == null) result = caseMStep(mPublishMp3sStep);
				if (result == null) result = caseMStatefulObject(mPublishMp3sStep);
				if (result == null) result = caseMObject(mPublishMp3sStep);
				if (result == null) result = caseMElement(mPublishMp3sStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP: {
				MUpdatePublishedMp3sStep mUpdatePublishedMp3sStep = (MUpdatePublishedMp3sStep)theEObject;
				Object result = caseMUpdatePublishedMp3sStep(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMPublishMp3sStep(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMFtpStep(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMStep(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMStatefulObject(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMObject(mUpdatePublishedMp3sStep);
				if (result == null) result = caseMElement(mUpdatePublishedMp3sStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MPUBLISH_NEW_MP3_STEP: {
				MPublishNewMp3Step mPublishNewMp3Step = (MPublishNewMp3Step)theEObject;
				Object result = caseMPublishNewMp3Step(mPublishNewMp3Step);
				if (result == null) result = caseMPublishMp3sStep(mPublishNewMp3Step);
				if (result == null) result = caseMFtpStep(mPublishNewMp3Step);
				if (result == null) result = caseMStep(mPublishNewMp3Step);
				if (result == null) result = caseMStatefulObject(mPublishNewMp3Step);
				if (result == null) result = caseMObject(mPublishNewMp3Step);
				if (result == null) result = caseMElement(mPublishNewMp3Step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MEMAIL_EVENT_LOG_STEP: {
				MEmailEventLogStep mEmailEventLogStep = (MEmailEventLogStep)theEObject;
				Object result = caseMEmailEventLogStep(mEmailEventLogStep);
				if (result == null) result = caseMStep(mEmailEventLogStep);
				if (result == null) result = caseMStatefulObject(mEmailEventLogStep);
				if (result == null) result = caseMObject(mEmailEventLogStep);
				if (result == null) result = caseMElement(mEmailEventLogStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MMP3_FOLDER: {
				MMp3Folder mMp3Folder = (MMp3Folder)theEObject;
				Object result = caseMMp3Folder(mMp3Folder);
				if (result == null) result = caseMObject(mMp3Folder);
				if (result == null) result = caseMElement(mMp3Folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MMP3: {
				MMp3 mMp3 = (MMp3)theEObject;
				Object result = caseMMp3(mMp3);
				if (result == null) result = caseMStatefulObject(mMp3);
				if (result == null) result = caseMObject(mMp3);
				if (result == null) result = caseMElement(mMp3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MBURN_CD_STEP: {
				MBurnCdStep mBurnCdStep = (MBurnCdStep)theEObject;
				Object result = caseMBurnCdStep(mBurnCdStep);
				if (result == null) result = caseMStep(mBurnCdStep);
				if (result == null) result = caseMStatefulObject(mBurnCdStep);
				if (result == null) result = caseMObject(mBurnCdStep);
				if (result == null) result = caseMElement(mBurnCdStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MFTP_STEP: {
				MFtpStep mFtpStep = (MFtpStep)theEObject;
				Object result = caseMFtpStep(mFtpStep);
				if (result == null) result = caseMStep(mFtpStep);
				if (result == null) result = caseMStatefulObject(mFtpStep);
				if (result == null) result = caseMObject(mFtpStep);
				if (result == null) result = caseMElement(mFtpStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MTEST_STEP: {
				MTestStep mTestStep = (MTestStep)theEObject;
				Object result = caseMTestStep(mTestStep);
				if (result == null) result = caseMStep(mTestStep);
				if (result == null) result = caseMStatefulObject(mTestStep);
				if (result == null) result = caseMObject(mTestStep);
				if (result == null) result = caseMElement(mTestStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MNAME_TAG_MP3_STEP: {
				MNameTagMp3Step mNameTagMp3Step = (MNameTagMp3Step)theEObject;
				Object result = caseMNameTagMp3Step(mNameTagMp3Step);
				if (result == null) result = caseMTagStep(mNameTagMp3Step);
				if (result == null) result = caseMStep(mNameTagMp3Step);
				if (result == null) result = caseMStatefulObject(mNameTagMp3Step);
				if (result == null) result = caseMObject(mNameTagMp3Step);
				if (result == null) result = caseMElement(mNameTagMp3Step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.MTAG_STEP: {
				MTagStep mTagStep = (MTagStep)theEObject;
				Object result = caseMTagStep(mTagStep);
				if (result == null) result = caseMStep(mTagStep);
				if (result == null) result = caseMStatefulObject(mTagStep);
				if (result == null) result = caseMObject(mTagStep);
				if (result == null) result = caseMElement(mTagStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMObject(MObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMElement(MElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMParameter(MParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMProperty(MProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MResult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MResult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMResult(MResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStateful Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStateful Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMStatefulObject(MStatefulObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMStep(MStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMValue(MValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MApplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MApplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMApplication(MApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MScript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MScript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMScript(MScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDms Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDms Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMDmsApplication(MDmsApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnter Service Information Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnter Service Information Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMEnterServiceInformationStep(MEnterServiceInformationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCreate Directory Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCreate Directory Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMCreateDirectoryStep(MCreateDirectoryStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnter Information Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnter Information Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMEnterInformationStep(MEnterInformationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnter Wwx Information Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnter Wwx Information Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMEnterWwxInformationStep(MEnterWwxInformationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCheck Free Disk Space Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCheck Free Disk Space Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMCheckFreeDiskSpaceStep(MCheckFreeDiskSpaceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAudio Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAudio Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMAudioStep(MAudioStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCheck Input Levels Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCheck Input Levels Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMCheckInputLevelsStep(MCheckInputLevelsStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRecord Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRecord Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMRecordStep(MRecordStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConvert To MP3 Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConvert To MP3 Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMConvertToMP3Step(MConvertToMP3Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPublish Mp3s Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPublish Mp3s Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMPublishMp3sStep(MPublishMp3sStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MUpdate Published Mp3s Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MUpdate Published Mp3s Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMUpdatePublishedMp3sStep(MUpdatePublishedMp3sStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPublish New Mp3 Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPublish New Mp3 Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMPublishNewMp3Step(MPublishNewMp3Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEmail Event Log Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEmail Event Log Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMEmailEventLogStep(MEmailEventLogStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMp3 Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMp3 Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMMp3Folder(MMp3Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMp3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMp3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMMp3(MMp3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBurn Cd Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBurn Cd Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMBurnCdStep(MBurnCdStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFtp Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFtp Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMFtpStep(MFtpStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTest Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTest Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMTestStep(MTestStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MName Tag Mp3 Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MName Tag Mp3 Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMNameTagMp3Step(MNameTagMp3Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTag Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTag Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMTagStep(MTagStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDms Application MGet Data Upgrade Info Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDms Application MGet Data Upgrade Info Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMDmsApplicationMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDms Application MUpgrade Data Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDms Application MUpgrade Data Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMDmsApplicationMUpgradeDataStep(MDmsApplicationMUpgradeDataStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //LogicSwitch
