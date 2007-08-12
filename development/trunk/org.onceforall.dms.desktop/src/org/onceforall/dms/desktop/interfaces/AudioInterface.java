/*
 * Revision History:
 * $Log: AudioInterface.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:18  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:18  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2005/03/18 00:43:41  Marc
 * Added method for calculating the size of recording file.
 *
 * Revision 1.1  2005/03/13 14:31:28  Marc
 * Added burn CDs step and generally improve application.
 *
 */
package org.onceforall.dms.desktop.interfaces;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

/**
 * Defines the interface to the audio system. It provides access to a single instance of 
 * a monitored audio input stream from which recordings can be made and the input level
 * monitored.
 * 
 * @see MonitoredAudioInputStream
 */

public class AudioInterface {
    /** Specifies the frame rate of the monitored audio input stream in frame per second. */
    public static final int FRAME_RATE = 44100;

    /** Specifies the audio format of monitored audio input stream. */
    public static final AudioFormat FORMAT = new AudioFormat(FRAME_RATE, 16, 2, true, true);
    
    /** Specifies the instance of the monitored audio input stream from which audio data can be read. */
    protected static MonitoredAudioInputStream monitoredAudioInputStream;

    /**
     * Gets the monitored audio input stream.
     *
     * @return Returns the monitored audio input stream.
     * @throws LineUnavailableException Thrown if the line is not available.
     */
    public static synchronized MonitoredAudioInputStream getMonitoredAudioInputStream() throws LineUnavailableException {
        if(monitoredAudioInputStream == null) {
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, FORMAT);
	    
            TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);
	        
	        // Buffers up to ten seconds. A frame here uses 4 bytes (stereo+16 bit).
	        line.open(FORMAT, FRAME_RATE*4*10);

            monitoredAudioInputStream = new MonitoredAudioInputStream(line);
        }
        
        return monitoredAudioInputStream;
    }
    
    /**
     * Calculates the length of a recording file in milliseconds from the size of the given file. 
     *
     * @param file Holds the recording file for which to calculate the length. (mandatory)
     * @return Returns the length of a recording file in milliseconds from the size of the given file. 
     */
    public static long calculateLength(File file) {
        if(file == null)
            throw new IllegalArgumentException("The parameter 'file' cannot be empty.");
        
        return(Math.round(file.length()/AudioInterface.FORMAT.getFrameRate()/AudioInterface.FORMAT.getFrameSize()*1000));
    }
}
