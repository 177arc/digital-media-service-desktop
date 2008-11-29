/*
 * Revision History
 * $Log: MEnterWwxInformationStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MEnterWwxInformationStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MEnterWwxInformationStepItemProvider
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
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEnterWwxInformationStepItemProvider(AdapterFactory adapterFactory) {
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

			addWwxDateParameterPropertyDescriptor(object);
			addTitleOfTalkParameterPropertyDescriptor(object);
			addSpeakersNameParameterPropertyDescriptor(object);
			addSpeakersNameParameterHistoricValuesPropertyDescriptor(object);
			addFirstPartParameterPropertyDescriptor(object);
			addFirstPartParameterHistoricValuesPropertyDescriptor(object);
			addSecondPartParameterPropertyDescriptor(object);
			addSecondPartParameterHistoricValuesPropertyDescriptor(object);
			addRecordingUsersNameParameterPropertyDescriptor(object);
			addRecordingUsersNameParameterHistoricValuesPropertyDescriptor(object);
			addWwxDateResultPropertyDescriptor(object);
			addTitleOfTalkResultPropertyDescriptor(object);
			addSpeakersNameResultPropertyDescriptor(object);
			addFirstPartResultPropertyDescriptor(object);
			addSecondPartResultPropertyDescriptor(object);
			addRecordingUsersNameResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Wwx Date Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWwxDateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_wwxDateParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_wwxDateParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER,
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
				 getString("_UI_MEnterWwxInformationStep_titleOfTalkParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_titleOfTalkParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER,
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
				 getString("_UI_MEnterWwxInformationStep_speakersNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_speakersNameParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER,
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
				 getString("_UI_MEnterWwxInformationStep_speakersNameParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_speakersNameParameterHistoricValues_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Part Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPartParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_firstPartParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_firstPartParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Part Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPartParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_firstPartParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_firstPartParameterHistoricValues_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Part Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPartParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_secondPartParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_secondPartParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Part Parameter Historic Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPartParameterHistoricValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_secondPartParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_secondPartParameterHistoricValues_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES,
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
				 getString("_UI_MEnterWwxInformationStep_recordingUsersNameParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_recordingUsersNameParameter_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER,
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
				 getString("_UI_MEnterWwxInformationStep_recordingUsersNameParameterHistoricValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_recordingUsersNameParameterHistoricValues_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wwx Date Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWwxDateResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_wwxDateResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_wwxDateResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT,
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
				 getString("_UI_MEnterWwxInformationStep_titleOfTalkResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_titleOfTalkResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT,
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
				 getString("_UI_MEnterWwxInformationStep_speakersNameResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_speakersNameResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Part Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPartResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_firstPartResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_firstPartResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Part Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPartResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MEnterWwxInformationStep_secondPartResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_secondPartResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT,
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
				 getString("_UI_MEnterWwxInformationStep_recordingUsersNameResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MEnterWwxInformationStep_recordingUsersNameResult_feature", "_UI_MEnterWwxInformationStep_type"),
				 LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT,
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
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
			childrenFeatures.add(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT);
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
	 * This returns MEnterWwxInformationStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MEnterWwxInformationStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MEnterWwxInformationStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MEnterWwxInformationStep_type") :
			getString("_UI_MEnterWwxInformationStep_type") + " " + label;
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

		switch (notification.getFeatureID(MEnterWwxInformationStep.class)) {
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT:
			case LogicPackage.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT:
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
				(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT,
				 LogicFactory.eINSTANCE.createMResult()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT,
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
			childFeature == LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT ||
			childFeature == LogicPackage.Literals.MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
