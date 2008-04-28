/*
 * Revision History:
 * $Log: ConversionException.java,v $
 * Revision 1.2  2006/09/19 12:52:11  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:19  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2005/07/20 10:54:33  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.1  2005/03/04 00:19:10  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.exception;

import org.onceforall.dms.desktop.logic.types.Type;

/**
 * Defines an exception that is thrown when a conversion problem occurs.
 */

public class ConversionException extends DesktopException {

    /**
     * Creates a new conversion exception object.
     *
     * @param value Specifies the value to be converted.
     * @param type Specifies the type to convert to.
     * @param pattern Specifies the pattern that was used to convert the value.
     */
    public ConversionException(Object value, Type type, String pattern) {
        super(buildMessage(value, type, pattern), null, ERROR_SEVERITY, null);
    }

    /**
     * Creates a new conversion exception object.
     *
     * @param message Specifies the conversion error message.
     */
    public ConversionException(String message) {
        super(message, null, ERROR_SEVERITY, null);
    }

    /**
     * Constructs the message.
     * 
     * @param value Specifies the value to be converted.
     * @param type Specifies the type to convert to.
     * @param pattern Specifies the pattern that was used to convert the value.
     * @return Returns the message.
     */
    protected static String buildMessage(Object value, Type type, String pattern) {
        String valueString = value != null ? value.toString() : "null";
        
        String result;
        if(type != null)
            result = "The application could not convert '"+valueString+"' to '"+type.getNameForUI()+"'";
        else
            result = "The application could not convert '"+valueString+"'";
        
        if(pattern != null)
            result = result+" using pattern '"+pattern+"'.";
        else
            result = result+".";
        
        return result;
    }
}
