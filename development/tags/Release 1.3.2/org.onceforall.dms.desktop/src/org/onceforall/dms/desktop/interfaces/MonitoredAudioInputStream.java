/*
 * Revision History:
 * $Log: MonitoredAudioInputStream.java,v $
 * Revision 1.3  2006/10/17 02:32:27  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:18  marc
 * Added initial revision.
 *
 * Revision 1.2  2006/08/28 15:06:21  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/20 12:59:16  marc
 * First revision after rearchitecting.
 *
 * Revision 1.5  2005/09/04 15:24:38  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.4  2005/07/20 10:54:33  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.3  2005/04/09 17:57:18  Marc
 * Updated for version 0.4.
 *
 * Revision 1.2  2005/03/18 00:45:20  Marc
 * Added additional flags to indicate the status of the stream.
 *
 * Revision 1.1  2005/03/13 14:31:28  Marc
 * Added burn CDs step and generally improve application.
 *
 */
package org.onceforall.dms.desktop.interfaces;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.notify.impl.NotifierImpl;
import org.eclipse.emf.common.util.EList;
import org.onceforall.dms.desktop.logging.Logger;

/**
 * Defines an audio input stream that provides level readings even if it is not read by another object. In order to implement the
 * described behaviour, this stream starts a thread that reads from the underlying stream, while no other object reads from it.
 */

public class MonitoredAudioInputStream extends AudioInputStream implements Notifier {
    /** Specifies the frame buffer size in milliseconds. */
    public static final long FRAME_BUFFER_SIZE = 50;

    /** Specifies the number of consecutive readings that have to be the same to trigger a distortion alert. */
    public static final long DISTORTION_READINGS_COUNT = 12;
    
    /** Specifies the maximum level. */
    public static final int MAXIMUM_LEVEL = 32768;
    
    /** Specifies the time length in milliseconds for which a distortion alert remains set before being cleared. */
    public static final long DISTORTION_ALTERT_TIME = 1*2000;
    
    /** Specifies the buffer that temporarily holds the frames read from the audio input stream. */
    protected byte[] frameBuffer;
    
    /** Specifies the current write position of the frame buffer. */
    protected int frameBufferIndex;
    
    /** Specifies the reader thread that reads from the audio input stream while no other class reads from it. */
    protected AudioInputStreamReaderThread reader;
    
    /** Indicates whether the reader thread should be terminated. */
    protected boolean terminateReader;
    
    /** Indicates whether the reader thread should be suspended. */
    protected boolean suspendReader;
    
    /** Specifies the thread which is currently reading externally from the stream. */
    protected Thread externalReaderThread;

	/** Specifies the current left level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}. */
    protected int leftLevel;
    
    /** Specifies the current right level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}. */
    protected int rightLevel;
    
    /** Indicates whether the left input signal is distorted. */
    protected boolean leftDistorted;
    
    /** Indicates whether the right input signal is distorted. */
    protected boolean rightDistorted;
    
    /** Specifies the time when the distortion on the left channel was detected. The time is used to reset an alert after a short time after it occurred. */
    protected long leftDistortedTime;
    
    /** Specifies the time when the distortion on the right channel was detected. The time is used to reset an alert after a short time after it occurred. */
    protected long rightDistortedTime;

    /** Indicates whether the distortion alert for the left channel is set. The alert remains set for a short time after a possible distortion has been detected. */
    protected boolean leftDistortionAlert;

    /** Indicates whether the distortion alert for the right channel is set. The alert remains set for a short time after a possible distortion has been detected. */
    protected boolean rightDistortionAlert;
    
    /** Specifies the line to read from. */
    protected TargetDataLine line;
    
    /** Specifies the audio format of the audio input stream. */
    protected AudioFormat audioFormat;
    
    /** Indicates whether the closing of the stream has been requested. */
    protected boolean closeRequested;
    
    /** Indicates whether the pausing of the stream has been requested. */
    protected boolean pauseRequested;
    
    /** Indicates whether the stream is closed. */
    protected boolean closed;
    
    /** Indicates whether the stream is paused. */
    protected boolean paused;
    
    /** Specifies the notifier to hold all adapters of this object.
      * The notifier is added by delegation and not inheritance because Java does not
      * support multiple inheritance and this class HAS TO inherit from Notifier. */
    protected Notifier notifier;
    
    /** Specifies the event that is triggered when the levels change. */
    protected Notification levelsChangedNotification;
    
    /** Specifies the last readings from the left channel. */
    protected List lastLeftReadings = new LinkedList();
    
    /** Specifies the last readings from the right channel. */
    protected List lastRightReadings = new LinkedList();
    
    /**
     * Updates the level reading by analysing the content of the frame buffer. It resets the buffer write index after updating the level reading.
     */
    protected void updateLevels() {
        int currentLeftLevel = 0;
        int currentRightLevel = 0;
        
        int distortionLeftReading = 0;
        int distortionLeftCount = 0;
        
        int distortionRightReading = 0;
        int distortionRightCount = 0;

         // Assumes that the sample size is 16 bits and two channels are used.
         int bufferedFramesCount = frameBuffer.length / 2 / 2; 
         for (int index = 0; index < bufferedFramesCount; index++) { 
            /* First byte is MSB (high order) */ 
            int MSB = (int) frameBuffer[4 * index + (format.isBigEndian() ? 0 : 1)]; 
         	/* Second byte is LSB (low order) */ 
         	int LSB = (int) frameBuffer[4 * index + (format.isBigEndian() ? 1 : 0)];
         	int currentLeftReading = MSB << 8 | (255 & LSB);

         	currentLeftLevel = Math.max(currentLeftLevel, Math.abs(currentLeftReading));
            
         	/* First byte is MSB (high order) */ 
            MSB = (int) frameBuffer[4 * index + 2 + (format.isBigEndian() ? 0 : 1)]; 
         	/* Second byte is LSB (low order) */ 
         	LSB = (int) frameBuffer[4 * index + 2 + (format.isBigEndian() ? 1 : 0)]; 
         	int currentRightReading = MSB << 8 | (255 & LSB);
         	
        	currentRightLevel = Math.max(currentRightLevel, Math.abs(currentRightReading));
          	

          	// Attempts to detect a distorted signal.

          	if(currentLeftReading/(float)MAXIMUM_LEVEL > 0.05 && distortionLeftReading > leftLevel*0.95f && currentLeftReading >= distortionLeftReading*0.95 && currentLeftReading <= distortionLeftReading*1.05)
          	   ++distortionLeftCount;
          	else {
          	    leftDistorted = false;
          	    distortionLeftCount = 0;
              	distortionLeftReading = currentLeftReading;
          	}

          	if(distortionLeftCount >= DISTORTION_READINGS_COUNT) {   	       
           	   leftDistorted = true;
       	       leftDistortedTime = System.currentTimeMillis();
       	   	   leftDistortionAlert = true;
           	}
          	
          	if(currentRightReading/(float) MAXIMUM_LEVEL > 0.05 && distortionRightReading > rightLevel*0.95f && currentRightReading >= distortionRightReading*0.95 && currentRightReading <= distortionRightReading*1.05)
           	   ++distortionRightCount;
          	else {
          	    rightDistorted = false;
          	    distortionRightCount = 0;
              	distortionRightReading = currentRightReading;
          	}
          	    
          	if(distortionRightCount >= DISTORTION_READINGS_COUNT) {   	       
          	   rightDistorted = true;
      	       rightDistortedTime = System.currentTimeMillis();
      	   	   rightDistortionAlert = true;
          	}
        	/*if(leftLevel/(float) MAXIMUM_LEVEL > 0.05 && distortionLeftReading > leftLevel*0.8 && currentLeftReading < -leftLevel*0.8) {
        		System.out.println(leftLevel+", "+currentLeftReading+", "+distortionLeftReading);
        	}
          	if(leftLevel/(float) MAXIMUM_LEVEL > 0.05 && distortionLeftReading > leftLevel*0.8 && currentLeftReading < -leftLevel*0.8) {	       
            	   leftDistorted = true;
        	       leftDistortedTime = System.currentTimeMillis();
        	   	   leftDistortionAlert = true;
            }
          	else
          		leftDistorted = false;
          	
            distortionLeftReading = currentLeftReading;

            if(rightLevel/(float) MAXIMUM_LEVEL > 0.05 && distortionRightReading > rightLevel*0.8 && currentRightReading < -rightLevel*0.8) {	       
         	   rightDistorted = true;
     	       rightDistortedTime = System.currentTimeMillis();
     	   	   rightDistortionAlert = true;
            }
            else
            	rightDistorted = false;
       	
            distortionRightReading = currentRightReading;*/
         } 
         
         frameBufferIndex = 0;
         //int adjustedLeftLevel = (int) Math.round(Math.max(Math.log10(Math.abs(currentLeftLevel))/Math.log10(32767f)-0.5, 0)/0.5*100);
         leftLevel = currentLeftLevel;
         rightLevel = currentRightLevel;                  
         
         /*?if(currentLeftLevel >= MAXIMUM_LEVEL*0.85) {
   	       leftDistorted = true;
 	       leftDistortedTime = System.currentTimeMillis();
 	   	   leftDistortionAlert = true;             
         }
         else
             leftDistorted = false;*/
       	
       	if(!leftDistorted && System.currentTimeMillis() - leftDistortedTime > DISTORTION_ALTERT_TIME)
       	   leftDistortionAlert = false;
         
       	/*? if(currentLeftLevel >= MAXIMUM_LEVEL*0.85 || currentRightLevel >= MAXIMUM_LEVEL*0.85) {
   	       rightDistorted = true;
 	       rightDistortedTime = System.currentTimeMillis();
 	   	   rightDistortionAlert = true;             
         }
         else
             rightDistorted = false; */
      	
      	if(!rightDistorted && System.currentTimeMillis() - rightDistortedTime > DISTORTION_ALTERT_TIME)
      	   rightDistortionAlert = false;

         eNotify(levelsChangedNotification);
    }
    
    /**
     * @see java.io.Closeable#close()
     */
    public void close() throws IOException {        
        closeRequested = true;
        
        while(!closed)
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
    }
    
    /**
     * Stop the audio stream. While the stream is stopped the monitor level reader will read from the audio stream
     * to update the level readings.
     */
    public void stop() {	    
    	try {
	    	close();
	    } catch (IOException exception) {}
    }
    
    /**
     * Pauses the audio stream. While the stream is paused the monitor level reader will read from the audio stream
     * to update the level readings.
     */
    public void pause() {
        pauseRequested = true;
    }
    
    /**
     * Resumes the audio stream. While the stream is read, the stream is analysed to updated the level monitor readings.
     */
    public void resume() {
        pauseRequested = false;
    }
   
    /**
     * Reads directly from the underlying audio stream, bypassing the frame buffering and level analysis.
     * 
     * @param buffer Specifies the buffer into which the data is read.
     * @param offset Specifies the offset, from the beginning of array b, at which the data will be written.
     * @param length Specifies the maximum number of bytes to read.
     * @return Returns the total number of bytes read into the buffer, or <code>-1</code> if there is no more data because the end of the stream has been reached.
     * @throws IOException Thrown if an input or output error occurs.
     */
    protected int readDirectly(byte[] buffer, int offset, int length) throws IOException {
        return super.read(buffer, offset, length);
    }
    
    /**
     * @see java.lang.Object#finalize()
     */
    protected void finalize() throws Throwable {
        // Terminates the reader before releasing all resources.
        terminateReader = true;
        reader.join();
        line.stop();
        super.close();
        
        super.finalize();
    }
    
    /**
     * Creates a monitored audio input stream that reads its data from the target data line indicated. The format of the stream is the same as that of the target data line, and the length is AudioSystem#NOT_SPECIFIED. 
     *
     * @param line Specifies the target data line from which this stream obtains its data. The line should be opened, but not started.
     */
    protected MonitoredAudioInputStream(TargetDataLine line) {
        super(line);

        if(line == null)
            throw new IllegalArgumentException("The parameter 'line' cannot be empty.");
        
        // Creates a buffer that can hold all frames that are read in 1/100 second.
        int bufferedFramesCount = (int) (format.getFrameRate() * 2* 2 *(FRAME_BUFFER_SIZE/1000f));
        frameBuffer = new byte[bufferedFramesCount*format.getFrameSize()];
        levelsChangedNotification = new NotificationImpl(Notification.NO_FEATURE_ID, null, null);
        notifier = new NotifierImpl();
        
        closed = true;
        
        /**try {
        	Line lineIn = AudioSystem.getLine(Port.Info.LINE_IN);
        	lineIn.open();
        	CompoundControl mixer = (CompoundControl) lineIn.getControls()[0];
        	FloatControl control = (FloatControl) mixer.getMemberControls()[0];
        	control.setValue(control.getMaximum());
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
               
        line.start();
        
        reader = new AudioInputStreamReaderThread();
        reader.start();    
    }
    
    /**
     * @see java.io.InputStream#read(byte[])
     */
    public int read(byte[] buffer) throws IOException {
        return read(buffer, 0, buffer.length);
    }
    
    /**
     * @see java.io.InputStream#read(byte[], int, int)
     */
    public int read(byte[] buffer, int offset, int length) throws IOException {		
		synchronized(this) {
    		if(externalReaderThread != null 
    				&& externalReaderThread != Thread.currentThread())
    			throw new IOException("The thread '"+externalReaderThread.getName()+"' is currently reading from the audio input. Only one thread can read from the audio input at any point in time.");
        	
    		externalReaderThread = Thread.currentThread();
		}

		try {    			
	        	if(pauseRequested) {
		            // Activates level monitor reader and waits till the pause request is reversed.
	    			suspendReader = false;
		            paused = true;
		            while(pauseRequested && !closeRequested)
		                try {
		                    Thread.sleep(FRAME_BUFFER_SIZE);
		                } catch (InterruptedException exception) {}
		        }
		        
		        if(closeRequested) {
		            pauseRequested = false;
		            closeRequested = false;
		            suspendReader = false;
		            closed = true;
		            
				    synchronized(this) {
				    	externalReaderThread = null;
				    }
				    
		            return(-1);
		        }
		        
		        closed = false;
		        paused = false;
	        
	        	suspendReader = true;
	        	synchronized(frameBuffer) {	
			        int bytesRead = super.read(buffer, offset, length);
			        //?System.out.println("Buffer size: "+buffer.length+", offset: "+offset+", length "+length);
			        
			        
			        for(int index = offset; index < bytesRead+offset; ++index) {
			            frameBuffer[frameBufferIndex++] = buffer[index];
			            
			            if(frameBufferIndex >= frameBuffer.length)
			                updateLevels();
			        }
		        
		        	return(bytesRead);
	        	}
	        }
        	catch(RuntimeException exception) {
    	    	externalReaderThread = null;
    	    	
    	    	throw exception;
        	}
        	catch(Error exception) {
    	    	externalReaderThread = null;
    	    	
    	    	throw exception;
        	}
        	catch(IOException exception) {
    	    	externalReaderThread = null;
    	    	
    	    	throw exception;
        	}
    }
    
    /**
     * Gets the current left level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}.
     * 
     * @return Returns the current left level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}.
     */
    public int getLeftLevel() {
        return leftLevel;
    }
    
    /**
     * Gets the current right level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}.
     * 
     * @return Returns the current right level reading of the input stream as value between 0 and {@link #MAXIMUM_LEVEL}.
     */
    public int getRightLevel() {
        return rightLevel;
    }

	/**
	 * Gets the thread which is currently reading externally from the stream.
	 * 
	 * @return Returns the thread which is currently reading externally from the stream.
	 * @see #externalReaderThread
	 */
	public synchronized Thread getExternalReaderThread() {
		return externalReaderThread;
	}

    /**
     * Defines the thread that constantly reads from the audio input stream into a buffer while,
     * the stream is not read by another object. This allows the monitored audio input stream to
     * provide level readings even if the audio stream is not read.
     */
    protected class AudioInputStreamReaderThread extends Thread {
        /**
         * Creates a new audio input stream reader thread.
         */
        public AudioInputStreamReaderThread() {
            super("Audio input stream reader");
        }
        
        /**
         * @see java.lang.Runnable#run()
         */
        public void run() {
            try {
	            while(!terminateReader) {
	                synchronized(frameBuffer) {
		                if(!suspendReader) {
	                        // Makes sure that the stream can be read again externally if it is not paused.
		                    if(!pauseRequested)
		                        closeRequested = false;
		                    
		                    int bytesRead = 1;
		                    
		                    // Reads from the stream into the frame buffer till the frame buffer is full.
		                    while(bytesRead > 0) {
		                            bytesRead = readDirectly(frameBuffer, frameBufferIndex, frameBuffer.length-frameBufferIndex);
		                        
		                        if(bytesRead >= 0)
		                            frameBufferIndex += bytesRead;
		                        
		                        if(frameBufferIndex == frameBuffer.length) {
		                            updateLevels();
		                            break;
		                        }
		                    }
		                }
	                }
	                
	                try {
	                    Thread.sleep(FRAME_BUFFER_SIZE/2);
	                } catch (InterruptedException exception) {}
	            }
            } catch (IOException exception) {
                Logger.getLogger().log(Level.SEVERE, exception.getMessage(), exception);
            }
        }
    }
    
    /**
     * Determines whether the stream is closed.
     * 
     * @return Returns whether the stream is closed.
     */
    public boolean getClosed() {
        return closed;
    }
    
    /**
     * Deterimes whether the stream is paused.
     * 
     * @return Returns whether the stream is paused.
     */
    public boolean getPaused() {
        return paused;
    }
    
    /**
     * Gets whether the distrortion alert for the left channel is set. The alert remains set for a short time after a possible distortion has been detected.
     * 
     * @return Returns whether the distrortion alert is set. The alert remains set for a short time after a possible distortion has been detected.
     */
    public boolean getLeftDistortionAlert() {
        return leftDistortionAlert;
    }
    
    /**
     * Gets whether the distrortion alert for the right channel is set. The alert remains set for a short time after a possible distortion has been detected.
     * 
     * @return Returns whether the distrortion alert is set. The alert remains set for a short time after a possible distortion has been detected.
     */
    public boolean getRightDistortionAlert() {
        return rightDistortionAlert;
    }

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eAdapters()
	 */
	public EList eAdapters() {
		return notifier.eAdapters();
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eDeliver()
	 */
	public boolean eDeliver() {
		return notifier.eDeliver();
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	public void eNotify(Notification notification) {
		notifier.eNotify(notification);
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eSetDeliver(boolean)
	 */
	public void eSetDeliver(boolean deliver) {
		notifier.eSetDeliver(deliver);
	}


}
