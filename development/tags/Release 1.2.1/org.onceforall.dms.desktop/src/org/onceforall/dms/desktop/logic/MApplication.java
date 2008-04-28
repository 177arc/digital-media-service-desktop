/*
 * Revision History:
 * $Log: MApplication.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:26  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.ReadException;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMDataFileProperty <em>MData File Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getDataFileProperty <em>Data File Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getInfoWebPageProperty <em>Info Web Page Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMInfoWebPageProperty <em>MInfo Web Page Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getDataFilePropertyHistoricValues <em>Data File Property Historic Values</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMLogFileProperty <em>MLog File Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getLogFileProperty <em>Log File Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMPathProperty <em>MPath Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getPathProperty <em>Path Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMVersionProperty <em>MVersion Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getVersionProperty <em>Version Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getMLastSaveProperty <em>MLast Save Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MApplication#getLastSaveProperty <em>Last Save Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='Application' name='Digital Media Service Desktop' description='Represents the whole application.' compositeClassName='org.onceforall.dms.desktop.ui.MApplicationComposite' iconFilePath='Image Files\\Application.gif'"
 * @generated
 */
public abstract class MApplication extends MObject {
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "Application";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MApplication.class.getName();

	/** Specifies a user-friendly representation of the name of this Java class. This name is 
     * intended for use in UI messages. */
	public static final String CLASS_NAME_FOR_UI = "Application";
    
    /** Specifies the state that the application is in while strating up. */
    public static final int START_UP_STATE = 0;
   
    /** Specifies the state that the application is in while operating. */
    public static final int OPERATING_STATE = 1;
    
    /** Specifies the state that the application is in while loading data. */
    public static final int LOADING_STATE = 2;
    
    /** Specifies the state that the application is in while saving data. */
    public static final int SAVING_STATE = 3;
    
    /** Specifies the state of the application. */
    public static int state = START_UP_STATE;
    
    /** Specifies the resource that is assoicated with this application. It is used for loading and saving the application data. */
    private static Resource resource;
    
    /** Specifies the resource set that is assoicated with this application. It is used for loading and saving the application data. */
    private static ResourceSet resourceSet;
   
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007, Marc Maier";

	/**
     * Adds a value type for this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	static {
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MApplication.TYPE_NAME, new ReferenceType("Reference to "+MApplication.TYPE_NAME, "Specifies a reference to a "+MApplication.TYPE_NAME_FOR_UI, MApplication.class));
	}




















































	/**
	 * The cached value of the '{@link #getMDataFileProperty() <em>MData File Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDataFileProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mDataFileProperty = null;

	/**
	 * The default value of the '{@link #getDataFileProperty() <em>Data File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileProperty()
	 * @generated
	 * @ordered
	 */
	protected static final File DATA_FILE_PROPERTY_EDEFAULT = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMExistingFile(), "Application Data Files\\Data.xml");
	
	/**
	 * Get the default value of the '{@link #getDataFileProperty() <em>Data File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDataFileProperty() <em>Data File Property</em>}' attribute.
	 * @see #getDataFileProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDataFileProperty() {
		return DATA_FILE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getDataFileProperty() <em>Data File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileProperty()
	 * @generated
	 * @ordered
	 */
	protected File dataFileProperty = DATA_FILE_PROPERTY_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getInfoWebPageProperty() <em>Info Web Page Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoWebPageProperty()
	 * @generated
	 * @ordered
	 */
	protected static final URL INFO_WEB_PAGE_PROPERTY_EDEFAULT = (URL)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMUrl(), "http://www.onceforall.org/dms-desktop/info.html");

	/**
	 * Get the default value of the '{@link #getInfoWebPageProperty() <em>Info Web Page Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getInfoWebPageProperty() <em>Info Web Page Property</em>}' attribute.
	 * @see #getInfoWebPageProperty()
	 * @generated
	 * @ordered
	 */
	public URL getDefaultInfoWebPageProperty() {
		return INFO_WEB_PAGE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getInfoWebPageProperty() <em>Info Web Page Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoWebPageProperty()
	 * @generated
	 * @ordered
	 */
	protected URL infoWebPageProperty = INFO_WEB_PAGE_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMInfoWebPageProperty() <em>MInfo Web Page Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInfoWebPageProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mInfoWebPageProperty = null;

	/**
	 * The cached value of the '{@link #getDataFilePropertyHistoricValues() <em>Data File Property Historic Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFilePropertyHistoricValues()
	 * @generated
	 * @ordered
	 */
	protected EList dataFilePropertyHistoricValues = null;

	/**
	 * The cached value of the '{@link #getMLogFileProperty() <em>MLog File Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLogFileProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLogFileProperty = null;

	/**
	 * The default value of the '{@link #getLogFileProperty() <em>Log File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileProperty()
	 * @ordered
	 */
	protected static final File LOG_FILE_PROPERTY_EDEFAULT = new File(Logger.getLogger().getLogFileName());
	
	/**
	 * Get the default value of the '{@link #getLogFileProperty() <em>Log File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLogFileProperty() <em>Log File Property</em>}' attribute.
	 * @see #getLogFileProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultLogFileProperty() {
		return LOG_FILE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLogFileProperty() <em>Log File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileProperty()
	 * @generated
	 * @ordered
	 */
	protected File logFileProperty = LOG_FILE_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMPathProperty() <em>MPath Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPathProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mPathProperty = null;

	/**
	 * The default value of the '{@link #getPathProperty() <em>Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathProperty()
	 * @ordered
	 */
	protected static final File PATH_PROPERTY_EDEFAULT = new File(System.getProperty("user.dir"));
	
	/**
	 * Get the default value of the '{@link #getPathProperty() <em>Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getPathProperty() <em>Path Property</em>}' attribute.
	 * @see #getPathProperty()
	 * @generated
	 * @ordered
	 */
	public File getDefaultPathProperty() {
		return PATH_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getPathProperty() <em>Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathProperty()
	 * @generated
	 * @ordered
	 */
	protected File pathProperty = PATH_PROPERTY_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getMVersionProperty() <em>MVersion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVersionProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mVersionProperty = null;

	/**
	 * The default value of the '{@link #getVersionProperty() <em>Version Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_PROPERTY_EDEFAULT = "0.9.0";

	/**
	 * Get the default value of the '{@link #getVersionProperty() <em>Version Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getVersionProperty() <em>Version Property</em>}' attribute.
	 * @see #getVersionProperty()
	 * @generated
	 * @ordered
	 */
	public String getDefaultVersionProperty() {
		return VERSION_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getVersionProperty() <em>Version Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionProperty()
	 * @generated
	 * @ordered
	 */
	protected String versionProperty = VERSION_PROPERTY_EDEFAULT;

	
	/**
	 * The cached value of the '{@link #getMLastSaveProperty() <em>MLast Save Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLastSaveProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLastSaveProperty = null;

	/**
	 * The default value of the '{@link #getLastSaveProperty() <em>Last Save Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaveProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SAVE_PROPERTY_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getLastSaveProperty() <em>Last Save Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLastSaveProperty() <em>Last Save Property</em>}' attribute.
	 * @see #getLastSaveProperty()
	 * @generated
	 * @ordered
	 */
	public Date getDefaultLastSaveProperty() {
		return LAST_SAVE_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLastSaveProperty() <em>Last Save Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaveProperty()
	 * @generated
	 * @ordered
	 */
	protected Date lastSaveProperty = LAST_SAVE_PROPERTY_EDEFAULT;
	
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
		return "org.onceforall.dms.desktop.ui.MApplicationComposite";
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
		return "Application";
	}

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
		return "Represents the whole application.";
	}

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
		return "Digital Media Service Desktop";
	}

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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Application.gif");
	}
	/** Specifies whether any managed values have been changed and therefore the application has to be saved. */
	protected static boolean isDirty;
	
	/** Specifies the only instance of the managed application. */
	private static MApplication instance;
	
	/**
	 * Gets the only instance of the managed application. It loads the application data if this method is accessed
	 * for the fist time. For this it uses the default application data file.
	 * 
	 * @return Returns the managed application instance.
	 */
	public static MApplication getInstance() {
		if(instance == null)
			instance = loadFromXML(DATA_FILE);
		
		return instance;
	}
	
	/**
	 * Resets all state information associated with the instance.
	 * This method should only be used for testing purposes.
	 */
	public static void clearInstance() {
		resource = null;
		instance = null;
	}
	
	/**
	 * Loads the application data from the given application file 
	 * and updates the instance variable accordingly.
	 * 
     * @param dataFile Specifies the application data file.
	 * @return Returns the managed application instance.
	 */
	public static MApplication loadInstance(File dataFile) {
		instance = loadFromXML(dataFile);		
		return instance;
	}
	
	/**
	 * Upgrades the application data from the given input stream
	 * and updates the instance variable accordingly. It assumes that the application
	 * data is loaded from a remote source and there has to be saved locally.
	 * 
	 * @param dataFileUri Specifies the URI of the data file.
     * @param inputStream Specifies the input stream to read the XMI data from.
	 */
	public static void upgradeInstance(URI dataFileUri, InputStream inputStream) {
		instance = loadFromXML(null, dataFileUri, inputStream);
		isDirty = true;	// Makes sure that the loaded application data is saved locally.
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MApplication() {
		super();
		
		firstMApplicationConstructorHook();
				
		compositeClassName = "org.onceforall.dms.desktop.ui.MApplicationComposite";
		typeNameForUI = "Application";
		description = "Represents the whole application.";
		name = "Digital Media Service Desktop";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Application.gif");
					 
		setMDataFileProperty(new MProperty(true, "Data file", "Specifies the file that contains the application data.", null));			 
		setMInfoWebPageProperty(new MProperty(true, "Information web page URL", "Specifies the URL of a web page that provides up-to-date information that is relevant to the users of this application.", null));			 
		setMLogFileProperty(new MProperty(false, "Log file", "Specifies the file that contains the log data.", null));			 
		setMPathProperty(new MProperty(false, "Path", "Specifies the path where this application has been started from.", null));			 
		setMVersionProperty(new MProperty(false, "Version", "Specifies the version of the application.", null));			 
		setMLastSaveProperty(new MProperty(true, "Last application data save", "Specifies the date and time when the application data was last saved.", null));

		lastMApplicationConstructorHook();		
	}
	
		/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMApplicationConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
		/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMApplicationConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/** Specifies the file that contains the application data */
    public static final File DATA_FILE = DATA_FILE_PROPERTY_EDEFAULT;
    
    /** Specifies the application path. */
    public static final File PATH = PATH_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MAPPLICATION;
	}

	/**
	 * Returns the value of the '<em><b>MData File Property</b></em>' containment reference.
	 * The default value is <code>"new MDataFileProperty()"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MData File Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MData File Property</em>' containment reference.
	 * @see #setMDataFileProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MDataFileProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Data file' description='Specifies the file that contains the application data.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMDataFileProperty() {
		return mDataFileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDataFileProperty(MProperty newMDataFileProperty, NotificationChain msgs) {
		MProperty oldMDataFileProperty = mDataFileProperty;
		mDataFileProperty = newMDataFileProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY, oldMDataFileProperty, newMDataFileProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMDataFileProperty <em>MData File Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMDataFileProperty the new value of the '<em>MData File Property</em>' containment reference.
	 * @see #getMDataFileProperty()
	 * @generated
	 */
	public void setMDataFileProperty(MProperty newMDataFileProperty) {
		if (newMDataFileProperty != mDataFileProperty) {
			NotificationChain msgs = null;
			if (mDataFileProperty != null)
				msgs = ((InternalEObject)mDataFileProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY, null, msgs);
			if (newMDataFileProperty != null) {				
				newMDataFileProperty.setDefaultName("Data file");
				newMDataFileProperty.setDefaultDescription("Specifies the file that contains the application data.");
				newMDataFileProperty.setValueType(Type.getTypeForName("File (must exist)"));
				newMDataFileProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY));
				newMDataFileProperty.setHistoricValuesEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES));
				msgs = ((InternalEObject)newMDataFileProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDataFileProperty != null) {
				if(newMDataFileProperty != null)
					newMDataFileProperty.eAdapters().addAll(mDataFileProperty.eAdapters());			
			
				mDataFileProperty.eAdapters().clear();
			}
			msgs = basicSetMDataFileProperty(newMDataFileProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY, newMDataFileProperty, newMDataFileProperty));
	}

	/**
	 * Returns the value of the '<em><b>Data File Property</b></em>' attribute.
	 * The default value is <code>"Application Data Files\\Data.xml"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Property</em>' attribute.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_DataFileProperty()
	 * @model default="Application Data Files\\Data.xml" dataType="org.onceforall.dms.desktop.logic.MExistingFile" required="true" transient="true" changeable="false"
	 * @generated
	 */
	public File getDataFileProperty() {
		return dataFileProperty;
	}

	/**
	 * Returns the value of the '<em><b>Info Web Page Property</b></em>' attribute.
	 * The default value is <code>"http://www.onceforall.org/dms-desktop/info.html"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Web Page Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Web Page Property</em>' attribute.
	 * @see #setInfoWebPageProperty(URL)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_InfoWebPageProperty()
	 * @model default="http://www.onceforall.org/dms-desktop/info.html" dataType="org.onceforall.dms.desktop.logic.MUrl" required="true" transient="true"
	 * @generated
	 */
	public URL getInfoWebPageProperty() {
		return infoWebPageProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getInfoWebPageProperty <em>Info Web Page Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newInfoWebPageProperty the new value of the '<em>Info Web Page Property</em>' attribute.
	 * @see #getInfoWebPageProperty()
	 * @generated
	 */
	public void setInfoWebPageProperty(URL newInfoWebPageProperty) {
		URL oldInfoWebPageProperty = infoWebPageProperty;
		infoWebPageProperty = newInfoWebPageProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY, oldInfoWebPageProperty, infoWebPageProperty));
	}

	/**
	 * Returns the value of the '<em><b>MInfo Web Page Property</b></em>' containment reference.
	 * The default value is <code>"new MInfoWebPageProperty()"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MInfo Web Page Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInfo Web Page Property</em>' containment reference.
	 * @see #setMInfoWebPageProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MInfoWebPageProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Information web page URL' description='Specifies the URL of a web page that provides up-to-date information that is relevant to the users of this application.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMInfoWebPageProperty() {
		return mInfoWebPageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMInfoWebPageProperty(MProperty newMInfoWebPageProperty, NotificationChain msgs) {
		MProperty oldMInfoWebPageProperty = mInfoWebPageProperty;
		mInfoWebPageProperty = newMInfoWebPageProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY, oldMInfoWebPageProperty, newMInfoWebPageProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMInfoWebPageProperty <em>MInfo Web Page Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMInfoWebPageProperty the new value of the '<em>MInfo Web Page Property</em>' containment reference.
	 * @see #getMInfoWebPageProperty()
	 * @generated
	 */
	public void setMInfoWebPageProperty(MProperty newMInfoWebPageProperty) {
		if (newMInfoWebPageProperty != mInfoWebPageProperty) {
			NotificationChain msgs = null;
			if (mInfoWebPageProperty != null)
				msgs = ((InternalEObject)mInfoWebPageProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY, null, msgs);
			if (newMInfoWebPageProperty != null) {				
				newMInfoWebPageProperty.setDefaultName("Information web page URL");
				newMInfoWebPageProperty.setDefaultDescription("Specifies the URL of a web page that provides up-to-date information that is relevant to the users of this application.");
				newMInfoWebPageProperty.setValueType(Type.getTypeForName("URL"));
				newMInfoWebPageProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY));
				newMInfoWebPageProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMInfoWebPageProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mInfoWebPageProperty != null) {
				if(newMInfoWebPageProperty != null)
					newMInfoWebPageProperty.eAdapters().addAll(mInfoWebPageProperty.eAdapters());			
			
				mInfoWebPageProperty.eAdapters().clear();
			}
			msgs = basicSetMInfoWebPageProperty(newMInfoWebPageProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY, newMInfoWebPageProperty, newMInfoWebPageProperty));
	}

	/**
	 * Returns the value of the '<em><b>Data File Property Historic Values</b></em>' attribute list.
	 * The list contents are of type {@link java.io.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File Property Historic Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Property Historic Values</em>' attribute list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_DataFilePropertyHistoricValues()
	 * @model type="java.io.File" dataType="org.onceforall.dms.desktop.logic.MFile" upper="5" ordered="false"
	 * @generated
	 */
	public EList getDataFilePropertyHistoricValues() {
		if (dataFilePropertyHistoricValues == null) {
			dataFilePropertyHistoricValues = new EDataTypeUniqueEList(File.class, this, LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES);
		}
		return dataFilePropertyHistoricValues;
	}

	/**
	 * Returns the value of the '<em><b>MLog File Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLog File Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLog File Property</em>' containment reference.
	 * @see #setMLogFileProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MLogFileProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Log file' description='Specifies the file that contains the log data.'"
	 * @generated
	 */
	public MProperty getMLogFileProperty() {
		return mLogFileProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLogFileProperty(MProperty newMLogFileProperty, NotificationChain msgs) {
		MProperty oldMLogFileProperty = mLogFileProperty;
		mLogFileProperty = newMLogFileProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY, oldMLogFileProperty, newMLogFileProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMLogFileProperty <em>MLog File Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMLogFileProperty the new value of the '<em>MLog File Property</em>' containment reference.
	 * @see #getMLogFileProperty()
	 * @generated
	 */
	public void setMLogFileProperty(MProperty newMLogFileProperty) {
		if (newMLogFileProperty != mLogFileProperty) {
			NotificationChain msgs = null;
			if (mLogFileProperty != null)
				msgs = ((InternalEObject)mLogFileProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY, null, msgs);
			if (newMLogFileProperty != null) {				
				newMLogFileProperty.setDefaultDescription("Specifies the file that contains the log data.");
				newMLogFileProperty.setDefaultName("Log file");
				newMLogFileProperty.setValueType(Type.getTypeForName("File"));
				newMLogFileProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY));
				newMLogFileProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLogFileProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLogFileProperty != null) {
				if(newMLogFileProperty != null)
					newMLogFileProperty.eAdapters().addAll(mLogFileProperty.eAdapters());			
			
				mLogFileProperty.eAdapters().clear();
			}
			msgs = basicSetMLogFileProperty(newMLogFileProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY, newMLogFileProperty, newMLogFileProperty));
	}

	/**
	 * Returns the value of the '<em><b>Log File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log File Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Property</em>' attribute.
	 * @see #setLogFileProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_LogFileProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MFile" required="true"
	 * @generated
	 */
	public File getLogFileProperty() {
		return logFileProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getLogFileProperty <em>Log File Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLogFileProperty the new value of the '<em>Log File Property</em>' attribute.
	 * @see #getLogFileProperty()
	 * @generated
	 */
	public void setLogFileProperty(File newLogFileProperty) {
		File oldLogFileProperty = logFileProperty;
		logFileProperty = newLogFileProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY, oldLogFileProperty, logFileProperty));
	}

	/**
	 * Returns the value of the '<em><b>MPath Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPath Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPath Property</em>' containment reference.
	 * @see #setMPathProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MPathProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Path' description='Specifies the path where this application has been started from.'"
	 * @generated
	 */
	public MProperty getMPathProperty() {
		return mPathProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPathProperty(MProperty newMPathProperty, NotificationChain msgs) {
		MProperty oldMPathProperty = mPathProperty;
		mPathProperty = newMPathProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MPATH_PROPERTY, oldMPathProperty, newMPathProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMPathProperty <em>MPath Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMPathProperty the new value of the '<em>MPath Property</em>' containment reference.
	 * @see #getMPathProperty()
	 * @generated
	 */
	public void setMPathProperty(MProperty newMPathProperty) {
		if (newMPathProperty != mPathProperty) {
			NotificationChain msgs = null;
			if (mPathProperty != null)
				msgs = ((InternalEObject)mPathProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MPATH_PROPERTY, null, msgs);
			if (newMPathProperty != null) {				
				newMPathProperty.setDefaultDescription("Specifies the path where this application has been started from.");
				newMPathProperty.setDefaultName("Path");
				newMPathProperty.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMPathProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__PATH_PROPERTY));
				newMPathProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMPathProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MPATH_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mPathProperty != null) {
				if(newMPathProperty != null)
					newMPathProperty.eAdapters().addAll(mPathProperty.eAdapters());			
			
				mPathProperty.eAdapters().clear();
			}
			msgs = basicSetMPathProperty(newMPathProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MPATH_PROPERTY, newMPathProperty, newMPathProperty));
	}

	/**
	 * Returns the value of the '<em><b>Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Property</em>' attribute.
	 * @see #setPathProperty(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_PathProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getPathProperty() {
		return pathProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getPathProperty <em>Path Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPathProperty the new value of the '<em>Path Property</em>' attribute.
	 * @see #getPathProperty()
	 * @generated
	 */
	public void setPathProperty(File newPathProperty) {
		File oldPathProperty = pathProperty;
		pathProperty = newPathProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__PATH_PROPERTY, oldPathProperty, pathProperty));
	}

	/**
	 * Returns the value of the '<em><b>MVersion Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MVersion Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVersion Property</em>' containment reference.
	 * @see #setMVersionProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MVersionProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Version' description='Specifies the version of the application.'"
	 * @generated
	 */
	public MProperty getMVersionProperty() {
		return mVersionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMVersionProperty(MProperty newMVersionProperty, NotificationChain msgs) {
		MProperty oldMVersionProperty = mVersionProperty;
		mVersionProperty = newMVersionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MVERSION_PROPERTY, oldMVersionProperty, newMVersionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMVersionProperty <em>MVersion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMVersionProperty the new value of the '<em>MVersion Property</em>' containment reference.
	 * @see #getMVersionProperty()
	 * @generated
	 */
	public void setMVersionProperty(MProperty newMVersionProperty) {
		if (newMVersionProperty != mVersionProperty) {
			NotificationChain msgs = null;
			if (mVersionProperty != null)
				msgs = ((InternalEObject)mVersionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MVERSION_PROPERTY, null, msgs);
			if (newMVersionProperty != null) {				
				newMVersionProperty.setDefaultDescription("Specifies the version of the application.");
				newMVersionProperty.setDefaultName("Version");
				newMVersionProperty.setValueType(Type.getTypeForName("Text"));
				newMVersionProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__VERSION_PROPERTY));
				newMVersionProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMVersionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MVERSION_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mVersionProperty != null) {
				if(newMVersionProperty != null)
					newMVersionProperty.eAdapters().addAll(mVersionProperty.eAdapters());			
			
				mVersionProperty.eAdapters().clear();
			}
			msgs = basicSetMVersionProperty(newMVersionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MVERSION_PROPERTY, newMVersionProperty, newMVersionProperty));
	}

	/**
	 * Returns the value of the '<em><b>Version Property</b></em>' attribute.
	 * The default value is <code>"0.9.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Property</em>' attribute.
	 * @see #setVersionProperty(String)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_VersionProperty()
	 * @model default="0.9.0" dataType="org.onceforall.dms.desktop.logic.MString" required="true"
	 * @generated
	 */
	public String getVersionProperty() {
		return versionProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getVersionProperty <em>Version Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVersionProperty the new value of the '<em>Version Property</em>' attribute.
	 * @see #getVersionProperty()
	 * @generated
	 */
	public void setVersionProperty(String newVersionProperty) {
		String oldVersionProperty = versionProperty;
		versionProperty = newVersionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__VERSION_PROPERTY, oldVersionProperty, versionProperty));
	}

	/**
	 * Returns the value of the '<em><b>MLast Save Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLast Save Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLast Save Property</em>' containment reference.
	 * @see #setMLastSaveProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_MLastSaveProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Last application data save' description='Specifies the date and time when the application data was last saved.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMLastSaveProperty() {
		return mLastSaveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLastSaveProperty(MProperty newMLastSaveProperty, NotificationChain msgs) {
		MProperty oldMLastSaveProperty = mLastSaveProperty;
		mLastSaveProperty = newMLastSaveProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY, oldMLastSaveProperty, newMLastSaveProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getMLastSaveProperty <em>MLast Save Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMLastSaveProperty the new value of the '<em>MLast Save Property</em>' containment reference.
	 * @see #getMLastSaveProperty()
	 * @generated
	 */
	public void setMLastSaveProperty(MProperty newMLastSaveProperty) {
		if (newMLastSaveProperty != mLastSaveProperty) {
			NotificationChain msgs = null;
			if (mLastSaveProperty != null)
				msgs = ((InternalEObject)mLastSaveProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY, null, msgs);
			if (newMLastSaveProperty != null) {				
				newMLastSaveProperty.setDefaultName("Last application data save");
				newMLastSaveProperty.setDefaultDescription("Specifies the date and time when the application data was last saved.");
				newMLastSaveProperty.setValueType(Type.getTypeForName("Date and time"));
				newMLastSaveProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY));
				newMLastSaveProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLastSaveProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLastSaveProperty != null) {
				if(newMLastSaveProperty != null)
					newMLastSaveProperty.eAdapters().addAll(mLastSaveProperty.eAdapters());			
			
				mLastSaveProperty.eAdapters().clear();
			}
			msgs = basicSetMLastSaveProperty(newMLastSaveProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY, newMLastSaveProperty, newMLastSaveProperty));
	}

	/**
	 * Returns the value of the '<em><b>Last Save Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Save Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Save Property</em>' attribute.
	 * @see #setLastSaveProperty(Date)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication_LastSaveProperty()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDateTime" transient="true"
	 * @generated
	 */
	public Date getLastSaveProperty() {
		return lastSaveProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MApplication#getLastSaveProperty <em>Last Save Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newLastSaveProperty the new value of the '<em>Last Save Property</em>' attribute.
	 * @see #getLastSaveProperty()
	 * @generated
	 */
	public void setLastSaveProperty(Date newLastSaveProperty) {
		Date oldLastSaveProperty = lastSaveProperty;
		lastSaveProperty = newLastSaveProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY, oldLastSaveProperty, lastSaveProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:
				return basicSetMDataFileProperty(null, msgs);
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:
				return basicSetMInfoWebPageProperty(null, msgs);
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:
				return basicSetMLogFileProperty(null, msgs);
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:
				return basicSetMPathProperty(null, msgs);
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:
				return basicSetMVersionProperty(null, msgs);
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:
				return basicSetMLastSaveProperty(null, msgs);
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
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:
				return getMDataFileProperty();
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY:
				return getDataFileProperty();
			case LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY:
				return getInfoWebPageProperty();
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:
				return getMInfoWebPageProperty();
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES:
				return getDataFilePropertyHistoricValues();
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:
				return getMLogFileProperty();
			case LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY:
				return getLogFileProperty();
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:
				return getMPathProperty();
			case LogicPackage.MAPPLICATION__PATH_PROPERTY:
				return getPathProperty();
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:
				return getMVersionProperty();
			case LogicPackage.MAPPLICATION__VERSION_PROPERTY:
				return getVersionProperty();
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:
				return getMLastSaveProperty();
			case LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY:
				return getLastSaveProperty();
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
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:    
				setMDataFileProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY:    
				setInfoWebPageProperty((URL)newValue);
				return;
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:    
				setMInfoWebPageProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES:
				getDataFilePropertyHistoricValues().clear();
				getDataFilePropertyHistoricValues().addAll((Collection)newValue);
				return;
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:    
				setMLogFileProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY:    
				setLogFileProperty((File)newValue);
				return;
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:    
				setMPathProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__PATH_PROPERTY:    
				setPathProperty((File)newValue);
				return;
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:    
				setMVersionProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__VERSION_PROPERTY:    
				setVersionProperty((String)newValue);
				return;
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:    
				setMLastSaveProperty((MProperty)newValue);
				return;
			case LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY:    
				setLastSaveProperty((Date)newValue);
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
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:
				setMDataFileProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY:
				setInfoWebPageProperty(getDefaultInfoWebPageProperty());
				return;
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:
				setMInfoWebPageProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES:
				getDataFilePropertyHistoricValues().clear();
				return;
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:
				setMLogFileProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY:
				setLogFileProperty(getDefaultLogFileProperty());
				return;
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:
				setMPathProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__PATH_PROPERTY:
				setPathProperty(getDefaultPathProperty());
				return;
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:
				setMVersionProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__VERSION_PROPERTY:
				setVersionProperty(getDefaultVersionProperty());
				return;
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:
				setMLastSaveProperty((MProperty)null);
				return;
			case LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY:
				setLastSaveProperty(getDefaultLastSaveProperty());
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
			case LogicPackage.MAPPLICATION__MDATA_FILE_PROPERTY:
				return mDataFileProperty != null;
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY:
				return getDefaultDataFileProperty() == null ? dataFileProperty != null : !getDefaultDataFileProperty().equals(dataFileProperty);
			case LogicPackage.MAPPLICATION__INFO_WEB_PAGE_PROPERTY:
				return getDefaultInfoWebPageProperty() == null ? infoWebPageProperty != null : !getDefaultInfoWebPageProperty().equals(infoWebPageProperty);
			case LogicPackage.MAPPLICATION__MINFO_WEB_PAGE_PROPERTY:
				return mInfoWebPageProperty != null;
			case LogicPackage.MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES:
				return dataFilePropertyHistoricValues != null && !dataFilePropertyHistoricValues.isEmpty();
			case LogicPackage.MAPPLICATION__MLOG_FILE_PROPERTY:
				return mLogFileProperty != null;
			case LogicPackage.MAPPLICATION__LOG_FILE_PROPERTY:
				return getDefaultLogFileProperty() == null ? logFileProperty != null : !getDefaultLogFileProperty().equals(logFileProperty);
			case LogicPackage.MAPPLICATION__MPATH_PROPERTY:
				return mPathProperty != null;
			case LogicPackage.MAPPLICATION__PATH_PROPERTY:
				return getDefaultPathProperty() == null ? pathProperty != null : !getDefaultPathProperty().equals(pathProperty);
			case LogicPackage.MAPPLICATION__MVERSION_PROPERTY:
				return mVersionProperty != null;
			case LogicPackage.MAPPLICATION__VERSION_PROPERTY:
				return getDefaultVersionProperty() == null ? versionProperty != null : !getDefaultVersionProperty().equals(versionProperty);
			case LogicPackage.MAPPLICATION__MLAST_SAVE_PROPERTY:
				return mLastSaveProperty != null;
			case LogicPackage.MAPPLICATION__LAST_SAVE_PROPERTY:
				return getDefaultLastSaveProperty() == null ? lastSaveProperty != null : !getDefaultLastSaveProperty().equals(lastSaveProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataFileProperty: ");
		result.append(dataFileProperty);
		result.append(", infoWebPageProperty: ");
		result.append(infoWebPageProperty);
		result.append(", dataFilePropertyHistoricValues: ");
		result.append(dataFilePropertyHistoricValues);
		result.append(", logFileProperty: ");
		result.append(logFileProperty);
		result.append(", pathProperty: ");
		result.append(pathProperty);
		result.append(", versionProperty: ");
		result.append(versionProperty);
		result.append(", lastSaveProperty: ");
		result.append(lastSaveProperty);
		result.append(')');
		return result.toString();
	}

    /**
     * Loads the application data from an XMI input stream. 
     * 
     * @param dataFile Specifies the application data file. This parameter is ignored if the data file URI parameter is specified.
	 * @param dataFileUri Specifies the URI of the data file.
     * @param inputStream Specifies the input stream to read the XMI data from. If this parameter is specifies then the data will be loaded from the input stream instead from the data file URI.
     * @return Returns the application data.
     * @throws ReadException Thrown if the application data cannot be completely loaded.
     */
    protected static synchronized MApplication loadFromXML(File dataFile, URI dataFileUri, InputStream inputStream) throws ReadException {
        state = LOADING_STATE;
        
        Resource resource = getResource(dataFile, dataFileUri);
        if(dataFile == null || dataFile.exists()) {
        	String dataFileForUi = dataFile == null ? dataFileUri.toString() : dataFile.getAbsolutePath();
        	try {
        		if(inputStream != null)
        			resource.load(inputStream, Collections.EMPTY_MAP);
        		else
        			resource.load(Collections.EMPTY_MAP);
        	} catch (IOException exception) {
				if(exception.getCause() == null || !(exception.getCause() instanceof UnresolvedReferenceException) && !(exception.getCause() instanceof FeatureNotFoundException))
					throw new ReadException("The application could not read the application data from '"+dataFileForUi+"' because its content is not in correct XML format.", "Please make sure the content is correctly formatted.", DesktopException.CRITICAL_SEVERITY, exception);
				else
	        		Logger.getLogger().log(Level.WARNING, "The application could not resolve some references in the application data file '"+dataFileForUi+"'.", exception.getCause());
			}
        	
        	if(resource.getContents().size() < 1) {
        		Logger.getLogger().log(Level.WARNING, "The file '"+dataFileForUi+"' does not contain any application data.");
        		resource.getContents().add(new MDmsApplication()); // TODO: Remove upward dependency.
        	}
        	
        	Object object = resource.getContents().get(0);
        	if(!(object instanceof MApplication)) {
                throw new ReadException("The application data in file '"+dataFileForUi+"' is not valid. The root of the application data must be a managed application object.", "Please correct the application data file or delete it to start with an empty application.", DesktopException.CRITICAL_SEVERITY, null);       		
        	}
        	
        	Logger.getLogger().log(Level.INFO, "Loaded application data from '"+dataFileForUi+"'.");
        }
        else
        	resource.getContents().add(new MDmsApplication());

        
        isDirty = false;
        
        state = OPERATING_STATE;

		
		MApplication mApplication = (MApplication) resource.getContents().get(0);		
		// TODO: Removed this code. 
        // Makes sure that the sender's email address is not loaded. This is a temporary workaround because
		// the application loads this property if it is present in the XML file although it is now transient.
		TreeIterator iteractor = mApplication.eAllContents();
		while(iteractor.hasNext()) {
			Object object = iteractor.next();
			if(object instanceof MEmailEventLogStep)
				((MEmailEventLogStep) object).setSendersEmailAddressParameter(null);
		}
		
		
		mApplication.setLastSaveProperty(new Date(DATA_FILE.lastModified()));
       
    	Logger.getLogger().log(Level.INFO, "Running DMS Desktop version "+mApplication.getVersionProperty()+".");		
		
        return mApplication;
    }

    /**
     * Loads the application data from an XMI file. 
     * 
     * @param dataFile Specifies the application data file.
     * @return Returns the application data.
     * @throws ReadException Thrown if the application data cannot be completely loaded.
     */
    private static synchronized MApplication loadFromXML(File dataFile) throws ReadException {
    	return loadFromXML(dataFile, null, null);
    }
    
    /**
     * Saves the application data to an XML file.
     */
    public synchronized void saveToXML() {
    	// Doesn't save if nothing has changed.
    	if(!isDirty)
    		return;

    	// TODO: This is a quick fix. We need to make sure that only one instance of the application can
    	// be started so that this situation will never occur.
    	Date lastSave = getLastSaveProperty();
    	if(lastSave != null && DATA_FILE.exists() && DATA_FILE.lastModified() > lastSave.getTime()) {
			throw new DesktopException("The application has detected a conflict. Please read the following explanation carefully and make sure that you understand it:  Another instance of this application has saved its data to '"
					+DATA_FILE.getAbsolutePath()+"' at '"+Type.DATE_TIME_TYPE.getValueForUI(new Date(DATA_FILE.lastModified()))+"', "
					+"after this application last saved its data at "+getMLastSaveProperty().getValueForUI()+". The data of this instance of the application has not been saved because it would override the data changes of the other instance. "
					+"This problem has occurred because at least two instances of this application are running although only one instance should be running at any one point in time.", 
					"If you want to keep the data of this application instance, go to '"+getNameForUI()+"' and change the '"+getMLastSaveProperty().getNameForUI()+"' property to the current time. Please note that need to hold down the Ctrl key change it because this property is read-only. "
					+"If you want to keep the data of the other application instances, just close this instance and acknowledge any further error.", DesktopException.CRITICAL_SEVERITY, null);
    	}
    	
    	try {
    		getResource().getContents().set(0, instance); // Makes sure that always the last loaded managed application instance is saved.
			getResource().save(Collections.EMPTY_MAP);
			setLastSaveProperty(new Date());
			isDirty = false;
		} catch (IOException exception) {
			throw new DesktopException("The application could not write the application data to the file '"+DATA_FILE.getAbsolutePath()+"'.", "Please make sure that application data file is writeable, has the appropriate rights and is not used by a different application.", DesktopException.CRITICAL_SEVERITY, exception);
		}
    }
    
    /**
     * Gets the resource that contains the data of the managed application. For this 
     * it uses the default application data file.
     * 
     * @return Returns the resource that contains the data of the managed application.
     */
    static public Resource getResource() {
    	//return getResource(DATA_FILE);
    	return resource;
    }
    
    /**
     * Gets the resource that contains the data of the managed application.
     * 
     * @param dataFile Specifies the application data file. This parameter is ignored if the dataFileUri parameter is specified.
	 * @param dataFileUri Specifies the URI of the data file.
     * @return Returns the resource that contains the data of the managed application.
     */
    static private Resource getResource(File dataFile, URI dataFileUri) {
		if(resourceSet == null)
			resourceSet = new ResourceSetImpl();

        // Registers the default resource factory.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
        Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Gets the URI of the model file.
        if(dataFileUri == null)
        	dataFileUri = URI.createFileURI(dataFile.getAbsolutePath());

        // Creates a resource for this file.
        Resource result = resourceSet.createResource(dataFileUri);
    	if(resource == null)
    		resource = result;
        
        // Registers the model package.
        @SuppressWarnings("unused")
		LogicPackage modelPackage = LogicPackage.eINSTANCE;
    	
    	return result;
    }

	/**
	 * Gets whether any managed values have been changed and therefore the application has to be saved.
	 *
	 * @return Returns whether any managed values have been changed and therefore the application has to be saved.
	 */
	public boolean isDirty() {
		return isDirty;
	}
} // MApplication