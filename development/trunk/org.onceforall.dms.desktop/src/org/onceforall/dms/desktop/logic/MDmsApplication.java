/*
 * Revision History:
 * $Log: MDmsApplication.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.net.URL;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDms Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMServiceFilePathProperty <em>MService File Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getServiceFilePathProperty <em>Service File Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWwxFilesPathProperty <em>MWwx Files Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWwxFilesPathProperty <em>Wwx Files Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3EncoderPathProperty <em>MMp3 Encoder Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMp3EncoderPathProperty <em>Mp3 Encoder Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpServerUrlProperty <em>MFtp Server Url Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlProperty <em>Ftp Server Url Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlPropertyHistoricValues <em>Ftp Server Url Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserNameProperty <em>MFtp User Name Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNameProperty <em>Ftp User Name Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNamePropertyHistoricValues <em>Ftp User Name Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserPasswordProperty <em>MFtp User Password Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserPasswordProperty <em>Ftp User Password Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWebServerUrlProperty <em>MWeb Server Url Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlProperty <em>Web Server Url Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlPropertyHistoricValues <em>Web Server Url Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpServerProperty <em>MSmtp Server Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerProperty <em>Smtp Server Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerPropertyHistoricValues <em>Smtp Server Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpUserNameProperty <em>MSmtp User Name Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNameProperty <em>Smtp User Name Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNamePropertyHistoricValues <em>Smtp User Name Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpPasswordProperty <em>MSmtp Password Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpPasswordProperty <em>Smtp Password Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMBurningSoftwareDirectoryPathProperty <em>MBurning Software Directory Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getBurningSoftwareDirectoryPathProperty <em>Burning Software Directory Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMDriveProperty <em>MDrive Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getDriveProperty <em>Drive Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getDrivePropertyHistoricValues <em>Drive Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeMessageProperty <em>MUpgrade Message Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeMessageProperty <em>Upgrade Message Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMLastUpgradeProperty <em>MLast Upgrade Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getLastUpgradeProperty <em>Last Upgrade Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMGetDataUpgradeInfoStep <em>MGet Data Upgrade Info Step</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeDataStep <em>MUpgrade Data Step</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMScripts <em>MScripts</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3Folders <em>MMp3 Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Digital Media Service Desktop'"
 * @generated
 */
public class MDmsApplication extends MApplication {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MDmsApplication.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MDmsApplication.TYPE_NAME, new ReferenceType("Reference to "+MDmsApplication.TYPE_NAME, "Specifies a reference to a "+MDmsApplication.TYPE_NAME_FOR_UI, MDmsApplication.class));
	}
	/**
	 * The cached value of the '{@link #getMServiceFilePathProperty() <em>MService File Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMServiceFilePathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mServiceFilePathProperty = null;

	/**
	 * The default value of the '{@link #getServiceFilePathProperty() <em>Service File Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFilePathProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File SERVICE_FILE_PATH_PROPERTY_EDEFAULT = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMExistingFile(), "Service Files");

	/**
	 * Get the default value of the '{@link #getServiceFilePathProperty() <em>Service File Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getServiceFilePathProperty() <em>Service File Path Property</em>}' attribute.
	 * @see #getServiceFilePathProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultServiceFilePathProperty() {
		return SERVICE_FILE_PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getServiceFilePathProperty() <em>Service File Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFilePathProperty()
	 * @generated
	 * @ordered
	 */
	protected File serviceFilePathProperty = SERVICE_FILE_PATH_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMWwxFilesPathProperty() <em>MWwx Files Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWwxFilesPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mWwxFilesPathProperty = null;

	/**
	 * The default value of the '{@link #getWwxFilesPathProperty() <em>Wwx Files Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxFilesPathProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File WWX_FILES_PATH_PROPERTY_EDEFAULT = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMExistingFile(), "WWX Files");
	
	/**
	 * Get the default value of the '{@link #getWwxFilesPathProperty() <em>Wwx Files Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getWwxFilesPathProperty() <em>Wwx Files Path Property</em>}' attribute.
	 * @see #getWwxFilesPathProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultWwxFilesPathProperty() {
		return WWX_FILES_PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getWwxFilesPathProperty() <em>Wwx Files Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxFilesPathProperty()
	 * @generated
	 * @ordered
	 */
	protected File wwxFilesPathProperty = WWX_FILES_PATH_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMMp3EncoderPathProperty() <em>MMp3 Encoder Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EncoderPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mMp3EncoderPathProperty = null;

	/**
	 * The default value of the '{@link #getMp3EncoderPathProperty() <em>Mp3 Encoder Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_ENCODER_PATH_PROPERTY_EDEFAULT = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMExistingFile(), "Program Files\\LAME 3.96.1");

	/**
	 * Get the default value of the '{@link #getMp3EncoderPathProperty() <em>Mp3 Encoder Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3EncoderPathProperty() <em>Mp3 Encoder Path Property</em>}' attribute.
	 * @see #getMp3EncoderPathProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3EncoderPathProperty() {
		return MP3_ENCODER_PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3EncoderPathProperty() <em>Mp3 Encoder Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathProperty()
	 * @generated
	 * @ordered
	 */
	protected File mp3EncoderPathProperty = MP3_ENCODER_PATH_PROPERTY_EDEFAULT;

	
	/**
	 * The cached value of the '{@link #getMFtpServerUrlProperty() <em>MFtp Server Url Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mFtpServerUrlProperty = null;

	/**
	 * The default value of the '{@link #getFtpServerUrlProperty() <em>Ftp Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected static final URL FTP_SERVER_URL_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFtpServerUrlProperty() <em>Ftp Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpServerUrlProperty() <em>Ftp Server Url Property</em>}' attribute.
	 * @see #getFtpServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultFtpServerUrlProperty() {
		return FTP_SERVER_URL_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpServerUrlProperty() <em>Ftp Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected URL ftpServerUrlProperty = FTP_SERVER_URL_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getFtpServerUrlPropertyHistoricValues() <em>Ftp Server Url Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpServerUrlPropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList ftpServerUrlPropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMFtpUserNameProperty() <em>MFtp User Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mFtpUserNameProperty = null;

	/**
	 * The default value of the '{@link #getFtpUserNameProperty() <em>Ftp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String FTP_USER_NAME_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtpUserNameProperty() <em>Ftp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected String ftpUserNameProperty = FTP_USER_NAME_PROPERTY_EDEFAULT;

	/**
	 * Get the default value of the '{@link #getFtpUserNameProperty() <em>Ftp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpUserNameProperty() <em>Ftp User Name Property</em>}' attribute.
	 * @see #getFtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFtpUserNameProperty() {
		return FTP_USER_NAME_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpUserNamePropertyHistoricValues() <em>Ftp User Name Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserNamePropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList ftpUserNamePropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMFtpUserPasswordProperty() <em>MFtp User Password Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpUserPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mFtpUserPasswordProperty = null;

	/**
	 * The default value of the '{@link #getFtpUserPasswordProperty() <em>Ftp User Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String FTP_USER_PASSWORD_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFtpUserPasswordProperty() <em>Ftp User Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpUserPasswordProperty() <em>Ftp User Password Property</em>}' attribute.
	 * @see #getFtpUserPasswordProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFtpUserPasswordProperty() {
		return FTP_USER_PASSWORD_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpUserPasswordProperty() <em>Ftp User Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected String ftpUserPasswordProperty = FTP_USER_PASSWORD_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMWebServerUrlProperty() <em>MWeb Server Url Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWebServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mWebServerUrlProperty = null;

	/**
	 * The default value of the '{@link #getWebServerUrlProperty() <em>Web Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected static final URL WEB_SERVER_URL_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getWebServerUrlProperty() <em>Web Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getWebServerUrlProperty() <em>Web Server Url Property</em>}' attribute.
	 * @see #getWebServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultWebServerUrlProperty() {
		return WEB_SERVER_URL_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getWebServerUrlProperty() <em>Web Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebServerUrlProperty()
	 * @generated
	 * @ordered
	 */
	protected URL webServerUrlProperty = WEB_SERVER_URL_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getWebServerUrlPropertyHistoricValues() <em>Web Server Url Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebServerUrlPropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList webServerUrlPropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMSmtpServerProperty() <em>MSmtp Server Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpServerProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mSmtpServerProperty = null;

	/**
	 * The default value of the '{@link #getSmtpServerProperty() <em>Smtp Server Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServerProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_SERVER_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getSmtpServerProperty() <em>Smtp Server Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpServerProperty() <em>Smtp Server Property</em>}' attribute.
	 * @see #getSmtpServerProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpServerProperty() {
		return SMTP_SERVER_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpServerProperty() <em>Smtp Server Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServerProperty()
	 * @generated
	 * @ordered
	 */
	protected String smtpServerProperty = SMTP_SERVER_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getSmtpServerPropertyHistoricValues() <em>Smtp Server Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServerPropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList smtpServerPropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMSmtpUserNameProperty() <em>MSmtp User Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mSmtpUserNameProperty = null;

	/**
	 * The default value of the '{@link #getSmtpUserNameProperty() <em>Smtp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_USER_NAME_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getSmtpUserNameProperty() <em>Smtp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpUserNameProperty() <em>Smtp User Name Property</em>}' attribute.
	 * @see #getSmtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpUserNameProperty() {
		return SMTP_USER_NAME_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpUserNameProperty() <em>Smtp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpUserNameProperty()
	 * @generated
	 * @ordered
	 */
	protected String smtpUserNameProperty = SMTP_USER_NAME_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getSmtpUserNamePropertyHistoricValues() <em>Smtp User Name Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpUserNamePropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList smtpUserNamePropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMSmtpPasswordProperty() <em>MSmtp Password Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mSmtpPasswordProperty = null;

	/**
	 * The default value of the '{@link #getSmtpPasswordProperty() <em>Smtp Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_PASSWORD_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getSmtpPasswordProperty() <em>Smtp Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpPasswordProperty() <em>Smtp Password Property</em>}' attribute.
	 * @see #getSmtpPasswordProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpPasswordProperty() {
		return SMTP_PASSWORD_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpPasswordProperty() <em>Smtp Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpPasswordProperty()
	 * @generated
	 * @ordered
	 */
	protected String smtpPasswordProperty = SMTP_PASSWORD_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMBurningSoftwareDirectoryPathProperty() <em>MBurning Software Directory Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBurningSoftwareDirectoryPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mBurningSoftwareDirectoryPathProperty = null;

	/**
	 * The default value of the '{@link #getBurningSoftwareDirectoryPathProperty() <em>Burning Software Directory Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurningSoftwareDirectoryPathProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getBurningSoftwareDirectoryPathProperty() <em>Burning Software Directory Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getBurningSoftwareDirectoryPathProperty() <em>Burning Software Directory Path Property</em>}' attribute.
	 * @see #getBurningSoftwareDirectoryPathProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultBurningSoftwareDirectoryPathProperty() {
		return BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getBurningSoftwareDirectoryPathProperty() <em>Burning Software Directory Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurningSoftwareDirectoryPathProperty()
	 * @generated
	 * @ordered
	 */
	protected File burningSoftwareDirectoryPathProperty = BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMDriveProperty() <em>MDrive Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDriveProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mDriveProperty = null;

	/**
	 * The default value of the '{@link #getDriveProperty() <em>Drive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getDriveProperty() <em>Drive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDriveProperty() <em>Drive Property</em>}' attribute.
	 * @see #getDriveProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDriveProperty() {
		return DRIVE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDriveProperty() <em>Drive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveProperty()
	 * @generated
	 * @ordered
	 */
	protected String driveProperty = DRIVE_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getDrivePropertyHistoricValues() <em>Drive Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList drivePropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMUpgradeMessageProperty() <em>MUpgrade Message Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeMessageProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mUpgradeMessageProperty = null;

	/**
	 * The default value of the '{@link #getUpgradeMessageProperty() <em>Upgrade Message Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String UPGRADE_MESSAGE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getUpgradeMessageProperty() <em>Upgrade Message Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUpgradeMessageProperty() <em>Upgrade Message Property</em>}' attribute.
	 * @see #getUpgradeMessageProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultUpgradeMessageProperty() {
		return UPGRADE_MESSAGE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUpgradeMessageProperty() <em>Upgrade Message Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMessageProperty()
	 * @generated
	 * @ordered
	 */
	protected String upgradeMessageProperty = UPGRADE_MESSAGE_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMUpgradeRelativeFtpPathProperty() <em>MUpgrade Relative Ftp Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeRelativeFtpPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mUpgradeRelativeFtpPathProperty = null;

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
	 * The cached value of the '{@link #getMLastUpgradeProperty() <em>MLast Upgrade Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLastUpgradeProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLastUpgradeProperty = null;

	/**
	 * The default value of the '{@link #getLastUpgradeProperty() <em>Last Upgrade Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpgradeProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPGRADE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLastUpgradeProperty() <em>Last Upgrade Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLastUpgradeProperty() <em>Last Upgrade Property</em>}' attribute.
	 * @see #getLastUpgradeProperty()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultLastUpgradeProperty() {
		return LAST_UPGRADE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLastUpgradeProperty() <em>Last Upgrade Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpgradeProperty()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpgradeProperty = LAST_UPGRADE_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMGetDataUpgradeInfoStep() <em>MGet Data Upgrade Info Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGetDataUpgradeInfoStep()
	 * @generated
	 * @ordered
	 */
	protected MDmsApplicationMGetDataUpgradeInfoStep mGetDataUpgradeInfoStep = null;

	/**
	 * The cached value of the '{@link #getMUpgradeDataStep() <em>MUpgrade Data Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpgradeDataStep()
	 * @generated
	 * @ordered
	 */
	protected MDmsApplicationMUpgradeDataStep mUpgradeDataStep = null;

	/**
	 * The cached value of the '{@link #getMScripts() <em>MScripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMScripts()
	 * @generated
	 * @ordered
	 */
	protected EList mScripts = null;

	/**
	 * The cached value of the '{@link #getMMp3Folders() <em>MMp3 Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3Folders()
	 * @generated
	 * @ordered
	 */
	protected EList mMp3Folders = null;

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
		return "Digital Media Service Desktop";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDmsApplication() {
		super();
		
		firstMDmsApplicationConstructorHook();
				
		name = "Digital Media Service Desktop";
					 
		setMServiceFilePathProperty(new MProperty(false, "Service files path", "Specifies the relative or absolute file path to the directory where the service recording files are stored.", null));			 
		setMWwxFilesPathProperty(new MProperty(false, "WWX files path", "Specifies the relative or absolute file path to the directory where the WordWiseXtra recording files are stored.", null));			 
		setMMp3EncoderPathProperty(new MProperty(false, "MP3 encoder path", "Specifies the path to the directory that contains the \'lame.exe\'.", null));			 
		setMFtpServerUrlProperty(new MProperty(false, "FTP server URL", "Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'", null));			 
		setMFtpUserNameProperty(new MProperty(false, "FTP user name", "Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.", null));			 
		setMFtpUserPasswordProperty(new MProperty(false, "FTP user password", "Specifies the user password for accessing the FTP server.", null));			 
		setMWebServerUrlProperty(new MProperty(false, "Web server URL", "Specifies the public web server URL, e.g.\'http://www.ccbromley.net\'.", null));			 
		setMSmtpServerProperty(new MProperty(false, "SMTP server", "Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.", null));			 
		setMSmtpUserNameProperty(new MProperty(false, "SMTP user name", "Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.", null));			 
		setMSmtpPasswordProperty(new MProperty(false, "SMTP password", "Specifies password used to authenticate on the (SMTP) server that is responsible for sending the email.", null));			 
		setMBurningSoftwareDirectoryPathProperty(new MProperty(false, "CD-ROM burning software directory path", "Specifies the path to the directory that contains the \'nerocmd.exe\'.", null));			 
		setMDriveProperty(new MProperty(false, "Drive", "Specifies either the full name of the CD-ROM drive or the drive letter.", null));			 
		setMUpgradeMessageProperty(new MProperty(true, "Application data upgrade message", "Specifies important information about the last application data upgrade.", null));			 
		setMUpgradeRelativeFtpPathProperty(new MProperty(false, "Application data upgrade relative FTP path", "Specifies the relative path on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.", null));			 
		setMLastUpgradeProperty(new MProperty(true, "Last application data upgrade", "Specifies the date and time when the application data was last upgraded.", null));			 
		setMGetDataUpgradeInfoStep(new MDmsApplicationMGetDataUpgradeInfoStep());			 
		setMUpgradeDataStep(new MDmsApplicationMUpgradeDataStep());

		lastMDmsApplicationConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMDmsApplicationConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMDmsApplicationConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MDMS_APPLICATION;
	}

	/**
	 * Returns the value of the '<em><b>MService File Path Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MService File Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MService File Path Property</em>' containment reference.
	 * @see #setMServiceFilePathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MServiceFilePathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Service files path' description='Specifies the relative or absolute file path to the directory where the service recording files are stored.'"
	 * @generated
	 */
	public MProperty getMServiceFilePathProperty() {
		return mServiceFilePathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMServiceFilePathProperty(MProperty newMServiceFilePathProperty, NotificationChain msgs) {
		MProperty oldMServiceFilePathProperty = mServiceFilePathProperty;
		mServiceFilePathProperty = newMServiceFilePathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY, oldMServiceFilePathProperty, newMServiceFilePathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMServiceFilePathProperty <em>MService File Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMServiceFilePathProperty the new value of the '<em>MService File Path Property</em>' containment reference.
	 * @see #getMServiceFilePathProperty()
	 * @generated
	 */
	public void setMServiceFilePathProperty(MProperty newMServiceFilePathProperty) {
		if (newMServiceFilePathProperty != mServiceFilePathProperty) {
			NotificationChain msgs = null;
			if (mServiceFilePathProperty != null)
				msgs = ((InternalEObject)mServiceFilePathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY, null, msgs);
			if (newMServiceFilePathProperty != null) {				
				newMServiceFilePathProperty.setDefaultDescription("Specifies the relative or absolute file path to the directory where the service recording files are stored.");
				newMServiceFilePathProperty.setDefaultName("Service files path");
				newMServiceFilePathProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMServiceFilePathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY));
				newMServiceFilePathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMServiceFilePathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mServiceFilePathProperty != null) {
				if(newMServiceFilePathProperty != null)
					newMServiceFilePathProperty.eAdapters().addAll(mServiceFilePathProperty.eAdapters());			
			
				mServiceFilePathProperty.eAdapters().clear();
			}
			msgs = basicSetMServiceFilePathProperty(newMServiceFilePathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY, newMServiceFilePathProperty, newMServiceFilePathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Service File Path Property</b></em>' attribute.
	 * The default value is <code>"Service Files"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service File Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service File Path Property</em>' attribute.
	 * @see #setServiceFilePathProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_ServiceFilePathProperty()
	 * @model default="Service Files" dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getServiceFilePathProperty() {
		return serviceFilePathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getServiceFilePathProperty <em>Service File Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newServiceFilePathProperty the new value of the '<em>Service File Path Property</em>' attribute.
	 * @see #getServiceFilePathProperty()
	 * @generated
	 */
	public void setServiceFilePathProperty(File newServiceFilePathProperty) {
		File oldServiceFilePathProperty = serviceFilePathProperty;
		serviceFilePathProperty = newServiceFilePathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY, oldServiceFilePathProperty, serviceFilePathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MWwx Files Path Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MWwx Files Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWwx Files Path Property</em>' containment reference.
	 * @see #setMWwxFilesPathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MWwxFilesPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='WWX files path' description='Specifies the relative or absolute file path to the directory where the WordWiseXtra recording files are stored.'"
	 * @generated
	 */
	public MProperty getMWwxFilesPathProperty() {
		return mWwxFilesPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWwxFilesPathProperty(MProperty newMWwxFilesPathProperty, NotificationChain msgs) {
		MProperty oldMWwxFilesPathProperty = mWwxFilesPathProperty;
		mWwxFilesPathProperty = newMWwxFilesPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY, oldMWwxFilesPathProperty, newMWwxFilesPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWwxFilesPathProperty <em>MWwx Files Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMWwxFilesPathProperty the new value of the '<em>MWwx Files Path Property</em>' containment reference.
	 * @see #getMWwxFilesPathProperty()
	 * @generated
	 */
	public void setMWwxFilesPathProperty(MProperty newMWwxFilesPathProperty) {
		if (newMWwxFilesPathProperty != mWwxFilesPathProperty) {
			NotificationChain msgs = null;
			if (mWwxFilesPathProperty != null)
				msgs = ((InternalEObject)mWwxFilesPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY, null, msgs);
			if (newMWwxFilesPathProperty != null) {				
				newMWwxFilesPathProperty.setDefaultDescription("Specifies the relative or absolute file path to the directory where the WordWiseXtra recording files are stored.");
				newMWwxFilesPathProperty.setDefaultName("WWX files path");
				newMWwxFilesPathProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMWwxFilesPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY));
				newMWwxFilesPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMWwxFilesPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mWwxFilesPathProperty != null) {
				if(newMWwxFilesPathProperty != null)
					newMWwxFilesPathProperty.eAdapters().addAll(mWwxFilesPathProperty.eAdapters());			
			
				mWwxFilesPathProperty.eAdapters().clear();
			}
			msgs = basicSetMWwxFilesPathProperty(newMWwxFilesPathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY, newMWwxFilesPathProperty, newMWwxFilesPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Wwx Files Path Property</b></em>' attribute.
	 * The default value is <code>"WWX Files"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wwx Files Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wwx Files Path Property</em>' attribute.
	 * @see #setWwxFilesPathProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_WwxFilesPathProperty()
	 * @model default="WWX Files" dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getWwxFilesPathProperty() {
		return wwxFilesPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWwxFilesPathProperty <em>Wwx Files Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newWwxFilesPathProperty the new value of the '<em>Wwx Files Path Property</em>' attribute.
	 * @see #getWwxFilesPathProperty()
	 * @generated
	 */
	public void setWwxFilesPathProperty(File newWwxFilesPathProperty) {
		File oldWwxFilesPathProperty = wwxFilesPathProperty;
		wwxFilesPathProperty = newWwxFilesPathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY, oldWwxFilesPathProperty, wwxFilesPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Encoder Path Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Encoder Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Encoder Path Property</em>' containment reference.
	 * @see #setMMp3EncoderPathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MMp3EncoderPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 encoder path' description='Specifies the path to the directory that contains the \'lame.exe\'.'"
	 * @generated
	 */
	public MProperty getMMp3EncoderPathProperty() {
		return mMp3EncoderPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EncoderPathProperty(MProperty newMMp3EncoderPathProperty, NotificationChain msgs) {
		MProperty oldMMp3EncoderPathProperty = mMp3EncoderPathProperty;
		mMp3EncoderPathProperty = newMMp3EncoderPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY, oldMMp3EncoderPathProperty, newMMp3EncoderPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3EncoderPathProperty <em>MMp3 Encoder Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EncoderPathProperty the new value of the '<em>MMp3 Encoder Path Property</em>' containment reference.
	 * @see #getMMp3EncoderPathProperty()
	 * @generated
	 */
	public void setMMp3EncoderPathProperty(MProperty newMMp3EncoderPathProperty) {
		if (newMMp3EncoderPathProperty != mMp3EncoderPathProperty) {
			NotificationChain msgs = null;
			if (mMp3EncoderPathProperty != null)
				msgs = ((InternalEObject)mMp3EncoderPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY, null, msgs);
			if (newMMp3EncoderPathProperty != null) {				
				newMMp3EncoderPathProperty.setDefaultDescription("Specifies the path to the directory that contains the \'lame.exe\'.");
				newMMp3EncoderPathProperty.setDefaultName("MP3 encoder path");
				newMMp3EncoderPathProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMMp3EncoderPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY));
				newMMp3EncoderPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EncoderPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EncoderPathProperty != null) {
				if(newMMp3EncoderPathProperty != null)
					newMMp3EncoderPathProperty.eAdapters().addAll(mMp3EncoderPathProperty.eAdapters());			
			
				mMp3EncoderPathProperty.eAdapters().clear();
			}
			msgs = basicSetMMp3EncoderPathProperty(newMMp3EncoderPathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY, newMMp3EncoderPathProperty, newMMp3EncoderPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Encoder Path Property</b></em>' attribute.
	 * The default value is <code>"Program Files\\LAME 3.96.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Encoder Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Encoder Path Property</em>' attribute.
	 * @see #setMp3EncoderPathProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_Mp3EncoderPathProperty()
	 * @model default="Program Files\\LAME 3.96.1" dataType="org.onceforall.dms.desktop.logic.MExistingFile"
	 * @generated
	 */
	public File getMp3EncoderPathProperty() {
		return mp3EncoderPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMp3EncoderPathProperty <em>Mp3 Encoder Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EncoderPathProperty the new value of the '<em>Mp3 Encoder Path Property</em>' attribute.
	 * @see #getMp3EncoderPathProperty()
	 * @generated
	 */
	public void setMp3EncoderPathProperty(File newMp3EncoderPathProperty) {
		File oldMp3EncoderPathProperty = mp3EncoderPathProperty;
		mp3EncoderPathProperty = newMp3EncoderPathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY, oldMp3EncoderPathProperty, mp3EncoderPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MFtp Server Url Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp Server Url Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp Server Url Property</em>' containment reference.
	 * @see #setMFtpServerUrlProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MFtpServerUrlProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP server URL' description='Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\''"
	 * @generated
	 */
	public MProperty getMFtpServerUrlProperty() {
		return mFtpServerUrlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpServerUrlProperty(MProperty newMFtpServerUrlProperty, NotificationChain msgs) {
		MProperty oldMFtpServerUrlProperty = mFtpServerUrlProperty;
		mFtpServerUrlProperty = newMFtpServerUrlProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY, oldMFtpServerUrlProperty, newMFtpServerUrlProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpServerUrlProperty <em>MFtp Server Url Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpServerUrlProperty the new value of the '<em>MFtp Server Url Property</em>' containment reference.
	 * @see #getMFtpServerUrlProperty()
	 * @generated
	 */
	public void setMFtpServerUrlProperty(MProperty newMFtpServerUrlProperty) {
		if (newMFtpServerUrlProperty != mFtpServerUrlProperty) {
			NotificationChain msgs = null;
			if (mFtpServerUrlProperty != null)
				msgs = ((InternalEObject)mFtpServerUrlProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY, null, msgs);
			if (newMFtpServerUrlProperty != null) {				
				newMFtpServerUrlProperty.setDefaultDescription("Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'");
				newMFtpServerUrlProperty.setDefaultName("FTP server URL");
				newMFtpServerUrlProperty.setValueType(Type.getTypeForName("URL"));
				newMFtpServerUrlProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY));
				newMFtpServerUrlProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMFtpServerUrlProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpServerUrlProperty != null) {
				if(newMFtpServerUrlProperty != null)
					newMFtpServerUrlProperty.eAdapters().addAll(mFtpServerUrlProperty.eAdapters());			
			
				mFtpServerUrlProperty.eAdapters().clear();
			}
			msgs = basicSetMFtpServerUrlProperty(newMFtpServerUrlProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY, newMFtpServerUrlProperty, newMFtpServerUrlProperty));
	}

	/**
	 * Returns the value of the '<em><b>Ftp Server Url Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp Server Url Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp Server Url Property</em>' attribute.
	 * @see #setFtpServerUrlProperty(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_FtpServerUrlProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl"
	 * @generated
	 */
	public URL getFtpServerUrlProperty() {
		return ftpServerUrlProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlProperty <em>Ftp Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpServerUrlProperty the new value of the '<em>Ftp Server Url Property</em>' attribute.
	 * @see #getFtpServerUrlProperty()
	 * @generated
	 */
	public void setFtpServerUrlProperty(URL newFtpServerUrlProperty) {
		URL oldFtpServerUrlProperty = ftpServerUrlProperty;
		ftpServerUrlProperty = newFtpServerUrlProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY, oldFtpServerUrlProperty, ftpServerUrlProperty));
	}

	/**
	 * Returns the value of the '<em><b>Ftp Server Url Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.net.URL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp Server Url Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp Server Url Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_FtpServerUrlPropertyHistoricValues()
	 * @model type="java.net.URL" dataType="org.onceforall.dms.desktop.logic.MUrl" upper="3"
	 * @generated
	 */
	public EList getFtpServerUrlPropertyHistoricValues() {
		if (ftpServerUrlPropertyHistoricValues == null) {
			ftpServerUrlPropertyHistoricValues = new EDataTypeUniqueEList(URL.class, this, LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES);
		}
		return ftpServerUrlPropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MFtp User Name Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp User Name Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp User Name Property</em>' containment reference.
	 * @see #setMFtpUserNameProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MFtpUserNameProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP user name' description='Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.'"
	 * @generated
	 */
	public MProperty getMFtpUserNameProperty() {
		return mFtpUserNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpUserNameProperty(MProperty newMFtpUserNameProperty, NotificationChain msgs) {
		MProperty oldMFtpUserNameProperty = mFtpUserNameProperty;
		mFtpUserNameProperty = newMFtpUserNameProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY, oldMFtpUserNameProperty, newMFtpUserNameProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserNameProperty <em>MFtp User Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpUserNameProperty the new value of the '<em>MFtp User Name Property</em>' containment reference.
	 * @see #getMFtpUserNameProperty()
	 * @generated
	 */
	public void setMFtpUserNameProperty(MProperty newMFtpUserNameProperty) {
		if (newMFtpUserNameProperty != mFtpUserNameProperty) {
			NotificationChain msgs = null;
			if (mFtpUserNameProperty != null)
				msgs = ((InternalEObject)mFtpUserNameProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY, null, msgs);
			if (newMFtpUserNameProperty != null) {				
				newMFtpUserNameProperty.setDefaultDescription("Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.");
				newMFtpUserNameProperty.setDefaultName("FTP user name");
				newMFtpUserNameProperty.setValueType(Type.getTypeForName("Text"));
				newMFtpUserNameProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY));
				newMFtpUserNameProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMFtpUserNameProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpUserNameProperty != null) {
				if(newMFtpUserNameProperty != null)
					newMFtpUserNameProperty.eAdapters().addAll(mFtpUserNameProperty.eAdapters());			
			
				mFtpUserNameProperty.eAdapters().clear();
			}
			msgs = basicSetMFtpUserNameProperty(newMFtpUserNameProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY, newMFtpUserNameProperty, newMFtpUserNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>Ftp User Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp User Name Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp User Name Property</em>' attribute.
	 * @see #setFtpUserNameProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_FtpUserNameProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getFtpUserNameProperty() {
		return ftpUserNameProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNameProperty <em>Ftp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpUserNameProperty the new value of the '<em>Ftp User Name Property</em>' attribute.
	 * @see #getFtpUserNameProperty()
	 * @generated
	 */
	public void setFtpUserNameProperty(String newFtpUserNameProperty) {
		String oldFtpUserNameProperty = ftpUserNameProperty;
		ftpUserNameProperty = newFtpUserNameProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY, oldFtpUserNameProperty, ftpUserNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>Ftp User Name Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp User Name Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp User Name Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_FtpUserNamePropertyHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getFtpUserNamePropertyHistoricValues() {
		if (ftpUserNamePropertyHistoricValues == null) {
			ftpUserNamePropertyHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES);
		}
		return ftpUserNamePropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MFtp User Password Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp User Password Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp User Password Property</em>' containment reference.
	 * @see #setMFtpUserPasswordProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MFtpUserPasswordProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP user password' description='Specifies the user password for accessing the FTP server.'"
	 * @generated
	 */
	public MProperty getMFtpUserPasswordProperty() {
		return mFtpUserPasswordProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpUserPasswordProperty(MProperty newMFtpUserPasswordProperty, NotificationChain msgs) {
		MProperty oldMFtpUserPasswordProperty = mFtpUserPasswordProperty;
		mFtpUserPasswordProperty = newMFtpUserPasswordProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY, oldMFtpUserPasswordProperty, newMFtpUserPasswordProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserPasswordProperty <em>MFtp User Password Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpUserPasswordProperty the new value of the '<em>MFtp User Password Property</em>' containment reference.
	 * @see #getMFtpUserPasswordProperty()
	 * @generated
	 */
	public void setMFtpUserPasswordProperty(MProperty newMFtpUserPasswordProperty) {
		if (newMFtpUserPasswordProperty != mFtpUserPasswordProperty) {
			NotificationChain msgs = null;
			if (mFtpUserPasswordProperty != null)
				msgs = ((InternalEObject)mFtpUserPasswordProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY, null, msgs);
			if (newMFtpUserPasswordProperty != null) {				
				newMFtpUserPasswordProperty.setDefaultDescription("Specifies the user password for accessing the FTP server.");
				newMFtpUserPasswordProperty.setDefaultName("FTP user password");
				newMFtpUserPasswordProperty.setValueType(Type.getTypeForName("Password"));
				newMFtpUserPasswordProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY));
				newMFtpUserPasswordProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFtpUserPasswordProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpUserPasswordProperty != null) {
				if(newMFtpUserPasswordProperty != null)
					newMFtpUserPasswordProperty.eAdapters().addAll(mFtpUserPasswordProperty.eAdapters());			
			
				mFtpUserPasswordProperty.eAdapters().clear();
			}
			msgs = basicSetMFtpUserPasswordProperty(newMFtpUserPasswordProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY, newMFtpUserPasswordProperty, newMFtpUserPasswordProperty));
	}

	/**
	 * Returns the value of the '<em><b>Ftp User Password Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp User Password Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp User Password Property</em>' attribute.
	 * @see #setFtpUserPasswordProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_FtpUserPasswordProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MPassword"
	 * @generated
	 */
	public String getFtpUserPasswordProperty() {
		return ftpUserPasswordProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserPasswordProperty <em>Ftp User Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpUserPasswordProperty the new value of the '<em>Ftp User Password Property</em>' attribute.
	 * @see #getFtpUserPasswordProperty()
	 * @generated
	 */
	public void setFtpUserPasswordProperty(String newFtpUserPasswordProperty) {
		String oldFtpUserPasswordProperty = ftpUserPasswordProperty;
		ftpUserPasswordProperty = newFtpUserPasswordProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY, oldFtpUserPasswordProperty, ftpUserPasswordProperty));
	}

	/**
	 * Returns the value of the '<em><b>MWeb Server Url Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MWeb Server Url Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWeb Server Url Property</em>' containment reference.
	 * @see #setMWebServerUrlProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MWebServerUrlProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Web server URL' description='Specifies the public web server URL, e.g.\'http://www.ccbromley.net\'.'"
	 * @generated
	 */
	public MProperty getMWebServerUrlProperty() {
		return mWebServerUrlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWebServerUrlProperty(MProperty newMWebServerUrlProperty, NotificationChain msgs) {
		MProperty oldMWebServerUrlProperty = mWebServerUrlProperty;
		mWebServerUrlProperty = newMWebServerUrlProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY, oldMWebServerUrlProperty, newMWebServerUrlProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWebServerUrlProperty <em>MWeb Server Url Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMWebServerUrlProperty the new value of the '<em>MWeb Server Url Property</em>' containment reference.
	 * @see #getMWebServerUrlProperty()
	 * @generated
	 */
	public void setMWebServerUrlProperty(MProperty newMWebServerUrlProperty) {
		if (newMWebServerUrlProperty != mWebServerUrlProperty) {
			NotificationChain msgs = null;
			if (mWebServerUrlProperty != null)
				msgs = ((InternalEObject)mWebServerUrlProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY, null, msgs);
			if (newMWebServerUrlProperty != null) {				
				newMWebServerUrlProperty.setDefaultDescription("Specifies the public web server URL, e.g.\'http://www.ccbromley.net\'.");
				newMWebServerUrlProperty.setDefaultName("Web server URL");
				newMWebServerUrlProperty.setValueType(Type.getTypeForName("URL"));
				newMWebServerUrlProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY));
				newMWebServerUrlProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMWebServerUrlProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mWebServerUrlProperty != null) {
				if(newMWebServerUrlProperty != null)
					newMWebServerUrlProperty.eAdapters().addAll(mWebServerUrlProperty.eAdapters());			
			
				mWebServerUrlProperty.eAdapters().clear();
			}
			msgs = basicSetMWebServerUrlProperty(newMWebServerUrlProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY, newMWebServerUrlProperty, newMWebServerUrlProperty));
	}

	/**
	 * Returns the value of the '<em><b>Web Server Url Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Server Url Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Server Url Property</em>' attribute.
	 * @see #setWebServerUrlProperty(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_WebServerUrlProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl"
	 * @generated
	 */
	public URL getWebServerUrlProperty() {
		return webServerUrlProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlProperty <em>Web Server Url Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newWebServerUrlProperty the new value of the '<em>Web Server Url Property</em>' attribute.
	 * @see #getWebServerUrlProperty()
	 * @generated
	 */
	public void setWebServerUrlProperty(URL newWebServerUrlProperty) {
		URL oldWebServerUrlProperty = webServerUrlProperty;
		webServerUrlProperty = newWebServerUrlProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY, oldWebServerUrlProperty, webServerUrlProperty));
	}

	/**
	 * Returns the value of the '<em><b>Web Server Url Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.net.URL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Server Url Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Server Url Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_WebServerUrlPropertyHistoricValues()
	 * @model type="java.net.URL" dataType="org.onceforall.dms.desktop.logic.MUrl" upper="3"
	 * @generated
	 */
	public EList getWebServerUrlPropertyHistoricValues() {
		if (webServerUrlPropertyHistoricValues == null) {
			webServerUrlPropertyHistoricValues = new EDataTypeUniqueEList(URL.class, this, LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES);
		}
		return webServerUrlPropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MSmtp Server Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp Server Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp Server Property</em>' containment reference.
	 * @see #setMSmtpServerProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MSmtpServerProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP server' description='Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.'"
	 * @generated
	 */
	public MProperty getMSmtpServerProperty() {
		return mSmtpServerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpServerProperty(MProperty newMSmtpServerProperty, NotificationChain msgs) {
		MProperty oldMSmtpServerProperty = mSmtpServerProperty;
		mSmtpServerProperty = newMSmtpServerProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY, oldMSmtpServerProperty, newMSmtpServerProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpServerProperty <em>MSmtp Server Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpServerProperty the new value of the '<em>MSmtp Server Property</em>' containment reference.
	 * @see #getMSmtpServerProperty()
	 * @generated
	 */
	public void setMSmtpServerProperty(MProperty newMSmtpServerProperty) {
		if (newMSmtpServerProperty != mSmtpServerProperty) {
			NotificationChain msgs = null;
			if (mSmtpServerProperty != null)
				msgs = ((InternalEObject)mSmtpServerProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY, null, msgs);
			if (newMSmtpServerProperty != null) {				
				newMSmtpServerProperty.setDefaultDescription("Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.");
				newMSmtpServerProperty.setDefaultName("SMTP server");
				newMSmtpServerProperty.setValueType(Type.getTypeForName("Text"));
				newMSmtpServerProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY));
				newMSmtpServerProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSmtpServerProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpServerProperty != null) {
				if(newMSmtpServerProperty != null)
					newMSmtpServerProperty.eAdapters().addAll(mSmtpServerProperty.eAdapters());			
			
				mSmtpServerProperty.eAdapters().clear();
			}
			msgs = basicSetMSmtpServerProperty(newMSmtpServerProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY, newMSmtpServerProperty, newMSmtpServerProperty));
	}

	/**
	 * Returns the value of the '<em><b>Smtp Server Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp Server Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp Server Property</em>' attribute.
	 * @see #setSmtpServerProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_SmtpServerProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getSmtpServerProperty() {
		return smtpServerProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerProperty <em>Smtp Server Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpServerProperty the new value of the '<em>Smtp Server Property</em>' attribute.
	 * @see #getSmtpServerProperty()
	 * @generated
	 */
	public void setSmtpServerProperty(String newSmtpServerProperty) {
		String oldSmtpServerProperty = smtpServerProperty;
		smtpServerProperty = newSmtpServerProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY, oldSmtpServerProperty, smtpServerProperty));
	}

	/**
	 * Returns the value of the '<em><b>Smtp Server Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp Server Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp Server Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_SmtpServerPropertyHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getSmtpServerPropertyHistoricValues() {
		if (smtpServerPropertyHistoricValues == null) {
			smtpServerPropertyHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES);
		}
		return smtpServerPropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MSmtp User Name Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp User Name Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp User Name Property</em>' containment reference.
	 * @see #setMSmtpUserNameProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MSmtpUserNameProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP user name' description='Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.' readOnly='false'"
	 * @generated
	 */
	public MProperty getMSmtpUserNameProperty() {
		return mSmtpUserNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpUserNameProperty(MProperty newMSmtpUserNameProperty, NotificationChain msgs) {
		MProperty oldMSmtpUserNameProperty = mSmtpUserNameProperty;
		mSmtpUserNameProperty = newMSmtpUserNameProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY, oldMSmtpUserNameProperty, newMSmtpUserNameProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpUserNameProperty <em>MSmtp User Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpUserNameProperty the new value of the '<em>MSmtp User Name Property</em>' containment reference.
	 * @see #getMSmtpUserNameProperty()
	 * @generated
	 */
	public void setMSmtpUserNameProperty(MProperty newMSmtpUserNameProperty) {
		if (newMSmtpUserNameProperty != mSmtpUserNameProperty) {
			NotificationChain msgs = null;
			if (mSmtpUserNameProperty != null)
				msgs = ((InternalEObject)mSmtpUserNameProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY, null, msgs);
			if (newMSmtpUserNameProperty != null) {				
				newMSmtpUserNameProperty.setDefaultName("SMTP user name");
				newMSmtpUserNameProperty.setDefaultDescription("Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.");
				newMSmtpUserNameProperty.setValueType(Type.getTypeForName("Text"));
				newMSmtpUserNameProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY));
				newMSmtpUserNameProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSmtpUserNameProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpUserNameProperty != null) {
				if(newMSmtpUserNameProperty != null)
					newMSmtpUserNameProperty.eAdapters().addAll(mSmtpUserNameProperty.eAdapters());			
			
				mSmtpUserNameProperty.eAdapters().clear();
			}
			msgs = basicSetMSmtpUserNameProperty(newMSmtpUserNameProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY, newMSmtpUserNameProperty, newMSmtpUserNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>Smtp User Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp User Name Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp User Name Property</em>' attribute.
	 * @see #setSmtpUserNameProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_SmtpUserNameProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getSmtpUserNameProperty() {
		return smtpUserNameProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNameProperty <em>Smtp User Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpUserNameProperty the new value of the '<em>Smtp User Name Property</em>' attribute.
	 * @see #getSmtpUserNameProperty()
	 * @generated
	 */
	public void setSmtpUserNameProperty(String newSmtpUserNameProperty) {
		String oldSmtpUserNameProperty = smtpUserNameProperty;
		smtpUserNameProperty = newSmtpUserNameProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY, oldSmtpUserNameProperty, smtpUserNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>Smtp User Name Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp User Name Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp User Name Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_SmtpUserNamePropertyHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getSmtpUserNamePropertyHistoricValues() {
		if (smtpUserNamePropertyHistoricValues == null) {
			smtpUserNamePropertyHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES);
		}
		return smtpUserNamePropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MSmtp Password Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp Password Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp Password Property</em>' containment reference.
	 * @see #setMSmtpPasswordProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MSmtpPasswordProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP password' description='Specifies password used to authenticate on the (SMTP) server that is responsible for sending the email.' readOnly='false'"
	 * @generated
	 */
	public MProperty getMSmtpPasswordProperty() {
		return mSmtpPasswordProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpPasswordProperty(MProperty newMSmtpPasswordProperty, NotificationChain msgs) {
		MProperty oldMSmtpPasswordProperty = mSmtpPasswordProperty;
		mSmtpPasswordProperty = newMSmtpPasswordProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY, oldMSmtpPasswordProperty, newMSmtpPasswordProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpPasswordProperty <em>MSmtp Password Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpPasswordProperty the new value of the '<em>MSmtp Password Property</em>' containment reference.
	 * @see #getMSmtpPasswordProperty()
	 * @generated
	 */
	public void setMSmtpPasswordProperty(MProperty newMSmtpPasswordProperty) {
		if (newMSmtpPasswordProperty != mSmtpPasswordProperty) {
			NotificationChain msgs = null;
			if (mSmtpPasswordProperty != null)
				msgs = ((InternalEObject)mSmtpPasswordProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY, null, msgs);
			if (newMSmtpPasswordProperty != null) {				
				newMSmtpPasswordProperty.setDefaultName("SMTP password");
				newMSmtpPasswordProperty.setDefaultDescription("Specifies password used to authenticate on the (SMTP) server that is responsible for sending the email.");
				newMSmtpPasswordProperty.setValueType(Type.getTypeForName("Password"));
				newMSmtpPasswordProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY));
				newMSmtpPasswordProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSmtpPasswordProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpPasswordProperty != null) {
				if(newMSmtpPasswordProperty != null)
					newMSmtpPasswordProperty.eAdapters().addAll(mSmtpPasswordProperty.eAdapters());			
			
				mSmtpPasswordProperty.eAdapters().clear();
			}
			msgs = basicSetMSmtpPasswordProperty(newMSmtpPasswordProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY, newMSmtpPasswordProperty, newMSmtpPasswordProperty));
	}

	/**
	 * Returns the value of the '<em><b>Smtp Password Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp Password Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp Password Property</em>' attribute.
	 * @see #setSmtpPasswordProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_SmtpPasswordProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MPassword"
	 * @generated
	 */
	public String getSmtpPasswordProperty() {
		return smtpPasswordProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpPasswordProperty <em>Smtp Password Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpPasswordProperty the new value of the '<em>Smtp Password Property</em>' attribute.
	 * @see #getSmtpPasswordProperty()
	 * @generated
	 */
	public void setSmtpPasswordProperty(String newSmtpPasswordProperty) {
		String oldSmtpPasswordProperty = smtpPasswordProperty;
		smtpPasswordProperty = newSmtpPasswordProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY, oldSmtpPasswordProperty, smtpPasswordProperty));
	}

	/**
	 * Returns the value of the '<em><b>MBurning Software Directory Path Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBurning Software Directory Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBurning Software Directory Path Property</em>' containment reference.
	 * @see #setMBurningSoftwareDirectoryPathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MBurningSoftwareDirectoryPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='CD-ROM burning software directory path' description='Specifies the path to the directory that contains the \'nerocmd.exe\'.'"
	 * @generated
	 */
	public MProperty getMBurningSoftwareDirectoryPathProperty() {
		return mBurningSoftwareDirectoryPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBurningSoftwareDirectoryPathProperty(MProperty newMBurningSoftwareDirectoryPathProperty, NotificationChain msgs) {
		MProperty oldMBurningSoftwareDirectoryPathProperty = mBurningSoftwareDirectoryPathProperty;
		mBurningSoftwareDirectoryPathProperty = newMBurningSoftwareDirectoryPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY, oldMBurningSoftwareDirectoryPathProperty, newMBurningSoftwareDirectoryPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMBurningSoftwareDirectoryPathProperty <em>MBurning Software Directory Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMBurningSoftwareDirectoryPathProperty the new value of the '<em>MBurning Software Directory Path Property</em>' containment reference.
	 * @see #getMBurningSoftwareDirectoryPathProperty()
	 * @generated
	 */
	public void setMBurningSoftwareDirectoryPathProperty(MProperty newMBurningSoftwareDirectoryPathProperty) {
		if (newMBurningSoftwareDirectoryPathProperty != mBurningSoftwareDirectoryPathProperty) {
			NotificationChain msgs = null;
			if (mBurningSoftwareDirectoryPathProperty != null)
				msgs = ((InternalEObject)mBurningSoftwareDirectoryPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY, null, msgs);
			if (newMBurningSoftwareDirectoryPathProperty != null) {				
				newMBurningSoftwareDirectoryPathProperty.setDefaultDescription("Specifies the path to the directory that contains the \'nerocmd.exe\'.");
				newMBurningSoftwareDirectoryPathProperty.setDefaultName("CD-ROM burning software directory path");
				newMBurningSoftwareDirectoryPathProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMBurningSoftwareDirectoryPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY));
				newMBurningSoftwareDirectoryPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMBurningSoftwareDirectoryPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mBurningSoftwareDirectoryPathProperty != null) {
				if(newMBurningSoftwareDirectoryPathProperty != null)
					newMBurningSoftwareDirectoryPathProperty.eAdapters().addAll(mBurningSoftwareDirectoryPathProperty.eAdapters());			
			
				mBurningSoftwareDirectoryPathProperty.eAdapters().clear();
			}
			msgs = basicSetMBurningSoftwareDirectoryPathProperty(newMBurningSoftwareDirectoryPathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY, newMBurningSoftwareDirectoryPathProperty, newMBurningSoftwareDirectoryPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Burning Software Directory Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burning Software Directory Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burning Software Directory Path Property</em>' attribute.
	 * @see #setBurningSoftwareDirectoryPathProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_BurningSoftwareDirectoryPathProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getBurningSoftwareDirectoryPathProperty() {
		return burningSoftwareDirectoryPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getBurningSoftwareDirectoryPathProperty <em>Burning Software Directory Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newBurningSoftwareDirectoryPathProperty the new value of the '<em>Burning Software Directory Path Property</em>' attribute.
	 * @see #getBurningSoftwareDirectoryPathProperty()
	 * @generated
	 */
	public void setBurningSoftwareDirectoryPathProperty(File newBurningSoftwareDirectoryPathProperty) {
		File oldBurningSoftwareDirectoryPathProperty = burningSoftwareDirectoryPathProperty;
		burningSoftwareDirectoryPathProperty = newBurningSoftwareDirectoryPathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY, oldBurningSoftwareDirectoryPathProperty, burningSoftwareDirectoryPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MDrive Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDrive Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDrive Property</em>' containment reference.
	 * @see #setMDriveProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MDriveProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Drive' description='Specifies either the full name of the CD-ROM drive or the drive letter.'"
	 * @generated
	 */
	public MProperty getMDriveProperty() {
		return mDriveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDriveProperty(MProperty newMDriveProperty, NotificationChain msgs) {
		MProperty oldMDriveProperty = mDriveProperty;
		mDriveProperty = newMDriveProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY, oldMDriveProperty, newMDriveProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMDriveProperty <em>MDrive Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDriveProperty the new value of the '<em>MDrive Property</em>' containment reference.
	 * @see #getMDriveProperty()
	 * @generated
	 */
	public void setMDriveProperty(MProperty newMDriveProperty) {
		if (newMDriveProperty != mDriveProperty) {
			NotificationChain msgs = null;
			if (mDriveProperty != null)
				msgs = ((InternalEObject)mDriveProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY, null, msgs);
			if (newMDriveProperty != null) {				
				newMDriveProperty.setDefaultDescription("Specifies either the full name of the CD-ROM drive or the drive letter.");
				newMDriveProperty.setDefaultName("Drive");
				newMDriveProperty.setValueType(Type.getTypeForName("Text"));
				newMDriveProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY));
				newMDriveProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMDriveProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDriveProperty != null) {
				if(newMDriveProperty != null)
					newMDriveProperty.eAdapters().addAll(mDriveProperty.eAdapters());			
			
				mDriveProperty.eAdapters().clear();
			}
			msgs = basicSetMDriveProperty(newMDriveProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY, newMDriveProperty, newMDriveProperty));
	}

	/**
	 * Returns the value of the '<em><b>Drive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Property</em>' attribute.
	 * @see #setDriveProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_DriveProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getDriveProperty() {
		return driveProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getDriveProperty <em>Drive Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDriveProperty the new value of the '<em>Drive Property</em>' attribute.
	 * @see #getDriveProperty()
	 * @generated
	 */
	public void setDriveProperty(String newDriveProperty) {
		String oldDriveProperty = driveProperty;
		driveProperty = newDriveProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY, oldDriveProperty, driveProperty));
	}

	/**
	 * Returns the value of the '<em><b>Drive Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_DrivePropertyHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getDrivePropertyHistoricValues() {
		if (drivePropertyHistoricValues == null) {
			drivePropertyHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES);
		}
		return drivePropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Message Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Message Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Message Property</em>' containment reference.
	 * @see #setMUpgradeMessageProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MUpgradeMessageProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade message' description='Specifies important information about the last application data upgrade.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMUpgradeMessageProperty() {
		return mUpgradeMessageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeMessageProperty(MProperty newMUpgradeMessageProperty, NotificationChain msgs) {
		MProperty oldMUpgradeMessageProperty = mUpgradeMessageProperty;
		mUpgradeMessageProperty = newMUpgradeMessageProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY, oldMUpgradeMessageProperty, newMUpgradeMessageProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeMessageProperty <em>MUpgrade Message Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeMessageProperty the new value of the '<em>MUpgrade Message Property</em>' containment reference.
	 * @see #getMUpgradeMessageProperty()
	 * @generated
	 */
	public void setMUpgradeMessageProperty(MProperty newMUpgradeMessageProperty) {
		if (newMUpgradeMessageProperty != mUpgradeMessageProperty) {
			NotificationChain msgs = null;
			if (mUpgradeMessageProperty != null)
				msgs = ((InternalEObject)mUpgradeMessageProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY, null, msgs);
			if (newMUpgradeMessageProperty != null) {				
				newMUpgradeMessageProperty.setDefaultName("Application data upgrade message");
				newMUpgradeMessageProperty.setDefaultDescription("Specifies important information about the last application data upgrade.");
				newMUpgradeMessageProperty.setValueType(Type.getTypeForName("Text"));
				newMUpgradeMessageProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY));
				newMUpgradeMessageProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeMessageProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeMessageProperty != null) {
				if(newMUpgradeMessageProperty != null)
					newMUpgradeMessageProperty.eAdapters().addAll(mUpgradeMessageProperty.eAdapters());			
			
				mUpgradeMessageProperty.eAdapters().clear();
			}
			msgs = basicSetMUpgradeMessageProperty(newMUpgradeMessageProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY, newMUpgradeMessageProperty, newMUpgradeMessageProperty));
	}

	/**
	 * Returns the value of the '<em><b>Upgrade Message Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Message Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Message Property</em>' attribute.
	 * @see #setUpgradeMessageProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_UpgradeMessageProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getUpgradeMessageProperty() {
		return upgradeMessageProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeMessageProperty <em>Upgrade Message Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUpgradeMessageProperty the new value of the '<em>Upgrade Message Property</em>' attribute.
	 * @see #getUpgradeMessageProperty()
	 * @generated
	 */
	public void setUpgradeMessageProperty(String newUpgradeMessageProperty) {
		String oldUpgradeMessageProperty = upgradeMessageProperty;
		upgradeMessageProperty = newUpgradeMessageProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY, oldUpgradeMessageProperty, upgradeMessageProperty));
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
	 * @see #setMUpgradeRelativeFtpPathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MUpgradeRelativeFtpPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Application data upgrade relative FTP path' description='Specifies the relative path on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.'"
	 * @generated
	 */
	public MProperty getMUpgradeRelativeFtpPathProperty() {
		return mUpgradeRelativeFtpPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeRelativeFtpPathProperty(MProperty newMUpgradeRelativeFtpPathProperty, NotificationChain msgs) {
		MProperty oldMUpgradeRelativeFtpPathProperty = mUpgradeRelativeFtpPathProperty;
		mUpgradeRelativeFtpPathProperty = newMUpgradeRelativeFtpPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeRelativeFtpPathProperty the new value of the '<em>MUpgrade Relative Ftp Path Property</em>' containment reference.
	 * @see #getMUpgradeRelativeFtpPathProperty()
	 * @generated
	 */
	public void setMUpgradeRelativeFtpPathProperty(MProperty newMUpgradeRelativeFtpPathProperty) {
		if (newMUpgradeRelativeFtpPathProperty != mUpgradeRelativeFtpPathProperty) {
			NotificationChain msgs = null;
			if (mUpgradeRelativeFtpPathProperty != null)
				msgs = ((InternalEObject)mUpgradeRelativeFtpPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
			if (newMUpgradeRelativeFtpPathProperty != null) {				
				newMUpgradeRelativeFtpPathProperty.setDefaultDescription("Specifies the relative path on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'.");
				newMUpgradeRelativeFtpPathProperty.setDefaultName("Application data upgrade relative FTP path");
				newMUpgradeRelativeFtpPathProperty.setValueType(Type.getTypeForName("Text"));
				newMUpgradeRelativeFtpPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY));
				newMUpgradeRelativeFtpPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUpgradeRelativeFtpPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY, newMUpgradeRelativeFtpPathProperty, newMUpgradeRelativeFtpPathProperty));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_UpgradeRelativeFtpPathProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getUpgradeRelativeFtpPathProperty() {
		return upgradeRelativeFtpPathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY, oldUpgradeRelativeFtpPathProperty, upgradeRelativeFtpPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MLast Upgrade Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLast Upgrade Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLast Upgrade Property</em>' containment reference.
	 * @see #setMLastUpgradeProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MLastUpgradeProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Last application data upgrade' description='Specifies the date and time when the application data was last upgraded.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMLastUpgradeProperty() {
		return mLastUpgradeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLastUpgradeProperty(MProperty newMLastUpgradeProperty, NotificationChain msgs) {
		MProperty oldMLastUpgradeProperty = mLastUpgradeProperty;
		mLastUpgradeProperty = newMLastUpgradeProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY, oldMLastUpgradeProperty, newMLastUpgradeProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMLastUpgradeProperty <em>MLast Upgrade Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLastUpgradeProperty the new value of the '<em>MLast Upgrade Property</em>' containment reference.
	 * @see #getMLastUpgradeProperty()
	 * @generated
	 */
	public void setMLastUpgradeProperty(MProperty newMLastUpgradeProperty) {
		if (newMLastUpgradeProperty != mLastUpgradeProperty) {
			NotificationChain msgs = null;
			if (mLastUpgradeProperty != null)
				msgs = ((InternalEObject)mLastUpgradeProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY, null, msgs);
			if (newMLastUpgradeProperty != null) {				
				newMLastUpgradeProperty.setDefaultName("Last application data upgrade");
				newMLastUpgradeProperty.setDefaultDescription("Specifies the date and time when the application data was last upgraded.");
				newMLastUpgradeProperty.setValueType(Type.getTypeForName("Date and time"));
				newMLastUpgradeProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY));
				newMLastUpgradeProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLastUpgradeProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLastUpgradeProperty != null) {
				if(newMLastUpgradeProperty != null)
					newMLastUpgradeProperty.eAdapters().addAll(mLastUpgradeProperty.eAdapters());			
			
				mLastUpgradeProperty.eAdapters().clear();
			}
			msgs = basicSetMLastUpgradeProperty(newMLastUpgradeProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY, newMLastUpgradeProperty, newMLastUpgradeProperty));
	}

	/**
	 * Returns the value of the '<em><b>Last Upgrade Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Upgrade Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Upgrade Property</em>' attribute.
	 * @see #setLastUpgradeProperty(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_LastUpgradeProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime"
	 * @generated
	 */
	public Date getLastUpgradeProperty() {
		return lastUpgradeProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getLastUpgradeProperty <em>Last Upgrade Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLastUpgradeProperty the new value of the '<em>Last Upgrade Property</em>' attribute.
	 * @see #getLastUpgradeProperty()
	 * @generated
	 */
	public void setLastUpgradeProperty(Date newLastUpgradeProperty) {
		Date oldLastUpgradeProperty = lastUpgradeProperty;
		lastUpgradeProperty = newLastUpgradeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY, oldLastUpgradeProperty, lastUpgradeProperty));
	}

	/**
	 * Returns the value of the '<em><b>MGet Data Upgrade Info Step</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MGet Data Upgrade Info Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MGet Data Upgrade Info Step</em>' containment reference.
	 * @see #setMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MGetDataUpgradeInfoStep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public MDmsApplicationMGetDataUpgradeInfoStep getMGetDataUpgradeInfoStep() {
		return mGetDataUpgradeInfoStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep newMGetDataUpgradeInfoStep, NotificationChain msgs) {
		MDmsApplicationMGetDataUpgradeInfoStep oldMGetDataUpgradeInfoStep = mGetDataUpgradeInfoStep;
		mGetDataUpgradeInfoStep = newMGetDataUpgradeInfoStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP, oldMGetDataUpgradeInfoStep, newMGetDataUpgradeInfoStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMGetDataUpgradeInfoStep <em>MGet Data Upgrade Info Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMGetDataUpgradeInfoStep the new value of the '<em>MGet Data Upgrade Info Step</em>' containment reference.
	 * @see #getMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public void setMGetDataUpgradeInfoStep(MDmsApplicationMGetDataUpgradeInfoStep newMGetDataUpgradeInfoStep) {
		if (newMGetDataUpgradeInfoStep != mGetDataUpgradeInfoStep) {
			NotificationChain msgs = null;
			if (mGetDataUpgradeInfoStep != null)
				msgs = ((InternalEObject)mGetDataUpgradeInfoStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP, null, msgs);
			if (newMGetDataUpgradeInfoStep != null) {
				msgs = ((InternalEObject)newMGetDataUpgradeInfoStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mGetDataUpgradeInfoStep != null) {
				if(newMGetDataUpgradeInfoStep != null)
					newMGetDataUpgradeInfoStep.eAdapters().addAll(mGetDataUpgradeInfoStep.eAdapters());			
			
				mGetDataUpgradeInfoStep.eAdapters().clear();
			}
			msgs = basicSetMGetDataUpgradeInfoStep(newMGetDataUpgradeInfoStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP, newMGetDataUpgradeInfoStep, newMGetDataUpgradeInfoStep));
	}

	/**
	 * Returns the value of the '<em><b>MUpgrade Data Step</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUpgrade Data Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUpgrade Data Step</em>' containment reference.
	 * @see #setMUpgradeDataStep(MDmsApplicationMUpgradeDataStep)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MUpgradeDataStep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public MDmsApplicationMUpgradeDataStep getMUpgradeDataStep() {
		return mUpgradeDataStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpgradeDataStep(MDmsApplicationMUpgradeDataStep newMUpgradeDataStep, NotificationChain msgs) {
		MDmsApplicationMUpgradeDataStep oldMUpgradeDataStep = mUpgradeDataStep;
		mUpgradeDataStep = newMUpgradeDataStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP, oldMUpgradeDataStep, newMUpgradeDataStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeDataStep <em>MUpgrade Data Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUpgradeDataStep the new value of the '<em>MUpgrade Data Step</em>' containment reference.
	 * @see #getMUpgradeDataStep()
	 * @generated
	 */
	public void setMUpgradeDataStep(MDmsApplicationMUpgradeDataStep newMUpgradeDataStep) {
		if (newMUpgradeDataStep != mUpgradeDataStep) {
			NotificationChain msgs = null;
			if (mUpgradeDataStep != null)
				msgs = ((InternalEObject)mUpgradeDataStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP, null, msgs);
			if (newMUpgradeDataStep != null) {
				msgs = ((InternalEObject)newMUpgradeDataStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUpgradeDataStep != null) {
				if(newMUpgradeDataStep != null)
					newMUpgradeDataStep.eAdapters().addAll(mUpgradeDataStep.eAdapters());			
			
				mUpgradeDataStep.eAdapters().clear();
			}
			msgs = basicSetMUpgradeDataStep(newMUpgradeDataStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP, newMUpgradeDataStep, newMUpgradeDataStep));
	}

	/**
	 * Returns the value of the '<em><b>MScripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MScript}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MScripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MScripts</em>' containment reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MScripts()
	 * @model type="org.onceforall.dms.desktop.logic.MScript" containment="true" required="true"
	 * @generated
	 */
	public EList getMScripts() {
		if (mScripts == null) {
			mScripts = new EObjectContainmentEList(MScript.class, this, LogicPackage.MDMS_APPLICATION__MSCRIPTS);
		}
		return mScripts;
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MMp3Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Folders</em>' containment reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication_MMp3Folders()
	 * @model type="org.onceforall.dms.desktop.logic.MMp3Folder" containment="true" required="true"
	 * @generated
	 */
	public EList getMMp3Folders() {
		if (mMp3Folders == null) {
			mMp3Folders = new EObjectContainmentEList(MMp3Folder.class, this, LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS);
		}
		return mMp3Folders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:
				return basicSetMServiceFilePathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:
				return basicSetMWwxFilesPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:
				return basicSetMMp3EncoderPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:
				return basicSetMFtpServerUrlProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:
				return basicSetMFtpUserNameProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:
				return basicSetMFtpUserPasswordProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:
				return basicSetMWebServerUrlProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:
				return basicSetMSmtpServerProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:
				return basicSetMSmtpUserNameProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:
				return basicSetMSmtpPasswordProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				return basicSetMBurningSoftwareDirectoryPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:
				return basicSetMDriveProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:
				return basicSetMUpgradeMessageProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return basicSetMUpgradeRelativeFtpPathProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:
				return basicSetMLastUpgradeProperty(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:
				return basicSetMGetDataUpgradeInfoStep(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:
				return basicSetMUpgradeDataStep(null, msgs);
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
				return ((InternalEList)getMScripts()).basicRemove(otherEnd, msgs);
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
				return ((InternalEList)getMMp3Folders()).basicRemove(otherEnd, msgs);
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
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:
				return getMServiceFilePathProperty();
			case LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY:
				return getServiceFilePathProperty();
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:
				return getMWwxFilesPathProperty();
			case LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY:
				return getWwxFilesPathProperty();
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:
				return getMMp3EncoderPathProperty();
			case LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY:
				return getMp3EncoderPathProperty();
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:
				return getMFtpServerUrlProperty();
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY:
				return getFtpServerUrlProperty();
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				return getFtpServerUrlPropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:
				return getMFtpUserNameProperty();
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY:
				return getFtpUserNameProperty();
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				return getFtpUserNamePropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:
				return getMFtpUserPasswordProperty();
			case LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY:
				return getFtpUserPasswordProperty();
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:
				return getMWebServerUrlProperty();
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY:
				return getWebServerUrlProperty();
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				return getWebServerUrlPropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:
				return getMSmtpServerProperty();
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY:
				return getSmtpServerProperty();
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES:
				return getSmtpServerPropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:
				return getMSmtpUserNameProperty();
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY:
				return getSmtpUserNameProperty();
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				return getSmtpUserNamePropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:
				return getMSmtpPasswordProperty();
			case LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY:
				return getSmtpPasswordProperty();
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				return getMBurningSoftwareDirectoryPathProperty();
			case LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				return getBurningSoftwareDirectoryPathProperty();
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:
				return getMDriveProperty();
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY:
				return getDriveProperty();
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES:
				return getDrivePropertyHistoricValues();
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:
				return getMUpgradeMessageProperty();
			case LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY:
				return getUpgradeMessageProperty();
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getMUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getUpgradeRelativeFtpPathProperty();
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:
				return getMLastUpgradeProperty();
			case LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY:
				return getLastUpgradeProperty();
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:
				return getMGetDataUpgradeInfoStep();
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:
				return getMUpgradeDataStep();
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
				return getMScripts();
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
				return getMMp3Folders();
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
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:    
				setMServiceFilePathProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY:    
				setServiceFilePathProperty((File)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:    
				setMWwxFilesPathProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY:    
				setWwxFilesPathProperty((File)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:    
				setMMp3EncoderPathProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY:    
				setMp3EncoderPathProperty((File)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:    
				setMFtpServerUrlProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY:    
				setFtpServerUrlProperty((URL)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				getFtpServerUrlPropertyHistoricValues().clear();
				getFtpServerUrlPropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:    
				setMFtpUserNameProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY:    
				setFtpUserNameProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				getFtpUserNamePropertyHistoricValues().clear();
				getFtpUserNamePropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:    
				setMFtpUserPasswordProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY:
				// Makes sure that that plain text password will be encrypted if they are not. TODO: Remove this code after migration. Then all passwords should encrypted anyway.
				if(newValue != null && (((String) newValue).startsWith("esio") || ((String) newValue).startsWith("site")))
						newValue = Type.PASSWORD_TYPE.encryptPassword((String) newValue);
				    
				setFtpUserPasswordProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:    
				setMWebServerUrlProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY:    
				setWebServerUrlProperty((URL)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				getWebServerUrlPropertyHistoricValues().clear();
				getWebServerUrlPropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:    
				setMSmtpServerProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY:    
				setSmtpServerProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES:
				getSmtpServerPropertyHistoricValues().clear();
				getSmtpServerPropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:    
				setMSmtpUserNameProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY:    
				setSmtpUserNameProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				getSmtpUserNamePropertyHistoricValues().clear();
				getSmtpUserNamePropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:    
				setMSmtpPasswordProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY:
				// Makes sure that that plain text password will be encrypted if they are not. TODO: Remove this code after migration. Then all passwords should encrypted anyway.
				if(newValue != null && (((String) newValue).startsWith("esio") || ((String) newValue).startsWith("site")))
						newValue = Type.PASSWORD_TYPE.encryptPassword((String) newValue);
				    
				setSmtpPasswordProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:    
				setMBurningSoftwareDirectoryPathProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:    
				setBurningSoftwareDirectoryPathProperty((File)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:    
				setMDriveProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY:    
				setDriveProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES:
				getDrivePropertyHistoricValues().clear();
				getDrivePropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:    
				setMUpgradeMessageProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY:    
				setUpgradeMessageProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setMUpgradeRelativeFtpPathProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:    
				setUpgradeRelativeFtpPathProperty((String)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:    
				setMLastUpgradeProperty((MProperty)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY:    
				setLastUpgradeProperty((Date)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:    
				setMGetDataUpgradeInfoStep((MDmsApplicationMGetDataUpgradeInfoStep)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:    
				setMUpgradeDataStep((MDmsApplicationMUpgradeDataStep)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
				getMScripts().clear();
				getMScripts().addAll((Collection)newValue);
				return;
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
				getMMp3Folders().clear();
				getMMp3Folders().addAll((Collection)newValue);
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
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:
				setMServiceFilePathProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY:
				setServiceFilePathProperty(getDefaultServiceFilePathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:
				setMWwxFilesPathProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY:
				setWwxFilesPathProperty(getDefaultWwxFilesPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:
				setMMp3EncoderPathProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY:
				setMp3EncoderPathProperty(getDefaultMp3EncoderPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:
				setMFtpServerUrlProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY:
				setFtpServerUrlProperty(getDefaultFtpServerUrlProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				getFtpServerUrlPropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:
				setMFtpUserNameProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY:
				setFtpUserNameProperty(getDefaultFtpUserNameProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				getFtpUserNamePropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:
				setMFtpUserPasswordProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY:
				setFtpUserPasswordProperty(getDefaultFtpUserPasswordProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:
				setMWebServerUrlProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY:
				setWebServerUrlProperty(getDefaultWebServerUrlProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				getWebServerUrlPropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:
				setMSmtpServerProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY:
				setSmtpServerProperty(getDefaultSmtpServerProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES:
				getSmtpServerPropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:
				setMSmtpUserNameProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY:
				setSmtpUserNameProperty(getDefaultSmtpUserNameProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				getSmtpUserNamePropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:
				setMSmtpPasswordProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY:
				setSmtpPasswordProperty(getDefaultSmtpPasswordProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				setMBurningSoftwareDirectoryPathProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				setBurningSoftwareDirectoryPathProperty(getDefaultBurningSoftwareDirectoryPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:
				setMDriveProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY:
				setDriveProperty(getDefaultDriveProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES:
				getDrivePropertyHistoricValues().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:
				setMUpgradeMessageProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY:
				setUpgradeMessageProperty(getDefaultUpgradeMessageProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setMUpgradeRelativeFtpPathProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				setUpgradeRelativeFtpPathProperty(getDefaultUpgradeRelativeFtpPathProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:
				setMLastUpgradeProperty((MProperty)null);
				return;
			case LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY:
				setLastUpgradeProperty(getDefaultLastUpgradeProperty());
				return;
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:
				setMGetDataUpgradeInfoStep((MDmsApplicationMGetDataUpgradeInfoStep)null);
				return;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:
				setMUpgradeDataStep((MDmsApplicationMUpgradeDataStep)null);
				return;
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
				getMScripts().clear();
				return;
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
				getMMp3Folders().clear();
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
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:
				return mServiceFilePathProperty != null;
			case LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY:
				return getDefaultServiceFilePathProperty() == null ? serviceFilePathProperty != null : !getDefaultServiceFilePathProperty().equals(serviceFilePathProperty);
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:
				return mWwxFilesPathProperty != null;
			case LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY:
				return getDefaultWwxFilesPathProperty() == null ? wwxFilesPathProperty != null : !getDefaultWwxFilesPathProperty().equals(wwxFilesPathProperty);
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:
				return mMp3EncoderPathProperty != null;
			case LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY:
				return getDefaultMp3EncoderPathProperty() == null ? mp3EncoderPathProperty != null : !getDefaultMp3EncoderPathProperty().equals(mp3EncoderPathProperty);
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:
				return mFtpServerUrlProperty != null;
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY:
				return getDefaultFtpServerUrlProperty() == null ? ftpServerUrlProperty != null : !getDefaultFtpServerUrlProperty().equals(ftpServerUrlProperty);
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				return ftpServerUrlPropertyHistoricValues != null && !ftpServerUrlPropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:
				return mFtpUserNameProperty != null;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY:
				return getDefaultFtpUserNameProperty() == null ? ftpUserNameProperty != null : !getDefaultFtpUserNameProperty().equals(ftpUserNameProperty);
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				return ftpUserNamePropertyHistoricValues != null && !ftpUserNamePropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:
				return mFtpUserPasswordProperty != null;
			case LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY:
				return getDefaultFtpUserPasswordProperty() == null ? ftpUserPasswordProperty != null : !getDefaultFtpUserPasswordProperty().equals(ftpUserPasswordProperty);
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:
				return mWebServerUrlProperty != null;
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY:
				return getDefaultWebServerUrlProperty() == null ? webServerUrlProperty != null : !getDefaultWebServerUrlProperty().equals(webServerUrlProperty);
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES:
				return webServerUrlPropertyHistoricValues != null && !webServerUrlPropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:
				return mSmtpServerProperty != null;
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY:
				return getDefaultSmtpServerProperty() == null ? smtpServerProperty != null : !getDefaultSmtpServerProperty().equals(smtpServerProperty);
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES:
				return smtpServerPropertyHistoricValues != null && !smtpServerPropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:
				return mSmtpUserNameProperty != null;
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY:
				return getDefaultSmtpUserNameProperty() == null ? smtpUserNameProperty != null : !getDefaultSmtpUserNameProperty().equals(smtpUserNameProperty);
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
				return smtpUserNamePropertyHistoricValues != null && !smtpUserNamePropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:
				return mSmtpPasswordProperty != null;
			case LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY:
				return getDefaultSmtpPasswordProperty() == null ? smtpPasswordProperty != null : !getDefaultSmtpPasswordProperty().equals(smtpPasswordProperty);
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				return mBurningSoftwareDirectoryPathProperty != null;
			case LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
				return getDefaultBurningSoftwareDirectoryPathProperty() == null ? burningSoftwareDirectoryPathProperty != null : !getDefaultBurningSoftwareDirectoryPathProperty().equals(burningSoftwareDirectoryPathProperty);
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:
				return mDriveProperty != null;
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY:
				return getDefaultDriveProperty() == null ? driveProperty != null : !getDefaultDriveProperty().equals(driveProperty);
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES:
				return drivePropertyHistoricValues != null && !drivePropertyHistoricValues.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:
				return mUpgradeMessageProperty != null;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY:
				return getDefaultUpgradeMessageProperty() == null ? upgradeMessageProperty != null : !getDefaultUpgradeMessageProperty().equals(upgradeMessageProperty);
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return mUpgradeRelativeFtpPathProperty != null;
			case LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
				return getDefaultUpgradeRelativeFtpPathProperty() == null ? upgradeRelativeFtpPathProperty != null : !getDefaultUpgradeRelativeFtpPathProperty().equals(upgradeRelativeFtpPathProperty);
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:
				return mLastUpgradeProperty != null;
			case LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY:
				return getDefaultLastUpgradeProperty() == null ? lastUpgradeProperty != null : !getDefaultLastUpgradeProperty().equals(lastUpgradeProperty);
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:
				return mGetDataUpgradeInfoStep != null;
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:
				return mUpgradeDataStep != null;
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
				return mScripts != null && !mScripts.isEmpty();
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
				return mMp3Folders != null && !mMp3Folders.isEmpty();
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
		result.append(" (serviceFilePathProperty: ");
		result.append(serviceFilePathProperty);
		result.append(", wwxFilesPathProperty: ");
		result.append(wwxFilesPathProperty);
		result.append(", mp3EncoderPathProperty: ");
		result.append(mp3EncoderPathProperty);
		result.append(", ftpServerUrlProperty: ");
		result.append(ftpServerUrlProperty);
		result.append(", ftpServerUrlPropertyHistoricValues: ");
		result.append(ftpServerUrlPropertyHistoricValues);
		result.append(", ftpUserNameProperty: ");
		result.append(ftpUserNameProperty);
		result.append(", ftpUserNamePropertyHistoricValues: ");
		result.append(ftpUserNamePropertyHistoricValues);
		result.append(", ftpUserPasswordProperty: ");
		result.append(ftpUserPasswordProperty);
		result.append(", webServerUrlProperty: ");
		result.append(webServerUrlProperty);
		result.append(", webServerUrlPropertyHistoricValues: ");
		result.append(webServerUrlPropertyHistoricValues);
		result.append(", smtpServerProperty: ");
		result.append(smtpServerProperty);
		result.append(", smtpServerPropertyHistoricValues: ");
		result.append(smtpServerPropertyHistoricValues);
		result.append(", smtpUserNameProperty: ");
		result.append(smtpUserNameProperty);
		result.append(", smtpUserNamePropertyHistoricValues: ");
		result.append(smtpUserNamePropertyHistoricValues);
		result.append(", smtpPasswordProperty: ");
		result.append(smtpPasswordProperty);
		result.append(", burningSoftwareDirectoryPathProperty: ");
		result.append(burningSoftwareDirectoryPathProperty);
		result.append(", driveProperty: ");
		result.append(driveProperty);
		result.append(", drivePropertyHistoricValues: ");
		result.append(drivePropertyHistoricValues);
		result.append(", upgradeMessageProperty: ");
		result.append(upgradeMessageProperty);
		result.append(", upgradeRelativeFtpPathProperty: ");
		result.append(upgradeRelativeFtpPathProperty);
		result.append(", lastUpgradeProperty: ");
		result.append(lastUpgradeProperty);
		result.append(')');
		return result.toString();
	}

} // MDmsApplication