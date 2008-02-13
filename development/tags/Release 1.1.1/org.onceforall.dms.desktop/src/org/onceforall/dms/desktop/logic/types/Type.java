/*
 * Revision History:
 * $Log: Type.java,v $
 * Revision 1.3  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
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
 * Revision 1.3  2005/03/18 00:37:31  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.2  2005/03/13 14:20:37  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:06  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.onceforall.dms.desktop.exception.ConversionException;
import org.onceforall.dms.desktop.exception.DesktopException;


/**
 * Defines a value type. It provides methods for converting values to a user-friendly representation and back.
 */

public abstract class Type {
    /** Specifies the user-friendly representation of <code>null</code>. */
    public static final String NULL_FOR_UI = "(Empty)";

	/** Specifies a map that relates classes to value types. This map is used to determine the default value type from the class of the actual value. */
	protected static final Map<Class, Type> VALUE_TYPES_BY_CLASS = new HashMap<Class, Type>();

	/** Specifies a map that relates names to value types. */
	public static final Map<String, Type> VALUE_TYPES_BY_NAME = new HashMap<String, Type>();

	/** Specifies a map that relates type class names to value types. */
	public static final Map<String, Type> VALUE_TYPES_BY_CLASS_NAME = new HashMap<String, Type>();
  
	/** Specifies the string value type. */
	public static final StringType STRING_TYPE = new StringType();
    
	/** Specifies the boolean value type. */
	public static final BooleanType BOOLEAN_TYPE = new BooleanType();
    
	/** Specifies the long value type. */
	public static final LongType LONG_TYPE = new LongType();
    
	/** Specifies the password value type. */
	public static final PasswordType PASSWORD_TYPE = new PasswordType();
    
	/** Specifies the state value type. */
	public static final StateType STATE_TYPE = new StateType();
    
	/** Specifies the URL value type. */
	public static final UrlType URL_TYPE = new UrlType();
    
	/** Specifies the date/time value type. */
	public static final DateTimeType DATE_TIME_TYPE = new DateTimeType();
    
	/** Specifies the date value type. */
	public static final DateType DATE_TYPE = new DateType();
   
	/** Specifies the time value type. */
	public static final TimeType TIME_TYPE = new TimeType();
    
	/** Specifies the duration value type. */
	public static final DurationType DURATION_TYPE = new DurationType();
    
	/** Specifies the file value type for files that do not have to exist. */
	public static final FileType FILE_TYPE = new FileType();
    
	/** Specifies the file value type for files that have to exist. */
	public static final FileType EXISTING_FILE_TYPE = new FileType(true);
    
	/** Specifies the state value type for steps. */
	public static final MStepStateType STEP_STATE_TYPE = new MStepStateType();
    
	/** Specifies the state value type for MP3s. */
	public static final MMp3StateType MP3_STATE_TYPE = new MMp3StateType();
	
    /** Specifies the name of the base object. */
    protected String name;
    
    /** Specifies a description of the base object. */
    protected String description;
    
    /** Specifies the Java class that this type represents. */
    protected Class javaClass;

    /** Specifies all valid values of this type. */
    protected Object[] validValues;

    /** Specifies all valid values of this type in a user-friendly representation. */
    protected String[] validValuesForUI;
    
    /** Specifies the file path to the icon that represents this type. It may be <code>null</code> if no icon file path is available for this type. */
    protected File iconFilePath;
    
    /** Initialises the static class members. */
    static {
    	VALUE_TYPES_BY_CLASS.put(STRING_TYPE.getJavaClass(), STRING_TYPE);
    	VALUE_TYPES_BY_CLASS.put(BOOLEAN_TYPE.getJavaClass(), BOOLEAN_TYPE);
    	VALUE_TYPES_BY_CLASS.put(LONG_TYPE.getJavaClass(), LONG_TYPE);
    	VALUE_TYPES_BY_CLASS.put(STATE_TYPE.getJavaClass(), STATE_TYPE);
    	VALUE_TYPES_BY_CLASS.put(URL_TYPE.getJavaClass(), URL_TYPE);
    	VALUE_TYPES_BY_CLASS.put(DATE_TIME_TYPE.getJavaClass(), DATE_TIME_TYPE);
    	VALUE_TYPES_BY_CLASS.put(DURATION_TYPE.getJavaClass(), DURATION_TYPE);
    	VALUE_TYPES_BY_CLASS.put(FILE_TYPE.getJavaClass(), FILE_TYPE);
  
    	/*?VALUE_TYPES_BY_NAME.put(STRING_TYPE.getName(), STRING_TYPE);
    	VALUE_TYPES_BY_NAME.put(BOOLEAN_TYPE.getName(), BOOLEAN_TYPE);
    	VALUE_TYPES_BY_NAME.put(LONG_TYPE.getName(), LONG_TYPE);
    	VALUE_TYPES_BY_NAME.put(STATE_TYPE.getName(), STATE_TYPE);
    	VALUE_TYPES_BY_NAME.put(URL_TYPE.getName(), URL_TYPE);
    	VALUE_TYPES_BY_NAME.put(DATE_TIME_TYPE.getName(), DATE_TIME_TYPE);
    	VALUE_TYPES_BY_NAME.put(DATE_TYPE.getName(), DATE_TYPE);
    	VALUE_TYPES_BY_NAME.put(DURATION_TYPE.getName(), DURATION_TYPE);
    	VALUE_TYPES_BY_NAME.put(FILE_TYPE.getName(), FILE_TYPE);
    	VALUE_TYPES_BY_NAME.put(EXISTING_FILE_TYPE.getName(), EXISTING_FILE_TYPE);
    	VALUE_TYPES_BY_NAME.put(PASSWORD_TYPE.getName(), PASSWORD_TYPE);
    	VALUE_TYPES_BY_NAME.put(TIME_TYPE.getName(), TIME_TYPE);
    	VALUE_TYPES_BY_NAME.put(STEP_STATE_TYPE.getName(), STEP_STATE_TYPE);
    	VALUE_TYPES_BY_NAME.put(MP3_STATE_TYPE.getName(), MP3_STATE_TYPE);*/
    }
    
    
    
    /**
     * Creates a new type object.
     *
     * @param name Specifies the name of the type object. (mandatory)
     * @param description Specifies the description of the type object.
     * @param iconFilePath Specifies the file path to the icon that represents this type. It may be <code>null</code> if no icon file path is available for this type. 
     * @param javaClass Specifies the Java class that this type represents.
     */
    protected Type(String name, String description, File iconFilePath, Class javaClass) {
    	this(name, description, iconFilePath, javaClass, null, null);      
    }
    
    /**
     * Gets the name of the base object.
     * 
     * @return Returns the name of the base object.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a description of the base object.
     * 
     * @return Returns a description of the base object.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets a user friendly representation of the name of the base object.
     * 
     * @return Returns a user friendly representation of the name of the base object.
     */
    public String getNameForUI() {
        return getName();
    }
    
    /**
     * Gets a user friendly representation the description of the base object.
     * 
     * @return Returns a user friendly representation of the description of the base object.
     */
    public String getDescriptionForUI() {
        return getDescription();
    }

    /**
     * Gets the Java class that this type represents.
     * 
     * @return Returns the Java class that this type represents.
     */
    public Class getJavaClass() {
        return javaClass;
    }
   
    /**
     * Converts the given value into a user-friendly representation.
     * 
     * @param value Specifies the value to be converted.
     * @return Returns a user-friendly representation of the value.
     */
    public synchronized String getValueForUI(Object value) {
      //?validate(value);
      
      if(value == null)
          return NULL_FOR_UI;
      else
          return value.toString();
    }
    
    /**
     * Converts the given a user-friendly representation of the value into the acutal value.
     * 
     * @param valueFromUI Specifies the value to be converted.
     * @return Returns the converted value.
     * @throws ConversionException Thrown if the value cannot be converted.
     */
    public Object getValueFromUI(String valueFromUI) throws ConversionException {
      if(valueFromUI == null || valueFromUI.equals(NULL_FOR_UI))
          return null;
      else
          return valueFromUI;
    }
        
    /**
     * Converts the given value into DOM representation.
     * 
     * @param value Specifies the value to be converted.
     * @return Returns a DOM representation of the value.
     * @throws DesktopException Thrown if the value is not an instance of the Java class that this type represents.
     */
    public synchronized String getValueForDOM(Object value) throws DesktopException {
        return getValueForUI(value);
    }
    
    /**
     * Converts the given a DOM representation of the value into the acutal value.
     * 
     * @param valueFromDOM Specifies the value to be converted.
     * @return Returns the converted value.
     * @throws ConversionException Thrown if the value cannot be converted.
     */
    public Object getValueFromDOM(String valueFromDOM) throws ConversionException {
      return getValueFromUI(valueFromDOM);
    }
    
    /** Specifies an user-friendly representation all valid values as a comma-separated list. */
    protected String validValueListForUI;
   
    /**
     * Creates a new type object.
     *
     * @param name Specifies the name of the type object. (mandatory)
     * @param description Specifies the description of the type object.
     * @param iconFilePath Specifies the file path to the icon that represents this type. It may be <code>null</code> if no icon file path is available for this type. 
     * @param javaClass Specifies the Java class that this type represents.
     * @param validValues Specifies all valid values of this type.
     * @param validValuesForUI Specifies all valid values of this type in a user-friendly representation.
     */
    protected Type(String name, String description, File iconFilePath, Class javaClass,
            Object[] validValues, String[] validValuesForUI) {
        //?assert validValues != null: "The valid values are not specified.";
        //?assert validValuesForUI != null: "The valid values for user-friendly representation are not specified.";
        //?assert validValues.length == validValuesForUI.length: "The valid values for user-friendly representation and valid values must have the same number of values.";

        this.name = name;
        this.description = description;
        this.iconFilePath = iconFilePath;
        this.javaClass = javaClass;
        this.validValues = validValues;
        
        // Creates a user-friendly representation of all valid values.
        if(validValues != null) {
	        StringBuilder allowValuesForUIBuilder = new StringBuilder();
	        for(int index = 0; index < validValuesForUI.length; ++index) {
	            assert validValues[index] != null: "The valid values must not include null values.";
	            assert validValuesForUI[index] != null: "The valid values for user-friendly representation must not include null values.";
	            
	            allowValuesForUIBuilder.append("'"+validValuesForUI[index]+"'");
	            
	            if(index < validValuesForUI.length-2)
	                allowValuesForUIBuilder.append(", ");
	            else if(index ==  validValuesForUI.length-2)
	                allowValuesForUIBuilder.append(" and ");
	        }
	        
	        validValueListForUI = allowValuesForUIBuilder.toString();
        }
        
        this.javaClass = javaClass;
        this.validValues = validValues;
        this.validValuesForUI = validValuesForUI;
        
        VALUE_TYPES_BY_NAME.put(name, this);
        VALUE_TYPES_BY_CLASS_NAME.put(getClass().getSimpleName(), this);
    }
    
    /**
     * Gets all valid values of this type. 
     *
     * @return Returns all valid values of this type. 
     * It returns <code>null</code> if this type not restricted.
     */
    public Object[] getValidValues() {
        return validValues;
    }
    
    /**
     * Gets all valid values of this type in a user-friendly representation. 
     *
     * @return Returns all valid values of this type in a user-friendly representation.
     * It returns <code>null</code> if this type not restricted.
     */
    public String[] getValidValuesForUI() {
        return validValuesForUI;
    }

    /**
     * Tests whether the given value is an instance of the Java class that this type represents.
     *
     * @param value Specifies the value to be tested.
     * @throws IllegalArgumentException Thrown if the value is not an instance of the Java class that this type represents.
     */
    public void validate(Object value) throws IllegalArgumentException {
        if(value != null && !javaClass.isInstance(value))
            throw new IllegalArgumentException("The value '"+value+"' is not an instance of '"+getNameForUI()+"'.");
    
        if(value == null)
        	return;
        
        if(validValues != null) {
	        int index = 0;
	        while(index < validValues.length) {
	            if(validValues[index].equals(value))
	                break;
	            
	            ++index;
	        }
	            
	        if(index == validValues.length)
	            throw new IllegalArgumentException("The value '"+value+"' is not one of the following values: "+validValueListForUI+".");        
        }
    }
     
    /**
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString() {
        return getNameForUI();
    }
   
    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
	public boolean equals(Object object) {
        return(object instanceof Type && ((Type) object).getName().equals(name));
    }
    
    /**
     * Gets the value type with the given name.
     * 
     * @param typeName Specifies the name of the value type.
     * @return Returns the value type with the given name. If it does not exist, it returns <code>null</code>.
     */
    public static Type getTypeForName(String typeName) {
    	return VALUE_TYPES_BY_NAME.get(typeName);
    }

    /**
     * Gets the file path to the icon that represents this type.
     * @return Returns the file path to the icon that represents this type.
     */
	public File getIconFilePath() {
		return iconFilePath;
	}

	/**
	 * Sets the file path to the icon that represents this type.
	 * 
	 * @param iconFilePath Specifies the file path to the icon that represents this type.
	 */
	public void setIconFilePath(File iconFilePath) {
		this.iconFilePath = iconFilePath;
	}
}
