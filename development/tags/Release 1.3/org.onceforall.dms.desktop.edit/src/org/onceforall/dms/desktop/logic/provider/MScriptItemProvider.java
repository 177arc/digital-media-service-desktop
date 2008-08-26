/*
 * Revision History
 * $Log: MScriptItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MScript;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MScript} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MScriptItemProvider
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
	public MScriptItemProvider(AdapterFactory adapterFactory) {
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
			addProgressPropertyPropertyDescriptor(object);
			addProgressStatusPropertyPropertyDescriptor(object);
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
				 getString("_UI_MScript_stateProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MScript_stateProperty_feature", "_UI_MScript_type"),
				 LogicPackage.Literals.MSCRIPT__STATE_PROPERTY,
				 true,
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
				 getString("_UI_MScript_progressProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MScript_progressProperty_feature", "_UI_MScript_type"),
				 LogicPackage.Literals.MSCRIPT__PROGRESS_PROPERTY,
				 true,
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
				 getString("_UI_MScript_progressStatusProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MScript_progressStatusProperty_feature", "_UI_MScript_type"),
				 LogicPackage.Literals.MSCRIPT__PROGRESS_STATUS_PROPERTY,
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
			childrenFeatures.add(LogicPackage.Literals.MSCRIPT__MSTEPS);
			childrenFeatures.add(LogicPackage.Literals.MSCRIPT__MPROGRESS_PROPERTY);
			childrenFeatures.add(LogicPackage.Literals.MSCRIPT__MPROGRESS_STATUS_PROPERTY);
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
	 * This returns MScript.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MScript"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MScript)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MScript_type") :
			getString("_UI_MScript_type") + " " + label;
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

		switch (notification.getFeatureID(MScript.class)) {
			case LogicPackage.MSCRIPT__STATE_PROPERTY:
			case LogicPackage.MSCRIPT__PROGRESS_PROPERTY:
			case LogicPackage.MSCRIPT__PROGRESS_STATUS_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicPackage.MSCRIPT__MSTEPS:
			case LogicPackage.MSCRIPT__MPROGRESS_PROPERTY:
			case LogicPackage.MSCRIPT__MPROGRESS_STATUS_PROPERTY:
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
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMEnterWwxInformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMEnterServiceInformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMCreateDirectoryStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMCheckFreeDiskSpaceStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMCheckInputLevelsStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMRecordStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMConvertToMP3Step()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMUpdatePublishedMp3sStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMPublishNewMp3Step()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMEmailEventLogStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMBurnCdStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMNameTagMp3Step()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMDmsApplicationMGetDataUpgradeInfoStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MSTEPS,
				 LogicFactory.eINSTANCE.createMDmsApplicationMUpgradeDataStep()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MPROGRESS_PROPERTY,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MSCRIPT__MPROGRESS_STATUS_PROPERTY,
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
			childFeature == LogicPackage.Literals.MSCRIPT__MPROGRESS_PROPERTY ||
			childFeature == LogicPackage.Literals.MSCRIPT__MPROGRESS_STATUS_PROPERTY;

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
