/*
 * Revision History:
 * $Log: MResult.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;


import java.io.File;

import org.eclipse.emf.ecore.EClass;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MResult</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMResult()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='Result'"
 * @generated
 */
public class MResult extends MValue {
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "Result";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MResult.class.getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MResult.TYPE_NAME, new ReferenceType("Reference to "+MResult.TYPE_NAME, "Specifies a reference to a "+MResult.TYPE_NAME_FOR_UI, MResult.class));
	}


































































	/**
	 * Get the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTypeNameForUI() {
		return "Result";
	}
	/**
	 * <!-- begin-user-doc -->
	 * Creates a new managed result object.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MResult() {
		super();
		
		firstMResultConstructorHook();
				
		typeNameForUI = "Result";
		

		lastMResultConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMResultConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMResultConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * Creates a new managed result object.
	 *
	 * @param readOnly Specifies whether the user can modify the actual value or not.
	 * @param name Specifies the name of the managed result.
	 * @param description Specifies the description of the managed result. (optional)
	 * @param iconFilePath Specifies the file path to the icon of the managed result. (optional)
	 */
	public MResult(boolean readOnly, String name, String description, File iconFilePath) {
		this();

		if(name == null) throw new IllegalArgumentException("The parameter 'name' must not be null.");
		
		this.readOnly = readOnly;
		this.name = name;
		this.description = description;
		this.iconFilePath = iconFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MRESULT;
	}

} // MResult