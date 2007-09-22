/*
 * Revision History
 * $Log: MEnterServiceInformationStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MEnterServiceInformationStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MEnterServiceInformationStepItemProvider
	extends MEnterInformationStepItemProvider
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
	public MEnterServiceInformationStepItemProvider(AdapterFactory adapterFactory) {
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

			addServiceDateParameterPropertyDescriptor(object);
			addServiceTypeParameterPropertyDescriptor(object);
			addServiceTypeParameterHistoricValuesPropertyDescriptor(object);
			addTitleOfTalkParameterPropertyDescriptor(object);
			addReadingParameterPropertyDescriptor(object);
			addSpeakersNameParameterPropertyDescriptor(object);
			addSpeakersNameParameterHistoricValuesPropertyDescriptor(object);
			addRecordingUsersNameParameterPropertyDescriptor(object);
			addRecordingUsersNameParameterHistoricValuesPropertyDescriptor(object);
			addServiceDateResultPropertyDescriptor(object);
			addServiceTypeResultPropertyDescriptor(object);
			addTitleOfTalkResultPropertyDescriptor(object);
			addReadingResultPropertyDescriptor(object);
			addSpeakersNameResultPropertyDescriptor(object);
			addRecordingUsersNameResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service Date Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceDateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_serviceDateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_serviceDateParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Type Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTypeParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_serviceTypeParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_serviceTypeParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Type Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTypeParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_serviceTypeParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_serviceTypeParameterHistoricValues_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Of Talk Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleOfTalkParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_titleOfTalkParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_titleOfTalkParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reading Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadingParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_readingParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_readingParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speakers Name Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeakersNameParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_speakersNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_speakersNameParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speakers Name Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeakersNameParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_speakersNameParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_speakersNameParameterHistoricValues_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MEnterServiceInformationStep_recordingUsersNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_recordingUsersNameParameter_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording Users Name Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingUsersNameParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_recordingUsersNameParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_recordingUsersNameParameterHistoricValues_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Date Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceDateResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_serviceDateResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_serviceDateResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Type Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTypeResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_serviceTypeResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_serviceTypeResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Of Talk Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleOfTalkResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_titleOfTalkResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_titleOfTalkResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reading Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadingResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_readingResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_readingResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speakers Name Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeakersNameResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_speakersNameResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_speakersNameResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording Users Name Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingUsersNameResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterServiceInformationStep_recordingUsersNameResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterServiceInformationStep_recordingUsersNameResult_feature", "_UI_MEnterServiceInformationStep_type"),
				 LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT);
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
	 * This returns MEnterServiceInformationStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MEnterServiceInformationStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MEnterServiceInformationStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MEnterServiceInformationStep_type") :
			getString("_UI_MEnterServiceInformationStep_type") + " " + label;
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

		switch (notification.getFeatureID(MEnterServiceInformationStep.class)) {
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__READING_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
			case LogicPackage.MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
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
