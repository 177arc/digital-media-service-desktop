/*
 * Revision History:
 * $Log: MMp3StateType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.2  2006/08/28 15:06:26  marc
 * Updated to save changes.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;



/**
 * Defines a managed MP3 state value type that restricts to its values to states that a managed mStep can
 * have.
 */
public class MMp3StateType extends StateType {
    /** Specifies the state incidating that the MP3 is published but can be unpublished to make space available for new MP3 publications. */
    public static final State PUBLISHED_STATE = State.get("Published", new File("Image Files\\Published.gif"));

    /** Specifies the state incidating that the MP3 is published and should only be unpublished to make space available for new MP3 publications after all other <code>Published</code> MP3s have been unpublished. */
    //public static final State KEEP_PUBLISHED_STATE = State.get("Keep published", new File("Image Files\\Published.gif"));
    
    /** Specifies the state indicating that the MP3 should be published with the next publishing run. */
    public static final State TO_BE_PUBLISHED_STATE = State.get("To be published", null);
    
    /** Specifies the state indicating that the MP3 will not be included in any future publishing runs. */
    public static final State NOT_PUBLISHED_STATE = State.get("Not published", null);
    
    /** Specifies the state indicating that the MP3 will not be included in any future publishing runs and that the MP3 files have been removed from their orginial location. */
    public static final State ARCHIVED_STATE = State.get("Archived", new File("Image Files\\Archived.gif"));

	/**
	 * Creates a new managed MP3 state value type object.
	 *
	 */
	protected MMp3StateType() {
		super("MP3 state", "Specifies the states that an MP3 can have.", new State[] {
				TO_BE_PUBLISHED_STATE, PUBLISHED_STATE, NOT_PUBLISHED_STATE, ARCHIVED_STATE});
	}

}
