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

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logic.LogicFactory;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MMp3;
import org.onceforall.dms.desktop.logic.MMp3Folder;
import org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep;
import org.onceforall.dms.desktop.logic.types.MMp3StateType;
import org.onceforall.dms.desktop.logic.types.Type;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Tests the managed publish MP3 step.
 *
 * @author Marc
 */
public class LogicLayerMUpdatePublishedMP3StepTest extends LogicLayerTest {
	protected MMp3Folder mMp3Folder;
	protected MUpdatePublishedMp3sStep mStep;
	protected MMp3 mMp31;
	protected MMp3 mMp32;
	protected MMp3 mMp33;
	protected MMp3 mMp34;

	/**
	 * Creates a managed MP3 entry based on the given name and publishing date.
	 * All managed relevant managed properties, except for the publishing date,
	 * are derived from the given name. For example, if the name is 'Test 1',
	 * the comment property will be 'Test 1 comment'.
	 * 
	 * @param name Specifies the name of the new managed MP3.
	 * @param podcastPublishingDate Specifies the podcast publishing date of the new managed MP3.
	 * @return Returns the new managed MP3 entry.
	 */
	public MMp3 createMMp3(String name, String podcastPublishingDate) {
		MMp3 result = LogicFactory.eINSTANCE.createMMp3();
		result.getMNameProperty().setValueForUI(name);
		result.getMCommentProperty().setValueForUI(name+" comment"); //$NON-NLS-1$
		result.getMFileProperty().setValueForUI(TestData.Test_TestFilesPath+"\\"+name+".mp3"); //$NON-NLS-1$ //$NON-NLS-2$
		result.getMLinkDescriptionProperty().setValueForUI(name+" link description"); //$NON-NLS-1$
		result.getMLinkTextProperty().setValueForUI(name+" link text"); //$NON-NLS-1$
		result.getMPodcastPublishingDateProperty().setValueForUI(podcastPublishingDate);
		result.getMPodcastSubtitleProperty().setValueForUI(name+" podcast subtitle"); //$NON-NLS-1$
		result.getMPodcastSummaryProperty().setValueForUI(name+" podcast summary"); //$NON-NLS-1$
		result.getMPodcastTitleProperty().setValueForUI(name+" podcast title"); //$NON-NLS-1$
		result.getMPublishedFileNameProperty().setValueForUI(Utilities.convertToFileName(name)+".mp3"); //$NON-NLS-1$
		
		return result;
	}
	
	/**
	 * Creates a managed MP3 folder under the application root. It also
	 * create a managed update published MP3 step and a number of managed
	 * MP3 entries in the folder.
	 * @throws Exception Thrown if an error occurs.
	 */
	@BeforeClass
	public void createMMp3FolderAndStep() throws Exception {
		mDmsApplication = (MDmsApplication) MApplication.getInstance();
		
		mMp31 = createMMp3(TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp31Name, TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp31DateTime);
		mMp32 = createMMp3(TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp32Name, TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp32DateTime);
		mMp33 = createMMp3(TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp33Name, TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp33DateTime);
		mMp34 = createMMp3(TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp34Name, TestData.LogicLayerMUpdatePublishedMP3StepTest_Mp34DateTime);
		
		mStep = LogicFactory.eINSTANCE.createMUpdatePublishedMp3sStep();
		mStep.setName(TestData.LogicLayerMUpdatePublishedMP3StepTest_17);
		mStep.getMFtpServerUrlParameter().setValueForUI(TestData.LogicLayerTest_FtpServerUrlProperty);
		mStep.getMFtpUserNameParameter().setValueForUI(TestData.LogicLayerTest_FtpUserNameProperty);
		mStep.getMFtpUserPasswordParameter().setValueForUI(Type.PASSWORD_TYPE.decryptPassword(TestData.LogicLayerTest_FtpPasswordProperty));
		mStep.getMMaxiumumDiskSpaceParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_MaximumDiskSpaceParameter);
		mStep.getMMp3RelativeFtpPathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_MMp3RelativeFtpPathParameter);
		mStep.getMWebServerUrlParameter().setValueForUI(TestData.LogicLayerTest_WebServerUrlProperty);
		mStep.getMContentPageRelativeFtpPathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_ContentPageRelativeFtpPathParameter);
		mStep.getMContentHeaderFilePathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_ContentHeaderFilePathParameter);
		mStep.getMContentFooterFilePathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_ContentFooterFilePathParameter);
		mStep.getMContentPageFilePathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_ContentPageFilePathParameter);
		mStep.getMPodcastRelativeFtpPathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_PodcastRelativeFtpPathParameter);
		mStep.getMPodcastHeaderFilePathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_PodcastHeaderFilePathParameter);
		mStep.getMPodcastFilePathParameter().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_PodcastFilePathParameter);
		
		mMp3Folder = LogicFactory.eINSTANCE.createMMp3Folder();
		mMp3Folder.getMSteps().add(mStep);
		mMp3Folder.getMMp3s().add(mMp31);
		mMp3Folder.getMMp3s().add(mMp32);
		mMp3Folder.getMMp3s().add(mMp33);
		mMp3Folder.getMMp3s().add(mMp34);
		mDmsApplication.getMMp3Folders().add(mMp3Folder);
		
		mStep.getMMp3FolderReferenceParameter().setValueForUI(mMp3Folder.getPath());

		clearMPublishMp3StepProducts(mStep);
	}
	
	// TODO: Add more test cases.
	@Test
	public void testMMp3States() throws Exception {
		// Sets the states of the managed MP3s.
		mMp31.getMStateProperty().setValueForUI(MMp3StateType.NOT_PUBLISHED_STATE.getNameForUI());
		mMp32.getMStateProperty().setValueForUI(MMp3StateType.TO_BE_PUBLISHED_STATE.getNameForUI());
		mMp33.getMStateProperty().setValueForUI(MMp3StateType.PUBLISHED_STATE.getNameForUI());
		mMp34.getMStateProperty().setValueForUI(MMp3StateType.ARCHIVED_STATE.getNameForUI());
		
		// Clones the managed MP3s to check for changes later.
		MMp3 mMp31Clone = (MMp3) mMp31.clone();
		MMp3 mMp32Clone = (MMp3) mMp32.clone();
		MMp3 mMp33Clone = (MMp3) mMp33.clone();
		MMp3 mMp34Clone = (MMp3) mMp34.clone();

		List<Difference> differences = new ArrayList<Difference>();
		compareMElements(mMp31, mMp31Clone, true, differences);
		differences.clear();
        
		mStep.getMRepublishMp3Files().setValueForUI(TestData.LogicLayerMUpdatePublishedMP3StepTest_27);
		executeMStep(mStep, true, true);
		
        URL webServerUrl = mStep.getWebServerUrlParameter();
        URL podcastUrl = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mStep.getPodcastFilePathParameter().getName()); //$NON-NLS-1$
        URL contentPageUrl = new URL(webServerUrl.toExternalForm()+mStep.getContentPageRelativeFtpPathParameter()+"/"+mStep.getContentPageFilePathParameter().getName()); //$NON-NLS-1$
        URL mMp31Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mMp31.getPublishedFileNameProperty()); //$NON-NLS-1$
        URL mMp32Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mMp32.getPublishedFileNameProperty()); //$NON-NLS-1$
        URL mMp33Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mMp33.getPublishedFileNameProperty()); //$NON-NLS-1$
        URL mMp34Url = new URL(webServerUrl.toExternalForm()+mStep.getMp3RelativeFtpPathParameter()+"/"+mMp34.getPublishedFileNameProperty()); //$NON-NLS-1$
        // Checks the results.
        //assertTrue(mMp3Folder.getPath().equals(mStep.getMMp3FolderReferenceResult().getValueForUI()));

        
		// Checks the managed MP3s.
        assertTrue(verifyMObjectDifferences(mMp31, mMp31Clone, null));
        assertTrue(verifyMObjectDifferences(mMp32, mMp32Clone, new int[] { LogicPackage.MMP3__STATE_PROPERTY, LogicPackage.MMP3__LAST_STATE_CHANGE_PROPERTY }));
        assertTrue(verifyMObjectDifferences(mMp33, mMp33Clone, new int[] { LogicPackage.MMP3__LAST_STATE_CHANGE_PROPERTY }) || verifyMObjectDifferences(mMp33, mMp33Clone, null));
        assertTrue(verifyMObjectDifferences(mMp34, mMp34Clone, new int[] { LogicPackage.MMP3__LAST_STATE_CHANGE_PROPERTY }) || verifyMObjectDifferences(mMp34, mMp34Clone, null));
        
		assertTrue(mMp33.getMStateProperty().getValueForUI().equals(MMp3StateType.PUBLISHED_STATE.getNameForUI()));
		
    	// Checks the HTML content page on the web server.
		System.out.print("Checking content page on web server ..."); //$NON-NLS-1$
		String contentPage = getHttpFile(contentPageUrl);
		assertFalse(contentPage.indexOf("href=\""+mMp31Url.toExternalForm()+"\">"+mMp31.getLinkTextProperty()+"</a>") >= 0); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		assertFalse(contentPage.indexOf(mMp31.getLinkDescriptionProperty()) >= 0);
		assertFalse(contentPage.indexOf(mMp31.getCommentProperty()) >= 0);

		int mMp32Index = contentPage.indexOf("href=\""+mMp32Url.toExternalForm()+"\">"+mMp32.getLinkTextProperty()+"</a>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		assertTrue(mMp32Index >= 0); 
		assertTrue(contentPage.indexOf(mMp32.getLinkDescriptionProperty()) >= 0);
		assertTrue(contentPage.indexOf(mMp32.getCommentProperty()) >= 0);
		
		int mMp33Index = contentPage.indexOf("href=\""+mMp33Url.toExternalForm()+"\">"+mMp33.getLinkTextProperty()+"</a>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		assertTrue(mMp33Index >= 0); 
		assertTrue(contentPage.indexOf(mMp33.getLinkDescriptionProperty()) >= 0);
		assertTrue(contentPage.indexOf(mMp33.getCommentProperty()) >= 0);
		
		// Checks that MP3s are published in reverse date order.
		assertTrue(mMp33Index < mMp32Index);
		
		assertFalse(contentPage.indexOf("href=\""+mMp34Url.toExternalForm()+"\">"+mMp34.getLinkTextProperty()+"</a>") >= 0); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		assertFalse(contentPage.indexOf(mMp34.getLinkDescriptionProperty()) >= 0);
		assertFalse(contentPage.indexOf(mMp34.getCommentProperty()) >= 0);
		System.out.println(" completed.");	 //$NON-NLS-1$		
		
		// Checks the HTML page on the FTP server.
		System.out.print("Checking content page on FTP server ..."); //$NON-NLS-1$
		performFtpClientOperation(mStep.getFtpServerUrlParameter(), mStep.getFtpUserNameParameter(), mStep.getFtpUserPasswordParameter(), new FtpClientOperation() {
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

		
    	// Checks the podcast file on the web server.
		System.out.print("Checking podcast file on web server ..."); //$NON-NLS-1$
		String podcast = getHttpFile(podcastUrl);
		testPodcastMp3Exists(podcast, mStep, mMp31, false);
		testPodcastMp3Exists(podcast, mStep, mMp32, true);
		testPodcastMp3Exists(podcast, mStep, mMp33, true);
		testPodcastMp3Exists(podcast, mStep, mMp34, false);
		System.out.println(" completed.");	 //$NON-NLS-1$		
	
		// Checks the MP3 files.
		System.out.print("Checking MP3 files on web server ...");		 //$NON-NLS-1$
		assertFalse(isUrlContentNotEmpty(mMp31Url));
		assertTrue(isUrlContentNotEmpty(mMp32Url));
		assertFalse(isUrlContentNotEmpty(mMp33Url));
		assertFalse(isUrlContentNotEmpty(mMp34Url));
		System.out.println(" completed.");	 //$NON-NLS-1$
        
		System.out.print("Checking MP3 files on FTP server ..."); //$NON-NLS-1$
		performFtpClientOperation(mStep.getFtpServerUrlParameter(), mStep.getFtpUserNameParameter(), mStep.getFtpUserPasswordParameter(), new FtpClientOperation() {
			public Object perform(FTPClient ftpClient) throws Exception {
	            String mp3FTPPath = mStep.getFtpServerUrlParameter().getPath()+mStep.getMp3RelativeFtpPathParameter();
	            assertTrue(ftpClient.changeWorkingDirectory(mp3FTPPath));
            	FTPFile[] ftpFiles = ftpClient.listFiles();
            	List<String> ftpFileNames = new ArrayList<String>();
            	for(FTPFile ftpFile: ftpFiles)
            		ftpFileNames.add(ftpFile.getName());

            	assertFalse(ftpFileNames.contains(mMp31.getPublishedFileNameProperty()));
            	assertTrue(ftpFileNames.contains(mMp32.getPublishedFileNameProperty()));
            	assertFalse(ftpFileNames.contains(mMp33.getPublishedFileNameProperty()));
            	assertFalse(ftpFileNames.contains(mMp34.getPublishedFileNameProperty()));
            	
            	for(FTPFile ftpFile: ftpFiles) {	            	
            		if(ftpFile.getName().equals(mMp32.getPublishedFileNameProperty()))
            			assertTrue(mMp32.getFileProperty().length() == ftpFile.getSize());
            	}
	            
				return null;
			}});
		System.out.println(" completed.");	 //$NON-NLS-1$		
	}
}
