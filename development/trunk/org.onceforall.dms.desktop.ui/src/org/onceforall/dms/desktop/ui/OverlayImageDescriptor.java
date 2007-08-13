/*
 * Revision History:
 * $Log: OverlayImageDescriptor.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
*/

package org.onceforall.dms.desktop.ui;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;

/**
 * Defines an image descriptor that overlays one icon over a base icon.
 * It place the overlay icon in the bottom-right corner of the base icon.
 * 
 * @author Marc
 *
 */
public class OverlayImageDescriptor extends org.eclipse.jface.resource.CompositeImageDescriptor {
	// Specifies the base icon.
	private Image baseIcon;
	
	// Specifies the overlay icon.
	private Image overlayIcon;
	
	/**
	 * Creates a new overlay image descriptor.
	 * 
	 * @param baseIcon Specifies the base icon.
	 * @param overlayIcon Specifies the overlay icon.
	 */
	public OverlayImageDescriptor(Image baseIcon, Image overlayIcon) {
		this.baseIcon = baseIcon;
		this.overlayIcon = overlayIcon;
	}

	@Override
	protected void drawCompositeImage(int width, int height) {
		ImageData baseImageData = baseIcon.getImageData();
		ImageData overlayImageData = overlayIcon.getImageData();
		
		drawImage(baseImageData, 0, 0);
		drawImage(overlayImageData, baseImageData.width-overlayImageData.width, baseImageData.height-overlayImageData.height);
	}

	@Override
	protected Point getSize() {
		return new Point(baseIcon.getImageData().width, baseIcon.getImageData().height);
	}

}
