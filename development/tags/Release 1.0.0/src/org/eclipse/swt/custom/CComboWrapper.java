/*
 * Revision History:
 * $Log: CComboWrapper.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 */
package org.eclipse.swt.custom;

import org.eclipse.swt.widgets.Event;

/**
 * Defines a wrapper class that provides access to protected methods of
 * the CCombo widget.
 */

public class CComboWrapper {
    /** Specifies the combo box to provide access to. */
    protected CCombo comboBox;
    
    /**
     * Creates a new CCombo wrapper object.
     *
     * @param comboBox
     */
    public CComboWrapper(CCombo comboBox) {
        this.comboBox = comboBox;
    }
    
    /**
     * @see CCombo#checkStyle(int)
     */
    static public int checkStyle(int style) {
        return CCombo.checkStyle(style);
    }
    
    /**
     * @see CCombo#arrowEvent(org.eclipse.swt.widgets.Event)
     */
    public void arrowEvent(Event event) {
        comboBox.arrowEvent(event);
    }
    
    /**
     * @see CCombo#comboEvent(org.eclipse.swt.widgets.Event)
     */
    public void comboEvent(Event event) {
        comboBox.comboEvent(event);
    }
    
    /**
     * @see CCombo#createPopup(java.lang.String[], int)
     */
    public void createPopup(String[] items, int selectionIndex) {
        comboBox.createPopup(items, selectionIndex);
    }
    
    /**
     * @see CCombo#dropDown(boolean)
     */
    public void dropDown(boolean drop) {
        comboBox.dropDown(drop);
    }
    
    /**
     * @see CCombo#initAccessible
     */
    public void initAccessible() {
        comboBox.initAccessible();
    }
    
    /**
     * @see CCombo#isDropped
     */
    public boolean isDropped() {
        return comboBox.isDropped();
    }
    
    /**
     * @see CCombo#listEvent(org.eclipse.swt.widgets.Event)
     */
    public void listEvent(Event event) {
        comboBox.listEvent(event);
    }
    
    /**
     * @see CCombo#popupEvent(org.eclipse.swt.widgets.Event)
     */
    public void popupEvent(Event event) {
        comboBox.popupEvent(event);
    }
    
    /**
     * @see CCombo#textEvent(org.eclipse.swt.widgets.Event)
     */
    public void textEvent(Event event) {
        comboBox.textEvent(event);
    }
    
    /**
     * Gets the combo box to provide access to.
     *
     * @return Returns the combo box to provide access to.
     */
    public CCombo getComboBox() {
        return comboBox;
    }
}
