/*
 * Revision History:
 * $Log: MObject.java,v $
 * Revision 1.4  2007/05/12 10:56:29  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MObject#getMNameProperty <em>MName Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MObject#getMDescriptionProperty <em>MDescription Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MObject#getMIconFilePathProperty <em>MIcon File Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MObject#getFixedMProperties <em>Fixed MProperties</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MObject#getFixedMSteps <em>Fixed MSteps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='Entry' compositeClassName='org.onceforall.dms.desktop.ui.MObjectComposite'"
 * @generated
 */
public class MObject extends MElement implements EObject, SubstitutionLabelProvider {

	/**
	 * Defines an Ecore list that does not notify its owner of changes.
	 * This list is used for derived list, e.g. the {@link MObject#fixedMProperties}.
	 * It also disables validation for efficency reasons.
	 *
	 * @author Marc
	 */
	protected static class SilentEcoreEList extends EcoreEList {
		/**
		 * @see org.eclipse.emf.ecore.util.EcoreEList#EcoreEList(Class, InternalEObject)
		 */
		public SilentEcoreEList(Class dataClass, InternalEObject owner) {
			super(dataClass, owner);
		}

		/**
		 * @see org.eclipse.emf.ecore.util.EcoreEList#validate(int, java.lang.Object)
		 */
		@Override
		protected Object validate(int index, Object object) {
			return object;
		}

		/**
		 * @see org.eclipse.emf.ecore.util.EcoreEList#isNotificationRequired()
		 */
		@Override
		protected boolean isNotificationRequired() {
			return false;
		}
	};

	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "Entry";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MObject.class.getName();

	/** Specifies a user-friendly representation of the name of this Java class. This name is 
     * intended for use in UI messages. */
	public static final String CLASS_NAME_FOR_UI = "Object";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MObject.TYPE_NAME, new ReferenceType("Reference to "+MObject.TYPE_NAME, "Specifies a reference to a "+MObject.TYPE_NAME_FOR_UI, MObject.class));
	}
	/**
	 * The cached value of the '{@link #getMNameProperty() <em>MName Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNameProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mNameProperty = null;

	/**
	 * The cached value of the '{@link #getMDescriptionProperty() <em>MDescription Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mDescriptionProperty = null;

	/**
	 * The cached value of the '{@link #getMIconFilePathProperty() <em>MIcon File Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIconFilePathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mIconFilePathProperty = null;

	/**
	 * Get the default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultCompositeClassName() {
		return "org.onceforall.dms.desktop.ui.MObjectComposite";
	}

	/**
	 * Get the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTypeNameForUI() {
		return "Entry";
	}
	/** Specifies the managed properties of this managed object that cannot be added or removed. 
	 * This list is compiled on demand and therefore you should use the {@link MObject#getFixedMProperties()} method to get them .*/
	protected EList fixedMProperties;

	/** Specifies the managed steps of this managed object that cannot be added or removed. 
	 * This list is compiled on demand and therefore you should use the {@link MObject#getFixedMSteps} method to get them .*/
	protected EList fixedMSteps;
	
	/** Specifies a map that maps the value ecore features to managed values. It is populated by the {@link MValue#eInverseAdd(InternalEObject, int, Class, NotificationChain)} method of MValue. */
	protected Map<EStructuralFeature, MValue> mValuesByValueEFeature = new HashMap<EStructuralFeature, MValue>();
	
	/** Specifies a map that maps the historic values ecore features to managed values. It is populated by the {@link MValue#eInverseAdd(InternalEObject, int, Class, NotificationChain)} method of MValue. */
	protected Map<EStructuralFeature, MValue> mValuesByHistoricValuesEFeature = new HashMap<EStructuralFeature, MValue>();
	
	/** Specifies the context for the validator. */
	protected Map validatorContext;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MObject() {
		super();
		
		firstMObjectConstructorHook();
				
		compositeClassName = "org.onceforall.dms.desktop.ui.MObjectComposite";
		typeNameForUI = "Entry";
					 
		setMNameProperty(new MProperty(false, "Name", "Specifies the name.", null));			 
		setMDescriptionProperty(new MProperty(false, "Description", "Specifies a detailed description.", null));			 
		setMIconFilePathProperty(new MProperty(true, "Icon file path", "Specifies the file path to the icon that represents this element.", null));

		lastMObjectConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMObjectConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 */
	private void lastMObjectConstructorHook() {
		validatorContext = new HashMap();
		validatorContext.put(SubstitutionLabelProvider.class, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MOBJECT;
	}

	/**
	 * Returns the value of the '<em><b>MName Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MName Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName Property</em>' containment reference.
	 * @see #setMNameProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject_MNameProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Name' description='Specifies the name.' valueEFeature='name'"
	 * @generated
	 */
	public MProperty getMNameProperty() {
		return mNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMNameProperty(MProperty newMNameProperty, NotificationChain msgs) {
		MProperty oldMNameProperty = mNameProperty;
		mNameProperty = newMNameProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MNAME_PROPERTY, oldMNameProperty, newMNameProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MObject#getMNameProperty <em>MName Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMNameProperty the new value of the '<em>MName Property</em>' containment reference.
	 * @see #getMNameProperty()
	 * @generated
	 */
	public void setMNameProperty(MProperty newMNameProperty) {
		if (newMNameProperty != mNameProperty) {
			NotificationChain msgs = null;
			if (mNameProperty != null)
				msgs = ((InternalEObject)mNameProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MNAME_PROPERTY, null, msgs);
			if (newMNameProperty != null) {				
				newMNameProperty.setDefaultName("Name");
				newMNameProperty.setDefaultDescription("Specifies the name.");
				newMNameProperty.setValueType(Type.getTypeForName("Text"));
				newMNameProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MOBJECT__NAME));
				newMNameProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMNameProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MNAME_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mNameProperty != null) {
				if(newMNameProperty != null)
					newMNameProperty.eAdapters().addAll(mNameProperty.eAdapters());			
			
				mNameProperty.eAdapters().clear();
			}
			msgs = basicSetMNameProperty(newMNameProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MNAME_PROPERTY, newMNameProperty, newMNameProperty));
	}

	/**
	 * Returns the value of the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDescription Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDescription Property</em>' containment reference.
	 * @see #setMDescriptionProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject_MDescriptionProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Description' description='Specifies a detailed description.' valueEFeature='description'"
	 * @generated
	 */
	public MProperty getMDescriptionProperty() {
		return mDescriptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDescriptionProperty(MProperty newMDescriptionProperty, NotificationChain msgs) {
		MProperty oldMDescriptionProperty = mDescriptionProperty;
		mDescriptionProperty = newMDescriptionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY, oldMDescriptionProperty, newMDescriptionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MObject#getMDescriptionProperty <em>MDescription Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMDescriptionProperty the new value of the '<em>MDescription Property</em>' containment reference.
	 * @see #getMDescriptionProperty()
	 * @generated
	 */
	public void setMDescriptionProperty(MProperty newMDescriptionProperty) {
		if (newMDescriptionProperty != mDescriptionProperty) {
			NotificationChain msgs = null;
			if (mDescriptionProperty != null)
				msgs = ((InternalEObject)mDescriptionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY, null, msgs);
			if (newMDescriptionProperty != null) {				
				newMDescriptionProperty.setDefaultName("Description");
				newMDescriptionProperty.setDefaultDescription("Specifies a detailed description.");
				newMDescriptionProperty.setValueType(Type.getTypeForName("Text"));
				newMDescriptionProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MOBJECT__DESCRIPTION));
				newMDescriptionProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDescriptionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDescriptionProperty != null) {
				if(newMDescriptionProperty != null)
					newMDescriptionProperty.eAdapters().addAll(mDescriptionProperty.eAdapters());			
			
				mDescriptionProperty.eAdapters().clear();
			}
			msgs = basicSetMDescriptionProperty(newMDescriptionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY, newMDescriptionProperty, newMDescriptionProperty));
	}

	/**
	 * Returns the value of the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MIcon File Path Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIcon File Path Property</em>' containment reference.
	 * @see #setMIconFilePathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject_MIconFilePathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Icon file path' description='Specifies the file path to the icon that represents this element.' readOnly='true' valueEFeature='iconFilePath'"
	 * @generated
	 */
	public MProperty getMIconFilePathProperty() {
		return mIconFilePathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMIconFilePathProperty(MProperty newMIconFilePathProperty, NotificationChain msgs) {
		MProperty oldMIconFilePathProperty = mIconFilePathProperty;
		mIconFilePathProperty = newMIconFilePathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY, oldMIconFilePathProperty, newMIconFilePathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MObject#getMIconFilePathProperty <em>MIcon File Path Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMIconFilePathProperty the new value of the '<em>MIcon File Path Property</em>' containment reference.
	 * @see #getMIconFilePathProperty()
	 * @generated
	 */
	public void setMIconFilePathProperty(MProperty newMIconFilePathProperty) {
		if (newMIconFilePathProperty != mIconFilePathProperty) {
			NotificationChain msgs = null;
			if (mIconFilePathProperty != null)
				msgs = ((InternalEObject)mIconFilePathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY, null, msgs);
			if (newMIconFilePathProperty != null) {				
				newMIconFilePathProperty.setDefaultDescription("Specifies the file path to the icon that represents this element.");
				newMIconFilePathProperty.setDefaultName("Icon file path");
				newMIconFilePathProperty.setValueType(Type.getTypeForName("File"));
				newMIconFilePathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MOBJECT__ICON_FILE_PATH));
				newMIconFilePathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMIconFilePathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mIconFilePathProperty != null) {
				if(newMIconFilePathProperty != null)
					newMIconFilePathProperty.eAdapters().addAll(mIconFilePathProperty.eAdapters());			
			
				mIconFilePathProperty.eAdapters().clear();
			}
			msgs = basicSetMIconFilePathProperty(newMIconFilePathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY, newMIconFilePathProperty, newMIconFilePathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Fixed MSteps</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFixed Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed MSteps</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject_FixedMSteps()
	 * @model type="org.onceforall.dms.desktop.logic.MStep" resolveProxies="false" transient="true" volatile="true" derived="true"
	 */
	public EList getFixedMSteps() {
		if(fixedMSteps == null)
			fixedMSteps = getReferencedMElements(MStep.class, new SilentEcoreEList(MStep.class, this));
		
		return fixedMSteps;
	}

	/**
	 * Returns the value of the '<em><b>MProperties</b></em>' reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProperties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProperties</em>' reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject_FixedMProperties()
	 * @model type="org.onceforall.dms.desktop.logic.MProperty" transient="true" volatile="true" derived="true"
	 */
	public EList getFixedMProperties() {
		if(fixedMProperties == null)
			fixedMProperties = getReferencedMElements(MProperty.class, new SilentEcoreEList(MProperty.class, this));
		
		return fixedMProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MOBJECT__MNAME_PROPERTY:
				return basicSetMNameProperty(null, msgs);
			case LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY:
				return basicSetMDescriptionProperty(null, msgs);
			case LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY:
				return basicSetMIconFilePathProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MOBJECT__MNAME_PROPERTY:
				return getMNameProperty();
			case LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY:
				return getMDescriptionProperty();
			case LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY:
				return getMIconFilePathProperty();
			case LogicPackage.MOBJECT__FIXED_MPROPERTIES:
				return getFixedMProperties();
			case LogicPackage.MOBJECT__FIXED_MSTEPS:
				return getFixedMSteps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MOBJECT__MNAME_PROPERTY:
				setMNameProperty((MProperty)newValue);
				return;
			case LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY:
				setMDescriptionProperty((MProperty)newValue);
				return;
			case LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY:
				setMIconFilePathProperty((MProperty)newValue);
				return;
			case LogicPackage.MOBJECT__FIXED_MPROPERTIES:
				getFixedMProperties().clear();
				getFixedMProperties().addAll((Collection)newValue);
				return;
			case LogicPackage.MOBJECT__FIXED_MSTEPS:
				getFixedMSteps().clear();
				getFixedMSteps().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MOBJECT__MNAME_PROPERTY:
				setMNameProperty((MProperty)null);
				return;
			case LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY:
				setMDescriptionProperty((MProperty)null);
				return;
			case LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY:
				setMIconFilePathProperty((MProperty)null);
				return;
			case LogicPackage.MOBJECT__FIXED_MPROPERTIES:
				getFixedMProperties().clear();
				return;
			case LogicPackage.MOBJECT__FIXED_MSTEPS:
				getFixedMSteps().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicPackage.MOBJECT__MNAME_PROPERTY:
				return mNameProperty != null;
			case LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY:
				return mDescriptionProperty != null;
			case LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY:
				return mIconFilePathProperty != null;
			case LogicPackage.MOBJECT__FIXED_MPROPERTIES:
				return !getFixedMProperties().isEmpty();
			case LogicPackage.MOBJECT__FIXED_MSTEPS:
				return !getFixedMSteps().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#getDescriptionForUI()
	 */
	@Override
	public String getDescriptionForUI() {
		return getMDescriptionProperty().getValueForUI();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#getNameForUI()
	 */
	@Override
	public String getNameForUI() {
		return getMNameProperty().getValueForUI();
	}
	
	/**
	 * Validates this managed object.
	 * 
	 * @return Returns the result of the validation.
	 */
	/*? public DiagnosticChain validate() {
		DiagnosticChain chain = new BasicDiagnostic();
		VALIDATOR.validate(this, chain);
		
		// Validates all managed properties of the managed object.
		List<MProperty> properties = getMProperties();
		for(MProperty property: properties)
			VALIDATOR.validate(property, chain);
		
		return chain;
	}*/
	
	
    /**
	 * @see DefaultMValueConverter#convertValueFromMInputValues(MValue)
     */
    protected Object convertMInputValues(MValue mOwnerValue) {
    	return DefaultMValueConverter.convertValueFromMInputValues(mOwnerValue);
    }

    /**
	 * @see SubstitutionLabelProvider#getFeatureLabel(EStructuralFeature)
     */
    public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		MValue mValue = mValuesByValueEFeature.get(eStructuralFeature);
	
		if(mValue == null)
			return eStructuralFeature.getName();
		
		return mValue.getNameForUI();
    }

    /**
	 * @see SubstitutionLabelProvider#getObjectLabel(EObject)
     */
	public String getObjectLabel(EObject eObject) {
		return ((MElement) eObject).getNameForUI();
	}

    /**
	 * @see SubstitutionLabelProvider#getValueLabel(EDataType, Object)
     */
	public String getValueLabel(EDataType eDataType, Object value) {
		Type valueType = Type.VALUE_TYPES_BY_CLASS_NAME.get(eDataType.getName());
		
		if(valueType == null)
			return EcoreUtil.convertToString(eDataType, value);
		
		return valueType.getValueForUI(value);
	}
	
	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#activate()
	 */
	@Override
	public void activate() {
		super.activate();
		
		for(MProperty mProperty: (List<MProperty>) getFixedMProperties())
			mProperty.activate();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MElement#deactivate()
	 */
	@Override
	public void deactivate() {
		for(MProperty mProperty: (List<MProperty>) getFixedMProperties())
			mProperty.deactivate();

		super.deactivate();
	}
	
	/**
	 * Determines whether the given notification represents change of a managed value.
	 * 
	 * @param notification Specifies the notification to examine.
	 * @return Returns whether the given notification represents change of a managed value.
	 */
	protected boolean hasMValueChanged(Notification notification) {
		return notification.getFeature() instanceof EStructuralFeature
			 && notification.getNewValue() != notification.getOldValue()
			 && (notification.getEventType() == Notification.SET
					|| notification.getEventType() == Notification.ADD 
					|| notification.getEventType() == Notification.ADD_MANY || notification.getEventType() == Notification.REMOVE 
					|| notification.getEventType() == Notification.REMOVE_MANY || notification.getEventType() == Notification.MOVE);
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification) {
		if(notification.getFeature() instanceof EStructuralFeature && !((EStructuralFeature) notification.getFeature()).isTransient() && hasMValueChanged(notification))
			MApplication.isDirty = true;
		
		super.eNotify(notification);
	}
	
	
	
} // MObject