/**
 * Revision History:
 * $Log: LogicLayerTest.java,v $
 * Revision 1.4  2007/05/12 11:01:27  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:35:20  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:54:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:47:18  marc
 * Updates because of project restruturing.
 *
 * Revision 1.1  2006/08/28 15:25:52  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/21 15:11:59  marc
 * Added initial revision.
 *
 */
package org.onceforall.dms.desktop.tests;

import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Flags.Flag;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.MCheckInputLevelsStep;
import org.onceforall.dms.desktop.logic.MConvertToMP3Step;
import org.onceforall.dms.desktop.logic.MCreateDirectoryStep;
import org.onceforall.dms.desktop.logic.MEmailEventLogStep;
import org.onceforall.dms.desktop.logic.MMp3;
import org.onceforall.dms.desktop.logic.MPublishMp3sStep;
import org.onceforall.dms.desktop.logic.MPublishNewMp3Step;
import org.onceforall.dms.desktop.logic.MRecordStep;
import org.onceforall.dms.desktop.logic.MScript;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.DurationType;
import org.onceforall.dms.desktop.logic.types.MMp3StateType;
import org.onceforall.dms.desktop.logic.types.Type;
import org.testng.annotations.BeforeClass;
import org.tritonus.share.sampled.file.TAudioFileFormat;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Tests the business layer and the data layer.
 *
 * @author Marc
 */
public class LogicLayerTest extends org.onceforall.dms.desktop.tests.Test {
	/** Specifies the podcast date format. */
	protected static final SimpleDateFormat PODCAST_DATE_FORMAT = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

	/** Specifies the managed script to be tested. */
	protected MScript mScript;

	/** Specifies a step counter that is increased after every step execution attempt. It makes it possible to use relative step references. */
	protected int currentStepIndex = 0;
	
	/** Specifies a date formatter. */
	protected static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd MMM yyyy");
	
	/** Specifies a date/time formatter. */
	protected static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("dd-mmm-yyyy HH:mm:ss");
	
	/** Specifies the podcast date/time formatter. */
	protected static final SimpleDateFormat PODCAST_DATE_TIME_FORMAT = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

	/**
	 * @see org.onceforall.dms.desktop.tests.Test#executeMStep(org.onceforall.dms.desktop.logic.MStep,
	 *      boolean)
	 */
	@Override
	protected void executeMStep(MStep mStep, boolean waitForCompletion) {
		executeMStep(mStep, waitForCompletion, false);
	}

	/**
	 * @see org.onceforall.dms.desktop.tests.Test#executeMStep(org.onceforall.dms.desktop.logic.MStep, boolean, boolean)
	 */
	@Override
	protected void executeMStep(MStep mStep, boolean waitForCompletion, boolean ignoreWarnings) {
		++currentStepIndex;
		activateMElement(mStep);
		super.executeMStep(mStep, waitForCompletion, ignoreWarnings);
	}

	/**
	 * Sets the managed properties of the managed application.
	 */
	@BeforeClass
	public void setMApplicationProperties() {
		// Sets the default locale so that test execution does not vary depending on the host's locale settings.
		Locale.setDefault(Locale.UK);

		/*mDmsApplication.getMFtpServerUrlProperty().setValueForUI(TestData.LogicLayerTest_FtpServerUrlProperty);
		mDmsApplication.getMFtpUserNameProperty().setValueForUI(TestData.LogicLayerTest_FtpUserNameProperty);
		mDmsApplication.getMFtpUserPasswordProperty().setValueForUI(Type.PASSWORD_TYPE.decryptPassword(TestData.LogicLayerTest_FtpPasswordProperty));
		mDmsApplication.getMWebServerUrlProperty().setValueForUI(TestData.LogicLayerTest_WebServerUrlProperty);*/
	}

	/**
	 * Tests the managed create directory step.
	 * 
	 * @param mStep Specifies the managed step to be tested.
	 * @param directoryNameParameter Specifies the name of the directory to be created.
	 */
	protected void testMCreateDirectoryStep(MCreateDirectoryStep mStep, String directoryNameParameter) {
		// Checks that the parameters are correct.
		assertTrue(mDmsApplication.getServiceFilePathProperty().equals(mStep.getParentDirectoryParameter()));
		assertTrue((directoryNameParameter).equals(mStep.getDirectoryNameParameter().getPath()));
		
		// Deletes the directory to created (if it exists).
		File serviceFileDirectory = new File(mStep.getParentDirectoryParameter().getPath()+"\\"+mStep.getDirectoryNameParameter().getPath()); //$NON-NLS-1$
		assertTrue(deleteAllFiles(serviceFileDirectory));
		
		// Executes the step.
		executeMStep(mStep, true);
		
		// Checks that the results are correct.
		assertTrue(mStep.getDirectoryResult().getPath().equals(mStep.getParentDirectoryParameter().getPath()+"\\"+mStep.getDirectoryNameParameter().getPath())); //$NON-NLS-1$
		assertTrue(mStep.getDirectoryResult().exists());
	}
	
	/**
	 * Tests the managed check input levels step.
	 * 
	 * @param mStep Specifies the managed step to be tested.
	 */
	protected void testMCheckInputLevelsStep(MCheckInputLevelsStep mStep) {	
		// Plays back test file so that input levels are stimulated.
		startPlayAudioFile(new File(TestData.LogicLayerNormalServiceTest_PostSermonAudioFile));
		
		// Executes the step.
		executeMStep(mStep, true);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}

		// Checks input levels.
		if(TestData.Test_CheckRecordingLevels.toLowerCase().equals(Boolean.TRUE.toString()))
			assertTrue(mStep.getLeftInputLevelProperty() > 5 && mStep.getRightInputLevelProperty() > 5);
		
		// Stops the audio file playback.
		stopPlayAudioFile();
	}
	
	/**
	 * Tests the given managed record step.
	 * 
	 * @param mStep Specifies the managed record step to be tested.
	 * @param recordingFileParameter Specifies the recording file that the managed step should record to.
	 * @param playbackFile Specifies the file that will be played back while the step records.
	 * @throws IOException Thrown if the recorded file or file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	protected void testMRecordStep(MRecordStep mStep, File recordingFileParameter, File playbackFile) throws UnsupportedAudioFileException, IOException {		
		MCreateDirectoryStep mCreateDirectoryStep = (MCreateDirectoryStep) mScript.getMSteps().get(2);

		long expectedLength = Long.parseLong(TestData.LogicLayerTest_ExpectedRecordingLength);	// Specifies the expected recording length in millisonds.
		long tolerance = Long.parseLong(TestData.LogicLayerTest_RecordingTolerance);			// Specifies the recording length tolerance in millisonds.
		
		// Checks that the parameters are correct.
		assertTrue(mCreateDirectoryStep.getDirectoryResult().equals(mStep.getDirectoryParameter()));
		
		// Deletes the recording file (if it exists).
		mStep.setRecordingFileParameter(recordingFileParameter);
		File recordingFile = new File(mStep.getDirectoryParameter().getPath()+File.separator+mStep.getRecordingFileParameter().getPath()); //$NON-NLS-1$
		assertTrue(!recordingFile.exists() || recordingFile.delete());
		
		// Plays back test file so that input levels are stimulated.
		startPlayAudioFile(playbackFile);
		sleep(200);
		
		// Starts the step.
		executeMStep(mStep, false);
		
		// Waits while the step is recording.
		sleep(expectedLength);
		
		// Stops the step.
		stopMStep(mStep);
		
		// Stops the audio file playback.
		stopPlayAudioFile();
		
		// Checks that the results are correct.
		assertTrue(mStep.getRecordingFileResult().getPath().equals(mStep.getDirectoryParameter().getPath()+File.separator+mStep.getRecordingFileParameter().getPath()));
		assertTrue(mStep.getRecordingFileResult().exists());
		assertTrue(mStep.getRecordingFileSizeResult() == mStep.getRecordingFileResult().length());
		AudioFileFormat format = AudioSystem.getAudioFileFormat(mStep.getRecordingFileResult());
		long bytesPreMillisecond = (long) format.getFormat().getFrameRate()*format.getFormat().getFrameSize()/1000;
		assertTrue("The recording file size is "+mStep.getRecordingFileSizeResult()+" bytes but is should be between "+(expectedLength-tolerance)*bytesPreMillisecond+" and "+(expectedLength+tolerance)*bytesPreMillisecond+".", mStep.getRecordingFileSizeResult() > (expectedLength-tolerance)*bytesPreMillisecond && mStep.getRecordingFileSizeResult() < (expectedLength+tolerance)*bytesPreMillisecond); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		assertTrue(mStep.getRecordingLengthResult() > expectedLength-tolerance && mStep.getRecordingLengthResult() < expectedLength+tolerance);
		
		// Checks the recorded file in not silent.
		assertTrue(!isAudioFileSilent(AudioSystem.getAudioInputStream(mStep.getRecordingFileResult())));
	}
	
	/**
	 * Tests the given managed convert to MP3 step.
	 * 
	 * @param mStep Specifies the managed step to be tested.
	 * @param artistParameter Specifies the value of the artist parameter of the managed step.
	 * @param titleParameter Specifies the value of the title parameter of the managed step.
	 * @param albumParameter Specifies the value of the album parameter of the managed step.
	 * @param yearParameter Specifies the value of the year parameter of the managed step.
	 * @param directoryParameter Specifies the value of the directory parameter of the managed step.
	 * @param mp3FileName Specifies the value of the MP3 file name parameter of the managed step.
	 * @param recordingFile Specifies the value of the recording file parameter of the managed step.
	 * @throws IOException Thrown if the recorded file or file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	protected void testMConvertToMP3Step(MConvertToMP3Step mStep, String artistParameter, String titleParameter, String albumParameter, String yearParameter,
			File directoryParameter, String mp3FileName, File recordingFile) throws UnsupportedAudioFileException, IOException {		
		// Checks that the parameters are correct.
		assertTrue(artistParameter.equals(mStep.getArtistParameter()));
		assertTrue(titleParameter.equals(mStep.getTitleParameter()));
		assertTrue(albumParameter.equals(mStep.getAlbumParameter()));
		assertTrue(yearParameter.equals(mStep.getYearParameter()));
		assertTrue(directoryParameter.equals(mStep.getDirectoryParameter()));
		assertTrue(mp3FileName.equals(mStep.getMp3FileNameParameter().getPath()));
		assertTrue(recordingFile.equals(mStep.getRecordingFileParameter()));
		assertTrue(mDmsApplication.getMp3EncoderPathProperty().equals(mStep.getMp3EncoderPathParameter()));
		
		// Deletes previous test products.
		/*?MMp3 mMp3ToDelete = null;
		for(MMp3 mMp3: (List<MMp3>) mStep.getMp3FolderReferenceParameter().getMMp3s())
			if(mMp3.getNameForUI().equals(mStep.getMMp3EntryNameParameter().getValueForUI())) {
				mMp3ToDelete = mMp3;
				break;
			}
		
		if(mMp3ToDelete != null)
			mStep.getMp3FolderReferenceParameter().getMMp3s().remove(mMp3ToDelete);*/
		
		Iterator<MMp3> iterator = ((List<MMp3>) mStep.getMp3FolderReferenceParameter().getMMp3s()).iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();			
		}		
		
		// Executes the step.
		executeMStep(mStep, true);
		
		// Checks that the results are correct.
		assertTrue(mStep.getMp3EntryNameParameter().equals(mStep.getMp3EntryReferenceResult().getName()));
		String mp3FilePath = mStep.getDirectoryParameter().getPath()+File.separator+mStep.getMp3FileNameParameter();
		File mp3File = new File(mp3FilePath);
		assertTrue(mp3FilePath.equals(mStep.getMp3EntryReferenceResult().getFileProperty().getPath()));
		assertTrue(mp3File.exists());
		assertTrue(!isAudioFileSilent(AudioSystem.getAudioInputStream(mp3File)));
		
		// Checks MP3 ID3 tags.
		 AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(mp3File);
		 if (baseFileFormat instanceof TAudioFileFormat) {
		     Map<String, Object> properties = ((TAudioFileFormat)baseFileFormat).properties();
		     assertTrue(mStep.getAlbumParameter().equals(properties.get("album"))); //$NON-NLS-1$
		     assertTrue(mStep.getYearParameter().equals(properties.get("date"))); //$NON-NLS-1$
		     assertTrue(mStep.getArtistParameter().equals(properties.get("author"))); //$NON-NLS-1$
		     assertTrue(mStep.getTitleParameter().equals(properties.get("title"))); //$NON-NLS-1$
		 }
		 
		// Checks the MP3 entry.
		final MMp3 mp3Entry = mStep.getMp3EntryReferenceResult();
		assertTrue(MMp3StateType.NOT_PUBLISHED_STATE.equals(mp3Entry.getStateProperty()));
		assertTrue(mStep.getMp3EntryNameParameter().equals(mp3Entry.getName()));
		assertTrue(mStep.getMp3FileNameParameter().getPath().equals(mp3Entry.getFileProperty().getName()));		
		assertTrue(mp3Entry.getLinkTextProperty() == null);
		assertTrue(mp3Entry.getLinkDescriptionProperty()== null);
		assertTrue(mp3Entry.getCommentProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastTitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSubtitleProperty() == null);
		assertTrue(mp3Entry.getPodcastSummaryProperty() == null);
		assertTrue(mp3Entry.getPodcastPublishingDateProperty() == null);
	}
	
	/**
	 * Tests the managed publish MP3 step.
	 * 
	 * @throws Exception Thrown if an error occurs.
	 */
	protected void testMPublishMP3Step(final MPublishNewMp3Step mStep, String contentPageRelativeFtpPathParameter, String contentHeaderFilePathParameter, 
		String contentFooterFilePathParameter, String contentFilePathParameter, String podcastRelativeFtpPathParameter, String podcastHeaderFilePathParameter, 
		String podcastFilePathParameter,
		String mp3RelativeFtpPathParameter, String maximumDiskSpaceParameter, String mp3EntryParameter, String linkTextParameter, String linkDescriptionParameter, String commentParameter,
		String podcastTitleParameter, String podcastSubtitleParameter, String podcastSummaryParameter, 
		String podcastPublicationDateParameter) throws Exception {
		
		// Sets the parameters.
		mStep.getMContentPageRelativeFtpPathParameter().setValueForUI(contentPageRelativeFtpPathParameter);
		mStep.getMContentHeaderFilePathParameter().setValueForUI(contentHeaderFilePathParameter);
		mStep.getMContentFooterFilePathParameter().setValueForUI(contentFooterFilePathParameter);
		mStep.getMContentPageFilePathParameter().setValueForUI(contentFilePathParameter);
		mStep.getMPodcastRelativeFtpPathParameter().setValueForUI(podcastRelativeFtpPathParameter);
		mStep.getMPodcastHeaderFilePathParameter().setValueForUI(podcastHeaderFilePathParameter);
		mStep.getMPodcastFilePathParameter().setValueForUI(podcastFilePathParameter);
		mStep.getMMp3RelativeFtpPathParameter().setValueForUI(mp3RelativeFtpPathParameter);
		mStep.getMCommentParameter().setValueForUI(commentParameter);
		mStep.getMMaxiumumDiskSpaceParameter().setValueForUI(maximumDiskSpaceParameter);
		
		// Checks that the parameters are correct.
		final MMp3 mp3Entry = mStep.getMp3EntryReferenceParameter();
		assertTrue(mp3EntryParameter.equals(mp3Entry.getPathForUI()));
		assertTrue(linkTextParameter.equals(mStep.getMLinkTextParameter().getValueForUI()));
		assertTrue(linkDescriptionParameter.equals(mStep.getMLinkDescriptionParameter().getValueForUI()));
		assertTrue(mDmsApplication.getFtpServerUrlProperty().equals(mStep.getFtpServerUrlParameter()));
		assertTrue(mDmsApplication.getFtpUserNameProperty().equals(mStep.getFtpUserNameParameter()));
		assertTrue(mDmsApplication.getFtpUserPasswordProperty().equals(mStep.getFtpUserPasswordParameter()));
		assertTrue(mDmsApplication.getWebServerUrlProperty().equals(mStep.getWebServerUrlParameter()));
		assertTrue(podcastTitleParameter.equals(mStep.getMPodcastTitleParameter().getValueForUI()));
		assertTrue(podcastSubtitleParameter.equals(mStep.getMPodcastSubtitleParameter().getValueForUI()));
		assertTrue(podcastSummaryParameter.equals(mStep.getMPodcastSummaryParameter().getValueForUI()));
		Date now = PODCAST_DATE_TIME_FORMAT.parse(podcastPublicationDateParameter);
		Date earlier = new Date();
		earlier.setTime(now.getTime()-10*60*1000);
		assertTrue(mStep.getPodcastPublishingDateParameter().before(now) && mStep.getPodcastPublishingDateParameter().after(earlier));
		
		// Deletes previous test products.
		assertTrue(!mStep.getContentPageFilePathParameter().exists() || mStep.getContentPageFilePathParameter().delete());
		assertTrue(!mStep.getPodcastFilePathParameter().exists() || mStep.getPodcastFilePathParameter().delete());

		clearMPublishMp3StepProducts(mStep);
		
		// Executes the step.
		executeMStep(mStep, true);
		
		// Checks the MP3 entry.
		assertTrue(MMp3StateType.PUBLISHED_STATE.equals(mp3Entry.getStateProperty()));
		assertTrue(mStep.getLinkTextParameter().equals(mp3Entry.getLinkTextProperty()));
		assertTrue(mStep.getLinkDescriptionParameter().equals(mp3Entry.getLinkDescriptionProperty()));
		assertTrue(mStep.getCommentParameter().equals(mp3Entry.getCommentProperty()));
		assertTrue(mStep.getLinkTextParameter().equals(mp3Entry.getPodcastTitleProperty()));
		assertTrue(mStep.getPodcastTitleParameter().equals(mp3Entry.getPodcastTitleProperty()));
		assertTrue(mStep.getPodcastSubtitleParameter().equals(mp3Entry.getPodcastSubtitleProperty()));
		assertTrue(mStep.getPodcastSummaryParameter().equals(mp3Entry.getPodcastSummaryProperty()));
		assertTrue(mStep.getPodcastPublishingDateParameter().equals(mp3Entry.getPodcastPublishingDateProperty()));
		
		// Checks the podcast file.
        URL webServerUrl = mStep.getWebServerUrlParameter();
        URL podcastUrl = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mStep.getPodcastFilePathParameter().getName()); //$NON-NLS-1$
        URL contentPageUrl = new URL(webServerUrl.toExternalForm()+mStep.getContentPageRelativeFtpPathParameter()+"/"+mStep.getContentPageFilePathParameter().getName()); //$NON-NLS-1$
        URL mp3Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mp3Entry.getFileProperty().getName()); //$NON-NLS-1$
        
		System.out.print("Checking podcast file on web server ..."); //$NON-NLS-1$
		Thread.sleep(1000);
		String podcast = getHttpFile(podcastUrl);
		String podcastHeader = getStringFromInputStream(new FileInputStream(mStep.getPodcastHeaderFilePathParameter()));
		assertTrue(podcast.startsWith(podcastHeader));
		testPodcastMp3Exists(podcast, mStep, mp3Entry, true);
		System.out.println(" completed.");	 //$NON-NLS-1$			
	
	    // Parses the XML and creates a DOM tree from the podcast to check it is in valid XML format.
	    DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	    try {
		    parser.parse(new InputSource(new StringReader(podcast)));
    	} catch(SAXException exception) {
    		assertTrue(exception.getMessage(), false);
    	}	    
    	
    	// TODO: Test podcast.

	    /*?
	    // Creates a schema factory capable of understanding XML Schemas.
	    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	    // Loads the schema.
	    Source schemaFile = new StreamSource(new File("Test Files\\rss-2.0.xsd"));
	    Schema schema = factory.newSchema(schemaFile);

	    // Validates the DOM tree.
	    Validator validator = schema.newValidator();
	    try {
	    	validator.validate(new DOMSource(document));
    	} catch(SAXException exception) {
    		assertTrue(exception.getMessage(), false);
    	}*/	    
	    
    	// Checks the HTML page on the Web server.
		System.out.print("Checking content page on Web server ..."); //$NON-NLS-1$
		String contentPage = getHttpFile(contentPageUrl);
		assertTrue(contentPage.indexOf("href=\""+mp3Url.toExternalForm()+"\">"+Utilities.encodeForHtml(mStep.getLinkTextParameter())+"</a>") >= 0); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		assertTrue(contentPage.indexOf(mStep.getLinkDescriptionParameter()) >= 0);
		assertTrue(contentPage.indexOf(mStep.getCommentParameter()) >= 0);
		System.out.println(" completed.");	 //$NON-NLS-1$		
		
		// Checks the HTML page on the FTP server.
		System.out.print("Checking content page on FTP server ..."); //$NON-NLS-1$
		performFtpClientOperation(mStep.getFtpServerUrlParameter(), mStep.getFtpUserNameParameter(), Type.PASSWORD_TYPE.decryptPassword(mStep.getFtpUserPasswordParameter()), new FtpClientOperation() {
			public Object perform(FTPClient ftpClient) throws Exception {
	            assertTrue(ftpClient.changeWorkingDirectory(mStep.getFtpServerUrlParameter().getPath()+mStep.getContentPageRelativeFtpPathParameter()));
	            
            	String ftpContentPage = getStringFromInputStream(ftpClient.retrieveFileStream(mStep.getContentPageFilePathParameter().getName()));
            	String localContentPage = getStringFromInputStream(new FileInputStream(mStep.getContentPageFilePathParameter()));
            	String contentPageHeader = getStringFromInputStream(new FileInputStream(mStep.getContentHeaderFilePathParameter()));
            	String contentPageFooter = getStringFromInputStream(new FileInputStream(mStep.getContentFooterFilePathParameter()));
            	
            	assertTrue(ftpContentPage.equals(localContentPage));
        		assertTrue(ftpContentPage.startsWith(contentPageHeader));
        		assertTrue(ftpContentPage.endsWith(contentPageFooter));
	            	
				return null;
			}});
		System.out.println(" completed.");	 //$NON-NLS-1$		
		
		// Checks the MP3 file.
		System.out.print("Checking MP3 file on web server ...");		 //$NON-NLS-1$
		assertTrue((Boolean) performHttpInputStreamOperation(mp3Url, new HttpInputStreamOperation() {
			public Object perform(InputStream inputStream) throws Exception {
				return !isAudioFileSilent(AudioSystem.getAudioInputStream(inputStream));
			}}));
		System.out.println(" completed.");	 //$NON-NLS-1$
        
		System.out.print("Checking MP3 file on FTP server ..."); //$NON-NLS-1$
		performFtpClientOperation(mStep.getFtpServerUrlParameter(), mStep.getFtpUserNameParameter(), Type.PASSWORD_TYPE.decryptPassword(mStep.getFtpUserPasswordParameter()), new FtpClientOperation() {
			public Object perform(FTPClient ftpClient) throws Exception {
	            String mp3FTPPath = mStep.getFtpServerUrlParameter().getPath()+mStep.getMp3RelativeFtpPathParameter();
	            if(ftpClient.changeWorkingDirectory(mp3FTPPath)) {
	            	FTPFile files[] = ftpClient.listFiles(mStep.getMp3EntryReferenceParameter().getPublishedFileNameProperty());
	            	assertTrue(files.length > 0);
	            	assertTrue(files[0].getSize() == mStep.getMp3EntryReferenceParameter().getFileProperty().length());
	            }
	            
				return null;
			}});
		System.out.println(" completed.");	 //$NON-NLS-1$
	}
	
	/**
	 * Removes all files that could have been produced by executing the given step.
	 * 
	 * @param mStep Specifies the managed step whose possible execution products are to be removed.
	 * @throws Exception Thrown if an error occurs.
	 */
	protected void clearMPublishMp3StepProducts(final MPublishMp3sStep mStep) throws Exception {
		if(mStep.getContentPageFilePathParameter().exists())
			assertTrue(mStep.getContentPageFilePathParameter().delete());
		
		if(mStep.getPodcastFilePathParameter().exists())
			assertTrue(mStep.getPodcastFilePathParameter().delete());
		
		System.out.print("Deleting old test files on FTP server ..."); //$NON-NLS-1$
		performFtpClientOperation(mStep.getFtpServerUrlParameter(), mStep.getFtpUserNameParameter(), Type.PASSWORD_TYPE.decryptPassword(mStep.getFtpUserPasswordParameter()), new FtpClientOperation() {
			public Object perform(FTPClient ftpClient) throws Exception {
	            // Deletes the files in the MP3 folder.
				String ftpPath = mStep.getFtpServerUrlParameter().getPath()+mStep.getMp3RelativeFtpPathParameter();
	            if(ftpClient.changeWorkingDirectory(ftpPath)) {
	            	FTPFile[] ftpFiles = ftpClient.listFiles();
	            	for(FTPFile ftpFile: ftpFiles)
	            		ftpClient.deleteFile(ftpFile.getName());
	            }
	            
	            // Deletes the files in the content page folder.
	            ftpPath = mStep.getFtpServerUrlParameter().getPath()+mStep.getContentPageRelativeFtpPathParameter();
	            if(ftpClient.changeWorkingDirectory(ftpPath)) {
	            	FTPFile[] ftpFiles = ftpClient.listFiles();
	            	for(FTPFile ftpFile: ftpFiles)
	            		ftpClient.deleteFile(ftpFile.getName());
	            }
	            
	            // Deletes the files in the podcast folder.
	            ftpPath = mStep.getFtpServerUrlParameter().getPath()+mStep.getPodcastRelativeFtpPathParameter();
	            if(ftpClient.changeWorkingDirectory(ftpPath)) {
	            	FTPFile[] ftpFiles = ftpClient.listFiles();
	            	for(FTPFile ftpFile: ftpFiles)
	            		ftpClient.deleteFile(ftpFile.getName());
	            }
	            
				return null;
			}});
		System.out.println(" completed."); //$NON-NLS-1$
	}
	
	/**
	 * Tests the managed email log step.
	 * 
	 * @param mStep Specifies the managed step to be tested.
	 * @param recordingUserParameter Specifies the value of the recording user parameter that this managed step should have.
	 * @param subjectParameter Specifies the value of the subject parameter that this managed step should have.
	 * @throws Exception Thrown when an error occurs.
	 */
	protected void testMEmailEventLogStep(final MEmailEventLogStep mStep, String recordingUserParameter, String subjectParameter) throws Exception {
		Logger.getLogger().severe("It's monday morning!!"); //$NON-NLS-1$
		
		// Deletes all messages from the inbox.
		System.out.print("Deleting all message from the inbox of "+TestData.LogicLayerTest_Pop3UserName+" ..."); //$NON-NLS-1$ //$NON-NLS-2$
		performPop3Operation(TestData.LogicLayerTest_Pop3ServerAddress, TestData.LogicLayerTest_Pop3UserName, TestData.LogicLayerTest_Pop3Password, new Pop3Operation() {
			public Object perform(Folder folder) throws Exception {
				for(Message message: folder.getMessages())
					message.setFlag(Flag.DELETED, true);
				
				return null;
			}	
		});
		System.out.println(" completed."); //$NON-NLS-1$
		
		// Sets the parameters.
		mStep.getMSendersEmailAddressParameter().setValueForUI(TestData.LogicLayerTest_SendersEmailAddressParameter);
		mStep.getMReceipientsEmailAddressParameter().setValueForUI(TestData.LogicLayerTest_ReceipientsEmailAddressParameter);
		mStep.getMCommentParameter().setValueForUI(TestData.LogicLayerTest_EmailCommentParameter);
		
		// Checks that the parameters are correct.
		assertTrue(recordingUserParameter.equals(mStep.getMRecordingUsersNameParameter().getValueForUI()));
		assertTrue(mDmsApplication.getLogFileProperty().equals(mStep.getLogFileParameter()));
		assertTrue(mDmsApplication.getDataFileProperty().equals(mStep.getDataFileParameter()));
		assertTrue(subjectParameter.equals(mStep.getMSubjectParameter().getValueForUI())); //$NON-NLS-1$ //$NON-NLS-2$
		assertTrue(mDmsApplication.getSmtpServerProperty().equals(mStep.getSmtpServerParameter()));
		assertTrue(mDmsApplication.getSmtpUserNameProperty().equals(mStep.getSmtpUserNameParameter()));
		assertTrue(mDmsApplication.getSmtpPasswordProperty().equals(mStep.getSmtpPasswordParameter()));
		
		// Checks warnings.
		try {
			executeMStep(mStep, true, false);
			assertTrue(false);
		}
		catch(DesktopException exception) {
			assertTrue(exception.getSeverity() == DesktopException.WARNING_SEVERITY);
			assertTrue(exception.getMessage().indexOf("your own email address") >= 0);
		}
		
		// Starts the step.
		executeMStep(mStep, true, true);
		
		sleep(5000);
		
		// Checks the email message.
		System.out.print("Checking event log email ..."); //$NON-NLS-1$
		performPop3Operation(TestData.LogicLayerTest_Pop3ServerAddress, TestData.LogicLayerTest_Pop3UserName, TestData.LogicLayerTest_Pop3Password, new Pop3Operation() {
			public Object perform(Folder folder) throws Exception {
				// Checks the messages.
				Message message = null;
				String messageText = null;
				InputStream dataFileStream = null;
				InputStream logFileStream = null;
				Message[] messages = folder.getMessages();
				for(Message currentMessage: messages) {
					if(currentMessage.getSubject().equals(mStep.getSubjectParameter())) {
						message = currentMessage;
						assertTrue(currentMessage.getFrom()[0].toString().equals(TestData.LogicLayerTest_SendersEmailAddressParameter));
						Multipart multiPart = (Multipart) currentMessage.getContent();
						for(int index = 0; index < multiPart.getCount(); ++index) {
							BodyPart bodyPart = multiPart.getBodyPart(index);
							if(bodyPart.getDisposition() == null) {
								messageText = (String) bodyPart.getContent();
							}
							else {
								String fileName = bodyPart.getFileName();
								if(mStep.getLogFileParameter().getName().equals(fileName))
									logFileStream = bodyPart.getInputStream();
								else if(TestData.LogicLayerTest_ApplicationDataZipFileName.equals(fileName))
									dataFileStream = bodyPart.getInputStream();
							}
						}
						
						// Checks the message.
						assertTrue(message != null);
						assertTrue(message.getHeader("X-Priority")[0].equals("1")); //$NON-NLS-1$ //$NON-NLS-2$
						assertTrue(message.getHeader("X-MSMail-Priority")[0].equals("High")); //$NON-NLS-1$ //$NON-NLS-2$
						assertTrue(message.getHeader("Importance")[0].equals("High"));                 //$NON-NLS-1$ //$NON-NLS-2$
						
						// Checks the message text.
						assertTrue(messageText.indexOf(mStep.getRecordingUsersNameParameter()) >= 0);
						assertTrue(messageText.indexOf(mStep.getCommentParameter()) >= 0);
						
						// Checks the log file.
						assertTrue(logFileStream != null);
						String localLogFileContent = getStringFromInputStream(new FileInputStream(mStep.getLogFileParameter()));
						String emailLogFileContent = getStringFromInputStream(logFileStream);
						assertTrue(emailLogFileContent.indexOf(localLogFileContent) >= 0);
						
						// Checks the data file.
						assertTrue(dataFileStream != null);
						ZipInputStream unzippedStream = new ZipInputStream(dataFileStream);
						unzippedStream.getNextEntry();
						String localDataFileContent = getStringFromInputStream(new FileInputStream(mStep.getDataFileParameter()));
						String emailDataFileContent = getStringFromInputStream(unzippedStream, false);
						assertTrue(localDataFileContent.equals(emailDataFileContent));	

						// Checks the file system information file.
						ZipEntry entry = unzippedStream.getNextEntry();
						assertTrue(entry.getName().equals("File system information.txt"));
						String emailFileInfoContent = getStringFromInputStream(unzippedStream, true);
						assertTrue(emailFileInfoContent.indexOf(mStep.getMApplication().getPathProperty().getAbsolutePath()) >= 0);	
					}
				}
				
				return null;
			}});
		System.out.println(" completed."); //$NON-NLS-1$
	}
	
	/**
	 * Tests whether the given managed MP3 is published correctly in the given podcast.
	 * 
	 * @param podcast Specifies the podcast file as a string.
	 * @param mStep Specifies the managed publish MP3 step that was used to update the podcast.
	 * @param mMp3 Specifies the managed MP3 that be published correctly in the given podcast.
	 * @param testExistence Specificies whether to test for existence or non-existences.
	 * @throws IOException Thrown if the MP3 file cannot be read.
	 * @throws UnsupportedAudioFileException Thrown if the duration cannot be read from the MP3 file.
	 */
	protected void testPodcastMp3Exists(String podcast, MPublishMp3sStep mStep, MMp3 mMp3, boolean testExistence) throws UnsupportedAudioFileException, IOException {
		URL webServerUrl = mStep.getWebServerUrlParameter();
        URL mMp3Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mMp3.getPublishedFileNameProperty()); //$NON-NLS-1$

        // Gets the duration of the MP3 file.
		AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(mMp3.getFileProperty());
		Long duration = (Long) ((TAudioFileFormat) baseFileFormat).properties().get("duration");					            
        String podcastDuration = DurationType.FORMATTER.format(new Date(duration/1000));

        assertTrue(!testExistence ^ podcast.indexOf("<title>"+Utilities.encodeForXml(mMp3.getMPodcastTitleProperty().getValueForUI())+"</title>") >= 0);
		if(testExistence) {        
	        assertTrue(podcast.indexOf("<link>"+webServerUrl.toExternalForm()+mStep.getMContentPageRelativeFtpPathParameter().getValueForUI()+"/"+mStep.getContentPageFilePathParameter().getName()+"</link>") >= 0);
			assertTrue(podcast.indexOf("<guid>"+mMp3Url.toExternalForm()+"</guid>") >= 0);
			assertTrue(podcast.indexOf("<enclosure url=\""+mMp3Url.toExternalForm()+"\" length=\""+mMp3.getFileProperty().length()+"\" type=\"audio/mpeg\"/>") >= 0);
			assertTrue(podcast.indexOf("<pubDate>"+Utilities.encodeForXml(PODCAST_DATE_FORMAT.format(mMp3.getPodcastPublishingDateProperty()))+"</pubDate>") >= 0);
			assertTrue(podcast.indexOf("<itunes:subtitle>"+Utilities.encodeForXml(mMp3.getMPodcastSubtitleProperty().getValueForUI())+"</itunes:subtitle>") >= 0);
			assertTrue(podcast.indexOf("<itunes:summary>"+Utilities.encodeForXml(mMp3.getMPodcastSummaryProperty().getValueForUI())+"</itunes:summary>") >= 0);
			assertTrue(podcast.indexOf("<itunes:duration>"+Utilities.encodeForXml(podcastDuration)+"</itunes:duration>") >= 0);		

		}
	}
}
