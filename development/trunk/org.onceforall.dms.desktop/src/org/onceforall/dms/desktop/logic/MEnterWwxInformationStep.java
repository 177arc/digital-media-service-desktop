/*
 * Revision History:
 * $Log: MEnterWwxInformationStep.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEnter Wwx Information Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateParameter <em>MWwx Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateParameter <em>Wwx Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameterHistoricValues <em>Speakers Name Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartParameter <em>MFirst Part Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameter <em>First Part Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameterHistoricValues <em>First Part Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartParameter <em>MSecond Part Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameter <em>Second Part Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameterHistoricValues <em>Second Part Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameterHistoricValues <em>Recording Users Name Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateResult <em>MWwx Date Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateResult <em>Wwx Date Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartResult <em>MFirst Part Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartResult <em>First Part Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartResult <em>MSecond Part Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartResult <em>Second Part Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Enter WordWiseXtra information' description='Please enter information about the WordWiseXtra meeting and then select \'Mark as completed\'.' actionIconFilePath='Image Files/Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MEnterWwxInformationStep extends MEnterInformationStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MEnterWwxInformationStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MEnterWwxInformationStep.TYPE_NAME, new ReferenceType("Reference to "+MEnterWwxInformationStep.TYPE_NAME, "Specifies a reference to a "+MEnterWwxInformationStep.TYPE_NAME_FOR_UI, MEnterWwxInformationStep.class));
	}
	/**
	 * The cached value of the '{@link #getMWwxDateParameter() <em>MWwx Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWwxDateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mWwxDateParameter;

	/**
	 * The default value of the '{@link #getWwxDateParameter() <em>Wwx Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxDateParameter()
	 * @ordered
	 */
	protected static final Date WWX_DATE_PARAMETER_EDEFAULT = new Date();

	/**
	 * Get the default value of the '{@link #getWwxDateParameter() <em>Wwx Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getWwxDateParameter() <em>Wwx Date Parameter</em>}' attribute.
	 * @see #getWwxDateParameter()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultWwxDateParameter() {
		return WWX_DATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getWwxDateParameter() <em>Wwx Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxDateParameter()
	 * @generated
	 * @ordered
	 */
	protected Date wwxDateParameter = WWX_DATE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTitleOfTalkParameter() <em>MTitle Of Talk Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTitleOfTalkParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTitleOfTalkParameter;

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
	 * The cached value of the '{@link #getMSpeakersNameParameter() <em>MSpeakers Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpeakersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSpeakersNameParameter;

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
	protected EList speakersNameParameterHistoricValues;

	/**
	 * The cached value of the '{@link #getMFirstPartParameter() <em>MFirst Part Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFirstPartParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mFirstPartParameter;

	/**
	 * The default value of the '{@link #getFirstPartParameter() <em>First Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PART_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFirstPartParameter() <em>First Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFirstPartParameter() <em>First Part Parameter</em>}' attribute.
	 * @see #getFirstPartParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFirstPartParameter() {
		return FIRST_PART_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFirstPartParameter() <em>First Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartParameter()
	 * @generated
	 * @ordered
	 */
	protected String firstPartParameter = FIRST_PART_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstPartParameterHistoricValues() <em>First Part Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList firstPartParameterHistoricValues;

	/**
	 * The cached value of the '{@link #getMSecondPartParameter() <em>MSecond Part Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSecondPartParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSecondPartParameter;

	/**
	 * The default value of the '{@link #getSecondPartParameter() <em>Second Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPartParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_PART_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSecondPartParameter() <em>Second Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSecondPartParameter() <em>Second Part Parameter</em>}' attribute.
	 * @see #getSecondPartParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSecondPartParameter() {
		return SECOND_PART_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSecondPartParameter() <em>Second Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPartParameter()
	 * @generated
	 * @ordered
	 */
	protected String secondPartParameter = SECOND_PART_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondPartParameterHistoricValues() <em>Second Part Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPartParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList secondPartParameterHistoricValues;

	/**
	 * The cached value of the '{@link #getMRecordingUsersNameParameter() <em>MRecording Users Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingUsersNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingUsersNameParameter;

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
	protected EList recordingUsersNameParameterHistoricValues;

	/**
	 * The cached value of the '{@link #getMWwxDateResult() <em>MWwx Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWwxDateResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mWwxDateResult;

	/**
	 * The default value of the '{@link #getWwxDateResult() <em>Wwx Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxDateResult()
	 * @generated
	 * @ordered
	 */
	protected static final Date WWX_DATE_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getWwxDateResult() <em>Wwx Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getWwxDateResult() <em>Wwx Date Result</em>}' attribute.
	 * @see #getWwxDateResult()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultWwxDateResult() {
		return WWX_DATE_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getWwxDateResult() <em>Wwx Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWwxDateResult()
	 * @generated
	 * @ordered
	 */
	protected Date wwxDateResult = WWX_DATE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTitleOfTalkResult() <em>MTitle Of Talk Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTitleOfTalkResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mTitleOfTalkResult;

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
	 * The cached value of the '{@link #getMSpeakersNameResult() <em>MSpeakers Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpeakersNameResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mSpeakersNameResult;

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
	 * The cached value of the '{@link #getMFirstPartResult() <em>MFirst Part Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFirstPartResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mFirstPartResult;

	/**
	 * The default value of the '{@link #getFirstPartResult() <em>First Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartResult()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PART_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFirstPartResult() <em>First Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFirstPartResult() <em>First Part Result</em>}' attribute.
	 * @see #getFirstPartResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultFirstPartResult() {
		return FIRST_PART_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFirstPartResult() <em>First Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartResult()
	 * @generated
	 * @ordered
	 */
	protected String firstPartResult = FIRST_PART_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMSecondPartResult() <em>MSecond Part Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSecondPartResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mSecondPartResult;

	/**
	 * The default value of the '{@link #getSecondPartResult() <em>Second Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPartResult()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_PART_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getSecondPartResult() <em>Second Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSecondPartResult() <em>Second Part Result</em>}' attribute.
	 * @see #getSecondPartResult()
	 * @generated
	 * @ordered
	 */
	public String getDefaultSecondPartResult() {
		return SECOND_PART_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getSecondPartResult() <em>Second Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPartResult()
	 * @generated
	 * @ordered
	 */
	protected String secondPartResult = SECOND_PART_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingUsersNameResult() <em>MRecording Users Name Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingUsersNameResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mRecordingUsersNameResult;

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
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescription() {
		return "Please enter information about the WordWiseXtra meeting and then select \'Mark as completed\'.";
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
		return "Enter WordWiseXtra information";
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
	protected MEnterWwxInformationStep() {
		super();
		
		firstMEnterWwxInformationStepConstructorHook();
				
		interruptable = false;
		terminatable = false;
		description = "Please enter information about the WordWiseXtra meeting and then select \'Mark as completed\'.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Mark as completed.gif");
		name = "Enter WordWiseXtra information";
			 
		setMWwxDateParameter(new MParameter(false, "Date", "Specifies the date of the WordWiseXtra meeting.", null));			 
		setMTitleOfTalkParameter(new MParameter(false, "Topic", "Specifies the title of the talk.", null));			 
		setMSpeakersNameParameter(new MParameter(false, "Speaker\'s name", "Specifies the name of the speaker who will give the talk.", null));			 
		setMFirstPartParameter(new MParameter(false, "First part", "Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.", null));			 
		setMSecondPartParameter(new MParameter(false, "Second part", "Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.", null));			 
		setMRecordingUsersNameParameter(new MParameter(false, "Recording user\'s name", "Specifies the name of the recording user. Please enter your name.", null));			 
		setMWwxDateResult(new MResult(false, "Date", "Specifies the date of the WordWiseXtra meeting.", null));			 
		setMTitleOfTalkResult(new MResult(false, "Topic", "Specifies the title of the talk.", null));			 
		setMSpeakersNameResult(new MResult(false, "Speaker\'s name", "Specifies the name of the speaker who will give the talk.", null));			 
		setMFirstPartResult(new MResult(false, "First part", "Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.", null));			 
		setMSecondPartResult(new MResult(false, "Second part", "Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.", null));			 
		setMRecordingUsersNameResult(new MResult(false, "Recording user\'s name", "Specifies the name of the recording user. Please enter your name.", null));

		lastMEnterWwxInformationStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMEnterWwxInformationStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMEnterWwxInformationStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MWwx Date Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MWwx Date Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWwx Date Parameter</em>' containment reference.
	 * @see #setMWwxDateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MWwxDateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Date' description='Specifies the date of the WordWiseXtra meeting.'"
	 * @generated
	 */
	public MParameter getMWwxDateParameter() {
		return mWwxDateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWwxDateParameter(MParameter newMWwxDateParameter, NotificationChain msgs) {
		MParameter oldMWwxDateParameter = mWwxDateParameter;
		mWwxDateParameter = newMWwxDateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER, oldMWwxDateParameter, newMWwxDateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateParameter <em>MWwx Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMWwxDateParameter the new value of the '<em>MWwx Date Parameter</em>' containment reference.
	 * @see #getMWwxDateParameter()
	 * @generated
	 */
	public void setMWwxDateParameter(MParameter newMWwxDateParameter) {
		if (newMWwxDateParameter != mWwxDateParameter) {
			NotificationChain msgs = null;
			if (mWwxDateParameter != null)
				msgs = ((InternalEObject)mWwxDateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER, null, msgs);
			if (newMWwxDateParameter != null) {				
				newMWwxDateParameter.setDefaultDescription("Specifies the date of the WordWiseXtra meeting.");
				newMWwxDateParameter.setDefaultName("Date");
				newMWwxDateParameter.setValueType(Type.getTypeForName("Date"));
				newMWwxDateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER));
				newMWwxDateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMWwxDateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mWwxDateParameter != null) {
				if(newMWwxDateParameter != null)
					newMWwxDateParameter.eAdapters().addAll(mWwxDateParameter.eAdapters());			
			
				mWwxDateParameter.eAdapters().clear();
			}
			msgs = basicSetMWwxDateParameter(newMWwxDateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER, newMWwxDateParameter, newMWwxDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Wwx Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wwx Date Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wwx Date Parameter</em>' attribute.
	 * @see #setWwxDateParameter(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_WwxDateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDate" required="true" transient="true"
	 * @generated
	 */
	public Date getWwxDateParameter() {
		return wwxDateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateParameter <em>Wwx Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newWwxDateParameter the new value of the '<em>Wwx Date Parameter</em>' attribute.
	 * @see #getWwxDateParameter()
	 * @generated
	 */
	public void setWwxDateParameter(Date newWwxDateParameter) {
		Date oldWwxDateParameter = wwxDateParameter;
		wwxDateParameter = newWwxDateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER, oldWwxDateParameter, wwxDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTitle Of Talk Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTitle Of Talk Parameter</em>' containment reference.
	 * @see #setMTitleOfTalkParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MTitleOfTalkParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Topic' description='Specifies the title of the talk.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, oldMTitleOfTalkParameter, newMTitleOfTalkParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mTitleOfTalkParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, null, msgs);
			if (newMTitleOfTalkParameter != null) {				
				newMTitleOfTalkParameter.setDefaultDescription("Specifies the title of the talk.");
				newMTitleOfTalkParameter.setDefaultName("Topic");
				newMTitleOfTalkParameter.setValueType(Type.getTypeForName("Text"));
				newMTitleOfTalkParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER));
				newMTitleOfTalkParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleOfTalkParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER, newMTitleOfTalkParameter, newMTitleOfTalkParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_TitleOfTalkParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getTitleOfTalkParameter() {
		return titleOfTalkParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER, oldTitleOfTalkParameter, titleOfTalkParameter));
	}

	/**
	 * Returns the value of the '<em><b>MSpeakers Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSpeakers Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpeakers Name Parameter</em>' containment reference.
	 * @see #setMSpeakersNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MSpeakersNameParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, oldMSpeakersNameParameter, newMSpeakersNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mSpeakersNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, null, msgs);
			if (newMSpeakersNameParameter != null) {				
				newMSpeakersNameParameter.setDefaultDescription("Specifies the name of the speaker who will give the talk.");
				newMSpeakersNameParameter.setDefaultName("Speaker\'s name");
				newMSpeakersNameParameter.setValueType(Type.getTypeForName("Text"));
				newMSpeakersNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER));
				newMSpeakersNameParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSpeakersNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER, newMSpeakersNameParameter, newMSpeakersNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SpeakersNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getSpeakersNameParameter() {
		return speakersNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER, oldSpeakersNameParameter, speakersNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SpeakersNameParameterHistoricValues()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" upper="5"
	 * @generated
	 */
	public EList getSpeakersNameParameterHistoricValues() {
		if (speakersNameParameterHistoricValues == null) {
			speakersNameParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES);
		}
		return speakersNameParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MFirst Part Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFirst Part Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFirst Part Parameter</em>' containment reference.
	 * @see #setMFirstPartParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MFirstPartParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='First part' description='Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.'"
	 * @generated
	 */
	public MParameter getMFirstPartParameter() {
		return mFirstPartParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFirstPartParameter(MParameter newMFirstPartParameter, NotificationChain msgs) {
		MParameter oldMFirstPartParameter = mFirstPartParameter;
		mFirstPartParameter = newMFirstPartParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER, oldMFirstPartParameter, newMFirstPartParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartParameter <em>MFirst Part Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFirstPartParameter the new value of the '<em>MFirst Part Parameter</em>' containment reference.
	 * @see #getMFirstPartParameter()
	 * @generated
	 */
	public void setMFirstPartParameter(MParameter newMFirstPartParameter) {
		if (newMFirstPartParameter != mFirstPartParameter) {
			NotificationChain msgs = null;
			if (mFirstPartParameter != null)
				msgs = ((InternalEObject)mFirstPartParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER, null, msgs);
			if (newMFirstPartParameter != null) {				
				newMFirstPartParameter.setDefaultDescription("Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.");
				newMFirstPartParameter.setDefaultName("First part");
				newMFirstPartParameter.setValueType(Type.getTypeForName("Text"));
				newMFirstPartParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER));
				newMFirstPartParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMFirstPartParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFirstPartParameter != null) {
				if(newMFirstPartParameter != null)
					newMFirstPartParameter.eAdapters().addAll(mFirstPartParameter.eAdapters());			
			
				mFirstPartParameter.eAdapters().clear();
			}
			msgs = basicSetMFirstPartParameter(newMFirstPartParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER, newMFirstPartParameter, newMFirstPartParameter));
	}

	/**
	 * Returns the value of the '<em><b>First Part Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Part Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Part Parameter</em>' attribute.
	 * @see #setFirstPartParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_FirstPartParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getFirstPartParameter() {
		return firstPartParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameter <em>First Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFirstPartParameter the new value of the '<em>First Part Parameter</em>' attribute.
	 * @see #getFirstPartParameter()
	 * @generated
	 */
	public void setFirstPartParameter(String newFirstPartParameter) {
		String oldFirstPartParameter = firstPartParameter;
		firstPartParameter = newFirstPartParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER, oldFirstPartParameter, firstPartParameter));
	}

	/**
	 * Returns the value of the '<em><b>First Part Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Part Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Part Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_FirstPartParameterHistoricValues()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" upper="2"
	 * @generated
	 */
	public EList getFirstPartParameterHistoricValues() {
		if (firstPartParameterHistoricValues == null) {
			firstPartParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES);
		}
		return firstPartParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MSecond Part Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSecond Part Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSecond Part Parameter</em>' containment reference.
	 * @see #setMSecondPartParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MSecondPartParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Second part' description='Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.'"
	 * @generated
	 */
	public MParameter getMSecondPartParameter() {
		return mSecondPartParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSecondPartParameter(MParameter newMSecondPartParameter, NotificationChain msgs) {
		MParameter oldMSecondPartParameter = mSecondPartParameter;
		mSecondPartParameter = newMSecondPartParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER, oldMSecondPartParameter, newMSecondPartParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartParameter <em>MSecond Part Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSecondPartParameter the new value of the '<em>MSecond Part Parameter</em>' containment reference.
	 * @see #getMSecondPartParameter()
	 * @generated
	 */
	public void setMSecondPartParameter(MParameter newMSecondPartParameter) {
		if (newMSecondPartParameter != mSecondPartParameter) {
			NotificationChain msgs = null;
			if (mSecondPartParameter != null)
				msgs = ((InternalEObject)mSecondPartParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER, null, msgs);
			if (newMSecondPartParameter != null) {				
				newMSecondPartParameter.setDefaultDescription("Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.");
				newMSecondPartParameter.setDefaultName("Second part");
				newMSecondPartParameter.setValueType(Type.getTypeForName("Text"));
				newMSecondPartParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER));
				newMSecondPartParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMSecondPartParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSecondPartParameter != null) {
				if(newMSecondPartParameter != null)
					newMSecondPartParameter.eAdapters().addAll(mSecondPartParameter.eAdapters());			
			
				mSecondPartParameter.eAdapters().clear();
			}
			msgs = basicSetMSecondPartParameter(newMSecondPartParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER, newMSecondPartParameter, newMSecondPartParameter));
	}

	/**
	 * Returns the value of the '<em><b>Second Part Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Part Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Part Parameter</em>' attribute.
	 * @see #setSecondPartParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SecondPartParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getSecondPartParameter() {
		return secondPartParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameter <em>Second Part Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSecondPartParameter the new value of the '<em>Second Part Parameter</em>' attribute.
	 * @see #getSecondPartParameter()
	 * @generated
	 */
	public void setSecondPartParameter(String newSecondPartParameter) {
		String oldSecondPartParameter = secondPartParameter;
		secondPartParameter = newSecondPartParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER, oldSecondPartParameter, secondPartParameter));
	}

	/**
	 * Returns the value of the '<em><b>Second Part Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Part Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Part Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SecondPartParameterHistoricValues()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" upper="2"
	 * @generated
	 */
	public EList getSecondPartParameterHistoricValues() {
		if (secondPartParameterHistoricValues == null) {
			secondPartParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES);
		}
		return secondPartParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MRecording Users Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Users Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Users Name Parameter</em>' containment reference.
	 * @see #setMRecordingUsersNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MRecordingUsersNameParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, oldMRecordingUsersNameParameter, newMRecordingUsersNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mRecordingUsersNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
			if (newMRecordingUsersNameParameter != null) {				
				newMRecordingUsersNameParameter.setDefaultDescription("Specifies the name of the recording user. Please enter your name.");
				newMRecordingUsersNameParameter.setDefaultName("Recording user\'s name");
				newMRecordingUsersNameParameter.setValueType(Type.getTypeForName("Text"));
				newMRecordingUsersNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER));
				newMRecordingUsersNameParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMRecordingUsersNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER, newMRecordingUsersNameParameter, newMRecordingUsersNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_RecordingUsersNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getRecordingUsersNameParameter() {
		return recordingUsersNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER, oldRecordingUsersNameParameter, recordingUsersNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_RecordingUsersNameParameterHistoricValues()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" upper="5"
	 * @generated
	 */
	public EList getRecordingUsersNameParameterHistoricValues() {
		if (recordingUsersNameParameterHistoricValues == null) {
			recordingUsersNameParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES);
		}
		return recordingUsersNameParameterHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MWwx Date Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MWwx Date Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWwx Date Result</em>' containment reference.
	 * @see #setMWwxDateResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MWwxDateResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Date' description='Specifies the date of the WordWiseXtra meeting.'"
	 * @generated
	 */
	public MResult getMWwxDateResult() {
		return mWwxDateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWwxDateResult(MResult newMWwxDateResult, NotificationChain msgs) {
		MResult oldMWwxDateResult = mWwxDateResult;
		mWwxDateResult = newMWwxDateResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT, oldMWwxDateResult, newMWwxDateResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateResult <em>MWwx Date Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMWwxDateResult the new value of the '<em>MWwx Date Result</em>' containment reference.
	 * @see #getMWwxDateResult()
	 * @generated
	 */
	public void setMWwxDateResult(MResult newMWwxDateResult) {
		if (newMWwxDateResult != mWwxDateResult) {
			NotificationChain msgs = null;
			if (mWwxDateResult != null)
				msgs = ((InternalEObject)mWwxDateResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT, null, msgs);
			if (newMWwxDateResult != null) {				
				newMWwxDateResult.setDefaultDescription("Specifies the date of the WordWiseXtra meeting.");
				newMWwxDateResult.setDefaultName("Date");
				newMWwxDateResult.setValueType(Type.getTypeForName("Date"));
				newMWwxDateResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT));
				newMWwxDateResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMWwxDateResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mWwxDateResult != null) {
				if(newMWwxDateResult != null)
					newMWwxDateResult.eAdapters().addAll(mWwxDateResult.eAdapters());			
			
				mWwxDateResult.eAdapters().clear();
			}
			msgs = basicSetMWwxDateResult(newMWwxDateResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT, newMWwxDateResult, newMWwxDateResult));
	}

	/**
	 * Returns the value of the '<em><b>Wwx Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wwx Date Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wwx Date Result</em>' attribute.
	 * @see #setWwxDateResult(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_WwxDateResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDate" required="true" transient="true"
	 * @generated
	 */
	public Date getWwxDateResult() {
		return wwxDateResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateResult <em>Wwx Date Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newWwxDateResult the new value of the '<em>Wwx Date Result</em>' attribute.
	 * @see #getWwxDateResult()
	 * @generated
	 */
	public void setWwxDateResult(Date newWwxDateResult) {
		Date oldWwxDateResult = wwxDateResult;
		wwxDateResult = newWwxDateResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT, oldWwxDateResult, wwxDateResult));
	}

	/**
	 * Returns the value of the '<em><b>MTitle Of Talk Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTitle Of Talk Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTitle Of Talk Result</em>' containment reference.
	 * @see #setMTitleOfTalkResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MTitleOfTalkResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Topic' description='Specifies the title of the talk.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, oldMTitleOfTalkResult, newMTitleOfTalkResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}' containment reference.
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
				msgs = ((InternalEObject)mTitleOfTalkResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, null, msgs);
			if (newMTitleOfTalkResult != null) {				
				newMTitleOfTalkResult.setDefaultDescription("Specifies the title of the talk.");
				newMTitleOfTalkResult.setDefaultName("Topic");
				newMTitleOfTalkResult.setValueType(Type.getTypeForName("Text"));
				newMTitleOfTalkResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT));
				newMTitleOfTalkResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleOfTalkResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, newMTitleOfTalkResult, newMTitleOfTalkResult));
	}

	/**
	 * Returns the value of the '<em><b>Title Of Talk Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Of Talk Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Of Talk Result</em>' attribute.
	 * @see #setTitleOfTalkResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_TitleOfTalkResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getTitleOfTalkResult() {
		return titleOfTalkResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT, oldTitleOfTalkResult, titleOfTalkResult));
	}

	/**
	 * Returns the value of the '<em><b>MSpeakers Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSpeakers Name Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpeakers Name Result</em>' containment reference.
	 * @see #setMSpeakersNameResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MSpeakersNameResult()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, oldMSpeakersNameResult, newMSpeakersNameResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}' containment reference.
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
				msgs = ((InternalEObject)mSpeakersNameResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, null, msgs);
			if (newMSpeakersNameResult != null) {				
				newMSpeakersNameResult.setDefaultDescription("Specifies the name of the speaker who will give the talk.");
				newMSpeakersNameResult.setDefaultName("Speaker\'s name");
				newMSpeakersNameResult.setValueType(Type.getTypeForName("Text"));
				newMSpeakersNameResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT));
				newMSpeakersNameResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSpeakersNameResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, newMSpeakersNameResult, newMSpeakersNameResult));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SpeakersNameResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getSpeakersNameResult() {
		return speakersNameResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT, oldSpeakersNameResult, speakersNameResult));
	}

	/**
	 * Returns the value of the '<em><b>MFirst Part Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFirst Part Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFirst Part Result</em>' containment reference.
	 * @see #setMFirstPartResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MFirstPartResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='First part' description='Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.'"
	 * @generated
	 */
	public MResult getMFirstPartResult() {
		return mFirstPartResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFirstPartResult(MResult newMFirstPartResult, NotificationChain msgs) {
		MResult oldMFirstPartResult = mFirstPartResult;
		mFirstPartResult = newMFirstPartResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, oldMFirstPartResult, newMFirstPartResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartResult <em>MFirst Part Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFirstPartResult the new value of the '<em>MFirst Part Result</em>' containment reference.
	 * @see #getMFirstPartResult()
	 * @generated
	 */
	public void setMFirstPartResult(MResult newMFirstPartResult) {
		if (newMFirstPartResult != mFirstPartResult) {
			NotificationChain msgs = null;
			if (mFirstPartResult != null)
				msgs = ((InternalEObject)mFirstPartResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, null, msgs);
			if (newMFirstPartResult != null) {				
				newMFirstPartResult.setDefaultDescription("Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'.");
				newMFirstPartResult.setDefaultName("First part");
				newMFirstPartResult.setValueType(Type.getTypeForName("Text"));
				newMFirstPartResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT));
				newMFirstPartResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFirstPartResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFirstPartResult != null) {
				if(newMFirstPartResult != null)
					newMFirstPartResult.eAdapters().addAll(mFirstPartResult.eAdapters());			
			
				mFirstPartResult.eAdapters().clear();
			}
			msgs = basicSetMFirstPartResult(newMFirstPartResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, newMFirstPartResult, newMFirstPartResult));
	}

	/**
	 * Returns the value of the '<em><b>First Part Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Part Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Part Result</em>' attribute.
	 * @see #setFirstPartResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_FirstPartResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getFirstPartResult() {
		return firstPartResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartResult <em>First Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFirstPartResult the new value of the '<em>First Part Result</em>' attribute.
	 * @see #getFirstPartResult()
	 * @generated
	 */
	public void setFirstPartResult(String newFirstPartResult) {
		String oldFirstPartResult = firstPartResult;
		firstPartResult = newFirstPartResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT, oldFirstPartResult, firstPartResult));
	}

	/**
	 * Returns the value of the '<em><b>MSecond Part Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSecond Part Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSecond Part Result</em>' containment reference.
	 * @see #setMSecondPartResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MSecondPartResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Second part' description='Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.'"
	 * @generated
	 */
	public MResult getMSecondPartResult() {
		return mSecondPartResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSecondPartResult(MResult newMSecondPartResult, NotificationChain msgs) {
		MResult oldMSecondPartResult = mSecondPartResult;
		mSecondPartResult = newMSecondPartResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT, oldMSecondPartResult, newMSecondPartResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartResult <em>MSecond Part Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSecondPartResult the new value of the '<em>MSecond Part Result</em>' containment reference.
	 * @see #getMSecondPartResult()
	 * @generated
	 */
	public void setMSecondPartResult(MResult newMSecondPartResult) {
		if (newMSecondPartResult != mSecondPartResult) {
			NotificationChain msgs = null;
			if (mSecondPartResult != null)
				msgs = ((InternalEObject)mSecondPartResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT, null, msgs);
			if (newMSecondPartResult != null) {				
				newMSecondPartResult.setDefaultDescription("Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'.");
				newMSecondPartResult.setDefaultName("Second part");
				newMSecondPartResult.setValueType(Type.getTypeForName("Text"));
				newMSecondPartResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT));
				newMSecondPartResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSecondPartResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSecondPartResult != null) {
				if(newMSecondPartResult != null)
					newMSecondPartResult.eAdapters().addAll(mSecondPartResult.eAdapters());			
			
				mSecondPartResult.eAdapters().clear();
			}
			msgs = basicSetMSecondPartResult(newMSecondPartResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT, newMSecondPartResult, newMSecondPartResult));
	}

	/**
	 * Returns the value of the '<em><b>Second Part Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Part Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Part Result</em>' attribute.
	 * @see #setSecondPartResult(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_SecondPartResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getSecondPartResult() {
		return secondPartResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartResult <em>Second Part Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSecondPartResult the new value of the '<em>Second Part Result</em>' attribute.
	 * @see #getSecondPartResult()
	 * @generated
	 */
	public void setSecondPartResult(String newSecondPartResult) {
		String oldSecondPartResult = secondPartResult;
		secondPartResult = newSecondPartResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT, oldSecondPartResult, secondPartResult));
	}

	/**
	 * Returns the value of the '<em><b>MRecording Users Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording Users Name Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording Users Name Result</em>' containment reference.
	 * @see #setMRecordingUsersNameResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_MRecordingUsersNameResult()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, oldMRecordingUsersNameResult, newMRecordingUsersNameResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}' containment reference.
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
				msgs = ((InternalEObject)mRecordingUsersNameResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, null, msgs);
			if (newMRecordingUsersNameResult != null) {				
				newMRecordingUsersNameResult.setDefaultDescription("Specifies the name of the recording user. Please enter your name.");
				newMRecordingUsersNameResult.setDefaultName("Recording user\'s name");
				newMRecordingUsersNameResult.setValueType(Type.getTypeForName("Text"));
				newMRecordingUsersNameResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT));
				newMRecordingUsersNameResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingUsersNameResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT, newMRecordingUsersNameResult, newMRecordingUsersNameResult));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep_RecordingUsersNameResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getRecordingUsersNameResult() {
		return recordingUsersNameResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT, oldRecordingUsersNameResult, recordingUsersNameResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
				return basicSetMWwxDateParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return basicSetMTitleOfTalkParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return basicSetMSpeakersNameParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
				return basicSetMFirstPartParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
				return basicSetMSecondPartParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return basicSetMRecordingUsersNameParameter(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
				return basicSetMWwxDateResult(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return basicSetMTitleOfTalkResult(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return basicSetMSpeakersNameResult(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
				return basicSetMFirstPartResult(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
				return basicSetMSecondPartResult(null, msgs);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
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
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
				return getMWwxDateParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER:
				return getWwxDateParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return getMTitleOfTalkParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				return getTitleOfTalkParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return getMSpeakersNameParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				return getSpeakersNameParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				return getSpeakersNameParameterHistoricValues();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
				return getMFirstPartParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER:
				return getFirstPartParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES:
				return getFirstPartParameterHistoricValues();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
				return getMSecondPartParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER:
				return getSecondPartParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES:
				return getSecondPartParameterHistoricValues();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return getMRecordingUsersNameParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getRecordingUsersNameParameter();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				return getRecordingUsersNameParameterHistoricValues();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
				return getMWwxDateResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT:
				return getWwxDateResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return getMTitleOfTalkResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				return getTitleOfTalkResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return getMSpeakersNameResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				return getSpeakersNameResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
				return getMFirstPartResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT:
				return getFirstPartResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
				return getMSecondPartResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT:
				return getSecondPartResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				return getMRecordingUsersNameResult();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
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
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
				setMWwxDateParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER:
				setWwxDateParameter((Date)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				setMTitleOfTalkParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				setTitleOfTalkParameter((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				setMSpeakersNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				setSpeakersNameParameter((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				getSpeakersNameParameterHistoricValues().clear();
				getSpeakersNameParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
				setMFirstPartParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER:
				setFirstPartParameter((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES:
				getFirstPartParameterHistoricValues().clear();
				getFirstPartParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
				setMSecondPartParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER:
				setSecondPartParameter((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES:
				getSecondPartParameterHistoricValues().clear();
				getSecondPartParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				setMRecordingUsersNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				setRecordingUsersNameParameter((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				getRecordingUsersNameParameterHistoricValues().clear();
				getRecordingUsersNameParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
				setMWwxDateResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT:
				setWwxDateResult((Date)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				setMTitleOfTalkResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				setTitleOfTalkResult((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				setMSpeakersNameResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				setSpeakersNameResult((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
				setMFirstPartResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT:
				setFirstPartResult((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
				setMSecondPartResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT:
				setSecondPartResult((String)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				setMRecordingUsersNameResult((MResult)newValue);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
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
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
				setMWwxDateParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER:
				setWwxDateParameter(getDefaultWwxDateParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				setMTitleOfTalkParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				setTitleOfTalkParameter(getDefaultTitleOfTalkParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				setMSpeakersNameParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				setSpeakersNameParameter(getDefaultSpeakersNameParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				getSpeakersNameParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
				setMFirstPartParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER:
				setFirstPartParameter(getDefaultFirstPartParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES:
				getFirstPartParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
				setMSecondPartParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER:
				setSecondPartParameter(getDefaultSecondPartParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES:
				getSecondPartParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				setMRecordingUsersNameParameter((MParameter)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				setRecordingUsersNameParameter(getDefaultRecordingUsersNameParameter());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				getRecordingUsersNameParameterHistoricValues().clear();
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
				setMWwxDateResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT:
				setWwxDateResult(getDefaultWwxDateResult());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				setMTitleOfTalkResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				setTitleOfTalkResult(getDefaultTitleOfTalkResult());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				setMSpeakersNameResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				setSpeakersNameResult(getDefaultSpeakersNameResult());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
				setMFirstPartResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT:
				setFirstPartResult(getDefaultFirstPartResult());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
				setMSecondPartResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT:
				setSecondPartResult(getDefaultSecondPartResult());
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				setMRecordingUsersNameResult((MResult)null);
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
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
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
				return mWwxDateParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER:
				return getDefaultWwxDateParameter() == null ? wwxDateParameter != null : !getDefaultWwxDateParameter().equals(wwxDateParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
				return mTitleOfTalkParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
				return getDefaultTitleOfTalkParameter() == null ? titleOfTalkParameter != null : !getDefaultTitleOfTalkParameter().equals(titleOfTalkParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
				return mSpeakersNameParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
				return getDefaultSpeakersNameParameter() == null ? speakersNameParameter != null : !getDefaultSpeakersNameParameter().equals(speakersNameParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
				return speakersNameParameterHistoricValues != null && !speakersNameParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
				return mFirstPartParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER:
				return getDefaultFirstPartParameter() == null ? firstPartParameter != null : !getDefaultFirstPartParameter().equals(firstPartParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES:
				return firstPartParameterHistoricValues != null && !firstPartParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
				return mSecondPartParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER:
				return getDefaultSecondPartParameter() == null ? secondPartParameter != null : !getDefaultSecondPartParameter().equals(secondPartParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES:
				return secondPartParameterHistoricValues != null && !secondPartParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
				return mRecordingUsersNameParameter != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
				return getDefaultRecordingUsersNameParameter() == null ? recordingUsersNameParameter != null : !getDefaultRecordingUsersNameParameter().equals(recordingUsersNameParameter);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
				return recordingUsersNameParameterHistoricValues != null && !recordingUsersNameParameterHistoricValues.isEmpty();
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
				return mWwxDateResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT:
				return getDefaultWwxDateResult() == null ? wwxDateResult != null : !getDefaultWwxDateResult().equals(wwxDateResult);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
				return mTitleOfTalkResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
				return getDefaultTitleOfTalkResult() == null ? titleOfTalkResult != null : !getDefaultTitleOfTalkResult().equals(titleOfTalkResult);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
				return mSpeakersNameResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
				return getDefaultSpeakersNameResult() == null ? speakersNameResult != null : !getDefaultSpeakersNameResult().equals(speakersNameResult);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
				return mFirstPartResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT:
				return getDefaultFirstPartResult() == null ? firstPartResult != null : !getDefaultFirstPartResult().equals(firstPartResult);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
				return mSecondPartResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT:
				return getDefaultSecondPartResult() == null ? secondPartResult != null : !getDefaultSecondPartResult().equals(secondPartResult);
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
				return mRecordingUsersNameResult != null;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
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
		result.append(" (wwxDateParameter: ");
		result.append(wwxDateParameter);
		result.append(", titleOfTalkParameter: ");
		result.append(titleOfTalkParameter);
		result.append(", speakersNameParameter: ");
		result.append(speakersNameParameter);
		result.append(", speakersNameParameterHistoricValues: ");
		result.append(speakersNameParameterHistoricValues);
		result.append(", firstPartParameter: ");
		result.append(firstPartParameter);
		result.append(", firstPartParameterHistoricValues: ");
		result.append(firstPartParameterHistoricValues);
		result.append(", secondPartParameter: ");
		result.append(secondPartParameter);
		result.append(", secondPartParameterHistoricValues: ");
		result.append(secondPartParameterHistoricValues);
		result.append(", recordingUsersNameParameter: ");
		result.append(recordingUsersNameParameter);
		result.append(", recordingUsersNameParameterHistoricValues: ");
		result.append(recordingUsersNameParameterHistoricValues);
		result.append(", wwxDateResult: ");
		result.append(wwxDateResult);
		result.append(", titleOfTalkResult: ");
		result.append(titleOfTalkResult);
		result.append(", speakersNameResult: ");
		result.append(speakersNameResult);
		result.append(", firstPartResult: ");
		result.append(firstPartResult);
		result.append(", secondPartResult: ");
		result.append(secondPartResult);
		result.append(", recordingUsersNameResult: ");
		result.append(recordingUsersNameResult);
		result.append(')');
		return result.toString();
	}

} // MEnterWwxInformationStep