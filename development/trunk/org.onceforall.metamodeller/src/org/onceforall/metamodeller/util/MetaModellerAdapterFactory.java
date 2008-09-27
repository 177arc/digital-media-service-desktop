/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaModellerAdapterFactory.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.onceforall.metamodeller.MetaModellerPackage
 * @generated
 */
public class MetaModellerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModellerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModellerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaModellerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModellerSwitch modelSwitch = new MetaModellerSwitch() {
		public Object caseERootPackageType(ERootPackageType object) {
			return createERootPackageTypeAdapter();
		}

		public Object caseEPackageType(EPackageType object) {
			return createEPackageTypeAdapter();
		}

		public Object caseMElementType(MElementType object) {
			return createMElementTypeAdapter();
		}

		public Object caseMObjectType(MObjectType object) {
			return createMObjectTypeAdapter();
		}

		public Object caseMStepType(MStepType object) {
			return createMStepTypeAdapter();
		}

		public Object caseMValueType(MValueType object) {
			return createMValueTypeAdapter();
		}

		public Object caseMPropertyType(MPropertyType object) {
			return createMPropertyTypeAdapter();
		}

		public Object caseMParameterType(MParameterType object) {
			return createMParameterTypeAdapter();
		}

		public Object caseMResultType(MResultType object) {
			return createMResultTypeAdapter();
		}

		public Object caseEDataTypeType(EDataTypeType object) {
			return createEDataTypeTypeAdapter();
		}

		public Object caseEObjectType(EObjectType object) {
			return createEObjectTypeAdapter();
		}

		public Object caseENativeDataTypeType(ENativeDataTypeType object) {
			return createENativeDataTypeTypeAdapter();
		}

		public Object caseECustomDataTypeType(ECustomDataTypeType object) {
			return createECustomDataTypeTypeAdapter();
		}

		public Object caseMReferenceType(MReferenceType object) {
			return createMReferenceTypeAdapter();
		}

		public Object caseMApplicationType(MApplicationType object) {
			return createMApplicationTypeAdapter();
		}

		public Object caseMValueDataTypeType(MValueDataTypeType object) {
			return createMValueDataTypeTypeAdapter();
		}

		public Object caseMReferenceValueType(MReferenceValueType object) {
			return createMReferenceValueTypeAdapter();
		}

		public Object caseMReferenceDataTypeType(MReferenceDataTypeType object) {
			return createMReferenceDataTypeTypeAdapter();
		}

		public Object caseMPrimitiveDataTypeType(MPrimitiveDataTypeType object) {
			return createMPrimitiveDataTypeTypeAdapter();
		}

		public Object caseMStatefulObjectType(MStatefulObjectType object) {
			return createMStatefulObjectTypeAdapter();
		}

		public Object caseMBusinessObjectType(MBusinessObjectType object) {
			return createMBusinessObjectTypeAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.ERootPackageType <em>ERoot Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.ERootPackageType
	 * @generated
	 */
	public Adapter createERootPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.EPackageType <em>EPackage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.EPackageType
	 * @generated
	 */
	public Adapter createEPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MElementType <em>MElement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MElementType
	 * @generated
	 */
	public Adapter createMElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MObjectType <em>MObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MObjectType
	 * @generated
	 */
	public Adapter createMObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MStepType <em>MStep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MStepType
	 * @generated
	 */
	public Adapter createMStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MValueType <em>MValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MValueType
	 * @generated
	 */
	public Adapter createMValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MPropertyType <em>MProperty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MPropertyType
	 * @generated
	 */
	public Adapter createMPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MParameterType <em>MParameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MParameterType
	 * @generated
	 */
	public Adapter createMParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MResultType <em>MResult Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MResultType
	 * @generated
	 */
	public Adapter createMResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.EDataTypeType <em>EData Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.EDataTypeType
	 * @generated
	 */
	public Adapter createEDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.EObjectType <em>EObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.EObjectType
	 * @generated
	 */
	public Adapter createEObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.ENativeDataTypeType <em>ENative Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.ENativeDataTypeType
	 * @generated
	 */
	public Adapter createENativeDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.ECustomDataTypeType <em>ECustom Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.ECustomDataTypeType
	 * @generated
	 */
	public Adapter createECustomDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MReferenceType <em>MReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MReferenceType
	 * @generated
	 */
	public Adapter createMReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MApplicationType <em>MApplication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MApplicationType
	 * @generated
	 */
	public Adapter createMApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MValueDataTypeType <em>MValue Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MValueDataTypeType
	 * @generated
	 */
	public Adapter createMValueDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MReferenceValueType <em>MReference Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MReferenceValueType
	 * @generated
	 */
	public Adapter createMReferenceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MReferenceDataTypeType <em>MReference Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MReferenceDataTypeType
	 * @generated
	 */
	public Adapter createMReferenceDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MPrimitiveDataTypeType <em>MPrimitive Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MPrimitiveDataTypeType
	 * @generated
	 */
	public Adapter createMPrimitiveDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MStatefulObjectType <em>MStateful Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MStatefulObjectType
	 * @generated
	 */
	public Adapter createMStatefulObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.onceforall.metamodeller.MBusinessObjectType <em>MBusiness Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.onceforall.metamodeller.MBusinessObjectType
	 * @generated
	 */
	public Adapter createMBusinessObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaModellerAdapterFactory
