/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaModellerFactory.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.onceforall.metamodeller.MetaModellerPackage
 * @generated
 */
public class MetaModellerFactory extends EFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetaModellerFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModellerFactory init() {
		try {
			MetaModellerFactory theMetaModellerFactory = (MetaModellerFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.onceforall.org/meta-modeller/core.ecore");
			if (theMetaModellerFactory != null) {
				return theMetaModellerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModellerFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModellerFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaModellerPackage.EROOT_PACKAGE_TYPE:
			return createERootPackageType();
		case MetaModellerPackage.EPACKAGE_TYPE:
			return createEPackageType();
		case MetaModellerPackage.MOBJECT_TYPE:
			return createMObjectType();
		case MetaModellerPackage.MSTEP_TYPE:
			return createMStepType();
		case MetaModellerPackage.MPROPERTY_TYPE:
			return createMPropertyType();
		case MetaModellerPackage.MPARAMETER_TYPE:
			return createMParameterType();
		case MetaModellerPackage.MRESULT_TYPE:
			return createMResultType();
		case MetaModellerPackage.ENATIVE_DATA_TYPE_TYPE:
			return createENativeDataTypeType();
		case MetaModellerPackage.ECUSTOM_DATA_TYPE_TYPE:
			return createECustomDataTypeType();
		case MetaModellerPackage.MREFERENCE_TYPE:
			return createMReferenceType();
		case MetaModellerPackage.MAPPLICATION_TYPE:
			return createMApplicationType();
		case MetaModellerPackage.MREFERENCE_VALUE_TYPE:
			return createMReferenceValueType();
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE:
			return createMReferenceDataTypeType();
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE:
			return createMPrimitiveDataTypeType();
		case MetaModellerPackage.MSTATEFUL_OBJECT_TYPE:
			return createMStatefulObjectType();
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE:
			return createMBusinessObjectType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERootPackageType createERootPackageType() {
		ERootPackageType eRootPackageType = new ERootPackageType();
		return eRootPackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackageType createEPackageType() {
		EPackageType ePackageType = new EPackageType();
		return ePackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MObjectType createMObjectType() {
		MObjectType mObjectType = new MObjectType();
		return mObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MStepType createMStepType() {
		MStepType mStepType = new MStepType();
		return mStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPropertyType createMPropertyType() {
		MPropertyType mPropertyType = new MPropertyType();
		return mPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParameterType createMParameterType() {
		MParameterType mParameterType = new MParameterType();
		return mParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MResultType createMResultType() {
		MResultType mResultType = new MResultType();
		return mResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENativeDataTypeType createENativeDataTypeType() {
		ENativeDataTypeType eNativeDataTypeType = new ENativeDataTypeType();
		return eNativeDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECustomDataTypeType createECustomDataTypeType() {
		ECustomDataTypeType eCustomDataTypeType = new ECustomDataTypeType();
		return eCustomDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MReferenceType createMReferenceType() {
		MReferenceType mReferenceType = new MReferenceType();
		return mReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MApplicationType createMApplicationType() {
		MApplicationType mApplicationType = new MApplicationType();
		return mApplicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MReferenceValueType createMReferenceValueType() {
		MReferenceValueType mReferenceValueType = new MReferenceValueType();
		return mReferenceValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MReferenceDataTypeType createMReferenceDataTypeType() {
		MReferenceDataTypeType mReferenceDataTypeType = new MReferenceDataTypeType();
		return mReferenceDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPrimitiveDataTypeType createMPrimitiveDataTypeType() {
		MPrimitiveDataTypeType mPrimitiveDataTypeType = new MPrimitiveDataTypeType();
		return mPrimitiveDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MStatefulObjectType createMStatefulObjectType() {
		MStatefulObjectType mStatefulObjectType = new MStatefulObjectType();
		return mStatefulObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBusinessObjectType createMBusinessObjectType() {
		MBusinessObjectType mBusinessObjectType = new MBusinessObjectType();
		return mBusinessObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModellerPackage getMetaModellerPackage() {
		return (MetaModellerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MetaModellerPackage getPackage() {
		return MetaModellerPackage.eINSTANCE;
	}

} //MetaModellerFactory
