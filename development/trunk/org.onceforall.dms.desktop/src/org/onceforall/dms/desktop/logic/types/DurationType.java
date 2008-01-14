/*
 * Revision History:
 * $Log: DurationType.java,v $
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
 * Revision 1.1  2005/07/20 10:54:42  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:37:32  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.1  2005/03/13 14:31:20  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:04  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a duration value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class DurationType extends Type {
    /** Specifies the duration formatter for the type. */
    public static final DateFormat FORMATTER = new SimpleDateFormat("HH:mm:ss");
    
    static {
        FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    
    /**
     * Creates a new duration value object.
     */
    protected DurationType() {
        super("Duration", "Specifies a time duration, formatted as hh:mm:ss.", null, Long.class);        
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        validate(value);

        if(value != null)
            return FORMATTER.format(new Date(((Long) value).longValue()));
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
	            return new Long(FORMATTER.parse(valueFromUI).getTime());
	        } catch (ParseException exception) {
	            throw new ConversionException(valueFromUI, this, null);
	        }
    }
}
