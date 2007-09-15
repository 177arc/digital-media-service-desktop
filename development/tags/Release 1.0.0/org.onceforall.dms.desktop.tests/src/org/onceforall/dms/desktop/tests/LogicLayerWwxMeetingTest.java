/**
 * Revision History:
 * $Log: LogicLayerWwxMeetingTest.java,v $
 * Revision 1.1  2006/09/19 12:54:59  marc
 * Updated to checkpoint progress.
 *
 *
 */
package org.onceforall.dms.desktop.tests;

import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import javax.sound.sampled.UnsupportedAudioFileException;

import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep;
import org.onceforall.dms.desktop.logic.MCheckInputLevelsStep;
import org.onceforall.dms.desktop.logic.MConvertToMP3Step;
import org.onceforall.dms.desktop.logic.MCreateDirectoryStep;
import org.onceforall.dms.desktop.logic.MEmailEventLogStep;
import org.onceforall.dms.desktop.logic.MEnterWwxInformationStep;
import org.onceforall.dms.desktop.logic.MPublishNewMp3Step;
import org.onceforall.dms.desktop.logic.MRecordStep;
import org.onceforall.dms.desktop.logic.MScript;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests the 'Wwx meeting' managed script. Tests requirements R 2.
 *
 * @author Marc
 */
public class LogicLayerWwxMeetingTest extends LogicLayerTest {

	/**
	 * Selects the managed script.
	 */
	@BeforeClass
	public void selectMScript() {
		mScript = (MScript) mDmsApplication.getMScripts().get(1);
	}
	
	/**
	 * Tests requirement R 2.1.
	 * @throws ParseException Thrown if a managed date parameter cannot be parsed.
	 */
	@Test
	public void testMEnterWwwxInformationStep() throws ParseException {
		MEnterWwxInformationStep mStep = (MEnterWwxInformationStep) mScript.getMSteps().get(currentStepIndex);

		// Sets the parameters
		mStep.setWwxDateParameter(DATE_FORMAT.parse(TestData.LogicLayerWwxMeetingTest_DateParameter));
		mStep.setTitleOfTalkParameter(TestData.LogicLayerWwxMeetingTest_TitleOfTalkParameter);
		mStep.setFirstPartParameter(TestData.LogicLayerWwxMeetingTest_FirstPartParameter);
		mStep.setSecondPartParameter(TestData.LogicLayerWwxMeetingTest_SecondPartParameter);
		mStep.setSpeakersNameParameter(TestData.LogicLayerWwxMeetingTest_SpeakersNameParameter);
		mStep.setRecordingUsersNameParameter(TestData.LogicLayerWwxMeetingTest_RecordingUsersNameParameter);
		
		// Executes the step.
		executeMStep(mStep, true);
			
		// Checks that the results are correct.
		assertTrue(mStep.getWwxDateParameter().equals(mStep.getWwxDateResult()));
		assertTrue(mStep.getTitleOfTalkParameter().equals(mStep.getTitleOfTalkResult()));
		assertTrue(mStep.getFirstPartParameter().equals(mStep.getFirstPartResult()));
		assertTrue(mStep.getSecondPartParameter().equals(mStep.getSecondPartResult()));
		assertTrue(mStep.getSpeakersNameParameter().equals(mStep.getSpeakersNameResult()));
		assertTrue(mStep.getRecordingUsersNameParameter().equals(mStep.getRecordingUsersNameResult()));
	}
	
	/**
	 * Tests requirement R 2.3.
	 */
	@Test(dependsOnMethods = { "testMEnterWwwxInformationStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCheckFreeDiskSpaceStep() {
		MCheckFreeDiskSpaceStep mStep = (MCheckFreeDiskSpaceStep) mScript.getMSteps().get(currentStepIndex);
		
		// Executes the step.
		executeMStep(mStep, true);
	}
	
	/**
	 * Tests requirement R 2.2.
	 */
	@Test(dependsOnMethods = { "testMCheckFreeDiskSpaceStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCreateDirectoryStep() {
		MCreateDirectoryStep mStep = (MCreateDirectoryStep) mScript.getMSteps().get(currentStepIndex);
		MEnterWwxInformationStep mEnterServiceInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		testMCreateDirectoryStep(mStep, "WWX on "+mEnterServiceInformationStep.getMWwxDateResult().getValueForUI()); //$NON-NLS-1$
	}
	
	/**
	 * Tests requirement R 2.4.
	 */
	@Test(dependsOnMethods = { "testMCreateDirectoryStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMCheckInputLevelsStep() {
		MCheckInputLevelsStep mStep = (MCheckInputLevelsStep) mScript.getMSteps().get(currentStepIndex);
		testMCheckInputLevelsStep(mStep);
	}
	
	/**
	 * Tests requirement R 2.5.
	 * 
	 * @throws IOException Thrown if the recorded file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMCheckInputLevelsStep" }, alwaysRun=true) //$NON-NLS-1$
	public void testMRecordPart1Step() throws UnsupportedAudioFileException, IOException {
		MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		testMRecordStep((MRecordStep) mScript.getMSteps().get(currentStepIndex), 
				new File(Utilities.convertToFileName(mEnterWwxInformationStep.getFirstPartResult())+".wav"), //$NON-NLS-1$
				new File(TestData.LogicLayerWwxMeetingTest_FirstPartAudioFile));
	}
	
	/**
	 * Tests requirement R 2.5.
	 * 
	 * @throws IOException Thrown if the recorded file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMRecordPart1Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMRecordPart2Step() throws UnsupportedAudioFileException, IOException {
		MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		testMRecordStep((MRecordStep) mScript.getMSteps().get(currentStepIndex), 
				new File(Utilities.convertToFileName(mEnterWwxInformationStep.getSecondPartResult())+".wav"), //$NON-NLS-1$
				new File(TestData.LogicLayerWwxMeetingTest_SecondPartAudioFile));
	}
	
	/**
	 * Tests requirement R 2.6.
	 * 
	 * @throws IOException Thrown if the recorded file or file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMRecordPart2Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMConvertFirstPartToMP3Step() throws UnsupportedAudioFileException, IOException {
		MConvertToMP3Step mStep = (MConvertToMP3Step) mScript.getMSteps().get(currentStepIndex);
		MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		MCreateDirectoryStep mCreateDirectoryStep = (MCreateDirectoryStep) mScript.getMSteps().get(2);
		MRecordStep mRecordFristPartStep = (MRecordStep) mScript.getMSteps().get(currentStepIndex-2);
		
	    Calendar serviceDateCalendar = Calendar.getInstance();
	    serviceDateCalendar.setTime(mEnterWwxInformationStep.getWwxDateResult());
		testMConvertToMP3Step(mStep, mEnterWwxInformationStep.getSpeakersNameResult(),
				mEnterWwxInformationStep.getMTitleOfTalkResult().getValueForUI()+" on "+mEnterWwxInformationStep.getMWwxDateResult().getValueForUI(),  //$NON-NLS-1$
				"WWX "+mEnterWwxInformationStep.getFirstPartResult(), //$NON-NLS-1$
				""+serviceDateCalendar.get(Calendar.YEAR), mCreateDirectoryStep.getDirectoryResult(),  //$NON-NLS-1$
				Utilities.convertToFileName(mEnterWwxInformationStep.getTitleOfTalkResult()+" - "+mEnterWwxInformationStep.getFirstPartResult())+".mp3", //$NON-NLS-1$ //$NON-NLS-2$
				mRecordFristPartStep.getRecordingFileResult());
	}
	
	/**
	 * Tests requirement R 2.6.
	 * 
	 * @throws IOException Thrown if the recorded file or file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the recorded file format is not supported.
	 */
	@Test(dependsOnMethods = { "testMConvertFirstPartToMP3Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMConvertSecondPartToMP3Step() throws UnsupportedAudioFileException, IOException {
		MConvertToMP3Step mStep = (MConvertToMP3Step) mScript.getMSteps().get(currentStepIndex);
		MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		MCreateDirectoryStep mCreateDirectoryStep = (MCreateDirectoryStep) mScript.getMSteps().get(2);
		MRecordStep mRecordSecondPartStep = (MRecordStep) mScript.getMSteps().get(currentStepIndex-2);
		
	    Calendar serviceDateCalendar = Calendar.getInstance();
	    serviceDateCalendar.setTime(mEnterWwxInformationStep.getWwxDateResult());
		testMConvertToMP3Step(mStep, mEnterWwxInformationStep.getSpeakersNameResult(),
				mEnterWwxInformationStep.getMTitleOfTalkResult().getValueForUI()+" on "+mEnterWwxInformationStep.getMWwxDateResult().getValueForUI(),  //$NON-NLS-1$
				"WWX "+mEnterWwxInformationStep.getSecondPartResult(), //$NON-NLS-1$
				""+serviceDateCalendar.get(Calendar.YEAR), mCreateDirectoryStep.getDirectoryResult(),  //$NON-NLS-1$
				Utilities.convertToFileName(mEnterWwxInformationStep.getTitleOfTalkResult()+" - "+mEnterWwxInformationStep.getSecondPartResult())+".mp3", //$NON-NLS-1$ //$NON-NLS-2$
				mRecordSecondPartStep.getRecordingFileResult());
	}
	
	/**
	 * Tests requirement R 2.7. This test requires a separate FTP directory. WARNING: All files in the FTP directory will be deleted before the 
	 * step it executed.
	 * 
	 * @throws Exception Thrown if an error occurs.
	 */
	@Test(dependsOnMethods = { "testMConvertSecondPartToMP3Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMPublishMP3Step() throws Exception {
		final MPublishNewMp3Step mStep = (MPublishNewMp3Step) mScript.getMSteps().get(currentStepIndex);
		final MConvertToMP3Step mConvertToMP3Step = (MConvertToMP3Step) mScript.getMSteps().get(currentStepIndex-2); 
		final MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		
		testMPublishMP3Step(mStep, 
				TestData.LogicLayerWwxMeetingTest_ContentPageRelativeFtpPathParameter,
				TestData.LogicLayerWwxMeetingTest_ConentHeaderFilePathParameter, 
				TestData.LogicLayerWwxMeetingTest_ContentFooterFilePathParameter,
				TestData.LogicLayerWwxMeetingTest_ContentPageFilePathParameter,
				TestData.LogicLayerWwxMeetingTest_PodcastRelativeFtpPathParameter,
				TestData.LogicLayerWwxMeetingTest_PodcastHeaderFilePathParameter, 
				TestData.LogicLayerWwxMeetingTest_PodcastFilePathParameter,
				TestData.LogicLayerWwxMeetingTest_Mp3RelativeFtpPathParameter,
				new Long((mConvertToMP3Step.getMp3EntryReferenceResult().getFileProperty().length()/1024)+1).toString(),
				mConvertToMP3Step.getMp3EntryReferenceResult().getPathForUI(), 
				mEnterWwxInformationStep.getMTitleOfTalkResult().getValueForUI(), 
				mEnterWwxInformationStep.getMWwxDateResult().getValueForUI()+" - "+mEnterWwxInformationStep.getMSpeakersNameResult().getValueForUI(),  //$NON-NLS-1$
				TestData.LogicLayerWwxMeetingTest_CommentParameter, 
				mEnterWwxInformationStep.getMTitleOfTalkResult().getValueForUI(), 
				mEnterWwxInformationStep.getMWwxDateResult().getValueForUI()+" - "+mEnterWwxInformationStep.getMSpeakersNameResult().getValueForUI(), //$NON-NLS-1$
				mEnterWwxInformationStep.getMTitleOfTalkResult().getValueForUI(),
				PODCAST_DATE_TIME_FORMAT.format(new Date()));
	}
	
	/**
	 * Tests requirement R 2.8. This test requires a separate test email account. WARNING: All email on that account will be deleted
	 * before the step is executed!
	 * .
	 * @throws Exception Thrown if an error occurs.
	 */
	@Test(dependsOnMethods = { "testMPublishMP3Step" }, alwaysRun=true) //$NON-NLS-1$
	public void testMEmailEventLogStepStep() throws Exception {
		final MEmailEventLogStep mStep = (MEmailEventLogStep) mScript.getMSteps().get(currentStepIndex);
		final MEnterWwxInformationStep mEnterWwxInformationStep = (MEnterWwxInformationStep) mScript.getMSteps().get(0);
		testMEmailEventLogStep(mStep, mStep.getRecordingUsersNameParameter(),
				"DMS log of WWX on "+mEnterWwxInformationStep.getMWwxDateParameter().getValueForUI()); //$NON-NLS-1$
	}
	
	

}
