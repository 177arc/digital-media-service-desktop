/**
 * <copyright>
 * </copyright>
 *
 * $Id: MDmsApplicationMUpgradeDataStep.java,v 1.1 2007/05/12 10:56:30 marc Exp $
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.zip.ZipInputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDms Application MUpgrade Data Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeMessageParameter <em>MUpgrade Message Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeMessageParameter <em>Upgrade Message Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeDateParameter <em>MUpgrade Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeDateParameter <em>Upgrade Date Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Upgrade application data' description='Tried to find an upgrade file on the given FTP server location, optionally displays an upgrade message and upgrades the application data.' actionName='Upgrade' actionIconFilePath='Image Files\\Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MDmsApplicationMUpgradeDataStep extends MFtpStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MDmsApplicationMUpgradeDataStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MDmsApplicationMUpgradeDataStep.TYPE_NAME, new ReferenceType("Reference to "+MDmsApplicationMUpgradeDataStep.TYPE_NAME, "Specifies a reference to a "+MDmsApplicationMUpgradeDataStep.TYPE_NAME_FOR_UI, MDmsApplicationMUpgradeDataStep.class));
	}
	/**
	 * The cached value of the '{@link #getMUpgradeRelativeFtpPathProperty() <em>MUpgrade Relative Ftp Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeRelativeFtpPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MParameter mUpgradeRelativeFtpPathProperty = null;

	/**
	 * The default value of the '{@link #getUpgradeRelativeFtpPathProperty() <em>Upgrade Relative Ftp Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeRelativeFtpPathProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String UPGRADE_RELATIVE_FTP_PATH_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeRelativeFtpPathProperty() <em>Upgrade Relative Ftp Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeRelativeFtpPathProperty() <em>Upgrade Relative Ftp Path Property</em>}' attribute.
	 * @see #getUpgradeRelativeFtpPathProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultUpgradeRelativeFtpPathProperty() {
		return UPGRADE_RELATIVE_FTP_PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeRelativeFtpPathProperty() <em>Upgrade Relative Ftp Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeRelativeFtpPathProperty()
	 * @generated
	 * @ordered
	 */
	protected String upgradeRelativeFtpPathProperty = UPGRADE_RELATIVE_FTP_PATH_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMUpgradeMessageParameter() <em>MUpgrade Message Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeMessageParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mUpgradeMessageParameter = null;

	/**
	 * The default value of the '{@link #getUpgradeMessageParameter() <em>Upgrade Message Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String UPGRADE_MESSAGE_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getUpgradeMessageParameter() <em>Upgrade Message Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeMessageParameter() <em>Upgrade Message Parameter</em>}' attribute.
	 * @see #getUpgradeMessageParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultUpgradeMessageParameter() {
		return UPGRADE_MESSAGE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeMessageParameter() <em>Upgrade Message Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageParameter()
	 * @generated
	 * @ordered
	 */
	protected String upgradeMessageParameter = UPGRADE_MESSAGE_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMUpgradeDateParameter() <em>MUpgrade Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeDateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mUpgradeDateParameter = null;

	/**
	 * The default value of the '{@link #getUpgradeDateParameter() <em>Upgrade Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPGRADE_DATE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeDateParameter() <em>Upgrade Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeDateParameter() <em>Upgrade Date Parameter</em>}' attribute.
	 * @see #getUpgradeDateParameter()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultUpgradeDateParameter() {
		return UPGRADE_DATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeDateParameter() <em>Upgrade Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDateParameter()
	 * @generated
	 * @ordered
	 */
	protected Date upgradeDateParameter = UPGRADE_DATE_PARAMETER_EDEFAULT;


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
		return "Tried to find an upgrade file on the given FTP server location, optionally displays an upgrade message and upgrades the application data.";
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
		return "Upgrade";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
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
		return "Upgrade application data";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDmsApplicationMUpgradeDataStep() {
		super();
		
		firstMDmsApplicationMUpgradeDataStepConstructorHook();
				
		actionName = "Upgrade";
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
		stoppable = false;
		description = "Tried to find an upgrade file on the given FTP server location, optionally displays an upgrade message and upgrades the application data.";
		name = "Upgrade application data";
		interruptable = false;
		terminatable = false;
					 
		setMUpgradeRelativeFtpPathProperty(new MParameter(false, "Application data upgrade relative FTP path", "Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.", null));			 
		setMUpgradeMessageParameter(new MParameter(false, "Application data upgrade message", "Specifies a message that provides a description of the application data upgrade. If this parameter contains a message, the user has to acknowledge it before he/she can proceed.", null));			 
		setMUpgradeDateParameter(new MParameter(false, "Application data upgrade date", "Specifies the date and time when the application data upgrade was created.", null));

		lastMDmsApplicationMUpgradeDataStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMDmsApplicationMUpgradeDataStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMDmsApplicationMUpgradeDataStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Relative Ftp Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Relative Ftp Path Property</em>' containment reference.
	 * @see #setMUpgradeRelativeFtpPathProperty(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_MUpgradeRelativeFtpPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade relative FTP path' description='Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.'"
	 * @generated
	 */
	public MParameter getMUpgradeRelativeFtpPathProperty() {
		return mUpgradeRelativeFtpPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeRelativeFtpPathProperty(MParameter newMUpgradeRelativeFtpPathProperty, NotificationChain msgs) {
		MParameter oldMUpgradeRelativeFtpPathProperty = mUpgradeRelativeFtpPathProperty;
		mUpgradeRelativeFtpPathProperty = newMUpgradeRelativeFtpPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeRelativeFtpPathProperty the new value of the '<em>MUpgrade Relative Ftp Path Property</em>' containment reference.
	 * @see #getMUpgradeRelativeFtpPathProperty()
	 * @generated
	 */
	public void setMUpgradeRelativeFtpPathProperty(MParameter newMUpgradeRelativeFtpPathProperty) {
		if (newMUpgradeRelativeFtpPathProperty != mUpgradeRelativeFtpPathProperty) {
			NotificationChain msgs = null;
			if (mUpgradeRelativeFtpPathProperty != null)
				msgs = ((InternalEObject)mUpgradeRelativeFtpPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
			if (newMUpgradeRelativeFtpPathProperty != null) {				
				newMUpgradeRelativeFtpPathProperty.setDefaultDescription("Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.");
				newMUpgradeRelativeFtpPathProperty.setDefaultName("Application data upgrade relative FTP path");
				newMUpgradeRelativeFtpPathProperty.setValueType(Type.getTypeForName("Text"));
				newMUpgradeRelativeFtpPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY));
				newMUpgradeRelativeFtpPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeRelativeFtpPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeRelativeFtpPathProperty != null) {
				if(newMUpgradeRelativeFtpPathProperty != null)
					newMUpgradeRelativeFtpPathProperty.eAdapters().addAll(mUpgradeRelativeFtpPathProperty.eAdapters());			
			
				mUpgradeRelativeFtpPathProperty.eAdapters().clear();
			}
			msgs = basicSetMUpgradeRelativeFtpPathProperty(newMUpgradeRelativeFtpPathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, newMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Relative Ftp Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Relative Ftp Path Property</em>' attribute.
	 * @see #setUpgradeRelativeFtpPathProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_UpgradeRelativeFtpPathProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getUpgradeRelativeFtpPathProperty() {
		return upgradeRelativeFtpPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeRelativeFtpPathProperty the new value of the '<em>Upgrade Relative Ftp Path Property</em>' attribute.
	 * @see #getUpgradeRelativeFtpPathProperty()
	 * @generated
	 */
	public void setUpgradeRelativeFtpPathProperty(String newUpgradeRelativeFtpPathProperty) {
		String oldUpgradeRelativeFtpPathProperty = upgradeRelativeFtpPathProperty;
		upgradeRelativeFtpPathProperty = newUpgradeRelativeFtpPathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldUpgradeRelativeFtpPathProperty, upgradeRelativeFtpPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Message Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Message Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Message Parameter</em>' containment reference.
	 * @see #setMUpgradeMessageParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_MUpgradeMessageParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade message' description='Specifies a message that provides a description of the application data upgrade. If this parameter contains a message, the user has to acknowledge it before he/she can proceed.'"
	 * @generated
	 */
	public MParameter getMUpgradeMessageParameter() {
		return mUpgradeMessageParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeMessageParameter(MParameter newMUpgradeMessageParameter, NotificationChain msgs) {
		MParameter oldMUpgradeMessageParameter = mUpgradeMessageParameter;
		mUpgradeMessageParameter = newMUpgradeMessageParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER, oldMUpgradeMessageParameter, newMUpgradeMessageParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeMessageParameter <em>MUpgrade Message Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeMessageParameter the new value of the '<em>MUpgrade Message Parameter</em>' containment reference.
	 * @see #getMUpgradeMessageParameter()
	 * @generated
	 */
	public void setMUpgradeMessageParameter(MParameter newMUpgradeMessageParameter) {
		if (newMUpgradeMessageParameter != mUpgradeMessageParameter) {
			NotificationChain msgs = null;
			if (mUpgradeMessageParameter != null)
				msgs = ((InternalEObject)mUpgradeMessageParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER, null, msgs);
			if (newMUpgradeMessageParameter != null) {				
				newMUpgradeMessageParameter.setDefaultDescription("Specifies a message that provides a description of the application data upgrade. If this parameter contains a message, the user has to acknowledge it before he/she can proceed.");
				newMUpgradeMessageParameter.setDefaultName("Application data upgrade message");
				newMUpgradeMessageParameter.setValueType(Type.getTypeForName("Text"));
				newMUpgradeMessageParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER));
				newMUpgradeMessageParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeMessageParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeMessageParameter != null) {
				if(newMUpgradeMessageParameter != null)
					newMUpgradeMessageParameter.eAdapters().addAll(mUpgradeMessageParameter.eAdapters());			
			
				mUpgradeMessageParameter.eAdapters().clear();
			}
			msgs = basicSetMUpgradeMessageParameter(newMUpgradeMessageParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER, newMUpgradeMessageParameter, newMUpgradeMessageParameter));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Message Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Message Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Message Parameter</em>' attribute.
	 * @see #setUpgradeMessageParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_UpgradeMessageParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getUpgradeMessageParameter() {
		return upgradeMessageParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeMessageParameter <em>Upgrade Message Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeMessageParameter the new value of the '<em>Upgrade Message Parameter</em>' attribute.
	 * @see #getUpgradeMessageParameter()
	 * @generated
	 */
	public void setUpgradeMessageParameter(String newUpgradeMessageParameter) {
		String oldUpgradeMessageParameter = upgradeMessageParameter;
		upgradeMessageParameter = newUpgradeMessageParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER, oldUpgradeMessageParameter, upgradeMessageParameter));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Date Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Date Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Date Parameter</em>' containment reference.
	 * @see #setMUpgradeDateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_MUpgradeDateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade date' description='Specifies the date and time when the application data upgrade was created.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMUpgradeDateParameter() {
		return mUpgradeDateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeDateParameter(MParameter newMUpgradeDateParameter, NotificationChain msgs) {
		MParameter oldMUpgradeDateParameter = mUpgradeDateParameter;
		mUpgradeDateParameter = newMUpgradeDateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER, oldMUpgradeDateParameter, newMUpgradeDateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeDateParameter <em>MUpgrade Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeDateParameter the new value of the '<em>MUpgrade Date Parameter</em>' containment reference.
	 * @see #getMUpgradeDateParameter()
	 * @generated
	 */
	public void setMUpgradeDateParameter(MParameter newMUpgradeDateParameter) {
		if (newMUpgradeDateParameter != mUpgradeDateParameter) {
			NotificationChain msgs = null;
			if (mUpgradeDateParameter != null)
				msgs = ((InternalEObject)mUpgradeDateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER, null, msgs);
			if (newMUpgradeDateParameter != null) {				
				newMUpgradeDateParameter.setDefaultName("Application data upgrade date");
				newMUpgradeDateParameter.setDefaultDescription("Specifies the date and time when the application data upgrade was created.");
				newMUpgradeDateParameter.setValueType(Type.getTypeForName("Date and time"));
				newMUpgradeDateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER));
				newMUpgradeDateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeDateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeDateParameter != null) {
				if(newMUpgradeDateParameter != null)
					newMUpgradeDateParameter.eAdapters().addAll(mUpgradeDateParameter.eAdapters());			
			
				mUpgradeDateParameter.eAdapters().clear();
			}
			msgs = basicSetMUpgradeDateParameter(newMUpgradeDateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER, newMUpgradeDateParameter, newMUpgradeDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Date Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Date Parameter</em>' attribute.
	 * @see #setUpgradeDateParameter(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep_UpgradeDateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime" transient="true"
	 * @generated
	 */
	public Date getUpgradeDateParameter() {
		return upgradeDateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeDateParameter <em>Upgrade Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeDateParameter the new value of the '<em>Upgrade Date Parameter</em>' attribute.
	 * @see #getUpgradeDateParameter()
	 * @generated
	 */
	public void setUpgradeDateParameter(Date newUpgradeDateParameter) {
		Date oldUpgradeDateParameter = upgradeDateParameter;
		upgradeDateParameter = newUpgradeDateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER, oldUpgradeDateParameter, upgradeDateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return basicSetMUpgradeRelativeFtpPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:
				return basicSetMUpgradeMessageParameter(null, msgs);
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:
				return basicSetMUpgradeDateParameter(null, msgs);
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
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getMUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:
				return getMUpgradeMessageParameter();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER:
				return getUpgradeMessageParameter();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:
				return getMUpgradeDateParameter();
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER:
				return getUpgradeDateParameter();
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
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setMUpgradeRelativeFtpPathProperty((MParameter)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setUpgradeRelativeFtpPathProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:    
				setMUpgradeMessageParameter((MParameter)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER:    
				setUpgradeMessageParameter((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:    
				setMUpgradeDateParameter((MParameter)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER:    
				setUpgradeDateParameter((Date)newValue);
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
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setMUpgradeRelativeFtpPathProperty((MParameter)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setUpgradeRelativeFtpPathProperty(getDefaultUpgradeRelativeFtpPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:
				setMUpgradeMessageParameter((MParameter)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER:
				setUpgradeMessageParameter(getDefaultUpgradeMessageParameter());
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:
				setMUpgradeDateParameter((MParameter)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER:
				setUpgradeDateParameter(getDefaultUpgradeDateParameter());
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
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return mUpgradeRelativeFtpPathProperty != null;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getDefaultUpgradeRelativeFtpPathProperty() == null ? upgradeRelativeFtpPathProperty != null : !getDefaultUpgradeRelativeFtpPathProperty().equals(upgradeRelativeFtpPathProperty);
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:
				return mUpgradeMessageParameter != null;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER:
				return getDefaultUpgradeMessageParameter() == null ? upgradeMessageParameter != null : !getDefaultUpgradeMessageParameter().equals(upgradeMessageParameter);
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:
				return mUpgradeDateParameter != null;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER:
				return getDefaultUpgradeDateParameter() == null ? upgradeDateParameter != null : !getDefaultUpgradeDateParameter().equals(upgradeDateParameter);
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
		result.append(" (upgradeRelativeFtpPathProperty: ");
		result.append(upgradeRelativeFtpPathProperty);
		result.append(", upgradeMessageParameter: ");
		result.append(upgradeMessageParameter);
		result.append(", upgradeDateParameter: ");
		result.append(upgradeDateParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#executeFtpOperationsHook(org.apache.commons.net.ftp.FTPClient)
	 */
	@Override
	protected void executeFtpOperationsHook(FTPClient ftpClient) throws Throwable {
		URL ftpServerUrl = getFtpServerUrlParameter();
		URL dataFtpUrl = new URL(ftpServerUrl.toExternalForm()+getUpgradeRelativeFtpPathProperty());
		
		// Retrieves the input stream to the application data upgrade file.
        InputStream in = ftpClient.retrieveFileStream(dataFtpUrl.getPath());
        try {
	        // Decompresses the application data upgrade file if necessary
	        if(getUpgradeRelativeFtpPathProperty().endsWith(".zip")) {
	        	in = new ZipInputStream(in);
	        	((ZipInputStream) in).getNextEntry();
	        }
	        
	        MApplication.upgradeInstance(URI.createURI(dataFtpUrl.toExternalForm()), in);
	        ((MDmsApplication) MDmsApplication.getInstance()).setLastUpgradeProperty(new Date());
        }
        finally {
        	if(in != null)
        		try {
        			in.close();
        		}
        		catch(IOException exception) {};
        }
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#validate()
	 */
	@Override
	public DesktopExceptionList validate() {
		DesktopExceptionList validationExceptions = super.validate();
		
		String message = "";
		int severity = DesktopException.INFORMATION_SEVERITY;
		MDmsApplication mApplication = (MDmsApplication) MDmsApplication.getInstance();
		if(getUpgradeDateParameter() != null && mApplication.getLastSaveProperty() != null && mApplication.getLastSaveProperty().after(getUpgradeDateParameter())) {
			message = "There is an application data upgrade file on the FTP server.\nBut the local file ("+mApplication.getMLastSaveProperty().getValueForUI()+") is more recent than the FTP upgrade file ("+getMUpgradeDateParameter().getValueForUI()+").";
			severity = DesktopException.WARNING_SEVERITY;
		}
		
		if(getUpgradeMessageParameter() != null) {
			if(message.length() > 0)
				message += "\n\n";
			else
				message += "There is an application data upgrade file on the FTP server. ";
			
			message += "Here is a description of the upgrade:\n";
			message += getUpgradeMessageParameter();
		}
			
		if(message.length() > 0)
			message += "\n\n";
		
		message += "The upgrade, if successful, will overwrite all application data.";
		validationExceptions.add(new DesktopException(message, null, severity, null));
		
		return validationExceptions;
	}
	
	

} // MDmsApplicationMUpgradeDataStep