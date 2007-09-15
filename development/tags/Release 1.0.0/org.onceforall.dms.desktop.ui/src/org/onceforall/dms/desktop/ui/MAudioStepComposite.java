/*
 * Revision History:
 * $Log: MAudioStepComposite.java,v $
 * Revision 1.4  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:35:33  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.6  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.5  2005/08/03 21:32:24  Marc
 * Increased description text field size in the detailed composite.
 *
 * Revision 1.4  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.3  2005/06/12 12:09:49  Marc
 * Updated for version 0.4.3.
 *
 * Revision 1.2  2005/03/18 00:41:22  Marc
 * Added labels.
 *
 * Revision 1.1  2005/03/13 14:31:09  Marc
 * Added burn CDs step and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:03  Marc
 * Implemented mail step and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.onceforall.dms.desktop.interfaces.MonitoredAudioInputStream;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MAudioStep;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MProperty;
import org.onceforall.dms.desktop.logic.MValue;

/**
 * Defines a SWT composite that is responsible for displaying an audio step.
 * It displays levels of the input stream of the audio step. 
 * 
 * @see org.onceforall.dms.desktop.logic.MAudioStep
 */

public class MAudioStepComposite extends MStepComposite {
    /** Specifies the label of above the input monitor. */
    protected Label inputMonitorLabel;

    /** Specifies the level meter that monitors the left input channel. */
    protected LevelMeter leftInputLevelMeter;

    /** Specifies the label of level meter that monitors the left input channel. */
    protected Label leftInputLevelMeterLabel;
    
    /** Specifies the level meter that monitors the right input channel. */
    protected LevelMeter rightInputLevelMeter;    
    
    /** Specifies the label of level meter that monitors the right input channel. */
    protected Label rightInputLevelMeterLabel; 
    
    /** Specifies the label that alters the user of likely distortion. */
    protected Label distortionAlertLabel;
    
    /** Specifies whether the left input signal is distorted. */
    protected boolean leftDistored;
    
    /** Specifies whether the right input signal is distorted. */
    protected boolean rightDistored;
    
    
    /**
     * Creates a new audio step composite object.
     *
     * @param parent Specifies the parent of the composite. 
     * @param style Specifies the style of composite.
     */
    public MAudioStepComposite(Composite parent, int style) {
        super(parent, style);
		
		// Adjusts layout of inherited widgets.
		((GridLayout) getLayout()).numColumns =2;
		((GridData) nameLabel.getLayoutData()).horizontalSpan = 2;
		((GridData) descriptionText.getLayoutData()).horizontalSpan = 2;
		((GridData) buttonBarComposite.getLayoutData()).horizontalSpan = 2;
		
		((GridData) sideBarComposite.getLayoutData()).exclude = false;
		sideBarComposite.setVisible(true);		
		sideBarComposite.setLayout(new FormLayout());
   
        FormData formData;
        Color backgroundColour = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
        
        // Adds the input monitor label.
        inputMonitorLabel = new Label(sideBarComposite, SWT.CENTER);
        inputMonitorLabel.setText("Input\nlevels");
        inputMonitorLabel.setBackground(backgroundColour);
        formData = new FormData();
        formData.top = new FormAttachment(0, 0);
        formData.bottom = new FormAttachment(0, 30);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(0, 45);
        inputMonitorLabel.setLayoutData(formData);
        
        // Adds the left input level monitor.
        leftInputLevelMeter = new LevelMeter(sideBarComposite, SWT.NONE);
        leftInputLevelMeter.setBackground(backgroundColour);
        formData = new FormData();
        formData.top = new FormAttachment(0, 30);
        formData.bottom = new FormAttachment(100, -40);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(0, 20);
        leftInputLevelMeter.setLayoutData(formData);
        
        // Adds the left input level monitor label.
        leftInputLevelMeterLabel = new Label(sideBarComposite, SWT.CENTER);
        leftInputLevelMeterLabel.setBackground(backgroundColour);
        leftInputLevelMeterLabel.setText("L");
        formData = new FormData();
        formData.top = new FormAttachment(100, -35);
        formData.bottom = new FormAttachment(100, -20);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(0, 20);
        leftInputLevelMeterLabel.setLayoutData(formData);
        
        // Adds the right input level monitor.
        rightInputLevelMeter = new LevelMeter(sideBarComposite, SWT.NONE);
        rightInputLevelMeter.setBackground(backgroundColour);
        formData = new FormData();
        formData.top = new FormAttachment(0, 30);
        formData.bottom = new FormAttachment(100, -40);
        formData.left = new FormAttachment(0, 25);
        formData.right = new FormAttachment(0, 45);
        rightInputLevelMeter.setLayoutData(formData);
        
        // Adds the right input level monitor label.
        rightInputLevelMeterLabel = new Label(sideBarComposite, SWT.CENTER);
        rightInputLevelMeterLabel.setText("R");
        rightInputLevelMeterLabel.setBackground(backgroundColour);
        formData = new FormData();
        formData.top = new FormAttachment(100, -35);
        formData.bottom = new FormAttachment(100, -20);
        formData.left = new FormAttachment(0, 25);
        formData.right = new FormAttachment(0, 45);
        rightInputLevelMeterLabel.setLayoutData(formData);
        
        // Adds the distortion alert label.
        distortionAlertLabel = new Label(sideBarComposite, SWT.CENTER);
        distortionAlertLabel.setText("");
        distortionAlertLabel.setBackground(backgroundColour);
        formData = new FormData();
        formData.top = new FormAttachment(100, -15);
        formData.bottom = new FormAttachment(100, 0);
        formData.left = new FormAttachment(0, 0);
        formData.right = new FormAttachment(0, 45);
        distortionAlertLabel.setLayoutData(formData);    
    }
    
    /**
	 * @see org.onceforall.dms.desktop.ui.MStepComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
        if(isDisposed())
            return;
        
        super.processNotification(notification);
        
        if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MValue) {
            MValue mValue = (MValue) notification.getNotifier();            
            if(mValue.eContainingFeatureID() == LogicPackage.MAUDIO_STEP__MLEFT_INPUT_DISTORTION_PROPERTY && !leftInputLevelMeter.isDisposed()) {
                leftDistored = (Boolean) mValue.getValue();
            }

            if(mValue.eContainingFeatureID() == LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_DISTORTION_PROPERTY && !rightInputLevelMeter.isDisposed()) {
                rightDistored = (Boolean) mValue.getValue();

            }
            
            if(leftDistored || rightDistored)
                distortionAlertLabel.setText("Distorted");
            else
                distortionAlertLabel.setText("");
        }		
	}
    
    /**
	 * @see org.onceforall.dms.desktop.ui.MStepComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) throws IllegalArgumentException {
        if(mElement != null && !(mElement instanceof MAudioStep))
            throw new IllegalArgumentException("The type of parameter 'mElement' must be '"+MAudioStep.class.getSimpleName()+"'");
        
        MAudioStep mAudioStep = (MAudioStep) this.mElement;
        boolean changed = mElement != mAudioStep;
        if(mAudioStep != null && changed) {
        	//*mAudioStep.getMLeftInputLevelProperty().eAdapters().remove(this);
        	//*mAudioStep.getMRightInputLevelProperty().eAdapters().remove(this);
        	mAudioStep.getMLeftInputDistortionProperty().eAdapters().remove(this);
        	mAudioStep.getMRightInputDistortionProperty().eAdapters().remove(this);
            leftInputLevelMeter.setMElement(null);
            rightInputLevelMeter.setMElement(null);            
        }

        super.setMElement(mElement);
        
        mAudioStep = (MAudioStep) this.mElement;
        if(mAudioStep != null && changed) {
        	//*mAudioStep.getMLeftInputLevelProperty().eAdapters().add(this);
        	//*mAudioStep.getMRightInputLevelProperty().eAdapters().add(this);
        	mAudioStep.getMLeftInputDistortionProperty().eAdapters().add(this);
        	mAudioStep.getMRightInputDistortionProperty().eAdapters().add(this);
            leftInputLevelMeter.setMElement(mAudioStep.getMLeftInputLevelProperty());
            rightInputLevelMeter.setMElement(mAudioStep.getMRightInputLevelProperty());            
       }

 	}
    
    /**
     * Gets the level meter that monitors the left input channel.
     * 
     * @return Returns the level meter that monitors the left input channel.
     */
    public LevelMeter getLeftInputLevelMeter() {
        return leftInputLevelMeter;
    }

    /**
     * Gets the label of level meter that monitors the left input channel.
     * 
     * @return Returns the label of level meter that monitors the left input channel.
     */
    public Label getLeftInputLevelMeterLabel() {
        return leftInputLevelMeterLabel;
    }
    
    /**
     * Gets the level meter that monitors the right input channel.
     * 
     * @return Returns the level meter that monitors the right input channel.
     */
    public LevelMeter getRightInputLevelMeter() {
        return rightInputLevelMeter;
    }

    /**
     * Gets the label of level meter that monitors the right input channel.
     * 
     * @return Returns the label of level meter that monitors the right input channel.
     */
    public Label getRightInputLevelMeterLabel() {
        return rightInputLevelMeterLabel;
    }
    
    /**
     * Gets the label of above the input monitor.
     * 
     * @return Returns the label of above the input monitor.
     */
    public Label getInputMonitorLabel() {
        return inputMonitorLabel;
    }
}

class LevelMeter extends MElementComposite {
	/** Specifies the normal level colour. */
	protected Color normalLevelColour;

	/** Specifies the warning level colour. */
	protected Color warningLevelColour;

	/** Specifies the distorted level colour. */
	protected Color alertLevelColour;

	public LevelMeter(Composite parent, int style) {
		super(parent, style | SWT.NO_BACKGROUND);
		
		normalLevelColour = new Color(getDisplay(), 141, 188, 130);
		warningLevelColour = new Color(getDisplay(), 236, 217, 83);
		alertLevelColour = getDisplay().getSystemColor(SWT.COLOR_RED);
		
        addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent event) {
				if(mElement == null || !(mElement instanceof MProperty) || mElement.eContainer() == null || !(mElement.eContainer() instanceof MAudioStep))
					return;
				
				MAudioStep mAudioStep = (MAudioStep) mElement.eContainer();
				long soundLevel = (Long) ((MProperty) mElement).getValue();
				long headroomDbfs = Math.min(Math.max(mAudioStep.getHeadroomProperty(), 0), Math.round(-MAudioStep.MINIMUM_LEVEL));
				
				// Calculates the headrooms.
				long warningHeadroom;
				long alertHeadroom;
				if(mAudioStep.getUseDbProperty()) {
					warningHeadroom = Math.round(Math.max(-MAudioStep.MINIMUM_LEVEL-headroomDbfs, 0d)/-MAudioStep.MINIMUM_LEVEL*100);
					alertHeadroom = Math.round(Math.max(-MAudioStep.MINIMUM_LEVEL-headroomDbfs/2d, 0d)/-MAudioStep.MINIMUM_LEVEL*100);
				}
				else {
					warningHeadroom = Math.round(Math.pow(10, (MAudioStep.DYNAMIC_RANGE-headroomDbfs)/20d)/MonitoredAudioInputStream.MAXIMUM_LEVEL*100);
					alertHeadroom = Math.round(Math.pow(10, (MAudioStep.DYNAMIC_RANGE-headroomDbfs/2d)/20d)/MonitoredAudioInputStream.MAXIMUM_LEVEL*100);
				}

				Rectangle rect = getClientArea();
				int levelHeight = (int) (rect.height*soundLevel/100f);

				boolean distorted;
				if(mElement.eContainingFeatureID() == LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY)
					distorted = mAudioStep.getLeftInputDistortionProperty();
				else
					distorted = mAudioStep.getRightInputDistortionProperty();
					
				// Paints the background.
				event.gc.setBackground(getParent().getBackground());
	            event.gc.setForeground(getParent().getBackground());
	            event.gc.fillRectangle(0, 0, rect.width, rect.height-levelHeight);

	            // Paints the normal level frame.
	            event.gc.setForeground(normalLevelColour);
				event.gc.drawRectangle(0, (int) (rect.height*(1-warningHeadroom/100f)), rect.width-1, (int) (rect.height*warningHeadroom/100f)-1);

	            // Paints the warning level frame.
	            event.gc.setForeground(warningLevelColour);
				event.gc.drawRectangle(0, (int) (rect.height*(1-alertHeadroom/100f)), rect.width-1, (int) (rect.height*(alertHeadroom-warningHeadroom)/100f)-1);
	            
	            // Paints the alert level frame.
				event.gc.setForeground(alertLevelColour);
				event.gc.drawRectangle(0, 0, rect.width-1, (int) (rect.height*(100-alertHeadroom)/100f)-1);

				// Paints the normal level.
				int normalLevelHeight = (int) (rect.height*Math.min(soundLevel, warningHeadroom)/100f);	            
				event.gc.setBackground(!distorted ? normalLevelColour : alertLevelColour);
	            event.gc.setForeground(!distorted ? normalLevelColour : alertLevelColour);
	            event.gc.fillRectangle(0, rect.height-normalLevelHeight, rect.width, normalLevelHeight);
	            if(soundLevel > warningHeadroom) {
					// Paints the warning level.
                	int warningLevelHeight = (int) (rect.height*Math.min(soundLevel, alertHeadroom)/100f);
                    event.gc.setBackground(!distorted ? warningLevelColour : alertLevelColour);
                    event.gc.setForeground(!distorted ? warningLevelColour : alertLevelColour);
                    event.gc.fillRectangle(0, rect.height-warningLevelHeight, rect.width, warningLevelHeight-normalLevelHeight);               	
                    if(soundLevel > alertHeadroom) {
    					// Paints the alter level.
                   		int distortedLevelHeight = (int) (rect.height*soundLevel/100f);
                   		event.gc.setBackground(alertLevelColour);
                       	event.gc.setForeground(alertLevelColour);
                       	event.gc.fillRectangle(0, rect.height-distortedLevelHeight, rect.width, distortedLevelHeight-warningLevelHeight);               	
                    }
	            }
			}});
	}


	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
		if(notification.getEventType() == Notification.SET)
			redraw();
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) throws IllegalArgumentException {
		if(mElement != null 
				&& mElement.eContainingFeatureID() != LogicPackage.MAUDIO_STEP__MLEFT_INPUT_LEVEL_PROPERTY 
				&& mElement.eContainingFeatureID() != LogicPackage.MAUDIO_STEP__MRIGHT_INPUT_LEVEL_PROPERTY)
			throw new IllegalArgumentException("The parameter 'mElement' must be either the left or the right level managed property of a managed audio step.");
		
		if(this.mElement != null) {
			this.mElement.eAdapters().remove(this);
			setToolTipText(null);
		}
		
		super.setMElement(mElement);

		if(this.mElement != null) {
			this.mElement.eAdapters().add(this);
			setToolTipText(mElement.getDescriptionForUI());
		}
	}
}