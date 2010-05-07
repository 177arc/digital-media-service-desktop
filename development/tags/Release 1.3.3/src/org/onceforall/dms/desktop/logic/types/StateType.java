/*
 * Revision History:
 * $Log: StateType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import org.onceforall.dms.desktop.exception.ConversionException;


/**
 * Defines a state value type that can restricts its values to a set of valid states.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 */

public class StateType extends Type {   
    /**
     * Creates a new state value type object.
     */
    protected StateType() {
        super("State", "Specifies a sequence of characters that is restricted to a number of options.", null, State.class);        
    }
 
    /**
	 * Creates a new state value type object.
	 *
     * @param name Specifies the name of the type object. (mandatory)
     * @param description Specifies the description of the type object.
     * @param validValues Specifies all valid states of this type.
	 */
	public StateType(String name, String description, State[] validValues) {
		super(name, description, null, State.class, validValues, getValidValuesForUI(validValues));
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
	 */
	@Override
	public synchronized String getValueForUI(Object value) {
		return ((State) value).getNameForUI();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromUI(java.lang.String)
	 */
	@Override
	public Object getValueFromUI(String valueFromUI) throws ConversionException {
		if(validValues == null)
			return State.get(valueFromUI, null);
		
		for(State state: (State[]) validValues) {
    		if(state.getNameForUI().equals(valueFromUI))
    			return state;
    	}
    	
    	throw new ConversionException("The application cannot convert the string \""+valueFromUI+"\" to a state because the string does not match a valid state.");
	}

	/**
	 * Converts the valid states to a user-friendly representation. 
	 * 
	 * @param validValues Specifies the valid values.
	 * @return Returns a user-friendly representation of the valid values.
	 */
	static protected String[] getValidValuesForUI(State[] validValues)  {
		String[] result = new String[validValues.length];
		
		for(int index = 0; index < validValues.length; ++index)
			result[index] = validValues[index].getNameForUI();
		
		return result;
	}
    
}
