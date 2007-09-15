/*
 * Revision History:
 * $Log: MMp3.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:26  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMp3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getStateProperty <em>State Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMFileProperty <em>MFile Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getFileProperty <em>File Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkTextProperty <em>MLink Text Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getLinkTextProperty <em>Link Text Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkDescriptionProperty <em>MLink Description Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getLinkDescriptionProperty <em>Link Description Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMCommentProperty <em>MComment Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getCommentProperty <em>Comment Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastTitleProperty <em>MPodcast Title Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastTitleProperty <em>Podcast Title Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSubtitleProperty <em>MPodcast Subtitle Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSubtitleProperty <em>Podcast Subtitle Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSummaryProperty <em>MPodcast Summary Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSummaryProperty <em>Podcast Summary Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastPublishingDateProperty <em>MPodcast Publishing Date Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastPublishingDateProperty <em>Podcast Publishing Date Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getMPublishedFileNameProperty <em>MPublished File Name Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3#getPublishedFileNameProperty <em>Published File Name Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='MP3' name='MP3' description='Contains all information associated with an MP3 file that can be published.' iconFilePath='Image Files/MP3.gif'"
 * @generated
 */
public class MMp3 extends MStatefulObject {
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "MP3";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MMp3.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MMp3.TYPE_NAME, new ReferenceType("Reference to "+MMp3.TYPE_NAME, "Specifies a reference to a "+MMp3.TYPE_NAME_FOR_UI, MMp3.class));
	}


























































































































	/**
	 * The default value of the '{@link #getStateProperty() <em>State Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_PROPERTY_EDEFAULT = (State)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMMp3State(), "Not published");

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
	 * The cached value of the '{@link #getMFileProperty() <em>MFile Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFileProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mFileProperty = null;

	/**
	 * The default value of the '{@link #getFileProperty() <em>File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File FILE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getFileProperty() <em>File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getFileProperty() <em>File Property</em>}' attribute.
	 * @see #getFileProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultFileProperty() {
		return FILE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getFileProperty() <em>File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileProperty()
	 * @generated
	 * @ordered
	 */
	protected File fileProperty = FILE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMLinkTextProperty() <em>MLink Text Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLinkTextProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLinkTextProperty = null;

	/**
	 * The default value of the '{@link #getLinkTextProperty() <em>Link Text Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTextProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TEXT_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLinkTextProperty() <em>Link Text Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLinkTextProperty() <em>Link Text Property</em>}' attribute.
	 * @see #getLinkTextProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultLinkTextProperty() {
		return LINK_TEXT_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLinkTextProperty() <em>Link Text Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTextProperty()
	 * @generated
	 * @ordered
	 */
	protected String linkTextProperty = LINK_TEXT_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMLinkDescriptionProperty() <em>MLink Description Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLinkDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLinkDescriptionProperty = null;

	/**
	 * The default value of the '{@link #getLinkDescriptionProperty() <em>Link Description Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTION_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getLinkDescriptionProperty() <em>Link Description Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLinkDescriptionProperty() <em>Link Description Property</em>}' attribute.
	 * @see #getLinkDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultLinkDescriptionProperty() {
		return LINK_DESCRIPTION_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLinkDescriptionProperty() <em>Link Description Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	protected String linkDescriptionProperty = LINK_DESCRIPTION_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMCommentProperty() <em>MComment Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCommentProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mCommentProperty = null;

	/**
	 * The default value of the '{@link #getCommentProperty() <em>Comment Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getCommentProperty() <em>Comment Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getCommentProperty() <em>Comment Property</em>}' attribute.
	 * @see #getCommentProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultCommentProperty() {
		return COMMENT_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getCommentProperty() <em>Comment Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentProperty()
	 * @generated
	 * @ordered
	 */
	protected String commentProperty = COMMENT_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastTitleProperty() <em>MPodcast Title Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastTitleProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPodcastTitleProperty = null;

	/**
	 * The default value of the '{@link #getPodcastTitleProperty() <em>Podcast Title Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastTitleProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_TITLE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPodcastTitleProperty() <em>Podcast Title Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastTitleProperty() <em>Podcast Title Property</em>}' attribute.
	 * @see #getPodcastTitleProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastTitleProperty() {
		return PODCAST_TITLE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastTitleProperty() <em>Podcast Title Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastTitleProperty()
	 * @generated
	 * @ordered
	 */
	protected String podcastTitleProperty = PODCAST_TITLE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastSubtitleProperty() <em>MPodcast Subtitle Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastSubtitleProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPodcastSubtitleProperty = null;

	/**
	 * The default value of the '{@link #getPodcastSubtitleProperty() <em>Podcast Subtitle Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSubtitleProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_SUBTITLE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPodcastSubtitleProperty() <em>Podcast Subtitle Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastSubtitleProperty() <em>Podcast Subtitle Property</em>}' attribute.
	 * @see #getPodcastSubtitleProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastSubtitleProperty() {
		return PODCAST_SUBTITLE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastSubtitleProperty() <em>Podcast Subtitle Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSubtitleProperty()
	 * @generated
	 * @ordered
	 */
	protected String podcastSubtitleProperty = PODCAST_SUBTITLE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastSummaryProperty() <em>MPodcast Summary Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastSummaryProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPodcastSummaryProperty = null;

	/**
	 * The default value of the '{@link #getPodcastSummaryProperty() <em>Podcast Summary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSummaryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_SUMMARY_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPodcastSummaryProperty() <em>Podcast Summary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastSummaryProperty() <em>Podcast Summary Property</em>}' attribute.
	 * @see #getPodcastSummaryProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastSummaryProperty() {
		return PODCAST_SUMMARY_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastSummaryProperty() <em>Podcast Summary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastSummaryProperty()
	 * @generated
	 * @ordered
	 */
	protected String podcastSummaryProperty = PODCAST_SUMMARY_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastPublishingDateProperty() <em>MPodcast Publishing Date Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastPublishingDateProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPodcastPublishingDateProperty = null;

	/**
	 * The default value of the '{@link #getPodcastPublishingDateProperty() <em>Podcast Publishing Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastPublishingDateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Date PODCAST_PUBLISHING_DATE_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPodcastPublishingDateProperty() <em>Podcast Publishing Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastPublishingDateProperty() <em>Podcast Publishing Date Property</em>}' attribute.
	 * @see #getPodcastPublishingDateProperty()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultPodcastPublishingDateProperty() {
		return PODCAST_PUBLISHING_DATE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastPublishingDateProperty() <em>Podcast Publishing Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastPublishingDateProperty()
	 * @generated
	 * @ordered
	 */
	protected Date podcastPublishingDateProperty = PODCAST_PUBLISHING_DATE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPublishedFileNameProperty() <em>MPublished File Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPublishedFileNameProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPublishedFileNameProperty = null;

	/**
	 * The default value of the '{@link #getPublishedFileNameProperty() <em>Published File Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedFileNameProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHED_FILE_NAME_PROPERTY_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPublishedFileNameProperty() <em>Published File Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPublishedFileNameProperty() <em>Published File Name Property</em>}' attribute.
	 * @see #getPublishedFileNameProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPublishedFileNameProperty() {
		return PUBLISHED_FILE_NAME_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPublishedFileNameProperty() <em>Published File Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedFileNameProperty()
	 * @generated
	 * @ordered
	 */
	protected String publishedFileNameProperty = PUBLISHED_FILE_NAME_PROPERTY_EDEFAULT;

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
		return "MP3";
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
		return "Contains all information associated with an MP3 file that can be published.";
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
		return "MP3";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/MP3.gif");
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMp3() {
		super();
		
		firstMMp3ConstructorHook();
				
		typeNameForUI = "MP3";
		description = "Contains all information associated with an MP3 file that can be published.";
		name = "MP3";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/MP3.gif");
					 
		setMStateProperty(new MProperty(true, "State", "Specifies the current state.", null));			 
		setMFileProperty(new MProperty(false, "File", "Specifies the MP3 recording file on this computer.", null));			 
		setMLinkTextProperty(new MProperty(false, "Link text", "Specifies the link text for the published MP3 file.", null));			 
		setMLinkDescriptionProperty(new MProperty(false, "Link description", "Specifies the link description for the published MP3 file. The description will be displayed underneath the link.", null));			 
		setMCommentProperty(new MProperty(false, "Comment", "Specifies a comment for the published MP3 file. This can be for example problems with the recording.", null));			 
		setMPodcastTitleProperty(new MProperty(false, "Podcast title", "Specifies the podcast title. The title appears as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.", null));			 
		setMPodcastSubtitleProperty(new MProperty(false, "Podcast subtitle", "Specifies the podcast subtitle. The subtitle appears as in the Description column in iTunes.", null));			 
		setMPodcastSummaryProperty(new MProperty(false, "Podcast summary", "Specifies the podcast summary. The summary appears  when the circled (i) in the Description column is clicked.", null));			 
		setMPodcastPublishingDateProperty(new MProperty(false, "Podcast publishing date", "Specifies the publishing date of the MP3 file. The publishing date appears in the Release Date column in iTunes.", null));			 
		setMPublishedFileNameProperty(new MProperty(false, "Published file name", "Specifies the name of published file on the FTP server.", null));

		lastMMp3ConstructorHook();		
	}
	
		/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMMp3ConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
		/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMMp3ConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MMP3;
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
			newMStateProperty.setValueType(Type.getTypeForName("MP3 state"));
			newMStateProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__STATE_PROPERTY));
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
	 * Returns the value of the '<em><b>State Property</b></em>' attribute.
	 * The default value is <code>"Not published"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Property</em>' attribute.
	 * @see #setStateProperty(State)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_StateProperty()
	 * @model default="Not published" dataType="org.onceforall.dms.desktop.logic.MMp3State" required="true"
	 * @generated
	 */
	public State getStateProperty() {
		return stateProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getStateProperty <em>State Property</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__STATE_PROPERTY, oldStateProperty, stateProperty));
	}

	/**
	 * Returns the value of the '<em><b>MFile Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFile Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFile Property</em>' containment reference.
	 * @see #setMFileProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MFileProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='File' description='Specifies the MP3 recording file on this computer.'"
	 * @generated
	 */
	public MProperty getMFileProperty() {
		return mFileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFileProperty(MProperty newMFileProperty, NotificationChain msgs) {
		MProperty oldMFileProperty = mFileProperty;
		mFileProperty = newMFileProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MFILE_PROPERTY, oldMFileProperty, newMFileProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMFileProperty <em>MFile Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMFileProperty the new value of the '<em>MFile Property</em>' containment reference.
	 * @see #getMFileProperty()
	 * @generated
	 */
	public void setMFileProperty(MProperty newMFileProperty) {
		if (newMFileProperty != mFileProperty) {
			NotificationChain msgs = null;
			if (mFileProperty != null)
				msgs = ((InternalEObject)mFileProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MFILE_PROPERTY, null, msgs);
			if (newMFileProperty != null) {				
				newMFileProperty.setDefaultDescription("Specifies the MP3 recording file on this computer.");
				newMFileProperty.setDefaultName("File");
				newMFileProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMFileProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__FILE_PROPERTY));
				newMFileProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMFileProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MFILE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mFileProperty != null) {
				if(newMFileProperty != null)
					newMFileProperty.eAdapters().addAll(mFileProperty.eAdapters());			
			
				mFileProperty.eAdapters().clear();
			}
			msgs = basicSetMFileProperty(newMFileProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MFILE_PROPERTY, newMFileProperty, newMFileProperty));
	}

	/**
	 * Returns the value of the '<em><b>File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Property</em>' attribute.
	 * @see #setFileProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_FileProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getFileProperty() {
		return fileProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getFileProperty <em>File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newFileProperty the new value of the '<em>File Property</em>' attribute.
	 * @see #getFileProperty()
	 * @generated
	 */
	public void setFileProperty(File newFileProperty) {
		File oldFileProperty = fileProperty;
		fileProperty = newFileProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__FILE_PROPERTY, oldFileProperty, fileProperty));
	}

	/**
	 * Returns the value of the '<em><b>MLink Text Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLink Text Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLink Text Property</em>' containment reference.
	 * @see #setMLinkTextProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MLinkTextProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Link text' description='Specifies the link text for the published MP3 file.'"
	 * @generated
	 */
	public MProperty getMLinkTextProperty() {
		return mLinkTextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLinkTextProperty(MProperty newMLinkTextProperty, NotificationChain msgs) {
		MProperty oldMLinkTextProperty = mLinkTextProperty;
		mLinkTextProperty = newMLinkTextProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MLINK_TEXT_PROPERTY, oldMLinkTextProperty, newMLinkTextProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkTextProperty <em>MLink Text Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLinkTextProperty the new value of the '<em>MLink Text Property</em>' containment reference.
	 * @see #getMLinkTextProperty()
	 * @generated
	 */
	public void setMLinkTextProperty(MProperty newMLinkTextProperty) {
		if (newMLinkTextProperty != mLinkTextProperty) {
			NotificationChain msgs = null;
			if (mLinkTextProperty != null)
				msgs = ((InternalEObject)mLinkTextProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MLINK_TEXT_PROPERTY, null, msgs);
			if (newMLinkTextProperty != null) {				
				newMLinkTextProperty.setDefaultDescription("Specifies the link text for the published MP3 file.");
				newMLinkTextProperty.setDefaultName("Link text");
				newMLinkTextProperty.setValueType(Type.getTypeForName("Text"));
				newMLinkTextProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__LINK_TEXT_PROPERTY));
				newMLinkTextProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLinkTextProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MLINK_TEXT_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLinkTextProperty != null) {
				if(newMLinkTextProperty != null)
					newMLinkTextProperty.eAdapters().addAll(mLinkTextProperty.eAdapters());			
			
				mLinkTextProperty.eAdapters().clear();
			}
			msgs = basicSetMLinkTextProperty(newMLinkTextProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MLINK_TEXT_PROPERTY, newMLinkTextProperty, newMLinkTextProperty));
	}

	/**
	 * Returns the value of the '<em><b>Link Text Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Text Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Text Property</em>' attribute.
	 * @see #setLinkTextProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_LinkTextProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getLinkTextProperty() {
		return linkTextProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getLinkTextProperty <em>Link Text Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLinkTextProperty the new value of the '<em>Link Text Property</em>' attribute.
	 * @see #getLinkTextProperty()
	 * @generated
	 */
	public void setLinkTextProperty(String newLinkTextProperty) {
		String oldLinkTextProperty = linkTextProperty;
		linkTextProperty = newLinkTextProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__LINK_TEXT_PROPERTY, oldLinkTextProperty, linkTextProperty));
	}

	/**
	 * Returns the value of the '<em><b>MLink Description Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLink Description Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLink Description Property</em>' containment reference.
	 * @see #setMLinkDescriptionProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MLinkDescriptionProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Link description' description='Specifies the link description for the published MP3 file. The description will be displayed underneath the link.'"
	 * @generated
	 */
	public MProperty getMLinkDescriptionProperty() {
		return mLinkDescriptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLinkDescriptionProperty(MProperty newMLinkDescriptionProperty, NotificationChain msgs) {
		MProperty oldMLinkDescriptionProperty = mLinkDescriptionProperty;
		mLinkDescriptionProperty = newMLinkDescriptionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY, oldMLinkDescriptionProperty, newMLinkDescriptionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkDescriptionProperty <em>MLink Description Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLinkDescriptionProperty the new value of the '<em>MLink Description Property</em>' containment reference.
	 * @see #getMLinkDescriptionProperty()
	 * @generated
	 */
	public void setMLinkDescriptionProperty(MProperty newMLinkDescriptionProperty) {
		if (newMLinkDescriptionProperty != mLinkDescriptionProperty) {
			NotificationChain msgs = null;
			if (mLinkDescriptionProperty != null)
				msgs = ((InternalEObject)mLinkDescriptionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY, null, msgs);
			if (newMLinkDescriptionProperty != null) {				
				newMLinkDescriptionProperty.setDefaultDescription("Specifies the link description for the published MP3 file. The description will be displayed underneath the link.");
				newMLinkDescriptionProperty.setDefaultName("Link description");
				newMLinkDescriptionProperty.setValueType(Type.getTypeForName("Text"));
				newMLinkDescriptionProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY));
				newMLinkDescriptionProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLinkDescriptionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLinkDescriptionProperty != null) {
				if(newMLinkDescriptionProperty != null)
					newMLinkDescriptionProperty.eAdapters().addAll(mLinkDescriptionProperty.eAdapters());			
			
				mLinkDescriptionProperty.eAdapters().clear();
			}
			msgs = basicSetMLinkDescriptionProperty(newMLinkDescriptionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY, newMLinkDescriptionProperty, newMLinkDescriptionProperty));
	}

	/**
	 * Returns the value of the '<em><b>Link Description Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Description Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Description Property</em>' attribute.
	 * @see #setLinkDescriptionProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_LinkDescriptionProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getLinkDescriptionProperty() {
		return linkDescriptionProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getLinkDescriptionProperty <em>Link Description Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLinkDescriptionProperty the new value of the '<em>Link Description Property</em>' attribute.
	 * @see #getLinkDescriptionProperty()
	 * @generated
	 */
	public void setLinkDescriptionProperty(String newLinkDescriptionProperty) {
		String oldLinkDescriptionProperty = linkDescriptionProperty;
		linkDescriptionProperty = newLinkDescriptionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY, oldLinkDescriptionProperty, linkDescriptionProperty));
	}

	/**
	 * Returns the value of the '<em><b>MComment Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MComment Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MComment Property</em>' containment reference.
	 * @see #setMCommentProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MCommentProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Comment' description='Specifies a comment for the published MP3 file. This can be for example problems with the recording.'"
	 * @generated
	 */
	public MProperty getMCommentProperty() {
		return mCommentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCommentProperty(MProperty newMCommentProperty, NotificationChain msgs) {
		MProperty oldMCommentProperty = mCommentProperty;
		mCommentProperty = newMCommentProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MCOMMENT_PROPERTY, oldMCommentProperty, newMCommentProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMCommentProperty <em>MComment Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMCommentProperty the new value of the '<em>MComment Property</em>' containment reference.
	 * @see #getMCommentProperty()
	 * @generated
	 */
	public void setMCommentProperty(MProperty newMCommentProperty) {
		if (newMCommentProperty != mCommentProperty) {
			NotificationChain msgs = null;
			if (mCommentProperty != null)
				msgs = ((InternalEObject)mCommentProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MCOMMENT_PROPERTY, null, msgs);
			if (newMCommentProperty != null) {				
				newMCommentProperty.setDefaultDescription("Specifies a comment for the published MP3 file. This can be for example problems with the recording.");
				newMCommentProperty.setDefaultName("Comment");
				newMCommentProperty.setValueType(Type.getTypeForName("Text"));
				newMCommentProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__COMMENT_PROPERTY));
				newMCommentProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMCommentProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MCOMMENT_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mCommentProperty != null) {
				if(newMCommentProperty != null)
					newMCommentProperty.eAdapters().addAll(mCommentProperty.eAdapters());			
			
				mCommentProperty.eAdapters().clear();
			}
			msgs = basicSetMCommentProperty(newMCommentProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MCOMMENT_PROPERTY, newMCommentProperty, newMCommentProperty));
	}

	/**
	 * Returns the value of the '<em><b>Comment Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Property</em>' attribute.
	 * @see #setCommentProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_CommentProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getCommentProperty() {
		return commentProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getCommentProperty <em>Comment Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newCommentProperty the new value of the '<em>Comment Property</em>' attribute.
	 * @see #getCommentProperty()
	 * @generated
	 */
	public void setCommentProperty(String newCommentProperty) {
		String oldCommentProperty = commentProperty;
		commentProperty = newCommentProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__COMMENT_PROPERTY, oldCommentProperty, commentProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Title Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Title Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Title Property</em>' containment reference.
	 * @see #setMPodcastTitleProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MPodcastTitleProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast title' description='Specifies the podcast title. The title appears as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.' readOnly='false'"
	 * @generated
	 */
	public MProperty getMPodcastTitleProperty() {
		return mPodcastTitleProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastTitleProperty(MProperty newMPodcastTitleProperty, NotificationChain msgs) {
		MProperty oldMPodcastTitleProperty = mPodcastTitleProperty;
		mPodcastTitleProperty = newMPodcastTitleProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY, oldMPodcastTitleProperty, newMPodcastTitleProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastTitleProperty <em>MPodcast Title Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastTitleProperty the new value of the '<em>MPodcast Title Property</em>' containment reference.
	 * @see #getMPodcastTitleProperty()
	 * @generated
	 */
	public void setMPodcastTitleProperty(MProperty newMPodcastTitleProperty) {
		if (newMPodcastTitleProperty != mPodcastTitleProperty) {
			NotificationChain msgs = null;
			if (mPodcastTitleProperty != null)
				msgs = ((InternalEObject)mPodcastTitleProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY, null, msgs);
			if (newMPodcastTitleProperty != null) {				
				newMPodcastTitleProperty.setDefaultName("Podcast title");
				newMPodcastTitleProperty.setDefaultDescription("Specifies the podcast title. The title appears as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.");
				newMPodcastTitleProperty.setValueType(Type.getTypeForName("Text"));
				newMPodcastTitleProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__PODCAST_TITLE_PROPERTY));
				newMPodcastTitleProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastTitleProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastTitleProperty != null) {
				if(newMPodcastTitleProperty != null)
					newMPodcastTitleProperty.eAdapters().addAll(mPodcastTitleProperty.eAdapters());			
			
				mPodcastTitleProperty.eAdapters().clear();
			}
			msgs = basicSetMPodcastTitleProperty(newMPodcastTitleProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY, newMPodcastTitleProperty, newMPodcastTitleProperty));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Title Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Title Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Title Property</em>' attribute.
	 * @see #setPodcastTitleProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_PodcastTitleProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getPodcastTitleProperty() {
		return podcastTitleProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastTitleProperty <em>Podcast Title Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastTitleProperty the new value of the '<em>Podcast Title Property</em>' attribute.
	 * @see #getPodcastTitleProperty()
	 * @generated
	 */
	public void setPodcastTitleProperty(String newPodcastTitleProperty) {
		String oldPodcastTitleProperty = podcastTitleProperty;
		podcastTitleProperty = newPodcastTitleProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__PODCAST_TITLE_PROPERTY, oldPodcastTitleProperty, podcastTitleProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Subtitle Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Subtitle Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Subtitle Property</em>' containment reference.
	 * @see #setMPodcastSubtitleProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MPodcastSubtitleProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast subtitle' description='Specifies the podcast subtitle. The subtitle appears as in the Description column in iTunes.' readOnly='false'"
	 * @generated
	 */
	public MProperty getMPodcastSubtitleProperty() {
		return mPodcastSubtitleProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastSubtitleProperty(MProperty newMPodcastSubtitleProperty, NotificationChain msgs) {
		MProperty oldMPodcastSubtitleProperty = mPodcastSubtitleProperty;
		mPodcastSubtitleProperty = newMPodcastSubtitleProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY, oldMPodcastSubtitleProperty, newMPodcastSubtitleProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSubtitleProperty <em>MPodcast Subtitle Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastSubtitleProperty the new value of the '<em>MPodcast Subtitle Property</em>' containment reference.
	 * @see #getMPodcastSubtitleProperty()
	 * @generated
	 */
	public void setMPodcastSubtitleProperty(MProperty newMPodcastSubtitleProperty) {
		if (newMPodcastSubtitleProperty != mPodcastSubtitleProperty) {
			NotificationChain msgs = null;
			if (mPodcastSubtitleProperty != null)
				msgs = ((InternalEObject)mPodcastSubtitleProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY, null, msgs);
			if (newMPodcastSubtitleProperty != null) {				
				newMPodcastSubtitleProperty.setDefaultName("Podcast subtitle");
				newMPodcastSubtitleProperty.setDefaultDescription("Specifies the podcast subtitle. The subtitle appears as in the Description column in iTunes.");
				newMPodcastSubtitleProperty.setValueType(Type.getTypeForName("Text"));
				newMPodcastSubtitleProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY));
				newMPodcastSubtitleProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastSubtitleProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastSubtitleProperty != null) {
				if(newMPodcastSubtitleProperty != null)
					newMPodcastSubtitleProperty.eAdapters().addAll(mPodcastSubtitleProperty.eAdapters());			
			
				mPodcastSubtitleProperty.eAdapters().clear();
			}
			msgs = basicSetMPodcastSubtitleProperty(newMPodcastSubtitleProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY, newMPodcastSubtitleProperty, newMPodcastSubtitleProperty));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Subtitle Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Subtitle Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Subtitle Property</em>' attribute.
	 * @see #setPodcastSubtitleProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_PodcastSubtitleProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getPodcastSubtitleProperty() {
		return podcastSubtitleProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSubtitleProperty <em>Podcast Subtitle Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastSubtitleProperty the new value of the '<em>Podcast Subtitle Property</em>' attribute.
	 * @see #getPodcastSubtitleProperty()
	 * @generated
	 */
	public void setPodcastSubtitleProperty(String newPodcastSubtitleProperty) {
		String oldPodcastSubtitleProperty = podcastSubtitleProperty;
		podcastSubtitleProperty = newPodcastSubtitleProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY, oldPodcastSubtitleProperty, podcastSubtitleProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Summary Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Summary Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Summary Property</em>' containment reference.
	 * @see #setMPodcastSummaryProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MPodcastSummaryProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast summary' description='Specifies the podcast summary. The summary appears  when the circled (i) in the Description column is clicked.'"
	 * @generated
	 */
	public MProperty getMPodcastSummaryProperty() {
		return mPodcastSummaryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastSummaryProperty(MProperty newMPodcastSummaryProperty, NotificationChain msgs) {
		MProperty oldMPodcastSummaryProperty = mPodcastSummaryProperty;
		mPodcastSummaryProperty = newMPodcastSummaryProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY, oldMPodcastSummaryProperty, newMPodcastSummaryProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSummaryProperty <em>MPodcast Summary Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastSummaryProperty the new value of the '<em>MPodcast Summary Property</em>' containment reference.
	 * @see #getMPodcastSummaryProperty()
	 * @generated
	 */
	public void setMPodcastSummaryProperty(MProperty newMPodcastSummaryProperty) {
		if (newMPodcastSummaryProperty != mPodcastSummaryProperty) {
			NotificationChain msgs = null;
			if (mPodcastSummaryProperty != null)
				msgs = ((InternalEObject)mPodcastSummaryProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY, null, msgs);
			if (newMPodcastSummaryProperty != null) {				
				newMPodcastSummaryProperty.setDefaultDescription("Specifies the podcast summary. The summary appears  when the circled (i) in the Description column is clicked.");
				newMPodcastSummaryProperty.setDefaultName("Podcast summary");
				newMPodcastSummaryProperty.setValueType(Type.getTypeForName("Text"));
				newMPodcastSummaryProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY));
				newMPodcastSummaryProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastSummaryProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastSummaryProperty != null) {
				if(newMPodcastSummaryProperty != null)
					newMPodcastSummaryProperty.eAdapters().addAll(mPodcastSummaryProperty.eAdapters());			
			
				mPodcastSummaryProperty.eAdapters().clear();
			}
			msgs = basicSetMPodcastSummaryProperty(newMPodcastSummaryProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY, newMPodcastSummaryProperty, newMPodcastSummaryProperty));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Summary Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Summary Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Summary Property</em>' attribute.
	 * @see #setPodcastSummaryProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_PodcastSummaryProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getPodcastSummaryProperty() {
		return podcastSummaryProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSummaryProperty <em>Podcast Summary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastSummaryProperty the new value of the '<em>Podcast Summary Property</em>' attribute.
	 * @see #getPodcastSummaryProperty()
	 * @generated
	 */
	public void setPodcastSummaryProperty(String newPodcastSummaryProperty) {
		String oldPodcastSummaryProperty = podcastSummaryProperty;
		podcastSummaryProperty = newPodcastSummaryProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY, oldPodcastSummaryProperty, podcastSummaryProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Publishing Date Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Publishing Date Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Publishing Date Property</em>' containment reference.
	 * @see #setMPodcastPublishingDateProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MPodcastPublishingDateProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast publishing date' description='Specifies the publishing date of the MP3 file. The publishing date appears in the Release Date column in iTunes.'"
	 * @generated
	 */
	public MProperty getMPodcastPublishingDateProperty() {
		return mPodcastPublishingDateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastPublishingDateProperty(MProperty newMPodcastPublishingDateProperty, NotificationChain msgs) {
		MProperty oldMPodcastPublishingDateProperty = mPodcastPublishingDateProperty;
		mPodcastPublishingDateProperty = newMPodcastPublishingDateProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY, oldMPodcastPublishingDateProperty, newMPodcastPublishingDateProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastPublishingDateProperty <em>MPodcast Publishing Date Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastPublishingDateProperty the new value of the '<em>MPodcast Publishing Date Property</em>' containment reference.
	 * @see #getMPodcastPublishingDateProperty()
	 * @generated
	 */
	public void setMPodcastPublishingDateProperty(MProperty newMPodcastPublishingDateProperty) {
		if (newMPodcastPublishingDateProperty != mPodcastPublishingDateProperty) {
			NotificationChain msgs = null;
			if (mPodcastPublishingDateProperty != null)
				msgs = ((InternalEObject)mPodcastPublishingDateProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY, null, msgs);
			if (newMPodcastPublishingDateProperty != null) {				
				newMPodcastPublishingDateProperty.setDefaultDescription("Specifies the publishing date of the MP3 file. The publishing date appears in the Release Date column in iTunes.");
				newMPodcastPublishingDateProperty.setDefaultName("Podcast publishing date");
				newMPodcastPublishingDateProperty.setValueType(Type.getTypeForName("Date and time"));
				newMPodcastPublishingDateProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY));
				newMPodcastPublishingDateProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastPublishingDateProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastPublishingDateProperty != null) {
				if(newMPodcastPublishingDateProperty != null)
					newMPodcastPublishingDateProperty.eAdapters().addAll(mPodcastPublishingDateProperty.eAdapters());			
			
				mPodcastPublishingDateProperty.eAdapters().clear();
			}
			msgs = basicSetMPodcastPublishingDateProperty(newMPodcastPublishingDateProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY, newMPodcastPublishingDateProperty, newMPodcastPublishingDateProperty));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Publishing Date Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Publishing Date Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Publishing Date Property</em>' attribute.
	 * @see #setPodcastPublishingDateProperty(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_PodcastPublishingDateProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime"
	 * @generated
	 */
	public Date getPodcastPublishingDateProperty() {
		return podcastPublishingDateProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastPublishingDateProperty <em>Podcast Publishing Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastPublishingDateProperty the new value of the '<em>Podcast Publishing Date Property</em>' attribute.
	 * @see #getPodcastPublishingDateProperty()
	 * @generated
	 */
	public void setPodcastPublishingDateProperty(Date newPodcastPublishingDateProperty) {
		Date oldPodcastPublishingDateProperty = podcastPublishingDateProperty;
		podcastPublishingDateProperty = newPodcastPublishingDateProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY, oldPodcastPublishingDateProperty, podcastPublishingDateProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPublished File Name Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPublished File Name Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPublished File Name Property</em>' containment reference.
	 * @see #setMPublishedFileNameProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_MPublishedFileNameProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Published file name' description='Specifies the name of published file on the FTP server.'"
	 * @generated
	 */
	public MProperty getMPublishedFileNameProperty() {
		return mPublishedFileNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPublishedFileNameProperty(MProperty newMPublishedFileNameProperty, NotificationChain msgs) {
		MProperty oldMPublishedFileNameProperty = mPublishedFileNameProperty;
		mPublishedFileNameProperty = newMPublishedFileNameProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY, oldMPublishedFileNameProperty, newMPublishedFileNameProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getMPublishedFileNameProperty <em>MPublished File Name Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPublishedFileNameProperty the new value of the '<em>MPublished File Name Property</em>' containment reference.
	 * @see #getMPublishedFileNameProperty()
	 * @generated
	 */
	public void setMPublishedFileNameProperty(MProperty newMPublishedFileNameProperty) {
		if (newMPublishedFileNameProperty != mPublishedFileNameProperty) {
			NotificationChain msgs = null;
			if (mPublishedFileNameProperty != null)
				msgs = ((InternalEObject)mPublishedFileNameProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY, null, msgs);
			if (newMPublishedFileNameProperty != null) {				
				newMPublishedFileNameProperty.setDefaultDescription("Specifies the name of published file on the FTP server.");
				newMPublishedFileNameProperty.setDefaultName("Published file name");
				newMPublishedFileNameProperty.setValueType(Type.getTypeForName("Text"));
				newMPublishedFileNameProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY));
				newMPublishedFileNameProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPublishedFileNameProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPublishedFileNameProperty != null) {
				if(newMPublishedFileNameProperty != null)
					newMPublishedFileNameProperty.eAdapters().addAll(mPublishedFileNameProperty.eAdapters());			
			
				mPublishedFileNameProperty.eAdapters().clear();
			}
			msgs = basicSetMPublishedFileNameProperty(newMPublishedFileNameProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY, newMPublishedFileNameProperty, newMPublishedFileNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>Published File Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published File Name Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published File Name Property</em>' attribute.
	 * @see #setPublishedFileNameProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3_PublishedFileNameProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 * @generated
	 */
	public String getPublishedFileNameProperty() {
		return publishedFileNameProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MMp3#getPublishedFileNameProperty <em>Published File Name Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPublishedFileNameProperty the new value of the '<em>Published File Name Property</em>' attribute.
	 * @see #getPublishedFileNameProperty()
	 * @generated
	 */
	public void setPublishedFileNameProperty(String newPublishedFileNameProperty) {
		String oldPublishedFileNameProperty = publishedFileNameProperty;
		publishedFileNameProperty = newPublishedFileNameProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY, oldPublishedFileNameProperty, publishedFileNameProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MMP3__MFILE_PROPERTY:
				return basicSetMFileProperty(null, msgs);
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:
				return basicSetMLinkTextProperty(null, msgs);
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:
				return basicSetMLinkDescriptionProperty(null, msgs);
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:
				return basicSetMCommentProperty(null, msgs);
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:
				return basicSetMPodcastTitleProperty(null, msgs);
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:
				return basicSetMPodcastSubtitleProperty(null, msgs);
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:
				return basicSetMPodcastSummaryProperty(null, msgs);
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:
				return basicSetMPodcastPublishingDateProperty(null, msgs);
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:
				return basicSetMPublishedFileNameProperty(null, msgs);
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
			case LogicPackage.MMP3__STATE_PROPERTY:
				return getStateProperty();
			case LogicPackage.MMP3__MFILE_PROPERTY:
				return getMFileProperty();
			case LogicPackage.MMP3__FILE_PROPERTY:
				return getFileProperty();
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:
				return getMLinkTextProperty();
			case LogicPackage.MMP3__LINK_TEXT_PROPERTY:
				return getLinkTextProperty();
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:
				return getMLinkDescriptionProperty();
			case LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY:
				return getLinkDescriptionProperty();
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:
				return getMCommentProperty();
			case LogicPackage.MMP3__COMMENT_PROPERTY:
				return getCommentProperty();
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:
				return getMPodcastTitleProperty();
			case LogicPackage.MMP3__PODCAST_TITLE_PROPERTY:
				return getPodcastTitleProperty();
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:
				return getMPodcastSubtitleProperty();
			case LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY:
				return getPodcastSubtitleProperty();
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:
				return getMPodcastSummaryProperty();
			case LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY:
				return getPodcastSummaryProperty();
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:
				return getMPodcastPublishingDateProperty();
			case LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY:
				return getPodcastPublishingDateProperty();
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:
				return getMPublishedFileNameProperty();
			case LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY:
				return getPublishedFileNameProperty();
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
			case LogicPackage.MMP3__STATE_PROPERTY:    
				setStateProperty((State)newValue);
				return;
			case LogicPackage.MMP3__MFILE_PROPERTY:    
				setMFileProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__FILE_PROPERTY:    
				setFileProperty((File)newValue);
				return;
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:    
				setMLinkTextProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__LINK_TEXT_PROPERTY:    
				setLinkTextProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:    
				setMLinkDescriptionProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY:    
				setLinkDescriptionProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:    
				setMCommentProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__COMMENT_PROPERTY:    
				setCommentProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:    
				setMPodcastTitleProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__PODCAST_TITLE_PROPERTY:    
				setPodcastTitleProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:    
				setMPodcastSubtitleProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY:    
				setPodcastSubtitleProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:    
				setMPodcastSummaryProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY:    
				setPodcastSummaryProperty((String)newValue);
				return;
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:    
				setMPodcastPublishingDateProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY:    
				setPodcastPublishingDateProperty((Date)newValue);
				return;
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:    
				setMPublishedFileNameProperty((MProperty)newValue);
				return;
			case LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY:    
				setPublishedFileNameProperty((String)newValue);
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
			case LogicPackage.MMP3__STATE_PROPERTY:
				setStateProperty(getDefaultStateProperty());
				return;
			case LogicPackage.MMP3__MFILE_PROPERTY:
				setMFileProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__FILE_PROPERTY:
				setFileProperty(getDefaultFileProperty());
				return;
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:
				setMLinkTextProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__LINK_TEXT_PROPERTY:
				setLinkTextProperty(getDefaultLinkTextProperty());
				return;
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:
				setMLinkDescriptionProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY:
				setLinkDescriptionProperty(getDefaultLinkDescriptionProperty());
				return;
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:
				setMCommentProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__COMMENT_PROPERTY:
				setCommentProperty(getDefaultCommentProperty());
				return;
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:
				setMPodcastTitleProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__PODCAST_TITLE_PROPERTY:
				setPodcastTitleProperty(getDefaultPodcastTitleProperty());
				return;
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:
				setMPodcastSubtitleProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY:
				setPodcastSubtitleProperty(getDefaultPodcastSubtitleProperty());
				return;
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:
				setMPodcastSummaryProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY:
				setPodcastSummaryProperty(getDefaultPodcastSummaryProperty());
				return;
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:
				setMPodcastPublishingDateProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY:
				setPodcastPublishingDateProperty(getDefaultPodcastPublishingDateProperty());
				return;
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:
				setMPublishedFileNameProperty((MProperty)null);
				return;
			case LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY:
				setPublishedFileNameProperty(getDefaultPublishedFileNameProperty());
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
			case LogicPackage.MMP3__STATE_PROPERTY:
				return getDefaultStateProperty() == null ? stateProperty != null : !getDefaultStateProperty().equals(stateProperty);
			case LogicPackage.MMP3__MFILE_PROPERTY:
				return mFileProperty != null;
			case LogicPackage.MMP3__FILE_PROPERTY:
				return getDefaultFileProperty() == null ? fileProperty != null : !getDefaultFileProperty().equals(fileProperty);
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:
				return mLinkTextProperty != null;
			case LogicPackage.MMP3__LINK_TEXT_PROPERTY:
				return getDefaultLinkTextProperty() == null ? linkTextProperty != null : !getDefaultLinkTextProperty().equals(linkTextProperty);
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:
				return mLinkDescriptionProperty != null;
			case LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY:
				return getDefaultLinkDescriptionProperty() == null ? linkDescriptionProperty != null : !getDefaultLinkDescriptionProperty().equals(linkDescriptionProperty);
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:
				return mCommentProperty != null;
			case LogicPackage.MMP3__COMMENT_PROPERTY:
				return getDefaultCommentProperty() == null ? commentProperty != null : !getDefaultCommentProperty().equals(commentProperty);
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:
				return mPodcastTitleProperty != null;
			case LogicPackage.MMP3__PODCAST_TITLE_PROPERTY:
				return getDefaultPodcastTitleProperty() == null ? podcastTitleProperty != null : !getDefaultPodcastTitleProperty().equals(podcastTitleProperty);
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:
				return mPodcastSubtitleProperty != null;
			case LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY:
				return getDefaultPodcastSubtitleProperty() == null ? podcastSubtitleProperty != null : !getDefaultPodcastSubtitleProperty().equals(podcastSubtitleProperty);
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:
				return mPodcastSummaryProperty != null;
			case LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY:
				return getDefaultPodcastSummaryProperty() == null ? podcastSummaryProperty != null : !getDefaultPodcastSummaryProperty().equals(podcastSummaryProperty);
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:
				return mPodcastPublishingDateProperty != null;
			case LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY:
				return getDefaultPodcastPublishingDateProperty() == null ? podcastPublishingDateProperty != null : !getDefaultPodcastPublishingDateProperty().equals(podcastPublishingDateProperty);
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:
				return mPublishedFileNameProperty != null;
			case LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY:
				return getDefaultPublishedFileNameProperty() == null ? publishedFileNameProperty != null : !getDefaultPublishedFileNameProperty().equals(publishedFileNameProperty);
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
		result.append(" (stateProperty: ");
		result.append(stateProperty);
		result.append(", fileProperty: ");
		result.append(fileProperty);
		result.append(", linkTextProperty: ");
		result.append(linkTextProperty);
		result.append(", linkDescriptionProperty: ");
		result.append(linkDescriptionProperty);
		result.append(", commentProperty: ");
		result.append(commentProperty);
		result.append(", podcastTitleProperty: ");
		result.append(podcastTitleProperty);
		result.append(", podcastSubtitleProperty: ");
		result.append(podcastSubtitleProperty);
		result.append(", podcastSummaryProperty: ");
		result.append(podcastSummaryProperty);
		result.append(", podcastPublishingDateProperty: ");
		result.append(podcastPublishingDateProperty);
		result.append(", publishedFileNameProperty: ");
		result.append(publishedFileNameProperty);
		result.append(')');
		return result.toString();
	}

} // MMp3