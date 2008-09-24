/**
 * Revision History:
 * $Log: LogicLayerMUpdatePublishedMP3StepTest.java,v $
 * Revision 1.2  2007/05/12 11:01:27  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.1  2006/10/17 02:35:20  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.tests;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.io.IOException;

import org.farng.mp3.MP3File;
import org.farng.mp3.id3.ID3v1;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logic.LogicFactory;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MMp3;
import org.onceforall.dms.desktop.logic.MMp3Folder;
import org.onceforall.dms.desktop.logic.MNameTagMp3Step;
import org.onceforall.dms.desktop.logic.MTagStep;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Tests the managed name tag step.
 *
 * @author Marc
 */
public class LogicLayerMNameTagStepTest extends LogicLayerTest {
	/** Specifies the managed MP3 folder that will contain the managed MP3 entries created by the managed name tag step. */
	protected MMp3Folder mMp3Folder;
	
	/** Specifies the managed name tag step to test. */
	protected MNameTagMp3Step mStep;
	
	/**
	 * Creates a managed MP3 folder under the application root. It also
	 * creates a managed name tag MP3 step.
	 * 
	 * @throws Exception Thrown if an error occurs.
	 */
	@BeforeClass
	public void initialise() throws Exception {
		mDmsApplication = (MDmsApplication) MApplication.getInstance();
		
		mMp3Folder = LogicFactory.eINSTANCE.createMMp3Folder();
		mDmsApplication.getMMp3Folders().add(mMp3Folder);
		
		mStep = LogicFactory.eINSTANCE.createMNameTagMp3Step();
		mStep.getMAlbumParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Album);
		mStep.getMArtistParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Arist);
		mStep.getMGenreParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Genre);
		mStep.getMYearParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Year);
		mStep.getMTitleParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Title);
		mStep.getMCommentParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Comment);
		mStep.getMMp3FolderReferenceParameter().setValueForUI(mMp3Folder.getPathForUI());
		mStep.getMMp3EntryNameParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Mp3Entry);
		mStep.getMDirectoryParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Directory);
		mStep.getMTaggedMp3FileNameParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_TaggedMp3FileName);
		mStep.getMRecordingMp3FileParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_RecordingMp3File);		
		
		mStep.getMMp3FolderReferenceParameter().setValueForUI(mMp3Folder.getPath());
	}
	
	/**
	 * Removes all test artifact before every test.
	 * 
	 * @throws IOException 
	 */
	@BeforeMethod
	public void cleanUpTestOutputs() throws IOException {
		System.out.print("Cleaning up test outputs ..."); //$NON-NLS-1$
		
		// Restores the original file from its copy.
		copyFile(new File(TestData.LogicLayerNormalServiceTest_PreSermonAudioFile), mStep.getRecordingMp3FileParameter());
		
		File outputFile = new File(mStep.getDirectoryParameter()+File.separator+mStep.getTaggedMp3FileNameParameter());
		if(outputFile.exists()) 
			outputFile.delete();
		
		File renamedFile = new File(mStep.getRecordingMp3FileParameter().getParent()+File.separator+mStep.getTaggedMp3FileNameParameter());
		if(renamedFile.exists()) 
			renamedFile.delete();
		
		System.out.println(" completed."); //$NON-NLS-1$
	}
	
	/**
	 * Tests that the output file is tagged correctly and the input file left untouched.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testTagAndNameCopyOnly() throws Exception {
		// Sets the tagging mode.
		mStep.getMTagAndRenameOriginalParameter().setValueForUI("No"); //$NON-NLS-1$
		
		// Reads the tags from the original file so that later we can check that they have not been changed.
	    String originalAlbum = null;
	    String originalArtist = null;
	    byte originalGenre = 0;
	    String originalYear = null;
	    String originalTitle = null;
	    String originalComment = null;
	    
	    MP3File mp3file = new MP3File(mStep.getRecordingMp3FileParameter(), true);
	    ID3v1 tag = mp3file.getID3v1Tag();
	    if(tag != null) {
			originalAlbum = tag.getAlbum();
			originalArtist = tag.getArtist();
			originalGenre = tag.getGenre();
			originalYear = tag.getYear();
			originalTitle = tag.getTitle();
			originalComment = tag.getComment();
	    }
	    
	    // Tags the file.
		executeMStep(mStep, true, true);

		// Checks that the input file still exists and that the tags have not changed.
		assertTrue(mStep.getRecordingMp3FileParameter().exists());
		mp3file = new MP3File(mStep.getRecordingMp3FileParameter(), true);
		tag = mp3file.getID3v1Tag();
	    if(tag != null) {
		    assertEquals(originalAlbum, tag.getAlbum());
		    assertEquals(originalArtist, tag.getArtist());
		    assertEquals(originalGenre, tag.getGenre());
		    assertEquals(originalYear, tag.getYear());
		    assertEquals(originalTitle, tag.getTitle());
		    assertEquals(originalComment, tag.getComment());
	    }

	    
		// Checks that the tags of the output file have been set correctly.
		assertNotNull(mStep.getMp3FilePathResult());
		mp3file = new MP3File(mStep.getMp3FilePathResult(), true);
		tag = mp3file.getID3v1Tag();
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Album, tag.getAlbum());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Artist, tag.getArtist());
	    assertEquals(new Byte(MTagStep.GENRES_BY_NAME.get(TestData.LogicLayerMNameTagStepTest_Genre)), new Byte(tag.getGenre()));
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Year, tag.getYear());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Title, tag.getTitle());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Comment, tag.getComment());
	    
	    // Checks the MP3 entry.
	    assertNotNull(mStep.getMp3EntryReferenceResult());
	    MMp3 mp3Entry = mStep.getMp3EntryReferenceResult();
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Mp3Entry, mp3Entry.getNameForUI());
	    assertEquals(mStep.getMp3FilePathResult(), mp3Entry.getFileProperty());
		assertTrue(mp3Entry.getLinkTextProperty() == null);
		assertTrue(mp3Entry.getLinkDescriptionProperty()== null);
		assertTrue(mp3Entry.getCommentProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSubtitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSummaryProperty() == null);
		assertTrue(mp3Entry.getPodcastPublishingDateProperty() == null);
		
		// Checks that rerunning reports a warning.
		DesktopExceptionList exceptions = executeMStep(mStep, true, false);
		assertValidation(exceptions, DesktopException.WARNING_SEVERITY, "already exists");		 //$NON-NLS-1$
	}
	
	/**
	 * Tests that the input and the output file are tagged correctly.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testTagAndNameOriginalAsWell() throws Exception {	    
		// Sets the tagging mode.
		mStep.getMTagAndRenameOriginalParameter().setValueForUI("Yes"); //$NON-NLS-1$

		// Checks that its not possible for the input file and the output file to be in the same directory if the original has to be renamed as well.
		mStep.getMDirectoryParameter().setValueForUI(TestData.Test_TestFilesPath);
		DesktopExceptionList exceptions = executeMStep(mStep, true, false, false);
		assertValidation(exceptions, DesktopException.ERROR_SEVERITY, "same directory"); //$NON-NLS-1$

		mStep.getMDirectoryParameter().setValueForUI(TestData.LogicLayerMNameTagStepTest_Directory);
		executeMStep(mStep, true, true);

		// Checks that the input files does not exist anymore.
		assertTrue(!mStep.getRecordingMp3FileParameter().exists());
		
		// Checks that the tags of the input file have been set correctly.
		MP3File mp3file = new MP3File(new File(mStep.getRecordingMp3FileParameter().getParent()+File.separator+mStep.getTaggedMp3FileNameParameter()), true);
		ID3v1 tag = mp3file.getID3v1Tag();
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Album, tag.getAlbum());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Artist, tag.getArtist());
	    assertEquals(new Byte(MTagStep.GENRES_BY_NAME.get(TestData.LogicLayerMNameTagStepTest_Speech)), new Byte(tag.getGenre()));
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Year, tag.getYear());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Title, tag.getTitle());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Comment, tag.getComment());
	    
		// Checks that the tags of the output file have been set correctly.
		assertNotNull(mStep.getMp3FilePathResult());
		mp3file = new MP3File(mStep.getMp3FilePathResult(), true);
		tag = mp3file.getID3v1Tag();
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Album, tag.getAlbum());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Artist, tag.getArtist());
	    assertEquals(new Byte(MTagStep.GENRES_BY_NAME.get(TestData.LogicLayerMNameTagStepTest_Genre)), new Byte(tag.getGenre()));
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Year, tag.getYear());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Title, tag.getTitle());
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Comment, tag.getComment());
	    
	    // Checks the MP3 entry.
	    assertNotNull(mStep.getMp3EntryReferenceResult());
	    MMp3 mp3Entry = mStep.getMp3EntryReferenceResult();
	    assertEquals(TestData.LogicLayerMNameTagStepTest_Mp3Entry, mp3Entry.getNameForUI());
	    assertEquals(mStep.getMp3FilePathResult(), mp3Entry.getFileProperty());
		assertTrue(mp3Entry.getLinkTextProperty() == null);
		assertTrue(mp3Entry.getLinkDescriptionProperty()== null);
		assertTrue(mp3Entry.getCommentProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSubtitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSummaryProperty() == null);
		assertTrue(mp3Entry.getPodcastPublishingDateProperty() == null);		
		
		// Checks that rerunning reports a warning.
		copyFile(new File(TestData.LogicLayerNormalServiceTest_PreSermonAudioFile), mStep.getRecordingMp3FileParameter());
		exceptions = executeMStep(mStep, true, false);
		assertValidation(exceptions, DesktopException.WARNING_SEVERITY, "already exists");		 //$NON-NLS-1$
	}
}
