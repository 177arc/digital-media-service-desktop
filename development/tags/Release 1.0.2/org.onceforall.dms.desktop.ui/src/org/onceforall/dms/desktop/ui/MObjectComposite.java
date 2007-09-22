/*
 * Revision History:
 * $Log: MObjectComposite.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.3  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:42:23  Marc
 * Made sure that the application shut-down does not throw exceptions.
 *
 * Revision 1.1  2005/03/04 00:19:02  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MProperty;

/**
 * Defines a SWT composite that is responsible for displaying a managed class object and its sub-objects.
 */

public class MObjectComposite extends DetailsComposite {
    /** Specifies the values table composite that displays the properties. */
    protected ValuesTableComposite propertiesTableComposite;    
    
    /**
     * Creates a new mStep composite object.
     *
     * @param parent Specifies the parent of the mStep composite object. 
     * @param style Specifies the style of the mStep composite object.
     */
    public MObjectComposite(Composite parent, int style) {
        super(parent, style);
        
        // Adds the properties table composite.
        propertiesTableComposite = new ValuesTableComposite(this, MProperty.class);
        propertiesTableComposite.setExpanded(true);
        GridData layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
		propertiesTableComposite.setLayoutData(layoutData);
  }
 
    /**
     * Gets the values table composite that displays the properties.
     * 
     * @return Returns the values table composite that displays the properties.
     */
    public ValuesTableComposite getPropertiesTableComposite() {
        return propertiesTableComposite;
    }
    
    /**
     * @see org.onceforall.dms.desktop.ui.DetailsComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
     */
    @Override
    public void setMElement(MElement mElement) throws IllegalArgumentException {       
        // Makes sure that the new managed class object is actually different to the current one.
        if(this.mElement == mElement)
            return;
        
        super.setMElement(mElement);

        if(isDisposed())
            return;
 
        if(mElement != null && mElement instanceof MObject) {
            if(((MObject) mElement).getFixedMProperties().size() > 0) {
                propertiesTableComposite.setVisible(true);
                propertiesTableComposite.setMElement(mElement);
            }
            else {
                propertiesTableComposite.setVisible(false);
            	propertiesTableComposite.setMElement(null);
            }
            
            layout();
         }
    }    
    
    /**
     * @see org.eclipse.swt.widgets.Widget#dispose()
     */
    @Override
	public void dispose() {
        // Makes sure that dependencies are unregistered before the composite is disposed.
        setMElement(null);
        
        super.dispose();
    }
}
