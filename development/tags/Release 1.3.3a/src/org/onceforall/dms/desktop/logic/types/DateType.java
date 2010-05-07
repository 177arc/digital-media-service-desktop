/*
 * Revision History:
 * $Log: DateType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:15  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.3  2005/07/20 10:54:28  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:37:32  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.1  2005/03/04 00:19:04  Marc
 * Implemented mail step and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a date value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class DateType extends Type {   
    /** Specifies the date formatter for the type. */
    public static final DateFormat DATE_FORMATTER = new SimpleDateFormat("dd MMM yyyy");
    
    /**
     * Creates a new date time value object.
     */
    public DateType() {
        super("Date", "Specifies date information, formatted according to the system's regional settings.", null, Date.class);        
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    public synchronized String getValueForUI(Object value) {
        validate(value);

        if(value != null)
            return DATE_FORMATTER.format((Date) value);
        else
            return NULL_FOR_UI;
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromUI(java.lang.String)
     */
    public Object getValueFromUI(String valueFromUI) throws ConversionException {
        if(valueFromUI.equals(NULL_FOR_UI))
            return null;
        else
	        try {
	            return DATE_FORMATTER.parseObject(valueFromUI);
	        } catch (ParseException exception) {
	            throw new ConversionException(valueFromUI, this, null);
	        }
    }
}
