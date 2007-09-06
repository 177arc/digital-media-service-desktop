/**
 * Revision History:
 * $Log: TestData.java,v $
 * Revision 1.2  2006/09/19 12:54:59  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.tests;

import org.eclipse.osgi.util.NLS;

/**
 * Defines static member variables that are initialised with the corresponding property values
 * in the <code>TestData.properties</code> file.
 *
 * @author Marc
 */
public class TestData extends NLS {
	private static final String BUNDLE_NAME = "org.onceforall.dms.desktop.tests.TestData"; //$NON-NLS-1$

	public static String LogicLayerNormalServiceTest_DateParameter;

	public static String LogicLayerNormalServiceTest_PostSermonAudioFile;

	public static String LogicLayerNormalServiceTest_PostSermonRecordingFileParameter;

	public static String LogicLayerNormalServiceTest_PreSermonAudioFile;

	public static String LogicLayerNormalServiceTest_PreSermonRecordingFileParameter;

	public static String LogicLayerNormalServiceTest_SermonAudioFile;

	public static String LogicLayerNormalServiceTest_SermonRecordingFileParameter;

	public static String LogicLayerTest_ApplicationDataZipFileName;

	public static String LogicLayerNormalServiceTest_CommentParameter;

	public static String LogicLayerNormalServiceTest_ConentHeaderFilePathParameter;

	public static String LogicLayerNormalServiceTest_ContentFooterFilePathParameter;

	public static String LogicLayerNormalServiceTest_ContentPageFilePathParameter;

	public static String LogicLayerNormalServiceTest_ContentPageRelativeFtpPathParameter;

	public static String LogicLayerTest_EmailCommentParameter;

	public static String LogicLayerTest_ExpectedRecordingLength;

	public static String LogicLayerTest_FtpPasswordProperty;

	public static String LogicLayerTest_FtpServerUrlProperty;

	public static String LogicLayerTest_FtpUserNameProperty;

	public static String LogicLayerNormalServiceTest_Mp3RelativeFtpPathParameter;

	public static String LogicLayerTest_PodcastDurationFormat;

	public static String LogicLayerNormalServiceTest_PodcastFilePathParameter;

	public static String LogicLayerNormalServiceTest_PodcastHeaderFilePathParameter;

	public static String LogicLayerNormalServiceTest_PodcastRelativeFtpPathParameter;

	public static String LogicLayerTest_Pop3Password;

	public static String LogicLayerTest_Pop3ServerAddress;

	public static String LogicLayerTest_Pop3UserName;

	public static String LogicLayerNormalServiceTest_ReadingParameter;

	public static String LogicLayerTest_ReceipientsEmailAddressParameter;

	public static String LogicLayerTest_RecordingTolerance;

	public static String LogicLayerTest_SendersEmailAddressParameter;

	public static String LogicLayerNormalServiceTest_ServiceTypeParameter;

	public static String LogicLayerNormalServiceTest_SpeakersNameParameter;

	public static String LogicLayerNormalServiceTest_TitleOfTalkParameter;

	public static String LogicLayerNormalServiceTest_RecordingUsersNameParameter;

	public static String LogicLayerTest_WebServerUrlProperty;

	public static String LogicLayerWwxMeetingTest_CommentParameter;

	public static String LogicLayerWwxMeetingTest_ConentHeaderFilePathParameter;

	public static String LogicLayerWwxMeetingTest_ContentFooterFilePathParameter;

	public static String LogicLayerWwxMeetingTest_ContentPageFilePathParameter;

	public static String LogicLayerWwxMeetingTest_ContentPageRelativeFtpPathParameter;

	public static String LogicLayerWwxMeetingTest_DateParameter;

	public static String LogicLayerWwxMeetingTest_FirstPartAudioFile;

	public static String LogicLayerWwxMeetingTest_FirstPartParameter;

	public static String LogicLayerWwxMeetingTest_Mp3RelativeFtpPathParameter;

	public static String LogicLayerWwxMeetingTest_PodcastFilePathParameter;

	public static String LogicLayerWwxMeetingTest_PodcastHeaderFilePathParameter;

	public static String LogicLayerWwxMeetingTest_PodcastRelativeFtpPathParameter;

	public static String LogicLayerWwxMeetingTest_RecordingUsersNameParameter;

	public static String LogicLayerWwxMeetingTest_SecondPartAudioFile;

	public static String LogicLayerWwxMeetingTest_SecondPartParameter;

	public static String LogicLayerWwxMeetingTest_SpeakersNameParameter;

	public static String LogicLayerWwxMeetingTest_TitleOfTalkParameter;

	public static String Test_CheckRecordingLevels;

	public static String Test_TestFilesPath;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, TestData.class);
	}

	private TestData() {
	}
}