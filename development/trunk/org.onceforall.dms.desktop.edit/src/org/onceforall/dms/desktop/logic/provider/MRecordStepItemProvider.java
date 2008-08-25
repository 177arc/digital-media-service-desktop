/*
 * Revision History
 * $Log: MRecordStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MRecordStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MRecordStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MRecordStepItemProvider
	extends MAudioStepItemProvider
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
	public MRecordStepItemProvider(AdapterFactory adapterFactory) {
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

			addRecordingLengthPropertyPropertyDescriptor(object);
			addDirectoryParameterPropertyDescriptor(object);
			addRecordingFileParameterPropertyDescriptor(object);
			addRecordingFileResultPropertyDescriptor(object);
			addRecordingFileSizeResultPropertyDescriptor(object);
			addRecordingLengthResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Recording Length Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingLengthPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRecordStep_recordingLengthProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_recordingLengthProperty_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__RECORDING_LENGTH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording File Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingFileParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRecordStep_recordingFileParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_recordingFileParameter_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__RECORDING_FILE_PARAMETER,
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
				 getString("_UI_MRecordStep_directoryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_directoryParameter_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__DIRECTORY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording File Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingFileResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRecordStep_recordingFileResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_recordingFileResult_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__RECORDING_FILE_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording File Size Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingFileSizeResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRecordStep_recordingFileSizeResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_recordingFileSizeResult_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording Length Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingLengthResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRecordStep_recordingLengthResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRecordStep_recordingLengthResult_feature", "_UI_MRecordStep_type"),
				 LogicPackage.Literals.MRECORD_STEP__RECORDING_LENGTH_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MRECORDING_LENGTH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MDIRECTORY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MRECORDING_FILE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MRECORDING_FILE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MRECORD_STEP__MRECORDING_LENGTH_RESULT);
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
	 * This returns MRecordStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MRecordStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MRecordStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MRecordStep_type") :
			getString("_UI_MRecordStep_type") + " " + label;
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

		switch (notification.getFeatureID(MRecordStep.class)) {
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_PROPERTY:
			case LogicPackage.MRECORD_STEP__DIRECTORY_PARAMETER:
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_PARAMETER:
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_RESULT:
			case LogicPackage.MRECORD_STEP__RECORDING_FILE_SIZE_RESULT:
			case LogicPackage.MRECORD_STEP__RECORDING_LENGTH_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_PROPERTY:
			case LogicPackage.MRECORD_STEP__MDIRECTORY_PARAMETER:
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_PARAMETER:
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_RESULT:
			case LogicPackage.MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT:
			case LogicPackage.MRECORD_STEP__MRECORDING_LENGTH_RESULT:
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
