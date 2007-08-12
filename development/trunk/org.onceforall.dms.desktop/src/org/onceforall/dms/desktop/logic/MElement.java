/*
 * Revision History:
 * $Log: MElement.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;
import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getName <em>Name</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getTypeNameForUI <em>Type Name For UI</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getNameForUI <em>Name For UI</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getDescriptionForUI <em>Description For UI</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getIconFilePath <em>Icon File Path</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getOverlayIconFilePath <em>Overlay Icon File Path</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#getCompositeClassName <em>Composite Class Name</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MElement#isSimulated <em>Simulated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement()
 * @model kind="class" abstract="true"
 * @extends ThreadAdapter
 * @generated
 */
public abstract class MElement extends EObjectImpl implements ThreadAdapter {
	/**
	 * Specifies the character that separates managed object names in a path
	 * expression.
	 */
	public static final char PATH_SEPARATOR = '\\';

	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MElement.class.getName();
	
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static final String TYPE_NAME_FOR_UI = "Elemet";

	/**
	 * Specifies an empty class array that is for calls to the Java reflection
	 * API to determine whether the <code>firstConstructorHook</code> or
	 * <code>lastConstructorHook</code> methods are defined in specific class. It is
	 * defined here for efficency purposes so it do not have to be created
	 * everytime, the reflective API is called.
	 */
	protected static final Class[] PARAMETER_TYPES = new Class[] {};

	/**
	 * Specifices the target from which the adapter will receive notifications.
	 * This variable is set by a notifier when this adapter is added to or
	 * removed from its adapter list. In general, an adapter may be shared by
	 * more than one notifier.
	 */
	protected Notifier target;

	/**
	 * Specifies the number of times that this managed element has been
	 * activated.
	 * 
	 * @see #activate()
	 * @see #deactivate()
	 */
	protected int activatedCount;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MElement.TYPE_NAME, new ReferenceType("Reference to "+MElement.TYPE_NAME, "Specifies a reference to a "+MElement.TYPE_NAME_FOR_UI, MElement.class));
	}




































































	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * Get the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultName() {
		return NAME_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * Get the default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultTypeName() {
		return TYPE_NAME_EDEFAULT;
	}
	
	/**
	 * The default value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_FOR_UI_EDEFAULT = null;
	
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
		return TYPE_NAME_FOR_UI_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getTypeNameForUI() <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeNameForUI()
	 * @generated
	 * @ordered
	 */
	protected String typeNameForUI = TYPE_NAME_FOR_UI_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getNameForUI() <em>Name For UI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNameForUI()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FOR_UI_EDEFAULT = "";

	/**
	 * Get the default value of the '{@link #getNameForUI() <em>Name For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getNameForUI() <em>Name For UI</em>}' attribute.
	 * @see #getNameForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultNameForUI() {
		return NAME_FOR_UI_EDEFAULT;
	}
	
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";
	
	/**
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescription() {
		return DESCRIPTION_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getDescriptionForUI() <em>Description For UI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescriptionForUI()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_FOR_UI_EDEFAULT = "";

	/**
	 * Get the default value of the '{@link #getDescriptionForUI() <em>Description For UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescriptionForUI() <em>Description For UI</em>}' attribute.
	 * @see #getDescriptionForUI()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescriptionForUI() {
		return DESCRIPTION_FOR_UI_EDEFAULT;
	}
	
	/**
	 * The default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final File ICON_FILE_PATH_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultIconFilePath() {
		return ICON_FILE_PATH_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getIconFilePath() <em>Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected File iconFilePath = ICON_FILE_PATH_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getOverlayIconFilePath() <em>Overlay Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverlayIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final File OVERLAY_ICON_FILE_PATH_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getOverlayIconFilePath() <em>Overlay Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getOverlayIconFilePath() <em>Overlay Icon File Path</em>}' attribute.
	 * @see #getOverlayIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultOverlayIconFilePath() {
		return OVERLAY_ICON_FILE_PATH_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getOverlayIconFilePath() <em>Overlay Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOverlayIconFilePath()
	 * @generated
	 * @ordered
	 */
	protected File overlayIconFilePath = OVERLAY_ICON_FILE_PATH_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITE_CLASS_NAME_EDEFAULT = "";
	
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
		return COMPOSITE_CLASS_NAME_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCompositeClassName()
	 * @generated
	 * @ordered
	 */
	protected String compositeClassName = COMPOSITE_CLASS_NAME_EDEFAULT;
	
	/**
	 * The default value of the '{@link #isSimulated() <em>Simulated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSimulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMULATED_EDEFAULT = false;
	
	/**
	 * Get the default value of the '{@link #isSimulated() <em>Simulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isSimulated() <em>Simulated</em>}' attribute.
	 * @see #isSimulated()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultSimulated() {
		return SIMULATED_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #isSimulated() <em>Simulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulated()
	 * @generated
	 * @ordered
	 */
	protected boolean simulated = SIMULATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompositeClassName() <em>Composite Class Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCompositeClassName()
	 * @ordered
	 */
	protected static final Class COMPOSITE_CLASS_EDEFAULT = null;

	/**
	 * Specifies the path expression of this managed element. It consist of the
	 * name of this element and all the names of its (direct or indirect)
	 * parents. For example:
	 * <code>Digial Media Service Desktop/Sermon MP3s</code>.
	 */
	protected String path;

	/**
	 * Specifies a user-friendly representation of the path expression of this
	 * managed element. It consist of the name of this element and all the names
	 * of its (direct or indirect) parents. For example:
	 * <code>Digial Media Service Desktop/Sermon MP3s</code>.
	 */
	protected String pathForUI;

	/**
	 * 
	 * /** <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected MElement() {
		super();

		firstMElementConstructorHook();
		name = Utilities.getNameFromClassName(getClass().getSimpleName());
		lastMElementConstructorHook();
	}

	/**
	 * Executes after the <code>super()</code> call of the generated
	 * constructor but before all generated constructor code.
	 * 
	 * @generated
	 */
	private void firstMElementConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * 
	 * @generated
	 */
	private void lastMElementConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MELEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_Name()
	 * @model default="" dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MELEMENT__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_TypeName()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString"
	 *        required="true" transient="true" changeable="false"
	 *        volatile="true" derived="true"
	 */
	public String getTypeName() {
		return TYPE_NAME;
	}

	/**
	 * Returns the value of the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name For UI</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name For UI</em>' attribute.
	 * @see #setTypeNameForUI(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_TypeNameForUI()
	 * @model dataType="org.onceforall.dms.desktop.logic.MString" required="true" transient="true"
	 * @generated
	 */
	public String getTypeNameForUI() {
		return typeNameForUI;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MElement#getTypeNameForUI <em>Type Name For UI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param newTypeNameForUI the new value of the '<em>Type Name For UI</em>' attribute.
	 * @see #getTypeNameForUI()
	 * @generated
	 */
	public void setTypeNameForUI(String newTypeNameForUI) {
		String oldTypeNameForUI = typeNameForUI;
		typeNameForUI = newTypeNameForUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MELEMENT__TYPE_NAME_FOR_UI, oldTypeNameForUI, typeNameForUI));
	}

	/**
	 * Returns the value of the '<em><b>Name For UI</b></em>' attribute.
	 * The default value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name For UI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name For UI</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_NameForUI()
	 * @model default="" required="true" transient="true" changeable="false"
	 *        volatile="true" derived="true"
	 */
	public String getNameForUI() {
		return getName();
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_Description()
	 * @model default="" dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param newDescription the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Description For UI</b></em>'
	 * attribute. The default value is <code>""</code>. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Description For UI</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description For UI</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_DescriptionForUI()
	 * @model default="" required="true" transient="true" changeable="false"
	 *        volatile="true" derived="true"
	 */
	public String getDescriptionForUI() {
		return getDescription();
	}

	/**
	 * Returns the value of the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon File Path</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon File Path</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_IconFilePath()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" transient="true" changeable="false"
	 * @generated
	 */
	public File getIconFilePath() {
		return iconFilePath;
	}

	/**
	 * Returns the value of the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Icon File Path</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Icon File Path</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_OverlayIconFilePath()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" transient="true" changeable="false"
	 * @generated
	 */
	public File getOverlayIconFilePath() {
		return overlayIconFilePath;
	}

	/**
	 * Returns the value of the '<em><b>Composite Class Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Composite Class Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Class Name</em>' attribute.
	 * @see #setCompositeClassName(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_CompositeClassName()
	 * @model default="" transient="true"
	 * @generated
	 */
	public String getCompositeClassName() {
		return compositeClassName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MElement#getCompositeClassName <em>Composite Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param newCompositeClassName the new value of the '<em>Composite Class Name</em>' attribute.
	 * @see #getCompositeClassName()
	 * @generated
	 */
	public void setCompositeClassName(String newCompositeClassName) {
		String oldCompositeClassName = compositeClassName;
		compositeClassName = newCompositeClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MELEMENT__COMPOSITE_CLASS_NAME, oldCompositeClassName, compositeClassName));
	}

	/**
	 * Returns the value of the '<em><b>Simulated</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Simulated</em>' attribute.
	 * @see #setSimulated(boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement_Simulated()
	 * @model required="true"
	 * @generated
	 */
	public boolean isSimulated() {
		return simulated;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MElement#isSimulated <em>Simulated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param newSimulated the new value of the '<em>Simulated</em>' attribute.
	 * @see #isSimulated()
	 * @generated
	 */
	public void setSimulated(boolean newSimulated) {
		boolean oldSimulated = simulated;
		simulated = newSimulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MELEMENT__SIMULATED, oldSimulated, simulated));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" diagnosticsChainRequired="true" contextRequired="true"
	 * @generated
	 */
	public boolean validate(DiagnosticChain diagnosticsChain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnosticsChain != null) {
				diagnosticsChain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 LogicValidator.DIAGNOSTIC_SOURCE,
						 LogicValidator.MELEMENT__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MELEMENT__NAME:
				return getName();
			case LogicPackage.MELEMENT__TYPE_NAME:
				return getTypeName();
			case LogicPackage.MELEMENT__TYPE_NAME_FOR_UI:
				return getTypeNameForUI();
			case LogicPackage.MELEMENT__NAME_FOR_UI:
				return getNameForUI();
			case LogicPackage.MELEMENT__DESCRIPTION:
				return getDescription();
			case LogicPackage.MELEMENT__DESCRIPTION_FOR_UI:
				return getDescriptionForUI();
			case LogicPackage.MELEMENT__ICON_FILE_PATH:
				return getIconFilePath();
			case LogicPackage.MELEMENT__OVERLAY_ICON_FILE_PATH:
				return getOverlayIconFilePath();
			case LogicPackage.MELEMENT__COMPOSITE_CLASS_NAME:
				return getCompositeClassName();
			case LogicPackage.MELEMENT__SIMULATED:
				return isSimulated() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MELEMENT__NAME:
				setName((String)newValue);
				return;
			case LogicPackage.MELEMENT__TYPE_NAME_FOR_UI:
				setTypeNameForUI((String)newValue);
				return;
			case LogicPackage.MELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogicPackage.MELEMENT__COMPOSITE_CLASS_NAME:
				setCompositeClassName((String)newValue);
				return;
			case LogicPackage.MELEMENT__SIMULATED:
				setSimulated(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MELEMENT__NAME:
				setName(getDefaultName());
				return;
			case LogicPackage.MELEMENT__TYPE_NAME_FOR_UI:
				setTypeNameForUI(getDefaultTypeNameForUI());
				return;
			case LogicPackage.MELEMENT__DESCRIPTION:
				setDescription(getDefaultDescription());
				return;
			case LogicPackage.MELEMENT__COMPOSITE_CLASS_NAME:
				setCompositeClassName(getDefaultCompositeClassName());
				return;
			case LogicPackage.MELEMENT__SIMULATED:
				setSimulated(getDefaultSimulated());
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicPackage.MELEMENT__NAME:
				return getDefaultName() == null ? name != null : !getDefaultName().equals(name);
			case LogicPackage.MELEMENT__TYPE_NAME:
				return getDefaultTypeName() == null ? getTypeName() != null : !getDefaultTypeName().equals(getTypeName());
			case LogicPackage.MELEMENT__TYPE_NAME_FOR_UI:
				return getDefaultTypeNameForUI() == null ? typeNameForUI != null : !getDefaultTypeNameForUI().equals(typeNameForUI);
			case LogicPackage.MELEMENT__NAME_FOR_UI:
				return getDefaultNameForUI() == null ? getNameForUI() != null : !getDefaultNameForUI().equals(getNameForUI());
			case LogicPackage.MELEMENT__DESCRIPTION:
				return getDefaultDescription() == null ? description != null : !getDefaultDescription().equals(description);
			case LogicPackage.MELEMENT__DESCRIPTION_FOR_UI:
				return getDefaultDescriptionForUI() == null ? getDescriptionForUI() != null : !getDefaultDescriptionForUI().equals(getDescriptionForUI());
			case LogicPackage.MELEMENT__ICON_FILE_PATH:
				return getDefaultIconFilePath() == null ? iconFilePath != null : !getDefaultIconFilePath().equals(iconFilePath);
			case LogicPackage.MELEMENT__OVERLAY_ICON_FILE_PATH:
				return getDefaultOverlayIconFilePath() == null ? overlayIconFilePath != null : !getDefaultOverlayIconFilePath().equals(overlayIconFilePath);
			case LogicPackage.MELEMENT__COMPOSITE_CLASS_NAME:
				return getDefaultCompositeClassName() == null ? compositeClassName != null : !getDefaultCompositeClassName().equals(compositeClassName);
			case LogicPackage.MELEMENT__SIMULATED:
				return simulated != getDefaultSimulated();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", typeNameForUI: ");
		result.append(typeNameForUI);
		result.append(", description: ");
		result.append(description);
		result.append(", iconFilePath: ");
		result.append(iconFilePath);
		result.append(", overlayIconFilePath: ");
		result.append(overlayIconFilePath);
		result.append(", compositeClassName: ");
		result.append(compositeClassName);
		result.append(", simulated: ");
		result.append(simulated);
		result.append(')');
		return result.toString();
	}

	/**
	 * Gets the contained/referenced managed element that is an instance of the
	 * given class or a subclass and has the given name.
	 * 
	 * @param mElementClass Specifies the class that the managed element must
	 *            conform to. It acts as a filter for on the list of contained
	 *            EMF objects.
	 * @param mName Specifies the name of the managed element.
	 * @return Returns the contained/referenced managed element that is an
	 *         instance of the given class or a subclass and has the given name.
	 *         It returns <code>null</code> if no such managed element exists.
	 */
	public MElement getReferencedMElement(Class mElementClass, String mName) {
		assert mElementClass != null : "The parameter 'mElementClass' cannot be empty.";
		assert MElement.class.isAssignableFrom(mElementClass) : "The parameter 'mElementClass' must be the MElement class or a subclass.";
		assert mName != null : "The parameter 'mName' cannot be empty.";

		Iterator<MElement> iterator = eContents().iterator();
		while (iterator.hasNext()) {
			MElement mElement = iterator.next();
			if (mElementClass.isAssignableFrom(mElement.getClass()) && mElement.getName().equals(mName))
				return mElement;
		}

		return null;
	}

	/**
	 * Gets the contained/referenced managed elements that are instances of the
	 * given class or a subclass.
	 * 
	 * @param mElementClass Specifies the class that the managed elements must
	 *            conform to. It acts as a filter for on the list of contained
	 *            EMF objects.
	 * @param eList Specifies the list to which the matching managed elements
	 *            should be added.
	 * @return Returns the contained/referenced managed elements that are
	 *         instances of the given class or a subclass.
	 */
	public EList getReferencedMElements(Class mElementClass, EList eList) {
		assert mElementClass != null : "The parameter 'mElementClass' cannot be empty.";
		assert MElement.class.isAssignableFrom(mElementClass) : "The parameter 'mElementClass' must be the MElement class or a subclass.";
		assert eList != null : "The parameter 'eList' cannot be empty.";

		Iterator<MElement> iterator = eContents().iterator();
		while (iterator.hasNext()) {
			MElement mElement = iterator.next();
			if (mElementClass.isAssignableFrom(mElement.getClass()))
				eList.add(mElement);
		}

		return eList;
	}

	/**
	 * Gets the contained/referenced EMF objects that are instances of the given
	 * class or a subclass.
	 * 
	 * @param eObjectClass Specifies the class that the EMF object must conform
	 *            to. It acts as a filter for on the list of contained EMF
	 *            objects.
	 * @return Returns the contained/referenced EMF objects that are instances
	 *         of the given class or a subclass.
	 */
	public EList getReferencedMElements(Class eObjectClass) {
		return getReferencedMElements(eObjectClass, new BasicEList(10));
	}

	/**
	 * Gets the root application object of the containment hierachry that this
	 * managed element belongs to.
	 * 
	 * @return Returns the root application object of the containment hierachry
	 *         that this managed element belongs to.
	 */
	public MApplication getMApplication() {
		MElement result = this;
		while (result.eContainer() != null)
			result = (MElement) result.eContainer();

		return (MApplication) result;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	public Notifier getTarget() {
		return target;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object object) {
		return object instanceof MElement;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	final public void notifyChanged(Notification notification) {
		processNotification(notification);
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	public void setTarget(Notifier target) {
		this.target = target;
	}

	/**
	 * @see org.onceforall.dms.desktop.notify.ThreadAdapter#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	public void processNotification(Notification notification) {
		// Does nothing by default.
	}

	/**
	 * @see org.onceforall.dms.desktop.notify.ThreadAdapter#triggerNotifications()
	 */
	public void triggerNotifications() {
		// Does nothing by default.
		/*
		 * ?synchronized(messageQueue) { while(messageQueue.size() > 0)
		 * processNotification(messageQueue.poll()); }
		 */
	}

	/**
	 * Gets the Ecore feature with the given name. This method searches through
	 * all Ecore features (including inherited ones) of the Ecore class that
	 * corresponds to this managed element.
	 * 
	 * @param eFeatureName Specifies the name of the Ecore features to search
	 *            for.
	 * @return Returns the Ecore feature with the given name. If it cannot find
	 *         such an features, it returns <code>null</code>.
	 */
	public EStructuralFeature getEFeatureForName(String eFeatureName) {
		List<EStructuralFeature> eFeatures = eContainer().eClass().getEAllStructuralFeatures();
		for (EStructuralFeature eFeature : eFeatures)
			if (eFeature.getName().equals(eFeatureName))
				return eFeature;

		return null;
	}

	/**
	 * Gets the ID of the feature that contains this managed element. This
	 * method assumes that the managed element has a containing feature. If not,
	 * it throws an <code>~NullPointerException</code>.
	 * 
	 * @return Returns the ID of the feature that contains this managed element.
	 */
	public int eContainingFeatureID() {
		return eContainingFeature().getFeatureID();
	}

	/**
	 * Activates this managed element. This method is called when this element
	 * is observed, i.e. has at least one adapter. Subclasses can override this
	 * method to provide specific implementation. Resource-intensive method
	 * should be executed here.
	 * 
	 * @see #deactivate()
	 */
	public void activate() {
		++activatedCount;
	}

	/**
	 * Deactivates this managed element. This method is called when this managed
	 * elemented is not observed anymore, i.e. does not have any adapters.
	 * Subclasses can override this method to provide specific implementation.
	 * Any resources that were opened in the {@link #deactivate()} method,
	 * should be freed here.
	 * 
	 * @see #activate()
	 */
	public void deactivate() {
		--activatedCount;
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#eInverseAdd(org.eclipse.emf.ecore.InternalEObject,
	 *      int, java.lang.Class,
	 *      org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		NotificationChain result = super.eInverseAdd(otherEnd, featureID, baseClass, msgs);

		// Updates the path expression.
		path = "";
		pathForUI = "";
		MElement mElement = (MElement) this;
		while (mElement != null) {
			path = mElement.getName() + path;
			pathForUI = mElement.getName() + pathForUI;
			if (mElement.eContainer() != null) {
				path = PATH_SEPARATOR + path;
				pathForUI = PATH_SEPARATOR + pathForUI;
			}

			mElement = (MElement) mElement.eContainer();
		}

		return result;
	}

	/**
	 * Gets the path expression of this managed element. It consist of the name
	 * of this element and all the names of its (direct or indirect) parents.
	 * For example: <code>Digial Media Service Desktop/Sermon MP3s</code>.
	 * 
	 * @return Returns the path expression of this managed element.
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Gets a user-friendly representation of the path expression of this
	 * managed element. It consist of the name of this element and all the names
	 * of its (direct or indirect) parents. For example:
	 * <code>Digial Media Service Desktop/Sermon MP3s</code>.
	 * 
	 * @return Returns a user-friendly representation of the path expression of
	 *         this managed element.
	 */
	public String getPathForUI() {
		return pathForUI;
	}

	/**
	 * Gets a "copy" of the value of the given ECore reference. It will only
	 * create a copy if the ECore reference is a containment reference.
	 * 
	 * @param eReference Specifies the Ecore reference that holds the value to
	 *            be copied.
	 * @param mElement Specifies the value to be copied.
	 * @return Returns a "copy" of the value of the given ECore reference.
	 */
	protected MElement getEReferenceCopy(EReference eReference, MElement mElement, Map<MElement, MElement> mElementCopiesByMElement, boolean isContainmentCopy) {
		if (mElement == null)
			return null;

		if(isContainmentCopy) {
			if(eReference.isContainment()) {
				return mElement.getContainmentCopies(mElementCopiesByMElement, isContainmentCopy);
			} else
				return null;
		}
		else {
			if(eReference.isContainment()) {
				return null;
			} else
				return mElementCopiesByMElement.get(mElement);	
		}
	}

	protected MElement getContainmentCopies(Map<MElement, MElement> mElementCopiesByMElement, boolean isContainmentCopy) {
		EClass eClass = eClass();
		EPackage ePackage = eClass.getEPackage();
		EFactory eFactory = ePackage.getEFactoryInstance();
		MElement result = (MElement) eFactory.create(eClass);

		mElementCopiesByMElement.put(this, result);

		// Copies all Ecore attributes.
		for (EAttribute eAttribute : (List<EAttribute>) eClass.getEAllAttributes()) {
			if (eAttribute.isChangeable() && !eAttribute.isDerived() && (eAttribute.isMany() || eIsSet(eAttribute))) {
				Object eAttributeValue = eGet(eAttribute);
				if (!eAttribute.isMany())
					result.eSet(eAttribute, eAttributeValue); // **
				else {
					List eAttributeListCopy = (List) result.eGet(eAttribute);
					if (FeatureMapUtil.isFeatureMap(eAttribute)) {
						FeatureMap featureMap = (FeatureMap) eAttributeListCopy;
						NEXT: for (FeatureMap.Entry entry : (List<FeatureMap.Entry>) eAttributeValue) {
							EStructuralFeature entryFeature = entry.getEStructuralFeature();
							if (entryFeature instanceof EAttribute)
								featureMap.add(entry);
							else {
								EReference eReference = (EReference) entryFeature;
								if (!eReference.isContainment())
									continue;

								EReference eReverseReference = eReference.getEOpposite();
								MElement entryValue = (MElement) entry.getValue();
								MElement mElementCopy = getEReferenceCopy(eReference, entryValue, mElementCopiesByMElement, isContainmentCopy);
								if(mElementCopy != null) {
									if (eReverseReference != null) {
										for (FeatureMap.Entry entryCopy : (List<FeatureMap.Entry>) featureMap) {
											if (entryCopy.getEStructuralFeature() == eReference && entryCopy.getValue() == mElementCopy) {
												featureMap.move(featureMap.size() - 1, entryCopy); // **
												continue NEXT;
											}
										}
									}

									featureMap.add(eReference, mElementCopy); // **
								}
							}
						}
					} else
						eAttributeListCopy.addAll((List) eAttributeValue); // **
				}
			}
		}

		// Copies all ECore references.
		for (EReference eReference : (List<EReference>) eClass().getEAllReferences()) {
			if (!eReference.isChangeable() || eReference.isDerived())
				continue;

			EReference eReverseReference = eReference.getEOpposite();

			Object value = eGet(eReference);
			if (value == null)
				continue;

			if (!eReference.isMany()) {
				MElement mElementCopy = getEReferenceCopy(eReference, (MElement) value, mElementCopiesByMElement, isContainmentCopy);
				if (mElementCopy != null)
					result.eSet(eReference, mElementCopy); // **
			} else {
				List<MObject> valueList = (List) value;
				if (!valueList.isEmpty()) {
					EList eReferenceListCopy = (EList) result.eGet(eReference);
					int index = 0;
					for (MElement mElement : valueList) {
						if (mElement == null)
							break;

						mElement = getEReferenceCopy(eReference, mElement, mElementCopiesByMElement, isContainmentCopy);

						if (eReverseReference != null) {
							int position = eReferenceListCopy.indexOf(mElement);
							if (position == -1)
								eReferenceListCopy.add(index, mElement); // **
							else
								eReferenceListCopy.move(index, mElement); // **
						} else
							eReferenceListCopy.add(mElement); // **
					}
				}
			}
		}

		return result;
	}

	/**
	 * Creates a deep copy of this managed element. It does not copy
	 * non-containment references.
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Map<MElement, MElement> mElementCopiesByMElement = new HashMap<MElement, MElement>();
		MElement mElementCopy = getContainmentCopies(mElementCopiesByMElement, true);
		getContainmentCopies(mElementCopiesByMElement, false);
		return mElementCopy;
	}

} // MElement
