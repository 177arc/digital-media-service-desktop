/*
 * Revision History:
 * $Log: Main.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.3  2005/05/22 16:55:48  Marc
 * Refactored main form/composite.
 *
 * Revision 1.2  2005/03/13 14:20:40  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:09  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop;

import java.net.BindException;
import java.net.ServerSocket;
import java.text.DateFormat;
import java.util.logging.Level;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.ui.MainComposite;


/**
 * Defines the main application. It initiatiates the main form and then displays it.
 */

public class Main {    
    /** Specifies the global date formatter for the application. */
    public static final DateFormat DATE_FORMATTER = DateFormat.getDateTimeInstance();
    
    /** Specifies the application path. */
    public static final String APPLICATION_PATH = System.getProperty("user.dir");

	/**
	 * Executes the application.
	 *
	 * @param arguments Specifies the command line arguments.
	 */
	public static void main(String[] arguments) {		
		try {
	        Logger.getLogger().info("Application started.");      
	        
            // Displays the main form.         
             MainComposite.show();
	    } catch (Throwable throwable) {
        	Logger.getLogger().log(Level.SEVERE, "Application terminated with error: "+throwable.getMessage(), throwable);
            System.exit(-1);
        }
        
        Logger.getLogger().info("Application stopped.");
        System.exit(0);
	}
}
