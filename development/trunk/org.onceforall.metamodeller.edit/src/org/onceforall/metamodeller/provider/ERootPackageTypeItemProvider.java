/**
 * <copyright>
 * </copyright>
 *
 * $Id: ERootPackageTypeItemProvider.java,v 1.1 2006/08/29 00:59:39 marc Exp $
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

import org.onceforall.metamodeller.ERootPackageType;
import org.onceforall.metamodeller.MetaModellerFactory;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.ERootPackageType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ERootPackageTypeItemProvider extends EPackageTypeItemProvider
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
	public ERootPackageTypeItemProvider(AdapterFactory adapterFactory) {
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

			addBasePackagePropertyDescriptor(object);
			addModelNamePropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ERootPackageType_basePackage_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ERootPackageType_basePackage_feature",
						"_UI_ERootPackageType_type"),
				MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__BASE_PACKAGE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Model Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ERootPackageType_modelName_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ERootPackageType_modelName_feature",
						"_UI_ERootPackageType_type"),
				MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MODEL_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Copyright Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ERootPackageType_copyrightText_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ERootPackageType_copyrightText_feature",
								"_UI_ERootPackageType_type"),
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
					.add(MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES);
			childrenFeatures
					.add(MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES);
			childrenFeatures
					.add(MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER);
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
	 * This returns ERootPackageType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/ERootPackageType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ERootPackageType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ERootPackageType_type")
				: getString("_UI_ERootPackageType_type") + " " + label;
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

		switch (notification.getFeatureID(ERootPackageType.class)) {
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
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

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES,
						MetaModellerFactory.eINSTANCE
								.createECustomDataTypeType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES,
						MetaModellerFactory.eINSTANCE
								.createMPrimitiveDataTypeType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
						MetaModellerFactory.eINSTANCE.createMObjectType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
						MetaModellerFactory.eINSTANCE
								.createMStatefulObjectType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
						MetaModellerFactory.eINSTANCE.createMStepType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
						MetaModellerFactory.eINSTANCE
								.createMBusinessObjectType()));

		newChildDescriptors
				.add(createChildParameter(
						MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
						MetaModellerFactory.eINSTANCE.createMApplicationType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MetaModellerPackage.Literals.EPACKAGE_TYPE__MOBJECT_TYPES
				|| childFeature == MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
