/*
 * Revision History:
 * $Log: StringType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/07/20 10:54:43  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.1  2005/03/04 00:19:07  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;


/**
 * Defines a string value type.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class StringType extends Type {
    /**
     * Creates a new string value object.
     */
	protected StringType() {
        super("Text", "Specifies an unlimited sequence of characters.", String.class);        
    }
}
