/*
 * Revision History
 * $Log: MDmsApplicationItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MDmsApplication;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MDmsApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDmsApplicationItemProvider
	extends MApplicationItemProvider
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
	public MDmsApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addServiceFilePathPropertyPropertyDescriptor(object);
			addWwxFilesPathPropertyPropertyDescriptor(object);
			addMp3EncoderPathPropertyPropertyDescriptor(object);
			addFtpServerUrlPropertyPropertyDescriptor(object);
			addFtpServerUrlPropertyHistoricValuesPropertyDescriptor(object);
			addFtpUserNamePropertyPropertyDescriptor(object);
			addFtpUserNamePropertyHistoricValuesPropertyDescriptor(object);
			addFtpUserPasswordPropertyPropertyDescriptor(object);
			addWebServerUrlPropertyPropertyDescriptor(object);
			addWebServerUrlPropertyHistoricValuesPropertyDescriptor(object);
			addSmtpServerPropertyPropertyDescriptor(object);
			addSmtpServerPropertyHistoricValuesPropertyDescriptor(object);
			addSmtpUserNamePropertyPropertyDescriptor(object);
			addSmtpUserNamePropertyHistoricValuesPropertyDescriptor(object);
			addSmtpPasswordPropertyPropertyDescriptor(object);
			addBurningSoftwareDirectoryPathPropertyPropertyDescriptor(object);
			addDrivePropertyPropertyDescriptor(object);
			addDrivePropertyHistoricValuesPropertyDescriptor(object);
			addUpgradeMessagePropertyPropertyDescriptor(object);
			addUpgradeRelativeFtpPathPropertyPropertyDescriptor(object);
			addLastUpgradePropertyPropertyDescriptor(object);
			addOrganisationPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service File Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceFilePathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_serviceFilePathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_serviceFilePathProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wwx Files Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWwxFilesPathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_wwxFilesPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_wwxFilesPathProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mp3 Encoder Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMp3EncoderPathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_mp3EncoderPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_mp3EncoderPathProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ftp Server Url Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFtpServerUrlPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_ftpServerUrlProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_ftpServerUrlProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ftp Server Url Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFtpServerUrlPropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_ftpServerUrlPropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_ftpServerUrlPropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ftp User Name Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFtpUserNamePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_ftpUserNameProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_ftpUserNameProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ftp User Name Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFtpUserNamePropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_ftpUserNamePropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_ftpUserNamePropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ftp User Password Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFtpUserPasswordPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_ftpUserPasswordProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_ftpUserPasswordProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Server Url Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebServerUrlPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_webServerUrlProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_webServerUrlProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Server Url Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebServerUrlPropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_webServerUrlPropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_webServerUrlPropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp Server Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpServerPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_smtpServerProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_smtpServerProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SMTP_SERVER_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp Server Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpServerPropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_smtpServerPropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_smtpServerPropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp User Name Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpUserNamePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_smtpUserNameProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_smtpUserNameProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp User Name Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpUserNamePropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_smtpUserNamePropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_smtpUserNamePropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp Password Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpPasswordPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_smtpPasswordProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_smtpPasswordProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Burning Software Directory Path Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBurningSoftwareDirectoryPathPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_burningSoftwareDirectoryPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_burningSoftwareDirectoryPathProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drive Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrivePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_driveProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_driveProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__DRIVE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drive Property Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrivePropertyHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_drivePropertyHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_drivePropertyHistoricValues_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upgrade Message Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpgradeMessagePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_upgradeMessageProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_upgradeMessageProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MDmsApplication_upgradeRelativeFtpPathProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_upgradeRelativeFtpPathProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Upgrade Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastUpgradePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_lastUpgradeProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_lastUpgradeProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organisation Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganisationPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDmsApplication_organisationProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDmsApplication_organisationProperty_feature", "_UI_MDmsApplication_type"),
				 LogicPackage.Literals.MDMS_APPLICATION__ORGANISATION_PROPERTY,
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
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MDRIVE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MORGANISATION_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_DATA_STEP);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MSCRIPTS);
			childrenFeatures.add(LogicPackage.Literals.MDMS_APPLICATION__MMP3_FOLDERS);
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
	 * This returns MDmsApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MDmsApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MDmsApplication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDmsApplication_type") :
			getString("_UI_MDmsApplication_type") + " " + label;
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

		switch (notification.getFeatureID(MDmsApplication.class)) {
			case LogicPackage.MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES:
			case LogicPackage.MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__LAST_UPGRADE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__ORGANISATION_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MDRIVE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MORGANISATION_PROPERTY:
			case LogicPackage.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP:
			case LogicPackage.MDMS_APPLICATION__MUPGRADE_DATA_STEP:
			case LogicPackage.MDMS_APPLICATION__MSCRIPTS:
			case LogicPackage.MDMS_APPLICATION__MMP3_FOLDERS:
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
				(LogicPackage.Literals.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MDRIVE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MORGANISATION_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP,
				 LogicFactory.eINSTANCE.createMDmsApplicationMGetDataUpgradeInfoStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_DATA_STEP,
				 LogicFactory.eINSTANCE.createMDmsApplicationMUpgradeDataStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MSCRIPTS,
				 LogicFactory.eINSTANCE.createMScript()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MDMS_APPLICATION__MMP3_FOLDERS,
				 LogicFactory.eINSTANCE.createMMp3Folder()));
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
			childFeature == LogicPackage.Literals.MAPPLICATION__MLAST_SAVE_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MSMTP_SERVER_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MDRIVE_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY ||
			childFeature == LogicPackage.Literals.MDMS_APPLICATION__MORGANISATION_PROPERTY;

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
