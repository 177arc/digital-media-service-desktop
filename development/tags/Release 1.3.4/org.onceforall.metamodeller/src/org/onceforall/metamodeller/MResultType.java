/**
 * <copyright>
 * </copyright>
 *
 * $Id: MResultType.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MResult Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getMResultType()
 * @model kind="class"
 * @generated
 */
public class MResultType extends MValueType {
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
	protected MResultType() {
		super();

		// Makes sure that results are not saved by default.
		setTransient(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.MRESULT_TYPE;
	}

	/**
	 * @see org.onceforall.objectmodeler.MElementType#getESuperTypeXPath()
	 */
	@Override
	public String getESuperTypeXPath() {
		return getMSuperType() == null ? "//MResult" : getMSuperType()
				.getETypeXPath();
	}

} // MResultType