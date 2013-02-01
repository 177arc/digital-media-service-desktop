/**
 * <copyright>
 * </copyright>
 *
 * $Id: MPropertyType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MProperty Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPropertyType()
 * @model kind="class"
 * @generated
 */
public class MPropertyType extends MValueType {
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
	protected MPropertyType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MPROPERTY_TYPE;
	}

	/**
	 * @see org.onceforall.objectmodeler.MElementType#getESuperTypeXPath()
	 */
	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MProperty" : getMSuperType()
				.getETypeXPath();
	}

} // MPropertyType