/*
 * Revision History:
 * $Log: MAudioStep.java,v $
 * Revision 1.4  2007/05/12 10:56:29  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:24  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:07  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:13  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:15  marc
 * First revision after rearchitecting.
 *
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.logging.Level;

import javax.sound.sampled.LineUnavailableException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.onceforall.dms.desktop.interfaces.AudioInterface;
import org.onceforall.dms.desktop.interfaces.MonitoredAudioInputStream;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * Defines a step in a script that monitors the input audio levels. For this, it uses
 * a monitored audio input stream.
 *
 * @see org.onceforall.dms.desktop.interfaces.MonitoredAudioInputStream
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputLevelProperty <em>MLeft Input Level Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputLevelProperty <em>Left Input Level Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputLevelProperty <em>MRight Input Level Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputLevelProperty <em>Right Input Level Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputDistortionProperty <em>MLeft Input Distortion Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputDistortionProperty <em>Left Input Distortion Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputDistortionProperty <em>MRight Input Distortion Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputDistortionProperty <em>Right Input Distortion Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMUseDbProperty <em>MUse Db Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getUseDbProperty <em>Use Db Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getMHeadroomProperty <em>MHeadroom Property</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MAudioStep#getHeadroomProperty <em>Headroom Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep()
 * @model kind="class" abstract="true"
 *        annotation="http://www.onceforall.org/mcore iconFilePath='Image Files/Audio step.gif' compositeClassName='org.onceforall.dms.desktop.ui.MAudioStepComposite' actionIconFilePath='Image Files/Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public abstract class MAudioStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MAudioStep.class.getName();

    /** Specifies the name of the property that specifies the current left input level. */
    public static final String LEFT_INPUT_LEVEL_PROPERTY = "Left input level";

    /** Specifies the name of the property that specifies the current right input level. */
    public static final String RIGHT_INPUT_LEVEL_PROPERTY = "Right input level";
    
    /** Specifies the name of the property that specifies whether the audio signal on the left channel is likely to be distorted. */
    public static final String LEFT_DISTORTION_ALERT_PROPERTY = "Left input distortion alert";
    
    /** Specifies the name of the property that specifies whether the audio signal on the right channel is likely to be distorted. */
    public static final String RIGHT_DISTORTION_ALERT_PROPERTY = "Right input distortion alert";
    
    /** Specifies the audio stream from which the sound will be read. */
    protected MonitoredAudioInputStream audioInputStream;
    
    /** Specifies the time when the input levels last changed in milliseconds. */
    protected long lastInputLevelsUpdate;
    
    /** Specifies the dynamic range in dBFS. */
    public static final float DYNAMIC_RANGE = (float) (20*Math.log10(MonitoredAudioInputStream.MAXIMUM_LEVEL));

    /** Specfies the minium level in dBFS. This is a negative number with 0dBFS being the maximum. */
    public static final float MINIMUM_LEVEL = -50;
    
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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MAudioStep.TYPE_NAME, new ReferenceType("Reference to "+MAudioStep.TYPE_NAME, "Specifies a reference to a "+MAudioStep.TYPE_NAME_FOR_UI, MAudioStep.class));
	}
	/**
	 * The cached value of the '{@link #getMLeftInputLevelProperty() <em>MLeft Input Level Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLeftInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLeftInputLevelProperty = null;

	/**
	 * The default value of the '{@link #getLeftInputLevelProperty() <em>Left Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Long LEFT_INPUT_LEVEL_PROPERTY_EDEFAULT = new Long(0L);

	/**
	 * Get the default value of the '{@link #getLeftInputLevelProperty() <em>Left Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLeftInputLevelProperty() <em>Left Input Level Property</em>}' attribute.
	 * @see #getLeftInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultLeftInputLevelProperty() {
		return LEFT_INPUT_LEVEL_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLeftInputLevelProperty() <em>Left Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected Long leftInputLevelProperty = LEFT_INPUT_LEVEL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRightInputLevelProperty() <em>MRight Input Level Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRightInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mRightInputLevelProperty = null;

	/**
	 * The default value of the '{@link #getRightInputLevelProperty() <em>Right Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Long RIGHT_INPUT_LEVEL_PROPERTY_EDEFAULT = new Long(0L);

	/**
	 * Get the default value of the '{@link #getRightInputLevelProperty() <em>Right Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRightInputLevelProperty() <em>Right Input Level Property</em>}' attribute.
	 * @see #getRightInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultRightInputLevelProperty() {
		return RIGHT_INPUT_LEVEL_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRightInputLevelProperty() <em>Right Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInputLevelProperty()
	 * @generated
	 * @ordered
	 */
	protected Long rightInputLevelProperty = RIGHT_INPUT_LEVEL_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMLeftInputDistortionProperty() <em>MLeft Input Distortion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLeftInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mLeftInputDistortionProperty = null;

	/**
	 * The default value of the '{@link #getLeftInputDistortionProperty() <em>Left Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LEFT_INPUT_DISTORTION_PROPERTY_EDEFAULT = Boolean.FALSE;

	/**
	 * Get the default value of the '{@link #getLeftInputDistortionProperty() <em>Left Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getLeftInputDistortionProperty() <em>Left Input Distortion Property</em>}' attribute.
	 * @see #getLeftInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultLeftInputDistortionProperty() {
		return LEFT_INPUT_DISTORTION_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getLeftInputDistortionProperty() <em>Left Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected Boolean leftInputDistortionProperty = LEFT_INPUT_DISTORTION_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMRightInputDistortionProperty() <em>MRight Input Distortion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRightInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mRightInputDistortionProperty = null;

	/**
	 * The default value of the '{@link #getRightInputDistortionProperty() <em>Right Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RIGHT_INPUT_DISTORTION_PROPERTY_EDEFAULT = Boolean.FALSE;

	/**
	 * Get the default value of the '{@link #getRightInputDistortionProperty() <em>Right Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getRightInputDistortionProperty() <em>Right Input Distortion Property</em>}' attribute.
	 * @see #getRightInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultRightInputDistortionProperty() {
		return RIGHT_INPUT_DISTORTION_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getRightInputDistortionProperty() <em>Right Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInputDistortionProperty()
	 * @generated
	 * @ordered
	 */
	protected Boolean rightInputDistortionProperty = RIGHT_INPUT_DISTORTION_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMUseDbProperty() <em>MUse Db Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUseDbProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mUseDbProperty = null;

	/**
	 * The default value of the '{@link #getUseDbProperty() <em>Use Db Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDbProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_DB_PROPERTY_EDEFAULT = Boolean.TRUE;

	/**
	 * Get the default value of the '{@link #getUseDbProperty() <em>Use Db Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getUseDbProperty() <em>Use Db Property</em>}' attribute.
	 * @see #getUseDbProperty()
	 * @generated
	 * @ordered
	 */
	public Boolean getDefaultUseDbProperty() {
		return USE_DB_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getUseDbProperty() <em>Use Db Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDbProperty()
	 * @generated
	 * @ordered
	 */
	protected Boolean useDbProperty = USE_DB_PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMHeadroomProperty() <em>MHeadroom Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHeadroomProperty()
	 * @generated
	 * @ordered
	 */
	protected MProperty mHeadroomProperty = null;

	/**
	 * The default value of the '{@link #getHeadroomProperty() <em>Headroom Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadroomProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEADROOM_PROPERTY_EDEFAULT = new Long(9L);

	/**
	 * Get the default value of the '{@link #getHeadroomProperty() <em>Headroom Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getHeadroomProperty() <em>Headroom Property</em>}' attribute.
	 * @see #getHeadroomProperty()
	 * @generated
	 * @ordered
	 */
	public Long getDefaultHeadroomProperty() {
		return HEADROOM_PROPERTY_EDEFAULT;
	}
	
	/**
	 * The cached value of the '{@link #getHeadroomProperty() <em>Headroom Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadroomProperty()
	 * @generated
	 * @ordered
	 */
	protected Long headroomProperty = HEADROOM_PROPERTY_EDEFAULT;

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
		return "org.onceforall.dms.desktop.ui.MAudioStepComposite";
	}
	/**
	 * Get the default value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isStoppable() <em>Stoppable</em>}' attribute.
	 * @see #isStoppable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultStoppable() {
		return false;
	}

	/**
	 * Get the default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultInterruptable() {
		return false;
	}

	/**
	 * Get the default value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #isTerminatable() <em>Terminatable</em>}' attribute.
	 * @see #isTerminatable()
	 * @generated
	 * @ordered
	 */
	public boolean getDefaultTerminatable() {
		return false;
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Audio step.gif");
	}

	/**
	 * Get the default value of the '{@link #getActionIconFilePath() <em>Action Icon File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionIconFilePath() <em>Action Icon File Path</em>}' attribute.
	 * @see #getActionIconFilePath()
	 * @generated
	 * @ordered
	 */
	public File getDefaultActionIconFilePath() {
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Mark as completed.gif");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAudioStep() {
		super();
		
		firstMAudioStepConstructorHook();
				
		interruptable = false;
		terminatable = false;
		stoppable = false;
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Audio step.gif");
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Mark as completed.gif");
		compositeClassName = "org.onceforall.dms.desktop.ui.MAudioStepComposite";
					 
		setMLeftInputLevelProperty(new MProperty(true, "Left input level", "Displays the current left input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.", null));			 
		setMRightInputLevelProperty(new MProperty(true, "Right input level", "Displays the current right input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.", null));			 
		setMLeftInputDistortionProperty(new MProperty(true, "Left input distortion alert", "Indicates whether the audio signal on left channel is likely to be distorted.", null));			 
		setMRightInputDistortionProperty(new MProperty(true, "Right input distortion alert", "Indicates whether the audio signal on right channel is likely to be distorted.", null));			 
		setMUseDbProperty(new MProperty(false, "Use dBFS", "Specifies whether the meters should show the signal readings in dBFS (logarithmic) or raw (linear). If dBFS is used then the meters show range from -50 dBFS to 0 dBFS.  For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.", null));			 
		setMHeadroomProperty(new MProperty(false, "Headroom (in dBFS)", "Specifies the headroom in dBFS. This must be a number between 0 and 18. The level meters should indicate whether the signal is within the headroom using yellow and red colours.  For an explanation of the headroom please refer to http://en.wikipedia.org/wiki/Headroom. For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.  ", null));

		lastMAudioStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMAudioStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMAudioStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MAUDIO_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MLeft Input Level Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLeft Input Level Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLeft Input Level Property</em>' containment reference.
	 * @see #setMLeftInputLevelProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MLeftInputLevelProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Left input level' description='Displays the current left input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMLeftInputLevelProperty() {
		return mLeftInputLevelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLeftInputLevelProperty(MProperty newMLeftInputLevelProperty, NotificationChain msgs) {
		MProperty oldMLeftInputLevelProperty = mLeftInputLevelProperty;
		mLeftInputLevelProperty = newMLeftInputLevelProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY, oldMLeftInputLevelProperty, newMLeftInputLevelProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputLevelProperty <em>MLeft Input Level Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMLeftInputLevelProperty the new value of the '<em>MLeft Input Level Property</em>' containment reference.
	 * @see #getMLeftInputLevelProperty()
	 * @generated
	 */
	public void setMLeftInputLevelProperty(MProperty newMLeftInputLevelProperty) {
		if (newMLeftInputLevelProperty != mLeftInputLevelProperty) {
			NotificationChain msgs = null;
			if (mLeftInputLevelProperty != null)
				msgs = ((InternalEObject)mLeftInputLevelProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY, null, msgs);
			if (newMLeftInputLevelProperty != null) {				
				newMLeftInputLevelProperty.setDefaultName("Left input level");
				newMLeftInputLevelProperty.setDefaultDescription("Displays the current left input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.");
				newMLeftInputLevelProperty.setValueType(Type.getTypeForName("Number"));
				newMLeftInputLevelProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY));
				newMLeftInputLevelProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLeftInputLevelProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLeftInputLevelProperty != null) {
				if(newMLeftInputLevelProperty != null)
					newMLeftInputLevelProperty.eAdapters().addAll(mLeftInputLevelProperty.eAdapters());			
			
				mLeftInputLevelProperty.eAdapters().clear();
			}
			msgs = basicSetMLeftInputLevelProperty(newMLeftInputLevelProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY, newMLeftInputLevelProperty, newMLeftInputLevelProperty));
	}

	/**
	 * Returns the value of the '<em><b>Left Input Level Property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input Level Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input Level Property</em>' attribute.
	 * @see #setLeftInputLevelProperty(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_LeftInputLevelProperty()
	 * @model default="0" dataType="org.onceforall.dms.desktop.logic.MLong" required="true" transient="true"
	 * @generated
	 */
	public Long getLeftInputLevelProperty() {
		return leftInputLevelProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputLevelProperty <em>Left Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLeftInputLevelProperty the new value of the '<em>Left Input Level Property</em>' attribute.
	 * @see #getLeftInputLevelProperty()
	 * @generated
	 */
	public void setLeftInputLevelProperty(Long newLeftInputLevelProperty) {
		Long oldLeftInputLevelProperty = leftInputLevelProperty;
		leftInputLevelProperty = newLeftInputLevelProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY, oldLeftInputLevelProperty, leftInputLevelProperty));
	}

	/**
	 * Returns the value of the '<em><b>MRight Input Level Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRight Input Level Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRight Input Level Property</em>' containment reference.
	 * @see #setMRightInputLevelProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MRightInputLevelProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Right input level' description='Displays the current right input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMRightInputLevelProperty() {
		return mRightInputLevelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRightInputLevelProperty(MProperty newMRightInputLevelProperty, NotificationChain msgs) {
		MProperty oldMRightInputLevelProperty = mRightInputLevelProperty;
		mRightInputLevelProperty = newMRightInputLevelProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY, oldMRightInputLevelProperty, newMRightInputLevelProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputLevelProperty <em>MRight Input Level Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRightInputLevelProperty the new value of the '<em>MRight Input Level Property</em>' containment reference.
	 * @see #getMRightInputLevelProperty()
	 * @generated
	 */
	public void setMRightInputLevelProperty(MProperty newMRightInputLevelProperty) {
		if (newMRightInputLevelProperty != mRightInputLevelProperty) {
			NotificationChain msgs = null;
			if (mRightInputLevelProperty != null)
				msgs = ((InternalEObject)mRightInputLevelProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY, null, msgs);
			if (newMRightInputLevelProperty != null) {				
				newMRightInputLevelProperty.setDefaultName("Right input level");
				newMRightInputLevelProperty.setDefaultDescription("Displays the current right input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.");
				newMRightInputLevelProperty.setValueType(Type.getTypeForName("Number"));
				newMRightInputLevelProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY));
				newMRightInputLevelProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRightInputLevelProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRightInputLevelProperty != null) {
				if(newMRightInputLevelProperty != null)
					newMRightInputLevelProperty.eAdapters().addAll(mRightInputLevelProperty.eAdapters());			
			
				mRightInputLevelProperty.eAdapters().clear();
			}
			msgs = basicSetMRightInputLevelProperty(newMRightInputLevelProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY, newMRightInputLevelProperty, newMRightInputLevelProperty));
	}

	/**
	 * Returns the value of the '<em><b>Right Input Level Property</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input Level Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input Level Property</em>' attribute.
	 * @see #setRightInputLevelProperty(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_RightInputLevelProperty()
	 * @model default="0" dataType="org.onceforall.dms.desktop.logic.MLong" required="true" transient="true"
	 * @generated
	 */
	public Long getRightInputLevelProperty() {
		return rightInputLevelProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputLevelProperty <em>Right Input Level Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRightInputLevelProperty the new value of the '<em>Right Input Level Property</em>' attribute.
	 * @see #getRightInputLevelProperty()
	 * @generated
	 */
	public void setRightInputLevelProperty(Long newRightInputLevelProperty) {
		Long oldRightInputLevelProperty = rightInputLevelProperty;
		rightInputLevelProperty = newRightInputLevelProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY, oldRightInputLevelProperty, rightInputLevelProperty));
	}

	/**
	 * Returns the value of the '<em><b>MLeft Input Distortion Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLeft Input Distortion Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLeft Input Distortion Property</em>' containment reference.
	 * @see #setMLeftInputDistortionProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MLeftInputDistortionProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Left input distortion alert' description='Indicates whether the audio signal on left channel is likely to be distorted.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMLeftInputDistortionProperty() {
		return mLeftInputDistortionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLeftInputDistortionProperty(MProperty newMLeftInputDistortionProperty, NotificationChain msgs) {
		MProperty oldMLeftInputDistortionProperty = mLeftInputDistortionProperty;
		mLeftInputDistortionProperty = newMLeftInputDistortionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY, oldMLeftInputDistortionProperty, newMLeftInputDistortionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputDistortionProperty <em>MLeft Input Distortion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMLeftInputDistortionProperty the new value of the '<em>MLeft Input Distortion Property</em>' containment reference.
	 * @see #getMLeftInputDistortionProperty()
	 * @generated
	 */
	public void setMLeftInputDistortionProperty(MProperty newMLeftInputDistortionProperty) {
		if (newMLeftInputDistortionProperty != mLeftInputDistortionProperty) {
			NotificationChain msgs = null;
			if (mLeftInputDistortionProperty != null)
				msgs = ((InternalEObject)mLeftInputDistortionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY, null, msgs);
			if (newMLeftInputDistortionProperty != null) {				
				newMLeftInputDistortionProperty.setDefaultName("Left input distortion alert");
				newMLeftInputDistortionProperty.setDefaultDescription("Indicates whether the audio signal on left channel is likely to be distorted.");
				newMLeftInputDistortionProperty.setValueType(Type.getTypeForName("Yes/No"));
				newMLeftInputDistortionProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY));
				newMLeftInputDistortionProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMLeftInputDistortionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mLeftInputDistortionProperty != null) {
				if(newMLeftInputDistortionProperty != null)
					newMLeftInputDistortionProperty.eAdapters().addAll(mLeftInputDistortionProperty.eAdapters());			
			
				mLeftInputDistortionProperty.eAdapters().clear();
			}
			msgs = basicSetMLeftInputDistortionProperty(newMLeftInputDistortionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY, newMLeftInputDistortionProperty, newMLeftInputDistortionProperty));
	}

	/**
	 * Returns the value of the '<em><b>Left Input Distortion Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input Distortion Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input Distortion Property</em>' attribute.
	 * @see #setLeftInputDistortionProperty(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_LeftInputDistortionProperty()
	 * @model default="false" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true" transient="true"
	 * @generated
	 */
	public Boolean getLeftInputDistortionProperty() {
		return leftInputDistortionProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputDistortionProperty <em>Left Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLeftInputDistortionProperty the new value of the '<em>Left Input Distortion Property</em>' attribute.
	 * @see #getLeftInputDistortionProperty()
	 * @generated
	 */
	public void setLeftInputDistortionProperty(Boolean newLeftInputDistortionProperty) {
		Boolean oldLeftInputDistortionProperty = leftInputDistortionProperty;
		leftInputDistortionProperty = newLeftInputDistortionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY, oldLeftInputDistortionProperty, leftInputDistortionProperty));
	}

	/**
	 * Returns the value of the '<em><b>MRight Input Distortion Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRight Input Distortion Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRight Input Distortion Property</em>' containment reference.
	 * @see #setMRightInputDistortionProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MRightInputDistortionProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Right input distortion alert' description='Indicates whether the audio signal on right channel is likely to be distorted.' readOnly='true'"
	 * @generated
	 */
	public MProperty getMRightInputDistortionProperty() {
		return mRightInputDistortionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRightInputDistortionProperty(MProperty newMRightInputDistortionProperty, NotificationChain msgs) {
		MProperty oldMRightInputDistortionProperty = mRightInputDistortionProperty;
		mRightInputDistortionProperty = newMRightInputDistortionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY, oldMRightInputDistortionProperty, newMRightInputDistortionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputDistortionProperty <em>MRight Input Distortion Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMRightInputDistortionProperty the new value of the '<em>MRight Input Distortion Property</em>' containment reference.
	 * @see #getMRightInputDistortionProperty()
	 * @generated
	 */
	public void setMRightInputDistortionProperty(MProperty newMRightInputDistortionProperty) {
		if (newMRightInputDistortionProperty != mRightInputDistortionProperty) {
			NotificationChain msgs = null;
			if (mRightInputDistortionProperty != null)
				msgs = ((InternalEObject)mRightInputDistortionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY, null, msgs);
			if (newMRightInputDistortionProperty != null) {				
				newMRightInputDistortionProperty.setDefaultName("Right input distortion alert");
				newMRightInputDistortionProperty.setDefaultDescription("Indicates whether the audio signal on right channel is likely to be distorted.");
				newMRightInputDistortionProperty.setValueType(Type.getTypeForName("Yes/No"));
				newMRightInputDistortionProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY));
				newMRightInputDistortionProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMRightInputDistortionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mRightInputDistortionProperty != null) {
				if(newMRightInputDistortionProperty != null)
					newMRightInputDistortionProperty.eAdapters().addAll(mRightInputDistortionProperty.eAdapters());			
			
				mRightInputDistortionProperty.eAdapters().clear();
			}
			msgs = basicSetMRightInputDistortionProperty(newMRightInputDistortionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY, newMRightInputDistortionProperty, newMRightInputDistortionProperty));
	}

	/**
	 * Returns the value of the '<em><b>Right Input Distortion Property</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input Distortion Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input Distortion Property</em>' attribute.
	 * @see #setRightInputDistortionProperty(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_RightInputDistortionProperty()
	 * @model default="false" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true" transient="true"
	 * @generated
	 */
	public Boolean getRightInputDistortionProperty() {
		return rightInputDistortionProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputDistortionProperty <em>Right Input Distortion Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRightInputDistortionProperty the new value of the '<em>Right Input Distortion Property</em>' attribute.
	 * @see #getRightInputDistortionProperty()
	 * @generated
	 */
	public void setRightInputDistortionProperty(Boolean newRightInputDistortionProperty) {
		Boolean oldRightInputDistortionProperty = rightInputDistortionProperty;
		rightInputDistortionProperty = newRightInputDistortionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY, oldRightInputDistortionProperty, rightInputDistortionProperty));
	}

	/**
	 * Returns the value of the '<em><b>MUse Db Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUse Db Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUse Db Property</em>' containment reference.
	 * @see #setMUseDbProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MUseDbProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Use dBFS' description='Specifies whether the meters should show the signal readings in dBFS (logarithmic) or raw (linear). If dBFS is used then the meters show range from -50 dBFS to 0 dBFS.  For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.'"
	 * @generated
	 */
	public MProperty getMUseDbProperty() {
		return mUseDbProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUseDbProperty(MProperty newMUseDbProperty, NotificationChain msgs) {
		MProperty oldMUseDbProperty = mUseDbProperty;
		mUseDbProperty = newMUseDbProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY, oldMUseDbProperty, newMUseDbProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMUseDbProperty <em>MUse Db Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMUseDbProperty the new value of the '<em>MUse Db Property</em>' containment reference.
	 * @see #getMUseDbProperty()
	 * @generated
	 */
	public void setMUseDbProperty(MProperty newMUseDbProperty) {
		if (newMUseDbProperty != mUseDbProperty) {
			NotificationChain msgs = null;
			if (mUseDbProperty != null)
				msgs = ((InternalEObject)mUseDbProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY, null, msgs);
			if (newMUseDbProperty != null) {				
				newMUseDbProperty.setDefaultDescription("Specifies whether the meters should show the signal readings in dBFS (logarithmic) or raw (linear). If dBFS is used then the meters show range from -50 dBFS to 0 dBFS.  For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.");
				newMUseDbProperty.setDefaultName("Use dBFS");
				newMUseDbProperty.setValueType(Type.getTypeForName("Yes/No"));
				newMUseDbProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY));
				newMUseDbProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMUseDbProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mUseDbProperty != null) {
				if(newMUseDbProperty != null)
					newMUseDbProperty.eAdapters().addAll(mUseDbProperty.eAdapters());			
			
				mUseDbProperty.eAdapters().clear();
			}
			msgs = basicSetMUseDbProperty(newMUseDbProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY, newMUseDbProperty, newMUseDbProperty));
	}

	/**
	 * Returns the value of the '<em><b>Use Db Property</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Db Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Db Property</em>' attribute.
	 * @see #setUseDbProperty(Boolean)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_UseDbProperty()
	 * @model default="true" dataType="org.onceforall.dms.desktop.logic.MBoolean" required="true"
	 * @generated
	 */
	public Boolean getUseDbProperty() {
		return useDbProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getUseDbProperty <em>Use Db Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newUseDbProperty the new value of the '<em>Use Db Property</em>' attribute.
	 * @see #getUseDbProperty()
	 * @generated
	 */
	public void setUseDbProperty(Boolean newUseDbProperty) {
		Boolean oldUseDbProperty = useDbProperty;
		useDbProperty = newUseDbProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY, oldUseDbProperty, useDbProperty));
	}

	/**
	 * Returns the value of the '<em><b>MHeadroom Property</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MHeadroom Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHeadroom Property</em>' containment reference.
	 * @see #setMHeadroomProperty(MProperty)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_MHeadroomProperty()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Headroom (in dBFS)' description='Specifies the headroom in dBFS. This must be a number between 0 and 18. The level meters should indicate whether the signal is within the headroom using yellow and red colours.  For an explanation of the headroom please refer to http://en.wikipedia.org/wiki/Headroom. For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.  ' readOnly='false'"
	 * @generated
	 */
	public MProperty getMHeadroomProperty() {
		return mHeadroomProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMHeadroomProperty(MProperty newMHeadroomProperty, NotificationChain msgs) {
		MProperty oldMHeadroomProperty = mHeadroomProperty;
		mHeadroomProperty = newMHeadroomProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY, oldMHeadroomProperty, newMHeadroomProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMHeadroomProperty <em>MHeadroom Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMHeadroomProperty the new value of the '<em>MHeadroom Property</em>' containment reference.
	 * @see #getMHeadroomProperty()
	 * @generated
	 */
	public void setMHeadroomProperty(MProperty newMHeadroomProperty) {
		if (newMHeadroomProperty != mHeadroomProperty) {
			NotificationChain msgs = null;
			if (mHeadroomProperty != null)
				msgs = ((InternalEObject)mHeadroomProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY, null, msgs);
			if (newMHeadroomProperty != null) {				
				newMHeadroomProperty.setDefaultName("Headroom (in dBFS)");
				newMHeadroomProperty.setDefaultDescription("Specifies the headroom in dBFS. This must be a number between 0 and 18. The level meters should indicate whether the signal is within the headroom using yellow and red colours.  For an explanation of the headroom please refer to http://en.wikipedia.org/wiki/Headroom. For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.  ");
				newMHeadroomProperty.setValueType(Type.getTypeForName("Number"));
				newMHeadroomProperty.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY));
				newMHeadroomProperty.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMHeadroomProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mHeadroomProperty != null) {
				if(newMHeadroomProperty != null)
					newMHeadroomProperty.eAdapters().addAll(mHeadroomProperty.eAdapters());			
			
				mHeadroomProperty.eAdapters().clear();
			}
			msgs = basicSetMHeadroomProperty(newMHeadroomProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY, newMHeadroomProperty, newMHeadroomProperty));
	}

	/**
	 * Returns the value of the '<em><b>Headroom Property</b></em>' attribute.
	 * The default value is <code>"9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headroom Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headroom Property</em>' attribute.
	 * @see #setHeadroomProperty(Long)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep_HeadroomProperty()
	 * @model default="9" dataType="org.onceforall.dms.desktop.logic.MLong" required="true"
	 * @generated
	 */
	public Long getHeadroomProperty() {
		return headroomProperty;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MAudioStep#getHeadroomProperty <em>Headroom Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newHeadroomProperty the new value of the '<em>Headroom Property</em>' attribute.
	 * @see #getHeadroomProperty()
	 * @generated
	 */
	public void setHeadroomProperty(Long newHeadroomProperty) {
		Long oldHeadroomProperty = headroomProperty;
		headroomProperty = newHeadroomProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY, oldHeadroomProperty, headroomProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:
				return basicSetMLeftInputLevelProperty(null, msgs);
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:
				return basicSetMRightInputLevelProperty(null, msgs);
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:
				return basicSetMLeftInputDistortionProperty(null, msgs);
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:
				return basicSetMRightInputDistortionProperty(null, msgs);
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:
				return basicSetMUseDbProperty(null, msgs);
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:
				return basicSetMHeadroomProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:
				return getMLeftInputLevelProperty();
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY:
				return getLeftInputLevelProperty();
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:
				return getMRightInputLevelProperty();
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY:
				return getRightInputLevelProperty();
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:
				return getMLeftInputDistortionProperty();
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY:
				return getLeftInputDistortionProperty();
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:
				return getMRightInputDistortionProperty();
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY:
				return getRightInputDistortionProperty();
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:
				return getMUseDbProperty();
			case LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY:
				return getUseDbProperty();
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:
				return getMHeadroomProperty();
			case LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY:
				return getHeadroomProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:    
				setMLeftInputLevelProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY:    
				setLeftInputLevelProperty((Long)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:    
				setMRightInputLevelProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY:    
				setRightInputLevelProperty((Long)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:    
				setMLeftInputDistortionProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY:    
				setLeftInputDistortionProperty((Boolean)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:    
				setMRightInputDistortionProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY:    
				setRightInputDistortionProperty((Boolean)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:    
				setMUseDbProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY:    
				setUseDbProperty((Boolean)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:    
				setMHeadroomProperty((MProperty)newValue);
				return;
			case LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY:    
				setHeadroomProperty((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:
				setMLeftInputLevelProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY:
				setLeftInputLevelProperty(getDefaultLeftInputLevelProperty());
				return;
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:
				setMRightInputLevelProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY:
				setRightInputLevelProperty(getDefaultRightInputLevelProperty());
				return;
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:
				setMLeftInputDistortionProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY:
				setLeftInputDistortionProperty(getDefaultLeftInputDistortionProperty());
				return;
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:
				setMRightInputDistortionProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY:
				setRightInputDistortionProperty(getDefaultRightInputDistortionProperty());
				return;
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:
				setMUseDbProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY:
				setUseDbProperty(getDefaultUseDbProperty());
				return;
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:
				setMHeadroomProperty((MProperty)null);
				return;
			case LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY:
				setHeadroomProperty(getDefaultHeadroomProperty());
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY:
				return mLeftInputLevelProperty != null;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY:
				return getDefaultLeftInputLevelProperty() == null ? leftInputLevelProperty != null : !getDefaultLeftInputLevelProperty().equals(leftInputLevelProperty);
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY:
				return mRightInputLevelProperty != null;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY:
				return getDefaultRightInputLevelProperty() == null ? rightInputLevelProperty != null : !getDefaultRightInputLevelProperty().equals(rightInputLevelProperty);
			case LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY:
				return mLeftInputDistortionProperty != null;
			case LogicPackage.MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY:
				return getDefaultLeftInputDistortionProperty() == null ? leftInputDistortionProperty != null : !getDefaultLeftInputDistortionProperty().equals(leftInputDistortionProperty);
			case LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY:
				return mRightInputDistortionProperty != null;
			case LogicPackage.MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY:
				return getDefaultRightInputDistortionProperty() == null ? rightInputDistortionProperty != null : !getDefaultRightInputDistortionProperty().equals(rightInputDistortionProperty);
			case LogicPackage.MAUDIO_STEP__MUSE_DB_PROPERTY:
				return mUseDbProperty != null;
			case LogicPackage.MAUDIO_STEP__USE_DB_PROPERTY:
				return getDefaultUseDbProperty() == null ? useDbProperty != null : !getDefaultUseDbProperty().equals(useDbProperty);
			case LogicPackage.MAUDIO_STEP__MHEADROOM_PROPERTY:
				return mHeadroomProperty != null;
			case LogicPackage.MAUDIO_STEP__HEADROOM_PROPERTY:
				return getDefaultHeadroomProperty() == null ? headroomProperty != null : !getDefaultHeadroomProperty().equals(headroomProperty);
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
		result.append(" (leftInputLevelProperty: ");
		result.append(leftInputLevelProperty);
		result.append(", rightInputLevelProperty: ");
		result.append(rightInputLevelProperty);
		result.append(", leftInputDistortionProperty: ");
		result.append(leftInputDistortionProperty);
		result.append(", rightInputDistortionProperty: ");
		result.append(rightInputDistortionProperty);
		result.append(", useDbProperty: ");
		result.append(useDbProperty);
		result.append(", headroomProperty: ");
		result.append(headroomProperty);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#pause()
	 */
	@Override
	public void pause() {
        audioInputStream.pause();
		super.pause();
	}


	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#resume()
	 */
	@Override
	public void resume() {
        audioInputStream.resume();
		super.resume();
	}


	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#stop()
	 */
	@Override
	public void stop() {
        audioInputStream.stop();
		super.stop();
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
        if(notification.getEventType() == Notification.NO_FEATURE_ID && audioInputStream != null) {
            // Update input levels in minimum intervals to avoid unnecessary use of processing resources.
            if(System.currentTimeMillis()-lastInputLevelsUpdate > 100) {
            	if(getUseDbProperty()) {
            		// Converts the raw readings to a value between 0 and 100. 0 represents -50dBFS and 100 represents 0dBFS.
            		setLeftInputLevelProperty(Math.round(Math.max(20*Math.log10(audioInputStream.getLeftLevel())-DYNAMIC_RANGE-MINIMUM_LEVEL, 0)/-MINIMUM_LEVEL*100));
            		setRightInputLevelProperty(Math.round(Math.max(20*Math.log10(audioInputStream.getRightLevel())-DYNAMIC_RANGE-MINIMUM_LEVEL, 0)/-MINIMUM_LEVEL*100));
            	}
            	else {
            		setLeftInputLevelProperty((long) Math.round(audioInputStream.getLeftLevel()/(float) MonitoredAudioInputStream.MAXIMUM_LEVEL*100));
            		setRightInputLevelProperty((long) Math.round(audioInputStream.getRightLevel()/(float) MonitoredAudioInputStream.MAXIMUM_LEVEL*100));           		
            	}
            	/* TODO: Fix distortion alert implementation */
            	/* setLeftInputDistortionProperty(new Boolean(audioInputStream.getLeftDistortionAlert()));
            	setRightInputDistortionProperty(new Boolean(audioInputStream.getRightDistortionAlert())); */
    
            	lastInputLevelsUpdate = System.currentTimeMillis();
            }
        }    
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#activate()
	 */
	@Override
	public void activate() {
		super.activate();
		
        try {
            audioInputStream = AudioInterface.getMonitoredAudioInputStream();            
            audioInputStream.eAdapters().add(this);
        } catch (LineUnavailableException exception) {
            Logger.getLogger().log(Level.SEVERE, "The audio input line cannot be read.", exception);
        } catch (IllegalArgumentException exception) {
        	Logger.getLogger().log(Level.SEVERE, "The audio input line cannot be read.", exception);
        }
	}

	/**
	 * @see org.onceforall.dms.desktop.logic.MObject#deactivate()
	 */
	@Override
	public void deactivate() {
		if(audioInputStream != null)
			audioInputStream.eAdapters().remove(this);
		
		super.deactivate();
	}
	
} // MAudioStep