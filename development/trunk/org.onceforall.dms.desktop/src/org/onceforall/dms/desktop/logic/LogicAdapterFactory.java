/*
 * Revision History:
 * $Log: LogicAdapterFactory.java,v $
 * Revision 1.3  2007/05/12 10:56:29  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.onceforall.dms.desktop.logic.LogicPackage
 * @generated
 */
public class LogicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicSwitch modelSwitch =
		new LogicSwitch() {
			public Object caseMObject(MObject object) {
				return createMObjectAdapter();
			}
			public Object caseMElement(MElement object) {
				return createMElementAdapter();
			}
			public Object caseMParameter(MParameter object) {
				return createMParameterAdapter();
			}
			public Object caseMProperty(MProperty object) {
				return createMPropertyAdapter();
			}
			public Object caseMResult(MResult object) {
				return createMResultAdapter();
			}
			public Object caseMStatefulObject(MStatefulObject object) {
				return createMStatefulObjectAdapter();
			}
			public Object caseMStep(MStep object) {
				return createMStepAdapter();
			}
			public Object caseMValue(MValue object) {
				return createMValueAdapter();
			}
			public Object caseMApplication(MApplication object) {
				return createMApplicationAdapter();
			}
			public Object caseMScript(MScript object) {
				return createMScriptAdapter();
			}
			public Object caseMDmsApplication(MDmsApplication object) {
				return createMDmsApplicationAdapter();
			}
			public Object caseMDmsApplicationMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep object) {
				return createMDmsApplicationMGetDataUpgradeInfoStepAdapter();
			}
			public Object caseMDmsApplicationMUpgradeDataStep(MDmsApplicationMUpgradeDataStep object) {
				return createMDmsApplicationMUpgradeDataStepAdapter();
			}
			public Object caseMEnterInformationStep(MEnterInformationStep object) {
				return createMEnterInformationStepAdapter();
			}
			public Object caseMEnterWwxInformationStep(MEnterWwxInformationStep object) {
				return createMEnterWwxInformationStepAdapter();
			}
			public Object caseMEnterServiceInformationStep(MEnterServiceInformationStep object) {
				return createMEnterServiceInformationStepAdapter();
			}
			public Object caseMCreateDirectoryStep(MCreateDirectoryStep object) {
				return createMCreateDirectoryStepAdapter();
			}
			public Object caseMCheckFreeDiskSpaceStep(MCheckFreeDiskSpaceStep object) {
				return createMCheckFreeDiskSpaceStepAdapter();
			}
			public Object caseMAudioStep(MAudioStep object) {
				return createMAudioStepAdapter();
			}
			public Object caseMCheckInputLevelsStep(MCheckInputLevelsStep object) {
				return createMCheckInputLevelsStepAdapter();
			}
			public Object caseMRecordStep(MRecordStep object) {
				return createMRecordStepAdapter();
			}
			public Object caseMConvertToMP3Step(MConvertToMP3Step object) {
				return createMConvertToMP3StepAdapter();
			}
			public Object caseMPublishMp3sStep(MPublishMp3sStep object) {
				return createMPublishMp3sStepAdapter();
			}
			public Object caseMUpdatePublishedMp3sStep(MUpdatePublishedMp3sStep object) {
				return createMUpdatePublishedMp3sStepAdapter();
			}
			public Object caseMPublishNewMp3Step(MPublishNewMp3Step object) {
				return createMPublishNewMp3StepAdapter();
			}
			public Object caseMEmailEventLogStep(MEmailEventLogStep object) {
				return createMEmailEventLogStepAdapter();
			}
			public Object caseMMp3Folder(MMp3Folder object) {
				return createMMp3FolderAdapter();
			}
			public Object caseMMp3(MMp3 object) {
				return createMMp3Adapter();
			}
			public Object caseMBurnCdStep(MBurnCdStep object) {
				return createMBurnCdStepAdapter();
			}
			public Object caseMFtpStep(MFtpStep object) {
				return createMFtpStepAdapter();
			}
			public Object caseMTestStep(MTestStep object) {
				return createMTestStepAdapter();
			}
			public Object caseMNameTagMp3Step(MNameTagMp3Step object) {
				return createMNameTagMp3StepAdapter();
			}
			public Object caseMTagStep(MTagStep object) {
				return createMTagStepAdapter();
			}
			public Object caseMCopyDirectoryStep(MCopyDirectoryStep object) {
				return createMCopyDirectoryStepAdapter();
			}
			public Object caseMManualTaskStep(MManualTaskStep object) {
				return createMManualTaskStepAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MObject <em>MObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MObject
	 * @generated
	 */
	public Adapter createMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MElement <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MElement
	 * @generated
	 */
	public Adapter createMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MParameter <em>MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MParameter
	 * @generated
	 */
	public Adapter createMParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MProperty <em>MProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MProperty
	 * @generated
	 */
	public Adapter createMPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MResult <em>MResult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MResult
	 * @generated
	 */
	public Adapter createMResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MStatefulObject <em>MStateful Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject
	 * @generated
	 */
	public Adapter createMStatefulObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MStep <em>MStep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MStep
	 * @generated
	 */
	public Adapter createMStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MValue <em>MValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MValue
	 * @generated
	 */
	public Adapter createMValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MApplication <em>MApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MApplication
	 * @generated
	 */
	public Adapter createMApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MScript <em>MScript</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MScript
	 * @generated
	 */
	public Adapter createMScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MDmsApplication <em>MDms Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication
	 * @generated
	 */
	public Adapter createMDmsApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep <em>MEnter Service Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep
	 * @generated
	 */
	public Adapter createMEnterServiceInformationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep <em>MCreate Directory Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep
	 * @generated
	 */
	public Adapter createMCreateDirectoryStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MEnterInformationStep <em>MEnter Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MEnterInformationStep
	 * @generated
	 */
	public Adapter createMEnterInformationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep <em>MEnter Wwx Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep
	 * @generated
	 */
	public Adapter createMEnterWwxInformationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep <em>MCheck Free Disk Space Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep
	 * @generated
	 */
	public Adapter createMCheckFreeDiskSpaceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MAudioStep <em>MAudio Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep
	 * @generated
	 */
	public Adapter createMAudioStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MCheckInputLevelsStep <em>MCheck Input Levels Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MCheckInputLevelsStep
	 * @generated
	 */
	public Adapter createMCheckInputLevelsStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MRecordStep <em>MRecord Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep
	 * @generated
	 */
	public Adapter createMRecordStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step <em>MConvert To MP3 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step
	 * @generated
	 */
	public Adapter createMConvertToMP3StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep <em>MPublish Mp3s Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep
	 * @generated
	 */
	public Adapter createMPublishMp3sStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep <em>MUpdate Published Mp3s Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep
	 * @generated
	 */
	public Adapter createMUpdatePublishedMp3sStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step <em>MPublish New Mp3 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step
	 * @generated
	 */
	public Adapter createMPublishNewMp3StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep <em>MEmail Event Log Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep
	 * @generated
	 */
	public Adapter createMEmailEventLogStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MMp3Folder <em>MMp3 Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MMp3Folder
	 * @generated
	 */
	public Adapter createMMp3FolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MMp3 <em>MMp3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MMp3
	 * @generated
	 */
	public Adapter createMMp3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MBurnCdStep <em>MBurn Cd Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep
	 * @generated
	 */
	public Adapter createMBurnCdStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MFtpStep <em>MFtp Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep
	 * @generated
	 */
	public Adapter createMFtpStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MTestStep <em>MTest Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MTestStep
	 * @generated
	 */
	public Adapter createMTestStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MNameTagMp3Step <em>MName Tag Mp3 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MNameTagMp3Step
	 * @generated
	 */
	public Adapter createMNameTagMp3StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MTagStep <em>MTag Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MTagStep
	 * @generated
	 */
	public Adapter createMTagStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep <em>MCopy Directory Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MCopyDirectoryStep
	 * @generated
	 */
	public Adapter createMCopyDirectoryStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MManualTaskStep <em>MManual Task Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MManualTaskStep
	 * @generated
	 */
	public Adapter createMManualTaskStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep <em>MDms Application MGet Data Upgrade Info Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep
	 * @generated
	 */
	public Adapter createMDmsApplicationMGetDataUpgradeInfoStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep <em>MDms Application MUpgrade Data Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep
	 * @generated
	 */
	public Adapter createMDmsApplicationMUpgradeDataStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogicAdapterFactory
