/*
 * Revision History:
 * $Log: MPublishMp3sStep.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.types.DurationType;
import org.onceforall.dms.desktop.logic.types.MMp3StateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.logic.types.Type;
import org.tritonus.share.sampled.file.TAudioFileFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPublish Mp3s Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMaxiumumDiskSpaceParameter <em>MMaxiumum Disk Space Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMaxiumumDiskSpaceParameter <em>Maxiumum Disk Space Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMp3RelativeFtpPathParameter <em>MMp3 Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMp3RelativeFtpPathParameter <em>Mp3 Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMWebServerUrlParameter <em>MWeb Server Url Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getWebServerUrlParameter <em>Web Server Url Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageRelativeFtpPathParameter <em>MContent Page Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageRelativeFtpPathParameter <em>Content Page Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentHeaderFilePathParameter <em>MContent Header File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentHeaderFilePathParameter <em>Content Header File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentFooterFilePathParameter <em>MContent Footer File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentFooterFilePathParameter <em>Content Footer File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageFilePathParameter <em>MContent Page File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageFilePathParameter <em>Content Page File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFilePathParameter <em>MPodcast File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFilePathParameter <em>Podcast File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastRelativeFtpPathParameter <em>MPodcast Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastRelativeFtpPathParameter <em>Podcast Relative Ftp Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastHeaderFilePathParameter <em>MPodcast Header File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastHeaderFilePathParameter <em>Podcast Header File Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentIncludeMp3PlayerParameter <em>MContent Include Mp3 Player Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentIncludeMp3PlayerParameter <em>Content Include Mp3 Player Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentGroupRecordingsParameter <em>MContent Group Recordings Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentGroupRecordingsParameter <em>Content Group Recordings Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageUrlResult <em>MContent Page Url Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageUrlResult <em>Content Page Url Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFileUrlResult <em>MPodcast File Url Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFileUrlResult <em>Podcast File Url Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore name='Publish MP3s' description='Publishes or republishes MP3 recordings to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.' iconFilePath='Image Files/Publish MP3s step.gif' actionName='Publish' actionIconFilePath='Image Files/Publish.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public abstract class MPublishMp3sStep extends MFtpStep {
	/** Specifies the comparator that determines the order in which the MP3s will appear on the web content page. */
	public static final Comparator MP3_DATE_COMPARATOR = new Comparator<MMp3>() {
		public int compare(MMp3 mMp31, MMp3 mMp32) {
			if(mMp31.getPodcastPublishingDateProperty() == null && mMp32.getPodcastPublishingDateProperty() == null)
				return 0;
			else if(mMp31.getPodcastPublishingDateProperty() == null && mMp32.getPodcastPublishingDateProperty() != null)
				return 1;
			else if(mMp31.getPodcastPublishingDateProperty() != null && mMp32.getPodcastPublishingDateProperty() == null)
				return -1;
			else
				return mMp32.getPodcastPublishingDateProperty().compareTo(mMp31.getPodcastPublishingDateProperty());				
		}  
	};	
	
	/** Specifies the comparator that determines the order in which the MP3s will be deleted from the FTP site to make space for new ones. The order of deletion is <code>PUBLISHED_STATE</code>, <code>KEEP_PUBLISHED_STATE</code>, <code>TO_BE_PUBLISHED_STATE</code>. */
	public static final Comparator MP3_DELETE_COMPARATOR = new Comparator<MMp3>() {
		public int compare(MMp3 mMp31, MMp3 mMp32) {
			State state1 = mMp31.getStateProperty();
			State state2 = mMp32.getStateProperty();
			if(state1 == null && state2 == null)
				return 0;
			else if(state1 == null && state2 != null)
				return 1;
			else if(state1 != null && state2 == null)
				return -1;
			else {
				if(state1.equals(MMp3StateType.PUBLISHED_STATE) && state2.equals(MMp3StateType.TO_BE_PUBLISHED_STATE))
					return 1;
				else if(state1.equals(MMp3StateType.TO_BE_PUBLISHED_STATE) && state2.equals(MMp3StateType.PUBLISHED_STATE))
					return -1;
				else if(!state1.equals(state2) || state1.equals(state2) && mMp31.getKeepPublishedProperty() == mMp32.getKeepPublishedProperty())
					return MP3_DATE_COMPARATOR.compare(mMp31, mMp32);
				else if(mMp31.getKeepPublishedProperty())
					return -1;
				else if(mMp32.getKeepPublishedProperty())
					return 1;
				else
					return 0;
			}
		}  
	};	
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MPublishMp3sStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MPublishMp3sStep.TYPE_NAME, new ReferenceType("Reference to "+MPublishMp3sStep.TYPE_NAME, "Specifies a reference to a "+MPublishMp3sStep.TYPE_NAME_FOR_UI, MPublishMp3sStep.class));
	}
	/**
	 * The cached value of the '{@link #getMMaxiumumDiskSpaceParameter() <em>MMaxiumum Disk Space Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMaxiumumDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMaxiumumDiskSpaceParameter = null;

	/**
	 * The default value of the '{@link #getMaxiumumDiskSpaceParameter() <em>Maxiumum Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxiumumDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIUMUM_DISK_SPACE_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getMaxiumumDiskSpaceParameter() <em>Maxiumum Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMaxiumumDiskSpaceParameter() <em>Maxiumum Disk Space Parameter</em>}' attribute.
	 * @see #getMaxiumumDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultMaxiumumDiskSpaceParameter() {
		return MAXIUMUM_DISK_SPACE_PARAMETER_EDEFAULT;
	}
	
    /** Specifies the number formatter. */
	protected static final NumberFormat NUMBER_FORMATTER = NumberFormat.getIntegerInstance();
	
    /** Specifies the group date formatter. */
	protected static final DateFormat GROUP_DATE_FORMATTER = new SimpleDateFormat("MMMM yyyy");

	/**
	 * The cached value of the '{@link #getMaxiumumDiskSpaceParameter() <em>Maxiumum Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxiumumDiskSpaceParameter()
	 * @generated
	 * @ordered
	 */
	protected Long maxiumumDiskSpaceParameter = MAXIUMUM_DISK_SPACE_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMMp3RelativeFtpPathParameter() <em>MMp3 Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3RelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3RelativeFtpPathParameter = null;

	/**
	 * The default value of the '{@link #getMp3RelativeFtpPathParameter() <em>Mp3 Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3RelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String MP3_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getMp3RelativeFtpPathParameter() <em>Mp3 Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3RelativeFtpPathParameter() <em>Mp3 Relative Ftp Path Parameter</em>}' attribute.
	 * @see #getMp3RelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultMp3RelativeFtpPathParameter() {
		return MP3_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3RelativeFtpPathParameter() <em>Mp3 Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3RelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected String mp3RelativeFtpPathParameter = MP3_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMWebServerUrlParameter() <em>MWeb Server Url Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWebServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mWebServerUrlParameter = null;

	/**
	 * The default value of the '{@link #getWebServerUrlParameter() <em>Web Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected static final URL WEB_SERVER_URL_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getWebServerUrlParameter() <em>Web Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getWebServerUrlParameter() <em>Web Server Url Parameter</em>}' attribute.
	 * @see #getWebServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultWebServerUrlParameter() {
		return WEB_SERVER_URL_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getWebServerUrlParameter() <em>Web Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebServerUrlParameter()
	 * @generated
	 * @ordered
	 */
	protected URL webServerUrlParameter = WEB_SERVER_URL_PARAMETER_EDEFAULT;
	
    /** Specifies the date formatter that formats the date for the podcast XML. */
    protected static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

	/**
	 * The cached value of the '{@link #getMContentPageRelativeFtpPathParameter() <em>MContent Page Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentPageRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentPageRelativeFtpPathParameter = null;

	/**
	 * The default value of the '{@link #getContentPageRelativeFtpPathParameter() <em>Content Page Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getContentPageRelativeFtpPathParameter() <em>Content Page Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentPageRelativeFtpPathParameter() <em>Content Page Relative Ftp Path Parameter</em>}' attribute.
	 * @see #getContentPageRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultContentPageRelativeFtpPathParameter() {
		return CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentPageRelativeFtpPathParameter() <em>Content Page Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected String contentPageRelativeFtpPathParameter = CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMContentHeaderFilePathParameter() <em>MContent Header File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentHeaderFilePathParameter = null;

	/**
	 * The default value of the '{@link #getContentHeaderFilePathParameter() <em>Content Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File CONTENT_HEADER_FILE_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getContentHeaderFilePathParameter() <em>Content Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentHeaderFilePathParameter() <em>Content Header File Path Parameter</em>}' attribute.
	 * @see #getContentHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultContentHeaderFilePathParameter() {
		return CONTENT_HEADER_FILE_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentHeaderFilePathParameter() <em>Content Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected File contentHeaderFilePathParameter = CONTENT_HEADER_FILE_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMContentFooterFilePathParameter() <em>MContent Footer File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentFooterFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentFooterFilePathParameter = null;

	/**
	 * The default value of the '{@link #getContentFooterFilePathParameter() <em>Content Footer File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFooterFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File CONTENT_FOOTER_FILE_PATH_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getContentFooterFilePathParameter() <em>Content Footer File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentFooterFilePathParameter() <em>Content Footer File Path Parameter</em>}' attribute.
	 * @see #getContentFooterFilePathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultContentFooterFilePathParameter() {
		return CONTENT_FOOTER_FILE_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentFooterFilePathParameter() <em>Content Footer File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFooterFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected File contentFooterFilePathParameter = CONTENT_FOOTER_FILE_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMContentPageFilePathParameter() <em>MContent Page File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentPageFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentPageFilePathParameter = null;

	/**
	 * The default value of the '{@link #getContentPageFilePathParameter() <em>Content Page File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File CONTENT_PAGE_FILE_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getContentPageFilePathParameter() <em>Content Page File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentPageFilePathParameter() <em>Content Page File Path Parameter</em>}' attribute.
	 * @see #getContentPageFilePathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultContentPageFilePathParameter() {
		return CONTENT_PAGE_FILE_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentPageFilePathParameter() <em>Content Page File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected File contentPageFilePathParameter = CONTENT_PAGE_FILE_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPodcastFilePathParameter() <em>MPodcast File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastFilePathParameter = null;

	/**
	 * The default value of the '{@link #getPodcastFilePathParameter() <em>Podcast File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File PODCAST_FILE_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastFilePathParameter() <em>Podcast File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastFilePathParameter() <em>Podcast File Path Parameter</em>}' attribute.
	 * @see #getPodcastFilePathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultPodcastFilePathParameter() {
		return PODCAST_FILE_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastFilePathParameter() <em>Podcast File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected File podcastFilePathParameter = PODCAST_FILE_PATH_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastRelativeFtpPathParameter() <em>MPodcast Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastRelativeFtpPathParameter = null;

	/**
	 * The default value of the '{@link #getPodcastRelativeFtpPathParameter() <em>Podcast Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PODCAST_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastRelativeFtpPathParameter() <em>Podcast Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastRelativeFtpPathParameter() <em>Podcast Relative Ftp Path Parameter</em>}' attribute.
	 * @see #getPodcastRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultPodcastRelativeFtpPathParameter() {
		return PODCAST_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastRelativeFtpPathParameter() <em>Podcast Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastRelativeFtpPathParameter()
	 * @generated
	 * @ordered
	 */
	protected String podcastRelativeFtpPathParameter = PODCAST_RELATIVE_FTP_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPodcastHeaderFilePathParameter() <em>MPodcast Header File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mPodcastHeaderFilePathParameter = null;

	/**
	 * The default value of the '{@link #getPodcastHeaderFilePathParameter() <em>Podcast Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File PODCAST_HEADER_FILE_PATH_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getPodcastHeaderFilePathParameter() <em>Podcast Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastHeaderFilePathParameter() <em>Podcast Header File Path Parameter</em>}' attribute.
	 * @see #getPodcastHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultPodcastHeaderFilePathParameter() {
		return PODCAST_HEADER_FILE_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastHeaderFilePathParameter() <em>Podcast Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastHeaderFilePathParameter()
	 * @generated
	 * @ordered
	 */
	protected File podcastHeaderFilePathParameter = PODCAST_HEADER_FILE_PATH_PARAMETER_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMContentIncludeMp3PlayerParameter() <em>MContent Include Mp3 Player Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentIncludeMp3PlayerParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentIncludeMp3PlayerParameter = null;

	/**
	 * The default value of the '{@link #getContentIncludeMp3PlayerParameter() <em>Content Include Mp3 Player Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentIncludeMp3PlayerParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTENT_INCLUDE_MP3_PLAYER_PARAMETER_EDEFAULT = Boolean.TRUE;

	/**
	 * Get the default value of the '{@link #getContentIncludeMp3PlayerParameter() <em>Content Include Mp3 Player Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentIncludeMp3PlayerParameter() <em>Content Include Mp3 Player Parameter</em>}' attribute.
	 * @see #getContentIncludeMp3PlayerParameter()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultContentIncludeMp3PlayerParameter() {
		return CONTENT_INCLUDE_MP3_PLAYER_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentIncludeMp3PlayerParameter() <em>Content Include Mp3 Player Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentIncludeMp3PlayerParameter()
	 * @generated
	 * @ordered
	 */
	protected Boolean contentIncludeMp3PlayerParameter = CONTENT_INCLUDE_MP3_PLAYER_PARAMETER_EDEFAULT;


	/**
	 * The cached value of the '{@link #getMContentGroupRecordingsParameter() <em>MContent Group Recordings Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentGroupRecordingsParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mContentGroupRecordingsParameter = null;

	/**
	 * The default value of the '{@link #getContentGroupRecordingsParameter() <em>Content Group Recordings Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentGroupRecordingsParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTENT_GROUP_RECORDINGS_PARAMETER_EDEFAULT = Boolean.TRUE;

	/**
	 * Get the default value of the '{@link #getContentGroupRecordingsParameter() <em>Content Group Recordings Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentGroupRecordingsParameter() <em>Content Group Recordings Parameter</em>}' attribute.
	 * @see #getContentGroupRecordingsParameter()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultContentGroupRecordingsParameter() {
		return CONTENT_GROUP_RECORDINGS_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentGroupRecordingsParameter() <em>Content Group Recordings Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentGroupRecordingsParameter()
	 * @generated
	 * @ordered
	 */
	protected Boolean contentGroupRecordingsParameter = CONTENT_GROUP_RECORDINGS_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMContentPageUrlResult() <em>MContent Page Url Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMContentPageUrlResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mContentPageUrlResult = null;

	/**
	 * The default value of the '{@link #getContentPageUrlResult() <em>Content Page Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageUrlResult()
	 * @generated
	 * @ordered
	 */
	protected static final URL CONTENT_PAGE_URL_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getContentPageUrlResult() <em>Content Page Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getContentPageUrlResult() <em>Content Page Url Result</em>}' attribute.
	 * @see #getContentPageUrlResult()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultContentPageUrlResult() {
		return CONTENT_PAGE_URL_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getContentPageUrlResult() <em>Content Page Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPageUrlResult()
	 * @generated
	 * @ordered
	 */
	protected URL contentPageUrlResult = CONTENT_PAGE_URL_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMPodcastFileUrlResult() <em>MPodcast File Url Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPodcastFileUrlResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mPodcastFileUrlResult = null;

	/**
	 * The default value of the '{@link #getPodcastFileUrlResult() <em>Podcast File Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastFileUrlResult()
	 * @generated
	 * @ordered
	 */
	protected static final URL PODCAST_FILE_URL_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getPodcastFileUrlResult() <em>Podcast File Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPodcastFileUrlResult() <em>Podcast File Url Result</em>}' attribute.
	 * @see #getPodcastFileUrlResult()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultPodcastFileUrlResult() {
		return PODCAST_FILE_URL_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPodcastFileUrlResult() <em>Podcast File Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodcastFileUrlResult()
	 * @generated
	 * @ordered
	 */
	protected URL podcastFileUrlResult = PODCAST_FILE_URL_RESULT_EDEFAULT;


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
		return "Publish";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish MP3s step.gif");
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
		return "Publishes or republishes MP3 recordings to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.";
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
		return "Publish MP3s";
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
	protected MPublishMp3sStep() {
		super();
		
		firstMPublishMp3sStepConstructorHook();
				
		description = "Publishes or republishes MP3 recordings to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish.gif");
		name = "Publish MP3s";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Publish MP3s step.gif");
		terminatable = false;
		interruptable = false;
		actionName = "Publish";
					 
		setMMaxiumumDiskSpaceParameter(new MParameter(false, "Maxiumum disk space", "Specifies the maximum disk space that the recordings are allowed to use on the FTP server in mega bytes.", null));			 
		setMMp3RelativeFtpPathParameter(new MParameter(false, "MP3 relative FTP path", "Specifies the path of the directory on the FTP server to publish the MP3 files to, e.g. \'/recordings\'.", null));			 
		setMWebServerUrlParameter(new MParameter(false, "Web server URL", "Specifies the public web server URL, e.g. \'http://www.ccbromley.net\'.", null));			 
		setMContentPageRelativeFtpPathParameter(new MParameter(false, "Content page relative FTP path", "Specifies the path of the directory relative to the FTP path where to publish the MP3 content page to, e.g. \'/recordings\'.", null));			 
		setMContentHeaderFilePathParameter(new MParameter(false, "Content header file path", "Specifies the file path to the header for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.", null));			 
		setMContentFooterFilePathParameter(new MParameter(false, "Content footer file path", "Specifies the file path to the footer for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.", null));			 
		setMContentPageFilePathParameter(new MParameter(false, "Content page file path", "Specifies the content web page that lists the MP3s recordings. This page is generated from the header and footer files and the published MP3 files.", null));			 
		setMPodcastFilePathParameter(new MParameter(false, "Podcast file path", "Specifies the podcast file. This file is generated from the header file and the published MP3 files.", null));			 
		setMPodcastRelativeFtpPathParameter(new MParameter(false, "Podcast relative FTP path", "Specifies the path relative to the FTP path where the podcast RSS feed should be created or updated.", null));			 
		setMPodcastHeaderFilePathParameter(new MParameter(false, "Podcast header file path", "Specifies the file path to the header for the podcast file.", null));			 
		setMContentIncludeMp3PlayerParameter(new MParameter(false, "Include MP3 player on content page", "Specifies whether an MP3 player should included on the content page or not.", null));			 
		setMContentGroupRecordingsParameter(new MParameter(false, "Group recordinds by month on content page", "Specifies whether the recordings on the content page should be grouped by month.", null));			 
		setMContentPageUrlResult(new MResult(false, "Content page URL", "Specifies the URL to content page.", null));			 
		setMPodcastFileUrlResult(new MResult(false, "Podcast file URL", "Specifies the URL to podcast file.", null));

		lastMPublishMp3sStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMPublishMp3sStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMPublishMp3sStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MPUBLISH_MP3S_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Relative Ftp Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Relative Ftp Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Relative Ftp Path Parameter</em>' containment reference.
	 * @see #setMMp3RelativeFtpPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MMp3RelativeFtpPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 relative FTP path' description='Specifies the path of the directory on the FTP server to publish the MP3 files to, e.g. \'/recordings\'.'"
	 * @generated
	 */
	public MParameter getMMp3RelativeFtpPathParameter() {
		return mMp3RelativeFtpPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3RelativeFtpPathParameter(MParameter newMMp3RelativeFtpPathParameter, NotificationChain msgs) {
		MParameter oldMMp3RelativeFtpPathParameter = mMp3RelativeFtpPathParameter;
		mMp3RelativeFtpPathParameter = newMMp3RelativeFtpPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER, oldMMp3RelativeFtpPathParameter, newMMp3RelativeFtpPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMp3RelativeFtpPathParameter <em>MMp3 Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3RelativeFtpPathParameter the new value of the '<em>MMp3 Relative Ftp Path Parameter</em>' containment reference.
	 * @see #getMMp3RelativeFtpPathParameter()
	 * @generated
	 */
	public void setMMp3RelativeFtpPathParameter(MParameter newMMp3RelativeFtpPathParameter) {
		if (newMMp3RelativeFtpPathParameter != mMp3RelativeFtpPathParameter) {
			NotificationChain msgs = null;
			if (mMp3RelativeFtpPathParameter != null)
				msgs = ((InternalEObject)mMp3RelativeFtpPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			if (newMMp3RelativeFtpPathParameter != null) {				
				newMMp3RelativeFtpPathParameter.setDefaultDescription("Specifies the path of the directory on the FTP server to publish the MP3 files to, e.g. \'/recordings\'.");
				newMMp3RelativeFtpPathParameter.setDefaultName("MP3 relative FTP path");
				newMMp3RelativeFtpPathParameter.setValueType(Type.getTypeForName("Text"));
				newMMp3RelativeFtpPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER));
				newMMp3RelativeFtpPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3RelativeFtpPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3RelativeFtpPathParameter != null) {
				if(newMMp3RelativeFtpPathParameter != null)
					newMMp3RelativeFtpPathParameter.eAdapters().addAll(mMp3RelativeFtpPathParameter.eAdapters());			
			
				mMp3RelativeFtpPathParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3RelativeFtpPathParameter(newMMp3RelativeFtpPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER, newMMp3RelativeFtpPathParameter, newMMp3RelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Relative Ftp Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Relative Ftp Path Parameter</em>' attribute.
	 * @see #setMp3RelativeFtpPathParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_Mp3RelativeFtpPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getMp3RelativeFtpPathParameter() {
		return mp3RelativeFtpPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMp3RelativeFtpPathParameter <em>Mp3 Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3RelativeFtpPathParameter the new value of the '<em>Mp3 Relative Ftp Path Parameter</em>' attribute.
	 * @see #getMp3RelativeFtpPathParameter()
	 * @generated
	 */
	public void setMp3RelativeFtpPathParameter(String newMp3RelativeFtpPathParameter) {
		String oldMp3RelativeFtpPathParameter = mp3RelativeFtpPathParameter;
		mp3RelativeFtpPathParameter = newMp3RelativeFtpPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER, oldMp3RelativeFtpPathParameter, mp3RelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMaxiumum Disk Space Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMaxiumum Disk Space Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMaxiumum Disk Space Parameter</em>' containment reference.
	 * @see #setMMaxiumumDiskSpaceParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MMaxiumumDiskSpaceParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Maxiumum disk space' description='Specifies the maximum disk space that the recordings are allowed to use on the FTP server in mega bytes.'"
	 * @generated
	 */
	public MParameter getMMaxiumumDiskSpaceParameter() {
		return mMaxiumumDiskSpaceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMaxiumumDiskSpaceParameter(MParameter newMMaxiumumDiskSpaceParameter, NotificationChain msgs) {
		MParameter oldMMaxiumumDiskSpaceParameter = mMaxiumumDiskSpaceParameter;
		mMaxiumumDiskSpaceParameter = newMMaxiumumDiskSpaceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER, oldMMaxiumumDiskSpaceParameter, newMMaxiumumDiskSpaceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMaxiumumDiskSpaceParameter <em>MMaxiumum Disk Space Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMaxiumumDiskSpaceParameter the new value of the '<em>MMaxiumum Disk Space Parameter</em>' containment reference.
	 * @see #getMMaxiumumDiskSpaceParameter()
	 * @generated
	 */
	public void setMMaxiumumDiskSpaceParameter(MParameter newMMaxiumumDiskSpaceParameter) {
		if (newMMaxiumumDiskSpaceParameter != mMaxiumumDiskSpaceParameter) {
			NotificationChain msgs = null;
			if (mMaxiumumDiskSpaceParameter != null)
				msgs = ((InternalEObject)mMaxiumumDiskSpaceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER, null, msgs);
			if (newMMaxiumumDiskSpaceParameter != null) {				
				newMMaxiumumDiskSpaceParameter.setDefaultDescription("Specifies the maximum disk space that the recordings are allowed to use on the FTP server in mega bytes.");
				newMMaxiumumDiskSpaceParameter.setDefaultName("Maxiumum disk space");
				newMMaxiumumDiskSpaceParameter.setValueType(Type.getTypeForName("Number"));
				newMMaxiumumDiskSpaceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER));
				newMMaxiumumDiskSpaceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMaxiumumDiskSpaceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMaxiumumDiskSpaceParameter != null) {
				if(newMMaxiumumDiskSpaceParameter != null)
					newMMaxiumumDiskSpaceParameter.eAdapters().addAll(mMaxiumumDiskSpaceParameter.eAdapters());			
			
				mMaxiumumDiskSpaceParameter.eAdapters().clear();
			}
			msgs = basicSetMMaxiumumDiskSpaceParameter(newMMaxiumumDiskSpaceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER, newMMaxiumumDiskSpaceParameter, newMMaxiumumDiskSpaceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Maxiumum Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxiumum Disk Space Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxiumum Disk Space Parameter</em>' attribute.
	 * @see #setMaxiumumDiskSpaceParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MaxiumumDiskSpaceParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong"
	 * @generated
	 */
	public Long getMaxiumumDiskSpaceParameter() {
		return maxiumumDiskSpaceParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMaxiumumDiskSpaceParameter <em>Maxiumum Disk Space Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMaxiumumDiskSpaceParameter the new value of the '<em>Maxiumum Disk Space Parameter</em>' attribute.
	 * @see #getMaxiumumDiskSpaceParameter()
	 * @generated
	 */
	public void setMaxiumumDiskSpaceParameter(Long newMaxiumumDiskSpaceParameter) {
		Long oldMaxiumumDiskSpaceParameter = maxiumumDiskSpaceParameter;
		maxiumumDiskSpaceParameter = newMaxiumumDiskSpaceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER, oldMaxiumumDiskSpaceParameter, maxiumumDiskSpaceParameter));
	}

	/**
	 * Returns the value of the '<em><b>MWeb Server Url Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MWeb Server Url Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWeb Server Url Parameter</em>' containment reference.
	 * @see #setMWebServerUrlParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MWebServerUrlParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Web server URL' description='Specifies the public web server URL, e.g. \'http://www.ccbromley.net\'.'"
	 * @generated
	 */
	public MParameter getMWebServerUrlParameter() {
		return mWebServerUrlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWebServerUrlParameter(MParameter newMWebServerUrlParameter, NotificationChain msgs) {
		MParameter oldMWebServerUrlParameter = mWebServerUrlParameter;
		mWebServerUrlParameter = newMWebServerUrlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER, oldMWebServerUrlParameter, newMWebServerUrlParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMWebServerUrlParameter <em>MWeb Server Url Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMWebServerUrlParameter the new value of the '<em>MWeb Server Url Parameter</em>' containment reference.
	 * @see #getMWebServerUrlParameter()
	 * @generated
	 */
	public void setMWebServerUrlParameter(MParameter newMWebServerUrlParameter) {
		if (newMWebServerUrlParameter != mWebServerUrlParameter) {
			NotificationChain msgs = null;
			if (mWebServerUrlParameter != null)
				msgs = ((InternalEObject)mWebServerUrlParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER, null, msgs);
			if (newMWebServerUrlParameter != null) {				
				newMWebServerUrlParameter.setDefaultDescription("Specifies the public web server URL, e.g. \'http://www.ccbromley.net\'.");
				newMWebServerUrlParameter.setDefaultName("Web server URL");
				newMWebServerUrlParameter.setValueType(Type.getTypeForName("URL"));
				newMWebServerUrlParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER));
				newMWebServerUrlParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMWebServerUrlParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mWebServerUrlParameter != null) {
				if(newMWebServerUrlParameter != null)
					newMWebServerUrlParameter.eAdapters().addAll(mWebServerUrlParameter.eAdapters());			
			
				mWebServerUrlParameter.eAdapters().clear();
			}
			msgs = basicSetMWebServerUrlParameter(newMWebServerUrlParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER, newMWebServerUrlParameter, newMWebServerUrlParameter));
	}

	/**
	 * Returns the value of the '<em><b>Web Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Server Url Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Server Url Parameter</em>' attribute.
	 * @see #setWebServerUrlParameter(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_WebServerUrlParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl" required="true"
	 * @generated
	 */
	public URL getWebServerUrlParameter() {
		return webServerUrlParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getWebServerUrlParameter <em>Web Server Url Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newWebServerUrlParameter the new value of the '<em>Web Server Url Parameter</em>' attribute.
	 * @see #getWebServerUrlParameter()
	 * @generated
	 */
	public void setWebServerUrlParameter(URL newWebServerUrlParameter) {
		URL oldWebServerUrlParameter = webServerUrlParameter;
		webServerUrlParameter = newWebServerUrlParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER, oldWebServerUrlParameter, webServerUrlParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Page Relative Ftp Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Page Relative Ftp Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Page Relative Ftp Path Parameter</em>' containment reference.
	 * @see #setMContentPageRelativeFtpPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentPageRelativeFtpPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Content page relative FTP path' description='Specifies the path of the directory relative to the FTP path where to publish the MP3 content page to, e.g. \'/recordings\'.'"
	 * @generated
	 */
	public MParameter getMContentPageRelativeFtpPathParameter() {
		return mContentPageRelativeFtpPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentPageRelativeFtpPathParameter(MParameter newMContentPageRelativeFtpPathParameter, NotificationChain msgs) {
		MParameter oldMContentPageRelativeFtpPathParameter = mContentPageRelativeFtpPathParameter;
		mContentPageRelativeFtpPathParameter = newMContentPageRelativeFtpPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER, oldMContentPageRelativeFtpPathParameter, newMContentPageRelativeFtpPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageRelativeFtpPathParameter <em>MContent Page Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentPageRelativeFtpPathParameter the new value of the '<em>MContent Page Relative Ftp Path Parameter</em>' containment reference.
	 * @see #getMContentPageRelativeFtpPathParameter()
	 * @generated
	 */
	public void setMContentPageRelativeFtpPathParameter(MParameter newMContentPageRelativeFtpPathParameter) {
		if (newMContentPageRelativeFtpPathParameter != mContentPageRelativeFtpPathParameter) {
			NotificationChain msgs = null;
			if (mContentPageRelativeFtpPathParameter != null)
				msgs = ((InternalEObject)mContentPageRelativeFtpPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			if (newMContentPageRelativeFtpPathParameter != null) {				
				newMContentPageRelativeFtpPathParameter.setDefaultDescription("Specifies the path of the directory relative to the FTP path where to publish the MP3 content page to, e.g. \'/recordings\'.");
				newMContentPageRelativeFtpPathParameter.setDefaultName("Content page relative FTP path");
				newMContentPageRelativeFtpPathParameter.setValueType(Type.getTypeForName("Text"));
				newMContentPageRelativeFtpPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER));
				newMContentPageRelativeFtpPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentPageRelativeFtpPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentPageRelativeFtpPathParameter != null) {
				if(newMContentPageRelativeFtpPathParameter != null)
					newMContentPageRelativeFtpPathParameter.eAdapters().addAll(mContentPageRelativeFtpPathParameter.eAdapters());			
			
				mContentPageRelativeFtpPathParameter.eAdapters().clear();
			}
			msgs = basicSetMContentPageRelativeFtpPathParameter(newMContentPageRelativeFtpPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER, newMContentPageRelativeFtpPathParameter, newMContentPageRelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Page Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Page Relative Ftp Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Page Relative Ftp Path Parameter</em>' attribute.
	 * @see #setContentPageRelativeFtpPathParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentPageRelativeFtpPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getContentPageRelativeFtpPathParameter() {
		return contentPageRelativeFtpPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageRelativeFtpPathParameter <em>Content Page Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentPageRelativeFtpPathParameter the new value of the '<em>Content Page Relative Ftp Path Parameter</em>' attribute.
	 * @see #getContentPageRelativeFtpPathParameter()
	 * @generated
	 */
	public void setContentPageRelativeFtpPathParameter(String newContentPageRelativeFtpPathParameter) {
		String oldContentPageRelativeFtpPathParameter = contentPageRelativeFtpPathParameter;
		contentPageRelativeFtpPathParameter = newContentPageRelativeFtpPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER, oldContentPageRelativeFtpPathParameter, contentPageRelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Header File Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Header File Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Header File Path Parameter</em>' containment reference.
	 * @see #setMContentHeaderFilePathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentHeaderFilePathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Content header file path' description='Specifies the file path to the header for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.'"
	 * @generated
	 */
	public MParameter getMContentHeaderFilePathParameter() {
		return mContentHeaderFilePathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentHeaderFilePathParameter(MParameter newMContentHeaderFilePathParameter, NotificationChain msgs) {
		MParameter oldMContentHeaderFilePathParameter = mContentHeaderFilePathParameter;
		mContentHeaderFilePathParameter = newMContentHeaderFilePathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER, oldMContentHeaderFilePathParameter, newMContentHeaderFilePathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentHeaderFilePathParameter <em>MContent Header File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentHeaderFilePathParameter the new value of the '<em>MContent Header File Path Parameter</em>' containment reference.
	 * @see #getMContentHeaderFilePathParameter()
	 * @generated
	 */
	public void setMContentHeaderFilePathParameter(MParameter newMContentHeaderFilePathParameter) {
		if (newMContentHeaderFilePathParameter != mContentHeaderFilePathParameter) {
			NotificationChain msgs = null;
			if (mContentHeaderFilePathParameter != null)
				msgs = ((InternalEObject)mContentHeaderFilePathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER, null, msgs);
			if (newMContentHeaderFilePathParameter != null) {				
				newMContentHeaderFilePathParameter.setDefaultDescription("Specifies the file path to the header for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.");
				newMContentHeaderFilePathParameter.setDefaultName("Content header file path");
				newMContentHeaderFilePathParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMContentHeaderFilePathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER));
				newMContentHeaderFilePathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentHeaderFilePathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentHeaderFilePathParameter != null) {
				if(newMContentHeaderFilePathParameter != null)
					newMContentHeaderFilePathParameter.eAdapters().addAll(mContentHeaderFilePathParameter.eAdapters());			
			
				mContentHeaderFilePathParameter.eAdapters().clear();
			}
			msgs = basicSetMContentHeaderFilePathParameter(newMContentHeaderFilePathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER, newMContentHeaderFilePathParameter, newMContentHeaderFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Header File Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Header File Path Parameter</em>' attribute.
	 * @see #setContentHeaderFilePathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentHeaderFilePathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getContentHeaderFilePathParameter() {
		return contentHeaderFilePathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentHeaderFilePathParameter <em>Content Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentHeaderFilePathParameter the new value of the '<em>Content Header File Path Parameter</em>' attribute.
	 * @see #getContentHeaderFilePathParameter()
	 * @generated
	 */
	public void setContentHeaderFilePathParameter(File newContentHeaderFilePathParameter) {
		File oldContentHeaderFilePathParameter = contentHeaderFilePathParameter;
		contentHeaderFilePathParameter = newContentHeaderFilePathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER, oldContentHeaderFilePathParameter, contentHeaderFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Footer File Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Footer File Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Footer File Path Parameter</em>' containment reference.
	 * @see #setMContentFooterFilePathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentFooterFilePathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Content footer file path' description='Specifies the file path to the footer for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.'"
	 * @generated
	 */
	public MParameter getMContentFooterFilePathParameter() {
		return mContentFooterFilePathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentFooterFilePathParameter(MParameter newMContentFooterFilePathParameter, NotificationChain msgs) {
		MParameter oldMContentFooterFilePathParameter = mContentFooterFilePathParameter;
		mContentFooterFilePathParameter = newMContentFooterFilePathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER, oldMContentFooterFilePathParameter, newMContentFooterFilePathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentFooterFilePathParameter <em>MContent Footer File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentFooterFilePathParameter the new value of the '<em>MContent Footer File Path Parameter</em>' containment reference.
	 * @see #getMContentFooterFilePathParameter()
	 * @generated
	 */
	public void setMContentFooterFilePathParameter(MParameter newMContentFooterFilePathParameter) {
		if (newMContentFooterFilePathParameter != mContentFooterFilePathParameter) {
			NotificationChain msgs = null;
			if (mContentFooterFilePathParameter != null)
				msgs = ((InternalEObject)mContentFooterFilePathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER, null, msgs);
			if (newMContentFooterFilePathParameter != null) {				
				newMContentFooterFilePathParameter.setDefaultDescription("Specifies the file path to the footer for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory.");
				newMContentFooterFilePathParameter.setDefaultName("Content footer file path");
				newMContentFooterFilePathParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMContentFooterFilePathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER));
				newMContentFooterFilePathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentFooterFilePathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentFooterFilePathParameter != null) {
				if(newMContentFooterFilePathParameter != null)
					newMContentFooterFilePathParameter.eAdapters().addAll(mContentFooterFilePathParameter.eAdapters());			
			
				mContentFooterFilePathParameter.eAdapters().clear();
			}
			msgs = basicSetMContentFooterFilePathParameter(newMContentFooterFilePathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER, newMContentFooterFilePathParameter, newMContentFooterFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Footer File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Footer File Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Footer File Path Parameter</em>' attribute.
	 * @see #setContentFooterFilePathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentFooterFilePathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getContentFooterFilePathParameter() {
		return contentFooterFilePathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentFooterFilePathParameter <em>Content Footer File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentFooterFilePathParameter the new value of the '<em>Content Footer File Path Parameter</em>' attribute.
	 * @see #getContentFooterFilePathParameter()
	 * @generated
	 */
	public void setContentFooterFilePathParameter(File newContentFooterFilePathParameter) {
		File oldContentFooterFilePathParameter = contentFooterFilePathParameter;
		contentFooterFilePathParameter = newContentFooterFilePathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER, oldContentFooterFilePathParameter, contentFooterFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Page File Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Page File Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Page File Path Parameter</em>' containment reference.
	 * @see #setMContentPageFilePathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentPageFilePathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Content page file path' description='Specifies the content web page that lists the MP3s recordings. This page is generated from the header and footer files and the published MP3 files.'"
	 * @generated
	 */
	public MParameter getMContentPageFilePathParameter() {
		return mContentPageFilePathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentPageFilePathParameter(MParameter newMContentPageFilePathParameter, NotificationChain msgs) {
		MParameter oldMContentPageFilePathParameter = mContentPageFilePathParameter;
		mContentPageFilePathParameter = newMContentPageFilePathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER, oldMContentPageFilePathParameter, newMContentPageFilePathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageFilePathParameter <em>MContent Page File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentPageFilePathParameter the new value of the '<em>MContent Page File Path Parameter</em>' containment reference.
	 * @see #getMContentPageFilePathParameter()
	 * @generated
	 */
	public void setMContentPageFilePathParameter(MParameter newMContentPageFilePathParameter) {
		if (newMContentPageFilePathParameter != mContentPageFilePathParameter) {
			NotificationChain msgs = null;
			if (mContentPageFilePathParameter != null)
				msgs = ((InternalEObject)mContentPageFilePathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER, null, msgs);
			if (newMContentPageFilePathParameter != null) {				
				newMContentPageFilePathParameter.setDefaultDescription("Specifies the content web page that lists the MP3s recordings. This page is generated from the header and footer files and the published MP3 files.");
				newMContentPageFilePathParameter.setDefaultName("Content page file path");
				newMContentPageFilePathParameter.setValueType(Type.getTypeForName("File"));
				newMContentPageFilePathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER));
				newMContentPageFilePathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentPageFilePathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentPageFilePathParameter != null) {
				if(newMContentPageFilePathParameter != null)
					newMContentPageFilePathParameter.eAdapters().addAll(mContentPageFilePathParameter.eAdapters());			
			
				mContentPageFilePathParameter.eAdapters().clear();
			}
			msgs = basicSetMContentPageFilePathParameter(newMContentPageFilePathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER, newMContentPageFilePathParameter, newMContentPageFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Page File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Page File Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Page File Path Parameter</em>' attribute.
	 * @see #setContentPageFilePathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentPageFilePathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getContentPageFilePathParameter() {
		return contentPageFilePathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageFilePathParameter <em>Content Page File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentPageFilePathParameter the new value of the '<em>Content Page File Path Parameter</em>' attribute.
	 * @see #getContentPageFilePathParameter()
	 * @generated
	 */
	public void setContentPageFilePathParameter(File newContentPageFilePathParameter) {
		File oldContentPageFilePathParameter = contentPageFilePathParameter;
		contentPageFilePathParameter = newContentPageFilePathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER, oldContentPageFilePathParameter, contentPageFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast File Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast File Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast File Path Parameter</em>' containment reference.
	 * @see #setMPodcastFilePathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MPodcastFilePathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast file path' description='Specifies the podcast file. This file is generated from the header file and the published MP3 files.'"
	 * @generated
	 */
	public MParameter getMPodcastFilePathParameter() {
		return mPodcastFilePathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastFilePathParameter(MParameter newMPodcastFilePathParameter, NotificationChain msgs) {
		MParameter oldMPodcastFilePathParameter = mPodcastFilePathParameter;
		mPodcastFilePathParameter = newMPodcastFilePathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER, oldMPodcastFilePathParameter, newMPodcastFilePathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFilePathParameter <em>MPodcast File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastFilePathParameter the new value of the '<em>MPodcast File Path Parameter</em>' containment reference.
	 * @see #getMPodcastFilePathParameter()
	 * @generated
	 */
	public void setMPodcastFilePathParameter(MParameter newMPodcastFilePathParameter) {
		if (newMPodcastFilePathParameter != mPodcastFilePathParameter) {
			NotificationChain msgs = null;
			if (mPodcastFilePathParameter != null)
				msgs = ((InternalEObject)mPodcastFilePathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER, null, msgs);
			if (newMPodcastFilePathParameter != null) {				
				newMPodcastFilePathParameter.setDefaultDescription("Specifies the podcast file. This file is generated from the header file and the published MP3 files.");
				newMPodcastFilePathParameter.setDefaultName("Podcast file path");
				newMPodcastFilePathParameter.setValueType(Type.getTypeForName("File"));
				newMPodcastFilePathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER));
				newMPodcastFilePathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastFilePathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastFilePathParameter != null) {
				if(newMPodcastFilePathParameter != null)
					newMPodcastFilePathParameter.eAdapters().addAll(mPodcastFilePathParameter.eAdapters());			
			
				mPodcastFilePathParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastFilePathParameter(newMPodcastFilePathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER, newMPodcastFilePathParameter, newMPodcastFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast File Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast File Path Parameter</em>' attribute.
	 * @see #setPodcastFilePathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_PodcastFilePathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getPodcastFilePathParameter() {
		return podcastFilePathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFilePathParameter <em>Podcast File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastFilePathParameter the new value of the '<em>Podcast File Path Parameter</em>' attribute.
	 * @see #getPodcastFilePathParameter()
	 * @generated
	 */
	public void setPodcastFilePathParameter(File newPodcastFilePathParameter) {
		File oldPodcastFilePathParameter = podcastFilePathParameter;
		podcastFilePathParameter = newPodcastFilePathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER, oldPodcastFilePathParameter, podcastFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Relative Ftp Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Relative Ftp Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Relative Ftp Path Parameter</em>' containment reference.
	 * @see #setMPodcastRelativeFtpPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MPodcastRelativeFtpPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast relative FTP path' description='Specifies the path relative to the FTP path where the podcast RSS feed should be created or updated.'"
	 * @generated
	 */
	public MParameter getMPodcastRelativeFtpPathParameter() {
		return mPodcastRelativeFtpPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastRelativeFtpPathParameter(MParameter newMPodcastRelativeFtpPathParameter, NotificationChain msgs) {
		MParameter oldMPodcastRelativeFtpPathParameter = mPodcastRelativeFtpPathParameter;
		mPodcastRelativeFtpPathParameter = newMPodcastRelativeFtpPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER, oldMPodcastRelativeFtpPathParameter, newMPodcastRelativeFtpPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastRelativeFtpPathParameter <em>MPodcast Relative Ftp Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastRelativeFtpPathParameter the new value of the '<em>MPodcast Relative Ftp Path Parameter</em>' containment reference.
	 * @see #getMPodcastRelativeFtpPathParameter()
	 * @generated
	 */
	public void setMPodcastRelativeFtpPathParameter(MParameter newMPodcastRelativeFtpPathParameter) {
		if (newMPodcastRelativeFtpPathParameter != mPodcastRelativeFtpPathParameter) {
			NotificationChain msgs = null;
			if (mPodcastRelativeFtpPathParameter != null)
				msgs = ((InternalEObject)mPodcastRelativeFtpPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			if (newMPodcastRelativeFtpPathParameter != null) {				
				newMPodcastRelativeFtpPathParameter.setDefaultDescription("Specifies the path relative to the FTP path where the podcast RSS feed should be created or updated.");
				newMPodcastRelativeFtpPathParameter.setDefaultName("Podcast relative FTP path");
				newMPodcastRelativeFtpPathParameter.setValueType(Type.getTypeForName("Text"));
				newMPodcastRelativeFtpPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER));
				newMPodcastRelativeFtpPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastRelativeFtpPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastRelativeFtpPathParameter != null) {
				if(newMPodcastRelativeFtpPathParameter != null)
					newMPodcastRelativeFtpPathParameter.eAdapters().addAll(mPodcastRelativeFtpPathParameter.eAdapters());			
			
				mPodcastRelativeFtpPathParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastRelativeFtpPathParameter(newMPodcastRelativeFtpPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER, newMPodcastRelativeFtpPathParameter, newMPodcastRelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Relative Ftp Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Relative Ftp Path Parameter</em>' attribute.
	 * @see #setPodcastRelativeFtpPathParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_PodcastRelativeFtpPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getPodcastRelativeFtpPathParameter() {
		return podcastRelativeFtpPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastRelativeFtpPathParameter <em>Podcast Relative Ftp Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastRelativeFtpPathParameter the new value of the '<em>Podcast Relative Ftp Path Parameter</em>' attribute.
	 * @see #getPodcastRelativeFtpPathParameter()
	 * @generated
	 */
	public void setPodcastRelativeFtpPathParameter(String newPodcastRelativeFtpPathParameter) {
		String oldPodcastRelativeFtpPathParameter = podcastRelativeFtpPathParameter;
		podcastRelativeFtpPathParameter = newPodcastRelativeFtpPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER, oldPodcastRelativeFtpPathParameter, podcastRelativeFtpPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast Header File Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast Header File Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast Header File Path Parameter</em>' containment reference.
	 * @see #setMPodcastHeaderFilePathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MPodcastHeaderFilePathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast header file path' description='Specifies the file path to the header for the podcast file.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMPodcastHeaderFilePathParameter() {
		return mPodcastHeaderFilePathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastHeaderFilePathParameter(MParameter newMPodcastHeaderFilePathParameter, NotificationChain msgs) {
		MParameter oldMPodcastHeaderFilePathParameter = mPodcastHeaderFilePathParameter;
		mPodcastHeaderFilePathParameter = newMPodcastHeaderFilePathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER, oldMPodcastHeaderFilePathParameter, newMPodcastHeaderFilePathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastHeaderFilePathParameter <em>MPodcast Header File Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastHeaderFilePathParameter the new value of the '<em>MPodcast Header File Path Parameter</em>' containment reference.
	 * @see #getMPodcastHeaderFilePathParameter()
	 * @generated
	 */
	public void setMPodcastHeaderFilePathParameter(MParameter newMPodcastHeaderFilePathParameter) {
		if (newMPodcastHeaderFilePathParameter != mPodcastHeaderFilePathParameter) {
			NotificationChain msgs = null;
			if (mPodcastHeaderFilePathParameter != null)
				msgs = ((InternalEObject)mPodcastHeaderFilePathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER, null, msgs);
			if (newMPodcastHeaderFilePathParameter != null) {				
				newMPodcastHeaderFilePathParameter.setDefaultName("Podcast header file path");
				newMPodcastHeaderFilePathParameter.setDefaultDescription("Specifies the file path to the header for the podcast file.");
				newMPodcastHeaderFilePathParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMPodcastHeaderFilePathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER));
				newMPodcastHeaderFilePathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastHeaderFilePathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastHeaderFilePathParameter != null) {
				if(newMPodcastHeaderFilePathParameter != null)
					newMPodcastHeaderFilePathParameter.eAdapters().addAll(mPodcastHeaderFilePathParameter.eAdapters());			
			
				mPodcastHeaderFilePathParameter.eAdapters().clear();
			}
			msgs = basicSetMPodcastHeaderFilePathParameter(newMPodcastHeaderFilePathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER, newMPodcastHeaderFilePathParameter, newMPodcastHeaderFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Podcast Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast Header File Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast Header File Path Parameter</em>' attribute.
	 * @see #setPodcastHeaderFilePathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_PodcastHeaderFilePathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getPodcastHeaderFilePathParameter() {
		return podcastHeaderFilePathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastHeaderFilePathParameter <em>Podcast Header File Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastHeaderFilePathParameter the new value of the '<em>Podcast Header File Path Parameter</em>' attribute.
	 * @see #getPodcastHeaderFilePathParameter()
	 * @generated
	 */
	public void setPodcastHeaderFilePathParameter(File newPodcastHeaderFilePathParameter) {
		File oldPodcastHeaderFilePathParameter = podcastHeaderFilePathParameter;
		podcastHeaderFilePathParameter = newPodcastHeaderFilePathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER, oldPodcastHeaderFilePathParameter, podcastHeaderFilePathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Include Mp3 Player Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Include Mp3 Player Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Include Mp3 Player Parameter</em>' containment reference.
	 * @see #setMContentIncludeMp3PlayerParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentIncludeMp3PlayerParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Include MP3 player on content page' description='Specifies whether an MP3 player should included on the content page or not.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMContentIncludeMp3PlayerParameter() {
		return mContentIncludeMp3PlayerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentIncludeMp3PlayerParameter(MParameter newMContentIncludeMp3PlayerParameter, NotificationChain msgs) {
		MParameter oldMContentIncludeMp3PlayerParameter = mContentIncludeMp3PlayerParameter;
		mContentIncludeMp3PlayerParameter = newMContentIncludeMp3PlayerParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER, oldMContentIncludeMp3PlayerParameter, newMContentIncludeMp3PlayerParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentIncludeMp3PlayerParameter <em>MContent Include Mp3 Player Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentIncludeMp3PlayerParameter the new value of the '<em>MContent Include Mp3 Player Parameter</em>' containment reference.
	 * @see #getMContentIncludeMp3PlayerParameter()
	 * @generated
	 */
	public void setMContentIncludeMp3PlayerParameter(MParameter newMContentIncludeMp3PlayerParameter) {
		if (newMContentIncludeMp3PlayerParameter != mContentIncludeMp3PlayerParameter) {
			NotificationChain msgs = null;
			if (mContentIncludeMp3PlayerParameter != null)
				msgs = ((InternalEObject)mContentIncludeMp3PlayerParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER, null, msgs);
			if (newMContentIncludeMp3PlayerParameter != null) {				
				newMContentIncludeMp3PlayerParameter.setDefaultName("Include MP3 player on content page");
				newMContentIncludeMp3PlayerParameter.setDefaultDescription("Specifies whether an MP3 player should included on the content page or not.");
				newMContentIncludeMp3PlayerParameter.setValueType(Type.getTypeForName("Yes/No"));
				newMContentIncludeMp3PlayerParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER));
				newMContentIncludeMp3PlayerParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentIncludeMp3PlayerParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentIncludeMp3PlayerParameter != null) {
				if(newMContentIncludeMp3PlayerParameter != null)
					newMContentIncludeMp3PlayerParameter.eAdapters().addAll(mContentIncludeMp3PlayerParameter.eAdapters());			
			
				mContentIncludeMp3PlayerParameter.eAdapters().clear();
			}
			msgs = basicSetMContentIncludeMp3PlayerParameter(newMContentIncludeMp3PlayerParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER, newMContentIncludeMp3PlayerParameter, newMContentIncludeMp3PlayerParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Include Mp3 Player Parameter</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Include Mp3 Player Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Include Mp3 Player Parameter</em>' attribute.
	 * @see #setContentIncludeMp3PlayerParameter(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentIncludeMp3PlayerParameter()
	 * @model default="true" dataType="org.onceforall.dms.desktop.logic.MBoolean"
	 * @generated
	 */
	public Boolean getContentIncludeMp3PlayerParameter() {
		return contentIncludeMp3PlayerParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentIncludeMp3PlayerParameter <em>Content Include Mp3 Player Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentIncludeMp3PlayerParameter the new value of the '<em>Content Include Mp3 Player Parameter</em>' attribute.
	 * @see #getContentIncludeMp3PlayerParameter()
	 * @generated
	 */
	public void setContentIncludeMp3PlayerParameter(Boolean newContentIncludeMp3PlayerParameter) {
		Boolean oldContentIncludeMp3PlayerParameter = contentIncludeMp3PlayerParameter;
		contentIncludeMp3PlayerParameter = newContentIncludeMp3PlayerParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER, oldContentIncludeMp3PlayerParameter, contentIncludeMp3PlayerParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Group Recordings Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Group Recordings Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Group Recordings Parameter</em>' containment reference.
	 * @see #setMContentGroupRecordingsParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentGroupRecordingsParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Group recordinds by month on content page' description='Specifies whether the recordings on the content page should be grouped by month.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMContentGroupRecordingsParameter() {
		return mContentGroupRecordingsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentGroupRecordingsParameter(MParameter newMContentGroupRecordingsParameter, NotificationChain msgs) {
		MParameter oldMContentGroupRecordingsParameter = mContentGroupRecordingsParameter;
		mContentGroupRecordingsParameter = newMContentGroupRecordingsParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER, oldMContentGroupRecordingsParameter, newMContentGroupRecordingsParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentGroupRecordingsParameter <em>MContent Group Recordings Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentGroupRecordingsParameter the new value of the '<em>MContent Group Recordings Parameter</em>' containment reference.
	 * @see #getMContentGroupRecordingsParameter()
	 * @generated
	 */
	public void setMContentGroupRecordingsParameter(MParameter newMContentGroupRecordingsParameter) {
		if (newMContentGroupRecordingsParameter != mContentGroupRecordingsParameter) {
			NotificationChain msgs = null;
			if (mContentGroupRecordingsParameter != null)
				msgs = ((InternalEObject)mContentGroupRecordingsParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER, null, msgs);
			if (newMContentGroupRecordingsParameter != null) {				
				newMContentGroupRecordingsParameter.setDefaultName("Group recordinds by month on content page");
				newMContentGroupRecordingsParameter.setDefaultDescription("Specifies whether the recordings on the content page should be grouped by month.");
				newMContentGroupRecordingsParameter.setValueType(Type.getTypeForName("Yes/No"));
				newMContentGroupRecordingsParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER));
				newMContentGroupRecordingsParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentGroupRecordingsParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentGroupRecordingsParameter != null) {
				if(newMContentGroupRecordingsParameter != null)
					newMContentGroupRecordingsParameter.eAdapters().addAll(mContentGroupRecordingsParameter.eAdapters());			
			
				mContentGroupRecordingsParameter.eAdapters().clear();
			}
			msgs = basicSetMContentGroupRecordingsParameter(newMContentGroupRecordingsParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER, newMContentGroupRecordingsParameter, newMContentGroupRecordingsParameter));
	}

	/**
	 * Returns the value of the '<em><b>Content Group Recordings Parameter</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Group Recordings Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Group Recordings Parameter</em>' attribute.
	 * @see #setContentGroupRecordingsParameter(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentGroupRecordingsParameter()
	 * @model default="true" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true"
	 * @generated
	 */
	public Boolean getContentGroupRecordingsParameter() {
		return contentGroupRecordingsParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentGroupRecordingsParameter <em>Content Group Recordings Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentGroupRecordingsParameter the new value of the '<em>Content Group Recordings Parameter</em>' attribute.
	 * @see #getContentGroupRecordingsParameter()
	 * @generated
	 */
	public void setContentGroupRecordingsParameter(Boolean newContentGroupRecordingsParameter) {
		Boolean oldContentGroupRecordingsParameter = contentGroupRecordingsParameter;
		contentGroupRecordingsParameter = newContentGroupRecordingsParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER, oldContentGroupRecordingsParameter, contentGroupRecordingsParameter));
	}

	/**
	 * Returns the value of the '<em><b>MContent Page Url Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MContent Page Url Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MContent Page Url Result</em>' containment reference.
	 * @see #setMContentPageUrlResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MContentPageUrlResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Content page URL' description='Specifies the URL to content page.'"
	 * @generated
	 */
	public MResult getMContentPageUrlResult() {
		return mContentPageUrlResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMContentPageUrlResult(MResult newMContentPageUrlResult, NotificationChain msgs) {
		MResult oldMContentPageUrlResult = mContentPageUrlResult;
		mContentPageUrlResult = newMContentPageUrlResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT, oldMContentPageUrlResult, newMContentPageUrlResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageUrlResult <em>MContent Page Url Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMContentPageUrlResult the new value of the '<em>MContent Page Url Result</em>' containment reference.
	 * @see #getMContentPageUrlResult()
	 * @generated
	 */
	public void setMContentPageUrlResult(MResult newMContentPageUrlResult) {
		if (newMContentPageUrlResult != mContentPageUrlResult) {
			NotificationChain msgs = null;
			if (mContentPageUrlResult != null)
				msgs = ((InternalEObject)mContentPageUrlResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT, null, msgs);
			if (newMContentPageUrlResult != null) {				
				newMContentPageUrlResult.setDefaultDescription("Specifies the URL to content page.");
				newMContentPageUrlResult.setDefaultName("Content page URL");
				newMContentPageUrlResult.setValueType(Type.getTypeForName("URL"));
				newMContentPageUrlResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT));
				newMContentPageUrlResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMContentPageUrlResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mContentPageUrlResult != null) {
				if(newMContentPageUrlResult != null)
					newMContentPageUrlResult.eAdapters().addAll(mContentPageUrlResult.eAdapters());			
			
				mContentPageUrlResult.eAdapters().clear();
			}
			msgs = basicSetMContentPageUrlResult(newMContentPageUrlResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT, newMContentPageUrlResult, newMContentPageUrlResult));
	}

	/**
	 * Returns the value of the '<em><b>Content Page Url Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Page Url Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Page Url Result</em>' attribute.
	 * @see #setContentPageUrlResult(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_ContentPageUrlResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl" required="true" transient="true"
	 * @generated
	 */
	public URL getContentPageUrlResult() {
		return contentPageUrlResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageUrlResult <em>Content Page Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newContentPageUrlResult the new value of the '<em>Content Page Url Result</em>' attribute.
	 * @see #getContentPageUrlResult()
	 * @generated
	 */
	public void setContentPageUrlResult(URL newContentPageUrlResult) {
		URL oldContentPageUrlResult = contentPageUrlResult;
		contentPageUrlResult = newContentPageUrlResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT, oldContentPageUrlResult, contentPageUrlResult));
	}

	/**
	 * Returns the value of the '<em><b>MPodcast File Url Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPodcast File Url Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPodcast File Url Result</em>' containment reference.
	 * @see #setMPodcastFileUrlResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_MPodcastFileUrlResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Podcast file URL' description='Specifies the URL to podcast file.'"
	 * @generated
	 */
	public MResult getMPodcastFileUrlResult() {
		return mPodcastFileUrlResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPodcastFileUrlResult(MResult newMPodcastFileUrlResult, NotificationChain msgs) {
		MResult oldMPodcastFileUrlResult = mPodcastFileUrlResult;
		mPodcastFileUrlResult = newMPodcastFileUrlResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT, oldMPodcastFileUrlResult, newMPodcastFileUrlResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFileUrlResult <em>MPodcast File Url Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMPodcastFileUrlResult the new value of the '<em>MPodcast File Url Result</em>' containment reference.
	 * @see #getMPodcastFileUrlResult()
	 * @generated
	 */
	public void setMPodcastFileUrlResult(MResult newMPodcastFileUrlResult) {
		if (newMPodcastFileUrlResult != mPodcastFileUrlResult) {
			NotificationChain msgs = null;
			if (mPodcastFileUrlResult != null)
				msgs = ((InternalEObject)mPodcastFileUrlResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT, null, msgs);
			if (newMPodcastFileUrlResult != null) {				
				newMPodcastFileUrlResult.setDefaultDescription("Specifies the URL to podcast file.");
				newMPodcastFileUrlResult.setDefaultName("Podcast file URL");
				newMPodcastFileUrlResult.setValueType(Type.getTypeForName("URL"));
				newMPodcastFileUrlResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT));
				newMPodcastFileUrlResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPodcastFileUrlResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPodcastFileUrlResult != null) {
				if(newMPodcastFileUrlResult != null)
					newMPodcastFileUrlResult.eAdapters().addAll(mPodcastFileUrlResult.eAdapters());			
			
				mPodcastFileUrlResult.eAdapters().clear();
			}
			msgs = basicSetMPodcastFileUrlResult(newMPodcastFileUrlResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT, newMPodcastFileUrlResult, newMPodcastFileUrlResult));
	}

	/**
	 * Returns the value of the '<em><b>Podcast File Url Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Podcast File Url Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podcast File Url Result</em>' attribute.
	 * @see #setPodcastFileUrlResult(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep_PodcastFileUrlResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MUrl" required="true" transient="true"
	 * @generated
	 */
	public URL getPodcastFileUrlResult() {
		return podcastFileUrlResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFileUrlResult <em>Podcast File Url Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newPodcastFileUrlResult the new value of the '<em>Podcast File Url Result</em>' attribute.
	 * @see #getPodcastFileUrlResult()
	 * @generated
	 */
	public void setPodcastFileUrlResult(URL newPodcastFileUrlResult) {
		URL oldPodcastFileUrlResult = podcastFileUrlResult;
		podcastFileUrlResult = newPodcastFileUrlResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT, oldPodcastFileUrlResult, podcastFileUrlResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:
				return basicSetMMaxiumumDiskSpaceParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:
				return basicSetMMp3RelativeFtpPathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:
				return basicSetMWebServerUrlParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				return basicSetMContentPageRelativeFtpPathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:
				return basicSetMContentHeaderFilePathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:
				return basicSetMContentFooterFilePathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:
				return basicSetMContentPageFilePathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:
				return basicSetMPodcastFilePathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:
				return basicSetMPodcastRelativeFtpPathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:
				return basicSetMPodcastHeaderFilePathParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				return basicSetMContentIncludeMp3PlayerParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:
				return basicSetMContentGroupRecordingsParameter(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:
				return basicSetMContentPageUrlResult(null, msgs);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:
				return basicSetMPodcastFileUrlResult(null, msgs);
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
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:
				return getMMaxiumumDiskSpaceParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER:
				return getMaxiumumDiskSpaceParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:
				return getMMp3RelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER:
				return getMp3RelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:
				return getMWebServerUrlParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER:
				return getWebServerUrlParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				return getMContentPageRelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				return getContentPageRelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:
				return getMContentHeaderFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER:
				return getContentHeaderFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:
				return getMContentFooterFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER:
				return getContentFooterFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:
				return getMContentPageFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER:
				return getContentPageFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:
				return getMPodcastFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER:
				return getPodcastFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:
				return getMPodcastRelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER:
				return getPodcastRelativeFtpPathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:
				return getMPodcastHeaderFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER:
				return getPodcastHeaderFilePathParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				return getMContentIncludeMp3PlayerParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				return getContentIncludeMp3PlayerParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:
				return getMContentGroupRecordingsParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER:
				return getContentGroupRecordingsParameter();
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:
				return getMContentPageUrlResult();
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT:
				return getContentPageUrlResult();
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:
				return getMPodcastFileUrlResult();
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT:
				return getPodcastFileUrlResult();
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
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:    
				setMMaxiumumDiskSpaceParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER:    
				setMaxiumumDiskSpaceParameter((Long)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:    
				setMMp3RelativeFtpPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER:    
				setMp3RelativeFtpPathParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:    
				setMWebServerUrlParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER:    
				setWebServerUrlParameter((URL)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:    
				setMContentPageRelativeFtpPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:    
				setContentPageRelativeFtpPathParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:    
				setMContentHeaderFilePathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER:    
				setContentHeaderFilePathParameter((File)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:    
				setMContentFooterFilePathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER:    
				setContentFooterFilePathParameter((File)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:    
				setMContentPageFilePathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER:    
				setContentPageFilePathParameter((File)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:    
				setMPodcastFilePathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER:    
				setPodcastFilePathParameter((File)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:    
				setMPodcastRelativeFtpPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER:    
				setPodcastRelativeFtpPathParameter((String)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:    
				setMPodcastHeaderFilePathParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER:    
				setPodcastHeaderFilePathParameter((File)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:    
				setMContentIncludeMp3PlayerParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER:    
				setContentIncludeMp3PlayerParameter((Boolean)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:    
				setMContentGroupRecordingsParameter((MParameter)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER:    
				setContentGroupRecordingsParameter((Boolean)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:    
				setMContentPageUrlResult((MResult)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT:    
				setContentPageUrlResult((URL)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:    
				setMPodcastFileUrlResult((MResult)newValue);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT:    
				setPodcastFileUrlResult((URL)newValue);
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
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:
				setMMaxiumumDiskSpaceParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER:
				setMaxiumumDiskSpaceParameter(getDefaultMaxiumumDiskSpaceParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:
				setMMp3RelativeFtpPathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER:
				setMp3RelativeFtpPathParameter(getDefaultMp3RelativeFtpPathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:
				setMWebServerUrlParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER:
				setWebServerUrlParameter(getDefaultWebServerUrlParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				setMContentPageRelativeFtpPathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				setContentPageRelativeFtpPathParameter(getDefaultContentPageRelativeFtpPathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:
				setMContentHeaderFilePathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER:
				setContentHeaderFilePathParameter(getDefaultContentHeaderFilePathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:
				setMContentFooterFilePathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER:
				setContentFooterFilePathParameter(getDefaultContentFooterFilePathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:
				setMContentPageFilePathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER:
				setContentPageFilePathParameter(getDefaultContentPageFilePathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:
				setMPodcastFilePathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER:
				setPodcastFilePathParameter(getDefaultPodcastFilePathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:
				setMPodcastRelativeFtpPathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER:
				setPodcastRelativeFtpPathParameter(getDefaultPodcastRelativeFtpPathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:
				setMPodcastHeaderFilePathParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER:
				setPodcastHeaderFilePathParameter(getDefaultPodcastHeaderFilePathParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				setMContentIncludeMp3PlayerParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				setContentIncludeMp3PlayerParameter(getDefaultContentIncludeMp3PlayerParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:
				setMContentGroupRecordingsParameter((MParameter)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER:
				setContentGroupRecordingsParameter(getDefaultContentGroupRecordingsParameter());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:
				setMContentPageUrlResult((MResult)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT:
				setContentPageUrlResult(getDefaultContentPageUrlResult());
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:
				setMPodcastFileUrlResult((MResult)null);
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT:
				setPodcastFileUrlResult(getDefaultPodcastFileUrlResult());
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
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:
				return mMaxiumumDiskSpaceParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER:
				return getDefaultMaxiumumDiskSpaceParameter() == null ? maxiumumDiskSpaceParameter != null : !getDefaultMaxiumumDiskSpaceParameter().equals(maxiumumDiskSpaceParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:
				return mMp3RelativeFtpPathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER:
				return getDefaultMp3RelativeFtpPathParameter() == null ? mp3RelativeFtpPathParameter != null : !getDefaultMp3RelativeFtpPathParameter().equals(mp3RelativeFtpPathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:
				return mWebServerUrlParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER:
				return getDefaultWebServerUrlParameter() == null ? webServerUrlParameter != null : !getDefaultWebServerUrlParameter().equals(webServerUrlParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				return mContentPageRelativeFtpPathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
				return getDefaultContentPageRelativeFtpPathParameter() == null ? contentPageRelativeFtpPathParameter != null : !getDefaultContentPageRelativeFtpPathParameter().equals(contentPageRelativeFtpPathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:
				return mContentHeaderFilePathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER:
				return getDefaultContentHeaderFilePathParameter() == null ? contentHeaderFilePathParameter != null : !getDefaultContentHeaderFilePathParameter().equals(contentHeaderFilePathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:
				return mContentFooterFilePathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER:
				return getDefaultContentFooterFilePathParameter() == null ? contentFooterFilePathParameter != null : !getDefaultContentFooterFilePathParameter().equals(contentFooterFilePathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:
				return mContentPageFilePathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER:
				return getDefaultContentPageFilePathParameter() == null ? contentPageFilePathParameter != null : !getDefaultContentPageFilePathParameter().equals(contentPageFilePathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:
				return mPodcastFilePathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER:
				return getDefaultPodcastFilePathParameter() == null ? podcastFilePathParameter != null : !getDefaultPodcastFilePathParameter().equals(podcastFilePathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:
				return mPodcastRelativeFtpPathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER:
				return getDefaultPodcastRelativeFtpPathParameter() == null ? podcastRelativeFtpPathParameter != null : !getDefaultPodcastRelativeFtpPathParameter().equals(podcastRelativeFtpPathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:
				return mPodcastHeaderFilePathParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER:
				return getDefaultPodcastHeaderFilePathParameter() == null ? podcastHeaderFilePathParameter != null : !getDefaultPodcastHeaderFilePathParameter().equals(podcastHeaderFilePathParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				return mContentIncludeMp3PlayerParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
				return getDefaultContentIncludeMp3PlayerParameter() == null ? contentIncludeMp3PlayerParameter != null : !getDefaultContentIncludeMp3PlayerParameter().equals(contentIncludeMp3PlayerParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:
				return mContentGroupRecordingsParameter != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER:
				return getDefaultContentGroupRecordingsParameter() == null ? contentGroupRecordingsParameter != null : !getDefaultContentGroupRecordingsParameter().equals(contentGroupRecordingsParameter);
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:
				return mContentPageUrlResult != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT:
				return getDefaultContentPageUrlResult() == null ? contentPageUrlResult != null : !getDefaultContentPageUrlResult().equals(contentPageUrlResult);
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:
				return mPodcastFileUrlResult != null;
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT:
				return getDefaultPodcastFileUrlResult() == null ? podcastFileUrlResult != null : !getDefaultPodcastFileUrlResult().equals(podcastFileUrlResult);
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
		result.append(" (maxiumumDiskSpaceParameter: ");
		result.append(maxiumumDiskSpaceParameter);
		result.append(", mp3RelativeFtpPathParameter: ");
		result.append(mp3RelativeFtpPathParameter);
		result.append(", webServerUrlParameter: ");
		result.append(webServerUrlParameter);
		result.append(", contentPageRelativeFtpPathParameter: ");
		result.append(contentPageRelativeFtpPathParameter);
		result.append(", contentHeaderFilePathParameter: ");
		result.append(contentHeaderFilePathParameter);
		result.append(", contentFooterFilePathParameter: ");
		result.append(contentFooterFilePathParameter);
		result.append(", contentPageFilePathParameter: ");
		result.append(contentPageFilePathParameter);
		result.append(", podcastFilePathParameter: ");
		result.append(podcastFilePathParameter);
		result.append(", podcastRelativeFtpPathParameter: ");
		result.append(podcastRelativeFtpPathParameter);
		result.append(", podcastHeaderFilePathParameter: ");
		result.append(podcastHeaderFilePathParameter);
		result.append(", contentIncludeMp3PlayerParameter: ");
		result.append(contentIncludeMp3PlayerParameter);
		result.append(", contentGroupRecordingsParameter: ");
		result.append(contentGroupRecordingsParameter);
		result.append(", contentPageUrlResult: ");
		result.append(contentPageUrlResult);
		result.append(", podcastFileUrlResult: ");
		result.append(podcastFileUrlResult);
		result.append(')');
		return result.toString();
	}

	/**
	 * Publishes the MP3 entries in the given managed MP3 folder.
	 * 
	 * @param ftpClient Specifies the FTP client that provides access to the FTP server.
	 * @param mMp3Folder Specifies the managed MP3 folder that this step publishes.
	 * @param republishMp3Files Specifies whether MP3 file of entries that are already published should be upload again although they are marked as published.
	 */
    protected void publishMp3s(FTPClient ftpClient, MMp3Folder mMp3Folder, boolean republishMp3Files) throws Throwable {	            
		URL ftpServerUrl = getFtpServerUrlParameter();
		String mp3FTPPath = ftpServerUrl.getPath()+getMp3RelativeFtpPathParameter();
        changeFtpWorkingDirectory(ftpClient, mp3FTPPath);
        
        // Puts all file on the server into a map that is index by the file name for efficient lookup.
        FTPFile[] files = ftpClient.listFiles();
        Map<String, FTPFile> mp3FilesMappedByName = new HashMap<String, FTPFile>();
        for(int index = 0; index < files.length; ++index)
            mp3FilesMappedByName.put(files[index].getName(), files[index]);
        List<MMp3> mMp3s = new ArrayList(mMp3Folder.getMMp3s());
        
        // Makes sure that entries are ordered in reverse date order.
        Collections.sort(mMp3s, MP3_DATE_COMPARATOR);
      
        ensureEnoughDiskSpace(ftpClient, mp3FilesMappedByName, mMp3s);
        
        setProgressStatusProperty("Generating web page and podcast file ...");

        char[] buffer = new char[20000];
        FileReader headerReader = new FileReader(getContentHeaderFilePathParameter());
        FileReader footerReader = new FileReader(getContentFooterFilePathParameter());

        File pageFile = getContentPageFilePathParameter();
        FileWriter pageWriter = new FileWriter(pageFile);

        File podcastFile = getPodcastFilePathParameter();
        FileWriter podcastWriter = new FileWriter(podcastFile);
        
        URL webServerUrl = getWebServerUrlParameter();
        
        try {
            // Writes the header to the page file.
            int charactersRead = headerReader.read(buffer, 0, 20000);
            while(charactersRead >= 0) {
                pageWriter.write(buffer, 0, charactersRead);
                charactersRead = headerReader.read(buffer, 0, 20000);
            }
            
            // Writes the start of the podcast content.
            File podcastHeaderFile = getPodcastHeaderFilePathParameter();
            
            // Reads the podcast header from the file specified in the parameter.
            FileReader podcastHeaderFileReader = new FileReader(podcastHeaderFile);
            charactersRead = podcastHeaderFileReader.read(buffer, 0, 20000);
            while(charactersRead >= 0) {
                podcastWriter.write(buffer, 0, charactersRead);
                charactersRead = podcastHeaderFileReader.read(buffer, 0, 20000);
            }

            StringBuffer publishedMP3sHTML = new StringBuffer();
            //publishedMP3sHTML.append("<script language=\"JavaScript\" src=\"");
            //publishedMP3sHTML.append("run-active-content.js");
            //publishedMP3sHTML.append("\"></script>");
           
            
            // Writes a table row for each published MP3.
            MMp3 perviousMMp3 = null;
            for(MMp3 mMp3: mMp3s) {
                File publishedMP3File = mMp3.getFileProperty();
                
                State currentPublishedMP3Status = mMp3.getStateProperty();
                if(currentPublishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE) || currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE)) {
                    if(publishedMP3File != null) {
	                    // Constructs the name of the published files so that the links can be generated.
	                    String publishedMP3Name = mMp3.getPublishedFileNameProperty();
	                    				                        
	                    String linkText = mMp3.getLinkTextProperty();
	                    String linkDescription = mMp3.getLinkDescriptionProperty();
			            String comment = mMp3.getCommentProperty();
			            
			            String mp3WebPath = webServerUrl.toExternalForm()+getMp3RelativeFtpPathParameter()+"/"+publishedMP3Name;
	                    
			            // Check whether to insert group separators.
			            if(getContentGroupRecordingsParameter()) {
				            Calendar mMp3Calendar = null;
				            if(mMp3.getPodcastPublishingDateProperty() != null) {
				            	mMp3Calendar = Calendar.getInstance();
				            	mMp3Calendar.setTime(mMp3.getPodcastPublishingDateProperty());
				            }
		                    
				            Calendar previousMMp3Calendar = null;
				            if(perviousMMp3 != null && perviousMMp3.getPodcastPublishingDateProperty() != null) {
				            	previousMMp3Calendar = Calendar.getInstance();
				            	previousMMp3Calendar.setTime(perviousMMp3.getPodcastPublishingDateProperty());
				            }
				            
				            // Check whether the month or the year of the publishing date has changed
				            // compared to the previous recording.
				            if(mMp3Calendar == null && previousMMp3Calendar != null
				            		|| mMp3Calendar != null && previousMMp3Calendar == null
				            		|| !mMp3Calendar.equals(previousMMp3Calendar)
				            			&& (mMp3Calendar.get(Calendar.MONTH) != previousMMp3Calendar.get(Calendar.MONTH)
				            			|| mMp3Calendar.get(Calendar.YEAR) != previousMMp3Calendar.get(Calendar.YEAR))) {
				            	publishedMP3sHTML.append("<tr>\n");
				            	publishedMP3sHTML.append("<td class=\"groupTableCell\">");
				            	if(mMp3Calendar != null)
				            		publishedMP3sHTML.append(GROUP_DATE_FORMATTER.format(mMp3.getPodcastPublishingDateProperty()));
				            	else
			            			publishedMP3sHTML.append("Others");
				            	publishedMP3sHTML.append("</td>");
				            	publishedMP3sHTML.append("</tr>");
				            }
			            }
			            
		                publishedMP3sHTML.append("<tr>\n");
			            publishedMP3sHTML.append("<td class=\"contentTableCell\">");
			            publishedMP3sHTML.append("<a class=\"highlightedLink\" href=\""+mp3WebPath+"\">"+Utilities.encodeForHtml(linkText)+"</a><br/>");
			            publishedMP3sHTML.append(Utilities.encodeForHtml(linkDescription));
			            
			            if(comment != null)
			                publishedMP3sHTML.append("<div class=\"contentComment\">"+Utilities.encodeForHtml(comment)+"</div>\n");
			            
			            // Adds the flash player.
			            if(getContentIncludeMp3PlayerParameter() != null && getContentIncludeMp3PlayerParameter()) { 
			            /*publishedMP3sHTML.append("<div class=\"contentPlayer\"><script type=\"text/javascript\">\n");
			            publishedMP3sHTML.append("AC_FL_RunContent('codebase','http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0','width','290','height','16','src','compact-player?soundFile=");
			            publishedMP3sHTML.append(mp3WebPath);
			            publishedMP3sHTML.append("','quality','high', 'class', 'player', 'allowscriptaccess','sameDomain','pluginspage','http://www.macromedia.com/go/getflashplayer','movie','compact-player?soundFile=");
			            publishedMP3sHTML.append(mp3WebPath);
			            publishedMP3sHTML.append("' );");
			            publishedMP3sHTML.append("</script></div>"); */
			            
				            //publishedMP3sHTML.append("<div class=\"contentPlayer\"><object width=\"290\" height=\"16\" classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" class=\"player\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\">\n");
			            	publishedMP3sHTML.append("<div class=\"contentPlayer\"><object width=\"290\" height=\"16\" type=\"application/x-shockwave-flash\" data=\"compact-player.swf\">\n");
			            	publishedMP3sHTML.append("<param name=\"movie\" value=\"compact-player.swf\"/>\n");
			            	publishedMP3sHTML.append("<param name=\"FlashVars\" value=\"soundFile=");
				            publishedMP3sHTML.append(URLEncoder.encode(mp3WebPath, "UTF-8"));
				            publishedMP3sHTML.append("\"/>\n");
				            publishedMP3sHTML.append("<param name=\"quality\" value=\"high\"/>\n");
				            publishedMP3sHTML.append("<param name=\"allowscriptaccess\" value=\"sameDomain\"/>\n");
				            /*publishedMP3sHTML.append("<embed width=\"290\" height=\"16\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" allowscriptaccess=\"sameDomain\" class=\"player\" quality=\"high\" src=\"compact-player.swf?soundFile=");
				            publishedMP3sHTML.append(mp3WebPath);
				            publishedMP3sHTML.append("\"/>\n");*/
				            publishedMP3sHTML.append("</object></div>\n");
			            }
		            
			            publishedMP3sHTML.append("</td>\n");
			            publishedMP3sHTML.append("</tr>\n");

			            // Writes podcast entry.
			            String podcastTitle = mMp3.getMPodcastTitleProperty().getValueForUIOrNull();
			            String podcastSubtitle = mMp3.getMPodcastSubtitleProperty().getValueForUIOrNull();
			            String podcastSummary = mMp3.getMPodcastSummaryProperty().getValueForUIOrNull();
			            Date podcastPublicationDate = mMp3.getPodcastPublishingDateProperty();
			             
			            // Gets the duration of the MP3 file.
			            String podcastDuration = null;
			            if(mMp3.getFileProperty() != null && mMp3.getFileProperty().exists()) {
			            	AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(mMp3.getFileProperty());
			            	Long duration = (Long) ((TAudioFileFormat) baseFileFormat).properties().get("duration");					            
			            	podcastDuration = DurationType.FORMATTER.format(new Date(duration/1000));
			            }
			            
			            if(podcastTitle != null) {
			                podcastWriter.write("<item>\n");
			                podcastWriter.write("<title>");
			                podcastWriter.write(Utilities.encodeForXml(podcastTitle));
			                podcastWriter.write("</title>\n");
				            
				            if(podcastSubtitle != null) {
				                podcastWriter.write("<description>");
				                podcastWriter.write(Utilities.encodeForXml(podcastSubtitle));
				                podcastWriter.write("</description>\n");
				            }
			        		
			                podcastWriter.write("<link>");
			                podcastWriter.write(webServerUrl.toExternalForm()+getContentPageRelativeFtpPathParameter()+"/"+pageFile.getName());
			                podcastWriter.write("</link>\n");

			                podcastWriter.write("<guid>");
			                podcastWriter.write(mp3WebPath);
			                podcastWriter.write("</guid>\n");
				            
				            podcastWriter.write("<enclosure url=\"");
				            podcastWriter.write(mp3WebPath);
				            podcastWriter.write("\" length=\"");
				            podcastWriter.write(new Long(publishedMP3File.length()).toString());
				            podcastWriter.write("\" type=\"audio/mpeg\"/>");
				            
				            if(podcastPublicationDate != null) {
				                podcastWriter.write("<pubDate>");
				                podcastWriter.write(Utilities.encodeForXml(DATE_FORMATTER.format(podcastPublicationDate)));
				                podcastWriter.write("</pubDate>\n");
				            }
				            
				            if(podcastSubtitle != null) {
				                podcastWriter.write("<itunes:subtitle>");
				                podcastWriter.write(Utilities.encodeForXml(podcastSubtitle));
				                podcastWriter.write("</itunes:subtitle>\n");
				            }
				            
				            if(podcastSummary != null) {
				                podcastWriter.write("<itunes:summary>");
				                podcastWriter.write(Utilities.encodeForXml(podcastSummary));
				                podcastWriter.write("</itunes:summary>\n");
				            }
				            
				            if(podcastDuration != null) {
				                podcastWriter.write("<itunes:duration>");
				                podcastWriter.write(Utilities.encodeForXml(podcastDuration));
				                podcastWriter.write("</itunes:duration>\n");
				            }
					            
				            podcastWriter.write("</item>\n");
			            }			            
	                }
	                else {
	                    Logger.getLogger().severe("The application could not publish '"+mMp3.getName()+"' because the corresponding MP3 file is missing.");
	                }
                                        
                    perviousMMp3 = mMp3;
                }
            }
            
            // Adds the script that makes sure that the user does not have to activate the flash components exclicitly by clicking in IE.
            //publishedMP3sHTML.append("<script language=\"JavaScript\" src=\"");
            //publishedMP3sHTML.append(webServerUrl.toExternalForm()+getContentPageRelativeFtpPathParameter()+"/ieupdate.js");
            //publishedMP3sHTML.append("\"/>\n");
            
            pageWriter.write(publishedMP3sHTML.toString());
            
            // Writes the footer to the page file.
            charactersRead = footerReader.read(buffer, 0, 20000);
            while(charactersRead >= 0) {
                pageWriter.write(buffer, 0, charactersRead);
                charactersRead = footerReader.read(buffer, 0, 20000);
            }
            
            // Writes the footer of the podcast file.
            podcastWriter.write("</channel>\n");
            podcastWriter.write("</rss>\n");		            
        }
        finally {
            podcastWriter.close();
            pageWriter.close();
            footerReader.close();
            headerReader.close();
        }

        // Determines the total number of bytes to publish.       
        long totalBytesToPublish = 0;
        long bytesPublished = 0;        

        String contentPageFTPPath = ftpServerUrl.getPath()+getContentPageRelativeFtpPathParameter();
        changeFtpWorkingDirectory(ftpClient, contentPageFTPPath);
        
        Map<String, FTPFile> contentFilesMappedByName = new HashMap<String, FTPFile>();
        for(FTPFile file: ftpClient.listFiles())
        	contentFilesMappedByName.put(file.getName(), file);
        
        List<File> supportingFiles = new ArrayList<File>();
        File[] webFiles = getContentPageFilePathParameter().getParentFile().listFiles();
        for(File webFile: webFiles) {
        	String webFileName = webFile.getName();
        	if(webFileName.endsWith(".gif") || webFileName.endsWith(".jpeg") 
        			|| webFileName.endsWith(".png") || webFileName.endsWith(".js") 
        			|| webFileName.endsWith(".swf")) {
        		FTPFile remoteFile = contentFilesMappedByName.get(webFileName);
        		if(remoteFile == null || remoteFile.getTimestamp().getTimeInMillis() < webFile.lastModified()) {
        			supportingFiles.add(webFile);
        			totalBytesToPublish += webFile.length();
        		}
        	}
        }
        
        changeFtpWorkingDirectory(ftpClient, mp3FTPPath);
        
        // Determines the total size of the files that have to be uploaded.
        for(MMp3 mMp3: mMp3s) {
            File publishedMP3File = mMp3.getFileProperty();
            
            State currentPublishedMP3Status = mMp3.getStateProperty();
            if((currentPublishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE) || currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE)) && publishedMP3File != null 
            	&& (currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE) 
            			|| currentPublishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE) && republishMp3Files))
            	totalBytesToPublish += publishedMP3File.length();
        }
        totalBytesToPublish += pageFile.length();
        totalBytesToPublish += podcastFile.length();
        
        // Uploads MP3 files.
        for(MMp3 mMp3: mMp3s) {
        	File publishedMP3File = mMp3.getFileProperty();
        
	        State currentPublishedMP3Status = mMp3.getStateProperty();
	        if(currentPublishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE) || currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE)) {
	            if(publishedMP3File != null) {
	                // Constructs the name of the published files so that the links can be generated.
	                String publishedMP3Name = mMp3.getPublishedFileNameProperty();
	        
			        // Uploads the MP3 file if the file is to be published.
			        if(currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE)
			        		|| currentPublishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE) && republishMp3Files) {
			            setProgressStatusProperty("Publishing '"+mMp3.getNameForUI()+"' ...");

			        	ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			            FileInputStream fileInputStream = new FileInputStream(publishedMP3File);
			            ftpClient.storeFile(publishedMP3Name, new MonitoredInputStream(fileInputStream, bytesPublished, publishedMP3File.length(), totalBytesToPublish));
			            bytesPublished += publishedMP3File.length();
			            if(currentPublishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE))
			            	mMp3.setStateProperty(MMp3StateType.PUBLISHED_STATE);
			        }
	            }
	        }
	    }
	            

    	changeFtpWorkingDirectory(ftpClient, contentPageFTPPath);
        if(supportingFiles.size() > 0)
        	setProgressStatusProperty("Uploading supporting files ...");
        
        // Uploads new or updated supporting files, e.g. images.
        for(File supportingFile: supportingFiles) {
        	ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            FileInputStream fileInputStream = new FileInputStream(supportingFile);
            ftpClient.storeFile(supportingFile.getName(), new MonitoredInputStream(fileInputStream, bytesPublished, supportingFile.length(), totalBytesToPublish));
            bytesPublished += supportingFile.length();        	
        }

        // Uploads the contents page.
        setProgressStatusProperty("Publishing content web page ...");
        changeFtpWorkingDirectory(ftpClient, contentPageFTPPath);
        FileInputStream contentFileInputStream = new FileInputStream(pageFile);
        ftpClient.storeFile(pageFile.getName(), new MonitoredInputStream(contentFileInputStream, bytesPublished, pageFile.length(), totalBytesToPublish));
        bytesPublished += pageFile.length();
        
        // Uploads the podcast file.
        setProgressStatusProperty("Publishing podcast/RSS file ...");
        String podcastFTPPath = ftpServerUrl.getPath()+getPodcastRelativeFtpPathParameter();
        changeFtpWorkingDirectory(ftpClient, podcastFTPPath);
        FileInputStream podcastFileInputStream = new FileInputStream(podcastFile);
        ftpClient.storeFile(podcastFile.getName(), new MonitoredInputStream(podcastFileInputStream, bytesPublished, podcastFile.length(), totalBytesToPublish));     	            	            
        bytesPublished += podcastFile.length();
        
        // Sets the results.
        URL podcastFileUrl = new URL(webServerUrl.toExternalForm()+getPodcastRelativeFtpPathParameter()+"/"+getPodcastFilePathParameter().getName()); //$NON-NLS-1$
        URL contentPageUrl = new URL(webServerUrl.toExternalForm()+getContentPageRelativeFtpPathParameter()+"/"+getContentPageFilePathParameter().getName()); //$NON-NLS-1$
        setPodcastFileUrlResult(podcastFileUrl);
        setContentPageUrlResult(contentPageUrl);
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
     * Ensures that all MP3s do not take up more disk space after the publishing than the quota to them. It deletes the old file to
     * free up disk space.
     *
     * @param ftpClient Specifies the FTP client to use.
     * @param filesMappedByName Specifies the list of file in the destination directory that is index by file name.
 	 * @param mMp3Folder Specifies the managed MP3 folder that this step publishes.
    * @throws IOException Thrown if a file cannot be deleted from the server.
     * @throws DesktopException Thrown if not a single MP3 file can be published due to lack of disk space.
     */
    protected void ensureEnoughDiskSpace(FTPClient ftpClient, Map filesMappedByName, List<MMp3> mMp3s) throws IOException, DesktopException {
        long totalFtpFileSize = 0;
        long totalToBePublishedFileSize = 0;
        long maxTotalFileSize = getMaxiumumDiskSpaceParameter()*1024*1024;

        setProgressStatusProperty("Checking disk space on FTP server ...");
        
        SortedSet<MMp3> sortedMMp3s = new TreeSet<MMp3>(MP3_DELETE_COMPARATOR);
        sortedMMp3s.addAll(mMp3s);
        
        for(MMp3 mMp3: sortedMMp3s) {
            State publishedMP3Status = mMp3.getStateProperty();
            
            if(publishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE) || publishedMP3Status.equals(MMp3StateType.PUBLISHED_STATE)) {
	            String ftpFileName = mMp3.getPublishedFileNameProperty();
	            File mp3File = mMp3.getFileProperty();
	            FTPFile ftpFile = (FTPFile) filesMappedByName.get(ftpFileName);
	            
	            // Determines the size of the MP3 file.
	            long ftpFileSize = 0;
	            if(publishedMP3Status.equals(MMp3StateType.TO_BE_PUBLISHED_STATE)) {
		           if(mp3File.exists()) {
		               ftpFileSize = mp3File.length();
		               totalToBePublishedFileSize += mp3File.length();
	
		               if(totalToBePublishedFileSize > maxTotalFileSize)
	                        throw new DesktopException("The server has not enough disk space. The MP3 file needs at least "+NUMBER_FORMATTER.format(mp3File.length())+" bytes of free disk space", "Please make sure that there is enough space on the server.", DesktopException.ERROR_SEVERITY, null);        
		           }
		        }
	            else if(ftpFile != null)
	                    ftpFileSize = ftpFile.getSize();
	        
	            totalFtpFileSize += ftpFileSize;
	            
	            // Removes old MP3 files from the server if there is not enough space.
	            if(totalFtpFileSize > maxTotalFileSize) {
	                if(ftpFile != null)
	                    ftpClient.deleteFile(ftpFile.getName());
	                
	                mMp3.setStateProperty(MMp3StateType.NOT_PUBLISHED_STATE);
	                Logger.getLogger().warning("Unpublished '"+mMp3.getName()+"' to free up server disk space.");                       
	            }
            }
        }
    }
} // MPublishMp3sStep