/*
 * Revision History
 * $Log: MEmailEventLogStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MEmailEventLogStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MEmailEventLogStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MEmailEventLogStepItemProvider
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
	public MEmailEventLogStepItemProvider(AdapterFactory adapterFactory) {
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

			addRecordingUsersNameParameterPropertyDescriptor(object);
			addCommentParameterPropertyDescriptor(object);
			addLogFileParameterPropertyDescriptor(object);
			addDataFileParameterPropertyDescriptor(object);
			addSubjectParameterPropertyDescriptor(object);
			addSendersEmailAddressParameterPropertyDescriptor(object);
			addSendersEmailAddressParameterHistoricValuesPropertyDescriptor(object);
			addReceipientsEmailAddressParameterPropertyDescriptor(object);
			addSmtpServerParameterPropertyDescriptor(object);
			addSmtpUserNameParameterPropertyDescriptor(object);
			addSmtpPasswordParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Recording Users Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingUsersNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_recordingUsersNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_recordingUsersNameParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER,
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
				 getString("_UI_MEmailEventLogStep_commentParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_commentParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log File Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogFileParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_logFileParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_logFileParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data File Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFileParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_dataFileParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_dataFileParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subject Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_subjectParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_subjectParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Senders Email Address Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendersEmailAddressParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_sendersEmailAddressParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_sendersEmailAddressParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Senders Email Address Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendersEmailAddressParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_sendersEmailAddressParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_sendersEmailAddressParameterHistoricValues_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receipients Email Address Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceipientsEmailAddressParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_receipientsEmailAddressParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_receipientsEmailAddressParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp Server Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpServerParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_smtpServerParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_smtpServerParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp User Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpUserNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_smtpUserNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_smtpUserNameParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smtp Password Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmtpPasswordParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEmailEventLogStep_smtpPasswordParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEmailEventLogStep_smtpPasswordParameter_feature", "_UI_MEmailEventLogStep_type"),
				 LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER,
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
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER);
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
	 * This returns MEmailEventLogStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MEmailEventLogStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MEmailEventLogStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MEmailEventLogStep_type") :
			getString("_UI_MEmailEventLogStep_type") + " " + label;
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

		switch (notification.getFeatureID(MEmailEventLogStep.class)) {
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER:
			case LogicPackage.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER:
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
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER,
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
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER ||
			childFeature == LogicPackage.Literals.MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER;

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
