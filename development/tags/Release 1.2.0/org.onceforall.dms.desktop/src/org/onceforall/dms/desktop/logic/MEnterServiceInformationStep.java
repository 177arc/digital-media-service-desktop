/*
 * Revision History:
 * $Log: MEnterServiceInformationStep.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
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

import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEnter Service Information Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateParameter <em>MService Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateParameter <em>Service Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeParameter <em>MService Type Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameter <em>Service Type Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameterHistoricValues <em>Service Type Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingParameter <em>MReading Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingParameter <em>Reading Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameterHistoricValues <em>Speakers Name Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameterHistoricValues <em>Recording Users Name Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateResult <em>MService Date Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateResult <em>Service Date Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeResult <em>MService Type Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeResult <em>Service Type Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingResult <em>MReading Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingResult <em>Reading Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Enter service information' description='Please enter the required information about the service and then select \'Mark as completed\'.' iconFilePath='Image Files/Enter information step.gif' actionIconFilePath='Image Files/Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MEnterServiceInformationStep extends MEnterInformationStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MEnterServiceInformationStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MEnterServiceInformationStep.TYPE_NAME, new ReferenceType("Reference to "+MEnterServiceInformationStep.TYPE_NAME, "Specifies a reference to a "+MEnterServiceInformationStep.TYPE_NAME_FOR_UI, MEnterServiceInformationStep.class));
	}
	/**
	 * The cached value of the '{@link #getMServiceDateParameter() <em>MService Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMServiceDateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mServiceDateParameter = null;

	/**
	 * The default value of the '{@link #getServiceDateParameter() <em>Service Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDateParameter()
	 * @ordered
	 */
	protected static final Date SERVICE_DATE_PARAMETER_EDEFAULT = new Date();

	/**
	 * Get the default value of the '{@link #getServiceDateParameter() <em>Service Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getServiceDateParameter() <em>Service Date Parameter</em>}' attribute.
	 * @see #getServiceDateParameter()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultServiceDateParameter() {
		return SERVICE_DATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getServiceDateParameter() <em>Service Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDateParameter()
	 * @generated
	 * @ordered
	 */
	protected Date serviceDateParameter = SERVICE_DATE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMServiceTypeParameter() <em>MService Type Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMServiceTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mServiceTypeParameter = null;

	/**
	 * The default value of the '{@link #getServiceTypeParameter() <em>Service Type Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getServiceTypeParameter() <em>Service Type Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getServiceTypeParameter() <em>Service Type Parameter</em>}' attribute.
	 * @see #getServiceTypeParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultServiceTypeParameter() {
		return SERVICE_TYPE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getServiceTypeParameter() <em>Service Type Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected String serviceTypeParameter = SERVICE_TYPE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceTypeParameterHistoricValues() <em>Service Type Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList serviceTypeParameterHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMTitleOfTalkParameter() <em>MTitle Of Talk Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTitleOfTalkParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTitleOfTalkParameter = null;

	/**
	 * The default value of the '{@link #getTitleOfTalkParameter() <em>Title Of Talk Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOfTalkParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_OF_TALK_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTitleOfTalkParameter() <em>Title Of Talk Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTitleOfTalkParameter() <em>Title Of Talk Parameter</em>}' attribute.
	 * @see #getTitleOfTalkParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTitleOfTalkParameter() {
		return TITLE_OF_TALK_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTitleOfTalkParameter() <em>Title Of Talk Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOfTalkParameter()
	 * @generated
	 * @ordered
	 */
	protected String titleOfTalkParameter = TITLE_OF_TALK_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMReadingParameter() <em>MReading Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReadingParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mReadingParameter = null;

	/**
	 * The default value of the '{@link #getReadingParameter() <em>Reading Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String READING_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getReadingParameter() <em>Reading Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getReadingParameter() <em>Reading Parameter</em>}' attribute.
	 * @see #getReadingParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultReadingParameter() {
		return READING_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getReadingParameter() <em>Reading Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingParameter()
	 * @generated
	 * @ordered
	 */
	protected String readingParameter = READING_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSpeakersNameParameter() <em>MSpeakers Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpeakersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSpeakersNameParameter = null;

	/**
	 * The default value of the '{@link #getSpeakersNameParameter() <em>Speakers Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEAKERS_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSpeakersNameParameter() <em>Speakers Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSpeakersNameParameter() <em>Speakers Name Parameter</em>}' attribute.
	 * @see #getSpeakersNameParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSpeakersNameParameter() {
		return SPEAKERS_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSpeakersNameParameter() <em>Speakers Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected String speakersNameParameter = SPEAKERS_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeakersNameParameterHistoricValues() <em>Speakers Name Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakersNameParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList speakersNameParameterHistoricValues = null;

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
	 * The cached value of the '{@link #getRecordingUsersNameParameterHistoricValues() <em>Recording Users Name Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingUsersNameParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList recordingUsersNameParameterHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMServiceDateResult() <em>MService Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMServiceDateResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mServiceDateResult = null;

	/**
	 * The default value of the '{@link #getServiceDateResult() <em>Service Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDateResult()
	 * @generated
	 * @ordered
	 */
	protected static final Date SERVICE_DATE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getServiceDateResult() <em>Service Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getServiceDateResult() <em>Service Date Result</em>}' attribute.
	 * @see #getServiceDateResult()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultServiceDateResult() {
		return SERVICE_DATE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getServiceDateResult() <em>Service Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDateResult()
	 * @generated
	 * @ordered
	 */
	protected Date serviceDateResult = SERVICE_DATE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMServiceTypeResult() <em>MService Type Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMServiceTypeResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mServiceTypeResult = null;

	/**
	 * The default value of the '{@link #getServiceTypeResult() <em>Service Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeResult()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getServiceTypeResult() <em>Service Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getServiceTypeResult() <em>Service Type Result</em>}' attribute.
	 * @see #getServiceTypeResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultServiceTypeResult() {
		return SERVICE_TYPE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getServiceTypeResult() <em>Service Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeResult()
	 * @generated
	 * @ordered
	 */
	protected String serviceTypeResult = SERVICE_TYPE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTitleOfTalkResult() <em>MTitle Of Talk Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTitleOfTalkResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mTitleOfTalkResult = null;

	/**
	 * The default value of the '{@link #getTitleOfTalkResult() <em>Title Of Talk Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOfTalkResult()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_OF_TALK_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTitleOfTalkResult() <em>Title Of Talk Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTitleOfTalkResult() <em>Title Of Talk Result</em>}' attribute.
	 * @see #getTitleOfTalkResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTitleOfTalkResult() {
		return TITLE_OF_TALK_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTitleOfTalkResult() <em>Title Of Talk Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOfTalkResult()
	 * @generated
	 * @ordered
	 */
	protected String titleOfTalkResult = TITLE_OF_TALK_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMReadingResult() <em>MReading Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMReadingResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mReadingResult = null;

	/**
	 * The default value of the '{@link #getReadingResult() <em>Reading Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingResult()
	 * @generated
	 * @ordered
	 */
	protected static final String READING_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getReadingResult() <em>Reading Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getReadingResult() <em>Reading Result</em>}' attribute.
	 * @see #getReadingResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultReadingResult() {
		return READING_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getReadingResult() <em>Reading Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingResult()
	 * @generated
	 * @ordered
	 */
	protected String readingResult = READING_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSpeakersNameResult() <em>MSpeakers Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpeakersNameResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mSpeakersNameResult = null;

	/**
	 * The default value of the '{@link #getSpeakersNameResult() <em>Speakers Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakersNameResult()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEAKERS_NAME_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSpeakersNameResult() <em>Speakers Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSpeakersNameResult() <em>Speakers Name Result</em>}' attribute.
	 * @see #getSpeakersNameResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSpeakersNameResult() {
		return SPEAKERS_NAME_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSpeakersNameResult() <em>Speakers Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakersNameResult()
	 * @generated
	 * @ordered
	 */
	protected String speakersNameResult = SPEAKERS_NAME_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingUsersNameResult() <em>MRecording Users Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingUsersNameResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mRecordingUsersNameResult = null;

	/**
	 * The default value of the '{@link #getRecordingUsersNameResult() <em>Recording Users Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingUsersNameResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDING_USERS_NAME_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingUsersNameResult() <em>Recording Users Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingUsersNameResult() <em>Recording Users Name Result</em>}' attribute.
	 * @see #getRecordingUsersNameResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultRecordingUsersNameResult() {
		return RECORDING_USERS_NAME_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingUsersNameResult() <em>Recording Users Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingUsersNameResult()
	 * @generated
	 * @ordered
	 */
	protected String recordingUsersNameResult = RECORDING_USERS_NAME_RESULT_EDEFAULT;

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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Mark as completed.gif");
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
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescription() {
		return "Please enter the required information about the service and then select \'Mark as completed\'.";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Enter information step.gif");
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
		return "Enter service information";
	}

	protected static final String NAME_EDEFAULT = "Enter service information";
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEnterServiceInformationStep() {
		super();
		
		firstMEnterServiceInformationStepConstructorHook();
				
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Mark as completed.gif");
		stoppable = false;
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Enter information step.gif");
		description = "Please enter the required information about the service and then select \'Mark as completed\'.";
		name = "Enter service information";
		interruptable = false;
		terminatable = false;
					 
		setMServiceDateParameter(new MParameter(false, "Service date", "Specifies the date of the service.", null));			 
		setMServiceTypeParameter(new MParameter(false, "Service type", "Specifies the type of the service, e.g. AM service, PM service, Carol service ...", null));			 
		setMTitleOfTalkParameter(new MParameter(false, "Title of talk", "Specifies the title of the talk.", null));			 
		setMReadingParameter(new MParameter(false, "Reading", "Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.", null));			 
		setMSpeakersNameParameter(new MParameter(false, "Speaker\'s name", "Specifies the name of the speaker who will give the talk.", null));			 
		setMRecordingUsersNameParameter(new MParameter(false, "Recording user\'s name", "Specifies the name of the recording user. Please enter your name.", null));			 
		setMServiceDateResult(new MResult(false, "Service date", "Specifies the date of the service.", null));			 
		setMServiceTypeResult(new MResult(false, "Service type", "Specifies the type of the service, e.g. AM service, PM service, Carol service ...", null));			 
		setMTitleOfTalkResult(new MResult(false, "Title of talk", "Specifies the title of the talk.", null));			 
		setMReadingResult(new MResult(false, "Reading", "Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.", null));			 
		setMSpeakersNameResult(new MResult(false, "Speaker\'s name", "Specifies the name of the speaker who will give the talk.", null));			 
		setMRecordingUsersNameResult(new MResult(false, "Recording user\'s name", "Specifies the name of the recording user. Please enter your name.", null));

		lastMEnterServiceInformationStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMEnterServiceInformationStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMEnterServiceInformationStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MService Date Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MService Date Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MService Date Parameter</em>' containment reference.
	 * @see #setMServiceDateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MServiceDateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Service date' description='Specifies the date of the service.'"
	 * @generated
	 */
	public MParameter getMServiceDateParameter() {
		return mServiceDateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMServiceDateParameter(MParameter newMServiceDateParameter, NotificationChain msgs) {
		MParameter oldMServiceDateParameter = mServiceDateParameter;
		mServiceDateParameter = newMServiceDateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER, oldMServiceDateParameter, newMServiceDateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateParameter <em>MService Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMServiceDateParameter the new value of the '<em>MService Date Parameter</em>' containment reference.
	 * @see #getMServiceDateParameter()
	 * @generated
	 */
	public void setMServiceDateParameter(MParameter newMServiceDateParameter) {
		if (newMServiceDateParameter != mServiceDateParameter) {
			NotificationChain msgs = null;
			if (mServiceDateParameter != null)
				msgs = ((InternalEObject)mServiceDateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER, null, msgs);
			if (newMServiceDateParameter != null) {				
				newMServiceDateParameter.setDefaultDescription("Specifies the date of the service.");
				newMServiceDateParameter.setDefaultName("Service date");
				newMServiceDateParameter.setValueType(Type.getTypeForName("Date"));
				newMServiceDateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER));
				newMServiceDateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMServiceDateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mServiceDateParameter != null) {
				if(newMServiceDateParameter != null)
					newMServiceDateParameter.eAdapters().addAll(mServiceDateParameter.eAdapters());			
			
				mServiceDateParameter.eAdapters().clear();
			}
			msgs = basicSetMServiceDateParameter(newMServiceDateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER, newMServiceDateParameter, newMServiceDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Service Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Date Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Date Parameter</em>' attribute.
	 * @see #setServiceDateParameter(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ServiceDateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDate" required="true" transient="true"
	 * @generated
	 */
	public Date getServiceDateParameter() {
		return serviceDateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateParameter <em>Service Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newServiceDateParameter the new value of the '<em>Service Date Parameter</em>' attribute.
	 * @see #getServiceDateParameter()
	 * @generated
	 */
	public void setServiceDateParameter(Date newServiceDateParameter) {
		Date oldServiceDateParameter = serviceDateParameter;
		serviceDateParameter = newServiceDateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER, oldServiceDateParameter, serviceDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>MService Type Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MService Type Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MService Type Parameter</em>' containment reference.
	 * @see #setMServiceTypeParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MServiceTypeParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Service type' description='Specifies the type of the service, e.g. AM service, PM service, Carol service ...'"
	 * @generated
	 */
	public MParameter getMServiceTypeParameter() {
		return mServiceTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMServiceTypeParameter(MParameter newMServiceTypeParameter, NotificationChain msgs) {
		MParameter oldMServiceTypeParameter = mServiceTypeParameter;
		mServiceTypeParameter = newMServiceTypeParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER, oldMServiceTypeParameter, newMServiceTypeParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeParameter <em>MService Type Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMServiceTypeParameter the new value of the '<em>MService Type Parameter</em>' containment reference.
	 * @see #getMServiceTypeParameter()
	 * @generated
	 */
	public void setMServiceTypeParameter(MParameter newMServiceTypeParameter) {
		if (newMServiceTypeParameter != mServiceTypeParameter) {
			NotificationChain msgs = null;
			if (mServiceTypeParameter != null)
				msgs = ((InternalEObject)mServiceTypeParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER, null, msgs);
			if (newMServiceTypeParameter != null) {				
				newMServiceTypeParameter.setDefaultDescription("Specifies the type of the service, e.g. AM service, PM service, Carol service ...");
				newMServiceTypeParameter.setDefaultName("Service type");
				newMServiceTypeParameter.setValueType(Type.getTypeForName("Text"));
				newMServiceTypeParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER));
				newMServiceTypeParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMServiceTypeParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mServiceTypeParameter != null) {
				if(newMServiceTypeParameter != null)
					newMServiceTypeParameter.eAdapters().addAll(mServiceTypeParameter.eAdapters());			
			
				mServiceTypeParameter.eAdapters().clear();
			}
			msgs = basicSetMServiceTypeParameter(newMServiceTypeParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER, newMServiceTypeParameter, newMServiceTypeParameter));
	}

	/**
	 * Returns the value of the '<em><b>Service Type Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type Parameter</em>' attribute.
	 * @see #setServiceTypeParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ServiceTypeParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getServiceTypeParameter() {
		return serviceTypeParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameter <em>Service Type Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newServiceTypeParameter the new value of the '<em>Service Type Parameter</em>' attribute.
	 * @see #getServiceTypeParameter()
	 * @generated
	 */
	public void setServiceTypeParameter(String newServiceTypeParameter) {
		String oldServiceTypeParameter = serviceTypeParameter;
		serviceTypeParameter = newServiceTypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER, oldServiceTypeParameter, serviceTypeParameter));
	}

	/**
	 * Returns the value of the '<em><b>Service Type Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ServiceTypeParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="5"
	 * @generated
	 */
	public EList getServiceTypeParameterHistoricValues() {
		if (serviceTypeParameterHistoricValues == null) {
			serviceTypeParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES);
		}
		return serviceTypeParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTitle Of Talk Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTitle Of Talk Parameter</em>' containment reference.
	 * @see #setMTitleOfTalkParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MTitleOfTalkParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Title of talk' description='Specifies the title of the talk.'"
	 * @generated
	 */
	public MParameter getMTitleOfTalkParameter() {
		return mTitleOfTalkParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTitleOfTalkParameter(MParameter newMTitleOfTalkParameter, NotificationChain msgs) {
		MParameter oldMTitleOfTalkParameter = mTitleOfTalkParameter;
		mTitleOfTalkParameter = newMTitleOfTalkParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, oldMTitleOfTalkParameter, newMTitleOfTalkParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMTitleOfTalkParameter the new value of the '<em>MTitle Of Talk Parameter</em>' containment reference.
	 * @see #getMTitleOfTalkParameter()
	 * @generated
	 */
	public void setMTitleOfTalkParameter(MParameter newMTitleOfTalkParameter) {
		if (newMTitleOfTalkParameter != mTitleOfTalkParameter) {
			NotificationChain msgs = null;
			if (mTitleOfTalkParameter != null)
				msgs = ((InternalEObject)mTitleOfTalkParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, null, msgs);
			if (newMTitleOfTalkParameter != null) {				
				newMTitleOfTalkParameter.setDefaultDescription("Specifies the title of the talk.");
				newMTitleOfTalkParameter.setDefaultName("Title of talk");
				newMTitleOfTalkParameter.setValueType(Type.getTypeForName("Text"));
				newMTitleOfTalkParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER));
				newMTitleOfTalkParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleOfTalkParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTitleOfTalkParameter != null) {
				if(newMTitleOfTalkParameter != null)
					newMTitleOfTalkParameter.eAdapters().addAll(mTitleOfTalkParameter.eAdapters());			
			
				mTitleOfTalkParameter.eAdapters().clear();
			}
			msgs = basicSetMTitleOfTalkParameter(newMTitleOfTalkParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, newMTitleOfTalkParameter, newMTitleOfTalkParameter));
	}

	/**
	 * Returns the value of the '<em><b>Title Of Talk Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Of Talk Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Of Talk Parameter</em>' attribute.
	 * @see #setTitleOfTalkParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_TitleOfTalkParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getTitleOfTalkParameter() {
		return titleOfTalkParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTitleOfTalkParameter the new value of the '<em>Title Of Talk Parameter</em>' attribute.
	 * @see #getTitleOfTalkParameter()
	 * @generated
	 */
	public void setTitleOfTalkParameter(String newTitleOfTalkParameter) {
		String oldTitleOfTalkParameter = titleOfTalkParameter;
		titleOfTalkParameter = newTitleOfTalkParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER, oldTitleOfTalkParameter, titleOfTalkParameter));
	}

	/**
	 * Returns the value of the '<em><b>MReading Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MReading Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReading Parameter</em>' containment reference.
	 * @see #setMReadingParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MReadingParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Reading' description='Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.'"
	 * @generated
	 */
	public MParameter getMReadingParameter() {
		return mReadingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMReadingParameter(MParameter newMReadingParameter, NotificationChain msgs) {
		MParameter oldMReadingParameter = mReadingParameter;
		mReadingParameter = newMReadingParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER, oldMReadingParameter, newMReadingParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingParameter <em>MReading Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMReadingParameter the new value of the '<em>MReading Parameter</em>' containment reference.
	 * @see #getMReadingParameter()
	 * @generated
	 */
	public void setMReadingParameter(MParameter newMReadingParameter) {
		if (newMReadingParameter != mReadingParameter) {
			NotificationChain msgs = null;
			if (mReadingParameter != null)
				msgs = ((InternalEObject)mReadingParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER, null, msgs);
			if (newMReadingParameter != null) {				
				newMReadingParameter.setDefaultDescription("Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.");
				newMReadingParameter.setDefaultName("Reading");
				newMReadingParameter.setValueType(Type.getTypeForName("Text"));
				newMReadingParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER));
				newMReadingParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMReadingParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mReadingParameter != null) {
				if(newMReadingParameter != null)
					newMReadingParameter.eAdapters().addAll(mReadingParameter.eAdapters());			
			
				mReadingParameter.eAdapters().clear();
			}
			msgs = basicSetMReadingParameter(newMReadingParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER, newMReadingParameter, newMReadingParameter));
	}

	/**
	 * Returns the value of the '<em><b>Reading Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Parameter</em>' attribute.
	 * @see #setReadingParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ReadingParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getReadingParameter() {
		return readingParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingParameter <em>Reading Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReadingParameter the new value of the '<em>Reading Parameter</em>' attribute.
	 * @see #getReadingParameter()
	 * @generated
	 */
	public void setReadingParameter(String newReadingParameter) {
		String oldReadingParameter = readingParameter;
		readingParameter = newReadingParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER, oldReadingParameter, readingParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSpeakers Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSpeakers Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpeakers Name Parameter</em>' containment reference.
	 * @see #setMSpeakersNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MSpeakersNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Speaker\'s name' description='Specifies the name of the speaker who will give the talk.'"
	 * @generated
	 */
	public MParameter getMSpeakersNameParameter() {
		return mSpeakersNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSpeakersNameParameter(MParameter newMSpeakersNameParameter, NotificationChain msgs) {
		MParameter oldMSpeakersNameParameter = mSpeakersNameParameter;
		mSpeakersNameParameter = newMSpeakersNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, oldMSpeakersNameParameter, newMSpeakersNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMSpeakersNameParameter the new value of the '<em>MSpeakers Name Parameter</em>' containment reference.
	 * @see #getMSpeakersNameParameter()
	 * @generated
	 */
	public void setMSpeakersNameParameter(MParameter newMSpeakersNameParameter) {
		if (newMSpeakersNameParameter != mSpeakersNameParameter) {
			NotificationChain msgs = null;
			if (mSpeakersNameParameter != null)
				msgs = ((InternalEObject)mSpeakersNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, null, msgs);
			if (newMSpeakersNameParameter != null) {				
				newMSpeakersNameParameter.setDefaultDescription("Specifies the name of the speaker who will give the talk.");
				newMSpeakersNameParameter.setDefaultName("Speaker\'s name");
				newMSpeakersNameParameter.setValueType(Type.getTypeForName("Text"));
				newMSpeakersNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER));
				newMSpeakersNameParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSpeakersNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSpeakersNameParameter != null) {
				if(newMSpeakersNameParameter != null)
					newMSpeakersNameParameter.eAdapters().addAll(mSpeakersNameParameter.eAdapters());			
			
				mSpeakersNameParameter.eAdapters().clear();
			}
			msgs = basicSetMSpeakersNameParameter(newMSpeakersNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, newMSpeakersNameParameter, newMSpeakersNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Speakers Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakers Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers Name Parameter</em>' attribute.
	 * @see #setSpeakersNameParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_SpeakersNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getSpeakersNameParameter() {
		return speakersNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSpeakersNameParameter the new value of the '<em>Speakers Name Parameter</em>' attribute.
	 * @see #getSpeakersNameParameter()
	 * @generated
	 */
	public void setSpeakersNameParameter(String newSpeakersNameParameter) {
		String oldSpeakersNameParameter = speakersNameParameter;
		speakersNameParameter = newSpeakersNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER, oldSpeakersNameParameter, speakersNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Speakers Name Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakers Name Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers Name Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_SpeakersNameParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="5"
	 * @generated
	 */
	public EList getSpeakersNameParameterHistoricValues() {
		if (speakersNameParameterHistoricValues == null) {
			speakersNameParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES);
		}
		return speakersNameParameterHistoricValues;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MRecordingUsersNameParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, oldMRecordingUsersNameParameter, newMRecordingUsersNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mRecordingUsersNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
			if (newMRecordingUsersNameParameter != null) {				
				newMRecordingUsersNameParameter.setDefaultDescription("Specifies the name of the recording user. Please enter your name.");
				newMRecordingUsersNameParameter.setDefaultName("Recording user\'s name");
				newMRecordingUsersNameParameter.setValueType(Type.getTypeForName("Text"));
				newMRecordingUsersNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER));
				newMRecordingUsersNameParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMRecordingUsersNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, newMRecordingUsersNameParameter, newMRecordingUsersNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_RecordingUsersNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getRecordingUsersNameParameter() {
		return recordingUsersNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER, oldRecordingUsersNameParameter, recordingUsersNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording Users Name Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Users Name Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Users Name Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_RecordingUsersNameParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="5"
	 * @generated
	 */
	public EList getRecordingUsersNameParameterHistoricValues() {
		if (recordingUsersNameParameterHistoricValues == null) {
			recordingUsersNameParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES);
		}
		return recordingUsersNameParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MService Date Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MService Date Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MService Date Result</em>' containment reference.
	 * @see #setMServiceDateResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MServiceDateResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Service date' description='Specifies the date of the service.'"
	 * @generated
	 */
	public MResult getMServiceDateResult() {
		return mServiceDateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMServiceDateResult(MResult newMServiceDateResult, NotificationChain msgs) {
		MResult oldMServiceDateResult = mServiceDateResult;
		mServiceDateResult = newMServiceDateResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, oldMServiceDateResult, newMServiceDateResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateResult <em>MService Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMServiceDateResult the new value of the '<em>MService Date Result</em>' containment reference.
	 * @see #getMServiceDateResult()
	 * @generated
	 */
	public void setMServiceDateResult(MResult newMServiceDateResult) {
		if (newMServiceDateResult != mServiceDateResult) {
			NotificationChain msgs = null;
			if (mServiceDateResult != null)
				msgs = ((InternalEObject)mServiceDateResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, null, msgs);
			if (newMServiceDateResult != null) {				
				newMServiceDateResult.setDefaultDescription("Specifies the date of the service.");
				newMServiceDateResult.setDefaultName("Service date");
				newMServiceDateResult.setValueType(Type.getTypeForName("Date"));
				newMServiceDateResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT));
				newMServiceDateResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMServiceDateResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mServiceDateResult != null) {
				if(newMServiceDateResult != null)
					newMServiceDateResult.eAdapters().addAll(mServiceDateResult.eAdapters());			
			
				mServiceDateResult.eAdapters().clear();
			}
			msgs = basicSetMServiceDateResult(newMServiceDateResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, newMServiceDateResult, newMServiceDateResult));
	}

	/**
	 * Returns the value of the '<em><b>Service Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Date Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Date Result</em>' attribute.
	 * @see #setServiceDateResult(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ServiceDateResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDate" required="true" transient="true"
	 * @generated
	 */
	public Date getServiceDateResult() {
		return serviceDateResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateResult <em>Service Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newServiceDateResult the new value of the '<em>Service Date Result</em>' attribute.
	 * @see #getServiceDateResult()
	 * @generated
	 */
	public void setServiceDateResult(Date newServiceDateResult) {
		Date oldServiceDateResult = serviceDateResult;
		serviceDateResult = newServiceDateResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT, oldServiceDateResult, serviceDateResult));
	}

	/**
	 * Returns the value of the '<em><b>MService Type Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MService Type Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MService Type Result</em>' containment reference.
	 * @see #setMServiceTypeResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MServiceTypeResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Service type' description='Specifies the type of the service, e.g. AM service, PM service, Carol service ...'"
	 * @generated
	 */
	public MResult getMServiceTypeResult() {
		return mServiceTypeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMServiceTypeResult(MResult newMServiceTypeResult, NotificationChain msgs) {
		MResult oldMServiceTypeResult = mServiceTypeResult;
		mServiceTypeResult = newMServiceTypeResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT, oldMServiceTypeResult, newMServiceTypeResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeResult <em>MService Type Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMServiceTypeResult the new value of the '<em>MService Type Result</em>' containment reference.
	 * @see #getMServiceTypeResult()
	 * @generated
	 */
	public void setMServiceTypeResult(MResult newMServiceTypeResult) {
		if (newMServiceTypeResult != mServiceTypeResult) {
			NotificationChain msgs = null;
			if (mServiceTypeResult != null)
				msgs = ((InternalEObject)mServiceTypeResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT, null, msgs);
			if (newMServiceTypeResult != null) {				
				newMServiceTypeResult.setDefaultDescription("Specifies the type of the service, e.g. AM service, PM service, Carol service ...");
				newMServiceTypeResult.setDefaultName("Service type");
				newMServiceTypeResult.setValueType(Type.getTypeForName("Text"));
				newMServiceTypeResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT));
				newMServiceTypeResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMServiceTypeResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mServiceTypeResult != null) {
				if(newMServiceTypeResult != null)
					newMServiceTypeResult.eAdapters().addAll(mServiceTypeResult.eAdapters());			
			
				mServiceTypeResult.eAdapters().clear();
			}
			msgs = basicSetMServiceTypeResult(newMServiceTypeResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT, newMServiceTypeResult, newMServiceTypeResult));
	}

	/**
	 * Returns the value of the '<em><b>Service Type Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type Result</em>' attribute.
	 * @see #setServiceTypeResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ServiceTypeResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getServiceTypeResult() {
		return serviceTypeResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeResult <em>Service Type Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newServiceTypeResult the new value of the '<em>Service Type Result</em>' attribute.
	 * @see #getServiceTypeResult()
	 * @generated
	 */
	public void setServiceTypeResult(String newServiceTypeResult) {
		String oldServiceTypeResult = serviceTypeResult;
		serviceTypeResult = newServiceTypeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT, oldServiceTypeResult, serviceTypeResult));
	}

	/**
	 * Returns the value of the '<em><b>MTitle Of Talk Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTitle Of Talk Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTitle Of Talk Result</em>' containment reference.
	 * @see #setMTitleOfTalkResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MTitleOfTalkResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Title of talk' description='Specifies the title of the talk.'"
	 * @generated
	 */
	public MResult getMTitleOfTalkResult() {
		return mTitleOfTalkResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTitleOfTalkResult(MResult newMTitleOfTalkResult, NotificationChain msgs) {
		MResult oldMTitleOfTalkResult = mTitleOfTalkResult;
		mTitleOfTalkResult = newMTitleOfTalkResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, oldMTitleOfTalkResult, newMTitleOfTalkResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMTitleOfTalkResult the new value of the '<em>MTitle Of Talk Result</em>' containment reference.
	 * @see #getMTitleOfTalkResult()
	 * @generated
	 */
	public void setMTitleOfTalkResult(MResult newMTitleOfTalkResult) {
		if (newMTitleOfTalkResult != mTitleOfTalkResult) {
			NotificationChain msgs = null;
			if (mTitleOfTalkResult != null)
				msgs = ((InternalEObject)mTitleOfTalkResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, null, msgs);
			if (newMTitleOfTalkResult != null) {				
				newMTitleOfTalkResult.setDefaultDescription("Specifies the title of the talk.");
				newMTitleOfTalkResult.setDefaultName("Title of talk");
				newMTitleOfTalkResult.setValueType(Type.getTypeForName("Text"));
				newMTitleOfTalkResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT));
				newMTitleOfTalkResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleOfTalkResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTitleOfTalkResult != null) {
				if(newMTitleOfTalkResult != null)
					newMTitleOfTalkResult.eAdapters().addAll(mTitleOfTalkResult.eAdapters());			
			
				mTitleOfTalkResult.eAdapters().clear();
			}
			msgs = basicSetMTitleOfTalkResult(newMTitleOfTalkResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, newMTitleOfTalkResult, newMTitleOfTalkResult));
	}

	/**
	 * Returns the value of the '<em><b>Title Of Talk Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Of Talk Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Of Talk Result</em>' attribute.
	 * @see #setTitleOfTalkResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_TitleOfTalkResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getTitleOfTalkResult() {
		return titleOfTalkResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newTitleOfTalkResult the new value of the '<em>Title Of Talk Result</em>' attribute.
	 * @see #getTitleOfTalkResult()
	 * @generated
	 */
	public void setTitleOfTalkResult(String newTitleOfTalkResult) {
		String oldTitleOfTalkResult = titleOfTalkResult;
		titleOfTalkResult = newTitleOfTalkResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT, oldTitleOfTalkResult, titleOfTalkResult));
	}

	/**
	 * Returns the value of the '<em><b>MReading Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MReading Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReading Result</em>' containment reference.
	 * @see #setMReadingResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MReadingResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Reading' description='Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.'"
	 * @generated
	 */
	public MResult getMReadingResult() {
		return mReadingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMReadingResult(MResult newMReadingResult, NotificationChain msgs) {
		MResult oldMReadingResult = mReadingResult;
		mReadingResult = newMReadingResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT, oldMReadingResult, newMReadingResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingResult <em>MReading Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMReadingResult the new value of the '<em>MReading Result</em>' containment reference.
	 * @see #getMReadingResult()
	 * @generated
	 */
	public void setMReadingResult(MResult newMReadingResult) {
		if (newMReadingResult != mReadingResult) {
			NotificationChain msgs = null;
			if (mReadingResult != null)
				msgs = ((InternalEObject)mReadingResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT, null, msgs);
			if (newMReadingResult != null) {				
				newMReadingResult.setDefaultDescription("Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22.");
				newMReadingResult.setDefaultName("Reading");
				newMReadingResult.setValueType(Type.getTypeForName("Text"));
				newMReadingResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT));
				newMReadingResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMReadingResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mReadingResult != null) {
				if(newMReadingResult != null)
					newMReadingResult.eAdapters().addAll(mReadingResult.eAdapters());			
			
				mReadingResult.eAdapters().clear();
			}
			msgs = basicSetMReadingResult(newMReadingResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT, newMReadingResult, newMReadingResult));
	}

	/**
	 * Returns the value of the '<em><b>Reading Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Result</em>' attribute.
	 * @see #setReadingResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_ReadingResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getReadingResult() {
		return readingResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingResult <em>Reading Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReadingResult the new value of the '<em>Reading Result</em>' attribute.
	 * @see #getReadingResult()
	 * @generated
	 */
	public void setReadingResult(String newReadingResult) {
		String oldReadingResult = readingResult;
		readingResult = newReadingResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT, oldReadingResult, readingResult));
	}

	/**
	 * Returns the value of the '<em><b>MSpeakers Name Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSpeakers Name Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpeakers Name Result</em>' containment reference.
	 * @see #setMSpeakersNameResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MSpeakersNameResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Speaker\'s name' description='Specifies the name of the speaker who will give the talk.'"
	 * @generated
	 */
	public MResult getMSpeakersNameResult() {
		return mSpeakersNameResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSpeakersNameResult(MResult newMSpeakersNameResult, NotificationChain msgs) {
		MResult oldMSpeakersNameResult = mSpeakersNameResult;
		mSpeakersNameResult = newMSpeakersNameResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, oldMSpeakersNameResult, newMSpeakersNameResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSpeakersNameResult the new value of the '<em>MSpeakers Name Result</em>' containment reference.
	 * @see #getMSpeakersNameResult()
	 * @generated
	 */
	public void setMSpeakersNameResult(MResult newMSpeakersNameResult) {
		if (newMSpeakersNameResult != mSpeakersNameResult) {
			NotificationChain msgs = null;
			if (mSpeakersNameResult != null)
				msgs = ((InternalEObject)mSpeakersNameResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, null, msgs);
			if (newMSpeakersNameResult != null) {				
				newMSpeakersNameResult.setDefaultDescription("Specifies the name of the speaker who will give the talk.");
				newMSpeakersNameResult.setDefaultName("Speaker\'s name");
				newMSpeakersNameResult.setValueType(Type.getTypeForName("Text"));
				newMSpeakersNameResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT));
				newMSpeakersNameResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSpeakersNameResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSpeakersNameResult != null) {
				if(newMSpeakersNameResult != null)
					newMSpeakersNameResult.eAdapters().addAll(mSpeakersNameResult.eAdapters());			
			
				mSpeakersNameResult.eAdapters().clear();
			}
			msgs = basicSetMSpeakersNameResult(newMSpeakersNameResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, newMSpeakersNameResult, newMSpeakersNameResult));
	}

	/**
	 * Returns the value of the '<em><b>Speakers Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakers Name Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers Name Result</em>' attribute.
	 * @see #setSpeakersNameResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_SpeakersNameResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getSpeakersNameResult() {
		return speakersNameResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSpeakersNameResult the new value of the '<em>Speakers Name Result</em>' attribute.
	 * @see #getSpeakersNameResult()
	 * @generated
	 */
	public void setSpeakersNameResult(String newSpeakersNameResult) {
		String oldSpeakersNameResult = speakersNameResult;
		speakersNameResult = newSpeakersNameResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT, oldSpeakersNameResult, speakersNameResult));
	}

	/**
	 * Returns the value of the '<em><b>MRecording Users Name Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Users Name Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Users Name Result</em>' containment reference.
	 * @see #setMRecordingUsersNameResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_MRecordingUsersNameResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording user\'s name' description='Specifies the name of the recording user. Please enter your name.'"
	 * @generated
	 */
	public MResult getMRecordingUsersNameResult() {
		return mRecordingUsersNameResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingUsersNameResult(MResult newMRecordingUsersNameResult, NotificationChain msgs) {
		MResult oldMRecordingUsersNameResult = mRecordingUsersNameResult;
		mRecordingUsersNameResult = newMRecordingUsersNameResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, oldMRecordingUsersNameResult, newMRecordingUsersNameResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRecordingUsersNameResult the new value of the '<em>MRecording Users Name Result</em>' containment reference.
	 * @see #getMRecordingUsersNameResult()
	 * @generated
	 */
	public void setMRecordingUsersNameResult(MResult newMRecordingUsersNameResult) {
		if (newMRecordingUsersNameResult != mRecordingUsersNameResult) {
			NotificationChain msgs = null;
			if (mRecordingUsersNameResult != null)
				msgs = ((InternalEObject)mRecordingUsersNameResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, null, msgs);
			if (newMRecordingUsersNameResult != null) {				
				newMRecordingUsersNameResult.setDefaultDescription("Specifies the name of the recording user. Please enter your name.");
				newMRecordingUsersNameResult.setDefaultName("Recording user\'s name");
				newMRecordingUsersNameResult.setValueType(Type.getTypeForName("Text"));
				newMRecordingUsersNameResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT));
				newMRecordingUsersNameResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingUsersNameResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingUsersNameResult != null) {
				if(newMRecordingUsersNameResult != null)
					newMRecordingUsersNameResult.eAdapters().addAll(mRecordingUsersNameResult.eAdapters());			
			
				mRecordingUsersNameResult.eAdapters().clear();
			}
			msgs = basicSetMRecordingUsersNameResult(newMRecordingUsersNameResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, newMRecordingUsersNameResult, newMRecordingUsersNameResult));
	}

	/**
	 * Returns the value of the '<em><b>Recording Users Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Users Name Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Users Name Result</em>' attribute.
	 * @see #setRecordingUsersNameResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep_RecordingUsersNameResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getRecordingUsersNameResult() {
		return recordingUsersNameResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecordingUsersNameResult the new value of the '<em>Recording Users Name Result</em>' attribute.
	 * @see #getRecordingUsersNameResult()
	 * @generated
	 */
	public void setRecordingUsersNameResult(String newRecordingUsersNameResult) {
		String oldRecordingUsersNameResult = recordingUsersNameResult;
		recordingUsersNameResult = newRecordingUsersNameResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT, oldRecordingUsersNameResult, recordingUsersNameResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:
				return basicSetMServiceDateParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:
				return basicSetMServiceTypeParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return basicSetMTitleOfTalkParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:
				return basicSetMReadingParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return basicSetMSpeakersNameParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return basicSetMRecordingUsersNameParameter(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:
				return basicSetMServiceDateResult(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:
				return basicSetMServiceTypeResult(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return basicSetMTitleOfTalkResult(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:
				return basicSetMReadingResult(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return basicSetMSpeakersNameResult(null, msgs);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				return basicSetMRecordingUsersNameResult(null, msgs);
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
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:
				return getMServiceDateParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER:
				return getServiceDateParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:
				return getMServiceTypeParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER:
				return getServiceTypeParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES:
				return getServiceTypeParameterHistoricValues();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return getMTitleOfTalkParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				return getTitleOfTalkParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:
				return getMReadingParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER:
				return getReadingParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return getMSpeakersNameParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				return getSpeakersNameParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				return getSpeakersNameParameterHistoricValues();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return getMRecordingUsersNameParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getRecordingUsersNameParameter();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				return getRecordingUsersNameParameterHistoricValues();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:
				return getMServiceDateResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT:
				return getServiceDateResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:
				return getMServiceTypeResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT:
				return getServiceTypeResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return getMTitleOfTalkResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				return getTitleOfTalkResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:
				return getMReadingResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT:
				return getReadingResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return getMSpeakersNameResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				return getSpeakersNameResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				return getMRecordingUsersNameResult();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
				return getRecordingUsersNameResult();
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
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:    
				setMServiceDateParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER:    
				setServiceDateParameter((Date)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:    
				setMServiceTypeParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER:    
				setServiceTypeParameter((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES:
				getServiceTypeParameterHistoricValues().clear();
				getServiceTypeParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:    
				setMTitleOfTalkParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:    
				setTitleOfTalkParameter((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:    
				setMReadingParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER:    
				setReadingParameter((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:    
				setMSpeakersNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:    
				setSpeakersNameParameter((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				getSpeakersNameParameterHistoricValues().clear();
				getSpeakersNameParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:    
				setMRecordingUsersNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:    
				setRecordingUsersNameParameter((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				getRecordingUsersNameParameterHistoricValues().clear();
				getRecordingUsersNameParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:    
				setMServiceDateResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT:    
				setServiceDateResult((Date)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:    
				setMServiceTypeResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT:    
				setServiceTypeResult((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:    
				setMTitleOfTalkResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT:    
				setTitleOfTalkResult((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:    
				setMReadingResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT:    
				setReadingResult((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:    
				setMSpeakersNameResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT:    
				setSpeakersNameResult((String)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:    
				setMRecordingUsersNameResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:    
				setRecordingUsersNameResult((String)newValue);
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
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:
				setMServiceDateParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER:
				setServiceDateParameter(getDefaultServiceDateParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:
				setMServiceTypeParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER:
				setServiceTypeParameter(getDefaultServiceTypeParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES:
				getServiceTypeParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				setMTitleOfTalkParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				setTitleOfTalkParameter(getDefaultTitleOfTalkParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:
				setMReadingParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER:
				setReadingParameter(getDefaultReadingParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				setMSpeakersNameParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				setSpeakersNameParameter(getDefaultSpeakersNameParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				getSpeakersNameParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				setMRecordingUsersNameParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				setRecordingUsersNameParameter(getDefaultRecordingUsersNameParameter());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				getRecordingUsersNameParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:
				setMServiceDateResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT:
				setServiceDateResult(getDefaultServiceDateResult());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:
				setMServiceTypeResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT:
				setServiceTypeResult(getDefaultServiceTypeResult());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				setMTitleOfTalkResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				setTitleOfTalkResult(getDefaultTitleOfTalkResult());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:
				setMReadingResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT:
				setReadingResult(getDefaultReadingResult());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				setMSpeakersNameResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				setSpeakersNameResult(getDefaultSpeakersNameResult());
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				setMRecordingUsersNameResult((MResult)null);
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
				setRecordingUsersNameResult(getDefaultRecordingUsersNameResult());
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
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:
				return mServiceDateParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER:
				return getDefaultServiceDateParameter() == null ? serviceDateParameter != null : !getDefaultServiceDateParameter().equals(serviceDateParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:
				return mServiceTypeParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER:
				return getDefaultServiceTypeParameter() == null ? serviceTypeParameter != null : !getDefaultServiceTypeParameter().equals(serviceTypeParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES:
				return serviceTypeParameterHistoricValues != null && !serviceTypeParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return mTitleOfTalkParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				return getDefaultTitleOfTalkParameter() == null ? titleOfTalkParameter != null : !getDefaultTitleOfTalkParameter().equals(titleOfTalkParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:
				return mReadingParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER:
				return getDefaultReadingParameter() == null ? readingParameter != null : !getDefaultReadingParameter().equals(readingParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return mSpeakersNameParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				return getDefaultSpeakersNameParameter() == null ? speakersNameParameter != null : !getDefaultSpeakersNameParameter().equals(speakersNameParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				return speakersNameParameterHistoricValues != null && !speakersNameParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return mRecordingUsersNameParameter != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getDefaultRecordingUsersNameParameter() == null ? recordingUsersNameParameter != null : !getDefaultRecordingUsersNameParameter().equals(recordingUsersNameParameter);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				return recordingUsersNameParameterHistoricValues != null && !recordingUsersNameParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:
				return mServiceDateResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT:
				return getDefaultServiceDateResult() == null ? serviceDateResult != null : !getDefaultServiceDateResult().equals(serviceDateResult);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:
				return mServiceTypeResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT:
				return getDefaultServiceTypeResult() == null ? serviceTypeResult != null : !getDefaultServiceTypeResult().equals(serviceTypeResult);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return mTitleOfTalkResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				return getDefaultTitleOfTalkResult() == null ? titleOfTalkResult != null : !getDefaultTitleOfTalkResult().equals(titleOfTalkResult);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:
				return mReadingResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT:
				return getDefaultReadingResult() == null ? readingResult != null : !getDefaultReadingResult().equals(readingResult);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return mSpeakersNameResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				return getDefaultSpeakersNameResult() == null ? speakersNameResult != null : !getDefaultSpeakersNameResult().equals(speakersNameResult);
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				return mRecordingUsersNameResult != null;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
				return getDefaultRecordingUsersNameResult() == null ? recordingUsersNameResult != null : !getDefaultRecordingUsersNameResult().equals(recordingUsersNameResult);
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
		result.append(" (serviceDateParameter: ");
		result.append(serviceDateParameter);
		result.append(", serviceTypeParameter: ");
		result.append(serviceTypeParameter);
		result.append(", serviceTypeParameterHistoricValues: ");
		result.append(serviceTypeParameterHistoricValues);
		result.append(", titleOfTalkParameter: ");
		result.append(titleOfTalkParameter);
		result.append(", readingParameter: ");
		result.append(readingParameter);
		result.append(", speakersNameParameter: ");
		result.append(speakersNameParameter);
		result.append(", speakersNameParameterHistoricValues: ");
		result.append(speakersNameParameterHistoricValues);
		result.append(", recordingUsersNameParameter: ");
		result.append(recordingUsersNameParameter);
		result.append(", recordingUsersNameParameterHistoricValues: ");
		result.append(recordingUsersNameParameterHistoricValues);
		result.append(", serviceDateResult: ");
		result.append(serviceDateResult);
		result.append(", serviceTypeResult: ");
		result.append(serviceTypeResult);
		result.append(", titleOfTalkResult: ");
		result.append(titleOfTalkResult);
		result.append(", readingResult: ");
		result.append(readingResult);
		result.append(", speakersNameResult: ");
		result.append(speakersNameResult);
		result.append(", recordingUsersNameResult: ");
		result.append(recordingUsersNameResult);
		result.append(')');
		return result.toString();
	}

} // MEnterServiceInformationStep