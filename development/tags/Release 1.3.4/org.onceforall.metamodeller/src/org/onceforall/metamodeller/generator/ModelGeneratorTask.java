package org.onceforall.metamodeller.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

public class ModelGeneratorTask extends Task {

	/** Spepcifies the path of the Ecore file to generate the model from. */
	protected String infile;

	/** Spepcifies the path of the Ecore model file to be generated. */
	protected String outfile;
	
	/**
	 * Runs the Ecore model generator.
	 * 
	 * @param args Specifies the command line arguments.
	 * @throws IOException Thrown if the generator model cannot be loaded.
	 */
	public static void main(String[] args) throws IOException {
		ModelGeneratorTask task = new ModelGeneratorTask();
		task.setInfile(args[0]);
		task.setOutfile(args[1]);
		task.execute();
	}

	/**
	 * Gets the path of the Ecore file to generate the model from.
	 * 
	 * @return Returns the path of the Ecore file to generate the model from.
	 */
	public String getInfile() {
		return infile;
	}

	/**
	 * Sets the path of the Ecore file to generate the model from.
	 *
	 * @param infile Specifies the path of the Ecore file to generate the model from.
	 */
	public void setInfile(String infile) {
		this.infile = infile;
	}

	/**
	 * Gets the path of the Ecore model file to be generated.
	 *
	 * @return Returns the path of the Ecore model file to be generated.
	 */
	public String getOutfile() {
		return outfile;
	}

	/**
	 * Sets the path of the Ecore model file to be generated.
	 *
	 * @param outfile Specifies the path of the Ecore model file to be generated.
	 */
	public void setOutfile(String outfile) {
		this.outfile = outfile;
	}
	
	/**
	 * Executes this task.
	 * 
	 * @throw BuildException Thrown if the input file not be found or a problem occurs during the model generation.
	 * @see org.apache.tools.ant.Task#execute()
	 */
	public void execute() throws BuildException {
		EcoreModelGenerator generator = new EcoreModelGenerator();
		generator.setEcoreFile(new File(infile));
		generator.setGeneratedEcoreFile(new File(outfile));

		FileWriter writer = null;
		try{				
			
			// Validates the model before generating from it.
			Diagnostician diagnostician = new Diagnostician();
			Diagnostic diagnostic = diagnostician.validate(generator.getModelRoot());
			if(diagnostic != null && diagnostic.getSeverity()> Diagnostic.OK)
				throw new BuildException(diagnostic.toString());

			writer = new FileWriter(outfile);
			writer.write(generator.generate(null));
		}
		catch(IOException exception) {
			throw new BuildException(exception);
		}
		finally {
			if(writer != null)
				try {
					writer.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
		}
	}
}