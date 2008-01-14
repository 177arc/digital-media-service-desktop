/*
 * Revision History
 * $Log: MCheckFreeDiskSpaceStepItemProvider.java,v $
 * Revision 1.3  2007/05/12 11:00:48  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:47  marc
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
import org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MCheckFreeDiskSpaceStepItemProvider
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
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCheckFreeDiskSpaceStepItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredFreeDiskSpaceParameterPropertyDescriptor(object);
			addDirectoryParameterPropertyDescriptor(object);
			addFreeDiskSpaceResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Free Disk Space Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredFreeDiskSpaceParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCheckFreeDiskSpaceStep_requiredFreeDiskSpaceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCheckFreeDiskSpaceStep_requiredFreeDiskSpaceParameter_feature", "_UI_MCheckFreeDiskSpaceStep_type"),
				 LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCheckFreeDiskSpaceStep_directoryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCheckFreeDiskSpaceStep_directoryParameter_feature", "_UI_MCheckFreeDiskSpaceStep_type"),
				 LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free Disk Space Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeDiskSpaceResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCheckFreeDiskSpaceStep_freeDiskSpaceResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCheckFreeDiskSpaceStep_freeDiskSpaceResult_feature", "_UI_MCheckFreeDiskSpaceStep_type"),
				 LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT);
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
	 * This returns MCheckFreeDiskSpaceStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MCheckFreeDiskSpaceStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MCheckFreeDiskSpaceStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MCheckFreeDiskSpaceStep_type") :
			getString("_UI_MCheckFreeDiskSpaceStep_type") + " " + label;
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

		switch (notification.getFeatureID(MCheckFreeDiskSpaceStep.class)) {
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER:
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER:
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER:
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER:
			case LogicPackage.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT:
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
				(LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));
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
