/*
 * Revision History:
 * $Log: model.skeleton,v $
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
import org.onceforall.dms.desktop.logic.types.*;

/**
 * Defines a class that generates an Ecore model from an Ecore meta model.
 */
public class EcoreModelGenerator { 
  protected static String nl;
  public static synchronized EcoreModelGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    EcoreModelGenerator result = new EcoreModelGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
  protected final String TEXT_2 = NL + "\t   \t<eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"";
  protected final String TEXT_3 = "\"" + NL + "\t      lowerBound=\"1\" eType=\"#";
  protected final String TEXT_4 = "\"" + NL + "\t      containment=\"true\" resolveProxies=\"false\">" + NL + "\t     <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "\t       <details key=\"name\" value=\"";
  protected final String TEXT_5 = "\"/>";
  protected final String TEXT_6 = NL + "   \t\t<details key=\"typeNameForUI\" value=\"";
  protected final String TEXT_7 = "\"/>";
  protected final String TEXT_8 = NL + "\t       <details key=\"description\" value=\"";
  protected final String TEXT_9 = "\"/>";
  protected final String TEXT_10 = NL + "\t       <details key=\"readOnly\" value=\"";
  protected final String TEXT_11 = "\"/>";
  protected final String TEXT_12 = NL + "\t       <details key=\"iconFilePath\" value=\"";
  protected final String TEXT_13 = "\"/>";
  protected final String TEXT_14 = NL + "\t       <details key=\"valueEFeature\" value=\"";
  protected final String TEXT_15 = "\"/>";
  protected final String TEXT_16 = NL + "\t       <details key=\"getHistoricValuesEFeature\" value=\"";
  protected final String TEXT_17 = "\"/>";
  protected final String TEXT_18 = NL + "\t     </eAnnotations>" + NL + "\t   </eStructuralFeatures>";
  protected final String TEXT_19 = "  \t\t";
  protected final String TEXT_20 = NL + "       <eStructuralFeatures xsi:type=\"";
  protected final String TEXT_21 = "ecore:EAttribute";
  protected final String TEXT_22 = "ecore:EReference";
  protected final String TEXT_23 = "\" name=\"";
  protected final String TEXT_24 = "\" lowerBound=\"";
  protected final String TEXT_25 = "\" upperBound=\"";
  protected final String TEXT_26 = "\"";
  protected final String TEXT_27 = " defaultValueLiteral=\"";
  protected final String TEXT_28 = "\"";
  protected final String TEXT_29 = " transient=\"";
  protected final String TEXT_30 = "\" eType=\"";
  protected final String TEXT_31 = "\" derived=\"";
  protected final String TEXT_32 = "\" volatile=\"";
  protected final String TEXT_33 = "\"/>";
  protected final String TEXT_34 = NL + "     \t<eStructuralFeatures xsi:type=\"";
  protected final String TEXT_35 = "ecore:EAttribute";
  protected final String TEXT_36 = "ecore:EReference";
  protected final String TEXT_37 = "\" name=\"";
  protected final String TEXT_38 = "\" upperBound=\"";
  protected final String TEXT_39 = "\" transient=\"false\" eType=\"";
  protected final String TEXT_40 = "\"/>";
  protected final String TEXT_41 = NL + "\t   \t<eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"";
  protected final String TEXT_42 = "\"" + NL + "\t      lowerBound=\"1\" eType=\"#";
  protected final String TEXT_43 = "\"" + NL + "\t      containment=\"true\" resolveProxies=\"false\">" + NL + "\t   </eStructuralFeatures>";
  protected final String TEXT_44 = NL + " \t\t<eAnnotations source=\"http://www.onceforall.org/mcore\">";
  protected final String TEXT_45 = NL + "   \t\t<details key=\"typeNameForUI\" value=\"";
  protected final String TEXT_46 = "\"/>";
  protected final String TEXT_47 = NL + "   \t\t<details key=\"name\" value=\"";
  protected final String TEXT_48 = "\"/>";
  protected final String TEXT_49 = NL + "   \t\t<details key=\"description\" value=\"";
  protected final String TEXT_50 = "\"/>";
  protected final String TEXT_51 = NL + "   \t\t<details key=\"iconFilePath\" value=\"";
  protected final String TEXT_52 = "\"/>";
  protected final String TEXT_53 = NL + "   \t\t<details key=\"compositeClassName\" value=\"";
  protected final String TEXT_54 = "\"/>";
  protected final String TEXT_55 = NL + "\t   \t<details key=\"actionName\" value=\"";
  protected final String TEXT_56 = "\"/>";
  protected final String TEXT_57 = NL + "\t   \t<details key=\"actionIconFilePath\" value=\"";
  protected final String TEXT_58 = "\"/>";
  protected final String TEXT_59 = NL + "\t   \t<details key=\"interruptable\" value=\"";
  protected final String TEXT_60 = "\"/>" + NL + "\t   \t<details key=\"stoppable\" value=\"";
  protected final String TEXT_61 = "\"/>" + NL + "\t   \t<details key=\"terminatable\" value=\"";
  protected final String TEXT_62 = "\"/>";
  protected final String TEXT_63 = NL + " \t\t</eAnnotations>";
  protected final String TEXT_64 = NL + "<ecore:EPackage xmi:version=\"2.0\"" + NL + "    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" name=\"logic\"" + NL + "    nsURI=\"http://www.onceforall.org/dms/desktop/model.ecore\" nsPrefix=\"org.onceforall.dms.desktop.logic\">" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MObject\" eSuperTypes=\"#//MElement\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Entry\"/>" + NL + "      <details key=\"compositeClassName\" value=\"org.onceforall.dms.desktop.ui.MObjectComposite\"/>  \t\t" + NL + "    </eAnnotations>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mNameProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Name\"/>" + NL + "        <details key=\"description\" value=\"Specifies the name.\"/>" + NL + "        <details key=\"valueEFeature\" value=\"name\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mDescriptionProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Description\"/>" + NL + "        <details key=\"description\" value=\"Specifies a detailed description.\"/>" + NL + "        <details key=\"valueEFeature\" value=\"description\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mIconFilePathProperty\"" + NL + "        lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Icon file path\"/>" + NL + "        <details key=\"description\" value=\"Specifies the file path to the icon that represents this element.\"/>" + NL + "        <details key=\"valueEFeature\" value=\"iconFilePath\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"fixedMProperties\" upperBound=\"-1\"" + NL + "        eType=\"#//MProperty\" volatile=\"true\" transient=\"true\"" + NL + "        derived=\"true\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"fixedMSteps\" upperBound=\"-1\"" + NL + "        eType=\"#//MStep\" volatile=\"true\" transient=\"true\"" + NL + "        derived=\"true\" resolveProxies=\"false\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MElement\" abstract=\"true\">" + NL + "  \t<eOperations name=\"validate\" lowerBound=\"1\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\">" + NL + "      <eParameters name=\"diagnosticsChain\" lowerBound=\"1\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDiagnosticChain\"/>" + NL + "      <eParameters name=\"context\" lowerBound=\"1\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EMap\"/>" + NL + "    </eOperations>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"name\" lowerBound=\"1\" eType=\"#//MString\"" + NL + "        defaultValueLiteral=\"\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"typeName\" lowerBound=\"1\"" + NL + "        eType=\"#//MString\" changeable=\"false\" volatile=\"true\" transient=\"true\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"typeNameForUI\" lowerBound=\"1\"" + NL + "        eType=\"#//MString\" transient=\"true\" defaultValueLiteral=\"Element\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"nameForUI\" lowerBound=\"1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\" changeable=\"false\"" + NL + "        volatile=\"true\" transient=\"true\" defaultValueLiteral=\"Element\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"description\" lowerBound=\"1\"" + NL + "        eType=\"#//MString\" defaultValueLiteral=\"\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"descriptionForUI\" lowerBound=\"1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\" changeable=\"false\"" + NL + "        volatile=\"true\" transient=\"true\" defaultValueLiteral=\"\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"iconFilePath\" eType=\"#//MFile\"" + NL + "        changeable=\"true\" transient=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"overlayIconFilePath\" eType=\"#//MFile\"" + NL + "        changeable=\"true\" transient=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"compositeClassName\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\"" + NL + "        transient=\"true\" defaultValueLiteral=\"\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"simulated\" lowerBound=\"1\" defaultValueLiteral=\"false\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MParameter\" eSuperTypes=\"#//MValue\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Parameter\"/>\t\t" + NL + "    </eAnnotations>" + NL + "\t</eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MProperty\" eSuperTypes=\"#//MValue\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Property\"/>\t\t" + NL + "    </eAnnotations>" + NL + "\t</eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MResult\" eSuperTypes=\"#//MValue\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Result\"/>\t\t" + NL + "    </eAnnotations>" + NL + "\t</eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MStatefulObject\" abstract=\"true\" eSuperTypes=\"#//MObject\">" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mStateProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"State\"/>" + NL + "        <details key=\"description\" value=\"Specifies the current state.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mLastStateChangeProperty\"" + NL + "        lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Last state change\"/>" + NL + "        <details key=\"description\" value=\"Specifies the date and time of the last state change.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"lastStateChangeProperty\"" + NL + "        eType=\"#//MDateTime\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MStep\" abstract=\"true\" eSuperTypes=\"#//MStatefulObject\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Task\"/>" + NL + "      <details key=\"compositeClassName\" value=\"org.onceforall.dms.desktop.ui.MStepComposite\"/>" + NL + "    </eAnnotations>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mInputSteps\" ordered=\"false\"" + NL + "        upperBound=\"-1\" eType=\"#//MStep\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"fixedMParameters\" upperBound=\"-1\"" + NL + "        eType=\"#//MParameter\" volatile=\"true\" transient=\"true\"" + NL + "        derived=\"true\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"fixedMResults\" upperBound=\"-1\"" + NL + "        eType=\"#//MResult\" volatile=\"true\" transient=\"true\"" + NL + "        derived=\"true\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"exclusiveProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MBoolean\" transient=\"false\" defaultValueLiteral=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"stateProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MStepState\" transient=\"true\" defaultValueLiteral=\"Pending\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mProgressProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Progress\"/>" + NL + "        <details key=\"description\" value=\"Specifies the progress of the processing in %.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"progressProperty\" eType=\"#//MLong\"" + NL + "        transient=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mProgressStatusProperty\"" + NL + "        lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\"" + NL + "        resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Progress status\"/>" + NL + "        <details key=\"description\" value=\"Specifies a textual representation of the progress.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"progressStatusProperty\"" + NL + "        eType=\"#//MString\" transient=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mStartTriggerProperty\"" + NL + "        lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\"" + NL + "        resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Start trigger\"/>" + NL + "        <details key=\"description\" value=\"Specifies when the step should be started.&#xD;&#xA;&#xD;&#xA;It can hold the following values:&#xD;&#xA;   'Manual' means that the step only starts when you explicitly request it.&#xD;&#xA;   'Semi-automatic' means that the step will request to be started when all steps it depends on have been completed and all necessary parameters have been entered.&#xD;&#xA;   'Automatic' means that the step will automatically start all steps it depends on have been completed and all necessary parameters have been entered.\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"startTriggerProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MString\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"interruptable\" lowerBound=\"1\" transient=\"true\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\" changeable=\"false\"" + NL + "        defaultValueLiteral=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"stoppable\" lowerBound=\"1\" transient=\"true\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\" changeable=\"false\"" + NL + "        defaultValueLiteral=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"terminatable\" lowerBound=\"1\" transient=\"true\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\" changeable=\"false\"" + NL + "        defaultValueLiteral=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"actionName\" lowerBound=\"1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\" defaultValueLiteral=\"Mark as completed\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"actionIconFilePath\" changeable=\"true\" transient=\"false\"" + NL + "        eType=\"#//MFile\" defaultValueLiteral=\"Image Files\\Mark as completed.gif\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"exception\" lowerBound=\"1\" transient=\"true\"" + NL + "        eType=\"#//EThrowable\" changeable=\"false\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MValue\" abstract=\"true\" eSuperTypes=\"#//MElement\">" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mInputValues\" upperBound=\"-1\"" + NL + "        eType=\"#//MValue\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"valueForUI\" lowerBound=\"1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\" volatile=\"true\"" + NL + "        transient=\"true\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"value\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EJavaObject\"" + NL + "        volatile=\"true\" transient=\"true\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"historicValues\" ordered=\"false\"" + NL + "        upperBound=\"-1\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EJavaObject\"" + NL + "        volatile=\"true\" transient=\"true\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"historicValuesForUI\" upperBound=\"-1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\" volatile=\"true\"" + NL + "        transient=\"true\" derived=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"readOnly\" lowerBound=\"1\"" + NL + "        eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MApplication\" abstract=\"true\" eSuperTypes=\"#//MObject\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Application\"/>" + NL + "      <details key=\"name\" value=\"Digital Media Service Desktop\"/>" + NL + "      <details key=\"description\" value=\"Represents the whole application.\"/>" + NL + "      <details key=\"compositeClassName\" value=\"org.onceforall.dms.desktop.ui.MApplicationComposite\"/>" + NL + "      <details key=\"iconFilePath\" value=\"Image Files\\Application.gif\"/>" + NL + "    </eAnnotations>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mDataFileProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\"" + NL + "        resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Data file\"/>" + NL + "        <details key=\"description\" value=\"Specifies the file that contains the application data.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"dataFileProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MExistingFile\" changeable=\"false\" transient=\"true\" defaultValueLiteral=\"Application Data Files\\Data.xml\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"infoWebPageProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MUrl\" changeable=\"true\" transient=\"true\" defaultValueLiteral=\"http://www.onceforall.org/dms-desktop/info.html\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mInfoWebPageProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\"" + NL + "        resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Information web page URL\"/>" + NL + "        <details key=\"description\" value=\"Specifies the URL of a web page that provides up-to-date information that is relevant to the users of this application.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"dataFilePropertyHistoricValues\"" + NL + "        ordered=\"false\" upperBound=\"5\" eType=\"#//MFile\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mLogFileProperty\" lowerBound=\"1\"" + NL + "      eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Log file\"/>" + NL + "        <details key=\"description\" value=\"Specifies the file that contains the log data.\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"logFileProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MFile\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mPathProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Path\"/>" + NL + "        <details key=\"description\" value=\"Specifies the path where this application has been started from.\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"pathProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MExistingDirectory\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mVersionProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Version\"/>" + NL + "        <details key=\"description\" value=\"Specifies the version of the application.\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"versionProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MString\" defaultValueLiteral=\"0.9.0\"/>" + NL + "\t<eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mLastSaveProperty\"" + NL + "\t  lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "\t  <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "\t    <details key=\"name\" value=\"Last application data save\"/>" + NL + "\t    <details key=\"description\" value=\"Specifies the date and time when the application data was last saved.\"/>" + NL + "\t    <details key=\"readOnly\" value=\"true\"/>" + NL + "\t  </eAnnotations>" + NL + "\t</eStructuralFeatures>  \t\t" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"lastSaveProperty\" lowerBound=\"0\" upperBound=\"1\" transient=\"true\" eType=\"//MDateTime\" derived=\"false\" volatile=\"false\"/>" + NL + "  </eClassifiers>" + NL + "  <eClassifiers xsi:type=\"ecore:EClass\" name=\"MScript\" eSuperTypes=\"#//MStatefulObject\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"typeNameForUI\" value=\"Script\"/>" + NL + "      <details key=\"name\" value=\"Script\"/>" + NL + "      <details key=\"description\" value=\"Contains a number of tasks that should be completed.\"/>" + NL + "      <details key=\"iconFilePath\" value=\"Image Files\\Script.gif\"/>" + NL + "    </eAnnotations>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mSteps\" upperBound=\"-1\"" + NL + "        eType=\"#//MStep\" containment=\"true\" resolveProxies=\"false\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"stateProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MStepState\" transient=\"true\" defaultValueLiteral=\"Pending\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mProgressProperty\" lowerBound=\"1\"" + NL + "        eType=\"#//MProperty\" containment=\"true\" resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Progress\"/>" + NL + "        <details key=\"description\" value=\"Specifies the progress of the processing in %.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"progressProperty\" eType=\"#//MLong\"" + NL + "        transient=\"true\"/>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"mProgressStatusProperty\"" + NL + "        lowerBound=\"1\" eType=\"#//MProperty\" containment=\"true\"" + NL + "        resolveProxies=\"false\">" + NL + "      <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "        <details key=\"name\" value=\"Progress status\"/>" + NL + "        <details key=\"description\" value=\"Specifies a textual representation of the progress.\"/>" + NL + "        <details key=\"readOnly\" value=\"true\"/>" + NL + "      </eAnnotations>" + NL + "    </eStructuralFeatures>" + NL + "    <eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"progressStatusProperty\"" + NL + "        eType=\"#//MString\" transient=\"true\"/>" + NL + "  </eClassifiers>";
  protected final String TEXT_65 = NL + "  <eClassifiers xsi:type=\"ecore:EDataType\" name=\"";
  protected final String TEXT_66 = "\" instanceClassName=\"";
  protected final String TEXT_67 = "\"/>\t\t";
  protected final String TEXT_68 = NL + "  <eClassifiers xsi:type=\"ecore:EDataType\" name=\"";
  protected final String TEXT_69 = "\" instanceClassName=\"";
  protected final String TEXT_70 = "\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"name\" value=\"";
  protected final String TEXT_71 = "\"/>" + NL + "    </eAnnotations>\t" + NL + "  </eClassifiers>\t\t";
  protected final String TEXT_72 = NL + "  <eClassifiers xsi:type=\"ecore:EDataType\" name=\"";
  protected final String TEXT_73 = "\" instanceClassName=\"";
  protected final String TEXT_74 = "\"/>\t\t";
  protected final String TEXT_75 = NL + "  <eClassifiers xsi:type=\"ecore:EDataType\" name=\"";
  protected final String TEXT_76 = "\" instanceClassName=\"";
  protected final String TEXT_77 = "\">" + NL + "    <eAnnotations source=\"http://www.onceforall.org/mcore\">" + NL + "      <details key=\"name\" value=\"";
  protected final String TEXT_78 = "\"/>" + NL + "    </eAnnotations>\t" + NL + "  </eClassifiers>\t\t";
  protected final String TEXT_79 = NL + "\t<eClassifiers xsi:type=\"ecore:EClass\" name=\"";
  protected final String TEXT_80 = "\" eSuperTypes=\"#";
  protected final String TEXT_81 = "\" abstract=\"";
  protected final String TEXT_82 = "\">";
  protected final String TEXT_83 = NL + "   \t<eStructuralFeatures xsi:type=\"ecore:EReference\" name=\"";
  protected final String TEXT_84 = "\"" + NL + "      lowerBound=\"";
  protected final String TEXT_85 = "\" upperBound=\"";
  protected final String TEXT_86 = "\" eType=\"#";
  protected final String TEXT_87 = "\"" + NL + "      containment=\"";
  protected final String TEXT_88 = "\" derived=\"";
  protected final String TEXT_89 = "\" volatile=\"";
  protected final String TEXT_90 = "\"" + NL + "      transient=\"";
  protected final String TEXT_91 = "\" resolveProxies=\"false\"/>\t\t\t\t\t";
  protected final String TEXT_92 = NL + "\t</eClassifiers>";
  protected final String TEXT_93 = NL + "\t<eClassifiers xsi:type=\"ecore:EClass\" name=\"";
  protected final String TEXT_94 = "\" eSuperTypes=\"#";
  protected final String TEXT_95 = "\" abstract=\"";
  protected final String TEXT_96 = "\">";
  protected final String TEXT_97 = NL + "\t</eClassifiers>\t";
  protected final String TEXT_98 = NL + "</ecore:EPackage>";
  protected final String TEXT_99 = NL;
  protected final String TEXT_100 = NL + "      ";

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
    stringBuffer.append(mValueType.getReferenceName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(mValueType.getESuperTypeXPath());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(encodeForXml(mValueType.getDefaultName()));
    stringBuffer.append(TEXT_5);
           if(mValueType.getNameForUI() != null && mValueType.getNameForUI().length() > 0) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(encodeForXml(mValueType.getNameForUI()));
    stringBuffer.append(TEXT_7);
           } 
           if(mValueType.getDefaultDescription() != null && mValueType.getDefaultDescription().length() > 0) { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(encodeForXml(mValueType.getDefaultDescription()));
    stringBuffer.append(TEXT_9);
           } 
           if(mValueType.getDefaultReadOnly() != null) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(mValueType.getDefaultReadOnly());
    stringBuffer.append(TEXT_11);
           } 
           if(mValueType.getDefaultIconFilePath() != null && mValueType.getDefaultIconFilePath().length() > 0) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(encodeForXml(mValueType.getDefaultIconFilePath()));
    stringBuffer.append(TEXT_13);
           } 
           if(mValueType.getValueEFeatureName() != null && mValueType.getValueEFeatureName().length() > 0) { 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(encodeForXml(mValueType.getValueEFeatureName()));
    stringBuffer.append(TEXT_15);
           } 
           if(mValueType.getHistoricValuesEFeatureName() != null && mValueType.getHistoricValuesEFeatureName().length() > 0) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(encodeForXml(mValueType.getHistoricValuesEFeatureName()));
    stringBuffer.append(TEXT_17);
           } 
    stringBuffer.append(TEXT_18);
         } 
    stringBuffer.append(TEXT_19);
         if(mValueType.isGenerateValueFeature()) {
    stringBuffer.append(TEXT_20);
    if(mValueType.getValueType() instanceof MPrimitiveDataTypeType) {
    stringBuffer.append(TEXT_21);
    } else {
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    stringBuffer.append(encodeForXml(mValueType.getFeatureName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(mValueType.getLowerBound());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(mValueType.getUpperBound());
    stringBuffer.append(TEXT_26);
    if(mValueType.getDefaultValue() != null && mValueType.getDefaultValue().length() > 0) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(encodeForXml(mValueType.getDefaultValue()));
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(mValueType.getTransient());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(encodeForXml(mValueType.getValueType().getETypeXPath()));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(mValueType.getDerived());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(mValueType.getVolatile());
    stringBuffer.append(TEXT_33);
           if(mValueType.getHistoricValuesUpperBound() > 0) { 
    stringBuffer.append(TEXT_34);
    if(mValueType.getValueType() instanceof MPrimitiveDataTypeType) {
    stringBuffer.append(TEXT_35);
    } else {
    stringBuffer.append(TEXT_36);
    }
    stringBuffer.append(TEXT_37);
    stringBuffer.append(encodeForXml(mValueType.getHistoricFeatureName()));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(mValueType.getHistoricValuesUpperBound());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(encodeForXml(mValueType.getValueType().getETypeXPath()));
    stringBuffer.append(TEXT_40);
           }
       }
     }
   }
     
   void addMStepTypeReferences(List<MStepType> mStepTypes) {
     for(MStepType mStepType: mStepTypes) { 
    stringBuffer.append(TEXT_41);
    stringBuffer.append(mStepType.getReferenceName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(mStepType.getETypeXPath());
    stringBuffer.append(TEXT_43);
         } 		
   }  
   
   void addMObjectTypeAnnotations(MObjectType mObjectType) { 
    stringBuffer.append(TEXT_44);
         if(mObjectType.getNameForUI() != null && mObjectType.getNameForUI().length() > 0) { 
    stringBuffer.append(TEXT_45);
    stringBuffer.append(encodeForXml(mObjectType.getNameForUI()));
    stringBuffer.append(TEXT_46);
         } 
         if(mObjectType.getDefaultName() != null && mObjectType.getDefaultName().length() > 0) { 
    stringBuffer.append(TEXT_47);
    stringBuffer.append(encodeForXml(mObjectType.getDefaultName()));
    stringBuffer.append(TEXT_48);
         } 
         if(mObjectType.getDefaultDescription() != null && mObjectType.getDefaultDescription().length() > 0) { 
    stringBuffer.append(TEXT_49);
    stringBuffer.append(encodeForXml(mObjectType.getDefaultDescription()));
    stringBuffer.append(TEXT_50);
         } 
         if(mObjectType.getDefaultIconFilePath() != null && mObjectType.getDefaultIconFilePath().length() > 0) { 
    stringBuffer.append(TEXT_51);
    stringBuffer.append(encodeForXml(mObjectType.getDefaultIconFilePath()));
    stringBuffer.append(TEXT_52);
         } 
         if(mObjectType.getCompositeClassName() != null && mObjectType.getCompositeClassName().length() > 0) { 
    stringBuffer.append(TEXT_53);
    stringBuffer.append(encodeForXml(mObjectType.getCompositeClassName()));
    stringBuffer.append(TEXT_54);
         } 
        if(mObjectType instanceof MStepType) {
				MStepType mStepType = (MStepType) mObjectType;
				if(mStepType.getDefaultActionName() != null && mStepType.getDefaultActionName().length() > 0) { 
    stringBuffer.append(TEXT_55);
    stringBuffer.append(encodeForXml(mStepType.getDefaultActionName()));
    stringBuffer.append(TEXT_56);
    			}
		    if(mStepType.getDefaultActionIconFilePath() != null && mStepType.getDefaultActionIconFilePath().length() > 0) { 
    stringBuffer.append(TEXT_57);
    stringBuffer.append(encodeForXml(mStepType.getDefaultActionIconFilePath()));
    stringBuffer.append(TEXT_58);
    			} 
    stringBuffer.append(TEXT_59);
    stringBuffer.append(mStepType.getInterruptable());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(mStepType.getStoppable());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(mStepType.getTerminatable());
    stringBuffer.append(TEXT_62);
    		} 
    stringBuffer.append(TEXT_63);
       }
   String encodeForXml(String text) {
		 if(text != null) { 
			text = text.replaceAll("&", "&amp;");
			text = text.replaceAll("<", "&lt;");
			text = text.replaceAll(">", "&gt;");
			text = text.replaceAll("'", "&apos;");
			text = text.replaceAll("\"", "&quot;");
		 }
		 return(text);
   }
 }

 final Utility UTILITY = new Utility();

 try { 
    stringBuffer.append(TEXT_64);
     ERootPackageType modelRoot = getModelRoot(); 
     for (EReference eReference : (List<EReference>) modelRoot.eClass().getEAllReferences()) { 
     	if (eReference.getEType().getInstanceClass().isAssignableFrom(ECustomDataTypeType.class) && eReference.getUpperBound() == 1) { 
     		ECustomDataTypeType eCustomDataTypeType = (ECustomDataTypeType) modelRoot.eGet(eReference.getFeatureID(), false, false); 
    stringBuffer.append(TEXT_65);
    stringBuffer.append(UTILITY.encodeForXml(eCustomDataTypeType.getName()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(UTILITY.encodeForXml(eCustomDataTypeType.getInstanceClassName()));
    stringBuffer.append(TEXT_67);
     	} 
     	if (eReference.getEType().getInstanceClass().isAssignableFrom(MPrimitiveDataTypeType.class) && eReference.getUpperBound() == 1) { 
     		MPrimitiveDataTypeType mPrimitiveDataTypeType = (MPrimitiveDataTypeType) modelRoot.eGet(eReference.getFeatureID(), false, false); 
    stringBuffer.append(TEXT_68);
    stringBuffer.append(UTILITY.encodeForXml(mPrimitiveDataTypeType.getName()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(Type.getTypeForName(mPrimitiveDataTypeType.getDataTypeName()).getJavaClass().getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(UTILITY.encodeForXml(mPrimitiveDataTypeType.getDataTypeName()));
    stringBuffer.append(TEXT_71);
     	} 
     } 
     for(ECustomDataTypeType eCustomDataTypeType: (List<ECustomDataTypeType>) modelRoot.getECustomDataTypeTypes()) { 
    stringBuffer.append(TEXT_72);
    stringBuffer.append(UTILITY.encodeForXml(eCustomDataTypeType.getName()));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(UTILITY.encodeForXml(eCustomDataTypeType.getInstanceClassName()));
    stringBuffer.append(TEXT_74);
     } 
     for(MPrimitiveDataTypeType mPrimitiveDataTypeType: (List<MPrimitiveDataTypeType>) modelRoot.getMPrimitiveDataTypeTypes()) { 
    stringBuffer.append(TEXT_75);
    stringBuffer.append(UTILITY.encodeForXml(mPrimitiveDataTypeType.getName()));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(Type.getTypeForName(mPrimitiveDataTypeType.getDataTypeName()).getJavaClass().getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(UTILITY.encodeForXml(mPrimitiveDataTypeType.getDataTypeName()));
    stringBuffer.append(TEXT_78);
     	} 
     for(MObjectType mObjectType: (List<MObjectType>) modelRoot.getMObjectTypes()) { 
    stringBuffer.append(TEXT_79);
    stringBuffer.append(UTILITY.encodeForXml(mObjectType.getName()));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(UTILITY.encodeForXml(mObjectType.getESuperTypeXPath()));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(mObjectType.getAbstract());
    stringBuffer.append(TEXT_82);
    	 UTILITY.addMObjectTypeAnnotations(mObjectType); 
     UTILITY.addMValueTypeReferences((List<MValueType>) mObjectType.getMPropertyTypes());
     if(mObjectType instanceof MBusinessObjectType) 
		 UTILITY.addMStepTypeReferences((List<MStepType>) ((MBusinessObjectType) mObjectType).getMStepTypes());

     if(mObjectType instanceof MStepType) { 
       MStepType mStepType = (MStepType) mObjectType;
       UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMParameterTypes()); 
       UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMResultTypes()); 
     } 
     for(MReferenceType mReferenceType: (List<MReferenceType>) mObjectType.getMReferenceTypes()) { 
    stringBuffer.append(TEXT_83);
    stringBuffer.append(UTILITY.encodeForXml(mReferenceType.getName()));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(mReferenceType.getLowerBound());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(mReferenceType.getUpperBound());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(UTILITY.encodeForXml(mReferenceType.getMObjectType().getETypeXPath()));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(mReferenceType.getContainment());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(mReferenceType.getDerived());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(mReferenceType.getVolatile());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(mReferenceType.getTransient());
    stringBuffer.append(TEXT_91);
    	   } 
    stringBuffer.append(TEXT_92);
    	 if(mObjectType instanceof MBusinessObjectType) { 
       for(MStepType mStepType: (List<MStepType>) ((MBusinessObjectType) mObjectType).getMStepTypes()) { 
    stringBuffer.append(TEXT_93);
    stringBuffer.append(UTILITY.encodeForXml(mObjectType.getName()+mStepType.getName()));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(UTILITY.encodeForXml(mStepType.getESuperTypeXPath()));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(mStepType.getAbstract());
    stringBuffer.append(TEXT_96);
    		UTILITY.addMObjectTypeAnnotations(mStepType);
		UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMParameterTypes());
		UTILITY.addMValueTypeReferences((List<MValueType>) mStepType.getMResultTypes()); 
    stringBuffer.append(TEXT_97);
         }
     }	
   } 
    stringBuffer.append(TEXT_98);
     } catch(Throwable e) {e.printStackTrace();} 
    stringBuffer.append(TEXT_99);
    stringBuffer.append(TEXT_100);
    return stringBuffer.toString();
  }
}