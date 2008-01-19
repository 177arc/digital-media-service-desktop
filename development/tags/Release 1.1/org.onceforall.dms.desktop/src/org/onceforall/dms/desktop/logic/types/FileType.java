/*
 * Revision History:
 * $Log: FileType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.3  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.2  2005/08/03 21:35:03  Marc
 * Changed so that files that have to exist have different textual representation.
 *
 * Revision 1.1  2005/07/20 10:54:42  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.4  2005/04/09 17:57:31  Marc
 * Updated for version 0.4.
 *
 * Revision 1.3  2005/03/18 00:37:31  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.2  2005/03/13 14:20:36  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:05  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a file value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class FileType extends Type {
    /** Indicates whether the file must exist. */
    protected boolean mustExist;
    
    /**
     * Creates a new file value type object.
     * 
     * @param mustExist Determines whether the file must exist.
     */
    protected FileType(boolean mustExist) {
        super(mustExist ? "File (must exist)" : "File", "Specifies a file. This can be a directory of a normal file.", new File("Image Files"+File.separator+"File.gif"), File.class);
        
        this.mustExist = mustExist;        
    }
    
    /**
     * Creates a new file value type object for files that do not have to exist.
     */
    protected FileType() {
        this(false);    
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#validate(java.lang.Object)
     */
    @Override
	public void validate(Object value) throws IllegalArgumentException {
        super.validate(value);

        if(value != null && ((File) value).getAbsolutePath().indexOf("  ") >= 0)
            throw new IllegalArgumentException("The file path '"+((File) value).getAbsolutePath()+"' cannot contain two or more consecutive spaces.");
            
        if(value != null && mustExist && !((File) value).exists())
            throw new IllegalArgumentException("The file '"+((File) value).getAbsolutePath()+"' does not exist.");
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        //?validate(value);
        
        if(value != null) {
            return ((File) value).getPath();
        }
        else
            return NULL_FOR_UI;
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromUI(java.lang.String)
     */
    @Override
	public Object getValueFromUI(String valueFromUI) throws ConversionException {
        if(valueFromUI == null || valueFromUI.equals(NULL_FOR_UI))
            return null;
        else
            return new File(valueFromUI);
            
    }
        
    /**
     * Determines whether the file must exist.
     * 
     * @return Returns whether the file must exist.
     */
    public boolean getMustExist() {
        return mustExist;
    }

}
