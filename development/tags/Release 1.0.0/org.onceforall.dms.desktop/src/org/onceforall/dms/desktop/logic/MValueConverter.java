/*
 * Revision History:
 * $Log: MValueConverter.java,v $
 * Revision 1.1  2006/08/29 00:42:13  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.1  2005/08/03 21:39:30  Marc
 * Refactored to increase reusablility of steps.
 *
 */
package org.onceforall.dms.desktop.logic;

/**
 * Defines an interface for deriving the actual value of a managed value from its managed input values.
 */

public interface MValueConverter {
    /**
     * Derives the actual value of a given managed value from its input values.
     * This method enables the simple object specify transformations for input values
     * that are executed every time one of the input values changes. By default
     *
     * @return Returns the convertd actual value.
     */
    Object convertValueFromMInputValues();
}
