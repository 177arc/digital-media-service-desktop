/**
 * <copyright>
 * </copyright>
 *
 * $Id: MFtpStep.java,v 1.1 2007/05/12 10:56:31 marc Exp $
 */
package org.onceforall.dms.desktop.logic;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFtp Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpServerUrlParameter <em>MFtp Server Url Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpServerUrlParameter <em>Ftp Server Url Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserNameParameter <em>MFtp User Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserNameParameter <em>Ftp User Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserPasswordParameter <em>MFtp User Password Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserPasswordParameter <em>Ftp User Password Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore actionName='Mark as completed' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public abstract class MFtpStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MFtpStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MFtpStep.TYPE_NAME, new ReferenceType("Reference to "+MFtpStep.TYPE_NAME, "Specifies a reference to a "+MFtpStep.TYPE_NAME_FOR_UI, MFtpStep.class));
	}
	/**
	 * The cached value of the '{@link #getMFtpServerUrlParameter() <em>MFtp Server Url Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mFtpServerUrlParameter = null;

	/**
	 * The default value of the '{@link #getFtpServerUrlParameter() <em>Ftp Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected static final URL FTP_SERVER_URL_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getFtpServerUrlParameter() <em>Ftp Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpServerUrlParameter() <em>Ftp Server Url Parameter</em>}' attribute.
	 * @see #getFtpServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultFtpServerUrlParameter() {
		return FTP_SERVER_URL_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpServerUrlParameter() <em>Ftp Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected URL ftpServerUrlParameter = FTP_SERVER_URL_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMFtpUserNameParameter() <em>MFtp User Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mFtpUserNameParameter = null;

	/**
	 * The default value of the '{@link #getFtpUserNameParameter() <em>Ftp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String FTP_USER_NAME_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getFtpUserNameParameter() <em>Ftp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpUserNameParameter() <em>Ftp User Name Parameter</em>}' attribute.
	 * @see #getFtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFtpUserNameParameter() {
		return FTP_USER_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpUserNameParameter() <em>Ftp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserNameParameter()
	 * @generated
	 * @ordered
	 */
	protected String ftpUserNameParameter = FTP_USER_NAME_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMFtpUserPasswordParameter() <em>MFtp User Password Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFtpUserPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mFtpUserPasswordParameter = null;

	/**
	 * The default value of the '{@link #getFtpUserPasswordParameter() <em>Ftp User Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String FTP_USER_PASSWORD_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getFtpUserPasswordParameter() <em>Ftp User Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFtpUserPasswordParameter() <em>Ftp User Password Parameter</em>}' attribute.
	 * @see #getFtpUserPasswordParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFtpUserPasswordParameter() {
		return FTP_USER_PASSWORD_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFtpUserPasswordParameter() <em>Ftp User Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtpUserPasswordParameter()
	 * @generated
	 * @ordered
	 */
	protected String ftpUserPasswordParameter = FTP_USER_PASSWORD_PARAMETER_EDEFAULT;
	
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
	 * Get the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultActionName() {
		return "Mark as completed";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFtpStep() {
		super();
		
		firstMFtpStepConstructorHook();
				
		interruptable = false;
		stoppable = false;
		terminatable = false;
		actionName = "Mark as completed";
					 
		setMFtpServerUrlParameter(new MParameter(false, "FTP server URL", "Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'", null));			 
		setMFtpUserNameParameter(new MParameter(false, "FTP user name", "Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.", null));			 
		setMFtpUserPasswordParameter(new MParameter(false, "FTP user password", "Specifies the user password for accessing the FTP server.", null));

		lastMFtpStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMFtpStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMFtpStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MFTP_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp Server Url Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp Server Url Parameter</em>' containment reference.
	 * @see #setMFtpServerUrlParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_MFtpServerUrlParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP server URL' description='Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'' readOnly='false'"
	 * @generated
	 */
	public MParameter getMFtpServerUrlParameter() {
		return mFtpServerUrlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpServerUrlParameter(MParameter newMFtpServerUrlParameter, NotificationChain msgs) {
		MParameter oldMFtpServerUrlParameter = mFtpServerUrlParameter;
		mFtpServerUrlParameter = newMFtpServerUrlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER, oldMFtpServerUrlParameter, newMFtpServerUrlParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpServerUrlParameter <em>MFtp Server Url Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpServerUrlParameter the new value of the '<em>MFtp Server Url Parameter</em>' containment reference.
	 * @see #getMFtpServerUrlParameter()
	 * @generated
	 */
	public void setMFtpServerUrlParameter(MParameter newMFtpServerUrlParameter) {
		if (newMFtpServerUrlParameter != mFtpServerUrlParameter) {
			NotificationChain msgs = null;
			if (mFtpServerUrlParameter != null)
				msgs = ((InternalEObject)mFtpServerUrlParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER, null, msgs);
			if (newMFtpServerUrlParameter != null) {				
				newMFtpServerUrlParameter.setDefaultName("FTP server URL");
				newMFtpServerUrlParameter.setDefaultDescription("Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'");
				newMFtpServerUrlParameter.setValueType(Type.getTypeForName("URL"));
				newMFtpServerUrlParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER));
				newMFtpServerUrlParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFtpServerUrlParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpServerUrlParameter != null) {
				if(newMFtpServerUrlParameter != null)
					newMFtpServerUrlParameter.eAdapters().addAll(mFtpServerUrlParameter.eAdapters());			
			
				mFtpServerUrlParameter.eAdapters().clear();
			}
			msgs = basicSetMFtpServerUrlParameter(newMFtpServerUrlParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER, newMFtpServerUrlParameter, newMFtpServerUrlParameter));
	}

	/**
	 * Returns the value of the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp Server Url Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp Server Url Parameter</em>' attribute.
	 * @see #setFtpServerUrlParameter(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_FtpServerUrlParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl" required="true"
	 * @generated
	 */
	public URL getFtpServerUrlParameter() {
		return ftpServerUrlParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpServerUrlParameter <em>Ftp Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpServerUrlParameter the new value of the '<em>Ftp Server Url Parameter</em>' attribute.
	 * @see #getFtpServerUrlParameter()
	 * @generated
	 */
	public void setFtpServerUrlParameter(URL newFtpServerUrlParameter) {
		URL oldFtpServerUrlParameter = ftpServerUrlParameter;
		ftpServerUrlParameter = newFtpServerUrlParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER, oldFtpServerUrlParameter, ftpServerUrlParameter));
	}

	/**
	 * Returns the value of the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp User Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp User Name Parameter</em>' containment reference.
	 * @see #setMFtpUserNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_MFtpUserNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP user name' description='Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.'"
	 * @generated
	 */
	public MParameter getMFtpUserNameParameter() {
		return mFtpUserNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpUserNameParameter(MParameter newMFtpUserNameParameter, NotificationChain msgs) {
		MParameter oldMFtpUserNameParameter = mFtpUserNameParameter;
		mFtpUserNameParameter = newMFtpUserNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER, oldMFtpUserNameParameter, newMFtpUserNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserNameParameter <em>MFtp User Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpUserNameParameter the new value of the '<em>MFtp User Name Parameter</em>' containment reference.
	 * @see #getMFtpUserNameParameter()
	 * @generated
	 */
	public void setMFtpUserNameParameter(MParameter newMFtpUserNameParameter) {
		if (newMFtpUserNameParameter != mFtpUserNameParameter) {
			NotificationChain msgs = null;
			if (mFtpUserNameParameter != null)
				msgs = ((InternalEObject)mFtpUserNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER, null, msgs);
			if (newMFtpUserNameParameter != null) {				
				newMFtpUserNameParameter.setDefaultDescription("Specifies the user name for accessing the FTP server, e.g. \'ccb001\'.");
				newMFtpUserNameParameter.setDefaultName("FTP user name");
				newMFtpUserNameParameter.setValueType(Type.getTypeForName("Text"));
				newMFtpUserNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER));
				newMFtpUserNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFtpUserNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpUserNameParameter != null) {
				if(newMFtpUserNameParameter != null)
					newMFtpUserNameParameter.eAdapters().addAll(mFtpUserNameParameter.eAdapters());			
			
				mFtpUserNameParameter.eAdapters().clear();
			}
			msgs = basicSetMFtpUserNameParameter(newMFtpUserNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER, newMFtpUserNameParameter, newMFtpUserNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp User Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp User Name Parameter</em>' attribute.
	 * @see #setFtpUserNameParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_FtpUserNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getFtpUserNameParameter() {
		return ftpUserNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserNameParameter <em>Ftp User Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpUserNameParameter the new value of the '<em>Ftp User Name Parameter</em>' attribute.
	 * @see #getFtpUserNameParameter()
	 * @generated
	 */
	public void setFtpUserNameParameter(String newFtpUserNameParameter) {
		String oldFtpUserNameParameter = ftpUserNameParameter;
		ftpUserNameParameter = newFtpUserNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER, oldFtpUserNameParameter, ftpUserNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFtp User Password Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFtp User Password Parameter</em>' containment reference.
	 * @see #setMFtpUserPasswordParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_MFtpUserPasswordParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='FTP user password' description='Specifies the user password for accessing the FTP server.'"
	 * @generated
	 */
	public MParameter getMFtpUserPasswordParameter() {
		return mFtpUserPasswordParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFtpUserPasswordParameter(MParameter newMFtpUserPasswordParameter, NotificationChain msgs) {
		MParameter oldMFtpUserPasswordParameter = mFtpUserPasswordParameter;
		mFtpUserPasswordParameter = newMFtpUserPasswordParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER, oldMFtpUserPasswordParameter, newMFtpUserPasswordParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserPasswordParameter <em>MFtp User Password Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFtpUserPasswordParameter the new value of the '<em>MFtp User Password Parameter</em>' containment reference.
	 * @see #getMFtpUserPasswordParameter()
	 * @generated
	 */
	public void setMFtpUserPasswordParameter(MParameter newMFtpUserPasswordParameter) {
		if (newMFtpUserPasswordParameter != mFtpUserPasswordParameter) {
			NotificationChain msgs = null;
			if (mFtpUserPasswordParameter != null)
				msgs = ((InternalEObject)mFtpUserPasswordParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER, null, msgs);
			if (newMFtpUserPasswordParameter != null) {				
				newMFtpUserPasswordParameter.setDefaultDescription("Specifies the user password for accessing the FTP server.");
				newMFtpUserPasswordParameter.setDefaultName("FTP user password");
				newMFtpUserPasswordParameter.setValueType(Type.getTypeForName("Password"));
				newMFtpUserPasswordParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER));
				newMFtpUserPasswordParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFtpUserPasswordParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFtpUserPasswordParameter != null) {
				if(newMFtpUserPasswordParameter != null)
					newMFtpUserPasswordParameter.eAdapters().addAll(mFtpUserPasswordParameter.eAdapters());			
			
				mFtpUserPasswordParameter.eAdapters().clear();
			}
			msgs = basicSetMFtpUserPasswordParameter(newMFtpUserPasswordParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER, newMFtpUserPasswordParameter, newMFtpUserPasswordParameter));
	}

	/**
	 * Returns the value of the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftp User Password Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp User Password Parameter</em>' attribute.
	 * @see #setFtpUserPasswordParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep_FtpUserPasswordParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MPassword"
	 * @generated
	 */
	public String getFtpUserPasswordParameter() {
		return ftpUserPasswordParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserPasswordParameter <em>Ftp User Password Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFtpUserPasswordParameter the new value of the '<em>Ftp User Password Parameter</em>' attribute.
	 * @see #getFtpUserPasswordParameter()
	 * @generated
	 */
	public void setFtpUserPasswordParameter(String newFtpUserPasswordParameter) {
		String oldFtpUserPasswordParameter = ftpUserPasswordParameter;
		ftpUserPasswordParameter = newFtpUserPasswordParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER, oldFtpUserPasswordParameter, ftpUserPasswordParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER:
				return basicSetMFtpServerUrlParameter(null, msgs);
			case LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER:
				return basicSetMFtpUserNameParameter(null, msgs);
			case LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER:
				return basicSetMFtpUserPasswordParameter(null, msgs);
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
			case LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER:
				return getMFtpServerUrlParameter();
			case LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER:
				return getFtpServerUrlParameter();
			case LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER:
				return getMFtpUserNameParameter();
			case LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER:
				return getFtpUserNameParameter();
			case LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER:
				return getMFtpUserPasswordParameter();
			case LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER:
				return getFtpUserPasswordParameter();
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
			case LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER:    
				setMFtpServerUrlParameter((MParameter)newValue);
				return;
			case LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER:    
				setFtpServerUrlParameter((URL)newValue);
				return;
			case LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER:    
				setMFtpUserNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER:    
				setFtpUserNameParameter((String)newValue);
				return;
			case LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER:    
				setMFtpUserPasswordParameter((MParameter)newValue);
				return;
			case LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER:
				// Makes sure that that plain text password will be encrypted if they are not. TODO: Remove this code after migration. Then all passwords should encrypted anyway.
				if(newValue != null && (((String) newValue).startsWith("esio") || ((String) newValue).startsWith("site")))
						newValue = Type.PASSWORD_TYPE.encryptPassword((String) newValue);
				    
				setFtpUserPasswordParameter((String)newValue);
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
			case LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER:
				setMFtpServerUrlParameter((MParameter)null);
				return;
			case LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER:
				setFtpServerUrlParameter(getDefaultFtpServerUrlParameter());
				return;
			case LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER:
				setMFtpUserNameParameter((MParameter)null);
				return;
			case LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER:
				setFtpUserNameParameter(getDefaultFtpUserNameParameter());
				return;
			case LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER:
				setMFtpUserPasswordParameter((MParameter)null);
				return;
			case LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER:
				setFtpUserPasswordParameter(getDefaultFtpUserPasswordParameter());
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
			case LogicPackage.MFTP_STEP__MFTP_SERVER_URL_PARAMETER:
				return mFtpServerUrlParameter != null;
			case LogicPackage.MFTP_STEP__FTP_SERVER_URL_PARAMETER:
				return getDefaultFtpServerUrlParameter() == null ? ftpServerUrlParameter != null : !getDefaultFtpServerUrlParameter().equals(ftpServerUrlParameter);
			case LogicPackage.MFTP_STEP__MFTP_USER_NAME_PARAMETER:
				return mFtpUserNameParameter != null;
			case LogicPackage.MFTP_STEP__FTP_USER_NAME_PARAMETER:
				return getDefaultFtpUserNameParameter() == null ? ftpUserNameParameter != null : !getDefaultFtpUserNameParameter().equals(ftpUserNameParameter);
			case LogicPackage.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER:
				return mFtpUserPasswordParameter != null;
			case LogicPackage.MFTP_STEP__FTP_USER_PASSWORD_PARAMETER:
				return getDefaultFtpUserPasswordParameter() == null ? ftpUserPasswordParameter != null : !getDefaultFtpUserPasswordParameter().equals(ftpUserPasswordParameter);
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
		result.append(" (ftpServerUrlParameter: ");
		result.append(ftpServerUrlParameter);
		result.append(", ftpUserNameParameter: ");
		result.append(ftpUserNameParameter);
		result.append(", ftpUserPasswordParameter: ");
		result.append(ftpUserPasswordParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
        FTPClient ftpClient = new FTPClient();
        URL ftpServerUrl = getFtpServerUrlParameter();
        try {
        	ftpClient.setDefaultTimeout(20000);
        	//ftpClient.setDataTimeout(20000);
        	ftpClient.setReaderThread(false);
            ftpClient.connect(ftpServerUrl.getHost());
            try {
	            if(!ftpClient.login(getFtpUserNameParameter(), Type.PASSWORD_TYPE.decryptPassword(getFtpUserPasswordParameter())))
	            	throw new DesktopException("The application could not authenticate to the FTP server '"+ftpServerUrl+"' with user name '"+getFtpUserNameParameter()+"' because the user name and/or the password are incorrect.", "Please check the user name and the password. Then try again.", DesktopException.ERROR_SEVERITY, null);
	           
	            ftpClient.setFileType(FTPClient.IMAGE_FILE_TYPE); // Sets the transfer mode to binary.
	            
	            executeFtpOperationsHook(ftpClient);
            }
	        finally {
	            ftpClient.disconnect();                    
	        }
        } 
        catch(SocketTimeoutException exception) {
            throw new DesktopException("The application could not connect to the FTP server '"+ftpServerUrl.getHost()+"'.", "Please make sure that the computer is connected to the internet and that the FTP server is not blocking your IP address.", DesktopException.ERROR_SEVERITY, exception);
        }
        catch(ConnectException exception) {
            throw new DesktopException("The application could not connect to the FTP server '"+ftpServerUrl.getHost()+"'.", "Please make sure that the computer is connected to the internet and that the FTP server is running.", DesktopException.ERROR_SEVERITY, exception);
        }
        catch(UnknownHostException exception) {
            throw new DesktopException("The application could not connect to the FTP server '"+ftpServerUrl.getHost()+"'.", "Please make sure that the computer is connected to the internet.", DesktopException.ERROR_SEVERITY, exception);
        }
	}
    
    /**
     * Changes the working directory through the given FTP client. If this is not successful,
     * it throws an {@link org.onceforall.dms.desktop.exception.DesktopException}.
     * 
     * @param ftpClient Specifies the FTP client.
     * @param relativeFtpPath Specifies the relative FTP path to change to.
     * @throws IOException Thrown if a communication error occurs.
     * @throws DesktopException Thrown if it is not possible to change to the given relative path.
     */
    protected void changeFtpWorkingDirectory(FTPClient ftpClient, String relativeFtpPath) throws IOException, DesktopException {
        if(!ftpClient.changeWorkingDirectory(relativeFtpPath))
        	if(!ftpClient.makeDirectory(relativeFtpPath))
        		throw new DesktopException("The application could not change the working directory to '"+relativeFtpPath+"' on the FTP server.", "Please check the parameters. If the parameters are correct, check that the directory exists on the server and the sufficient access rights have been granted.", DesktopException.ERROR_SEVERITY, null);	            	   	
    }
    
    /**
     * Provides hook for performing FTP operations on the FTP server. Concrete
     * subclasses must override this method to implement these operations. These subclass
     * can assume that FTP client is already connected to the FTP server.
     * 
     * @param ftpClient Specifie the FTP client that provides access to the FTP server.
     * @throws Throwable Thrown if an exception occurs during the execution.
     */
    protected abstract void executeFtpOperationsHook(FTPClient ftpClient) throws Throwable;

} // MFtpStep