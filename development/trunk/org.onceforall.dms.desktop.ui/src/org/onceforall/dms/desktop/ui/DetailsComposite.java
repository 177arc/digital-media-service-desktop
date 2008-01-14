/*
 * Revision History:
 * $Log: DetailsComposite.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.4  2005/08/03 21:32:35  Marc
 * Increased description text field size in the detailed composite.
 *
 * Revision 1.3  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/03/18 00:42:24  Marc
 * Made sure that the application shut-down does not throw exceptions.
 *
 * Revision 1.1  2005/03/04 00:19:02  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;


import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;

/**
 * Defines a SWT composite that displays the details of a managed object.
 */

public class DetailsComposite extends MElementComposite {
    /** Specifies the label that displays the name of the managed object. */
    protected Label nameLabel;
    
    /** Specifies the text area that displays the description of the managed object. */
    protected Text descriptionText;
    
	/** Specifies the scrollable form that contains the actual content of this composite. */
	protected ScrolledForm contentForm;
    
    /**
     * Creates a new details composite object.
     *
     * @param parent Specifies the composite that this composite belongs to.
     * @param style Specifies the SWT style of the composite.
     */
    public DetailsComposite(Composite parent, int style) {
        super(parent, style);

        GridLayout layout = new GridLayout(1, false);
        setLayout(layout); 
               
        // Sets the background colour of the composite.
        Color backgroundColour = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
        setBackground(backgroundColour);
        
        GridData layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
               
        // Adds the name label to the composite.
        nameLabel = getDefaultFormToolkit().createLabel(this, null, SWT.NONE);
        FormColors formColours = getDefaultFormToolkit().getColors();
        Color titleColour = formColours.getColor("org.eclipse.ui.forms.TITLE");
        nameLabel.setForeground(titleColour);
        Font font = new Font(Display.getDefault(), nameLabel.getFont().getFontData()[0].getName(),
        		12, SWT.BOLD);
        nameLabel.setFont(font);    
		nameLabel.setLayoutData(layoutData);
		
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);  
		int borderStyle = getDefaultFormToolkit().getBorderStyle();
		getDefaultFormToolkit().setBorderStyle(SWT.NULL);
        descriptionText = getDefaultFormToolkit().createText(this, null, SWT.MULTI | SWT.WRAP | SWT.READ_ONLY);
        getDefaultFormToolkit().setBorderStyle(borderStyle);
        descriptionText.setBackground(backgroundColour);
		descriptionText.setLayoutData(layoutData);
        
        // Adds the scrollable content form.
        contentForm = getDefaultFormToolkit().createScrolledForm(this);
		contentForm.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
        contentForm.getBody().setLayout(new GridLayout());
        contentForm.setExpandVertical(true);
        contentForm.setMinWidth(400);
        contentForm.setDelayedReflow(true);
    }
    

    /**
     * @see org.onceforall.dms.desktop.ui.MElementComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
     */
    @Override
   public void setMElement(MElement mElement) throws IllegalArgumentException {      
        if(mElement == null && this.mElement == null)
            return;

        if(mElement != null && mElement.equals(this.mElement))
            return;
        
		// Deletes itself as observer from the previous managed object if it is
		// not null.
		if (this.mElement != null) {
			MObject mObject = (MObject) this.mElement;
			mObject.eAdapters().remove(this);
			mObject.getMNameProperty().eAdapters().remove(this);
			mObject.getMDescriptionProperty().eAdapters().remove(this);
		}
		
        //TODO: Change setMObject to setMElement.
        super.setMElement(mElement);

        if(isDisposed())
            return;
        
		// Adds itself as observer to the new managed object if it is not null.
		if (mElement != null) {
			MObject mObject = (MObject) this.mElement;
			mObject.eAdapters().add(this);
			mObject.getMNameProperty().eAdapters().add(this);
			mObject.getMDescriptionProperty().eAdapters().add(this);
		}
		
        updateNameAndDescription();
    }

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
		if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MValue) {
			MValue mValue = (MValue) notification.getNotifier();
			if(mValue.eContainingFeatureID() == LogicPackage.MOBJECT__MNAME_PROPERTY || mValue.eContainingFeatureID() == LogicPackage.MOBJECT__MDESCRIPTION_PROPERTY )
				updateNameAndDescription();
		}
	}
    
    /**
     * Updates the name and description labels.
     */
    protected void updateNameAndDescription() {
        nameLabel.setText(mElement != null ? mElement.getNameForUI() : "(Not available)");
        
        if(mElement != null) {
            if(!(mElement instanceof MStep) || ((MStep) mElement).getMInputSteps().size() == 0)
            	descriptionText.setText(mElement.getDescriptionForUI());
            else {
            	MStep mStep = (MStep) mElement;
	            StringBuilder builder = new StringBuilder();
	            builder.append(mStep.getDescriptionForUI());
	            builder.append("\n\nThis "+mStep.getTypeNameForUI().toLowerCase()+" depends on:");
	            
	            for(MStep mInputStep: (List<MStep>) mStep.getMInputSteps())
	                builder.append("\n- '"+mInputStep.getNameForUI()+ "' "+mInputStep.getTypeNameForUI().toLowerCase());
	            
	            descriptionText.setText(builder.toString());
            }
        }
        else
        	descriptionText.setText("(Not available)");	
    }
    
    /**
     * Gets the label that displays the name of the managed object.
     * 
     * @return Returns the label that displays the name of the managed object.
     */
    public Label getNameLabel() {
        return nameLabel;
    }
    
    /**
     * Gets the text area that displays the description of the managed object
     * 
     * @return Returns the text area that displays the description of the managed object
     */
    public Text getDescriptionText() {
        return descriptionText;
    }


	/**
	 * @see org.eclipse.swt.widgets.Control#setBounds(int, int, int, int)
	 */
	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		
		//contentForm.reflow(true);
		//contentForm.layout(true);
		Rectangle bounds = contentForm.getBounds();
		contentForm.getBody().setBounds(bounds);
		contentForm.reflow(true);
	}


	/**
	 * @see org.eclipse.swt.widgets.Control#setBounds(org.eclipse.swt.graphics.Rectangle)
	 */
	@Override
	public void setBounds(Rectangle bounds) {
		setBounds(bounds.x, bounds.y, bounds.width, bounds.height);
	}

    
    
}
