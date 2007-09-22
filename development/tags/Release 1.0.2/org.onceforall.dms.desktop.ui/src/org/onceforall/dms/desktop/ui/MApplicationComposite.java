/*
 * Revision History:
 * $Log: MApplicationComposite.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:58  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.3  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:41:04  Marc
 * Fixed null pointer exception problem.
 *
 * Revision 1.1  2005/03/04 00:19:02  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines an SWT composite that is responsible for displaying the 
 * {@linkplain org.onceforall.dms.desktop.logic.MApplication application} object.
 */

public class MApplicationComposite extends MObjectComposite {
    /** Specifies the save application data button. */
    protected Button saveDataButton;
    
    /**
     * Creates a new application composite object.
     *
     * @param parent Specifies the parent of the application composite object. 
     * @param style Specifies the style of the application composite object.
     */
    public MApplicationComposite(Composite parent, int style) {
        super(parent, style);
        
        GridData layoutData;
        // Adds the properties table composite.
        saveDataButton = new Button(this, SWT.NONE);
        layoutData = new GridData(GridData.END, GridData.END, true, true);
        layoutData.widthHint = 100;
        
        saveDataButton.setText("Save data");
        saveDataButton.setLayoutData(layoutData);
        saveDataButton.addSelectionListener(new SelectionAdapter() { 
			@Override
			public void widgetSelected(SelectionEvent event) {    
			    saveDataButtonSelected(event);
			}
		});

   }
    
    /**
     * Handles the save application data button selection event.
     *ssssss
     * @param event
     */
    protected void saveDataButtonSelected(SelectionEvent event) {
        ((MApplication) mElement).saveToXML();
    }

    /**
     * Gets the save application data button.
     * 
     * @return Returns the save application data button.
     */
    public Button getSaveDataButton() {
        return saveDataButton;
    }
    
    
    /**
     * @see org.onceforall.dms.desktop.ui.MObjectComposite#setMElement(org.onceforall.dms.desktop.logic.MObject)
     */
    @Override
    public void setMElement(MElement mElement)
            throws IllegalArgumentException {
        
        // Makes sure that the simple object is an applcation object.
        if(mElement != null && !(mElement instanceof MApplication))
            throw new IllegalArgumentException("The object is not an application object.");

        super.setMElement(mElement);
    }
}
