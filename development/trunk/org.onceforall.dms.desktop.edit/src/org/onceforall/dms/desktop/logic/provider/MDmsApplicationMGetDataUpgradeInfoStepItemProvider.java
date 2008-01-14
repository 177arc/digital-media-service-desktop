/**
 * <copyright>
 * </copyright>
 *
 * $Id: MDmsApplicationMGetDataUpgradeInfoStepItemProvider.java,v 1.1 2007/05/12 11:00:48 marc Exp $
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
import org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDmsApplicationMGetDataUpgradeInfoStepItemProvider
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
	public MDmsApplicationMGetDataUpgradeInfoStepItemProvider(AdapterFactory adapterFactory) {
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

			addUpgradeRelativeFtpPathPropertyPropertyDescriptor(object);
			addUpgradeAvailableResultPropertyDescriptor(object);
			addUpgradeMessageResultPropertyDescriptor(object);
			addUpgradeDateResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Upgrade Relative Ftp Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeRelativeFtpPathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeRelativeFtpPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeRelativeFtpPathProperty_feature", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Available Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeAvailableResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeAvailableResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeAvailableResult_feature", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Message Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeMessageResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeMessageResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeMessageResult_feature", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Date Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeDateResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeDateResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_upgradeDateResult_feature", "_UI_MDmsApplicationMGetDataUpgradeInfoStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT);
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
	 * This returns MDmsApplicationMGetDataUpgradeInfoStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MDmsApplicationMGetDataUpgradeInfoStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MDmsApplicationMGetDataUpgradeInfoStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_type") :
			getString("_UI_MDmsApplicationMGetDataUpgradeInfoStep_type") + " " + label;
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

		switch (notification.getFeatureID(MDmsApplicationMGetDataUpgradeInfoStep.class)) {
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT:
			case LogicPackage.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT:
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
				(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT,
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
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT;

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
