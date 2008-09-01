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
import org.onceforall.dms.desktop.logic.MTagStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MTagStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MTagStepItemProvider
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
	public MTagStepItemProvider(AdapterFactory adapterFactory) {
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
			addGenreParameterPropertyDescriptor(object);
			addGenreParameterHistoricValuesPropertyDescriptor(object);
			addYearParameterPropertyDescriptor(object);
			addCommentParameterPropertyDescriptor(object);
			addCommentParameterHistoricValuesPropertyDescriptor(object);
			addMp3FolderReferenceParameterPropertyDescriptor(object);
			addMp3EntryNameParameterPropertyDescriptor(object);
			addMp3EntryReferenceResultPropertyDescriptor(object);
			addMp3FilePathResultPropertyDescriptor(object);
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
				 getString("_UI_MTagStep_artistParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_artistParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__ARTIST_PARAMETER,
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
				 getString("_UI_MTagStep_titleParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_titleParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__TITLE_PARAMETER,
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
				 getString("_UI_MTagStep_albumParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_albumParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__ALBUM_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genre Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenreParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTagStep_genreParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_genreParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__GENRE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genre Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenreParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTagStep_genreParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_genreParameterHistoricValues_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES,
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
				 getString("_UI_MTagStep_yearParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_yearParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__YEAR_PARAMETER,
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
				 getString("_UI_MTagStep_commentParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_commentParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__COMMENT_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTagStep_commentParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_commentParameterHistoricValues_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES,
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
				 getString("_UI_MTagStep_mp3FolderReferenceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_mp3FolderReferenceParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER,
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
				 getString("_UI_MTagStep_mp3EntryNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_mp3EntryNameParameter_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER,
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
				 getString("_UI_MTagStep_mp3EntryReferenceResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_mp3EntryReferenceResult_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 File Path Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3FilePathResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTagStep_mp3FilePathResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTagStep_mp3FilePathResult_feature", "_UI_MTagStep_type"),
				 LogicPackage.Literals.MTAG_STEP__MP3_FILE_PATH_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MARTIST_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MTITLE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MALBUM_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MGENRE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MYEAR_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MCOMMENT_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MTAG_STEP__MMP3_FILE_PATH_RESULT);
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
	 * This returns MTagStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MTagStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MTagStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MTagStep_type") :
			getString("_UI_MTagStep_type") + " " + label;
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

		switch (notification.getFeatureID(MTagStep.class)) {
			case LogicPackage.MTAG_STEP__ARTIST_PARAMETER:
			case LogicPackage.MTAG_STEP__TITLE_PARAMETER:
			case LogicPackage.MTAG_STEP__ALBUM_PARAMETER:
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER:
			case LogicPackage.MTAG_STEP__GENRE_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MTAG_STEP__YEAR_PARAMETER:
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER:
			case LogicPackage.MTAG_STEP__COMMENT_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MTAG_STEP__MP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MTAG_STEP__MP3_ENTRY_NAME_PARAMETER:
			case LogicPackage.MTAG_STEP__MP3_ENTRY_REFERENCE_RESULT:
			case LogicPackage.MTAG_STEP__MP3_FILE_PATH_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MTAG_STEP__MARTIST_PARAMETER:
			case LogicPackage.MTAG_STEP__MTITLE_PARAMETER:
			case LogicPackage.MTAG_STEP__MALBUM_PARAMETER:
			case LogicPackage.MTAG_STEP__MGENRE_PARAMETER:
			case LogicPackage.MTAG_STEP__MYEAR_PARAMETER:
			case LogicPackage.MTAG_STEP__MCOMMENT_PARAMETER:
			case LogicPackage.MTAG_STEP__MMP3_FOLDER_REFERENCE_PARAMETER:
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER:
			case LogicPackage.MTAG_STEP__MMP3_ENTRY_REFERENCE_RESULT:
			case LogicPackage.MTAG_STEP__MMP3_FILE_PATH_RESULT:
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
				(LogicPackage.Literals.MTAG_STEP__MMP3_ENTRY_NAME_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));
	}

}
