/*
 * Revision History:
 * $Log: DesktopException.java,v $
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
 * Defines an application specific exception. In other words, the exception represents
 * an exception that was raised in the application and not in a underlying library. It
 * does not add any functionality to the <code>Exception</code> class, it exists purely for
 * conceptual reasons.
 */

public class DesktopException extends RuntimeException {
    /** Specifies the index to mark the exception as critical. */
    public static final int CRITICAL_SEVERITY = 4;

    /** Specifies the index to mark the exception as an error. */
    public static final int ERROR_SEVERITY = 3;

    /** Specifies the index to mark the exception as a warning. */
    public static final int WARNING_SEVERITY = 2;

    /** Specifies the index to mark the exception as information. */
    public static final int INFORMATION_SEVERITY = 1;
    
    /** Specifies the severity of the exception. */
    protected int severity;
    
    /** Specifies advice on how to resolve the condition that cause the exception. */
    protected String advice;
    
    /**
     * Creates a new application specific exception object.
     *
     * @param message Specifies the exception message.
     * @param advice Specifies advice on how to resolve the condition that cause the exception. 
     * @param severity Specifies the severity of the exception.
     * @param cause Specifies the exception that triggered this exception.
    */
    public DesktopException(String message, String advice, int severity, Throwable cause) {
        super(message, cause);
        
        this.severity = severity;
        this.advice = advice;
    }
    
    /**
     * Gets the severity of the exception.
     * 
     * @return Returns the severity of the exception.
     */
    public int getSeverity() {
        return severity;
    }
    
    /**
     * Gets advice on how to resolve the condition that cause the exception.
     * 
     * @return Returns advice on how to resolve the condition that cause the exception.
     */
    public String getAdvice() {
        return advice;
    }
    
    /**
     * Gets the exception message including the advice if any.
     * 
     * @return Returns the exception message including the advice if any.
     */
    public String getMessageWithAdvice() {
        if(advice != null)
            return(getMessage()+"\n\n"+advice);
        else
            return(getMessage());
    }
}
