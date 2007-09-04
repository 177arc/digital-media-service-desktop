/*
 * Revision History:
 * $Log: MPublishNewMp3Step.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.util.Date;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logic.types.MMp3StateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPublish New Mp3 Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMMp3EntryReferenceParameter <em>MMp3 Entry Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMp3EntryReferenceParameter <em>Mp3 Entry Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkTextParameter <em>MLink Text Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkTextParameter <em>Link Text Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkDescriptionParameter <em>MLink Description Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkDescriptionParameter <em>Link Description Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMCommentParameter <em>MComment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getCommentParameter <em>Comment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastTitleParameter <em>MPodcast Title Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastTitleParameter <em>Podcast Title Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSubtitleParameter <em>MPodcast Subtitle Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSubtitleParameter <em>Podcast Subtitle Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSummaryParameter <em>MPodcast Summary Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSummaryParameter <em>Podcast Summary Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastPublishingDateParameter <em>MPodcast Publishing Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastPublishingDateParameter <em>Podcast Publishing Date Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPublishedMp3EntryReferenceResult <em>MPublished Mp3 Entry Reference Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPublishedMp3EntryReferenceResult <em>Published Mp3 Entry Reference Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Publish MP3' description='Publishes a new MP3 recording to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.' actionName='Mark as completed' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MPublishNewMp3Step extends MPublishMp3sStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MPublishNewMp3Step.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MPublishNewMp3Step.TYPE_NAME, new ReferenceType("Reference to "+MPublishNewMp3Step.TYPE_NAME, "Specifies a reference to a "+MPublishNewMp3Step.TYPE_NAME_FOR_UI, MPublishNewMp3Step.class));
	}
	/**
	 * The cached value of the '{@link #getMMp3EntryReferenceParameter() <em>MMp3 Entry Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EntryReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3EntryReferenceParameter = null;

	/**
	 * The cached value of the '{@link #getMp3EntryReferenceParameter() <em>Mp3 Entry Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EntryReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MMp3 mp3EntryReferenceParameter = null;

	/**
	 * The cached value of the '{@link #getMLinkTextParameter() <em>MLink Text Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLinkTextParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mLinkTextParameter = null;

	/**
	 * The default value of the '{@link #getLinkTextParameter() <em>Link Text Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTextParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TEXT_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getLinkTextParameter() <em>Link Text Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLinkTextParameter() <em>Link Text Parameter</em>}' attribute.
	 * @see #getLinkTextParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultLinkTextParameter() {
		return LINK_TEXT_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLinkTextParameter() <em>Link Text Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTextParameter()
	 * @generated
	 * @ordered
	 */
	protected String linkTextParameter = LINK_TEXT_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMLinkDescriptionParameter() <em>MLink Description Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLinkDescriptionParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mLinkDescriptionParameter = null;

	/**
	 * The default value of the '{@link #getLinkDescriptionParameter() <em>Link Description Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptionParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTION_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLinkDescriptionParameter() <em>Link Description Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLinkDescriptionParameter() <em>Link Description Parameter</em>}' attribute.
	 * @see #getLinkDescriptionParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultLinkDescriptionParameter() {
		return LINK_DESCRIPTION_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLinkDescriptionParameter() <em>Link Description Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptionParameter()
	 * @generated
	 * @ordered
	 */
	protected String linkDescriptionParameter = LINK_DESCRIPTION_PARAMETER_EDEFAULT;
	
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
	 * The cached value of the '{@link #getMPodcastTitleParameter() <em>MPodcast Title Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastTitleParameter = null;

	/**
	 * The default value of the '{@link #getPodcastTitleParameter() <em>Podcast Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_TITLE_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastTitleParameter() <em>Podcast Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastTitleParameter() <em>Podcast Title Parameter</em>}' attribute.
	 * @see #getPodcastTitleParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastTitleParameter() {
		return PODCAST_TITLE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastTitleParameter() <em>Podcast Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected String podcastTitleParameter = PODCAST_TITLE_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPodcastSubtitleParameter() <em>MPodcast Subtitle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastSubtitleParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastSubtitleParameter = null;

	/**
	 * The default value of the '{@link #getPodcastSubtitleParameter() <em>Podcast Subtitle Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSubtitleParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_SUBTITLE_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastSubtitleParameter() <em>Podcast Subtitle Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastSubtitleParameter() <em>Podcast Subtitle Parameter</em>}' attribute.
	 * @see #getPodcastSubtitleParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastSubtitleParameter() {
		return PODCAST_SUBTITLE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastSubtitleParameter() <em>Podcast Subtitle Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSubtitleParameter()
	 * @generated
	 * @ordered
	 */
	protected String podcastSubtitleParameter = PODCAST_SUBTITLE_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPodcastSummaryParameter() <em>MPodcast Summary Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastSummaryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastSummaryParameter = null;

	/**
	 * The default value of the '{@link #getPodcastSummaryParameter() <em>Podcast Summary Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSummaryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_SUMMARY_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastSummaryParameter() <em>Podcast Summary Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastSummaryParameter() <em>Podcast Summary Parameter</em>}' attribute.
	 * @see #getPodcastSummaryParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastSummaryParameter() {
		return PODCAST_SUMMARY_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastSummaryParameter() <em>Podcast Summary Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSummaryParameter()
	 * @generated
	 * @ordered
	 */
	protected String podcastSummaryParameter = PODCAST_SUMMARY_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPodcastPublishingDateParameter() <em>MPodcast Publishing Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastPublishingDateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastPublishingDateParameter = null;

	/**
	 * The default value of the '{@link #getPodcastPublishingDateParameter() <em>Podcast Publishing Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastPublishingDateParameter()
	 * @ordered
	 */
	protected static final Date PODCAST_PUBLISHING_DATE_PARAMETER_EDEFAULT = new Date();
	
	/**
	 * Get the default value of the '{@link #getPodcastPublishingDateParameter() <em>Podcast Publishing Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastPublishingDateParameter() <em>Podcast Publishing Date Parameter</em>}' attribute.
	 * @see #getPodcastPublishingDateParameter()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultPodcastPublishingDateParameter() {
		return PODCAST_PUBLISHING_DATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastPublishingDateParameter() <em>Podcast Publishing Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastPublishingDateParameter()
	 * @generated
	 * @ordered
	 */
	protected Date podcastPublishingDateParameter = PODCAST_PUBLISHING_DATE_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPublishedMp3EntryReferenceResult() <em>MPublished Mp3 Entry Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPublishedMp3EntryReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mPublishedMp3EntryReferenceResult = null;

	/**
	 * The cached value of the '{@link #getPublishedMp3EntryReferenceResult() <em>Published Mp3 Entry Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedMp3EntryReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MMp3 publishedMp3EntryReferenceResult = null;

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
		return "Publishes a new MP3 recording to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.";
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
		return "Mark as completed";
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
		return "Publish MP3";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPublishNewMp3Step() {
		super();
		
		firstMPublishNewMp3StepConstructorHook();
				
		interruptable = false;
		terminatable = false;
		description = "Publishes a new MP3 recording to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.";
		stoppable = false;
		actionName = "Mark as completed";
		name = "Publish MP3";
					 
		setMMp3EntryReferenceParameter(new MParameter(false, "MP3 entry reference", "Speficies a reference to the MP3 entry to be published.", null));			 
		setMLinkTextParameter(new MParameter(false, "Link text", "Specifies the link text for the published MP3 file.", null));			 
		setMLinkDescriptionParameter(new MParameter(false, "Link description", "Specifies the link description for the published MP3 file. The description will be displayed underneath the link.", null));			 
		setMCommentParameter(new MParameter(false, "Comment", "Specifies a comment for the published MP3 file. This can be for example problems with the recording.", null));			 
		setMPodcastTitleParameter(new MParameter(false, "Podcast title", "Specifies the podcast title. The title will appear as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.\"", null));			 
		setMPodcastSubtitleParameter(new MParameter(false, "Podcast subtitle", "Specifies the podcast subtitle. The subtitle will appear as in the Description column in iTunes.", null));			 
		setMPodcastSummaryParameter(new MParameter(false, "Podcast summary", "Specifies the podcast summary. The summary will appear when the circled (i) in the Description column is clicked.", null));			 
		setMPodcastPublishingDateParameter(new MParameter(false, "Podcast publishing date", "Specifies the publication date of the MP3 file. The publication date will appear in the Release Date column in iTunes.", null));			 
		setMPublishedMp3EntryReferenceResult(new MResult(false, "Published MP3 entry reference", "Contains a reference to the MP3 entry that has been published.", null));

		lastMPublishNewMp3StepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMPublishNewMp3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMPublishNewMp3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Entry Reference Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Entry Reference Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Entry Reference Parameter</em>' containment reference.
	 * @see #setMMp3EntryReferenceParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MMp3EntryReferenceParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 entry reference' description='Speficies a reference to the MP3 entry to be published.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMMp3EntryReferenceParameter() {
		return mMp3EntryReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EntryReferenceParameter(MParameter newMMp3EntryReferenceParameter, NotificationChain msgs) {
		MParameter oldMMp3EntryReferenceParameter = mMp3EntryReferenceParameter;
		mMp3EntryReferenceParameter = newMMp3EntryReferenceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER, oldMMp3EntryReferenceParameter, newMMp3EntryReferenceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMMp3EntryReferenceParameter <em>MMp3 Entry Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EntryReferenceParameter the new value of the '<em>MMp3 Entry Reference Parameter</em>' containment reference.
	 * @see #getMMp3EntryReferenceParameter()
	 * @generated
	 */
	public void setMMp3EntryReferenceParameter(MParameter newMMp3EntryReferenceParameter) {
		if (newMMp3EntryReferenceParameter != mMp3EntryReferenceParameter) {
			NotificationChain msgs = null;
			if (mMp3EntryReferenceParameter != null)
				msgs = ((InternalEObject)mMp3EntryReferenceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER, null, msgs);
			if (newMMp3EntryReferenceParameter != null) {				
				newMMp3EntryReferenceParameter.setDefaultName("MP3 entry reference");
				newMMp3EntryReferenceParameter.setDefaultDescription("Speficies a reference to the MP3 entry to be published.");
				newMMp3EntryReferenceParameter.setValueType(Type.getTypeForName("Reference to "+MMp3.TYPE_NAME));
				newMMp3EntryReferenceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER));
				newMMp3EntryReferenceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EntryReferenceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EntryReferenceParameter != null) {
				if(newMMp3EntryReferenceParameter != null)
					newMMp3EntryReferenceParameter.eAdapters().addAll(mMp3EntryReferenceParameter.eAdapters());			
			
				mMp3EntryReferenceParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3EntryReferenceParameter(newMMp3EntryReferenceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER, newMMp3EntryReferenceParameter, newMMp3EntryReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Entry Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Entry Reference Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Entry Reference Parameter</em>' reference.
	 * @see #setMp3EntryReferenceParameter(MMp3)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_Mp3EntryReferenceParameter()
	 * @model required="true"
	 * @generated
	 */
	public MMp3 getMp3EntryReferenceParameter() {
		if (mp3EntryReferenceParameter != null && ((EObject)mp3EntryReferenceParameter).eIsProxy()) {
			InternalEObject oldMp3EntryReferenceParameter = (InternalEObject)mp3EntryReferenceParameter;
			mp3EntryReferenceParameter = (MMp3)eResolveProxy(oldMp3EntryReferenceParameter);
			if (mp3EntryReferenceParameter != oldMp3EntryReferenceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER, oldMp3EntryReferenceParameter, mp3EntryReferenceParameter));
			}
		}
		return mp3EntryReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3 basicGetMp3EntryReferenceParameter() {
		return mp3EntryReferenceParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMp3EntryReferenceParameter <em>Mp3 Entry Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EntryReferenceParameter the new value of the '<em>Mp3 Entry Reference Parameter</em>' reference.
	 * @see #getMp3EntryReferenceParameter()
	 * @generated
	 */
	public void setMp3EntryReferenceParameter(MMp3 newMp3EntryReferenceParameter) {
		MMp3 oldMp3EntryReferenceParameter = mp3EntryReferenceParameter;
		mp3EntryReferenceParameter = newMp3EntryReferenceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER, oldMp3EntryReferenceParameter, mp3EntryReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>MLink Text Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLink Text Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLink Text Parameter</em>' containment reference.
	 * @see #setMLinkTextParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MLinkTextParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Link text' description='Specifies the link text for the published MP3 file.'"
	 * @generated
	 */
	public MParameter getMLinkTextParameter() {
		return mLinkTextParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLinkTextParameter(MParameter newMLinkTextParameter, NotificationChain msgs) {
		MParameter oldMLinkTextParameter = mLinkTextParameter;
		mLinkTextParameter = newMLinkTextParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER, oldMLinkTextParameter, newMLinkTextParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkTextParameter <em>MLink Text Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLinkTextParameter the new value of the '<em>MLink Text Parameter</em>' containment reference.
	 * @see #getMLinkTextParameter()
	 * @generated
	 */
	public void setMLinkTextParameter(MParameter newMLinkTextParameter) {
		if (newMLinkTextParameter != mLinkTextParameter) {
			NotificationChain msgs = null;
			if (mLinkTextParameter != null)
				msgs = ((InternalEObject)mLinkTextParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER, null, msgs);
			if (newMLinkTextParameter != null) {				
				newMLinkTextParameter.setDefaultDescription("Specifies the link text for the published MP3 file.");
				newMLinkTextParameter.setDefaultName("Link text");
				newMLinkTextParameter.setValueType(Type.getTypeForName("Text"));
				newMLinkTextParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER));
				newMLinkTextParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLinkTextParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLinkTextParameter != null) {
				if(newMLinkTextParameter != null)
					newMLinkTextParameter.eAdapters().addAll(mLinkTextParameter.eAdapters());			
			
				mLinkTextParameter.eAdapters().clear();
			}
			msgs = basicSetMLinkTextParameter(newMLinkTextParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER, newMLinkTextParameter, newMLinkTextParameter));
	}

	/**
	 * Returns the value of the '<em><b>Link Text Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Text Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Text Parameter</em>' attribute.
	 * @see #setLinkTextParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_LinkTextParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getLinkTextParameter() {
		return linkTextParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkTextParameter <em>Link Text Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLinkTextParameter the new value of the '<em>Link Text Parameter</em>' attribute.
	 * @see #getLinkTextParameter()
	 * @generated
	 */
	public void setLinkTextParameter(String newLinkTextParameter) {
		String oldLinkTextParameter = linkTextParameter;
		linkTextParameter = newLinkTextParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER, oldLinkTextParameter, linkTextParameter));
	}

	/**
	 * Returns the value of the '<em><b>MLink Description Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLink Description Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLink Description Parameter</em>' containment reference.
	 * @see #setMLinkDescriptionParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MLinkDescriptionParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Link description' description='Specifies the link description for the published MP3 file. The description will be displayed underneath the link.'"
	 * @generated
	 */
	public MParameter getMLinkDescriptionParameter() {
		return mLinkDescriptionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLinkDescriptionParameter(MParameter newMLinkDescriptionParameter, NotificationChain msgs) {
		MParameter oldMLinkDescriptionParameter = mLinkDescriptionParameter;
		mLinkDescriptionParameter = newMLinkDescriptionParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER, oldMLinkDescriptionParameter, newMLinkDescriptionParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkDescriptionParameter <em>MLink Description Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLinkDescriptionParameter the new value of the '<em>MLink Description Parameter</em>' containment reference.
	 * @see #getMLinkDescriptionParameter()
	 * @generated
	 */
	public void setMLinkDescriptionParameter(MParameter newMLinkDescriptionParameter) {
		if (newMLinkDescriptionParameter != mLinkDescriptionParameter) {
			NotificationChain msgs = null;
			if (mLinkDescriptionParameter != null)
				msgs = ((InternalEObject)mLinkDescriptionParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER, null, msgs);
			if (newMLinkDescriptionParameter != null) {				
				newMLinkDescriptionParameter.setDefaultDescription("Specifies the link description for the published MP3 file. The description will be displayed underneath the link.");
				newMLinkDescriptionParameter.setDefaultName("Link description");
				newMLinkDescriptionParameter.setValueType(Type.getTypeForName("Text"));
				newMLinkDescriptionParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER));
				newMLinkDescriptionParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLinkDescriptionParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLinkDescriptionParameter != null) {
				if(newMLinkDescriptionParameter != null)
					newMLinkDescriptionParameter.eAdapters().addAll(mLinkDescriptionParameter.eAdapters());			
			
				mLinkDescriptionParameter.eAdapters().clear();
			}
			msgs = basicSetMLinkDescriptionParameter(newMLinkDescriptionParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER, newMLinkDescriptionParameter, newMLinkDescriptionParameter));
	}

	/**
	 * Returns the value of the '<em><b>Link Description Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Description Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Description Parameter</em>' attribute.
	 * @see #setLinkDescriptionParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_LinkDescriptionParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getLinkDescriptionParameter() {
		return linkDescriptionParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkDescriptionParameter <em>Link Description Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLinkDescriptionParameter the new value of the '<em>Link Description Parameter</em>' attribute.
	 * @see #getLinkDescriptionParameter()
	 * @generated
	 */
	public void setLinkDescriptionParameter(String newLinkDescriptionParameter) {
		String oldLinkDescriptionParameter = linkDescriptionParameter;
		linkDescriptionParameter = newLinkDescriptionParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER, oldLinkDescriptionParameter, linkDescriptionParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MCommentParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Comment' description='Specifies a comment for the published MP3 file. This can be for example problems with the recording.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER, oldMCommentParameter, newMCommentParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMCommentParameter <em>MComment Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mCommentParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER, null, msgs);
			if (newMCommentParameter != null) {				
				newMCommentParameter.setDefaultDescription("Specifies a comment for the published MP3 file. This can be for example problems with the recording.");
				newMCommentParameter.setDefaultName("Comment");
				newMCommentParameter.setValueType(Type.getTypeForName("Text"));
				newMCommentParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER));
				newMCommentParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMCommentParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER, newMCommentParameter, newMCommentParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_CommentParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getCommentParameter() {
		return commentParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getCommentParameter <em>Comment Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER, oldCommentParameter, commentParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Title Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Title Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Title Parameter</em>' containment reference.
	 * @see #setMPodcastTitleParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MPodcastTitleParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast title' description='Specifies the podcast title. The title will appear as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.\"'"
	 * @generated
	 */
	public MParameter getMPodcastTitleParameter() {
		return mPodcastTitleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastTitleParameter(MParameter newMPodcastTitleParameter, NotificationChain msgs) {
		MParameter oldMPodcastTitleParameter = mPodcastTitleParameter;
		mPodcastTitleParameter = newMPodcastTitleParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER, oldMPodcastTitleParameter, newMPodcastTitleParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastTitleParameter <em>MPodcast Title Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastTitleParameter the new value of the '<em>MPodcast Title Parameter</em>' containment reference.
	 * @see #getMPodcastTitleParameter()
	 * @generated
	 */
	public void setMPodcastTitleParameter(MParameter newMPodcastTitleParameter) {
		if (newMPodcastTitleParameter != mPodcastTitleParameter) {
			NotificationChain msgs = null;
			if (mPodcastTitleParameter != null)
				msgs = ((InternalEObject)mPodcastTitleParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER, null, msgs);
			if (newMPodcastTitleParameter != null) {				
				newMPodcastTitleParameter.setDefaultDescription("Specifies the podcast title. The title will appear as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.\"");
				newMPodcastTitleParameter.setDefaultName("Podcast title");
				newMPodcastTitleParameter.setValueType(Type.getTypeForName("Text"));
				newMPodcastTitleParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER));
				newMPodcastTitleParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastTitleParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastTitleParameter != null) {
				if(newMPodcastTitleParameter != null)
					newMPodcastTitleParameter.eAdapters().addAll(mPodcastTitleParameter.eAdapters());			
			
				mPodcastTitleParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastTitleParameter(newMPodcastTitleParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER, newMPodcastTitleParameter, newMPodcastTitleParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Title Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Title Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Title Parameter</em>' attribute.
	 * @see #setPodcastTitleParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_PodcastTitleParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getPodcastTitleParameter() {
		return podcastTitleParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastTitleParameter <em>Podcast Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastTitleParameter the new value of the '<em>Podcast Title Parameter</em>' attribute.
	 * @see #getPodcastTitleParameter()
	 * @generated
	 */
	public void setPodcastTitleParameter(String newPodcastTitleParameter) {
		String oldPodcastTitleParameter = podcastTitleParameter;
		podcastTitleParameter = newPodcastTitleParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER, oldPodcastTitleParameter, podcastTitleParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Subtitle Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Subtitle Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Subtitle Parameter</em>' containment reference.
	 * @see #setMPodcastSubtitleParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MPodcastSubtitleParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast subtitle' description='Specifies the podcast subtitle. The subtitle will appear as in the Description column in iTunes.'"
	 * @generated
	 */
	public MParameter getMPodcastSubtitleParameter() {
		return mPodcastSubtitleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastSubtitleParameter(MParameter newMPodcastSubtitleParameter, NotificationChain msgs) {
		MParameter oldMPodcastSubtitleParameter = mPodcastSubtitleParameter;
		mPodcastSubtitleParameter = newMPodcastSubtitleParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER, oldMPodcastSubtitleParameter, newMPodcastSubtitleParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSubtitleParameter <em>MPodcast Subtitle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastSubtitleParameter the new value of the '<em>MPodcast Subtitle Parameter</em>' containment reference.
	 * @see #getMPodcastSubtitleParameter()
	 * @generated
	 */
	public void setMPodcastSubtitleParameter(MParameter newMPodcastSubtitleParameter) {
		if (newMPodcastSubtitleParameter != mPodcastSubtitleParameter) {
			NotificationChain msgs = null;
			if (mPodcastSubtitleParameter != null)
				msgs = ((InternalEObject)mPodcastSubtitleParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER, null, msgs);
			if (newMPodcastSubtitleParameter != null) {				
				newMPodcastSubtitleParameter.setDefaultDescription("Specifies the podcast subtitle. The subtitle will appear as in the Description column in iTunes.");
				newMPodcastSubtitleParameter.setDefaultName("Podcast subtitle");
				newMPodcastSubtitleParameter.setValueType(Type.getTypeForName("Text"));
				newMPodcastSubtitleParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER));
				newMPodcastSubtitleParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastSubtitleParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastSubtitleParameter != null) {
				if(newMPodcastSubtitleParameter != null)
					newMPodcastSubtitleParameter.eAdapters().addAll(mPodcastSubtitleParameter.eAdapters());			
			
				mPodcastSubtitleParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastSubtitleParameter(newMPodcastSubtitleParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER, newMPodcastSubtitleParameter, newMPodcastSubtitleParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Subtitle Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Subtitle Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Subtitle Parameter</em>' attribute.
	 * @see #setPodcastSubtitleParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_PodcastSubtitleParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getPodcastSubtitleParameter() {
		return podcastSubtitleParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSubtitleParameter <em>Podcast Subtitle Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastSubtitleParameter the new value of the '<em>Podcast Subtitle Parameter</em>' attribute.
	 * @see #getPodcastSubtitleParameter()
	 * @generated
	 */
	public void setPodcastSubtitleParameter(String newPodcastSubtitleParameter) {
		String oldPodcastSubtitleParameter = podcastSubtitleParameter;
		podcastSubtitleParameter = newPodcastSubtitleParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER, oldPodcastSubtitleParameter, podcastSubtitleParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Summary Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Summary Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Summary Parameter</em>' containment reference.
	 * @see #setMPodcastSummaryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MPodcastSummaryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast summary' description='Specifies the podcast summary. The summary will appear when the circled (i) in the Description column is clicked.'"
	 * @generated
	 */
	public MParameter getMPodcastSummaryParameter() {
		return mPodcastSummaryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastSummaryParameter(MParameter newMPodcastSummaryParameter, NotificationChain msgs) {
		MParameter oldMPodcastSummaryParameter = mPodcastSummaryParameter;
		mPodcastSummaryParameter = newMPodcastSummaryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER, oldMPodcastSummaryParameter, newMPodcastSummaryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSummaryParameter <em>MPodcast Summary Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastSummaryParameter the new value of the '<em>MPodcast Summary Parameter</em>' containment reference.
	 * @see #getMPodcastSummaryParameter()
	 * @generated
	 */
	public void setMPodcastSummaryParameter(MParameter newMPodcastSummaryParameter) {
		if (newMPodcastSummaryParameter != mPodcastSummaryParameter) {
			NotificationChain msgs = null;
			if (mPodcastSummaryParameter != null)
				msgs = ((InternalEObject)mPodcastSummaryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER, null, msgs);
			if (newMPodcastSummaryParameter != null) {				
				newMPodcastSummaryParameter.setDefaultDescription("Specifies the podcast summary. The summary will appear when the circled (i) in the Description column is clicked.");
				newMPodcastSummaryParameter.setDefaultName("Podcast summary");
				newMPodcastSummaryParameter.setValueType(Type.getTypeForName("Text"));
				newMPodcastSummaryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER));
				newMPodcastSummaryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastSummaryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastSummaryParameter != null) {
				if(newMPodcastSummaryParameter != null)
					newMPodcastSummaryParameter.eAdapters().addAll(mPodcastSummaryParameter.eAdapters());			
			
				mPodcastSummaryParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastSummaryParameter(newMPodcastSummaryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER, newMPodcastSummaryParameter, newMPodcastSummaryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Summary Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Summary Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Summary Parameter</em>' attribute.
	 * @see #setPodcastSummaryParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_PodcastSummaryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getPodcastSummaryParameter() {
		return podcastSummaryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSummaryParameter <em>Podcast Summary Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastSummaryParameter the new value of the '<em>Podcast Summary Parameter</em>' attribute.
	 * @see #getPodcastSummaryParameter()
	 * @generated
	 */
	public void setPodcastSummaryParameter(String newPodcastSummaryParameter) {
		String oldPodcastSummaryParameter = podcastSummaryParameter;
		podcastSummaryParameter = newPodcastSummaryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER, oldPodcastSummaryParameter, podcastSummaryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Publishing Date Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Publishing Date Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Publishing Date Parameter</em>' containment reference.
	 * @see #setMPodcastPublishingDateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MPodcastPublishingDateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast publishing date' description='Specifies the publication date of the MP3 file. The publication date will appear in the Release Date column in iTunes.'"
	 * @generated
	 */
	public MParameter getMPodcastPublishingDateParameter() {
		return mPodcastPublishingDateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastPublishingDateParameter(MParameter newMPodcastPublishingDateParameter, NotificationChain msgs) {
		MParameter oldMPodcastPublishingDateParameter = mPodcastPublishingDateParameter;
		mPodcastPublishingDateParameter = newMPodcastPublishingDateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER, oldMPodcastPublishingDateParameter, newMPodcastPublishingDateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastPublishingDateParameter <em>MPodcast Publishing Date Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastPublishingDateParameter the new value of the '<em>MPodcast Publishing Date Parameter</em>' containment reference.
	 * @see #getMPodcastPublishingDateParameter()
	 * @generated
	 */
	public void setMPodcastPublishingDateParameter(MParameter newMPodcastPublishingDateParameter) {
		if (newMPodcastPublishingDateParameter != mPodcastPublishingDateParameter) {
			NotificationChain msgs = null;
			if (mPodcastPublishingDateParameter != null)
				msgs = ((InternalEObject)mPodcastPublishingDateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER, null, msgs);
			if (newMPodcastPublishingDateParameter != null) {				
				newMPodcastPublishingDateParameter.setDefaultDescription("Specifies the publication date of the MP3 file. The publication date will appear in the Release Date column in iTunes.");
				newMPodcastPublishingDateParameter.setDefaultName("Podcast publishing date");
				newMPodcastPublishingDateParameter.setValueType(Type.getTypeForName("Date and time"));
				newMPodcastPublishingDateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER));
				newMPodcastPublishingDateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastPublishingDateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastPublishingDateParameter != null) {
				if(newMPodcastPublishingDateParameter != null)
					newMPodcastPublishingDateParameter.eAdapters().addAll(mPodcastPublishingDateParameter.eAdapters());			
			
				mPodcastPublishingDateParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastPublishingDateParameter(newMPodcastPublishingDateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER, newMPodcastPublishingDateParameter, newMPodcastPublishingDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Publishing Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Publishing Date Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Publishing Date Parameter</em>' attribute.
	 * @see #setPodcastPublishingDateParameter(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_PodcastPublishingDateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime" required="true" transient="true"
	 * @generated
	 */
	public Date getPodcastPublishingDateParameter() {
		return podcastPublishingDateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastPublishingDateParameter <em>Podcast Publishing Date Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastPublishingDateParameter the new value of the '<em>Podcast Publishing Date Parameter</em>' attribute.
	 * @see #getPodcastPublishingDateParameter()
	 * @generated
	 */
	public void setPodcastPublishingDateParameter(Date newPodcastPublishingDateParameter) {
		Date oldPodcastPublishingDateParameter = podcastPublishingDateParameter;
		podcastPublishingDateParameter = newPodcastPublishingDateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER, oldPodcastPublishingDateParameter, podcastPublishingDateParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPublished Mp3 Entry Reference Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPublished Mp3 Entry Reference Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPublished Mp3 Entry Reference Result</em>' containment reference.
	 * @see #setMPublishedMp3EntryReferenceResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_MPublishedMp3EntryReferenceResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Published MP3 entry reference' description='Contains a reference to the MP3 entry that has been published.'"
	 * @generated
	 */
	public MResult getMPublishedMp3EntryReferenceResult() {
		return mPublishedMp3EntryReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPublishedMp3EntryReferenceResult(MResult newMPublishedMp3EntryReferenceResult, NotificationChain msgs) {
		MResult oldMPublishedMp3EntryReferenceResult = mPublishedMp3EntryReferenceResult;
		mPublishedMp3EntryReferenceResult = newMPublishedMp3EntryReferenceResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT, oldMPublishedMp3EntryReferenceResult, newMPublishedMp3EntryReferenceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPublishedMp3EntryReferenceResult <em>MPublished Mp3 Entry Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPublishedMp3EntryReferenceResult the new value of the '<em>MPublished Mp3 Entry Reference Result</em>' containment reference.
	 * @see #getMPublishedMp3EntryReferenceResult()
	 * @generated
	 */
	public void setMPublishedMp3EntryReferenceResult(MResult newMPublishedMp3EntryReferenceResult) {
		if (newMPublishedMp3EntryReferenceResult != mPublishedMp3EntryReferenceResult) {
			NotificationChain msgs = null;
			if (mPublishedMp3EntryReferenceResult != null)
				msgs = ((InternalEObject)mPublishedMp3EntryReferenceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT, null, msgs);
			if (newMPublishedMp3EntryReferenceResult != null) {				
				newMPublishedMp3EntryReferenceResult.setDefaultDescription("Contains a reference to the MP3 entry that has been published.");
				newMPublishedMp3EntryReferenceResult.setDefaultName("Published MP3 entry reference");
				newMPublishedMp3EntryReferenceResult.setValueType(Type.getTypeForName("Reference to "+MMp3.TYPE_NAME));
				newMPublishedMp3EntryReferenceResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT));
				newMPublishedMp3EntryReferenceResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPublishedMp3EntryReferenceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPublishedMp3EntryReferenceResult != null) {
				if(newMPublishedMp3EntryReferenceResult != null)
					newMPublishedMp3EntryReferenceResult.eAdapters().addAll(mPublishedMp3EntryReferenceResult.eAdapters());			
			
				mPublishedMp3EntryReferenceResult.eAdapters().clear();
			}
			msgs = basicSetMPublishedMp3EntryReferenceResult(newMPublishedMp3EntryReferenceResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT, newMPublishedMp3EntryReferenceResult, newMPublishedMp3EntryReferenceResult));
	}

	/**
	 * Returns the value of the '<em><b>Published Mp3 Entry Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published Mp3 Entry Reference Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Mp3 Entry Reference Result</em>' reference.
	 * @see #setPublishedMp3EntryReferenceResult(MMp3)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step_PublishedMp3EntryReferenceResult()
	 * @model required="true" transient="true"
	 * @generated
	 */
	public MMp3 getPublishedMp3EntryReferenceResult() {
		if (publishedMp3EntryReferenceResult != null && ((EObject)publishedMp3EntryReferenceResult).eIsProxy()) {
			InternalEObject oldPublishedMp3EntryReferenceResult = (InternalEObject)publishedMp3EntryReferenceResult;
			publishedMp3EntryReferenceResult = (MMp3)eResolveProxy(oldPublishedMp3EntryReferenceResult);
			if (publishedMp3EntryReferenceResult != oldPublishedMp3EntryReferenceResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT, oldPublishedMp3EntryReferenceResult, publishedMp3EntryReferenceResult));
			}
		}
		return publishedMp3EntryReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3 basicGetPublishedMp3EntryReferenceResult() {
		return publishedMp3EntryReferenceResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPublishedMp3EntryReferenceResult <em>Published Mp3 Entry Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPublishedMp3EntryReferenceResult the new value of the '<em>Published Mp3 Entry Reference Result</em>' reference.
	 * @see #getPublishedMp3EntryReferenceResult()
	 * @generated
	 */
	public void setPublishedMp3EntryReferenceResult(MMp3 newPublishedMp3EntryReferenceResult) {
		MMp3 oldPublishedMp3EntryReferenceResult = publishedMp3EntryReferenceResult;
		publishedMp3EntryReferenceResult = newPublishedMp3EntryReferenceResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT, oldPublishedMp3EntryReferenceResult, publishedMp3EntryReferenceResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:
				return basicSetMMp3EntryReferenceParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:
				return basicSetMLinkTextParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:
				return basicSetMLinkDescriptionParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:
				return basicSetMCommentParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:
				return basicSetMPodcastTitleParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:
				return basicSetMPodcastSubtitleParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:
				return basicSetMPodcastSummaryParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:
				return basicSetMPodcastPublishingDateParameter(null, msgs);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				return basicSetMPublishedMp3EntryReferenceResult(null, msgs);
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
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:
				return getMMp3EntryReferenceParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER:
				if (resolve) return getMp3EntryReferenceParameter();
				return basicGetMp3EntryReferenceParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:
				return getMLinkTextParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER:
				return getLinkTextParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:
				return getMLinkDescriptionParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER:
				return getLinkDescriptionParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:
				return getMCommentParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER:
				return getCommentParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:
				return getMPodcastTitleParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER:
				return getPodcastTitleParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:
				return getMPodcastSubtitleParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER:
				return getPodcastSubtitleParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:
				return getMPodcastSummaryParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER:
				return getPodcastSummaryParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:
				return getMPodcastPublishingDateParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER:
				return getPodcastPublishingDateParameter();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				return getMPublishedMp3EntryReferenceResult();
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				if (resolve) return getPublishedMp3EntryReferenceResult();
				return basicGetPublishedMp3EntryReferenceResult();
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
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:    
				setMMp3EntryReferenceParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER:    
				setMp3EntryReferenceParameter((MMp3)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:    
				setMLinkTextParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER:    
				setLinkTextParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:    
				setMLinkDescriptionParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER:    
				setLinkDescriptionParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:    
				setMCommentParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER:    
				setCommentParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:    
				setMPodcastTitleParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER:    
				setPodcastTitleParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:    
				setMPodcastSubtitleParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER:    
				setPodcastSubtitleParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:    
				setMPodcastSummaryParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER:    
				setPodcastSummaryParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:    
				setMPodcastPublishingDateParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER:    
				setPodcastPublishingDateParameter((Date)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:    
				setMPublishedMp3EntryReferenceResult((MResult)newValue);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT:    
				setPublishedMp3EntryReferenceResult((MMp3)newValue);
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
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:
				setMMp3EntryReferenceParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER:
				setMp3EntryReferenceParameter((MMp3)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:
				setMLinkTextParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER:
				setLinkTextParameter(getDefaultLinkTextParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:
				setMLinkDescriptionParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER:
				setLinkDescriptionParameter(getDefaultLinkDescriptionParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:
				setMCommentParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER:
				setCommentParameter(getDefaultCommentParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:
				setMPodcastTitleParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER:
				setPodcastTitleParameter(getDefaultPodcastTitleParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:
				setMPodcastSubtitleParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER:
				setPodcastSubtitleParameter(getDefaultPodcastSubtitleParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:
				setMPodcastSummaryParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER:
				setPodcastSummaryParameter(getDefaultPodcastSummaryParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:
				setMPodcastPublishingDateParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER:
				setPodcastPublishingDateParameter(getDefaultPodcastPublishingDateParameter());
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				setMPublishedMp3EntryReferenceResult((MResult)null);
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				setPublishedMp3EntryReferenceResult((MMp3)null);
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
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:
				return mMp3EntryReferenceParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER:
				return mp3EntryReferenceParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:
				return mLinkTextParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER:
				return getDefaultLinkTextParameter() == null ? linkTextParameter != null : !getDefaultLinkTextParameter().equals(linkTextParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:
				return mLinkDescriptionParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER:
				return getDefaultLinkDescriptionParameter() == null ? linkDescriptionParameter != null : !getDefaultLinkDescriptionParameter().equals(linkDescriptionParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:
				return mCommentParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER:
				return getDefaultCommentParameter() == null ? commentParameter != null : !getDefaultCommentParameter().equals(commentParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:
				return mPodcastTitleParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER:
				return getDefaultPodcastTitleParameter() == null ? podcastTitleParameter != null : !getDefaultPodcastTitleParameter().equals(podcastTitleParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:
				return mPodcastSubtitleParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER:
				return getDefaultPodcastSubtitleParameter() == null ? podcastSubtitleParameter != null : !getDefaultPodcastSubtitleParameter().equals(podcastSubtitleParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:
				return mPodcastSummaryParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER:
				return getDefaultPodcastSummaryParameter() == null ? podcastSummaryParameter != null : !getDefaultPodcastSummaryParameter().equals(podcastSummaryParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:
				return mPodcastPublishingDateParameter != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER:
				return getDefaultPodcastPublishingDateParameter() == null ? podcastPublishingDateParameter != null : !getDefaultPodcastPublishingDateParameter().equals(podcastPublishingDateParameter);
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				return mPublishedMp3EntryReferenceResult != null;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				return publishedMp3EntryReferenceResult != null;
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
		result.append(" (linkTextParameter: ");
		result.append(linkTextParameter);
		result.append(", linkDescriptionParameter: ");
		result.append(linkDescriptionParameter);
		result.append(", commentParameter: ");
		result.append(commentParameter);
		result.append(", podcastTitleParameter: ");
		result.append(podcastTitleParameter);
		result.append(", podcastSubtitleParameter: ");
		result.append(podcastSubtitleParameter);
		result.append(", podcastSummaryParameter: ");
		result.append(podcastSummaryParameter);
		result.append(", podcastPublishingDateParameter: ");
		result.append(podcastPublishingDateParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {
		if(getMLinkTextParameter().equals(mOwnerValue) || getMPodcastTitleParameter().equals(mOwnerValue)) {
            String[] texts = new String[2];
            texts[0] = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
            texts[1] = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
            
            String text = Utilities.concatenate(texts, " - ");
            if(text == null)
                return(null);
            
            return text;
            
        }
		else if(getMLinkDescriptionParameter().equals(mOwnerValue) || getMPodcastSubtitleParameter().equals(mOwnerValue)) {
            String[] texts = new String[3];
            texts[0] = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
            texts[1] = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
            texts[2] = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT);
            
            String text = Utilities.concatenate(texts, " - ");
            if(text == null)
                return(null);
            
            return text;
         }
		else
			return super.convertMInputValues(mOwnerValue);	
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#executeFtpOperationsHook(FTPClient)
	 */
	@Override
	protected void executeFtpOperationsHook(FTPClient ftpClient) throws Throwable {
		// Sets the MP3 entry properties.
		getMp3EntryReferenceParameter().setStateProperty(MMp3StateType.TO_BE_PUBLISHED_STATE); // TODO: Pass MP3 entry as parameter to publishMp3s instead of setting state.
		getMp3EntryReferenceParameter().setLinkTextProperty(getLinkTextParameter());
		getMp3EntryReferenceParameter().setLinkDescriptionProperty(getLinkDescriptionParameter());
		getMp3EntryReferenceParameter().setCommentProperty(getCommentParameter());
		getMp3EntryReferenceParameter().setPodcastTitleProperty(getPodcastTitleParameter());
		getMp3EntryReferenceParameter().setPodcastSubtitleProperty(getPodcastSubtitleParameter());
		getMp3EntryReferenceParameter().setPodcastSummaryProperty(getPodcastSummaryParameter());
		getMp3EntryReferenceParameter().setPodcastPublishingDateProperty(getPodcastPublishingDateParameter());
		getMp3EntryReferenceParameter().setPublishedFileNameProperty(getMp3EntryReferenceParameter().getFileProperty().getName());
		
		// Publishes the MP3 entry.
		publishMp3s(ftpClient, (MMp3Folder) getMp3EntryReferenceParameter().eContainer(), false);
		
		// Sets the result.
		setPublishedMp3EntryReferenceResult(getMp3EntryReferenceParameter());
	}
} // MPublishNewMp3Step