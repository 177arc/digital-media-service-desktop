/*
 * Revision History:
 * $Log: Utilities.java,v $
 */
package org.onceforall.dms.desktop.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;

/**
 * Defines a class with general helper methods for the user interface.
 */

public class Utilities {
	/**
	 * Shows a dialog with step validation exceptions if there are any and - if appropriate - let's the
	 * user decide whether to proceed with the step execution.
	 * 
	 * @param shell Specifies the shell to associate the dialog with.
	 * @param exceptions Specifies the validation exceptions.
	 * @return Returns whether to proceed with the execution of the step.
	 */
	public static boolean showValidationExceptionsDialog(Shell shell, DesktopExceptionList exceptions) {	
		if(exceptions != null && exceptions.size() > 0) {
			int maxSeverity = exceptions.getMaxSeverity();
			int style;
			String title;
			switch(maxSeverity) {
			case DesktopException.ERROR_SEVERITY:
			case DesktopException.CRITICAL_SEVERITY:
				style = SWT.OK | SWT.ICON_ERROR;
				title = "Digital Media Service Desktop Error";
				break;
			case DesktopException.WARNING_SEVERITY:
				style = SWT.YES | SWT.NO | SWT.ICON_WARNING;
				title = "Digital Media Service Desktop Warning";
				break;
			default:
				style = SWT.YES | SWT.NO | SWT.ICON_INFORMATION;
				title = "Digital Media Service Desktop Information";
			}
			
			StringBuilder message = new StringBuilder();
			if(exceptions.getSeverityCount(maxSeverity) <= 1)
				message.append(exceptions.get(0).getMessageWithAdvice()+"\n");
			else {
				appendMessageForSeverity(message, exceptions, maxSeverity);						
			}
			
			if(maxSeverity <= DesktopException.WARNING_SEVERITY) {
				message.append("\nWould you like to continue anyway?");
			}
			
			MessageBox messageBox = new MessageBox(shell, style);
			messageBox.setMessage(message.toString());
			messageBox.setText(title);
			return messageBox.open() == SWT.YES;										
		}
		else
			return true;
		
	}
	
	
	/**
	 * Appends the exceptions for the given severity to the given message. It appends nothing
	 * if there are no exceptions in the given severity.
	 * 
	 * @param message Specifies the message to append to.
	 * @param exceptions Specifies the exceptions from which to append to the message.
	 * @param severity Specifies the severity of the exceptions to be appended to the message.
	 */
	protected static void appendMessageForSeverity(StringBuilder message, DesktopExceptionList exceptions, int severity) {
		if(exceptions.getSeverityCount(severity) == 0)
			return;
		
		switch(severity) {
		case DesktopException.ERROR_SEVERITY:
		case DesktopException.CRITICAL_SEVERITY:
			message.append("Please resolve the following errors:\n\n");
			break;
		case DesktopException.WARNING_SEVERITY:
			message.append("Please review the following warnings:\n\n");
			break;
		default:
			message.append("Please review the following information:\n\n");
		}
		
		for(DesktopException exception: exceptions.getExceptionsForSeverity(severity)) {
			message.append("- "+exception.getMessage());
			
			if(exception.getAdvice() != null)
				message.append(" "+exception.getAdvice());
			
			message.append("\n");
		}
	}
}
