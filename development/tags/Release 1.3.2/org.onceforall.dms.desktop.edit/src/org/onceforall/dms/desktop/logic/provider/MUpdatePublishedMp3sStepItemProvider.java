/*
 * Revision History
 * $Log: MUpdatePublishedMp3sStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MUpdatePublishedMp3sStepItemProvider
	extends MPublishMp3sStepItemProvider
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
	public MUpdatePublishedMp3sStepItemProvider(AdapterFactory adapterFactory) {
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

			addRepublishMp3FilesPropertyDescriptor(object);
			addMp3FolderReferenceParameterPropertyDescriptor(object);
			addMp3FolderReferenceResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Republish Mp3 Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepublishMp3FilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MUpdatePublishedMp3sStep_republishMp3Files_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MUpdatePublishedMp3sStep_republishMp3Files_feature", "_UI_MUpdatePublishedMp3sStep_type"),
				 LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES,
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
				 getString("_UI_MUpdatePublishedMp3sStep_mp3FolderReferenceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MUpdatePublishedMp3sStep_mp3FolderReferenceParameter_feature", "_UI_MUpdatePublishedMp3sStep_type"),
				 LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Folder Reference Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3FolderReferenceResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MUpdatePublishedMp3sStep_mp3FolderReferenceResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MUpdatePublishedMp3sStep_mp3FolderReferenceResult_feature", "_UI_MUpdatePublishedMp3sStep_type"),
				 LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES);
			childrenFeatures.add(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT);
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
	 * This returns MUpdatePublishedMp3sStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MUpdatePublishedMp3sStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MUpdatePublishedMp3sStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MUpdatePublishedMp3sStep_type") :
			getString("_UI_MUpdatePublishedMp3sStep_type") + " " + label;
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

		switch (notification.getFeatureID(MUpdatePublishedMp3sStep.class)) {
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES:
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES:
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT,
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
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_SERVER_URL_PARAMETER ||
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_USER_NAME_PARAMETER ||
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER ||
			childFeature == LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES ||
			childFeature == LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT ||
			childFeature == LogicPackage.Literals.MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
