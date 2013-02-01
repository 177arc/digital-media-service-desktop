/**
 * <copyright>
 * </copyright>
 *
 * $Id: MReferenceTypeItemProvider.java,v 1.1 2006/08/29 00:59:39 marc Exp $
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

import org.onceforall.metamodeller.MReferenceType;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.MReferenceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MReferenceTypeItemProvider extends EObjectTypeItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
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
	public MReferenceTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMObjectTypePropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addContainmentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MObject Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMObjectTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MReferenceType_mObjectType_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_mObjectType_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__MOBJECT_TYPE,
				true, false, true, null, null, null));
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
				getString("_UI_MReferenceType_lowerBound_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_lowerBound_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__LOWER_BOUND,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
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
				getString("_UI_MReferenceType_upperBound_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_upperBound_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__UPPER_BOUND,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
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
				getString("_UI_MReferenceType_derived_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_derived_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__DERIVED, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
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
				getString("_UI_MReferenceType_transient_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_transient_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__TRANSIENT, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
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
				getString("_UI_MReferenceType_volatile_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_volatile_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__VOLATILE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Containment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MReferenceType_containment_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MReferenceType_containment_feature",
						"_UI_MReferenceType_type"),
				MetaModellerPackage.Literals.MREFERENCE_TYPE__CONTAINMENT,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This returns MReferenceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/MReferenceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MReferenceType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MReferenceType_type")
				: getString("_UI_MReferenceType_type") + " " + label;
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

		switch (notification.getFeatureID(MReferenceType.class)) {
		case MetaModellerPackage.MREFERENCE_TYPE__LOWER_BOUND:
		case MetaModellerPackage.MREFERENCE_TYPE__UPPER_BOUND:
		case MetaModellerPackage.MREFERENCE_TYPE__DERIVED:
		case MetaModellerPackage.MREFERENCE_TYPE__TRANSIENT:
		case MetaModellerPackage.MREFERENCE_TYPE__VOLATILE:
		case MetaModellerPackage.MREFERENCE_TYPE__CONTAINMENT:
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
