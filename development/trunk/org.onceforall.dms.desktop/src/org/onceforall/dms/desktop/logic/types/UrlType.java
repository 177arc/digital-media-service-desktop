/*
 * Revision History:
 * $Log: UrlType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a URL value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class UrlType extends Type {
   
    /**
     * Creates a new URL value type object.
     */
	protected UrlType() {
        super("URL", "Specifies universal resource location (URL) identifier, e.g. http://localhost:8080/web.", new File("Image Files"+File.separator+"URL.gif"), URL.class);   
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#validate(java.lang.Object)
     */
    @Override
	public void validate(Object value) throws IllegalArgumentException {
        super.validate(value);
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        validate(value);
        
        if(value != null) {
            return ((URL) value).toExternalForm();
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
            try {
                return new URL(valueFromUI);
            } catch (MalformedURLException e) {
                throw new ConversionException(valueFromUI, this, null);
            }
    }
}
