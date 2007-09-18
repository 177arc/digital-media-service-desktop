/*
 * Revision History:
 * $Log: ReadException.java,v $
 * Revision 1.2  2006/09/19 12:52:11  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:19  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/03/04 00:19:10  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.exception;

/**
 * Defines an exception that is thrown when a problem reading applicaton from the DOM occurs.
 */

public class ReadException extends DesktopException {

    /**
     * Creates a new read exception object.
     *
     * @param message Specifies the exception message.
     * @param advice Specifies advice on how to resolve the condition that cause the exception. 
     * @param severity Specifies the severity of the exception.
     * @param cause Specifies the exception that triggered this exception.
     */
    public ReadException(String message, String advice, int severity, Throwable cause) {
        super(message, advice, severity, cause);
    }

    /**
     * Creates a new conversion exception object.
     *
     * @param message Specifies the conversion error message.
     */
    public ReadException(String message) {
        super(message, null, ERROR_SEVERITY, null);
    }
}
