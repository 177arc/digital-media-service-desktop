/*
 * Revision History:
 * $Log: LongType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:15  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.1  2005/07/20 10:54:42  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:37:31  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.1  2005/03/04 00:19:08  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.text.NumberFormat;
import java.text.ParseException;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a long number value type. It represents the Java <code>Long<code> class.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class LongType extends Type {
    /** Specifies the universally unique idenfier of the type object. The UUID was generated using <a href="http://kruithof.xs4all.nl/uuid/uuidgen">UUID (GUID) Generator on the Web</a>.  */
    public static String ID = "c04735a4-90d9-4206-b254-04d27827f49b";
    
    /** Specifies the number formatter for the tpye. */
    public static final NumberFormat NUMBER_FORMATTER = NumberFormat.getIntegerInstance();
    
    /**
     * Creates a new date time value object.
     */
    protected LongType() {
        super("Number", "Specifies a number, formatted according to the system's regional settings.", Long.class);        
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        validate(value);
        
        if(value != null)
            return NUMBER_FORMATTER.format(value);
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
	            return NUMBER_FORMATTER.parseObject(valueFromUI);
	        } catch (ParseException exception) {
	            throw new ConversionException(valueFromUI, this, null);
	        }
    }
}
