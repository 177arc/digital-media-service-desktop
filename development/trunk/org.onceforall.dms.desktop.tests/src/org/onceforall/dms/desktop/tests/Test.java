/**
 * Revision History:
 * $Log: Test.java,v $
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.commons.net.ftp.FTPClient;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.logic.types.Type;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

/**
 * Defines the base class for all DMS Desktop tests. It provides useful method that sub classes 
 * can use in the test implementations. It also loads and instantiates the application data before
 * any tests are executed. 
 *
 * @author Marc
 */
public class Test extends org.onceforall.core.tests.Test {
	/** Specifies the root of the DMS Desktop application. */
	protected MDmsApplication mDmsApplication;

	/** Indicates whether the current playback should be stopped. */
	private boolean stopPlaybackRequested;
	
	/** Specifies the current playback thread. This variable is used to ensure that only one playback thread is running at any one point in time. */
	private Thread playbackThread;
	
	/** Specifies the currently activated managed element. */
	protected MElement activeMElement;
	
	/**
	 * Loads and instantiates the application data.
	 * @throws IOException Thrown if the application data file cannot be copied.
	 */
	@BeforeClass
	public void loadMApplicationData() throws IOException {
		// Creates a copy of the application data file.
		System.out.print("Creating a working copy of application data file '"+MDmsApplication.DATA_FILE.getAbsolutePath()+"' ...");		 //$NON-NLS-1$ //$NON-NLS-2$
		File newDataFile = new File(TestData.Test_TestFilesPath+"\\"+MDmsApplication.DATA_FILE.getName()); //$NON-NLS-2$
		newDataFile.getParentFile().mkdirs();
		FileChannel sourceChannel = new FileInputStream(MDmsApplication.DATA_FILE).getChannel();
		FileChannel destinationChannel = new FileOutputStream(newDataFile).getChannel();
		sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
		sourceChannel.close();
		destinationChannel.close();
		System.out.println(" completed.");		 //$NON-NLS-1$
		
		System.out.print("Loading application data from '"+newDataFile.getAbsolutePath()+"' ...");		 //$NON-NLS-1$ //$NON-NLS-2$
		mDmsApplication = (MDmsApplication) MDmsApplication.loadInstance(newDataFile);
		System.out.println(" completed.");		 //$NON-NLS-1$
	}
	
	/**
	 * Deactivates the currently activate managed element.
	 */
	@AfterTest
	public void deactivateMElement() {
		if(activeMElement != null) {
			activeMElement.deactivate();
			activeMElement = null;
		}
	}
	
	/**
	 * Activates the given managed element. It deactivates the previously activated managed element.
	 * 
	 * @param mElement Specifies the managed element to active.
	 */
	protected void activateMElement(MElement mElement) {
		if(activeMElement != null)
			activeMElement.deactivate();
		
		activeMElement = mElement;
		
		if(mElement != null)
			mElement.activate();
	}
	/**
	 * Executes the given managed step and waits till it has finished. It will not ignore warnings.
	 * 
	 * @param mStep Specifies the managed step to execute.
	 * @param waitForCompletion Specifies whether to wait for the step to finish or to return immediately.
	 */
	protected void executeMStep(MStep mStep, boolean waitForCompletion) {
		executeMStep(mStep, waitForCompletion, false);
	}
	
	/**
	 * Executes the given managed step and waits till it has finished.
	 * 
	 * @param mStep Specifies the managed step to execute.
	 * @param waitForCompletion Specifies whether to wait for the step to finish or to return immediately.
	 */
	protected void executeMStep(MStep mStep, boolean waitForCompletion, boolean ignoreWarnings) {
		System.out.print("Executing step '"+mStep.getNameForUI()+"' ..."); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			try {
				mStep.validate();		
			}
			catch(DesktopException exception) {
				if(!ignoreWarnings || exception.getSeverity() > DesktopException.WARNING_SEVERITY)
					throw exception;
			}
			
			mStep.run();
			
			if(!waitForCompletion)
				return;
			
			while(mStep.isInProcessingState())
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			
			System.out.println(" completed."); //$NON-NLS-1$ //$NON-NLS-2$
				
			assertTrue(mStep.getException() != null ? "Step execution error: ["+mStep.getException().getClass().getName()+"] "+mStep.getException().getMessage() : null, mStep.getException() == null); //$NON-NLS-1$ //$NON-NLS-2$
		}
		catch(DesktopException exception) {
			assertTrue("Step validation failed: "+exception.getMessage(), false); //$NON-NLS-1$
			throw exception;
		}
	}
	
	/**
	 * Stops the given managed step.
	 * 
	 * @param mStep Specifies the managed step to stop.
	 */
	public void stopMStep(MStep mStep) {
		mStep.stop();
		
		while(mStep.isInProcessingState())
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
		System.out.println(" completed."); //$NON-NLS-1$
	}
	
	/**
	 * Plays the given audio file in the background. This methods returns immediately.
	 * 
	 * @param audioFile Specifies the audio file to playback.
	 * @see #stopPlayAudioFile()
	 */
	protected void startPlayAudioFile(final File audioFile) {
		stopPlaybackRequested = true;
		while(playbackThread != null && playbackThread.isAlive())
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		
		stopPlaybackRequested = false;
		playbackThread = new Thread(new Runnable() {
			public void run() {
				try {
					AudioInputStream in = AudioSystem.getAudioInputStream(audioFile);
					AudioFormat baseFormat = in.getFormat();
					AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16, baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat
							.getSampleRate(), false);
					AudioInputStream decodedIn = AudioSystem.getAudioInputStream(decodedFormat, in);

					play(decodedFormat, decodedIn);
					in.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		}, "Audio playback"); //$NON-NLS-1$

		playbackThread.start();
	}
	
	/**
	 * Stops the playback of the audio file.
	 * 
	 * @see #startPlayAudioFile(File)
	 */
	protected void stopPlayAudioFile() {
		stopPlaybackRequested = true;
		
		while(playbackThread != null && playbackThread.isAlive())
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
	}

	/**
	 * Plays the given audio input stream.
	 * 
	 * @param audioFormat Specifies the audio format.
	 * @param audioInputStream Specifies the audio input stream.
	 * @throws IOException Thrown if there is a problem with reading the input stream.
	 * @throws LineUnavailableException Thrown if the the output line is not avaiable.
	 */
	private void play(AudioFormat audioFormat, AudioInputStream audioInputStream) throws IOException, LineUnavailableException {
	  byte[] data = new byte[4096];
		SourceDataLine line = getLine(audioFormat);
		if (line != null) {
			// Starts the playback.

			line.start();
			try {
				int bytesRead = 0;
				while (bytesRead != -1 && !stopPlaybackRequested) {				
					bytesRead = audioInputStream.read(data, 0, data.length);
					if (bytesRead != -1)
						line.write(data, 0, bytesRead);
				}
			}
			finally {
				// Stops the playback.
				line.drain();
				line.stop();
				line.close();
				audioInputStream.close();
				stopPlaybackRequested = false;
			}
		}
	}

	/**
	 * Gets the output line for the given audio format.
	 * TODO
	 * @param audioFormat Specifies the audio format.
	 * @return Returns the output line for the given audio format.
	 * @throws LineUnavailableException Thrown if the the output line is not avaiable.
	 */
	private SourceDataLine getLine(AudioFormat audioFormat) throws LineUnavailableException {
	  SourceDataLine result = null;

		DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
		result = (SourceDataLine) AudioSystem.getLine(info);
		result.open(audioFormat);

		return result;
	}
	
	/** 
	 * Determines whether the given audio input stream contains auditable sounds.
	 * It declares the stream as silent if the average level of either channel does not exceed 5%.
	 * 
	 * @param audioInputStream Specifies the audio input stream to test.
	 * @return Returns whether the given audio file contains audio data.
	 * @throws IOException Thrown if the audio file format cannot be read.
	 * @throws UnsupportedAudioFileException  Thrown if the audio file format is not supported.
	 */
	protected boolean isAudioFileSilent(AudioInputStream audioInputStream) throws UnsupportedAudioFileException, IOException {		
		if(TestData.Test_CheckRecordingLevels.toLowerCase().equals(Boolean.FALSE.toString()))
			return false;
		
		AudioFormat baseFormat = audioInputStream.getFormat();
		AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16, baseFormat.getChannels(), baseFormat.getChannels() * 2,
				baseFormat.getSampleRate(), false);
		AudioInputStream decodedInputStream = AudioSystem.getAudioInputStream(decodedFormat, audioInputStream);

		int bufferedFramesCount = (int) (decodedFormat.getFrameRate() * 2 * 2 * (50 / 1000f));
		byte[] frameBuffer = new byte[bufferedFramesCount * decodedFormat.getFrameSize()];
        
		double averageLeftLevel = 0;
		long leftLevelCount = 0;
		double averageRightLevel = 0;
		long rightLevelCount = 0;

		while (true) {
			long bytesRead = decodedInputStream.read(frameBuffer);
			if (bytesRead <= 0)
				break;

	        int currentLeftLevel = 0;
	        int currentRightLevel = 0;

			// Assumes that the sample size is 16 bits and two channels are used.
			for (int index = 0; index < bytesRead / 4; index++) {
				int highOrder = (int) frameBuffer[4 * index + (decodedFormat.isBigEndian() ? 0 : 1)];
				int lowOrder = (int) frameBuffer[4 * index + (decodedFormat.isBigEndian() ? 1 : 0)];
				int currentLeftReading = highOrder << 8 | (255 & lowOrder);
	         	currentLeftLevel = Math.max(currentLeftLevel, currentLeftReading); 

				highOrder = (int) frameBuffer[4 * index + 2 + (decodedFormat.isBigEndian() ? 0 : 1)];
				lowOrder = (int) frameBuffer[4 * index + 2 + (decodedFormat.isBigEndian() ? 1 : 0)];
				int currentRightReading = highOrder << 8 | (255 & lowOrder);
	         	currentRightLevel = Math.max(currentRightLevel, currentRightReading); 
			}

			averageLeftLevel += Math.abs(currentLeftLevel);
			++leftLevelCount;
			averageRightLevel += Math.abs(currentRightLevel);
			++rightLevelCount;
		}
		
		averageLeftLevel /= leftLevelCount;
		averageRightLevel /= rightLevelCount;
		
		// Declares the file as silent if the average level of either channel does not exceed 5%.
		return(averageLeftLevel/Math.pow(2, 15)*100 < 5 || averageRightLevel/Math.pow(2, 15)*100 < 5);
	}

	/**
	 * Performs the given operation on the POP3 inbox.
	 * 
	 * @param pop3ServerAddress Specifies the IP address or name of the POP3 server.
	 * @param pop3UserName Specifies the POP3 user name.
	 * @param pop3Password Specifies the POP3 password.
	 * @param pop3operation Specifiest the operation to perform.
	 * @throws Exception Thrown if an error occurs.
	 */
	protected void performPop3Operation(final String pop3ServerAddress, final String pop3UserName, final String pop3Password, Pop3Operation pop3operation) throws Exception {		
		Store store = null;
		Folder folder = null;

		try {
			// Gets the default session.
			Properties props = System.getProperties();
	        props.put("mail.pop3.host", TestData.LogicLayerTest_Pop3ServerAddress); //$NON-NLS-1$
			Session session = Session.getInstance(props, new Authenticator() {
		        /**
		         * @see javax.mail.Authenticator#getPasswordAuthentication()
		         */
		        protected PasswordAuthentication getPasswordAuthentication() {
		            return(new PasswordAuthentication(TestData.LogicLayerTest_Pop3UserName, Type.PASSWORD_TYPE.decryptPassword(TestData.LogicLayerTest_Pop3Password)));
		        }				
			});

			// Gets a POP3 message store and connects to it.
			store = session.getStore("pop3"); //$NON-NLS-1$
			store.connect();

			// Tries to get the default folder.
			folder = store.getDefaultFolder();

			// Tries to get the inbox folder.
			folder = folder.getFolder("INBOX"); //$NON-NLS-1$

			// Opens the folder for read only.
			folder.open(Folder.READ_WRITE);
			
			pop3operation.perform(folder);
			
		} finally {
			// Closes opened resources
			try {
				if (folder != null)
					folder.close(true);
				if (store != null)
					store.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}		
	}
	
	/**
	 * Performs the given operation on the FTP client.
	 * 
	 * @param ftpServerUrl Specifies the URL of the FTP server and the default directory. E.g. 'ftp://ftp.ccbromley.net/public_html'.
	 * @param ftpUserName Specifies the FTP user name.
	 * @param ftpPassword Specifies the FTP password.
	 * @param ftpClientOperation Specifiest the operation to perform.
	 * @return Returns the result of the operation.
	 * @throws Exception Thrown if an error occurs.
	 */
	protected Object performFtpClientOperation(URL ftpServerUrl, String ftpUserName, String ftpPassword, FtpClientOperation ftpClientOperation) throws Exception {
		FTPClient ftpClient = new FTPClient();
        ftpClient.setDefaultTimeout(20000);
        ftpClient.connect(ftpServerUrl.getHost());
        try {
            if(!ftpClient.login(ftpUserName, Type.PASSWORD_TYPE.decryptPassword(ftpPassword)))
            	throw new Exception("The application could not log in to FTP server '"+ftpServerUrl+"' with user name '"+ftpUserName+"' because the user name and/or the password are incorrect."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

            ftpClient.setFileType(FTPClient.IMAGE_FILE_TYPE);
            return ftpClientOperation.perform(ftpClient);
        }
        finally {
            ftpClient.disconnect();                    
        }		
	}
	
	/**
	 * Reads the resource with the given URL using the HTTP protocol and perfroms the given operation
	 * on the input stream.
	 * 
	 * @param url Specifies the URL of the resource to read.
	 * @param operation Specifies the operation to perform on the input stream.
	 * @return Returns the result of the operation. If the input stream is <code>null</code>, it returns <code>null</code>.
	 * @throws Exception Thrown if an error occurs.
	 */
	protected Object performHttpInputStreamOperation(URL url, HttpInputStreamOperation operation) throws Exception {
		InputStream inputStream = null;
		HttpURLConnection connection = null;

		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(10000);
			connection.setReadTimeout(10000);

			// Avoids problems with SSL connections.
			if (connection instanceof HttpsURLConnection) {
				((HttpsURLConnection) connection).setHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
			}

			connection.connect();

			String contentEncoding = connection.getContentEncoding();
			inputStream = connection.getInputStream();

			// Decompresses the input stream if compresses.
			if (contentEncoding != null && contentEncoding.equalsIgnoreCase("gzip")) //$NON-NLS-1$
				inputStream = new GZIPInputStream(inputStream);
			else if (contentEncoding != null && contentEncoding.equalsIgnoreCase("zip")) //$NON-NLS-1$
				inputStream = new ZipInputStream(inputStream);
			
			if(inputStream == null)
				return null;
				
			return operation.perform(inputStream);
		} finally {
			if (inputStream != null)
				try {
					inputStream.close();
				} catch (IOException exception) {}
				
			if (connection != null)
				connection.disconnect();
		}	
	}	
	
	/**
	 * Gets the given file as string by downloading it via HTTP.
	 * 
	 * @param fileURL Specifies the location of the file.
	 * @return Returns the given file as string.
	 * @throws Exception Thrown if an error occurs.
	 */
	protected String getHttpFile(URL fileURL) throws Exception {
		return (String) performHttpInputStreamOperation(fileURL, new HttpInputStreamOperation(){

			public Object perform(InputStream inputStream) throws Exception {
				return getStringFromInputStream(inputStream);
			}});
	}
	
	/**
	 * Compares the Ecore reference values of the given managed elements. The Ecore reference values are considered equal if:
	 * <ul>
	 * <li>they are both <code>null</code> or </li>
	 * <li>they reference the same managed element or</li>
	 * <li>the Ecore reference is a containment reference and both values reference are different managed elements that are equal (see {@link Test#compareMElements(MElement, MElement, boolean, List)}) or</li>
	 * <li>the Ecore reference has multiple values and either of the above tests is true for all Ecore reference values of both managed elements.</li>
	 * </ul>
	 * 
	 * @param mElement1 Specifies the first managed element whose Ecore reference should be compared.
	 * @param mElement2 Specifies the second managed element whose Ecore reference should be compared.
	 * @param eReference Specifies the Ecore reference that should be compared. 
	 * @param onlyMValues Specifies that only the Ecore attribute values of managed values should be compared. If <code>true</code>, the Ecore attribute of the managed value will be compared, not the managed values itself.
	 * @param differences  Specifies a list to record the difference. If the list is empty after the method execution, both Ecore reference values are equal.
	 */
	protected void compareEReference(MElement mElement1, MElement mElement2, EReference eReference, boolean onlyMValues, List<Difference> differences) {
		Object mReferenceValue1 = mElement1.eGet(eReference);
		Object mReferenceValue2 = mElement2.eGet(eReference);
		
		if(mReferenceValue1 == null && mReferenceValue2 == null)
			return;
		
		if(mReferenceValue1 == null && mReferenceValue2 != null || mReferenceValue1 != null && mReferenceValue2 == null) {
			differences.add(new Difference(eReference, mElement1, mElement2));
			return;
		}
		
		// If only comparing managed values, does not compare the managed value references themselves.
		if(onlyMValues && mReferenceValue1 instanceof MValue && mReferenceValue2 instanceof MValue) {
			if(((MValue) mReferenceValue1).getValueEFeature() instanceof EAttribute && ((MValue) mReferenceValue2).getValueEFeature() instanceof EAttribute)
				compareEAttribute(mElement1, mElement2, (EAttribute) ((MValue) mReferenceValue1).getValueEFeature(), differences);
			
			return;
		}
			
		if(!eReference.isMany()) {
			if(!mReferenceValue1.getClass().equals(mReferenceValue2.getClass())
				|| !eReference.isContainment() && mReferenceValue1 != mReferenceValue2) {
				differences.add(new Difference(eReference, mElement1, mElement2));
				return;
			}
			if(eReference.isContainment() && mReferenceValue1 != mReferenceValue2) {
				compareMElements((MElement) mReferenceValue1, (MElement) mReferenceValue2, onlyMValues, differences);
				return;		
			}
		}
		else {
			List<MElement> mReferenceValueList1 = (List<MElement>) mReferenceValue1;
			List<MElement> mReferenceValueList2 = (List<MElement>) mReferenceValue2;
			
			if(mReferenceValueList1.size() != mReferenceValueList2.size()) {
				differences.add(new Difference(eReference, mElement1, mElement2));
				return;
			}
			
			for(int index = 0; index < mReferenceValueList1.size(); ++index)
				compareMElements(mReferenceValueList1.get(index), mReferenceValueList2.get(index), onlyMValues, differences);
		}
	}
	
	/**
	 * Compares the Ecore attribute values of the given managed elements. The Ecore attribute values are considered equal if:
	 * <ul>
	 * <li>they are both <code>null</code> or </li>
	 * <li>their value are equal or</li>
	 * <li>the Ecore attribute is a feature map and all feature values are equal (see {@link Test#compareEAttribute(MElement, MElement, EAttribute, List)} and {@link Test#compareEReference(MElement, MElement, EReference, boolean, List)}) or </li>
	 * <li>the Ecore attribute has multiple values and either of the above tests is true for all Ecore attribute values of both managed elements.</li>
	 * </ul>
	 * 
	 * @param mElement1 Specifies the first managed element whose Ecore reference should be compared.
	 * @param mElement2 Specifies the second managed element whose Ecore reference should be compared.
	 * @param eAttribute Specifies the Ecore attribute that should be compared.
	 * @param differences  Specifies a list to record the difference. If the list is empty after the method execution, both Ecore attribute values are equal.
	 */
	protected void compareEAttribute(MElement mElement1, MElement mElement2, EAttribute eAttribute, List<Difference> differences) {
		Object eAttributeValue1 = mElement1.eGet(eAttribute);
		Object eAttributeValue2 = mElement2.eGet(eAttribute);
		
		if(eAttributeValue1 == null && eAttributeValue2 == null)
			return;
		
		if(eAttributeValue1 == null && eAttributeValue2 != null || eAttributeValue1 != null && eAttributeValue2 == null) {
			differences.add(new Difference(eAttribute, mElement1, mElement2));
			return;
		}

		if (!eAttribute.isMany()) {
			if(!eAttributeValue1.equals(eAttributeValue2)) {
				differences.add(new Difference(eAttribute, mElement1, mElement2));
				return;
			}
		}
		else {
			List eAttributeList1 = (List) eAttributeValue1;
			List eAttributeList2 = (List) eAttributeValue2;
			
			if(eAttributeList1.size() != eAttributeList2.size()) {
				differences.add(new Difference(eAttribute, mElement1, mElement2));
				return;
			}
			
			if (FeatureMapUtil.isFeatureMap(eAttribute)) {
				for (FeatureMap.Entry entry : (List<FeatureMap.Entry>) eAttributeList1) {
					EStructuralFeature entryFeature = entry.getEStructuralFeature();
					if (entryFeature instanceof EAttribute)
						compareEAttribute(mElement1, mElement2, (EAttribute) entryFeature, differences);
					else {
						compareEReference(mElement1, mElement2, (EReference) entryFeature, false, differences);

					}
				}
			} else {
				for(int index = 0; index < eAttributeList1.size(); ++index) {
					eAttributeValue1 = mElement1.eGet(eAttribute);
					eAttributeValue2 = mElement2.eGet(eAttribute);
					
					if(eAttributeValue1 == null && eAttributeValue2 == null)
						return;
					
					if(eAttributeValue1 == null && eAttributeValue2 != null || eAttributeValue1 != null && eAttributeValue2 == null) {
						differences.add(new Difference(eAttribute, mElement1, mElement2));
						return;
					}
					
					if(!eAttributeValue1.equals(eAttributeValue2))
						differences.add(new Difference(eAttribute, mElement1, mElement2));					
				}
			}
		}
	}
	
	/**
	 * Compares the given managed elements. They are considered equal if:
	 * <ul>
	 * <li>they are both <code>null</code> or </li>
	 * <li>they have the same type and all Ecore attribute and reference values are equal (see {@link Test#compareEAttribute(MElement, MElement, EAttribute, List)} and {@link Test#compareEReference(MElement, MElement, EReference, boolean, List)})</li>
	 * </ul>
	 * 
	 * @param mElement1 Specifies the first managed element whose Ecore reference should be compared.
	 * @param mElement2 Specifies the second managed element whose Ecore reference should be compared.
	 * @param onlyMValues Specifies that only the Ecore attribute values of managed values should be compared. If <code>true</code>, the Ecore attribute of the managed value will be compared, not the managed values itself.
	 * @param differences  Specifies a list to record the difference. If the list is empty after the method execution, both managed elements are equal.
	 */
	protected void compareMElements(MElement mElement1, MElement mElement2, boolean onlyMValues, List<Difference> differences) {		
		if(mElement1 == null && mElement2 == null)
			return;
		
		if(mElement1 == null && mElement2 != null) {
			Difference difference = new Difference(mElement2.eClass(), mElement1, mElement2);
			differences.add(difference);
			return;
		}
		
		if(mElement1 != null && mElement2 == null) {
			Difference difference = new Difference(mElement1.eClass(), mElement1, mElement2);
			differences.add(difference);
			return ;
		}
		
		if(!mElement1.eClass().equals(mElement2.eClass())) {
			Difference difference = new Difference(mElement1.eClass(), mElement1, mElement2);
			differences.add(difference);
			return;
		}

		// Compares all Ecore attributes.
		if(!onlyMValues)
			for (EAttribute eAttribute : (List<EAttribute>) mElement1.eClass().getEAllAttributes())
				compareEAttribute(mElement1, mElement2, eAttribute, differences);

		// Compares all ECore references.
		for (EReference eReference : (List<EReference>) mElement1.eClass().getEAllReferences())
			compareEReference(mElement1, mElement2, eReference, onlyMValues, differences);
	}
	
	/**
	 * Verifies whether the given managed objects only differ in the given Ecore features. This method
	 * follows the contaiment references of the managed objects.
	 * 
	 * @param mObject1 Specifies the first managed object whose features are to be compared.
	 * @param mObject2 Specifies the second managed object whose features are to be compared.
	 * @param expectedDifferentEFeaturesIds Specifies the Ecore features that are expect to be different. This parameter can be <code>null</code> to indicate that there are no expected differences.
	 * @return Returns whether the given managed objects only differ in the given Ecore features.
	 */
	protected boolean verifyMObjectDifferences(MObject mObject1, MObject mObject2, int[] expectedDifferentEFeaturesIds) {
		List<Difference> differences = new ArrayList<Difference>();
		compareMElements(mObject1, mObject2, true, differences);
		
		if(expectedDifferentEFeaturesIds == null)
			return differences.size() == 0;
		
		if(differences.size() != expectedDifferentEFeaturesIds.length)
			return false;
		
		Arrays.sort(expectedDifferentEFeaturesIds);
		for(Difference difference: differences) {
			if(!(difference.eNamedElement instanceof EStructuralFeature))
				return false;
			
			if(Arrays.binarySearch(expectedDifferentEFeaturesIds, ((EStructuralFeature) difference.eNamedElement).getFeatureID()) < 0)		
				return false;
		}
		
		return true;
	}
	
	/**
	 * Records the difference between two managed elements.
	 * This class is used to record the difference that the {@link Test#compareMElements(MElement, MElement, boolean, List)},
	 * {@link Test#compareEAttribute(MElement, MElement, EAttribute, List)} and {@link Test#compareEReference(MElement, MElement, EReference, boolean, List)} methods determine.
	 *
	 * @author Marc
	 */
	protected class Difference {
		/** Specifies the Ecore named element that differs. */
		public ENamedElement eNamedElement;
		
		/** Specifies the first managed element that differs with regards to the Ecore named element. */
		public MElement element1;
		
		/** Specifies the second managed element that differs with regards to the Ecore named element. */
		public MElement element2;

		/**
		 * Creates a new Difference object.
		 *
		 * @param eNamedElement Specifies the Ecore named element that differs.
		 * @param element1 Specifies the first managed element that differs with regards to the Ecore named element.
		 * @param element2 Specifies the second managed element that differs with regards to the Ecore named element.
		 */
		public Difference(ENamedElement eNamedElement, MElement element1, MElement element2) {
			this.eNamedElement = eNamedElement;
			this.element1 = element1;
			this.element2 = element2;
		}
	}
	
}

/**
 * Defines an interface for running operations on POP3 folders.
 * 
 * @author Marc
 */
interface Pop3Operation {
	/**
	 * Peforms an operation on the given POP3 folder.
	 * 
	 * @return Returns the result of the operation.
	 * @param folder Specifies the POP3 folder.
	 * @throws Exception Thrown if an error occurs.
	 */
	public Object perform(Folder folder) throws Exception;
}

/**
 * Defines an interface for running operations on an HTTP input stream.
 * 
 *  @author Marc
 */
interface HttpInputStreamOperation {
	/**
	 * Preforms an operation on the given HTTP input stream.
	 * @param inputStream Specifies the HTTP input stream.
	 * 
	 * @return Returns the result of the operation.
	 * @throws Exception Thrown if an error occurs.
	 */
	public Object perform(InputStream inputStream) throws Exception;
}


/**
 * Defines an interface for running operations on an FTP client.
 * 
 *  @author Marc
 */
interface FtpClientOperation {
	/**
	 * Preforms an operation on the given FTP client.
	 * @param ftpClient Specifies the FTP client.
	 * 
	 * @return Returns the result of the operation.
	 * @throws Exception Thrown if an error occurs.
	 */
	public Object perform(FTPClient ftpClient) throws Exception;
}