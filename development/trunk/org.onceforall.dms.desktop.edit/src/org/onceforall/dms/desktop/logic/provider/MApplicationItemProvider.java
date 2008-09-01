/*
 * Revision History
 * $Log: MApplicationItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MApplication;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MApplicationItemProvider
	extends MObjectItemProvider
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
	public MApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addDataFilePropertyPropertyDescriptor(object);
			addInfoWebPagePropertyPropertyDescriptor(object);
			addDataFilePropertyHistoricValuesPropertyDescriptor(object);
			addLogFilePropertyPropertyDescriptor(object);
			addPathPropertyPropertyDescriptor(object);
			addVersionPropertyPropertyDescriptor(object);
			addLastSavePropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data File Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFilePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_dataFileProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_dataFileProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__DATA_FILE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info Web Page Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoWebPagePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_infoWebPageProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_infoWebPageProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__INFO_WEB_PAGE_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data File Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFilePropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_dataFilePropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_dataFilePropertyHistoricValues_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log File Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogFilePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_logFileProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_logFileProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__LOG_FILE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_pathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_pathProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_versionProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_versionProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__VERSION_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Save Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSavePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_lastSaveProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_lastSaveProperty_feature", "_UI_MApplication_type"),
				 LogicPackage.Literals.MAPPLICATION__LAST_SAVE_PROPERTY,
				 true,
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
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MDATA_FILE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MLOG_FILE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MPATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MVERSION_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MAPPLICATION__MLAST_SAVE_PROPERTY);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MApplication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MApplication_type") :
			getString("_UI_MApplication_type") + " " + label;
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

		switch (notification.getFeatureID(MApplication.class)) {
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY:
			case LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY:
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY:
			case LogicPackage.MAPPLICATION__PATH_PROPERTY:
			case LogicPackage.MAPPLICATION__VERSION_PROPERTY:
			case LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:
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
				(LogicPackage.Literals.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MAPPLICATION__MLAST_SAVE_PROPERTY,
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
			childFeature == LogicPackage.Literals.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY ||
			childFeature == LogicPackage.Literals.MAPPLICATION__MLAST_SAVE_PROPERTY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
