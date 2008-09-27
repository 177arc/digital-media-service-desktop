/**
 * <copyright>
 * </copyright>
 *
 * $Id: MElementTypeItemProvider.java,v 1.1 2006/08/29 00:59:38 marc Exp $
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

import org.onceforall.metamodeller.MElementType;
import org.onceforall.metamodeller.MetaModellerFactory;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.MElementType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MElementTypeItemProvider extends EObjectTypeItemProvider implements
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
	public MElementTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMSuperTypePropertyDescriptor(object);
			addDefaultNamePropertyDescriptor(object);
			addDefaultDescriptionPropertyDescriptor(object);
			addDefaultIconFilePathPropertyDescriptor(object);
			addNameForUIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MSuper Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMSuperTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MElementType_mSuperType_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MElementType_mSuperType_feature",
						"_UI_MElementType_type"),
				MetaModellerPackage.Literals.MELEMENT_TYPE__MSUPER_TYPE, true,
				false, true, null, getString("_UI_AdvancedPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Default Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MElementType_defaultName_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MElementType_defaultName_feature",
						"_UI_MElementType_type"),
				MetaModellerPackage.Literals.MELEMENT_TYPE__DEFAULT_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MElementType_defaultDescription_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MElementType_defaultDescription_feature",
								"_UI_MElementType_type"),
						MetaModellerPackage.Literals.MELEMENT_TYPE__DEFAULT_DESCRIPTION,
						true, true, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Icon File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultIconFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MElementType_defaultIconFilePath_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MElementType_defaultIconFilePath_feature",
								"_UI_MElementType_type"),
						MetaModellerPackage.Literals.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Name For UI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameForUIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MElementType_nameForUI_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MElementType_nameForUI_feature",
						"_UI_MElementType_type"),
				MetaModellerPackage.Literals.MELEMENT_TYPE__NAME_FOR_UI, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This returns MElementType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/MElementType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MElementType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MElementType_type")
				: getString("_UI_MElementType_type") + " " + label;
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

		switch (notification.getFeatureID(MElementType.class)) {
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_NAME:
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_DESCRIPTION:
		case MetaModellerPackage.MELEMENT_TYPE__DEFAULT_ICON_FILE_PATH:
		case MetaModellerPackage.MELEMENT_TYPE__NAME_FOR_UI:
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
