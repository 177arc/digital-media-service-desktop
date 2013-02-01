/**
 * <copyright>
 * </copyright>
 *
 * $Id: ERootPackageType.java,v 1.1 2006/08/29 00:58:56 marc Exp $
 */
package org.onceforall.metamodeller;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERoot Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getECustomDataTypeTypes <em>ECustom Data Type Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMPrimitiveDataTypeTypes <em>MPrimitive Data Type Types</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMObjectTypePlaceholder <em>MObject Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMStatefulObjectTypePlaceholder <em>MStateful Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMApplicationTypePlaceholder <em>MApplication Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMStepTypePlaceholder <em>MStep Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMScriptTypePlaceholder <em>MScript Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMDirectoryTypePlaceholder <em>MDirectory Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMExistingDirectoryTypePlaceholder <em>MExisting Directory Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMFileTypePlaceholder <em>MFile Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMExistingFileTypePlaceholder <em>MExisting File Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMStateTypePlaceholder <em>MState Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMStepStateTypePlaceholder <em>MStep State Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMBooleanTypePlaceholder <em>MBoolean Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMDateTimeTypePlaceholder <em>MDate Time Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMDateTypePlaceholder <em>MDate Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMTimeTypePlaceholder <em>MTime Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMDurationTypePlaceholder <em>MDuration Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMLongTypePlaceholder <em>MLong Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMPasswordTypePlaceholder <em>MPassword Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMStringTypePlaceholder <em>MString Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getMUrlTypePlaceholder <em>MUrl Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEThrowableTypePlaceholder <em>EThrowable Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanTypePlaceholder <em>EBoolean Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEByteTypePlaceholder <em>EByte Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getECharTypePlaceholder <em>EChar Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleTypePlaceholder <em>EDouble Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEFloatTypePlaceholder <em>EFloat Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEIntTypePlaceholder <em>EInt Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getELongTypePlaceholder <em>ELong Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEShortTypePlaceholder <em>EShort Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEStringTypePlaceholder <em>EString Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEJavaObjectTypePlaceholder <em>EJava Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEJavaClassTypePlaceholder <em>EJava Class Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanObjectTypePlaceholder <em>EBoolean Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEByteObjectTypePlaceholder <em>EByte Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getECharacterObjectTypePlaceholder <em>ECharacter Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleObjectTypePlaceholder <em>EDouble Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEFloatObjectTypePlaceholder <em>EFloat Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEIntegerObjectTypePlaceholder <em>EInteger Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getELongObjectTypePlaceholder <em>ELong Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEShortObjectTypePlaceholder <em>EShort Object Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEByteArrayTypePlaceholder <em>EByte Array Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEDateTypePlaceholder <em>EDate Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEBigIntegerTypePlaceholder <em>EBig Integer Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEBigDecimalTypePlaceholder <em>EBig Decimal Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEResourceTypePlaceholder <em>EResource Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEResourceSetTypePlaceholder <em>EResource Set Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapEntryTypePlaceholder <em>EFeature Map Entry Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapTypePlaceholder <em>EFeature Map Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEEnumeratorTypePlaceholder <em>EEnumerator Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEEListTypePlaceholder <em>EE List Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getEETreeIteratorTypePlaceholder <em>EE Tree Iterator Type Placeholder</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.onceforall.metamodeller.ERootPackageType#getCopyrightText <em>Copyright Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType()
 * @model kind="class"
 * @generated
 */
public class ERootPackageType extends EPackageType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006, Marc Maier";

	/**
	 * The cached value of the '{@link #getECustomDataTypeTypes() <em>ECustom Data Type Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECustomDataTypeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList eCustomDataTypeTypes = null;

	/**
	 * The cached value of the '{@link #getMPrimitiveDataTypeTypes() <em>MPrimitive Data Type Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPrimitiveDataTypeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mPrimitiveDataTypeTypes = null;

	/**
	 * The cached value of the '{@link #getMObjectTypePlaceholder() <em>MObject Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MObjectType mObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMStatefulObjectTypePlaceholder() <em>MStateful Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStatefulObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MObjectType mStatefulObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMApplicationTypePlaceholder() <em>MApplication Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMApplicationTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MApplicationType mApplicationTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMStepTypePlaceholder() <em>MStep Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStepTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MStepType mStepTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMScriptTypePlaceholder() <em>MScript Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMScriptTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MObjectType mScriptTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMDirectoryTypePlaceholder() <em>MDirectory Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDirectoryTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mDirectoryTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMExistingDirectoryTypePlaceholder() <em>MExisting Directory Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMExistingDirectoryTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mExistingDirectoryTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMFileTypePlaceholder() <em>MFile Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFileTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mFileTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMExistingFileTypePlaceholder() <em>MExisting File Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMExistingFileTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mExistingFileTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMStateTypePlaceholder() <em>MState Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStateTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mStateTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMStepStateTypePlaceholder() <em>MStep State Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStepStateTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mStepStateTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMBooleanTypePlaceholder() <em>MBoolean Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBooleanTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mBooleanTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMDateTimeTypePlaceholder() <em>MDate Time Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDateTimeTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mDateTimeTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMDateTypePlaceholder() <em>MDate Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDateTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mDateTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMTimeTypePlaceholder() <em>MTime Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTimeTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mTimeTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMDurationTypePlaceholder() <em>MDuration Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDurationTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mDurationTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMLongTypePlaceholder() <em>MLong Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLongTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mLongTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMPasswordTypePlaceholder() <em>MPassword Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPasswordTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mPasswordTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMStringTypePlaceholder() <em>MString Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStringTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mStringTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getMUrlTypePlaceholder() <em>MUrl Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUrlTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected MPrimitiveDataTypeType mUrlTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEThrowableTypePlaceholder() <em>EThrowable Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEThrowableTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ECustomDataTypeType eThrowableTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEBooleanTypePlaceholder() <em>EBoolean Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBooleanTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eBooleanTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEByteTypePlaceholder() <em>EByte Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEByteTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eByteTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getECharTypePlaceholder() <em>EChar Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECharTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eCharTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEDoubleTypePlaceholder() <em>EDouble Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDoubleTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eDoubleTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEFloatTypePlaceholder() <em>EFloat Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFloatTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eFloatTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEIntTypePlaceholder() <em>EInt Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIntTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eIntTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getELongTypePlaceholder() <em>ELong Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELongTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eLongTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEShortTypePlaceholder() <em>EShort Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEShortTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eShortTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEStringTypePlaceholder() <em>EString Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStringTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eStringTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEJavaObjectTypePlaceholder() <em>EJava Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEJavaObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eJavaObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEJavaClassTypePlaceholder() <em>EJava Class Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEJavaClassTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eJavaClassTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEBooleanObjectTypePlaceholder() <em>EBoolean Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBooleanObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eBooleanObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEByteObjectTypePlaceholder() <em>EByte Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEByteObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eByteObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getECharacterObjectTypePlaceholder() <em>ECharacter Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECharacterObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eCharacterObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEDoubleObjectTypePlaceholder() <em>EDouble Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDoubleObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eDoubleObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEFloatObjectTypePlaceholder() <em>EFloat Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFloatObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eFloatObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEIntegerObjectTypePlaceholder() <em>EInteger Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIntegerObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eIntegerObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getELongObjectTypePlaceholder() <em>ELong Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELongObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eLongObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEShortObjectTypePlaceholder() <em>EShort Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEShortObjectTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eShortObjectTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEByteArrayTypePlaceholder() <em>EByte Array Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEByteArrayTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eByteArrayTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEDateTypePlaceholder() <em>EDate Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDateTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eDateTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEBigIntegerTypePlaceholder() <em>EBig Integer Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBigIntegerTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eBigIntegerTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEBigDecimalTypePlaceholder() <em>EBig Decimal Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBigDecimalTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eBigDecimalTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEResourceTypePlaceholder() <em>EResource Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEResourceTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eResourceTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEResourceSetTypePlaceholder() <em>EResource Set Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEResourceSetTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eResourceSetTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEFeatureMapEntryTypePlaceholder() <em>EFeature Map Entry Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFeatureMapEntryTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eFeatureMapEntryTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEFeatureMapTypePlaceholder() <em>EFeature Map Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFeatureMapTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eFeatureMapTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEEnumeratorTypePlaceholder() <em>EEnumerator Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEnumeratorTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eEnumeratorTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEEListTypePlaceholder() <em>EE List Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEListTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eEListTypePlaceholder = null;

	/**
	 * The cached value of the '{@link #getEETreeIteratorTypePlaceholder() <em>EE Tree Iterator Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEETreeIteratorTypePlaceholder()
	 * @generated
	 * @ordered
	 */
	protected ENativeDataTypeType eETreeIteratorTypePlaceholder = null;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ERootPackageType() {
		super();

		// Initialises not persistent references.
		MObjectType mObjectTypePlaceholder = new MObjectType();
		mObjectTypePlaceholder.setDefaultName("Object");
		mObjectTypePlaceholder.setName("MObject");
		mObjectTypePlaceholder.setAbstract(true);
		setMObjectTypePlaceholder(mObjectTypePlaceholder);

		MApplicationType mApplicationTypePlaceholder = new MApplicationType();
		mApplicationTypePlaceholder.setDefaultName("Application");
		mApplicationTypePlaceholder.setName("MApplication");
		mApplicationTypePlaceholder.setAbstract(true);
		mApplicationTypePlaceholder.setMSuperType(mObjectTypePlaceholder);
		setMApplicationTypePlaceholder(mApplicationTypePlaceholder);

		MStatefulObjectType mStatefulObjectTypePlaceholder = new MStatefulObjectType();
		mStatefulObjectTypePlaceholder.setDefaultName("Stateful object");
		mStatefulObjectTypePlaceholder.setName("MStatefulObject");
		mStatefulObjectTypePlaceholder.setAbstract(true);
		mStatefulObjectTypePlaceholder.setMSuperType(mObjectTypePlaceholder);
		setMStatefulObjectTypePlaceholder(mStatefulObjectTypePlaceholder);

		MStepType mStepTypePlaceholder = new MStepType();
		mStepTypePlaceholder.setDefaultName("Step");
		mStepTypePlaceholder.setName("MStep");
		mStepTypePlaceholder.setDefaultActionName("Mark as completed");
		mStepTypePlaceholder.setAbstract(true);
		mStepTypePlaceholder.setMSuperType(mStatefulObjectTypePlaceholder);
		setMStepTypePlaceholder(mStepTypePlaceholder);

		MObjectType mScriptTypePlaceholder = new MObjectType();
		mScriptTypePlaceholder.setDefaultName("Script");
		mScriptTypePlaceholder.setName("MScript");
		mScriptTypePlaceholder.setMSuperType(mObjectTypePlaceholder);
		setMScriptTypePlaceholder(mScriptTypePlaceholder);

		MPrimitiveDataTypeType mDateTimeType = new MPrimitiveDataTypeType();
		mDateTimeType.setName("MDateTime");
		mDateTimeType.setDataTypeName(Type.DATE_TIME_TYPE.getName());
		setMDateTimeTypePlaceholder(mDateTimeType);

		MPrimitiveDataTypeType mDateType = new MPrimitiveDataTypeType();
		mDateType.setName("MDate");
		mDateType.setDataTypeName(Type.DATE_TYPE.getName());
		setMDateTypePlaceholder(mDateType);

		MPrimitiveDataTypeType mTimeType = new MPrimitiveDataTypeType();
		mTimeType.setName("MTime");
		mTimeType.setDataTypeName(Type.TIME_TYPE.getName());
		setMTimeTypePlaceholder(mTimeType);

		MPrimitiveDataTypeType mDurationType = new MPrimitiveDataTypeType();
		mDurationType.setName("MDuration");
		mDurationType.setDataTypeName(Type.DURATION_TYPE.getName());
		setMDurationTypePlaceholder(mDurationType);

		MPrimitiveDataTypeType mFileType = new MPrimitiveDataTypeType();
		mFileType.setName("MFile");
		mFileType.setDataTypeName(Type.FILE_TYPE.getName());
		setMFileTypePlaceholder(mFileType);

		MPrimitiveDataTypeType mExistingFileType = new MPrimitiveDataTypeType();
		mExistingFileType.setName("MExistingFile");
		mExistingFileType.setDataTypeName(Type.EXISTING_FILE_TYPE.getName());
		setMExistingFileTypePlaceholder(mExistingFileType);

		MPrimitiveDataTypeType mDirectoryType = new MPrimitiveDataTypeType();
		mDirectoryType.setName("MDirectory");
		mDirectoryType.setDataTypeName(Type.DIRECTORY_TYPE.getName());
		setMDirectoryTypePlaceholder(mDirectoryType);

		MPrimitiveDataTypeType mExistingDirectoryType = new MPrimitiveDataTypeType();
		mExistingDirectoryType.setName("MExistingDirectory");
		mExistingDirectoryType.setDataTypeName(Type.EXISTING_DIRECTORY_TYPE
				.getName());
		setMExistingDirectoryTypePlaceholder(mExistingDirectoryType);

		MPrimitiveDataTypeType mStepStateType = new MPrimitiveDataTypeType();
		mStepStateType.setName("MStepState");
		mStepStateType.setDataTypeName(Type.STEP_STATE_TYPE.getName());
		setMStepStateTypePlaceholder(mStepStateType);

		MPrimitiveDataTypeType mStateType = new MPrimitiveDataTypeType();
		mStateType.setName("MState");
		mStateType.setDataTypeName(Type.STATE_TYPE.getName());
		setMStateTypePlaceholder(mStateType);

		MPrimitiveDataTypeType mBooleanType = new MPrimitiveDataTypeType();
		mBooleanType.setName("MBoolean");
		mBooleanType.setDataTypeName(Type.BOOLEAN_TYPE.getName());
		setMBooleanTypePlaceholder(mBooleanType);

		MPrimitiveDataTypeType mLongType = new MPrimitiveDataTypeType();
		mLongType.setName("MLong");
		mLongType.setDataTypeName(Type.LONG_TYPE.getName());
		setMLongTypePlaceholder(mLongType);

		MPrimitiveDataTypeType mStringType = new MPrimitiveDataTypeType();
		mStringType.setName("MString");
		mStringType.setDataTypeName(Type.STRING_TYPE.getName());
		setMStringTypePlaceholder(mStringType);

		MPrimitiveDataTypeType mPasswordType = new MPrimitiveDataTypeType();
		mPasswordType.setName("MPassword");
		mPasswordType.setDataTypeName(Type.PASSWORD_TYPE.getName());
		setMPasswordTypePlaceholder(mPasswordType);

		MPrimitiveDataTypeType mUrlType = new MPrimitiveDataTypeType();
		mUrlType.setName("MUrl");
		mUrlType.setDataTypeName(Type.URL_TYPE.getName());
		setMUrlTypePlaceholder(mUrlType);

		ECustomDataTypeType eThrowableType = new ECustomDataTypeType();
		eThrowableType.setName("EThrowable");
		eThrowableType.setInstanceClassName("java.lang.Throwable");
		setEThrowableTypePlaceholder(eThrowableType);

		for (EReference eReference : (List<EReference>) eClass()
				.getEAllReferences()) {
			if (eReference.getEType().getInstanceClass().isAssignableFrom(
					ENativeDataTypeType.class)) {
				ENativeDataTypeType eNativeDataTypeType = new ENativeDataTypeType();
				String typeName = eReference.getName();
				if (typeName.length() > 1) {
					if (typeName.endsWith("TypePlaceholder"))
						typeName = typeName.substring(0, typeName.length()
								- "TypePlaceholder".length());

					typeName = typeName.substring(0, 1).toUpperCase()
							+ typeName.substring(1);
				} else
					typeName = typeName.toUpperCase();
				eNativeDataTypeType.setName(typeName);
				eSet(eReference.getFeatureID(), eNativeDataTypeType);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetaModellerPackage.Literals.EROOT_PACKAGE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>ECustom Data Type Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.ECustomDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECustom Data Type Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECustom Data Type Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ECustomDataTypeTypes()
	 * @model type="org.onceforall.metamodeller.ECustomDataTypeType" containment="true"
	 * @generated
	 */
	public EList getECustomDataTypeTypes() {
		if (eCustomDataTypeTypes == null) {
			eCustomDataTypeTypes = new EObjectContainmentEList(
					ECustomDataTypeType.class,
					this,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES);
		}
		return eCustomDataTypeTypes;
	}

	/**
	 * Returns the value of the '<em><b>MPrimitive Data Type Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.onceforall.metamodeller.MPrimitiveDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPrimitive Data Type Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPrimitive Data Type Types</em>' containment reference list.
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MPrimitiveDataTypeTypes()
	 * @model type="org.onceforall.metamodeller.MPrimitiveDataTypeType" containment="true"
	 * @generated
	 */
	public EList getMPrimitiveDataTypeTypes() {
		if (mPrimitiveDataTypeTypes == null) {
			mPrimitiveDataTypeTypes = new EObjectContainmentEList(
					MPrimitiveDataTypeType.class,
					this,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES);
		}
		return mPrimitiveDataTypeTypes;
	}

	/**
	 * Returns the value of the '<em><b>MObject Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MObject Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MObject Type Placeholder</em>' containment reference.
	 * @see #setMObjectTypePlaceholder(MObjectType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MObjectType getMObjectTypePlaceholder() {
		return mObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMObjectTypePlaceholder(
			MObjectType newMObjectTypePlaceholder, NotificationChain msgs) {
		MObjectType oldMObjectTypePlaceholder = mObjectTypePlaceholder;
		mObjectTypePlaceholder = newMObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER,
					oldMObjectTypePlaceholder, newMObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMObjectTypePlaceholder <em>MObject Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MObject Type Placeholder</em>' containment reference.
	 * @see #getMObjectTypePlaceholder()
	 * @generated
	 */
	public void setMObjectTypePlaceholder(MObjectType newMObjectTypePlaceholder) {
		if (newMObjectTypePlaceholder != mObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (mObjectTypePlaceholder != null)
				msgs = ((InternalEObject) mObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newMObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMObjectTypePlaceholder(newMObjectTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER,
					newMObjectTypePlaceholder, newMObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MStateful Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MStateful Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStateful Object Type Placeholder</em>' containment reference.
	 * @see #setMStatefulObjectTypePlaceholder(MObjectType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MStatefulObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MObjectType getMStatefulObjectTypePlaceholder() {
		return mStatefulObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStatefulObjectTypePlaceholder(
			MObjectType newMStatefulObjectTypePlaceholder,
			NotificationChain msgs) {
		MObjectType oldMStatefulObjectTypePlaceholder = mStatefulObjectTypePlaceholder;
		mStatefulObjectTypePlaceholder = newMStatefulObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
					oldMStatefulObjectTypePlaceholder,
					newMStatefulObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMStatefulObjectTypePlaceholder <em>MStateful Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStateful Object Type Placeholder</em>' containment reference.
	 * @see #getMStatefulObjectTypePlaceholder()
	 * @generated
	 */
	public void setMStatefulObjectTypePlaceholder(
			MObjectType newMStatefulObjectTypePlaceholder) {
		if (newMStatefulObjectTypePlaceholder != mStatefulObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (mStatefulObjectTypePlaceholder != null)
				msgs = ((InternalEObject) mStatefulObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMStatefulObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newMStatefulObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMStatefulObjectTypePlaceholder(
					newMStatefulObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER,
					newMStatefulObjectTypePlaceholder,
					newMStatefulObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MApplication Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MApplication Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MApplication Type Placeholder</em>' containment reference.
	 * @see #setMApplicationTypePlaceholder(MApplicationType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MApplicationTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MApplicationType getMApplicationTypePlaceholder() {
		return mApplicationTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMApplicationTypePlaceholder(
			MApplicationType newMApplicationTypePlaceholder,
			NotificationChain msgs) {
		MApplicationType oldMApplicationTypePlaceholder = mApplicationTypePlaceholder;
		mApplicationTypePlaceholder = newMApplicationTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER,
					oldMApplicationTypePlaceholder,
					newMApplicationTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMApplicationTypePlaceholder <em>MApplication Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MApplication Type Placeholder</em>' containment reference.
	 * @see #getMApplicationTypePlaceholder()
	 * @generated
	 */
	public void setMApplicationTypePlaceholder(
			MApplicationType newMApplicationTypePlaceholder) {
		if (newMApplicationTypePlaceholder != mApplicationTypePlaceholder) {
			NotificationChain msgs = null;
			if (mApplicationTypePlaceholder != null)
				msgs = ((InternalEObject) mApplicationTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMApplicationTypePlaceholder != null)
				msgs = ((InternalEObject) newMApplicationTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMApplicationTypePlaceholder(
					newMApplicationTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER,
					newMApplicationTypePlaceholder,
					newMApplicationTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MStep Type Placeholder</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MStep Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStep Type Placeholder</em>' containment reference.
	 * @see #setMStepTypePlaceholder(MStepType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MStepTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MStepType getMStepTypePlaceholder() {
		return mStepTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStepTypePlaceholder(
			MStepType newMStepTypePlaceholder, NotificationChain msgs) {
		MStepType oldMStepTypePlaceholder = mStepTypePlaceholder;
		mStepTypePlaceholder = newMStepTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER,
					oldMStepTypePlaceholder, newMStepTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMStepTypePlaceholder <em>MStep Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStep Type Placeholder</em>' containment reference.
	 * @see #getMStepTypePlaceholder()
	 * @generated
	 */
	public void setMStepTypePlaceholder(MStepType newMStepTypePlaceholder) {
		if (newMStepTypePlaceholder != mStepTypePlaceholder) {
			NotificationChain msgs = null;
			if (mStepTypePlaceholder != null)
				msgs = ((InternalEObject) mStepTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMStepTypePlaceholder != null)
				msgs = ((InternalEObject) newMStepTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMStepTypePlaceholder(newMStepTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER,
					newMStepTypePlaceholder, newMStepTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MScript Type Placeholder</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MScript Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MScript Type Placeholder</em>' containment reference.
	 * @see #setMScriptTypePlaceholder(MObjectType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MScriptTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MObjectType getMScriptTypePlaceholder() {
		return mScriptTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMScriptTypePlaceholder(
			MObjectType newMScriptTypePlaceholder, NotificationChain msgs) {
		MObjectType oldMScriptTypePlaceholder = mScriptTypePlaceholder;
		mScriptTypePlaceholder = newMScriptTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER,
					oldMScriptTypePlaceholder, newMScriptTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMScriptTypePlaceholder <em>MScript Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MScript Type Placeholder</em>' containment reference.
	 * @see #getMScriptTypePlaceholder()
	 * @generated
	 */
	public void setMScriptTypePlaceholder(MObjectType newMScriptTypePlaceholder) {
		if (newMScriptTypePlaceholder != mScriptTypePlaceholder) {
			NotificationChain msgs = null;
			if (mScriptTypePlaceholder != null)
				msgs = ((InternalEObject) mScriptTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMScriptTypePlaceholder != null)
				msgs = ((InternalEObject) newMScriptTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMScriptTypePlaceholder(newMScriptTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER,
					newMScriptTypePlaceholder, newMScriptTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MDirectory Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDirectory Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDirectory Type Placeholder</em>' containment reference.
	 * @see #setMDirectoryTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MDirectoryTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMDirectoryTypePlaceholder() {
		return mDirectoryTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDirectoryTypePlaceholder(
			MPrimitiveDataTypeType newMDirectoryTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMDirectoryTypePlaceholder = mDirectoryTypePlaceholder;
		mDirectoryTypePlaceholder = newMDirectoryTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER,
					oldMDirectoryTypePlaceholder, newMDirectoryTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMDirectoryTypePlaceholder <em>MDirectory Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDirectory Type Placeholder</em>' containment reference.
	 * @see #getMDirectoryTypePlaceholder()
	 * @generated
	 */
	public void setMDirectoryTypePlaceholder(
			MPrimitiveDataTypeType newMDirectoryTypePlaceholder) {
		if (newMDirectoryTypePlaceholder != mDirectoryTypePlaceholder) {
			NotificationChain msgs = null;
			if (mDirectoryTypePlaceholder != null)
				msgs = ((InternalEObject) mDirectoryTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMDirectoryTypePlaceholder != null)
				msgs = ((InternalEObject) newMDirectoryTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMDirectoryTypePlaceholder(
					newMDirectoryTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER,
					newMDirectoryTypePlaceholder, newMDirectoryTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MExisting Directory Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MExisting Directory Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExisting Directory Type Placeholder</em>' containment reference.
	 * @see #setMExistingDirectoryTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MExistingDirectoryTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMExistingDirectoryTypePlaceholder() {
		return mExistingDirectoryTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMExistingDirectoryTypePlaceholder(
			MPrimitiveDataTypeType newMExistingDirectoryTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMExistingDirectoryTypePlaceholder = mExistingDirectoryTypePlaceholder;
		mExistingDirectoryTypePlaceholder = newMExistingDirectoryTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER,
					oldMExistingDirectoryTypePlaceholder,
					newMExistingDirectoryTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMExistingDirectoryTypePlaceholder <em>MExisting Directory Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MExisting Directory Type Placeholder</em>' containment reference.
	 * @see #getMExistingDirectoryTypePlaceholder()
	 * @generated
	 */
	public void setMExistingDirectoryTypePlaceholder(
			MPrimitiveDataTypeType newMExistingDirectoryTypePlaceholder) {
		if (newMExistingDirectoryTypePlaceholder != mExistingDirectoryTypePlaceholder) {
			NotificationChain msgs = null;
			if (mExistingDirectoryTypePlaceholder != null)
				msgs = ((InternalEObject) mExistingDirectoryTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMExistingDirectoryTypePlaceholder != null)
				msgs = ((InternalEObject) newMExistingDirectoryTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMExistingDirectoryTypePlaceholder(
					newMExistingDirectoryTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER,
					newMExistingDirectoryTypePlaceholder,
					newMExistingDirectoryTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MFile Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFile Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFile Type Placeholder</em>' containment reference.
	 * @see #setMFileTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MFileTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMFileTypePlaceholder() {
		return mFileTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFileTypePlaceholder(
			MPrimitiveDataTypeType newMFileTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMFileTypePlaceholder = mFileTypePlaceholder;
		mFileTypePlaceholder = newMFileTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER,
					oldMFileTypePlaceholder, newMFileTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMFileTypePlaceholder <em>MFile Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFile Type Placeholder</em>' containment reference.
	 * @see #getMFileTypePlaceholder()
	 * @generated
	 */
	public void setMFileTypePlaceholder(
			MPrimitiveDataTypeType newMFileTypePlaceholder) {
		if (newMFileTypePlaceholder != mFileTypePlaceholder) {
			NotificationChain msgs = null;
			if (mFileTypePlaceholder != null)
				msgs = ((InternalEObject) mFileTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMFileTypePlaceholder != null)
				msgs = ((InternalEObject) newMFileTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMFileTypePlaceholder(newMFileTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER,
					newMFileTypePlaceholder, newMFileTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MExisting File Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MExisting File Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExisting File Type Placeholder</em>' containment reference.
	 * @see #setMExistingFileTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MExistingFileTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMExistingFileTypePlaceholder() {
		return mExistingFileTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMExistingFileTypePlaceholder(
			MPrimitiveDataTypeType newMExistingFileTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMExistingFileTypePlaceholder = mExistingFileTypePlaceholder;
		mExistingFileTypePlaceholder = newMExistingFileTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER,
					oldMExistingFileTypePlaceholder,
					newMExistingFileTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMExistingFileTypePlaceholder <em>MExisting File Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MExisting File Type Placeholder</em>' containment reference.
	 * @see #getMExistingFileTypePlaceholder()
	 * @generated
	 */
	public void setMExistingFileTypePlaceholder(
			MPrimitiveDataTypeType newMExistingFileTypePlaceholder) {
		if (newMExistingFileTypePlaceholder != mExistingFileTypePlaceholder) {
			NotificationChain msgs = null;
			if (mExistingFileTypePlaceholder != null)
				msgs = ((InternalEObject) mExistingFileTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMExistingFileTypePlaceholder != null)
				msgs = ((InternalEObject) newMExistingFileTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMExistingFileTypePlaceholder(
					newMExistingFileTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER,
					newMExistingFileTypePlaceholder,
					newMExistingFileTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MState Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MState Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MState Type Placeholder</em>' containment reference.
	 * @see #setMStateTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MStateTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMStateTypePlaceholder() {
		return mStateTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStateTypePlaceholder(
			MPrimitiveDataTypeType newMStateTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMStateTypePlaceholder = mStateTypePlaceholder;
		mStateTypePlaceholder = newMStateTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER,
					oldMStateTypePlaceholder, newMStateTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMStateTypePlaceholder <em>MState Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MState Type Placeholder</em>' containment reference.
	 * @see #getMStateTypePlaceholder()
	 * @generated
	 */
	public void setMStateTypePlaceholder(
			MPrimitiveDataTypeType newMStateTypePlaceholder) {
		if (newMStateTypePlaceholder != mStateTypePlaceholder) {
			NotificationChain msgs = null;
			if (mStateTypePlaceholder != null)
				msgs = ((InternalEObject) mStateTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMStateTypePlaceholder != null)
				msgs = ((InternalEObject) newMStateTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMStateTypePlaceholder(newMStateTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER,
					newMStateTypePlaceholder, newMStateTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MStep State Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MStep State Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStep State Type Placeholder</em>' containment reference.
	 * @see #setMStepStateTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MStepStateTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMStepStateTypePlaceholder() {
		return mStepStateTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStepStateTypePlaceholder(
			MPrimitiveDataTypeType newMStepStateTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMStepStateTypePlaceholder = mStepStateTypePlaceholder;
		mStepStateTypePlaceholder = newMStepStateTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER,
					oldMStepStateTypePlaceholder, newMStepStateTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMStepStateTypePlaceholder <em>MStep State Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStep State Type Placeholder</em>' containment reference.
	 * @see #getMStepStateTypePlaceholder()
	 * @generated
	 */
	public void setMStepStateTypePlaceholder(
			MPrimitiveDataTypeType newMStepStateTypePlaceholder) {
		if (newMStepStateTypePlaceholder != mStepStateTypePlaceholder) {
			NotificationChain msgs = null;
			if (mStepStateTypePlaceholder != null)
				msgs = ((InternalEObject) mStepStateTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMStepStateTypePlaceholder != null)
				msgs = ((InternalEObject) newMStepStateTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMStepStateTypePlaceholder(
					newMStepStateTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER,
					newMStepStateTypePlaceholder, newMStepStateTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MBoolean Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBoolean Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBoolean Type Placeholder</em>' containment reference.
	 * @see #setMBooleanTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MBooleanTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMBooleanTypePlaceholder() {
		return mBooleanTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBooleanTypePlaceholder(
			MPrimitiveDataTypeType newMBooleanTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMBooleanTypePlaceholder = mBooleanTypePlaceholder;
		mBooleanTypePlaceholder = newMBooleanTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER,
					oldMBooleanTypePlaceholder, newMBooleanTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMBooleanTypePlaceholder <em>MBoolean Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBoolean Type Placeholder</em>' containment reference.
	 * @see #getMBooleanTypePlaceholder()
	 * @generated
	 */
	public void setMBooleanTypePlaceholder(
			MPrimitiveDataTypeType newMBooleanTypePlaceholder) {
		if (newMBooleanTypePlaceholder != mBooleanTypePlaceholder) {
			NotificationChain msgs = null;
			if (mBooleanTypePlaceholder != null)
				msgs = ((InternalEObject) mBooleanTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMBooleanTypePlaceholder != null)
				msgs = ((InternalEObject) newMBooleanTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMBooleanTypePlaceholder(newMBooleanTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER,
					newMBooleanTypePlaceholder, newMBooleanTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MDate Time Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDate Time Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDate Time Type Placeholder</em>' containment reference.
	 * @see #setMDateTimeTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MDateTimeTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMDateTimeTypePlaceholder() {
		return mDateTimeTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDateTimeTypePlaceholder(
			MPrimitiveDataTypeType newMDateTimeTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMDateTimeTypePlaceholder = mDateTimeTypePlaceholder;
		mDateTimeTypePlaceholder = newMDateTimeTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER,
					oldMDateTimeTypePlaceholder, newMDateTimeTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMDateTimeTypePlaceholder <em>MDate Time Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDate Time Type Placeholder</em>' containment reference.
	 * @see #getMDateTimeTypePlaceholder()
	 * @generated
	 */
	public void setMDateTimeTypePlaceholder(
			MPrimitiveDataTypeType newMDateTimeTypePlaceholder) {
		if (newMDateTimeTypePlaceholder != mDateTimeTypePlaceholder) {
			NotificationChain msgs = null;
			if (mDateTimeTypePlaceholder != null)
				msgs = ((InternalEObject) mDateTimeTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMDateTimeTypePlaceholder != null)
				msgs = ((InternalEObject) newMDateTimeTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMDateTimeTypePlaceholder(
					newMDateTimeTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER,
					newMDateTimeTypePlaceholder, newMDateTimeTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MDate Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDate Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDate Type Placeholder</em>' containment reference.
	 * @see #setMDateTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MDateTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMDateTypePlaceholder() {
		return mDateTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDateTypePlaceholder(
			MPrimitiveDataTypeType newMDateTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMDateTypePlaceholder = mDateTypePlaceholder;
		mDateTypePlaceholder = newMDateTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER,
					oldMDateTypePlaceholder, newMDateTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMDateTypePlaceholder <em>MDate Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDate Type Placeholder</em>' containment reference.
	 * @see #getMDateTypePlaceholder()
	 * @generated
	 */
	public void setMDateTypePlaceholder(
			MPrimitiveDataTypeType newMDateTypePlaceholder) {
		if (newMDateTypePlaceholder != mDateTypePlaceholder) {
			NotificationChain msgs = null;
			if (mDateTypePlaceholder != null)
				msgs = ((InternalEObject) mDateTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMDateTypePlaceholder != null)
				msgs = ((InternalEObject) newMDateTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMDateTypePlaceholder(newMDateTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER,
					newMDateTypePlaceholder, newMDateTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MTime Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTime Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTime Type Placeholder</em>' containment reference.
	 * @see #setMTimeTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MTimeTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMTimeTypePlaceholder() {
		return mTimeTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTimeTypePlaceholder(
			MPrimitiveDataTypeType newMTimeTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMTimeTypePlaceholder = mTimeTypePlaceholder;
		mTimeTypePlaceholder = newMTimeTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER,
					oldMTimeTypePlaceholder, newMTimeTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMTimeTypePlaceholder <em>MTime Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTime Type Placeholder</em>' containment reference.
	 * @see #getMTimeTypePlaceholder()
	 * @generated
	 */
	public void setMTimeTypePlaceholder(
			MPrimitiveDataTypeType newMTimeTypePlaceholder) {
		if (newMTimeTypePlaceholder != mTimeTypePlaceholder) {
			NotificationChain msgs = null;
			if (mTimeTypePlaceholder != null)
				msgs = ((InternalEObject) mTimeTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMTimeTypePlaceholder != null)
				msgs = ((InternalEObject) newMTimeTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMTimeTypePlaceholder(newMTimeTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER,
					newMTimeTypePlaceholder, newMTimeTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MDuration Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDuration Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDuration Type Placeholder</em>' containment reference.
	 * @see #setMDurationTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MDurationTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMDurationTypePlaceholder() {
		return mDurationTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDurationTypePlaceholder(
			MPrimitiveDataTypeType newMDurationTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMDurationTypePlaceholder = mDurationTypePlaceholder;
		mDurationTypePlaceholder = newMDurationTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER,
					oldMDurationTypePlaceholder, newMDurationTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMDurationTypePlaceholder <em>MDuration Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDuration Type Placeholder</em>' containment reference.
	 * @see #getMDurationTypePlaceholder()
	 * @generated
	 */
	public void setMDurationTypePlaceholder(
			MPrimitiveDataTypeType newMDurationTypePlaceholder) {
		if (newMDurationTypePlaceholder != mDurationTypePlaceholder) {
			NotificationChain msgs = null;
			if (mDurationTypePlaceholder != null)
				msgs = ((InternalEObject) mDurationTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMDurationTypePlaceholder != null)
				msgs = ((InternalEObject) newMDurationTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMDurationTypePlaceholder(
					newMDurationTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER,
					newMDurationTypePlaceholder, newMDurationTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MLong Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLong Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLong Type Placeholder</em>' containment reference.
	 * @see #setMLongTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MLongTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMLongTypePlaceholder() {
		return mLongTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLongTypePlaceholder(
			MPrimitiveDataTypeType newMLongTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMLongTypePlaceholder = mLongTypePlaceholder;
		mLongTypePlaceholder = newMLongTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER,
					oldMLongTypePlaceholder, newMLongTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMLongTypePlaceholder <em>MLong Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLong Type Placeholder</em>' containment reference.
	 * @see #getMLongTypePlaceholder()
	 * @generated
	 */
	public void setMLongTypePlaceholder(
			MPrimitiveDataTypeType newMLongTypePlaceholder) {
		if (newMLongTypePlaceholder != mLongTypePlaceholder) {
			NotificationChain msgs = null;
			if (mLongTypePlaceholder != null)
				msgs = ((InternalEObject) mLongTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMLongTypePlaceholder != null)
				msgs = ((InternalEObject) newMLongTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMLongTypePlaceholder(newMLongTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER,
					newMLongTypePlaceholder, newMLongTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MPassword Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPassword Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPassword Type Placeholder</em>' containment reference.
	 * @see #setMPasswordTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MPasswordTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMPasswordTypePlaceholder() {
		return mPasswordTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPasswordTypePlaceholder(
			MPrimitiveDataTypeType newMPasswordTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMPasswordTypePlaceholder = mPasswordTypePlaceholder;
		mPasswordTypePlaceholder = newMPasswordTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER,
					oldMPasswordTypePlaceholder, newMPasswordTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMPasswordTypePlaceholder <em>MPassword Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPassword Type Placeholder</em>' containment reference.
	 * @see #getMPasswordTypePlaceholder()
	 * @generated
	 */
	public void setMPasswordTypePlaceholder(
			MPrimitiveDataTypeType newMPasswordTypePlaceholder) {
		if (newMPasswordTypePlaceholder != mPasswordTypePlaceholder) {
			NotificationChain msgs = null;
			if (mPasswordTypePlaceholder != null)
				msgs = ((InternalEObject) mPasswordTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMPasswordTypePlaceholder != null)
				msgs = ((InternalEObject) newMPasswordTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMPasswordTypePlaceholder(
					newMPasswordTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER,
					newMPasswordTypePlaceholder, newMPasswordTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MString Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MString Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MString Type Placeholder</em>' containment reference.
	 * @see #setMStringTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MStringTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMStringTypePlaceholder() {
		return mStringTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStringTypePlaceholder(
			MPrimitiveDataTypeType newMStringTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMStringTypePlaceholder = mStringTypePlaceholder;
		mStringTypePlaceholder = newMStringTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER,
					oldMStringTypePlaceholder, newMStringTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMStringTypePlaceholder <em>MString Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MString Type Placeholder</em>' containment reference.
	 * @see #getMStringTypePlaceholder()
	 * @generated
	 */
	public void setMStringTypePlaceholder(
			MPrimitiveDataTypeType newMStringTypePlaceholder) {
		if (newMStringTypePlaceholder != mStringTypePlaceholder) {
			NotificationChain msgs = null;
			if (mStringTypePlaceholder != null)
				msgs = ((InternalEObject) mStringTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMStringTypePlaceholder != null)
				msgs = ((InternalEObject) newMStringTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMStringTypePlaceholder(newMStringTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER,
					newMStringTypePlaceholder, newMStringTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>MUrl Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MUrl Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUrl Type Placeholder</em>' containment reference.
	 * @see #setMUrlTypePlaceholder(MPrimitiveDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_MUrlTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public MPrimitiveDataTypeType getMUrlTypePlaceholder() {
		return mUrlTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUrlTypePlaceholder(
			MPrimitiveDataTypeType newMUrlTypePlaceholder,
			NotificationChain msgs) {
		MPrimitiveDataTypeType oldMUrlTypePlaceholder = mUrlTypePlaceholder;
		mUrlTypePlaceholder = newMUrlTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER,
					oldMUrlTypePlaceholder, newMUrlTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getMUrlTypePlaceholder <em>MUrl Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MUrl Type Placeholder</em>' containment reference.
	 * @see #getMUrlTypePlaceholder()
	 * @generated
	 */
	public void setMUrlTypePlaceholder(
			MPrimitiveDataTypeType newMUrlTypePlaceholder) {
		if (newMUrlTypePlaceholder != mUrlTypePlaceholder) {
			NotificationChain msgs = null;
			if (mUrlTypePlaceholder != null)
				msgs = ((InternalEObject) mUrlTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER,
								null, msgs);
			if (newMUrlTypePlaceholder != null)
				msgs = ((InternalEObject) newMUrlTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetMUrlTypePlaceholder(newMUrlTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER,
					newMUrlTypePlaceholder, newMUrlTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EThrowable Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EThrowable Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EThrowable Type Placeholder</em>' containment reference.
	 * @see #setEThrowableTypePlaceholder(ECustomDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EThrowableTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ECustomDataTypeType getEThrowableTypePlaceholder() {
		return eThrowableTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEThrowableTypePlaceholder(
			ECustomDataTypeType newEThrowableTypePlaceholder,
			NotificationChain msgs) {
		ECustomDataTypeType oldEThrowableTypePlaceholder = eThrowableTypePlaceholder;
		eThrowableTypePlaceholder = newEThrowableTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER,
					oldEThrowableTypePlaceholder, newEThrowableTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEThrowableTypePlaceholder <em>EThrowable Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EThrowable Type Placeholder</em>' containment reference.
	 * @see #getEThrowableTypePlaceholder()
	 * @generated
	 */
	public void setEThrowableTypePlaceholder(
			ECustomDataTypeType newEThrowableTypePlaceholder) {
		if (newEThrowableTypePlaceholder != eThrowableTypePlaceholder) {
			NotificationChain msgs = null;
			if (eThrowableTypePlaceholder != null)
				msgs = ((InternalEObject) eThrowableTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEThrowableTypePlaceholder != null)
				msgs = ((InternalEObject) newEThrowableTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEThrowableTypePlaceholder(
					newEThrowableTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER,
					newEThrowableTypePlaceholder, newEThrowableTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EBoolean Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBoolean Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBoolean Type Placeholder</em>' containment reference.
	 * @see #setEBooleanTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EBooleanTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEBooleanTypePlaceholder() {
		return eBooleanTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBooleanTypePlaceholder(
			ENativeDataTypeType newEBooleanTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEBooleanTypePlaceholder = eBooleanTypePlaceholder;
		eBooleanTypePlaceholder = newEBooleanTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER,
					oldEBooleanTypePlaceholder, newEBooleanTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanTypePlaceholder <em>EBoolean Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBoolean Type Placeholder</em>' containment reference.
	 * @see #getEBooleanTypePlaceholder()
	 * @generated
	 */
	public void setEBooleanTypePlaceholder(
			ENativeDataTypeType newEBooleanTypePlaceholder) {
		if (newEBooleanTypePlaceholder != eBooleanTypePlaceholder) {
			NotificationChain msgs = null;
			if (eBooleanTypePlaceholder != null)
				msgs = ((InternalEObject) eBooleanTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEBooleanTypePlaceholder != null)
				msgs = ((InternalEObject) newEBooleanTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEBooleanTypePlaceholder(newEBooleanTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER,
					newEBooleanTypePlaceholder, newEBooleanTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EByte Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EByte Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EByte Type Placeholder</em>' containment reference.
	 * @see #setEByteTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EByteTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEByteTypePlaceholder() {
		return eByteTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEByteTypePlaceholder(
			ENativeDataTypeType newEByteTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEByteTypePlaceholder = eByteTypePlaceholder;
		eByteTypePlaceholder = newEByteTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER,
					oldEByteTypePlaceholder, newEByteTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEByteTypePlaceholder <em>EByte Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EByte Type Placeholder</em>' containment reference.
	 * @see #getEByteTypePlaceholder()
	 * @generated
	 */
	public void setEByteTypePlaceholder(
			ENativeDataTypeType newEByteTypePlaceholder) {
		if (newEByteTypePlaceholder != eByteTypePlaceholder) {
			NotificationChain msgs = null;
			if (eByteTypePlaceholder != null)
				msgs = ((InternalEObject) eByteTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEByteTypePlaceholder != null)
				msgs = ((InternalEObject) newEByteTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEByteTypePlaceholder(newEByteTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER,
					newEByteTypePlaceholder, newEByteTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EChar Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EChar Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EChar Type Placeholder</em>' containment reference.
	 * @see #setECharTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ECharTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getECharTypePlaceholder() {
		return eCharTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECharTypePlaceholder(
			ENativeDataTypeType newECharTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldECharTypePlaceholder = eCharTypePlaceholder;
		eCharTypePlaceholder = newECharTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER,
					oldECharTypePlaceholder, newECharTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getECharTypePlaceholder <em>EChar Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EChar Type Placeholder</em>' containment reference.
	 * @see #getECharTypePlaceholder()
	 * @generated
	 */
	public void setECharTypePlaceholder(
			ENativeDataTypeType newECharTypePlaceholder) {
		if (newECharTypePlaceholder != eCharTypePlaceholder) {
			NotificationChain msgs = null;
			if (eCharTypePlaceholder != null)
				msgs = ((InternalEObject) eCharTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER,
								null, msgs);
			if (newECharTypePlaceholder != null)
				msgs = ((InternalEObject) newECharTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetECharTypePlaceholder(newECharTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER,
					newECharTypePlaceholder, newECharTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EDouble Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDouble Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDouble Type Placeholder</em>' containment reference.
	 * @see #setEDoubleTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EDoubleTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEDoubleTypePlaceholder() {
		return eDoubleTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDoubleTypePlaceholder(
			ENativeDataTypeType newEDoubleTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEDoubleTypePlaceholder = eDoubleTypePlaceholder;
		eDoubleTypePlaceholder = newEDoubleTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER,
					oldEDoubleTypePlaceholder, newEDoubleTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleTypePlaceholder <em>EDouble Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDouble Type Placeholder</em>' containment reference.
	 * @see #getEDoubleTypePlaceholder()
	 * @generated
	 */
	public void setEDoubleTypePlaceholder(
			ENativeDataTypeType newEDoubleTypePlaceholder) {
		if (newEDoubleTypePlaceholder != eDoubleTypePlaceholder) {
			NotificationChain msgs = null;
			if (eDoubleTypePlaceholder != null)
				msgs = ((InternalEObject) eDoubleTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEDoubleTypePlaceholder != null)
				msgs = ((InternalEObject) newEDoubleTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEDoubleTypePlaceholder(newEDoubleTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER,
					newEDoubleTypePlaceholder, newEDoubleTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EFloat Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFloat Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFloat Type Placeholder</em>' containment reference.
	 * @see #setEFloatTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EFloatTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEFloatTypePlaceholder() {
		return eFloatTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFloatTypePlaceholder(
			ENativeDataTypeType newEFloatTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEFloatTypePlaceholder = eFloatTypePlaceholder;
		eFloatTypePlaceholder = newEFloatTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER,
					oldEFloatTypePlaceholder, newEFloatTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEFloatTypePlaceholder <em>EFloat Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFloat Type Placeholder</em>' containment reference.
	 * @see #getEFloatTypePlaceholder()
	 * @generated
	 */
	public void setEFloatTypePlaceholder(
			ENativeDataTypeType newEFloatTypePlaceholder) {
		if (newEFloatTypePlaceholder != eFloatTypePlaceholder) {
			NotificationChain msgs = null;
			if (eFloatTypePlaceholder != null)
				msgs = ((InternalEObject) eFloatTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEFloatTypePlaceholder != null)
				msgs = ((InternalEObject) newEFloatTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEFloatTypePlaceholder(newEFloatTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER,
					newEFloatTypePlaceholder, newEFloatTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EInt Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EInt Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInt Type Placeholder</em>' containment reference.
	 * @see #setEIntTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EIntTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEIntTypePlaceholder() {
		return eIntTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIntTypePlaceholder(
			ENativeDataTypeType newEIntTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEIntTypePlaceholder = eIntTypePlaceholder;
		eIntTypePlaceholder = newEIntTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER,
					oldEIntTypePlaceholder, newEIntTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEIntTypePlaceholder <em>EInt Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EInt Type Placeholder</em>' containment reference.
	 * @see #getEIntTypePlaceholder()
	 * @generated
	 */
	public void setEIntTypePlaceholder(
			ENativeDataTypeType newEIntTypePlaceholder) {
		if (newEIntTypePlaceholder != eIntTypePlaceholder) {
			NotificationChain msgs = null;
			if (eIntTypePlaceholder != null)
				msgs = ((InternalEObject) eIntTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEIntTypePlaceholder != null)
				msgs = ((InternalEObject) newEIntTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEIntTypePlaceholder(newEIntTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER,
					newEIntTypePlaceholder, newEIntTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>ELong Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELong Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELong Type Placeholder</em>' containment reference.
	 * @see #setELongTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ELongTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getELongTypePlaceholder() {
		return eLongTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELongTypePlaceholder(
			ENativeDataTypeType newELongTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldELongTypePlaceholder = eLongTypePlaceholder;
		eLongTypePlaceholder = newELongTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER,
					oldELongTypePlaceholder, newELongTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getELongTypePlaceholder <em>ELong Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELong Type Placeholder</em>' containment reference.
	 * @see #getELongTypePlaceholder()
	 * @generated
	 */
	public void setELongTypePlaceholder(
			ENativeDataTypeType newELongTypePlaceholder) {
		if (newELongTypePlaceholder != eLongTypePlaceholder) {
			NotificationChain msgs = null;
			if (eLongTypePlaceholder != null)
				msgs = ((InternalEObject) eLongTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER,
								null, msgs);
			if (newELongTypePlaceholder != null)
				msgs = ((InternalEObject) newELongTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetELongTypePlaceholder(newELongTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER,
					newELongTypePlaceholder, newELongTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EShort Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EShort Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EShort Type Placeholder</em>' containment reference.
	 * @see #setEShortTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EShortTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEShortTypePlaceholder() {
		return eShortTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEShortTypePlaceholder(
			ENativeDataTypeType newEShortTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEShortTypePlaceholder = eShortTypePlaceholder;
		eShortTypePlaceholder = newEShortTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER,
					oldEShortTypePlaceholder, newEShortTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEShortTypePlaceholder <em>EShort Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EShort Type Placeholder</em>' containment reference.
	 * @see #getEShortTypePlaceholder()
	 * @generated
	 */
	public void setEShortTypePlaceholder(
			ENativeDataTypeType newEShortTypePlaceholder) {
		if (newEShortTypePlaceholder != eShortTypePlaceholder) {
			NotificationChain msgs = null;
			if (eShortTypePlaceholder != null)
				msgs = ((InternalEObject) eShortTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEShortTypePlaceholder != null)
				msgs = ((InternalEObject) newEShortTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEShortTypePlaceholder(newEShortTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER,
					newEShortTypePlaceholder, newEShortTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EString Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EString Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EString Type Placeholder</em>' containment reference.
	 * @see #setEStringTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EStringTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEStringTypePlaceholder() {
		return eStringTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEStringTypePlaceholder(
			ENativeDataTypeType newEStringTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEStringTypePlaceholder = eStringTypePlaceholder;
		eStringTypePlaceholder = newEStringTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER,
					oldEStringTypePlaceholder, newEStringTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEStringTypePlaceholder <em>EString Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EString Type Placeholder</em>' containment reference.
	 * @see #getEStringTypePlaceholder()
	 * @generated
	 */
	public void setEStringTypePlaceholder(
			ENativeDataTypeType newEStringTypePlaceholder) {
		if (newEStringTypePlaceholder != eStringTypePlaceholder) {
			NotificationChain msgs = null;
			if (eStringTypePlaceholder != null)
				msgs = ((InternalEObject) eStringTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEStringTypePlaceholder != null)
				msgs = ((InternalEObject) newEStringTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEStringTypePlaceholder(newEStringTypePlaceholder,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER,
					newEStringTypePlaceholder, newEStringTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EJava Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EJava Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EJava Object Type Placeholder</em>' containment reference.
	 * @see #setEJavaObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EJavaObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEJavaObjectTypePlaceholder() {
		return eJavaObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEJavaObjectTypePlaceholder(
			ENativeDataTypeType newEJavaObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEJavaObjectTypePlaceholder = eJavaObjectTypePlaceholder;
		eJavaObjectTypePlaceholder = newEJavaObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER,
					oldEJavaObjectTypePlaceholder,
					newEJavaObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEJavaObjectTypePlaceholder <em>EJava Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EJava Object Type Placeholder</em>' containment reference.
	 * @see #getEJavaObjectTypePlaceholder()
	 * @generated
	 */
	public void setEJavaObjectTypePlaceholder(
			ENativeDataTypeType newEJavaObjectTypePlaceholder) {
		if (newEJavaObjectTypePlaceholder != eJavaObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eJavaObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eJavaObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEJavaObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEJavaObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEJavaObjectTypePlaceholder(
					newEJavaObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER,
					newEJavaObjectTypePlaceholder,
					newEJavaObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EJava Class Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EJava Class Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EJava Class Type Placeholder</em>' containment reference.
	 * @see #setEJavaClassTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EJavaClassTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEJavaClassTypePlaceholder() {
		return eJavaClassTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEJavaClassTypePlaceholder(
			ENativeDataTypeType newEJavaClassTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEJavaClassTypePlaceholder = eJavaClassTypePlaceholder;
		eJavaClassTypePlaceholder = newEJavaClassTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER,
					oldEJavaClassTypePlaceholder, newEJavaClassTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEJavaClassTypePlaceholder <em>EJava Class Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EJava Class Type Placeholder</em>' containment reference.
	 * @see #getEJavaClassTypePlaceholder()
	 * @generated
	 */
	public void setEJavaClassTypePlaceholder(
			ENativeDataTypeType newEJavaClassTypePlaceholder) {
		if (newEJavaClassTypePlaceholder != eJavaClassTypePlaceholder) {
			NotificationChain msgs = null;
			if (eJavaClassTypePlaceholder != null)
				msgs = ((InternalEObject) eJavaClassTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEJavaClassTypePlaceholder != null)
				msgs = ((InternalEObject) newEJavaClassTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEJavaClassTypePlaceholder(
					newEJavaClassTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER,
					newEJavaClassTypePlaceholder, newEJavaClassTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EBoolean Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBoolean Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBoolean Object Type Placeholder</em>' containment reference.
	 * @see #setEBooleanObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EBooleanObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEBooleanObjectTypePlaceholder() {
		return eBooleanObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBooleanObjectTypePlaceholder(
			ENativeDataTypeType newEBooleanObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEBooleanObjectTypePlaceholder = eBooleanObjectTypePlaceholder;
		eBooleanObjectTypePlaceholder = newEBooleanObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER,
					oldEBooleanObjectTypePlaceholder,
					newEBooleanObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEBooleanObjectTypePlaceholder <em>EBoolean Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBoolean Object Type Placeholder</em>' containment reference.
	 * @see #getEBooleanObjectTypePlaceholder()
	 * @generated
	 */
	public void setEBooleanObjectTypePlaceholder(
			ENativeDataTypeType newEBooleanObjectTypePlaceholder) {
		if (newEBooleanObjectTypePlaceholder != eBooleanObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eBooleanObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eBooleanObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEBooleanObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEBooleanObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEBooleanObjectTypePlaceholder(
					newEBooleanObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER,
					newEBooleanObjectTypePlaceholder,
					newEBooleanObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EByte Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EByte Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EByte Object Type Placeholder</em>' containment reference.
	 * @see #setEByteObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EByteObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEByteObjectTypePlaceholder() {
		return eByteObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEByteObjectTypePlaceholder(
			ENativeDataTypeType newEByteObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEByteObjectTypePlaceholder = eByteObjectTypePlaceholder;
		eByteObjectTypePlaceholder = newEByteObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER,
					oldEByteObjectTypePlaceholder,
					newEByteObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEByteObjectTypePlaceholder <em>EByte Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EByte Object Type Placeholder</em>' containment reference.
	 * @see #getEByteObjectTypePlaceholder()
	 * @generated
	 */
	public void setEByteObjectTypePlaceholder(
			ENativeDataTypeType newEByteObjectTypePlaceholder) {
		if (newEByteObjectTypePlaceholder != eByteObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eByteObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eByteObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEByteObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEByteObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEByteObjectTypePlaceholder(
					newEByteObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER,
					newEByteObjectTypePlaceholder,
					newEByteObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>ECharacter Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECharacter Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECharacter Object Type Placeholder</em>' containment reference.
	 * @see #setECharacterObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ECharacterObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getECharacterObjectTypePlaceholder() {
		return eCharacterObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECharacterObjectTypePlaceholder(
			ENativeDataTypeType newECharacterObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldECharacterObjectTypePlaceholder = eCharacterObjectTypePlaceholder;
		eCharacterObjectTypePlaceholder = newECharacterObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER,
					oldECharacterObjectTypePlaceholder,
					newECharacterObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getECharacterObjectTypePlaceholder <em>ECharacter Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECharacter Object Type Placeholder</em>' containment reference.
	 * @see #getECharacterObjectTypePlaceholder()
	 * @generated
	 */
	public void setECharacterObjectTypePlaceholder(
			ENativeDataTypeType newECharacterObjectTypePlaceholder) {
		if (newECharacterObjectTypePlaceholder != eCharacterObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eCharacterObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eCharacterObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newECharacterObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newECharacterObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetECharacterObjectTypePlaceholder(
					newECharacterObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER,
					newECharacterObjectTypePlaceholder,
					newECharacterObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EDouble Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDouble Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDouble Object Type Placeholder</em>' containment reference.
	 * @see #setEDoubleObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EDoubleObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEDoubleObjectTypePlaceholder() {
		return eDoubleObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDoubleObjectTypePlaceholder(
			ENativeDataTypeType newEDoubleObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEDoubleObjectTypePlaceholder = eDoubleObjectTypePlaceholder;
		eDoubleObjectTypePlaceholder = newEDoubleObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER,
					oldEDoubleObjectTypePlaceholder,
					newEDoubleObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEDoubleObjectTypePlaceholder <em>EDouble Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDouble Object Type Placeholder</em>' containment reference.
	 * @see #getEDoubleObjectTypePlaceholder()
	 * @generated
	 */
	public void setEDoubleObjectTypePlaceholder(
			ENativeDataTypeType newEDoubleObjectTypePlaceholder) {
		if (newEDoubleObjectTypePlaceholder != eDoubleObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eDoubleObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eDoubleObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEDoubleObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEDoubleObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEDoubleObjectTypePlaceholder(
					newEDoubleObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER,
					newEDoubleObjectTypePlaceholder,
					newEDoubleObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EFloat Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFloat Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFloat Object Type Placeholder</em>' containment reference.
	 * @see #setEFloatObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EFloatObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEFloatObjectTypePlaceholder() {
		return eFloatObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFloatObjectTypePlaceholder(
			ENativeDataTypeType newEFloatObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEFloatObjectTypePlaceholder = eFloatObjectTypePlaceholder;
		eFloatObjectTypePlaceholder = newEFloatObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER,
					oldEFloatObjectTypePlaceholder,
					newEFloatObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEFloatObjectTypePlaceholder <em>EFloat Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFloat Object Type Placeholder</em>' containment reference.
	 * @see #getEFloatObjectTypePlaceholder()
	 * @generated
	 */
	public void setEFloatObjectTypePlaceholder(
			ENativeDataTypeType newEFloatObjectTypePlaceholder) {
		if (newEFloatObjectTypePlaceholder != eFloatObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eFloatObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eFloatObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEFloatObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEFloatObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEFloatObjectTypePlaceholder(
					newEFloatObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER,
					newEFloatObjectTypePlaceholder,
					newEFloatObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EInteger Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EInteger Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInteger Object Type Placeholder</em>' containment reference.
	 * @see #setEIntegerObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EIntegerObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEIntegerObjectTypePlaceholder() {
		return eIntegerObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIntegerObjectTypePlaceholder(
			ENativeDataTypeType newEIntegerObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEIntegerObjectTypePlaceholder = eIntegerObjectTypePlaceholder;
		eIntegerObjectTypePlaceholder = newEIntegerObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER,
					oldEIntegerObjectTypePlaceholder,
					newEIntegerObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEIntegerObjectTypePlaceholder <em>EInteger Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EInteger Object Type Placeholder</em>' containment reference.
	 * @see #getEIntegerObjectTypePlaceholder()
	 * @generated
	 */
	public void setEIntegerObjectTypePlaceholder(
			ENativeDataTypeType newEIntegerObjectTypePlaceholder) {
		if (newEIntegerObjectTypePlaceholder != eIntegerObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eIntegerObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eIntegerObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEIntegerObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEIntegerObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEIntegerObjectTypePlaceholder(
					newEIntegerObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER,
					newEIntegerObjectTypePlaceholder,
					newEIntegerObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>ELong Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELong Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELong Object Type Placeholder</em>' containment reference.
	 * @see #setELongObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ELongObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getELongObjectTypePlaceholder() {
		return eLongObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELongObjectTypePlaceholder(
			ENativeDataTypeType newELongObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldELongObjectTypePlaceholder = eLongObjectTypePlaceholder;
		eLongObjectTypePlaceholder = newELongObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER,
					oldELongObjectTypePlaceholder,
					newELongObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getELongObjectTypePlaceholder <em>ELong Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELong Object Type Placeholder</em>' containment reference.
	 * @see #getELongObjectTypePlaceholder()
	 * @generated
	 */
	public void setELongObjectTypePlaceholder(
			ENativeDataTypeType newELongObjectTypePlaceholder) {
		if (newELongObjectTypePlaceholder != eLongObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eLongObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eLongObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newELongObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newELongObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetELongObjectTypePlaceholder(
					newELongObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER,
					newELongObjectTypePlaceholder,
					newELongObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EShort Object Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EShort Object Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EShort Object Type Placeholder</em>' containment reference.
	 * @see #setEShortObjectTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EShortObjectTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEShortObjectTypePlaceholder() {
		return eShortObjectTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEShortObjectTypePlaceholder(
			ENativeDataTypeType newEShortObjectTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEShortObjectTypePlaceholder = eShortObjectTypePlaceholder;
		eShortObjectTypePlaceholder = newEShortObjectTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER,
					oldEShortObjectTypePlaceholder,
					newEShortObjectTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEShortObjectTypePlaceholder <em>EShort Object Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EShort Object Type Placeholder</em>' containment reference.
	 * @see #getEShortObjectTypePlaceholder()
	 * @generated
	 */
	public void setEShortObjectTypePlaceholder(
			ENativeDataTypeType newEShortObjectTypePlaceholder) {
		if (newEShortObjectTypePlaceholder != eShortObjectTypePlaceholder) {
			NotificationChain msgs = null;
			if (eShortObjectTypePlaceholder != null)
				msgs = ((InternalEObject) eShortObjectTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEShortObjectTypePlaceholder != null)
				msgs = ((InternalEObject) newEShortObjectTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEShortObjectTypePlaceholder(
					newEShortObjectTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER,
					newEShortObjectTypePlaceholder,
					newEShortObjectTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EByte Array Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EByte Array Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EByte Array Type Placeholder</em>' containment reference.
	 * @see #setEByteArrayTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EByteArrayTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEByteArrayTypePlaceholder() {
		return eByteArrayTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEByteArrayTypePlaceholder(
			ENativeDataTypeType newEByteArrayTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEByteArrayTypePlaceholder = eByteArrayTypePlaceholder;
		eByteArrayTypePlaceholder = newEByteArrayTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER,
					oldEByteArrayTypePlaceholder, newEByteArrayTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEByteArrayTypePlaceholder <em>EByte Array Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EByte Array Type Placeholder</em>' containment reference.
	 * @see #getEByteArrayTypePlaceholder()
	 * @generated
	 */
	public void setEByteArrayTypePlaceholder(
			ENativeDataTypeType newEByteArrayTypePlaceholder) {
		if (newEByteArrayTypePlaceholder != eByteArrayTypePlaceholder) {
			NotificationChain msgs = null;
			if (eByteArrayTypePlaceholder != null)
				msgs = ((InternalEObject) eByteArrayTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEByteArrayTypePlaceholder != null)
				msgs = ((InternalEObject) newEByteArrayTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEByteArrayTypePlaceholder(
					newEByteArrayTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER,
					newEByteArrayTypePlaceholder, newEByteArrayTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EDate Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDate Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDate Type Placeholder</em>' containment reference.
	 * @see #setEDateTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EDateTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEDateTypePlaceholder() {
		return eDateTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDateTypePlaceholder(
			ENativeDataTypeType newEDateTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEDateTypePlaceholder = eDateTypePlaceholder;
		eDateTypePlaceholder = newEDateTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER,
					oldEDateTypePlaceholder, newEDateTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEDateTypePlaceholder <em>EDate Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDate Type Placeholder</em>' containment reference.
	 * @see #getEDateTypePlaceholder()
	 * @generated
	 */
	public void setEDateTypePlaceholder(
			ENativeDataTypeType newEDateTypePlaceholder) {
		if (newEDateTypePlaceholder != eDateTypePlaceholder) {
			NotificationChain msgs = null;
			if (eDateTypePlaceholder != null)
				msgs = ((InternalEObject) eDateTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEDateTypePlaceholder != null)
				msgs = ((InternalEObject) newEDateTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEDateTypePlaceholder(newEDateTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER,
					newEDateTypePlaceholder, newEDateTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EBig Integer Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBig Integer Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBig Integer Type Placeholder</em>' containment reference.
	 * @see #setEBigIntegerTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EBigIntegerTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEBigIntegerTypePlaceholder() {
		return eBigIntegerTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBigIntegerTypePlaceholder(
			ENativeDataTypeType newEBigIntegerTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEBigIntegerTypePlaceholder = eBigIntegerTypePlaceholder;
		eBigIntegerTypePlaceholder = newEBigIntegerTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER,
					oldEBigIntegerTypePlaceholder,
					newEBigIntegerTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEBigIntegerTypePlaceholder <em>EBig Integer Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBig Integer Type Placeholder</em>' containment reference.
	 * @see #getEBigIntegerTypePlaceholder()
	 * @generated
	 */
	public void setEBigIntegerTypePlaceholder(
			ENativeDataTypeType newEBigIntegerTypePlaceholder) {
		if (newEBigIntegerTypePlaceholder != eBigIntegerTypePlaceholder) {
			NotificationChain msgs = null;
			if (eBigIntegerTypePlaceholder != null)
				msgs = ((InternalEObject) eBigIntegerTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEBigIntegerTypePlaceholder != null)
				msgs = ((InternalEObject) newEBigIntegerTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEBigIntegerTypePlaceholder(
					newEBigIntegerTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER,
					newEBigIntegerTypePlaceholder,
					newEBigIntegerTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EBig Decimal Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBig Decimal Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBig Decimal Type Placeholder</em>' containment reference.
	 * @see #setEBigDecimalTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EBigDecimalTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEBigDecimalTypePlaceholder() {
		return eBigDecimalTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBigDecimalTypePlaceholder(
			ENativeDataTypeType newEBigDecimalTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEBigDecimalTypePlaceholder = eBigDecimalTypePlaceholder;
		eBigDecimalTypePlaceholder = newEBigDecimalTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER,
					oldEBigDecimalTypePlaceholder,
					newEBigDecimalTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEBigDecimalTypePlaceholder <em>EBig Decimal Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBig Decimal Type Placeholder</em>' containment reference.
	 * @see #getEBigDecimalTypePlaceholder()
	 * @generated
	 */
	public void setEBigDecimalTypePlaceholder(
			ENativeDataTypeType newEBigDecimalTypePlaceholder) {
		if (newEBigDecimalTypePlaceholder != eBigDecimalTypePlaceholder) {
			NotificationChain msgs = null;
			if (eBigDecimalTypePlaceholder != null)
				msgs = ((InternalEObject) eBigDecimalTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEBigDecimalTypePlaceholder != null)
				msgs = ((InternalEObject) newEBigDecimalTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEBigDecimalTypePlaceholder(
					newEBigDecimalTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER,
					newEBigDecimalTypePlaceholder,
					newEBigDecimalTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EResource Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EResource Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EResource Type Placeholder</em>' containment reference.
	 * @see #setEResourceTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EResourceTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEResourceTypePlaceholder() {
		return eResourceTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEResourceTypePlaceholder(
			ENativeDataTypeType newEResourceTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEResourceTypePlaceholder = eResourceTypePlaceholder;
		eResourceTypePlaceholder = newEResourceTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER,
					oldEResourceTypePlaceholder, newEResourceTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEResourceTypePlaceholder <em>EResource Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EResource Type Placeholder</em>' containment reference.
	 * @see #getEResourceTypePlaceholder()
	 * @generated
	 */
	public void setEResourceTypePlaceholder(
			ENativeDataTypeType newEResourceTypePlaceholder) {
		if (newEResourceTypePlaceholder != eResourceTypePlaceholder) {
			NotificationChain msgs = null;
			if (eResourceTypePlaceholder != null)
				msgs = ((InternalEObject) eResourceTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEResourceTypePlaceholder != null)
				msgs = ((InternalEObject) newEResourceTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEResourceTypePlaceholder(
					newEResourceTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER,
					newEResourceTypePlaceholder, newEResourceTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EResource Set Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EResource Set Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EResource Set Type Placeholder</em>' containment reference.
	 * @see #setEResourceSetTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EResourceSetTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEResourceSetTypePlaceholder() {
		return eResourceSetTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEResourceSetTypePlaceholder(
			ENativeDataTypeType newEResourceSetTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEResourceSetTypePlaceholder = eResourceSetTypePlaceholder;
		eResourceSetTypePlaceholder = newEResourceSetTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER,
					oldEResourceSetTypePlaceholder,
					newEResourceSetTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEResourceSetTypePlaceholder <em>EResource Set Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EResource Set Type Placeholder</em>' containment reference.
	 * @see #getEResourceSetTypePlaceholder()
	 * @generated
	 */
	public void setEResourceSetTypePlaceholder(
			ENativeDataTypeType newEResourceSetTypePlaceholder) {
		if (newEResourceSetTypePlaceholder != eResourceSetTypePlaceholder) {
			NotificationChain msgs = null;
			if (eResourceSetTypePlaceholder != null)
				msgs = ((InternalEObject) eResourceSetTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEResourceSetTypePlaceholder != null)
				msgs = ((InternalEObject) newEResourceSetTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEResourceSetTypePlaceholder(
					newEResourceSetTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER,
					newEResourceSetTypePlaceholder,
					newEResourceSetTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EFeature Map Entry Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFeature Map Entry Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFeature Map Entry Type Placeholder</em>' containment reference.
	 * @see #setEFeatureMapEntryTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EFeatureMapEntryTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEFeatureMapEntryTypePlaceholder() {
		return eFeatureMapEntryTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFeatureMapEntryTypePlaceholder(
			ENativeDataTypeType newEFeatureMapEntryTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEFeatureMapEntryTypePlaceholder = eFeatureMapEntryTypePlaceholder;
		eFeatureMapEntryTypePlaceholder = newEFeatureMapEntryTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER,
					oldEFeatureMapEntryTypePlaceholder,
					newEFeatureMapEntryTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapEntryTypePlaceholder <em>EFeature Map Entry Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFeature Map Entry Type Placeholder</em>' containment reference.
	 * @see #getEFeatureMapEntryTypePlaceholder()
	 * @generated
	 */
	public void setEFeatureMapEntryTypePlaceholder(
			ENativeDataTypeType newEFeatureMapEntryTypePlaceholder) {
		if (newEFeatureMapEntryTypePlaceholder != eFeatureMapEntryTypePlaceholder) {
			NotificationChain msgs = null;
			if (eFeatureMapEntryTypePlaceholder != null)
				msgs = ((InternalEObject) eFeatureMapEntryTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEFeatureMapEntryTypePlaceholder != null)
				msgs = ((InternalEObject) newEFeatureMapEntryTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEFeatureMapEntryTypePlaceholder(
					newEFeatureMapEntryTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER,
					newEFeatureMapEntryTypePlaceholder,
					newEFeatureMapEntryTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EFeature Map Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFeature Map Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFeature Map Type Placeholder</em>' containment reference.
	 * @see #setEFeatureMapTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EFeatureMapTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEFeatureMapTypePlaceholder() {
		return eFeatureMapTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFeatureMapTypePlaceholder(
			ENativeDataTypeType newEFeatureMapTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEFeatureMapTypePlaceholder = eFeatureMapTypePlaceholder;
		eFeatureMapTypePlaceholder = newEFeatureMapTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER,
					oldEFeatureMapTypePlaceholder,
					newEFeatureMapTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEFeatureMapTypePlaceholder <em>EFeature Map Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFeature Map Type Placeholder</em>' containment reference.
	 * @see #getEFeatureMapTypePlaceholder()
	 * @generated
	 */
	public void setEFeatureMapTypePlaceholder(
			ENativeDataTypeType newEFeatureMapTypePlaceholder) {
		if (newEFeatureMapTypePlaceholder != eFeatureMapTypePlaceholder) {
			NotificationChain msgs = null;
			if (eFeatureMapTypePlaceholder != null)
				msgs = ((InternalEObject) eFeatureMapTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEFeatureMapTypePlaceholder != null)
				msgs = ((InternalEObject) newEFeatureMapTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEFeatureMapTypePlaceholder(
					newEFeatureMapTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER,
					newEFeatureMapTypePlaceholder,
					newEFeatureMapTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EEnumerator Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EEnumerator Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnumerator Type Placeholder</em>' containment reference.
	 * @see #setEEnumeratorTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EEnumeratorTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEEnumeratorTypePlaceholder() {
		return eEnumeratorTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEEnumeratorTypePlaceholder(
			ENativeDataTypeType newEEnumeratorTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEEnumeratorTypePlaceholder = eEnumeratorTypePlaceholder;
		eEnumeratorTypePlaceholder = newEEnumeratorTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER,
					oldEEnumeratorTypePlaceholder,
					newEEnumeratorTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEEnumeratorTypePlaceholder <em>EEnumerator Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnumerator Type Placeholder</em>' containment reference.
	 * @see #getEEnumeratorTypePlaceholder()
	 * @generated
	 */
	public void setEEnumeratorTypePlaceholder(
			ENativeDataTypeType newEEnumeratorTypePlaceholder) {
		if (newEEnumeratorTypePlaceholder != eEnumeratorTypePlaceholder) {
			NotificationChain msgs = null;
			if (eEnumeratorTypePlaceholder != null)
				msgs = ((InternalEObject) eEnumeratorTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEEnumeratorTypePlaceholder != null)
				msgs = ((InternalEObject) newEEnumeratorTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEEnumeratorTypePlaceholder(
					newEEnumeratorTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER,
					newEEnumeratorTypePlaceholder,
					newEEnumeratorTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EE List Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE List Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE List Type Placeholder</em>' containment reference.
	 * @see #setEEListTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EEListTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEEListTypePlaceholder() {
		return eEListTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEEListTypePlaceholder(
			ENativeDataTypeType newEEListTypePlaceholder, NotificationChain msgs) {
		ENativeDataTypeType oldEEListTypePlaceholder = eEListTypePlaceholder;
		eEListTypePlaceholder = newEEListTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER,
					oldEEListTypePlaceholder, newEEListTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEEListTypePlaceholder <em>EE List Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE List Type Placeholder</em>' containment reference.
	 * @see #getEEListTypePlaceholder()
	 * @generated
	 */
	public void setEEListTypePlaceholder(
			ENativeDataTypeType newEEListTypePlaceholder) {
		if (newEEListTypePlaceholder != eEListTypePlaceholder) {
			NotificationChain msgs = null;
			if (eEListTypePlaceholder != null)
				msgs = ((InternalEObject) eEListTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEEListTypePlaceholder != null)
				msgs = ((InternalEObject) newEEListTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEEListTypePlaceholder(newEEListTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER,
					newEEListTypePlaceholder, newEEListTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>EE Tree Iterator Type Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Tree Iterator Type Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Tree Iterator Type Placeholder</em>' containment reference.
	 * @see #setEETreeIteratorTypePlaceholder(ENativeDataTypeType)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_EETreeIteratorTypePlaceholder()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	public ENativeDataTypeType getEETreeIteratorTypePlaceholder() {
		return eETreeIteratorTypePlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEETreeIteratorTypePlaceholder(
			ENativeDataTypeType newEETreeIteratorTypePlaceholder,
			NotificationChain msgs) {
		ENativeDataTypeType oldEETreeIteratorTypePlaceholder = eETreeIteratorTypePlaceholder;
		eETreeIteratorTypePlaceholder = newEETreeIteratorTypePlaceholder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER,
					oldEETreeIteratorTypePlaceholder,
					newEETreeIteratorTypePlaceholder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getEETreeIteratorTypePlaceholder <em>EE Tree Iterator Type Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Tree Iterator Type Placeholder</em>' containment reference.
	 * @see #getEETreeIteratorTypePlaceholder()
	 * @generated
	 */
	public void setEETreeIteratorTypePlaceholder(
			ENativeDataTypeType newEETreeIteratorTypePlaceholder) {
		if (newEETreeIteratorTypePlaceholder != eETreeIteratorTypePlaceholder) {
			NotificationChain msgs = null;
			if (eETreeIteratorTypePlaceholder != null)
				msgs = ((InternalEObject) eETreeIteratorTypePlaceholder)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER,
								null, msgs);
			if (newEETreeIteratorTypePlaceholder != null)
				msgs = ((InternalEObject) newEETreeIteratorTypePlaceholder)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER,
								null, msgs);
			msgs = basicSetEETreeIteratorTypePlaceholder(
					newEETreeIteratorTypePlaceholder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER,
					newEETreeIteratorTypePlaceholder,
					newEETreeIteratorTypePlaceholder));
	}

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_BasePackage()
	 * @model required="true"
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE,
					oldBasePackage, basePackage));
	}

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_ModelName()
	 * @model required="true"
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME,
					oldModelName, modelName));
	}

	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see org.onceforall.metamodeller.MetaModellerPackage#getERootPackageType_CopyrightText()
	 * @model
	 * @generated
	 */
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * Sets the value of the '{@link org.onceforall.metamodeller.ERootPackageType#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT,
					oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
			return ((InternalEList) getECustomDataTypeTypes()).basicRemove(
					otherEnd, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
			return ((InternalEList) getMPrimitiveDataTypeTypes()).basicRemove(
					otherEnd, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
			return basicSetMObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
			return basicSetMStatefulObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
			return basicSetMApplicationTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
			return basicSetMStepTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
			return basicSetMScriptTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
			return basicSetMDirectoryTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
			return basicSetMExistingDirectoryTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
			return basicSetMFileTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
			return basicSetMExistingFileTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
			return basicSetMStateTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
			return basicSetMStepStateTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
			return basicSetMBooleanTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
			return basicSetMDateTimeTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
			return basicSetMDateTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
			return basicSetMTimeTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
			return basicSetMDurationTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
			return basicSetMLongTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
			return basicSetMPasswordTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
			return basicSetMStringTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
			return basicSetMUrlTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
			return basicSetEThrowableTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
			return basicSetEBooleanTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
			return basicSetEByteTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
			return basicSetECharTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
			return basicSetEDoubleTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
			return basicSetEFloatTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
			return basicSetEIntTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
			return basicSetELongTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
			return basicSetEShortTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
			return basicSetEStringTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEJavaObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
			return basicSetEJavaClassTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEBooleanObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEByteObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
			return basicSetECharacterObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEDoubleObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEFloatObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEIntegerObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
			return basicSetELongObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
			return basicSetEShortObjectTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
			return basicSetEByteArrayTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
			return basicSetEDateTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
			return basicSetEBigIntegerTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
			return basicSetEBigDecimalTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
			return basicSetEResourceTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
			return basicSetEResourceSetTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
			return basicSetEFeatureMapEntryTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
			return basicSetEFeatureMapTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
			return basicSetEEnumeratorTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
			return basicSetEEListTypePlaceholder(null, msgs);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
			return basicSetEETreeIteratorTypePlaceholder(null, msgs);
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
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
			return getECustomDataTypeTypes();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
			return getMPrimitiveDataTypeTypes();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
			return getMObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
			return getMStatefulObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
			return getMApplicationTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
			return getMStepTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
			return getMScriptTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
			return getMDirectoryTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
			return getMExistingDirectoryTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
			return getMFileTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
			return getMExistingFileTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
			return getMStateTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
			return getMStepStateTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
			return getMBooleanTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
			return getMDateTimeTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
			return getMDateTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
			return getMTimeTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
			return getMDurationTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
			return getMLongTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
			return getMPasswordTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
			return getMStringTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
			return getMUrlTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
			return getEThrowableTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
			return getEBooleanTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
			return getEByteTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
			return getECharTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
			return getEDoubleTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
			return getEFloatTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
			return getEIntTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
			return getELongTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
			return getEShortTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
			return getEStringTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
			return getEJavaObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
			return getEJavaClassTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
			return getEBooleanObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
			return getEByteObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
			return getECharacterObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
			return getEDoubleObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
			return getEFloatObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
			return getEIntegerObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
			return getELongObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
			return getEShortObjectTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
			return getEByteArrayTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
			return getEDateTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
			return getEBigIntegerTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
			return getEBigDecimalTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
			return getEResourceTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
			return getEResourceSetTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
			return getEFeatureMapEntryTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
			return getEFeatureMapTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
			return getEEnumeratorTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
			return getEEListTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
			return getEETreeIteratorTypePlaceholder();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE:
			return getBasePackage();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME:
			return getModelName();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT:
			return getCopyrightText();
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
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
			getECustomDataTypeTypes().clear();
			getECustomDataTypeTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
			getMPrimitiveDataTypeTypes().clear();
			getMPrimitiveDataTypeTypes().addAll((Collection) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
			setMObjectTypePlaceholder((MObjectType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
			setMStatefulObjectTypePlaceholder((MObjectType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
			setMApplicationTypePlaceholder((MApplicationType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
			setMStepTypePlaceholder((MStepType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
			setMScriptTypePlaceholder((MObjectType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
			setMDirectoryTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
			setMExistingDirectoryTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
			setMFileTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
			setMExistingFileTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
			setMStateTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
			setMStepStateTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
			setMBooleanTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
			setMDateTimeTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
			setMDateTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
			setMTimeTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
			setMDurationTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
			setMLongTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
			setMPasswordTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
			setMStringTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
			setMUrlTypePlaceholder((MPrimitiveDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
			setEThrowableTypePlaceholder((ECustomDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
			setEBooleanTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
			setEByteTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
			setECharTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
			setEDoubleTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
			setEFloatTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
			setEIntTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
			setELongTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
			setEShortTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
			setEStringTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
			setEJavaObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
			setEJavaClassTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
			setEBooleanObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
			setEByteObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
			setECharacterObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
			setEDoubleObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
			setEFloatObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
			setEIntegerObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
			setELongObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
			setEShortObjectTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
			setEByteArrayTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
			setEDateTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
			setEBigIntegerTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
			setEBigDecimalTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
			setEResourceTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
			setEResourceSetTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
			setEFeatureMapEntryTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
			setEFeatureMapTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
			setEEnumeratorTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
			setEEListTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
			setEETreeIteratorTypePlaceholder((ENativeDataTypeType) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE:
			setBasePackage((String) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME:
			setModelName((String) newValue);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT:
			setCopyrightText((String) newValue);
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
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
			getECustomDataTypeTypes().clear();
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
			getMPrimitiveDataTypeTypes().clear();
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
			setMObjectTypePlaceholder((MObjectType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
			setMStatefulObjectTypePlaceholder((MObjectType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
			setMApplicationTypePlaceholder((MApplicationType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
			setMStepTypePlaceholder((MStepType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
			setMScriptTypePlaceholder((MObjectType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
			setMDirectoryTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
			setMExistingDirectoryTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
			setMFileTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
			setMExistingFileTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
			setMStateTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
			setMStepStateTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
			setMBooleanTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
			setMDateTimeTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
			setMDateTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
			setMTimeTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
			setMDurationTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
			setMLongTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
			setMPasswordTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
			setMStringTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
			setMUrlTypePlaceholder((MPrimitiveDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
			setEThrowableTypePlaceholder((ECustomDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
			setEBooleanTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
			setEByteTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
			setECharTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
			setEDoubleTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
			setEFloatTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
			setEIntTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
			setELongTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
			setEShortTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
			setEStringTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
			setEJavaObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
			setEJavaClassTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
			setEBooleanObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
			setEByteObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
			setECharacterObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
			setEDoubleObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
			setEFloatObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
			setEIntegerObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
			setELongObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
			setEShortObjectTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
			setEByteArrayTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
			setEDateTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
			setEBigIntegerTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
			setEBigDecimalTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
			setEResourceTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
			setEResourceSetTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
			setEFeatureMapEntryTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
			setEFeatureMapTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
			setEEnumeratorTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
			setEEListTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
			setEETreeIteratorTypePlaceholder((ENativeDataTypeType) null);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE:
			setBasePackage(BASE_PACKAGE_EDEFAULT);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME:
			setModelName(MODEL_NAME_EDEFAULT);
			return;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT:
			setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
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
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECUSTOM_DATA_TYPE_TYPES:
			return eCustomDataTypeTypes != null
					&& !eCustomDataTypeTypes.isEmpty();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPRIMITIVE_DATA_TYPE_TYPES:
			return mPrimitiveDataTypeTypes != null
					&& !mPrimitiveDataTypeTypes.isEmpty();
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MOBJECT_TYPE_PLACEHOLDER:
			return mObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATEFUL_OBJECT_TYPE_PLACEHOLDER:
			return mStatefulObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MAPPLICATION_TYPE_PLACEHOLDER:
			return mApplicationTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_TYPE_PLACEHOLDER:
			return mStepTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSCRIPT_TYPE_PLACEHOLDER:
			return mScriptTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDIRECTORY_TYPE_PLACEHOLDER:
			return mDirectoryTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_DIRECTORY_TYPE_PLACEHOLDER:
			return mExistingDirectoryTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MFILE_TYPE_PLACEHOLDER:
			return mFileTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MEXISTING_FILE_TYPE_PLACEHOLDER:
			return mExistingFileTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTATE_TYPE_PLACEHOLDER:
			return mStateTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTEP_STATE_TYPE_PLACEHOLDER:
			return mStepStateTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MBOOLEAN_TYPE_PLACEHOLDER:
			return mBooleanTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TIME_TYPE_PLACEHOLDER:
			return mDateTimeTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDATE_TYPE_PLACEHOLDER:
			return mDateTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MTIME_TYPE_PLACEHOLDER:
			return mTimeTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MDURATION_TYPE_PLACEHOLDER:
			return mDurationTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MLONG_TYPE_PLACEHOLDER:
			return mLongTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MPASSWORD_TYPE_PLACEHOLDER:
			return mPasswordTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MSTRING_TYPE_PLACEHOLDER:
			return mStringTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MURL_TYPE_PLACEHOLDER:
			return mUrlTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ETHROWABLE_TYPE_PLACEHOLDER:
			return eThrowableTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_TYPE_PLACEHOLDER:
			return eBooleanTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_TYPE_PLACEHOLDER:
			return eByteTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHAR_TYPE_PLACEHOLDER:
			return eCharTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_TYPE_PLACEHOLDER:
			return eDoubleTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_TYPE_PLACEHOLDER:
			return eFloatTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINT_TYPE_PLACEHOLDER:
			return eIntTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_TYPE_PLACEHOLDER:
			return eLongTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_TYPE_PLACEHOLDER:
			return eShortTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESTRING_TYPE_PLACEHOLDER:
			return eStringTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_OBJECT_TYPE_PLACEHOLDER:
			return eJavaObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EJAVA_CLASS_TYPE_PLACEHOLDER:
			return eJavaClassTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBOOLEAN_OBJECT_TYPE_PLACEHOLDER:
			return eBooleanObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_OBJECT_TYPE_PLACEHOLDER:
			return eByteObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ECHARACTER_OBJECT_TYPE_PLACEHOLDER:
			return eCharacterObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDOUBLE_OBJECT_TYPE_PLACEHOLDER:
			return eDoubleObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFLOAT_OBJECT_TYPE_PLACEHOLDER:
			return eFloatObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EINTEGER_OBJECT_TYPE_PLACEHOLDER:
			return eIntegerObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ELONG_OBJECT_TYPE_PLACEHOLDER:
			return eLongObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ESHORT_OBJECT_TYPE_PLACEHOLDER:
			return eShortObjectTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBYTE_ARRAY_TYPE_PLACEHOLDER:
			return eByteArrayTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EDATE_TYPE_PLACEHOLDER:
			return eDateTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_INTEGER_TYPE_PLACEHOLDER:
			return eBigIntegerTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EBIG_DECIMAL_TYPE_PLACEHOLDER:
			return eBigDecimalTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_TYPE_PLACEHOLDER:
			return eResourceTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__ERESOURCE_SET_TYPE_PLACEHOLDER:
			return eResourceSetTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_ENTRY_TYPE_PLACEHOLDER:
			return eFeatureMapEntryTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EFEATURE_MAP_TYPE_PLACEHOLDER:
			return eFeatureMapTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EENUMERATOR_TYPE_PLACEHOLDER:
			return eEnumeratorTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_LIST_TYPE_PLACEHOLDER:
			return eEListTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__EE_TREE_ITERATOR_TYPE_PLACEHOLDER:
			return eETreeIteratorTypePlaceholder != null;
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__BASE_PACKAGE:
			return BASE_PACKAGE_EDEFAULT == null ? basePackage != null
					: !BASE_PACKAGE_EDEFAULT.equals(basePackage);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__MODEL_NAME:
			return MODEL_NAME_EDEFAULT == null ? modelName != null
					: !MODEL_NAME_EDEFAULT.equals(modelName);
		case MetaModellerPackage.EROOT_PACKAGE_TYPE__COPYRIGHT_TEXT:
			return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null
					: !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(')');
		return result.toString();
	}

} // ERootPackageType