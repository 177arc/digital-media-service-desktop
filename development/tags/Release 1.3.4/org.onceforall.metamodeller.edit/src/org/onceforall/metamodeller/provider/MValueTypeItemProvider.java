/**
 * <copyright>
 * </copyright>
 *
 * $Id: MValueTypeItemProvider.java,v 1.1 2006/08/29 00:59:38 marc Exp $
 */
package org.onceforall.metamodeller.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.onceforall.metamodeller.MValueType;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.MValueType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MValueTypeItemProvider extends MElementTypeItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MValueTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDefaultReadOnlyPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addValueTypePropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addHistoricValuesUpperBoundPropertyDescriptor(object);
			addValueEFeatureNamePropertyDescriptor(object);
			addHistoricValuesEFeatureNamePropertyDescriptor(object);
			addGenerateValueFeaturePropertyDescriptor(object);
			addGenerateMValueReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_defaultReadOnly_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MValueType_defaultReadOnly_feature",
						"_UI_MValueType_type"),
				MetaModellerPackage.Literals.MVALUE_TYPE__DEFAULT_READ_ONLY,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_defaultValue_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MValueType_defaultValue_feature",
						"_UI_MValueType_type"),
				MetaModellerPackage.Literals.MVALUE_TYPE__DEFAULT_VALUE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Value Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_MValueType_valueType_feature"),
						getString("_UI_MValueType_valueType_description"),
						MetaModellerPackage.Literals.MVALUE_TYPE__VALUE_TYPE,
						true, false, true, null,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_lowerBound_feature"),
				getString("_UI_MValueType_lowerBound_description"),
				MetaModellerPackage.Literals.MVALUE_TYPE__LOWER_BOUND, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_upperBound_feature"),
				getString("_UI_MValueType_upperBound_description"),
				MetaModellerPackage.Literals.MVALUE_TYPE__UPPER_BOUND, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_derived_feature"),
				getString("_UI_MValueType_derived_description"),
				MetaModellerPackage.Literals.MVALUE_TYPE__DERIVED, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_transient_feature"),
				getString("_UI_MValueType_transient_description"),
				MetaModellerPackage.Literals.MVALUE_TYPE__TRANSIENT, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_volatile_feature"),
				getString("_UI_MValueType_volatile_description"),
				MetaModellerPackage.Literals.MVALUE_TYPE__VOLATILE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Historic Values Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoricValuesUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MValueType_historicValuesUpperBound_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MValueType_historicValuesUpperBound_feature",
								"_UI_MValueType_type"),
						MetaModellerPackage.Literals.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Value EFeature Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueEFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MValueType_valueEFeatureName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MValueType_valueEFeatureName_feature",
						"_UI_MValueType_type"),
				MetaModellerPackage.Literals.MVALUE_TYPE__VALUE_EFEATURE_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Historic Values EFeature Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoricValuesEFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MValueType_historicValuesEFeatureName_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MValueType_historicValuesEFeatureName_feature",
								"_UI_MValueType_type"),
						MetaModellerPackage.Literals.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Generate Value Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateValueFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MValueType_generateValueFeature_feature"),
						getString("_UI_MValueType_generateValueFeature_description"),
						MetaModellerPackage.Literals.MVALUE_TYPE__GENERATE_VALUE_FEATURE,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Generate MValue Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateMValueReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MValueType_generateMValueReference_feature"),
						getString("_UI_MValueType_generateMValueReference_description"),
						MetaModellerPackage.Literals.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MValueType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MValueType_type")
				: getString("_UI_MValueType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MValueType.class)) {
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_READ_ONLY:
		case MetaModellerPackage.MVALUE_TYPE__DEFAULT_VALUE:
		case MetaModellerPackage.MVALUE_TYPE__VALUE_TYPE:
		case MetaModellerPackage.MVALUE_TYPE__LOWER_BOUND:
		case MetaModellerPackage.MVALUE_TYPE__UPPER_BOUND:
		case MetaModellerPackage.MVALUE_TYPE__DERIVED:
		case MetaModellerPackage.MVALUE_TYPE__TRANSIENT:
		case MetaModellerPackage.MVALUE_TYPE__VOLATILE:
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_UPPER_BOUND:
		case MetaModellerPackage.MVALUE_TYPE__VALUE_EFEATURE_NAME:
		case MetaModellerPackage.MVALUE_TYPE__HISTORIC_VALUES_EFEATURE_NAME:
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_VALUE_FEATURE:
		case MetaModellerPackage.MVALUE_TYPE__GENERATE_MVALUE_REFERENCE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return ModelerEditPlugin.INSTANCE;
	}

}
