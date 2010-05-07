/*
 * Revision History:
 * $Log: DefaultMValueConverter.java,v $
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:08  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 * Revision 1.1  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.2  2005/08/03 21:39:30  Marc
 * Refactored to increase reusablility of steps.
 *
 * Revision 1.1  2005/07/20 10:54:28  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a class that converts the actual value of a managed value from its managed input values.
 * It defines a simple default implementation of the <code>MValueConverter</code> interface.
 * 
 * @see MValueConverter
 */

public class DefaultMValueConverter implements MValueConverter {	
	/** Specifies the managed value that owns the converter that will be changed when the managed input values change. */
	protected MValue mOwnerValue;
	
	/**
	 * @see #convertValueFromMInputValues()
	 * @param mOwnerValue Specifies the managed value that ownes the managed input values.
	 */
	static protected Object convertValueFromMInputValues(MValue mOwnerValue) {
        Object result = null;
        List<MValue> mInputValues = mOwnerValue.getMInputValues();
        
        if(mInputValues != null && mOwnerValue.getValueEFeature().isMany()) {
        	int upperBound = mOwnerValue.getValueEFeature().getUpperBound();
        	result = new ArrayList<Object>(mInputValues.size());
        	for(MValue mValue: mInputValues) {
        		if(((ArrayList) result).size() >= upperBound && upperBound >= 0)
        			break;
        		
        		Object value = mValue.getValue();
        		if(value != null)
        			((ArrayList) result).add(value);
        	}
        }
        else if(mInputValues != null && mInputValues.size() > 0)
        	result = mInputValues.get(0).getValue();
        
        return(result);
	}

	/**
	 * Creates a new default managed value converter object.
	 *
	 * @param mOwnerValue Specifies the managed value that owns the converter that will be changed when the managed input values change.
	 */
	public DefaultMValueConverter(MValue mOwnerValue) {
		this.mOwnerValue = mOwnerValue;
	}
	
    /**
     * Derives the actual value of a given managed value from its managed input values.
     * This method enables the simple object specify transformations for input values
     * that are executed every time one of the input values changes. By default
     *
     * @return Returns the convertd actual value.
     */
    public Object convertValueFromMInputValues() {
    	return convertValueFromMInputValues(mOwnerValue);
    }
    

    
	/**
	 * Gets the managed value that owns the converter that will be changed when the managed input values change.
	 *
	 * @return Returns the managed value that owns the converter that will be changed when the managed input values change.
	 */
	public MValue getMOwnerValue() {
		return mOwnerValue;
	}
}
