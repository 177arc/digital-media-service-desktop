/*
 * Revision History:
 * $Log: Humaniser.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.2  2005/03/18 00:42:48  Marc
 * Added duration formatter.
 *
 * Revision 1.1  2005/03/04 00:19:02  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines helper methods and objects for transformating data into user-friendly, human-readable format.
 */

public class Humaniser {
    /** Specifies the number formatter. */
    public static final NumberFormat NUMBER_FORMATTER = NumberFormat.getIntegerInstance();
    
    /** Specifies the date formatter. */
    public static final DateFormat DATE_FORMATTER = DateFormat.getDateTimeInstance();
    
    /** Specifies the durration formatter. 23*60*60*1000 milliseconds have to be added when formatting a duration in milliseconds. */
    public static final DateFormat DURATION_FORMATTER = new SimpleDateFormat("HH:mm:ss");
    
    /**
     * Converts a boolean value into either "Yes" or "No".
     *
     * @param value Holds the value to be converted.
     * @return Returns the converted value.
     */
    public static String getBooleanForUI(boolean value) {
        return value ? "Yes" : "No";
    }
    
    /**
     * Converts "Yes" or "No" into a boolean value.
     *
     * @param text Holds the text to be converted.
     * @return Returns the converted value.
     * @throws ConversionException Thrown if the text is not "Yes" or "No".
     */
    public static boolean getBooleanFromUI(String text) throws ConversionException {
        if(text.equals("Yes"))
            return(true);
        else if(text.equals("No"))
            return(false);
        else
            throw new ConversionException("The application could not convert the text '"+text+"' to a boolean.");
    }
}
