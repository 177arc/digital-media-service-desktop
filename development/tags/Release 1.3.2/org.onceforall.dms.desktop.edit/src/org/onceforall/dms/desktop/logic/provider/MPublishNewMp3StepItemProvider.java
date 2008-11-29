/*
 * Revision History
 * $Log: MPublishNewMp3StepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MPublishNewMp3Step;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MPublishNewMp3StepItemProvider
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
	public MPublishNewMp3StepItemProvider(AdapterFactory adapterFactory) {
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

			addMp3EntryReferenceParameterPropertyDescriptor(object);
			addLinkTextParameterPropertyDescriptor(object);
			addLinkDescriptionParameterPropertyDescriptor(object);
			addCommentParameterPropertyDescriptor(object);
			addPodcastTitleParameterPropertyDescriptor(object);
			addPodcastSubtitleParameterPropertyDescriptor(object);
			addPodcastSummaryParameterPropertyDescriptor(object);
			addPodcastPublishingDateParameterPropertyDescriptor(object);
			addPublishedMp3EntryReferenceResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mp3 Entry Reference Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3EntryReferenceParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_mp3EntryReferenceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_mp3EntryReferenceParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Text Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkTextParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_linkTextParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_linkTextParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Description Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkDescriptionParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_linkDescriptionParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_linkDescriptionParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_commentParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_commentParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Title Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastTitleParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_podcastTitleParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_podcastTitleParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Subtitle Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastSubtitleParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_podcastSubtitleParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_podcastSubtitleParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Summary Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastSummaryParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_podcastSummaryParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_podcastSummaryParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Publishing Date Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastPublishingDateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_podcastPublishingDateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_podcastPublishingDateParameter_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Published Mp3 Entry Reference Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishedMp3EntryReferenceResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MPublishNewMp3Step_publishedMp3EntryReferenceResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MPublishNewMp3Step_publishedMp3EntryReferenceResult_feature", "_UI_MPublishNewMp3Step_type"),
				 LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT);
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
	 * This returns MPublishNewMp3Step.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MPublishNewMp3Step"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MPublishNewMp3Step)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MPublishNewMp3Step_type") :
			getString("_UI_MPublishNewMp3Step_type") + " " + label;
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

		switch (notification.getFeatureID(MPublishNewMp3Step.class)) {
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER:
			case LogicPackage.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT:
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
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT,
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
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MCONTENT_PAGE_URL_RESULT ||
			childFeature == LogicPackage.Literals.MPUBLISH_MP3S_STEP__MPODCAST_FILE_URL_RESULT ||
			childFeature == LogicPackage.Literals.MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
