/*
 * Revision History
 * $Log: MValueItemProvider.java,v $
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
import org.onceforall.dms.desktop.logic.MValue;

/**
 * This is the item provider adapter for a {@link org.onceforall.dms.desktop.logic.MValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MValueItemProvider
	extends MElementItemProvider
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
	public MValueItemProvider(AdapterFactory adapterFactory) {
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

			addMInputValuesPropertyDescriptor(object);
			addValueForUIPropertyDescriptor(object);
			addHistoricValuesForUIPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MInput Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMInputValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MValue_mInputValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MValue_mInputValues_feature", "_UI_MValue_type"),
				 LogicPackage.Literals.MVALUE__MINPUT_VALUES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value For UI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueForUIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MValue_valueForUI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MValue_valueForUI_feature", "_UI_MValue_type"),
				 LogicPackage.Literals.MVALUE__VALUE_FOR_UI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Historic Values For UI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoricValuesForUIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MValue_historicValuesForUI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MValue_historicValuesForUI_feature", "_UI_MValue_type"),
				 LogicPackage.Literals.MVALUE__HISTORIC_VALUES_FOR_UI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MValue_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MValue_readOnly_feature", "_UI_MValue_type"),
				 LogicPackage.Literals.MVALUE__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LogicPackage.Literals.MVALUE__MINPUT_VALUES);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MValue)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MValue_type") :
			getString("_UI_MValue_type") + " " + label;
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

		switch (notification.getFeatureID(MValue.class)) {
			case LogicPackage.MVALUE__VALUE_FOR_UI:
			case LogicPackage.MVALUE__VALUE:
			case LogicPackage.MVALUE__HISTORIC_VALUES:
			case LogicPackage.MVALUE__HISTORIC_VALUES_FOR_UI:
			case LogicPackage.MVALUE__READ_ONLY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(LogicPackage.Literals.MVALUE__MINPUT_VALUES,
				 LogicFactory.eINSTANCE.createMParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MVALUE__MINPUT_VALUES,
				 LogicFactory.eINSTANCE.createMProperty()));

		newChildDescriptors.add
			(createChildParameter
				(LogicPackage.Literals.MVALUE__MINPUT_VALUES,
				 LogicFactory.eINSTANCE.createMResult()));
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
