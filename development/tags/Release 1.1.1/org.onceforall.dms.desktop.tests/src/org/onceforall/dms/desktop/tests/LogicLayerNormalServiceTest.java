/**
 * Revision History:
 * $Log: LogicLayerNormalServiceTest.java,v $
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
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logic.MBurnCdStep;
import org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep;
import org.onceforall.dms.desktop.logic.MCheckInputLevelsStep;
import org.onceforall.dms.desktop.logic.MConvertToMP3Step;
import org.onceforall.dms.desktop.logic.MCreateDirectoryStep;
import org.onceforall.dms.desktop.logic.MEmailEventLogStep;
import org.onceforall.dms.desktop.logic.MEnterServiceInformationStep;
import org.onceforall.dms.desktop.logic.MPublishNewMp3Step;
import org.onceforall.dms.desktop.logic.MRecordStep;
import org.onceforall.dms.desktop.logic.MScript;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests the 'Normal service' managed script. Tests requirements R 1.
 *
 * @author Marc
 */
public class LogicLayerNormalServiceTest extends LogicLayerTest {
	/**
	 * Selects the managed script.
	 */
	@BeforeClass
	public void selectMScript() {
		mScript = (MScript) mDmsApplication.getMScripts().get(0);
	}
	
	/**
	 * Tests requirement R 1.1.
	 * @throws ParseException Thrown if a managed date parameter cannot be parsed.
	 */
	@Test public void testMEnterServiceInformationStep() throws ParseException {
		MEnterServiceInformationStep mStep = (MEnterServiceInformationStep) mScript.getMSteps().get(0);

		// Sets the parametets.
		mStep.setServiceDateParameter(DATE_FORMAT.parse(TestData.LogicLayerNormalServiceTest_DateParameter));
		mStep.setServiceTypeParameter(TestData.LogicLayerNormalServiceTest_ServiceTypeParameter);
		mStep.setTitleOfTalkParameter(TestData.LogicLayerNormalServiceTest_TitleOfTalkParameter);
		mStep.setReadingParameter(TestData.LogicLayerNormalServiceTest_ReadingParameter);
		mStep.setSpeakersNameParameter(TestData.LogicLayerNormalServiceTest_SpeakersNameParameter);
		mStep.setRecordingUsersNameParameter(TestData.LogicLayerNormalServiceTest_RecordingUsersNameParameter);
		
		// Executes the step.
		executeMStep(mStep, true);
			
		// Checks that the results are correct.
		assertTrue(mStep.getServiceDateParameter().equals(mStep.getServiceDateResult()));
		assertTrue(mStep.getServiceTypeParameter().equals(mStep.getServiceTypeResult()));
		assertTrue(mStep.getTitleOfTalkParameter().equals(mStep.getTitleOfTalkResult()));
		assertTrue(mStep.getReadingParameter().equals(mStep.getReadingResult()));
		assertTrue(mStep.getSpeakersNameParameter().equals(mStep.getSpeakersNameResult()));
		assertTrue(mStep.getRecordingUsersNameParameter().equals(mStep.getRecordingUsersNameResult()));
	}
	
	/**
	 * Tests requirement R 1.3.
	 */
	@Test(dependsOnMethods = { "testMEnterServiceInformationStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCheckFreeDiskSpaceStep() {
		MCheckFreeDiskSpaceStep mStep = (MCheckFreeDiskSpaceStep) mScript.getMSteps().get(1);
		
		// Executes the step.
		executeMStep(mStep, true);
	}
	
	/**
	 * Tests requirement R 1.2.
	 */
	@Test(dependsOnMethods = { "testMCheckFreeDiskSpaceStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCreateServiceDirectoryStep() {
		MCreateDirectoryStep mStep = (MCreateDirectoryStep) mScript.getMSteps().get(2);
		MEnterServiceInformationStep mEnterServiceInformationStep = (MEnterServiceInformationStep) mScript.getMSteps().get(0);
		testMCreateDirectoryStep(mStep, mEnterServiceInformationStep.getMServiceTypeResult().getValueForUI()+" on "+mEnterServiceInformationStep.getMServiceDateResult().getValueForUI()); //$NON-NLS-1$
	}
	
	/**
	 * Tests requirement R 1.4.
	 */
	@Test(dependsOnMethods = { "testMCreateServiceDirectoryStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCheckInputLevelsStep() {
		MCheckInputLevelsStep mStep = (MCheckInputLevelsStep) mScript.getMSteps().get(3);
		testMCheckInputLevelsStep(mStep);
	}
	
	/**
	 * Tests requirement R 1.5.
	 * 
	 * @throws IOException Thrown if the recorded file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMCheckInputLevelsStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMRecordPreSermonStep() throws UnsupportedAudioFileException, IOException {
		testMRecordStep((MRecordStep) mScript.getMSteps().get(4), 
				new File(TestData.LogicLayerNormalServiceTest_PreSermonRecordingFileParameter), new File(TestData.LogicLayerNormalServiceTest_PreSermonAudioFile));
	}
	
	/**
	 * Tests requirement R 1.5.
	 * 
	 * @throws IOException Thrown if the recorded file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMRecordPreSermonStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMRecordSermonStep() throws UnsupportedAudioFileException, IOException {
		testMRecordStep((MRecordStep) mScript.getMSteps().get(5), 
				new File(TestData.LogicLayerNormalServiceTest_SermonRecordingFileParameter), new File(TestData.LogicLayerNormalServiceTest_SermonAudioFile));
	}
	
	/**
	 * Tests requirement R 1.5.
	 * 
	 * @throws IOException Thrown if the recorded file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMRecordSermonStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMRecordPostSermonStep() throws UnsupportedAudioFileException, IOException {
		testMRecordStep((MRecordStep) mScript.getMSteps().get(6), 
				new File(TestData.LogicLayerNormalServiceTest_PostSermonRecordingFileParameter), new File(TestData.LogicLayerNormalServiceTest_PostSermonAudioFile));
	}
	
	/**
	 * Tests requirement R 1.6.
	 */
	@Test(dependsOnMethods = { "testMRecordPostSermonStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMBurnCdStep() {
		MBurnCdStep mStep = (MBurnCdStep) mScript.getMSteps().get(7);
		MRecordStep mRecordPreSermonStep = (MRecordStep) mScript.getMSteps().get(4);
		MRecordStep mRecordSermonStep = (MRecordStep) mScript.getMSteps().get(5);
		MRecordStep mRecordPostSermonStep = (MRecordStep) mScript.getMSteps().get(6);
		
		// Checks that the parameters are correct.
		List<File> recordingFiles = mStep.getRecordingFilesParameter();
		assertTrue(mRecordPreSermonStep.getRecordingFileResult().equals(recordingFiles.get(0)));
		assertTrue(mRecordSermonStep.getRecordingFileResult().equals(recordingFiles.get(1)));
		assertTrue(mRecordPostSermonStep.getRecordingFileResult().equals(recordingFiles.get(2)));
		assertTrue(mStep.getTotalRecordingFileSizeParameter() == mRecordPreSermonStep.getRecordingFileSizeResult()+mRecordSermonStep.getRecordingFileSizeResult()+mRecordPostSermonStep.getRecordingFileSizeResult());
		assertTrue(mStep.getTotalRecordingLengthParameter() == mRecordPreSermonStep.getRecordingLengthResult()+mRecordSermonStep.getRecordingLengthResult()+mRecordPostSermonStep.getRecordingLengthResult());

		mStep.setSimulated(true);
		
		// Starts the step.
		executeMStep(mStep, true);
	}
	
	/**
	 * Tests requirement R 1.7.
	 * 
	 * @throws IOException Thrown if the recorded file or file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMBurnCdStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMConvertToMP3Step() throws UnsupportedAudioFileException, IOException {
		MConvertToMP3Step mStep = (MConvertToMP3Step) mScript.getMSteps().get(8);
		MEnterServiceInformationStep mEnterServiceInformationStep = (MEnterServiceInformationStep) mScript.getMSteps().get(0);
		MCreateDirectoryStep mCreateDirectoryStep = (MCreateDirectoryStep) mScript.getMSteps().get(2);
		MRecordStep mRecordSermonStep = (MRecordStep) mScript.getMSteps().get(5);
		
	    Calendar serviceDateCalendar = Calendar.getInstance();
	    serviceDateCalendar.setTime(mEnterServiceInformationStep.getServiceDateResult());
		testMConvertToMP3Step(mStep, mEnterServiceInformationStep.getSpeakersNameResult(),
				mEnterServiceInformationStep.getMTitleOfTalkResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMReadingResult().getValueForUI()+" on "+mEnterServiceInformationStep.getMServiceDateResult().getValueForUI(),  //$NON-NLS-1$ //$NON-NLS-2$
				mEnterServiceInformationStep.getServiceTypeResult(),
				""+serviceDateCalendar.get(Calendar.YEAR), mCreateDirectoryStep.getDirectoryResult(), Utilities.convertToFileName(mEnterServiceInformationStep.getTitleOfTalkResult()+" - "+mEnterServiceInformationStep.getReadingResult())+".mp3", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				mRecordSermonStep.getRecordingFileResult());
	}
	
	/**
	 * Tests requirement R 1.8. This test requires a separate FTP directory. WARNING: All files in the FTP directory will be deleted before the 
	 * step it executed.
	 * 
	 * @throws Exception Thrown if an error occurs.
	 */
	@Test(dependsOnMethods = { "testMConvertToMP3Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMPublishMP3Step() throws Exception {
		final MPublishNewMp3Step mStep = (MPublishNewMp3Step) mScript.getMSteps().get(9);
		final MConvertToMP3Step mConvertToMP3Step = (MConvertToMP3Step) mScript.getMSteps().get(8); 
		final MEnterServiceInformationStep mEnterServiceInformationStep = (MEnterServiceInformationStep) mScript.getMSteps().get(0);
		
		testMPublishMP3Step(mStep, 
				TestData.LogicLayerNormalServiceTest_ContentPageRelativeFtpPathParameter,
				TestData.LogicLayerNormalServiceTest_ConentHeaderFilePathParameter, 
				TestData.LogicLayerNormalServiceTest_ContentFooterFilePathParameter,
				TestData.LogicLayerNormalServiceTest_ContentPageFilePathParameter,
				TestData.LogicLayerNormalServiceTest_PodcastRelativeFtpPathParameter,
				TestData.LogicLayerNormalServiceTest_PodcastHeaderFilePathParameter, 
				TestData.LogicLayerNormalServiceTest_PodcastFilePathParameter,
				TestData.LogicLayerNormalServiceTest_Mp3RelativeFtpPathParameter,
				new Long((mConvertToMP3Step.getMp3EntryReferenceResult().getFileProperty().length()/1024)+1).toString(),
				mConvertToMP3Step.getMp3EntryReferenceResult().getPathForUI(), 
				mEnterServiceInformationStep.getMTitleOfTalkResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMReadingResult().getValueForUI(),  //$NON-NLS-1$
				mEnterServiceInformationStep.getMServiceDateResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMServiceTypeResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMSpeakersNameResult().getValueForUI(),  //$NON-NLS-1$ //$NON-NLS-2$
				TestData.LogicLayerNormalServiceTest_CommentParameter, 
				mEnterServiceInformationStep.getMTitleOfTalkResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMReadingResult().getValueForUI(),  //$NON-NLS-1$
				mEnterServiceInformationStep.getMServiceDateResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMServiceTypeResult().getValueForUI()+" - "+mEnterServiceInformationStep.getMSpeakersNameResult().getValueForUI(), //$NON-NLS-1$ //$NON-NLS-2$
				mEnterServiceInformationStep.getReadingResult(),
				PODCAST_DATE_TIME_FORMAT.format(new Date()));
	}
	
	/**
	 * Tests requirement R 1.9. This test requires a separate test email account. WARNING: All email on that account will be deleted
	 * before the step is executed!
	 * .
	 * @throws Exception Thrown if an error occurs.
	 */
	@Test(dependsOnMethods = { "testMPublishMP3Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMEmailEventLogStepStep() throws Exception {
		final MEmailEventLogStep mStep = (MEmailEventLogStep) mScript.getMSteps().get(10);
		MEnterServiceInformationStep mEnterServiceInformationStep = (MEnterServiceInformationStep) mScript.getMSteps().get(0); 
		testMEmailEventLogStep(mStep, mStep.getRecordingUsersNameParameter(),
				"DMS log of "+mEnterServiceInformationStep.getMServiceTypeParameter().getValueForUI()+" on "+mEnterServiceInformationStep.getMServiceDateParameter().getValueForUI()); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
}
