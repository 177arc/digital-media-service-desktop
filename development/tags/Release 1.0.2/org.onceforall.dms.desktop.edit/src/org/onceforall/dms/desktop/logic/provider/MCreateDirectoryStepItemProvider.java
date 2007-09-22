/*
 * Revision History
 * $Log: MCreateDirectoryStepItemProvider.java,v $
 * Revision 1.2  2006/09/19 12:52:48  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic.provider;


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
import org.onceforall.dms.desktop.logic.LogicFactory;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MCreateDirectoryStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MCreateDirectoryStepItemProvider
	extends MStepItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
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
	public MCreateDirectoryStepItemProvider(AdapterFactory adapterFactory) {
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

			addParentDirectoryParameterPropertyDescriptor(object);
			addParentDirectoryParameterHistoricValuesPropertyDescriptor(object);
			addDirectoryNameParameterPropertyDescriptor(object);
			addDirectoryResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Directory Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentDirectoryParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCreateDirectoryStep_parentDirectoryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCreateDirectoryStep_parentDirectoryParameter_feature", "_UI_MCreateDirectoryStep_type"),
				 LogicPackage.Literals.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Directory Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentDirectoryParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCreateDirectoryStep_parentDirectoryParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCreateDirectoryStep_parentDirectoryParameterHistoricValues_feature", "_UI_MCreateDirectoryStep_type"),
				 LogicPackage.Literals.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCreateDirectoryStep_directoryNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCreateDirectoryStep_directoryNameParameter_feature", "_UI_MCreateDirectoryStep_type"),
				 LogicPackage.Literals.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCreateDirectoryStep_directoryResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCreateDirectoryStep_directoryResult_feature", "_UI_MCreateDirectoryStep_type"),
				 LogicPackage.Literals.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT);
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
	 * This returns MCreateDirectoryStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MCreateDirectoryStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MCreateDirectoryStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MCreateDirectoryStep_type") :
			getString("_UI_MCreateDirectoryStep_type") + " " + label;
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

		switch (notification.getFeatureID(MCreateDirectoryStep.class)) {
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER:
			case LogicPackage.MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER:
			case LogicPackage.MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER:
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER:
			case LogicPackage.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER ||
			childFeature == LogicPackage.Literals.MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
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
		return DMSDesktopEditPlugin.INSTANCE;
	}

}
