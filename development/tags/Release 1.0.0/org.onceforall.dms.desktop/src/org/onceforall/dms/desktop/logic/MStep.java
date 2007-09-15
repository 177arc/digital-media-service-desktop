/*
 * Revision History:
 * $Log: MStep.java,v $
 * Revision 1.4  2007/05/12 10:56:31  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:26  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MStep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getMInputSteps <em>MInput Steps</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getFixedMParameters <em>Fixed MParameters</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getFixedMResults <em>Fixed MResults</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getExclusiveProperty <em>Exclusive Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getStateProperty <em>State Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getMProgressProperty <em>MProgress Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getProgressProperty <em>Progress Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getMProgressStatusProperty <em>MProgress Status Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getProgressStatusProperty <em>Progress Status Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getMStartTriggerProperty <em>MStart Trigger Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getStartTriggerProperty <em>Start Trigger Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#isInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#isStoppable <em>Stoppable</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#isTerminatable <em>Terminatable</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getActionName <em>Action Name</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MStep#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='Task' compositeClassName='org.onceforall.dms.desktop.ui.MStepComposite'"
 * @generated
 */
public abstract class MStep extends MStatefulObject implements Runnable {
    
    /** Specifies the progress that indicates that a managed step has been completed. */
    public static final Long COMPLETED_PROGRESS = new Long(100);

	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "Task";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MStep.class.getName();
	
    /** Specifies the thread to enables the concurrent processing of the managed step. */
    protected MStepThread thread;

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MStep.TYPE_NAME, new ReferenceType("Reference to "+MStep.TYPE_NAME, "Specifies a reference to a "+MStep.TYPE_NAME_FOR_UI, MStep.class));
	}
	/**
	 * The cached value of the '{@link #getMInputSteps() <em>MInput Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInputSteps()
	 * @generated
	 * @ordered
	 */
	protected EList mInputSteps = null;

	/**
	 * The default value of the '{@link #getExclusiveProperty() <em>Exclusive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_PROPERTY_EDEFAULT = Boolean.FALSE;
	
	/**
	 * Get the default value of the '{@link #getExclusiveProperty() <em>Exclusive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getExclusiveProperty() <em>Exclusive Property</em>}' attribute.
	 * @see #getExclusiveProperty()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultExclusiveProperty() {
		return EXCLUSIVE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getExclusiveProperty() <em>Exclusive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveProperty()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveProperty = EXCLUSIVE_PROPERTY_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_PROPERTY_EDEFAULT = (State)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMStepState(), "Pending");
	
	/**
	 * Get the default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	public State getDefaultStateProperty() {
		return STATE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	protected State stateProperty = STATE_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMProgressProperty() <em>MProgress Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mProgressProperty = null;

	/**
	 * The default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROGRESS_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultProgressProperty() {
		return PROGRESS_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getProgressProperty() <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressProperty()
	 * @generated
	 * @ordered
	 */
	protected Long progressProperty = PROGRESS_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMProgressStatusProperty() <em>MProgress Status Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mProgressStatusProperty = null;

	/**
	 * The default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRESS_STATUS_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultProgressStatusProperty() {
		return PROGRESS_STATUS_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getProgressStatusProperty() <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressStatusProperty()
	 * @generated
	 * @ordered
	 */
	protected String progressStatusProperty = PROGRESS_STATUS_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMStartTriggerProperty() <em>MStart Trigger Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStartTriggerProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mStartTriggerProperty = null;

	/**
	 * The default value of the '{@link #getStartTriggerProperty() <em>Start Trigger Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTriggerProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TRIGGER_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getStartTriggerProperty() <em>Start Trigger Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getStartTriggerProperty() <em>Start Trigger Property</em>}' attribute.
	 * @see #getStartTriggerProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultStartTriggerProperty() {
		return START_TRIGGER_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getStartTriggerProperty() <em>Start Trigger Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTriggerProperty()
	 * @generated
	 * @ordered
	 */
	protected String startTriggerProperty = START_TRIGGER_PROPERTY_EDEFAULT;
	
	/**
	 * The default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERRUPTABLE_EDEFAULT = false;
	
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
		return INTERRUPTABLE_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	protected boolean interruptable = INTERRUPTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoppable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOPPABLE_EDEFAULT = false;
	
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
		return STOPPABLE_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoppable()
	 * @generated
	 * @ordered
	 */
	protected boolean stoppable = STOPPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINATABLE_EDEFAULT = false;
	
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
		return TERMINATABLE_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminatable()
	 * @generated
	 * @ordered
	 */
	protected boolean terminatable = TERMINATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = "Start";
	
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
		return ACTION_NAME_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected String actionName = ACTION_NAME_EDEFAULT;
	
	
	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final Throwable EXCEPTION_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	public Throwable getDefaultException() {
		return EXCEPTION_EDEFAULT;
	}
	
	/** Specifies (if any) the exception that was thrown during execution of this managed step. If the exception is set, the managed step state should be either 'Warning' or 'Error'. */
	protected Throwable exception;
	
	
	/** Specifies whether this managed step is executed synchronously or in its own thread. */
	protected boolean synchronous;
	
	/**
	 * Get the default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultCompositeClassName() {
		return "org.onceforall.dms.desktop.ui.MStepComposite";
	}

	/**
	 * Get the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTypeNameForUI() {
		return "Task";
	}
	/** Specifies the managed parameters of this managed object. This list is compiled on demand and therefore
	 * you should use the {@link #getFixedMParameters()} method to get them .*/
	protected EList fixedMParameters;

	/** Specifies the managed results of this managed object. This list is compiled on demand and therefore
	 * you should use the {@link #getFixedMResults()} method to get them .*/
	protected EList fixedMResults;

    /**
     * Determines whether the given state represents a processing state, i.e. an active managed step.
     *
     * @param state Specifies the state to be tested.
     * @return Returns  whether the given state represents a processing state.
     */
    public static boolean isProcessingState(State state) {
        return(state != null && (state.equals(MStepStateType.PROCESSING_STATE) || state.equals(MStepStateType.PAUSING_STATE)
                || state.equals(MStepStateType.PAUSED_STATE) || state.equals(MStepStateType.STOPPING_STATE)
                || state.equals(MStepStateType.TERMINATING_STATE)));
    }

    /**
     * Determines whether the given state represents a non-procssing state, i.e. an inactive managed step.
     *
     * @param state Specifies the state to be tested.
     * @return Returns whether the given state represents a non-procssing state.
     */
    public static boolean isNonProcessingState(State state) {
        return(state != null && (state.equals(MStepStateType.PENDING_STATE) || state.equals(MStepStateType.WARNING_STATE) || state.equals(MStepStateType.ERROR_STATE)
                || state.equals(MStepStateType.TERMINATED_STATE) || state.equals(MStepStateType.SKIPPED_STATE) || state.equals(MStepStateType.COMPLETED_STATE)));
    }
    
    /**
     * Determines whether the steps state represents a processing state, i.e. is an active managed step.
     *
     * @return Returns  whether the steps state represents a processing state.
     */
    public boolean isInProcessingState() {
        return(isProcessingState(getStateProperty()));
    }
    
    /**
     * Determines whether the steps state represents a non-processing state, i.e. is an inactive managed step.
     *
     * @return Returns  whether the steps state represents a non-processing state.
     */
    public boolean isInNonProcessingState() {
        return(isNonProcessingState(getStateProperty()));
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MStep() {
		super();
		
		firstMStepConstructorHook();
				
		compositeClassName = "org.onceforall.dms.desktop.ui.MStepComposite";
		typeNameForUI = "Task";
					 
		setMStateProperty(new MProperty(true, "State", "Specifies the current state.", null));			 
		setMProgressProperty(new MProperty(true, "Progress", "Specifies the progress of the processing in %.", null));			 
		setMProgressStatusProperty(new MProperty(true, "Progress status", "Specifies a textual representation of the progress.", null));			 
		setMStartTriggerProperty(new MProperty(false, "Start trigger", "Specifies when the step should be started.\r\n\r\nIt can hold the following values:\r\n   \'Manual\' means that the step only starts when you explicitly request it.\r\n   \'Semi-automatic\' means that the step will request to be started when all steps it depends on have been completed and all necessary parameters have been entered.\r\n   \'Automatic\' means that the step will automatically start all steps it depends on have been completed and all necessary parameters have been entered.", null));

		lastMStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MSTEP;
	}
			
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMStateProperty(MProperty newMStateProperty) {				
		if(newMStateProperty != null) {
				newMStateProperty.setDefaultName("State");
				newMStateProperty.setDefaultDescription("Specifies the current state.");
			newMStateProperty.setValueType(Type.getTypeForName("Step state"));
			newMStateProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSTEP__STATE_PROPERTY));
			newMStateProperty.setHistoricValuesEFeature(null);
		}
		
		// Transfers the adpaters from the old managed value to the new one.
		if(mStateProperty != null) {
			if(newMStateProperty != null)
				newMStateProperty.eAdapters().addAll(mStateProperty.eAdapters());			
			
			mStateProperty.eAdapters().clear();
		} 
		
		super.setMStateProperty(newMStateProperty);	  		
	}
    		
	/**
	 * Returns the value of the '<em><b>MInput Steps</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MInput Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInput Steps</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_MInputSteps()
	 * @model type="org.onceforall.dms.desktop.logic.MStep" resolveProxies="false" ordered="false"
	 * @generated
	 */
	public EList getMInputSteps() {
		if (mInputSteps == null) {
			mInputSteps = new EObjectEList(MStep.class, this, LogicPackage.MSTEP__MINPUT_STEPS);
		}
		return mInputSteps;
	}

																																																																																																								/**
	 * Returns the value of the '<em><b>MParameters</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MParameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MParameters</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_FixedMParameters()
	 * @model type="org.onceforall.dms.desktop.logic.MParameter" transient="true" volatile="true" derived="true"
	 */
	public EList getFixedMParameters() {
		if(fixedMParameters == null)
			fixedMParameters = getReferencedMElements(MParameter.class, new SilentEcoreEList(MParameter.class, this));
		
		return fixedMParameters;
	}

/**
	 * Returns the value of the '<em><b>MResults</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MResults</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MResults</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_FixedMResults()
	 * @model type="org.onceforall.dms.desktop.logic.MResult" resolveProxies="false" transient="true" volatile="true" derived="true"
	 */
	public EList getFixedMResults() {
		if(fixedMResults == null)
			fixedMResults = getReferencedMElements(MResult.class, new SilentEcoreEList(MResult.class, this));
		
		return fixedMResults;
	}

	/**
	 * Returns the value of the '<em><b>Exclusive Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Property</em>' attribute.
	 * @see #setExclusiveProperty(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_ExclusiveProperty()
	 * @model default="false" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true"
	 * @generated
	 */
	public Boolean getExclusiveProperty() {
		return exclusiveProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getExclusiveProperty <em>Exclusive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newExclusiveProperty the new value of the '<em>Exclusive Property</em>' attribute.
	 * @see #getExclusiveProperty()
	 * @generated
	 */
	public void setExclusiveProperty(Boolean newExclusiveProperty) {
		Boolean oldExclusiveProperty = exclusiveProperty;
		exclusiveProperty = newExclusiveProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__EXCLUSIVE_PROPERTY, oldExclusiveProperty, exclusiveProperty));
	}

	/**
	 * Returns the value of the '<em><b>State Property</b></em>' attribute.
	 * The default value is <code>"Pending"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Property</em>' attribute.
	 * @see #setStateProperty(State)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_StateProperty()
	 * @model default="Pending" dataType="org.onceforall.dms.desktop.logic.MStepState" required="true" transient="true"
	 * @generated
	 */
	public State getStateProperty() {
		return stateProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getStateProperty <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newStateProperty the new value of the '<em>State Property</em>' attribute.
	 * @see #getStateProperty()
	 * @generated
	 */
	public void setStateProperty(State newStateProperty) {
		State oldStateProperty = stateProperty;
		stateProperty = newStateProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__STATE_PROPERTY, oldStateProperty, stateProperty));
	}

	/**
	 * Returns the value of the '<em><b>MProgress Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProgress Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProgress Property</em>' containment reference.
	 * @see #setMProgressProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_MProgressProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Progress' description='Specifies the progress of the processing in %.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMProgressProperty() {
		return mProgressProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMProgressProperty(MProperty newMProgressProperty, NotificationChain msgs) {
		MProperty oldMProgressProperty = mProgressProperty;
		mProgressProperty = newMProgressProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MPROGRESS_PROPERTY, oldMProgressProperty, newMProgressProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getMProgressProperty <em>MProgress Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMProgressProperty the new value of the '<em>MProgress Property</em>' containment reference.
	 * @see #getMProgressProperty()
	 * @generated
	 */
	public void setMProgressProperty(MProperty newMProgressProperty) {
		if (newMProgressProperty != mProgressProperty) {
			NotificationChain msgs = null;
			if (mProgressProperty != null)
				msgs = ((InternalEObject)mProgressProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MPROGRESS_PROPERTY, null, msgs);
			if (newMProgressProperty != null) {				
				newMProgressProperty.setDefaultName("Progress");
				newMProgressProperty.setDefaultDescription("Specifies the progress of the processing in %.");
				newMProgressProperty.setValueType(Type.getTypeForName("Number"));
				newMProgressProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSTEP__PROGRESS_PROPERTY));
				newMProgressProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMProgressProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MPROGRESS_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mProgressProperty != null) {
				if(newMProgressProperty != null)
					newMProgressProperty.eAdapters().addAll(mProgressProperty.eAdapters());			
			
				mProgressProperty.eAdapters().clear();
			}
			msgs = basicSetMProgressProperty(newMProgressProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MPROGRESS_PROPERTY, newMProgressProperty, newMProgressProperty));
	}

	/**
	 * Returns the value of the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Property</em>' attribute.
	 * @see #setProgressProperty(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_ProgressProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" transient="true"
	 * @generated
	 */
	public Long getProgressProperty() {
		return progressProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getProgressProperty <em>Progress Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProgressProperty the new value of the '<em>Progress Property</em>' attribute.
	 * @see #getProgressProperty()
	 * @generated
	 */
	public void setProgressProperty(Long newProgressProperty) {
		Long oldProgressProperty = progressProperty;
		progressProperty = newProgressProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__PROGRESS_PROPERTY, oldProgressProperty, progressProperty));
	}

	/**
	 * Returns the value of the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProgress Status Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProgress Status Property</em>' containment reference.
	 * @see #setMProgressStatusProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_MProgressStatusProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Progress status' description='Specifies a textual representation of the progress.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMProgressStatusProperty() {
		return mProgressStatusProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMProgressStatusProperty(MProperty newMProgressStatusProperty, NotificationChain msgs) {
		MProperty oldMProgressStatusProperty = mProgressStatusProperty;
		mProgressStatusProperty = newMProgressStatusProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY, oldMProgressStatusProperty, newMProgressStatusProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getMProgressStatusProperty <em>MProgress Status Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMProgressStatusProperty the new value of the '<em>MProgress Status Property</em>' containment reference.
	 * @see #getMProgressStatusProperty()
	 * @generated
	 */
	public void setMProgressStatusProperty(MProperty newMProgressStatusProperty) {
		if (newMProgressStatusProperty != mProgressStatusProperty) {
			NotificationChain msgs = null;
			if (mProgressStatusProperty != null)
				msgs = ((InternalEObject)mProgressStatusProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY, null, msgs);
			if (newMProgressStatusProperty != null) {				
				newMProgressStatusProperty.setDefaultName("Progress status");
				newMProgressStatusProperty.setDefaultDescription("Specifies a textual representation of the progress.");
				newMProgressStatusProperty.setValueType(Type.getTypeForName("Text"));
				newMProgressStatusProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY));
				newMProgressStatusProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMProgressStatusProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mProgressStatusProperty != null) {
				if(newMProgressStatusProperty != null)
					newMProgressStatusProperty.eAdapters().addAll(mProgressStatusProperty.eAdapters());			
			
				mProgressStatusProperty.eAdapters().clear();
			}
			msgs = basicSetMProgressStatusProperty(newMProgressStatusProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY, newMProgressStatusProperty, newMProgressStatusProperty));
	}

	/**
	 * Returns the value of the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Status Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Status Property</em>' attribute.
	 * @see #setProgressStatusProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_ProgressStatusProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getProgressStatusProperty() {
		return progressStatusProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getProgressStatusProperty <em>Progress Status Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProgressStatusProperty the new value of the '<em>Progress Status Property</em>' attribute.
	 * @see #getProgressStatusProperty()
	 * @generated
	 */
	public void setProgressStatusProperty(String newProgressStatusProperty) {
		String oldProgressStatusProperty = progressStatusProperty;
		progressStatusProperty = newProgressStatusProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY, oldProgressStatusProperty, progressStatusProperty));
	}

	/**
	 * Returns the value of the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MStart Trigger Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStart Trigger Property</em>' containment reference.
	 * @see #setMStartTriggerProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_MStartTriggerProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Start trigger' description='Specifies when the step should be started.\r\n\r\nIt can hold the following values:\r\n   \'Manual\' means that the step only starts when you explicitly request it.\r\n   \'Semi-automatic\' means that the step will request to be started when all steps it depends on have been completed and all necessary parameters have been entered.\r\n   \'Automatic\' means that the step will automatically start all steps it depends on have been completed and all necessary parameters have been entered.'"
	 * @generated
	 */
	public MProperty getMStartTriggerProperty() {
		return mStartTriggerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStartTriggerProperty(MProperty newMStartTriggerProperty, NotificationChain msgs) {
		MProperty oldMStartTriggerProperty = mStartTriggerProperty;
		mStartTriggerProperty = newMStartTriggerProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY, oldMStartTriggerProperty, newMStartTriggerProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getMStartTriggerProperty <em>MStart Trigger Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMStartTriggerProperty the new value of the '<em>MStart Trigger Property</em>' containment reference.
	 * @see #getMStartTriggerProperty()
	 * @generated
	 */
	public void setMStartTriggerProperty(MProperty newMStartTriggerProperty) {
		if (newMStartTriggerProperty != mStartTriggerProperty) {
			NotificationChain msgs = null;
			if (mStartTriggerProperty != null)
				msgs = ((InternalEObject)mStartTriggerProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY, null, msgs);
			if (newMStartTriggerProperty != null) {				
				newMStartTriggerProperty.setDefaultDescription("Specifies when the step should be started.\r\n\r\nIt can hold the following values:\r\n   \'Manual\' means that the step only starts when you explicitly request it.\r\n   \'Semi-automatic\' means that the step will request to be started when all steps it depends on have been completed and all necessary parameters have been entered.\r\n   \'Automatic\' means that the step will automatically start all steps it depends on have been completed and all necessary parameters have been entered.");
				newMStartTriggerProperty.setDefaultName("Start trigger");
				newMStartTriggerProperty.setValueType(Type.getTypeForName("Text"));
				newMStartTriggerProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MSTEP__START_TRIGGER_PROPERTY));
				newMStartTriggerProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMStartTriggerProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mStartTriggerProperty != null) {
				if(newMStartTriggerProperty != null)
					newMStartTriggerProperty.eAdapters().addAll(mStartTriggerProperty.eAdapters());			
			
				mStartTriggerProperty.eAdapters().clear();
			}
			msgs = basicSetMStartTriggerProperty(newMStartTriggerProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY, newMStartTriggerProperty, newMStartTriggerProperty));
	}

	/**
	 * Returns the value of the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Trigger Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Trigger Property</em>' attribute.
	 * @see #setStartTriggerProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_StartTriggerProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getStartTriggerProperty() {
		return startTriggerProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getStartTriggerProperty <em>Start Trigger Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newStartTriggerProperty the new value of the '<em>Start Trigger Property</em>' attribute.
	 * @see #getStartTriggerProperty()
	 * @generated
	 */
	public void setStartTriggerProperty(String newStartTriggerProperty) {
		String oldStartTriggerProperty = startTriggerProperty;
		startTriggerProperty = newStartTriggerProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__START_TRIGGER_PROPERTY, oldStartTriggerProperty, startTriggerProperty));
	}

	/**
	 * Returns the value of the '<em><b>Interruptable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interruptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interruptable</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_Interruptable()
	 * @model default="false" required="true" transient="true" changeable="false"
	 * @generated
	 */
	public boolean isInterruptable() {
		return interruptable;
	}

	/**
	 * Returns the value of the '<em><b>Stoppable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stoppable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stoppable</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_Stoppable()
	 * @model default="false" required="true" transient="true" changeable="false"
	 * @generated
	 */
	public boolean isStoppable() {
		return stoppable;
	}

	/**
	 * Returns the value of the '<em><b>Terminatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminatable</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_Terminatable()
	 * @model default="false" required="true" transient="true" changeable="false"
	 * @generated
	 */
	public boolean isTerminatable() {
		return terminatable;
	}

	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * The default value is <code>"Start"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep_ActionName()
	 * @model default="Start" required="true"
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MStep#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionName the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	public void setActionName(String newActionName) {
		String oldActionName = actionName;
		actionName = newActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MSTEP__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * Gets (if any) the exception that was thrown during execution of this managed step.
	 * If the exception is set, the managed step state should be either 'Warning' or 'Error'.
	 * 
	 * @return Returns (if any) the exception that was thrown during execution of this managed step.
	 */
	public Throwable getException() {
		return exception;
	}

																																																								    /**
     * Sets (if any) the exception that was thrown during execution of this managed step.
	 * If the exception is set, the managed step state should be either 'Warning' or 'Error'.
     * 
     * @param exception Specifies the exception that caused the managed step to terminate.
     */
    protected void setException(Throwable exception) {
        this.exception = exception;
        
        if(!(exception instanceof DesktopException) 
        		|| ((DesktopException) exception).getSeverity() >= DesktopException.ERROR_SEVERITY)
        	setStateProperty(MStepStateType.ERROR_STATE);
        
        if(exception instanceof DesktopException && ((DesktopException) exception).getSeverity() == DesktopException.WARNING_SEVERITY)
    		setStateProperty(MStepStateType.WARNING_STATE);       	
    }

	/**
	 * Determines whether this managed step is executed synchronously or in its own thread.
	 *
	 * @return Returns whether this managed step is executed synchronously or in its own thread.
	 */
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:
				return basicSetMProgressProperty(null, msgs);
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:
				return basicSetMProgressStatusProperty(null, msgs);
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:
				return basicSetMStartTriggerProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MSTEP__MINPUT_STEPS:
				return getMInputSteps();
			case LogicPackage.MSTEP__FIXED_MPARAMETERS:
				return getFixedMParameters();
			case LogicPackage.MSTEP__FIXED_MRESULTS:
				return getFixedMResults();
			case LogicPackage.MSTEP__EXCLUSIVE_PROPERTY:
				return getExclusiveProperty();
			case LogicPackage.MSTEP__STATE_PROPERTY:
				return getStateProperty();
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:
				return getMProgressProperty();
			case LogicPackage.MSTEP__PROGRESS_PROPERTY:
				return getProgressProperty();
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:
				return getMProgressStatusProperty();
			case LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY:
				return getProgressStatusProperty();
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:
				return getMStartTriggerProperty();
			case LogicPackage.MSTEP__START_TRIGGER_PROPERTY:
				return getStartTriggerProperty();
			case LogicPackage.MSTEP__INTERRUPTABLE:
				return isInterruptable() ? Boolean.TRUE : Boolean.FALSE;
			case LogicPackage.MSTEP__STOPPABLE:
				return isStoppable() ? Boolean.TRUE : Boolean.FALSE;
			case LogicPackage.MSTEP__TERMINATABLE:
				return isTerminatable() ? Boolean.TRUE : Boolean.FALSE;
			case LogicPackage.MSTEP__ACTION_NAME:
				return getActionName();
			case LogicPackage.MSTEP__EXCEPTION:
				return getException();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MSTEP__MINPUT_STEPS:
				getMInputSteps().clear();
				getMInputSteps().addAll((Collection)newValue);
				return;
			case LogicPackage.MSTEP__FIXED_MPARAMETERS:
				getFixedMParameters().clear();
				getFixedMParameters().addAll((Collection)newValue);
				return;
			case LogicPackage.MSTEP__FIXED_MRESULTS:
				getFixedMResults().clear();
				getFixedMResults().addAll((Collection)newValue);
				return;
			case LogicPackage.MSTEP__EXCLUSIVE_PROPERTY:    
				setExclusiveProperty((Boolean)newValue);
				return;
			case LogicPackage.MSTEP__STATE_PROPERTY:    
				setStateProperty((State)newValue);
				return;
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:    
				setMProgressProperty((MProperty)newValue);
				return;
			case LogicPackage.MSTEP__PROGRESS_PROPERTY:    
				setProgressProperty((Long)newValue);
				return;
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:    
				setMProgressStatusProperty((MProperty)newValue);
				return;
			case LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY:    
				setProgressStatusProperty((String)newValue);
				return;
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:    
				setMStartTriggerProperty((MProperty)newValue);
				return;
			case LogicPackage.MSTEP__START_TRIGGER_PROPERTY:    
				setStartTriggerProperty((String)newValue);
				return;
			case LogicPackage.MSTEP__ACTION_NAME:    
				setActionName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MSTEP__MINPUT_STEPS:
				getMInputSteps().clear();
				return;
			case LogicPackage.MSTEP__FIXED_MPARAMETERS:
				getFixedMParameters().clear();
				return;
			case LogicPackage.MSTEP__FIXED_MRESULTS:
				getFixedMResults().clear();
				return;
			case LogicPackage.MSTEP__EXCLUSIVE_PROPERTY:
				setExclusiveProperty(getDefaultExclusiveProperty());
				return;
			case LogicPackage.MSTEP__STATE_PROPERTY:
				setStateProperty(getDefaultStateProperty());
				return;
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:
				setMProgressProperty((MProperty)null);
				return;
			case LogicPackage.MSTEP__PROGRESS_PROPERTY:
				setProgressProperty(getDefaultProgressProperty());
				return;
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:
				setMProgressStatusProperty((MProperty)null);
				return;
			case LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY:
				setProgressStatusProperty(getDefaultProgressStatusProperty());
				return;
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:
				setMStartTriggerProperty((MProperty)null);
				return;
			case LogicPackage.MSTEP__START_TRIGGER_PROPERTY:
				setStartTriggerProperty(getDefaultStartTriggerProperty());
				return;
			case LogicPackage.MSTEP__ACTION_NAME:
				setActionName(getDefaultActionName());
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicPackage.MSTEP__MINPUT_STEPS:
				return mInputSteps != null && !mInputSteps.isEmpty();
			case LogicPackage.MSTEP__FIXED_MPARAMETERS:
				return !getFixedMParameters().isEmpty();
			case LogicPackage.MSTEP__FIXED_MRESULTS:
				return !getFixedMResults().isEmpty();
			case LogicPackage.MSTEP__EXCLUSIVE_PROPERTY:
				return getDefaultExclusiveProperty() == null ? exclusiveProperty != null : !getDefaultExclusiveProperty().equals(exclusiveProperty);
			case LogicPackage.MSTEP__STATE_PROPERTY:
				return getDefaultStateProperty() == null ? stateProperty != null : !getDefaultStateProperty().equals(stateProperty);
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:
				return mProgressProperty != null;
			case LogicPackage.MSTEP__PROGRESS_PROPERTY:
				return getDefaultProgressProperty() == null ? progressProperty != null : !getDefaultProgressProperty().equals(progressProperty);
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:
				return mProgressStatusProperty != null;
			case LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY:
				return getDefaultProgressStatusProperty() == null ? progressStatusProperty != null : !getDefaultProgressStatusProperty().equals(progressStatusProperty);
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:
				return mStartTriggerProperty != null;
			case LogicPackage.MSTEP__START_TRIGGER_PROPERTY:
				return getDefaultStartTriggerProperty() == null ? startTriggerProperty != null : !getDefaultStartTriggerProperty().equals(startTriggerProperty);
			case LogicPackage.MSTEP__INTERRUPTABLE:
				return interruptable != getDefaultInterruptable();
			case LogicPackage.MSTEP__STOPPABLE:
				return stoppable != getDefaultStoppable();
			case LogicPackage.MSTEP__TERMINATABLE:
				return terminatable != getDefaultTerminatable();
			case LogicPackage.MSTEP__ACTION_NAME:
				return getDefaultActionName() == null ? actionName != null : !getDefaultActionName().equals(actionName);
			case LogicPackage.MSTEP__EXCEPTION:
				return getDefaultException() == null ? exception != null : !getDefaultException().equals(exception);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exclusiveProperty: ");
		result.append(exclusiveProperty);
		result.append(", stateProperty: ");
		result.append(stateProperty);
		result.append(", progressProperty: ");
		result.append(progressProperty);
		result.append(", progressStatusProperty: ");
		result.append(progressStatusProperty);
		result.append(", startTriggerProperty: ");
		result.append(startTriggerProperty);
		result.append(", interruptable: ");
		result.append(interruptable);
		result.append(", stoppable: ");
		result.append(stoppable);
		result.append(", terminatable: ");
		result.append(terminatable);
		result.append(", actionName: ");
		result.append(actionName);
		result.append(", exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

    /**
     *  Requests the processing of the managed step to be suspended by changing the state of the managed step.
     *  When the managed step acutally will pause depends on how frequently the managed step thread checks the state of the managed step.
     */
    public void pause() {
        if(getStateProperty().equals(MStepStateType.PROCESSING_STATE))
        	setStateProperty(MStepStateType.PAUSED_STATE);
    }
   
    /**
     *  Requests the processing of the managed step to be resumed by changing the state of the managed step.
     *  When the managed step acutally will resume depends on how frequently the managed step thread checks the state of the managed step.
     */
    public void resume() {
        if(getStateProperty().equals(MStepStateType.PAUSED_STATE))
            setStateProperty(MStepStateType.PROCESSING_STATE);
    }
    
    /**
     *  Requests the processing of the managed step to be terminated by changing the state of the managed step.
     *  When the managed step acutally will stop depends on how frequently the managed step thread checks the state of the managed step.
     */
    public void stop() {
        //?if(getStateProperty().equals(MStepStateType.PROCESSING_STATE))
        //?	setStateProperty(MStepStateType.COMPLETED_STATE);
    }
    
    /**
     *  Requests the processing of the managed step to be forcefully terminated by changing the state of the managed step.
     *  When the managed step acutally will terminate depends on how frequently the managed step thread checks the state of the managed step.
     */
    public void terminate() {
        if(getStateProperty().equals(MStepStateType.PROCESSING_STATE))
        	setStateProperty(MStepStateType.TERMINATED_STATE);
    }
    
    /**
     *  Marks the managed step as skiped.
     */
    public void skip() {
    	setStateProperty(MStepStateType.SKIPPED_STATE);
    }
    
    /**
     * Executes the managed step. This method is run in the thread of the managed step,
     * not in thread that created the managed step. Sub classes should override
     * this method to define their own managed step behaviour.
     * 
     * @throws Throwable Thrown if an exception occurs during the execution.
     */
    protected void execute() throws Throwable {      
        try {
            Thread.sleep(300);
        } catch (InterruptedException exception) {}   

        // Does nothing by default.
    }

    /**
     * Initiates the execution of the managed step by starting the managed step thread.
     */
   public void run() {
    	try {
    		run(false);
    	}
    	catch(Throwable exception) {
    		// Does nothing.
    	}
    }
    /**
     * Initiates the execution of the managed step. The execution can be either synchronous
     * or in a thread.
     * 
     * @param isSynchronous Specifies whether to execute the managed step synchronously or not.
     * @exception Throwable Thrown if an exception occurs during the synchronous execution of the step. 
     * If the execution is asynchonous, exceptions will handled in a different way.
     */
    public void run(boolean isSynchronous) throws Throwable {
        // Makes sure that only one thread per managed step is running at one point in time.
        if(thread != null && thread.isAlive())
            return; 
        
        // Makes sure that no important pre-conditions are violated.
        try {
            validate();
        } catch (DesktopException exception) {
           if(exception.getSeverity() >= DesktopException.ERROR_SEVERITY)
               return;
        }
        
        // Adds historic parameter values.
        for(MParameter parameter: (List<MParameter>) getFixedMParameters())
            parameter.addHistoricValue();
        
        // Resets all results.
        for(MResult result: (List<MResult>) getFixedMResults())
        	result.setValue(null);
        
        // Resets the step's state.
    	this.synchronous = isSynchronous;
    	exception = null;
        
    	if(getProgressProperty() != null)
    		setProgressProperty(null);
    	
    	if(getProgressStatusProperty() != null)
    		setProgressStatusProperty(null);
        
    	setStateProperty(MStepStateType.PROCESSING_STATE);
        
        if(!isSynchronous) {
        	// Starts the thread.
        	thread = new MStepThread(this);
        	thread.start();
        }
        else
        	executeManaged(true);
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#validate()
	 */
	/*?@Override
	public DiagnosticChain validate() {
		DiagnosticChain chain =  super.validate();
		
		// Validates all managed parameters of the managed step.
		List<MParameter> parameters = getMParameters();
		for(MParameter parameter: parameters)
			VALIDATOR.validate(parameter, chain);

		return chain;
	}*/
    
    /**
     * Tests whether all execution conditions are fulfilled. These tests include parameter validation
     * and checking steps that this steps depends on. 
     *
     * @throws DesktopException Thrown if the execution conditions are not fulfilled.
     */
    public void validate() throws DesktopException {
    	// Makes sure that the step is not currently processing.
        State state = getStateProperty();
        if(state.equals(MStepStateType.PROCESSING_STATE) || state.equals(MStepStateType.TERMINATING_STATE) || state.equals(MStepStateType.STOPPING_STATE))
            throw new DesktopException("The step '"+getNameForUI()+"' is still processing.", "Please wait till the step has completed or stop the step first.", DesktopException.ERROR_SEVERITY, null);

        // Makes sure that all non-optional parameters have been entered.
        try {
	        for(MParameter mParameter: (List<MParameter>) getFixedMParameters())
	        	mParameter.validate();
        }
        catch(IllegalArgumentException exception) {
            throw new DesktopException(exception.getMessage(), "Please correct your input.", DesktopException.ERROR_SEVERITY, exception);            
        }
        
        // Check whether all input steps have completed.
        for(MStep mStep: (List<MStep>) getMInputSteps()) {
            state = mStep.getStateProperty();
            if(state.equals(MStepStateType.PENDING_STATE))
                throw new DesktopException("The step '"+getNameForUI()+"' depends on step '"+mStep.getName()+"', which has not been completed yet. It is still pending.", "Please complete '"+mStep.getName()+"' first.", DesktopException.WARNING_SEVERITY, null);
            
            if(state.equals(MStepStateType.ERROR_STATE))
                throw new DesktopException("The step '"+getNameForUI()+"' depends on step '"+mStep.getName()+"' which did not completed successfully. It caused an error.", "Please correct the problem before proceeding with '"+mStep.getName()+"',", DesktopException.WARNING_SEVERITY, null);
            
            if(state.equals(MStepStateType.TERMINATED_STATE))
                throw new DesktopException("The step '"+getNameForUI()+"' depends on step '"+mStep.getName()+"' which did not completed successfully. It was forcefully terminated.", "Please make sure the step processes completely before proceeding with '"+mStep.getName()+"',", DesktopException.WARNING_SEVERITY, null);
            
            if(state.equals(MStepStateType.STOPPING_STATE) || state.equals(MStepStateType.PAUSING_STATE) || state.equals(MStepStateType.TERMINATING_STATE))
                throw new DesktopException("The step '"+getNameForUI()+"' depends on step '"+mStep.getName()+"' which is still running.", "Please wait for '"+mStep.getName()+"' to complete.", DesktopException.ERROR_SEVERITY, null);
            
            if(state.equals(MStepStateType.SKIPPED_STATE))
                throw new DesktopException("The step '"+getNameForUI()+"' depends on step '"+mStep.getName()+"' which has been skipped.", null, DesktopException.WARNING_SEVERITY, null);
        }
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#activate()
	 */
	@Override
	public void activate() {
		super.activate();

		for(MParameter mParameter: (List<MParameter>) getFixedMParameters())
			mParameter.activate();

		for(MResult mResult: (List<MResult>) getFixedMResults())
			mResult.activate();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#deactivate()
	 */
	@Override
	public void deactivate() {
		for(MParameter mParameter: (List<MParameter>) getFixedMParameters())
			mParameter.deactivate();

		for(MResult mResult: (List<MResult>) getFixedMResults())
			mResult.deactivate();

		super.deactivate();
	}
	
	/**
	 * Executes the step and makes sure that the progress and state managed properties
	 * are updated correctly.
	 * 
     * @param synchronous Specifies whether to execute the managed step synchronously or not.
	 */
	protected void executeManaged(boolean synchronous) throws Throwable {
        try {
        	
            execute();
            if(!getStateProperty().equals(MStepStateType.TERMINATING_STATE)) {
            	setProgressProperty(100l);
            	setProgressStatusProperty(null);
                setStateProperty(MStepStateType.COMPLETED_STATE);
            }
            else {
            	setProgressStatusProperty(null);
                setStateProperty(MStepStateType.TERMINATED_STATE);                
            }
        
        }
        catch(Throwable exception) {
            setException(exception);
            
            if(synchronous)
            	throw exception;
        }
		
	}

	/**
	 * Defines a thread that is started when a managed step is executed
	 * to enable concurrent processing of the managed step.
	 */
	protected class MStepThread extends Thread {	    
	    /**
	     * 
	     * Creates a new managed step thread object.
	     * 
	     * @param mStep Specifies the managed step that the new thread belongs to. 
	     */
	    MStepThread(MStep mStep) {
	        super(MStep.this.getName());

	    }
	    
	    /**
	     * Calls the execute method of the step it belongs to.
	     */
	    public void run() {
	    	try {
	    		executeManaged(false);
	    	}
	    	catch(Throwable exception) {
	    		// Does nothing.
	    	}
	    } 
	}
    
    /**
     * Defines a class that update the progress bar depending on the number of bytes
     * read from the connected input stream.
     *
     * @author Marc
     */
    protected class MonitoredInputStream extends InputStream {
    	/** Specifies the input stream to monitor. */
    	private InputStream inputStream;
    	
    	/** Specifies the number of bytes that already have been read. */
    	private long bytesRead;

    	/** Specifies the length of the stream in bytes. */
    	private long streamBytes;
   	
    	/** Specifies the total number of bytes to read. */
    	private long totalBytes;

    	/** Specifies the number of bytes that have been read from the stream. */
    	private long totalStreamBytesRead;
    	
    	/** Specifies the time when the managed progress property was last updated. */
    	private long lastUpdate;
   	
    	/**
    	 * Creates a new monitored input stream object.
    	 *
    	 * @param inputStream Specifies the input stream to monitor.
    	 * @param bytesRead Specifies the number of bytes that already have been read.
    	 * @param streamBytes Specifies the length of the stream in bytes. 
    	 * @param totalBytes Specifies the total number of bytes to read.
    	 */
    	MonitoredInputStream(InputStream inputStream, long bytesRead, long streamBytes, long totalBytes) {
    		this.inputStream = inputStream;
    		this.bytesRead = bytesRead;
    		this.streamBytes = streamBytes;
    		this.totalBytes = totalBytes;
    		this.totalStreamBytesRead = bytesRead;
    	}
    	
    	/**
    	 * Updates the managed progress property.
    	 * 
    	 * @param streamBytesRead
    	 */
    	private void updateProgress(long streamBytesRead) {
    		totalStreamBytesRead += streamBytesRead;
    		
    		long now = System.currentTimeMillis();
    		if(now-lastUpdate > 500 || totalStreamBytesRead == bytesRead+streamBytes) {
    			lastUpdate = now;
    			
    			setProgressProperty((long)(totalStreamBytesRead/((float) totalBytes)*100));
    		}

    	}
    	
		/**
		 * @see java.io.InputStream#available()
		 */
		public int available() throws IOException {
			return inputStream.available();
		}

		/**
		 * @see java.io.InputStream#close()
		 */
		public void close() throws IOException {
			totalStreamBytesRead = bytesRead+streamBytes;
			updateProgress(0);
			inputStream.close();
		}

		/**
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		public boolean equals(Object obj) {
			return inputStream.equals(obj);
		}

		/**
		 * @see java.lang.Object#hashCode()
		 */
		public int hashCode() {
			return inputStream.hashCode();
		}

		/**
		 * @see java.io.InputStream#mark(int)
		 */
		public void mark(int readlimit) {
			inputStream.mark(readlimit);
		}

		/**
		 * @see java.io.InputStream#markSupported()
		 */
		public boolean markSupported() {
			return inputStream.markSupported();
		}

		/**
		 * @see java.io.InputStream#read()
		 */
		public int read() throws IOException {
			int result = inputStream.read();
			if(result >= 0)
				updateProgress(1);
			
			return result;
		}

		/**
		 * @see java.io.InputStream#read(byte[], int, int)
		 */
		public int read(byte[] b, int off, int len) throws IOException {
			int result = inputStream.read(b, off, len);
			
			if(result >= 0)
				updateProgress(result);
			
			return result;
		}

		/**
		 * @see java.io.InputStream#read(byte[])
		 */
		public int read(byte[] b) throws IOException {
			int result = inputStream.read(b);
			
			if(result >= 0)
				updateProgress(result);
			
			return result;
		}

		/**
		 * @see java.io.InputStream#reset()
		 */
		public void reset() throws IOException {
			inputStream.reset();
		}

		/**
		 * @see java.io.InputStream#skip(long)
		 */
		public long skip(long n) throws IOException {
			updateProgress(n);
			return inputStream.skip(n);
		}

		/**
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return inputStream.toString();
		}
    }
} // MStep
