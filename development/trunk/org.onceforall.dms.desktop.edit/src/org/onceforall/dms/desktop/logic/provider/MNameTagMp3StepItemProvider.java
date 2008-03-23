/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.onceforall.dms.desktop.logic.MNameTagMp3Step;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MNameTagMp3Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MNameTagMp3StepItemProvider
	extends MTagStepItemProvider
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
	public MNameTagMp3StepItemProvider(AdapterFactory adapterFactory) {
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

			addDirectoryParameterPropertyDescriptor(object);
			addTaggedMp3FileNameParameterPropertyDescriptor(object);
			addRecordingMp3FileParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MNameTagMp3Step_directoryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MNameTagMp3Step_directoryParameter_feature", "_UI_MNameTagMp3Step_type"),
				 LogicPackage.Literals.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tagged Mp3 File Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaggedMp3FileNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MNameTagMp3Step_taggedMp3FileNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MNameTagMp3Step_taggedMp3FileNameParameter_feature", "_UI_MNameTagMp3Step_type"),
				 LogicPackage.Literals.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording Mp3 File Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingMp3FileParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MNameTagMp3Step_recordingMp3FileParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MNameTagMp3Step_recordingMp3FileParameter_feature", "_UI_MNameTagMp3Step_type"),
				 LogicPackage.Literals.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER,
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
			childrenFeatures.add(LogicPackage.Literals.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER);
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
	 * This returns MNameTagMp3Step.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MNameTagMp3Step"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MNameTagMp3Step)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MNameTagMp3Step_type") :
			getString("_UI_MNameTagMp3Step_type") + " " + label;
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

		switch (notification.getFeatureID(MNameTagMp3Step.class)) {
			case LogicPackage.MNAME_TAG_MP3_STEP__DIRECTORY_PARAMETER:
			case LogicPackage.MNAME_TAG_MP3_STEP__TAGGED_MP3_FILE_NAME_PARAMETER:
			case LogicPackage.MNAME_TAG_MP3_STEP__RECORDING_MP3_FILE_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MNAME_TAG_MP3_STEP__MDIRECTORY_PARAMETER:
			case LogicPackage.MNAME_TAG_MP3_STEP__MTAGGED_MP3_FILE_NAME_PARAMETER:
			case LogicPackage.MNAME_TAG_MP3_STEP__MRECORDING_MP3_FILE_PARAMETER:
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
