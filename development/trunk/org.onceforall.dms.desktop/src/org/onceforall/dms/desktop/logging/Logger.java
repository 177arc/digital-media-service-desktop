/*
 * Revision History:
 * $Log: Logger.java,v $
 * Revision 1.2  2006/09/19 12:52:12  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:22  marc
 * Added initial revision.
 *
 * Revision 1.2  2006/08/28 15:06:24  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/20 12:59:19  marc
 * First revision after rearchitecting.
 *
 */

package org.onceforall.dms.desktop.logging;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.SimpleFormatter;

/**
 * Defines the logger for the application by subclassing the Java 
 * logger. It registers a file and a memory handler to support both
 * logging to a file and to a viewer in the application.
 * 
 * @see java.util.logging.Logger
 * @author Marc
 */
public class Logger extends java.util.logging.Logger {
	/** Specifies the name of the logger. */
	public static String NAME = "org.onceforall.dms.desktop";
	
    /** Specifies the global file date formatter for the application. */
    protected static final DateFormat FILE_DATE_FORMATTER = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
    
    /** Specifies the log file name. */
    protected String logFileName;

	public Logger() {
		super(NAME, null);
		
        // Creates all required sub directories.
        new File("Log Files").mkdirs();
        
        // Configures the logger.
        MemoryHandler memoryHandler = new MemoryHandler();
    	addHandler(memoryHandler);
        logFileName = getLogFilePath("Logged events");
        try {
        	FileHandler fileHandler = new FileHandler(logFileName);
        	fileHandler.setFormatter(new SimpleFormatter());
        	addHandler(fileHandler);
        }
        catch(IOException exception) {
        	System.err.println("The application could not initialise the logger that writes to the file '"+logFileName+"'.");
        	exception.printStackTrace();
        }
	}
	
	/**
	 * Gets the log file path based on the given file name (part). For example, for <code>Logged events</code>
	 * the following will be returned: <code>Log Files\Logged events (from 20-Sep-2008 14-36-00 onwards).txt</code>.
	 * 
	 * @param baseFileName Specifies the file name base part of the log file path.
	 * @return Returns the log file path based on the given file name (part).
	 */
	public static String getLogFilePath(String baseFileName) {
		return "Log Files\\"+baseFileName+" (from "+FILE_DATE_FORMATTER.format(new Date())+" onwards).txt";
	}
	
	/**
	 * Gets the logger. If the logger has not been created yet, it creates it.
	 * 
	 * @return Returns the logger instance.
	 */
    public static synchronized Logger getLogger() {
    	LogManager manager = LogManager.getLogManager();
    	Logger result = (Logger) manager.getLogger(NAME);
    	if (result == null) {
    	    result = new Logger();
    	    manager.addLogger(result);
    	    result = (Logger) manager.getLogger(NAME);
    	}
    	
    	return result;
    }
    

    /**
     * Gets the log file name.
     * 
     * @return Returns the log file name.
     */
    public String getLogFileName() {
        return logFileName;
    }
}
