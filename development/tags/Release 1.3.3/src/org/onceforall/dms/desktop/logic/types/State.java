/*
 * Revision History:
 * $Log: State.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


/**
 * Defines the state of a managed stateful object.
 * 
 * @see org.onceforall.dms.desktop.logic.MStatefulObject
 * @author Marc
 *
 */
public class State {
	/** Specifies a state registry that relates state names to state objects. */
	protected static final Map<String, State> STATES_BY_NAME = new HashMap<String, State>();
	
	/** Specifies the name of the state. */
	protected String name;
	
	/** Specifies the file path of the overlay icon of the state. */
	protected File overlayIconFilePath;

	/**
	 * Gets the state with the given name and overlay icon file path. If no state 
	 * with the given name already exists, it creates the state.
	 * 
	 * @param name  Specifies the name of the state.
	 * @param overlayIconFilePath Specifies the file path of the overlay icon of the state.
	 * @return Returns the state with the given name and overlay icon file path.
	 */
	public static State get(String name, File overlayIconFilePath) {
		State result = STATES_BY_NAME.get(name);
		if(result != null)
			return result;
		
		result = new State(name, overlayIconFilePath);
		STATES_BY_NAME.put(name, result);
		return result;
	}
	
	/**
	 * Gets the state with the given name. If no state with the given name exists.
	 * it returns <code>null</code>. This method can be used to restore state from
	 * a string while loading.
	 * 
	 * @param name  Specifies the name of the state.
	 * @return Returns the state with the given name.
	 */
	public static State valueOf(String name) {
		return STATES_BY_NAME.get(name);
	}
	
	/**
	 * Creates a new state object.
	 * 
	 * @param name  Specifies the name of the state.
	 * @param overlayIconFilePath Specifies the file path of the overlay icon of the state.
	 */
	private State(String name, File overlayIconFilePath) {
		if(name == null)
			throw new IllegalArgumentException("The parameter \"name\" must be specified.");
		
		this.name = name;
		this.overlayIconFilePath = overlayIconFilePath;
	}

	/**
	 * Gets the name of the state.
	 * 
	 * @return Returns the name of the state.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets a user-friendly representation of the name.
	 * 
	 * @return Returns a user-friendly representation of the name.
	 */
	public String getNameForUI() {
		return name;
	}


	/**
	 * Gets the file path of the overlay icon of the state.
	 * 
	 * @return Returns the file path of the overlay icon of the state.
	 */
	public File getOverlayIconFilePath() {
		return overlayIconFilePath;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final State other = (State) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}
	
}
