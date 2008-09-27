/*
 * Revision History:
 * $Log: MStepStateType.java,v $
 * Revision 1.3  2007/05/12 10:56:34  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:11  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;


/**
 * Defines a managed step state value type that restricts to its values to states that a managed mStep can
 * have.
 */
public class MStepStateType extends StateType {

	/** Specifies the text that represents the pending state of a managed step. */
	public static final State PENDING_STATE = State.get("Pending", null);
	
	/** Specifies the text that represents the skipped state of a managed step. */
	public static final State SKIPPED_STATE = State.get("Skipped", new File("Image Files\\Skipped.gif"));
	
	/** Specifies the text that represents the processing state of a managed step. */
	public static final State PROCESSING_STATE = State.get("Processing", new File("Image Files\\Processing.gif"));
	
	/** Specifies the text that represents the pausing state of a managed step. */
	public static final State PAUSING_STATE = State.get("Pausing", new File("Image Files\\Processing.gif"));
	
	/** Specifies the text that represents the paused state of a managed step. */
	public static final State PAUSED_STATE = State.get("Paused", new File("Image Files\\Paused.gif"));
	
	/** Specifies the text that represents the completed state of a managed step. */
	public static final State COMPLETED_STATE = State.get("Completed", new File("Image Files\\Completed.gif"));
	
	/** Specifies the text that represents the stopping state of a managed step. */
	public static final State STOPPING_STATE = State.get("Stopping", new File("Image Files\\Processing.gif"));
	
	/** Specifies the text that represents the stopping state of a managed step. */
	public static final State STOPPED_STATE = State.get("Stopped", null);
	
	/** Specifies the text that represents the terminating state of a managed step. */
	public static final State TERMINATING_STATE = State.get("Terminating", new File("Image Files\\Processing.gif"));
	
	/** Specifies the text that represents the terminated state of a managed step. */
	public static final State TERMINATED_STATE = State.get("Terminated", new File("Image Files\\Error.gif"));
	
	/** Specifies the text that represents the warning state of a managed step. */	
	public static final State WARNING_STATE = State.get("Warning", new File("Image Files\\Warning.gif"));
	
	/** Specifies the text that represents the error state of a managed step. */	
	public static final State ERROR_STATE = State.get("Error", new File("Image Files\\Error.gif"));

	/**
	 * Creates a new managed step state value type object.
	 *
	 */
	protected MStepStateType() {
		super("Step state", "Specifies the states that a task can have.", new State[] { COMPLETED_STATE, 
				ERROR_STATE, PAUSED_STATE, PAUSING_STATE, PENDING_STATE, PROCESSING_STATE, 
				SKIPPED_STATE, STOPPED_STATE, STOPPED_STATE, STOPPING_STATE, TERMINATED_STATE, 
				TERMINATING_STATE, WARNING_STATE});
	}

}
