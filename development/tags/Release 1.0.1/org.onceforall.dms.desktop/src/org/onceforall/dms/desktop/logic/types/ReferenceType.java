/*
 * Revision History:
 * $Log: ReferenceType.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:15  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.util.List;

import org.onceforall.dms.desktop.exception.ConversionException;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;


/**
 * Defines a managed object reference type. It represents a reference to a <code>MObject<code> class.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MObject
 */

public class ReferenceType extends Type {
	/** Specifies a user-friendly representation of the name. */
	protected String nameForUI;
	
    /**
     * Creates a new reference object.
     * 
     * @param name Specifies the name of the reference type object. (mandatory)
     * @param description Specifies the description of the reference type object.
     * @param javaClass Specifies the Java class that this reference type represents.
     */
    public ReferenceType(String name, String description, Class javaClass) {
        super(name, description, javaClass);
        
        try {
			nameForUI = "Reference to "+javaClass.getField("TYPE_NAME_FOR_UI").get(null);
		} catch (Exception e) {
			nameForUI = name;
		}  
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    public String getValueForUI(Object value) {
        validate(value);
        
        if(value != null) {
            MObject mObject = (MObject) value;    
            return mObject.getPathForUI();
        }
        else
            return NULL_FOR_UI;
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromUI(java.lang.String)
     */
    public Object getValueFromUI(String valueFromUI) throws ConversionException {
        if(valueFromUI == null || valueFromUI.equals(NULL_FOR_UI))
            return null;
        else {
            // Parses the reference expression and tries to find the corresponding base object.
        	MObject currentMObject = MApplication.getInstance();
        	MObject nextMObject;
            int startIndex = 0;
            int endIndex = valueFromUI.indexOf(MElement.PATH_SEPARATOR, 0);
            if(endIndex < 0)
                endIndex = valueFromUI.length();
            
            while(startIndex < valueFromUI.length()) {
                String mObjectName = valueFromUI.substring(startIndex, endIndex);
                
                if(startIndex == 0) {
                    // Tests whether the first name is the name of the application object.
                    if(!currentMObject.getName().equals(mObjectName))
                        throw new ConversionException("The expression '"+valueFromUI+"' does not start with the name of the application '"+currentMObject.getNameForUI()+"'.");
                }
                else {
                    // Tries to find a child with the extracted base object name if the current object is a simple object, i.e. if it has children.
                    nextMObject = null;
                    List<MObject> mObjects = currentMObject.getReferencedMElements(MObject.class);
                    for(MObject mObject: mObjects)
                    	if(mObjectName.equals(mObject.getName())) {
                    		nextMObject = mObject;
                    		break;
                    	}
                
                	if(nextMObject == null)
                	    throw new ConversionException("The expression '"+valueFromUI+"' does not reference an existing node.\n'"+currentMObject.getNameForUI()+"' does not have a sub-node called '"+mObjectName+"'.");
                	
                	currentMObject = nextMObject;
                }
                
                startIndex = endIndex+1;
                endIndex = valueFromUI.indexOf(MElement.PATH_SEPARATOR, startIndex);
                if(endIndex < 0)
                    endIndex = valueFromUI.length();
            }
        
            return currentMObject;
        }     
    }

	/**
	 * @see org.onceforall.dms.desktop.logic.types.Type#getNameForUI()
	 */
	@Override
	public String getNameForUI() {
		return nameForUI;
	}
    
    
}
