/*
 * Revision History
 * $Log: MStepItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MStep;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MStepItemProvider
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
	public MStepItemProvider(AdapterFactory adapterFactory) {
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

			addMInputStepsPropertyDescriptor(object);
			addExclusivePropertyPropertyDescriptor(object);
			addStatePropertyPropertyDescriptor(object);
			addProgressPropertyPropertyDescriptor(object);
			addProgressStatusPropertyPropertyDescriptor(object);
			addStartTriggerPropertyPropertyDescriptor(object);
			addInterruptablePropertyDescriptor(object);
			addStoppablePropertyDescriptor(object);
			addTerminatablePropertyDescriptor(object);
			addActionNamePropertyDescriptor(object);
			addActionIconFilePathPropertyDescriptor(object);
			addExceptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MInput Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMInputStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_mInputSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_mInputSteps_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusivePropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_exclusiveProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_exclusiveProperty_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__EXCLUSIVE_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MStep_stateProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_stateProperty_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__STATE_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Progress Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgressPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_progressProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_progressProperty_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__PROGRESS_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Progress Status Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgressStatusPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_progressStatusProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_progressStatusProperty_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__PROGRESS_STATUS_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Trigger Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTriggerPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_startTriggerProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_startTriggerProperty_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__START_TRIGGER_PROPERTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interruptable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterruptablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_interruptable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_interruptable_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__INTERRUPTABLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stoppable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoppablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_stoppable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_stoppable_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__STOPPABLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_terminatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_terminatable_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__TERMINATABLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_actionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_actionName_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__ACTION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Icon File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionIconFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_actionIconFilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_actionIconFilePath_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__ACTION_ICON_FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MStep_exception_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MStep_exception_feature", "_UI_MStep_type"),
				 LogicPackage.Literals.MSTEP__EXCEPTION,
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
			childrenFeatures.add(LogicPackage.Literals.MSTEP__MINPUT_STEPS);
			childrenFeatures.add(LogicPackage.Literals.MSTEP__MPROGRESS_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MSTEP__MPROGRESS_STATUS_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MSTEP__MSTART_TRIGGER_PROPERTY);
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
		String label = ((MStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MStep_type") :
			getString("_UI_MStep_type") + " " + label;
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

		switch (notification.getFeatureID(MStep.class)) {
			case LogicPackage.MSTEP__EXCLUSIVE_PROPERTY:
			case LogicPackage.MSTEP__STATE_PROPERTY:
			case LogicPackage.MSTEP__PROGRESS_PROPERTY:
			case LogicPackage.MSTEP__PROGRESS_STATUS_PROPERTY:
			case LogicPackage.MSTEP__START_TRIGGER_PROPERTY:
			case LogicPackage.MSTEP__INTERRUPTABLE:
			case LogicPackage.MSTEP__STOPPABLE:
			case LogicPackage.MSTEP__TERMINATABLE:
			case LogicPackage.MSTEP__ACTION_NAME:
			case LogicPackage.MSTEP__ACTION_ICON_FILE_PATH:
			case LogicPackage.MSTEP__EXCEPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MSTEP__MPROGRESS_PROPERTY:
			case LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY:
			case LogicPackage.MSTEP__MSTART_TRIGGER_PROPERTY:
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
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMEnterWwxInformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMEnterServiceInformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMCreateDirectoryStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMCheckFreeDiskSpaceStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMCheckInputLevelsStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMRecordStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMConvertToMP3Step()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMUpdatePublishedMp3sStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMPublishNewMp3Step()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMEmailEventLogStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMBurnCdStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMDmsApplicationMGetDataUpgradeInfoStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSTEP__MINPUT_STEPS,
				 LogicFactory.eINSTANCE.createMDmsApplicationMUpgradeDataStep()));
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
