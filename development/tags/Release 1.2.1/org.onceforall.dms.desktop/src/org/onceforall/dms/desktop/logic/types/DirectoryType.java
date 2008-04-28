/*
 * Revision History:
 * $Log: DirectoryType.java,v $
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a directory value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class DirectoryType extends Type {
    /** Indicates whether the directory must exist. */
    protected boolean mustExist;
    
    /**
     * Creates a new directory value type object.
     * 
     * @param mustExist Determines whether the directory must exist.
     */
    protected DirectoryType(boolean mustExist) {
        super(mustExist ? "Directory (must exist)" : "Directory", "Specifies a directory in the file system.", new File("Image Files"+File.separator+"Directory.gif"), File.class);
        
        this.mustExist = mustExist;        
    }
    
    /**
     * Creates a new directory value type object for directories that do not have to exist.
     */
    protected DirectoryType() {
        this(false);    
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#validate(java.lang.Object)
     */
    @Override
	public void validate(Object value) throws IllegalArgumentException {
        super.validate(value);

        if(value != null && ((File) value).getAbsolutePath().indexOf("  ") >= 0)
            throw new IllegalArgumentException("The directory path '"+((File) value).getAbsolutePath()+"' cannot contain two or more consecutive spaces.");
            
        if(value != null && mustExist && !((File) value).exists())
            throw new IllegalArgumentException("The directory '"+((File) value).getAbsolutePath()+"' does not exist.");
        
        if(value != null && ((File) value).exists() && !((File) value).isDirectory())
            throw new IllegalArgumentException("The path '"+((File) value).getAbsolutePath()+"' identified a file, not a directory.");
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
     * Determines whether the directory must exist.
     * 
     * @return Returns whether the directory must exist.
     */
    public boolean getMustExist() {
        return mustExist;
    }

}
