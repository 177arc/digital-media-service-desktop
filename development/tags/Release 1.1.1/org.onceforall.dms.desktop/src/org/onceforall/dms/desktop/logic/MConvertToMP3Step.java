/*
 * Revision History:
 * $Log: MConvertToMP3Step.java,v $
 * Revision 1.3  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.interfaces.CommandLineInterface;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConvert To MP3 Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMArtistParameter <em>MArtist Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getArtistParameter <em>Artist Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMTitleParameter <em>MTitle Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getTitleParameter <em>Title Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAlbumParameter <em>MAlbum Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAlbumParameter <em>Album Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMYearParameter <em>MYear Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getYearParameter <em>Year Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter <em>Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter <em>MMp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter <em>Mp3 File Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter <em>MRecording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter <em>Recording File Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter <em>MMp3 Encoder Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter <em>Mp3 Encoder Path Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter <em>MAverage Bit Rate Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter <em>Average Bit Rate Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryNameParameter <em>MMp3 Entry Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryNameParameter <em>Mp3 Entry Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryReferenceResult <em>MMp3 Entry Reference Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryReferenceResult <em>Mp3 Entry Reference Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Convert to MP3' description='Converts a WAVE file to MP3 format using the LAME encoder.' iconFilePath='Image Files/Convert to MP3 step.gif' actionName='Convert' actionIconFilePath='Image Files/Convert.gif' interruptable='false' stoppable='false' terminatable='true'"
 * @generated
 */
public class MConvertToMP3Step extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MConvertToMP3Step.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MConvertToMP3Step.TYPE_NAME, new ReferenceType("Reference to "+MConvertToMP3Step.TYPE_NAME, "Specifies a reference to a "+MConvertToMP3Step.TYPE_NAME_FOR_UI, MConvertToMP3Step.class));
	}
	/**
	 * The cached value of the '{@link #getMArtistParameter() <em>MArtist Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMArtistParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mArtistParameter = null;

	/**
	 * The default value of the '{@link #getArtistParameter() <em>Artist Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtistParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIST_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getArtistParameter() <em>Artist Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getArtistParameter() <em>Artist Parameter</em>}' attribute.
	 * @see #getArtistParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultArtistParameter() {
		return ARTIST_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getArtistParameter() <em>Artist Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtistParameter()
	 * @generated
	 * @ordered
	 */
	protected String artistParameter = ARTIST_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTitleParameter() <em>MTitle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mTitleParameter = null;

	/**
	 * The default value of the '{@link #getTitleParameter() <em>Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTitleParameter() <em>Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTitleParameter() <em>Title Parameter</em>}' attribute.
	 * @see #getTitleParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTitleParameter() {
		return TITLE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTitleParameter() <em>Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleParameter()
	 * @generated
	 * @ordered
	 */
	protected String titleParameter = TITLE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMAlbumParameter() <em>MAlbum Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAlbumParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mAlbumParameter = null;

	/**
	 * The default value of the '{@link #getAlbumParameter() <em>Album Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbumParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String ALBUM_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getAlbumParameter() <em>Album Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getAlbumParameter() <em>Album Parameter</em>}' attribute.
	 * @see #getAlbumParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultAlbumParameter() {
		return ALBUM_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getAlbumParameter() <em>Album Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbumParameter()
	 * @generated
	 * @ordered
	 */
	protected String albumParameter = ALBUM_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMYearParameter() <em>MYear Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMYearParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mYearParameter = null;

	/**
	 * The default value of the '{@link #getYearParameter() <em>Year Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getYearParameter() <em>Year Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getYearParameter() <em>Year Parameter</em>}' attribute.
	 * @see #getYearParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultYearParameter() {
		return YEAR_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getYearParameter() <em>Year Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearParameter()
	 * @generated
	 * @ordered
	 */
	protected String yearParameter = YEAR_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMDirectoryParameter() <em>MDirectory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDirectoryParameter = null;

	/**
	 * The default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File DIRECTORY_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDirectoryParameter() {
		return DIRECTORY_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDirectoryParameter() <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected File directoryParameter = DIRECTORY_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMMp3FileNameParameter() <em>MMp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3FileNameParameter = null;

	/**
	 * The default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_FILE_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3FileNameParameter() {
		return MP3_FILE_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3FileNameParameter() <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FileNameParameter()
	 * @generated
	 * @ordered
	 */
	protected File mp3FileNameParameter = MP3_FILE_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRecordingFileParameter() <em>MRecording File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mRecordingFileParameter = null;

	/**
	 * The default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File RECORDING_FILE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultRecordingFileParameter() {
		return RECORDING_FILE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRecordingFileParameter() <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingFileParameter()
	 * @generated
	 * @ordered
	 */
	protected File recordingFileParameter = RECORDING_FILE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMMp3EncoderPathParameter() <em>MMp3 Encoder Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3EncoderPathParameter = null;

	/**
	 * The default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_ENCODER_PATH_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3EncoderPathParameter() {
		return MP3_ENCODER_PATH_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3EncoderPathParameter() <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 * @ordered
	 */
	protected File mp3EncoderPathParameter = MP3_ENCODER_PATH_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMAverageBitRateParameter() <em>MAverage Bit Rate Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mAverageBitRateParameter = null;

	/**
	 * The default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BIT_RATE_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultAverageBitRateParameter() {
		return AVERAGE_BIT_RATE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getAverageBitRateParameter() <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBitRateParameter()
	 * @generated
	 * @ordered
	 */
	protected Long averageBitRateParameter = AVERAGE_BIT_RATE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMMp3FolderReferenceParameter() <em>MMp3 Folder Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FolderReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3FolderReferenceParameter = null;

	/**
	 * The cached value of the '{@link #getMp3FolderReferenceParameter() <em>Mp3 Folder Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FolderReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected MMp3Folder mp3FolderReferenceParameter = null;

	/**
	 * The cached value of the '{@link #getMMp3EntryNameParameter() <em>MMp3 Entry Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EntryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mMp3EntryNameParameter = null;

	/**
	 * The default value of the '{@link #getMp3EntryNameParameter() <em>Mp3 Entry Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EntryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String MP3_ENTRY_NAME_PARAMETER_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3EntryNameParameter() <em>Mp3 Entry Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3EntryNameParameter() <em>Mp3 Entry Name Parameter</em>}' attribute.
	 * @see #getMp3EntryNameParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultMp3EntryNameParameter() {
		return MP3_ENTRY_NAME_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3EntryNameParameter() <em>Mp3 Entry Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EntryNameParameter()
	 * @generated
	 * @ordered
	 */
	protected String mp3EntryNameParameter = MP3_ENTRY_NAME_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMMp3EntryReferenceResult() <em>MMp3 Entry Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3EntryReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mMp3EntryReferenceResult = null;

	/**
	 * The cached value of the '{@link #getMp3EntryReferenceResult() <em>Mp3 Entry Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3EntryReferenceResult()
	 * @generated
	 * @ordered
	 */
	protected MMp3 mp3EntryReferenceResult = null;

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
		return "Convert";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert.gif");
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert to MP3 step.gif");
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
		return "Converts a WAVE file to MP3 format using the LAME encoder.";
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
		return "Convert to MP3";
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
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MConvertToMP3Step() {
		super();
		
		firstMConvertToMP3StepConstructorHook();
				
		description = "Converts a WAVE file to MP3 format using the LAME encoder.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert.gif");
		name = "Convert to MP3";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Convert to MP3 step.gif");
		terminatable = true;
		interruptable = false;
		actionName = "Convert";
					 
		setMArtistParameter(new MParameter(false, "Artist", "Determines the text that will set as the ID3 artist tag on the MP3 file.", null));			 
		setMTitleParameter(new MParameter(false, "Title", "Determines the text that will set as the ID3 title tag on the MP3 file.", null));			 
		setMAlbumParameter(new MParameter(false, "Album", "Determines the text that will set as the ID3 album tag on the MP3 file.", null));			 
		setMYearParameter(new MParameter(false, "Year", "Determines the text that will set as the ID3 year tag on the MP3 file.", null));			 
		setMDirectoryParameter(new MParameter(false, "Directory", "Specifies the directory where the converted MP3 file should be saved.", null));			 
		setMMp3FileNameParameter(new MParameter(false, "MP3 file name", "Specifies the name of the MP3 file.", null));			 
		setMRecordingFileParameter(new MParameter(false, "Recording file", "Contains the name of the recorded WAVE file.", null));			 
		setMMp3EncoderPathParameter(new MParameter(false, "MP3 encoder path", "Specifies the path to the directory that contains the \'lame.exe\'.", null));			 
		setMAverageBitRateParameter(new MParameter(false, "Average bit rate", "Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.", null));			 
		setMMp3FolderReferenceParameter(new MParameter(false, "MP3 folder reference", "Specifies a reference to the folder where the new MP3 file should be stored.", null));			 
		setMMp3EntryNameParameter(new MParameter(false, "MP3 entry name", "Specifies the name of the new MP3 entry in the MP3 folder.", null));			 
		setMMp3EntryReferenceResult(new MResult(false, "MP3 entry reference", "Contains a reference to the MP3 enty that has been created.", null));

		lastMConvertToMP3StepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMConvertToMP3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMConvertToMP3StepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MCONVERT_TO_MP3_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MArtist Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MArtist Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MArtist Parameter</em>' containment reference.
	 * @see #setMArtistParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MArtistParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Artist' description='Determines the text that will set as the ID3 artist tag on the MP3 file.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMArtistParameter() {
		return mArtistParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMArtistParameter(MParameter newMArtistParameter, NotificationChain msgs) {
		MParameter oldMArtistParameter = mArtistParameter;
		mArtistParameter = newMArtistParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER, oldMArtistParameter, newMArtistParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMArtistParameter <em>MArtist Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMArtistParameter the new value of the '<em>MArtist Parameter</em>' containment reference.
	 * @see #getMArtistParameter()
	 * @generated
	 */
	public void setMArtistParameter(MParameter newMArtistParameter) {
		if (newMArtistParameter != mArtistParameter) {
			NotificationChain msgs = null;
			if (mArtistParameter != null)
				msgs = ((InternalEObject)mArtistParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER, null, msgs);
			if (newMArtistParameter != null) {				
				newMArtistParameter.setDefaultName("Artist");
				newMArtistParameter.setDefaultDescription("Determines the text that will set as the ID3 artist tag on the MP3 file.");
				newMArtistParameter.setValueType(Type.getTypeForName("Text"));
				newMArtistParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER));
				newMArtistParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMArtistParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mArtistParameter != null) {
				if(newMArtistParameter != null)
					newMArtistParameter.eAdapters().addAll(mArtistParameter.eAdapters());			
			
				mArtistParameter.eAdapters().clear();
			}
			msgs = basicSetMArtistParameter(newMArtistParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER, newMArtistParameter, newMArtistParameter));
	}

	/**
	 * Returns the value of the '<em><b>Artist Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist Parameter</em>' attribute.
	 * @see #setArtistParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_ArtistParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getArtistParameter() {
		return artistParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getArtistParameter <em>Artist Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newArtistParameter the new value of the '<em>Artist Parameter</em>' attribute.
	 * @see #getArtistParameter()
	 * @generated
	 */
	public void setArtistParameter(String newArtistParameter) {
		String oldArtistParameter = artistParameter;
		artistParameter = newArtistParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER, oldArtistParameter, artistParameter));
	}

	/**
	 * Returns the value of the '<em><b>MTitle Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTitle Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTitle Parameter</em>' containment reference.
	 * @see #setMTitleParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MTitleParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Title' description='Determines the text that will set as the ID3 title tag on the MP3 file.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMTitleParameter() {
		return mTitleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTitleParameter(MParameter newMTitleParameter, NotificationChain msgs) {
		MParameter oldMTitleParameter = mTitleParameter;
		mTitleParameter = newMTitleParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER, oldMTitleParameter, newMTitleParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMTitleParameter <em>MTitle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMTitleParameter the new value of the '<em>MTitle Parameter</em>' containment reference.
	 * @see #getMTitleParameter()
	 * @generated
	 */
	public void setMTitleParameter(MParameter newMTitleParameter) {
		if (newMTitleParameter != mTitleParameter) {
			NotificationChain msgs = null;
			if (mTitleParameter != null)
				msgs = ((InternalEObject)mTitleParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER, null, msgs);
			if (newMTitleParameter != null) {				
				newMTitleParameter.setDefaultName("Title");
				newMTitleParameter.setDefaultDescription("Determines the text that will set as the ID3 title tag on the MP3 file.");
				newMTitleParameter.setValueType(Type.getTypeForName("Text"));
				newMTitleParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER));
				newMTitleParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mTitleParameter != null) {
				if(newMTitleParameter != null)
					newMTitleParameter.eAdapters().addAll(mTitleParameter.eAdapters());			
			
				mTitleParameter.eAdapters().clear();
			}
			msgs = basicSetMTitleParameter(newMTitleParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER, newMTitleParameter, newMTitleParameter));
	}

	/**
	 * Returns the value of the '<em><b>Title Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Parameter</em>' attribute.
	 * @see #setTitleParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_TitleParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getTitleParameter() {
		return titleParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getTitleParameter <em>Title Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newTitleParameter the new value of the '<em>Title Parameter</em>' attribute.
	 * @see #getTitleParameter()
	 * @generated
	 */
	public void setTitleParameter(String newTitleParameter) {
		String oldTitleParameter = titleParameter;
		titleParameter = newTitleParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER, oldTitleParameter, titleParameter));
	}

	/**
	 * Returns the value of the '<em><b>MAlbum Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAlbum Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAlbum Parameter</em>' containment reference.
	 * @see #setMAlbumParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MAlbumParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Album' description='Determines the text that will set as the ID3 album tag on the MP3 file.'"
	 * @generated
	 */
	public MParameter getMAlbumParameter() {
		return mAlbumParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAlbumParameter(MParameter newMAlbumParameter, NotificationChain msgs) {
		MParameter oldMAlbumParameter = mAlbumParameter;
		mAlbumParameter = newMAlbumParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER, oldMAlbumParameter, newMAlbumParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAlbumParameter <em>MAlbum Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMAlbumParameter the new value of the '<em>MAlbum Parameter</em>' containment reference.
	 * @see #getMAlbumParameter()
	 * @generated
	 */
	public void setMAlbumParameter(MParameter newMAlbumParameter) {
		if (newMAlbumParameter != mAlbumParameter) {
			NotificationChain msgs = null;
			if (mAlbumParameter != null)
				msgs = ((InternalEObject)mAlbumParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER, null, msgs);
			if (newMAlbumParameter != null) {				
				newMAlbumParameter.setDefaultDescription("Determines the text that will set as the ID3 album tag on the MP3 file.");
				newMAlbumParameter.setDefaultName("Album");
				newMAlbumParameter.setValueType(Type.getTypeForName("Text"));
				newMAlbumParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER));
				newMAlbumParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMAlbumParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mAlbumParameter != null) {
				if(newMAlbumParameter != null)
					newMAlbumParameter.eAdapters().addAll(mAlbumParameter.eAdapters());			
			
				mAlbumParameter.eAdapters().clear();
			}
			msgs = basicSetMAlbumParameter(newMAlbumParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER, newMAlbumParameter, newMAlbumParameter));
	}

	/**
	 * Returns the value of the '<em><b>Album Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Album Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album Parameter</em>' attribute.
	 * @see #setAlbumParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_AlbumParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getAlbumParameter() {
		return albumParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAlbumParameter <em>Album Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newAlbumParameter the new value of the '<em>Album Parameter</em>' attribute.
	 * @see #getAlbumParameter()
	 * @generated
	 */
	public void setAlbumParameter(String newAlbumParameter) {
		String oldAlbumParameter = albumParameter;
		albumParameter = newAlbumParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER, oldAlbumParameter, albumParameter));
	}

	/**
	 * Returns the value of the '<em><b>MYear Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MYear Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MYear Parameter</em>' containment reference.
	 * @see #setMYearParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MYearParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Year' description='Determines the text that will set as the ID3 year tag on the MP3 file.'"
	 * @generated
	 */
	public MParameter getMYearParameter() {
		return mYearParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMYearParameter(MParameter newMYearParameter, NotificationChain msgs) {
		MParameter oldMYearParameter = mYearParameter;
		mYearParameter = newMYearParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER, oldMYearParameter, newMYearParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMYearParameter <em>MYear Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMYearParameter the new value of the '<em>MYear Parameter</em>' containment reference.
	 * @see #getMYearParameter()
	 * @generated
	 */
	public void setMYearParameter(MParameter newMYearParameter) {
		if (newMYearParameter != mYearParameter) {
			NotificationChain msgs = null;
			if (mYearParameter != null)
				msgs = ((InternalEObject)mYearParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER, null, msgs);
			if (newMYearParameter != null) {				
				newMYearParameter.setDefaultDescription("Determines the text that will set as the ID3 year tag on the MP3 file.");
				newMYearParameter.setDefaultName("Year");
				newMYearParameter.setValueType(Type.getTypeForName("Text"));
				newMYearParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER));
				newMYearParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMYearParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mYearParameter != null) {
				if(newMYearParameter != null)
					newMYearParameter.eAdapters().addAll(mYearParameter.eAdapters());			
			
				mYearParameter.eAdapters().clear();
			}
			msgs = basicSetMYearParameter(newMYearParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER, newMYearParameter, newMYearParameter));
	}

	/**
	 * Returns the value of the '<em><b>Year Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Parameter</em>' attribute.
	 * @see #setYearParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_YearParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getYearParameter() {
		return yearParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getYearParameter <em>Year Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newYearParameter the new value of the '<em>Year Parameter</em>' attribute.
	 * @see #getYearParameter()
	 * @generated
	 */
	public void setYearParameter(String newYearParameter) {
		String oldYearParameter = yearParameter;
		yearParameter = newYearParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER, oldYearParameter, yearParameter));
	}

	/**
	 * Returns the value of the '<em><b>MDirectory Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDirectory Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDirectory Parameter</em>' containment reference.
	 * @see #setMDirectoryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Directory' description='Specifies the directory where the converted MP3 file should be saved.'"
	 * @generated
	 */
	public MParameter getMDirectoryParameter() {
		return mDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDirectoryParameter(MParameter newMDirectoryParameter, NotificationChain msgs) {
		MParameter oldMDirectoryParameter = mDirectoryParameter;
		mDirectoryParameter = newMDirectoryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, oldMDirectoryParameter, newMDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDirectoryParameter the new value of the '<em>MDirectory Parameter</em>' containment reference.
	 * @see #getMDirectoryParameter()
	 * @generated
	 */
	public void setMDirectoryParameter(MParameter newMDirectoryParameter) {
		if (newMDirectoryParameter != mDirectoryParameter) {
			NotificationChain msgs = null;
			if (mDirectoryParameter != null)
				msgs = ((InternalEObject)mDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
			if (newMDirectoryParameter != null) {				
				newMDirectoryParameter.setDefaultDescription("Specifies the directory where the converted MP3 file should be saved.");
				newMDirectoryParameter.setDefaultName("Directory");
				newMDirectoryParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER));
				newMDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDirectoryParameter != null) {
				if(newMDirectoryParameter != null)
					newMDirectoryParameter.eAdapters().addAll(mDirectoryParameter.eAdapters());			
			
				mDirectoryParameter.eAdapters().clear();
			}
			msgs = basicSetMDirectoryParameter(newMDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER, newMDirectoryParameter, newMDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Parameter</em>' attribute.
	 * @see #setDirectoryParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_DirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getDirectoryParameter() {
		return directoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter <em>Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDirectoryParameter the new value of the '<em>Directory Parameter</em>' attribute.
	 * @see #getDirectoryParameter()
	 * @generated
	 */
	public void setDirectoryParameter(File newDirectoryParameter) {
		File oldDirectoryParameter = directoryParameter;
		directoryParameter = newDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER, oldDirectoryParameter, directoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 File Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 File Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 File Name Parameter</em>' containment reference.
	 * @see #setMMp3FileNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3FileNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 file name' description='Specifies the name of the MP3 file.'"
	 * @generated
	 */
	public MParameter getMMp3FileNameParameter() {
		return mMp3FileNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FileNameParameter(MParameter newMMp3FileNameParameter, NotificationChain msgs) {
		MParameter oldMMp3FileNameParameter = mMp3FileNameParameter;
		mMp3FileNameParameter = newMMp3FileNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, oldMMp3FileNameParameter, newMMp3FileNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter <em>MMp3 File Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FileNameParameter the new value of the '<em>MMp3 File Name Parameter</em>' containment reference.
	 * @see #getMMp3FileNameParameter()
	 * @generated
	 */
	public void setMMp3FileNameParameter(MParameter newMMp3FileNameParameter) {
		if (newMMp3FileNameParameter != mMp3FileNameParameter) {
			NotificationChain msgs = null;
			if (mMp3FileNameParameter != null)
				msgs = ((InternalEObject)mMp3FileNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, null, msgs);
			if (newMMp3FileNameParameter != null) {				
				newMMp3FileNameParameter.setDefaultDescription("Specifies the name of the MP3 file.");
				newMMp3FileNameParameter.setDefaultName("MP3 file name");
				newMMp3FileNameParameter.setValueType(Type.getTypeForName("File"));
				newMMp3FileNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER));
				newMMp3FileNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FileNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FileNameParameter != null) {
				if(newMMp3FileNameParameter != null)
					newMMp3FileNameParameter.eAdapters().addAll(mMp3FileNameParameter.eAdapters());			
			
				mMp3FileNameParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3FileNameParameter(newMMp3FileNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER, newMMp3FileNameParameter, newMMp3FileNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 File Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 File Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 File Name Parameter</em>' attribute.
	 * @see #setMp3FileNameParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3FileNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getMp3FileNameParameter() {
		return mp3FileNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter <em>Mp3 File Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FileNameParameter the new value of the '<em>Mp3 File Name Parameter</em>' attribute.
	 * @see #getMp3FileNameParameter()
	 * @generated
	 */
	public void setMp3FileNameParameter(File newMp3FileNameParameter) {
		File oldMp3FileNameParameter = mp3FileNameParameter;
		mp3FileNameParameter = newMp3FileNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER, oldMp3FileNameParameter, mp3FileNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MRecording File Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRecording File Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRecording File Parameter</em>' containment reference.
	 * @see #setMRecordingFileParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MRecordingFileParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Recording file' description='Contains the name of the recorded WAVE file.'"
	 * @generated
	 */
	public MParameter getMRecordingFileParameter() {
		return mRecordingFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRecordingFileParameter(MParameter newMRecordingFileParameter, NotificationChain msgs) {
		MParameter oldMRecordingFileParameter = mRecordingFileParameter;
		mRecordingFileParameter = newMRecordingFileParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, oldMRecordingFileParameter, newMRecordingFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter <em>MRecording File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMRecordingFileParameter the new value of the '<em>MRecording File Parameter</em>' containment reference.
	 * @see #getMRecordingFileParameter()
	 * @generated
	 */
	public void setMRecordingFileParameter(MParameter newMRecordingFileParameter) {
		if (newMRecordingFileParameter != mRecordingFileParameter) {
			NotificationChain msgs = null;
			if (mRecordingFileParameter != null)
				msgs = ((InternalEObject)mRecordingFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
			if (newMRecordingFileParameter != null) {				
				newMRecordingFileParameter.setDefaultDescription("Contains the name of the recorded WAVE file.");
				newMRecordingFileParameter.setDefaultName("Recording file");
				newMRecordingFileParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMRecordingFileParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER));
				newMRecordingFileParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRecordingFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRecordingFileParameter != null) {
				if(newMRecordingFileParameter != null)
					newMRecordingFileParameter.eAdapters().addAll(mRecordingFileParameter.eAdapters());			
			
				mRecordingFileParameter.eAdapters().clear();
			}
			msgs = basicSetMRecordingFileParameter(newMRecordingFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER, newMRecordingFileParameter, newMRecordingFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Recording File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording File Parameter</em>' attribute.
	 * @see #setRecordingFileParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_RecordingFileParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getRecordingFileParameter() {
		return recordingFileParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter <em>Recording File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newRecordingFileParameter the new value of the '<em>Recording File Parameter</em>' attribute.
	 * @see #getRecordingFileParameter()
	 * @generated
	 */
	public void setRecordingFileParameter(File newRecordingFileParameter) {
		File oldRecordingFileParameter = recordingFileParameter;
		recordingFileParameter = newRecordingFileParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER, oldRecordingFileParameter, recordingFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Encoder Path Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Encoder Path Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Encoder Path Parameter</em>' containment reference.
	 * @see #setMMp3EncoderPathParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3EncoderPathParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 encoder path' description='Specifies the path to the directory that contains the \'lame.exe\'.'"
	 * @generated
	 */
	public MParameter getMMp3EncoderPathParameter() {
		return mMp3EncoderPathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EncoderPathParameter(MParameter newMMp3EncoderPathParameter, NotificationChain msgs) {
		MParameter oldMMp3EncoderPathParameter = mMp3EncoderPathParameter;
		mMp3EncoderPathParameter = newMMp3EncoderPathParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, oldMMp3EncoderPathParameter, newMMp3EncoderPathParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter <em>MMp3 Encoder Path Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EncoderPathParameter the new value of the '<em>MMp3 Encoder Path Parameter</em>' containment reference.
	 * @see #getMMp3EncoderPathParameter()
	 * @generated
	 */
	public void setMMp3EncoderPathParameter(MParameter newMMp3EncoderPathParameter) {
		if (newMMp3EncoderPathParameter != mMp3EncoderPathParameter) {
			NotificationChain msgs = null;
			if (mMp3EncoderPathParameter != null)
				msgs = ((InternalEObject)mMp3EncoderPathParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, null, msgs);
			if (newMMp3EncoderPathParameter != null) {				
				newMMp3EncoderPathParameter.setDefaultDescription("Specifies the path to the directory that contains the \'lame.exe\'.");
				newMMp3EncoderPathParameter.setDefaultName("MP3 encoder path");
				newMMp3EncoderPathParameter.setValueType(Type.getTypeForName("File (must exist)"));
				newMMp3EncoderPathParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER));
				newMMp3EncoderPathParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EncoderPathParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EncoderPathParameter != null) {
				if(newMMp3EncoderPathParameter != null)
					newMMp3EncoderPathParameter.eAdapters().addAll(mMp3EncoderPathParameter.eAdapters());			
			
				mMp3EncoderPathParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3EncoderPathParameter(newMMp3EncoderPathParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER, newMMp3EncoderPathParameter, newMMp3EncoderPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Encoder Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Encoder Path Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Encoder Path Parameter</em>' attribute.
	 * @see #setMp3EncoderPathParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3EncoderPathParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true"
	 * @generated
	 */
	public File getMp3EncoderPathParameter() {
		return mp3EncoderPathParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter <em>Mp3 Encoder Path Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EncoderPathParameter the new value of the '<em>Mp3 Encoder Path Parameter</em>' attribute.
	 * @see #getMp3EncoderPathParameter()
	 * @generated
	 */
	public void setMp3EncoderPathParameter(File newMp3EncoderPathParameter) {
		File oldMp3EncoderPathParameter = mp3EncoderPathParameter;
		mp3EncoderPathParameter = newMp3EncoderPathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER, oldMp3EncoderPathParameter, mp3EncoderPathParameter));
	}

	/**
	 * Returns the value of the '<em><b>MAverage Bit Rate Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAverage Bit Rate Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAverage Bit Rate Parameter</em>' containment reference.
	 * @see #setMAverageBitRateParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MAverageBitRateParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Average bit rate' description='Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.'"
	 * @generated
	 */
	public MParameter getMAverageBitRateParameter() {
		return mAverageBitRateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAverageBitRateParameter(MParameter newMAverageBitRateParameter, NotificationChain msgs) {
		MParameter oldMAverageBitRateParameter = mAverageBitRateParameter;
		mAverageBitRateParameter = newMAverageBitRateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, oldMAverageBitRateParameter, newMAverageBitRateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter <em>MAverage Bit Rate Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMAverageBitRateParameter the new value of the '<em>MAverage Bit Rate Parameter</em>' containment reference.
	 * @see #getMAverageBitRateParameter()
	 * @generated
	 */
	public void setMAverageBitRateParameter(MParameter newMAverageBitRateParameter) {
		if (newMAverageBitRateParameter != mAverageBitRateParameter) {
			NotificationChain msgs = null;
			if (mAverageBitRateParameter != null)
				msgs = ((InternalEObject)mAverageBitRateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, null, msgs);
			if (newMAverageBitRateParameter != null) {				
				newMAverageBitRateParameter.setDefaultDescription("Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310.");
				newMAverageBitRateParameter.setDefaultName("Average bit rate");
				newMAverageBitRateParameter.setValueType(Type.getTypeForName("Number"));
				newMAverageBitRateParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER));
				newMAverageBitRateParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMAverageBitRateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mAverageBitRateParameter != null) {
				if(newMAverageBitRateParameter != null)
					newMAverageBitRateParameter.eAdapters().addAll(mAverageBitRateParameter.eAdapters());			
			
				mAverageBitRateParameter.eAdapters().clear();
			}
			msgs = basicSetMAverageBitRateParameter(newMAverageBitRateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER, newMAverageBitRateParameter, newMAverageBitRateParameter));
	}

	/**
	 * Returns the value of the '<em><b>Average Bit Rate Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Bit Rate Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Bit Rate Parameter</em>' attribute.
	 * @see #setAverageBitRateParameter(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_AverageBitRateParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MLong" required="true"
	 * @generated
	 */
	public Long getAverageBitRateParameter() {
		return averageBitRateParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter <em>Average Bit Rate Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newAverageBitRateParameter the new value of the '<em>Average Bit Rate Parameter</em>' attribute.
	 * @see #getAverageBitRateParameter()
	 * @generated
	 */
	public void setAverageBitRateParameter(Long newAverageBitRateParameter) {
		Long oldAverageBitRateParameter = averageBitRateParameter;
		averageBitRateParameter = newAverageBitRateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER, oldAverageBitRateParameter, averageBitRateParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Folder Reference Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Folder Reference Parameter</em>' containment reference.
	 * @see #setMMp3FolderReferenceParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3FolderReferenceParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 folder reference' description='Specifies a reference to the folder where the new MP3 file should be stored.'"
	 * @generated
	 */
	public MParameter getMMp3FolderReferenceParameter() {
		return mMp3FolderReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FolderReferenceParameter(MParameter newMMp3FolderReferenceParameter, NotificationChain msgs) {
		MParameter oldMMp3FolderReferenceParameter = mMp3FolderReferenceParameter;
		mMp3FolderReferenceParameter = newMMp3FolderReferenceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, oldMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FolderReferenceParameter the new value of the '<em>MMp3 Folder Reference Parameter</em>' containment reference.
	 * @see #getMMp3FolderReferenceParameter()
	 * @generated
	 */
	public void setMMp3FolderReferenceParameter(MParameter newMMp3FolderReferenceParameter) {
		if (newMMp3FolderReferenceParameter != mMp3FolderReferenceParameter) {
			NotificationChain msgs = null;
			if (mMp3FolderReferenceParameter != null)
				msgs = ((InternalEObject)mMp3FolderReferenceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
			if (newMMp3FolderReferenceParameter != null) {				
				newMMp3FolderReferenceParameter.setDefaultDescription("Specifies a reference to the folder where the new MP3 file should be stored.");
				newMMp3FolderReferenceParameter.setDefaultName("MP3 folder reference");
				newMMp3FolderReferenceParameter.setValueType(Type.getTypeForName("Reference to "+MMp3Folder.TYPE_NAME));
				newMMp3FolderReferenceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER));
				newMMp3FolderReferenceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FolderReferenceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FolderReferenceParameter != null) {
				if(newMMp3FolderReferenceParameter != null)
					newMMp3FolderReferenceParameter.eAdapters().addAll(mMp3FolderReferenceParameter.eAdapters());			
			
				mMp3FolderReferenceParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3FolderReferenceParameter(newMMp3FolderReferenceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, newMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Folder Reference Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Folder Reference Parameter</em>' reference.
	 * @see #setMp3FolderReferenceParameter(MMp3Folder)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3FolderReferenceParameter()
	 * @model required="true"
	 * @generated
	 */
	public MMp3Folder getMp3FolderReferenceParameter() {
		if (mp3FolderReferenceParameter != null && ((EObject)mp3FolderReferenceParameter).eIsProxy()) {
			InternalEObject oldMp3FolderReferenceParameter = (InternalEObject)mp3FolderReferenceParameter;
			mp3FolderReferenceParameter = (MMp3Folder)eResolveProxy(oldMp3FolderReferenceParameter);
			if (mp3FolderReferenceParameter != oldMp3FolderReferenceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
			}
		}
		return mp3FolderReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3Folder basicGetMp3FolderReferenceParameter() {
		return mp3FolderReferenceParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FolderReferenceParameter the new value of the '<em>Mp3 Folder Reference Parameter</em>' reference.
	 * @see #getMp3FolderReferenceParameter()
	 * @generated
	 */
	public void setMp3FolderReferenceParameter(MMp3Folder newMp3FolderReferenceParameter) {
		MMp3Folder oldMp3FolderReferenceParameter = mp3FolderReferenceParameter;
		mp3FolderReferenceParameter = newMp3FolderReferenceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Entry Name Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Entry Name Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Entry Name Parameter</em>' containment reference.
	 * @see #setMMp3EntryNameParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3EntryNameParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 entry name' description='Specifies the name of the new MP3 entry in the MP3 folder.'"
	 * @generated
	 */
	public MParameter getMMp3EntryNameParameter() {
		return mMp3EntryNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EntryNameParameter(MParameter newMMp3EntryNameParameter, NotificationChain msgs) {
		MParameter oldMMp3EntryNameParameter = mMp3EntryNameParameter;
		mMp3EntryNameParameter = newMMp3EntryNameParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER, oldMMp3EntryNameParameter, newMMp3EntryNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryNameParameter <em>MMp3 Entry Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EntryNameParameter the new value of the '<em>MMp3 Entry Name Parameter</em>' containment reference.
	 * @see #getMMp3EntryNameParameter()
	 * @generated
	 */
	public void setMMp3EntryNameParameter(MParameter newMMp3EntryNameParameter) {
		if (newMMp3EntryNameParameter != mMp3EntryNameParameter) {
			NotificationChain msgs = null;
			if (mMp3EntryNameParameter != null)
				msgs = ((InternalEObject)mMp3EntryNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER, null, msgs);
			if (newMMp3EntryNameParameter != null) {				
				newMMp3EntryNameParameter.setDefaultDescription("Specifies the name of the new MP3 entry in the MP3 folder.");
				newMMp3EntryNameParameter.setDefaultName("MP3 entry name");
				newMMp3EntryNameParameter.setValueType(Type.getTypeForName("Text"));
				newMMp3EntryNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER));
				newMMp3EntryNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EntryNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EntryNameParameter != null) {
				if(newMMp3EntryNameParameter != null)
					newMMp3EntryNameParameter.eAdapters().addAll(mMp3EntryNameParameter.eAdapters());			
			
				mMp3EntryNameParameter.eAdapters().clear();
			}
			msgs = basicSetMMp3EntryNameParameter(newMMp3EntryNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER, newMMp3EntryNameParameter, newMMp3EntryNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Entry Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Entry Name Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Entry Name Parameter</em>' attribute.
	 * @see #setMp3EntryNameParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3EntryNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getMp3EntryNameParameter() {
		return mp3EntryNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryNameParameter <em>Mp3 Entry Name Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EntryNameParameter the new value of the '<em>Mp3 Entry Name Parameter</em>' attribute.
	 * @see #getMp3EntryNameParameter()
	 * @generated
	 */
	public void setMp3EntryNameParameter(String newMp3EntryNameParameter) {
		String oldMp3EntryNameParameter = mp3EntryNameParameter;
		mp3EntryNameParameter = newMp3EntryNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER, oldMp3EntryNameParameter, mp3EntryNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 Entry Reference Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 Entry Reference Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 Entry Reference Result</em>' containment reference.
	 * @see #setMMp3EntryReferenceResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_MMp3EntryReferenceResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 entry reference' description='Contains a reference to the MP3 enty that has been created.'"
	 * @generated
	 */
	public MResult getMMp3EntryReferenceResult() {
		return mMp3EntryReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3EntryReferenceResult(MResult newMMp3EntryReferenceResult, NotificationChain msgs) {
		MResult oldMMp3EntryReferenceResult = mMp3EntryReferenceResult;
		mMp3EntryReferenceResult = newMMp3EntryReferenceResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT, oldMMp3EntryReferenceResult, newMMp3EntryReferenceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryReferenceResult <em>MMp3 Entry Reference Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3EntryReferenceResult the new value of the '<em>MMp3 Entry Reference Result</em>' containment reference.
	 * @see #getMMp3EntryReferenceResult()
	 * @generated
	 */
	public void setMMp3EntryReferenceResult(MResult newMMp3EntryReferenceResult) {
		if (newMMp3EntryReferenceResult != mMp3EntryReferenceResult) {
			NotificationChain msgs = null;
			if (mMp3EntryReferenceResult != null)
				msgs = ((InternalEObject)mMp3EntryReferenceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT, null, msgs);
			if (newMMp3EntryReferenceResult != null) {				
				newMMp3EntryReferenceResult.setDefaultDescription("Contains a reference to the MP3 enty that has been created.");
				newMMp3EntryReferenceResult.setDefaultName("MP3 entry reference");
				newMMp3EntryReferenceResult.setValueType(Type.getTypeForName("Reference to "+MMp3.TYPE_NAME));
				newMMp3EntryReferenceResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT));
				newMMp3EntryReferenceResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EntryReferenceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3EntryReferenceResult != null) {
				if(newMMp3EntryReferenceResult != null)
					newMMp3EntryReferenceResult.eAdapters().addAll(mMp3EntryReferenceResult.eAdapters());			
			
				mMp3EntryReferenceResult.eAdapters().clear();
			}
			msgs = basicSetMMp3EntryReferenceResult(newMMp3EntryReferenceResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT, newMMp3EntryReferenceResult, newMMp3EntryReferenceResult));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Entry Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Entry Reference Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Entry Reference Result</em>' reference.
	 * @see #setMp3EntryReferenceResult(MMp3)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step_Mp3EntryReferenceResult()
	 * @model required="true" transient="true"
	 * @generated
	 */
	public MMp3 getMp3EntryReferenceResult() {
		if (mp3EntryReferenceResult != null && ((EObject)mp3EntryReferenceResult).eIsProxy()) {
			InternalEObject oldMp3EntryReferenceResult = (InternalEObject)mp3EntryReferenceResult;
			mp3EntryReferenceResult = (MMp3)eResolveProxy(oldMp3EntryReferenceResult);
			if (mp3EntryReferenceResult != oldMp3EntryReferenceResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT, oldMp3EntryReferenceResult, mp3EntryReferenceResult));
			}
		}
		return mp3EntryReferenceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMp3 basicGetMp3EntryReferenceResult() {
		return mp3EntryReferenceResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryReferenceResult <em>Mp3 Entry Reference Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3EntryReferenceResult the new value of the '<em>Mp3 Entry Reference Result</em>' reference.
	 * @see #getMp3EntryReferenceResult()
	 * @generated
	 */
	public void setMp3EntryReferenceResult(MMp3 newMp3EntryReferenceResult) {
		MMp3 oldMp3EntryReferenceResult = mp3EntryReferenceResult;
		mp3EntryReferenceResult = newMp3EntryReferenceResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT, oldMp3EntryReferenceResult, mp3EntryReferenceResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:
				return basicSetMArtistParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:
				return basicSetMTitleParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:
				return basicSetMAlbumParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:
				return basicSetMYearParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return basicSetMDirectoryParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return basicSetMMp3FileNameParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return basicSetMRecordingFileParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return basicSetMMp3EncoderPathParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return basicSetMAverageBitRateParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return basicSetMMp3FolderReferenceParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return basicSetMMp3EntryNameParameter(null, msgs);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return basicSetMMp3EntryReferenceResult(null, msgs);
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:
				return getMArtistParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER:
				return getArtistParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:
				return getMTitleParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER:
				return getTitleParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:
				return getMAlbumParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER:
				return getAlbumParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:
				return getMYearParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER:
				return getYearParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return getMDirectoryParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				return getDirectoryParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return getMMp3FileNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				return getMp3FileNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return getMRecordingFileParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				return getRecordingFileParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return getMMp3EncoderPathParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				return getMp3EncoderPathParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return getMAverageBitRateParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				return getAverageBitRateParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return getMMp3FolderReferenceParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				if (resolve) return getMp3FolderReferenceParameter();
				return basicGetMp3FolderReferenceParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return getMMp3EntryNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER:
				return getMp3EntryNameParameter();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return getMMp3EntryReferenceResult();
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT:
				if (resolve) return getMp3EntryReferenceResult();
				return basicGetMp3EntryReferenceResult();
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:    
				setMArtistParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER:    
				setArtistParameter((String)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:    
				setMTitleParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER:    
				setTitleParameter((String)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:    
				setMAlbumParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER:    
				setAlbumParameter((String)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:    
				setMYearParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER:    
				setYearParameter((String)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:    
				setMDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:    
				setDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:    
				setMMp3FileNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:    
				setMp3FileNameParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:    
				setMRecordingFileParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:    
				setRecordingFileParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:    
				setMMp3EncoderPathParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:    
				setMp3EncoderPathParameter((File)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:    
				setMAverageBitRateParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:    
				setAverageBitRateParameter((Long)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:    
				setMMp3FolderReferenceParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER:    
				setMp3FolderReferenceParameter((MMp3Folder)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:    
				setMMp3EntryNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER:    
				setMp3EntryNameParameter((String)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:    
				setMMp3EntryReferenceResult((MResult)newValue);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT:    
				setMp3EntryReferenceResult((MMp3)newValue);
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:
				setMArtistParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER:
				setArtistParameter(getDefaultArtistParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:
				setMTitleParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER:
				setTitleParameter(getDefaultTitleParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:
				setMAlbumParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER:
				setAlbumParameter(getDefaultAlbumParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:
				setMYearParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER:
				setYearParameter(getDefaultYearParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				setMDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				setDirectoryParameter(getDefaultDirectoryParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				setMMp3FileNameParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				setMp3FileNameParameter(getDefaultMp3FileNameParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				setMRecordingFileParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				setRecordingFileParameter(getDefaultRecordingFileParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				setMMp3EncoderPathParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				setMp3EncoderPathParameter(getDefaultMp3EncoderPathParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				setMAverageBitRateParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				setAverageBitRateParameter(getDefaultAverageBitRateParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				setMMp3FolderReferenceParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				setMp3FolderReferenceParameter((MMp3Folder)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:
				setMMp3EntryNameParameter((MParameter)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER:
				setMp3EntryNameParameter(getDefaultMp3EntryNameParameter());
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				setMMp3EntryReferenceResult((MResult)null);
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT:
				setMp3EntryReferenceResult((MMp3)null);
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
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:
				return mArtistParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER:
				return getDefaultArtistParameter() == null ? artistParameter != null : !getDefaultArtistParameter().equals(artistParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:
				return mTitleParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER:
				return getDefaultTitleParameter() == null ? titleParameter != null : !getDefaultTitleParameter().equals(titleParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:
				return mAlbumParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER:
				return getDefaultAlbumParameter() == null ? albumParameter != null : !getDefaultAlbumParameter().equals(albumParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:
				return mYearParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER:
				return getDefaultYearParameter() == null ? yearParameter != null : !getDefaultYearParameter().equals(yearParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
				return mDirectoryParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
				return getDefaultDirectoryParameter() == null ? directoryParameter != null : !getDefaultDirectoryParameter().equals(directoryParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
				return mMp3FileNameParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
				return getDefaultMp3FileNameParameter() == null ? mp3FileNameParameter != null : !getDefaultMp3FileNameParameter().equals(mp3FileNameParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
				return mRecordingFileParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
				return getDefaultRecordingFileParameter() == null ? recordingFileParameter != null : !getDefaultRecordingFileParameter().equals(recordingFileParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
				return mMp3EncoderPathParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
				return getDefaultMp3EncoderPathParameter() == null ? mp3EncoderPathParameter != null : !getDefaultMp3EncoderPathParameter().equals(mp3EncoderPathParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
				return mAverageBitRateParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
				return getDefaultAverageBitRateParameter() == null ? averageBitRateParameter != null : !getDefaultAverageBitRateParameter().equals(averageBitRateParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return mMp3FolderReferenceParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				return mp3FolderReferenceParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return mMp3EntryNameParameter != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER:
				return getDefaultMp3EntryNameParameter() == null ? mp3EntryNameParameter != null : !getDefaultMp3EntryNameParameter().equals(mp3EntryNameParameter);
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return mMp3EntryReferenceResult != null;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT:
				return mp3EntryReferenceResult != null;
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
		result.append(" (artistParameter: ");
		result.append(artistParameter);
		result.append(", titleParameter: ");
		result.append(titleParameter);
		result.append(", albumParameter: ");
		result.append(albumParameter);
		result.append(", yearParameter: ");
		result.append(yearParameter);
		result.append(", directoryParameter: ");
		result.append(directoryParameter);
		result.append(", mp3FileNameParameter: ");
		result.append(mp3FileNameParameter);
		result.append(", recordingFileParameter: ");
		result.append(recordingFileParameter);
		result.append(", mp3EncoderPathParameter: ");
		result.append(mp3EncoderPathParameter);
		result.append(", averageBitRateParameter: ");
		result.append(averageBitRateParameter);
		result.append(", mp3EntryNameParameter: ");
		result.append(mp3EntryNameParameter);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {    
	    String title = CommandLineInterface.escapeArgument(getMTitleParameter().getValueForUI());
	    String album = CommandLineInterface.escapeArgument(getMAlbumParameter().getValueForUI());
	    String artist = CommandLineInterface.escapeArgument(getMArtistParameter().getValueForUI());
	    String year = CommandLineInterface.escapeArgument(getMYearParameter().getValueForUI());

	    File inputFile = getRecordingFileParameter();
	    File directory = getDirectoryParameter();
	    File outputFile = new File(directory.getPath()+File.separator+getMp3FileNameParameter().getName());
	    
	    //* new File("Service Files\\MP3 Files").mkdirs();
	    String lameEncoderPath = getMp3EncoderPathParameter().getCanonicalPath();
	    CommandLineInterface.execute(new String[] {"\""+lameEncoderPath+File.separator+
	            "lame.exe\"", "-h", "-m j", "--abr "+getAverageBitRateParameter(),
	            "--tt \""+title+"\"",
	            "--ta \""+artist+"\"",
	            "--tl \""+album+"\"",
	            "--ty \""+year+"\"",
	            "--tg \"Speech\"", // Genre 101: Speech.	
	            "--resample 22.050",
	            "\""+inputFile.getAbsolutePath()+"\"", "\""+outputFile.getAbsolutePath()+"\""},
	            this,
	            null);
	    
	    MMp3 newMMp3 = null;
	    
	    // Checks whether an entry with the same name already exists.
	    for(MMp3 mMp3: (List<MMp3>)getMp3FolderReferenceParameter().getMMp3s())
	    	if(mMp3.getName() != null && mMp3.getName().equals(getMp3EntryNameParameter())) {
	    		newMMp3 = mMp3;
	    		break;
	    	}	
	    
	    if(newMMp3 == null) {
	    	newMMp3 = new MMp3();
	    	newMMp3.setName(getMp3EntryNameParameter());
	    	newMMp3.setFileProperty(outputFile);
	    	getMp3FolderReferenceParameter().getMMp3s().add(newMMp3);
	    }
	    
	    setMp3EntryReferenceResult(newMMp3);
	}
	
	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#convertMInputValues(org.onceforall.dms.desktop.logic.MValue)
	 */
	@Override
	protected Object convertMInputValues(MValue mOwnerValue) {
		if(getMAlbumParameter().equals(mOwnerValue)) {
		    String part = mOwnerValue.getMInputValueForUI(LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
			   
		    if(part == null)
		        return super.convertMInputValues(mOwnerValue);
		    
		    return "WWX "+part;			
		}
		if(getMMp3FileNameParameter().equals(mOwnerValue)) {
            String[] texts = new String[4];
            texts[0] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
            texts[1] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
            texts[2] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT);
            texts[3] = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
            
            String valueText = Utilities.concatenate(texts, " - ");
            if(valueText == null)
                return null;
            
            return new File(Utilities.convertToFileName(valueText)+".mp3");
		}
		else if(getMTitleParameter().equals(mOwnerValue)) {
            String title = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
            String reading = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
            String date = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);

            if(title == null && reading == null && date == null)
                return(null);
            
            title = title != null ? title : "";
            reading = reading != null ? " - "+reading : "";
            date = date != null ? " on "+date : "";
            
            return title+reading+date;
		}
		else if(getMYearParameter().equals(mOwnerValue)) {
			MValue mValue = mOwnerValue.getMInputValue(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
			if(mValue == null)
				return null;
			
            Date serviceDate = (Date) mValue.getValue();
     	   	
            if(serviceDate == null)
     	   	    return null;
     	   	
    	    Calendar serviceDateCalendar = Calendar.getInstance();
    	    serviceDateCalendar.setTime(serviceDate);
    	    return new Integer(serviceDateCalendar.get(Calendar.YEAR)).toString();
		}
		else if(getMMp3EntryNameParameter().equals(mOwnerValue)) {
            String prefix = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
            String postfix = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
            String date = mOwnerValue.getMInputValueForUIOrNull(LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT, LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
            
            if(prefix == null && date == null)
                return(null);
            
            prefix = prefix != null ? prefix : "";
            postfix = postfix != null ? " ("+postfix+")": "";
            date = date != null ? " on "+date : "";
            
            return prefix+postfix+date;
		}
		else
			return super.convertMInputValues(mOwnerValue);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#stop()
	 */
	@Override
	public void stop() {
        setStateProperty(MStepStateType.STOPPING_STATE);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#terminate()
	 */
	@Override
	public void terminate() {
        setStateProperty(MStepStateType.TERMINATING_STATE);
	}

} // MConvertToMP3Step