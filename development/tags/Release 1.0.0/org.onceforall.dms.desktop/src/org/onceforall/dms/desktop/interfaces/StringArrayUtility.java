/*
 * Revision History:
 * $Log: StringArrayUtility.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:18  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:16  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/03/04 00:19:12  Marc
 * Implemented mail step and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.interfaces;

/**
 * Defines utility class for manipulating string array. This class is mainly used by <code>CommandLineInterface</code>.
 * 
 * @see org.onceforall.dms.desktop.interfaces.CommandLineInterface
 */
public class StringArrayUtility {
    /**
     * Appends the second string array to the first one. This is a costly operation as all array members
     * are copied to the result string array.
     *
     * @param firstArray Specifies a string array.
     * @param secondArray Specifies the string array to be appended.
     * @return Returns the new combined string array.
     */
    public static String[] append(String[] firstArray, String[] secondArray) {
        if(firstArray == null)
            return(secondArray);

        if(secondArray == null)
            return(firstArray);

        String[] result = new String[firstArray.length+secondArray.length];
        int index;
        for(index = 0; index < firstArray.length; ++index)
            result[index] = firstArray[index];

        for(index = 0;index < secondArray.length; ++index)
            result[index+firstArray.length] = secondArray[index];

        return(result);
	}

    /**
     * Inserts a string into a string array. This is a costly operation as all array members
     * are copied to the result string array.
     *
     * @param array Specifies the string array in which to insert the string.
     * @param string Specifies the string to be inserted.
     * @param position Specifies the position at which to insert the string.
     * @return Returns a new array containing the string.
     */
    public static String[] insert(String[] array, String string, int position) {
        if(array == null)
            return(new String[] {string});

        String[] result = new String[array.length+1];
        int index;
        for(index = 0; index < array.length+1; ++index) {
            if(index < position && index < array.length)
            	result[index] = array[index];

            if(index == position)
            	result[index] = string;

            if(index > position)
            	result[index] = array[index-1];
    	}

        if(index <= position)
            result[index-1] = string;

        return(result);
	}

    /**
     * Converts a string array to a space-separated string.
     *
     * @param arrayString Specifies the string array to be converted.
     * @return Returns the space-separated string.
     */
    public static String getString(String[] arrayString) {
        if(arrayString == null)
            return(null);

        StringBuffer result = new StringBuffer();
        for(int index = 0; index < arrayString.length; ++index) {
            if(index > 0)
                result.append(" ");

            result.append(arrayString[index].toString());
		}

        return(result.toString());
	}
}