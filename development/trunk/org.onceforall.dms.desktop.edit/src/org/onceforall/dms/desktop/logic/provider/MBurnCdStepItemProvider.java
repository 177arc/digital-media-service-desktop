/*
 * Revision History
 * $Log: MBurnCdStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MBurnCdStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MBurnCdStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MBurnCdStepItemProvider
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
	public MBurnCdStepItemProvider(AdapterFactory adapterFactory) {
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

			addRecordingFilesParameterPropertyDescriptor(object);
			addBurningSoftwareDirectoryPathParameterPropertyDescriptor(object);
			addDriveParameterPropertyDescriptor(object);
			addTotalRecordingLengthParameterPropertyDescriptor(object);
			addTotalRecordingFileSizeParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Recording Files Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingFilesParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBurnCdStep_recordingFilesParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBurnCdStep_recordingFilesParameter_feature", "_UI_MBurnCdStep_type"),
				 LogicPackage.Literals.MBURN_CD_STEP__RECORDING_FILES_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Burning Software Directory Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBurningSoftwareDirectoryPathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBurnCdStep_burningSoftwareDirectoryPathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBurnCdStep_burningSoftwareDirectoryPathParameter_feature", "_UI_MBurnCdStep_type"),
				 LogicPackage.Literals.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drive Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriveParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBurnCdStep_driveParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBurnCdStep_driveParameter_feature", "_UI_MBurnCdStep_type"),
				 LogicPackage.Literals.MBURN_CD_STEP__DRIVE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Recording Length Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalRecordingLengthParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBurnCdStep_totalRecordingLengthParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBurnCdStep_totalRecordingLengthParameter_feature", "_UI_MBurnCdStep_type"),
				 LogicPackage.Literals.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Recording File Size Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalRecordingFileSizeParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBurnCdStep_totalRecordingFileSizeParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBurnCdStep_totalRecordingFileSizeParameter_feature", "_UI_MBurnCdStep_type"),
				 LogicPackage.Literals.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER,
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
			childrenFeatures.add(LogicPackage.Literals.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MBURN_CD_STEP__MDRIVE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER);
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
	 * This returns MBurnCdStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MBurnCdStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MBurnCdStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MBurnCdStep_type") :
			getString("_UI_MBurnCdStep_type") + " " + label;
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

		switch (notification.getFeatureID(MBurnCdStep.class)) {
			case LogicPackage.MBURN_CD_STEP__RECORDING_FILES_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__DRIVE_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__MDRIVE_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER:
			case LogicPackage.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER:
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
				(LogicPackage.Literals.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MBURN_CD_STEP__MDRIVE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));
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
			childFeature == LogicPackage.Literals.MBURN_CD_STEP__MRECORDING_FILES_PARAMETER ||
			childFeature == LogicPackage.Literals.MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MBURN_CD_STEP__MDRIVE_PARAMETER ||
			childFeature == LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER ||
			childFeature == LogicPackage.Literals.MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER;

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
