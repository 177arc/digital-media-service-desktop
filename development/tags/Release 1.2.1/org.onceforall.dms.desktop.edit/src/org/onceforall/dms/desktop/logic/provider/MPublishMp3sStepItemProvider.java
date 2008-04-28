/*
 * Revision History
 * $Log: MPublishMp3sStepItemProvider.java,v $
 * Revision 1.3  2007/05/12 11:00:48  marc
 * Moved to EMF model-based application.
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
import org.onceforall.dms.desktop.logic.MPublishMp3sStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MPublishMp3sStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MPublishMp3sStepItemProvider
	extends MFtpStepItemProvider
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
	public MPublishMp3sStepItemProvider(AdapterFactory adapterFactory) {
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

			addMaxiumumDiskSpaceParameterPropertyDescriptor(object);
			addMp3RelativeFtpPathParameterPropertyDescriptor(object);
			addWebServerUrlParameterPropertyDescriptor(object);
			addContentPageRelativeFtpPathParameterPropertyDescriptor(object);
			addContentHeaderFilePathParameterPropertyDescriptor(object);
			addContentFooterFilePathParameterPropertyDescriptor(object);
			addContentPageFilePathParameterPropertyDescriptor(object);
			addPodcastFilePathParameterPropertyDescriptor(object);
			addPodcastRelativeFtpPathParameterPropertyDescriptor(object);
			addPodcastHeaderFilePathParameterPropertyDescriptor(object);
			addContentIncludeMp3PlayerParameterPropertyDescriptor(object);
			addContentGroupRecordingsParameterPropertyDescriptor(object);
			addContentPageUrlResultPropertyDescriptor(object);
			addPodcastFileUrlResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mp3 Relative Ftp Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3RelativeFtpPathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_mp3RelativeFtpPathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_mp3RelativeFtpPathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maxiumum Disk Space Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxiumumDiskSpaceParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_maxiumumDiskSpaceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_maxiumumDiskSpaceParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Server Url Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebServerUrlParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_webServerUrlParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_webServerUrlParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Page Relative Ftp Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPageRelativeFtpPathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentPageRelativeFtpPathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentPageRelativeFtpPathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Header File Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentHeaderFilePathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentHeaderFilePathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentHeaderFilePathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Footer File Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentFooterFilePathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentFooterFilePathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentFooterFilePathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Page File Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPageFilePathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentPageFilePathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentPageFilePathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast File Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastFilePathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_podcastFilePathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_podcastFilePathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Relative Ftp Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastRelativeFtpPathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_podcastRelativeFtpPathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_podcastRelativeFtpPathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Header File Path Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastHeaderFilePathParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_podcastHeaderFilePathParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_podcastHeaderFilePathParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Include Mp3 Player Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentIncludeMp3PlayerParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentIncludeMp3PlayerParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentIncludeMp3PlayerParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Group Recordings Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentGroupRecordingsParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentGroupRecordingsParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentGroupRecordingsParameter_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Page Url Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPageUrlResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_contentPageUrlResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_contentPageUrlResult_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast File Url Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastFileUrlResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishMp3sStep_podcastFileUrlResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishMp3sStep_podcastFileUrlResult_feature", "_UI_MPublishMp3sStep_type"),
				 LogicPackage.Literals.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT);
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
	 * This returns MPublishMp3sStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MPublishMp3sStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MPublishMp3sStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MPublishMp3sStep_type") :
			getString("_UI_MPublishMp3sStep_type") + " " + label;
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

		switch (notification.getFeatureID(MPublishMp3sStep.class)) {
			case LogicPackage.MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_GROUP_RECORDINGS_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__CONTENT_PAGE_URL_RESULT:
			case LogicPackage.MPUBLISH_MP3S_STEP__PODCAST_FILE_URL_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER:
			case LogicPackage.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT:
			case LogicPackage.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT:
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
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_INCLUDE_MP3_PLAYER_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_GROUP_RECORDINGS_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT,
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
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT;

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
