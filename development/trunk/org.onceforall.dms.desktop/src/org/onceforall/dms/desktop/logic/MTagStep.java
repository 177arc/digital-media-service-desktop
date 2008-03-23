
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTag Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMArtistParameter <em>MArtist Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getArtistParameter <em>Artist Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMTitleParameter <em>MTitle Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getTitleParameter <em>Title Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMAlbumParameter <em>MAlbum Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getAlbumParameter <em>Album Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMGenreParameter <em>MGenre Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getGenreParameter <em>Genre Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getGenreParameterHistoricValues <em>Genre Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMYearParameter <em>MYear Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getYearParameter <em>Year Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMCommentParameter <em>MComment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getCommentParameter <em>Comment Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getCommentParameterHistoricValues <em>Comment Parameter Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3EntryNameParameter <em>MMp3 Entry Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3EntryNameParameter <em>Mp3 Entry Name Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3EntryReferenceResult <em>MMp3 Entry Reference Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3EntryReferenceResult <em>Mp3 Entry Reference Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3FilePathResult <em>MMp3 File Path Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3FilePathResult <em>Mp3 File Path Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore actionName='Mark as completed' actionIconFilePath='Image Files\\Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public abstract class MTagStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MTagStep.class.getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";

	/** Specifies a map that relates the name of the genre to its numeric ID3 representation. */
	public static final Map<String, String> GENRES_BY_NAME = new HashMap<String, String>();
	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MTagStep.TYPE_NAME, new ReferenceType("Reference to "+MTagStep.TYPE_NAME, "Specifies a reference to a "+MTagStep.TYPE_NAME_FOR_UI, MTagStep.class));
		
		GENRES_BY_NAME.put("Blues", "0");
		GENRES_BY_NAME.put("Classic Rock", "1");
		GENRES_BY_NAME.put("Country", "2");
		GENRES_BY_NAME.put("Dance", "3");
		GENRES_BY_NAME.put("Disco", "4");
		GENRES_BY_NAME.put("Funk", "5");
		GENRES_BY_NAME.put("Grunge", "6");
		GENRES_BY_NAME.put("Hip-Hop", "7");
		GENRES_BY_NAME.put("Jazz", "8");
		GENRES_BY_NAME.put("Metal", "9");
		GENRES_BY_NAME.put("New Age", "10");
		GENRES_BY_NAME.put("Oldies", "11");
		GENRES_BY_NAME.put("Other", "12");
		GENRES_BY_NAME.put("Pop", "13");
		GENRES_BY_NAME.put("R&B", "14");
		GENRES_BY_NAME.put("Rap", "15");
		GENRES_BY_NAME.put("Reggae", "16");
		GENRES_BY_NAME.put("Rock", "17");
		GENRES_BY_NAME.put("Techno", "18");
		GENRES_BY_NAME.put("Industrial", "19");
		GENRES_BY_NAME.put("Alternative", "20");
		GENRES_BY_NAME.put("Ska", "21");
		GENRES_BY_NAME.put("Death Metal", "22");
		GENRES_BY_NAME.put("Pranks", "23");
		GENRES_BY_NAME.put("Soundtrack", "24");
		GENRES_BY_NAME.put("Euro-Techno", "25");
		GENRES_BY_NAME.put("Ambient", "26");
		GENRES_BY_NAME.put("Trip-Hop", "27");
		GENRES_BY_NAME.put("Vocal", "28");
		GENRES_BY_NAME.put("Jazz+Funk", "29");
		GENRES_BY_NAME.put("Fusion", "30");
		GENRES_BY_NAME.put("Trance", "31");
		GENRES_BY_NAME.put("Classical", "32");
		GENRES_BY_NAME.put("Instrumental", "33");
		GENRES_BY_NAME.put("Acid", "34");
		GENRES_BY_NAME.put("House", "35");
		GENRES_BY_NAME.put("Game", "36");
		GENRES_BY_NAME.put("Sound Clip", "37");
		GENRES_BY_NAME.put("Gospel", "38");
		GENRES_BY_NAME.put("Noise", "39");
		GENRES_BY_NAME.put("AlternRock", "40");
		GENRES_BY_NAME.put("Bass", "41");
		GENRES_BY_NAME.put("Soul", "42");
		GENRES_BY_NAME.put("Punk", "43");
		GENRES_BY_NAME.put("Space", "44");
		GENRES_BY_NAME.put("Meditative", "45");
		GENRES_BY_NAME.put("Instrumental Pop", "46");
		GENRES_BY_NAME.put("Instrumental Rock", "47");
		GENRES_BY_NAME.put("Ethnic", "48");
		GENRES_BY_NAME.put("Gothic", "49");
		GENRES_BY_NAME.put("Darkwave", "50");
		GENRES_BY_NAME.put("Techno-Industrial", "51");
		GENRES_BY_NAME.put("Electronic", "52");
		GENRES_BY_NAME.put("Pop-Folk", "53");
		GENRES_BY_NAME.put("Eurodance", "54");
		GENRES_BY_NAME.put("Dream", "55");
		GENRES_BY_NAME.put("Southern Rock", "56");
		GENRES_BY_NAME.put("Comedy", "57");
		GENRES_BY_NAME.put("Cult", "58");
		GENRES_BY_NAME.put("Gangsta", "59");
		GENRES_BY_NAME.put("Top 40", "60");
		GENRES_BY_NAME.put("Christian Rap", "61");
		GENRES_BY_NAME.put("Pop/Funk", "62");
		GENRES_BY_NAME.put("Jungle", "63");
		GENRES_BY_NAME.put("Native American", "64");
		GENRES_BY_NAME.put("Cabaret", "65");
		GENRES_BY_NAME.put("New Wave", "66");
		GENRES_BY_NAME.put("Psychadelic", "67");
		GENRES_BY_NAME.put("Rave", "68");
		GENRES_BY_NAME.put("Showtunes", "69");
		GENRES_BY_NAME.put("Trailer", "70");
		GENRES_BY_NAME.put("Lo-Fi", "71");
		GENRES_BY_NAME.put("Tribal", "72");
		GENRES_BY_NAME.put("Acid Punk", "73");
		GENRES_BY_NAME.put("Acid Jazz", "74");
		GENRES_BY_NAME.put("Polka", "75");
		GENRES_BY_NAME.put("Retro", "76");
		GENRES_BY_NAME.put("Musical", "77");
		GENRES_BY_NAME.put("Rock & Roll", "78");
		GENRES_BY_NAME.put("Hard Rock", "79");
		GENRES_BY_NAME.put("Folk", "80");
		GENRES_BY_NAME.put("Folk-Rock", "81");
		GENRES_BY_NAME.put("National Folk", "82");
		GENRES_BY_NAME.put("Swing", "83");
		GENRES_BY_NAME.put("Fast Fusion", "84");
		GENRES_BY_NAME.put("Bebob", "85");
		GENRES_BY_NAME.put("Latin", "86");
		GENRES_BY_NAME.put("Revival", "87");
		GENRES_BY_NAME.put("Celtic", "88");
		GENRES_BY_NAME.put("Bluegrass", "89");
		GENRES_BY_NAME.put("Avantgarde", "90");
		GENRES_BY_NAME.put("Gothic Rock", "91");
		GENRES_BY_NAME.put("Progressive Rock", "92");
		GENRES_BY_NAME.put("Psychedelic Rock", "93");
		GENRES_BY_NAME.put("Symphonic Rock", "94");
		GENRES_BY_NAME.put("Slow Rock", "95");
		GENRES_BY_NAME.put("Big Band", "96");
		GENRES_BY_NAME.put("Chorus", "97");
		GENRES_BY_NAME.put("Easy Listening", "98");
		GENRES_BY_NAME.put("Acoustic", "99");
		GENRES_BY_NAME.put("Humour", "100");
		GENRES_BY_NAME.put("Speech", "101");
		GENRES_BY_NAME.put("Chanson", "102");
		GENRES_BY_NAME.put("Opera", "103");
		GENRES_BY_NAME.put("Chamber Music", "104");
		GENRES_BY_NAME.put("Sonata", "105");
		GENRES_BY_NAME.put("Symphony", "106");
		GENRES_BY_NAME.put("Booty Bass", "107");
		GENRES_BY_NAME.put("Primus", "108");
		GENRES_BY_NAME.put("Porn Groove", "109");
		GENRES_BY_NAME.put("Satire", "110");
		GENRES_BY_NAME.put("Slow Jam", "111");
		GENRES_BY_NAME.put("Club", "112");
		GENRES_BY_NAME.put("Tango", "113");
		GENRES_BY_NAME.put("Samba", "114");
		GENRES_BY_NAME.put("Folklore", "115");
		GENRES_BY_NAME.put("Ballad", "116");
		GENRES_BY_NAME.put("Power Ballad", "117");
		GENRES_BY_NAME.put("Rhythmic Soul", "118");
		GENRES_BY_NAME.put("Freestyle", "119");
		GENRES_BY_NAME.put("Duet", "120");
		GENRES_BY_NAME.put("Punk Rock", "121");
		GENRES_BY_NAME.put("Drum Solo", "122");
		GENRES_BY_NAME.put("Acapella", "123");
		GENRES_BY_NAME.put("Euro-House", "124");
		GENRES_BY_NAME.put("Dance Hall", "125");
		
	
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
	 * The cached value of the '{@link #getMGenreParameter() <em>MGenre Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGenreParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mGenreParameter = null;

	/**
	 * The default value of the '{@link #getGenreParameter() <em>Genre Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_PARAMETER_EDEFAULT = "Speech";

	/**
	 * Get the default value of the '{@link #getGenreParameter() <em>Genre Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getGenreParameter() <em>Genre Parameter</em>}' attribute.
	 * @see #getGenreParameter()
	 * @generated
	 * @ordered
	 */
	public String getDefaultGenreParameter() {
		return GENRE_PARAMETER_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getGenreParameter() <em>Genre Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreParameter()
	 * @generated
	 * @ordered
	 */
	protected String genreParameter = GENRE_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenreParameterHistoricValues() <em>Genre Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenreParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList genreParameterHistoricValues = null;

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
	 * The cached value of the '{@link #getCommentParameterHistoricValues() <em>Comment Parameter Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentParameterHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList commentParameterHistoricValues = null;

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
	 * The cached value of the '{@link #getMMp3FilePathResult() <em>MMp3 File Path Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3FilePathResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mMp3FilePathResult = null;

	/**
	 * The default value of the '{@link #getMp3FilePathResult() <em>Mp3 File Path Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FilePathResult()
	 * @generated
	 * @ordered
	 */
	protected static final File MP3_FILE_PATH_RESULT_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getMp3FilePathResult() <em>Mp3 File Path Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getMp3FilePathResult() <em>Mp3 File Path Result</em>}' attribute.
	 * @see #getMp3FilePathResult()
	 * @generated
	 * @ordered
	 */
	public File getDefaultMp3FilePathResult() {
		return MP3_FILE_PATH_RESULT_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getMp3FilePathResult() <em>Mp3 File Path Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp3FilePathResult()
	 * @generated
	 * @ordered
	 */
	protected File mp3FilePathResult = MP3_FILE_PATH_RESULT_EDEFAULT;


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
	protected MTagStep() {
		super();
		
		firstMTagStepConstructorHook();
				
		stoppable = false;
		interruptable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
		terminatable = false;
		actionName = "Mark as completed";
					 
		setMArtistParameter(new MParameter(false, "Artist", "Determines the text that will set as the ID3 artist tag on the MP3 file.", null));			 
		setMTitleParameter(new MParameter(false, "Title", "Determines the text that will set as the ID3 title tag on the MP3 file.", null));			 
		setMAlbumParameter(new MParameter(false, "Album", "Determines the text that will set as the ID3 album tag on the MP3 file.", null));			 
		setMGenreParameter(new MParameter(false, "Genre", "Determines the text that will set as the ID3 year tag on the MP3 file.", null));			 
		setMYearParameter(new MParameter(false, "Year", "Determines the text that will set as the ID3 year tag on the MP3 file.", null));			 
		setMCommentParameter(new MParameter(false, "Comment", "Determines the text that will set as the ID3 comment tag on the MP3 file.", null));			 
		setMMp3FolderReferenceParameter(new MParameter(false, "MP3 folder reference", "Specifies a reference to the folder where the new MP3 file should be stored.", null));			 
		setMMp3EntryNameParameter(new MParameter(false, "MP3 entry name", "Specifies the name of the new MP3 entry in the MP3 folder.", null));			 
		setMMp3EntryReferenceResult(new MResult(true, "MP3 entry reference", "Contains a reference to the MP3 enty that has been created.", null));			 
		setMMp3FilePathResult(new MResult(true, "MP3 file path", "Specifies the path of the converted MP3 file.", null));

		lastMTagStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMTagStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMTagStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MTAG_STEP;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MArtistParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MARTIST_PARAMETER, oldMArtistParameter, newMArtistParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMArtistParameter <em>MArtist Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mArtistParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MARTIST_PARAMETER, null, msgs);
			if (newMArtistParameter != null) {				
				newMArtistParameter.setDefaultName("Artist");
				newMArtistParameter.setDefaultDescription("Determines the text that will set as the ID3 artist tag on the MP3 file.");
				newMArtistParameter.setValueType(Type.getTypeForName("Text"));
				newMArtistParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__ARTIST_PARAMETER));
				newMArtistParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMArtistParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MARTIST_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MARTIST_PARAMETER, newMArtistParameter, newMArtistParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_ArtistParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getArtistParameter() {
		return artistParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getArtistParameter <em>Artist Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__ARTIST_PARAMETER, oldArtistParameter, artistParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MTitleParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MTITLE_PARAMETER, oldMTitleParameter, newMTitleParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMTitleParameter <em>MTitle Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mTitleParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MTITLE_PARAMETER, null, msgs);
			if (newMTitleParameter != null) {				
				newMTitleParameter.setDefaultName("Title");
				newMTitleParameter.setDefaultDescription("Determines the text that will set as the ID3 title tag on the MP3 file.");
				newMTitleParameter.setValueType(Type.getTypeForName("Text"));
				newMTitleParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__TITLE_PARAMETER));
				newMTitleParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMTitleParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MTITLE_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MTITLE_PARAMETER, newMTitleParameter, newMTitleParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_TitleParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getTitleParameter() {
		return titleParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getTitleParameter <em>Title Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__TITLE_PARAMETER, oldTitleParameter, titleParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MAlbumParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MALBUM_PARAMETER, oldMAlbumParameter, newMAlbumParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMAlbumParameter <em>MAlbum Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mAlbumParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MALBUM_PARAMETER, null, msgs);
			if (newMAlbumParameter != null) {				
				newMAlbumParameter.setDefaultDescription("Determines the text that will set as the ID3 album tag on the MP3 file.");
				newMAlbumParameter.setDefaultName("Album");
				newMAlbumParameter.setValueType(Type.getTypeForName("Text"));
				newMAlbumParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__ALBUM_PARAMETER));
				newMAlbumParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMAlbumParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MALBUM_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MALBUM_PARAMETER, newMAlbumParameter, newMAlbumParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_AlbumParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getAlbumParameter() {
		return albumParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getAlbumParameter <em>Album Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__ALBUM_PARAMETER, oldAlbumParameter, albumParameter));
	}

	/**
	 * Returns the value of the '<em><b>MGenre Parameter</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MGenre Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MGenre Parameter</em>' containment reference.
	 * @see #setMGenreParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MGenreParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Genre' description='Determines the text that will set as the ID3 year tag on the MP3 file.' readOnly='false'"
	 * @generated
	 */
	public MParameter getMGenreParameter() {
		return mGenreParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMGenreParameter(MParameter newMGenreParameter, NotificationChain msgs) {
		MParameter oldMGenreParameter = mGenreParameter;
		mGenreParameter = newMGenreParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MGENRE_PARAMETER, oldMGenreParameter, newMGenreParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMGenreParameter <em>MGenre Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMGenreParameter the new value of the '<em>MGenre Parameter</em>' containment reference.
	 * @see #getMGenreParameter()
	 * @generated
	 */
	public void setMGenreParameter(MParameter newMGenreParameter) {
		if (newMGenreParameter != mGenreParameter) {
			NotificationChain msgs = null;
			if (mGenreParameter != null)
				msgs = ((InternalEObject)mGenreParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MGENRE_PARAMETER, null, msgs);
			if (newMGenreParameter != null) {				
				newMGenreParameter.setDefaultName("Genre");
				newMGenreParameter.setDefaultDescription("Determines the text that will set as the ID3 year tag on the MP3 file.");
				newMGenreParameter.setValueType(Type.getTypeForName("Text"));
				newMGenreParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__GENRE_PARAMETER));
				newMGenreParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMGenreParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MGENRE_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mGenreParameter != null) {
				if(newMGenreParameter != null)
					newMGenreParameter.eAdapters().addAll(mGenreParameter.eAdapters());			
			
				mGenreParameter.eAdapters().clear();
			}
			msgs = basicSetMGenreParameter(newMGenreParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MGENRE_PARAMETER, newMGenreParameter, newMGenreParameter));
	}

	/**
	 * Returns the value of the '<em><b>Genre Parameter</b></em>' attribute.
	 * The default value is <code>"Speech"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genre Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre Parameter</em>' attribute.
	 * @see #setGenreParameter(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_GenreParameter()
	 * @model default="Speech" dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getGenreParameter() {
		return genreParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getGenreParameter <em>Genre Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newGenreParameter the new value of the '<em>Genre Parameter</em>' attribute.
	 * @see #getGenreParameter()
	 * @generated
	 */
	public void setGenreParameter(String newGenreParameter) {
		String oldGenreParameter = genreParameter;
		genreParameter = newGenreParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__GENRE_PARAMETER, oldGenreParameter, genreParameter));
	}

	/**
	 * Returns the value of the '<em><b>Genre Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genre Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_GenreParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getGenreParameterHistoricValues() {
		if (genreParameterHistoricValues == null) {
			genreParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES);
		}
		return genreParameterHistoricValues;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MYearParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MYEAR_PARAMETER, oldMYearParameter, newMYearParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMYearParameter <em>MYear Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mYearParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MYEAR_PARAMETER, null, msgs);
			if (newMYearParameter != null) {				
				newMYearParameter.setDefaultDescription("Determines the text that will set as the ID3 year tag on the MP3 file.");
				newMYearParameter.setDefaultName("Year");
				newMYearParameter.setValueType(Type.getTypeForName("Text"));
				newMYearParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__YEAR_PARAMETER));
				newMYearParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMYearParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MYEAR_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MYEAR_PARAMETER, newMYearParameter, newMYearParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_YearParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getYearParameter() {
		return yearParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getYearParameter <em>Year Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__YEAR_PARAMETER, oldYearParameter, yearParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MCommentParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Comment' description='Determines the text that will set as the ID3 comment tag on the MP3 file.'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER, oldMCommentParameter, newMCommentParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMCommentParameter <em>MComment Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mCommentParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER, null, msgs);
			if (newMCommentParameter != null) {				
				newMCommentParameter.setDefaultDescription("Determines the text that will set as the ID3 comment tag on the MP3 file.");
				newMCommentParameter.setDefaultName("Comment");
				newMCommentParameter.setValueType(Type.getTypeForName("Text"));
				newMCommentParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__COMMENT_PARAMETER));
				newMCommentParameter.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMCommentParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER, newMCommentParameter, newMCommentParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_CommentParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" transient="true"
	 * @generated
	 */
	public String getCommentParameter() {
		return commentParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getCommentParameter <em>Comment Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__COMMENT_PARAMETER, oldCommentParameter, commentParameter));
	}

	/**
	 * Returns the value of the '<em><b>Comment Parameter Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Parameter Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Parameter Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_CommentParameterHistoricValues()
	 * @model type="java.lang.String" dataType="org.onceforall.dms.desktop.logic.MString" upper="3"
	 * @generated
	 */
	public EList getCommentParameterHistoricValues() {
		if (commentParameterHistoricValues == null) {
			commentParameterHistoricValues = new EDataTypeUniqueEList(String.class, this, LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES);
		}
		return commentParameterHistoricValues;
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MMp3FolderReferenceParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, oldMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mMp3FolderReferenceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
			if (newMMp3FolderReferenceParameter != null) {				
				newMMp3FolderReferenceParameter.setDefaultDescription("Specifies a reference to the folder where the new MP3 file should be stored.");
				newMMp3FolderReferenceParameter.setDefaultName("MP3 folder reference");
				newMMp3FolderReferenceParameter.setValueType(Type.getTypeForName("Reference to "+MMp3Folder.TYPE_NAME));
				newMMp3FolderReferenceParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER));
				newMMp3FolderReferenceParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FolderReferenceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER, newMMp3FolderReferenceParameter, newMMp3FolderReferenceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 Folder Reference Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 Folder Reference Parameter</em>' reference.
	 * @see #setMp3FolderReferenceParameter(MMp3Folder)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_Mp3FolderReferenceParameter()
	 * @model required="true"
	 * @generated
	 */
	public MMp3Folder getMp3FolderReferenceParameter() {
		if (mp3FolderReferenceParameter != null && ((EObject)mp3FolderReferenceParameter).eIsProxy()) {
			InternalEObject oldMp3FolderReferenceParameter = (InternalEObject)mp3FolderReferenceParameter;
			mp3FolderReferenceParameter = (MMp3Folder)eResolveProxy(oldMp3FolderReferenceParameter);
			if (mp3FolderReferenceParameter != oldMp3FolderReferenceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
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
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER, oldMp3FolderReferenceParameter, mp3FolderReferenceParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MMp3EntryNameParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER, oldMMp3EntryNameParameter, newMMp3EntryNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3EntryNameParameter <em>MMp3 Entry Name Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)mMp3EntryNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER, null, msgs);
			if (newMMp3EntryNameParameter != null) {				
				newMMp3EntryNameParameter.setDefaultDescription("Specifies the name of the new MP3 entry in the MP3 folder.");
				newMMp3EntryNameParameter.setDefaultName("MP3 entry name");
				newMMp3EntryNameParameter.setValueType(Type.getTypeForName("Text"));
				newMMp3EntryNameParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER));
				newMMp3EntryNameParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EntryNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER, newMMp3EntryNameParameter, newMMp3EntryNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_Mp3EntryNameParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getMp3EntryNameParameter() {
		return mp3EntryNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3EntryNameParameter <em>Mp3 Entry Name Parameter</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER, oldMp3EntryNameParameter, mp3EntryNameParameter));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MMp3EntryReferenceResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 entry reference' description='Contains a reference to the MP3 enty that has been created.' readOnly='true'"
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT, oldMMp3EntryReferenceResult, newMMp3EntryReferenceResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3EntryReferenceResult <em>MMp3 Entry Reference Result</em>}' containment reference.
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
				msgs = ((InternalEObject)mMp3EntryReferenceResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT, null, msgs);
			if (newMMp3EntryReferenceResult != null) {				
				newMMp3EntryReferenceResult.setDefaultName("MP3 entry reference");
				newMMp3EntryReferenceResult.setDefaultDescription("Contains a reference to the MP3 enty that has been created.");
				newMMp3EntryReferenceResult.setValueType(Type.getTypeForName("Reference to "+MMp3.TYPE_NAME));
				newMMp3EntryReferenceResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT));
				newMMp3EntryReferenceResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3EntryReferenceResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT, newMMp3EntryReferenceResult, newMMp3EntryReferenceResult));
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
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_Mp3EntryReferenceResult()
	 * @model required="true" transient="true"
	 * @generated
	 */
	public MMp3 getMp3EntryReferenceResult() {
		if (mp3EntryReferenceResult != null && ((EObject)mp3EntryReferenceResult).eIsProxy()) {
			InternalEObject oldMp3EntryReferenceResult = (InternalEObject)mp3EntryReferenceResult;
			mp3EntryReferenceResult = (MMp3)eResolveProxy(oldMp3EntryReferenceResult);
			if (mp3EntryReferenceResult != oldMp3EntryReferenceResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT, oldMp3EntryReferenceResult, mp3EntryReferenceResult));
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
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3EntryReferenceResult <em>Mp3 Entry Reference Result</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT, oldMp3EntryReferenceResult, mp3EntryReferenceResult));
	}

	/**
	 * Returns the value of the '<em><b>MMp3 File Path Result</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3 File Path Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3 File Path Result</em>' containment reference.
	 * @see #setMMp3FilePathResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_MMp3FilePathResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 file path' description='Specifies the path of the converted MP3 file.' readOnly='true'"
	 * @generated
	 */
	public MResult getMMp3FilePathResult() {
		return mMp3FilePathResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMp3FilePathResult(MResult newMMp3FilePathResult, NotificationChain msgs) {
		MResult oldMMp3FilePathResult = mMp3FilePathResult;
		mMp3FilePathResult = newMMp3FilePathResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT, oldMMp3FilePathResult, newMMp3FilePathResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMMp3FilePathResult <em>MMp3 File Path Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMMp3FilePathResult the new value of the '<em>MMp3 File Path Result</em>' containment reference.
	 * @see #getMMp3FilePathResult()
	 * @generated
	 */
	public void setMMp3FilePathResult(MResult newMMp3FilePathResult) {
		if (newMMp3FilePathResult != mMp3FilePathResult) {
			NotificationChain msgs = null;
			if (mMp3FilePathResult != null)
				msgs = ((InternalEObject)mMp3FilePathResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT, null, msgs);
			if (newMMp3FilePathResult != null) {				
				newMMp3FilePathResult.setDefaultName("MP3 file path");
				newMMp3FilePathResult.setDefaultDescription("Specifies the path of the converted MP3 file.");
				newMMp3FilePathResult.setValueType(Type.getTypeForName("File (must exist)"));
				newMMp3FilePathResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT));
				newMMp3FilePathResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMMp3FilePathResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mMp3FilePathResult != null) {
				if(newMMp3FilePathResult != null)
					newMMp3FilePathResult.eAdapters().addAll(mMp3FilePathResult.eAdapters());			
			
				mMp3FilePathResult.eAdapters().clear();
			}
			msgs = basicSetMMp3FilePathResult(newMMp3FilePathResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT, newMMp3FilePathResult, newMMp3FilePathResult));
	}

	/**
	 * Returns the value of the '<em><b>Mp3 File Path Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp3 File Path Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp3 File Path Result</em>' attribute.
	 * @see #setMp3FilePathResult(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTagStep_Mp3FilePathResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true" transient="true"
	 * @generated
	 */
	public File getMp3FilePathResult() {
		return mp3FilePathResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MTagStep#getMp3FilePathResult <em>Mp3 File Path Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMp3FilePathResult the new value of the '<em>Mp3 File Path Result</em>' attribute.
	 * @see #getMp3FilePathResult()
	 * @generated
	 */
	public void setMp3FilePathResult(File newMp3FilePathResult) {
		File oldMp3FilePathResult = mp3FilePathResult;
		mp3FilePathResult = newMp3FilePathResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT, oldMp3FilePathResult, mp3FilePathResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:
				return basicSetMArtistParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:
				return basicSetMTitleParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:
				return basicSetMAlbumParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:
				return basicSetMGenreParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:
				return basicSetMYearParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:
				return basicSetMCommentParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return basicSetMMp3FolderReferenceParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return basicSetMMp3EntryNameParameter(null, msgs);
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return basicSetMMp3EntryReferenceResult(null, msgs);
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:
				return basicSetMMp3FilePathResult(null, msgs);
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
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:
				return getMArtistParameter();
			case LogicPackage.MTAG_STEP__ARTIST_PARAMETER:
				return getArtistParameter();
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:
				return getMTitleParameter();
			case LogicPackage.MTAG_STEP__TITLE_PARAMETER:
				return getTitleParameter();
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:
				return getMAlbumParameter();
			case LogicPackage.MTAG_STEP__ALBUM_PARAMETER:
				return getAlbumParameter();
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:
				return getMGenreParameter();
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER:
				return getGenreParameter();
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES:
				return getGenreParameterHistoricValues();
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:
				return getMYearParameter();
			case LogicPackage.MTAG_STEP__YEAR_PARAMETER:
				return getYearParameter();
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:
				return getMCommentParameter();
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER:
				return getCommentParameter();
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES:
				return getCommentParameterHistoricValues();
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return getMMp3FolderReferenceParameter();
			case LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				if (resolve) return getMp3FolderReferenceParameter();
				return basicGetMp3FolderReferenceParameter();
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return getMMp3EntryNameParameter();
			case LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER:
				return getMp3EntryNameParameter();
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return getMMp3EntryReferenceResult();
			case LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT:
				if (resolve) return getMp3EntryReferenceResult();
				return basicGetMp3EntryReferenceResult();
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:
				return getMMp3FilePathResult();
			case LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT:
				return getMp3FilePathResult();
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
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:    
				setMArtistParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__ARTIST_PARAMETER:    
				setArtistParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:    
				setMTitleParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__TITLE_PARAMETER:    
				setTitleParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:    
				setMAlbumParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__ALBUM_PARAMETER:    
				setAlbumParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:    
				setMGenreParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER:    
				setGenreParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES:
				getGenreParameterHistoricValues().clear();
				getGenreParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:    
				setMYearParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__YEAR_PARAMETER:    
				setYearParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:    
				setMCommentParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER:    
				setCommentParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES:
				getCommentParameterHistoricValues().clear();
				getCommentParameterHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:    
				setMMp3FolderReferenceParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER:    
				setMp3FolderReferenceParameter((MMp3Folder)newValue);
				return;
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:    
				setMMp3EntryNameParameter((MParameter)newValue);
				return;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER:    
				setMp3EntryNameParameter((String)newValue);
				return;
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:    
				setMMp3EntryReferenceResult((MResult)newValue);
				return;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT:    
				setMp3EntryReferenceResult((MMp3)newValue);
				return;
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:    
				setMMp3FilePathResult((MResult)newValue);
				return;
			case LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT:    
				setMp3FilePathResult((File)newValue);
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
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:
				setMArtistParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__ARTIST_PARAMETER:
				setArtistParameter(getDefaultArtistParameter());
				return;
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:
				setMTitleParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__TITLE_PARAMETER:
				setTitleParameter(getDefaultTitleParameter());
				return;
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:
				setMAlbumParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__ALBUM_PARAMETER:
				setAlbumParameter(getDefaultAlbumParameter());
				return;
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:
				setMGenreParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER:
				setGenreParameter(getDefaultGenreParameter());
				return;
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES:
				getGenreParameterHistoricValues().clear();
				return;
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:
				setMYearParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__YEAR_PARAMETER:
				setYearParameter(getDefaultYearParameter());
				return;
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:
				setMCommentParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER:
				setCommentParameter(getDefaultCommentParameter());
				return;
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES:
				getCommentParameterHistoricValues().clear();
				return;
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				setMMp3FolderReferenceParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				setMp3FolderReferenceParameter((MMp3Folder)null);
				return;
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:
				setMMp3EntryNameParameter((MParameter)null);
				return;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER:
				setMp3EntryNameParameter(getDefaultMp3EntryNameParameter());
				return;
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				setMMp3EntryReferenceResult((MResult)null);
				return;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT:
				setMp3EntryReferenceResult((MMp3)null);
				return;
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:
				setMMp3FilePathResult((MResult)null);
				return;
			case LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT:
				setMp3FilePathResult(getDefaultMp3FilePathResult());
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
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:
				return mArtistParameter != null;
			case LogicPackage.MTAG_STEP__ARTIST_PARAMETER:
				return getDefaultArtistParameter() == null ? artistParameter != null : !getDefaultArtistParameter().equals(artistParameter);
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:
				return mTitleParameter != null;
			case LogicPackage.MTAG_STEP__TITLE_PARAMETER:
				return getDefaultTitleParameter() == null ? titleParameter != null : !getDefaultTitleParameter().equals(titleParameter);
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:
				return mAlbumParameter != null;
			case LogicPackage.MTAG_STEP__ALBUM_PARAMETER:
				return getDefaultAlbumParameter() == null ? albumParameter != null : !getDefaultAlbumParameter().equals(albumParameter);
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:
				return mGenreParameter != null;
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER:
				return getDefaultGenreParameter() == null ? genreParameter != null : !getDefaultGenreParameter().equals(genreParameter);
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES:
				return genreParameterHistoricValues != null && !genreParameterHistoricValues.isEmpty();
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:
				return mYearParameter != null;
			case LogicPackage.MTAG_STEP__YEAR_PARAMETER:
				return getDefaultYearParameter() == null ? yearParameter != null : !getDefaultYearParameter().equals(yearParameter);
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:
				return mCommentParameter != null;
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER:
				return getDefaultCommentParameter() == null ? commentParameter != null : !getDefaultCommentParameter().equals(commentParameter);
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES:
				return commentParameterHistoricValues != null && !commentParameterHistoricValues.isEmpty();
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
				return mMp3FolderReferenceParameter != null;
			case LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
				return mp3FolderReferenceParameter != null;
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:
				return mMp3EntryNameParameter != null;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER:
				return getDefaultMp3EntryNameParameter() == null ? mp3EntryNameParameter != null : !getDefaultMp3EntryNameParameter().equals(mp3EntryNameParameter);
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:
				return mMp3EntryReferenceResult != null;
			case LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT:
				return mp3EntryReferenceResult != null;
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:
				return mMp3FilePathResult != null;
			case LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT:
				return getDefaultMp3FilePathResult() == null ? mp3FilePathResult != null : !getDefaultMp3FilePathResult().equals(mp3FilePathResult);
		}
		return super.eIsSet(featureID);
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
		result.append(", genreParameter: ");
		result.append(genreParameter);
		result.append(", genreParameterHistoricValues: ");
		result.append(genreParameterHistoricValues);
		result.append(", yearParameter: ");
		result.append(yearParameter);
		result.append(", commentParameter: ");
		result.append(commentParameter);
		result.append(", commentParameterHistoricValues: ");
		result.append(commentParameterHistoricValues);
		result.append(", mp3EntryNameParameter: ");
		result.append(mp3EntryNameParameter);
		result.append(", mp3FilePathResult: ");
		result.append(mp3FilePathResult);
		result.append(')');
		return result.toString();
	}

} // MTagStep