package org.eclipse.swt.widgets;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;

import org.onceforall.dms.desktop.interfaces.CommandLineInterface;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.logic.types.Type;
import org.onceforall.dms.desktop.ui.MElementButton;

/**
 * Defines a button that opens managed elements of a supported value type in an
 * external viewer. Currently only files and URLs are supported.
 * 
 * @author Marc
 */
public class MValueOpenButton extends MElementButton {
	/** Specifies the open icon file. */
	protected final static File OPEN_ICON_FILE = new File("Image Files\\Open.gif");
    
    /** Specifies the desktop to use for accessing platform-dependent features such as opening a URL in a browser. */
    protected Desktop desktop;

	/**
	 * Creates a new managed element open button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MValueOpenButton(Composite parent, int style) {
		super(parent, style);
        
        if(Desktop.isDesktopSupported()) {
        	desktop = Desktop.getDesktop();
        }
		
		setImage(iconCache.get(OPEN_ICON_FILE));
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#performAction()
	 */
	@Override
	protected void performAction() {
		// Checks pre-conditions for opening the value in an external viewer.
		MValue mValue = (MValue) mElement;
		if(!showOpenExternalViewer(mValue))
			return;
		
		// Opens value in an external viewer.
		try {
			if(mValue.getValueType() == Type.URL_TYPE)
				desktop.browse(((URL) mValue.getValue()).toURI());
			
			else if(mValue.getValueType() == Type.FILE_TYPE || mValue.getValueType() == Type.EXISTING_FILE_TYPE) {
				File file = (File) mValue.getValue();
				String fileName = file.getName().toLowerCase();
				if(!fileName.endsWith(".mp3") && !fileName.endsWith(".wav"))
					desktop.open(file);
				else
					CommandLineInterface.execute(new String[] {"rundll32 url.dll,FileProtocolHandler", "\""+file.toURI().toURL()+"\""}, null);
			}
			
		} catch (IOException exception) {
			Logger.getLogger().log(Level.WARNING, "The application could not open '"+mValue.getValueForUI()+"' in an external viewer. ", exception);					
		} catch (URISyntaxException exception) {
			Logger.getLogger().log(Level.WARNING, "The application could not open '"+mValue.getValueForUI()+"' in an external viewer. ", exception);
		}

	}
    
    /**
     * Determines whether pre-conditions for opening the given managed value in an external viewer are met.
     * 
     * @param mValue Specifies the managed value to open.
     * @return Returns whether pre-conditions for opening the given managed value in an external viewer are met.
     */
    protected boolean showOpenExternalViewer(MValue mValue) {
    	if(desktop == null)
    		return false;
    	
		if(mValue.getValue() == null || (mValue.getValueType() != Type.URL_TYPE && mValue.getValueType() != Type.FILE_TYPE && mValue.getValueType() != Type.EXISTING_FILE_TYPE) || desktop == null)
			return false;
		
		if(mValue.getValueType() == Type.URL_TYPE && !desktop.isSupported(Desktop.Action.BROWSE))
			return false;
		
		if((mValue.getValueType() == Type.FILE_TYPE || mValue.getValueType() == Type.EXISTING_FILE_TYPE) && !desktop.isSupported(Desktop.Action.OPEN))
			return false;
		
		return true;
    }

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementButton#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) {
		// Makes sure that the new managed element is actually different to the
		// current one.
		if (mElement == null && this.mElement == null)
			return;

		if (mElement != null && mElement.equals(this.mElement))
			return;

		// Makes sure that the managed element is a managed value.
		if (mElement != null && !(mElement instanceof MValue)) {
			setVisible(false);
			throw new IllegalArgumentException("The parameter 'mElement' must be an instance of MValue.");
		}
		
		super.setMElement(mElement);
		
		if(mElement != null) {
			MValue mValue = (MValue) mElement;
			if(showOpenExternalViewer(mValue) && mValue.getValue() != null) {
				if(mValue.getValueType() == Type.URL_TYPE ) {
					setToolTipText("Opens the URL in the default web browser.");
					setEnabled(true);
				}
				else if(mValue.getValueType() == Type.FILE_TYPE || mValue.getValueType() == Type.EXISTING_FILE_TYPE) {
					File file = (File) mValue.getValue();
					setEnabled(file.exists());
					
					if(!file.isDirectory())
						setToolTipText("Opens the file with its default viewer.");
					else
						setToolTipText("Opens the folder in the default file browser.");
				}
				
				setVisible(true);
			}
		}
	}
   
}
