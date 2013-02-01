/**
 * <copyright>
 * </copyright>
 *
 * $Id: MObjectTypeItemProvider.java,v 1.1 2006/08/29 00:59:39 marc Exp $
 */
package org.onceforall.metamodeller.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.onceforall.metamodeller.MObjectType;
import org.onceforall.metamodeller.MetaModellerFactory;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.MObjectType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MObjectTypeItemProvider extends MElementTypeItemProvider implements
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
	public MObjectTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
			addCompositeClassNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MObjectType_abstract_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MObjectType_abstract_feature",
						"_UI_MObjectType_type"),
				MetaModellerPackage.Literals.MOBJECT_TYPE__ABSTRACT, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Composite Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositeClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MObjectType_compositeClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MObjectType_compositeClassName_feature",
								"_UI_MObjectType_type"),
						MetaModellerPackage.Literals.MOBJECT_TYPE__COMPOSITE_CLASS_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(MetaModellerPackage.Literals.MOBJECT_TYPE__MPROPERTY_TYPES);
			childrenFeatures
					.add(MetaModellerPackage.Literals.MOBJECT_TYPE__MREFERENCE_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MObjectType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/MObjectType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MObjectType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MObjectType_type")
				: getString("_UI_MObjectType_type") + " " + label;
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

		switch (notification.getFeatureID(MObjectType.class)) {
		case MetaModellerPackage.MOBJECT_TYPE__ABSTRACT:
		case MetaModellerPackage.MOBJECT_TYPE__COMPOSITE_CLASS_NAME:
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_DATA_TYPE_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case MetaModellerPackage.MOBJECT_TYPE__MPROPERTY_TYPES:
		case MetaModellerPackage.MOBJECT_TYPE__MREFERENCE_TYPES:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				MetaModellerPackage.Literals.MOBJECT_TYPE__MPROPERTY_TYPES,
				MetaModellerFactory.eINSTANCE.createMPropertyType()));

		newChildDescriptors.add(createChildParameter(
				MetaModellerPackage.Literals.MOBJECT_TYPE__MREFERENCE_TYPES,
				MetaModellerFactory.eINSTANCE.createMReferenceType()));
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
