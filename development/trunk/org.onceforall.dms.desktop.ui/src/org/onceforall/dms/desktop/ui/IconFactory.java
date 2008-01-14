/*
 * Revision History:
 * $Log: IconFactory.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 *
 */
package org.onceforall.dms.desktop.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines an icon factory that makes sure that make sure that no duplicate instances are returned by the
 * factory.
 * 
 * @author Marc
 */
public class IconFactory {
	/** Specifies the map that contains the already created icons, indexed by a combination of file path of the icon and the overlay icon. */
	protected Map<String, Image> iconsByPaths = new HashMap<String, Image>();
	
	/** Specifies the only instance of this class. */
	protected static IconFactory instance = new IconFactory();
	
	/**
	 * Creates a new icon factory.
	 */
	private IconFactory() {
		super();
	}
	
	/**
	 *  Gets the icon with the given file paths. If it does not exist, it creates it, 
	 *  adds it to the cache and returns it.
	 * 
	 * @param iconFilePath Specifies the file path of the icon.
	 * @return Returns the icon.
	 */
	public Image get(File iconFilePath) {
		return get(iconFilePath, null);
	}
	
	/**
	 *  Gets the icon for the given managed element. If it does not exist, it creates it, 
	 *  adds it to the cache and returns it.
	 * 
	 * @param element Specifies the base object.
	 * @return Returns the icon. It returns <code>null</code>, if the managed element does not specify an icon.
	 */
	public Image get(MElement element) {
		return get(element.getIconFilePath(), element.getOverlayIconFilePath());
	}
	
	/**
	 *  Gets the icon with the given file paths. If it does not exist, it creates it, 
	 *  adds it to the cache and returns it.
	 * 
	 * @param baseIconFilePath Specifies the file path of the base icon. (Optional)
	 * @param overlayIconFilePath Specifies the file path of the overlay icon. (Optional)
	 * @return Returns the icon. It returns <code>null</code>, if  <code>baseIconFilePath</code> is <code>null</code>.
	 */
	public Image get(File baseIconFilePath, File overlayIconFilePath) {
		if(baseIconFilePath == null)
			return null;
		
		Image icon = null;
		try {
			icon = iconsByPaths.get(baseIconFilePath+"::"+overlayIconFilePath);
			if(icon == null) {
				if(overlayIconFilePath != null) {
					OverlayImageDescriptor descriptor = new OverlayImageDescriptor(
						new Image(Display.getCurrent(), baseIconFilePath.getPath()),
						new Image(Display.getCurrent(), overlayIconFilePath.getPath()));
					icon = descriptor.createImage();
				}
				else
					icon = new Image(Display.getCurrent(), baseIconFilePath.getPath());
				
				iconsByPaths.put(baseIconFilePath+"::"+overlayIconFilePath, icon);
			}
		}
		catch(SWTException exception) {
			if(!(exception.getCause() instanceof FileNotFoundException))
				throw exception;
					
			// Makes sure that missing icons do not terminate the application.
			if(baseIconFilePath != null && !baseIconFilePath.exists())
				Logger.getLogger().warning("No icon could be found at '"+baseIconFilePath.getAbsolutePath()+"'.");
			
			if(overlayIconFilePath != null && !overlayIconFilePath.exists())
				Logger.getLogger().warning("No icon could be found at '"+overlayIconFilePath.getAbsolutePath()+"'.");
		}
		
		return icon;
	}

	/**
	 * Gets the only instance of this class.
	 * 
	 * @return Returns  the only instance of this class.
	 */
	public static IconFactory getInstance() {
		return instance;
	}
}
