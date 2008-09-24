/**
 * Revision History:
 * $Log: LogicLayerMUpdatePublishedMP3StepTest.java,v $
 * Revision 1.2  2007/05/12 11:01:27  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.1  2006/10/17 02:35:20  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.tests;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.IOException;

import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logic.LogicFactory;
import org.onceforall.dms.desktop.logic.MCopyDirectoryStep;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Tests the managed copy directory step.
 *
 * @author Marc
 */
public class LogicLayerMCopyDirectoryStepTest extends LogicLayerTest {
	/** Specifies the managed copy directory step to test. */
	protected MCopyDirectoryStep mStep;
	
	/**
	 * Creates the managed copy directory step.
	 * 
	 * @throws Exception Thrown if an error occurs.
	 */
	@BeforeClass
	public void initialise() throws Exception {
		mStep = LogicFactory.eINSTANCE.createMCopyDirectoryStep();
	}
	
	/**
	 * Removes all test artifact before every test.
	 * 
	 * @throws IOException 
	 */
	@BeforeMethod
	public void cleanUpTestOutputs() throws IOException {
		System.out.print("Cleaning up test outputs ..."); //$NON-NLS-1$
		
		File testOutputFiles = new File("Test Output Files");
		
		testOutputFiles.delete();
		testOutputFiles.mkdir();
		
		System.out.println(" completed."); //$NON-NLS-1$
	}
	
	
	/**
	 * Tests the validation of the managed copy directory step.
	 */
	@Test
	public void testValidation() {
		// Checks that the managed step will not allow the source and the destination directory to be the same.
		mStep.getMSourceDirectoryParameter().setValueForUI("Test Files");
		mStep.getMDestinationDirectoryParameter().setValueForUI("Test Files");
		
		DesktopExceptionList exceptions = executeMStep(mStep, true, false, false);
		assertValidation(exceptions, DesktopException.ERROR_SEVERITY, "cannot point to the same directory");	//$NON-NLS-1$
		
		// Checks that the managed step will not allow the source directory to be a sub-directory the destination directory.
		mStep.getMSourceDirectoryParameter().setValueForUI("Test Files");
		mStep.getMDestinationDirectoryParameter().setValueForUI(".");
		
		exceptions = executeMStep(mStep, true, false, false);
		assertValidation(exceptions, DesktopException.ERROR_SEVERITY, "source directory cannot be a sub-directory");		 //$NON-NLS-1$
		
		// Checks that the managed step will not allow the destination directory to be a sub-directory the source directory.
		mStep.getMSourceDirectoryParameter().setValueForUI(".");
		mStep.getMDestinationDirectoryParameter().setValueForUI("Test Output Files");
		
		exceptions = executeMStep(mStep, true, false, false);
		assertValidation(exceptions, DesktopException.ERROR_SEVERITY, "destination directory cannot be a sub-directory");		 //$NON-NLS-1$
	}
	
	/**
	 * Tests that the managed step copies the "Test Files" directory structure correctly.
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="testValidation")
	public void testCopyDirectory() throws Exception {
		// Sets the parameters.
		mStep.getMSourceDirectoryParameter().setValueForUI("Test Files");
		mStep.getMDestinationDirectoryParameter().setValueForUI("Test Output Files");

		// Copies the "Test Files" directory recursively.
		DesktopExceptionList exceptions = executeMStep(mStep, true, false);
		
		// Checks that the copy operation has succeeded.
		assertEquals(0, exceptions.size());
		assertEquals(mStep.getDestinationDirectoryParameter().getCanonicalPath()+File.separator+mStep.getSourceDirectoryParameter().getName(), mStep.getCopiedDirectoryResult().getCanonicalPath());
		assertFilesEquivalent(mStep.getSourceDirectoryParameter(), mStep.getCopiedDirectoryResult());
	}
	
	/**
	 * Asserts that the two given files are equivalent. If the both files are directories,
	 * it recursively compares them.
	 * 
	 * @param file1 Specifies the first file/directory.
	 * @param file2 Specifies the second file/directory.
	 */
	protected void assertFilesEquivalent(File file1, File file2) {
		assertEquals(file1.getName(), file2.getName());
		assertEquals(file1.length(), file2.length());
		assertEquals(file1.isDirectory(), file2.isDirectory());
	
		if(file1.isDirectory()) {
			File[] subFiles1 = file1.listFiles();
			File[] subFiles2 = file2.listFiles();
			assertEquals(subFiles1.length, subFiles2.length);
			
			for(File subFile: subFiles1)
				assertFilesEquivalent(new File(file1+File.separator+subFile), new File(file2+File.separator+subFile));
		}
	}
}
