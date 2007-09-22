/*
 * Revision History:
 * $Log: BooleanType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.1  2005/07/20 10:54:35  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 *
 */
package org.onceforall.dms.desktop.logic.types;

import org.onceforall.dms.desktop.exception.ConversionException;

/**
 * Defines a boolean number value type. It represents the Java <code>Boolean<code> class.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class BooleanType extends Type {
    /**
     * Creates a new date time value object.
     */
    protected BooleanType() {
        super("Yes/No", "Specifies a boolean field.", Boolean.class,
                new Boolean[] { Boolean.TRUE, Boolean.FALSE}, new String[] {"Yes", "No"});        
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        validate(value);
        
        if(value != null)
            return ((Boolean) value).booleanValue() ? "Yes" : "No";
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
        else {
            if(valueFromUI.toLowerCase().equals("yes"))
                return Boolean.TRUE;
            else if(valueFromUI.toLowerCase().equals("no"))
                return Boolean.FALSE;
            else
	            throw new ConversionException(valueFromUI, this, null);                
        }
    }
}
