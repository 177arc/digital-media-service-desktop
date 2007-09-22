/*
 * Revision History:
 * $Log: MMp3Folder.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:26  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:06  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.onceforall.dms.desktop.logic.types.ReferenceType;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMp3 Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3Folder#getMSteps <em>MSteps</em>}</li>
 *   <li>{@link org.onceforall.dms.desktop.logic.MMp3Folder#getMMp3s <em>MMp3s</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3Folder()
 * @model kind="class"
 *        annotation="http://www.onceforall.org/mcore typeNameForUI='MP3 folder' name='MP3s' description='Contains MP3 recordings.' iconFilePath='Image Files/MP3 folder.gif'"
 * @generated
 */
public class MMp3Folder extends MObject {
	/** 
	 * Specifies a user-friendly representation of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME_FOR_UI = "MP3 folder";
	
	/**
	 * Specifies the type name of this managed element.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String TYPE_NAME = MMp3Folder.class.getName();

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
		Type.VALUE_TYPES_BY_NAME.put("Reference to "+MMp3Folder.TYPE_NAME, new ReferenceType("Reference to "+MMp3Folder.TYPE_NAME, "Specifies a reference to a "+MMp3Folder.TYPE_NAME_FOR_UI, MMp3Folder.class));
	}














































































































































	
	/**
	 * The cached value of the '{@link #getMSteps() <em>MSteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSteps()
	 * @generated
	 * @ordered
	 */
	protected EList mSteps = null;

	/**
	 * The cached value of the '{@link #getMMp3s() <em>MMp3s</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMp3s()
	 * @generated
	 * @ordered
	 */
	protected EList mMp3s = null;

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
		return "MP3 folder";
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
		return "Contains MP3 recordings.";
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
		return "MP3s";
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
		return (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/MP3 folder.gif");
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMp3Folder() {
		super();
		
		firstMMp3FolderConstructorHook();
				
		typeNameForUI = "MP3 folder";
		description = "Contains MP3 recordings.";
		name = "MP3s";
		iconFilePath = (File)LogicFactory.eINSTANCE.createFromString(LogicPackage.eINSTANCE.getMFile(), "Image Files/MP3 folder.gif");
		

		lastMMp3FolderConstructorHook();		
	}
	
		/**
	 * Executes after the <code>super()</code> call of the generated constructor but before all generated constructor code.
	 * @generated
	 */
	private void firstMMp3FolderConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}
	
		/**
	 * Executes after all generated constructor code.
	 * @generated
	 */
	private void lastMMp3FolderConstructorHook() {
		// Does nothing by default. Remove the @generated tag to provide an implementation for this method.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LogicPackage.Literals.MMP3_FOLDER;
	}

	/**
	 * Returns the value of the '<em><b>MSteps</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSteps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSteps</em>' containment reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3Folder_MSteps()
	 * @model type="org.onceforall.dms.desktop.logic.MStep" containment="true" required="true"
	 * @generated
	 */
	public EList getMSteps() {
		if (mSteps == null) {
			mSteps = new EObjectContainmentEList(MStep.class, this, LogicPackage.MMP3_FOLDER__MSTEPS);
		}
		return mSteps;
	}

	/**
	 * Returns the value of the '<em><b>MMp3s</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.dms.desktop.logic.MMp3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMp3s</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMp3s</em>' containment reference list.
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3Folder_MMp3s()
	 * @model type="org.onceforall.dms.desktop.logic.MMp3" containment="true" required="true"
	 * @generated
	 */
	public EList getMMp3s() {
		if (mMp3s == null) {
			mMp3s = new EObjectContainmentEList(MMp3.class, this, LogicPackage.MMP3_FOLDER__MMP3S);
		}
		return mMp3s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.MMP3_FOLDER__MSTEPS:
				return ((InternalEList)getMSteps()).basicRemove(otherEnd, msgs);
			case LogicPackage.MMP3_FOLDER__MMP3S:
				return ((InternalEList)getMMp3s()).basicRemove(otherEnd, msgs);
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
			case LogicPackage.MMP3_FOLDER__MSTEPS:
				return getMSteps();
			case LogicPackage.MMP3_FOLDER__MMP3S:
				return getMMp3s();
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
			case LogicPackage.MMP3_FOLDER__MSTEPS:
				getMSteps().clear();
				getMSteps().addAll((Collection)newValue);
				return;
			case LogicPackage.MMP3_FOLDER__MMP3S:
				getMMp3s().clear();
				getMMp3s().addAll((Collection)newValue);
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
			case LogicPackage.MMP3_FOLDER__MSTEPS:
				getMSteps().clear();
				return;
			case LogicPackage.MMP3_FOLDER__MMP3S:
				getMMp3s().clear();
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
			case LogicPackage.MMP3_FOLDER__MSTEPS:
				return mSteps != null && !mSteps.isEmpty();
			case LogicPackage.MMP3_FOLDER__MMP3S:
				return mMp3s != null && !mMp3s.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MMp3Folder