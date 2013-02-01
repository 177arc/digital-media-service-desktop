/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaModellerPackage.java,v 1.1 2006/08/29 00:58:55 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.onceforall.metamodeller.MetaModellerFactory
 * @model kind="package"
 * @generated
 */
public class MetaModellerPackage extends EPackageImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "metamodeller";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.onceforall.org/meta-modeller/core.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.onceforall.metamodeller";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetaModellerPackage eINSTANCE = org.onceforall.metamodeller.MetaModellerPackage
			.init();

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.EObjectType <em>EObject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.EObjectType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEObjectType()
	 * @generated
	 */
	public static final int EOBJECT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EOBJECT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>EObject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EOBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.EPackageType <em>EPackage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.EPackageType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEPackageType()
	 * @generated
	 */
	public static final int EPACKAGE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_TYPE__NAME = EOBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>EPackage Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_TYPE__EPACKAGE_TYPES = EOBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MObject Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_TYPE__MOBJECT_TYPES = EOBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EPackage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EPACKAGE_TYPE_FEATURE_COUNT = EOBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.ERootPackageType <em>ERoot Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.ERootPackageType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType()
	 * @generated
	 */
	public static final int EROOT_PACKAGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__NAME = EPACKAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>EPackage Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EPACKAGE_TYPES = EPACKAGE_TYPE__EPACKAGE_TYPES;

	/**
	 * The feature id for the '<em><b>MObject Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MOBJECT_TYPES = EPACKAGE_TYPE__MOBJECT_TYPES;

	/**
	 * The feature id for the '<em><b>ECustom Data Type Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES = EPACKAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MPrimitive Data Type Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES = EPACKAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MObject Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MStateful Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MApplication Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MStep Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MScript Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MDirectory Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MExisting Directory Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MFile Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MExisting File Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>MState Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MStep State Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>MBoolean Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>MDate Time Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>MDate Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>MTime Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>MDuration Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>MLong Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>MPassword Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>MString Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>MUrl Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>EThrowable Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>EBoolean Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>EByte Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>EChar Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>EDouble Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>EFloat Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>EInt Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>ELong Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>EShort Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>EString Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>EJava Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>EJava Class Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>EBoolean Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>EByte Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>ECharacter Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>EDouble Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>EFloat Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>EInteger Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>ELong Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>EShort Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>EByte Array Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>EDate Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>EBig Integer Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>EBig Decimal Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>EResource Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>EResource Set Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>EFeature Map Entry Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>EFeature Map Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>EEnumerator Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>EE List Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>EE Tree Iterator Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER = EPACKAGE_TYPE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__BASE_PACKAGE = EPACKAGE_TYPE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__MODEL_NAME = EPACKAGE_TYPE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT = EPACKAGE_TYPE_FEATURE_COUNT + 55;

	/**
	 * The number of structural features of the '<em>ERoot Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EROOT_PACKAGE_TYPE_FEATURE_COUNT = EPACKAGE_TYPE_FEATURE_COUNT + 56;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MElementType <em>MElement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MElementType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType()
	 * @generated
	 */
	public static final int MELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__NAME = EOBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__MSUPER_TYPE = EOBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__DEFAULT_NAME = EOBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__DEFAULT_DESCRIPTION = EOBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH = EOBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE__NAME_FOR_UI = EOBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MElement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_TYPE_FEATURE_COUNT = EOBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MObjectType <em>MObject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MObjectType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType()
	 * @generated
	 */
	public static final int MOBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__NAME = MELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__MSUPER_TYPE = MELEMENT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__DEFAULT_NAME = MELEMENT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__DEFAULT_DESCRIPTION = MELEMENT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__DEFAULT_ICON_FILE_PATH = MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__NAME_FOR_UI = MELEMENT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>MProperty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__MPROPERTY_TYPES = MELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MReference Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__MREFERENCE_TYPES = MELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__ABSTRACT = MELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__COMPOSITE_CLASS_NAME = MELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE = MELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MObject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_TYPE_FEATURE_COUNT = MELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MStatefulObjectType <em>MStateful Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MStatefulObjectType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStatefulObjectType()
	 * @generated
	 */
	public static final int MSTATEFUL_OBJECT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__NAME = MOBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__MSUPER_TYPE = MOBJECT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__DEFAULT_NAME = MOBJECT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__DEFAULT_DESCRIPTION = MOBJECT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__DEFAULT_ICON_FILE_PATH = MOBJECT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__NAME_FOR_UI = MOBJECT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>MProperty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__MPROPERTY_TYPES = MOBJECT_TYPE__MPROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>MReference Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__MREFERENCE_TYPES = MOBJECT_TYPE__MREFERENCE_TYPES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__ABSTRACT = MOBJECT_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__COMPOSITE_CLASS_NAME = MOBJECT_TYPE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE = MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE;

	/**
	 * The number of structural features of the '<em>MStateful Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT = MOBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MStepType <em>MStep Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MStepType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType()
	 * @generated
	 */
	public static final int MSTEP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__NAME = MSTATEFUL_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MSUPER_TYPE = MSTATEFUL_OBJECT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__DEFAULT_NAME = MSTATEFUL_OBJECT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__DEFAULT_DESCRIPTION = MSTATEFUL_OBJECT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__DEFAULT_ICON_FILE_PATH = MSTATEFUL_OBJECT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__NAME_FOR_UI = MSTATEFUL_OBJECT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>MProperty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MPROPERTY_TYPES = MSTATEFUL_OBJECT_TYPE__MPROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>MReference Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MREFERENCE_TYPES = MSTATEFUL_OBJECT_TYPE__MREFERENCE_TYPES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__ABSTRACT = MSTATEFUL_OBJECT_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__COMPOSITE_CLASS_NAME = MSTATEFUL_OBJECT_TYPE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MREFERENCE_DATA_TYPE_TYPE = MSTATEFUL_OBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE;

	/**
	 * The feature id for the '<em><b>MParameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MPARAMETER_TYPES = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MResult Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__MRESULT_TYPES = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__DEFAULT_ACTION_NAME = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Action Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__INTERRUPTABLE = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__STOPPABLE = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE__TERMINATABLE = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MStep Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_TYPE_FEATURE_COUNT = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MValueType <em>MValue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MValueType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType()
	 * @generated
	 */
	public static final int MVALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__NAME = MELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__MSUPER_TYPE = MELEMENT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DEFAULT_NAME = MELEMENT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DEFAULT_DESCRIPTION = MELEMENT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DEFAULT_ICON_FILE_PATH = MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__NAME_FOR_UI = MELEMENT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Default Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DEFAULT_READ_ONLY = MELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DEFAULT_VALUE = MELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__VALUE_TYPE = MELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__LOWER_BOUND = MELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__UPPER_BOUND = MELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__DERIVED = MELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__TRANSIENT = MELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__VOLATILE = MELEMENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Historic Values Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND = MELEMENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__VALUE_EFEATURE_NAME = MELEMENT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Historic Values EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME = MELEMENT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generate Value Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__GENERATE_VALUE_FEATURE = MELEMENT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Generate MValue Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE__GENERATE_MVALUE_REFERENCE = MELEMENT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>MValue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_TYPE_FEATURE_COUNT = MELEMENT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MPropertyType <em>MProperty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MPropertyType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPropertyType()
	 * @generated
	 */
	public static final int MPROPERTY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__NAME = MVALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__MSUPER_TYPE = MVALUE_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DEFAULT_NAME = MVALUE_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DEFAULT_DESCRIPTION = MVALUE_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DEFAULT_ICON_FILE_PATH = MVALUE_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__NAME_FOR_UI = MVALUE_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Default Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DEFAULT_READ_ONLY = MVALUE_TYPE__DEFAULT_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DEFAULT_VALUE = MVALUE_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__VALUE_TYPE = MVALUE_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__LOWER_BOUND = MVALUE_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__UPPER_BOUND = MVALUE_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__DERIVED = MVALUE_TYPE__DERIVED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__TRANSIENT = MVALUE_TYPE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__VOLATILE = MVALUE_TYPE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Historic Values Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__HISTORIC_VALUES_UPPER_BOUND = MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Value EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__VALUE_EFEATURE_NAME = MVALUE_TYPE__VALUE_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Historic Values EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__HISTORIC_VALUES_EFEATURE_NAME = MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Generate Value Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__GENERATE_VALUE_FEATURE = MVALUE_TYPE__GENERATE_VALUE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generate MValue Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE__GENERATE_MVALUE_REFERENCE = MVALUE_TYPE__GENERATE_MVALUE_REFERENCE;

	/**
	 * The number of structural features of the '<em>MProperty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_TYPE_FEATURE_COUNT = MVALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MParameterType <em>MParameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MParameterType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMParameterType()
	 * @generated
	 */
	public static final int MPARAMETER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__NAME = MVALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__MSUPER_TYPE = MVALUE_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DEFAULT_NAME = MVALUE_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DEFAULT_DESCRIPTION = MVALUE_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DEFAULT_ICON_FILE_PATH = MVALUE_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__NAME_FOR_UI = MVALUE_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Default Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DEFAULT_READ_ONLY = MVALUE_TYPE__DEFAULT_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DEFAULT_VALUE = MVALUE_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__VALUE_TYPE = MVALUE_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__LOWER_BOUND = MVALUE_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__UPPER_BOUND = MVALUE_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__DERIVED = MVALUE_TYPE__DERIVED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__TRANSIENT = MVALUE_TYPE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__VOLATILE = MVALUE_TYPE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Historic Values Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__HISTORIC_VALUES_UPPER_BOUND = MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Value EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__VALUE_EFEATURE_NAME = MVALUE_TYPE__VALUE_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Historic Values EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__HISTORIC_VALUES_EFEATURE_NAME = MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Generate Value Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__GENERATE_VALUE_FEATURE = MVALUE_TYPE__GENERATE_VALUE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generate MValue Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE__GENERATE_MVALUE_REFERENCE = MVALUE_TYPE__GENERATE_MVALUE_REFERENCE;

	/**
	 * The number of structural features of the '<em>MParameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_TYPE_FEATURE_COUNT = MVALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MResultType <em>MResult Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MResultType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMResultType()
	 * @generated
	 */
	public static final int MRESULT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__NAME = MVALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__MSUPER_TYPE = MVALUE_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DEFAULT_NAME = MVALUE_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DEFAULT_DESCRIPTION = MVALUE_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DEFAULT_ICON_FILE_PATH = MVALUE_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__NAME_FOR_UI = MVALUE_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Default Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DEFAULT_READ_ONLY = MVALUE_TYPE__DEFAULT_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DEFAULT_VALUE = MVALUE_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__VALUE_TYPE = MVALUE_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__LOWER_BOUND = MVALUE_TYPE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__UPPER_BOUND = MVALUE_TYPE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__DERIVED = MVALUE_TYPE__DERIVED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__TRANSIENT = MVALUE_TYPE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__VOLATILE = MVALUE_TYPE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Historic Values Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__HISTORIC_VALUES_UPPER_BOUND = MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Value EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__VALUE_EFEATURE_NAME = MVALUE_TYPE__VALUE_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Historic Values EFeature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__HISTORIC_VALUES_EFEATURE_NAME = MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Generate Value Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__GENERATE_VALUE_FEATURE = MVALUE_TYPE__GENERATE_VALUE_FEATURE;

	/**
	 * The feature id for the '<em><b>Generate MValue Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE__GENERATE_MVALUE_REFERENCE = MVALUE_TYPE__GENERATE_MVALUE_REFERENCE;

	/**
	 * The number of structural features of the '<em>MResult Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_TYPE_FEATURE_COUNT = MVALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.EDataTypeType <em>EData Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.EDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getEDataTypeType()
	 * @generated
	 */
	public static final int EDATA_TYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EDATA_TYPE_TYPE__NAME = EOBJECT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>EData Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EDATA_TYPE_TYPE_FEATURE_COUNT = EOBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.ENativeDataTypeType <em>ENative Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.ENativeDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getENativeDataTypeType()
	 * @generated
	 */
	public static final int ENATIVE_DATA_TYPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENATIVE_DATA_TYPE_TYPE__NAME = EDATA_TYPE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>ENative Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENATIVE_DATA_TYPE_TYPE_FEATURE_COUNT = EDATA_TYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.ECustomDataTypeType <em>ECustom Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.ECustomDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getECustomDataTypeType()
	 * @generated
	 */
	public static final int ECUSTOM_DATA_TYPE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECUSTOM_DATA_TYPE_TYPE__NAME = EDATA_TYPE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECUSTOM_DATA_TYPE_TYPE__INSTANCE_CLASS_NAME = EDATA_TYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECustom Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ECUSTOM_DATA_TYPE_TYPE_FEATURE_COUNT = EDATA_TYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MReferenceType <em>MReference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MReferenceType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType()
	 * @generated
	 */
	public static final int MREFERENCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__NAME = EOBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MObject Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__MOBJECT_TYPE = EOBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__LOWER_BOUND = EOBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__UPPER_BOUND = EOBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__DERIVED = EOBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__TRANSIENT = EOBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__VOLATILE = EOBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE__CONTAINMENT = EOBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MReference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_TYPE_FEATURE_COUNT = EOBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MApplicationType <em>MApplication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MApplicationType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMApplicationType()
	 * @generated
	 */
	public static final int MAPPLICATION_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MValueDataTypeType <em>MValue Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MValueDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueDataTypeType()
	 * @generated
	 */
	public static final int MVALUE_DATA_TYPE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MReferenceValueType <em>MReference Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MReferenceValueType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceValueType()
	 * @generated
	 */
	public static final int MREFERENCE_VALUE_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MReferenceDataTypeType <em>MReference Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MReferenceDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceDataTypeType()
	 * @generated
	 */
	public static final int MREFERENCE_DATA_TYPE_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType <em>MPrimitive Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MPrimitiveDataTypeType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPrimitiveDataTypeType()
	 * @generated
	 */
	public static final int MPRIMITIVE_DATA_TYPE_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.onceforall.metamodeller.MBusinessObjectType <em>MBusiness Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.metamodeller.MBusinessObjectType
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getMBusinessObjectType()
	 * @generated
	 */
	public static final int MBUSINESS_OBJECT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__NAME = MSTATEFUL_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__MSUPER_TYPE = MSTATEFUL_OBJECT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__DEFAULT_NAME = MSTATEFUL_OBJECT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__DEFAULT_DESCRIPTION = MSTATEFUL_OBJECT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__DEFAULT_ICON_FILE_PATH = MSTATEFUL_OBJECT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__NAME_FOR_UI = MSTATEFUL_OBJECT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>MProperty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__MPROPERTY_TYPES = MSTATEFUL_OBJECT_TYPE__MPROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>MReference Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__MREFERENCE_TYPES = MSTATEFUL_OBJECT_TYPE__MREFERENCE_TYPES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__ABSTRACT = MSTATEFUL_OBJECT_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__COMPOSITE_CLASS_NAME = MSTATEFUL_OBJECT_TYPE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE = MSTATEFUL_OBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE;

	/**
	 * The feature id for the '<em><b>MStep Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE__MSTEP_TYPES = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBusiness Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBUSINESS_OBJECT_TYPE_FEATURE_COUNT = MSTATEFUL_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__NAME = MBUSINESS_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MSuper Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__MSUPER_TYPE = MBUSINESS_OBJECT_TYPE__MSUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__DEFAULT_NAME = MBUSINESS_OBJECT_TYPE__DEFAULT_NAME;

	/**
	 * The feature id for the '<em><b>Default Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__DEFAULT_DESCRIPTION = MBUSINESS_OBJECT_TYPE__DEFAULT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__DEFAULT_ICON_FILE_PATH = MBUSINESS_OBJECT_TYPE__DEFAULT_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__NAME_FOR_UI = MBUSINESS_OBJECT_TYPE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>MProperty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__MPROPERTY_TYPES = MBUSINESS_OBJECT_TYPE__MPROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>MReference Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__MREFERENCE_TYPES = MBUSINESS_OBJECT_TYPE__MREFERENCE_TYPES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__ABSTRACT = MBUSINESS_OBJECT_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__COMPOSITE_CLASS_NAME = MBUSINESS_OBJECT_TYPE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>MReference Data Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__MREFERENCE_DATA_TYPE_TYPE = MBUSINESS_OBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE;

	/**
	 * The feature id for the '<em><b>MStep Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE__MSTEP_TYPES = MBUSINESS_OBJECT_TYPE__MSTEP_TYPES;

	/**
	 * The number of structural features of the '<em>MApplication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_TYPE_FEATURE_COUNT = MBUSINESS_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_DATA_TYPE_TYPE__NAME = EDATA_TYPE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>MValue Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_DATA_TYPE_TYPE_FEATURE_COUNT = EDATA_TYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReference Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_VALUE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_DATA_TYPE_TYPE__NAME = MVALUE_DATA_TYPE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>MObject Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE = MVALUE_DATA_TYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReference Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MREFERENCE_DATA_TYPE_TYPE_FEATURE_COUNT = MVALUE_DATA_TYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPRIMITIVE_DATA_TYPE_TYPE__NAME = MVALUE_DATA_TYPE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME = MVALUE_DATA_TYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MPrimitive Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPRIMITIVE_DATA_TYPE_TYPE_FEATURE_COUNT = MVALUE_DATA_TYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRootPackageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNativeDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCustomDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mApplicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mValueDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mReferenceValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mReferenceDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPrimitiveDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mStatefulObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mBusinessObjectTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.onceforall.metamodeller.MetaModellerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaModellerPackage() {
		super(eNS_URI, MetaModellerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaModellerPackage init() {
		if (isInited)
			return (MetaModellerPackage) EPackage.Registry.INSTANCE
					.getEPackage(MetaModellerPackage.eNS_URI);

		// Obtain or create and register package
		MetaModellerPackage theMetaModellerPackage = (MetaModellerPackage) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof MetaModellerPackage ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new MetaModellerPackage());

		isInited = true;

		// Create package meta-data objects
		theMetaModellerPackage.createPackageContents();

		// Initialize created meta-data
		theMetaModellerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaModellerPackage.freeze();

		return theMetaModellerPackage;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.ERootPackageType <em>ERoot Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERoot Package Type</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType
	 * @generated
	 */
	public EClass getERootPackageType() {
		return eRootPackageTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.ERootPackageType#getECustomDataTypeTypes <em>ECustom Data Type Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ECustom Data Type Types</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getECustomDataTypeTypes()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_ECustomDataTypeTypes() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.ERootPackageType#getMPrimitiveDataTypeTypes <em>MPrimitive Data Type Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MPrimitive Data Type Types</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMPrimitiveDataTypeTypes()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MPrimitiveDataTypeTypes() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMObjectTypePlaceholder <em>MObject Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MObject Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMStatefulObjectTypePlaceholder <em>MStateful Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MStateful Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMStatefulObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MStatefulObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMApplicationTypePlaceholder <em>MApplication Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MApplication Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMApplicationTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MApplicationTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMStepTypePlaceholder <em>MStep Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MStep Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMStepTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MStepTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMScriptTypePlaceholder <em>MScript Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MScript Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMScriptTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MScriptTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMDirectoryTypePlaceholder <em>MDirectory Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMDirectoryTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MDirectoryTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMExistingDirectoryTypePlaceholder <em>MExisting Directory Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MExisting Directory Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMExistingDirectoryTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MExistingDirectoryTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMFileTypePlaceholder <em>MFile Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFile Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMFileTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MFileTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMExistingFileTypePlaceholder <em>MExisting File Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MExisting File Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMExistingFileTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MExistingFileTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(10);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMStateTypePlaceholder <em>MState Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MState Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMStateTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MStateTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMStepStateTypePlaceholder <em>MStep State Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MStep State Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMStepStateTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MStepStateTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMBooleanTypePlaceholder <em>MBoolean Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MBoolean Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMBooleanTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MBooleanTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMDateTimeTypePlaceholder <em>MDate Time Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDate Time Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMDateTimeTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MDateTimeTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMDateTypePlaceholder <em>MDate Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDate Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMDateTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MDateTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMTimeTypePlaceholder <em>MTime Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTime Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMTimeTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MTimeTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMDurationTypePlaceholder <em>MDuration Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDuration Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMDurationTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MDurationTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(17);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMLongTypePlaceholder <em>MLong Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLong Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMLongTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MLongTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(18);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMPasswordTypePlaceholder <em>MPassword Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPassword Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMPasswordTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MPasswordTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(19);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMStringTypePlaceholder <em>MString Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MString Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMStringTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MStringTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(20);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getMUrlTypePlaceholder <em>MUrl Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUrl Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getMUrlTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_MUrlTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(21);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEThrowableTypePlaceholder <em>EThrowable Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EThrowable Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEThrowableTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EThrowableTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(22);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanTypePlaceholder <em>EBoolean Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBoolean Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEBooleanTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EBooleanTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(23);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEByteTypePlaceholder <em>EByte Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EByte Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEByteTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EByteTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(24);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getECharTypePlaceholder <em>EChar Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EChar Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getECharTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_ECharTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(25);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleTypePlaceholder <em>EDouble Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDouble Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEDoubleTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EDoubleTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(26);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEFloatTypePlaceholder <em>EFloat Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EFloat Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEFloatTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EFloatTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(27);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEIntTypePlaceholder <em>EInt Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EInt Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEIntTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EIntTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(28);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getELongTypePlaceholder <em>ELong Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELong Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getELongTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_ELongTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(29);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEShortTypePlaceholder <em>EShort Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EShort Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEShortTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EShortTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(30);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEStringTypePlaceholder <em>EString Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EString Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEStringTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EStringTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(31);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEJavaObjectTypePlaceholder <em>EJava Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EJava Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEJavaObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EJavaObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(32);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEJavaClassTypePlaceholder <em>EJava Class Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EJava Class Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEJavaClassTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EJavaClassTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(33);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanObjectTypePlaceholder <em>EBoolean Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBoolean Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEBooleanObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EBooleanObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(34);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEByteObjectTypePlaceholder <em>EByte Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EByte Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEByteObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EByteObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(35);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getECharacterObjectTypePlaceholder <em>ECharacter Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECharacter Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getECharacterObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_ECharacterObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(36);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleObjectTypePlaceholder <em>EDouble Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDouble Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEDoubleObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EDoubleObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(37);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEFloatObjectTypePlaceholder <em>EFloat Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EFloat Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEFloatObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EFloatObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(38);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEIntegerObjectTypePlaceholder <em>EInteger Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EInteger Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEIntegerObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EIntegerObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(39);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getELongObjectTypePlaceholder <em>ELong Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELong Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getELongObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_ELongObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(40);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEShortObjectTypePlaceholder <em>EShort Object Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EShort Object Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEShortObjectTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EShortObjectTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(41);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEByteArrayTypePlaceholder <em>EByte Array Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EByte Array Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEByteArrayTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EByteArrayTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(42);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEDateTypePlaceholder <em>EDate Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDate Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEDateTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EDateTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(43);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEBigIntegerTypePlaceholder <em>EBig Integer Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBig Integer Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEBigIntegerTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EBigIntegerTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(44);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEBigDecimalTypePlaceholder <em>EBig Decimal Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBig Decimal Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEBigDecimalTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EBigDecimalTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(45);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEResourceTypePlaceholder <em>EResource Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EResource Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEResourceTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EResourceTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(46);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEResourceSetTypePlaceholder <em>EResource Set Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EResource Set Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEResourceSetTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EResourceSetTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(47);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapEntryTypePlaceholder <em>EFeature Map Entry Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EFeature Map Entry Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEFeatureMapEntryTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EFeatureMapEntryTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(48);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapTypePlaceholder <em>EFeature Map Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EFeature Map Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEFeatureMapTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EFeatureMapTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(49);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEEnumeratorTypePlaceholder <em>EEnumerator Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EEnumerator Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEEnumeratorTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EEnumeratorTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(50);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEEListTypePlaceholder <em>EE List Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EE List Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEEListTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EEListTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(51);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.ERootPackageType#getEETreeIteratorTypePlaceholder <em>EE Tree Iterator Type Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EE Tree Iterator Type Placeholder</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getEETreeIteratorTypePlaceholder()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EReference getERootPackageType_EETreeIteratorTypePlaceholder() {
		return (EReference) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(52);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.ERootPackageType#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getBasePackage()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EAttribute getERootPackageType_BasePackage() {
		return (EAttribute) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(53);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.ERootPackageType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getModelName()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EAttribute getERootPackageType_ModelName() {
		return (EAttribute) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(54);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.ERootPackageType#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see org.onceforall.metamodeller.ERootPackageType#getCopyrightText()
	 * @see #getERootPackageType()
	 * @generated
	 */
	public EAttribute getERootPackageType_CopyrightText() {
		return (EAttribute) eRootPackageTypeEClass.getEStructuralFeatures()
				.get(55);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.EPackageType <em>EPackage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Type</em>'.
	 * @see org.onceforall.metamodeller.EPackageType
	 * @generated
	 */
	public EClass getEPackageType() {
		return ePackageTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.EPackageType#getEPackageTypes <em>EPackage Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EPackage Types</em>'.
	 * @see org.onceforall.metamodeller.EPackageType#getEPackageTypes()
	 * @see #getEPackageType()
	 * @generated
	 */
	public EReference getEPackageType_EPackageTypes() {
		return (EReference) ePackageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.EPackageType#getMObjectTypes <em>MObject Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MObject Types</em>'.
	 * @see org.onceforall.metamodeller.EPackageType#getMObjectTypes()
	 * @see #getEPackageType()
	 * @generated
	 */
	public EReference getEPackageType_MObjectTypes() {
		return (EReference) ePackageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MElementType <em>MElement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MElement Type</em>'.
	 * @see org.onceforall.metamodeller.MElementType
	 * @generated
	 */
	public EClass getMElementType() {
		return mElementTypeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.metamodeller.MElementType#getMSuperType <em>MSuper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MSuper Type</em>'.
	 * @see org.onceforall.metamodeller.MElementType#getMSuperType()
	 * @see #getMElementType()
	 * @generated
	 */
	public EReference getMElementType_MSuperType() {
		return (EReference) mElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MElementType#getDefaultName <em>Default Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Name</em>'.
	 * @see org.onceforall.metamodeller.MElementType#getDefaultName()
	 * @see #getMElementType()
	 * @generated
	 */
	public EAttribute getMElementType_DefaultName() {
		return (EAttribute) mElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MElementType#getDefaultDescription <em>Default Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Description</em>'.
	 * @see org.onceforall.metamodeller.MElementType#getDefaultDescription()
	 * @see #getMElementType()
	 * @generated
	 */
	public EAttribute getMElementType_DefaultDescription() {
		return (EAttribute) mElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MElementType#getDefaultIconFilePath <em>Default Icon File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Icon File Path</em>'.
	 * @see org.onceforall.metamodeller.MElementType#getDefaultIconFilePath()
	 * @see #getMElementType()
	 * @generated
	 */
	public EAttribute getMElementType_DefaultIconFilePath() {
		return (EAttribute) mElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MElementType#getNameForUI <em>Name For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name For UI</em>'.
	 * @see org.onceforall.metamodeller.MElementType#getNameForUI()
	 * @see #getMElementType()
	 * @generated
	 */
	public EAttribute getMElementType_NameForUI() {
		return (EAttribute) mElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MObjectType <em>MObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MObject Type</em>'.
	 * @see org.onceforall.metamodeller.MObjectType
	 * @generated
	 */
	public EClass getMObjectType() {
		return mObjectTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.MObjectType#getMPropertyTypes <em>MProperty Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MProperty Types</em>'.
	 * @see org.onceforall.metamodeller.MObjectType#getMPropertyTypes()
	 * @see #getMObjectType()
	 * @generated
	 */
	public EReference getMObjectType_MPropertyTypes() {
		return (EReference) mObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.MObjectType#getMReferenceTypes <em>MReference Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MReference Types</em>'.
	 * @see org.onceforall.metamodeller.MObjectType#getMReferenceTypes()
	 * @see #getMObjectType()
	 * @generated
	 */
	public EReference getMObjectType_MReferenceTypes() {
		return (EReference) mObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MObjectType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.onceforall.metamodeller.MObjectType#getAbstract()
	 * @see #getMObjectType()
	 * @generated
	 */
	public EAttribute getMObjectType_Abstract() {
		return (EAttribute) mObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MObjectType#getCompositeClassName <em>Composite Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Class Name</em>'.
	 * @see org.onceforall.metamodeller.MObjectType#getCompositeClassName()
	 * @see #getMObjectType()
	 * @generated
	 */
	public EAttribute getMObjectType_CompositeClassName() {
		return (EAttribute) mObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType <em>MReference Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MReference Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.MObjectType#getMReferenceDataTypeType()
	 * @see #getMObjectType()
	 * @generated
	 */
	public EReference getMObjectType_MReferenceDataTypeType() {
		return (EReference) mObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MStepType <em>MStep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MStep Type</em>'.
	 * @see org.onceforall.metamodeller.MStepType
	 * @generated
	 */
	public EClass getMStepType() {
		return mStepTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.MStepType#getMParameterTypes <em>MParameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MParameter Types</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getMParameterTypes()
	 * @see #getMStepType()
	 * @generated
	 */
	public EReference getMStepType_MParameterTypes() {
		return (EReference) mStepTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.MStepType#getMResultTypes <em>MResult Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MResult Types</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getMResultTypes()
	 * @see #getMStepType()
	 * @generated
	 */
	public EReference getMStepType_MResultTypes() {
		return (EReference) mStepTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MStepType#getDefaultActionName <em>Default Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Action Name</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getDefaultActionName()
	 * @see #getMStepType()
	 * @generated
	 */
	public EAttribute getMStepType_DefaultActionName() {
		return (EAttribute) mStepTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MStepType#getDefaultActionIconFilePath <em>Default Action Icon File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Action Icon File Path</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getDefaultActionIconFilePath()
	 * @see #getMStepType()
	 * @generated
	 */
	public EAttribute getMStepType_DefaultActionIconFilePath() {
		return (EAttribute) mStepTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MStepType#getInterruptable <em>Interruptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interruptable</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getInterruptable()
	 * @see #getMStepType()
	 * @generated
	 */
	public EAttribute getMStepType_Interruptable() {
		return (EAttribute) mStepTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MStepType#getStoppable <em>Stoppable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stoppable</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getStoppable()
	 * @see #getMStepType()
	 * @generated
	 */
	public EAttribute getMStepType_Stoppable() {
		return (EAttribute) mStepTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MStepType#getTerminatable <em>Terminatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminatable</em>'.
	 * @see org.onceforall.metamodeller.MStepType#getTerminatable()
	 * @see #getMStepType()
	 * @generated
	 */
	public EAttribute getMStepType_Terminatable() {
		return (EAttribute) mStepTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MValueType <em>MValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MValue Type</em>'.
	 * @see org.onceforall.metamodeller.MValueType
	 * @generated
	 */
	public EClass getMValueType() {
		return mValueTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getDefaultReadOnly <em>Default Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Read Only</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getDefaultReadOnly()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_DefaultReadOnly() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getDefaultValue()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_DefaultValue() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.metamodeller.MValueType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getValueType()
	 * @see #getMValueType()
	 * @generated
	 */
	public EReference getMValueType_ValueType() {
		return (EReference) mValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getLowerBound()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_LowerBound() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getUpperBound()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_UpperBound() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getDerived()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_Derived() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getTransient()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_Transient() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getVolatile()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_Volatile() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getHistoricValuesUpperBound <em>Historic Values Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Historic Values Upper Bound</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getHistoricValuesUpperBound()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_HistoricValuesUpperBound() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getValueEFeatureName <em>Value EFeature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value EFeature Name</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getValueEFeatureName()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_ValueEFeatureName() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#getHistoricValuesEFeatureName <em>Historic Values EFeature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Historic Values EFeature Name</em>'.
	 * @see org.onceforall.metamodeller.MValueType#getHistoricValuesEFeatureName()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_HistoricValuesEFeatureName() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#isGenerateValueFeature <em>Generate Value Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Value Feature</em>'.
	 * @see org.onceforall.metamodeller.MValueType#isGenerateValueFeature()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_GenerateValueFeature() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MValueType#isGenerateMValueReference <em>Generate MValue Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate MValue Reference</em>'.
	 * @see org.onceforall.metamodeller.MValueType#isGenerateMValueReference()
	 * @see #getMValueType()
	 * @generated
	 */
	public EAttribute getMValueType_GenerateMValueReference() {
		return (EAttribute) mValueTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MPropertyType <em>MProperty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MProperty Type</em>'.
	 * @see org.onceforall.metamodeller.MPropertyType
	 * @generated
	 */
	public EClass getMPropertyType() {
		return mPropertyTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MParameterType <em>MParameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MParameter Type</em>'.
	 * @see org.onceforall.metamodeller.MParameterType
	 * @generated
	 */
	public EClass getMParameterType() {
		return mParameterTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MResultType <em>MResult Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MResult Type</em>'.
	 * @see org.onceforall.metamodeller.MResultType
	 * @generated
	 */
	public EClass getMResultType() {
		return mResultTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.EDataTypeType <em>EData Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type Type</em>'.
	 * @see org.onceforall.metamodeller.EDataTypeType
	 * @generated
	 */
	public EClass getEDataTypeType() {
		return eDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.EObjectType <em>EObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Type</em>'.
	 * @see org.onceforall.metamodeller.EObjectType
	 * @generated
	 */
	public EClass getEObjectType() {
		return eObjectTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.EObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.onceforall.metamodeller.EObjectType#getName()
	 * @see #getEObjectType()
	 * @generated
	 */
	public EAttribute getEObjectType_Name() {
		return (EAttribute) eObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.ENativeDataTypeType <em>ENative Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENative Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.ENativeDataTypeType
	 * @generated
	 */
	public EClass getENativeDataTypeType() {
		return eNativeDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.ECustomDataTypeType <em>ECustom Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECustom Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.ECustomDataTypeType
	 * @generated
	 */
	public EClass getECustomDataTypeType() {
		return eCustomDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.ECustomDataTypeType#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see org.onceforall.metamodeller.ECustomDataTypeType#getInstanceClassName()
	 * @see #getECustomDataTypeType()
	 * @generated
	 */
	public EAttribute getECustomDataTypeType_InstanceClassName() {
		return (EAttribute) eCustomDataTypeTypeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MReferenceType <em>MReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MReference Type</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType
	 * @generated
	 */
	public EClass getMReferenceType() {
		return mReferenceTypeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.metamodeller.MReferenceType#getMObjectType <em>MObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MObject Type</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getMObjectType()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EReference getMReferenceType_MObjectType() {
		return (EReference) mReferenceTypeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getLowerBound()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_LowerBound() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getUpperBound()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_UpperBound() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getDerived()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_Derived() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getTransient()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_Transient() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getVolatile()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_Volatile() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MReferenceType#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.onceforall.metamodeller.MReferenceType#getContainment()
	 * @see #getMReferenceType()
	 * @generated
	 */
	public EAttribute getMReferenceType_Containment() {
		return (EAttribute) mReferenceTypeEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MApplicationType <em>MApplication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MApplication Type</em>'.
	 * @see org.onceforall.metamodeller.MApplicationType
	 * @generated
	 */
	public EClass getMApplicationType() {
		return mApplicationTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MValueDataTypeType <em>MValue Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MValue Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.MValueDataTypeType
	 * @generated
	 */
	public EClass getMValueDataTypeType() {
		return mValueDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MReferenceValueType <em>MReference Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MReference Value Type</em>'.
	 * @see org.onceforall.metamodeller.MReferenceValueType
	 * @generated
	 */
	public EClass getMReferenceValueType() {
		return mReferenceValueTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MReferenceDataTypeType <em>MReference Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MReference Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.MReferenceDataTypeType
	 * @generated
	 */
	public EClass getMReferenceDataTypeType() {
		return mReferenceDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType <em>MObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MObject Type</em>'.
	 * @see org.onceforall.metamodeller.MReferenceDataTypeType#getMObjectType()
	 * @see #getMReferenceDataTypeType()
	 * @generated
	 */
	public EReference getMReferenceDataTypeType_MObjectType() {
		return (EReference) mReferenceDataTypeTypeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType <em>MPrimitive Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPrimitive Data Type Type</em>'.
	 * @see org.onceforall.metamodeller.MPrimitiveDataTypeType
	 * @generated
	 */
	public EClass getMPrimitiveDataTypeType() {
		return mPrimitiveDataTypeTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType#getDataTypeName <em>Data Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Name</em>'.
	 * @see org.onceforall.metamodeller.MPrimitiveDataTypeType#getDataTypeName()
	 * @see #getMPrimitiveDataTypeType()
	 * @generated
	 */
	public EAttribute getMPrimitiveDataTypeType_DataTypeName() {
		return (EAttribute) mPrimitiveDataTypeTypeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MStatefulObjectType <em>MStateful Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MStateful Object Type</em>'.
	 * @see org.onceforall.metamodeller.MStatefulObjectType
	 * @generated
	 */
	public EClass getMStatefulObjectType() {
		return mStatefulObjectTypeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.metamodeller.MBusinessObjectType <em>MBusiness Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBusiness Object Type</em>'.
	 * @see org.onceforall.metamodeller.MBusinessObjectType
	 * @generated
	 */
	public EClass getMBusinessObjectType() {
		return mBusinessObjectTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.metamodeller.MBusinessObjectType#getMStepTypes <em>MStep Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MStep Types</em>'.
	 * @see org.onceforall.metamodeller.MBusinessObjectType#getMStepTypes()
	 * @see #getMBusinessObjectType()
	 * @generated
	 */
	public EReference getMBusinessObjectType_MStepTypes() {
		return (EReference) mBusinessObjectTypeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public MetaModellerFactory getMetaModellerFactory() {
		return (MetaModellerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eRootPackageTypeEClass = createEClass(EROOT_PACKAGE_TYPE);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER);
		createEReference(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER);
		createEAttribute(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__BASE_PACKAGE);
		createEAttribute(eRootPackageTypeEClass, EROOT_PACKAGE_TYPE__MODEL_NAME);
		createEAttribute(eRootPackageTypeEClass,
				EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT);

		ePackageTypeEClass = createEClass(EPACKAGE_TYPE);
		createEReference(ePackageTypeEClass, EPACKAGE_TYPE__EPACKAGE_TYPES);
		createEReference(ePackageTypeEClass, EPACKAGE_TYPE__MOBJECT_TYPES);

		mElementTypeEClass = createEClass(MELEMENT_TYPE);
		createEReference(mElementTypeEClass, MELEMENT_TYPE__MSUPER_TYPE);
		createEAttribute(mElementTypeEClass, MELEMENT_TYPE__DEFAULT_NAME);
		createEAttribute(mElementTypeEClass, MELEMENT_TYPE__DEFAULT_DESCRIPTION);
		createEAttribute(mElementTypeEClass,
				MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH);
		createEAttribute(mElementTypeEClass, MELEMENT_TYPE__NAME_FOR_UI);

		mObjectTypeEClass = createEClass(MOBJECT_TYPE);
		createEReference(mObjectTypeEClass, MOBJECT_TYPE__MPROPERTY_TYPES);
		createEReference(mObjectTypeEClass, MOBJECT_TYPE__MREFERENCE_TYPES);
		createEAttribute(mObjectTypeEClass, MOBJECT_TYPE__ABSTRACT);
		createEAttribute(mObjectTypeEClass, MOBJECT_TYPE__COMPOSITE_CLASS_NAME);
		createEReference(mObjectTypeEClass,
				MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE);

		mStepTypeEClass = createEClass(MSTEP_TYPE);
		createEReference(mStepTypeEClass, MSTEP_TYPE__MPARAMETER_TYPES);
		createEReference(mStepTypeEClass, MSTEP_TYPE__MRESULT_TYPES);
		createEAttribute(mStepTypeEClass, MSTEP_TYPE__DEFAULT_ACTION_NAME);
		createEAttribute(mStepTypeEClass,
				MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH);
		createEAttribute(mStepTypeEClass, MSTEP_TYPE__INTERRUPTABLE);
		createEAttribute(mStepTypeEClass, MSTEP_TYPE__STOPPABLE);
		createEAttribute(mStepTypeEClass, MSTEP_TYPE__TERMINATABLE);

		mValueTypeEClass = createEClass(MVALUE_TYPE);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__DEFAULT_READ_ONLY);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__DEFAULT_VALUE);
		createEReference(mValueTypeEClass, MVALUE_TYPE__VALUE_TYPE);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__LOWER_BOUND);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__UPPER_BOUND);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__DERIVED);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__TRANSIENT);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__VOLATILE);
		createEAttribute(mValueTypeEClass,
				MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__VALUE_EFEATURE_NAME);
		createEAttribute(mValueTypeEClass,
				MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME);
		createEAttribute(mValueTypeEClass, MVALUE_TYPE__GENERATE_VALUE_FEATURE);
		createEAttribute(mValueTypeEClass,
				MVALUE_TYPE__GENERATE_MVALUE_REFERENCE);

		mPropertyTypeEClass = createEClass(MPROPERTY_TYPE);

		mParameterTypeEClass = createEClass(MPARAMETER_TYPE);

		mResultTypeEClass = createEClass(MRESULT_TYPE);

		eDataTypeTypeEClass = createEClass(EDATA_TYPE_TYPE);

		eObjectTypeEClass = createEClass(EOBJECT_TYPE);
		createEAttribute(eObjectTypeEClass, EOBJECT_TYPE__NAME);

		eNativeDataTypeTypeEClass = createEClass(ENATIVE_DATA_TYPE_TYPE);

		eCustomDataTypeTypeEClass = createEClass(ECUSTOM_DATA_TYPE_TYPE);
		createEAttribute(eCustomDataTypeTypeEClass,
				ECUSTOM_DATA_TYPE_TYPE__INSTANCE_CLASS_NAME);

		mReferenceTypeEClass = createEClass(MREFERENCE_TYPE);
		createEReference(mReferenceTypeEClass, MREFERENCE_TYPE__MOBJECT_TYPE);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__LOWER_BOUND);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__UPPER_BOUND);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__DERIVED);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__TRANSIENT);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__VOLATILE);
		createEAttribute(mReferenceTypeEClass, MREFERENCE_TYPE__CONTAINMENT);

		mApplicationTypeEClass = createEClass(MAPPLICATION_TYPE);

		mValueDataTypeTypeEClass = createEClass(MVALUE_DATA_TYPE_TYPE);

		mReferenceValueTypeEClass = createEClass(MREFERENCE_VALUE_TYPE);

		mReferenceDataTypeTypeEClass = createEClass(MREFERENCE_DATA_TYPE_TYPE);
		createEReference(mReferenceDataTypeTypeEClass,
				MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE);

		mPrimitiveDataTypeTypeEClass = createEClass(MPRIMITIVE_DATA_TYPE_TYPE);
		createEAttribute(mPrimitiveDataTypeTypeEClass,
				MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME);

		mStatefulObjectTypeEClass = createEClass(MSTATEFUL_OBJECT_TYPE);

		mBusinessObjectTypeEClass = createEClass(MBUSINESS_OBJECT_TYPE);
		createEReference(mBusinessObjectTypeEClass,
				MBUSINESS_OBJECT_TYPE__MSTEP_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		eRootPackageTypeEClass.getESuperTypes().add(this.getEPackageType());
		ePackageTypeEClass.getESuperTypes().add(this.getEObjectType());
		mElementTypeEClass.getESuperTypes().add(this.getEObjectType());
		mObjectTypeEClass.getESuperTypes().add(this.getMElementType());
		mStepTypeEClass.getESuperTypes().add(this.getMStatefulObjectType());
		mValueTypeEClass.getESuperTypes().add(this.getMElementType());
		mPropertyTypeEClass.getESuperTypes().add(this.getMValueType());
		mParameterTypeEClass.getESuperTypes().add(this.getMValueType());
		mResultTypeEClass.getESuperTypes().add(this.getMValueType());
		eDataTypeTypeEClass.getESuperTypes().add(this.getEObjectType());
		eNativeDataTypeTypeEClass.getESuperTypes().add(this.getEDataTypeType());
		eCustomDataTypeTypeEClass.getESuperTypes().add(this.getEDataTypeType());
		mReferenceTypeEClass.getESuperTypes().add(this.getEObjectType());
		mApplicationTypeEClass.getESuperTypes().add(
				this.getMBusinessObjectType());
		mValueDataTypeTypeEClass.getESuperTypes().add(this.getEDataTypeType());
		mReferenceDataTypeTypeEClass.getESuperTypes().add(
				this.getMValueDataTypeType());
		mPrimitiveDataTypeTypeEClass.getESuperTypes().add(
				this.getMValueDataTypeType());
		mStatefulObjectTypeEClass.getESuperTypes().add(this.getMObjectType());
		mBusinessObjectTypeEClass.getESuperTypes().add(
				this.getMStatefulObjectType());

		// Initialize classes and features; add operations and parameters
		initEClass(eRootPackageTypeEClass, ERootPackageType.class,
				"ERootPackageType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERootPackageType_ECustomDataTypeTypes(), this
				.getECustomDataTypeType(), null, "eCustomDataTypeTypes", null,
				0, -1, ERootPackageType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MPrimitiveDataTypeTypes(), this
				.getMPrimitiveDataTypeType(), null, "mPrimitiveDataTypeTypes",
				null, 0, -1, ERootPackageType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MObjectTypePlaceholder(), this
				.getMObjectType(), null, "mObjectTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MStatefulObjectTypePlaceholder(),
				this.getMObjectType(), null, "mStatefulObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MApplicationTypePlaceholder(), this
				.getMApplicationType(), null, "mApplicationTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MStepTypePlaceholder(), this
				.getMStepType(), null, "mStepTypePlaceholder", "", 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MScriptTypePlaceholder(), this
				.getMObjectType(), null, "mScriptTypePlaceholder", "", 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MDirectoryTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null,
				"mDirectoryTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MExistingDirectoryTypePlaceholder(),
				this.getMPrimitiveDataTypeType(), null,
				"mExistingDirectoryTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MFileTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mFileTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MExistingFileTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null,
				"mExistingFileTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MStateTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mStateTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MStepStateTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null,
				"mStepStateTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MBooleanTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mBooleanTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MDateTimeTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mDateTimeTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MDateTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mDateTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MTimeTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mTimeTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MDurationTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mDurationTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MLongTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mLongTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MPasswordTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mPasswordTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MStringTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mStringTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_MUrlTypePlaceholder(), this
				.getMPrimitiveDataTypeType(), null, "mUrlTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EThrowableTypePlaceholder(), this
				.getECustomDataTypeType(), null, "eThrowableTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EBooleanTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eBooleanTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EByteTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eByteTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_ECharTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eCharTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EDoubleTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eDoubleTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EFloatTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eFloatTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EIntTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eIntTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_ELongTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eLongTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EShortTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eShortTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EStringTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eStringTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EJavaObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eJavaObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EJavaClassTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eJavaClassTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EBooleanObjectTypePlaceholder(),
				this.getENativeDataTypeType(), null,
				"eBooleanObjectTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EByteObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eByteObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_ECharacterObjectTypePlaceholder(),
				this.getENativeDataTypeType(), null,
				"eCharacterObjectTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EDoubleObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null,
				"eDoubleObjectTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EFloatObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eFloatObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EIntegerObjectTypePlaceholder(),
				this.getENativeDataTypeType(), null,
				"eIntegerObjectTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_ELongObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eLongObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EShortObjectTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eShortObjectTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EByteArrayTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eByteArrayTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EDateTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eDateTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EBigIntegerTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eBigIntegerTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EBigDecimalTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eBigDecimalTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EResourceTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eResourceTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EResourceSetTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eResourceSetTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EFeatureMapEntryTypePlaceholder(),
				this.getENativeDataTypeType(), null,
				"eFeatureMapEntryTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EFeatureMapTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eFeatureMapTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EEnumeratorTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eEnumeratorTypePlaceholder",
				null, 1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EEListTypePlaceholder(), this
				.getENativeDataTypeType(), null, "eEListTypePlaceholder", null,
				1, 1, ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERootPackageType_EETreeIteratorTypePlaceholder(),
				this.getENativeDataTypeType(), null,
				"eETreeIteratorTypePlaceholder", null, 1, 1,
				ERootPackageType.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERootPackageType_BasePackage(), ecorePackage
				.getEString(), "basePackage", null, 1, 1,
				ERootPackageType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getERootPackageType_ModelName(), ecorePackage
				.getEString(), "modelName", null, 1, 1, ERootPackageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERootPackageType_CopyrightText(), ecorePackage
				.getEString(), "copyrightText", null, 0, 1,
				ERootPackageType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ePackageTypeEClass, EPackageType.class, "EPackageType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPackageType_EPackageTypes(), this.getEPackageType(),
				null, "ePackageTypes", null, 0, -1, EPackageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEPackageType_MObjectTypes(), this.getMObjectType(),
				null, "mObjectTypes", null, 0, -1, EPackageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mElementTypeEClass, MElementType.class, "MElementType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMElementType_MSuperType(), this.getMElementType(),
				null, "mSuperType", null, 0, 1, MElementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMElementType_DefaultName(),
				ecorePackage.getEString(), "defaultName", null, 1, 1,
				MElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElementType_DefaultDescription(), ecorePackage
				.getEString(), "defaultDescription", null, 0, 1,
				MElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElementType_DefaultIconFilePath(), ecorePackage
				.getEString(), "defaultIconFilePath", null, 0, 1,
				MElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElementType_NameForUI(), ecorePackage.getEString(),
				"nameForUI", null, 0, 1, MElementType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mObjectTypeEClass, MObjectType.class, "MObjectType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMObjectType_MPropertyTypes(),
				this.getMPropertyType(), null, "mPropertyTypes", null, 0, -1,
				MObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMObjectType_MReferenceTypes(), this
				.getMReferenceType(), null, "mReferenceTypes", "", 0, -1,
				MObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMObjectType_Abstract(), ecorePackage
				.getEBooleanObject(), "abstract", null, 1, 1,
				MObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMObjectType_CompositeClassName(), ecorePackage
				.getEString(), "compositeClassName", "", 0, 1,
				MObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMObjectType_MReferenceDataTypeType(), this
				.getMReferenceDataTypeType(), this
				.getMReferenceDataTypeType_MObjectType(),
				"mReferenceDataTypeType", null, 1, 1, MObjectType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mStepTypeEClass, MStepType.class, "MStepType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMStepType_MParameterTypes(),
				this.getMParameterType(), null, "mParameterTypes", null, 0, -1,
				MStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMStepType_MResultTypes(), this.getMResultType(),
				null, "mResultTypes", null, 0, -1, MStepType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMStepType_DefaultActionName(), ecorePackage
				.getEString(), "defaultActionName", "Mark as completed", 1, 1,
				MStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStepType_DefaultActionIconFilePath(), ecorePackage
				.getEString(), "defaultActionIconFilePath",
				"Image Files\\Mark as completed.gif", 0, 1, MStepType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStepType_Interruptable(), ecorePackage
				.getEBooleanObject(), "interruptable", null, 1, 1,
				MStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStepType_Stoppable(), ecorePackage
				.getEBooleanObject(), "stoppable", null, 1, 1, MStepType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStepType_Terminatable(), ecorePackage
				.getEBooleanObject(), "terminatable", null, 1, 1,
				MStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mValueTypeEClass, MValueType.class, "MValueType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMValueType_DefaultReadOnly(), ecorePackage
				.getEBooleanObject(), "defaultReadOnly", null, 0, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_DefaultValue(), ecorePackage.getEString(),
				"defaultValue", null, 0, 1, MValueType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMValueType_ValueType(), this.getMValueDataTypeType(),
				null, "valueType", null, 1, 1, MValueType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMValueType_LowerBound(), ecorePackage
				.getEIntegerObject(), "lowerBound", null, 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_UpperBound(), ecorePackage
				.getEIntegerObject(), "upperBound", null, 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_Derived(), ecorePackage
				.getEBooleanObject(), "derived", "false", 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_Transient(), ecorePackage
				.getEBooleanObject(), "transient", null, 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_Volatile(), ecorePackage
				.getEBooleanObject(), "volatile", null, 1, 1, MValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_HistoricValuesUpperBound(), ecorePackage
				.getEIntegerObject(), "historicValuesUpperBound", null, 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_ValueEFeatureName(), ecorePackage
				.getEString(), "valueEFeatureName", null, 0, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_HistoricValuesEFeatureName(), ecorePackage
				.getEString(), "historicValuesEFeatureName", null, 0, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_GenerateValueFeature(), ecorePackage
				.getEBoolean(), "generateValueFeature", "true", 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValueType_GenerateMValueReference(), ecorePackage
				.getEBoolean(), "generateMValueReference", "true", 1, 1,
				MValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPropertyTypeEClass, MPropertyType.class, "MPropertyType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterTypeEClass, MParameterType.class,
				"MParameterType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mResultTypeEClass, MResultType.class, "MResultType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDataTypeTypeEClass, EDataTypeType.class, "EDataTypeType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eObjectTypeEClass, EObjectType.class, "EObjectType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEObjectType_Name(), ecorePackage.getEString(),
				"name", "", 1, 1, EObjectType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eNativeDataTypeTypeEClass, ENativeDataTypeType.class,
				"ENativeDataTypeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCustomDataTypeTypeEClass, ECustomDataTypeType.class,
				"ECustomDataTypeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECustomDataTypeType_InstanceClassName(), ecorePackage
				.getEString(), "instanceClassName", null, 1, 1,
				ECustomDataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mReferenceTypeEClass, MReferenceType.class,
				"MReferenceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMReferenceType_MObjectType(), this.getMObjectType(),
				null, "mObjectType", null, 1, 1, MReferenceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_LowerBound(), ecorePackage
				.getEIntegerObject(), "lowerBound", "0", 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_UpperBound(), ecorePackage
				.getEIntegerObject(), "upperBound", "1", 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_Derived(), ecorePackage
				.getEBooleanObject(), "derived", null, 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_Transient(), ecorePackage
				.getEBooleanObject(), "transient", null, 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_Volatile(), ecorePackage
				.getEBooleanObject(), "volatile", null, 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMReferenceType_Containment(), ecorePackage
				.getEBooleanObject(), "containment", null, 1, 1,
				MReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mApplicationTypeEClass, MApplicationType.class,
				"MApplicationType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mValueDataTypeTypeEClass, MValueDataTypeType.class,
				"MValueDataTypeType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mReferenceValueTypeEClass, MReferenceValueType.class,
				"MReferenceValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mReferenceDataTypeTypeEClass, MReferenceDataTypeType.class,
				"MReferenceDataTypeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMReferenceDataTypeType_MObjectType(), this
				.getMObjectType(),
				this.getMObjectType_MReferenceDataTypeType(), "mObjectType",
				"", 1, 1, MReferenceDataTypeType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mPrimitiveDataTypeTypeEClass, MPrimitiveDataTypeType.class,
				"MPrimitiveDataTypeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMPrimitiveDataTypeType_DataTypeName(), ecorePackage
				.getEString(), "dataTypeName", null, 1, 1,
				MPrimitiveDataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mStatefulObjectTypeEClass, MStatefulObjectType.class,
				"MStatefulObjectType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBusinessObjectTypeEClass, MBusinessObjectType.class,
				"MBusinessObjectType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBusinessObjectType_MStepTypes(),
				this.getMStepType(), null, "mStepTypes", null, 0, -1,
				MBusinessObjectType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.ERootPackageType <em>ERoot Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.ERootPackageType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType()
		 * @generated
		 */
		public static final EClass EROOT_PACKAGE_TYPE = eINSTANCE
				.getERootPackageType();

		/**
		 * The meta object literal for the '<em><b>ECustom Data Type Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES = eINSTANCE
				.getERootPackageType_ECustomDataTypeTypes();

		/**
		 * The meta object literal for the '<em><b>MPrimitive Data Type Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES = eINSTANCE
				.getERootPackageType_MPrimitiveDataTypeTypes();

		/**
		 * The meta object literal for the '<em><b>MObject Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MStateful Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MStatefulObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MApplication Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MApplicationTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MStep Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MStepTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MScript Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MScriptTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MDirectory Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MDirectoryTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MExisting Directory Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MExistingDirectoryTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MFile Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MFileTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MExisting File Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MExistingFileTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MState Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MStateTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MStep State Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MStepStateTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MBoolean Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MBooleanTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MDate Time Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MDateTimeTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MDate Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MDateTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MTime Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MTimeTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MDuration Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MDurationTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MLong Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MLongTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MPassword Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MPasswordTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MString Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MStringTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>MUrl Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_MUrlTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EThrowable Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EThrowableTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EBoolean Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EBooleanTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EByte Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EByteTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EChar Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_ECharTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EDouble Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EDoubleTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EFloat Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EFloatTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EInt Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EIntTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>ELong Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_ELongTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EShort Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EShortTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EString Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EStringTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EJava Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EJavaObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EJava Class Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EJavaClassTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EBoolean Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EBooleanObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EByte Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EByteObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>ECharacter Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_ECharacterObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EDouble Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EDoubleObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EFloat Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EFloatObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EInteger Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EIntegerObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>ELong Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_ELongObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EShort Object Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EShortObjectTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EByte Array Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EByteArrayTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EDate Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EDateTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EBig Integer Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EBigIntegerTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EBig Decimal Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EBigDecimalTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EResource Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EResourceTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EResource Set Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EResourceSetTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EFeature Map Entry Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EFeatureMapEntryTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EFeature Map Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EFeatureMapTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EEnumerator Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EEnumeratorTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EE List Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EEListTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>EE Tree Iterator Type Placeholder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER = eINSTANCE
				.getERootPackageType_EETreeIteratorTypePlaceholder();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EROOT_PACKAGE_TYPE__BASE_PACKAGE = eINSTANCE
				.getERootPackageType_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EROOT_PACKAGE_TYPE__MODEL_NAME = eINSTANCE
				.getERootPackageType_ModelName();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT = eINSTANCE
				.getERootPackageType_CopyrightText();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.EPackageType <em>EPackage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.EPackageType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getEPackageType()
		 * @generated
		 */
		public static final EClass EPACKAGE_TYPE = eINSTANCE.getEPackageType();

		/**
		 * The meta object literal for the '<em><b>EPackage Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EPACKAGE_TYPE__EPACKAGE_TYPES = eINSTANCE
				.getEPackageType_EPackageTypes();

		/**
		 * The meta object literal for the '<em><b>MObject Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EPACKAGE_TYPE__MOBJECT_TYPES = eINSTANCE
				.getEPackageType_MObjectTypes();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MElementType <em>MElement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MElementType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMElementType()
		 * @generated
		 */
		public static final EClass MELEMENT_TYPE = eINSTANCE.getMElementType();

		/**
		 * The meta object literal for the '<em><b>MSuper Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MELEMENT_TYPE__MSUPER_TYPE = eINSTANCE
				.getMElementType_MSuperType();

		/**
		 * The meta object literal for the '<em><b>Default Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT_TYPE__DEFAULT_NAME = eINSTANCE
				.getMElementType_DefaultName();

		/**
		 * The meta object literal for the '<em><b>Default Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT_TYPE__DEFAULT_DESCRIPTION = eINSTANCE
				.getMElementType_DefaultDescription();

		/**
		 * The meta object literal for the '<em><b>Default Icon File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH = eINSTANCE
				.getMElementType_DefaultIconFilePath();

		/**
		 * The meta object literal for the '<em><b>Name For UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT_TYPE__NAME_FOR_UI = eINSTANCE
				.getMElementType_NameForUI();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MObjectType <em>MObject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MObjectType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMObjectType()
		 * @generated
		 */
		public static final EClass MOBJECT_TYPE = eINSTANCE.getMObjectType();

		/**
		 * The meta object literal for the '<em><b>MProperty Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT_TYPE__MPROPERTY_TYPES = eINSTANCE
				.getMObjectType_MPropertyTypes();

		/**
		 * The meta object literal for the '<em><b>MReference Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT_TYPE__MREFERENCE_TYPES = eINSTANCE
				.getMObjectType_MReferenceTypes();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOBJECT_TYPE__ABSTRACT = eINSTANCE
				.getMObjectType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Composite Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOBJECT_TYPE__COMPOSITE_CLASS_NAME = eINSTANCE
				.getMObjectType_CompositeClassName();

		/**
		 * The meta object literal for the '<em><b>MReference Data Type Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE = eINSTANCE
				.getMObjectType_MReferenceDataTypeType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MStepType <em>MStep Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MStepType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStepType()
		 * @generated
		 */
		public static final EClass MSTEP_TYPE = eINSTANCE.getMStepType();

		/**
		 * The meta object literal for the '<em><b>MParameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP_TYPE__MPARAMETER_TYPES = eINSTANCE
				.getMStepType_MParameterTypes();

		/**
		 * The meta object literal for the '<em><b>MResult Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP_TYPE__MRESULT_TYPES = eINSTANCE
				.getMStepType_MResultTypes();

		/**
		 * The meta object literal for the '<em><b>Default Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP_TYPE__DEFAULT_ACTION_NAME = eINSTANCE
				.getMStepType_DefaultActionName();

		/**
		 * The meta object literal for the '<em><b>Default Action Icon File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH = eINSTANCE
				.getMStepType_DefaultActionIconFilePath();

		/**
		 * The meta object literal for the '<em><b>Interruptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP_TYPE__INTERRUPTABLE = eINSTANCE
				.getMStepType_Interruptable();

		/**
		 * The meta object literal for the '<em><b>Stoppable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP_TYPE__STOPPABLE = eINSTANCE
				.getMStepType_Stoppable();

		/**
		 * The meta object literal for the '<em><b>Terminatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP_TYPE__TERMINATABLE = eINSTANCE
				.getMStepType_Terminatable();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MValueType <em>MValue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MValueType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueType()
		 * @generated
		 */
		public static final EClass MVALUE_TYPE = eINSTANCE.getMValueType();

		/**
		 * The meta object literal for the '<em><b>Default Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__DEFAULT_READ_ONLY = eINSTANCE
				.getMValueType_DefaultReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__DEFAULT_VALUE = eINSTANCE
				.getMValueType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MVALUE_TYPE__VALUE_TYPE = eINSTANCE
				.getMValueType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__LOWER_BOUND = eINSTANCE
				.getMValueType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__UPPER_BOUND = eINSTANCE
				.getMValueType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__DERIVED = eINSTANCE
				.getMValueType_Derived();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__TRANSIENT = eINSTANCE
				.getMValueType_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__VOLATILE = eINSTANCE
				.getMValueType_Volatile();

		/**
		 * The meta object literal for the '<em><b>Historic Values Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND = eINSTANCE
				.getMValueType_HistoricValuesUpperBound();

		/**
		 * The meta object literal for the '<em><b>Value EFeature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__VALUE_EFEATURE_NAME = eINSTANCE
				.getMValueType_ValueEFeatureName();

		/**
		 * The meta object literal for the '<em><b>Historic Values EFeature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME = eINSTANCE
				.getMValueType_HistoricValuesEFeatureName();

		/**
		 * The meta object literal for the '<em><b>Generate Value Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__GENERATE_VALUE_FEATURE = eINSTANCE
				.getMValueType_GenerateValueFeature();

		/**
		 * The meta object literal for the '<em><b>Generate MValue Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE_TYPE__GENERATE_MVALUE_REFERENCE = eINSTANCE
				.getMValueType_GenerateMValueReference();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MPropertyType <em>MProperty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MPropertyType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPropertyType()
		 * @generated
		 */
		public static final EClass MPROPERTY_TYPE = eINSTANCE
				.getMPropertyType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MParameterType <em>MParameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MParameterType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMParameterType()
		 * @generated
		 */
		public static final EClass MPARAMETER_TYPE = eINSTANCE
				.getMParameterType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MResultType <em>MResult Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MResultType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMResultType()
		 * @generated
		 */
		public static final EClass MRESULT_TYPE = eINSTANCE.getMResultType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.EDataTypeType <em>EData Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.EDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getEDataTypeType()
		 * @generated
		 */
		public static final EClass EDATA_TYPE_TYPE = eINSTANCE
				.getEDataTypeType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.EObjectType <em>EObject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.EObjectType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getEObjectType()
		 * @generated
		 */
		public static final EClass EOBJECT_TYPE = eINSTANCE.getEObjectType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EOBJECT_TYPE__NAME = eINSTANCE
				.getEObjectType_Name();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.ENativeDataTypeType <em>ENative Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.ENativeDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getENativeDataTypeType()
		 * @generated
		 */
		public static final EClass ENATIVE_DATA_TYPE_TYPE = eINSTANCE
				.getENativeDataTypeType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.ECustomDataTypeType <em>ECustom Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.ECustomDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getECustomDataTypeType()
		 * @generated
		 */
		public static final EClass ECUSTOM_DATA_TYPE_TYPE = eINSTANCE
				.getECustomDataTypeType();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ECUSTOM_DATA_TYPE_TYPE__INSTANCE_CLASS_NAME = eINSTANCE
				.getECustomDataTypeType_InstanceClassName();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MReferenceType <em>MReference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MReferenceType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceType()
		 * @generated
		 */
		public static final EClass MREFERENCE_TYPE = eINSTANCE
				.getMReferenceType();

		/**
		 * The meta object literal for the '<em><b>MObject Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MREFERENCE_TYPE__MOBJECT_TYPE = eINSTANCE
				.getMReferenceType_MObjectType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__LOWER_BOUND = eINSTANCE
				.getMReferenceType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__UPPER_BOUND = eINSTANCE
				.getMReferenceType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__DERIVED = eINSTANCE
				.getMReferenceType_Derived();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__TRANSIENT = eINSTANCE
				.getMReferenceType_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__VOLATILE = eINSTANCE
				.getMReferenceType_Volatile();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MREFERENCE_TYPE__CONTAINMENT = eINSTANCE
				.getMReferenceType_Containment();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MApplicationType <em>MApplication Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MApplicationType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMApplicationType()
		 * @generated
		 */
		public static final EClass MAPPLICATION_TYPE = eINSTANCE
				.getMApplicationType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MValueDataTypeType <em>MValue Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MValueDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMValueDataTypeType()
		 * @generated
		 */
		public static final EClass MVALUE_DATA_TYPE_TYPE = eINSTANCE
				.getMValueDataTypeType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MReferenceValueType <em>MReference Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MReferenceValueType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceValueType()
		 * @generated
		 */
		public static final EClass MREFERENCE_VALUE_TYPE = eINSTANCE
				.getMReferenceValueType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MReferenceDataTypeType <em>MReference Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MReferenceDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMReferenceDataTypeType()
		 * @generated
		 */
		public static final EClass MREFERENCE_DATA_TYPE_TYPE = eINSTANCE
				.getMReferenceDataTypeType();

		/**
		 * The meta object literal for the '<em><b>MObject Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MREFERENCE_DATA_TYPE_TYPE__MOBJECT_TYPE = eINSTANCE
				.getMReferenceDataTypeType_MObjectType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType <em>MPrimitive Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MPrimitiveDataTypeType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMPrimitiveDataTypeType()
		 * @generated
		 */
		public static final EClass MPRIMITIVE_DATA_TYPE_TYPE = eINSTANCE
				.getMPrimitiveDataTypeType();

		/**
		 * The meta object literal for the '<em><b>Data Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPRIMITIVE_DATA_TYPE_TYPE__DATA_TYPE_NAME = eINSTANCE
				.getMPrimitiveDataTypeType_DataTypeName();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MStatefulObjectType <em>MStateful Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MStatefulObjectType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMStatefulObjectType()
		 * @generated
		 */
		public static final EClass MSTATEFUL_OBJECT_TYPE = eINSTANCE
				.getMStatefulObjectType();

		/**
		 * The meta object literal for the '{@link org.onceforall.metamodeller.MBusinessObjectType <em>MBusiness Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.metamodeller.MBusinessObjectType
		 * @see org.onceforall.metamodeller.MetaModellerPackage#getMBusinessObjectType()
		 * @generated
		 */
		public static final EClass MBUSINESS_OBJECT_TYPE = eINSTANCE
				.getMBusinessObjectType();

		/**
		 * The meta object literal for the '<em><b>MStep Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBUSINESS_OBJECT_TYPE__MSTEP_TYPES = eINSTANCE
				.getMBusinessObjectType_MStepTypes();

	}

} //MetaModellerPackage
