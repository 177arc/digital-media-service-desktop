/**
 * Revision History:
 * $Log: Test.java,v $
 * Revision 1.3  2006/10/17 02:35:20  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:54:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:47:19  marc
 * Updates because of project restruturing.
 *
 * Revision 1.2  2006/08/28 15:25:52  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/21 15:11:59  marc
 * Added initial revision.
 *
 */
package org.onceforall.core.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Defines the base class for all tests. It provides useful method that sub classes 
 * can use in the test implementations.
 *
 * @author Marc
 */
public class Test {
	/**
	 * Recursively deletes all files in the given directory.
	 * 
	 * @param directory Specifies the directory to delete.
	 * @return Returns whether the directory could be deleted successfully.
	 */
    protected boolean deleteAllFiles(File directory) {
        if(!directory.exists())
            return true;

        boolean result = true;
        if(directory.isDirectory()) {
            File[] files = directory.listFiles();
            for(File file: files)
            	result &= deleteAllFiles(file);

            result = directory.delete();
        }
        else
        	result = directory.delete();
  
        return result;
    }
    
    /**
     * Converts the given input stream into a string by reading the input stream completely.
     * It also closes the input stream.
     * 
     * @param inputStream Specifies the input stream to converted.
     * @return Returns the converted input stream.
     * @throws IOException Thrown if an error occurs while trying to read from the input stream.
     */
    protected String getStringFromInputStream(InputStream inputStream) throws IOException {
    	return getStringFromInputStream(inputStream, true);
    }
    
    /**
     * Converts the given input stream into a string by reading the input stream completely.
     * It also closes the input stream depending of the <code>closeStream</code> parameter.
     * 
     * @param inputStream Specifies the input stream to converted.
     * @param closeStream Specifies whether to close the input stream.
     * @return Returns the converted input stream.
     * @throws IOException Thrown if an error occurs while trying to read from the input stream.
     */
    protected String getStringFromInputStream(InputStream inputStream, boolean closeStream) throws IOException {
    	StringBuilder builder = new StringBuilder();
    	
    	if(inputStream.markSupported())
    		inputStream.reset();
    	
    	try {
	    	byte[] buffer = new byte[4096];
	    	while(true) {
	    		int bytesRead = inputStream.read(buffer);
	    		if(bytesRead <= 0)
	    			break;
	    		
	    		builder.append(new String(buffer, 0, bytesRead));
	    	}
    	}
    	finally {
    		if(closeStream)
    			inputStream.close();
    	}
    	
    	return builder.toString();
    }
	
	/**
	 * Supends the execution for the given number of milliseconds.
	 * 
	 * @param timeout Specifies the timeout period in of milliseconds.
	 */
	protected void sleep(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {}
	}
	
	/**
	 * Determines whether the given URL points to a non-empty, accessible resource. To determine
	 * this it tries to read the first byte from the content stream.
	 * 
	 * @param url Specifies the URL.
	 * @return Returns whether the given URL points to a non-empty, accessible resource.
	 */
	protected boolean isUrlContentNotEmpty(URL url) {
		InputStream stream = null;
		try {
			stream = url.openStream();
			return stream.read() >= 0;
		}
		catch(IOException exception) {
			return false;
		}
		finally {
			if(stream != null)
				try {
					stream.close();
				}
				catch(IOException e) {
				}
		}
	}
}
