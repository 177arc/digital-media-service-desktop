/*
 * Revision History:
 * $Log: CommandLineInterface.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:18  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:18  marc
 * First revision after rearchitecting.
 *
 * Revision 1.4  2005/04/09 17:57:18  Marc
 * Updated for version 0.4.
 *
 * Revision 1.3  2005/03/18 00:44:35  Marc
 * Added ability to control the command line execution and to monitor progress.
 *
 * Revision 1.2  2005/03/13 14:19:07  Marc
 * Added burn CDs step and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:12  Marc
 * Implemented mail step and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.interfaces;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.StringTokenizer;

import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;


/**
 * Defines the interface to the command line. It enabled the caller to run command line executable, send
 * characters to the input stream and inspect the output/error stream. 
 */

public class CommandLineInterface {
   
    /**
     * Runs a given command together with the specified arguments.
     *
     * @param commandAndArguments Specifies an array containing the command and its arguments. The first element in the array must be the command.
     * @param mStep Holds the managed step that controls the execution of the command line process.
     * @return Returns the output of the command execution. It returns the error text if an error occurs, the normal output otherwise.
     * @throws DesktopException Thrown if an error occurs during the execution.
     */
    public static String execute(String[] commandAndArguments, MStep mStep) throws DesktopException {
        return(execute(commandAndArguments, mStep, null));
    }
  
    /**
     * Runs a given command together with the specified arguments.
     *
     * @param commandAndArguments Specifies an array containing the command and its arguments. The first element in the array must be the command.
     * @param mStep Holds the managed step that controls the execution of the command line process.
     * @param input Specifies the sequence of charaters to be send to the input stream. This is useful if the command requires user interaction after its execution.
     * @return Returns the output of the command execution. It returns the error text if an error occurs, the normal output otherwise.
     * @throws DesktopException Thrown if an error occurs during the execution.
     */
    public static String execute(String[] commandAndArguments, MStep mStep, String input) throws DesktopException {
        Process process = null;
		StreamReaderThread errorReaderThread = null;
        StreamReaderThread resultReaderThread = null;
		String errorOutput = "";
        String resultOutput = "";
        String result = null;

		String osName = System.getProperty("os.name").toLowerCase();
		String[] transformedCommandAndArguments;
		if(commandAndArguments[0].indexOf(File.separatorChar) < 0 && (osName.equals("solaris") || osName.equals("sunos") || osName.equals("linux"))) {
        	// Assumes the command path is the start path if no path is specified and the OS is Solaris or Linux.
			commandAndArguments[0] = MApplication.PATH.getAbsolutePath()+File.separatorChar+commandAndArguments[0];
            transformedCommandAndArguments = removeQuotes(commandAndArguments);
   		}
		else
            transformedCommandAndArguments = tokenise(commandAndArguments);

      	try {
        	process = Runtime.getRuntime().exec(transformedCommandAndArguments);

            if(input != null) {
                OutputStream outputStream = process.getOutputStream();
            	outputStream.write(input.getBytes());
				outputStream.close();
      		}

			errorReaderThread = new StreamReaderThread(process.getErrorStream(), mStep);
			resultReaderThread = new StreamReaderThread(process.getInputStream(), mStep);
			errorReaderThread.start();
			resultReaderThread.start();
			
			// Indicates whether the process has been terminated forcefully.
			boolean terminated = false;
			int errorCode = 0;
            try {
                while(resultReaderThread.getState() != Thread.State.TERMINATED
                        && errorReaderThread.getState() != Thread.State.TERMINATED) {
                    Thread.sleep(500);
                    
                    if(mStep != null && (mStep.getStateProperty().equals(MStepStateType.TERMINATING_STATE) || mStep.getStateProperty().equals(MStepStateType.TERMINATED_STATE))) {
                        process.destroy();
                        terminated = true;
                        break;
                    }
                }
                
                errorReaderThread.join();
				resultReaderThread.join();
				errorCode = process.waitFor();
			}
            catch(InterruptedException exception) {
				throw new DesktopException("The application could not execute command \""+StringArrayUtility.getString(commandAndArguments)+"\".", "Please contact your administrator.", DesktopException.CRITICAL_SEVERITY, exception);
            }

            errorOutput = errorReaderThread.getOutput();
            resultOutput = resultReaderThread.getOutput();
            
            if(errorOutput != null && errorOutput.length() > 0)
                result = errorOutput;
            else
                result = resultOutput;
            
            // Throws an exception only if the error code is not 0 and the process has not been terminated forcefully.
			if(errorCode != 0 && !terminated)
				throw new DesktopException("The command \""+StringArrayUtility.getString(commandAndArguments)+"\" reported the following error during the execution:\n\n"+result, "Please contact your administrator.", DesktopException.CRITICAL_SEVERITY, null);
		}
      	catch(IOException exception) {
			throw new DesktopException("The system could not execute command \""+StringArrayUtility.getString(commandAndArguments)+"\".", "Please contact your administrator.", DesktopException.CRITICAL_SEVERITY, exception);
       	}

        return(result);
    }
    
    /**
     * Removes single and double quotes from each element in the command line array
     * 
     * @param commandAndArguments Specifies the command line array
     * @return Returns the command line array with each element stripped of quotes.
     */
    protected static String[] removeQuotes(String[] commandAndArguments) {
        String[] result = new String[commandAndArguments.length];

        for(int index = 0; index < commandAndArguments.length; ++index)
            result[index] = removeQuotesFromArgument(commandAndArguments[index]);

		return(result);
	}
    
    /**
     * Removes single and double quotes the given command line argument.
     * 
     * @param argument Specifies the command line argument from which to remove the quotes.
     * @return Returns a string without the quotes.
     */
    protected static String removeQuotesFromArgument(String argument) {
        StringBuffer result = new StringBuffer();

        char character;
        for(int index = 0; index < argument.length(); ++index) {
			character = argument.charAt(index);
            if(character != '"' && character != '\'')
				result.append(character);
		}

        return(result.toString());
   	}
    
    
    /**
     * Tokenises each element of the given command line array.
     * 
     * @param commandAndArguments Specifies the command line array
     * @return Returns a string array with the command line elements broken down by whitespace they contained.
     */
    protected static String[] tokenise(String[] commandAndArguments) {
        String[] result = {};
        
        for(int index = 0; index < commandAndArguments.length; ++index)
			result = StringArrayUtility.append(result, tokeniseArgument(commandAndArguments[index]));

      	return(result);
    }

    /**
     * Tokenises each element of the given command line argument, i.e. break it down by whitespace.
     * 
     * @param argument Specifies the command line argument to tokenise.
     * @return Returns the tokenised command line argument.
     */
    protected static String[] tokeniseArgument(String argument) {
		String result[];
		int count = 0;
		StringTokenizer tokeniser;
		
		tokeniser = new StringTokenizer(argument);
		count = tokeniser.countTokens();
		
		result = new String[count];
		tokeniser = new StringTokenizer(argument);
		count = 0;
		while (tokeniser.hasMoreTokens()) {
			result[count++] = tokeniser.nextToken();
		}

        return(result);
	}
}
