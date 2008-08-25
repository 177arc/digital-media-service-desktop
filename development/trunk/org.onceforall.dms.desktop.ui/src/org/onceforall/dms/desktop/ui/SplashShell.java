package org.onceforall.dms.desktop.ui;

import java.util.ResourceBundle;
import java.util.logging.Level;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.onceforall.dms.desktop.logging.Logger;

/**
 * Defines the splash form that is displayed when the application is started.
 *
 * @author Marc
 */
public class SplashShell {
	/** Specifies the only instance of the splash form class. */
	protected static SplashShell instance;
	
	/** Specifies the shell that this splash form is connected to. */
	protected Shell shell = null;
	
    /** Specifies the SWT display of the application. */ 
    protected Display display;
    
    /** Specifies the label that displays the version information. */
    protected Label versionLabel;
	
    /**
     * Creates a new splash shell object.
     */
    protected SplashShell() {	
		shell = new Shell(SWT.NO_TRIM);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		Image image = new Image(shell.getDisplay(), "Image Files\\Splash.png");
		ImageData imageData = image.getImageData();
		Rectangle screen = shell.getDisplay().getBounds();
	    
	    ResourceBundle bundle = ResourceBundle.getBundle("build-info");
	    String version = bundle.getString("version");
	    String date = bundle.getString("date");
	    String build = bundle.getString("build");	
		versionLabel = new Label(shell, SWT.CENTER);
		versionLabel.setText("Version "+version+"."+build+" (built on "+date+")");
		versionLabel.setForeground(new Color(shell.getDisplay(), 55, 96, 146));
		versionLabel.pack();
		versionLabel.setBounds(5, imageData.height-35-versionLabel.getBounds().height, 
				imageData.width-10, versionLabel.getBounds().height);
		
		shell.setText("Digital Media Service Desktop");
		//shell.setLayout(gridLayout);
		shell.setSize(imageData.width, imageData.height);
		shell.setLocation(screen.width/2-imageData.width/2, screen.height/2-imageData.height/2);
		shell.setBackgroundImage(image);
    	display = shell.getDisplay();
    }
    
    public static SplashShell getInstance() {
		if(instance != null)
			return instance;
		
		instance = new SplashShell();
		return instance;
    	
    }
	/**
	 * Displays the form and then handles all events.
	 */
	public void open() {
		shell.open();
	}
	
	/**
	 * Closes and disposes the form.
	 */
	public void dispose() {
		shell.dispose();
	}
	
	/**
	 * Processes the windows messages.
	 */
	protected void processMessages() {	    
	    // Defines the main message loop.
	    while(!shell.isDisposed())
		    try {
		         // Processes windows events.
		         while(display.readAndDispatch());

		         if(shell.isDisposed())
		             break;
	             
	             Thread.sleep(100);
	 	    }
	 	    catch(Throwable throwable) {
	 	        Logger.getLogger().log(Level.SEVERE, throwable.getMessage(), throwable);
	 	    }
	}
	

}
