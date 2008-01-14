/*
 * Revision History
 * $Log: MMp3ItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MMp3;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MMp3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MMp3ItemProvider
	extends MStatefulObjectItemProvider
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
	public MMp3ItemProvider(AdapterFactory adapterFactory) {
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

			addStatePropertyPropertyDescriptor(object);
			addFilePropertyPropertyDescriptor(object);
			addLinkTextPropertyPropertyDescriptor(object);
			addLinkDescriptionPropertyPropertyDescriptor(object);
			addCommentPropertyPropertyDescriptor(object);
			addPodcastTitlePropertyPropertyDescriptor(object);
			addPodcastSubtitlePropertyPropertyDescriptor(object);
			addPodcastSummaryPropertyPropertyDescriptor(object);
			addPodcastPublishingDatePropertyPropertyDescriptor(object);
			addPublishedFileNamePropertyPropertyDescriptor(object);
			addKeepPublishedPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_stateProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_stateProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__STATE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_fileProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_fileProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__FILE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Text Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkTextPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_linkTextProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_linkTextProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__LINK_TEXT_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Description Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkDescriptionPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_linkDescriptionProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_linkDescriptionProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__LINK_DESCRIPTION_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_commentProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_commentProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__COMMENT_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Title Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastTitlePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_podcastTitleProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_podcastTitleProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__PODCAST_TITLE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Subtitle Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastSubtitlePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_podcastSubtitleProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_podcastSubtitleProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__PODCAST_SUBTITLE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Summary Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastSummaryPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_podcastSummaryProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_podcastSummaryProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__PODCAST_SUMMARY_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Podcast Publishing Date Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPodcastPublishingDatePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_podcastPublishingDateProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_podcastPublishingDateProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Published File Name Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishedFileNamePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_publishedFileNameProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_publishedFileNameProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__PUBLISHED_FILE_NAME_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Published Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepPublishedPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMp3_keepPublishedProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMp3_keepPublishedProperty_feature", "_UI_MMp3_type"),
				 LogicPackage.Literals.MMP3__KEEP_PUBLISHED_PROPERTY,
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
			childrenFeatures.add(LogicPackage.Literals.MMP3__MFILE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MLINK_TEXT_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MLINK_DESCRIPTION_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MCOMMENT_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MPODCAST_TITLE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MPODCAST_SUBTITLE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MPODCAST_SUMMARY_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MPUBLISHED_FILE_NAME_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MMP3__MKEEP_PUBLISHED_PROPERTY);
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
	 * This returns MMp3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MMp3"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MMp3)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MMp3_type") :
			getString("_UI_MMp3_type") + " " + label;
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

		switch (notification.getFeatureID(MMp3.class)) {
			case LogicPackage.MMP3__STATE_PROPERTY:
			case LogicPackage.MMP3__FILE_PROPERTY:
			case LogicPackage.MMP3__LINK_TEXT_PROPERTY:
			case LogicPackage.MMP3__LINK_DESCRIPTION_PROPERTY:
			case LogicPackage.MMP3__COMMENT_PROPERTY:
			case LogicPackage.MMP3__PODCAST_TITLE_PROPERTY:
			case LogicPackage.MMP3__PODCAST_SUBTITLE_PROPERTY:
			case LogicPackage.MMP3__PODCAST_SUMMARY_PROPERTY:
			case LogicPackage.MMP3__PODCAST_PUBLISHING_DATE_PROPERTY:
			case LogicPackage.MMP3__PUBLISHED_FILE_NAME_PROPERTY:
			case LogicPackage.MMP3__KEEP_PUBLISHED_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MMP3__MFILE_PROPERTY:
			case LogicPackage.MMP3__MLINK_TEXT_PROPERTY:
			case LogicPackage.MMP3__MLINK_DESCRIPTION_PROPERTY:
			case LogicPackage.MMP3__MCOMMENT_PROPERTY:
			case LogicPackage.MMP3__MPODCAST_TITLE_PROPERTY:
			case LogicPackage.MMP3__MPODCAST_SUBTITLE_PROPERTY:
			case LogicPackage.MMP3__MPODCAST_SUMMARY_PROPERTY:
			case LogicPackage.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY:
			case LogicPackage.MMP3__MPUBLISHED_FILE_NAME_PROPERTY:
			case LogicPackage.MMP3__MKEEP_PUBLISHED_PROPERTY:
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
				(LogicPackage.Literals.MMP3__MFILE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MLINK_TEXT_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MLINK_DESCRIPTION_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MCOMMENT_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MPODCAST_TITLE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MPODCAST_SUBTITLE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MPODCAST_SUMMARY_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MPUBLISHED_FILE_NAME_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MMP3__MKEEP_PUBLISHED_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));
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
			childFeature == LogicPackage.Literals.MMP3__MFILE_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MLINK_TEXT_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MLINK_DESCRIPTION_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MCOMMENT_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MPODCAST_TITLE_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MPODCAST_SUBTITLE_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MPODCAST_SUMMARY_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MPUBLISHED_FILE_NAME_PROPERTY ||
			childFeature == LogicPackage.Literals.MMP3__MKEEP_PUBLISHED_PROPERTY;

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
