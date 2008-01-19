package org.onceforall.dms.desktop.ui;

import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines the interface that is common to all managed element controls.
 * 
 * @author Marc
 */
public interface MElementControl {
	/**
	 * Gets the managed element that this controls represents.
	 * 
	 * @return Returns the managed element that this controls represents. If no
	 * element is associated with this controls, it returns <code>null</code>.
	 */
	MElement getMElement();
	
	/**
	 * Sets the managed element that this controls represents.
	 * 
	 * @param mElement Specifies the managed element to associate with this controls.
	 */
	void setMElement(MElement mElement);
}
