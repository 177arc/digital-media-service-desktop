/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaModellerSwitch.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.onceforall.metamodeller.*;

import org.onceforall.metamodeller.ECustomDataTypeType;
import org.onceforall.metamodeller.EDataTypeType;
import org.onceforall.metamodeller.ENativeDataTypeType;
import org.onceforall.metamodeller.EObjectType;
import org.onceforall.metamodeller.EPackageType;
import org.onceforall.metamodeller.ERootPackageType;
import org.onceforall.metamodeller.MApplicationType;
import org.onceforall.metamodeller.MElementType;
import org.onceforall.metamodeller.MObjectType;
import org.onceforall.metamodeller.MParameterType;
import org.onceforall.metamodeller.MPropertyType;
import org.onceforall.metamodeller.MReferenceType;
import org.onceforall.metamodeller.MResultType;
import org.onceforall.metamodeller.MStepType;
import org.onceforall.metamodeller.MValueType;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.onceforall.metamodeller.MetaModellerPackage
 * @generated
 */
public class MetaModellerSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModellerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModellerSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaModellerPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					(EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MetaModellerPackage.EROOT_PACKAGE_TYPE: {
			ERootPackageType eRootPackageType = (ERootPackageType) theEObject;
			Object result = caseERootPackageType(eRootPackageType);
			if (result == null)
				result = caseEPackageType(eRootPackageType);
			if (result == null)
				result = caseEObjectType(eRootPackageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.EPACKAGE_TYPE: {
			EPackageType ePackageType = (EPackageType) theEObject;
			Object result = caseEPackageType(ePackageType);
			if (result == null)
				result = caseEObjectType(ePackageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MELEMENT_TYPE: {
			MElementType mElementType = (MElementType) theEObject;
			Object result = caseMElementType(mElementType);
			if (result == null)
				result = caseEObjectType(mElementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MOBJECT_TYPE: {
			MObjectType mObjectType = (MObjectType) theEObject;
			Object result = caseMObjectType(mObjectType);
			if (result == null)
				result = caseMElementType(mObjectType);
			if (result == null)
				result = caseEObjectType(mObjectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MSTEP_TYPE: {
			MStepType mStepType = (MStepType) theEObject;
			Object result = caseMStepType(mStepType);
			if (result == null)
				result = caseMStatefulObjectType(mStepType);
			if (result == null)
				result = caseMObjectType(mStepType);
			if (result == null)
				result = caseMElementType(mStepType);
			if (result == null)
				result = caseEObjectType(mStepType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MVALUE_TYPE: {
			MValueType mValueType = (MValueType) theEObject;
			Object result = caseMValueType(mValueType);
			if (result == null)
				result = caseMElementType(mValueType);
			if (result == null)
				result = caseEObjectType(mValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MPROPERTY_TYPE: {
			MPropertyType mPropertyType = (MPropertyType) theEObject;
			Object result = caseMPropertyType(mPropertyType);
			if (result == null)
				result = caseMValueType(mPropertyType);
			if (result == null)
				result = caseMElementType(mPropertyType);
			if (result == null)
				result = caseEObjectType(mPropertyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MPARAMETER_TYPE: {
			MParameterType mParameterType = (MParameterType) theEObject;
			Object result = caseMParameterType(mParameterType);
			if (result == null)
				result = caseMValueType(mParameterType);
			if (result == null)
				result = caseMElementType(mParameterType);
			if (result == null)
				result = caseEObjectType(mParameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MRESULT_TYPE: {
			MResultType mResultType = (MResultType) theEObject;
			Object result = caseMResultType(mResultType);
			if (result == null)
				result = caseMValueType(mResultType);
			if (result == null)
				result = caseMElementType(mResultType);
			if (result == null)
				result = caseEObjectType(mResultType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.EDATA_TYPE_TYPE: {
			EDataTypeType eDataTypeType = (EDataTypeType) theEObject;
			Object result = caseEDataTypeType(eDataTypeType);
			if (result == null)
				result = caseEObjectType(eDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.EOBJECT_TYPE: {
			EObjectType eObjectType = (EObjectType) theEObject;
			Object result = caseEObjectType(eObjectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.ENATIVE_DATA_TYPE_TYPE: {
			ENativeDataTypeType eNativeDataTypeType = (ENativeDataTypeType) theEObject;
			Object result = caseENativeDataTypeType(eNativeDataTypeType);
			if (result == null)
				result = caseEDataTypeType(eNativeDataTypeType);
			if (result == null)
				result = caseEObjectType(eNativeDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.ECUSTOM_DATA_TYPE_TYPE: {
			ECustomDataTypeType eCustomDataTypeType = (ECustomDataTypeType) theEObject;
			Object result = caseECustomDataTypeType(eCustomDataTypeType);
			if (result == null)
				result = caseEDataTypeType(eCustomDataTypeType);
			if (result == null)
				result = caseEObjectType(eCustomDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MREFERENCE_TYPE: {
			MReferenceType mReferenceType = (MReferenceType) theEObject;
			Object result = caseMReferenceType(mReferenceType);
			if (result == null)
				result = caseEObjectType(mReferenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MAPPLICATION_TYPE: {
			MApplicationType mApplicationType = (MApplicationType) theEObject;
			Object result = caseMApplicationType(mApplicationType);
			if (result == null)
				result = caseMBusinessObjectType(mApplicationType);
			if (result == null)
				result = caseMStatefulObjectType(mApplicationType);
			if (result == null)
				result = caseMObjectType(mApplicationType);
			if (result == null)
				result = caseMElementType(mApplicationType);
			if (result == null)
				result = caseEObjectType(mApplicationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MVALUE_DATA_TYPE_TYPE: {
			MValueDataTypeType mValueDataTypeType = (MValueDataTypeType) theEObject;
			Object result = caseMValueDataTypeType(mValueDataTypeType);
			if (result == null)
				result = caseEDataTypeType(mValueDataTypeType);
			if (result == null)
				result = caseEObjectType(mValueDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MREFERENCE_VALUE_TYPE: {
			MReferenceValueType mReferenceValueType = (MReferenceValueType) theEObject;
			Object result = caseMReferenceValueType(mReferenceValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MREFERENCE_DATA_TYPE_TYPE: {
			MReferenceDataTypeType mReferenceDataTypeType = (MReferenceDataTypeType) theEObject;
			Object result = caseMReferenceDataTypeType(mReferenceDataTypeType);
			if (result == null)
				result = caseMValueDataTypeType(mReferenceDataTypeType);
			if (result == null)
				result = caseEDataTypeType(mReferenceDataTypeType);
			if (result == null)
				result = caseEObjectType(mReferenceDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MPRIMITIVE_DATA_TYPE_TYPE: {
			MPrimitiveDataTypeType mPrimitiveDataTypeType = (MPrimitiveDataTypeType) theEObject;
			Object result = caseMPrimitiveDataTypeType(mPrimitiveDataTypeType);
			if (result == null)
				result = caseMValueDataTypeType(mPrimitiveDataTypeType);
			if (result == null)
				result = caseEDataTypeType(mPrimitiveDataTypeType);
			if (result == null)
				result = caseEObjectType(mPrimitiveDataTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MSTATEFUL_OBJECT_TYPE: {
			MStatefulObjectType mStatefulObjectType = (MStatefulObjectType) theEObject;
			Object result = caseMStatefulObjectType(mStatefulObjectType);
			if (result == null)
				result = caseMObjectType(mStatefulObjectType);
			if (result == null)
				result = caseMElementType(mStatefulObjectType);
			if (result == null)
				result = caseEObjectType(mStatefulObjectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModellerPackage.MBUSINESS_OBJECT_TYPE: {
			MBusinessObjectType mBusinessObjectType = (MBusinessObjectType) theEObject;
			Object result = caseMBusinessObjectType(mBusinessObjectType);
			if (result == null)
				result = caseMStatefulObjectType(mBusinessObjectType);
			if (result == null)
				result = caseMObjectType(mBusinessObjectType);
			if (result == null)
				result = caseMElementType(mBusinessObjectType);
			if (result == null)
				result = caseEObjectType(mBusinessObjectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ERoot Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ERoot Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseERootPackageType(ERootPackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EPackage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EPackage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEPackageType(EPackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MElement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MElement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMElementType(MElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MObject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MObject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMObjectType(MObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MStep Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MStep Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMStepType(MStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MValue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MValue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMValueType(MValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MProperty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MProperty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMPropertyType(MPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MParameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MParameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMParameterType(MParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MResult Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MResult Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMResultType(MResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EData Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EData Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEDataTypeType(EDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEObjectType(EObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ENative Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ENative Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseENativeDataTypeType(ENativeDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>ECustom Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>ECustom Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseECustomDataTypeType(ECustomDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MReference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MReference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMReferenceType(MReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MApplication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MApplication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMApplicationType(MApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MValue Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MValue Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMValueDataTypeType(MValueDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MReference Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MReference Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMReferenceValueType(MReferenceValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MReference Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MReference Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMReferenceDataTypeType(MReferenceDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MPrimitive Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MPrimitive Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMPrimitiveDataTypeType(MPrimitiveDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MStateful Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MStateful Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMStatefulObjectType(MStatefulObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>MBusiness Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>MBusiness Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMBusinessObjectType(MBusinessObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //MetaModellerSwitch
