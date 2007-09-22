package org.onceforall.dms.desktop.tests;

import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.onceforall.dms.desktop.logic.LogicFactory;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep;
import org.onceforall.dms.desktop.logic.MScript;
import org.onceforall.dms.desktop.logic.MTestStep;
import org.onceforall.dms.desktop.logic.types.Type;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests the managed steps for upgrading the application data.
 *
 * @author Marc
 */
		
public class LogicLayerMUpgradeStepsTest extends LogicLayerTest {
	/** Specifies the managed DMS application that is used to create the upgrade data. */
	protected MDmsApplication mUpgradeDmsApplication;
	
	/** Specifies the file to write the created appliation upgrade data to. */
	protected static final File UPGRADE_FILE = new File("Test Output Files\\Test-upgrade-data.xml");
	
	/** Specifies the compressed file to write the created appliation upgrade data to. */
	protected static final File COMPRESSED_UPGRADE_FILE = new File("Test Output Files\\Test-upgrade-data.zip");
	
	/** Specifies the file to write the original application data to. */
	protected static final File ORIGINAL_FILE = new File("Test Output Files\\Test-original-data.xml");
	
	/**
	 * Creates the managed DMS application objects for the original data and 
	 * for creating the upgrade data.
	 */
	@BeforeTest
	protected void createMDmsApplications() {
		MApplication.clearInstance();
		mUpgradeDmsApplication = (MDmsApplication) MApplication.loadInstance(UPGRADE_FILE);
		mUpgradeDmsApplication.getMLastSaveProperty().setValueForUI("09-Feb-2007 00:00:00");
		mUpgradeDmsApplication.getMUpgradeMessageProperty().setValueForUI("Upgrade");
		
		MScript mScript = LogicFactory.eINSTANCE.createMScript();
		MTestStep mTestStep = LogicFactory.eINSTANCE.createMTestStep();
		mTestStep.getMStringParameter().setValueForUI("Upgrade");
		mScript.getMSteps().add(mTestStep);
		mUpgradeDmsApplication.getMScripts().add(mScript);
		mUpgradeDmsApplication.saveToXML();

		MApplication.clearInstance();
		mDmsApplication = (MDmsApplication) MApplication.loadInstance(ORIGINAL_FILE);
		mDmsApplication.getMLastSaveProperty().setValueForUI("23-Oct-1974 00:00:00");
		mDmsApplication.getMLastUpgradeProperty().setValueForUI(Type.NULL_FOR_UI);
		mDmsApplication.getMUpgradeMessageProperty().setValueForUI("Original");
		mDmsApplication.getMUpgradeRelativeFtpPathProperty().setValueForUI("dms-test/"+UPGRADE_FILE.getName());
		mDmsApplication.getMFtpServerUrlProperty().setValueForUI(TestData.LogicLayerTest_FtpServerUrlProperty);
		mDmsApplication.getMFtpUserNameProperty().setValueForUI(TestData.LogicLayerTest_FtpUserNameProperty);
		mDmsApplication.getMFtpUserPasswordProperty().setValueForUI(Type.PASSWORD_TYPE.decryptPassword(TestData.LogicLayerTest_FtpPasswordProperty));
		mDmsApplication.getMWebServerUrlProperty().setValueForUI(TestData.LogicLayerTest_WebServerUrlProperty);
	}
	
	/**
	 * Tests whether the application data can be upgraded from a non-compressed file.
	 * 
	 * @throws Exception Thrown if any errors occur.
	 */
	@Test
	protected void testUpgrade() throws Exception {
		try {
			System.out.print("Uploading application data upgrade file to the FTP server ..."); //$NON-NLS-1$
			performFtpClientOperation(mDmsApplication.getFtpServerUrlProperty(), mDmsApplication.getFtpUserNameProperty(), Type.PASSWORD_TYPE.decryptPassword(mDmsApplication.getFtpUserPasswordProperty()), new FtpClientOperation() {
				public Object perform(FTPClient ftpClient) throws Exception {
					URL ftpServerUrl = mDmsApplication.getFtpServerUrlProperty();
					URL dataFtpUrl = new URL(ftpServerUrl.toExternalForm()+mDmsApplication.getUpgradeRelativeFtpPathProperty());
					String upgradeFtpPath = dataFtpUrl.getPath().substring(0, dataFtpUrl.getPath().lastIndexOf('/'));
					if(ftpClient.listFiles(upgradeFtpPath).length == 0)
						assertTrue(ftpClient.makeDirectory(upgradeFtpPath));
				
		            assertTrue(ftpClient.changeWorkingDirectory(upgradeFtpPath));
		            assertTrue(ftpClient.storeFile(UPGRADE_FILE.getName(), new FileInputStream(UPGRADE_FILE)));
					System.out.println(" completed.");	 //$NON-NLS-1$		
		           	
		           	try {
			    		MDmsApplicationMGetDataUpgradeInfoStep mStep = mDmsApplication.getMGetDataUpgradeInfoStep();
			    		mStep.setFtpServerUrlParameter(mDmsApplication.getFtpServerUrlProperty());
			    		mStep.setFtpUserNameParameter(mDmsApplication.getFtpUserNameProperty());
			    		mStep.setFtpUserPasswordParameter(mDmsApplication.getFtpUserPasswordProperty());
			    		mStep.setUpgradeRelativeFtpPathProperty(mDmsApplication.getUpgradeRelativeFtpPathProperty());
			    		
			    		executeMStep(mStep, true);
			    		
			    		assertTrue(mStep.getUpgradeAvailableResult());
			    		assertTrue("Upgrade".equals(mStep.getMUpgradeMessageResult().getValueForUI()));
			    		assertTrue("09-Feb-2007 00:00:00".equals(mStep.getMUpgradeDateResult().getValueForUI()));
		           	}
		           	finally {
		    			System.out.print("Deleting application data upgrade file on the FTP server ..."); //$NON-NLS-1$
		    			assertTrue(ftpClient.deleteFile(UPGRADE_FILE.getName()));
						System.out.println(" completed.");	 //$NON-NLS-1$		
		           	}
		           	return null;
				}});
		}
		finally {
			assertTrue(UPGRADE_FILE.delete());	
		}
	}
	
	/**
	 * Tests whether the application data can be upgraded from a compressed file.
	 * 
	 * @throws Exception Thrown if any errors occur.
	 */
	@Test
	protected void testCompressedUpgrade() throws Exception {
		try {
			System.out.print("Uploading compressed application data upgrade file to the FTP server ..."); //$NON-NLS-1$
			performFtpClientOperation(mDmsApplication.getFtpServerUrlProperty(), mDmsApplication.getFtpUserNameProperty(), Type.PASSWORD_TYPE.decryptPassword(mDmsApplication.getFtpUserPasswordProperty()), new FtpClientOperation() {
				public Object perform(FTPClient ftpClient) throws Exception {
					URL ftpServerUrl = mDmsApplication.getFtpServerUrlProperty();
					URL dataFtpUrl = new URL(ftpServerUrl.toExternalForm()+mDmsApplication.getUpgradeRelativeFtpPathProperty());
					String upgradeFtpPath = dataFtpUrl.getPath().substring(0, dataFtpUrl.getPath().lastIndexOf('/'));
					if(ftpClient.listFiles(upgradeFtpPath).length == 0)
						assertTrue(ftpClient.makeDirectory(upgradeFtpPath));
				
		            assertTrue(ftpClient.changeWorkingDirectory(upgradeFtpPath));
		            
		            // Compresses the application data upgrade file.
		            FileOutputStream fileOutputStream = new FileOutputStream(COMPRESSED_UPGRADE_FILE);
		            ZipOutputStream zipFileOutputStream = new ZipOutputStream(fileOutputStream);
		            FileInputStream dataFileInputStream = new FileInputStream(UPGRADE_FILE);
		            zipFileOutputStream.putNextEntry(new ZipEntry(UPGRADE_FILE.getCanonicalPath()));
		            
		            // Writes the entry.
		            int length;
		            byte[] buffer = new byte[1024*16];
		            while ((length = dataFileInputStream.read(buffer)) > 0) {
		                zipFileOutputStream.write(buffer, 0, length);
		            }

		            // Completes the entry.
		            zipFileOutputStream.closeEntry();
		            dataFileInputStream.close();
		            
		            zipFileOutputStream.close();

		            assertTrue(ftpClient.storeFile(UPGRADE_FILE.getName(), new FileInputStream(COMPRESSED_UPGRADE_FILE)));
					System.out.println(" completed.");	 //$NON-NLS-1$		
		           	
		           	try {
			    		MDmsApplicationMGetDataUpgradeInfoStep mStep = mDmsApplication.getMGetDataUpgradeInfoStep();
			    		mStep.setFtpServerUrlParameter(mDmsApplication.getFtpServerUrlProperty());
			    		mStep.setFtpUserNameParameter(mDmsApplication.getFtpUserNameProperty());
			    		mStep.setFtpUserPasswordParameter(mDmsApplication.getFtpUserPasswordProperty());
			    		mStep.setUpgradeRelativeFtpPathProperty(mDmsApplication.getUpgradeRelativeFtpPathProperty());
			    		
			    		executeMStep(mStep, true);
			    		
			    		assertTrue(mStep.getUpgradeAvailableResult());
			    		assertTrue("Upgrade".equals(mStep.getMUpgradeMessageResult().getValueForUI()));
			    		assertTrue("09-Feb-2007 00:00:00".equals(mStep.getMUpgradeDateResult().getValueForUI()));
		           	}
		           	finally {
		    			System.out.print("Deleting application data upgrade file on the FTP server ..."); //$NON-NLS-1$
		    			assertTrue(ftpClient.deleteFile(UPGRADE_FILE.getName()));
						System.out.println(" completed.");	 //$NON-NLS-1$		
		           	}
		           	return null;
				}});
		}
		finally {
			assertTrue(UPGRADE_FILE.delete());	
			assertTrue(COMPRESSED_UPGRADE_FILE.delete());	
		}
	}
	
	
	
	
}
