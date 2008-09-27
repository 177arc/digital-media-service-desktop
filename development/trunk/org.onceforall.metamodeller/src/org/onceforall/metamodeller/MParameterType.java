/**
 * <copyright>
 * </copyright>
 *
 * $Id: MParameterType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MParameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMParameterType()
 * @model kind="class"
 * @generated
 */
public class MParameterType extends MValueType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MParameterType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MPARAMETER_TYPE;
	}

	/**
	 * @see org.onceforall.objectmodeler.MElementType#getESuperTypeXPath()
	 */
	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MParameter" : getMSuperType()
				.getETypeXPath();
	}

} // MParameterType