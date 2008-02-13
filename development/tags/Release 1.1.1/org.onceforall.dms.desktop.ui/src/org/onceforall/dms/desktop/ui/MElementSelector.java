package org.onceforall.dms.desktop.ui;

import org.eclipse.emf.common.notify.Notifier;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Specifies the interface that all widget share that can select managed
 * elements.
 * 
 * @author Marc
 */
public interface MElementSelector extends Notifier, MElementControl {
	/**
	 * Gets the currently selected managed element.
	 * 
	 * @return Returns the currently selected managed element. If not managed
	 * element is selected it returns <code>null</null>.
	 */
	MElement getSelectedMElement();
	
	/**
	 * Sets the currently selected managed element.
	 * 
	 * @param selectedMElement Specifies the new selected managed element. If no element should be selected, 
	 * use <code>null</code>.
	 */
	void setSelectedMElement(MElement selectedMElement);
}
