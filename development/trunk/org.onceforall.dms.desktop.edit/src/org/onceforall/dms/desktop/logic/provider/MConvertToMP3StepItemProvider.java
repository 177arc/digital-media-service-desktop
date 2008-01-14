/*
 * Revision History
 * $Log: MConvertToMP3StepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MConvertToMP3Step;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MConvertToMP3Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MConvertToMP3StepItemProvider
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
	public MConvertToMP3StepItemProvider(AdapterFactory adapterFactory) {
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

			addArtistParameterPropertyDescriptor(object);
			addTitleParameterPropertyDescriptor(object);
			addAlbumParameterPropertyDescriptor(object);
			addYearParameterPropertyDescriptor(object);
			addDirectoryParameterPropertyDescriptor(object);
			addMp3FileNameParameterPropertyDescriptor(object);
			addRecordingFileParameterPropertyDescriptor(object);
			addMp3EncoderPathParameterPropertyDescriptor(object);
			addAverageBitRateParameterPropertyDescriptor(object);
			addMp3FolderReferenceParameterPropertyDescriptor(object);
			addMp3EntryNameParameterPropertyDescriptor(object);
			addMp3EntryReferenceResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Artist Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtistParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_artistParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_artistParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_titleParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_titleParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Album Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlbumParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_albumParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_albumParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_yearParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_yearParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER,
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
				 getString("_UI_MConvertToMP3Step_directoryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_directoryParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 File Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3FileNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_mp3FileNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_mp3FileNameParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER,
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
				 getString("_UI_MConvertToMP3Step_recordingFileParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_recordingFileParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Encoder Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3EncoderPathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_mp3EncoderPathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_mp3EncoderPathParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Average Bit Rate Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageBitRateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_averageBitRateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_averageBitRateParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Folder Reference Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3FolderReferenceParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_mp3FolderReferenceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_mp3FolderReferenceParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Entry Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3EntryNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_mp3EntryNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_mp3EntryNameParameter_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Entry Reference Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3EntryReferenceResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MConvertToMP3Step_mp3EntryReferenceResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MConvertToMP3Step_mp3EntryReferenceResult_feature", "_UI_MConvertToMP3Step_type"),
				 LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT,
				 false,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT);
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
	 * This returns MConvertToMP3Step.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MConvertToMP3Step"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MConvertToMP3Step)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MConvertToMP3Step_type") :
			getString("_UI_MConvertToMP3Step_type") + " " + label;
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

		switch (notification.getFeatureID(MConvertToMP3Step.class)) {
			case LogicPackage.MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__TITLE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__YEAR_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER:
			case LogicPackage.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT:
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
				(LogicPackage.Literals.MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));
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
