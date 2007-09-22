/*
 * Revision History:
 * $Log: LogicPackage.java,v $
 * Revision 1.4  2007/05/12 10:56:30  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:32:25  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:08  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.logic;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.onceforall.dms.desktop.logic.types.State;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.onceforall.dms.desktop.logic.LogicFactory
 * @model kind="package"
 * @generated
 */
public class LogicPackage extends EPackageImpl {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.onceforall.org/dms/desktop/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.onceforall.dms.desktop.logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogicPackage eINSTANCE = org.onceforall.dms.desktop.logic.LogicPackage.init();

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MElement <em>MElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MElement
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement()
	 * @generated
	 */
	public static final int MELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__TYPE_NAME_FOR_UI = 2;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__NAME_FOR_UI = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__DESCRIPTION_FOR_UI = 5;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__ICON_FILE_PATH = 6;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__OVERLAY_ICON_FILE_PATH = 7;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__COMPOSITE_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT__SIMULATED = 9;

	/**
	 * The number of structural features of the '<em>MElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MELEMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MObject <em>MObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MObject
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject()
	 * @generated
	 */
	public static final int MOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__NAME = MELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__TYPE_NAME = MELEMENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__TYPE_NAME_FOR_UI = MELEMENT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__NAME_FOR_UI = MELEMENT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__DESCRIPTION = MELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__DESCRIPTION_FOR_UI = MELEMENT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__ICON_FILE_PATH = MELEMENT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__OVERLAY_ICON_FILE_PATH = MELEMENT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__COMPOSITE_CLASS_NAME = MELEMENT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__SIMULATED = MELEMENT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__MNAME_PROPERTY = MELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__MDESCRIPTION_PROPERTY = MELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__MICON_FILE_PATH_PROPERTY = MELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__FIXED_MPROPERTIES = MELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT__FIXED_MSTEPS = MELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOBJECT_FEATURE_COUNT = MELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MValue <em>MValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MValue
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue()
	 * @generated
	 */
	public static final int MVALUE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__NAME = MELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__TYPE_NAME = MELEMENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__TYPE_NAME_FOR_UI = MELEMENT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__NAME_FOR_UI = MELEMENT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__DESCRIPTION = MELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__DESCRIPTION_FOR_UI = MELEMENT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__ICON_FILE_PATH = MELEMENT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__OVERLAY_ICON_FILE_PATH = MELEMENT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__COMPOSITE_CLASS_NAME = MELEMENT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__SIMULATED = MELEMENT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MInput Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__MINPUT_VALUES = MELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__VALUE_FOR_UI = MELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__VALUE = MELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__HISTORIC_VALUES = MELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Historic Values For UI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__HISTORIC_VALUES_FOR_UI = MELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE__READ_ONLY = MELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MVALUE_FEATURE_COUNT = MELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MParameter <em>MParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MParameter
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMParameter()
	 * @generated
	 */
	public static final int MPARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__NAME = MVALUE__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__TYPE_NAME = MVALUE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__TYPE_NAME_FOR_UI = MVALUE__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__NAME_FOR_UI = MVALUE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__DESCRIPTION = MVALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__DESCRIPTION_FOR_UI = MVALUE__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__ICON_FILE_PATH = MVALUE__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__OVERLAY_ICON_FILE_PATH = MVALUE__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__COMPOSITE_CLASS_NAME = MVALUE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__SIMULATED = MVALUE__SIMULATED;

	/**
	 * The feature id for the '<em><b>MInput Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__MINPUT_VALUES = MVALUE__MINPUT_VALUES;

	/**
	 * The feature id for the '<em><b>Value For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__VALUE_FOR_UI = MVALUE__VALUE_FOR_UI;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__VALUE = MVALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__HISTORIC_VALUES = MVALUE__HISTORIC_VALUES;

	/**
	 * The feature id for the '<em><b>Historic Values For UI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__HISTORIC_VALUES_FOR_UI = MVALUE__HISTORIC_VALUES_FOR_UI;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER__READ_ONLY = MVALUE__READ_ONLY;

	/**
	 * The number of structural features of the '<em>MParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPARAMETER_FEATURE_COUNT = MVALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MProperty <em>MProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MProperty
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMProperty()
	 * @generated
	 */
	public static final int MPROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__NAME = MVALUE__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__TYPE_NAME = MVALUE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__TYPE_NAME_FOR_UI = MVALUE__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__NAME_FOR_UI = MVALUE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__DESCRIPTION = MVALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__DESCRIPTION_FOR_UI = MVALUE__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__ICON_FILE_PATH = MVALUE__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__OVERLAY_ICON_FILE_PATH = MVALUE__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__COMPOSITE_CLASS_NAME = MVALUE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__SIMULATED = MVALUE__SIMULATED;

	/**
	 * The feature id for the '<em><b>MInput Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__MINPUT_VALUES = MVALUE__MINPUT_VALUES;

	/**
	 * The feature id for the '<em><b>Value For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__VALUE_FOR_UI = MVALUE__VALUE_FOR_UI;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__VALUE = MVALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__HISTORIC_VALUES = MVALUE__HISTORIC_VALUES;

	/**
	 * The feature id for the '<em><b>Historic Values For UI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__HISTORIC_VALUES_FOR_UI = MVALUE__HISTORIC_VALUES_FOR_UI;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY__READ_ONLY = MVALUE__READ_ONLY;

	/**
	 * The number of structural features of the '<em>MProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPROPERTY_FEATURE_COUNT = MVALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MResult <em>MResult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MResult
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMResult()
	 * @generated
	 */
	public static final int MRESULT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__NAME = MVALUE__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__TYPE_NAME = MVALUE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__TYPE_NAME_FOR_UI = MVALUE__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__NAME_FOR_UI = MVALUE__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__DESCRIPTION = MVALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__DESCRIPTION_FOR_UI = MVALUE__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__ICON_FILE_PATH = MVALUE__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__OVERLAY_ICON_FILE_PATH = MVALUE__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__COMPOSITE_CLASS_NAME = MVALUE__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__SIMULATED = MVALUE__SIMULATED;

	/**
	 * The feature id for the '<em><b>MInput Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__MINPUT_VALUES = MVALUE__MINPUT_VALUES;

	/**
	 * The feature id for the '<em><b>Value For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__VALUE_FOR_UI = MVALUE__VALUE_FOR_UI;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__VALUE = MVALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__HISTORIC_VALUES = MVALUE__HISTORIC_VALUES;

	/**
	 * The feature id for the '<em><b>Historic Values For UI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__HISTORIC_VALUES_FOR_UI = MVALUE__HISTORIC_VALUES_FOR_UI;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT__READ_ONLY = MVALUE__READ_ONLY;

	/**
	 * The number of structural features of the '<em>MResult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRESULT_FEATURE_COUNT = MVALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MStatefulObject <em>MStateful Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject()
	 * @generated
	 */
	public static final int MSTATEFUL_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__NAME = MOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__TYPE_NAME = MOBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__TYPE_NAME_FOR_UI = MOBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__NAME_FOR_UI = MOBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__DESCRIPTION = MOBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__DESCRIPTION_FOR_UI = MOBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__ICON_FILE_PATH = MOBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__OVERLAY_ICON_FILE_PATH = MOBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__COMPOSITE_CLASS_NAME = MOBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__SIMULATED = MOBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__MNAME_PROPERTY = MOBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__MDESCRIPTION_PROPERTY = MOBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__MICON_FILE_PATH_PROPERTY = MOBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__FIXED_MPROPERTIES = MOBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__FIXED_MSTEPS = MOBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__MSTATE_PROPERTY = MOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY = MOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY = MOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MStateful Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTATEFUL_OBJECT_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MStep <em>MStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep()
	 * @generated
	 */
	public static final int MSTEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__NAME = MSTATEFUL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__TYPE_NAME = MSTATEFUL_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__TYPE_NAME_FOR_UI = MSTATEFUL_OBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__NAME_FOR_UI = MSTATEFUL_OBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__DESCRIPTION = MSTATEFUL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__DESCRIPTION_FOR_UI = MSTATEFUL_OBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__ICON_FILE_PATH = MSTATEFUL_OBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__OVERLAY_ICON_FILE_PATH = MSTATEFUL_OBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__COMPOSITE_CLASS_NAME = MSTATEFUL_OBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__SIMULATED = MSTATEFUL_OBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MNAME_PROPERTY = MSTATEFUL_OBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MDESCRIPTION_PROPERTY = MSTATEFUL_OBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MICON_FILE_PATH_PROPERTY = MSTATEFUL_OBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__FIXED_MPROPERTIES = MSTATEFUL_OBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__FIXED_MSTEPS = MSTATEFUL_OBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MSTATE_PROPERTY = MSTATEFUL_OBJECT__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MLAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__LAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MINPUT_STEPS = MSTATEFUL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__FIXED_MPARAMETERS = MSTATEFUL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__FIXED_MRESULTS = MSTATEFUL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__EXCLUSIVE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__STATE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MPROGRESS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__PROGRESS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MPROGRESS_STATUS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__PROGRESS_STATUS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__MSTART_TRIGGER_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__START_TRIGGER_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__INTERRUPTABLE = MSTATEFUL_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__STOPPABLE = MSTATEFUL_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__TERMINATABLE = MSTATEFUL_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__ACTION_NAME = MSTATEFUL_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP__EXCEPTION = MSTATEFUL_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>MStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSTEP_FEATURE_COUNT = MSTATEFUL_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MApplication <em>MApplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MApplication
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication()
	 * @generated
	 */
	public static final int MAPPLICATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__NAME = MOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__TYPE_NAME = MOBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__TYPE_NAME_FOR_UI = MOBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__NAME_FOR_UI = MOBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__DESCRIPTION = MOBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__DESCRIPTION_FOR_UI = MOBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__ICON_FILE_PATH = MOBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__OVERLAY_ICON_FILE_PATH = MOBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__COMPOSITE_CLASS_NAME = MOBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__SIMULATED = MOBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MNAME_PROPERTY = MOBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MDESCRIPTION_PROPERTY = MOBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MICON_FILE_PATH_PROPERTY = MOBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__FIXED_MPROPERTIES = MOBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__FIXED_MSTEPS = MOBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MData File Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MDATA_FILE_PROPERTY = MOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__DATA_FILE_PROPERTY = MOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data File Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES = MOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MLog File Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MLOG_FILE_PROPERTY = MOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Log File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__LOG_FILE_PROPERTY = MOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MPath Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MPATH_PROPERTY = MOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__PATH_PROPERTY = MOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MVersion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MVERSION_PROPERTY = MOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__VERSION_PROPERTY = MOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MLast Save Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__MLAST_SAVE_PROPERTY = MOBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Save Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION__LAST_SAVE_PROPERTY = MOBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>MApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAPPLICATION_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MScript <em>MScript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MScript
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript()
	 * @generated
	 */
	public static final int MSCRIPT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__NAME = MSTATEFUL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__TYPE_NAME = MSTATEFUL_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__TYPE_NAME_FOR_UI = MSTATEFUL_OBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__NAME_FOR_UI = MSTATEFUL_OBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__DESCRIPTION = MSTATEFUL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__DESCRIPTION_FOR_UI = MSTATEFUL_OBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__ICON_FILE_PATH = MSTATEFUL_OBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__OVERLAY_ICON_FILE_PATH = MSTATEFUL_OBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__COMPOSITE_CLASS_NAME = MSTATEFUL_OBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__SIMULATED = MSTATEFUL_OBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MNAME_PROPERTY = MSTATEFUL_OBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MDESCRIPTION_PROPERTY = MSTATEFUL_OBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MICON_FILE_PATH_PROPERTY = MSTATEFUL_OBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__FIXED_MPROPERTIES = MSTATEFUL_OBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__FIXED_MSTEPS = MSTATEFUL_OBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MSTATE_PROPERTY = MSTATEFUL_OBJECT__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MLAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__LAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MSteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MSTEPS = MSTATEFUL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__STATE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MPROGRESS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__PROGRESS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__MPROGRESS_STATUS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT__PROGRESS_STATUS_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MSCRIPT_FEATURE_COUNT = MSTATEFUL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MDmsApplication <em>MDms Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication()
	 * @generated
	 */
	public static final int MDMS_APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__NAME = MAPPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__TYPE_NAME = MAPPLICATION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__TYPE_NAME_FOR_UI = MAPPLICATION__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__NAME_FOR_UI = MAPPLICATION__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DESCRIPTION = MAPPLICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DESCRIPTION_FOR_UI = MAPPLICATION__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__ICON_FILE_PATH = MAPPLICATION__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__OVERLAY_ICON_FILE_PATH = MAPPLICATION__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__COMPOSITE_CLASS_NAME = MAPPLICATION__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SIMULATED = MAPPLICATION__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MNAME_PROPERTY = MAPPLICATION__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MDESCRIPTION_PROPERTY = MAPPLICATION__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MICON_FILE_PATH_PROPERTY = MAPPLICATION__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FIXED_MPROPERTIES = MAPPLICATION__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FIXED_MSTEPS = MAPPLICATION__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MData File Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MDATA_FILE_PROPERTY = MAPPLICATION__MDATA_FILE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Data File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DATA_FILE_PROPERTY = MAPPLICATION__DATA_FILE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Data File Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES = MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES;

	/**
	 * The feature id for the '<em><b>MLog File Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MLOG_FILE_PROPERTY = MAPPLICATION__MLOG_FILE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Log File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__LOG_FILE_PROPERTY = MAPPLICATION__LOG_FILE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MPath Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MPATH_PROPERTY = MAPPLICATION__MPATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__PATH_PROPERTY = MAPPLICATION__PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>MVersion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MVERSION_PROPERTY = MAPPLICATION__MVERSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Version Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__VERSION_PROPERTY = MAPPLICATION__VERSION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast Save Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MLAST_SAVE_PROPERTY = MAPPLICATION__MLAST_SAVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last Save Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__LAST_SAVE_PROPERTY = MAPPLICATION__LAST_SAVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MService File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service File Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MWwx Files Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wwx Files Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMp3 Encoder Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mp3 Encoder Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY = MAPPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY = MAPPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MFtp User Name Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY = MAPPLICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ftp User Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FTP_USER_NAME_PROPERTY = MAPPLICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ftp User Name Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MFtp User Password Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY = MAPPLICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ftp User Password Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY = MAPPLICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>MWeb Server Url Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY = MAPPLICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Web Server Url Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY = MAPPLICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Web Server Url Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>MSmtp Server Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MSMTP_SERVER_PROPERTY = MAPPLICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Smtp Server Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SMTP_SERVER_PROPERTY = MAPPLICATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Smtp Server Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>MSmtp User Name Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY = MAPPLICATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Smtp User Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY = MAPPLICATION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Smtp User Name Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>MSmtp Password Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY = MAPPLICATION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Smtp Password Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY = MAPPLICATION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>MBurning Software Directory Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Burning Software Directory Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>MDrive Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MDRIVE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Drive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DRIVE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Drive Property Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES = MAPPLICATION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>MUpgrade Message Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Upgrade Message Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = MAPPLICATION_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>MLast Upgrade Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Last Upgrade Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__LAST_UPGRADE_PROPERTY = MAPPLICATION_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>MGet Data Upgrade Info Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP = MAPPLICATION_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>MUpgrade Data Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MUPGRADE_DATA_STEP = MAPPLICATION_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>MScripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MSCRIPTS = MAPPLICATION_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>MMp3 Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION__MMP3_FOLDERS = MAPPLICATION_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>MDms Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_FEATURE_COUNT = MAPPLICATION_FEATURE_COUNT + 40;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MEnterInformationStep <em>MEnter Information Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MEnterInformationStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterInformationStep()
	 * @generated
	 */
	public static final int MENTER_INFORMATION_STEP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The number of structural features of the '<em>MEnter Information Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_INFORMATION_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep <em>MEnter Wwx Information Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep()
	 * @generated
	 */
	public static final int MENTER_WWX_INFORMATION_STEP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__NAME = MENTER_INFORMATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__TYPE_NAME = MENTER_INFORMATION_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__TYPE_NAME_FOR_UI = MENTER_INFORMATION_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__NAME_FOR_UI = MENTER_INFORMATION_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__DESCRIPTION = MENTER_INFORMATION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__DESCRIPTION_FOR_UI = MENTER_INFORMATION_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__ICON_FILE_PATH = MENTER_INFORMATION_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__OVERLAY_ICON_FILE_PATH = MENTER_INFORMATION_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__COMPOSITE_CLASS_NAME = MENTER_INFORMATION_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SIMULATED = MENTER_INFORMATION_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MNAME_PROPERTY = MENTER_INFORMATION_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MDESCRIPTION_PROPERTY = MENTER_INFORMATION_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MICON_FILE_PATH_PROPERTY = MENTER_INFORMATION_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIXED_MPROPERTIES = MENTER_INFORMATION_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIXED_MSTEPS = MENTER_INFORMATION_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSTATE_PROPERTY = MENTER_INFORMATION_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MLAST_STATE_CHANGE_PROPERTY = MENTER_INFORMATION_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__LAST_STATE_CHANGE_PROPERTY = MENTER_INFORMATION_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MINPUT_STEPS = MENTER_INFORMATION_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIXED_MPARAMETERS = MENTER_INFORMATION_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIXED_MRESULTS = MENTER_INFORMATION_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__EXCLUSIVE_PROPERTY = MENTER_INFORMATION_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__STATE_PROPERTY = MENTER_INFORMATION_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MPROGRESS_PROPERTY = MENTER_INFORMATION_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__PROGRESS_PROPERTY = MENTER_INFORMATION_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MPROGRESS_STATUS_PROPERTY = MENTER_INFORMATION_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__PROGRESS_STATUS_PROPERTY = MENTER_INFORMATION_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSTART_TRIGGER_PROPERTY = MENTER_INFORMATION_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__START_TRIGGER_PROPERTY = MENTER_INFORMATION_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__INTERRUPTABLE = MENTER_INFORMATION_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__STOPPABLE = MENTER_INFORMATION_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__TERMINATABLE = MENTER_INFORMATION_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__ACTION_NAME = MENTER_INFORMATION_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__EXCEPTION = MENTER_INFORMATION_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MWwx Date Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wwx Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title Of Talk Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MSpeakers Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Speakers Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Speakers Name Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MFirst Part Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>First Part Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>First Part Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MSecond Part Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Second Part Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Second Part Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Recording Users Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Recording Users Name Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>MWwx Date Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Wwx Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>MTitle Of Talk Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Title Of Talk Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>MSpeakers Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Speakers Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>MFirst Part Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>First Part Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>MSecond Part Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Second Part Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>MRecording Users Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Recording Users Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>MEnter Wwx Information Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_WWX_INFORMATION_STEP_FEATURE_COUNT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 28;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep <em>MEnter Service Information Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep()
	 * @generated
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__NAME = MENTER_INFORMATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__TYPE_NAME = MENTER_INFORMATION_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__TYPE_NAME_FOR_UI = MENTER_INFORMATION_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__NAME_FOR_UI = MENTER_INFORMATION_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__DESCRIPTION = MENTER_INFORMATION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__DESCRIPTION_FOR_UI = MENTER_INFORMATION_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__ICON_FILE_PATH = MENTER_INFORMATION_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__OVERLAY_ICON_FILE_PATH = MENTER_INFORMATION_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__COMPOSITE_CLASS_NAME = MENTER_INFORMATION_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SIMULATED = MENTER_INFORMATION_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MNAME_PROPERTY = MENTER_INFORMATION_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MDESCRIPTION_PROPERTY = MENTER_INFORMATION_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MICON_FILE_PATH_PROPERTY = MENTER_INFORMATION_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__FIXED_MPROPERTIES = MENTER_INFORMATION_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__FIXED_MSTEPS = MENTER_INFORMATION_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSTATE_PROPERTY = MENTER_INFORMATION_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MLAST_STATE_CHANGE_PROPERTY = MENTER_INFORMATION_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__LAST_STATE_CHANGE_PROPERTY = MENTER_INFORMATION_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MINPUT_STEPS = MENTER_INFORMATION_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__FIXED_MPARAMETERS = MENTER_INFORMATION_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__FIXED_MRESULTS = MENTER_INFORMATION_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__EXCLUSIVE_PROPERTY = MENTER_INFORMATION_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__STATE_PROPERTY = MENTER_INFORMATION_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MPROGRESS_PROPERTY = MENTER_INFORMATION_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__PROGRESS_PROPERTY = MENTER_INFORMATION_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MPROGRESS_STATUS_PROPERTY = MENTER_INFORMATION_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__PROGRESS_STATUS_PROPERTY = MENTER_INFORMATION_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSTART_TRIGGER_PROPERTY = MENTER_INFORMATION_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__START_TRIGGER_PROPERTY = MENTER_INFORMATION_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__INTERRUPTABLE = MENTER_INFORMATION_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__STOPPABLE = MENTER_INFORMATION_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__TERMINATABLE = MENTER_INFORMATION_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__ACTION_NAME = MENTER_INFORMATION_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__EXCEPTION = MENTER_INFORMATION_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MService Date Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MService Type Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Type Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Type Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title Of Talk Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MReading Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reading Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MSpeakers Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Speakers Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Speakers Name Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Recording Users Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER = MENTER_INFORMATION_STEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Recording Users Name Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES = MENTER_INFORMATION_STEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>MService Date Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Service Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>MService Type Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Service Type Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>MTitle Of Talk Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Title Of Talk Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>MReading Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Reading Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__READING_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>MSpeakers Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Speakers Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>MRecording Users Name Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Recording Users Name Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>MEnter Service Information Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MENTER_SERVICE_INFORMATION_STEP_FEATURE_COUNT = MENTER_INFORMATION_STEP_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep <em>MCreate Directory Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep()
	 * @generated
	 */
	public static final int MCREATE_DIRECTORY_STEP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MParent Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Directory Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MDirectory Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Directory Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MDirectory Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Directory Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MCreate Directory Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCREATE_DIRECTORY_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep <em>MCheck Free Disk Space Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MRequired Free Disk Space Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Free Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MDirectory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MFree Disk Space Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Free Disk Space Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MCheck Free Disk Space Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_FREE_DISK_SPACE_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MAudioStep <em>MAudio Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MAudioStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep()
	 * @generated
	 */
	public static final int MAUDIO_STEP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MLeft Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MRight Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MLeft Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MRight Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Right Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY = MSTEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MUse Db Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MUSE_DB_PROPERTY = MSTEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Use Db Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__USE_DB_PROPERTY = MSTEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MHeadroom Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__MHEADROOM_PROPERTY = MSTEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Headroom Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP__HEADROOM_PROPERTY = MSTEP_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>MAudio Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAUDIO_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MCheckInputLevelsStep <em>MCheck Input Levels Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MCheckInputLevelsStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckInputLevelsStep()
	 * @generated
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__NAME = MAUDIO_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__TYPE_NAME = MAUDIO_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__TYPE_NAME_FOR_UI = MAUDIO_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__NAME_FOR_UI = MAUDIO_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__DESCRIPTION = MAUDIO_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__DESCRIPTION_FOR_UI = MAUDIO_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__ICON_FILE_PATH = MAUDIO_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__OVERLAY_ICON_FILE_PATH = MAUDIO_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__COMPOSITE_CLASS_NAME = MAUDIO_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__SIMULATED = MAUDIO_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MNAME_PROPERTY = MAUDIO_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MDESCRIPTION_PROPERTY = MAUDIO_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MICON_FILE_PATH_PROPERTY = MAUDIO_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__FIXED_MPROPERTIES = MAUDIO_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__FIXED_MSTEPS = MAUDIO_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MSTATE_PROPERTY = MAUDIO_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MLAST_STATE_CHANGE_PROPERTY = MAUDIO_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__LAST_STATE_CHANGE_PROPERTY = MAUDIO_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MINPUT_STEPS = MAUDIO_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__FIXED_MPARAMETERS = MAUDIO_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__FIXED_MRESULTS = MAUDIO_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__EXCLUSIVE_PROPERTY = MAUDIO_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__STATE_PROPERTY = MAUDIO_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MPROGRESS_PROPERTY = MAUDIO_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__PROGRESS_PROPERTY = MAUDIO_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MPROGRESS_STATUS_PROPERTY = MAUDIO_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__PROGRESS_STATUS_PROPERTY = MAUDIO_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MSTART_TRIGGER_PROPERTY = MAUDIO_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__START_TRIGGER_PROPERTY = MAUDIO_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__INTERRUPTABLE = MAUDIO_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__STOPPABLE = MAUDIO_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__TERMINATABLE = MAUDIO_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__ACTION_NAME = MAUDIO_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__EXCEPTION = MAUDIO_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MLeft Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MLEFT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>Left Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__LEFT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>MRight Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MRIGHT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>Right Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__RIGHT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLeft Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MLEFT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Left Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__LEFT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MRight Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Right Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__RIGHT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MUse Db Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MUSE_DB_PROPERTY = MAUDIO_STEP__MUSE_DB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Use Db Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__USE_DB_PROPERTY = MAUDIO_STEP__USE_DB_PROPERTY;

	/**
	 * The feature id for the '<em><b>MHeadroom Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__MHEADROOM_PROPERTY = MAUDIO_STEP__MHEADROOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Headroom Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP__HEADROOM_PROPERTY = MAUDIO_STEP__HEADROOM_PROPERTY;

	/**
	 * The number of structural features of the '<em>MCheck Input Levels Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCHECK_INPUT_LEVELS_STEP_FEATURE_COUNT = MAUDIO_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MRecordStep <em>MRecord Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MRecordStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep()
	 * @generated
	 */
	public static final int MRECORD_STEP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__NAME = MAUDIO_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__TYPE_NAME = MAUDIO_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__TYPE_NAME_FOR_UI = MAUDIO_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__NAME_FOR_UI = MAUDIO_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__DESCRIPTION = MAUDIO_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__DESCRIPTION_FOR_UI = MAUDIO_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__ICON_FILE_PATH = MAUDIO_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__OVERLAY_ICON_FILE_PATH = MAUDIO_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__COMPOSITE_CLASS_NAME = MAUDIO_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__SIMULATED = MAUDIO_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MNAME_PROPERTY = MAUDIO_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MDESCRIPTION_PROPERTY = MAUDIO_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MICON_FILE_PATH_PROPERTY = MAUDIO_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__FIXED_MPROPERTIES = MAUDIO_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__FIXED_MSTEPS = MAUDIO_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MSTATE_PROPERTY = MAUDIO_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MLAST_STATE_CHANGE_PROPERTY = MAUDIO_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__LAST_STATE_CHANGE_PROPERTY = MAUDIO_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MINPUT_STEPS = MAUDIO_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__FIXED_MPARAMETERS = MAUDIO_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__FIXED_MRESULTS = MAUDIO_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__EXCLUSIVE_PROPERTY = MAUDIO_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__STATE_PROPERTY = MAUDIO_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MPROGRESS_PROPERTY = MAUDIO_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__PROGRESS_PROPERTY = MAUDIO_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MPROGRESS_STATUS_PROPERTY = MAUDIO_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__PROGRESS_STATUS_PROPERTY = MAUDIO_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MSTART_TRIGGER_PROPERTY = MAUDIO_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__START_TRIGGER_PROPERTY = MAUDIO_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__INTERRUPTABLE = MAUDIO_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__STOPPABLE = MAUDIO_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__TERMINATABLE = MAUDIO_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__ACTION_NAME = MAUDIO_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__EXCEPTION = MAUDIO_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MLeft Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MLEFT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>Left Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__LEFT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>MRight Input Level Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRIGHT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>Right Input Level Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RIGHT_INPUT_LEVEL_PROPERTY = MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLeft Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MLEFT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Left Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__LEFT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MRight Input Distortion Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Right Input Distortion Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RIGHT_INPUT_DISTORTION_PROPERTY = MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MUse Db Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MUSE_DB_PROPERTY = MAUDIO_STEP__MUSE_DB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Use Db Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__USE_DB_PROPERTY = MAUDIO_STEP__USE_DB_PROPERTY;

	/**
	 * The feature id for the '<em><b>MHeadroom Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MHEADROOM_PROPERTY = MAUDIO_STEP__MHEADROOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Headroom Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__HEADROOM_PROPERTY = MAUDIO_STEP__HEADROOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDirectory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MDIRECTORY_PARAMETER = MAUDIO_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__DIRECTORY_PARAMETER = MAUDIO_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MRecording File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRECORDING_FILE_PARAMETER = MAUDIO_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recording File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RECORDING_FILE_PARAMETER = MAUDIO_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MRecording File Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRECORDING_FILE_RESULT = MAUDIO_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recording File Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RECORDING_FILE_RESULT = MAUDIO_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MRecording File Size Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT = MAUDIO_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Recording File Size Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RECORDING_FILE_SIZE_RESULT = MAUDIO_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MRecording Length Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__MRECORDING_LENGTH_RESULT = MAUDIO_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Recording Length Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP__RECORDING_LENGTH_RESULT = MAUDIO_STEP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>MRecord Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MRECORD_STEP_FEATURE_COUNT = MAUDIO_STEP_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step <em>MConvert To MP3 Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step()
	 * @generated
	 */
	public static final int MCONVERT_TO_MP3_STEP = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MArtist Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artist Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTitle Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__TITLE_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MAlbum Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Album Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MYear Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Year Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__YEAR_PARAMETER = MSTEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MDirectory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Directory Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER = MSTEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MMp3 File Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mp3 File Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MRecording File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Recording File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>MMp3 Encoder Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER = MSTEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Mp3 Encoder Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER = MSTEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>MAverage Bit Rate Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER = MSTEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Average Bit Rate Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER = MSTEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER = MSTEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER = MSTEP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>MMp3 Entry Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Mp3 Entry Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>MMp3 Entry Reference Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT = MSTEP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Mp3 Entry Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT = MSTEP_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>MConvert To MP3 Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MCONVERT_TO_MP3_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep <em>MPublish Mp3s Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep()
	 * @generated
	 */
	public static final int MPUBLISH_MP3S_STEP = 20;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep <em>MUpdate Published Mp3s Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP = 21;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step <em>MPublish New Mp3 Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step()
	 * @generated
	 */
	public static final int MPUBLISH_NEW_MP3_STEP = 22;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep <em>MEmail Event Log Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep()
	 * @generated
	 */
	public static final int MEMAIL_EVENT_LOG_STEP = 23;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MMp3Folder <em>MMp3 Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MMp3Folder
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3Folder()
	 * @generated
	 */
	public static final int MMP3_FOLDER = 24;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MMp3 <em>MMp3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MMp3
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3()
	 * @generated
	 */
	public static final int MMP3 = 25;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep <em>MBurn Cd Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep()
	 * @generated
	 */
	public static final int MBURN_CD_STEP = 26;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MFtpStep <em>MFtp Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MFtpStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep()
	 * @generated
	 */
	public static final int MFTP_STEP = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MFTP_SERVER_URL_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FTP_SERVER_URL_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MFTP_USER_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FTP_USER_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP__FTP_USER_PASSWORD_PARAMETER = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MFtp Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MFTP_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__NAME = MFTP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__TYPE_NAME = MFTP_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__TYPE_NAME_FOR_UI = MFTP_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__NAME_FOR_UI = MFTP_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__DESCRIPTION = MFTP_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__DESCRIPTION_FOR_UI = MFTP_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__ICON_FILE_PATH = MFTP_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__OVERLAY_ICON_FILE_PATH = MFTP_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__COMPOSITE_CLASS_NAME = MFTP_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__SIMULATED = MFTP_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MNAME_PROPERTY = MFTP_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MDESCRIPTION_PROPERTY = MFTP_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MICON_FILE_PATH_PROPERTY = MFTP_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FIXED_MPROPERTIES = MFTP_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FIXED_MSTEPS = MFTP_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MSTATE_PROPERTY = MFTP_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MLAST_STATE_CHANGE_PROPERTY = MFTP_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__LAST_STATE_CHANGE_PROPERTY = MFTP_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MINPUT_STEPS = MFTP_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FIXED_MPARAMETERS = MFTP_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FIXED_MRESULTS = MFTP_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__EXCLUSIVE_PROPERTY = MFTP_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__STATE_PROPERTY = MFTP_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MPROGRESS_PROPERTY = MFTP_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__PROGRESS_PROPERTY = MFTP_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MPROGRESS_STATUS_PROPERTY = MFTP_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__PROGRESS_STATUS_PROPERTY = MFTP_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MSTART_TRIGGER_PROPERTY = MFTP_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__START_TRIGGER_PROPERTY = MFTP_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__INTERRUPTABLE = MFTP_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__STOPPABLE = MFTP_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__TERMINATABLE = MFTP_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__ACTION_NAME = MFTP_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__EXCEPTION = MFTP_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MFTP_SERVER_URL_PARAMETER = MFTP_STEP__MFTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FTP_SERVER_URL_PARAMETER = MFTP_STEP__FTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MFTP_USER_NAME_PARAMETER = MFTP_STEP__MFTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FTP_USER_NAME_PARAMETER = MFTP_STEP__FTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MFTP_USER_PASSWORD_PARAMETER = MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__FTP_USER_PASSWORD_PARAMETER = MFTP_STEP__FTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMaxiumum Disk Space Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maxiumum Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MMp3 Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mp3 Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MWeb Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER = MFTP_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Web Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER = MFTP_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MContent Page Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Content Page Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MContent Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MContent Footer File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content Footer File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MContent Page File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Content Page File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>MPodcast File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Podcast File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>MPodcast Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Podcast Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>MPodcast Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Podcast Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER = MFTP_STEP_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>MPublish Mp3s Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_MP3S_STEP_FEATURE_COUNT = MFTP_STEP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__NAME = MPUBLISH_MP3S_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__TYPE_NAME = MPUBLISH_MP3S_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__TYPE_NAME_FOR_UI = MPUBLISH_MP3S_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__NAME_FOR_UI = MPUBLISH_MP3S_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__DESCRIPTION = MPUBLISH_MP3S_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__DESCRIPTION_FOR_UI = MPUBLISH_MP3S_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__ICON_FILE_PATH = MPUBLISH_MP3S_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__OVERLAY_ICON_FILE_PATH = MPUBLISH_MP3S_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__COMPOSITE_CLASS_NAME = MPUBLISH_MP3S_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__SIMULATED = MPUBLISH_MP3S_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MNAME_PROPERTY = MPUBLISH_MP3S_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MDESCRIPTION_PROPERTY = MPUBLISH_MP3S_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MICON_FILE_PATH_PROPERTY = MPUBLISH_MP3S_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FIXED_MPROPERTIES = MPUBLISH_MP3S_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FIXED_MSTEPS = MPUBLISH_MP3S_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MSTATE_PROPERTY = MPUBLISH_MP3S_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MLAST_STATE_CHANGE_PROPERTY = MPUBLISH_MP3S_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__LAST_STATE_CHANGE_PROPERTY = MPUBLISH_MP3S_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MINPUT_STEPS = MPUBLISH_MP3S_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FIXED_MPARAMETERS = MPUBLISH_MP3S_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FIXED_MRESULTS = MPUBLISH_MP3S_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__EXCLUSIVE_PROPERTY = MPUBLISH_MP3S_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__STATE_PROPERTY = MPUBLISH_MP3S_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MPROGRESS_PROPERTY = MPUBLISH_MP3S_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__PROGRESS_PROPERTY = MPUBLISH_MP3S_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MPROGRESS_STATUS_PROPERTY = MPUBLISH_MP3S_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__PROGRESS_STATUS_PROPERTY = MPUBLISH_MP3S_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MSTART_TRIGGER_PROPERTY = MPUBLISH_MP3S_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__START_TRIGGER_PROPERTY = MPUBLISH_MP3S_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__INTERRUPTABLE = MPUBLISH_MP3S_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__STOPPABLE = MPUBLISH_MP3S_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__TERMINATABLE = MPUBLISH_MP3S_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__ACTION_NAME = MPUBLISH_MP3S_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__EXCEPTION = MPUBLISH_MP3S_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MFTP_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FTP_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__FTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MFTP_USER_NAME_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FTP_USER_NAME_PARAMETER = MPUBLISH_MP3S_STEP__FTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MFTP_USER_PASSWORD_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__FTP_USER_PASSWORD_PARAMETER = MPUBLISH_MP3S_STEP__FTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMaxiumum Disk Space Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER = MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Maxiumum Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER = MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMp3 Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Mp3 Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MWeb Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MWEB_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Web Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__WEB_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Page Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Page Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Footer File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Footer File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Page File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Page File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MRepublish Mp3 Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Republish Mp3 Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMp3 Folder Reference Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mp3 Folder Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MUpdate Published Mp3s Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUPDATE_PUBLISHED_MP3S_STEP_FEATURE_COUNT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__NAME = MPUBLISH_MP3S_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__TYPE_NAME = MPUBLISH_MP3S_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__TYPE_NAME_FOR_UI = MPUBLISH_MP3S_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__NAME_FOR_UI = MPUBLISH_MP3S_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__DESCRIPTION = MPUBLISH_MP3S_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__DESCRIPTION_FOR_UI = MPUBLISH_MP3S_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__ICON_FILE_PATH = MPUBLISH_MP3S_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__OVERLAY_ICON_FILE_PATH = MPUBLISH_MP3S_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__COMPOSITE_CLASS_NAME = MPUBLISH_MP3S_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__SIMULATED = MPUBLISH_MP3S_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MNAME_PROPERTY = MPUBLISH_MP3S_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MDESCRIPTION_PROPERTY = MPUBLISH_MP3S_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MICON_FILE_PATH_PROPERTY = MPUBLISH_MP3S_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FIXED_MPROPERTIES = MPUBLISH_MP3S_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FIXED_MSTEPS = MPUBLISH_MP3S_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MSTATE_PROPERTY = MPUBLISH_MP3S_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MLAST_STATE_CHANGE_PROPERTY = MPUBLISH_MP3S_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__LAST_STATE_CHANGE_PROPERTY = MPUBLISH_MP3S_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MINPUT_STEPS = MPUBLISH_MP3S_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FIXED_MPARAMETERS = MPUBLISH_MP3S_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FIXED_MRESULTS = MPUBLISH_MP3S_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__EXCLUSIVE_PROPERTY = MPUBLISH_MP3S_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__STATE_PROPERTY = MPUBLISH_MP3S_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPROGRESS_PROPERTY = MPUBLISH_MP3S_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PROGRESS_PROPERTY = MPUBLISH_MP3S_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPROGRESS_STATUS_PROPERTY = MPUBLISH_MP3S_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PROGRESS_STATUS_PROPERTY = MPUBLISH_MP3S_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MSTART_TRIGGER_PROPERTY = MPUBLISH_MP3S_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__START_TRIGGER_PROPERTY = MPUBLISH_MP3S_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__INTERRUPTABLE = MPUBLISH_MP3S_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__STOPPABLE = MPUBLISH_MP3S_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__TERMINATABLE = MPUBLISH_MP3S_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__ACTION_NAME = MPUBLISH_MP3S_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__EXCEPTION = MPUBLISH_MP3S_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MFTP_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FTP_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__FTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MFTP_USER_NAME_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FTP_USER_NAME_PARAMETER = MPUBLISH_MP3S_STEP__FTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MFTP_USER_PASSWORD_PARAMETER = MPUBLISH_MP3S_STEP__MFTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__FTP_USER_PASSWORD_PARAMETER = MPUBLISH_MP3S_STEP__FTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMaxiumum Disk Space Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER = MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Maxiumum Disk Space Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MAXIUMUM_DISK_SPACE_PARAMETER = MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMp3 Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Mp3 Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MWeb Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MWEB_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Web Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__WEB_SERVER_URL_PARAMETER = MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Page Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Page Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Footer File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Footer File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MContent Page File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Content Page File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast Relative Ftp Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast Relative Ftp Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MPodcast Header File Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>Podcast Header File Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER = MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER;

	/**
	 * The feature id for the '<em><b>MMp3 Entry Reference Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mp3 Entry Reference Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MLink Text Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Text Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MLink Description Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link Description Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MComment Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comment Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MPodcast Title Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Podcast Title Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MPodcast Subtitle Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Podcast Subtitle Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>MPodcast Summary Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Podcast Summary Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>MPodcast Publishing Date Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Podcast Publishing Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>MPublished Mp3 Entry Reference Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Published Mp3 Entry Reference Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>MPublish New Mp3 Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MPUBLISH_NEW_MP3_STEP_FEATURE_COUNT = MPUBLISH_MP3S_STEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recording Users Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MComment Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MLog File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Log File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MData File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER = MSTEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MSubject Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER = MSTEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subject Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER = MSTEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MSenders Email Address Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER = MSTEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Senders Email Address Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER = MSTEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Senders Email Address Parameter Historic Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES = MSTEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>MReceipients Email Address Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER = MSTEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Receipients Email Address Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER = MSTEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>MSmtp Server Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER = MSTEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Smtp Server Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER = MSTEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>MSmtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Smtp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER = MSTEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>MSmtp Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER = MSTEP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Smtp Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER = MSTEP_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>MEmail Event Log Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEMAIL_EVENT_LOG_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__NAME = MOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__TYPE_NAME = MOBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__TYPE_NAME_FOR_UI = MOBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__NAME_FOR_UI = MOBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__DESCRIPTION = MOBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__DESCRIPTION_FOR_UI = MOBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__ICON_FILE_PATH = MOBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__OVERLAY_ICON_FILE_PATH = MOBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__COMPOSITE_CLASS_NAME = MOBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__SIMULATED = MOBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__MNAME_PROPERTY = MOBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__MDESCRIPTION_PROPERTY = MOBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__MICON_FILE_PATH_PROPERTY = MOBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__FIXED_MPROPERTIES = MOBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__FIXED_MSTEPS = MOBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MSteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__MSTEPS = MOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MMp3s</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER__MMP3S = MOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMp3 Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FOLDER_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__NAME = MSTATEFUL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__TYPE_NAME = MSTATEFUL_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__TYPE_NAME_FOR_UI = MSTATEFUL_OBJECT__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__NAME_FOR_UI = MSTATEFUL_OBJECT__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__DESCRIPTION = MSTATEFUL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__DESCRIPTION_FOR_UI = MSTATEFUL_OBJECT__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__ICON_FILE_PATH = MSTATEFUL_OBJECT__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__OVERLAY_ICON_FILE_PATH = MSTATEFUL_OBJECT__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__COMPOSITE_CLASS_NAME = MSTATEFUL_OBJECT__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__SIMULATED = MSTATEFUL_OBJECT__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MNAME_PROPERTY = MSTATEFUL_OBJECT__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MDESCRIPTION_PROPERTY = MSTATEFUL_OBJECT__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MICON_FILE_PATH_PROPERTY = MSTATEFUL_OBJECT__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__FIXED_MPROPERTIES = MSTATEFUL_OBJECT__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__FIXED_MSTEPS = MSTATEFUL_OBJECT__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MSTATE_PROPERTY = MSTATEFUL_OBJECT__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MLAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__LAST_STATE_CHANGE_PROPERTY = MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__STATE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MFile Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MFILE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__FILE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MLink Text Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MLINK_TEXT_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link Text Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__LINK_TEXT_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MLink Description Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MLINK_DESCRIPTION_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Link Description Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__LINK_DESCRIPTION_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MComment Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MCOMMENT_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comment Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__COMMENT_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MPodcast Title Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MPODCAST_TITLE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Podcast Title Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__PODCAST_TITLE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>MPodcast Subtitle Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MPODCAST_SUBTITLE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Podcast Subtitle Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__PODCAST_SUBTITLE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>MPodcast Summary Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MPODCAST_SUMMARY_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Podcast Summary Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__PODCAST_SUMMARY_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>MPodcast Publishing Date Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Podcast Publishing Date Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__PODCAST_PUBLISHING_DATE_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>MPublished File Name Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__MPUBLISHED_FILE_NAME_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Published File Name Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3__PUBLISHED_FILE_NAME_PROPERTY = MSTATEFUL_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>MMp3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MMP3_FEATURE_COUNT = MSTATEFUL_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MRecording Files Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MRECORDING_FILES_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recording Files Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__RECORDING_FILES_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MBurning Software Directory Path Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Burning Software Directory Path Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MDrive Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MDRIVE_PARAMETER = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Drive Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__DRIVE_PARAMETER = MSTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MTotal Recording Length Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER = MSTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total Recording Length Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER = MSTEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MTotal Recording File Size Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER = MSTEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Total Recording File Size Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER = MSTEP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>MBurn Cd Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MBURN_CD_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MTestStep <em>MTest Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MTestStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep()
	 * @generated
	 */
	public static final int MTEST_STEP = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__NAME = MSTEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__TYPE_NAME = MSTEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__TYPE_NAME_FOR_UI = MSTEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__NAME_FOR_UI = MSTEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__DESCRIPTION = MSTEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__DESCRIPTION_FOR_UI = MSTEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__ICON_FILE_PATH = MSTEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__OVERLAY_ICON_FILE_PATH = MSTEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__COMPOSITE_CLASS_NAME = MSTEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__SIMULATED = MSTEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MNAME_PROPERTY = MSTEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MDESCRIPTION_PROPERTY = MSTEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MICON_FILE_PATH_PROPERTY = MSTEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__FIXED_MPROPERTIES = MSTEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__FIXED_MSTEPS = MSTEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MSTATE_PROPERTY = MSTEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MLAST_STATE_CHANGE_PROPERTY = MSTEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__LAST_STATE_CHANGE_PROPERTY = MSTEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MINPUT_STEPS = MSTEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__FIXED_MPARAMETERS = MSTEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__FIXED_MRESULTS = MSTEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__EXCLUSIVE_PROPERTY = MSTEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__STATE_PROPERTY = MSTEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MPROGRESS_PROPERTY = MSTEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__PROGRESS_PROPERTY = MSTEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MPROGRESS_STATUS_PROPERTY = MSTEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__PROGRESS_STATUS_PROPERTY = MSTEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MSTART_TRIGGER_PROPERTY = MSTEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__START_TRIGGER_PROPERTY = MSTEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__INTERRUPTABLE = MSTEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__STOPPABLE = MSTEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__TERMINATABLE = MSTEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__ACTION_NAME = MSTEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__EXCEPTION = MSTEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MPersistent String Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MPERSISTENT_STRING_PARAMETER = MSTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistent String Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__PERSISTENT_STRING_PARAMETER = MSTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MString Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__MSTRING_PARAMETER = MSTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP__STRING_PARAMETER = MSTEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MTest Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MTEST_STEP_FEATURE_COUNT = MSTEP_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep <em>MDms Application MGet Data Upgrade Info Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__NAME = MFTP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__TYPE_NAME = MFTP_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__TYPE_NAME_FOR_UI = MFTP_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__NAME_FOR_UI = MFTP_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__DESCRIPTION = MFTP_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__DESCRIPTION_FOR_UI = MFTP_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__ICON_FILE_PATH = MFTP_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__OVERLAY_ICON_FILE_PATH = MFTP_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__COMPOSITE_CLASS_NAME = MFTP_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__SIMULATED = MFTP_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MNAME_PROPERTY = MFTP_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MDESCRIPTION_PROPERTY = MFTP_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MICON_FILE_PATH_PROPERTY = MFTP_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FIXED_MPROPERTIES = MFTP_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FIXED_MSTEPS = MFTP_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MSTATE_PROPERTY = MFTP_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MLAST_STATE_CHANGE_PROPERTY = MFTP_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__LAST_STATE_CHANGE_PROPERTY = MFTP_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MINPUT_STEPS = MFTP_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FIXED_MPARAMETERS = MFTP_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FIXED_MRESULTS = MFTP_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__EXCLUSIVE_PROPERTY = MFTP_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__STATE_PROPERTY = MFTP_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MPROGRESS_PROPERTY = MFTP_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__PROGRESS_PROPERTY = MFTP_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MPROGRESS_STATUS_PROPERTY = MFTP_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__PROGRESS_STATUS_PROPERTY = MFTP_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MSTART_TRIGGER_PROPERTY = MFTP_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__START_TRIGGER_PROPERTY = MFTP_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__INTERRUPTABLE = MFTP_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__STOPPABLE = MFTP_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__TERMINATABLE = MFTP_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__ACTION_NAME = MFTP_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__EXCEPTION = MFTP_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MFTP_SERVER_URL_PARAMETER = MFTP_STEP__MFTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FTP_SERVER_URL_PARAMETER = MFTP_STEP__FTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MFTP_USER_NAME_PARAMETER = MFTP_STEP__MFTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FTP_USER_NAME_PARAMETER = MFTP_STEP__FTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MFTP_USER_PASSWORD_PARAMETER = MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__FTP_USER_PASSWORD_PARAMETER = MFTP_STEP__FTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = MFTP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = MFTP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MUpgrade Available Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT = MFTP_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upgrade Available Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT = MFTP_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MUpgrade Message Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT = MFTP_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upgrade Message Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT = MFTP_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MUpgrade Date Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT = MFTP_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Upgrade Date Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT = MFTP_STEP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>MDms Application MGet Data Upgrade Info Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP_FEATURE_COUNT = MFTP_STEP_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep <em>MDms Application MUpgrade Data Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__NAME = MFTP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__TYPE_NAME = MFTP_STEP__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__TYPE_NAME_FOR_UI = MFTP_STEP__TYPE_NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Name For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__NAME_FOR_UI = MFTP_STEP__NAME_FOR_UI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__DESCRIPTION = MFTP_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description For UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__DESCRIPTION_FOR_UI = MFTP_STEP__DESCRIPTION_FOR_UI;

	/**
	 * The feature id for the '<em><b>Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__ICON_FILE_PATH = MFTP_STEP__ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Overlay Icon File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__OVERLAY_ICON_FILE_PATH = MFTP_STEP__OVERLAY_ICON_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Composite Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__COMPOSITE_CLASS_NAME = MFTP_STEP__COMPOSITE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Simulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__SIMULATED = MFTP_STEP__SIMULATED;

	/**
	 * The feature id for the '<em><b>MName Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MNAME_PROPERTY = MFTP_STEP__MNAME_PROPERTY;

	/**
	 * The feature id for the '<em><b>MDescription Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MDESCRIPTION_PROPERTY = MFTP_STEP__MDESCRIPTION_PROPERTY;

	/**
	 * The feature id for the '<em><b>MIcon File Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MICON_FILE_PATH_PROPERTY = MFTP_STEP__MICON_FILE_PATH_PROPERTY;

	/**
	 * The feature id for the '<em><b>Fixed MProperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FIXED_MPROPERTIES = MFTP_STEP__FIXED_MPROPERTIES;

	/**
	 * The feature id for the '<em><b>Fixed MSteps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FIXED_MSTEPS = MFTP_STEP__FIXED_MSTEPS;

	/**
	 * The feature id for the '<em><b>MState Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MSTATE_PROPERTY = MFTP_STEP__MSTATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MLast State Change Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MLAST_STATE_CHANGE_PROPERTY = MFTP_STEP__MLAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Last State Change Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__LAST_STATE_CHANGE_PROPERTY = MFTP_STEP__LAST_STATE_CHANGE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MInput Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MINPUT_STEPS = MFTP_STEP__MINPUT_STEPS;

	/**
	 * The feature id for the '<em><b>Fixed MParameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FIXED_MPARAMETERS = MFTP_STEP__FIXED_MPARAMETERS;

	/**
	 * The feature id for the '<em><b>Fixed MResults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FIXED_MRESULTS = MFTP_STEP__FIXED_MRESULTS;

	/**
	 * The feature id for the '<em><b>Exclusive Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__EXCLUSIVE_PROPERTY = MFTP_STEP__EXCLUSIVE_PROPERTY;

	/**
	 * The feature id for the '<em><b>State Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__STATE_PROPERTY = MFTP_STEP__STATE_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MPROGRESS_PROPERTY = MFTP_STEP__MPROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__PROGRESS_PROPERTY = MFTP_STEP__PROGRESS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MProgress Status Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MPROGRESS_STATUS_PROPERTY = MFTP_STEP__MPROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Progress Status Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__PROGRESS_STATUS_PROPERTY = MFTP_STEP__PROGRESS_STATUS_PROPERTY;

	/**
	 * The feature id for the '<em><b>MStart Trigger Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MSTART_TRIGGER_PROPERTY = MFTP_STEP__MSTART_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Start Trigger Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__START_TRIGGER_PROPERTY = MFTP_STEP__START_TRIGGER_PROPERTY;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__INTERRUPTABLE = MFTP_STEP__INTERRUPTABLE;

	/**
	 * The feature id for the '<em><b>Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__STOPPABLE = MFTP_STEP__STOPPABLE;

	/**
	 * The feature id for the '<em><b>Terminatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__TERMINATABLE = MFTP_STEP__TERMINATABLE;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__ACTION_NAME = MFTP_STEP__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__EXCEPTION = MFTP_STEP__EXCEPTION;

	/**
	 * The feature id for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MFTP_SERVER_URL_PARAMETER = MFTP_STEP__MFTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp Server Url Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FTP_SERVER_URL_PARAMETER = MFTP_STEP__FTP_SERVER_URL_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MFTP_USER_NAME_PARAMETER = MFTP_STEP__MFTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Name Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FTP_USER_NAME_PARAMETER = MFTP_STEP__FTP_USER_NAME_PARAMETER;

	/**
	 * The feature id for the '<em><b>MFtp User Password Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MFTP_USER_PASSWORD_PARAMETER = MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>Ftp User Password Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__FTP_USER_PASSWORD_PARAMETER = MFTP_STEP__FTP_USER_PASSWORD_PARAMETER;

	/**
	 * The feature id for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = MFTP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = MFTP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MUpgrade Message Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upgrade Message Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MUpgrade Date Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upgrade Date Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER = MFTP_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MDms Application MUpgrade Data Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MDMS_APPLICATION_MUPGRADE_DATA_STEP_FEATURE_COUNT = MFTP_STEP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '<em>MFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFile()
	 * @generated
	 */
	public static final int MFILE = 31;

	/**
	 * The meta object id for the '<em>MExisting File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMExistingFile()
	 * @generated
	 */
	public static final int MEXISTING_FILE = 32;

	/**
	 * The meta object id for the '<em>MState</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMState()
	 * @generated
	 */
	public static final int MSTATE = 33;

	/**
	 * The meta object id for the '<em>MStep State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStepState()
	 * @generated
	 */
	public static final int MSTEP_STATE = 34;

	/**
	 * The meta object id for the '<em>MBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBoolean()
	 * @generated
	 */
	public static final int MBOOLEAN = 35;

	/**
	 * The meta object id for the '<em>MDate Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDateTime()
	 * @generated
	 */
	public static final int MDATE_TIME = 36;

	/**
	 * The meta object id for the '<em>MDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDate()
	 * @generated
	 */
	public static final int MDATE = 37;

	/**
	 * The meta object id for the '<em>MTime</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTime()
	 * @generated
	 */
	public static final int MTIME = 38;

	/**
	 * The meta object id for the '<em>MDuration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDuration()
	 * @generated
	 */
	public static final int MDURATION = 39;

	/**
	 * The meta object id for the '<em>MLong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMLong()
	 * @generated
	 */
	public static final int MLONG = 40;

	/**
	 * The meta object id for the '<em>MPassword</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPassword()
	 * @generated
	 */
	public static final int MPASSWORD = 41;

	/**
	 * The meta object id for the '<em>MString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMString()
	 * @generated
	 */
	public static final int MSTRING = 42;

	/**
	 * The meta object id for the '<em>MUrl</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUrl()
	 * @generated
	 */
	public static final int MURL = 43;

	/**
	 * The meta object id for the '<em>EThrowable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getEThrowable()
	 * @generated
	 */
	public static final int ETHROWABLE = 44;

	/**
	 * The meta object id for the '<em>MMp3 State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3State()
	 * @generated
	 */
	public static final int MMP3_STATE = 45;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mStatefulObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDmsApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEnterInformationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEnterWwxInformationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEnterServiceInformationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mCreateDirectoryStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mCheckFreeDiskSpaceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAudioStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mCheckInputLevelsStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mRecordStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConvertToMP3StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPublishMp3sStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mUpdatePublishedMp3sStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPublishNewMp3StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEmailEventLogStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMp3FolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMp3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mBurnCdStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFtpStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mTestStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDmsApplicationMGetDataUpgradeInfoStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDmsApplicationMUpgradeDataStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mExistingFileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mStateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mStepStateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mDateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mDurationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mPasswordEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mUrlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eThrowableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mMp3StateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.onceforall.dms.desktop.logic.LogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicPackage() {
		super(eNS_URI, LogicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicPackage init() {
		if (isInited) return (LogicPackage)EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);

		// Obtain or create and register package
		LogicPackage theLogicPackage = (LogicPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof LogicPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new LogicPackage());

		isInited = true;

		// Create package meta-data objects
		theLogicPackage.createPackageContents();

		// Initialize created meta-data
		theLogicPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLogicPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LogicValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLogicPackage.freeze();

		return theLogicPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MObject <em>MObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MObject</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject
	 * @generated
	 */
	public EClass getMObject() {
		return mObjectEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MObject#getMNameProperty <em>MName Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MName Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject#getMNameProperty()
	 * @see #getMObject()
	 * @generated
	 */
	public EReference getMObject_MNameProperty() {
		return (EReference)mObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MObject#getMDescriptionProperty <em>MDescription Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDescription Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject#getMDescriptionProperty()
	 * @see #getMObject()
	 * @generated
	 */
	public EReference getMObject_MDescriptionProperty() {
		return (EReference)mObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MObject#getMIconFilePathProperty <em>MIcon File Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MIcon File Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject#getMIconFilePathProperty()
	 * @see #getMObject()
	 * @generated
	 */
	public EReference getMObject_MIconFilePathProperty() {
		return (EReference)mObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MObject#getFixedMProperties <em>Fixed MProperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed MProperties</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject#getFixedMProperties()
	 * @see #getMObject()
	 * @generated
	 */
	public EReference getMObject_FixedMProperties() {
		return (EReference)mObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MObject#getFixedMSteps <em>Fixed MSteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed MSteps</em>'.
	 * @see org.onceforall.dms.desktop.logic.MObject#getFixedMSteps()
	 * @see #getMObject()
	 * @generated
	 */
	public EReference getMObject_FixedMSteps() {
		return (EReference)mObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MElement <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MElement</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement
	 * @generated
	 */
	public EClass getMElement() {
		return mElementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getName()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_Name() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getTypeName()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_TypeName() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getTypeNameForUI <em>Type Name For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name For UI</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getTypeNameForUI()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_TypeNameForUI() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getNameForUI <em>Name For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name For UI</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getNameForUI()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_NameForUI() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getDescription()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_Description() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getDescriptionForUI <em>Description For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description For UI</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getDescriptionForUI()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_DescriptionForUI() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getIconFilePath <em>Icon File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon File Path</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getIconFilePath()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_IconFilePath() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getOverlayIconFilePath <em>Overlay Icon File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay Icon File Path</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getOverlayIconFilePath()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_OverlayIconFilePath() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#getCompositeClassName <em>Composite Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Class Name</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#getCompositeClassName()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_CompositeClassName() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MElement#isSimulated <em>Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulated</em>'.
	 * @see org.onceforall.dms.desktop.logic.MElement#isSimulated()
	 * @see #getMElement()
	 * @generated
	 */
	public EAttribute getMElement_Simulated() {
		return (EAttribute)mElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MParameter <em>MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MParameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MParameter
	 * @generated
	 */
	public EClass getMParameter() {
		return mParameterEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MProperty <em>MProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MProperty</em>'.
	 * @see org.onceforall.dms.desktop.logic.MProperty
	 * @generated
	 */
	public EClass getMProperty() {
		return mPropertyEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MResult <em>MResult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MResult</em>'.
	 * @see org.onceforall.dms.desktop.logic.MResult
	 * @generated
	 */
	public EClass getMResult() {
		return mResultEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MStatefulObject <em>MStateful Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MStateful Object</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject
	 * @generated
	 */
	public EClass getMStatefulObject() {
		return mStatefulObjectEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMStateProperty <em>MState Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MState Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject#getMStateProperty()
	 * @see #getMStatefulObject()
	 * @generated
	 */
	public EReference getMStatefulObject_MStateProperty() {
		return (EReference)mStatefulObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getMLastStateChangeProperty <em>MLast State Change Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLast State Change Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject#getMLastStateChangeProperty()
	 * @see #getMStatefulObject()
	 * @generated
	 */
	public EReference getMStatefulObject_MLastStateChangeProperty() {
		return (EReference)mStatefulObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStatefulObject#getLastStateChangeProperty <em>Last State Change Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last State Change Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStatefulObject#getLastStateChangeProperty()
	 * @see #getMStatefulObject()
	 * @generated
	 */
	public EAttribute getMStatefulObject_LastStateChangeProperty() {
		return (EAttribute)mStatefulObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MStep <em>MStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MStep</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep
	 * @generated
	 */
	public EClass getMStep() {
		return mStepEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MStep#getMInputSteps <em>MInput Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MInput Steps</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getMInputSteps()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_MInputSteps() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MStep#getFixedMParameters <em>Fixed MParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed MParameters</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getFixedMParameters()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_FixedMParameters() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MStep#getFixedMResults <em>Fixed MResults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed MResults</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getFixedMResults()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_FixedMResults() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getExclusiveProperty <em>Exclusive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getExclusiveProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_ExclusiveProperty() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getStateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getStateProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_StateProperty() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MStep#getMProgressProperty <em>MProgress Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MProgress Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getMProgressProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_MProgressProperty() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getProgressProperty <em>Progress Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getProgressProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_ProgressProperty() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MStep#getMProgressStatusProperty <em>MProgress Status Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MProgress Status Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getMProgressStatusProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_MProgressStatusProperty() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getProgressStatusProperty <em>Progress Status Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Status Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getProgressStatusProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_ProgressStatusProperty() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MStep#getMStartTriggerProperty <em>MStart Trigger Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MStart Trigger Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getMStartTriggerProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EReference getMStep_MStartTriggerProperty() {
		return (EReference)mStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getStartTriggerProperty <em>Start Trigger Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Trigger Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getStartTriggerProperty()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_StartTriggerProperty() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#isInterruptable <em>Interruptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interruptable</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#isInterruptable()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_Interruptable() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#isStoppable <em>Stoppable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stoppable</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#isStoppable()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_Stoppable() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#isTerminatable <em>Terminatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminatable</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#isTerminatable()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_Terminatable() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getActionName()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_ActionName() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MStep#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.onceforall.dms.desktop.logic.MStep#getException()
	 * @see #getMStep()
	 * @generated
	 */
	public EAttribute getMStep_Exception() {
		return (EAttribute)mStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MValue <em>MValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MValue</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue
	 * @generated
	 */
	public EClass getMValue() {
		return mValueEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.onceforall.dms.desktop.logic.MValue#getMInputValues <em>MInput Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MInput Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#getMInputValues()
	 * @see #getMValue()
	 * @generated
	 */
	public EReference getMValue_MInputValues() {
		return (EReference)mValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MValue#getValueForUI <em>Value For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value For UI</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#getValueForUI()
	 * @see #getMValue()
	 * @generated
	 */
	public EAttribute getMValue_ValueForUI() {
		return (EAttribute)mValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#getValue()
	 * @see #getMValue()
	 * @generated
	 */
	public EAttribute getMValue_Value() {
		return (EAttribute)mValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MValue#getHistoricValues <em>Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#getHistoricValues()
	 * @see #getMValue()
	 * @generated
	 */
	public EAttribute getMValue_HistoricValues() {
		return (EAttribute)mValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MValue#getHistoricValuesForUI <em>Historic Values For UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Historic Values For UI</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#getHistoricValuesForUI()
	 * @see #getMValue()
	 * @generated
	 */
	public EAttribute getMValue_HistoricValuesForUI() {
		return (EAttribute)mValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MValue#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.onceforall.dms.desktop.logic.MValue#isReadOnly()
	 * @see #getMValue()
	 * @generated
	 */
	public EAttribute getMValue_ReadOnly() {
		return (EAttribute)mValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MApplication <em>MApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MApplication</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication
	 * @generated
	 */
	public EClass getMApplication() {
		return mApplicationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MApplication#getMDataFileProperty <em>MData File Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MData File Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getMDataFileProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EReference getMApplication_MDataFileProperty() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MApplication#getDataFileProperty <em>Data File Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getDataFileProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_DataFileProperty() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MApplication#getDataFilePropertyHistoricValues <em>Data File Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data File Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getDataFilePropertyHistoricValues()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_DataFilePropertyHistoricValues() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MApplication#getMLogFileProperty <em>MLog File Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLog File Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getMLogFileProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EReference getMApplication_MLogFileProperty() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MApplication#getLogFileProperty <em>Log File Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log File Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getLogFileProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_LogFileProperty() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MApplication#getMPathProperty <em>MPath Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPath Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getMPathProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EReference getMApplication_MPathProperty() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MApplication#getPathProperty <em>Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getPathProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_PathProperty() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MApplication#getMVersionProperty <em>MVersion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MVersion Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getMVersionProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EReference getMApplication_MVersionProperty() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MApplication#getVersionProperty <em>Version Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getVersionProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_VersionProperty() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MApplication#getMLastSaveProperty <em>MLast Save Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLast Save Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getMLastSaveProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EReference getMApplication_MLastSaveProperty() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MApplication#getLastSaveProperty <em>Last Save Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Save Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MApplication#getLastSaveProperty()
	 * @see #getMApplication()
	 * @generated
	 */
	public EAttribute getMApplication_LastSaveProperty() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MScript <em>MScript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MScript</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript
	 * @generated
	 */
	public EClass getMScript() {
		return mScriptEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.dms.desktop.logic.MScript#getMSteps <em>MSteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MSteps</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getMSteps()
	 * @see #getMScript()
	 * @generated
	 */
	public EReference getMScript_MSteps() {
		return (EReference)mScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MScript#getStateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getStateProperty()
	 * @see #getMScript()
	 * @generated
	 */
	public EAttribute getMScript_StateProperty() {
		return (EAttribute)mScriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MScript#getMProgressProperty <em>MProgress Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MProgress Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getMProgressProperty()
	 * @see #getMScript()
	 * @generated
	 */
	public EReference getMScript_MProgressProperty() {
		return (EReference)mScriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MScript#getProgressProperty <em>Progress Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getProgressProperty()
	 * @see #getMScript()
	 * @generated
	 */
	public EAttribute getMScript_ProgressProperty() {
		return (EAttribute)mScriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MScript#getMProgressStatusProperty <em>MProgress Status Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MProgress Status Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getMProgressStatusProperty()
	 * @see #getMScript()
	 * @generated
	 */
	public EReference getMScript_MProgressStatusProperty() {
		return (EReference)mScriptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MScript#getProgressStatusProperty <em>Progress Status Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Status Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MScript#getProgressStatusProperty()
	 * @see #getMScript()
	 * @generated
	 */
	public EAttribute getMScript_ProgressStatusProperty() {
		return (EAttribute)mScriptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MDmsApplication <em>MDms Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDms Application</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication
	 * @generated
	 */
	public EClass getMDmsApplication() {
		return mDmsApplicationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMServiceFilePathProperty <em>MService File Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MService File Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMServiceFilePathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MServiceFilePathProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getServiceFilePathProperty <em>Service File Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service File Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getServiceFilePathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_ServiceFilePathProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWwxFilesPathProperty <em>MWwx Files Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MWwx Files Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMWwxFilesPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MWwxFilesPathProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWwxFilesPathProperty <em>Wwx Files Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wwx Files Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getWwxFilesPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_WwxFilesPathProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3EncoderPathProperty <em>MMp3 Encoder Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Encoder Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3EncoderPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MMp3EncoderPathProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMp3EncoderPathProperty <em>Mp3 Encoder Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp3 Encoder Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMp3EncoderPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_Mp3EncoderPathProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpServerUrlProperty <em>MFtp Server Url Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp Server Url Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpServerUrlProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MFtpServerUrlProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlProperty <em>Ftp Server Url Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp Server Url Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_FtpServerUrlProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlPropertyHistoricValues <em>Ftp Server Url Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ftp Server Url Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getFtpServerUrlPropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_FtpServerUrlPropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserNameProperty <em>MFtp User Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp User Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserNameProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MFtpUserNameProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNameProperty <em>Ftp User Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp User Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNameProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_FtpUserNameProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNamePropertyHistoricValues <em>Ftp User Name Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ftp User Name Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserNamePropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_FtpUserNamePropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserPasswordProperty <em>MFtp User Password Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp User Password Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMFtpUserPasswordProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MFtpUserPasswordProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserPasswordProperty <em>Ftp User Password Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp User Password Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getFtpUserPasswordProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_FtpUserPasswordProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMWebServerUrlProperty <em>MWeb Server Url Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MWeb Server Url Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMWebServerUrlProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MWebServerUrlProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlProperty <em>Web Server Url Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Server Url Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_WebServerUrlProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlPropertyHistoricValues <em>Web Server Url Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Web Server Url Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getWebServerUrlPropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_WebServerUrlPropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpServerProperty <em>MSmtp Server Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp Server Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpServerProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MSmtpServerProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerProperty <em>Smtp Server Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp Server Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_SmtpServerProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerPropertyHistoricValues <em>Smtp Server Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Smtp Server Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpServerPropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_SmtpServerPropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpUserNameProperty <em>MSmtp User Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp User Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpUserNameProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MSmtpUserNameProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNameProperty <em>Smtp User Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp User Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNameProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_SmtpUserNameProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNamePropertyHistoricValues <em>Smtp User Name Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Smtp User Name Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpUserNamePropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_SmtpUserNamePropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpPasswordProperty <em>MSmtp Password Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp Password Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMSmtpPasswordProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MSmtpPasswordProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpPasswordProperty <em>Smtp Password Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp Password Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getSmtpPasswordProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_SmtpPasswordProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMBurningSoftwareDirectoryPathProperty <em>MBurning Software Directory Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MBurning Software Directory Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMBurningSoftwareDirectoryPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MBurningSoftwareDirectoryPathProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getBurningSoftwareDirectoryPathProperty <em>Burning Software Directory Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Burning Software Directory Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getBurningSoftwareDirectoryPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_BurningSoftwareDirectoryPathProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMDriveProperty <em>MDrive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDrive Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMDriveProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MDriveProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getDriveProperty <em>Drive Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drive Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getDriveProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_DriveProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getDrivePropertyHistoricValues <em>Drive Property Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Drive Property Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getDrivePropertyHistoricValues()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_DrivePropertyHistoricValues() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeMessageProperty <em>MUpgrade Message Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Message Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeMessageProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MUpgradeMessageProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeMessageProperty <em>Upgrade Message Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Message Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeMessageProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_UpgradeMessageProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MUpgradeRelativeFtpPathProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_UpgradeRelativeFtpPathProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMLastUpgradeProperty <em>MLast Upgrade Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLast Upgrade Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMLastUpgradeProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MLastUpgradeProperty() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getLastUpgradeProperty <em>Last Upgrade Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Upgrade Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getLastUpgradeProperty()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EAttribute getMDmsApplication_LastUpgradeProperty() {
		return (EAttribute)mDmsApplicationEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMGetDataUpgradeInfoStep <em>MGet Data Upgrade Info Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MGet Data Upgrade Info Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMGetDataUpgradeInfoStep()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MGetDataUpgradeInfoStep() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMScripts <em>MScripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MScripts</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMScripts()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MScripts() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3Folders <em>MMp3 Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MMp3 Folders</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMMp3Folders()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MMp3Folders() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MEnterInformationStep <em>MEnter Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEnter Information Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterInformationStep
	 * @generated
	 */
	public EClass getMEnterInformationStep() {
		return mEnterInformationStepEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep <em>MEnter Wwx Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEnter Wwx Information Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep
	 * @generated
	 */
	public EClass getMEnterWwxInformationStep() {
		return mEnterWwxInformationStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateParameter <em>MWwx Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MWwx Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MWwxDateParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateParameter <em>Wwx Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wwx Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_WwxDateParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTitle Of Talk Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MTitleOfTalkParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Of Talk Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_TitleOfTalkParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSpeakers Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MSpeakersNameParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speakers Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SpeakersNameParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameterHistoricValues <em>Speakers Name Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Speakers Name Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameParameterHistoricValues()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SpeakersNameParameterHistoricValues() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartParameter <em>MFirst Part Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFirst Part Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MFirstPartParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameter <em>First Part Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Part Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_FirstPartParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameterHistoricValues <em>First Part Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>First Part Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartParameterHistoricValues()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_FirstPartParameterHistoricValues() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartParameter <em>MSecond Part Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSecond Part Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MSecondPartParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameter <em>Second Part Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Part Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SecondPartParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameterHistoricValues <em>Second Part Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Second Part Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartParameterHistoricValues()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SecondPartParameterHistoricValues() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MRecordingUsersNameParameter() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameter()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_RecordingUsersNameParameter() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameterHistoricValues <em>Recording Users Name Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Recording Users Name Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameParameterHistoricValues()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_RecordingUsersNameParameterHistoricValues() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateResult <em>MWwx Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MWwx Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMWwxDateResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MWwxDateResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateResult <em>Wwx Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wwx Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getWwxDateResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_WwxDateResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTitle Of Talk Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMTitleOfTalkResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MTitleOfTalkResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Of Talk Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getTitleOfTalkResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_TitleOfTalkResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSpeakers Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSpeakersNameResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MSpeakersNameResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speakers Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSpeakersNameResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SpeakersNameResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartResult <em>MFirst Part Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFirst Part Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMFirstPartResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MFirstPartResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartResult <em>First Part Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Part Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getFirstPartResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_FirstPartResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartResult <em>MSecond Part Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSecond Part Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMSecondPartResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MSecondPartResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartResult <em>Second Part Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Part Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getSecondPartResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_SecondPartResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Users Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getMRecordingUsersNameResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EReference getMEnterWwxInformationStep_MRecordingUsersNameResult() {
		return (EReference)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Users Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep#getRecordingUsersNameResult()
	 * @see #getMEnterWwxInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterWwxInformationStep_RecordingUsersNameResult() {
		return (EAttribute)mEnterWwxInformationStepEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep <em>MEnter Service Information Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEnter Service Information Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep
	 * @generated
	 */
	public EClass getMEnterServiceInformationStep() {
		return mEnterServiceInformationStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateParameter <em>MService Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MService Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MServiceDateParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateParameter <em>Service Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ServiceDateParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeParameter <em>MService Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MService Type Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MServiceTypeParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameter <em>Service Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ServiceTypeParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameterHistoricValues <em>Service Type Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Type Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeParameterHistoricValues()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ServiceTypeParameterHistoricValues() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkParameter <em>MTitle Of Talk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTitle Of Talk Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MTitleOfTalkParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkParameter <em>Title Of Talk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Of Talk Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_TitleOfTalkParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingParameter <em>MReading Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MReading Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MReadingParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingParameter <em>Reading Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ReadingParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameParameter <em>MSpeakers Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSpeakers Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MSpeakersNameParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameter <em>Speakers Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speakers Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_SpeakersNameParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameterHistoricValues <em>Speakers Name Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Speakers Name Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameParameterHistoricValues()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_SpeakersNameParameterHistoricValues() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MRecordingUsersNameParameter() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameter()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_RecordingUsersNameParameter() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameterHistoricValues <em>Recording Users Name Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Recording Users Name Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameParameterHistoricValues()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_RecordingUsersNameParameterHistoricValues() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateResult <em>MService Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MService Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceDateResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MServiceDateResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateResult <em>Service Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceDateResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ServiceDateResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeResult <em>MService Type Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MService Type Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMServiceTypeResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MServiceTypeResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeResult <em>Service Type Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getServiceTypeResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ServiceTypeResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkResult <em>MTitle Of Talk Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTitle Of Talk Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMTitleOfTalkResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MTitleOfTalkResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkResult <em>Title Of Talk Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Of Talk Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getTitleOfTalkResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_TitleOfTalkResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingResult <em>MReading Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MReading Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMReadingResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MReadingResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingResult <em>Reading Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getReadingResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_ReadingResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameResult <em>MSpeakers Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSpeakers Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMSpeakersNameResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MSpeakersNameResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameResult <em>Speakers Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speakers Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getSpeakersNameResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_SpeakersNameResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameResult <em>MRecording Users Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Users Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getMRecordingUsersNameResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EReference getMEnterServiceInformationStep_MRecordingUsersNameResult() {
		return (EReference)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameResult <em>Recording Users Name Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Users Name Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep#getRecordingUsersNameResult()
	 * @see #getMEnterServiceInformationStep()
	 * @generated
	 */
	public EAttribute getMEnterServiceInformationStep_RecordingUsersNameResult() {
		return (EAttribute)mEnterServiceInformationStepEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep <em>MCreate Directory Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCreate Directory Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep
	 * @generated
	 */
	public EClass getMCreateDirectoryStep() {
		return mCreateDirectoryStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMParentDirectoryParameter <em>MParent Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MParent Directory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMParentDirectoryParameter()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EReference getMCreateDirectoryStep_MParentDirectoryParameter() {
		return (EReference)mCreateDirectoryStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameter <em>Parent Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Directory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameter()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EAttribute getMCreateDirectoryStep_ParentDirectoryParameter() {
		return (EAttribute)mCreateDirectoryStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameterHistoricValues <em>Parent Directory Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Directory Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getParentDirectoryParameterHistoricValues()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EAttribute getMCreateDirectoryStep_ParentDirectoryParameterHistoricValues() {
		return (EAttribute)mCreateDirectoryStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryNameParameter <em>MDirectory Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryNameParameter()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EReference getMCreateDirectoryStep_MDirectoryNameParameter() {
		return (EReference)mCreateDirectoryStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryNameParameter <em>Directory Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryNameParameter()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EAttribute getMCreateDirectoryStep_DirectoryNameParameter() {
		return (EAttribute)mCreateDirectoryStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryResult <em>MDirectory Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getMDirectoryResult()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EReference getMCreateDirectoryStep_MDirectoryResult() {
		return (EReference)mCreateDirectoryStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryResult <em>Directory Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep#getDirectoryResult()
	 * @see #getMCreateDirectoryStep()
	 * @generated
	 */
	public EAttribute getMCreateDirectoryStep_DirectoryResult() {
		return (EAttribute)mCreateDirectoryStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep <em>MCheck Free Disk Space Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCheck Free Disk Space Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep
	 * @generated
	 */
	public EClass getMCheckFreeDiskSpaceStep() {
		return mCheckFreeDiskSpaceStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMRequiredFreeDiskSpaceParameter <em>MRequired Free Disk Space Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRequired Free Disk Space Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMRequiredFreeDiskSpaceParameter()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EReference getMCheckFreeDiskSpaceStep_MRequiredFreeDiskSpaceParameter() {
		return (EReference)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getRequiredFreeDiskSpaceParameter <em>Required Free Disk Space Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Free Disk Space Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getRequiredFreeDiskSpaceParameter()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EAttribute getMCheckFreeDiskSpaceStep_RequiredFreeDiskSpaceParameter() {
		return (EAttribute)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMDirectoryParameter <em>MDirectory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMDirectoryParameter()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EReference getMCheckFreeDiskSpaceStep_MDirectoryParameter() {
		return (EReference)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getDirectoryParameter <em>Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getDirectoryParameter()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EAttribute getMCheckFreeDiskSpaceStep_DirectoryParameter() {
		return (EAttribute)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMFreeDiskSpaceResult <em>MFree Disk Space Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFree Disk Space Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getMFreeDiskSpaceResult()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EReference getMCheckFreeDiskSpaceStep_MFreeDiskSpaceResult() {
		return (EReference)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getFreeDiskSpaceResult <em>Free Disk Space Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Disk Space Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep#getFreeDiskSpaceResult()
	 * @see #getMCheckFreeDiskSpaceStep()
	 * @generated
	 */
	public EAttribute getMCheckFreeDiskSpaceStep_FreeDiskSpaceResult() {
		return (EAttribute)mCheckFreeDiskSpaceStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MAudioStep <em>MAudio Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAudio Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep
	 * @generated
	 */
	public EClass getMAudioStep() {
		return mAudioStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputLevelProperty <em>MLeft Input Level Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLeft Input Level Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputLevelProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MLeftInputLevelProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputLevelProperty <em>Left Input Level Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Input Level Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputLevelProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_LeftInputLevelProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputLevelProperty <em>MRight Input Level Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRight Input Level Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputLevelProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MRightInputLevelProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputLevelProperty <em>Right Input Level Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Input Level Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getRightInputLevelProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_RightInputLevelProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputDistortionProperty <em>MLeft Input Distortion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLeft Input Distortion Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMLeftInputDistortionProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MLeftInputDistortionProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputDistortionProperty <em>Left Input Distortion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Input Distortion Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getLeftInputDistortionProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_LeftInputDistortionProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputDistortionProperty <em>MRight Input Distortion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRight Input Distortion Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMRightInputDistortionProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MRightInputDistortionProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getRightInputDistortionProperty <em>Right Input Distortion Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Input Distortion Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getRightInputDistortionProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_RightInputDistortionProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMUseDbProperty <em>MUse Db Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUse Db Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMUseDbProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MUseDbProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getUseDbProperty <em>Use Db Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Db Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getUseDbProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_UseDbProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MAudioStep#getMHeadroomProperty <em>MHeadroom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MHeadroom Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getMHeadroomProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EReference getMAudioStep_MHeadroomProperty() {
		return (EReference)mAudioStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MAudioStep#getHeadroomProperty <em>Headroom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headroom Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MAudioStep#getHeadroomProperty()
	 * @see #getMAudioStep()
	 * @generated
	 */
	public EAttribute getMAudioStep_HeadroomProperty() {
		return (EAttribute)mAudioStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MCheckInputLevelsStep <em>MCheck Input Levels Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCheck Input Levels Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MCheckInputLevelsStep
	 * @generated
	 */
	public EClass getMCheckInputLevelsStep() {
		return mCheckInputLevelsStepEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MRecordStep <em>MRecord Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRecord Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep
	 * @generated
	 */
	public EClass getMRecordStep() {
		return mRecordStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMDirectoryParameter <em>MDirectory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getMDirectoryParameter()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EReference getMRecordStep_MDirectoryParameter() {
		return (EReference)mRecordStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MRecordStep#getDirectoryParameter <em>Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getDirectoryParameter()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EAttribute getMRecordStep_DirectoryParameter() {
		return (EAttribute)mRecordStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileParameter <em>MRecording File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileParameter()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EReference getMRecordStep_MRecordingFileParameter() {
		return (EReference)mRecordStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileParameter <em>Recording File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileParameter()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EAttribute getMRecordStep_RecordingFileParameter() {
		return (EAttribute)mRecordStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileResult <em>MRecording File Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording File Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EReference getMRecordStep_MRecordingFileResult() {
		return (EReference)mRecordStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileResult <em>Recording File Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording File Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EAttribute getMRecordStep_RecordingFileResult() {
		return (EAttribute)mRecordStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileSizeResult <em>MRecording File Size Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording File Size Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingFileSizeResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EReference getMRecordStep_MRecordingFileSizeResult() {
		return (EReference)mRecordStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileSizeResult <em>Recording File Size Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording File Size Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getRecordingFileSizeResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EAttribute getMRecordStep_RecordingFileSizeResult() {
		return (EAttribute)mRecordStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingLengthResult <em>MRecording Length Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Length Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getMRecordingLengthResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EReference getMRecordStep_MRecordingLengthResult() {
		return (EReference)mRecordStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MRecordStep#getRecordingLengthResult <em>Recording Length Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Length Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MRecordStep#getRecordingLengthResult()
	 * @see #getMRecordStep()
	 * @generated
	 */
	public EAttribute getMRecordStep_RecordingLengthResult() {
		return (EAttribute)mRecordStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step <em>MConvert To MP3 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConvert To MP3 Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step
	 * @generated
	 */
	public EClass getMConvertToMP3Step() {
		return mConvertToMP3StepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMArtistParameter <em>MArtist Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MArtist Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMArtistParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MArtistParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getArtistParameter <em>Artist Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artist Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getArtistParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_ArtistParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMTitleParameter <em>MTitle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTitle Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMTitleParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MTitleParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getTitleParameter <em>Title Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getTitleParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_TitleParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAlbumParameter <em>MAlbum Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MAlbum Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAlbumParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MAlbumParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAlbumParameter <em>Album Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Album Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAlbumParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_AlbumParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMYearParameter <em>MYear Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MYear Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMYearParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MYearParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getYearParameter <em>Year Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getYearParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_YearParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter <em>MDirectory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDirectory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMDirectoryParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MDirectoryParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter <em>Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getDirectoryParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_DirectoryParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter <em>MMp3 File Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 File Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FileNameParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MMp3FileNameParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter <em>Mp3 File Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp3 File Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FileNameParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_Mp3FileNameParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter <em>MRecording File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMRecordingFileParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MRecordingFileParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter <em>Recording File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getRecordingFileParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_RecordingFileParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter <em>MMp3 Encoder Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Encoder Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EncoderPathParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MMp3EncoderPathParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter <em>Mp3 Encoder Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp3 Encoder Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EncoderPathParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_Mp3EncoderPathParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter <em>MAverage Bit Rate Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MAverage Bit Rate Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMAverageBitRateParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MAverageBitRateParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter <em>Average Bit Rate Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Bit Rate Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getAverageBitRateParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_AverageBitRateParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Folder Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3FolderReferenceParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MMp3FolderReferenceParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp3 Folder Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3FolderReferenceParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_Mp3FolderReferenceParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryNameParameter <em>MMp3 Entry Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Entry Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryNameParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MMp3EntryNameParameter() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryNameParameter <em>Mp3 Entry Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp3 Entry Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryNameParameter()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EAttribute getMConvertToMP3Step_Mp3EntryNameParameter() {
		return (EAttribute)mConvertToMP3StepEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryReferenceResult <em>MMp3 Entry Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Entry Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMMp3EntryReferenceResult()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_MMp3EntryReferenceResult() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryReferenceResult <em>Mp3 Entry Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp3 Entry Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step#getMp3EntryReferenceResult()
	 * @see #getMConvertToMP3Step()
	 * @generated
	 */
	public EReference getMConvertToMP3Step_Mp3EntryReferenceResult() {
		return (EReference)mConvertToMP3StepEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep <em>MPublish Mp3s Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPublish Mp3s Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep
	 * @generated
	 */
	public EClass getMPublishMp3sStep() {
		return mPublishMp3sStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMaxiumumDiskSpaceParameter <em>MMaxiumum Disk Space Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMaxiumum Disk Space Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMaxiumumDiskSpaceParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MMaxiumumDiskSpaceParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMaxiumumDiskSpaceParameter <em>Maxiumum Disk Space Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxiumum Disk Space Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMaxiumumDiskSpaceParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_MaxiumumDiskSpaceParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMp3RelativeFtpPathParameter <em>MMp3 Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMMp3RelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MMp3RelativeFtpPathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMp3RelativeFtpPathParameter <em>Mp3 Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mp3 Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMp3RelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_Mp3RelativeFtpPathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMWebServerUrlParameter <em>MWeb Server Url Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MWeb Server Url Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMWebServerUrlParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MWebServerUrlParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getWebServerUrlParameter <em>Web Server Url Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Server Url Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getWebServerUrlParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_WebServerUrlParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageRelativeFtpPathParameter <em>MContent Page Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MContent Page Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageRelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MContentPageRelativeFtpPathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageRelativeFtpPathParameter <em>Content Page Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Page Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageRelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_ContentPageRelativeFtpPathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentHeaderFilePathParameter <em>MContent Header File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MContent Header File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentHeaderFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MContentHeaderFilePathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentHeaderFilePathParameter <em>Content Header File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Header File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentHeaderFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_ContentHeaderFilePathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentFooterFilePathParameter <em>MContent Footer File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MContent Footer File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentFooterFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MContentFooterFilePathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentFooterFilePathParameter <em>Content Footer File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Footer File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentFooterFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_ContentFooterFilePathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageFilePathParameter <em>MContent Page File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MContent Page File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMContentPageFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MContentPageFilePathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageFilePathParameter <em>Content Page File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Page File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getContentPageFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_ContentPageFilePathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFilePathParameter <em>MPodcast File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MPodcastFilePathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFilePathParameter <em>Podcast File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_PodcastFilePathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastRelativeFtpPathParameter <em>MPodcast Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastRelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MPodcastRelativeFtpPathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastRelativeFtpPathParameter <em>Podcast Relative Ftp Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Relative Ftp Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastRelativeFtpPathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_PodcastRelativeFtpPathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastHeaderFilePathParameter <em>MPodcast Header File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Header File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getMPodcastHeaderFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EReference getMPublishMp3sStep_MPodcastHeaderFilePathParameter() {
		return (EReference)mPublishMp3sStepEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastHeaderFilePathParameter <em>Podcast Header File Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Header File Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep#getPodcastHeaderFilePathParameter()
	 * @see #getMPublishMp3sStep()
	 * @generated
	 */
	public EAttribute getMPublishMp3sStep_PodcastHeaderFilePathParameter() {
		return (EAttribute)mPublishMp3sStepEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep <em>MUpdate Published Mp3s Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MUpdate Published Mp3s Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep
	 * @generated
	 */
	public EClass getMUpdatePublishedMp3sStep() {
		return mUpdatePublishedMp3sStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMRepublishMp3Files <em>MRepublish Mp3 Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRepublish Mp3 Files</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMRepublishMp3Files()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EReference getMUpdatePublishedMp3sStep_MRepublishMp3Files() {
		return (EReference)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getRepublishMp3Files <em>Republish Mp3 Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Republish Mp3 Files</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getRepublishMp3Files()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EAttribute getMUpdatePublishedMp3sStep_RepublishMp3Files() {
		return (EAttribute)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceParameter <em>MMp3 Folder Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Folder Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceParameter()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EReference getMUpdatePublishedMp3sStep_MMp3FolderReferenceParameter() {
		return (EReference)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceParameter <em>Mp3 Folder Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp3 Folder Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceParameter()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EReference getMUpdatePublishedMp3sStep_Mp3FolderReferenceParameter() {
		return (EReference)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceResult <em>MMp3 Folder Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Folder Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMMp3FolderReferenceResult()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EReference getMUpdatePublishedMp3sStep_MMp3FolderReferenceResult() {
		return (EReference)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceResult <em>Mp3 Folder Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp3 Folder Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep#getMp3FolderReferenceResult()
	 * @see #getMUpdatePublishedMp3sStep()
	 * @generated
	 */
	public EReference getMUpdatePublishedMp3sStep_Mp3FolderReferenceResult() {
		return (EReference)mUpdatePublishedMp3sStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step <em>MPublish New Mp3 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPublish New Mp3 Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step
	 * @generated
	 */
	public EClass getMPublishNewMp3Step() {
		return mPublishNewMp3StepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMMp3EntryReferenceParameter <em>MMp3 Entry Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MMp3 Entry Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMMp3EntryReferenceParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MMp3EntryReferenceParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMp3EntryReferenceParameter <em>Mp3 Entry Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mp3 Entry Reference Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMp3EntryReferenceParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_Mp3EntryReferenceParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkTextParameter <em>MLink Text Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLink Text Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkTextParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MLinkTextParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkTextParameter <em>Link Text Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Text Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkTextParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_LinkTextParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkDescriptionParameter <em>MLink Description Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLink Description Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMLinkDescriptionParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MLinkDescriptionParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkDescriptionParameter <em>Link Description Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Description Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getLinkDescriptionParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_LinkDescriptionParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMCommentParameter <em>MComment Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MComment Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMCommentParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MCommentParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getCommentParameter <em>Comment Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getCommentParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_CommentParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastTitleParameter <em>MPodcast Title Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Title Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastTitleParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MPodcastTitleParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastTitleParameter <em>Podcast Title Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Title Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastTitleParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_PodcastTitleParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSubtitleParameter <em>MPodcast Subtitle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Subtitle Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSubtitleParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MPodcastSubtitleParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSubtitleParameter <em>Podcast Subtitle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Subtitle Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSubtitleParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_PodcastSubtitleParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSummaryParameter <em>MPodcast Summary Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Summary Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastSummaryParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MPodcastSummaryParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSummaryParameter <em>Podcast Summary Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Summary Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastSummaryParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_PodcastSummaryParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastPublishingDateParameter <em>MPodcast Publishing Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Publishing Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPodcastPublishingDateParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MPodcastPublishingDateParameter() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastPublishingDateParameter <em>Podcast Publishing Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Publishing Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPodcastPublishingDateParameter()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EAttribute getMPublishNewMp3Step_PodcastPublishingDateParameter() {
		return (EAttribute)mPublishNewMp3StepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPublishedMp3EntryReferenceResult <em>MPublished Mp3 Entry Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPublished Mp3 Entry Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getMPublishedMp3EntryReferenceResult()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_MPublishedMp3EntryReferenceResult() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPublishedMp3EntryReferenceResult <em>Published Mp3 Entry Reference Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Published Mp3 Entry Reference Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step#getPublishedMp3EntryReferenceResult()
	 * @see #getMPublishNewMp3Step()
	 * @generated
	 */
	public EReference getMPublishNewMp3Step_PublishedMp3EntryReferenceResult() {
		return (EReference)mPublishNewMp3StepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep <em>MEmail Event Log Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEmail Event Log Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep
	 * @generated
	 */
	public EClass getMEmailEventLogStep() {
		return mEmailEventLogStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMRecordingUsersNameParameter <em>MRecording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMRecordingUsersNameParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MRecordingUsersNameParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getRecordingUsersNameParameter <em>Recording Users Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Users Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getRecordingUsersNameParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_RecordingUsersNameParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMCommentParameter <em>MComment Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MComment Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMCommentParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MCommentParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getCommentParameter <em>Comment Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getCommentParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_CommentParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMLogFileParameter <em>MLog File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLog File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMLogFileParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MLogFileParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getLogFileParameter <em>Log File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getLogFileParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_LogFileParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMDataFileParameter <em>MData File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MData File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMDataFileParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MDataFileParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getDataFileParameter <em>Data File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getDataFileParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_DataFileParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSubjectParameter <em>MSubject Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSubject Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSubjectParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MSubjectParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSubjectParameter <em>Subject Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSubjectParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SubjectParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSendersEmailAddressParameter <em>MSenders Email Address Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSenders Email Address Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSendersEmailAddressParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MSendersEmailAddressParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameter <em>Senders Email Address Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Senders Email Address Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SendersEmailAddressParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameterHistoricValues <em>Senders Email Address Parameter Historic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Senders Email Address Parameter Historic Values</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSendersEmailAddressParameterHistoricValues()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SendersEmailAddressParameterHistoricValues() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMReceipientsEmailAddressParameter <em>MReceipients Email Address Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MReceipients Email Address Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMReceipientsEmailAddressParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MReceipientsEmailAddressParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getReceipientsEmailAddressParameter <em>Receipients Email Address Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Receipients Email Address Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getReceipientsEmailAddressParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_ReceipientsEmailAddressParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpServerParameter <em>MSmtp Server Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp Server Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpServerParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MSmtpServerParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpServerParameter <em>Smtp Server Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp Server Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpServerParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SmtpServerParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpUserNameParameter <em>MSmtp User Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp User Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpUserNameParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MSmtpUserNameParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpUserNameParameter <em>Smtp User Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp User Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpUserNameParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SmtpUserNameParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpPasswordParameter <em>MSmtp Password Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MSmtp Password Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getMSmtpPasswordParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EReference getMEmailEventLogStep_MSmtpPasswordParameter() {
		return (EReference)mEmailEventLogStepEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpPasswordParameter <em>Smtp Password Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smtp Password Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep#getSmtpPasswordParameter()
	 * @see #getMEmailEventLogStep()
	 * @generated
	 */
	public EAttribute getMEmailEventLogStep_SmtpPasswordParameter() {
		return (EAttribute)mEmailEventLogStepEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MMp3Folder <em>MMp3 Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMp3 Folder</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3Folder
	 * @generated
	 */
	public EClass getMMp3Folder() {
		return mMp3FolderEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.dms.desktop.logic.MMp3Folder#getMSteps <em>MSteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MSteps</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3Folder#getMSteps()
	 * @see #getMMp3Folder()
	 * @generated
	 */
	public EReference getMMp3Folder_MSteps() {
		return (EReference)mMp3FolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.onceforall.dms.desktop.logic.MMp3Folder#getMMp3s <em>MMp3s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MMp3s</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3Folder#getMMp3s()
	 * @see #getMMp3Folder()
	 * @generated
	 */
	public EReference getMMp3Folder_MMp3s() {
		return (EReference)mMp3FolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MMp3 <em>MMp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMp3</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3
	 * @generated
	 */
	public EClass getMMp3() {
		return mMp3EClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getStateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getStateProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_StateProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMFileProperty <em>MFile Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFile Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMFileProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MFileProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getFileProperty <em>File Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getFileProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_FileProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkTextProperty <em>MLink Text Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLink Text Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMLinkTextProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MLinkTextProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getLinkTextProperty <em>Link Text Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Text Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getLinkTextProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_LinkTextProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMLinkDescriptionProperty <em>MLink Description Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MLink Description Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMLinkDescriptionProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MLinkDescriptionProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getLinkDescriptionProperty <em>Link Description Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Description Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getLinkDescriptionProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_LinkDescriptionProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMCommentProperty <em>MComment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MComment Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMCommentProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MCommentProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getCommentProperty <em>Comment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getCommentProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_CommentProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastTitleProperty <em>MPodcast Title Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Title Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMPodcastTitleProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MPodcastTitleProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastTitleProperty <em>Podcast Title Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Title Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getPodcastTitleProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_PodcastTitleProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSubtitleProperty <em>MPodcast Subtitle Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Subtitle Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMPodcastSubtitleProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MPodcastSubtitleProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSubtitleProperty <em>Podcast Subtitle Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Subtitle Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getPodcastSubtitleProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_PodcastSubtitleProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastSummaryProperty <em>MPodcast Summary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Summary Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMPodcastSummaryProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MPodcastSummaryProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastSummaryProperty <em>Podcast Summary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Summary Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getPodcastSummaryProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_PodcastSummaryProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMPodcastPublishingDateProperty <em>MPodcast Publishing Date Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPodcast Publishing Date Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMPodcastPublishingDateProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MPodcastPublishingDateProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getPodcastPublishingDateProperty <em>Podcast Publishing Date Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Podcast Publishing Date Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getPodcastPublishingDateProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_PodcastPublishingDateProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MMp3#getMPublishedFileNameProperty <em>MPublished File Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPublished File Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getMPublishedFileNameProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EReference getMMp3_MPublishedFileNameProperty() {
		return (EReference)mMp3EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MMp3#getPublishedFileNameProperty <em>Published File Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published File Name Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MMp3#getPublishedFileNameProperty()
	 * @see #getMMp3()
	 * @generated
	 */
	public EAttribute getMMp3_PublishedFileNameProperty() {
		return (EAttribute)mMp3EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MBurnCdStep <em>MBurn Cd Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBurn Cd Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep
	 * @generated
	 */
	public EClass getMBurnCdStep() {
		return mBurnCdStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMRecordingFilesParameter <em>MRecording Files Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MRecording Files Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getMRecordingFilesParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EReference getMBurnCdStep_MRecordingFilesParameter() {
		return (EReference)mBurnCdStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getRecordingFilesParameter <em>Recording Files Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Recording Files Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getRecordingFilesParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EAttribute getMBurnCdStep_RecordingFilesParameter() {
		return (EAttribute)mBurnCdStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMBurningSoftwareDirectoryPathParameter <em>MBurning Software Directory Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MBurning Software Directory Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getMBurningSoftwareDirectoryPathParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EReference getMBurnCdStep_MBurningSoftwareDirectoryPathParameter() {
		return (EReference)mBurnCdStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getBurningSoftwareDirectoryPathParameter <em>Burning Software Directory Path Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Burning Software Directory Path Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getBurningSoftwareDirectoryPathParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EAttribute getMBurnCdStep_BurningSoftwareDirectoryPathParameter() {
		return (EAttribute)mBurnCdStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMDriveParameter <em>MDrive Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MDrive Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getMDriveParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EReference getMBurnCdStep_MDriveParameter() {
		return (EReference)mBurnCdStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getDriveParameter <em>Drive Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drive Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getDriveParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EAttribute getMBurnCdStep_DriveParameter() {
		return (EAttribute)mBurnCdStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingLengthParameter <em>MTotal Recording Length Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTotal Recording Length Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingLengthParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EReference getMBurnCdStep_MTotalRecordingLengthParameter() {
		return (EReference)mBurnCdStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingLengthParameter <em>Total Recording Length Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Recording Length Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingLengthParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EAttribute getMBurnCdStep_TotalRecordingLengthParameter() {
		return (EAttribute)mBurnCdStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingFileSizeParameter <em>MTotal Recording File Size Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTotal Recording File Size Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getMTotalRecordingFileSizeParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EReference getMBurnCdStep_MTotalRecordingFileSizeParameter() {
		return (EReference)mBurnCdStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingFileSizeParameter <em>Total Recording File Size Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Recording File Size Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MBurnCdStep#getTotalRecordingFileSizeParameter()
	 * @see #getMBurnCdStep()
	 * @generated
	 */
	public EAttribute getMBurnCdStep_TotalRecordingFileSizeParameter() {
		return (EAttribute)mBurnCdStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MFtpStep <em>MFtp Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFtp Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep
	 * @generated
	 */
	public EClass getMFtpStep() {
		return mFtpStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpServerUrlParameter <em>MFtp Server Url Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp Server Url Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getMFtpServerUrlParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EReference getMFtpStep_MFtpServerUrlParameter() {
		return (EReference)mFtpStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpServerUrlParameter <em>Ftp Server Url Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp Server Url Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getFtpServerUrlParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EAttribute getMFtpStep_FtpServerUrlParameter() {
		return (EAttribute)mFtpStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserNameParameter <em>MFtp User Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp User Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserNameParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EReference getMFtpStep_MFtpUserNameParameter() {
		return (EReference)mFtpStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserNameParameter <em>Ftp User Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp User Name Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserNameParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EAttribute getMFtpStep_FtpUserNameParameter() {
		return (EAttribute)mFtpStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserPasswordParameter <em>MFtp User Password Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MFtp User Password Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getMFtpUserPasswordParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EReference getMFtpStep_MFtpUserPasswordParameter() {
		return (EReference)mFtpStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserPasswordParameter <em>Ftp User Password Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp User Password Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MFtpStep#getFtpUserPasswordParameter()
	 * @see #getMFtpStep()
	 * @generated
	 */
	public EAttribute getMFtpStep_FtpUserPasswordParameter() {
		return (EAttribute)mFtpStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MTestStep <em>MTest Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTest Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MTestStep
	 * @generated
	 */
	public EClass getMTestStep() {
		return mTestStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MTestStep#getMPersistentStringParameter <em>MPersistent String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPersistent String Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MTestStep#getMPersistentStringParameter()
	 * @see #getMTestStep()
	 * @generated
	 */
	public EReference getMTestStep_MPersistentStringParameter() {
		return (EReference)mTestStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MTestStep#getPersistentStringParameter <em>Persistent String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent String Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MTestStep#getPersistentStringParameter()
	 * @see #getMTestStep()
	 * @generated
	 */
	public EAttribute getMTestStep_PersistentStringParameter() {
		return (EAttribute)mTestStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MTestStep#getMStringParameter <em>MString Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MString Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MTestStep#getMStringParameter()
	 * @see #getMTestStep()
	 * @generated
	 */
	public EReference getMTestStep_MStringParameter() {
		return (EReference)mTestStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MTestStep#getStringParameter <em>String Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MTestStep#getStringParameter()
	 * @see #getMTestStep()
	 * @generated
	 */
	public EAttribute getMTestStep_StringParameter() {
		return (EAttribute)mTestStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep <em>MDms Application MGet Data Upgrade Info Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDms Application MGet Data Upgrade Info Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep
	 * @generated
	 */
	public EClass getMDmsApplicationMGetDataUpgradeInfoStep() {
		return mDmsApplicationMGetDataUpgradeInfoStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeRelativeFtpPathProperty() {
		return (EReference)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeRelativeFtpPathProperty() {
		return (EAttribute)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeAvailableResult <em>MUpgrade Available Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Available Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeAvailableResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeAvailableResult() {
		return (EReference)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeAvailableResult <em>Upgrade Available Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Available Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeAvailableResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeAvailableResult() {
		return (EAttribute)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeMessageResult <em>MUpgrade Message Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Message Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeMessageResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeMessageResult() {
		return (EReference)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeMessageResult <em>Upgrade Message Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Message Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeMessageResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeMessageResult() {
		return (EAttribute)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeDateResult <em>MUpgrade Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getMUpgradeDateResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeDateResult() {
		return (EReference)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeDateResult <em>Upgrade Date Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Date Result</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep#getUpgradeDateResult()
	 * @see #getMDmsApplicationMGetDataUpgradeInfoStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeDateResult() {
		return (EAttribute)mDmsApplicationMGetDataUpgradeInfoStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep <em>MDms Application MUpgrade Data Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDms Application MUpgrade Data Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep
	 * @generated
	 */
	public EClass getMDmsApplicationMUpgradeDataStep() {
		return mDmsApplicationMUpgradeDataStepEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeRelativeFtpPathProperty <em>MUpgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMUpgradeDataStep_MUpgradeRelativeFtpPathProperty() {
		return (EReference)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeRelativeFtpPathProperty <em>Upgrade Relative Ftp Path Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Relative Ftp Path Property</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeRelativeFtpPathProperty()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMUpgradeDataStep_UpgradeRelativeFtpPathProperty() {
		return (EAttribute)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeMessageParameter <em>MUpgrade Message Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Message Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeMessageParameter()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMUpgradeDataStep_MUpgradeMessageParameter() {
		return (EReference)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeMessageParameter <em>Upgrade Message Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Message Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeMessageParameter()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMUpgradeDataStep_UpgradeMessageParameter() {
		return (EAttribute)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeDateParameter <em>MUpgrade Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getMUpgradeDateParameter()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EReference getMDmsApplicationMUpgradeDataStep_MUpgradeDateParameter() {
		return (EReference)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeDateParameter <em>Upgrade Date Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Date Parameter</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep#getUpgradeDateParameter()
	 * @see #getMDmsApplicationMUpgradeDataStep()
	 * @generated
	 */
	public EAttribute getMDmsApplicationMUpgradeDataStep_UpgradeDateParameter() {
		return (EAttribute)mDmsApplicationMUpgradeDataStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeDataStep <em>MUpgrade Data Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MUpgrade Data Step</em>'.
	 * @see org.onceforall.dms.desktop.logic.MDmsApplication#getMUpgradeDataStep()
	 * @see #getMDmsApplication()
	 * @generated
	 */
	public EReference getMDmsApplication_MUpgradeDataStep() {
		return (EReference)mDmsApplicationEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>MFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MFile</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 *        annotation="http://www.onceforall.org/mcore name='File'" 
	 * @generated
	 */
	public EDataType getMFile() {
		return mFileEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>MExisting File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MExisting File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 *        annotation="http://www.onceforall.org/mcore name='File (must exist)'" 
	 * @generated
	 */
	public EDataType getMExistingFile() {
		return mExistingFileEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.onceforall.dms.desktop.logic.types.State <em>MState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MState</em>'.
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @model instanceClass="org.onceforall.dms.desktop.logic.types.State"
	 *        annotation="http://www.onceforall.org/mcore name='State'" 
	 * @generated
	 */
	public EDataType getMState() {
		return mStateEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.onceforall.dms.desktop.logic.types.State <em>MStep State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MStep State</em>'.
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @model instanceClass="org.onceforall.dms.desktop.logic.types.State"
	 *        annotation="http://www.onceforall.org/mcore name='Step state'" 
	 * @generated
	 */
	public EDataType getMStepState() {
		return mStepStateEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>MBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MBoolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        annotation="http://www.onceforall.org/mcore name='Yes/No'" 
	 * @generated
	 */
	public EDataType getMBoolean() {
		return mBooleanEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>MDate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MDate Time</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http://www.onceforall.org/mcore name='Date and time'" 
	 * @generated
	 */
	public EDataType getMDateTime() {
		return mDateTimeEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>MDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MDate</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http://www.onceforall.org/mcore name='Date'" 
	 * @generated
	 */
	public EDataType getMDate() {
		return mDateEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>MTime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MTime</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http://www.onceforall.org/mcore name='Time'" 
	 * @generated
	 */
	public EDataType getMTime() {
		return mTimeEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>MDuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MDuration</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        annotation="http://www.onceforall.org/mcore name='Duration'" 
	 * @generated
	 */
	public EDataType getMDuration() {
		return mDurationEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>MLong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MLong</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        annotation="http://www.onceforall.org/mcore name='Number'" 
	 * @generated
	 */
	public EDataType getMLong() {
		return mLongEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>MPassword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MPassword</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="http://www.onceforall.org/mcore name='Password'" 
	 * @generated
	 */
	public EDataType getMPassword() {
		return mPasswordEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>MString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="http://www.onceforall.org/mcore name='Text'" 
	 * @generated
	 */
	public EDataType getMString() {
		return mStringEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>MUrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MUrl</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 *        annotation="http://www.onceforall.org/mcore name='URL'" 
	 * @generated
	 */
	public EDataType getMUrl() {
		return mUrlEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>EThrowable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EThrowable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	public EDataType getEThrowable() {
		return eThrowableEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.onceforall.dms.desktop.logic.types.State <em>MMp3 State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MMp3 State</em>'.
	 * @see org.onceforall.dms.desktop.logic.types.State
	 * @model instanceClass="org.onceforall.dms.desktop.logic.types.State"
	 *        annotation="http://www.onceforall.org/mcore name='MP3 state'" 
	 * @generated
	 */
	public EDataType getMMp3State() {
		return mMp3StateEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LogicFactory getLogicFactory() {
		return (LogicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mObjectEClass = createEClass(MOBJECT);
		createEReference(mObjectEClass, MOBJECT__MNAME_PROPERTY);
		createEReference(mObjectEClass, MOBJECT__MDESCRIPTION_PROPERTY);
		createEReference(mObjectEClass, MOBJECT__MICON_FILE_PATH_PROPERTY);
		createEReference(mObjectEClass, MOBJECT__FIXED_MPROPERTIES);
		createEReference(mObjectEClass, MOBJECT__FIXED_MSTEPS);

		mElementEClass = createEClass(MELEMENT);
		createEAttribute(mElementEClass, MELEMENT__NAME);
		createEAttribute(mElementEClass, MELEMENT__TYPE_NAME);
		createEAttribute(mElementEClass, MELEMENT__TYPE_NAME_FOR_UI);
		createEAttribute(mElementEClass, MELEMENT__NAME_FOR_UI);
		createEAttribute(mElementEClass, MELEMENT__DESCRIPTION);
		createEAttribute(mElementEClass, MELEMENT__DESCRIPTION_FOR_UI);
		createEAttribute(mElementEClass, MELEMENT__ICON_FILE_PATH);
		createEAttribute(mElementEClass, MELEMENT__OVERLAY_ICON_FILE_PATH);
		createEAttribute(mElementEClass, MELEMENT__COMPOSITE_CLASS_NAME);
		createEAttribute(mElementEClass, MELEMENT__SIMULATED);

		mParameterEClass = createEClass(MPARAMETER);

		mPropertyEClass = createEClass(MPROPERTY);

		mResultEClass = createEClass(MRESULT);

		mStatefulObjectEClass = createEClass(MSTATEFUL_OBJECT);
		createEReference(mStatefulObjectEClass, MSTATEFUL_OBJECT__MSTATE_PROPERTY);
		createEReference(mStatefulObjectEClass, MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY);
		createEAttribute(mStatefulObjectEClass, MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY);

		mStepEClass = createEClass(MSTEP);
		createEReference(mStepEClass, MSTEP__MINPUT_STEPS);
		createEReference(mStepEClass, MSTEP__FIXED_MPARAMETERS);
		createEReference(mStepEClass, MSTEP__FIXED_MRESULTS);
		createEAttribute(mStepEClass, MSTEP__EXCLUSIVE_PROPERTY);
		createEAttribute(mStepEClass, MSTEP__STATE_PROPERTY);
		createEReference(mStepEClass, MSTEP__MPROGRESS_PROPERTY);
		createEAttribute(mStepEClass, MSTEP__PROGRESS_PROPERTY);
		createEReference(mStepEClass, MSTEP__MPROGRESS_STATUS_PROPERTY);
		createEAttribute(mStepEClass, MSTEP__PROGRESS_STATUS_PROPERTY);
		createEReference(mStepEClass, MSTEP__MSTART_TRIGGER_PROPERTY);
		createEAttribute(mStepEClass, MSTEP__START_TRIGGER_PROPERTY);
		createEAttribute(mStepEClass, MSTEP__INTERRUPTABLE);
		createEAttribute(mStepEClass, MSTEP__STOPPABLE);
		createEAttribute(mStepEClass, MSTEP__TERMINATABLE);
		createEAttribute(mStepEClass, MSTEP__ACTION_NAME);
		createEAttribute(mStepEClass, MSTEP__EXCEPTION);

		mValueEClass = createEClass(MVALUE);
		createEReference(mValueEClass, MVALUE__MINPUT_VALUES);
		createEAttribute(mValueEClass, MVALUE__VALUE_FOR_UI);
		createEAttribute(mValueEClass, MVALUE__VALUE);
		createEAttribute(mValueEClass, MVALUE__HISTORIC_VALUES);
		createEAttribute(mValueEClass, MVALUE__HISTORIC_VALUES_FOR_UI);
		createEAttribute(mValueEClass, MVALUE__READ_ONLY);

		mApplicationEClass = createEClass(MAPPLICATION);
		createEReference(mApplicationEClass, MAPPLICATION__MDATA_FILE_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__DATA_FILE_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES);
		createEReference(mApplicationEClass, MAPPLICATION__MLOG_FILE_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__LOG_FILE_PROPERTY);
		createEReference(mApplicationEClass, MAPPLICATION__MPATH_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__PATH_PROPERTY);
		createEReference(mApplicationEClass, MAPPLICATION__MVERSION_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__VERSION_PROPERTY);
		createEReference(mApplicationEClass, MAPPLICATION__MLAST_SAVE_PROPERTY);
		createEAttribute(mApplicationEClass, MAPPLICATION__LAST_SAVE_PROPERTY);

		mScriptEClass = createEClass(MSCRIPT);
		createEReference(mScriptEClass, MSCRIPT__MSTEPS);
		createEAttribute(mScriptEClass, MSCRIPT__STATE_PROPERTY);
		createEReference(mScriptEClass, MSCRIPT__MPROGRESS_PROPERTY);
		createEAttribute(mScriptEClass, MSCRIPT__PROGRESS_PROPERTY);
		createEReference(mScriptEClass, MSCRIPT__MPROGRESS_STATUS_PROPERTY);
		createEAttribute(mScriptEClass, MSCRIPT__PROGRESS_STATUS_PROPERTY);

		mDmsApplicationEClass = createEClass(MDMS_APPLICATION);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__FTP_USER_NAME_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MSMTP_SERVER_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SMTP_SERVER_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MDRIVE_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__DRIVE_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY);
		createEAttribute(mDmsApplicationEClass, MDMS_APPLICATION__LAST_UPGRADE_PROPERTY);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MUPGRADE_DATA_STEP);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MSCRIPTS);
		createEReference(mDmsApplicationEClass, MDMS_APPLICATION__MMP3_FOLDERS);

		mEnterInformationStepEClass = createEClass(MENTER_INFORMATION_STEP);

		mEnterWwxInformationStepEClass = createEClass(MENTER_WWX_INFORMATION_STEP);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT);
		createEReference(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT);
		createEAttribute(mEnterWwxInformationStepEClass, MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT);

		mEnterServiceInformationStepEClass = createEClass(MENTER_SERVICE_INFORMATION_STEP);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__READING_RESULT);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT);
		createEReference(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT);
		createEAttribute(mEnterServiceInformationStepEClass, MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT);

		mCreateDirectoryStepEClass = createEClass(MCREATE_DIRECTORY_STEP);
		createEReference(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER);
		createEAttribute(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER);
		createEAttribute(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES);
		createEReference(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER);
		createEAttribute(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER);
		createEReference(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT);
		createEAttribute(mCreateDirectoryStepEClass, MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT);

		mCheckFreeDiskSpaceStepEClass = createEClass(MCHECK_FREE_DISK_SPACE_STEP);
		createEReference(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER);
		createEAttribute(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER);
		createEReference(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER);
		createEAttribute(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER);
		createEReference(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT);
		createEAttribute(mCheckFreeDiskSpaceStepEClass, MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT);

		mAudioStepEClass = createEClass(MAUDIO_STEP);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MUSE_DB_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__USE_DB_PROPERTY);
		createEReference(mAudioStepEClass, MAUDIO_STEP__MHEADROOM_PROPERTY);
		createEAttribute(mAudioStepEClass, MAUDIO_STEP__HEADROOM_PROPERTY);

		mCheckInputLevelsStepEClass = createEClass(MCHECK_INPUT_LEVELS_STEP);

		mRecordStepEClass = createEClass(MRECORD_STEP);
		createEReference(mRecordStepEClass, MRECORD_STEP__MDIRECTORY_PARAMETER);
		createEAttribute(mRecordStepEClass, MRECORD_STEP__DIRECTORY_PARAMETER);
		createEReference(mRecordStepEClass, MRECORD_STEP__MRECORDING_FILE_PARAMETER);
		createEAttribute(mRecordStepEClass, MRECORD_STEP__RECORDING_FILE_PARAMETER);
		createEReference(mRecordStepEClass, MRECORD_STEP__MRECORDING_FILE_RESULT);
		createEAttribute(mRecordStepEClass, MRECORD_STEP__RECORDING_FILE_RESULT);
		createEReference(mRecordStepEClass, MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT);
		createEAttribute(mRecordStepEClass, MRECORD_STEP__RECORDING_FILE_SIZE_RESULT);
		createEReference(mRecordStepEClass, MRECORD_STEP__MRECORDING_LENGTH_RESULT);
		createEAttribute(mRecordStepEClass, MRECORD_STEP__RECORDING_LENGTH_RESULT);

		mConvertToMP3StepEClass = createEClass(MCONVERT_TO_MP3_STEP);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__TITLE_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__YEAR_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER);
		createEAttribute(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT);
		createEReference(mConvertToMP3StepEClass, MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT);

		mPublishMp3sStepEClass = createEClass(MPUBLISH_MP3S_STEP);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER);
		createEReference(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER);
		createEAttribute(mPublishMp3sStepEClass, MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER);

		mUpdatePublishedMp3sStepEClass = createEClass(MUPDATE_PUBLISHED_MP3S_STEP);
		createEReference(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES);
		createEAttribute(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES);
		createEReference(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER);
		createEReference(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER);
		createEReference(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT);
		createEReference(mUpdatePublishedMp3sStepEClass, MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT);

		mPublishNewMp3StepEClass = createEClass(MPUBLISH_NEW_MP3_STEP);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER);
		createEAttribute(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT);
		createEReference(mPublishNewMp3StepEClass, MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT);

		mEmailEventLogStepEClass = createEClass(MEMAIL_EVENT_LOG_STEP);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER);
		createEReference(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER);
		createEAttribute(mEmailEventLogStepEClass, MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER);

		mMp3FolderEClass = createEClass(MMP3_FOLDER);
		createEReference(mMp3FolderEClass, MMP3_FOLDER__MSTEPS);
		createEReference(mMp3FolderEClass, MMP3_FOLDER__MMP3S);

		mMp3EClass = createEClass(MMP3);
		createEAttribute(mMp3EClass, MMP3__STATE_PROPERTY);
		createEReference(mMp3EClass, MMP3__MFILE_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__FILE_PROPERTY);
		createEReference(mMp3EClass, MMP3__MLINK_TEXT_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__LINK_TEXT_PROPERTY);
		createEReference(mMp3EClass, MMP3__MLINK_DESCRIPTION_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__LINK_DESCRIPTION_PROPERTY);
		createEReference(mMp3EClass, MMP3__MCOMMENT_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__COMMENT_PROPERTY);
		createEReference(mMp3EClass, MMP3__MPODCAST_TITLE_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__PODCAST_TITLE_PROPERTY);
		createEReference(mMp3EClass, MMP3__MPODCAST_SUBTITLE_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__PODCAST_SUBTITLE_PROPERTY);
		createEReference(mMp3EClass, MMP3__MPODCAST_SUMMARY_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__PODCAST_SUMMARY_PROPERTY);
		createEReference(mMp3EClass, MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__PODCAST_PUBLISHING_DATE_PROPERTY);
		createEReference(mMp3EClass, MMP3__MPUBLISHED_FILE_NAME_PROPERTY);
		createEAttribute(mMp3EClass, MMP3__PUBLISHED_FILE_NAME_PROPERTY);

		mBurnCdStepEClass = createEClass(MBURN_CD_STEP);
		createEReference(mBurnCdStepEClass, MBURN_CD_STEP__MRECORDING_FILES_PARAMETER);
		createEAttribute(mBurnCdStepEClass, MBURN_CD_STEP__RECORDING_FILES_PARAMETER);
		createEReference(mBurnCdStepEClass, MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER);
		createEAttribute(mBurnCdStepEClass, MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER);
		createEReference(mBurnCdStepEClass, MBURN_CD_STEP__MDRIVE_PARAMETER);
		createEAttribute(mBurnCdStepEClass, MBURN_CD_STEP__DRIVE_PARAMETER);
		createEReference(mBurnCdStepEClass, MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER);
		createEAttribute(mBurnCdStepEClass, MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER);
		createEReference(mBurnCdStepEClass, MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER);
		createEAttribute(mBurnCdStepEClass, MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER);

		mFtpStepEClass = createEClass(MFTP_STEP);
		createEReference(mFtpStepEClass, MFTP_STEP__MFTP_SERVER_URL_PARAMETER);
		createEAttribute(mFtpStepEClass, MFTP_STEP__FTP_SERVER_URL_PARAMETER);
		createEReference(mFtpStepEClass, MFTP_STEP__MFTP_USER_NAME_PARAMETER);
		createEAttribute(mFtpStepEClass, MFTP_STEP__FTP_USER_NAME_PARAMETER);
		createEReference(mFtpStepEClass, MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER);
		createEAttribute(mFtpStepEClass, MFTP_STEP__FTP_USER_PASSWORD_PARAMETER);

		mTestStepEClass = createEClass(MTEST_STEP);
		createEReference(mTestStepEClass, MTEST_STEP__MPERSISTENT_STRING_PARAMETER);
		createEAttribute(mTestStepEClass, MTEST_STEP__PERSISTENT_STRING_PARAMETER);
		createEReference(mTestStepEClass, MTEST_STEP__MSTRING_PARAMETER);
		createEAttribute(mTestStepEClass, MTEST_STEP__STRING_PARAMETER);

		mDmsApplicationMGetDataUpgradeInfoStepEClass = createEClass(MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP);
		createEReference(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEAttribute(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEReference(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT);
		createEAttribute(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT);
		createEReference(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT);
		createEAttribute(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT);
		createEReference(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT);
		createEAttribute(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT);

		mDmsApplicationMUpgradeDataStepEClass = createEClass(MDMS_APPLICATION_MUPGRADE_DATA_STEP);
		createEReference(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEAttribute(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY);
		createEReference(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER);
		createEAttribute(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER);
		createEReference(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER);
		createEAttribute(mDmsApplicationMUpgradeDataStepEClass, MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER);

		// Create data types
		mFileEDataType = createEDataType(MFILE);
		mExistingFileEDataType = createEDataType(MEXISTING_FILE);
		mStateEDataType = createEDataType(MSTATE);
		mStepStateEDataType = createEDataType(MSTEP_STATE);
		mBooleanEDataType = createEDataType(MBOOLEAN);
		mDateTimeEDataType = createEDataType(MDATE_TIME);
		mDateEDataType = createEDataType(MDATE);
		mTimeEDataType = createEDataType(MTIME);
		mDurationEDataType = createEDataType(MDURATION);
		mLongEDataType = createEDataType(MLONG);
		mPasswordEDataType = createEDataType(MPASSWORD);
		mStringEDataType = createEDataType(MSTRING);
		mUrlEDataType = createEDataType(MURL);
		eThrowableEDataType = createEDataType(ETHROWABLE);
		mMp3StateEDataType = createEDataType(MMP3_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		mObjectEClass.getESuperTypes().add(this.getMElement());
		mParameterEClass.getESuperTypes().add(this.getMValue());
		mPropertyEClass.getESuperTypes().add(this.getMValue());
		mResultEClass.getESuperTypes().add(this.getMValue());
		mStatefulObjectEClass.getESuperTypes().add(this.getMObject());
		mStepEClass.getESuperTypes().add(this.getMStatefulObject());
		mValueEClass.getESuperTypes().add(this.getMElement());
		mApplicationEClass.getESuperTypes().add(this.getMObject());
		mScriptEClass.getESuperTypes().add(this.getMStatefulObject());
		mDmsApplicationEClass.getESuperTypes().add(this.getMApplication());
		mEnterInformationStepEClass.getESuperTypes().add(this.getMStep());
		mEnterWwxInformationStepEClass.getESuperTypes().add(this.getMEnterInformationStep());
		mEnterServiceInformationStepEClass.getESuperTypes().add(this.getMEnterInformationStep());
		mCreateDirectoryStepEClass.getESuperTypes().add(this.getMStep());
		mCheckFreeDiskSpaceStepEClass.getESuperTypes().add(this.getMStep());
		mAudioStepEClass.getESuperTypes().add(this.getMStep());
		mCheckInputLevelsStepEClass.getESuperTypes().add(this.getMAudioStep());
		mRecordStepEClass.getESuperTypes().add(this.getMAudioStep());
		mConvertToMP3StepEClass.getESuperTypes().add(this.getMStep());
		mPublishMp3sStepEClass.getESuperTypes().add(this.getMFtpStep());
		mUpdatePublishedMp3sStepEClass.getESuperTypes().add(this.getMPublishMp3sStep());
		mPublishNewMp3StepEClass.getESuperTypes().add(this.getMPublishMp3sStep());
		mEmailEventLogStepEClass.getESuperTypes().add(this.getMStep());
		mMp3FolderEClass.getESuperTypes().add(this.getMObject());
		mMp3EClass.getESuperTypes().add(this.getMStatefulObject());
		mBurnCdStepEClass.getESuperTypes().add(this.getMStep());
		mFtpStepEClass.getESuperTypes().add(this.getMStep());
		mTestStepEClass.getESuperTypes().add(this.getMStep());
		mDmsApplicationMGetDataUpgradeInfoStepEClass.getESuperTypes().add(this.getMFtpStep());
		mDmsApplicationMUpgradeDataStepEClass.getESuperTypes().add(this.getMFtpStep());

		// Initialize classes and features; add operations and parameters
		initEClass(mObjectEClass, MObject.class, "MObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMObject_MNameProperty(), this.getMProperty(), null, "mNameProperty", "", 1, 1, MObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMObject_MDescriptionProperty(), this.getMProperty(), null, "mDescriptionProperty", null, 1, 1, MObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMObject_MIconFilePathProperty(), this.getMProperty(), null, "mIconFilePathProperty", null, 1, 1, MObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMObject_FixedMProperties(), this.getMProperty(), null, "fixedMProperties", "", 0, -1, MObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMObject_FixedMSteps(), this.getMStep(), null, "fixedMSteps", "", 0, -1, MObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		

		initEClass(mElementEClass, MElement.class, "MElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMElement_Name(), this.getMString(), "name", "", 1, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_TypeName(), this.getMString(), "typeName", null, 1, 1, MElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_TypeNameForUI(), this.getMString(), "typeNameForUI", null, 1, 1, MElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_NameForUI(), ecorePackage.getEString(), "nameForUI", "", 1, 1, MElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_Description(), this.getMString(), "description", "", 1, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_DescriptionForUI(), ecorePackage.getEString(), "descriptionForUI", "", 1, 1, MElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_IconFilePath(), this.getMFile(), "iconFilePath", null, 0, 1, MElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_OverlayIconFilePath(), this.getMFile(), "overlayIconFilePath", null, 0, 1, MElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_CompositeClassName(), ecorePackage.getEString(), "compositeClassName", "", 0, 1, MElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMElement_Simulated(), ecorePackage.getEBoolean(), "simulated", null, 1, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		EOperation op = addEOperation(mElementEClass, ecorePackage.getEBoolean(), "validate", 1, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnosticsChain", 1, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 1, 1);

		initEClass(mParameterEClass, MParameter.class, "MParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		

		initEClass(mPropertyEClass, MProperty.class, "MProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		

		initEClass(mResultEClass, MResult.class, "MResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		

		initEClass(mStatefulObjectEClass, MStatefulObject.class, "MStatefulObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMStatefulObject_MStateProperty(), this.getMProperty(), null, "mStateProperty", "Active", 1, 1, MStatefulObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMStatefulObject_MLastStateChangeProperty(), this.getMProperty(), null, "mLastStateChangeProperty", null, 1, 1, MStatefulObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStatefulObject_LastStateChangeProperty(), this.getMDateTime(), "lastStateChangeProperty", null, 0, 1, MStatefulObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mStepEClass, MStep.class, "MStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMStep_MInputSteps(), this.getMStep(), null, "mInputSteps", null, 0, -1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMStep_FixedMParameters(), this.getMParameter(), null, "fixedMParameters", "", 0, -1, MStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMStep_FixedMResults(), this.getMResult(), null, "fixedMResults", "", 0, -1, MStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_ExclusiveProperty(), this.getMBoolean(), "exclusiveProperty", "false", 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_StateProperty(), this.getMStepState(), "stateProperty", "Pending", 1, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMStep_MProgressProperty(), this.getMProperty(), null, "mProgressProperty", "", 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_ProgressProperty(), this.getMLong(), "progressProperty", null, 0, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMStep_MProgressStatusProperty(), this.getMProperty(), null, "mProgressStatusProperty", "", 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_ProgressStatusProperty(), this.getMString(), "progressStatusProperty", null, 0, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMStep_MStartTriggerProperty(), this.getMProperty(), null, "mStartTriggerProperty", "", 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_StartTriggerProperty(), this.getMString(), "startTriggerProperty", null, 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_Interruptable(), ecorePackage.getEBoolean(), "interruptable", "false", 1, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_Stoppable(), ecorePackage.getEBoolean(), "stoppable", "false", 1, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_Terminatable(), ecorePackage.getEBoolean(), "terminatable", "false", 1, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_ActionName(), ecorePackage.getEString(), "actionName", "Start", 1, 1, MStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMStep_Exception(), this.getEThrowable(), "exception", null, 1, 1, MStep.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mValueEClass, MValue.class, "MValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMValue_MInputValues(), this.getMValue(), null, "mInputValues", null, 0, -1, MValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValue_ValueForUI(), ecorePackage.getEString(), "valueForUI", null, 1, 1, MValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValue_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, MValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValue_HistoricValues(), ecorePackage.getEJavaObject(), "historicValues", null, 0, -1, MValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMValue_HistoricValuesForUI(), ecorePackage.getEString(), "historicValuesForUI", null, 0, -1, MValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMValue_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1, MValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mApplicationEClass, MApplication.class, "MApplication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMApplication_MDataFileProperty(), this.getMProperty(), null, "mDataFileProperty", "new MDataFileProperty()", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_DataFileProperty(), this.getMFile(), "dataFileProperty", "Application Data Files\\Data.xml", 1, 1, MApplication.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_DataFilePropertyHistoricValues(), this.getMFile(), "dataFilePropertyHistoricValues", null, 0, 5, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMApplication_MLogFileProperty(), this.getMProperty(), null, "mLogFileProperty", "", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_LogFileProperty(), this.getMFile(), "logFileProperty", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_MPathProperty(), this.getMProperty(), null, "mPathProperty", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_PathProperty(), this.getMFile(), "pathProperty", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_MVersionProperty(), this.getMProperty(), null, "mVersionProperty", "", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_VersionProperty(), this.getMString(), "versionProperty", "0.9.0", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_MLastSaveProperty(), this.getMProperty(), null, "mLastSaveProperty", "", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_LastSaveProperty(), this.getMDateTime(), "lastSaveProperty", null, 0, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mScriptEClass, MScript.class, "MScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMScript_MSteps(), this.getMStep(), null, "mSteps", null, 0, -1, MScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMScript_StateProperty(), this.getMStepState(), "stateProperty", "Pending", 1, 1, MScript.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMScript_MProgressProperty(), this.getMProperty(), null, "mProgressProperty", "", 1, 1, MScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMScript_ProgressProperty(), this.getMLong(), "progressProperty", null, 0, 1, MScript.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMScript_MProgressStatusProperty(), this.getMProperty(), null, "mProgressStatusProperty", "", 1, 1, MScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMScript_ProgressStatusProperty(), this.getMString(), "progressStatusProperty", null, 0, 1, MScript.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mDmsApplicationEClass, MDmsApplication.class, "MDmsApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDmsApplication_MServiceFilePathProperty(), this.getMProperty(), null, "mServiceFilePathProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_ServiceFilePathProperty(), this.getMExistingFile(), "serviceFilePathProperty", "Service Files", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MWwxFilesPathProperty(), this.getMProperty(), null, "mWwxFilesPathProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_WwxFilesPathProperty(), this.getMExistingFile(), "wwxFilesPathProperty", "WWX Files", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MMp3EncoderPathProperty(), this.getMProperty(), null, "mMp3EncoderPathProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_Mp3EncoderPathProperty(), this.getMExistingFile(), "mp3EncoderPathProperty", "Program Files\\LAME 3.96.1", 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MFtpServerUrlProperty(), this.getMProperty(), null, "mFtpServerUrlProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_FtpServerUrlProperty(), this.getMUrl(), "ftpServerUrlProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_FtpServerUrlPropertyHistoricValues(), this.getMUrl(), "ftpServerUrlPropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MFtpUserNameProperty(), this.getMProperty(), null, "mFtpUserNameProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_FtpUserNameProperty(), this.getMString(), "ftpUserNameProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_FtpUserNamePropertyHistoricValues(), this.getMString(), "ftpUserNamePropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MFtpUserPasswordProperty(), this.getMProperty(), null, "mFtpUserPasswordProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_FtpUserPasswordProperty(), this.getMPassword(), "ftpUserPasswordProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MWebServerUrlProperty(), this.getMProperty(), null, "mWebServerUrlProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_WebServerUrlProperty(), this.getMUrl(), "webServerUrlProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_WebServerUrlPropertyHistoricValues(), this.getMUrl(), "webServerUrlPropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MSmtpServerProperty(), this.getMProperty(), null, "mSmtpServerProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_SmtpServerProperty(), this.getMString(), "smtpServerProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_SmtpServerPropertyHistoricValues(), this.getMString(), "smtpServerPropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MSmtpUserNameProperty(), this.getMProperty(), null, "mSmtpUserNameProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_SmtpUserNameProperty(), this.getMString(), "smtpUserNameProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_SmtpUserNamePropertyHistoricValues(), this.getMString(), "smtpUserNamePropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MSmtpPasswordProperty(), this.getMProperty(), null, "mSmtpPasswordProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_SmtpPasswordProperty(), this.getMPassword(), "smtpPasswordProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MBurningSoftwareDirectoryPathProperty(), this.getMProperty(), null, "mBurningSoftwareDirectoryPathProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_BurningSoftwareDirectoryPathProperty(), this.getMExistingFile(), "burningSoftwareDirectoryPathProperty", null, 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MDriveProperty(), this.getMProperty(), null, "mDriveProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_DriveProperty(), this.getMString(), "driveProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_DrivePropertyHistoricValues(), this.getMString(), "drivePropertyHistoricValues", null, 0, 3, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MUpgradeMessageProperty(), this.getMProperty(), null, "mUpgradeMessageProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_UpgradeMessageProperty(), this.getMString(), "upgradeMessageProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MUpgradeRelativeFtpPathProperty(), this.getMProperty(), null, "mUpgradeRelativeFtpPathProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_UpgradeRelativeFtpPathProperty(), this.getMString(), "upgradeRelativeFtpPathProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MLastUpgradeProperty(), this.getMProperty(), null, "mLastUpgradeProperty", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplication_LastUpgradeProperty(), this.getMDateTime(), "lastUpgradeProperty", null, 0, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MGetDataUpgradeInfoStep(), this.getMDmsApplicationMGetDataUpgradeInfoStep(), null, "mGetDataUpgradeInfoStep", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MUpgradeDataStep(), this.getMDmsApplicationMUpgradeDataStep(), null, "mUpgradeDataStep", "", 1, 1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MScripts(), this.getMScript(), null, "mScripts", null, 1, -1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplication_MMp3Folders(), this.getMMp3Folder(), null, "mMp3Folders", null, 1, -1, MDmsApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mEnterInformationStepEClass, MEnterInformationStep.class, "MEnterInformationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		

		initEClass(mEnterWwxInformationStepEClass, MEnterWwxInformationStep.class, "MEnterWwxInformationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEnterWwxInformationStep_MWwxDateParameter(), this.getMParameter(), null, "mWwxDateParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_WwxDateParameter(), this.getMDate(), "wwxDateParameter", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MTitleOfTalkParameter(), this.getMParameter(), null, "mTitleOfTalkParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_TitleOfTalkParameter(), this.getMString(), "titleOfTalkParameter", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MSpeakersNameParameter(), this.getMParameter(), null, "mSpeakersNameParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SpeakersNameParameter(), this.getMString(), "speakersNameParameter", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SpeakersNameParameterHistoricValues(), this.getMString(), "speakersNameParameterHistoricValues", null, 0, 5, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MFirstPartParameter(), this.getMParameter(), null, "mFirstPartParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_FirstPartParameter(), this.getMString(), "firstPartParameter", null, 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_FirstPartParameterHistoricValues(), this.getMString(), "firstPartParameterHistoricValues", null, 0, 2, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MSecondPartParameter(), this.getMParameter(), null, "mSecondPartParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SecondPartParameter(), this.getMString(), "secondPartParameter", null, 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SecondPartParameterHistoricValues(), this.getMString(), "secondPartParameterHistoricValues", null, 0, 2, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MRecordingUsersNameParameter(), this.getMParameter(), null, "mRecordingUsersNameParameter", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_RecordingUsersNameParameter(), this.getMString(), "recordingUsersNameParameter", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_RecordingUsersNameParameterHistoricValues(), this.getMString(), "recordingUsersNameParameterHistoricValues", null, 0, 5, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MWwxDateResult(), this.getMResult(), null, "mWwxDateResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_WwxDateResult(), this.getMDate(), "wwxDateResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MTitleOfTalkResult(), this.getMResult(), null, "mTitleOfTalkResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_TitleOfTalkResult(), this.getMString(), "titleOfTalkResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MSpeakersNameResult(), this.getMResult(), null, "mSpeakersNameResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SpeakersNameResult(), this.getMString(), "speakersNameResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MFirstPartResult(), this.getMResult(), null, "mFirstPartResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_FirstPartResult(), this.getMString(), "firstPartResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MSecondPartResult(), this.getMResult(), null, "mSecondPartResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_SecondPartResult(), this.getMString(), "secondPartResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterWwxInformationStep_MRecordingUsersNameResult(), this.getMResult(), null, "mRecordingUsersNameResult", "", 1, 1, MEnterWwxInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterWwxInformationStep_RecordingUsersNameResult(), this.getMString(), "recordingUsersNameResult", null, 1, 1, MEnterWwxInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mEnterServiceInformationStepEClass, MEnterServiceInformationStep.class, "MEnterServiceInformationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEnterServiceInformationStep_MServiceDateParameter(), this.getMParameter(), null, "mServiceDateParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ServiceDateParameter(), this.getMDate(), "serviceDateParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MServiceTypeParameter(), this.getMParameter(), null, "mServiceTypeParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ServiceTypeParameter(), this.getMString(), "serviceTypeParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ServiceTypeParameterHistoricValues(), this.getMString(), "serviceTypeParameterHistoricValues", null, 0, 5, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MTitleOfTalkParameter(), this.getMParameter(), null, "mTitleOfTalkParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_TitleOfTalkParameter(), this.getMString(), "titleOfTalkParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MReadingParameter(), this.getMParameter(), null, "mReadingParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ReadingParameter(), this.getMString(), "readingParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MSpeakersNameParameter(), this.getMParameter(), null, "mSpeakersNameParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_SpeakersNameParameter(), this.getMString(), "speakersNameParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_SpeakersNameParameterHistoricValues(), this.getMString(), "speakersNameParameterHistoricValues", null, 0, 5, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MRecordingUsersNameParameter(), this.getMParameter(), null, "mRecordingUsersNameParameter", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_RecordingUsersNameParameter(), this.getMString(), "recordingUsersNameParameter", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_RecordingUsersNameParameterHistoricValues(), this.getMString(), "recordingUsersNameParameterHistoricValues", null, 0, 5, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MServiceDateResult(), this.getMResult(), null, "mServiceDateResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ServiceDateResult(), this.getMDate(), "serviceDateResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MServiceTypeResult(), this.getMResult(), null, "mServiceTypeResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ServiceTypeResult(), this.getMString(), "serviceTypeResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MTitleOfTalkResult(), this.getMResult(), null, "mTitleOfTalkResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_TitleOfTalkResult(), this.getMString(), "titleOfTalkResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MReadingResult(), this.getMResult(), null, "mReadingResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_ReadingResult(), this.getMString(), "readingResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MSpeakersNameResult(), this.getMResult(), null, "mSpeakersNameResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_SpeakersNameResult(), this.getMString(), "speakersNameResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEnterServiceInformationStep_MRecordingUsersNameResult(), this.getMResult(), null, "mRecordingUsersNameResult", "", 1, 1, MEnterServiceInformationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnterServiceInformationStep_RecordingUsersNameResult(), this.getMString(), "recordingUsersNameResult", null, 1, 1, MEnterServiceInformationStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mCreateDirectoryStepEClass, MCreateDirectoryStep.class, "MCreateDirectoryStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCreateDirectoryStep_MParentDirectoryParameter(), this.getMParameter(), null, "mParentDirectoryParameter", "", 1, 1, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCreateDirectoryStep_ParentDirectoryParameter(), this.getMExistingFile(), "parentDirectoryParameter", null, 1, 1, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCreateDirectoryStep_ParentDirectoryParameterHistoricValues(), this.getMExistingFile(), "parentDirectoryParameterHistoricValues", null, 0, 3, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCreateDirectoryStep_MDirectoryNameParameter(), this.getMParameter(), null, "mDirectoryNameParameter", "", 1, 1, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCreateDirectoryStep_DirectoryNameParameter(), this.getMFile(), "directoryNameParameter", null, 1, 1, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCreateDirectoryStep_MDirectoryResult(), this.getMResult(), null, "mDirectoryResult", "", 1, 1, MCreateDirectoryStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCreateDirectoryStep_DirectoryResult(), this.getMExistingFile(), "directoryResult", null, 1, 1, MCreateDirectoryStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mCheckFreeDiskSpaceStepEClass, MCheckFreeDiskSpaceStep.class, "MCheckFreeDiskSpaceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCheckFreeDiskSpaceStep_MRequiredFreeDiskSpaceParameter(), this.getMParameter(), null, "mRequiredFreeDiskSpaceParameter", "", 1, 1, MCheckFreeDiskSpaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCheckFreeDiskSpaceStep_RequiredFreeDiskSpaceParameter(), this.getMLong(), "requiredFreeDiskSpaceParameter", null, 1, 1, MCheckFreeDiskSpaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCheckFreeDiskSpaceStep_MDirectoryParameter(), this.getMParameter(), null, "mDirectoryParameter", "", 1, 1, MCheckFreeDiskSpaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCheckFreeDiskSpaceStep_DirectoryParameter(), this.getMExistingFile(), "directoryParameter", null, 1, 1, MCheckFreeDiskSpaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCheckFreeDiskSpaceStep_MFreeDiskSpaceResult(), this.getMResult(), null, "mFreeDiskSpaceResult", "", 1, 1, MCheckFreeDiskSpaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCheckFreeDiskSpaceStep_FreeDiskSpaceResult(), this.getMLong(), "freeDiskSpaceResult", null, 0, 1, MCheckFreeDiskSpaceStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mAudioStepEClass, MAudioStep.class, "MAudioStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAudioStep_MLeftInputLevelProperty(), this.getMProperty(), null, "mLeftInputLevelProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_LeftInputLevelProperty(), this.getMLong(), "leftInputLevelProperty", "0", 1, 1, MAudioStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAudioStep_MRightInputLevelProperty(), this.getMProperty(), null, "mRightInputLevelProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_RightInputLevelProperty(), this.getMLong(), "rightInputLevelProperty", "0", 1, 1, MAudioStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAudioStep_MLeftInputDistortionProperty(), this.getMProperty(), null, "mLeftInputDistortionProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_LeftInputDistortionProperty(), this.getMBoolean(), "leftInputDistortionProperty", "false", 1, 1, MAudioStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAudioStep_MRightInputDistortionProperty(), this.getMProperty(), null, "mRightInputDistortionProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_RightInputDistortionProperty(), this.getMBoolean(), "rightInputDistortionProperty", "false", 1, 1, MAudioStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAudioStep_MUseDbProperty(), this.getMProperty(), null, "mUseDbProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_UseDbProperty(), this.getMBoolean(), "useDbProperty", "true", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAudioStep_MHeadroomProperty(), this.getMProperty(), null, "mHeadroomProperty", "", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAudioStep_HeadroomProperty(), this.getMLong(), "headroomProperty", "9", 1, 1, MAudioStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mCheckInputLevelsStepEClass, MCheckInputLevelsStep.class, "MCheckInputLevelsStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		

		initEClass(mRecordStepEClass, MRecordStep.class, "MRecordStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRecordStep_MDirectoryParameter(), this.getMParameter(), null, "mDirectoryParameter", "", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRecordStep_DirectoryParameter(), this.getMExistingFile(), "directoryParameter", null, 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRecordStep_MRecordingFileParameter(), this.getMParameter(), null, "mRecordingFileParameter", "", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRecordStep_RecordingFileParameter(), this.getMFile(), "recordingFileParameter", "Recording.wav", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRecordStep_MRecordingFileResult(), this.getMResult(), null, "mRecordingFileResult", "", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRecordStep_RecordingFileResult(), this.getMExistingFile(), "recordingFileResult", null, 1, 1, MRecordStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRecordStep_MRecordingFileSizeResult(), this.getMResult(), null, "mRecordingFileSizeResult", "", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRecordStep_RecordingFileSizeResult(), this.getMLong(), "recordingFileSizeResult", null, 1, 1, MRecordStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRecordStep_MRecordingLengthResult(), this.getMResult(), null, "mRecordingLengthResult", "", 1, 1, MRecordStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRecordStep_RecordingLengthResult(), this.getMDuration(), "recordingLengthResult", null, 1, 1, MRecordStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mConvertToMP3StepEClass, MConvertToMP3Step.class, "MConvertToMP3Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConvertToMP3Step_MArtistParameter(), this.getMParameter(), null, "mArtistParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_ArtistParameter(), this.getMString(), "artistParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MTitleParameter(), this.getMParameter(), null, "mTitleParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_TitleParameter(), this.getMString(), "titleParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MAlbumParameter(), this.getMParameter(), null, "mAlbumParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_AlbumParameter(), this.getMString(), "albumParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MYearParameter(), this.getMParameter(), null, "mYearParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_YearParameter(), this.getMString(), "yearParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MDirectoryParameter(), this.getMParameter(), null, "mDirectoryParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_DirectoryParameter(), this.getMExistingFile(), "directoryParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MMp3FileNameParameter(), this.getMParameter(), null, "mMp3FileNameParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_Mp3FileNameParameter(), this.getMFile(), "mp3FileNameParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MRecordingFileParameter(), this.getMParameter(), null, "mRecordingFileParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_RecordingFileParameter(), this.getMExistingFile(), "recordingFileParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MMp3EncoderPathParameter(), this.getMParameter(), null, "mMp3EncoderPathParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_Mp3EncoderPathParameter(), this.getMExistingFile(), "mp3EncoderPathParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MAverageBitRateParameter(), this.getMParameter(), null, "mAverageBitRateParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_AverageBitRateParameter(), this.getMLong(), "averageBitRateParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MMp3FolderReferenceParameter(), this.getMParameter(), null, "mMp3FolderReferenceParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_Mp3FolderReferenceParameter(), this.getMMp3Folder(), null, "mp3FolderReferenceParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MMp3EntryNameParameter(), this.getMParameter(), null, "mMp3EntryNameParameter", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMConvertToMP3Step_Mp3EntryNameParameter(), this.getMString(), "mp3EntryNameParameter", null, 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_MMp3EntryReferenceResult(), this.getMResult(), null, "mMp3EntryReferenceResult", "", 1, 1, MConvertToMP3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConvertToMP3Step_Mp3EntryReferenceResult(), this.getMMp3(), null, "mp3EntryReferenceResult", null, 1, 1, MConvertToMP3Step.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mPublishMp3sStepEClass, MPublishMp3sStep.class, "MPublishMp3sStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPublishMp3sStep_MMaxiumumDiskSpaceParameter(), this.getMParameter(), null, "mMaxiumumDiskSpaceParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_MaxiumumDiskSpaceParameter(), this.getMLong(), "maxiumumDiskSpaceParameter", null, 0, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MMp3RelativeFtpPathParameter(), this.getMParameter(), null, "mMp3RelativeFtpPathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_Mp3RelativeFtpPathParameter(), this.getMString(), "mp3RelativeFtpPathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MWebServerUrlParameter(), this.getMParameter(), null, "mWebServerUrlParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_WebServerUrlParameter(), this.getMUrl(), "webServerUrlParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MContentPageRelativeFtpPathParameter(), this.getMParameter(), null, "mContentPageRelativeFtpPathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_ContentPageRelativeFtpPathParameter(), this.getMString(), "contentPageRelativeFtpPathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MContentHeaderFilePathParameter(), this.getMParameter(), null, "mContentHeaderFilePathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_ContentHeaderFilePathParameter(), this.getMExistingFile(), "contentHeaderFilePathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MContentFooterFilePathParameter(), this.getMParameter(), null, "mContentFooterFilePathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_ContentFooterFilePathParameter(), this.getMExistingFile(), "contentFooterFilePathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MContentPageFilePathParameter(), this.getMParameter(), null, "mContentPageFilePathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_ContentPageFilePathParameter(), this.getMFile(), "contentPageFilePathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MPodcastFilePathParameter(), this.getMParameter(), null, "mPodcastFilePathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_PodcastFilePathParameter(), this.getMFile(), "podcastFilePathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MPodcastRelativeFtpPathParameter(), this.getMParameter(), null, "mPodcastRelativeFtpPathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_PodcastRelativeFtpPathParameter(), this.getMString(), "podcastRelativeFtpPathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishMp3sStep_MPodcastHeaderFilePathParameter(), this.getMParameter(), null, "mPodcastHeaderFilePathParameter", "", 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishMp3sStep_PodcastHeaderFilePathParameter(), this.getMExistingFile(), "podcastHeaderFilePathParameter", null, 1, 1, MPublishMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mUpdatePublishedMp3sStepEClass, MUpdatePublishedMp3sStep.class, "MUpdatePublishedMp3sStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMUpdatePublishedMp3sStep_MRepublishMp3Files(), this.getMParameter(), null, "mRepublishMp3Files", "", 1, 1, MUpdatePublishedMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMUpdatePublishedMp3sStep_RepublishMp3Files(), this.getMBoolean(), "republishMp3Files", "false", 1, 1, MUpdatePublishedMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMUpdatePublishedMp3sStep_MMp3FolderReferenceParameter(), this.getMParameter(), null, "mMp3FolderReferenceParameter", "", 1, 1, MUpdatePublishedMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMUpdatePublishedMp3sStep_Mp3FolderReferenceParameter(), this.getMMp3Folder(), null, "mp3FolderReferenceParameter", null, 1, 1, MUpdatePublishedMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMUpdatePublishedMp3sStep_MMp3FolderReferenceResult(), this.getMResult(), null, "mMp3FolderReferenceResult", "", 1, 1, MUpdatePublishedMp3sStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMUpdatePublishedMp3sStep_Mp3FolderReferenceResult(), this.getMMp3Folder(), null, "mp3FolderReferenceResult", null, 1, 1, MUpdatePublishedMp3sStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mPublishNewMp3StepEClass, MPublishNewMp3Step.class, "MPublishNewMp3Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPublishNewMp3Step_MMp3EntryReferenceParameter(), this.getMParameter(), null, "mMp3EntryReferenceParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_Mp3EntryReferenceParameter(), this.getMMp3(), null, "mp3EntryReferenceParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MLinkTextParameter(), this.getMParameter(), null, "mLinkTextParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_LinkTextParameter(), this.getMString(), "linkTextParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MLinkDescriptionParameter(), this.getMParameter(), null, "mLinkDescriptionParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_LinkDescriptionParameter(), this.getMString(), "linkDescriptionParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MCommentParameter(), this.getMParameter(), null, "mCommentParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_CommentParameter(), this.getMString(), "commentParameter", null, 0, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MPodcastTitleParameter(), this.getMParameter(), null, "mPodcastTitleParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_PodcastTitleParameter(), this.getMString(), "podcastTitleParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MPodcastSubtitleParameter(), this.getMParameter(), null, "mPodcastSubtitleParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_PodcastSubtitleParameter(), this.getMString(), "podcastSubtitleParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MPodcastSummaryParameter(), this.getMParameter(), null, "mPodcastSummaryParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_PodcastSummaryParameter(), this.getMString(), "podcastSummaryParameter", null, 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MPodcastPublishingDateParameter(), this.getMParameter(), null, "mPodcastPublishingDateParameter", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPublishNewMp3Step_PodcastPublishingDateParameter(), this.getMDateTime(), "podcastPublishingDateParameter", null, 1, 1, MPublishNewMp3Step.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_MPublishedMp3EntryReferenceResult(), this.getMResult(), null, "mPublishedMp3EntryReferenceResult", "", 1, 1, MPublishNewMp3Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPublishNewMp3Step_PublishedMp3EntryReferenceResult(), this.getMMp3(), null, "publishedMp3EntryReferenceResult", null, 1, 1, MPublishNewMp3Step.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mEmailEventLogStepEClass, MEmailEventLogStep.class, "MEmailEventLogStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEmailEventLogStep_MRecordingUsersNameParameter(), this.getMParameter(), null, "mRecordingUsersNameParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_RecordingUsersNameParameter(), this.getMString(), "recordingUsersNameParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MCommentParameter(), this.getMParameter(), null, "mCommentParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_CommentParameter(), this.getMString(), "commentParameter", null, 0, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MLogFileParameter(), this.getMParameter(), null, "mLogFileParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_LogFileParameter(), this.getMExistingFile(), "logFileParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MDataFileParameter(), this.getMParameter(), null, "mDataFileParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_DataFileParameter(), this.getMExistingFile(), "dataFileParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MSubjectParameter(), this.getMParameter(), null, "mSubjectParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SubjectParameter(), this.getMString(), "subjectParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MSendersEmailAddressParameter(), this.getMParameter(), null, "mSendersEmailAddressParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SendersEmailAddressParameter(), this.getMString(), "sendersEmailAddressParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SendersEmailAddressParameterHistoricValues(), this.getMString(), "sendersEmailAddressParameterHistoricValues", null, 0, 6, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MReceipientsEmailAddressParameter(), this.getMParameter(), null, "mReceipientsEmailAddressParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_ReceipientsEmailAddressParameter(), this.getMString(), "receipientsEmailAddressParameter", null, 1, -1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MSmtpServerParameter(), this.getMParameter(), null, "mSmtpServerParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SmtpServerParameter(), this.getMString(), "smtpServerParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MSmtpUserNameParameter(), this.getMParameter(), null, "mSmtpUserNameParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SmtpUserNameParameter(), this.getMString(), "smtpUserNameParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEmailEventLogStep_MSmtpPasswordParameter(), this.getMParameter(), null, "mSmtpPasswordParameter", "", 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEmailEventLogStep_SmtpPasswordParameter(), this.getMPassword(), "smtpPasswordParameter", null, 1, 1, MEmailEventLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mMp3FolderEClass, MMp3Folder.class, "MMp3Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMp3Folder_MSteps(), this.getMStep(), null, "mSteps", null, 1, -1, MMp3Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3Folder_MMp3s(), this.getMMp3(), null, "mMp3s", null, 1, -1, MMp3Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mMp3EClass, MMp3.class, "MMp3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMp3_StateProperty(), this.getMMp3State(), "stateProperty", "Not published", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MFileProperty(), this.getMProperty(), null, "mFileProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_FileProperty(), this.getMExistingFile(), "fileProperty", null, 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MLinkTextProperty(), this.getMProperty(), null, "mLinkTextProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_LinkTextProperty(), this.getMString(), "linkTextProperty", null, 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MLinkDescriptionProperty(), this.getMProperty(), null, "mLinkDescriptionProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_LinkDescriptionProperty(), this.getMString(), "linkDescriptionProperty", null, 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MCommentProperty(), this.getMProperty(), null, "mCommentProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_CommentProperty(), this.getMString(), "commentProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MPodcastTitleProperty(), this.getMProperty(), null, "mPodcastTitleProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_PodcastTitleProperty(), this.getMString(), "podcastTitleProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MPodcastSubtitleProperty(), this.getMProperty(), null, "mPodcastSubtitleProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_PodcastSubtitleProperty(), this.getMString(), "podcastSubtitleProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MPodcastSummaryProperty(), this.getMProperty(), null, "mPodcastSummaryProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_PodcastSummaryProperty(), this.getMString(), "podcastSummaryProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MPodcastPublishingDateProperty(), this.getMProperty(), null, "mPodcastPublishingDateProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_PodcastPublishingDateProperty(), this.getMDateTime(), "podcastPublishingDateProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMp3_MPublishedFileNameProperty(), this.getMProperty(), null, "mPublishedFileNameProperty", "", 1, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMp3_PublishedFileNameProperty(), this.getMString(), "publishedFileNameProperty", null, 0, 1, MMp3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mBurnCdStepEClass, MBurnCdStep.class, "MBurnCdStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBurnCdStep_MRecordingFilesParameter(), this.getMParameter(), null, "mRecordingFilesParameter", "", 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBurnCdStep_RecordingFilesParameter(), this.getMExistingFile(), "recordingFilesParameter", null, 1, -1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBurnCdStep_MBurningSoftwareDirectoryPathParameter(), this.getMParameter(), null, "mBurningSoftwareDirectoryPathParameter", "", 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBurnCdStep_BurningSoftwareDirectoryPathParameter(), this.getMExistingFile(), "burningSoftwareDirectoryPathParameter", null, 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBurnCdStep_MDriveParameter(), this.getMParameter(), null, "mDriveParameter", "", 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBurnCdStep_DriveParameter(), this.getMString(), "driveParameter", null, 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBurnCdStep_MTotalRecordingLengthParameter(), this.getMParameter(), null, "mTotalRecordingLengthParameter", "", 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBurnCdStep_TotalRecordingLengthParameter(), this.getMDuration(), "totalRecordingLengthParameter", null, 0, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBurnCdStep_MTotalRecordingFileSizeParameter(), this.getMParameter(), null, "mTotalRecordingFileSizeParameter", "", 1, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBurnCdStep_TotalRecordingFileSizeParameter(), this.getMLong(), "totalRecordingFileSizeParameter", null, 0, 1, MBurnCdStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mFtpStepEClass, MFtpStep.class, "MFtpStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFtpStep_MFtpServerUrlParameter(), this.getMParameter(), null, "mFtpServerUrlParameter", "", 1, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFtpStep_FtpServerUrlParameter(), this.getMUrl(), "ftpServerUrlParameter", null, 1, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFtpStep_MFtpUserNameParameter(), this.getMParameter(), null, "mFtpUserNameParameter", "", 1, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFtpStep_FtpUserNameParameter(), this.getMString(), "ftpUserNameParameter", null, 1, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFtpStep_MFtpUserPasswordParameter(), this.getMParameter(), null, "mFtpUserPasswordParameter", "", 1, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFtpStep_FtpUserPasswordParameter(), this.getMPassword(), "ftpUserPasswordParameter", null, 0, 1, MFtpStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mTestStepEClass, MTestStep.class, "MTestStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMTestStep_MPersistentStringParameter(), this.getMParameter(), null, "mPersistentStringParameter", "", 1, 1, MTestStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTestStep_PersistentStringParameter(), this.getMString(), "persistentStringParameter", null, 0, 1, MTestStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTestStep_MStringParameter(), this.getMParameter(), null, "mStringParameter", "", 1, 1, MTestStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTestStep_StringParameter(), this.getMString(), "stringParameter", null, 0, 1, MTestStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mDmsApplicationMGetDataUpgradeInfoStepEClass, MDmsApplicationMGetDataUpgradeInfoStep.class, "MDmsApplicationMGetDataUpgradeInfoStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeRelativeFtpPathProperty(), this.getMParameter(), null, "mUpgradeRelativeFtpPathProperty", "", 1, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeRelativeFtpPathProperty(), this.getMString(), "upgradeRelativeFtpPathProperty", null, 1, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeAvailableResult(), this.getMResult(), null, "mUpgradeAvailableResult", "", 1, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeAvailableResult(), this.getMBoolean(), "upgradeAvailableResult", null, 0, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeMessageResult(), this.getMResult(), null, "mUpgradeMessageResult", "", 1, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeMessageResult(), this.getMString(), "upgradeMessageResult", null, 0, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeDateResult(), this.getMResult(), null, "mUpgradeDateResult", "", 1, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeDateResult(), this.getMDateTime(), "upgradeDateResult", null, 0, 1, MDmsApplicationMGetDataUpgradeInfoStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		initEClass(mDmsApplicationMUpgradeDataStepEClass, MDmsApplicationMUpgradeDataStep.class, "MDmsApplicationMUpgradeDataStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDmsApplicationMUpgradeDataStep_MUpgradeRelativeFtpPathProperty(), this.getMParameter(), null, "mUpgradeRelativeFtpPathProperty", "", 1, 1, MDmsApplicationMUpgradeDataStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMUpgradeDataStep_UpgradeRelativeFtpPathProperty(), this.getMString(), "upgradeRelativeFtpPathProperty", null, 1, 1, MDmsApplicationMUpgradeDataStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplicationMUpgradeDataStep_MUpgradeMessageParameter(), this.getMParameter(), null, "mUpgradeMessageParameter", "", 1, 1, MDmsApplicationMUpgradeDataStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMUpgradeDataStep_UpgradeMessageParameter(), this.getMString(), "upgradeMessageParameter", null, 0, 1, MDmsApplicationMUpgradeDataStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDmsApplicationMUpgradeDataStep_MUpgradeDateParameter(), this.getMParameter(), null, "mUpgradeDateParameter", "", 1, 1, MDmsApplicationMUpgradeDataStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDmsApplicationMUpgradeDataStep_UpgradeDateParameter(), this.getMDateTime(), "upgradeDateParameter", null, 0, 1, MDmsApplicationMUpgradeDataStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		

		// Initialize data types
		initEDataType(mFileEDataType, File.class, "MFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mExistingFileEDataType, File.class, "MExistingFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mStateEDataType, State.class, "MState", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mStepStateEDataType, State.class, "MStepState", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mBooleanEDataType, Boolean.class, "MBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mDateTimeEDataType, Date.class, "MDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mDateEDataType, Date.class, "MDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mTimeEDataType, Date.class, "MTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mDurationEDataType, Long.class, "MDuration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mLongEDataType, Long.class, "MLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mPasswordEDataType, String.class, "MPassword", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mStringEDataType, String.class, "MString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mUrlEDataType, URL.class, "MUrl", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eThrowableEDataType, Throwable.class, "EThrowable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mMp3StateEDataType, State.class, "MMp3State", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.onceforall.org/mcore
		createMcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.onceforall.org/mcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMcoreAnnotations() {
		String source = "http://www.onceforall.org/mcore";		
		addAnnotation
		  (mObjectEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Entry",
			 "compositeClassName", "org.onceforall.dms.desktop.ui.MObjectComposite"
		   });		
		addAnnotation
		  (getMObject_MNameProperty(), 
		   source, 
		   new String[] {
			 "name", "Name",
			 "description", "Specifies the name.",
			 "valueEFeature", "name"
		   });		
		addAnnotation
		  (getMObject_MDescriptionProperty(), 
		   source, 
		   new String[] {
			 "name", "Description",
			 "description", "Specifies a detailed description.",
			 "valueEFeature", "description"
		   });		
		addAnnotation
		  (getMObject_MIconFilePathProperty(), 
		   source, 
		   new String[] {
			 "name", "Icon file path",
			 "description", "Specifies the file path to the icon that represents this element.",
			 "valueEFeature", "iconFilePath"
		   });		
		addAnnotation
		  (mElementEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Element"
		   });		
		addAnnotation
		  (mParameterEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Parameter"
		   });		
		addAnnotation
		  (mPropertyEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Property"
		   });		
		addAnnotation
		  (mResultEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Result"
		   });		
		addAnnotation
		  (getMStatefulObject_MStateProperty(), 
		   source, 
		   new String[] {
			 "name", "State",
			 "description", "Specifies the current state.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMStatefulObject_MLastStateChangeProperty(), 
		   source, 
		   new String[] {
			 "name", "Last state change",
			 "description", "Specifies the date and time of the last state change.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (mStepEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Task",
			 "compositeClassName", "org.onceforall.dms.desktop.ui.MStepComposite"
		   });		
		addAnnotation
		  (getMStep_MProgressProperty(), 
		   source, 
		   new String[] {
			 "name", "Progress",
			 "description", "Specifies the progress of the processing in %.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMStep_MProgressStatusProperty(), 
		   source, 
		   new String[] {
			 "name", "Progress status",
			 "description", "Specifies a textual representation of the progress.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMStep_MStartTriggerProperty(), 
		   source, 
		   new String[] {
			 "name", "Start trigger",
			 "description", "Specifies when the step should be started.\r\n\r\nIt can hold the following values:\r\n   \'Manual\' means that the step only starts when you explicitly request it.\r\n   \'Semi-automatic\' means that the step will request to be started when all steps it depends on have been completed and all necessary parameters have been entered.\r\n   \'Automatic\' means that the step will automatically start all steps it depends on have been completed and all necessary parameters have been entered."
		   });		
		addAnnotation
		  (mApplicationEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Application",
			 "name", "Digital Media Service Desktop",
			 "description", "Represents the whole application.",
			 "compositeClassName", "org.onceforall.dms.desktop.ui.MApplicationComposite",
			 "iconFilePath", "Image Files\\Application.gif"
		   });		
		addAnnotation
		  (getMApplication_MDataFileProperty(), 
		   source, 
		   new String[] {
			 "name", "Data file",
			 "description", "Specifies the file that contains the application data.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMApplication_MLogFileProperty(), 
		   source, 
		   new String[] {
			 "name", "Log file",
			 "description", "Specifies the file that contains the log data."
		   });		
		addAnnotation
		  (getMApplication_MPathProperty(), 
		   source, 
		   new String[] {
			 "name", "Path",
			 "description", "Specifies the path where this application has been started from."
		   });		
		addAnnotation
		  (getMApplication_MVersionProperty(), 
		   source, 
		   new String[] {
			 "name", "Version",
			 "description", "Specifies the version of the application."
		   });		
		addAnnotation
		  (getMApplication_MLastSaveProperty(), 
		   source, 
		   new String[] {
			 "name", "Last application data save",
			 "description", "Specifies the date and time when the application data was last saved.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (mScriptEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "Script",
			 "name", "Script",
			 "description", "Contains a number of tasks that should be completed.",
			 "iconFilePath", "Image Files\\Script.gif"
		   });		
		addAnnotation
		  (getMScript_MProgressProperty(), 
		   source, 
		   new String[] {
			 "name", "Progress",
			 "description", "Specifies the progress of the processing in %.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMScript_MProgressStatusProperty(), 
		   source, 
		   new String[] {
			 "name", "Progress status",
			 "description", "Specifies a textual representation of the progress.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (mFileEDataType, 
		   source, 
		   new String[] {
			 "name", "File"
		   });		
		addAnnotation
		  (mExistingFileEDataType, 
		   source, 
		   new String[] {
			 "name", "File (must exist)"
		   });		
		addAnnotation
		  (mStateEDataType, 
		   source, 
		   new String[] {
			 "name", "State"
		   });		
		addAnnotation
		  (mStepStateEDataType, 
		   source, 
		   new String[] {
			 "name", "Step state"
		   });		
		addAnnotation
		  (mBooleanEDataType, 
		   source, 
		   new String[] {
			 "name", "Yes/No"
		   });		
		addAnnotation
		  (mDateTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Date and time"
		   });		
		addAnnotation
		  (mDateEDataType, 
		   source, 
		   new String[] {
			 "name", "Date"
		   });		
		addAnnotation
		  (mTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Time"
		   });		
		addAnnotation
		  (mDurationEDataType, 
		   source, 
		   new String[] {
			 "name", "Duration"
		   });		
		addAnnotation
		  (mLongEDataType, 
		   source, 
		   new String[] {
			 "name", "Number"
		   });		
		addAnnotation
		  (mPasswordEDataType, 
		   source, 
		   new String[] {
			 "name", "Password"
		   });		
		addAnnotation
		  (mStringEDataType, 
		   source, 
		   new String[] {
			 "name", "Text"
		   });		
		addAnnotation
		  (mUrlEDataType, 
		   source, 
		   new String[] {
			 "name", "URL"
		   });		
		addAnnotation
		  (mMp3StateEDataType, 
		   source, 
		   new String[] {
			 "name", "MP3 state"
		   });		
		addAnnotation
		  (mDmsApplicationEClass, 
		   source, 
		   new String[] {
			 "name", "Digital Media Service Desktop"
		   });		
		addAnnotation
		  (getMDmsApplication_MServiceFilePathProperty(), 
		   source, 
		   new String[] {
			 "name", "Service files path",
			 "description", "Specifies the relative or absolute file path to the directory where the service recording files are stored."
		   });		
		addAnnotation
		  (getMDmsApplication_MWwxFilesPathProperty(), 
		   source, 
		   new String[] {
			 "name", "WWX files path",
			 "description", "Specifies the relative or absolute file path to the directory where the WordWiseXtra recording files are stored."
		   });		
		addAnnotation
		  (getMDmsApplication_MMp3EncoderPathProperty(), 
		   source, 
		   new String[] {
			 "name", "MP3 encoder path",
			 "description", "Specifies the path to the directory that contains the \'lame.exe\'."
		   });		
		addAnnotation
		  (getMDmsApplication_MFtpServerUrlProperty(), 
		   source, 
		   new String[] {
			 "name", "FTP server URL",
			 "description", "Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'"
		   });		
		addAnnotation
		  (getMDmsApplication_MFtpUserNameProperty(), 
		   source, 
		   new String[] {
			 "name", "FTP user name",
			 "description", "Specifies the user name for accessing the FTP server, e.g. \'ccb001\'."
		   });		
		addAnnotation
		  (getMDmsApplication_MFtpUserPasswordProperty(), 
		   source, 
		   new String[] {
			 "name", "FTP user password",
			 "description", "Specifies the user password for accessing the FTP server."
		   });		
		addAnnotation
		  (getMDmsApplication_MWebServerUrlProperty(), 
		   source, 
		   new String[] {
			 "name", "Web server URL",
			 "description", "Specifies the public web server URL, e.g.\'http://www.ccbromley.net\'."
		   });		
		addAnnotation
		  (getMDmsApplication_MSmtpServerProperty(), 
		   source, 
		   new String[] {
			 "name", "SMTP server",
			 "description", "Specifies the name or IP address of the (SMTP) server that is responsible for sending the email."
		   });		
		addAnnotation
		  (getMDmsApplication_MSmtpUserNameProperty(), 
		   source, 
		   new String[] {
			 "name", "SMTP user name",
			 "description", "Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMDmsApplication_MSmtpPasswordProperty(), 
		   source, 
		   new String[] {
			 "name", "SMTP password",
			 "description", "Specifies password used to authenticate on the (SMTP) server that is responsible for sending the email.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMDmsApplication_MBurningSoftwareDirectoryPathProperty(), 
		   source, 
		   new String[] {
			 "name", "CD-ROM burning software directory path",
			 "description", "Specifies the path to the directory that contains the \'nerocmd.exe\'."
		   });		
		addAnnotation
		  (getMDmsApplication_MDriveProperty(), 
		   source, 
		   new String[] {
			 "name", "Drive",
			 "description", "Specifies either the full name of the CD-ROM drive or the drive letter."
		   });		
		addAnnotation
		  (getMDmsApplication_MUpgradeMessageProperty(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade message",
			 "description", "Specifies important information about the last application data upgrade.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMDmsApplication_MUpgradeRelativeFtpPathProperty(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade relative FTP path",
			 "description", "Specifies the relative path on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'."
		   });		
		addAnnotation
		  (getMDmsApplication_MLastUpgradeProperty(), 
		   source, 
		   new String[] {
			 "name", "Last application data upgrade",
			 "description", "Specifies the date and time when the application data was last upgraded.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (mDmsApplicationMGetDataUpgradeInfoStepEClass, 
		   source, 
		   new String[] {
			 "name", "Get application data upgrade info",
			 "description", "Tries to find the application data upgrade file at the given FTP server location and retrieves the upgrade message if present.",
			 "actionName", "Get",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeRelativeFtpPathProperty(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade relative FTP path",
			 "description", "Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'."
		   });		
		addAnnotation
		  (getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeAvailableResult(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade available",
			 "description", "Specifies whether an application data upgrade file could be found on the FTP server at the specified location."
		   });		
		addAnnotation
		  (getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeMessageResult(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade message",
			 "description", "Specifies a message that provides a description of the application data upgrade."
		   });		
		addAnnotation
		  (getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeDateResult(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade date",
			 "description", "Specifies the date and time when the application data upgrade was created."
		   });		
		addAnnotation
		  (mDmsApplicationMUpgradeDataStepEClass, 
		   source, 
		   new String[] {
			 "name", "Upgrade application data",
			 "description", "Tried to find an upgrade file on the given FTP server location, optionally displays an upgrade message and upgrades the application data.",
			 "actionName", "Upgrade",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMDmsApplicationMUpgradeDataStep_MUpgradeRelativeFtpPathProperty(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade relative FTP path",
			 "description", "Specifies the path of the directory on the FTP server to the application data upgrade file, e.g. \'/dms/data.xml\'."
		   });		
		addAnnotation
		  (getMDmsApplicationMUpgradeDataStep_MUpgradeMessageParameter(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade message",
			 "description", "Specifies a message that provides a description of the application data upgrade. If this parameter contains a message, the user has to acknowledge it before he/she can proceed."
		   });		
		addAnnotation
		  (getMDmsApplicationMUpgradeDataStep_MUpgradeDateParameter(), 
		   source, 
		   new String[] {
			 "name", "Application data upgrade date",
			 "description", "Specifies the date and time when the application data upgrade was created.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (mEnterInformationStepEClass, 
		   source, 
		   new String[] {
			 "name", "Enter information",
			 "description", "Please enter the required information and then select \'Mark as completed\'.",
			 "iconFilePath", "Image Files/Enter information step.gif",
			 "actionName", "Mark as completed",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (mEnterWwxInformationStepEClass, 
		   source, 
		   new String[] {
			 "name", "Enter WordWiseXtra information",
			 "description", "Please enter information about the WordWiseXtra meeting and then select \'Mark as completed\'.",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MWwxDateParameter(), 
		   source, 
		   new String[] {
			 "name", "Date",
			 "description", "Specifies the date of the WordWiseXtra meeting."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MTitleOfTalkParameter(), 
		   source, 
		   new String[] {
			 "name", "Topic",
			 "description", "Specifies the title of the talk."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MSpeakersNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Speaker\'s name",
			 "description", "Specifies the name of the speaker who will give the talk."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MFirstPartParameter(), 
		   source, 
		   new String[] {
			 "name", "First part",
			 "description", "Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MSecondPartParameter(), 
		   source, 
		   new String[] {
			 "name", "Second part",
			 "description", "Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MRecordingUsersNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording user\'s name",
			 "description", "Specifies the name of the recording user. Please enter your name."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MWwxDateResult(), 
		   source, 
		   new String[] {
			 "name", "Date",
			 "description", "Specifies the date of the WordWiseXtra meeting."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MTitleOfTalkResult(), 
		   source, 
		   new String[] {
			 "name", "Topic",
			 "description", "Specifies the title of the talk."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MSpeakersNameResult(), 
		   source, 
		   new String[] {
			 "name", "Speaker\'s name",
			 "description", "Specifies the name of the speaker who will give the talk."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MFirstPartResult(), 
		   source, 
		   new String[] {
			 "name", "First part",
			 "description", "Specifies the name of the first part of the WWX meeting, e.g. \'Talk\'."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MSecondPartResult(), 
		   source, 
		   new String[] {
			 "name", "Second part",
			 "description", "Specifies the name of the second part of the WWX meeting, e.g. \'Q&A\'."
		   });		
		addAnnotation
		  (getMEnterWwxInformationStep_MRecordingUsersNameResult(), 
		   source, 
		   new String[] {
			 "name", "Recording user\'s name",
			 "description", "Specifies the name of the recording user. Please enter your name."
		   });		
		addAnnotation
		  (mEnterServiceInformationStepEClass, 
		   source, 
		   new String[] {
			 "name", "Enter service information",
			 "description", "Please enter the required information about the service and then select \'Mark as completed\'.",
			 "iconFilePath", "Image Files/Enter information step.gif",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MServiceDateParameter(), 
		   source, 
		   new String[] {
			 "name", "Service date",
			 "description", "Specifies the date of the service."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MServiceTypeParameter(), 
		   source, 
		   new String[] {
			 "name", "Service type",
			 "description", "Specifies the type of the service, e.g. AM service, PM service, Carol service ..."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MTitleOfTalkParameter(), 
		   source, 
		   new String[] {
			 "name", "Title of talk",
			 "description", "Specifies the title of the talk."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MReadingParameter(), 
		   source, 
		   new String[] {
			 "name", "Reading",
			 "description", "Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MSpeakersNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Speaker\'s name",
			 "description", "Specifies the name of the speaker who will give the talk."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MRecordingUsersNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording user\'s name",
			 "description", "Specifies the name of the recording user. Please enter your name."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MServiceDateResult(), 
		   source, 
		   new String[] {
			 "name", "Service date",
			 "description", "Specifies the date of the service."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MServiceTypeResult(), 
		   source, 
		   new String[] {
			 "name", "Service type",
			 "description", "Specifies the type of the service, e.g. AM service, PM service, Carol service ..."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MTitleOfTalkResult(), 
		   source, 
		   new String[] {
			 "name", "Title of talk",
			 "description", "Specifies the title of the talk."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MReadingResult(), 
		   source, 
		   new String[] {
			 "name", "Reading",
			 "description", "Specifies the bible passage that the sermon is about, e.g. Acts 4:1-22."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MSpeakersNameResult(), 
		   source, 
		   new String[] {
			 "name", "Speaker\'s name",
			 "description", "Specifies the name of the speaker who will give the talk."
		   });		
		addAnnotation
		  (getMEnterServiceInformationStep_MRecordingUsersNameResult(), 
		   source, 
		   new String[] {
			 "name", "Recording user\'s name",
			 "description", "Specifies the name of the recording user. Please enter your name."
		   });		
		addAnnotation
		  (mCreateDirectoryStepEClass, 
		   source, 
		   new String[] {
			 "name", "Create directory",
			 "description", "Creates a directory where the recorded files and other related files will be stored.",
			 "iconFilePath", "Image Files/Create directory step.gif",
			 "actionName", "Create",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMCreateDirectoryStep_MParentDirectoryParameter(), 
		   source, 
		   new String[] {
			 "name", "Parent directory",
			 "description", "Specifies the path to the directory in which the new directory is to be created."
		   });		
		addAnnotation
		  (getMCreateDirectoryStep_MDirectoryNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Directory name",
			 "description", "Specifies the name of the directory to be created."
		   });		
		addAnnotation
		  (getMCreateDirectoryStep_MDirectoryResult(), 
		   source, 
		   new String[] {
			 "name", "Directory",
			 "description", "Specifies the path of the created service directory."
		   });		
		addAnnotation
		  (mCheckFreeDiskSpaceStepEClass, 
		   source, 
		   new String[] {
			 "name", "Check free disk space",
			 "description", "Please make sure that there is enough disk space free on this computer. There must be at least 1 GB (i.e. 1024 MB) available for the recordings. If not enough disk space is available, please delete the oldest services till enough disk space is free.",
			 "iconFilePath", "Image Files/Task.gif",
			 "actionName", "Check",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMCheckFreeDiskSpaceStep_MRequiredFreeDiskSpaceParameter(), 
		   source, 
		   new String[] {
			 "name", "Required free disk space",
			 "description", "Specifies the estimated required free disk space in bytes on the drive where the recording will be stored."
		   });		
		addAnnotation
		  (getMCheckFreeDiskSpaceStep_MDirectoryParameter(), 
		   source, 
		   new String[] {
			 "name", "Directory",
			 "description", "Specifies the path of the created directory where the recordings will be stored."
		   });		
		addAnnotation
		  (getMCheckFreeDiskSpaceStep_MFreeDiskSpaceResult(), 
		   source, 
		   new String[] {
			 "name", "Free disk space",
			 "description", "Specifies the actual free disk space on the drive where the recording will be stored."
		   });		
		addAnnotation
		  (mAudioStepEClass, 
		   source, 
		   new String[] {
			 "iconFilePath", "Image Files/Audio step.gif",
			 "compositeClassName", "org.onceforall.dms.desktop.ui.MAudioStepComposite",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMAudioStep_MLeftInputLevelProperty(), 
		   source, 
		   new String[] {
			 "name", "Left input level",
			 "description", "Displays the current left input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMAudioStep_MRightInputLevelProperty(), 
		   source, 
		   new String[] {
			 "name", "Right input level",
			 "description", "Displays the current right input level as a value between 0 and 100. If the dBFS scale is used, the 100 represents 0dBFS and 0 represents -50dBFS. Otherwise it represents the (scaled) raw readings.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMAudioStep_MLeftInputDistortionProperty(), 
		   source, 
		   new String[] {
			 "name", "Left input distortion alert",
			 "description", "Indicates whether the audio signal on left channel is likely to be distorted.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMAudioStep_MRightInputDistortionProperty(), 
		   source, 
		   new String[] {
			 "name", "Right input distortion alert",
			 "description", "Indicates whether the audio signal on right channel is likely to be distorted.",
			 "readOnly", "true"
		   });		
		addAnnotation
		  (getMAudioStep_MUseDbProperty(), 
		   source, 
		   new String[] {
			 "name", "Use dBFS",
			 "description", "Specifies whether the meters should show the signal readings in dBFS (logarithmic) or raw (linear). If dBFS is used then the meters show range from -50 dBFS to 0 dBFS.  For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS."
		   });		
		addAnnotation
		  (getMAudioStep_MHeadroomProperty(), 
		   source, 
		   new String[] {
			 "name", "Headroom (in dBFS)",
			 "description", "Specifies the headroom in dBFS. This must be a number between 0 and 18. The level meters should indicate whether the signal is within the headroom using yellow and red colours.  For an explanation of the headroom please refer to http://en.wikipedia.org/wiki/Headroom. For an explanation of dBFS, please refer to http://en.wikipedia.org/wiki/DBFS.  ",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (mCheckInputLevelsStepEClass, 
		   source, 
		   new String[] {
			 "name", "Check input levels",
			 "description", "Please make sure that the input level will not exceed the maximum and the recording is not distorted. Important: Use the sounddesk \'Recording computer\' input line to verify the audio quality.",
			 "iconFilePath", "Image Files/Task.gif",
			 "actionName", "Mark as completed",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (mRecordStepEClass, 
		   source, 
		   new String[] {
			 "name", "Record",
			 "description", "Records from the main audio input line to an uncompressed WAV file. Please make sure that the input level will not exceed the maximum.",
			 "iconFilePath", "Image Files/Record step.gif",
			 "actionName", "Record",
			 "interruptable", "true",
			 "stoppable", "true",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMRecordStep_MDirectoryParameter(), 
		   source, 
		   new String[] {
			 "name", "Directory",
			 "description", "Specifies the path of the created directory where the recordings will be stored."
		   });		
		addAnnotation
		  (getMRecordStep_MRecordingFileParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording file",
			 "description", "Specifies the name of the WAVE file to be recorded."
		   });		
		addAnnotation
		  (getMRecordStep_MRecordingFileResult(), 
		   source, 
		   new String[] {
			 "name", "Recording file",
			 "description", "Specifies the path of the recorded WAVE file."
		   });		
		addAnnotation
		  (getMRecordStep_MRecordingFileSizeResult(), 
		   source, 
		   new String[] {
			 "name", "Recording file size",
			 "description", "Specifies the size of the recorded WAVE file in bytes."
		   });		
		addAnnotation
		  (getMRecordStep_MRecordingLengthResult(), 
		   source, 
		   new String[] {
			 "name", "Recording length",
			 "description", "Specifies the length of the recording."
		   });		
		addAnnotation
		  (mConvertToMP3StepEClass, 
		   source, 
		   new String[] {
			 "name", "Convert to MP3",
			 "description", "Converts a WAVE file to MP3 format using the LAME encoder.",
			 "iconFilePath", "Image Files/Convert to MP3 step.gif",
			 "actionName", "Convert",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "true"
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MArtistParameter(), 
		   source, 
		   new String[] {
			 "name", "Artist",
			 "description", "Determines the text that will set as the ID3 artist tag on the MP3 file.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MTitleParameter(), 
		   source, 
		   new String[] {
			 "name", "Title",
			 "description", "Determines the text that will set as the ID3 title tag on the MP3 file.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MAlbumParameter(), 
		   source, 
		   new String[] {
			 "name", "Album",
			 "description", "Determines the text that will set as the ID3 album tag on the MP3 file."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MYearParameter(), 
		   source, 
		   new String[] {
			 "name", "Year",
			 "description", "Determines the text that will set as the ID3 year tag on the MP3 file."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MDirectoryParameter(), 
		   source, 
		   new String[] {
			 "name", "Directory",
			 "description", "Specifies the directory where the converted MP3 file should be saved."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MMp3FileNameParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 file name",
			 "description", "Specifies the name of the MP3 file."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MRecordingFileParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording file",
			 "description", "Contains the name of the recorded WAVE file."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MMp3EncoderPathParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 encoder path",
			 "description", "Specifies the path to the directory that contains the \'lame.exe\'."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MAverageBitRateParameter(), 
		   source, 
		   new String[] {
			 "name", "Average bit rate",
			 "description", "Specifies the average bit rate of the MP3 file in bits per second. Valid values are 8-310."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MMp3FolderReferenceParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 folder reference",
			 "description", "Specifies a reference to the folder where the new MP3 file should be stored."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MMp3EntryNameParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 entry name",
			 "description", "Specifies the name of the new MP3 entry in the MP3 folder."
		   });		
		addAnnotation
		  (getMConvertToMP3Step_MMp3EntryReferenceResult(), 
		   source, 
		   new String[] {
			 "name", "MP3 entry reference",
			 "description", "Contains a reference to the MP3 enty that has been created."
		   });		
		addAnnotation
		  (mPublishMp3sStepEClass, 
		   source, 
		   new String[] {
			 "name", "Publish MP3s",
			 "description", "Publishes or republishes MP3 recordings to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.",
			 "iconFilePath", "Image Files/Publish MP3s step.gif",
			 "actionName", "Publish",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MMaxiumumDiskSpaceParameter(), 
		   source, 
		   new String[] {
			 "name", "Maxiumum disk space",
			 "description", "Specifies the maximum disk space that the recordings are allowed to use on the FTP server in mega bytes."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MMp3RelativeFtpPathParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 relative FTP path",
			 "description", "Specifies the path of the directory on the FTP server to publish the MP3 files to, e.g. \'/recordings\'."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MWebServerUrlParameter(), 
		   source, 
		   new String[] {
			 "name", "Web server URL",
			 "description", "Specifies the public web server URL, e.g. \'http://www.ccbromley.net\'."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MContentPageRelativeFtpPathParameter(), 
		   source, 
		   new String[] {
			 "name", "Content page relative FTP path",
			 "description", "Specifies the path of the directory relative to the FTP path where to publish the MP3 content page to, e.g. \'/recordings\'."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MContentHeaderFilePathParameter(), 
		   source, 
		   new String[] {
			 "name", "Content header file path",
			 "description", "Specifies the file path to the header for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MContentFooterFilePathParameter(), 
		   source, 
		   new String[] {
			 "name", "Content footer file path",
			 "description", "Specifies the file path to the footer for the content web page that lists the recordings. The file path can be an abolute path or relative to the application directory."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MContentPageFilePathParameter(), 
		   source, 
		   new String[] {
			 "name", "Content page file path",
			 "description", "Specifies the content web page that lists the MP3s recordings. This page is generated from the header and footer files and the published MP3 files."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MPodcastFilePathParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast file path",
			 "description", "Specifies the podcast file. This file is generated from the header file and the published MP3 files."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MPodcastRelativeFtpPathParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast relative FTP path",
			 "description", "Specifies the path relative to the FTP path where the podcast RSS feed should be created or updated."
		   });		
		addAnnotation
		  (getMPublishMp3sStep_MPodcastHeaderFilePathParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast header file path",
			 "description", "Specifies the file path to the header for the podcast file.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (mUpdatePublishedMp3sStepEClass, 
		   source, 
		   new String[] {
			 "name", "Update published MP3s",
			 "description", "Updates the published MP3 recordings on the Christ Chruch Bromley web site and updates the podcast RSS file accordingly. It reads the states of the MP3 entries to determine whether to publish or unpublish.",
			 "actionName", "Update published MP3s",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMUpdatePublishedMp3sStep_MRepublishMp3Files(), 
		   source, 
		   new String[] {
			 "name", "Republish MP3 files",
			 "description", "Specifies whether all already published MP3 files should be uploaded to the web site again."
		   });		
		addAnnotation
		  (getMUpdatePublishedMp3sStep_MMp3FolderReferenceParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 folder reference",
			 "description", "Speficies a reference to the MP3 folder that contains the MP3 entries to be published or unpublished.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMUpdatePublishedMp3sStep_MMp3FolderReferenceResult(), 
		   source, 
		   new String[] {
			 "name", "MP3 folder reference",
			 "description", "Speficies a reference to the MP3 folder that contains the MP3 entries that were published or unpublished."
		   });		
		addAnnotation
		  (mPublishNewMp3StepEClass, 
		   source, 
		   new String[] {
			 "name", "Publish MP3",
			 "description", "Publishes a new MP3 recording to the Christ Chruch Bromley web site and creates/updates the podcast RSS file accordingly.",
			 "actionName", "Mark as completed",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MMp3EntryReferenceParameter(), 
		   source, 
		   new String[] {
			 "name", "MP3 entry reference",
			 "description", "Speficies a reference to the MP3 entry to be published.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MLinkTextParameter(), 
		   source, 
		   new String[] {
			 "name", "Link text",
			 "description", "Specifies the link text for the published MP3 file."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MLinkDescriptionParameter(), 
		   source, 
		   new String[] {
			 "name", "Link description",
			 "description", "Specifies the link description for the published MP3 file. The description will be displayed underneath the link."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MCommentParameter(), 
		   source, 
		   new String[] {
			 "name", "Comment",
			 "description", "Specifies a comment for the published MP3 file. This can be for example problems with the recording."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MPodcastTitleParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast title",
			 "description", "Specifies the podcast title. The title will appear as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.\""
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MPodcastSubtitleParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast subtitle",
			 "description", "Specifies the podcast subtitle. The subtitle will appear as in the Description column in iTunes."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MPodcastSummaryParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast summary",
			 "description", "Specifies the podcast summary. The summary will appear when the circled (i) in the Description column is clicked."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MPodcastPublishingDateParameter(), 
		   source, 
		   new String[] {
			 "name", "Podcast publishing date",
			 "description", "Specifies the publication date of the MP3 file. The publication date will appear in the Release Date column in iTunes."
		   });		
		addAnnotation
		  (getMPublishNewMp3Step_MPublishedMp3EntryReferenceResult(), 
		   source, 
		   new String[] {
			 "name", "Published MP3 entry reference",
			 "description", "Contains a reference to the MP3 entry that has been published."
		   });		
		addAnnotation
		  (mEmailEventLogStepEClass, 
		   source, 
		   new String[] {
			 "name", "Email event log",
			 "description", "Sends an email with the log and application data to the Digital Media Service email post box. Please enter your name and an optional comment.",
			 "iconFilePath", "Image Files/Email event log step.gif",
			 "actionName", "Send",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MRecordingUsersNameParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording user\'s name",
			 "description", "Specifies the name of the recording user. Please enter your name."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MCommentParameter(), 
		   source, 
		   new String[] {
			 "name", "Comment",
			 "description", "Specifies a comment for the receipient of the email."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MLogFileParameter(), 
		   source, 
		   new String[] {
			 "name", "Log file",
			 "description", "Specifies the file that contains the log data."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MDataFileParameter(), 
		   source, 
		   new String[] {
			 "name", "Data file",
			 "description", "Specifies the file that contains the application data.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MSubjectParameter(), 
		   source, 
		   new String[] {
			 "name", "Subject",
			 "description", "Specifies the subject of the email."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MSendersEmailAddressParameter(), 
		   source, 
		   new String[] {
			 "name", "Sender\'s email address",
			 "description", "Specifies the sender\'s email address. Please enter your own email address here. Alternatively use \'sounddesk@ccbromley.net\'."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MReceipientsEmailAddressParameter(), 
		   source, 
		   new String[] {
			 "name", "Receipient\'s email address",
			 "description", "Specifies the email addresses of the recipients, i.e. the To field of the email."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MSmtpServerParameter(), 
		   source, 
		   new String[] {
			 "name", "SMTP server",
			 "description", "Specifies the name or IP address of the (SMTP) server that is responsible for sending the email."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MSmtpUserNameParameter(), 
		   source, 
		   new String[] {
			 "name", "SMTP user name",
			 "description", "Specifies user name used to authenticate on the (SMTP) server that is responsible for sending the email."
		   });		
		addAnnotation
		  (getMEmailEventLogStep_MSmtpPasswordParameter(), 
		   source, 
		   new String[] {
			 "name", "SMTP password",
			 "description", "Specifies password used to authenticate on (SMTP) server that is responsible for sending the email."
		   });		
		addAnnotation
		  (mMp3FolderEClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "MP3 folder",
			 "name", "MP3s",
			 "description", "Contains MP3 recordings.",
			 "iconFilePath", "Image Files/MP3 folder.gif"
		   });		
		addAnnotation
		  (mMp3EClass, 
		   source, 
		   new String[] {
			 "typeNameForUI", "MP3",
			 "name", "MP3",
			 "description", "Contains all information associated with an MP3 file that can be published.",
			 "iconFilePath", "Image Files/MP3.gif"
		   });		
		addAnnotation
		  (getMMp3_MFileProperty(), 
		   source, 
		   new String[] {
			 "name", "File",
			 "description", "Specifies the MP3 recording file on this computer."
		   });		
		addAnnotation
		  (getMMp3_MLinkTextProperty(), 
		   source, 
		   new String[] {
			 "name", "Link text",
			 "description", "Specifies the link text for the published MP3 file."
		   });		
		addAnnotation
		  (getMMp3_MLinkDescriptionProperty(), 
		   source, 
		   new String[] {
			 "name", "Link description",
			 "description", "Specifies the link description for the published MP3 file. The description will be displayed underneath the link."
		   });		
		addAnnotation
		  (getMMp3_MCommentProperty(), 
		   source, 
		   new String[] {
			 "name", "Comment",
			 "description", "Specifies a comment for the published MP3 file. This can be for example problems with the recording."
		   });		
		addAnnotation
		  (getMMp3_MPodcastTitleProperty(), 
		   source, 
		   new String[] {
			 "name", "Podcast title",
			 "description", "Specifies the podcast title. The title appears as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMMp3_MPodcastSubtitleProperty(), 
		   source, 
		   new String[] {
			 "name", "Podcast subtitle",
			 "description", "Specifies the podcast subtitle. The subtitle appears as in the Description column in iTunes.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMMp3_MPodcastSummaryProperty(), 
		   source, 
		   new String[] {
			 "name", "Podcast summary",
			 "description", "Specifies the podcast summary. The summary appears  when the circled (i) in the Description column is clicked."
		   });		
		addAnnotation
		  (getMMp3_MPodcastPublishingDateProperty(), 
		   source, 
		   new String[] {
			 "name", "Podcast publishing date",
			 "description", "Specifies the publishing date of the MP3 file. The publishing date appears in the Release Date column in iTunes."
		   });		
		addAnnotation
		  (getMMp3_MPublishedFileNameProperty(), 
		   source, 
		   new String[] {
			 "name", "Published file name",
			 "description", "Specifies the name of published file on the FTP server."
		   });		
		addAnnotation
		  (mBurnCdStepEClass, 
		   source, 
		   new String[] {
			 "name", "Burn CDs for sale",
			 "description", "Burns the recordings on a writable CD for sale. Please insert a blank CD before initiating the burning process. Note that the post-sermon recording does not need to be included.",
			 "iconFilePath", "Image Files/Burn CD step.gif",
			 "actionName", "Burn",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMBurnCdStep_MRecordingFilesParameter(), 
		   source, 
		   new String[] {
			 "name", "Recording files",
			 "description", "Specifies the file paths (relative or absolute) of the recorded WAV files."
		   });		
		addAnnotation
		  (getMBurnCdStep_MBurningSoftwareDirectoryPathParameter(), 
		   source, 
		   new String[] {
			 "name", "CD-ROM burning software directory path",
			 "description", "Specifies the path to the directory that contains the \'nerocmd.exe\'.",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMBurnCdStep_MDriveParameter(), 
		   source, 
		   new String[] {
			 "name", "Drive",
			 "description", "Specifies either the full name of the CD-ROM drive or the drive letter."
		   });		
		addAnnotation
		  (getMBurnCdStep_MTotalRecordingLengthParameter(), 
		   source, 
		   new String[] {
			 "name", "Total recording length",
			 "description", "Specifies the total length of the files to be burned to CD. The total length must not exceed 01:20:00."
		   });		
		addAnnotation
		  (getMBurnCdStep_MTotalRecordingFileSizeParameter(), 
		   source, 
		   new String[] {
			 "name", "Total recording file size",
			 "description", "Specifies the total size of the files to be burned to CD. The total size must not exceed 870,318,080."
		   });		
		addAnnotation
		  (mFtpStepEClass, 
		   source, 
		   new String[] {
			 "actionName", "Mark as completed",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMFtpStep_MFtpServerUrlParameter(), 
		   source, 
		   new String[] {
			 "name", "FTP server URL",
			 "description", "Specifies the URL to public HTML directory on the FTP server, e.g. \'ftp://ftp.ccbromley.net/public_html\'",
			 "readOnly", "false"
		   });		
		addAnnotation
		  (getMFtpStep_MFtpUserNameParameter(), 
		   source, 
		   new String[] {
			 "name", "FTP user name",
			 "description", "Specifies the user name for accessing the FTP server, e.g. \'ccb001\'."
		   });		
		addAnnotation
		  (getMFtpStep_MFtpUserPasswordParameter(), 
		   source, 
		   new String[] {
			 "name", "FTP user password",
			 "description", "Specifies the user password for accessing the FTP server."
		   });		
		addAnnotation
		  (mTestStepEClass, 
		   source, 
		   new String[] {
			 "name", "Test",
			 "description", "Serves as test step for automatic tests.",
			 "actionName", "Test",
			 "interruptable", "false",
			 "stoppable", "false",
			 "terminatable", "false"
		   });		
		addAnnotation
		  (getMTestStep_MPersistentStringParameter(), 
		   source, 
		   new String[] {
			 "name", "Persistent string",
			 "description", "Specifies a string that is saved with the application data."
		   });		
		addAnnotation
		  (getMTestStep_MStringParameter(), 
		   source, 
		   new String[] {
			 "name", "String",
			 "description", "Specifies a string that is not saved with the application data."
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MObject <em>MObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MObject
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMObject()
		 * @generated
		 */
		public static final EClass MOBJECT = eINSTANCE.getMObject();

		/**
		 * The meta object literal for the '<em><b>MName Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT__MNAME_PROPERTY = eINSTANCE.getMObject_MNameProperty();

		/**
		 * The meta object literal for the '<em><b>MDescription Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT__MDESCRIPTION_PROPERTY = eINSTANCE.getMObject_MDescriptionProperty();

		/**
		 * The meta object literal for the '<em><b>MIcon File Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT__MICON_FILE_PATH_PROPERTY = eINSTANCE.getMObject_MIconFilePathProperty();

		/**
		 * The meta object literal for the '<em><b>Fixed MProperties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT__FIXED_MPROPERTIES = eINSTANCE.getMObject_FixedMProperties();

		/**
		 * The meta object literal for the '<em><b>Fixed MSteps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MOBJECT__FIXED_MSTEPS = eINSTANCE.getMObject_FixedMSteps();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MElement <em>MElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MElement
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMElement()
		 * @generated
		 */
		public static final EClass MELEMENT = eINSTANCE.getMElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__NAME = eINSTANCE.getMElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__TYPE_NAME = eINSTANCE.getMElement_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Name For UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__TYPE_NAME_FOR_UI = eINSTANCE.getMElement_TypeNameForUI();

		/**
		 * The meta object literal for the '<em><b>Name For UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__NAME_FOR_UI = eINSTANCE.getMElement_NameForUI();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__DESCRIPTION = eINSTANCE.getMElement_Description();

		/**
		 * The meta object literal for the '<em><b>Description For UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__DESCRIPTION_FOR_UI = eINSTANCE.getMElement_DescriptionForUI();

		/**
		 * The meta object literal for the '<em><b>Icon File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__ICON_FILE_PATH = eINSTANCE.getMElement_IconFilePath();

		/**
		 * The meta object literal for the '<em><b>Overlay Icon File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__OVERLAY_ICON_FILE_PATH = eINSTANCE.getMElement_OverlayIconFilePath();

		/**
		 * The meta object literal for the '<em><b>Composite Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__COMPOSITE_CLASS_NAME = eINSTANCE.getMElement_CompositeClassName();

		/**
		 * The meta object literal for the '<em><b>Simulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MELEMENT__SIMULATED = eINSTANCE.getMElement_Simulated();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MParameter <em>MParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MParameter
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMParameter()
		 * @generated
		 */
		public static final EClass MPARAMETER = eINSTANCE.getMParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MProperty <em>MProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MProperty
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMProperty()
		 * @generated
		 */
		public static final EClass MPROPERTY = eINSTANCE.getMProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MResult <em>MResult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MResult
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMResult()
		 * @generated
		 */
		public static final EClass MRESULT = eINSTANCE.getMResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MStatefulObject <em>MStateful Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MStatefulObject
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStatefulObject()
		 * @generated
		 */
		public static final EClass MSTATEFUL_OBJECT = eINSTANCE.getMStatefulObject();

		/**
		 * The meta object literal for the '<em><b>MState Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTATEFUL_OBJECT__MSTATE_PROPERTY = eINSTANCE.getMStatefulObject_MStateProperty();

		/**
		 * The meta object literal for the '<em><b>MLast State Change Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTATEFUL_OBJECT__MLAST_STATE_CHANGE_PROPERTY = eINSTANCE.getMStatefulObject_MLastStateChangeProperty();

		/**
		 * The meta object literal for the '<em><b>Last State Change Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTATEFUL_OBJECT__LAST_STATE_CHANGE_PROPERTY = eINSTANCE.getMStatefulObject_LastStateChangeProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MStep <em>MStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStep()
		 * @generated
		 */
		public static final EClass MSTEP = eINSTANCE.getMStep();

		/**
		 * The meta object literal for the '<em><b>MInput Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__MINPUT_STEPS = eINSTANCE.getMStep_MInputSteps();

		/**
		 * The meta object literal for the '<em><b>Fixed MParameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__FIXED_MPARAMETERS = eINSTANCE.getMStep_FixedMParameters();

		/**
		 * The meta object literal for the '<em><b>Fixed MResults</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__FIXED_MRESULTS = eINSTANCE.getMStep_FixedMResults();

		/**
		 * The meta object literal for the '<em><b>Exclusive Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__EXCLUSIVE_PROPERTY = eINSTANCE.getMStep_ExclusiveProperty();

		/**
		 * The meta object literal for the '<em><b>State Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__STATE_PROPERTY = eINSTANCE.getMStep_StateProperty();

		/**
		 * The meta object literal for the '<em><b>MProgress Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__MPROGRESS_PROPERTY = eINSTANCE.getMStep_MProgressProperty();

		/**
		 * The meta object literal for the '<em><b>Progress Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__PROGRESS_PROPERTY = eINSTANCE.getMStep_ProgressProperty();

		/**
		 * The meta object literal for the '<em><b>MProgress Status Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__MPROGRESS_STATUS_PROPERTY = eINSTANCE.getMStep_MProgressStatusProperty();

		/**
		 * The meta object literal for the '<em><b>Progress Status Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__PROGRESS_STATUS_PROPERTY = eINSTANCE.getMStep_ProgressStatusProperty();

		/**
		 * The meta object literal for the '<em><b>MStart Trigger Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSTEP__MSTART_TRIGGER_PROPERTY = eINSTANCE.getMStep_MStartTriggerProperty();

		/**
		 * The meta object literal for the '<em><b>Start Trigger Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__START_TRIGGER_PROPERTY = eINSTANCE.getMStep_StartTriggerProperty();

		/**
		 * The meta object literal for the '<em><b>Interruptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__INTERRUPTABLE = eINSTANCE.getMStep_Interruptable();

		/**
		 * The meta object literal for the '<em><b>Stoppable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__STOPPABLE = eINSTANCE.getMStep_Stoppable();

		/**
		 * The meta object literal for the '<em><b>Terminatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__TERMINATABLE = eINSTANCE.getMStep_Terminatable();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__ACTION_NAME = eINSTANCE.getMStep_ActionName();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSTEP__EXCEPTION = eINSTANCE.getMStep_Exception();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MValue <em>MValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MValue
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMValue()
		 * @generated
		 */
		public static final EClass MVALUE = eINSTANCE.getMValue();

		/**
		 * The meta object literal for the '<em><b>MInput Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MVALUE__MINPUT_VALUES = eINSTANCE.getMValue_MInputValues();

		/**
		 * The meta object literal for the '<em><b>Value For UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE__VALUE_FOR_UI = eINSTANCE.getMValue_ValueForUI();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE__VALUE = eINSTANCE.getMValue_Value();

		/**
		 * The meta object literal for the '<em><b>Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE__HISTORIC_VALUES = eINSTANCE.getMValue_HistoricValues();

		/**
		 * The meta object literal for the '<em><b>Historic Values For UI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE__HISTORIC_VALUES_FOR_UI = eINSTANCE.getMValue_HistoricValuesForUI();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MVALUE__READ_ONLY = eINSTANCE.getMValue_ReadOnly();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MApplication <em>MApplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MApplication
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMApplication()
		 * @generated
		 */
		public static final EClass MAPPLICATION = eINSTANCE.getMApplication();

		/**
		 * The meta object literal for the '<em><b>MData File Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPLICATION__MDATA_FILE_PROPERTY = eINSTANCE.getMApplication_MDataFileProperty();

		/**
		 * The meta object literal for the '<em><b>Data File Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__DATA_FILE_PROPERTY = eINSTANCE.getMApplication_DataFileProperty();

		/**
		 * The meta object literal for the '<em><b>Data File Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__DATA_FILE_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMApplication_DataFilePropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MLog File Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPLICATION__MLOG_FILE_PROPERTY = eINSTANCE.getMApplication_MLogFileProperty();

		/**
		 * The meta object literal for the '<em><b>Log File Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__LOG_FILE_PROPERTY = eINSTANCE.getMApplication_LogFileProperty();

		/**
		 * The meta object literal for the '<em><b>MPath Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPLICATION__MPATH_PROPERTY = eINSTANCE.getMApplication_MPathProperty();

		/**
		 * The meta object literal for the '<em><b>Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__PATH_PROPERTY = eINSTANCE.getMApplication_PathProperty();

		/**
		 * The meta object literal for the '<em><b>MVersion Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPLICATION__MVERSION_PROPERTY = eINSTANCE.getMApplication_MVersionProperty();

		/**
		 * The meta object literal for the '<em><b>Version Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__VERSION_PROPERTY = eINSTANCE.getMApplication_VersionProperty();

		/**
		 * The meta object literal for the '<em><b>MLast Save Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAPPLICATION__MLAST_SAVE_PROPERTY = eINSTANCE.getMApplication_MLastSaveProperty();

		/**
		 * The meta object literal for the '<em><b>Last Save Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAPPLICATION__LAST_SAVE_PROPERTY = eINSTANCE.getMApplication_LastSaveProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MScript <em>MScript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MScript
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMScript()
		 * @generated
		 */
		public static final EClass MSCRIPT = eINSTANCE.getMScript();

		/**
		 * The meta object literal for the '<em><b>MSteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSCRIPT__MSTEPS = eINSTANCE.getMScript_MSteps();

		/**
		 * The meta object literal for the '<em><b>State Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSCRIPT__STATE_PROPERTY = eINSTANCE.getMScript_StateProperty();

		/**
		 * The meta object literal for the '<em><b>MProgress Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSCRIPT__MPROGRESS_PROPERTY = eINSTANCE.getMScript_MProgressProperty();

		/**
		 * The meta object literal for the '<em><b>Progress Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSCRIPT__PROGRESS_PROPERTY = eINSTANCE.getMScript_ProgressProperty();

		/**
		 * The meta object literal for the '<em><b>MProgress Status Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MSCRIPT__MPROGRESS_STATUS_PROPERTY = eINSTANCE.getMScript_MProgressStatusProperty();

		/**
		 * The meta object literal for the '<em><b>Progress Status Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MSCRIPT__PROGRESS_STATUS_PROPERTY = eINSTANCE.getMScript_ProgressStatusProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MDmsApplication <em>MDms Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MDmsApplication
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplication()
		 * @generated
		 */
		public static final EClass MDMS_APPLICATION = eINSTANCE.getMDmsApplication();

		/**
		 * The meta object literal for the '<em><b>MService File Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MSERVICE_FILE_PATH_PROPERTY = eINSTANCE.getMDmsApplication_MServiceFilePathProperty();

		/**
		 * The meta object literal for the '<em><b>Service File Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SERVICE_FILE_PATH_PROPERTY = eINSTANCE.getMDmsApplication_ServiceFilePathProperty();

		/**
		 * The meta object literal for the '<em><b>MWwx Files Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MWWX_FILES_PATH_PROPERTY = eINSTANCE.getMDmsApplication_MWwxFilesPathProperty();

		/**
		 * The meta object literal for the '<em><b>Wwx Files Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__WWX_FILES_PATH_PROPERTY = eINSTANCE.getMDmsApplication_WwxFilesPathProperty();

		/**
		 * The meta object literal for the '<em><b>MMp3 Encoder Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MMP3_ENCODER_PATH_PROPERTY = eINSTANCE.getMDmsApplication_MMp3EncoderPathProperty();

		/**
		 * The meta object literal for the '<em><b>Mp3 Encoder Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__MP3_ENCODER_PATH_PROPERTY = eINSTANCE.getMDmsApplication_Mp3EncoderPathProperty();

		/**
		 * The meta object literal for the '<em><b>MFtp Server Url Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MFTP_SERVER_URL_PROPERTY = eINSTANCE.getMDmsApplication_MFtpServerUrlProperty();

		/**
		 * The meta object literal for the '<em><b>Ftp Server Url Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY = eINSTANCE.getMDmsApplication_FtpServerUrlProperty();

		/**
		 * The meta object literal for the '<em><b>Ftp Server Url Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__FTP_SERVER_URL_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_FtpServerUrlPropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MFtp User Name Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MFTP_USER_NAME_PROPERTY = eINSTANCE.getMDmsApplication_MFtpUserNameProperty();

		/**
		 * The meta object literal for the '<em><b>Ftp User Name Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__FTP_USER_NAME_PROPERTY = eINSTANCE.getMDmsApplication_FtpUserNameProperty();

		/**
		 * The meta object literal for the '<em><b>Ftp User Name Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__FTP_USER_NAME_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_FtpUserNamePropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MFtp User Password Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MFTP_USER_PASSWORD_PROPERTY = eINSTANCE.getMDmsApplication_MFtpUserPasswordProperty();

		/**
		 * The meta object literal for the '<em><b>Ftp User Password Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__FTP_USER_PASSWORD_PROPERTY = eINSTANCE.getMDmsApplication_FtpUserPasswordProperty();

		/**
		 * The meta object literal for the '<em><b>MWeb Server Url Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MWEB_SERVER_URL_PROPERTY = eINSTANCE.getMDmsApplication_MWebServerUrlProperty();

		/**
		 * The meta object literal for the '<em><b>Web Server Url Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY = eINSTANCE.getMDmsApplication_WebServerUrlProperty();

		/**
		 * The meta object literal for the '<em><b>Web Server Url Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__WEB_SERVER_URL_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_WebServerUrlPropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MSmtp Server Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MSMTP_SERVER_PROPERTY = eINSTANCE.getMDmsApplication_MSmtpServerProperty();

		/**
		 * The meta object literal for the '<em><b>Smtp Server Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SMTP_SERVER_PROPERTY = eINSTANCE.getMDmsApplication_SmtpServerProperty();

		/**
		 * The meta object literal for the '<em><b>Smtp Server Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SMTP_SERVER_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_SmtpServerPropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MSmtp User Name Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MSMTP_USER_NAME_PROPERTY = eINSTANCE.getMDmsApplication_MSmtpUserNameProperty();

		/**
		 * The meta object literal for the '<em><b>Smtp User Name Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY = eINSTANCE.getMDmsApplication_SmtpUserNameProperty();

		/**
		 * The meta object literal for the '<em><b>Smtp User Name Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SMTP_USER_NAME_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_SmtpUserNamePropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MSmtp Password Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MSMTP_PASSWORD_PROPERTY = eINSTANCE.getMDmsApplication_MSmtpPasswordProperty();

		/**
		 * The meta object literal for the '<em><b>Smtp Password Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__SMTP_PASSWORD_PROPERTY = eINSTANCE.getMDmsApplication_SmtpPasswordProperty();

		/**
		 * The meta object literal for the '<em><b>MBurning Software Directory Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MBURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY = eINSTANCE.getMDmsApplication_MBurningSoftwareDirectoryPathProperty();

		/**
		 * The meta object literal for the '<em><b>Burning Software Directory Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__BURNING_SOFTWARE_DIRECTORY_PATH_PROPERTY = eINSTANCE.getMDmsApplication_BurningSoftwareDirectoryPathProperty();

		/**
		 * The meta object literal for the '<em><b>MDrive Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MDRIVE_PROPERTY = eINSTANCE.getMDmsApplication_MDriveProperty();

		/**
		 * The meta object literal for the '<em><b>Drive Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__DRIVE_PROPERTY = eINSTANCE.getMDmsApplication_DriveProperty();

		/**
		 * The meta object literal for the '<em><b>Drive Property Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__DRIVE_PROPERTY_HISTORIC_VALUES = eINSTANCE.getMDmsApplication_DrivePropertyHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Message Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MUPGRADE_MESSAGE_PROPERTY = eINSTANCE.getMDmsApplication_MUpgradeMessageProperty();

		/**
		 * The meta object literal for the '<em><b>Upgrade Message Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__UPGRADE_MESSAGE_PROPERTY = eINSTANCE.getMDmsApplication_UpgradeMessageProperty();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplication_MUpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplication_UpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>MLast Upgrade Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MLAST_UPGRADE_PROPERTY = eINSTANCE.getMDmsApplication_MLastUpgradeProperty();

		/**
		 * The meta object literal for the '<em><b>Last Upgrade Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION__LAST_UPGRADE_PROPERTY = eINSTANCE.getMDmsApplication_LastUpgradeProperty();

		/**
		 * The meta object literal for the '<em><b>MGet Data Upgrade Info Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MGET_DATA_UPGRADE_INFO_STEP = eINSTANCE.getMDmsApplication_MGetDataUpgradeInfoStep();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Data Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MUPGRADE_DATA_STEP = eINSTANCE.getMDmsApplication_MUpgradeDataStep();

		/**
		 * The meta object literal for the '<em><b>MScripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MSCRIPTS = eINSTANCE.getMDmsApplication_MScripts();

		/**
		 * The meta object literal for the '<em><b>MMp3 Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION__MMP3_FOLDERS = eINSTANCE.getMDmsApplication_MMp3Folders();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MEnterInformationStep <em>MEnter Information Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MEnterInformationStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterInformationStep()
		 * @generated
		 */
		public static final EClass MENTER_INFORMATION_STEP = eINSTANCE.getMEnterInformationStep();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MEnterWwxInformationStep <em>MEnter Wwx Information Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MEnterWwxInformationStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterWwxInformationStep()
		 * @generated
		 */
		public static final EClass MENTER_WWX_INFORMATION_STEP = eINSTANCE.getMEnterWwxInformationStep();

		/**
		 * The meta object literal for the '<em><b>MWwx Date Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MWWX_DATE_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MWwxDateParameter();

		/**
		 * The meta object literal for the '<em><b>Wwx Date Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__WWX_DATE_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_WwxDateParameter();

		/**
		 * The meta object literal for the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MTitleOfTalkParameter();

		/**
		 * The meta object literal for the '<em><b>Title Of Talk Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_TitleOfTalkParameter();

		/**
		 * The meta object literal for the '<em><b>MSpeakers Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MSpeakersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_SpeakersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterWwxInformationStep_SpeakersNameParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MFirst Part Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MFIRST_PART_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MFirstPartParameter();

		/**
		 * The meta object literal for the '<em><b>First Part Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_FirstPartParameter();

		/**
		 * The meta object literal for the '<em><b>First Part Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__FIRST_PART_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterWwxInformationStep_FirstPartParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MSecond Part Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MSECOND_PART_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MSecondPartParameter();

		/**
		 * The meta object literal for the '<em><b>Second Part Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_SecondPartParameter();

		/**
		 * The meta object literal for the '<em><b>Second Part Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SECOND_PART_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterWwxInformationStep_SecondPartParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_MRecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEnterWwxInformationStep_RecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterWwxInformationStep_RecordingUsersNameParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MWwx Date Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MWWX_DATE_RESULT = eINSTANCE.getMEnterWwxInformationStep_MWwxDateResult();

		/**
		 * The meta object literal for the '<em><b>Wwx Date Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__WWX_DATE_RESULT = eINSTANCE.getMEnterWwxInformationStep_WwxDateResult();

		/**
		 * The meta object literal for the '<em><b>MTitle Of Talk Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MTITLE_OF_TALK_RESULT = eINSTANCE.getMEnterWwxInformationStep_MTitleOfTalkResult();

		/**
		 * The meta object literal for the '<em><b>Title Of Talk Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__TITLE_OF_TALK_RESULT = eINSTANCE.getMEnterWwxInformationStep_TitleOfTalkResult();

		/**
		 * The meta object literal for the '<em><b>MSpeakers Name Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MSPEAKERS_NAME_RESULT = eINSTANCE.getMEnterWwxInformationStep_MSpeakersNameResult();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SPEAKERS_NAME_RESULT = eINSTANCE.getMEnterWwxInformationStep_SpeakersNameResult();

		/**
		 * The meta object literal for the '<em><b>MFirst Part Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MFIRST_PART_RESULT = eINSTANCE.getMEnterWwxInformationStep_MFirstPartResult();

		/**
		 * The meta object literal for the '<em><b>First Part Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__FIRST_PART_RESULT = eINSTANCE.getMEnterWwxInformationStep_FirstPartResult();

		/**
		 * The meta object literal for the '<em><b>MSecond Part Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MSECOND_PART_RESULT = eINSTANCE.getMEnterWwxInformationStep_MSecondPartResult();

		/**
		 * The meta object literal for the '<em><b>Second Part Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__SECOND_PART_RESULT = eINSTANCE.getMEnterWwxInformationStep_SecondPartResult();

		/**
		 * The meta object literal for the '<em><b>MRecording Users Name Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_WWX_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT = eINSTANCE.getMEnterWwxInformationStep_MRecordingUsersNameResult();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_WWX_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT = eINSTANCE.getMEnterWwxInformationStep_RecordingUsersNameResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MEnterServiceInformationStep <em>MEnter Service Information Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MEnterServiceInformationStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEnterServiceInformationStep()
		 * @generated
		 */
		public static final EClass MENTER_SERVICE_INFORMATION_STEP = eINSTANCE.getMEnterServiceInformationStep();

		/**
		 * The meta object literal for the '<em><b>MService Date Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MServiceDateParameter();

		/**
		 * The meta object literal for the '<em><b>Service Date Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_ServiceDateParameter();

		/**
		 * The meta object literal for the '<em><b>MService Type Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MServiceTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Service Type Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_ServiceTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Service Type Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterServiceInformationStep_ServiceTypeParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MTitle Of Talk Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MTitleOfTalkParameter();

		/**
		 * The meta object literal for the '<em><b>Title Of Talk Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_TitleOfTalkParameter();

		/**
		 * The meta object literal for the '<em><b>MReading Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MREADING_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MReadingParameter();

		/**
		 * The meta object literal for the '<em><b>Reading Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__READING_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_ReadingParameter();

		/**
		 * The meta object literal for the '<em><b>MSpeakers Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MSpeakersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_SpeakersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterServiceInformationStep_SpeakersNameParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_MRecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEnterServiceInformationStep_RecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEnterServiceInformationStep_RecordingUsersNameParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MService Date Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSERVICE_DATE_RESULT = eINSTANCE.getMEnterServiceInformationStep_MServiceDateResult();

		/**
		 * The meta object literal for the '<em><b>Service Date Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SERVICE_DATE_RESULT = eINSTANCE.getMEnterServiceInformationStep_ServiceDateResult();

		/**
		 * The meta object literal for the '<em><b>MService Type Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSERVICE_TYPE_RESULT = eINSTANCE.getMEnterServiceInformationStep_MServiceTypeResult();

		/**
		 * The meta object literal for the '<em><b>Service Type Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SERVICE_TYPE_RESULT = eINSTANCE.getMEnterServiceInformationStep_ServiceTypeResult();

		/**
		 * The meta object literal for the '<em><b>MTitle Of Talk Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MTITLE_OF_TALK_RESULT = eINSTANCE.getMEnterServiceInformationStep_MTitleOfTalkResult();

		/**
		 * The meta object literal for the '<em><b>Title Of Talk Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__TITLE_OF_TALK_RESULT = eINSTANCE.getMEnterServiceInformationStep_TitleOfTalkResult();

		/**
		 * The meta object literal for the '<em><b>MReading Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MREADING_RESULT = eINSTANCE.getMEnterServiceInformationStep_MReadingResult();

		/**
		 * The meta object literal for the '<em><b>Reading Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__READING_RESULT = eINSTANCE.getMEnterServiceInformationStep_ReadingResult();

		/**
		 * The meta object literal for the '<em><b>MSpeakers Name Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MSPEAKERS_NAME_RESULT = eINSTANCE.getMEnterServiceInformationStep_MSpeakersNameResult();

		/**
		 * The meta object literal for the '<em><b>Speakers Name Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__SPEAKERS_NAME_RESULT = eINSTANCE.getMEnterServiceInformationStep_SpeakersNameResult();

		/**
		 * The meta object literal for the '<em><b>MRecording Users Name Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MENTER_SERVICE_INFORMATION_STEP__MRECORDING_USERS_NAME_RESULT = eINSTANCE.getMEnterServiceInformationStep_MRecordingUsersNameResult();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MENTER_SERVICE_INFORMATION_STEP__RECORDING_USERS_NAME_RESULT = eINSTANCE.getMEnterServiceInformationStep_RecordingUsersNameResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MCreateDirectoryStep <em>MCreate Directory Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MCreateDirectoryStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCreateDirectoryStep()
		 * @generated
		 */
		public static final EClass MCREATE_DIRECTORY_STEP = eINSTANCE.getMCreateDirectoryStep();

		/**
		 * The meta object literal for the '<em><b>MParent Directory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCREATE_DIRECTORY_STEP__MPARENT_DIRECTORY_PARAMETER = eINSTANCE.getMCreateDirectoryStep_MParentDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Parent Directory Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER = eINSTANCE.getMCreateDirectoryStep_ParentDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Parent Directory Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCREATE_DIRECTORY_STEP__PARENT_DIRECTORY_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMCreateDirectoryStep_ParentDirectoryParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MDirectory Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCREATE_DIRECTORY_STEP__MDIRECTORY_NAME_PARAMETER = eINSTANCE.getMCreateDirectoryStep_MDirectoryNameParameter();

		/**
		 * The meta object literal for the '<em><b>Directory Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCREATE_DIRECTORY_STEP__DIRECTORY_NAME_PARAMETER = eINSTANCE.getMCreateDirectoryStep_DirectoryNameParameter();

		/**
		 * The meta object literal for the '<em><b>MDirectory Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCREATE_DIRECTORY_STEP__MDIRECTORY_RESULT = eINSTANCE.getMCreateDirectoryStep_MDirectoryResult();

		/**
		 * The meta object literal for the '<em><b>Directory Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCREATE_DIRECTORY_STEP__DIRECTORY_RESULT = eINSTANCE.getMCreateDirectoryStep_DirectoryResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep <em>MCheck Free Disk Space Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MCheckFreeDiskSpaceStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckFreeDiskSpaceStep()
		 * @generated
		 */
		public static final EClass MCHECK_FREE_DISK_SPACE_STEP = eINSTANCE.getMCheckFreeDiskSpaceStep();

		/**
		 * The meta object literal for the '<em><b>MRequired Free Disk Space Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCHECK_FREE_DISK_SPACE_STEP__MREQUIRED_FREE_DISK_SPACE_PARAMETER = eINSTANCE.getMCheckFreeDiskSpaceStep_MRequiredFreeDiskSpaceParameter();

		/**
		 * The meta object literal for the '<em><b>Required Free Disk Space Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCHECK_FREE_DISK_SPACE_STEP__REQUIRED_FREE_DISK_SPACE_PARAMETER = eINSTANCE.getMCheckFreeDiskSpaceStep_RequiredFreeDiskSpaceParameter();

		/**
		 * The meta object literal for the '<em><b>MDirectory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCHECK_FREE_DISK_SPACE_STEP__MDIRECTORY_PARAMETER = eINSTANCE.getMCheckFreeDiskSpaceStep_MDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Directory Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCHECK_FREE_DISK_SPACE_STEP__DIRECTORY_PARAMETER = eINSTANCE.getMCheckFreeDiskSpaceStep_DirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>MFree Disk Space Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCHECK_FREE_DISK_SPACE_STEP__MFREE_DISK_SPACE_RESULT = eINSTANCE.getMCheckFreeDiskSpaceStep_MFreeDiskSpaceResult();

		/**
		 * The meta object literal for the '<em><b>Free Disk Space Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCHECK_FREE_DISK_SPACE_STEP__FREE_DISK_SPACE_RESULT = eINSTANCE.getMCheckFreeDiskSpaceStep_FreeDiskSpaceResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MAudioStep <em>MAudio Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MAudioStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMAudioStep()
		 * @generated
		 */
		public static final EClass MAUDIO_STEP = eINSTANCE.getMAudioStep();

		/**
		 * The meta object literal for the '<em><b>MLeft Input Level Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY = eINSTANCE.getMAudioStep_MLeftInputLevelProperty();

		/**
		 * The meta object literal for the '<em><b>Left Input Level Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__LEFT_INPUT_LEVEL_PROPERTY = eINSTANCE.getMAudioStep_LeftInputLevelProperty();

		/**
		 * The meta object literal for the '<em><b>MRight Input Level Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY = eINSTANCE.getMAudioStep_MRightInputLevelProperty();

		/**
		 * The meta object literal for the '<em><b>Right Input Level Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__RIGHT_INPUT_LEVEL_PROPERTY = eINSTANCE.getMAudioStep_RightInputLevelProperty();

		/**
		 * The meta object literal for the '<em><b>MLeft Input Distortion Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY = eINSTANCE.getMAudioStep_MLeftInputDistortionProperty();

		/**
		 * The meta object literal for the '<em><b>Left Input Distortion Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__LEFT_INPUT_DISTORTION_PROPERTY = eINSTANCE.getMAudioStep_LeftInputDistortionProperty();

		/**
		 * The meta object literal for the '<em><b>MRight Input Distortion Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY = eINSTANCE.getMAudioStep_MRightInputDistortionProperty();

		/**
		 * The meta object literal for the '<em><b>Right Input Distortion Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__RIGHT_INPUT_DISTORTION_PROPERTY = eINSTANCE.getMAudioStep_RightInputDistortionProperty();

		/**
		 * The meta object literal for the '<em><b>MUse Db Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MUSE_DB_PROPERTY = eINSTANCE.getMAudioStep_MUseDbProperty();

		/**
		 * The meta object literal for the '<em><b>Use Db Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__USE_DB_PROPERTY = eINSTANCE.getMAudioStep_UseDbProperty();

		/**
		 * The meta object literal for the '<em><b>MHeadroom Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MAUDIO_STEP__MHEADROOM_PROPERTY = eINSTANCE.getMAudioStep_MHeadroomProperty();

		/**
		 * The meta object literal for the '<em><b>Headroom Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAUDIO_STEP__HEADROOM_PROPERTY = eINSTANCE.getMAudioStep_HeadroomProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MCheckInputLevelsStep <em>MCheck Input Levels Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MCheckInputLevelsStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMCheckInputLevelsStep()
		 * @generated
		 */
		public static final EClass MCHECK_INPUT_LEVELS_STEP = eINSTANCE.getMCheckInputLevelsStep();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MRecordStep <em>MRecord Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MRecordStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMRecordStep()
		 * @generated
		 */
		public static final EClass MRECORD_STEP = eINSTANCE.getMRecordStep();

		/**
		 * The meta object literal for the '<em><b>MDirectory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MRECORD_STEP__MDIRECTORY_PARAMETER = eINSTANCE.getMRecordStep_MDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Directory Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MRECORD_STEP__DIRECTORY_PARAMETER = eINSTANCE.getMRecordStep_DirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>MRecording File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MRECORD_STEP__MRECORDING_FILE_PARAMETER = eINSTANCE.getMRecordStep_MRecordingFileParameter();

		/**
		 * The meta object literal for the '<em><b>Recording File Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MRECORD_STEP__RECORDING_FILE_PARAMETER = eINSTANCE.getMRecordStep_RecordingFileParameter();

		/**
		 * The meta object literal for the '<em><b>MRecording File Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MRECORD_STEP__MRECORDING_FILE_RESULT = eINSTANCE.getMRecordStep_MRecordingFileResult();

		/**
		 * The meta object literal for the '<em><b>Recording File Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MRECORD_STEP__RECORDING_FILE_RESULT = eINSTANCE.getMRecordStep_RecordingFileResult();

		/**
		 * The meta object literal for the '<em><b>MRecording File Size Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MRECORD_STEP__MRECORDING_FILE_SIZE_RESULT = eINSTANCE.getMRecordStep_MRecordingFileSizeResult();

		/**
		 * The meta object literal for the '<em><b>Recording File Size Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MRECORD_STEP__RECORDING_FILE_SIZE_RESULT = eINSTANCE.getMRecordStep_RecordingFileSizeResult();

		/**
		 * The meta object literal for the '<em><b>MRecording Length Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MRECORD_STEP__MRECORDING_LENGTH_RESULT = eINSTANCE.getMRecordStep_MRecordingLengthResult();

		/**
		 * The meta object literal for the '<em><b>Recording Length Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MRECORD_STEP__RECORDING_LENGTH_RESULT = eINSTANCE.getMRecordStep_RecordingLengthResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MConvertToMP3Step <em>MConvert To MP3 Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MConvertToMP3Step
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMConvertToMP3Step()
		 * @generated
		 */
		public static final EClass MCONVERT_TO_MP3_STEP = eINSTANCE.getMConvertToMP3Step();

		/**
		 * The meta object literal for the '<em><b>MArtist Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MARTIST_PARAMETER = eINSTANCE.getMConvertToMP3Step_MArtistParameter();

		/**
		 * The meta object literal for the '<em><b>Artist Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__ARTIST_PARAMETER = eINSTANCE.getMConvertToMP3Step_ArtistParameter();

		/**
		 * The meta object literal for the '<em><b>MTitle Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MTITLE_PARAMETER = eINSTANCE.getMConvertToMP3Step_MTitleParameter();

		/**
		 * The meta object literal for the '<em><b>Title Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__TITLE_PARAMETER = eINSTANCE.getMConvertToMP3Step_TitleParameter();

		/**
		 * The meta object literal for the '<em><b>MAlbum Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MALBUM_PARAMETER = eINSTANCE.getMConvertToMP3Step_MAlbumParameter();

		/**
		 * The meta object literal for the '<em><b>Album Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__ALBUM_PARAMETER = eINSTANCE.getMConvertToMP3Step_AlbumParameter();

		/**
		 * The meta object literal for the '<em><b>MYear Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MYEAR_PARAMETER = eINSTANCE.getMConvertToMP3Step_MYearParameter();

		/**
		 * The meta object literal for the '<em><b>Year Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__YEAR_PARAMETER = eINSTANCE.getMConvertToMP3Step_YearParameter();

		/**
		 * The meta object literal for the '<em><b>MDirectory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MDIRECTORY_PARAMETER = eINSTANCE.getMConvertToMP3Step_MDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Directory Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__DIRECTORY_PARAMETER = eINSTANCE.getMConvertToMP3Step_DirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 File Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MMP3_FILE_NAME_PARAMETER = eINSTANCE.getMConvertToMP3Step_MMp3FileNameParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 File Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__MP3_FILE_NAME_PARAMETER = eINSTANCE.getMConvertToMP3Step_Mp3FileNameParameter();

		/**
		 * The meta object literal for the '<em><b>MRecording File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MRECORDING_FILE_PARAMETER = eINSTANCE.getMConvertToMP3Step_MRecordingFileParameter();

		/**
		 * The meta object literal for the '<em><b>Recording File Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__RECORDING_FILE_PARAMETER = eINSTANCE.getMConvertToMP3Step_RecordingFileParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Encoder Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MMP3_ENCODER_PATH_PARAMETER = eINSTANCE.getMConvertToMP3Step_MMp3EncoderPathParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Encoder Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__MP3_ENCODER_PATH_PARAMETER = eINSTANCE.getMConvertToMP3Step_Mp3EncoderPathParameter();

		/**
		 * The meta object literal for the '<em><b>MAverage Bit Rate Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MAVERAGE_BIT_RATE_PARAMETER = eINSTANCE.getMConvertToMP3Step_MAverageBitRateParameter();

		/**
		 * The meta object literal for the '<em><b>Average Bit Rate Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__AVERAGE_BIT_RATE_PARAMETER = eINSTANCE.getMConvertToMP3Step_AverageBitRateParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MMP3_FOLDER_REFERENCE_PARAMETER = eINSTANCE.getMConvertToMP3Step_MMp3FolderReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MP3_FOLDER_REFERENCE_PARAMETER = eINSTANCE.getMConvertToMP3Step_Mp3FolderReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Entry Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MMP3_ENTRY_NAME_PARAMETER = eINSTANCE.getMConvertToMP3Step_MMp3EntryNameParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Entry Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MCONVERT_TO_MP3_STEP__MP3_ENTRY_NAME_PARAMETER = eINSTANCE.getMConvertToMP3Step_Mp3EntryNameParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Entry Reference Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MMP3_ENTRY_REFERENCE_RESULT = eINSTANCE.getMConvertToMP3Step_MMp3EntryReferenceResult();

		/**
		 * The meta object literal for the '<em><b>Mp3 Entry Reference Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MCONVERT_TO_MP3_STEP__MP3_ENTRY_REFERENCE_RESULT = eINSTANCE.getMConvertToMP3Step_Mp3EntryReferenceResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MPublishMp3sStep <em>MPublish Mp3s Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MPublishMp3sStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishMp3sStep()
		 * @generated
		 */
		public static final EClass MPUBLISH_MP3S_STEP = eINSTANCE.getMPublishMp3sStep();

		/**
		 * The meta object literal for the '<em><b>MMaxiumum Disk Space Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MMAXIUMUM_DISK_SPACE_PARAMETER = eINSTANCE.getMPublishMp3sStep_MMaxiumumDiskSpaceParameter();

		/**
		 * The meta object literal for the '<em><b>Maxiumum Disk Space Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__MAXIUMUM_DISK_SPACE_PARAMETER = eINSTANCE.getMPublishMp3sStep_MaxiumumDiskSpaceParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Relative Ftp Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MMP3_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MMp3RelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Relative Ftp Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__MP3_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_Mp3RelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>MWeb Server Url Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MWEB_SERVER_URL_PARAMETER = eINSTANCE.getMPublishMp3sStep_MWebServerUrlParameter();

		/**
		 * The meta object literal for the '<em><b>Web Server Url Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__WEB_SERVER_URL_PARAMETER = eINSTANCE.getMPublishMp3sStep_WebServerUrlParameter();

		/**
		 * The meta object literal for the '<em><b>MContent Page Relative Ftp Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MCONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MContentPageRelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>Content Page Relative Ftp Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__CONTENT_PAGE_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_ContentPageRelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>MContent Header File Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MCONTENT_HEADER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MContentHeaderFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>Content Header File Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__CONTENT_HEADER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_ContentHeaderFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>MContent Footer File Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MCONTENT_FOOTER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MContentFooterFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>Content Footer File Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__CONTENT_FOOTER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_ContentFooterFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>MContent Page File Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MCONTENT_PAGE_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MContentPageFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>Content Page File Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__CONTENT_PAGE_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_ContentPageFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast File Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MPODCAST_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MPodcastFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast File Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__PODCAST_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_PodcastFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Relative Ftp Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MPODCAST_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MPodcastRelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Relative Ftp Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__PODCAST_RELATIVE_FTP_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_PodcastRelativeFtpPathParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Header File Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_MP3S_STEP__MPODCAST_HEADER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_MPodcastHeaderFilePathParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Header File Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_MP3S_STEP__PODCAST_HEADER_FILE_PATH_PARAMETER = eINSTANCE.getMPublishMp3sStep_PodcastHeaderFilePathParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep <em>MUpdate Published Mp3s Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MUpdatePublishedMp3sStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUpdatePublishedMp3sStep()
		 * @generated
		 */
		public static final EClass MUPDATE_PUBLISHED_MP3S_STEP = eINSTANCE.getMUpdatePublishedMp3sStep();

		/**
		 * The meta object literal for the '<em><b>MRepublish Mp3 Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUPDATE_PUBLISHED_MP3S_STEP__MREPUBLISH_MP3_FILES = eINSTANCE.getMUpdatePublishedMp3sStep_MRepublishMp3Files();

		/**
		 * The meta object literal for the '<em><b>Republish Mp3 Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUPDATE_PUBLISHED_MP3S_STEP__REPUBLISH_MP3_FILES = eINSTANCE.getMUpdatePublishedMp3sStep_RepublishMp3Files();

		/**
		 * The meta object literal for the '<em><b>MMp3 Folder Reference Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_PARAMETER = eINSTANCE.getMUpdatePublishedMp3sStep_MMp3FolderReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Folder Reference Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_PARAMETER = eINSTANCE.getMUpdatePublishedMp3sStep_Mp3FolderReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>MMp3 Folder Reference Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUPDATE_PUBLISHED_MP3S_STEP__MMP3_FOLDER_REFERENCE_RESULT = eINSTANCE.getMUpdatePublishedMp3sStep_MMp3FolderReferenceResult();

		/**
		 * The meta object literal for the '<em><b>Mp3 Folder Reference Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUPDATE_PUBLISHED_MP3S_STEP__MP3_FOLDER_REFERENCE_RESULT = eINSTANCE.getMUpdatePublishedMp3sStep_Mp3FolderReferenceResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MPublishNewMp3Step <em>MPublish New Mp3 Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MPublishNewMp3Step
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPublishNewMp3Step()
		 * @generated
		 */
		public static final EClass MPUBLISH_NEW_MP3_STEP = eINSTANCE.getMPublishNewMp3Step();

		/**
		 * The meta object literal for the '<em><b>MMp3 Entry Reference Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MMP3_ENTRY_REFERENCE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MMp3EntryReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>Mp3 Entry Reference Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MP3_ENTRY_REFERENCE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_Mp3EntryReferenceParameter();

		/**
		 * The meta object literal for the '<em><b>MLink Text Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MLINK_TEXT_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MLinkTextParameter();

		/**
		 * The meta object literal for the '<em><b>Link Text Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__LINK_TEXT_PARAMETER = eINSTANCE.getMPublishNewMp3Step_LinkTextParameter();

		/**
		 * The meta object literal for the '<em><b>MLink Description Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MLINK_DESCRIPTION_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MLinkDescriptionParameter();

		/**
		 * The meta object literal for the '<em><b>Link Description Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__LINK_DESCRIPTION_PARAMETER = eINSTANCE.getMPublishNewMp3Step_LinkDescriptionParameter();

		/**
		 * The meta object literal for the '<em><b>MComment Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MCOMMENT_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MCommentParameter();

		/**
		 * The meta object literal for the '<em><b>Comment Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__COMMENT_PARAMETER = eINSTANCE.getMPublishNewMp3Step_CommentParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Title Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MPODCAST_TITLE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MPodcastTitleParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Title Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__PODCAST_TITLE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_PodcastTitleParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Subtitle Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MPODCAST_SUBTITLE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MPodcastSubtitleParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Subtitle Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__PODCAST_SUBTITLE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_PodcastSubtitleParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Summary Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MPODCAST_SUMMARY_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MPodcastSummaryParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Summary Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__PODCAST_SUMMARY_PARAMETER = eINSTANCE.getMPublishNewMp3Step_PodcastSummaryParameter();

		/**
		 * The meta object literal for the '<em><b>MPodcast Publishing Date Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MPODCAST_PUBLISHING_DATE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_MPodcastPublishingDateParameter();

		/**
		 * The meta object literal for the '<em><b>Podcast Publishing Date Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MPUBLISH_NEW_MP3_STEP__PODCAST_PUBLISHING_DATE_PARAMETER = eINSTANCE.getMPublishNewMp3Step_PodcastPublishingDateParameter();

		/**
		 * The meta object literal for the '<em><b>MPublished Mp3 Entry Reference Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__MPUBLISHED_MP3_ENTRY_REFERENCE_RESULT = eINSTANCE.getMPublishNewMp3Step_MPublishedMp3EntryReferenceResult();

		/**
		 * The meta object literal for the '<em><b>Published Mp3 Entry Reference Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MPUBLISH_NEW_MP3_STEP__PUBLISHED_MP3_ENTRY_REFERENCE_RESULT = eINSTANCE.getMPublishNewMp3Step_PublishedMp3EntryReferenceResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MEmailEventLogStep <em>MEmail Event Log Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MEmailEventLogStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMEmailEventLogStep()
		 * @generated
		 */
		public static final EClass MEMAIL_EVENT_LOG_STEP = eINSTANCE.getMEmailEventLogStep();

		/**
		 * The meta object literal for the '<em><b>MRecording Users Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MRECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEmailEventLogStep_MRecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Users Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__RECORDING_USERS_NAME_PARAMETER = eINSTANCE.getMEmailEventLogStep_RecordingUsersNameParameter();

		/**
		 * The meta object literal for the '<em><b>MComment Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MCOMMENT_PARAMETER = eINSTANCE.getMEmailEventLogStep_MCommentParameter();

		/**
		 * The meta object literal for the '<em><b>Comment Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__COMMENT_PARAMETER = eINSTANCE.getMEmailEventLogStep_CommentParameter();

		/**
		 * The meta object literal for the '<em><b>MLog File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MLOG_FILE_PARAMETER = eINSTANCE.getMEmailEventLogStep_MLogFileParameter();

		/**
		 * The meta object literal for the '<em><b>Log File Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__LOG_FILE_PARAMETER = eINSTANCE.getMEmailEventLogStep_LogFileParameter();

		/**
		 * The meta object literal for the '<em><b>MData File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MDATA_FILE_PARAMETER = eINSTANCE.getMEmailEventLogStep_MDataFileParameter();

		/**
		 * The meta object literal for the '<em><b>Data File Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__DATA_FILE_PARAMETER = eINSTANCE.getMEmailEventLogStep_DataFileParameter();

		/**
		 * The meta object literal for the '<em><b>MSubject Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MSUBJECT_PARAMETER = eINSTANCE.getMEmailEventLogStep_MSubjectParameter();

		/**
		 * The meta object literal for the '<em><b>Subject Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SUBJECT_PARAMETER = eINSTANCE.getMEmailEventLogStep_SubjectParameter();

		/**
		 * The meta object literal for the '<em><b>MSenders Email Address Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MSENDERS_EMAIL_ADDRESS_PARAMETER = eINSTANCE.getMEmailEventLogStep_MSendersEmailAddressParameter();

		/**
		 * The meta object literal for the '<em><b>Senders Email Address Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER = eINSTANCE.getMEmailEventLogStep_SendersEmailAddressParameter();

		/**
		 * The meta object literal for the '<em><b>Senders Email Address Parameter Historic Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SENDERS_EMAIL_ADDRESS_PARAMETER_HISTORIC_VALUES = eINSTANCE.getMEmailEventLogStep_SendersEmailAddressParameterHistoricValues();

		/**
		 * The meta object literal for the '<em><b>MReceipients Email Address Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MRECEIPIENTS_EMAIL_ADDRESS_PARAMETER = eINSTANCE.getMEmailEventLogStep_MReceipientsEmailAddressParameter();

		/**
		 * The meta object literal for the '<em><b>Receipients Email Address Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__RECEIPIENTS_EMAIL_ADDRESS_PARAMETER = eINSTANCE.getMEmailEventLogStep_ReceipientsEmailAddressParameter();

		/**
		 * The meta object literal for the '<em><b>MSmtp Server Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MSMTP_SERVER_PARAMETER = eINSTANCE.getMEmailEventLogStep_MSmtpServerParameter();

		/**
		 * The meta object literal for the '<em><b>Smtp Server Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SMTP_SERVER_PARAMETER = eINSTANCE.getMEmailEventLogStep_SmtpServerParameter();

		/**
		 * The meta object literal for the '<em><b>MSmtp User Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MSMTP_USER_NAME_PARAMETER = eINSTANCE.getMEmailEventLogStep_MSmtpUserNameParameter();

		/**
		 * The meta object literal for the '<em><b>Smtp User Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SMTP_USER_NAME_PARAMETER = eINSTANCE.getMEmailEventLogStep_SmtpUserNameParameter();

		/**
		 * The meta object literal for the '<em><b>MSmtp Password Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEMAIL_EVENT_LOG_STEP__MSMTP_PASSWORD_PARAMETER = eINSTANCE.getMEmailEventLogStep_MSmtpPasswordParameter();

		/**
		 * The meta object literal for the '<em><b>Smtp Password Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEMAIL_EVENT_LOG_STEP__SMTP_PASSWORD_PARAMETER = eINSTANCE.getMEmailEventLogStep_SmtpPasswordParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MMp3Folder <em>MMp3 Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MMp3Folder
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3Folder()
		 * @generated
		 */
		public static final EClass MMP3_FOLDER = eINSTANCE.getMMp3Folder();

		/**
		 * The meta object literal for the '<em><b>MSteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3_FOLDER__MSTEPS = eINSTANCE.getMMp3Folder_MSteps();

		/**
		 * The meta object literal for the '<em><b>MMp3s</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3_FOLDER__MMP3S = eINSTANCE.getMMp3Folder_MMp3s();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MMp3 <em>MMp3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MMp3
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3()
		 * @generated
		 */
		public static final EClass MMP3 = eINSTANCE.getMMp3();

		/**
		 * The meta object literal for the '<em><b>State Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__STATE_PROPERTY = eINSTANCE.getMMp3_StateProperty();

		/**
		 * The meta object literal for the '<em><b>MFile Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MFILE_PROPERTY = eINSTANCE.getMMp3_MFileProperty();

		/**
		 * The meta object literal for the '<em><b>File Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__FILE_PROPERTY = eINSTANCE.getMMp3_FileProperty();

		/**
		 * The meta object literal for the '<em><b>MLink Text Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MLINK_TEXT_PROPERTY = eINSTANCE.getMMp3_MLinkTextProperty();

		/**
		 * The meta object literal for the '<em><b>Link Text Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__LINK_TEXT_PROPERTY = eINSTANCE.getMMp3_LinkTextProperty();

		/**
		 * The meta object literal for the '<em><b>MLink Description Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MLINK_DESCRIPTION_PROPERTY = eINSTANCE.getMMp3_MLinkDescriptionProperty();

		/**
		 * The meta object literal for the '<em><b>Link Description Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__LINK_DESCRIPTION_PROPERTY = eINSTANCE.getMMp3_LinkDescriptionProperty();

		/**
		 * The meta object literal for the '<em><b>MComment Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MCOMMENT_PROPERTY = eINSTANCE.getMMp3_MCommentProperty();

		/**
		 * The meta object literal for the '<em><b>Comment Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__COMMENT_PROPERTY = eINSTANCE.getMMp3_CommentProperty();

		/**
		 * The meta object literal for the '<em><b>MPodcast Title Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MPODCAST_TITLE_PROPERTY = eINSTANCE.getMMp3_MPodcastTitleProperty();

		/**
		 * The meta object literal for the '<em><b>Podcast Title Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__PODCAST_TITLE_PROPERTY = eINSTANCE.getMMp3_PodcastTitleProperty();

		/**
		 * The meta object literal for the '<em><b>MPodcast Subtitle Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MPODCAST_SUBTITLE_PROPERTY = eINSTANCE.getMMp3_MPodcastSubtitleProperty();

		/**
		 * The meta object literal for the '<em><b>Podcast Subtitle Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__PODCAST_SUBTITLE_PROPERTY = eINSTANCE.getMMp3_PodcastSubtitleProperty();

		/**
		 * The meta object literal for the '<em><b>MPodcast Summary Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MPODCAST_SUMMARY_PROPERTY = eINSTANCE.getMMp3_MPodcastSummaryProperty();

		/**
		 * The meta object literal for the '<em><b>Podcast Summary Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__PODCAST_SUMMARY_PROPERTY = eINSTANCE.getMMp3_PodcastSummaryProperty();

		/**
		 * The meta object literal for the '<em><b>MPodcast Publishing Date Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MPODCAST_PUBLISHING_DATE_PROPERTY = eINSTANCE.getMMp3_MPodcastPublishingDateProperty();

		/**
		 * The meta object literal for the '<em><b>Podcast Publishing Date Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__PODCAST_PUBLISHING_DATE_PROPERTY = eINSTANCE.getMMp3_PodcastPublishingDateProperty();

		/**
		 * The meta object literal for the '<em><b>MPublished File Name Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MMP3__MPUBLISHED_FILE_NAME_PROPERTY = eINSTANCE.getMMp3_MPublishedFileNameProperty();

		/**
		 * The meta object literal for the '<em><b>Published File Name Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MMP3__PUBLISHED_FILE_NAME_PROPERTY = eINSTANCE.getMMp3_PublishedFileNameProperty();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MBurnCdStep <em>MBurn Cd Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MBurnCdStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBurnCdStep()
		 * @generated
		 */
		public static final EClass MBURN_CD_STEP = eINSTANCE.getMBurnCdStep();

		/**
		 * The meta object literal for the '<em><b>MRecording Files Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBURN_CD_STEP__MRECORDING_FILES_PARAMETER = eINSTANCE.getMBurnCdStep_MRecordingFilesParameter();

		/**
		 * The meta object literal for the '<em><b>Recording Files Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MBURN_CD_STEP__RECORDING_FILES_PARAMETER = eINSTANCE.getMBurnCdStep_RecordingFilesParameter();

		/**
		 * The meta object literal for the '<em><b>MBurning Software Directory Path Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBURN_CD_STEP__MBURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER = eINSTANCE.getMBurnCdStep_MBurningSoftwareDirectoryPathParameter();

		/**
		 * The meta object literal for the '<em><b>Burning Software Directory Path Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MBURN_CD_STEP__BURNING_SOFTWARE_DIRECTORY_PATH_PARAMETER = eINSTANCE.getMBurnCdStep_BurningSoftwareDirectoryPathParameter();

		/**
		 * The meta object literal for the '<em><b>MDrive Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBURN_CD_STEP__MDRIVE_PARAMETER = eINSTANCE.getMBurnCdStep_MDriveParameter();

		/**
		 * The meta object literal for the '<em><b>Drive Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MBURN_CD_STEP__DRIVE_PARAMETER = eINSTANCE.getMBurnCdStep_DriveParameter();

		/**
		 * The meta object literal for the '<em><b>MTotal Recording Length Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBURN_CD_STEP__MTOTAL_RECORDING_LENGTH_PARAMETER = eINSTANCE.getMBurnCdStep_MTotalRecordingLengthParameter();

		/**
		 * The meta object literal for the '<em><b>Total Recording Length Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MBURN_CD_STEP__TOTAL_RECORDING_LENGTH_PARAMETER = eINSTANCE.getMBurnCdStep_TotalRecordingLengthParameter();

		/**
		 * The meta object literal for the '<em><b>MTotal Recording File Size Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MBURN_CD_STEP__MTOTAL_RECORDING_FILE_SIZE_PARAMETER = eINSTANCE.getMBurnCdStep_MTotalRecordingFileSizeParameter();

		/**
		 * The meta object literal for the '<em><b>Total Recording File Size Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MBURN_CD_STEP__TOTAL_RECORDING_FILE_SIZE_PARAMETER = eINSTANCE.getMBurnCdStep_TotalRecordingFileSizeParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MFtpStep <em>MFtp Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MFtpStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFtpStep()
		 * @generated
		 */
		public static final EClass MFTP_STEP = eINSTANCE.getMFtpStep();

		/**
		 * The meta object literal for the '<em><b>MFtp Server Url Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MFTP_STEP__MFTP_SERVER_URL_PARAMETER = eINSTANCE.getMFtpStep_MFtpServerUrlParameter();

		/**
		 * The meta object literal for the '<em><b>Ftp Server Url Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MFTP_STEP__FTP_SERVER_URL_PARAMETER = eINSTANCE.getMFtpStep_FtpServerUrlParameter();

		/**
		 * The meta object literal for the '<em><b>MFtp User Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MFTP_STEP__MFTP_USER_NAME_PARAMETER = eINSTANCE.getMFtpStep_MFtpUserNameParameter();

		/**
		 * The meta object literal for the '<em><b>Ftp User Name Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MFTP_STEP__FTP_USER_NAME_PARAMETER = eINSTANCE.getMFtpStep_FtpUserNameParameter();

		/**
		 * The meta object literal for the '<em><b>MFtp User Password Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MFTP_STEP__MFTP_USER_PASSWORD_PARAMETER = eINSTANCE.getMFtpStep_MFtpUserPasswordParameter();

		/**
		 * The meta object literal for the '<em><b>Ftp User Password Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MFTP_STEP__FTP_USER_PASSWORD_PARAMETER = eINSTANCE.getMFtpStep_FtpUserPasswordParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MTestStep <em>MTest Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MTestStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTestStep()
		 * @generated
		 */
		public static final EClass MTEST_STEP = eINSTANCE.getMTestStep();

		/**
		 * The meta object literal for the '<em><b>MPersistent String Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MTEST_STEP__MPERSISTENT_STRING_PARAMETER = eINSTANCE.getMTestStep_MPersistentStringParameter();

		/**
		 * The meta object literal for the '<em><b>Persistent String Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MTEST_STEP__PERSISTENT_STRING_PARAMETER = eINSTANCE.getMTestStep_PersistentStringParameter();

		/**
		 * The meta object literal for the '<em><b>MString Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MTEST_STEP__MSTRING_PARAMETER = eINSTANCE.getMTestStep_MStringParameter();

		/**
		 * The meta object literal for the '<em><b>String Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MTEST_STEP__STRING_PARAMETER = eINSTANCE.getMTestStep_StringParameter();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep <em>MDms Application MGet Data Upgrade Info Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMGetDataUpgradeInfoStep()
		 * @generated
		 */
		public static final EClass MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Available Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_AVAILABLE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeAvailableResult();

		/**
		 * The meta object literal for the '<em><b>Upgrade Available Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_AVAILABLE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeAvailableResult();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Message Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_MESSAGE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeMessageResult();

		/**
		 * The meta object literal for the '<em><b>Upgrade Message Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_MESSAGE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeMessageResult();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Date Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__MUPGRADE_DATE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_MUpgradeDateResult();

		/**
		 * The meta object literal for the '<em><b>Upgrade Date Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MGET_DATA_UPGRADE_INFO_STEP__UPGRADE_DATE_RESULT = eINSTANCE.getMDmsApplicationMGetDataUpgradeInfoStep_UpgradeDateResult();

		/**
		 * The meta object literal for the '{@link org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep <em>MDms Application MUpgrade Data Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.MDmsApplicationMUpgradeDataStep
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDmsApplicationMUpgradeDataStep()
		 * @generated
		 */
		public static final EClass MDMS_APPLICATION_MUPGRADE_DATA_STEP = eINSTANCE.getMDmsApplicationMUpgradeDataStep();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Relative Ftp Path Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplicationMUpgradeDataStep_MUpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>Upgrade Relative Ftp Path Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_RELATIVE_FTP_PATH_PROPERTY = eINSTANCE.getMDmsApplicationMUpgradeDataStep_UpgradeRelativeFtpPathProperty();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Message Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_MESSAGE_PARAMETER = eINSTANCE.getMDmsApplicationMUpgradeDataStep_MUpgradeMessageParameter();

		/**
		 * The meta object literal for the '<em><b>Upgrade Message Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_MESSAGE_PARAMETER = eINSTANCE.getMDmsApplicationMUpgradeDataStep_UpgradeMessageParameter();

		/**
		 * The meta object literal for the '<em><b>MUpgrade Date Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MDMS_APPLICATION_MUPGRADE_DATA_STEP__MUPGRADE_DATE_PARAMETER = eINSTANCE.getMDmsApplicationMUpgradeDataStep_MUpgradeDateParameter();

		/**
		 * The meta object literal for the '<em><b>Upgrade Date Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MDMS_APPLICATION_MUPGRADE_DATA_STEP__UPGRADE_DATE_PARAMETER = eINSTANCE.getMDmsApplicationMUpgradeDataStep_UpgradeDateParameter();

		/**
		 * The meta object literal for the '<em>MFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMFile()
		 * @generated
		 */
		public static final EDataType MFILE = eINSTANCE.getMFile();

		/**
		 * The meta object literal for the '<em>MExisting File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMExistingFile()
		 * @generated
		 */
		public static final EDataType MEXISTING_FILE = eINSTANCE.getMExistingFile();

		/**
		 * The meta object literal for the '<em>MState</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.types.State
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMState()
		 * @generated
		 */
		public static final EDataType MSTATE = eINSTANCE.getMState();

		/**
		 * The meta object literal for the '<em>MStep State</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.types.State
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMStepState()
		 * @generated
		 */
		public static final EDataType MSTEP_STATE = eINSTANCE.getMStepState();

		/**
		 * The meta object literal for the '<em>MBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMBoolean()
		 * @generated
		 */
		public static final EDataType MBOOLEAN = eINSTANCE.getMBoolean();

		/**
		 * The meta object literal for the '<em>MDate Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDateTime()
		 * @generated
		 */
		public static final EDataType MDATE_TIME = eINSTANCE.getMDateTime();

		/**
		 * The meta object literal for the '<em>MDate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDate()
		 * @generated
		 */
		public static final EDataType MDATE = eINSTANCE.getMDate();

		/**
		 * The meta object literal for the '<em>MTime</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMTime()
		 * @generated
		 */
		public static final EDataType MTIME = eINSTANCE.getMTime();

		/**
		 * The meta object literal for the '<em>MDuration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMDuration()
		 * @generated
		 */
		public static final EDataType MDURATION = eINSTANCE.getMDuration();

		/**
		 * The meta object literal for the '<em>MLong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMLong()
		 * @generated
		 */
		public static final EDataType MLONG = eINSTANCE.getMLong();

		/**
		 * The meta object literal for the '<em>MPassword</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMPassword()
		 * @generated
		 */
		public static final EDataType MPASSWORD = eINSTANCE.getMPassword();

		/**
		 * The meta object literal for the '<em>MString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMString()
		 * @generated
		 */
		public static final EDataType MSTRING = eINSTANCE.getMString();

		/**
		 * The meta object literal for the '<em>MUrl</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMUrl()
		 * @generated
		 */
		public static final EDataType MURL = eINSTANCE.getMUrl();

		/**
		 * The meta object literal for the '<em>EThrowable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getEThrowable()
		 * @generated
		 */
		public static final EDataType ETHROWABLE = eINSTANCE.getEThrowable();

		/**
		 * The meta object literal for the '<em>MMp3 State</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.onceforall.dms.desktop.logic.types.State
		 * @see org.onceforall.dms.desktop.logic.LogicPackage#getMMp3State()
		 * @generated
		 */
		public static final EDataType MMP3_STATE = eINSTANCE.getMMp3State();

	}

} //LogicPackage
