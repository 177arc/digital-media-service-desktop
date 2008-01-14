/*
 * Revision History
 * $Log: MAudioStepItemProvider.java,v $
 * Revision 1.3  2006/10/17 02:34:08  marc
 * Updated to checkpoint progress.
 *
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
import org.onceforall.dms.desktop.logic.MAudioStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MAudioStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MAudioStepItemProvider
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
	public MAudioStepItemProvider(AdapterFactory adapterFactory) {
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

			addLeftInputLevelPropertyPropertyDescriptor(object);
			addRightInputLevelPropertyPropertyDescriptor(object);
			addLeftInputDistortionPropertyPropertyDescriptor(object);
			addRightInputDistortionPropertyPropertyDescriptor(object);
			addUseDbPropertyPropertyDescriptor(object);
			addHeadroomPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left Input Level Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftInputLevelPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_leftInputLevelProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_leftInputLevelProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Input Level Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightInputLevelPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_rightInputLevelProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_rightInputLevelProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Input Distortion Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftInputDistortionPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_leftInputDistortionProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_leftInputDistortionProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Input Distortion Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightInputDistortionPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_rightInputDistortionProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_rightInputDistortionProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Db Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDbPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_useDbProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_useDbProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__USE_DB_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Headroom Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadroomPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAudioStep_headroomProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAudioStep_headroomProperty_feature", "_UI_MAudioStep_type"),
				 LogicPackage.Literals.MAUDIO_STEP__HEADROOM_PROPERTY,
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
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MUSE_DB_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAUDIO_STEP__MHEADROOM_PROPERTY);
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
	 * This returns MAudioStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MAudioStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MAudioStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MAudioStep_type") :
			getString("_UI_MAudioStep_type") + " " + label;
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

		switch (notification.getFeatureID(MAudioStep.class)) {
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY:
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY:
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY:
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY:
			case LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY:
			case LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:
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
