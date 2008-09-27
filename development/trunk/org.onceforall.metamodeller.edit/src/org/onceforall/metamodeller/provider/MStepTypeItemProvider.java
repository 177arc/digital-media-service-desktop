/**
 * <copyright>
 * </copyright>
 *
 * $Id: MStepTypeItemProvider.java,v 1.1 2006/08/29 00:59:38 marc Exp $
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

import org.onceforall.metamodeller.MStepType;
import org.onceforall.metamodeller.MetaModellerFactory;
import org.onceforall.metamodeller.MetaModellerPackage;

/**
 * This is the item provider adapter for a {@link org.onceforall.metamodeller.MStepType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MStepTypeItemProvider extends MStatefulObjectTypeItemProvider
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
	public MStepTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultActionNamePropertyDescriptor(object);
			addDefaultActionIconFilePathPropertyDescriptor(object);
			addInterruptablePropertyDescriptor(object);
			addStoppablePropertyDescriptor(object);
			addTerminatablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Action Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultActionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MStepType_defaultActionName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MStepType_defaultActionName_feature",
						"_UI_MStepType_type"),
				MetaModellerPackage.Literals.MSTEP_TYPE__DEFAULT_ACTION_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Action Icon File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultActionIconFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MStepType_defaultActionIconFilePath_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MStepType_defaultActionIconFilePath_feature",
								"_UI_MStepType_type"),
						MetaModellerPackage.Literals.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasicPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Interruptable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterruptablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MStepType_interruptable_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MStepType_interruptable_feature",
						"_UI_MStepType_type"),
				MetaModellerPackage.Literals.MSTEP_TYPE__INTERRUPTABLE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Stoppable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoppablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_MStepType_stoppable_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MStepType_stoppable_feature",
								"_UI_MStepType_type"),
						MetaModellerPackage.Literals.MSTEP_TYPE__STOPPABLE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_AdvancedPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Terminatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MStepType_terminatable_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_MStepType_terminatable_feature",
						"_UI_MStepType_type"),
				MetaModellerPackage.Literals.MSTEP_TYPE__TERMINATABLE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
					.add(MetaModellerPackage.Literals.MSTEP_TYPE__MPARAMETER_TYPES);
			childrenFeatures
					.add(MetaModellerPackage.Literals.MSTEP_TYPE__MRESULT_TYPES);
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
	 * This returns MStepType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/MStepType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MStepType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MStepType_type")
				: getString("_UI_MStepType_type") + " " + label;
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

		switch (notification.getFeatureID(MStepType.class)) {
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_NAME:
		case MetaModellerPackage.MSTEP_TYPE__DEFAULT_ACTION_ICON_FILE_PATH:
		case MetaModellerPackage.MSTEP_TYPE__INTERRUPTABLE:
		case MetaModellerPackage.MSTEP_TYPE__STOPPABLE:
		case MetaModellerPackage.MSTEP_TYPE__TERMINATABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case MetaModellerPackage.MSTEP_TYPE__MPARAMETER_TYPES:
		case MetaModellerPackage.MSTEP_TYPE__MRESULT_TYPES:
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
				MetaModellerPackage.Literals.MSTEP_TYPE__MPARAMETER_TYPES,
				MetaModellerFactory.eINSTANCE.createMParameterType()));

		newChildDescriptors.add(createChildParameter(
				MetaModellerPackage.Literals.MSTEP_TYPE__MRESULT_TYPES,
				MetaModellerFactory.eINSTANCE.createMResultType()));
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
