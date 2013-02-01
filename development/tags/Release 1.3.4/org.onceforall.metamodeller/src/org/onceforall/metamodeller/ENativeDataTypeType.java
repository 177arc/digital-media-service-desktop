/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENativeDataTypeType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENative Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getENativeDataTypeType()
 * @model kind="class"
 * @generated
 */
public class ENativeDataTypeType extends EDataTypeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENativeDataTypeType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.ENATIVE_DATA_TYPE_TYPE;
	}

	/**
	 * @see org.onceforall.objectmodeler.EDataTypeType#getMTypeXPath()
	 */
	@Override
	public String getETypeXPath() {
		return "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#"
				+ getName();
	}

} // ENativeDataTypeType