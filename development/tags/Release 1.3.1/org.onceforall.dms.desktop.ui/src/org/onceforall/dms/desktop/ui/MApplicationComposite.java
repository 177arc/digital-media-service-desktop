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


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationAdapter;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.TitleEvent;
import org.eclipse.swt.browser.TitleListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.FormColors;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines an SWT composite that is responsible for displaying the 
 * {@linkplain org.onceforall.dms.desktop.logic.MApplication application} object.
 */

public class MApplicationComposite extends MObjectComposite {
	/** Specifies the browser tool bar. */
	protected Composite toolBarComposite;
	
	/** Specifies the title label. It also displays the URL when the mouse pointer is over the label. */ 
	protected Text titleText;
	
	/** Specifies the browser refresh button. */
	protected Button refreshButton;
	
	/** Specifies the browser stop button. */
	protected Button stopButton;
	
	/** Specifies the browser backward navigation button. */
	protected Button backwardButton;
	
	/** Specifies the browser forward navigation button. */
	protected Button forwardButton;
	
	/** Specifies the browser for displaying the information web page. */
	protected Browser browser;
	
    /** Specifies the save application data button. */
    protected Button saveDataButton;
    
    /** Specifies the current browser location. */
    protected String location;
    
    /** Specifies the current browser title. */
    protected String title;
    
    /** Specifies the information web page template for displaying messages. */
    protected String webPageTemplate;
   
    /**
     * Creates a new application composite object.
     *
     * @param parent Specifies the parent of the application composite object. 
     * @param style Specifies the style of the application composite object.
     */
    public MApplicationComposite(Composite parent, int style) {
        super(parent, style);
        
        propertiesTableComposite.setParent(this); // Removes the properties table.
        
        // Loads the template.
        
        char[] buffer = new char[20000];
        File messageTemplateFile = new File("Application Data Files\\message-template.html");
		try {
			FileReader reader = new FileReader(messageTemplateFile);
	        int charactersRead = reader.read(buffer, 0, 20000);
	        webPageTemplate = "";
	        while(charactersRead >= 0) {
	        	webPageTemplate += new String(buffer, 0, charactersRead);
	        	charactersRead = reader.read(buffer, 0, 20000);
	        }
		} catch (IOException exception) {
			Logger.getLogger().log(Level.SEVERE, "Failed loading message template from '"+messageTemplateFile.getAbsolutePath()+"':"+exception.getMessage(), exception);
		}
		
		if(webPageTemplate == null)
			webPageTemplate = "<html><head><title><!-- title placeholder --></title></head><body><!-- body placeholder --></body></html>";
		 
        // Adds the browser tool bar.
        toolBarComposite = getDefaultFormToolkit().createComposite(contentForm.getBody());
        GridLayout gridLayout = new GridLayout(5, false);
        gridLayout.marginRight = 0;
        gridLayout.marginLeft = 0;
        toolBarComposite.setLayout(new GridLayout(5, false));
        toolBarComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
        toolBarComposite.setBackground(getDefaultFormToolkit().getColors().getInactiveBackground());
        
        // Adds the title/location indicator.
        titleText = getDefaultFormToolkit().createText(toolBarComposite, "Loading ...");
        FormColors formColours = getDefaultFormToolkit().getColors();
        Color titleColour = formColours.getColor("org.eclipse.ui.forms.TITLE");
        titleText.setForeground(titleColour);
        Font font = new Font(Display.getDefault(), nameLabel.getFont().getFontData()[0].getName(),
        		12, SWT.BOLD);
        titleText.setFont(font);    
        titleText.setEditable(false);
        titleText.addMouseTrackListener(new MouseTrackAdapter() {
			/**
			 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseEnter(org.eclipse.swt.events.MouseEvent)
			 */
			@Override
			public void mouseEnter(MouseEvent event) {
				titleText.setText(location);
			}

			/**
			 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseExit(org.eclipse.swt.events.MouseEvent)
			 */
			@Override
			public void mouseExit(MouseEvent event) {
				titleText.setText(title);
			}
        });
        titleText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, true));
        titleText.setToolTipText("Shows the title and URL of the current web page. Please note that the URL cannot be edited.");
        titleText.setBackground(getDefaultFormToolkit().getColors().getInactiveBackground());
        
        // Adds the browser stop button.
        stopButton = getDefaultFormToolkit().createButton(toolBarComposite, "", SWT.FLAT);
        stopButton.setImage(iconCache.get(new File("Image Files\\Stop.gif")));
        stopButton.setToolTipText("Stops the browser from loading any more data from the current URL and stops the execution of all scripts in the web page.");
        stopButton.addSelectionListener(new SelectionAdapter() {
			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				browser.stop();
			}   	
        });
        stopButton.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, true));
       
        // Adds the browser refresh button.
        refreshButton = getDefaultFormToolkit().createButton(toolBarComposite, "", SWT.FLAT);
        refreshButton.setImage(iconCache.get(new File("Image Files\\Refresh.gif")));
        refreshButton.setToolTipText("Loads the current web page again.");
        refreshButton.addSelectionListener(new SelectionAdapter() {
			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				if(location != null && browser.getUrl() != null && location.equals(browser.getUrl()))
					browser.refresh();
				else
					navigateToUrl(location);		
			}   	
        });
        refreshButton.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, true));
        
        // Adds the browser backward naviagiton button.
        backwardButton = getDefaultFormToolkit().createButton(toolBarComposite, "", SWT.FLAT);
        backwardButton.setImage(iconCache.get(new File("Image Files\\Backward.gif")));
        backwardButton.setToolTipText("Goes to the previous web page.");
        backwardButton.addSelectionListener(new SelectionAdapter() {
			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				browser.back();
			}   	
        });
        backwardButton.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, true));
        
        // Adds the browser forward naviagiton button.
        forwardButton = getDefaultFormToolkit().createButton(toolBarComposite, "", SWT.FLAT);
        forwardButton.setImage(iconCache.get(new File("Image Files\\Forward.gif")));
        forwardButton.setToolTipText("Goes to the next web page.");
        forwardButton.addSelectionListener(new SelectionAdapter() {
			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				browser.forward();
			}   	
        });
        forwardButton.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, true));
     
        
        GridData layoutData;
        // Adds the browser for displaying the information web page.
        browser = new Browser(contentForm.getBody(), SWT.NONE);
        browser.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
        browser.setText(webPageTemplate.replaceFirst("<!-- title placeholder -->", "Information: Loading information web page.")
        		.replaceFirst("<!-- body placeholder -->", "<p>Attempting to load information web page ... </p>"));
        browser.addLocationListener(new LocationAdapter() {

			/**
			 * @see org.eclipse.swt.browser.LocationAdapter#changed(org.eclipse.swt.browser.LocationEvent)
			 */
			@Override
			public void changed(LocationEvent event) {
				// Makes sure that the location is only updated with valid URLs.
				try {
					new URL(event.location);
					location = event.location;
				} catch (MalformedURLException e) {
					// Does nothing.
				}
				backwardButton.setEnabled(browser.isBackEnabled());
				forwardButton.setEnabled(browser.isForwardEnabled());
				browser.setCursor(null);
			}

			/**
			 * @see org.eclipse.swt.browser.LocationAdapter#changing(org.eclipse.swt.browser.LocationEvent)
			 */
			@Override
			public void changing(LocationEvent arg0) {
				backwardButton.setEnabled(browser.isBackEnabled());
				forwardButton.setEnabled(browser.isForwardEnabled());
				browser.setCursor(waitCursor);
			}
        	
        });
        
        browser.addTitleListener(new TitleListener() {
			public void changed(TitleEvent event) {
				title = event.title;
				titleText.setText(event.title);		
			}});
        
        propertiesTableComposite.setParent(contentForm.getBody()); // Adds the properities table again so that it appears after the browser.
        propertiesTableComposite.setExpanded(false);
        
        // Adds the save button.
        saveDataButton = new Button(this, SWT.NONE);
        layoutData = new GridData(GridData.END, GridData.END, true, false);
        layoutData.widthHint = 100;
        
        saveDataButton.setText("Save data");
        saveDataButton.setToolTipText("Saves the application data to the file system.");
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
        
        if(mElement != null) {
        	// Assembles the URL of the information page.
        	MApplication mApplication = (MApplication) mElement;
    	    
    	    ResourceBundle bundle = ResourceBundle.getBundle("build-info");
    	    String version = bundle.getString("version");
    	    String user = bundle.getString("user");
    	    String date = bundle.getString("date");
    	    String build = bundle.getString("build");
    	   
    	    StringBuilder urlBuilder = new StringBuilder();
    	    urlBuilder.append(mApplication.getInfoWebPageProperty().toExternalForm());
    	    try {
    	    	urlBuilder.append("?version=");
				urlBuilder.append(URLEncoder.encode(version, "UTF-8"));
    	    	urlBuilder.append("&user=");
				urlBuilder.append(URLEncoder.encode(user, "UTF-8"));
    	    	urlBuilder.append("&date=");
				urlBuilder.append(URLEncoder.encode(date, "UTF-8"));
    	    	urlBuilder.append("&build=");
				urlBuilder.append(URLEncoder.encode(build, "UTF-8"));
			} catch (UnsupportedEncodingException exception) {
				Logger.getLogger().log(Level.SEVERE, exception.getMessage(), exception);
			}   	       	    
    	    
        	// Requests the information page.
			location = urlBuilder.toString();
			navigateToUrl(location);
        }
    }
    
    /**
     * Sets the given URL on the browser. However, it first tests whether internet connectivity exists.
     * 
     * @url Specifies the URL to naviagate to.
     * @return Returns whether the browser could connect to the URL or not.
     */
    protected boolean navigateToUrl(String url) {
		try {
			URLConnection connection = new URL(url).openConnection();
			connection.setConnectTimeout(10000);
			connection.connect();
			browser.setUrl(url);
			return true;
		} catch (MalformedURLException e) {
			titleText.setText(e.getMessage());
		} catch (UnknownHostException e) {
			if(url != null)
				browser.setText(webPageTemplate.replaceFirst("<!-- title placeholder -->", "Warning: Could not retrieve to information web page!")
						.replaceFirst("<!-- body placeholder -->", "<div class=\"warning\">\n"
						+"<p>The Digital Media Service Desktop application currently cannot access the <a href=\""+url+"\">information web page</a>. The most likely cause for this is that the application cannot access the internet.</p>\n"
						+"<p>You may continue using this application but you will not be able to publish recordings or send emails until an internet connection is available. You can use the refresh button at the top of this page to try connecting again. If this application can access the internet, you should see a web page instead of this message.</p>\n"
						+"<p>Possible problems are:</p>\n"
						+"<ul>\n"
						+"<li>No physical network connection exists, e.g. cable unplugged.</li>\n"
						+"<li>Firewall blocks this application or port 80.</li>\n"
						+"<li>Your network connects to the internet via a proxy server. Please email\n"
						+"<a href=\"mailto:dms@onceforall.org\">dms@onceforall.org</a> for help.</li>\n"
						+"</ul>\n"
						+"</div>"));
		} catch (IOException e) {
			titleText.setText(e.getMessage());
		}
		
		return false;
    }
}
