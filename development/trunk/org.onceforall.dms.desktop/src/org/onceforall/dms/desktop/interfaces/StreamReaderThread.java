/*
 * Revision History:
 * $Log: StreamReaderThread.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:18  marc
 * Added initial revision.
 *
 * Revision 1.2  2006/08/28 15:06:21  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/20 12:59:18  marc
 * First revision after rearchitecting.
 *
 * Revision 1.4  2005/09/04 15:24:38  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.3  2005/04/09 17:57:18  Marc
 * Updated for version 0.4.
 *
 * Revision 1.2  2005/03/18 00:46:55  Marc
 * Added ability to monitor the progress of a command line execution by parsing the output.
 *
 * Revision 1.1  2005/03/04 00:19:11  Marc
 * Implemented mail step and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.onceforall.dms.desktop.logic.MStep;


/**
 * Defines a thread that reads from a given input stream. his class is used by the command line inferface to
 * make sure that all data that is produced by a command line executable is read from the standard and the 
 * error output stream. Only when all data is read, can the <code>execute</code> method of <code>CommandLine</code>
 * return.
 * 
 * @see org.onceforall.dms.desktop.interfaces.CommandLineInterface
 */

public class StreamReaderThread extends Thread {
	/** Specifies the input stream to read from. */
	protected InputStream inputStream;

	/** Specifies the managed step that controls the execution of the command line process. */
	protected MStep mStep;
	
	/** Specifies the output read from the input stream. */
    protected StringBuffer output = new StringBuffer();
    
	/**
	 * Creates a new stream read thread object.
	 *
	 * @param inputStream Specifies the input stream to read from.
     * @param mStep Holds the managed step that controls the execution of the command line process.
	 */
	StreamReaderThread(InputStream inputStream, MStep mStep) {
        this.inputStream = inputStream;       
        this.mStep = mStep;
    }

	/**
	 * Executes the thread body.
	 */
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));


            String line = reader.readLine();
            while(line != null) {
                output.append(line+"\n");
                line = reader.readLine();
                
                if(line != null) {
	                // Attempts to find a progress output and sets it on the step if found.
	                int percentIndex = line.indexOf('%');
	                if(percentIndex >= 0) {
	                    String progress = "";
	                    while(--percentIndex >= 0 && (Character.isDigit(line.charAt(percentIndex)) || line.charAt(percentIndex) == '.'))
	                        if(line.charAt(percentIndex) != '.')
	                            progress = line.charAt(percentIndex)+progress;
	                        else
	                            progress = "";
	                    
	                    if(progress.startsWith("00"))
	                        progress = progress.substring(2);
	                    else if(progress.startsWith("0"))
	                        progress = progress.substring(1);
	                    
	                    // Hack to fix problem with LAME converter unreliability.
	                    if(line.startsWith("average: "))
	                        progress = "100";
	                    
	                    if(progress.length() > 0 && mStep != null) {
	                    		try {
	                    			Long progressValue = new Long(progress);
	                    			mStep.setProgressProperty(progressValue);
	                    		}
	                    		catch(NumberFormatException exception) {}
	                    }
	                }
                }
            }
        } catch (IOException exception) {
			exception.printStackTrace();
		}
    }
    /**
     * Gets the output read from the input stream.
     *
     * @return Returns the output read from the input stream.
     */
    public String getOutput() {
        return(output.toString());
    }
}
