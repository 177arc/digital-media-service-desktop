/**
 * <copyright>
 * </copyright>
 *
 * $Id: MApplicationType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MApplication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMApplicationType()
 * @model kind="class"
 * @generated
 */
public class MApplicationType extends MBusinessObjectType {
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
	protected MApplicationType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MAPPLICATION_TYPE;
	}

	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MApplication" : getMSuperType()
				.getETypeXPath();

	}

} // MApplicationType