/*
 * Revision History:
 * $Log: Utilities.java,v $
 * Revision 1.3  2007/05/12 10:56:35  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:21  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:20  marc
 * First revision after rearchitecting.
 *
 * Revision 1.4  2006/03/10 05:04:31  Marc
 * Updated to implement CR 6.
 *
 * Revision 1.3  2005/08/03 21:19:51  Marc
 * Added method to convert a string to a file name.
 *
 * Revision 1.2  2005/05/22 16:53:40  Marc
 * Added function for extracting the file extension.
 *
 * Revision 1.1  2005/03/04 00:19:09  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop;

import java.io.File;
import java.util.logging.Level;

import org.onceforall.dms.desktop.exception.DesktopException;

/**
 * Defines a class with general helper methods.
 */

public class Utilities {
    /**
     * Extracts the file extension from the given file.
     *
     * @param file Specifies the file for which to get the file extension. (mandatory)
     * @return Returns the file extension if the file has an extension, <code>null</code> otherwise.
     */
    public static String getFileExtension(File file) {
      return getFileExtension(file.getName());
    }
    
    /**
     * Extracts the file extension from the given file name.
     *
     * @param fileName Specifies the file name from which to get the file extension. (mandatory)
     * @return Returns the file extension if the file has an extension, <code>null</code> otherwise.
     */
    public static String getFileExtension(String fileName) {
      int extensionSeparatorPosition = fileName.lastIndexOf('.');
      if(extensionSeparatorPosition >= 0)
          return fileName.substring(extensionSeparatorPosition+1);
      else
          return null;
    }

    /**
     * Extracts the file name without the extension from the given file.
     *
     * @param file Specifies the file for which to get the file name. (mandatory)
     * @return Returns the file name without the extension from the given file, <code>null</code> otherwise.
     */
    public static String getFileName(File file) {
        return(getFileName(file.getName()));
    }
    
    /**
     * Extracts the file name without the extension from the given file.
     *
     * @param fileName Specifies the file name from which to get the file name. (mandatory)
     * @return Returns the file name without the extension from the given file, <code>null</code> otherwise.
     */
    public static String getFileName(String fileName) {
        String extension = getFileExtension(fileName);
        if(extension != null && fileName != null)
            return(fileName.substring(0, fileName.length()-extension.length()-1));
        else
            return null;
    }
    
    /**
     * Converts a given text into a file name by replace all non-alpha numeric characters
     * with underscores.
     *
     * @param text Specifies the text to be converted.
     * @return Returns the file name.
     */
    public static String convertToFileName(String text) {
        StringBuilder builder = new StringBuilder();
        
        for(int index = 0; index < text.length(); ++index) {
            char currentChar = text.charAt(index);
            if(currentChar >= 'a' && currentChar <= 'z'
                || currentChar >= 'A' && currentChar <= 'Z'
                || currentChar >= '0' && currentChar <= '9'
                || currentChar == '-')
                builder.append(currentChar);
            else
                builder.append('_');
        }
        
        return builder.toString();
    }

    /**
     * Comnines a given array of string with a given separator between each string. 
     * For example: ["text1", "text2"] with seoarator " - " would result in "text1 - text2".
     * 
     * @param texts Specifies the texts to concatenate.
     * @param separator Specifies the separator to be used between the string.
     * @return Returns the concatenated string.
     */
    public static String concatenate(String[] texts, String separator) {
        StringBuilder result = new StringBuilder();
       
        boolean allNull = true;
        for(int index = 0; index < texts.length; ++index) {
            String currentText = texts[index];
            allNull &= (currentText == null); 
            if(currentText != null && currentText.length() > 0) {
              if(result.length() > 0)
                  result.append(separator);
              
              result.append(currentText);
            }
        }
        
        if(allNull)
            return null;
        else
            return result.toString();
    }
    
    /**
     * Derives a name from the given class name while preserving the capitalisation.
     * It ignores an "M" at the beginning of the class name and "Property", "Parameter" and "Result" at the end.
     * For example, "MNameProperty" will be converted to "Name". 
     * 
     * @param className Specifies the class name to convert.
     * @return Returns a name derived from the given class name
     */
    public static String getNameFromClassName(String className) {
    	int index = 0;       // Specifies the current index.
    	int startIndex = 0;  // Specifies the start index of the word.
    	
    	if(className.length() <= 1)
    		return className.toUpperCase();
 
    	StringBuilder result = new StringBuilder();
    	
    	while(index+1 < className.length()) {
    		// Tests for change from an upper-case character to a lower-case character.
    		if(Character.isUpperCase(className.charAt(index)) && Character.isLowerCase(className.charAt(index+1))) {
    			String word = className.substring(startIndex, index);
    			
    			// Adds the word if the first word is not "M".
    			if(result.length() != 0 || !word.equals("M")) {
    				result.append(word);
    				result.append(' ');
    			}
    			
    			startIndex = index;
    		}

    		++index;
    	}
	
		String word = className.substring(startIndex, index+1);
		// Adds the word if the last word is not "Property", "Parameter" or "Result".
		if(!word.equals("Property") && !word.equals("Parameter") && !word.equals("Result")) {
			// If the word ends with a lower case character, convert the whole word to lower case.
			if(Character.isLowerCase(word.charAt(word.length()-1)))
				word = word.toLowerCase();
			
			result.append(word);
		}
    	
    	// Removes a trailing space.
    	if(result.length() >= 2 && result.charAt(result.length()-1) == ' ')
    		result.deleteCharAt(result.length()-1);
    	
    	return result.toString();
    }
    
    /**
     * Replaces reserved XML characters with the corresponding name character entities.
     *
     * @param text Specifies the text to encode.
     * @return Returns the encoded text.
     */
    public static String encodeForXml(String text) { 
        text = text.replaceAll("&", "&amp;");
        text = text.replaceAll("<", "&lt;");
        text = text.replaceAll(">", "&gt;");
        text = text.replaceAll("'", "&apos;");
        text = text.replaceAll("\"", "&quot;");
        
        return(text);
    }
    
    /**
     * Replaces reserved HTML characters with the corresponding name character entities.
     *
     * @param text Specifies the text to encode.
     * @return Returns the encoded text.
     */
    public static String encodeForHtml(String text) { 
        text = text.replaceAll("&", "&amp;");
        text = text.replaceAll("<", "&lt;");
        text = text.replaceAll(">", "&gt;");
        text = text.replaceAll("\"", "&quot;");
        
        return(text);
    }
    
    
    /**
     * Gets the logging level that corresponds to the severity.
     * 
     * @return Returns the logging level that corresponds to the severity.
     */
    public static Level getLevelForSeverity(int severity) {
		assert severity == DesktopException.INFORMATION_SEVERITY
		|| severity == DesktopException.WARNING_SEVERITY
		|| severity == DesktopException.ERROR_SEVERITY
		|| severity == DesktopException.CRITICAL_SEVERITY;
		
		switch(severity) {
		case DesktopException.CRITICAL_SEVERITY:
		case DesktopException.ERROR_SEVERITY:
			return Level.SEVERE;
		case DesktopException.WARNING_SEVERITY:
			return Level.WARNING;
		default:
			return Level.INFO;
		}
    }
}
