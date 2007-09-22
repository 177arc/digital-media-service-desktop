/**
 * <copyright>
 * </copyright>
 *
 * $Id: MDmsApplicationMUpgradeDataStepItemProvider.java,v 1.1 2007/05/12 11:00:48 marc Exp $
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
import org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDmsApplicationMUpgradeDataStepItemProvider
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
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDmsApplicationMUpgradeDataStepItemProvider(AdapterFactory adapterFactory) {
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
			addUpgradeMessageParameterPropertyDescriptor(object);
			addUpgradeDateParameterPropertyDescriptor(object);
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
				 getString("_UI_MDmsApplicationMUpgradeDataStep_upgradeRelativeFtpPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMUpgradeDataStep_upgradeRelativeFtpPathProperty_feature", "_UI_MDmsApplicationMUpgradeDataStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Message Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeMessageParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMUpgradeDataStep_upgradeMessageParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMUpgradeDataStep_upgradeMessageParameter_feature", "_UI_MDmsApplicationMUpgradeDataStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Date Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeDateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplicationMUpgradeDataStep_upgradeDateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplicationMUpgradeDataStep_upgradeDateParameter_feature", "_UI_MDmsApplicationMUpgradeDataStep_type"),
				 LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER,
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
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER);
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
	 * This returns MDmsApplicationMUpgradeDataStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MDmsApplicationMUpgradeDataStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MDmsApplicationMUpgradeDataStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDmsApplicationMUpgradeDataStep_type") :
			getString("_UI_MDmsApplicationMUpgradeDataStep_type") + " " + label;
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

		switch (notification.getFeatureID(MDmsApplicationMUpgradeDataStep.class)) {
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER:
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER:
			case LogicPackage.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER:
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
				(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER,
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
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_SERVER_URL_PARAMETER ||
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_USER_NAME_PARAMETER ||
			childFeature == LogicPackage.Literals.MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER;

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
