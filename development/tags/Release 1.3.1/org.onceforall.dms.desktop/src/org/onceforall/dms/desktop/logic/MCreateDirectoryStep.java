/*
 * Revision History:
 * $Log: MCreateDirectoryStep.java,v $
 * Revision 1.3  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCreate Directory Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMParentDirectoryParameter <em>MParent Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameter <em>Parent Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameterHistoricValues <em>Parent Directory Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryNameParameter <em>MDirectory Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryNameParameter <em>Directory Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryResult <em>MDirectory Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryResult <em>Directory Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Create directory' description='Creates a directory where the recorded files and other related files will be stored.' iconFilePath='Image Files/Create directory step.gif' actionName='Create' actionIconFilePath='Image Files/Create directory.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MCreateDirectoryStep extends MStep {
	/**
	 * Specifies the date formatter for the directory name.
	 */
	public static final DateFormat DIRECTORY_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MCreateDirectoryStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MCreateDirectoryStep.TYPE_NAME, new ReferenceType("Reference to "+MCreateDirectoryStep.TYPE_NAME, "Specifies a reference to a "+MCreateDirectoryStep.TYPE_NAME_FOR_UI, MCreateDirectoryStep.class));
	}
	/**
	 * The cached value of the '{@link #getMParentDirectoryParameter() <em>MParent Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMParentDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mParentDirectoryParameter;

	/**
	 * The default value of the '{@link #getParentDirectoryParameter() <em>Parent Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File PARENT_DIRECTORY_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getParentDirectoryParameter() <em>Parent Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getParentDirectoryParameter() <em>Parent Directory Parameter</em>}' attribute.
	 * @see #getParentDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultParentDirectoryParameter() {
		return PARENT_DIRECTORY_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getParentDirectoryParameter() <em>Parent Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected File parentDirectoryParameter = PARENT_DIRECTORY_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentDirectoryParameterHistoricValues() <em>Parent Directory Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDirectoryParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList parentDirectoryParameterHistoricValues;

	/**
	 * The cached value of the '{@link #getMDirectoryNameParameter() <em>MDirectory Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDirectoryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDirectoryNameParameter;

	/**
	 * The default value of the '{@link #getDirectoryNameParameter() <em>Directory Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File DIRECTORY_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDirectoryNameParameter() <em>Directory Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDirectoryNameParameter() <em>Directory Name Parameter</em>}' attribute.
	 * @see #getDirectoryNameParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDirectoryNameParameter() {
		return DIRECTORY_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDirectoryNameParameter() <em>Directory Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected File directoryNameParameter = DIRECTORY_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMDirectoryResult() <em>MDirectory Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mDirectoryResult;

	/**
	 * The default value of the '{@link #getDirectoryResult() <em>Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected static final File DIRECTORY_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDirectoryResult() <em>Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDirectoryResult() <em>Directory Result</em>}' attribute.
	 * @see #getDirectoryResult()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDirectoryResult() {
		return DIRECTORY_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDirectoryResult() <em>Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected File directoryResult = DIRECTORY_RESULT_EDEFAULT;

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
		return "Create";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Create directory.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Create directory step.gif");
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
		return "Creates a directory where the recorded files and other related files will be stored.";
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
		return "Create directory";
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCreateDirectoryStep() {
		super();
		
		firstMCreateDirectoryStepConstructorHook();
				
		description = "Creates a directory where the recorded files and other related files will be stored.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Create directory.gif");
		name = "Create directory";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Create directory step.gif");
		terminatable = false;
		interruptable = false;
		actionName = "Create";
			 
		setMParentDirectoryParameter(new MParameter(false, "Parent directory", "Specifies the path to the directory in which the new directory is to be created.", null));			 
		setMDirectoryNameParameter(new MParameter(false, "Directory name", "Specifies the name of the directory to be created.", null));			 
		setMDirectoryResult(new MResult(false, "Directory", "Specifies the path of the created service directory.", null));

		lastMCreateDirectoryStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMCreateDirectoryStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMCreateDirectoryStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MCREATE_DIRECTORY_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MParent Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MParent Directory Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MParent Directory Parameter</em>' containment reference.
	 * @see #setMParentDirectoryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_MParentDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Parent directory' description='Specifies the path to the directory in which the new directory is to be created.'"
	 * @generated
	 */
	public MParameter getMParentDirectoryParameter() {
		return mParentDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMParentDirectoryParameter(MParameter newMParentDirectoryParameter, NotificationChain msgs) {
		MParameter oldMParentDirectoryParameter = mParentDirectoryParameter;
		mParentDirectoryParameter = newMParentDirectoryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER, oldMParentDirectoryParameter, newMParentDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMParentDirectoryParameter <em>MParent Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMParentDirectoryParameter the new value of the '<em>MParent Directory Parameter</em>' containment reference.
	 * @see #getMParentDirectoryParameter()
	 * @generated
	 */
	public void setMParentDirectoryParameter(MParameter newMParentDirectoryParameter) {
		if (newMParentDirectoryParameter != mParentDirectoryParameter) {
			NotificationChain msgs = null;
			if (mParentDirectoryParameter != null)
				msgs = ((InternalEObject)mParentDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER, null, msgs);
			if (newMParentDirectoryParameter != null) {				
				newMParentDirectoryParameter.setDefaultDescription("Specifies the path to the directory in which the new directory is to be created.");
				newMParentDirectoryParameter.setDefaultName("Parent directory");
				newMParentDirectoryParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMParentDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER));
				newMParentDirectoryParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMParentDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mParentDirectoryParameter != null) {
				if(newMParentDirectoryParameter != null)
					newMParentDirectoryParameter.eAdapters().addAll(mParentDirectoryParameter.eAdapters());			
			
				mParentDirectoryParameter.eAdapters().clear();
			}
			msgs = basicSetMParentDirectoryParameter(newMParentDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER, newMParentDirectoryParameter, newMParentDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Parent Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Directory Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Directory Parameter</em>' attribute.
	 * @see #setParentDirectoryParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_ParentDirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getParentDirectoryParameter() {
		return parentDirectoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameter <em>Parent Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newParentDirectoryParameter the new value of the '<em>Parent Directory Parameter</em>' attribute.
	 * @see #getParentDirectoryParameter()
	 * @generated
	 */
	public void setParentDirectoryParameter(File newParentDirectoryParameter) {
		File oldParentDirectoryParameter = parentDirectoryParameter;
		parentDirectoryParameter = newParentDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER, oldParentDirectoryParameter, parentDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Parent Directory Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.io.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Directory Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Directory Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_ParentDirectoryParameterHistoricValues()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" upper="3"
	 * @generated
	 */
	public EList getParentDirectoryParameterHistoricValues() {
		if (parentDirectoryParameterHistoricValues == null) {
			parentDirectoryParameterHistoricValues = new EDataTypeUniqueEList(File.class, this, LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES);
		}
		return parentDirectoryParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MDirectory Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDirectory Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDirectory Name Parameter</em>' containment reference.
	 * @see #setMDirectoryNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_MDirectoryNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory name' description='Specifies the name of the directory to be created.'"
	 * @generated
	 */
	public MParameter getMDirectoryNameParameter() {
		return mDirectoryNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDirectoryNameParameter(MParameter newMDirectoryNameParameter, NotificationChain msgs) {
		MParameter oldMDirectoryNameParameter = mDirectoryNameParameter;
		mDirectoryNameParameter = newMDirectoryNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER, oldMDirectoryNameParameter, newMDirectoryNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryNameParameter <em>MDirectory Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMDirectoryNameParameter the new value of the '<em>MDirectory Name Parameter</em>' containment reference.
	 * @see #getMDirectoryNameParameter()
	 * @generated
	 */
	public void setMDirectoryNameParameter(MParameter newMDirectoryNameParameter) {
		if (newMDirectoryNameParameter != mDirectoryNameParameter) {
			NotificationChain msgs = null;
			if (mDirectoryNameParameter != null)
				msgs = ((InternalEObject)mDirectoryNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER, null, msgs);
			if (newMDirectoryNameParameter != null) {				
				newMDirectoryNameParameter.setDefaultDescription("Specifies the name of the directory to be created.");
				newMDirectoryNameParameter.setDefaultName("Directory name");
				newMDirectoryNameParameter.setValueType(Type.getTypeForName("Directory"));
				newMDirectoryNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER));
				newMDirectoryNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDirectoryNameParameter != null) {
				if(newMDirectoryNameParameter != null)
					newMDirectoryNameParameter.eAdapters().addAll(mDirectoryNameParameter.eAdapters());			
			
				mDirectoryNameParameter.eAdapters().clear();
			}
			msgs = basicSetMDirectoryNameParameter(newMDirectoryNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER, newMDirectoryNameParameter, newMDirectoryNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Directory Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Name Parameter</em>' attribute.
	 * @see #setDirectoryNameParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_DirectoryNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDirectory" required="true"
	 * @generated
	 */
	public File getDirectoryNameParameter() {
		return directoryNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryNameParameter <em>Directory Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newDirectoryNameParameter the new value of the '<em>Directory Name Parameter</em>' attribute.
	 * @see #getDirectoryNameParameter()
	 * @generated
	 */
	public void setDirectoryNameParameter(File newDirectoryNameParameter) {
		File oldDirectoryNameParameter = directoryNameParameter;
		directoryNameParameter = newDirectoryNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER, oldDirectoryNameParameter, directoryNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MDirectory Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDirectory Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDirectory Result</em>' containment reference.
	 * @see #setMDirectoryResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_MDirectoryResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory' description='Specifies the path of the created service directory.'"
	 * @generated
	 */
	public MResult getMDirectoryResult() {
		return mDirectoryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDirectoryResult(MResult newMDirectoryResult, NotificationChain msgs) {
		MResult oldMDirectoryResult = mDirectoryResult;
		mDirectoryResult = newMDirectoryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT, oldMDirectoryResult, newMDirectoryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryResult <em>MDirectory Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMDirectoryResult the new value of the '<em>MDirectory Result</em>' containment reference.
	 * @see #getMDirectoryResult()
	 * @generated
	 */
	public void setMDirectoryResult(MResult newMDirectoryResult) {
		if (newMDirectoryResult != mDirectoryResult) {
			NotificationChain msgs = null;
			if (mDirectoryResult != null)
				msgs = ((InternalEObject)mDirectoryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT, null, msgs);
			if (newMDirectoryResult != null) {				
				newMDirectoryResult.setDefaultDescription("Specifies the path of the created service directory.");
				newMDirectoryResult.setDefaultName("Directory");
				newMDirectoryResult.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMDirectoryResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT));
				newMDirectoryResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDirectoryResult != null) {
				if(newMDirectoryResult != null)
					newMDirectoryResult.eAdapters().addAll(mDirectoryResult.eAdapters());			
			
				mDirectoryResult.eAdapters().clear();
			}
			msgs = basicSetMDirectoryResult(newMDirectoryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT, newMDirectoryResult, newMDirectoryResult));
	}

	/**
	 * Returns the value of the '<em><b>Directory Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Result</em>' attribute.
	 * @see #setDirectoryResult(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep_DirectoryResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true" transient="true"
	 * @generated
	 */
	public File getDirectoryResult() {
		return directoryResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryResult <em>Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newDirectoryResult the new value of the '<em>Directory Result</em>' attribute.
	 * @see #getDirectoryResult()
	 * @generated
	 */
	public void setDirectoryResult(File newDirectoryResult) {
		File oldDirectoryResult = directoryResult;
		directoryResult = newDirectoryResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT, oldDirectoryResult, directoryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
				return basicSetMParentDirectoryParameter(null, msgs);
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
				return basicSetMDirectoryNameParameter(null, msgs);
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				return basicSetMDirectoryResult(null, msgs);
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
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
				return getMParentDirectoryParameter();
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER:
				return getParentDirectoryParameter();
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES:
				return getParentDirectoryParameterHistoricValues();
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
				return getMDirectoryNameParameter();
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER:
				return getDirectoryNameParameter();
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				return getMDirectoryResult();
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT:
				return getDirectoryResult();
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
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
				setMParentDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER:
				setParentDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES:
				getParentDirectoryParameterHistoricValues().clear();
				getParentDirectoryParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
				setMDirectoryNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER:
				setDirectoryNameParameter((File)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				setMDirectoryResult((MResult)newValue);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT:
				setDirectoryResult((File)newValue);
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
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
				setMParentDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER:
				setParentDirectoryParameter(getDefaultParentDirectoryParameter());
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES:
				getParentDirectoryParameterHistoricValues().clear();
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
				setMDirectoryNameParameter((MParameter)null);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER:
				setDirectoryNameParameter(getDefaultDirectoryNameParameter());
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				setMDirectoryResult((MResult)null);
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT:
				setDirectoryResult(getDefaultDirectoryResult());
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
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
				return mParentDirectoryParameter != null;
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER:
				return getDefaultParentDirectoryParameter() == null ? parentDirectoryParameter != null : !getDefaultParentDirectoryParameter().equals(parentDirectoryParameter);
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES:
				return parentDirectoryParameterHistoricValues != null && !parentDirectoryParameterHistoricValues.isEmpty();
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
				return mDirectoryNameParameter != null;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER:
				return getDefaultDirectoryNameParameter() == null ? directoryNameParameter != null : !getDefaultDirectoryNameParameter().equals(directoryNameParameter);
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				return mDirectoryResult != null;
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT:
				return getDefaultDirectoryResult() == null ? directoryResult != null : !getDefaultDirectoryResult().equals(directoryResult);
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
		result.append(" (parentDirectoryParameter: ");
		result.append(parentDirectoryParameter);
		result.append(", parentDirectoryParameterHistoricValues: ");
		result.append(parentDirectoryParameterHistoricValues);
		result.append(", directoryNameParameter: ");
		result.append(directoryNameParameter);
		result.append(", directoryResult: ");
		result.append(directoryResult);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
        File parentDirectory = getParentDirectoryParameter();
        File directory = getDirectoryNameParameter();
        File path = new File(parentDirectory.getPath()+File.separator+directory.getName());
        path.mkdirs();
        setDirectoryResult(path);                
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	public Object convertMInputValues(MValue mOwnerValue) {
		if(getMDirectoryNameParameter().equals(mOwnerValue)) {
			MDmsApplication mApplication = (MDmsApplication) MDmsApplication.getInstance();
			if(!"Christ Church Bromley".equals(mApplication.getOrganisationProperty())) {
		        String serviceType = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
		        String serviceDate = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
	            
	            serviceDate = serviceDate != null ? (serviceType != null ? serviceDate : "WWX on "+serviceDate) : "";
		        serviceType = serviceType != null ? serviceType+" on " : "";
	            
	            return new File(serviceType+serviceDate);
			}
			else {
		        String serviceType = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
		        Date serviceDate = (Date) mOwnerValue.getMInputValue(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT).getValue();
	            String serviceDateText = serviceDate != null ? DIRECTORY_DATE_FORMAT.format(serviceDate) : null;
	            serviceDateText = serviceDateText != null ? (serviceType != null ? serviceDateText : serviceDateText+" WWX") : "";
		        serviceType = serviceType != null ? " "+serviceType : "";
	            
	            return new File(serviceDateText+serviceType);				
			}
		}
		else
			return super.convertMInputValues(mOwnerValue);

	}

} // MCreateDirectoryStep