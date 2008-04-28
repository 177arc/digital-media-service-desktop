package org.eclipse.swt.widgets;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
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
	
	/** Specifies an hourglass cursor. */
	protected Cursor waitCursor;

	/**
	 * Creates a new managed element open button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MValueOpenButton(Composite parent, int style) {
		super(parent, style);
        
        // Creates the hourglass cursor.
        waitCursor = new Cursor(getDisplay(), SWT.CURSOR_WAIT);
        
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
			getShell().setCursor(waitCursor);
			Type valueType = mValue.getValueType();
			if(valueType == Type.URL_TYPE) {
				URL url = getURL(mValue);
				if(url != null)
					desktop.browse(url.toURI());
			}
			else if(valueType == Type.FILE_TYPE || valueType == Type.EXISTING_FILE_TYPE
					|| valueType == Type.DIRECTORY_TYPE || valueType == Type.EXISTING_DIRECTORY_TYPE) {
				// Gets the file whether the managed value can hold a single file or multiple files.
				File file = getFile(mValue);
				
				if(file != null) {
					String fileName = file.getName().toLowerCase();
					if(!fileName.endsWith(".mp3") && !fileName.endsWith(".wav"))
						desktop.open(file);
					else
						CommandLineInterface.execute(new String[] {"rundll32 url.dll,FileProtocolHandler", "\""+file.toURI().toURL()+"\""}, null);
				}
			}
			
		} catch (IOException exception) {
			Logger.getLogger().log(Level.WARNING, "The application could not open '"+mValue.getValueForUI()+"' in an external viewer. ", exception);					
		} catch (URISyntaxException exception) {
			Logger.getLogger().log(Level.WARNING, "The application could not open '"+mValue.getValueForUI()+"' in an external viewer. ", exception);
		}
		finally {
			getShell().setCursor(null);
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
    	
    	Type valueType = mValue.getValueType();
		if(mValue.getValue() == null || (valueType != Type.URL_TYPE && valueType != Type.FILE_TYPE && valueType != Type.EXISTING_FILE_TYPE && valueType != Type.DIRECTORY_TYPE && valueType != Type.EXISTING_DIRECTORY_TYPE) || desktop == null)
			return false;
		
		if(valueType == Type.URL_TYPE && !desktop.isSupported(Desktop.Action.BROWSE))
			return false;
		
		if((mValue.getValueType() == Type.FILE_TYPE || valueType == Type.EXISTING_FILE_TYPE || valueType == Type.DIRECTORY_TYPE || valueType == Type.EXISTING_DIRECTORY_TYPE) && !desktop.isSupported(Desktop.Action.OPEN))
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
			Type valueType = mValue.getValueType();
			if(showOpenExternalViewer(mValue) && !mValue.isEmpty()) {
				if(valueType == Type.URL_TYPE ) {
					setToolTipText("Opens the URL in the default web browser.");
					setEnabled(true);
				}
				else if(valueType == Type.FILE_TYPE 
						|| valueType == Type.EXISTING_FILE_TYPE
						|| valueType == Type.DIRECTORY_TYPE
						|| valueType == Type.EXISTING_DIRECTORY_TYPE) {
					// Gets the file whether the managed value can hold a single file or multiple files.
					File file = getFile(mValue);
					setEnabled(file != null && file.exists());
				
					if(file != null && !file.isDirectory())
						setToolTipText("Opens the file with its default viewer.");
					else
						setToolTipText("Opens the folder in the default file browser.");
				}
				
				setVisible(true);
			}
		}
	}
	
	/**
	 * Gets the file value from the given managed value. If the value is an array, it returns the 
	 * the parent directory of the first file. If the managed value is <code>null</code>
	 * or not of a file type, it returns <code>null</code>. 
	 * 
	 * @param mValue Specifies the managed value from which to get the file.
	 * @return Returns the file value from the given managed value.
	 */
	private File getFile(MValue mValue) {
		Type valueType = mValue.getValueType();
		if(valueType != Type.FILE_TYPE && valueType != Type.EXISTING_FILE_TYPE
				&& valueType != Type.DIRECTORY_TYPE && valueType != Type.EXISTING_DIRECTORY_TYPE)
			return null;
		
		File file;
		if(mValue.getUpperBound() == 1)
			file = (File) mValue.getValue();
		else {
			file = (File) ((java.util.List) mValue.getValue()).get(0);
			if(file.getParentFile() != null)
				file = file.getParentFile();
		}
		
		return file;
	}
	
	/**
	 * Gets the URL value from the given managed value. If the value is an array, it returns the 
	 * the first URL. If the managed value is <code>null</code>
	 * or not of a URL type, it returns <code>null</code>. 
	 * 
	 * @param mValue Specifies the managed value from which to get the URL.
	 * @return Returns the file value from the given managed value.
	 */
	private URL getURL(MValue mValue) {
		Type valueType = mValue.getValueType();
		if(valueType != Type.URL_TYPE)
			return null;
		
		URL url;
		if(mValue.getUpperBound() == 1)
			url = (URL) mValue.getValue();
		else
			url = (URL) ((java.util.List) mValue.getValue()).get(0);
		
		return url;
	}
}
