/*
 * Revision History:
 * $Log: GenModelGenerator.java,v $
 * Revision 1.1  2006/09/19 12:57:06  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:58:58  marc
 * Added initial revision.
 *
 */
package org.onceforall.metamodeller.generator;

import java.util.Collections;
import java.io.IOException;
import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;

import java.util.*;
import org.onceforall.metamodeller.*;
import org.eclipse.emf.ecore.*;

/**
 * Defines a class that generates an Ecore model from an Ecore meta model.
 */
public class GenModelGenerator { 
  protected static String nl;
  public static synchronized GenModelGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    GenModelGenerator result = new GenModelGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
  protected final String TEXT_2 = NL + "       <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_3 = "#";
  protected final String TEXT_4 = "\"/>";
  protected final String TEXT_5 = NL + "       <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"";
  protected final String TEXT_6 = "ecore:EAttribute";
  protected final String TEXT_7 = "ecore:EReference";
  protected final String TEXT_8 = " core.ecore#";
  protected final String TEXT_9 = "/";
  protected final String TEXT_10 = "\"/>";
  protected final String TEXT_11 = NL + "       <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"";
  protected final String TEXT_12 = "ecore:EAttribute";
  protected final String TEXT_13 = "ecore:EReference";
  protected final String TEXT_14 = " core.ecore#";
  protected final String TEXT_15 = "/";
  protected final String TEXT_16 = "\"/>";
  protected final String TEXT_17 = NL + "<genmodel:GenModel xmi:version=\"2.0\"" + NL + "    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\"" + NL + "    xmlns:genmodel=\"http://www.eclipse.org/emf/2002/GenModel\" ";
  protected final String TEXT_18 = "copyrightText=\"";
  protected final String TEXT_19 = "\"";
  protected final String TEXT_20 = NL + "    modelDirectory=\"/";
  protected final String TEXT_21 = "/src\" editDirectory=\"/";
  protected final String TEXT_22 = ".edit/src\"" + NL + "    modelPluginID=\"";
  protected final String TEXT_23 = "\" templateDirectory=\"/";
  protected final String TEXT_24 = "/templates\"" + NL + "    dynamicTemplates=\"true\" redirection=\"\" modelName=\"";
  protected final String TEXT_25 = "\" modelPluginClass=\"\"" + NL + "    rootExtendsInterface=\"org.onceforall.dms.desktop.notify.ThreadAdapter\" rootImplementsInterface=\"\"" + NL + "    suppressInterfaces=\"true\" featureMapWrapperInterface=\"\" featureMapWrapperInternalInterface=\"\"" + NL + "    featureMapWrapperClass=\"\" richClientPlatform=\"true\" testsDirectory=\"\" testSuiteClass=\"\"" + NL + "    booleanFlagsField=\"\" importerID=\"org.eclipse.emf.importer.ecore\">" + NL + "  <foreignModel>";
  protected final String TEXT_26 = "</foreignModel>" + NL + "  <genPackages prefix=\"";
  protected final String TEXT_27 = "\" basePackage=\"";
  protected final String TEXT_28 = "\" resource=\"XMI\"" + NL + "      disposableProviderFactory=\"true\" utilityPackageSuffix=\"\" multipleEditorPages=\"false\"" + NL + "      ecorePackage=\"";
  protected final String TEXT_29 = "#/\">" + NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_30 = "#//MObject\">" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_31 = "#//MObject/mNameProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_32 = "#//MObject/mDescriptionProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_33 = "#//MObject/mIconFilePathProperty\"/>" + NL + "      <genFeatures property=\"None\" notify=\"false\" createChild=\"false\" propertyCategory=\"\"" + NL + "          propertySortChoices=\"true\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_34 = "#//MObject/mProperties\"/>" + NL + "    </genClasses>" + NL + "    <genClasses image=\"false\" ecoreClass=\"";
  protected final String TEXT_35 = "#//MElement\">" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_36 = "#//MElement/name\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_37 = "#//MElement/typeName\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_38 = "#//MElement/typeNameForUI\"/>" + NL + "      <genFeatures property=\"None\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_39 = "#//MElement/nameForUI\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_40 = "#//MElement/description\"/>" + NL + "      <genFeatures property=\"None\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_41 = "#//MElement/descriptionForUI\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_42 = "#//MElement/iconFilePath\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_43 = "#//MElement/overlayIconFilePath\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_44 = "#//MElement/compositeClassName\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_45 = "#//MElement/simulated\"/>" + NL + "    </genClasses>" + NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_46 = "#//MParameter\"/>" + NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_47 = "#//MProperty\"/>" + NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_48 = "#//MResult\"/>" + NL + "    <genClasses image=\"false\" ecoreClass=\"";
  protected final String TEXT_49 = "#//MStatefulObject\">" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_50 = "#//MStatefulObject/mStateProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_51 = "#//MStatefulObject/mLastStateChangeProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_52 = "#//MStatefulObject/lastStateChangeProperty\"/>" + NL + "    </genClasses>" + NL + "    <genClasses image=\"false\" ecoreClass=\"";
  protected final String TEXT_53 = "#//MStep\">" + NL + "      <genFeatures notify=\"false\" children=\"true\" createChild=\"true\" propertySortChoices=\"true\"" + NL + "          ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_54 = "#//MStep/mInputSteps\"/>" + NL + "      <genFeatures property=\"None\" notify=\"false\" createChild=\"false\" propertySortChoices=\"true\"" + NL + "          ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_55 = "#//MStep/mParameters\"/>" + NL + "      <genFeatures property=\"None\" notify=\"false\" createChild=\"false\" propertySortChoices=\"true\"" + NL + "          ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_56 = "#//MStep/mResults\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_57 = "#//MStep/stateProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_58 = "#//MStep/mProgressProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_59 = "#//MStep/progressProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_60 = "#//MStep/mProgressStatusProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_61 = "#//MStep/progressStatusProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_62 = "#//MStep/mStartTriggerProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_63 = "#//MStep/startTriggerProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_64 = "#//MStep/interruptable\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_65 = "#//MStep/stoppable\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_66 = "#//MStep/terminatable\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_67 = "#//MStep/actionName\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_68 = "#//MStep/exception\"/>" + NL + "    </genClasses>" + NL + "    <genClasses image=\"false\" ecoreClass=\"";
  protected final String TEXT_69 = "#//MValue\">" + NL + "      <genFeatures notify=\"false\" children=\"true\" createChild=\"true\" propertySortChoices=\"true\"" + NL + "          ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_70 = "#//MValue/mInputValues\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_71 = "#//MValue/valueForUI\"/>" + NL + "      <genFeatures property=\"None\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_72 = "#//MValue/value\"/>" + NL + "      <genFeatures property=\"None\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_73 = "#//MValue/historicValues\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_74 = "#//MValue/historicValuesForUI\"/>" + NL + "      <genFeatures createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_75 = "#//MValue/readOnly\"/>" + NL + "    </genClasses>" + NL + "    <genClasses image=\"false\" ecoreClass=\"";
  protected final String TEXT_76 = "#//MApplication\">" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_77 = "#//MApplication/mDataFileProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_78 = "#//MApplication/dataFileProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_79 = "#//MApplication/dataFilePropertyHistoricValues\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_80 = "#//MApplication/mLogFileProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_81 = "#//MApplication/logFileProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_82 = "#//MApplication/mPathProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_83 = "#//MApplication/pathProperty\"/>" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"false\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_84 = "#//MApplication/mVersionProperty\"/>" + NL + "      <genFeatures property=\"Readonly\" createChild=\"false\" propertyCategory=\"\" ecoreFeature=\"ecore:EAttribute ";
  protected final String TEXT_85 = "#//MApplication/versionProperty\"/>" + NL + "    </genClasses>" + NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_86 = "#//MScript\">" + NL + "      <genFeatures property=\"None\" children=\"true\" createChild=\"true\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_87 = "#//MScript/mSteps\"/>" + NL + "    </genClasses>";
  protected final String TEXT_88 = NL + "    <genDataTypes ecoreDataType=\"";
  protected final String TEXT_89 = "#";
  protected final String TEXT_90 = "\"/>";
  protected final String TEXT_91 = NL + "    <genDataTypes ecoreDataType=\"";
  protected final String TEXT_92 = "#";
  protected final String TEXT_93 = "\"/>";
  protected final String TEXT_94 = NL + "    <genDataTypes ecoreDataType=\"";
  protected final String TEXT_95 = "#";
  protected final String TEXT_96 = "\"/>";
  protected final String TEXT_97 = NL + "    <genDataTypes ecoreDataType=\"";
  protected final String TEXT_98 = "#";
  protected final String TEXT_99 = "\"/>";
  protected final String TEXT_100 = NL + "    <genClasses ecoreClass=\"";
  protected final String TEXT_101 = "#";
  protected final String TEXT_102 = "\">";
  protected final String TEXT_103 = NL + "       <genFeatures property=\"None\" createChild=\"true\" children=\"true\" ecoreFeature=\"ecore:EReference ";
  protected final String TEXT_104 = "#";
  protected final String TEXT_105 = "\"/>";
  protected final String TEXT_106 = NL + "    </genClasses>";
  protected final String TEXT_107 = NL + "  </genPackages>" + NL + "</genmodel:GenModel>";
  protected final String TEXT_108 = NL;
  protected final String TEXT_109 = NL + "      ";

	/** Specifies the root of the Ecore meta model that the model generator uses. */
	protected ERootPackageType modelRoot;

	/** Specifies the path of the Ecore file to generate the Ecore model and the Generation model from. */
	protected File ecoreFile;

	/** Specifies the path of the Ecore file to be generated. */
	protected File generatedEcoreFile;
	
	/**
	 * Gets the root of the Ecore meta model to use a the input for the model generator.
	 *
	 * @return Returns the root of the Ecore meta model.
	 * @throws IOException Thrown if the generator model file cannot be loaded.
	 */
	 public ERootPackageType getModelRoot() throws IOException {
		// TODO: Find a way to only reload model when necessary. The problem with naive caching is that changes to the meta model are not reflected when validating.
		//?if(modelRoot == null) {
			ResourceSet resourceSet = new ResourceSetImpl();

			// Registers the default resource factory.
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

			// Gets the URI of the model file.
			URI fileURI = URI.createFileURI(ecoreFile.getAbsolutePath());
                
			// Creates a resource for this file.
			Resource resource = resourceSet.createResource(fileURI);
        
			// Registers the model package.
			@SuppressWarnings("unused")
			MetaModellerPackage modelPackage = MetaModellerPackage.eINSTANCE;
   
			resource.load(Collections.EMPTY_MAP);
			modelRoot = (ERootPackageType) resource.getContents().get(0);
		//?}
	 	
	 	return modelRoot;
	}

	/**
	 * Gets the path of the Ecore file to generate the Ecore model and the Generation model from.
	 * 
	 * @return Returns the path of the Ecore file to generate the Ecore model and the Generation model from.
	 */
	public File getEcoreFile() {
		return ecoreFile;
	}

	/**
	 * Sets the path of the Ecore file to generate the Ecore model and the Generation model from.
	 *
	 * @param ecoreFile Specifies the path of the Ecore file to generate the Ecore model and the Generation model from.
	 */
	public void setEcoreFile(File ecoreFile) {
		this.ecoreFile = ecoreFile;
	}	

	/**
	 * Gets the path of the Ecore file to be generated.
	 * 
	 * @return Returns the path of the Ecore file to be generated.
	 */
	public File getGeneratedEcoreFile() {
		return generatedEcoreFile;
	}

	/**
	 * Sets the path of the Ecore file to be generated.
	 *
	 * @param generatedEcoreFile Specifies the path of the Ecore file to be generated.
	 */
	public void setGeneratedEcoreFile(File generatedEcoreFile) {
		this.generatedEcoreFile = generatedEcoreFile;
	}	
	 	
	/**
	 * Generate the Ecore model. Before this method can be executed,
	 * the {@link #setEcoreFile(java.io.File) model} has to be set.
	 *
	 * @return Returns the generated Ecore model as Ecore XML.
	 * @throws IOException Thrown if the generator model file cannot be loaded.
	 */
	public String generate(Object argument) throws IOException
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     class Utility {
   void addMValueTypeReferences(List<MValueType> mValueTypes) {
     for(MValueType mValueType: mValueTypes) {
       if(mValueType.isGenerateMValueReference()) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(mValueType.getEcoreXPath());
    stringBuffer.append(TEXT_4);
         } 
         if(mValueType.isGenerateValueFeature()) {
    stringBuffer.append(TEXT_5);
    if(mValueType.getValueType() instanceof MPrimitiveDataTypeType) {
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    stringBuffer.append(((EObjectType) mValueType.eContainer()).getEcoreXPath());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(mValueType.getFeatureName());
    stringBuffer.append(TEXT_10);
         if(mValueType.getHistoricValuesUpperBound() > 0) { 
    stringBuffer.append(TEXT_11);
    if(mValueType.getValueType() instanceof MPrimitiveDataTypeType) {
    stringBuffer.append(TEXT_12);
    } else {
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(((EObjectType) mValueType.eContainer()).getEcoreXPath());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(mValueType.getHistoricFeatureName());
    stringBuffer.append(TEXT_16);
           }
       }
     }
   } 
 }

 final Utility UTILITY = new Utility();

 try { 
     ERootPackageType modelRoot = getModelRoot(); 
    stringBuffer.append(TEXT_17);
    if(modelRoot.getCopyrightText() != null) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append(modelRoot.getCopyrightText());
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    stringBuffer.append(modelRoot.getBasePackage());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(modelRoot.getBasePackage());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(modelRoot.getBasePackage());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(modelRoot.getBasePackage());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(modelRoot.getModelName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(modelRoot.getPrefix());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(modelRoot.getBasePackage());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_87);
     for (EReference eReference: (List<EReference>) modelRoot.eClass().getEAllReferences()) { 
     	if (eReference.getEType().getInstanceClass().isAssignableFrom(ECustomDataTypeType.class) && eReference.getUpperBound() == 1) { 
     		ECustomDataTypeType eCustomDataTypeType = (ECustomDataTypeType) modelRoot.eGet(eReference.getFeatureID(), false, false); 
    stringBuffer.append(TEXT_88);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(eCustomDataTypeType.getEcoreXPath());
    stringBuffer.append(TEXT_90);
     	} 
     	if (eReference.getEType().getInstanceClass().isAssignableFrom(MPrimitiveDataTypeType.class) && eReference.getUpperBound() == 1) { 
     		MPrimitiveDataTypeType mPrimitiveDataTypeType = (MPrimitiveDataTypeType) modelRoot.eGet(eReference.getFeatureID(), false, false); 
    stringBuffer.append(TEXT_91);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(mPrimitiveDataTypeType.getEcoreXPath());
    stringBuffer.append(TEXT_93);
     	} 
     } 
     for(ECustomDataTypeType eCustomDataTypeType: (List<ECustomDataTypeType>) modelRoot.getECustomDataTypeTypes()) { 
    stringBuffer.append(TEXT_94);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(eCustomDataTypeType.getEcoreXPath());
    stringBuffer.append(TEXT_96);
     } 
     for(MPrimitiveDataTypeType mPrimitiveDataTypeType: (List<MPrimitiveDataTypeType>) modelRoot.getMPrimitiveDataTypeTypes()) { 
    stringBuffer.append(TEXT_97);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(mPrimitiveDataTypeType.getEcoreXPath());
    stringBuffer.append(TEXT_99);
     	} 
     for(MObjectType mObjectType: (List<MObjectType>) modelRoot.getMObjectTypes()) { 
    stringBuffer.append(TEXT_100);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(mObjectType.getEcoreXPath());
    stringBuffer.append(TEXT_102);
         UTILITY.addMValueTypeReferences((List<MValueType>) mObjectType.getMPropertyTypes()); 
         if(mObjectType instanceof MStepType) { 
           MStepType mStepType = (MStepType) mObjectType; 
           UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMParameterTypes()); 
           UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMResultTypes()); 
         } 
         for(MReferenceType mReferenceType: (List<MReferenceType>) mObjectType.getMReferenceTypes()) { 
    stringBuffer.append(TEXT_103);
    stringBuffer.append(getGeneratedEcoreFile().getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(mReferenceType.getEcoreXPath());
    stringBuffer.append(TEXT_105);
    	   } 
    stringBuffer.append(TEXT_106);
     } 
    stringBuffer.append(TEXT_107);
     } catch(Throwable e) {e.printStackTrace();} 
    stringBuffer.append(TEXT_108);
    stringBuffer.append(TEXT_109);
    return stringBuffer.toString();
  }
}