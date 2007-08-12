/*
 * Revision History:
 * $Log: MEmailEventLogStep.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logging.MemoryHandler;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEmail Event Log Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMCommentParameter <em>MComment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getCommentParameter <em>Comment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMLogFileParameter <em>MLog File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getLogFileParameter <em>Log File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMDataFileParameter <em>MData File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getDataFileParameter <em>Data File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSubjectParameter <em>MSubject Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSendersEmailAddressParameter <em>MSenders Email Address Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameter <em>Senders Email Address Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameterHistoricValues <em>Senders Email Address Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMReceipientsEmailAddressParameter <em>MReceipients Email Address Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getReceipientsEmailAddressParameter <em>Receipients Email Address Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpServerParameter <em>MSmtp Server Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpServerParameter <em>Smtp Server Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpUserNameParameter <em>MSmtp User Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpUserNameParameter <em>Smtp User Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpPasswordParameter <em>MSmtp Password Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpPasswordParameter <em>Smtp Password Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Email event log' description='Sends an email with the log and application data to the Digital Media Service email post box. Please enter your name and an optional comment.' iconFilePath='Image Files/Email event log step.gif' actionName='Send' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MEmailEventLogStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MEmailEventLogStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MEmailEventLogStep.TYPE_NAME, new ReferenceType("Reference to "+MEmailEventLogStep.TYPE_NAME, "Specifies a reference to a "+MEmailEventLogStep.TYPE_NAME_FOR_UI, MEmailEventLogStep.class));
	}
	/**
	 * The cached value of the '{@link #getMRecordingUsersNameParameter() <em>MRecording Users Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingUsersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingUsersNameParameter = null;

	/**
	 * The default value of the '{@link #getRecordingUsersNameParameter() <em>Recording Users Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingUsersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDING_USERS_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingUsersNameParameter() <em>Recording Users Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingUsersNameParameter() <em>Recording Users Name Parameter</em>}' attribute.
	 * @see #getRecordingUsersNameParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultRecordingUsersNameParameter() {
		return RECORDING_USERS_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingUsersNameParameter() <em>Recording Users Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingUsersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected String recordingUsersNameParameter = RECORDING_USERS_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMCommentParameter() <em>MComment Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCommentParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mCommentParameter = null;

	/**
	 * The default value of the '{@link #getCommentParameter() <em>Comment Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getCommentParameter() <em>Comment Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getCommentParameter() <em>Comment Parameter</em>}' attribute.
	 * @see #getCommentParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultCommentParameter() {
		return COMMENT_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getCommentParameter() <em>Comment Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentParameter()
	 * @generated
	 * @ordered
	 */
	protected String commentParameter = COMMENT_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMLogFileParameter() <em>MLog File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLogFileParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mLogFileParameter = null;

	/**
	 * The default value of the '{@link #getLogFileParameter() <em>Log File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File LOG_FILE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLogFileParameter() <em>Log File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLogFileParameter() <em>Log File Parameter</em>}' attribute.
	 * @see #getLogFileParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultLogFileParameter() {
		return LOG_FILE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLogFileParameter() <em>Log File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileParameter()
	 * @generated
	 * @ordered
	 */
	protected File logFileParameter = LOG_FILE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMDataFileParameter() <em>MData File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDataFileParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDataFileParameter = null;

	/**
	 * The default value of the '{@link #getDataFileParameter() <em>Data File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File DATA_FILE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDataFileParameter() <em>Data File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDataFileParameter() <em>Data File Parameter</em>}' attribute.
	 * @see #getDataFileParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDataFileParameter() {
		return DATA_FILE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDataFileParameter() <em>Data File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileParameter()
	 * @generated
	 * @ordered
	 */
	protected File dataFileParameter = DATA_FILE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSubjectParameter() <em>MSubject Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSubjectParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSubjectParameter = null;

	/**
	 * The default value of the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' attribute.
	 * @see #getSubjectParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSubjectParameter() {
		return SUBJECT_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectParameter()
	 * @generated
	 * @ordered
	 */
	protected String subjectParameter = SUBJECT_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSendersEmailAddressParameter() <em>MSenders Email Address Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSendersEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSendersEmailAddressParameter = null;

	/**
	 * The default value of the '{@link #getSendersEmailAddressParameter() <em>Senders Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendersEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDERS_EMAIL_ADDRESS_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSendersEmailAddressParameter() <em>Senders Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSendersEmailAddressParameter() <em>Senders Email Address Parameter</em>}' attribute.
	 * @see #getSendersEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSendersEmailAddressParameter() {
		return SENDERS_EMAIL_ADDRESS_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSendersEmailAddressParameter() <em>Senders Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendersEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected String sendersEmailAddressParameter = SENDERS_EMAIL_ADDRESS_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendersEmailAddressParameterHistoricValues() <em>Senders Email Address Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendersEmailAddressParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList sendersEmailAddressParameterHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMReceipientsEmailAddressParameter() <em>MReceipients Email Address Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReceipientsEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mReceipientsEmailAddressParameter = null;

	/**
	 * The default value of the '{@link #getReceipientsEmailAddressParameter() <em>Receipients Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipientsEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIPIENTS_EMAIL_ADDRESS_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getReceipientsEmailAddressParameter() <em>Receipients Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getReceipientsEmailAddressParameter() <em>Receipients Email Address Parameter</em>}' attribute.
	 * @see #getReceipientsEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultReceipientsEmailAddressParameter() {
		return RECEIPIENTS_EMAIL_ADDRESS_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getReceipientsEmailAddressParameter() <em>Receipients Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipientsEmailAddressParameter()
	 * @generated
	 * @ordered
	 */
	protected String receipientsEmailAddressParameter = RECEIPIENTS_EMAIL_ADDRESS_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSmtpServerParameter() <em>MSmtp Server Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpServerParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSmtpServerParameter = null;

	/**
	 * The default value of the '{@link #getSmtpServerParameter() <em>Smtp Server Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServerParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_SERVER_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSmtpServerParameter() <em>Smtp Server Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpServerParameter() <em>Smtp Server Parameter</em>}' attribute.
	 * @see #getSmtpServerParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpServerParameter() {
		return SMTP_SERVER_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpServerParameter() <em>Smtp Server Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServerParameter()
	 * @generated
	 * @ordered
	 */
	protected String smtpServerParameter = SMTP_SERVER_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSmtpUserNameParameter() <em>MSmtp User Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSmtpUserNameParameter = null;

	/**
	 * The default value of the '{@link #getSmtpUserNameParameter() <em>Smtp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_USER_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSmtpUserNameParameter() <em>Smtp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpUserNameParameter() <em>Smtp User Name Parameter</em>}' attribute.
	 * @see #getSmtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpUserNameParameter() {
		return SMTP_USER_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpUserNameParameter() <em>Smtp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected String smtpUserNameParameter = SMTP_USER_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSmtpPasswordParameter() <em>MSmtp Password Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSmtpPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSmtpPasswordParameter = null;

	/**
	 * The default value of the '{@link #getSmtpPasswordParameter() <em>Smtp Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_PASSWORD_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSmtpPasswordParameter() <em>Smtp Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSmtpPasswordParameter() <em>Smtp Password Parameter</em>}' attribute.
	 * @see #getSmtpPasswordParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSmtpPasswordParameter() {
		return SMTP_PASSWORD_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSmtpPasswordParameter() <em>Smtp Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected String smtpPasswordParameter = SMTP_PASSWORD_PARAMETER_EDEFAULT;

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
		return "Send";
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
	 * Get the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultIconFilePath() {
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Email event log step.gif");
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
		return "Sends an email with the log and application data to the Digital Media Service email post box. Please enter your name and an optional comment.";
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
		return "Email event log";
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
	protected MEmailEventLogStep() {
		super();
		
		firstMEmailEventLogStepConstructorHook();
				
		actionName = "Send";
		stoppable = false;
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Email event log step.gif");
		description = "Sends an email with the log and application data to the Digital Media Service email post box. Please enter your name and an optional comment.";
		name = "Email event log";
		interruptable = false;
		terminatable = false;
					 
		setMRecordingUsersNameParameter(new MParameter(false, "Recording user\'s name", "Specifies the name of the recording user. Please enter your name.", null));			 
		setMCommentParameter(new MParameter(false, "Comment", "Specifies a comment for the receipient of the email.", null));			 
		setMLogFileParameter(new MParameter(false, "Log file", "Specifies the file that contains the log data.", null));			 
		setMDataFileParameter(new MParameter(false, "Data file", "Specifies the file that contains the application data.", null));			 
		setMSubjectParameter(new MParameter(false, "Subject", "Specifies the subject of the email.", null));			 
		setMSendersEmailAddressParameter(new MParameter(false, "Sender\'s email address", "Specifies the sender\'s email address. Please enter your own email address here. Alternatively use \'sounddesk@ccbromley.net\'.", null));			 
		setMReceipientsEmailAddressParameter(new MParameter(false, "Receipient\'s email address", "Specifies the receipient\'s email address.", null));			 
		setMSmtpServerParameter(new MParameter(false, "SMTP server", "Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.", null));			 
		setMSmtpUserNameParameter(new MParameter(false, "SMTP user name", "Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.", null));			 
		setMSmtpPasswordParameter(new MParameter(false, "SMTP password", "Specifies password used to authenticate on (SMTP) server that is responsible for sending the email.", null));

		lastMEmailEventLogStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMEmailEventLogStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMEmailEventLogStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MRecording Users Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Users Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Users Name Parameter</em>' containment reference.
	 * @see #setMRecordingUsersNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MRecordingUsersNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording user\'s name' description='Specifies the name of the recording user. Please enter your name.'"
	 * @generated
	 */
	public MParameter getMRecordingUsersNameParameter() {
		return mRecordingUsersNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingUsersNameParameter(MParameter newMRecordingUsersNameParameter, NotificationChain msgs) {
		MParameter oldMRecordingUsersNameParameter = mRecordingUsersNameParameter;
		mRecordingUsersNameParameter = newMRecordingUsersNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER, oldMRecordingUsersNameParameter, newMRecordingUsersNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRecordingUsersNameParameter the new value of the '<em>MRecording Users Name Parameter</em>' containment reference.
	 * @see #getMRecordingUsersNameParameter()
	 * @generated
	 */
	public void setMRecordingUsersNameParameter(MParameter newMRecordingUsersNameParameter) {
		if (newMRecordingUsersNameParameter != mRecordingUsersNameParameter) {
			NotificationChain msgs = null;
			if (mRecordingUsersNameParameter != null)
				msgs = ((InternalEObject)mRecordingUsersNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
			if (newMRecordingUsersNameParameter != null) {				
				newMRecordingUsersNameParameter.setDefaultDescription("Specifies the name of the recording user. Please enter your name.");
				newMRecordingUsersNameParameter.setDefaultName("Recording user\'s name");
				newMRecordingUsersNameParameter.setValueType(Type.getTypeForName("Text"));
				newMRecordingUsersNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER));
				newMRecordingUsersNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingUsersNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingUsersNameParameter != null) {
				if(newMRecordingUsersNameParameter != null)
					newMRecordingUsersNameParameter.eAdapters().addAll(mRecordingUsersNameParameter.eAdapters());			
			
				mRecordingUsersNameParameter.eAdapters().clear();
			}
			msgs = basicSetMRecordingUsersNameParameter(newMRecordingUsersNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER, newMRecordingUsersNameParameter, newMRecordingUsersNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording Users Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Users Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Users Name Parameter</em>' attribute.
	 * @see #setRecordingUsersNameParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_RecordingUsersNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getRecordingUsersNameParameter() {
		return recordingUsersNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newRecordingUsersNameParameter the new value of the '<em>Recording Users Name Parameter</em>' attribute.
	 * @see #getRecordingUsersNameParameter()
	 * @generated
	 */
	public void setRecordingUsersNameParameter(String newRecordingUsersNameParameter) {
		String oldRecordingUsersNameParameter = recordingUsersNameParameter;
		recordingUsersNameParameter = newRecordingUsersNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER, oldRecordingUsersNameParameter, recordingUsersNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MComment Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MComment Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MComment Parameter</em>' containment reference.
	 * @see #setMCommentParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MCommentParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Comment' description='Specifies a comment for the receipient of the email.'"
	 * @generated
	 */
	public MParameter getMCommentParameter() {
		return mCommentParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCommentParameter(MParameter newMCommentParameter, NotificationChain msgs) {
		MParameter oldMCommentParameter = mCommentParameter;
		mCommentParameter = newMCommentParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER, oldMCommentParameter, newMCommentParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMCommentParameter <em>MComment Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMCommentParameter the new value of the '<em>MComment Parameter</em>' containment reference.
	 * @see #getMCommentParameter()
	 * @generated
	 */
	public void setMCommentParameter(MParameter newMCommentParameter) {
		if (newMCommentParameter != mCommentParameter) {
			NotificationChain msgs = null;
			if (mCommentParameter != null)
				msgs = ((InternalEObject)mCommentParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER, null, msgs);
			if (newMCommentParameter != null) {				
				newMCommentParameter.setDefaultDescription("Specifies a comment for the receipient of the email.");
				newMCommentParameter.setDefaultName("Comment");
				newMCommentParameter.setValueType(Type.getTypeForName("Text"));
				newMCommentParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER));
				newMCommentParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMCommentParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mCommentParameter != null) {
				if(newMCommentParameter != null)
					newMCommentParameter.eAdapters().addAll(mCommentParameter.eAdapters());			
			
				mCommentParameter.eAdapters().clear();
			}
			msgs = basicSetMCommentParameter(newMCommentParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER, newMCommentParameter, newMCommentParameter));
	}

	/**
	 * Returns the value of the '<em><b>Comment Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Parameter</em>' attribute.
	 * @see #setCommentParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_CommentParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getCommentParameter() {
		return commentParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getCommentParameter <em>Comment Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newCommentParameter the new value of the '<em>Comment Parameter</em>' attribute.
	 * @see #getCommentParameter()
	 * @generated
	 */
	public void setCommentParameter(String newCommentParameter) {
		String oldCommentParameter = commentParameter;
		commentParameter = newCommentParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER, oldCommentParameter, commentParameter));
	}

	/**
	 * Returns the value of the '<em><b>MLog File Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLog File Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLog File Parameter</em>' containment reference.
	 * @see #setMLogFileParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MLogFileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Log file' description='Specifies the file that contains the log data.'"
	 * @generated
	 */
	public MParameter getMLogFileParameter() {
		return mLogFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLogFileParameter(MParameter newMLogFileParameter, NotificationChain msgs) {
		MParameter oldMLogFileParameter = mLogFileParameter;
		mLogFileParameter = newMLogFileParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER, oldMLogFileParameter, newMLogFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMLogFileParameter <em>MLog File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLogFileParameter the new value of the '<em>MLog File Parameter</em>' containment reference.
	 * @see #getMLogFileParameter()
	 * @generated
	 */
	public void setMLogFileParameter(MParameter newMLogFileParameter) {
		if (newMLogFileParameter != mLogFileParameter) {
			NotificationChain msgs = null;
			if (mLogFileParameter != null)
				msgs = ((InternalEObject)mLogFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER, null, msgs);
			if (newMLogFileParameter != null) {				
				newMLogFileParameter.setDefaultDescription("Specifies the file that contains the log data.");
				newMLogFileParameter.setDefaultName("Log file");
				newMLogFileParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMLogFileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER));
				newMLogFileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLogFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLogFileParameter != null) {
				if(newMLogFileParameter != null)
					newMLogFileParameter.eAdapters().addAll(mLogFileParameter.eAdapters());			
			
				mLogFileParameter.eAdapters().clear();
			}
			msgs = basicSetMLogFileParameter(newMLogFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER, newMLogFileParameter, newMLogFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Log File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Parameter</em>' attribute.
	 * @see #setLogFileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_LogFileParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getLogFileParameter() {
		return logFileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getLogFileParameter <em>Log File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLogFileParameter the new value of the '<em>Log File Parameter</em>' attribute.
	 * @see #getLogFileParameter()
	 * @generated
	 */
	public void setLogFileParameter(File newLogFileParameter) {
		File oldLogFileParameter = logFileParameter;
		logFileParameter = newLogFileParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER, oldLogFileParameter, logFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>MData File Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MData File Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MData File Parameter</em>' containment reference.
	 * @see #setMDataFileParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MDataFileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Data file' description='Specifies the file that contains the application data.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMDataFileParameter() {
		return mDataFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDataFileParameter(MParameter newMDataFileParameter, NotificationChain msgs) {
		MParameter oldMDataFileParameter = mDataFileParameter;
		mDataFileParameter = newMDataFileParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER, oldMDataFileParameter, newMDataFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMDataFileParameter <em>MData File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDataFileParameter the new value of the '<em>MData File Parameter</em>' containment reference.
	 * @see #getMDataFileParameter()
	 * @generated
	 */
	public void setMDataFileParameter(MParameter newMDataFileParameter) {
		if (newMDataFileParameter != mDataFileParameter) {
			NotificationChain msgs = null;
			if (mDataFileParameter != null)
				msgs = ((InternalEObject)mDataFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER, null, msgs);
			if (newMDataFileParameter != null) {				
				newMDataFileParameter.setDefaultName("Data file");
				newMDataFileParameter.setDefaultDescription("Specifies the file that contains the application data.");
				newMDataFileParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMDataFileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER));
				newMDataFileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDataFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDataFileParameter != null) {
				if(newMDataFileParameter != null)
					newMDataFileParameter.eAdapters().addAll(mDataFileParameter.eAdapters());			
			
				mDataFileParameter.eAdapters().clear();
			}
			msgs = basicSetMDataFileParameter(newMDataFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER, newMDataFileParameter, newMDataFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Data File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Parameter</em>' attribute.
	 * @see #setDataFileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_DataFileParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getDataFileParameter() {
		return dataFileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getDataFileParameter <em>Data File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDataFileParameter the new value of the '<em>Data File Parameter</em>' attribute.
	 * @see #getDataFileParameter()
	 * @generated
	 */
	public void setDataFileParameter(File newDataFileParameter) {
		File oldDataFileParameter = dataFileParameter;
		dataFileParameter = newDataFileParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER, oldDataFileParameter, dataFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSubject Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSubject Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSubject Parameter</em>' containment reference.
	 * @see #setMSubjectParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MSubjectParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Subject' description='Specifies the subject of the email.'"
	 * @generated
	 */
	public MParameter getMSubjectParameter() {
		return mSubjectParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSubjectParameter(MParameter newMSubjectParameter, NotificationChain msgs) {
		MParameter oldMSubjectParameter = mSubjectParameter;
		mSubjectParameter = newMSubjectParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER, oldMSubjectParameter, newMSubjectParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSubjectParameter <em>MSubject Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSubjectParameter the new value of the '<em>MSubject Parameter</em>' containment reference.
	 * @see #getMSubjectParameter()
	 * @generated
	 */
	public void setMSubjectParameter(MParameter newMSubjectParameter) {
		if (newMSubjectParameter != mSubjectParameter) {
			NotificationChain msgs = null;
			if (mSubjectParameter != null)
				msgs = ((InternalEObject)mSubjectParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER, null, msgs);
			if (newMSubjectParameter != null) {				
				newMSubjectParameter.setDefaultDescription("Specifies the subject of the email.");
				newMSubjectParameter.setDefaultName("Subject");
				newMSubjectParameter.setValueType(Type.getTypeForName("Text"));
				newMSubjectParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER));
				newMSubjectParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSubjectParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSubjectParameter != null) {
				if(newMSubjectParameter != null)
					newMSubjectParameter.eAdapters().addAll(mSubjectParameter.eAdapters());			
			
				mSubjectParameter.eAdapters().clear();
			}
			msgs = basicSetMSubjectParameter(newMSubjectParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER, newMSubjectParameter, newMSubjectParameter));
	}

	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' attribute.
	 * @see #setSubjectParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SubjectParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getSubjectParameter() {
		return subjectParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSubjectParameter <em>Subject Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSubjectParameter the new value of the '<em>Subject Parameter</em>' attribute.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	public void setSubjectParameter(String newSubjectParameter) {
		String oldSubjectParameter = subjectParameter;
		subjectParameter = newSubjectParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER, oldSubjectParameter, subjectParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSenders Email Address Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSenders Email Address Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSenders Email Address Parameter</em>' containment reference.
	 * @see #setMSendersEmailAddressParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MSendersEmailAddressParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Sender\'s email address' description='Specifies the sender\'s email address. Please enter your own email address here. Alternatively use \'sounddesk@ccbromley.net\'.'"
	 * @generated
	 */
	public MParameter getMSendersEmailAddressParameter() {
		return mSendersEmailAddressParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSendersEmailAddressParameter(MParameter newMSendersEmailAddressParameter, NotificationChain msgs) {
		MParameter oldMSendersEmailAddressParameter = mSendersEmailAddressParameter;
		mSendersEmailAddressParameter = newMSendersEmailAddressParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER, oldMSendersEmailAddressParameter, newMSendersEmailAddressParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSendersEmailAddressParameter <em>MSenders Email Address Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSendersEmailAddressParameter the new value of the '<em>MSenders Email Address Parameter</em>' containment reference.
	 * @see #getMSendersEmailAddressParameter()
	 * @generated
	 */
	public void setMSendersEmailAddressParameter(MParameter newMSendersEmailAddressParameter) {
		if (newMSendersEmailAddressParameter != mSendersEmailAddressParameter) {
			NotificationChain msgs = null;
			if (mSendersEmailAddressParameter != null)
				msgs = ((InternalEObject)mSendersEmailAddressParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER, null, msgs);
			if (newMSendersEmailAddressParameter != null) {				
				newMSendersEmailAddressParameter.setDefaultDescription("Specifies the sender\'s email address. Please enter your own email address here. Alternatively use \'sounddesk@ccbromley.net\'.");
				newMSendersEmailAddressParameter.setDefaultName("Sender\'s email address");
				newMSendersEmailAddressParameter.setValueType(Type.getTypeForName("Text"));
				newMSendersEmailAddressParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER));
				newMSendersEmailAddressParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSendersEmailAddressParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSendersEmailAddressParameter != null) {
				if(newMSendersEmailAddressParameter != null)
					newMSendersEmailAddressParameter.eAdapters().addAll(mSendersEmailAddressParameter.eAdapters());			
			
				mSendersEmailAddressParameter.eAdapters().clear();
			}
			msgs = basicSetMSendersEmailAddressParameter(newMSendersEmailAddressParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER, newMSendersEmailAddressParameter, newMSendersEmailAddressParameter));
	}

	/**
	 * Returns the value of the '<em><b>Senders Email Address Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senders Email Address Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders Email Address Parameter</em>' attribute.
	 * @see #setSendersEmailAddressParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SendersEmailAddressParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getSendersEmailAddressParameter() {
		return sendersEmailAddressParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameter <em>Senders Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSendersEmailAddressParameter the new value of the '<em>Senders Email Address Parameter</em>' attribute.
	 * @see #getSendersEmailAddressParameter()
	 * @generated
	 */
	public void setSendersEmailAddressParameter(String newSendersEmailAddressParameter) {
		String oldSendersEmailAddressParameter = sendersEmailAddressParameter;
		sendersEmailAddressParameter = newSendersEmailAddressParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER, oldSendersEmailAddressParameter, sendersEmailAddressParameter));
	}

	/**
	 * Returns the value of the '<em><b>Senders Email Address Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senders Email Address Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders Email Address Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SendersEmailAddressParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="6"
	 * @generated
	 */
	public EList getSendersEmailAddressParameterHistoricValues() {
		if (sendersEmailAddressParameterHistoricValues == null) {
			sendersEmailAddressParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES);
		}
		return sendersEmailAddressParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MReceipients Email Address Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MReceipients Email Address Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReceipients Email Address Parameter</em>' containment reference.
	 * @see #setMReceipientsEmailAddressParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MReceipientsEmailAddressParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Receipient\'s email address' description='Specifies the receipient\'s email address.'"
	 * @generated
	 */
	public MParameter getMReceipientsEmailAddressParameter() {
		return mReceipientsEmailAddressParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMReceipientsEmailAddressParameter(MParameter newMReceipientsEmailAddressParameter, NotificationChain msgs) {
		MParameter oldMReceipientsEmailAddressParameter = mReceipientsEmailAddressParameter;
		mReceipientsEmailAddressParameter = newMReceipientsEmailAddressParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER, oldMReceipientsEmailAddressParameter, newMReceipientsEmailAddressParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMReceipientsEmailAddressParameter <em>MReceipients Email Address Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMReceipientsEmailAddressParameter the new value of the '<em>MReceipients Email Address Parameter</em>' containment reference.
	 * @see #getMReceipientsEmailAddressParameter()
	 * @generated
	 */
	public void setMReceipientsEmailAddressParameter(MParameter newMReceipientsEmailAddressParameter) {
		if (newMReceipientsEmailAddressParameter != mReceipientsEmailAddressParameter) {
			NotificationChain msgs = null;
			if (mReceipientsEmailAddressParameter != null)
				msgs = ((InternalEObject)mReceipientsEmailAddressParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER, null, msgs);
			if (newMReceipientsEmailAddressParameter != null) {				
				newMReceipientsEmailAddressParameter.setDefaultDescription("Specifies the receipient\'s email address.");
				newMReceipientsEmailAddressParameter.setDefaultName("Receipient\'s email address");
				newMReceipientsEmailAddressParameter.setValueType(Type.getTypeForName("Text"));
				newMReceipientsEmailAddressParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER));
				newMReceipientsEmailAddressParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMReceipientsEmailAddressParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mReceipientsEmailAddressParameter != null) {
				if(newMReceipientsEmailAddressParameter != null)
					newMReceipientsEmailAddressParameter.eAdapters().addAll(mReceipientsEmailAddressParameter.eAdapters());			
			
				mReceipientsEmailAddressParameter.eAdapters().clear();
			}
			msgs = basicSetMReceipientsEmailAddressParameter(newMReceipientsEmailAddressParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER, newMReceipientsEmailAddressParameter, newMReceipientsEmailAddressParameter));
	}

	/**
	 * Returns the value of the '<em><b>Receipients Email Address Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipients Email Address Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipients Email Address Parameter</em>' attribute.
	 * @see #setReceipientsEmailAddressParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_ReceipientsEmailAddressParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getReceipientsEmailAddressParameter() {
		return receipientsEmailAddressParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getReceipientsEmailAddressParameter <em>Receipients Email Address Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newReceipientsEmailAddressParameter the new value of the '<em>Receipients Email Address Parameter</em>' attribute.
	 * @see #getReceipientsEmailAddressParameter()
	 * @generated
	 */
	public void setReceipientsEmailAddressParameter(String newReceipientsEmailAddressParameter) {
		String oldReceipientsEmailAddressParameter = receipientsEmailAddressParameter;
		receipientsEmailAddressParameter = newReceipientsEmailAddressParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER, oldReceipientsEmailAddressParameter, receipientsEmailAddressParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSmtp Server Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp Server Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp Server Parameter</em>' containment reference.
	 * @see #setMSmtpServerParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MSmtpServerParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP server' description='Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.'"
	 * @generated
	 */
	public MParameter getMSmtpServerParameter() {
		return mSmtpServerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpServerParameter(MParameter newMSmtpServerParameter, NotificationChain msgs) {
		MParameter oldMSmtpServerParameter = mSmtpServerParameter;
		mSmtpServerParameter = newMSmtpServerParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER, oldMSmtpServerParameter, newMSmtpServerParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpServerParameter <em>MSmtp Server Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpServerParameter the new value of the '<em>MSmtp Server Parameter</em>' containment reference.
	 * @see #getMSmtpServerParameter()
	 * @generated
	 */
	public void setMSmtpServerParameter(MParameter newMSmtpServerParameter) {
		if (newMSmtpServerParameter != mSmtpServerParameter) {
			NotificationChain msgs = null;
			if (mSmtpServerParameter != null)
				msgs = ((InternalEObject)mSmtpServerParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER, null, msgs);
			if (newMSmtpServerParameter != null) {				
				newMSmtpServerParameter.setDefaultDescription("Specifies the name or IP address of the (SMTP) server that is responsible for sending the email.");
				newMSmtpServerParameter.setDefaultName("SMTP server");
				newMSmtpServerParameter.setValueType(Type.getTypeForName("Text"));
				newMSmtpServerParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER));
				newMSmtpServerParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSmtpServerParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpServerParameter != null) {
				if(newMSmtpServerParameter != null)
					newMSmtpServerParameter.eAdapters().addAll(mSmtpServerParameter.eAdapters());			
			
				mSmtpServerParameter.eAdapters().clear();
			}
			msgs = basicSetMSmtpServerParameter(newMSmtpServerParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER, newMSmtpServerParameter, newMSmtpServerParameter));
	}

	/**
	 * Returns the value of the '<em><b>Smtp Server Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp Server Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp Server Parameter</em>' attribute.
	 * @see #setSmtpServerParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SmtpServerParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getSmtpServerParameter() {
		return smtpServerParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpServerParameter <em>Smtp Server Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpServerParameter the new value of the '<em>Smtp Server Parameter</em>' attribute.
	 * @see #getSmtpServerParameter()
	 * @generated
	 */
	public void setSmtpServerParameter(String newSmtpServerParameter) {
		String oldSmtpServerParameter = smtpServerParameter;
		smtpServerParameter = newSmtpServerParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER, oldSmtpServerParameter, smtpServerParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSmtp User Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp User Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp User Name Parameter</em>' containment reference.
	 * @see #setMSmtpUserNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MSmtpUserNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP user name' description='Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.'"
	 * @generated
	 */
	public MParameter getMSmtpUserNameParameter() {
		return mSmtpUserNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpUserNameParameter(MParameter newMSmtpUserNameParameter, NotificationChain msgs) {
		MParameter oldMSmtpUserNameParameter = mSmtpUserNameParameter;
		mSmtpUserNameParameter = newMSmtpUserNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER, oldMSmtpUserNameParameter, newMSmtpUserNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpUserNameParameter <em>MSmtp User Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpUserNameParameter the new value of the '<em>MSmtp User Name Parameter</em>' containment reference.
	 * @see #getMSmtpUserNameParameter()
	 * @generated
	 */
	public void setMSmtpUserNameParameter(MParameter newMSmtpUserNameParameter) {
		if (newMSmtpUserNameParameter != mSmtpUserNameParameter) {
			NotificationChain msgs = null;
			if (mSmtpUserNameParameter != null)
				msgs = ((InternalEObject)mSmtpUserNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER, null, msgs);
			if (newMSmtpUserNameParameter != null) {				
				newMSmtpUserNameParameter.setDefaultDescription("Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.");
				newMSmtpUserNameParameter.setDefaultName("SMTP user name");
				newMSmtpUserNameParameter.setValueType(Type.getTypeForName("Text"));
				newMSmtpUserNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER));
				newMSmtpUserNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSmtpUserNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpUserNameParameter != null) {
				if(newMSmtpUserNameParameter != null)
					newMSmtpUserNameParameter.eAdapters().addAll(mSmtpUserNameParameter.eAdapters());			
			
				mSmtpUserNameParameter.eAdapters().clear();
			}
			msgs = basicSetMSmtpUserNameParameter(newMSmtpUserNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER, newMSmtpUserNameParameter, newMSmtpUserNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Smtp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp User Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp User Name Parameter</em>' attribute.
	 * @see #setSmtpUserNameParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SmtpUserNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getSmtpUserNameParameter() {
		return smtpUserNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpUserNameParameter <em>Smtp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpUserNameParameter the new value of the '<em>Smtp User Name Parameter</em>' attribute.
	 * @see #getSmtpUserNameParameter()
	 * @generated
	 */
	public void setSmtpUserNameParameter(String newSmtpUserNameParameter) {
		String oldSmtpUserNameParameter = smtpUserNameParameter;
		smtpUserNameParameter = newSmtpUserNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER, oldSmtpUserNameParameter, smtpUserNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSmtp Password Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSmtp Password Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSmtp Password Parameter</em>' containment reference.
	 * @see #setMSmtpPasswordParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_MSmtpPasswordParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='SMTP password' description='Specifies password used to authenticate on (SMTP) server that is responsible for sending the email.'"
	 * @generated
	 */
	public MParameter getMSmtpPasswordParameter() {
		return mSmtpPasswordParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSmtpPasswordParameter(MParameter newMSmtpPasswordParameter, NotificationChain msgs) {
		MParameter oldMSmtpPasswordParameter = mSmtpPasswordParameter;
		mSmtpPasswordParameter = newMSmtpPasswordParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER, oldMSmtpPasswordParameter, newMSmtpPasswordParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpPasswordParameter <em>MSmtp Password Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSmtpPasswordParameter the new value of the '<em>MSmtp Password Parameter</em>' containment reference.
	 * @see #getMSmtpPasswordParameter()
	 * @generated
	 */
	public void setMSmtpPasswordParameter(MParameter newMSmtpPasswordParameter) {
		if (newMSmtpPasswordParameter != mSmtpPasswordParameter) {
			NotificationChain msgs = null;
			if (mSmtpPasswordParameter != null)
				msgs = ((InternalEObject)mSmtpPasswordParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER, null, msgs);
			if (newMSmtpPasswordParameter != null) {				
				newMSmtpPasswordParameter.setDefaultDescription("Specifies password used to authenticate on (SMTP) server that is responsible for sending the email.");
				newMSmtpPasswordParameter.setDefaultName("SMTP password");
				newMSmtpPasswordParameter.setValueType(Type.getTypeForName("Password"));
				newMSmtpPasswordParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER));
				newMSmtpPasswordParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSmtpPasswordParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSmtpPasswordParameter != null) {
				if(newMSmtpPasswordParameter != null)
					newMSmtpPasswordParameter.eAdapters().addAll(mSmtpPasswordParameter.eAdapters());			
			
				mSmtpPasswordParameter.eAdapters().clear();
			}
			msgs = basicSetMSmtpPasswordParameter(newMSmtpPasswordParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER, newMSmtpPasswordParameter, newMSmtpPasswordParameter));
	}

	/**
	 * Returns the value of the '<em><b>Smtp Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smtp Password Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smtp Password Parameter</em>' attribute.
	 * @see #setSmtpPasswordParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep_SmtpPasswordParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MPassword" required="true"
	 * @generated
	 */
	public String getSmtpPasswordParameter() {
		return smtpPasswordParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpPasswordParameter <em>Smtp Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSmtpPasswordParameter the new value of the '<em>Smtp Password Parameter</em>' attribute.
	 * @see #getSmtpPasswordParameter()
	 * @generated
	 */
	public void setSmtpPasswordParameter(String newSmtpPasswordParameter) {
		String oldSmtpPasswordParameter = smtpPasswordParameter;
		smtpPasswordParameter = newSmtpPasswordParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER, oldSmtpPasswordParameter, smtpPasswordParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return basicSetMRecordingUsersNameParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
				return basicSetMCommentParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
				return basicSetMLogFileParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
				return basicSetMDataFileParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
				return basicSetMSubjectParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
				return basicSetMSendersEmailAddressParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				return basicSetMReceipientsEmailAddressParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
				return basicSetMSmtpServerParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
				return basicSetMSmtpUserNameParameter(null, msgs);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
				return basicSetMSmtpPasswordParameter(null, msgs);
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
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return getMRecordingUsersNameParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getRecordingUsersNameParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
				return getMCommentParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER:
				return getCommentParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
				return getMLogFileParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER:
				return getLogFileParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
				return getMDataFileParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER:
				return getDataFileParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
				return getMSubjectParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER:
				return getSubjectParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
				return getMSendersEmailAddressParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER:
				return getSendersEmailAddressParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES:
				return getSendersEmailAddressParameterHistoricValues();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				return getMReceipientsEmailAddressParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				return getReceipientsEmailAddressParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
				return getMSmtpServerParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER:
				return getSmtpServerParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
				return getMSmtpUserNameParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER:
				return getSmtpUserNameParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
				return getMSmtpPasswordParameter();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER:
				return getSmtpPasswordParameter();
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
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
				setMRecordingUsersNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER:
				setRecordingUsersNameParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
				setMCommentParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER:
				setCommentParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
				setMLogFileParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER:
				setLogFileParameter((File)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
				setMDataFileParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER:
				setDataFileParameter((File)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
				setMSubjectParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER:
				setSubjectParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
				setMSendersEmailAddressParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER:
				setSendersEmailAddressParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES:
				getSendersEmailAddressParameterHistoricValues().clear();
				getSendersEmailAddressParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				setMReceipientsEmailAddressParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				setReceipientsEmailAddressParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
				setMSmtpServerParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER:
				setSmtpServerParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
				setMSmtpUserNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER:
				setSmtpUserNameParameter((String)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
				setMSmtpPasswordParameter((MParameter)newValue);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER:
				setSmtpPasswordParameter((String)newValue);
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
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
				setMRecordingUsersNameParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER:
				setRecordingUsersNameParameter(getDefaultRecordingUsersNameParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
				setMCommentParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER:
				setCommentParameter(getDefaultCommentParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
				setMLogFileParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER:
				setLogFileParameter(getDefaultLogFileParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
				setMDataFileParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER:
				setDataFileParameter(getDefaultDataFileParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
				setMSubjectParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER:
				setSubjectParameter(getDefaultSubjectParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
				setMSendersEmailAddressParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER:
				setSendersEmailAddressParameter(getDefaultSendersEmailAddressParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES:
				getSendersEmailAddressParameterHistoricValues().clear();
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				setMReceipientsEmailAddressParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				setReceipientsEmailAddressParameter(getDefaultReceipientsEmailAddressParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
				setMSmtpServerParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER:
				setSmtpServerParameter(getDefaultSmtpServerParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
				setMSmtpUserNameParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER:
				setSmtpUserNameParameter(getDefaultSmtpUserNameParameter());
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
				setMSmtpPasswordParameter((MParameter)null);
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER:
				setSmtpPasswordParameter(getDefaultSmtpPasswordParameter());
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
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return mRecordingUsersNameParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getDefaultRecordingUsersNameParameter() == null ? recordingUsersNameParameter != null : !getDefaultRecordingUsersNameParameter().equals(recordingUsersNameParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
				return mCommentParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER:
				return getDefaultCommentParameter() == null ? commentParameter != null : !getDefaultCommentParameter().equals(commentParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
				return mLogFileParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER:
				return getDefaultLogFileParameter() == null ? logFileParameter != null : !getDefaultLogFileParameter().equals(logFileParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
				return mDataFileParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER:
				return getDefaultDataFileParameter() == null ? dataFileParameter != null : !getDefaultDataFileParameter().equals(dataFileParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
				return mSubjectParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER:
				return getDefaultSubjectParameter() == null ? subjectParameter != null : !getDefaultSubjectParameter().equals(subjectParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
				return mSendersEmailAddressParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER:
				return getDefaultSendersEmailAddressParameter() == null ? sendersEmailAddressParameter != null : !getDefaultSendersEmailAddressParameter().equals(sendersEmailAddressParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES:
				return sendersEmailAddressParameterHistoricValues != null && !sendersEmailAddressParameterHistoricValues.isEmpty();
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				return mReceipientsEmailAddressParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
				return getDefaultReceipientsEmailAddressParameter() == null ? receipientsEmailAddressParameter != null : !getDefaultReceipientsEmailAddressParameter().equals(receipientsEmailAddressParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
				return mSmtpServerParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER:
				return getDefaultSmtpServerParameter() == null ? smtpServerParameter != null : !getDefaultSmtpServerParameter().equals(smtpServerParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
				return mSmtpUserNameParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER:
				return getDefaultSmtpUserNameParameter() == null ? smtpUserNameParameter != null : !getDefaultSmtpUserNameParameter().equals(smtpUserNameParameter);
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
				return mSmtpPasswordParameter != null;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER:
				return getDefaultSmtpPasswordParameter() == null ? smtpPasswordParameter != null : !getDefaultSmtpPasswordParameter().equals(smtpPasswordParameter);
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
		result.append(" (recordingUsersNameParameter: ");
		result.append(recordingUsersNameParameter);
		result.append(", commentParameter: ");
		result.append(commentParameter);
		result.append(", logFileParameter: ");
		result.append(logFileParameter);
		result.append(", dataFileParameter: ");
		result.append(dataFileParameter);
		result.append(", subjectParameter: ");
		result.append(subjectParameter);
		result.append(", sendersEmailAddressParameter: ");
		result.append(sendersEmailAddressParameter);
		result.append(", sendersEmailAddressParameterHistoricValues: ");
		result.append(sendersEmailAddressParameterHistoricValues);
		result.append(", receipientsEmailAddressParameter: ");
		result.append(receipientsEmailAddressParameter);
		result.append(", smtpServerParameter: ");
		result.append(smtpServerParameter);
		result.append(", smtpUserNameParameter: ");
		result.append(smtpUserNameParameter);
		result.append(", smtpPasswordParameter: ");
		result.append(smtpPasswordParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
        String recordingUser = getMRecordingUsersNameParameter().getValueForUI();
        String comment = getMCommentParameter().getValueForUI();
        String subject = getMSubjectParameter().getValueForUI();
        File logFile = getLogFileParameter();        
        File dataFile = getDataFileParameter();        

        String host = getSmtpServerParameter();
        String from = getSendersEmailAddressParameter();
        String to = getReceipientsEmailAddressParameter();

        // Gets the system properties.
        Properties props = System.getProperties();

        // Sets mail server.
        props.put("mail.smtp.host", host);

        // Gets the session.
        Session session = Session.getDefaultInstance(props, new MailAccountAuthenticator());

        // Defines the message.
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, 
          new InternetAddress(to));
        message.setSubject(subject);
        
        // Finds the DMS memory handler to determine whether a serious event has been logged. 
        Handler[] handlers = Logger.getLogger().getHandlers();
        for(int index = 0; index < handlers.length; ++index) {
            Handler currentHandler = handlers[index];
            if(currentHandler instanceof MemoryHandler && ((MemoryHandler) currentHandler).isSevere()) {
                message.addHeader("X-Priority", "1");
                message.addHeader("X-MSMail-Priority", "High");
                message.addHeader("Importance", "High");                
            }
        }
        
        // Creates the message part and sets the message text.
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(recordingUser+":\n\n"+comment);
        
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Adds the log data as an attachment to the message.
        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(logFile);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(logFile.getName());
        multipart.addBodyPart(messageBodyPart);

        // Makes sure that the application data is saved before it is sent.
        MApplication mApplication = (MApplication) getMApplication();
        mApplication.saveToXML();
        
        // Compresses the application data.
        File zipFile = new File(dataFile.getParent()+"/"+"Data for emailing.zip");
        FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
        ZipOutputStream zipFileOutputStream = new ZipOutputStream(fileOutputStream);
        FileInputStream dataFileInputStream = new FileInputStream(dataFile);
        zipFileOutputStream.putNextEntry(new ZipEntry(dataFile.getCanonicalPath()));
        
        // Writes the entry.
        int length;
        byte[] buffer = new byte[1024*16];
        while ((length = dataFileInputStream.read(buffer)) > 0) {
            zipFileOutputStream.write(buffer, 0, length);
        }

        // Completes the entry.
        zipFileOutputStream.closeEntry();
        dataFileInputStream.close();
        
        zipFileOutputStream.close();
        
        // Adds the appliation data as an attachment to the message.
        messageBodyPart = new MimeBodyPart();
        source = new FileDataSource(zipFile);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName("Data.zip");
        multipart.addBodyPart(messageBodyPart);
        
        // Sets the content.
        message.setContent(multipart);

        // Sends the  message.
        try {
            Transport.send(message);
        }
        catch(MessagingException exception) {
            throw new DesktopException("The application could not connect to the mail server.", "Please make sure that the computer is connected to the internet and that the mail server is running.", DesktopException.ERROR_SEVERITY, exception);
        }
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {
		if(getMSubjectParameter().equals(mOwnerValue)) {
            String date = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
            String type = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
            
            if(date != null && type != null)
            	return "DMS log of "+type+" on "+date;
            else if(date != null && type == null)
            	return "DMS log of WWX on "+date;
            else if(date == null && type != null)
            	return "DMS log of "+type;
            
            return null;
         }
		else
			return super.convertMInputValues(mOwnerValue);	
	}

    /**
     * Defines the user name and password for the SMTP mail account authentication.
     */
    class MailAccountAuthenticator extends Authenticator {
        /**
         * @see javax.mail.Authenticator#getPasswordAuthentication()
         */
        protected PasswordAuthentication getPasswordAuthentication() {
            return(new PasswordAuthentication(getSmtpUserNameParameter(), getSmtpPasswordParameter()));
        }
    }
} // MEmailEventLogStep