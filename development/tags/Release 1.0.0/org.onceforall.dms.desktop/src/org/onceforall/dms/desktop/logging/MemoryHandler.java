/*
 * Revision History:
 * $Log: MemoryHandler.java,v $
 * Revision 1.2  2006/09/19 12:52:12  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:22  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:18  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2006/03/10 05:06:34  Marc
 * Updated to implement CR 7.
 *
 * Revision 1.1  2005/03/04 00:19:11  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logging;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Defines a logging handler that publishes the logged records. This allows the user interface
 * to display the currently buffered records.
 */

public class MemoryHandler extends Handler {   
    /** Specifies the logged records. */
    List loggedRecords = new ArrayList();
    
    /** Specifies whether a serious has occurred so far. */
    boolean isSevere;
    
    /**
     * @see java.util.logging.Handler#publish(java.util.logging.LogRecord)
     */
    @Override
	public void publish(LogRecord record) {
        loggedRecords.add(record);
        
        if(record.getLevel().equals(Level.SEVERE))
            isSevere = true;
    }

    /**
     * @see java.util.logging.Handler#flush()
     */
    @Override
	public void flush() {
        // Does nothing.
    }

    /**
     * @see java.util.logging.Handler#close()
     */
    @Override
	public void close() throws SecurityException {
        // Does nothing.
    }
    /**
     * Gets the logged records.
     * 
     * @return Returns the logged records.
     */
    public List getLoggedRecords() {
        return loggedRecords;
    }
    
    /**
     * Determines whether a serious has occurred so far.
     * 
     * @return Returns whether a serious has occurred so far.
     */
    public boolean isSevere() {
        return isSevere;
    }
}
