
/**
 * Copyright 2007, Marc Maier
 *
 * $Id$
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCopy Directory Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMSourceDirectoryParameter <em>MSource Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getSourceDirectoryParameter <em>Source Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMDestinationDirectoryParameter <em>MDestination Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getDestinationDirectoryParameter <em>Destination Directory Parameter</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMCopiedDirectoryResult <em>MCopied Directory Result</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getCopiedDirectoryResult <em>Copied Directory Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore name='Copy directory' description='Copies a directory and its sub-directories to the given directory.' iconFilePath='Image Files/Copy.gif' actionName='Copy' actionIconFilePath='Image Files\\Mark as completed.gif' interruptable='false' stoppable='false' terminatable='false'"
 * @generated
 */
public class MCopyDirectoryStep extends MStep {
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MCopyDirectoryStep.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MCopyDirectoryStep.TYPE_NAME, new ReferenceType("Reference to "+MCopyDirectoryStep.TYPE_NAME, "Specifies a reference to a "+MCopyDirectoryStep.TYPE_NAME_FOR_UI, MCopyDirectoryStep.class));
	}
	/**
	 * The cached value of the '{@link #getMSourceDirectoryParameter() <em>MSource Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSourceDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mSourceDirectoryParameter;

	/**
	 * The default value of the '{@link #getSourceDirectoryParameter() <em>Source Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File SOURCE_DIRECTORY_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getSourceDirectoryParameter() <em>Source Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getSourceDirectoryParameter() <em>Source Directory Parameter</em>}' attribute.
	 * @see #getSourceDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultSourceDirectoryParameter() {
		return SOURCE_DIRECTORY_PARAMETER_EDEFAULT;
	}	

	/**
	 * The cached value of the '{@link #getSourceDirectoryParameter() <em>Source Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected File sourceDirectoryParameter = SOURCE_DIRECTORY_PARAMETER_EDEFAULT; // TODO: Check that default value is assigned correctly.

	/**
	 * The cached value of the '{@link #getMDestinationDirectoryParameter() <em>MDestination Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDestinationDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter mDestinationDirectoryParameter;

	/**
	 * The default value of the '{@link #getDestinationDirectoryParameter() <em>Destination Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected static final File DESTINATION_DIRECTORY_PARAMETER_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getDestinationDirectoryParameter() <em>Destination Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDestinationDirectoryParameter() <em>Destination Directory Parameter</em>}' attribute.
	 * @see #getDestinationDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	public File getDefaultDestinationDirectoryParameter() {
		return DESTINATION_DIRECTORY_PARAMETER_EDEFAULT;
	}	

	/**
	 * The cached value of the '{@link #getDestinationDirectoryParameter() <em>Destination Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected File destinationDirectoryParameter = DESTINATION_DIRECTORY_PARAMETER_EDEFAULT; // TODO: Check that default value is assigned correctly.

	/**
	 * The cached value of the '{@link #getMCopiedDirectoryResult() <em>MCopied Directory Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCopiedDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected MResult mCopiedDirectoryResult;

	/**
	 * The default value of the '{@link #getCopiedDirectoryResult() <em>Copied Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopiedDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected static final File COPIED_DIRECTORY_RESULT_EDEFAULT = null;
	
	/**
	 * Get the default value of the '{@link #getCopiedDirectoryResult() <em>Copied Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getCopiedDirectoryResult() <em>Copied Directory Result</em>}' attribute.
	 * @see #getCopiedDirectoryResult()
	 * @generated
	 * @ordered
	 */
	public File getDefaultCopiedDirectoryResult() {
		return COPIED_DIRECTORY_RESULT_EDEFAULT;
	}	

	/**
	 * The cached value of the '{@link #getCopiedDirectoryResult() <em>Copied Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopiedDirectoryResult()
	 * @generated
	 * @ordered
	 */
	protected File copiedDirectoryResult = COPIED_DIRECTORY_RESULT_EDEFAULT; // TODO: Check that default value is assigned correctly.


	/**
	 * Get the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	public String getDefaultActionName() {
		return "Copy";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
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
	 * Get the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return Returns the default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	public String getDefaultDescription() {
		return "Copies a directory and its sub-directories to the given directory.";
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
		return "Copy directory";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Copy.gif");
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCopyDirectoryStep() {
		super();
		
		firstMCopyDirectoryStepConstructorHook();
				
		description = "Copies a directory and its sub-directories to the given directory.";
		stoppable = false;
		actionIconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files\\Mark as completed.gif");
		name = "Copy directory";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/Copy.gif");
		terminatable = false;
		interruptable = false;
		actionName = "Copy";
			 
		setMSourceDirectoryParameter(new MParameter(false, "Source directory", "Specifies the path to the source directory to be copied.", null));			 
		setMDestinationDirectoryParameter(new MParameter(false, "Destination directory", "Specifies the path to new destination directory. If this directory does not already exist, it will be created.", null));			 
		setMCopiedDirectoryResult(new MResult(false, "Copied directory", "Specifies the path to the copied directory (which is the destination directory).", null));

		lastMCopyDirectoryStepConstructorHook();		
	}
	
	/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMCopyDirectoryStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
	/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMCopyDirectoryStepConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	
	/**
	 * @see org.onceforall.dms.desktop.logic.MStep#execute()
	 */
	@Override
	protected void execute() throws Throwable {
		File sourceDir = getSourceDirectoryParameter();
		File destinationDir = getDestinationDirectoryParameter();
		
		long fileSize = getFileSizeRecursive(sourceDir);
		copyFileRecursive(sourceDir, destinationDir, 0, fileSize);

		setCopiedDirectoryResult(new File(destinationDir.getAbsoluteFile()+File.separator+sourceDir.getName()));
		setProgressStatusProperty(null);
	}

	/**
	 * Calculates the cumulative size of the given directory/file and all its children.
	 *  
	 * @param file Specifies the directory/file to calculate the size for. 
	 * @return Returns the cumulative size of the given directory/file and all its children.
	 */
	protected long getFileSizeRecursive(File file) {
		if(file.isFile())
			return file.length();
	
		long fileSize = 0;
		File[] files = file.listFiles();
		for(File subFile: files)
			fileSize += getFileSizeRecursive(subFile);
		
		return fileSize;
	}
	
	/**
	 * Recursively copies the given directory/file to the destination directory.
	 * 
	 * @param sourceDir Specifies the directory/file to be copied.
	 * @param destinationDir Specifies the directory to contain the copied files/directory.
	 * @param currentSize Specifies the number of bytes already copied.
	 * @param totalSize Specifies the total number of bytes to copy.
	 * @return Returns the number of bytes copied.
	 * @throws IOException
	 */
	protected long copyFileRecursive(File sourceFile, File destinationDir, long currentSize, long totalSize) throws IOException {
		setProgressStatusProperty("Copying "+sourceFile.getName()+" ...");
		destinationDir.mkdirs();
		
		if(sourceFile.isFile()) {
			InputStream sourceStream = new MonitoredInputStream(new FileInputStream(sourceFile), currentSize, sourceFile.length(), totalSize); 
			OutputStream outputStream = new FileOutputStream(destinationDir.getAbsolutePath()+File.separator+sourceFile.getName());
			
			byte[] buffer = new byte[4096*16];
			while(true) {
				int bytesRead = sourceStream.read(buffer);
				if(bytesRead < 0)
					break;
				
				outputStream.write(buffer, 0, bytesRead);
			}
			return sourceFile.length();
		}
		
		long copiedSize = 0;		
		File[] sourceFiles = sourceFile.listFiles();
		for(File sourceSubFile: sourceFiles)
			copiedSize += copyFileRecursive(sourceSubFile, new File(destinationDir+File.separator+sourceFile.getName()), currentSize+copiedSize, totalSize);
	
		return copiedSize;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MCOPY_DIRECTORY_STEP;
	}

	/**
	 * Returns the value of the '<em><b>MSource Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSource Directory Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSource Directory Parameter</em>' containment reference.
	 * @see #setMSourceDirectoryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_MSourceDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Source directory' description='Specifies the path to the source directory to be copied.'"
	 * @generated
	 */
	public MParameter getMSourceDirectoryParameter() {
		return mSourceDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSourceDirectoryParameter(MParameter newMSourceDirectoryParameter, NotificationChain msgs) {
		MParameter oldMSourceDirectoryParameter = mSourceDirectoryParameter;
		mSourceDirectoryParameter = newMSourceDirectoryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER, oldMSourceDirectoryParameter, newMSourceDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMSourceDirectoryParameter <em>MSource Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMSourceDirectoryParameter the new value of the '<em>MSource Directory Parameter</em>' containment reference.
	 * @see #getMSourceDirectoryParameter()
	 * @generated
	 */
	public void setMSourceDirectoryParameter(MParameter newMSourceDirectoryParameter) {
		if (newMSourceDirectoryParameter != mSourceDirectoryParameter) {
			NotificationChain msgs = null;
			if (mSourceDirectoryParameter != null)
				msgs = ((InternalEObject)mSourceDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER, null, msgs);
			if (newMSourceDirectoryParameter != null) {				
				newMSourceDirectoryParameter.setDefaultDescription("Specifies the path to the source directory to be copied.");
				newMSourceDirectoryParameter.setDefaultName("Source directory");
				newMSourceDirectoryParameter.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMSourceDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER));
				newMSourceDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMSourceDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mSourceDirectoryParameter != null) {
				if(newMSourceDirectoryParameter != null)
					newMSourceDirectoryParameter.eAdapters().addAll(mSourceDirectoryParameter.eAdapters());			
			
				mSourceDirectoryParameter.eAdapters().clear();
			}
			msgs = basicSetMSourceDirectoryParameter(newMSourceDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER, newMSourceDirectoryParameter, newMSourceDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Source Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Directory Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Directory Parameter</em>' attribute.
	 * @see #setSourceDirectoryParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_SourceDirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true"
	 * @generated
	 */
	public File getSourceDirectoryParameter() {
		return sourceDirectoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getSourceDirectoryParameter <em>Source Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newSourceDirectoryParameter the new value of the '<em>Source Directory Parameter</em>' attribute.
	 * @see #getSourceDirectoryParameter()
	 * @generated
	 */
	public void setSourceDirectoryParameter(File newSourceDirectoryParameter) {
		File oldSourceDirectoryParameter = sourceDirectoryParameter;
		sourceDirectoryParameter = newSourceDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER, oldSourceDirectoryParameter, sourceDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MDestination Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDestination Directory Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDestination Directory Parameter</em>' containment reference.
	 * @see #setMDestinationDirectoryParameter(MParameter)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_MDestinationDirectoryParameter()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Destination directory' description='Specifies the path to new destination directory. If this directory does not already exist, it will be created.'"
	 * @generated
	 */
	public MParameter getMDestinationDirectoryParameter() {
		return mDestinationDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDestinationDirectoryParameter(MParameter newMDestinationDirectoryParameter, NotificationChain msgs) {
		MParameter oldMDestinationDirectoryParameter = mDestinationDirectoryParameter;
		mDestinationDirectoryParameter = newMDestinationDirectoryParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER, oldMDestinationDirectoryParameter, newMDestinationDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMDestinationDirectoryParameter <em>MDestination Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMDestinationDirectoryParameter the new value of the '<em>MDestination Directory Parameter</em>' containment reference.
	 * @see #getMDestinationDirectoryParameter()
	 * @generated
	 */
	public void setMDestinationDirectoryParameter(MParameter newMDestinationDirectoryParameter) {
		if (newMDestinationDirectoryParameter != mDestinationDirectoryParameter) {
			NotificationChain msgs = null;
			if (mDestinationDirectoryParameter != null)
				msgs = ((InternalEObject)mDestinationDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER, null, msgs);
			if (newMDestinationDirectoryParameter != null) {				
				newMDestinationDirectoryParameter.setDefaultDescription("Specifies the path to new destination directory. If this directory does not already exist, it will be created.");
				newMDestinationDirectoryParameter.setDefaultName("Destination directory");
				newMDestinationDirectoryParameter.setValueType(Type.getTypeForName("Directory"));
				newMDestinationDirectoryParameter.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER));
				newMDestinationDirectoryParameter.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMDestinationDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mDestinationDirectoryParameter != null) {
				if(newMDestinationDirectoryParameter != null)
					newMDestinationDirectoryParameter.eAdapters().addAll(mDestinationDirectoryParameter.eAdapters());			
			
				mDestinationDirectoryParameter.eAdapters().clear();
			}
			msgs = basicSetMDestinationDirectoryParameter(newMDestinationDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER, newMDestinationDirectoryParameter, newMDestinationDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Destination Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Directory Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Directory Parameter</em>' attribute.
	 * @see #setDestinationDirectoryParameter(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_DestinationDirectoryParameter()
	 * @model dataType="org.onceforall.dms.desktop.logic.MDirectory" required="true"
	 * @generated
	 */
	public File getDestinationDirectoryParameter() {
		return destinationDirectoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getDestinationDirectoryParameter <em>Destination Directory Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newDestinationDirectoryParameter the new value of the '<em>Destination Directory Parameter</em>' attribute.
	 * @see #getDestinationDirectoryParameter()
	 * @generated
	 */
	public void setDestinationDirectoryParameter(File newDestinationDirectoryParameter) {
		File oldDestinationDirectoryParameter = destinationDirectoryParameter;
		destinationDirectoryParameter = newDestinationDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER, oldDestinationDirectoryParameter, destinationDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>MCopied Directory Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MCopied Directory Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCopied Directory Result</em>' containment reference.
	 * @see #setMCopiedDirectoryResult(MResult)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_MCopiedDirectoryResult()
	 * @model containment="true" required="true"
	 *        annotation="http://www.onceforall.org/mcore name='Copied directory' description='Specifies the path to the copied directory (which is the destination directory).'"
	 * @generated
	 */
	public MResult getMCopiedDirectoryResult() {
		return mCopiedDirectoryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCopiedDirectoryResult(MResult newMCopiedDirectoryResult, NotificationChain msgs) {
		MResult oldMCopiedDirectoryResult = mCopiedDirectoryResult;
		mCopiedDirectoryResult = newMCopiedDirectoryResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT, oldMCopiedDirectoryResult, newMCopiedDirectoryResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getMCopiedDirectoryResult <em>MCopied Directory Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newMCopiedDirectoryResult the new value of the '<em>MCopied Directory Result</em>' containment reference.
	 * @see #getMCopiedDirectoryResult()
	 * @generated
	 */
	public void setMCopiedDirectoryResult(MResult newMCopiedDirectoryResult) {
		if (newMCopiedDirectoryResult != mCopiedDirectoryResult) {
			NotificationChain msgs = null;
			if (mCopiedDirectoryResult != null)
				msgs = ((InternalEObject)mCopiedDirectoryResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT, null, msgs);
			if (newMCopiedDirectoryResult != null) {				
				newMCopiedDirectoryResult.setDefaultDescription("Specifies the path to the copied directory (which is the destination directory).");
				newMCopiedDirectoryResult.setDefaultName("Copied directory");
				newMCopiedDirectoryResult.setValueType(Type.getTypeForName("Directory (must exist)"));
				newMCopiedDirectoryResult.setValueEFeature((EStructuralFeature) eClass().getEStructuralFeature(LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT));
				newMCopiedDirectoryResult.setHistoricValuesEFeature(null);
				msgs = ((InternalEObject)newMCopiedDirectoryResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT, null, msgs);
			}
			
			// Transfers the adpaters from the old managed value to the new one.
			if(mCopiedDirectoryResult != null) {
				if(newMCopiedDirectoryResult != null)
					newMCopiedDirectoryResult.eAdapters().addAll(mCopiedDirectoryResult.eAdapters());			
			
				mCopiedDirectoryResult.eAdapters().clear();
			}
			msgs = basicSetMCopiedDirectoryResult(newMCopiedDirectoryResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT, newMCopiedDirectoryResult, newMCopiedDirectoryResult));
	}

	/**
	 * Returns the value of the '<em><b>Copied Directory Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copied Directory Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copied Directory Result</em>' attribute.
	 * @see #setCopiedDirectoryResult(File)
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCopyDirectoryStep_CopiedDirectoryResult()
	 * @model dataType="org.onceforall.dms.desktop.logic.MExistingDirectory" required="true" transient="true"
	 * @generated
	 */
	public File getCopiedDirectoryResult() {
		return copiedDirectoryResult;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.dms.desktop.logic.MCopyDirectoryStep#getCopiedDirectoryResult <em>Copied Directory Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	   
	 * @param newCopiedDirectoryResult the new value of the '<em>Copied Directory Result</em>' attribute.
	 * @see #getCopiedDirectoryResult()
	 * @generated
	 */
	public void setCopiedDirectoryResult(File newCopiedDirectoryResult) {
		File oldCopiedDirectoryResult = copiedDirectoryResult;
		copiedDirectoryResult = newCopiedDirectoryResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT, oldCopiedDirectoryResult, copiedDirectoryResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER:
				return basicSetMSourceDirectoryParameter(null, msgs);
			case LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER:
				return basicSetMDestinationDirectoryParameter(null, msgs);
			case LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT:
				return basicSetMCopiedDirectoryResult(null, msgs);
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
			case LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER:
				return getMSourceDirectoryParameter();
			case LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER:
				return getSourceDirectoryParameter();
			case LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER:
				return getMDestinationDirectoryParameter();
			case LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER:
				return getDestinationDirectoryParameter();
			case LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT:
				return getMCopiedDirectoryResult();
			case LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT:
				return getCopiedDirectoryResult();
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
			case LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER:
				setMSourceDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER:
				setSourceDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER:
				setMDestinationDirectoryParameter((MParameter)newValue);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER:
				setDestinationDirectoryParameter((File)newValue);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT:
				setMCopiedDirectoryResult((MResult)newValue);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT:
				setCopiedDirectoryResult((File)newValue);
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
			case LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER:
				setMSourceDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER:
				setSourceDirectoryParameter(getDefaultSourceDirectoryParameter());
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER:
				setMDestinationDirectoryParameter((MParameter)null);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER:
				setDestinationDirectoryParameter(getDefaultDestinationDirectoryParameter());
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT:
				setMCopiedDirectoryResult((MResult)null);
				return;
			case LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT:
				setCopiedDirectoryResult(getDefaultCopiedDirectoryResult());
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
			case LogicPackage.MCOPY_DIRECTORY_STEP__MSOURCE_DIRECTORY_PARAMETER:
				return mSourceDirectoryParameter != null;
			case LogicPackage.MCOPY_DIRECTORY_STEP__SOURCE_DIRECTORY_PARAMETER:
				return getDefaultSourceDirectoryParameter() == null ? sourceDirectoryParameter != null : !getDefaultSourceDirectoryParameter().equals(sourceDirectoryParameter);
			case LogicPackage.MCOPY_DIRECTORY_STEP__MDESTINATION_DIRECTORY_PARAMETER:
				return mDestinationDirectoryParameter != null;
			case LogicPackage.MCOPY_DIRECTORY_STEP__DESTINATION_DIRECTORY_PARAMETER:
				return getDefaultDestinationDirectoryParameter() == null ? destinationDirectoryParameter != null : !getDefaultDestinationDirectoryParameter().equals(destinationDirectoryParameter);
			case LogicPackage.MCOPY_DIRECTORY_STEP__MCOPIED_DIRECTORY_RESULT:
				return mCopiedDirectoryResult != null;
			case LogicPackage.MCOPY_DIRECTORY_STEP__COPIED_DIRECTORY_RESULT:
				return getDefaultCopiedDirectoryResult() == null ? copiedDirectoryResult != null : !getDefaultCopiedDirectoryResult().equals(copiedDirectoryResult);
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
		result.append(" (sourceDirectoryParameter: ");
		result.append(sourceDirectoryParameter);
		result.append(", destinationDirectoryParameter: ");
		result.append(destinationDirectoryParameter);
		result.append(", copiedDirectoryResult: ");
		result.append(copiedDirectoryResult);
		result.append(')');
		return result.toString();
	}

} // MCopyDirectoryStep
