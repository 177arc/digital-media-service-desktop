
/**
 * <copyright>
 * </copyright>
 *
 * $Id: MDmsApplicationMGetDataUpgradeInfoStep.java,v 1.1 2007/05/12 10:56:34 marc Exp $
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipInputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDms Application MGet Data Upgrade Info Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeAvailableResult <em>MUpgrade Available Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeAvailableResult <em>Upgrade Available Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeMessageResult <em>MUpgrade Message Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeMessageResult <em>Upgrade Message Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeDateResult <em>MUpgrade Date Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeDateResult <em>Upgrade Date Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Get application data upgrade info' description='Tries to find the application data upgrade file at the given FTP server location and retrieves the upgrade message if present.' actionName='Get' actionIconFilePath='Image Files\\Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MDmsApplicationMGetDataUpgradeInfoStep extends MFtpStep {
	
	/**
	 * Defines an exception that is raised when the data handler has found all
	 * the required information and wants to stop the parser from continuing to parse.
	 *
	 * @author Marc
	 */
	private static class StopParseException extends RuntimeException {};
	
	/**
	 * Defines a SAX handler for parsing the appliation data. It tries to find the
	 * last save date/time and the upgrade message in the application data. For
	 * efficiency reasons it stops parsing after it has found these items or there
	 * is not possibility of still finding them.
	 *
	 * @author Marc
	 */
	private static class MDmsApplicationDataHandler extends DefaultHandler {
		/** Specifies the qualified XML name of {@link org.onceforall.dms.desktop.logic.MDmsApplication MDmsApplication}. */
		private String mDmsApplicationQName = MDmsApplication.class.getPackage().getName()+":"+MDmsApplication.class.getSimpleName();
		
		/** Specifies the global instance of {@link org.onceforall.dms.desktop.logic.MDmsApplication MDmsApplication}. */
		private static final MDmsApplication M_DMS_APPLICATION = (MDmsApplication) MDmsApplication.getInstance();

		/** Specifies the last application data save date/time. */
		protected String lastSave;

		/** Specifies the upgrade message for the application data. */
		protected String upgradeMessage;
		
		/**
		 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
		 */
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			if(qName.equals(mDmsApplicationQName)) {	
				lastSave = attributes.getValue(M_DMS_APPLICATION.getMLastSaveProperty().getValueEFeature().getName());
				upgradeMessage = attributes.getValue(M_DMS_APPLICATION.getMUpgradeMessageProperty().getValueEFeature().getName());
			}
			else
				// Stops parsing for efficiency reasons.
				throw new StopParseException();
		}	
	}

	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MDmsApplicationMGetDataUpgradeInfoStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MDmsApplicationMGetDataUpgradeInfoStep.TYPE_NAME, new ReferenceType("Reference to "+MDmsApplicationMGetDataUpgradeInfoStep.TYPE_NAME, "Specifies a reference to a "+MDmsApplicationMGetDataUpgradeInfoStep.TYPE_NAME_FOR_UI, MDmsApplicationMGetDataUpgradeInfoStep.class));
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
	 * The cached value of the '{@link #getMUpgradeAvailableResult() <em>MUpgrade Available Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeAvailableResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mUpgradeAvailableResult = null;

	/**
	 * The default value of the '{@link #getUpgradeAvailableResult() <em>Upgrade Available Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeAvailableResult()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UPGRADE_AVAILABLE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeAvailableResult() <em>Upgrade Available Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeAvailableResult() <em>Upgrade Available Result</em>}' attribute.
	 * @see #getUpgradeAvailableResult()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultUpgradeAvailableResult() {
		return UPGRADE_AVAILABLE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeAvailableResult() <em>Upgrade Available Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeAvailableResult()
	 * @generated
	 * @ordered
	 */
	protected Boolean upgradeAvailableResult = UPGRADE_AVAILABLE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMUpgradeMessageResult() <em>MUpgrade Message Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeMessageResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mUpgradeMessageResult = null;

	/**
	 * The default value of the '{@link #getUpgradeMessageResult() <em>Upgrade Message Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageResult()
	 * @generated
	 * @ordered
	 */
	protected static final String UPGRADE_MESSAGE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeMessageResult() <em>Upgrade Message Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeMessageResult() <em>Upgrade Message Result</em>}' attribute.
	 * @see #getUpgradeMessageResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultUpgradeMessageResult() {
		return UPGRADE_MESSAGE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeMessageResult() <em>Upgrade Message Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageResult()
	 * @generated
	 * @ordered
	 */
	protected String upgradeMessageResult = UPGRADE_MESSAGE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMUpgradeDateResult() <em>MUpgrade Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeDateResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mUpgradeDateResult = null;

	/**
	 * The default value of the '{@link #getUpgradeDateResult() <em>Upgrade Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDateResult()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPGRADE_DATE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeDateResult() <em>Upgrade Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeDateResult() <em>Upgrade Date Result</em>}' attribute.
	 * @see #getUpgradeDateResult()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultUpgradeDateResult() {
		return UPGRADE_DATE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeDateResult() <em>Upgrade Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDateResult()
	 * @generated
	 * @ordered
	 */
	protected Date upgradeDateResult = UPGRADE_DATE_RESULT_EDEFAULT;


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
		return "Tries to find the application data upgrade file at the given FTP server location and retrieves the upgrade message if present.";
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
		return "Get";
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
		return "Get application data upgrade info";
	}

	/** Specifies the SAX parser for parsing the application data file. */
	protected XMLReader applicationDataParser;
	
	/** Specifies the SAX handler for parsing the application data file. */
	protected MDmsApplicationDataHandler mDmsApplicationDataHandler;
	
	/** Specifies XML/XMI date formats. */
	protected static final DateFormat[] DATE_FORMATS = {
	    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ"),
	    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS"),
	    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"),
	    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm"),
	    new SimpleDateFormat("yyyy-MM-dd")};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDmsApplicationMGetDataUpgradeInfoStep() {
		super();
		
		firstMDmsApplicationMGetDataUpgradeInfoStepConstructorHook();
				
		actionName = "Get";
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
		stoppable = false;
		description = "Tries to find the application data upgrade file at the given FTP server location and retrieves the upgrade message if present.";
		name = "Get application data upgrade info";
		interruptable = false;
		terminatable = false;
					 
		setMUpgradeRelativeFtpPathProperty(new MParameter(false, "Application data upgrade relative FTP path", "Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.", null));			 
		setMUpgradeAvailableResult(new MResult(false, "Application data upgrade available", "Specifies whether an application data upgrade file could be found on the FTP server at the specified location.", null));			 
		setMUpgradeMessageResult(new MResult(false, "Application data upgrade message", "Specifies a message that provides a description of the application data upgrade.", null));			 
		setMUpgradeDateResult(new MResult(false, "Application data upgrade date", "Specifies the date and time when the application data upgrade was created.", null));

		lastMDmsApplicationMGetDataUpgradeInfoStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMDmsApplicationMGetDataUpgradeInfoStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMDmsApplicationMGetDataUpgradeInfoStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeRelativeFtpPathProperty()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}' containment reference.
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
				msgs = ((InternalEObject)mUpgradeRelativeFtpPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
			if (newMUpgradeRelativeFtpPathProperty != null) {				
				newMUpgradeRelativeFtpPathProperty.setDefaultDescription("Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.");
				newMUpgradeRelativeFtpPathProperty.setDefaultName("Application data upgrade relative FTP path");
				newMUpgradeRelativeFtpPathProperty.setValueType(Type.getTypeForName("Text"));
				newMUpgradeRelativeFtpPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY));
				newMUpgradeRelativeFtpPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeRelativeFtpPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, newMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeRelativeFtpPathProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getUpgradeRelativeFtpPathProperty() {
		return upgradeRelativeFtpPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldUpgradeRelativeFtpPathProperty, upgradeRelativeFtpPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Available Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Available Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Available Result</em>' containment reference.
	 * @see #setMUpgradeAvailableResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeAvailableResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade available' description='Specifies whether an application data upgrade file could be found on the FTP server at the specified location.'"
	 * @generated
	 */
	public MResult getMUpgradeAvailableResult() {
		return mUpgradeAvailableResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeAvailableResult(MResult newMUpgradeAvailableResult, NotificationChain msgs) {
		MResult oldMUpgradeAvailableResult = mUpgradeAvailableResult;
		mUpgradeAvailableResult = newMUpgradeAvailableResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT, oldMUpgradeAvailableResult, newMUpgradeAvailableResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeAvailableResult <em>MUpgrade Available Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeAvailableResult the new value of the '<em>MUpgrade Available Result</em>' containment reference.
	 * @see #getMUpgradeAvailableResult()
	 * @generated
	 */
	public void setMUpgradeAvailableResult(MResult newMUpgradeAvailableResult) {
		if (newMUpgradeAvailableResult != mUpgradeAvailableResult) {
			NotificationChain msgs = null;
			if (mUpgradeAvailableResult != null)
				msgs = ((InternalEObject)mUpgradeAvailableResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT, null, msgs);
			if (newMUpgradeAvailableResult != null) {				
				newMUpgradeAvailableResult.setDefaultDescription("Specifies whether an application data upgrade file could be found on the FTP server at the specified location.");
				newMUpgradeAvailableResult.setDefaultName("Application data upgrade available");
				newMUpgradeAvailableResult.setValueType(Type.getTypeForName("Yes/No"));
				newMUpgradeAvailableResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT));
				newMUpgradeAvailableResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeAvailableResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeAvailableResult != null) {
				if(newMUpgradeAvailableResult != null)
					newMUpgradeAvailableResult.eAdapters().addAll(mUpgradeAvailableResult.eAdapters());			
			
				mUpgradeAvailableResult.eAdapters().clear();
			}
			msgs = basicSetMUpgradeAvailableResult(newMUpgradeAvailableResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT, newMUpgradeAvailableResult, newMUpgradeAvailableResult));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Available Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Available Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Available Result</em>' attribute.
	 * @see #setUpgradeAvailableResult(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeAvailableResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MBoolean" transient="true"
	 * @generated
	 */
	public Boolean getUpgradeAvailableResult() {
		return upgradeAvailableResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeAvailableResult <em>Upgrade Available Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeAvailableResult the new value of the '<em>Upgrade Available Result</em>' attribute.
	 * @see #getUpgradeAvailableResult()
	 * @generated
	 */
	public void setUpgradeAvailableResult(Boolean newUpgradeAvailableResult) {
		Boolean oldUpgradeAvailableResult = upgradeAvailableResult;
		upgradeAvailableResult = newUpgradeAvailableResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT, oldUpgradeAvailableResult, upgradeAvailableResult));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Message Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Message Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Message Result</em>' containment reference.
	 * @see #setMUpgradeMessageResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeMessageResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade message' description='Specifies a message that provides a description of the application data upgrade.'"
	 * @generated
	 */
	public MResult getMUpgradeMessageResult() {
		return mUpgradeMessageResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeMessageResult(MResult newMUpgradeMessageResult, NotificationChain msgs) {
		MResult oldMUpgradeMessageResult = mUpgradeMessageResult;
		mUpgradeMessageResult = newMUpgradeMessageResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT, oldMUpgradeMessageResult, newMUpgradeMessageResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeMessageResult <em>MUpgrade Message Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeMessageResult the new value of the '<em>MUpgrade Message Result</em>' containment reference.
	 * @see #getMUpgradeMessageResult()
	 * @generated
	 */
	public void setMUpgradeMessageResult(MResult newMUpgradeMessageResult) {
		if (newMUpgradeMessageResult != mUpgradeMessageResult) {
			NotificationChain msgs = null;
			if (mUpgradeMessageResult != null)
				msgs = ((InternalEObject)mUpgradeMessageResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT, null, msgs);
			if (newMUpgradeMessageResult != null) {				
				newMUpgradeMessageResult.setDefaultDescription("Specifies a message that provides a description of the application data upgrade.");
				newMUpgradeMessageResult.setDefaultName("Application data upgrade message");
				newMUpgradeMessageResult.setValueType(Type.getTypeForName("Text"));
				newMUpgradeMessageResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT));
				newMUpgradeMessageResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeMessageResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeMessageResult != null) {
				if(newMUpgradeMessageResult != null)
					newMUpgradeMessageResult.eAdapters().addAll(mUpgradeMessageResult.eAdapters());			
			
				mUpgradeMessageResult.eAdapters().clear();
			}
			msgs = basicSetMUpgradeMessageResult(newMUpgradeMessageResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT, newMUpgradeMessageResult, newMUpgradeMessageResult));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Message Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Message Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Message Result</em>' attribute.
	 * @see #setUpgradeMessageResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeMessageResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getUpgradeMessageResult() {
		return upgradeMessageResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeMessageResult <em>Upgrade Message Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeMessageResult the new value of the '<em>Upgrade Message Result</em>' attribute.
	 * @see #getUpgradeMessageResult()
	 * @generated
	 */
	public void setUpgradeMessageResult(String newUpgradeMessageResult) {
		String oldUpgradeMessageResult = upgradeMessageResult;
		upgradeMessageResult = newUpgradeMessageResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT, oldUpgradeMessageResult, upgradeMessageResult));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Date Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Date Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Date Result</em>' containment reference.
	 * @see #setMUpgradeDateResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeDateResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade date' description='Specifies the date and time when the application data upgrade was created.'"
	 * @generated
	 */
	public MResult getMUpgradeDateResult() {
		return mUpgradeDateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeDateResult(MResult newMUpgradeDateResult, NotificationChain msgs) {
		MResult oldMUpgradeDateResult = mUpgradeDateResult;
		mUpgradeDateResult = newMUpgradeDateResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT, oldMUpgradeDateResult, newMUpgradeDateResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeDateResult <em>MUpgrade Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeDateResult the new value of the '<em>MUpgrade Date Result</em>' containment reference.
	 * @see #getMUpgradeDateResult()
	 * @generated
	 */
	public void setMUpgradeDateResult(MResult newMUpgradeDateResult) {
		if (newMUpgradeDateResult != mUpgradeDateResult) {
			NotificationChain msgs = null;
			if (mUpgradeDateResult != null)
				msgs = ((InternalEObject)mUpgradeDateResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT, null, msgs);
			if (newMUpgradeDateResult != null) {				
				newMUpgradeDateResult.setDefaultDescription("Specifies the date and time when the application data upgrade was created.");
				newMUpgradeDateResult.setDefaultName("Application data upgrade date");
				newMUpgradeDateResult.setValueType(Type.getTypeForName("Date and time"));
				newMUpgradeDateResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT));
				newMUpgradeDateResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeDateResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeDateResult != null) {
				if(newMUpgradeDateResult != null)
					newMUpgradeDateResult.eAdapters().addAll(mUpgradeDateResult.eAdapters());			
			
				mUpgradeDateResult.eAdapters().clear();
			}
			msgs = basicSetMUpgradeDateResult(newMUpgradeDateResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT, newMUpgradeDateResult, newMUpgradeDateResult));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Date Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Date Result</em>' attribute.
	 * @see #setUpgradeDateResult(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeDateResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime" transient="true"
	 * @generated
	 */
	public Date getUpgradeDateResult() {
		return upgradeDateResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeDateResult <em>Upgrade Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeDateResult the new value of the '<em>Upgrade Date Result</em>' attribute.
	 * @see #getUpgradeDateResult()
	 * @generated
	 */
	public void setUpgradeDateResult(Date newUpgradeDateResult) {
		Date oldUpgradeDateResult = upgradeDateResult;
		upgradeDateResult = newUpgradeDateResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT, oldUpgradeDateResult, upgradeDateResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return basicSetMUpgradeRelativeFtpPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:
				return basicSetMUpgradeAvailableResult(null, msgs);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:
				return basicSetMUpgradeMessageResult(null, msgs);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:
				return basicSetMUpgradeDateResult(null, msgs);
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
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getMUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:
				return getMUpgradeAvailableResult();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT:
				return getUpgradeAvailableResult();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:
				return getMUpgradeMessageResult();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT:
				return getUpgradeMessageResult();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:
				return getMUpgradeDateResult();
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT:
				return getUpgradeDateResult();
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
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setMUpgradeRelativeFtpPathProperty((MParameter)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setUpgradeRelativeFtpPathProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:    
				setMUpgradeAvailableResult((MResult)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT:    
				setUpgradeAvailableResult((Boolean)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:    
				setMUpgradeMessageResult((MResult)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT:    
				setUpgradeMessageResult((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:    
				setMUpgradeDateResult((MResult)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT:    
				setUpgradeDateResult((Date)newValue);
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
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setMUpgradeRelativeFtpPathProperty((MParameter)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setUpgradeRelativeFtpPathProperty(getDefaultUpgradeRelativeFtpPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:
				setMUpgradeAvailableResult((MResult)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT:
				setUpgradeAvailableResult(getDefaultUpgradeAvailableResult());
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:
				setMUpgradeMessageResult((MResult)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT:
				setUpgradeMessageResult(getDefaultUpgradeMessageResult());
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:
				setMUpgradeDateResult((MResult)null);
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT:
				setUpgradeDateResult(getDefaultUpgradeDateResult());
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
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return mUpgradeRelativeFtpPathProperty != null;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getDefaultUpgradeRelativeFtpPathProperty() == null ? upgradeRelativeFtpPathProperty != null : !getDefaultUpgradeRelativeFtpPathProperty().equals(upgradeRelativeFtpPathProperty);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:
				return mUpgradeAvailableResult != null;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT:
				return getDefaultUpgradeAvailableResult() == null ? upgradeAvailableResult != null : !getDefaultUpgradeAvailableResult().equals(upgradeAvailableResult);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:
				return mUpgradeMessageResult != null;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT:
				return getDefaultUpgradeMessageResult() == null ? upgradeMessageResult != null : !getDefaultUpgradeMessageResult().equals(upgradeMessageResult);
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:
				return mUpgradeDateResult != null;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT:
				return getDefaultUpgradeDateResult() == null ? upgradeDateResult != null : !getDefaultUpgradeDateResult().equals(upgradeDateResult);
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
		result.append(", upgradeAvailableResult: ");
		result.append(upgradeAvailableResult);
		result.append(", upgradeMessageResult: ");
		result.append(upgradeMessageResult);
		result.append(", upgradeDateResult: ");
		result.append(upgradeDateResult);
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
		String upgradeFtpPath = dataFtpUrl.getPath();
		
		// Retrieves the input stream to the application data upgrade file.
        InputStream in = ftpClient.retrieveFileStream(upgradeFtpPath);
        setUpgradeAvailableResult(in != null);
        if(in == null)
        	return;
        
        try {
	        // Decompresses the application data upgrade file if necessary
	        if(upgradeFtpPath.endsWith(".zip")) {
	        	in = new ZipInputStream(in);
	        	((ZipInputStream) in).getNextEntry();
	        }
	        
	        // Initialises the SAX parser.
	        if(applicationDataParser == null)
	        	applicationDataParser = XMLReaderFactory.createXMLReader();
	        
	        if(mDmsApplicationDataHandler == null)
	        	mDmsApplicationDataHandler = new MDmsApplicationDataHandler();
	        
	        applicationDataParser.setContentHandler(mDmsApplicationDataHandler);
	        InputSource source = new InputSource(in);
	        
	        // Parses the application data upgrade file.
	        applicationDataParser.parse(source);
        }
        catch(StopParseException exception) {}
        finally {
        	if(in != null)
        		try {
        			in.close();
        		}
        		catch(IOException exception) {};
        }
        
    	// Populates the results.
    	if(mDmsApplicationDataHandler.lastSave != null) {
    		// Tries to convert the date string from the handler into a Java date.
    		for(int index = 0; index < DATE_FORMATS.length; ++index)
    			try {
    				setUpgradeDateResult(DATE_FORMATS[index].parse(mDmsApplicationDataHandler.lastSave));
    				break;
    			}
    	        catch (ParseException parseException) {}
    			
    		if(getUpgradeDateResult() == null)
    	      throw new IllegalArgumentException("The value '" + mDmsApplicationDataHandler.lastSave + "' is not of the form yyyy-MM-dd'T'HH:mm:ss'.'SSSZ or a valid subset.");
    	}
    	
    	setUpgradeMessageResult(mDmsApplicationDataHandler.upgradeMessage);  	

	}

} // MDmsApplicationMGetDataUpgradeInfoStep