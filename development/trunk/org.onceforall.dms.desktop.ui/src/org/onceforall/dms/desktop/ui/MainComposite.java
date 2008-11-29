/*
 * Revision History:
 * $Log: MainComposite.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.5  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.4  2005/08/03 21:33:35  Marc
 * Corrected problem with detailed composite horizontically extending beyond the frame boundaries.
 *
 * Revision 1.3  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.2  2005/06/12 12:09:50  Marc
 * Updated for version 0.4.3.
 *
 * Revision 1.1  2005/05/22 17:01:28  Marc
 * Renamed MainForm.
 *
 * Revision 1.4  2005/04/09 17:57:54  Marc
 * Updated for version 0.4.
 *
 * Revision 1.3  2005/03/18 00:42:24  Marc
 * Made sure that the application shut-down does not throw exceptions.
 *
 * Revision 1.2  2005/03/13 14:20:40  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:02  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.onceforall.dms.desktop.Main;
import org.onceforall.dms.desktop.Utilities;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logging.Logger;
import org.onceforall.dms.desktop.logging.MemoryHandler;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MDmsApplicationMGetDataUpgradeInfoStep;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MScript;
import org.onceforall.dms.desktop.logic.MStatefulObject;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * Defines the composite that represent the main container of the Digital Media Service Desktop
 * application.
 */

public class MainComposite extends MElementComposite { 
    /** Specifies the script to be followed. */
    protected MScript script;

    /** Specifies the SWT display of the application. */ 
    protected Display display;

    /** Specifies the last state of the current mStep. */
    protected String previousStepState;
    
    /** Specifies the memory hanlder that stores and publishes all logged events. */
    protected MemoryHandler memoryHandler;
    
    /** Specifies the number of displayed events. */
    protected int eventCount;
	
	/** Specifies the application navigation tree. */
	protected Tree applicationTree;
	
	/** Specifies the main tree selector for the application. */
	protected MElementTreeSelectorComposite treeSelectorComposite;
	
	/** Specifies the label of the event log table. */
	protected Label eventLogTableLabel;
	
	/** Specifies the table listing all logged events. */
	protected Table eventLogTable;
	
	/** Specifies the section that contains the event log table. */
	protected Section eventLogSection;
	
	/** Specifies the composite that is responsible for displaying the details of a selected managed element in the application tree. */
	protected MElementComposite mElementComposite;

	/** Specifies the scrollable composite that is responsible for displaying the details of a selected managed element in the application tree. */
	protected ScrolledComposite scrolledComposite;
	
	/** Specifies the icon for an error event log entry. */
	protected Image errorEventIcon;
	
	/** Specifies the icon for an warning event log entry. */
	protected Image warningEventIcon;
	
	/** Specifies the icon for an information event log entry. */
	protected Image informationEventIcon;
	
	/** Specifies the mStep that (when completed) triggers the next mStep. */
	protected MStep triggerStepForNextStep;
	
	/** Specifies the mStep that should be started next. */
	protected MStep mNextStep;
	
	/** Specifies whether the Ctrl key is pressed. */
	protected boolean ctrlPressed;
	
    /**
     * Creates a new main composite.
     *
     * @param shell Specifies the shell that contains the main composite.
     * @param style Specifies the style of the shell.
	 * @throws DesktopException Thrown if the application cannot load the application data.
     */
    public MainComposite(Shell shell, int style) throws DesktopException {
        super(shell, style);
        
        setCursor(waitCursor);
        
       // Sets the background colour according to the forms colour scheme.
       FormColors formColours =  getDefaultFormToolkit().getColors();
       setBackground(formColours.getBackground());
       
 	   // Finds the memory handler in the logger. 
 	   Handler[] handlers = Logger.getLogger().getHandlers();
 	   for(int index = 0; index < handlers.length; ++index)
 	       if(handlers[index] instanceof MemoryHandler) {
 	           memoryHandler = (MemoryHandler) handlers[index];
 	           break;
 	       }
 	   
 	    display = shell.getDisplay();
 	    
		GridLayout layout = new GridLayout();
	    setLayout(layout);

 	   	SashForm form = new SashForm(this, SWT.HORIZONTAL);
 	   	form.setBackground(formColours.getColor(FormColors.TB_GBG));
 	   	GridData layoutData = new GridData(GridData.FILL, GridData.FILL, true, true);
		form.setLayoutData(layoutData);
		
		MApplication.getInstance().getMLogFileProperty().setValue(new File(Logger.getLogger().getLogFileName()));
		
		//createApplicationTree(form);
		treeSelectorComposite = new MElementTreeSelectorComposite(form, SWT.NONE);
		treeSelectorComposite.eAdapters().add(this);
		treeSelectorComposite.setMElement(MDmsApplication.getInstance());
		
		scrolledComposite = new ScrolledComposite(form, SWT.V_SCROLL);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
 	   	form.setWeights(new int[]{30, 70});

		createEventLogTable();
		
		display.addFilter(SWT.KeyDown, new Listener() {
            public void handleEvent(org.eclipse.swt.widgets.Event event) {
                   keyPressed(event);
                }
            }

		);
		
		display.addFilter(SWT.KeyUp, new Listener() {
            public void handleEvent(org.eclipse.swt.widgets.Event event) {
                   keyReleased(event);
                }
            }

		);
		
		addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent event) {
                widgetDisposedEvent();
            }
		    
		});
		
		
		TreeIterator iterator = MApplication.getInstance().eAllContents();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			
		    if(object instanceof MStatefulObject)
		    	((MStatefulObject) object).getMStateProperty().eAdapters().add(this);
		}
		
		setCursor(null);
    }
	
	/**
	 * Called when the application is closed.
	 */
	protected void widgetDisposedEvent() {
		if(mElementComposite != null)
			mElementComposite.setMElement(null);                	    
	}
	
	/**
	 * Processes all key-down events that occur in the application before they
	 * can be proccessed by the target widget.
	 *
	 * @param event Holds the event to be processed.
	 */
	protected void keyPressed(org.eclipse.swt.widgets.Event event) {
	    ctrlPressed = (event.keyCode == SWT.CONTROL);
	}
	
	/**
	 * Processes all key-up events that occur in the application before they
	 * can be proccessed by the target widget.
	 *
	 * @param event Holds the event to be processed.
	 */
	protected void keyReleased(org.eclipse.swt.widgets.Event event) {
	    ctrlPressed = false;

	    char key = (char) event.keyCode;
	    if(key == 's' && event.stateMask == SWT.CONTROL)
	    	MApplication.getInstance().saveToXML();
	    else if (mElementComposite instanceof MStepComposite) {
	        MStepComposite mStepComposite = (MStepComposite) mElementComposite;
            MStep mStep = (MStep) mStepComposite.getMElement();
	       
	        if(event.keyCode == SWT.F2)
	            // Starts the current mStep.
	            mStepComposite.start();
	        
	        else if(event.keyCode == SWT.F3)
	            // Stops the current mStep.
	            mStepComposite.stop();
	         
	        else if(event.keyCode == SWT.F4)
	            // Terminates the current mStep.
	            mStepComposite.terminate();
	        
	        else if(event.keyCode == SWT.F5)
	            // Skips the current mStep.
	            mStepComposite.skip();
	        
	        else if(event.keyCode == SWT.F6) {
	            // Goes to the previous mStep.
	            if(mStep != null && mStep.eContainer() instanceof MScript) {
	            	MScript mScript = (MScript) mStep.eContainer();
	            	EList<MStep> mSteps = mScript.getMSteps();
	            	int index = mSteps.indexOf(mStep);
	            	if(index > 0)
	            		selectMElement(mSteps.get(index-1), false);
	            }
	        }

	        else if(event.keyCode == SWT.F7) {
	            // Goes to the next mStep.
	            if(mStep != null && mStep.eContainer() instanceof MScript) {
	            	MScript mScript = (MScript) mStep.eContainer();
	            	EList<MStep> mSteps = mScript.getMSteps();
	            	int index = mSteps.indexOf(mStep);
	            	if(index < mSteps.size()-1)
	            		selectMElement(mSteps.get(index+1), false);
	            }
	        }

	        else if(event.keyCode == SWT.F8) {
                // Stops the current mStep, goes to the next mStep and starts it, if the mStep is processing.
	            if(mStep.isInProcessingState()) {
	                mStepComposite.stop(); 
	                //?triggerStepForNextStep = mStep;
	            }
	            
                MScript mScript = (MScript) mStep.eContainer();
            	EList<MStep> mSteps = mScript.getMSteps();
            	int index = mSteps.indexOf(mStep);
            	if(index < mSteps.size()-1)
            		mNextStep = mSteps.get(index+1);
            	
                if(mNextStep != null) {
                	while(display.readAndDispatch());
                    // Starts the next mStep immediately, if the current mStep is not processing.
                    // Otherwise the application has to wait for the mStep completion notification first (see update method).
                    if(!mStep.isInProcessingState()) {
	                    selectMElement(mNextStep, false);
	                    ((MStepComposite) mElementComposite).start();
                    }
                }
	        }
	    }
	}
	
	/**
	 * Creates the application tree selector and populates the tree by adding all stateful objects
	 * under the application business object.
	 * 
	 * @param form Specifies the sash form that will diplay this tree on the left-hand side.
	 */
	/*?protected void createApplicationTree(SashForm form) {
	    applicationTree = getDefaultFormToolkit().createTree(form, SWT.SINGLE);
		applicationTree.addSelectionListener(new SelectionAdapter() {
		    @Override
			public void widgetSelected(SelectionEvent event) {
		        applicationTreeSelected(event);
		    }
		});
		
		updateApplicationTree();
	}*/
	
	/**
	 * Creates the table for listing all logged events.
	 */    
	private void createEventLogTable() {
		
		eventLogSection = getDefaultFormToolkit().createSection(this, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | ExpandableComposite.FOCUS_TITLE | ExpandableComposite.EXPANDED);
		eventLogSection.setText("Events");

		final ScrolledForm eventScrollForm = getDefaultFormToolkit().createScrolledForm(eventLogSection);
		eventScrollForm.getBody().setLayout(new GridLayout());
		eventScrollForm.setMinHeight(100);
		eventScrollForm.setExpandVertical(true);
		eventLogTable = getDefaultFormToolkit().createTable(eventScrollForm.getBody(), SWT.FULL_SELECTION);
		eventLogTable.setHeaderVisible(true);
		GridData layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
		layoutData.heightHint = 100;
		eventLogTable.setLayoutData(layoutData);
		
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
		eventLogSection.setClient(eventScrollForm);
		eventLogSection.setLayoutData(layoutData);
		
		TableColumn column;
		column = new TableColumn(eventLogTable, SWT.NONE);
		column.setText("Level");
		column.setWidth(70);
		
		column = new TableColumn(eventLogTable, SWT.NONE);
		column.setText("Time");
		column.setWidth(140);
		
		column = new TableColumn(eventLogTable, SWT.NONE);
		column.setText("Message");
		column.setWidth(680);
		
		errorEventIcon = new Image(this.getDisplay(), "Image Files"+File.separator+"Error (16x16).gif");
		warningEventIcon = new Image(this.getDisplay(), "Image Files"+File.separator+"Warning (16x16).gif");
		informationEventIcon = new Image(this.getDisplay(), "Image Files"+File.separator+"Information (16x16).gif");		
	}
	
	/**
	 * Processes the windows messages.
	 */
	protected void processMessages() {
		final long POLL_INTERVAL = 100;
 	    
	    // Defines the main message loop.
	    while(!isDisposed())
		    try {
		         // Processes windows events.
		         while(display.readAndDispatch());

		         if(isDisposed())
		             break;
		         
		         // Processes internal events.
	             triggerNotifications();

	             // Processes log updates.
	             if(eventCount < memoryHandler.getLoggedRecords().size())
	                 updateEventLogTable();
	             
	             Thread.sleep(POLL_INTERVAL);
	 	    }
	 	    catch(Throwable throwable) {
	 	    	Logger.getLogger().log(Level.SEVERE, throwable.getMessage(), throwable);
	 	       
	 	       	String message = throwable.getMessage();
	 	        if(message != null) {
		 	        if(throwable instanceof DesktopException)
		 	        	message += "\n\n"+((DesktopException) throwable).getAdvice();
		 	        
			    	MessageBox messageBox = new MessageBox(getShell(), SWT.OK | SWT.ICON_ERROR);
					messageBox.setMessage(message);
					messageBox.setText("Digital Media Service Desktop Error");
					messageBox.open();
	 	        }
	 	    }
	 	   
 	    // Saves and backs up the application data after the application has been shut down.
	 	MApplication.getInstance().saveToXML();
	 	MApplication.getInstance().backUpXML();
	}
	
	/**
	 * Displays the form and then handles all events till the application is closed by
	 * the user.
	 * 
	 * @throws DesktopException Thrown if the application cannot load the application data.
	 * @throws IOException Thrown if the build information cannot be loaded.
	 */
	public static void show() throws DesktopException, IOException {	    
	    Shell shell = new Shell();
	    Display display = shell.getDisplay();
	    
	    SplashShell splashShell = SplashShell.getInstance();
	    splashShell.open();
	    
	    upgradeApplicationData(shell);
	    
	    MainComposite mainComposite = new MainComposite(shell, SWT.NONE);
	    
	    MApplication mApplication = MApplication.getInstance();
	    
	    // Set the window title, icon and size.
	    Image smallIcon = new Image(display, mApplication.getIconFilePath().getAbsolutePath());
	    Image largeIcon = new Image(display, "Image Files"+File.separator+"Logo (32x32).gif");
	    shell.setImages(new Image[] {smallIcon, largeIcon});
	    shell.setText(mApplication.getNameForUI());
	    shell.setBounds(50, 50, display.getBounds().width-2*50, display.getBounds().height-2*50);
	    shell.setMaximized(true); 
	    
		FormLayout layout = new FormLayout();
	    shell.setLayout(layout);
	    
		FormData formData = new FormData();
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(100, 0);
		mainComposite.setLayoutData(formData);
		
	    try {
	    	MApplication.getInstance().checkSingleInstance();
	    }
 	    catch(Throwable throwable) {
 	    	Logger.getLogger().log(Level.SEVERE, throwable.getMessage(), throwable);
 		    
 	    	splashShell.dispose();
 		    
 	       	String message = throwable.getMessage();
 	        if(message != null) {
	 	        if(throwable instanceof DesktopException)
	 	        	message += "\n\n"+((DesktopException) throwable).getAdvice();
	 	        
		    	MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
				messageBox.setMessage(message);
				messageBox.setText("Digital Media Service Desktop Error");
				messageBox.open();
 	        }
 	        

 	        return;
 	    }
	    shell.open();
	    splashShell.dispose();
	    
	    mainComposite.processMessages();
	}
	
	/**
	 * Attempts to upgrade the application data.
	 * 
	 * @param shell Specifies the shell for displaying message boxes.
	 */
	protected static void upgradeApplicationData(Shell shell) {
	    MDmsApplication mApplication = (MDmsApplication) MApplication.getInstance();
	    MStep mStep = mApplication.getMGetDataUpgradeInfoStep();
	    
	    if(mApplication.getUpgradeRelativeFtpPathProperty() == null)
	    	return;
	    
	    try {
	    	// Checks for application upgrade data.
	    	DesktopExceptionList exceptions = mStep.validate();
	    	if(exceptions.size() == 0) {
		    	Logger.getLogger().info("Checking for application data upgrade ...");
		    	mStep.run(true);
		    	
		    	// Checks whether the application data upgrade is available.
		    	if(!((MDmsApplicationMGetDataUpgradeInfoStep) mStep).getUpgradeAvailableResult()) {
			    	Logger.getLogger().info("Application data is up-to-date.");
		    		return;
		    	}
		    	
		    	// Checks whether the application data upgrade is not out-of-date.
		    	Date mLastSaveResult = ((MDmsApplicationMGetDataUpgradeInfoStep) mStep).getUpgradeDateResult();
		    	if(mLastSaveResult != null && mLastSaveResult.before(mApplication.getLastSaveProperty()))
		    		return;
		    	
			    Logger.getLogger().info("An application data upgrade is available.");
	
		    	// Upgrades the application data.
		    	mStep = mApplication.getMUpgradeDataStep();
		    	exceptions = mStep.validate();
		    	if(org.onceforall.dms.desktop.ui.Utilities.showValidationExceptionsDialog(shell, exceptions)) {	
				    mStep.run(true);
			    	Logger.getLogger().log(Level.INFO, "The application data was upgraded successfully.");
		    	}
		    }
	    	else {
			    Logger.getLogger().warning("The application data upgrade (check) has failed. You may want to make sure that the computer is connected to the internet and then restart the application.");	    		
			    for(DesktopException exception: exceptions)
			    	Logger.getLogger().log(Utilities.getLevelForSeverity(exception.getSeverity()), exception.getMessage());
	    	}
	    }
	    catch(Throwable exception) {
	    	Logger.getLogger().log(Level.SEVERE, exception.getMessage(), exception);
	    	
	    	MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
			messageBox.setMessage(exception.getMessage());
			messageBox.setText("Digital Media Service Desktop Error");
			messageBox.open();    	
	    }		
	}
		
	/**
	 * Gets the item text as an array of strings from a given mStep.
	 *
	 * @param mStep Specifies the mStep to be converted in to a string array.
	 * @return Returns the item text as an array of strings from a given mStep.
	 */
	protected String[] getItemText(MStep mStep) {
	    return(new String[] {mStep.getNameForUI(), mStep.getStateProperty().getNameForUI(), mStep.getMLastStateChangeProperty().getValueForUI()});
	}
	
	/**
	 * Updates the event log table. It adds all new events to the table.
	 */
	protected void updateEventLogTable() {
	    if(eventLogTable.isDisposed())
	        return;
	    
	    List loggedEvents = memoryHandler.getLoggedRecords();
	    while(eventCount < loggedEvents.size()) {
	        LogRecord event = (LogRecord) loggedEvents.get(eventCount);
	        String eventLevel = event.getLevel().toString();
	        String eventDate = Main.DATE_FORMATTER.format(new Date(event.getMillis())); 
	        String[] eventItem = new String[] {eventLevel, eventDate, event.getMessage()};
		    TableItem item = new TableItem(eventLogTable, SWT.NONE);
		    item.setText(eventItem);
	         
		    if(event.getLevel().equals(Level.SEVERE))
		        item.setImage(errorEventIcon);	         
		    else if(event.getLevel().equals(Level.WARNING))
		        item.setImage(warningEventIcon);
		    else if(event.getLevel().equals(Level.INFO))
		        item.setImage(informationEventIcon);
	        
		    ++eventCount;
	    }
	    
	    eventLogTable.setTopIndex(Math.max(eventLogTable.getItemCount()-1, 0));
	}    
	
	/**
	 * Updates the application tree. It clears the tree and adds all stateful objects that are in the 
	 * sub tree of the application object.
	 */
	/*?protected void updateApplicationTree() {
	   applicationTree.removeAll();
       TreeItem applicationTreeItem  = createTreeItem(MApplication.getInstance(), applicationTree);
       if(applicationTreeItem != null)
    	   applicationTreeItem.setExpanded(true);
	}*/
	
	/**
	 * Creates the tree item and all its sub item for the given managed object. It adds the new tree item
	 * to the given parent, which can be either a tree or a tree item.
	 *
	 * @param mObject Specifies the managed object to be added.
	 * @param treeItemParent Specifies the parent of the tree item that represents the given managed object. 
	 * This can be a tree or a tree item.
	 * @retrun Returns the created tree item.
	 */
	/*?protected TreeItem createTreeItem(MObject mObject, Widget treeItemParent) {
		// Makes sure that application data upgrade steps are not included. TODO: Makes these steps save for usage in the UI.
		if(mObject == ((MDmsApplication) MApplication.getInstance()).getMGetDataUpgradeInfoStep()
				|| mObject == ((MDmsApplication) MApplication.getInstance()).getMUpgradeDataStep())
			return null;
		
		TreeItem treeItem;
		if(treeItemParent instanceof Tree)
			treeItem = new TreeItem((Tree) treeItemParent, SWT.NULL);
		else
			treeItem = new TreeItem((TreeItem) treeItemParent, SWT.NULL);
			
	    treeItem.setData(mObject);
	    treeItem.setText(getTreeNodeText(mObject));
	    treeItem.setImage(iconCache.get(mObject));
	    mObject.eAdapters().add(this);
	    mObject.getMNameProperty().eAdapters().add(this);
	    
	    if(mObject instanceof MStatefulObject)
	    	((MStatefulObject) mObject).getMStateProperty().eAdapters().add(this);
	   
	    if(mObject instanceof MStep) {
		    MStep mStep = (MStep) mObject;
		    mStep.getMProgressProperty().eAdapters().add(this);
		    mStep.getMProgressStatusProperty().eAdapters().add(this);
	    }

	    Iterator<MObject> iterator = mObject.getReferencedMElements(MObject.class).iterator();
	    while(iterator.hasNext())  
	       createTreeItem(iterator.next(), treeItem);
	    
	    return treeItem;
	}*/
	
	/**
	 * Implements the selection event handler for the application tree.
	 * 
	 * @param event Specifies the selection event.
	 */
	/*?protected void applicationTreeSelected(SelectionEvent event) {
		MObject mObject = (MObject) applicationTree.getSelection()[0].getData();
	    selectMElement(mObject, true);
	}*/
	
	/**
	 * Selects a managed element, i.e. makes it visible in the detail composite.
	 *
	 * @param mElement Specifies the managed element to select.
	 * @param userEvent Specifies whether a user has triggered the event.
	 */
	protected void selectMElement(MElement mElement, boolean userEvent) {
		if(this.mElement == mElement)
			return;
		
		setCursor(new Cursor(getDisplay(), SWT.CURSOR_WAIT));
		
		setLayoutDeferred(true);
		try {
            if(mElementComposite != null) {
                mElementComposite.setVisible(false);
                mElementComposite.setMElement(null);
            }

            if(mElement != null) {    
	            try {
					mElementComposite = compositeFactory.createComposite(this, mElement);
				} catch (Exception e) {
					Logger.getLogger().log(Level.SEVERE, "The composite with the class name \""+mElement.getCompositeClassName()+"\" could not be created.");
					e.printStackTrace();
					e.getCause().printStackTrace();
				}
		        
	            if(mElementComposite != null) {
	            	mElementComposite.setVisible(false);
	                mElementComposite.setMElement(mElement);
	                mElementComposite.setParent(scrolledComposite);
	        		scrolledComposite.setContent(mElementComposite);
	        		mElementComposite.setVisible(true);
	        		mElementComposite.layout();
	            }
		    }
		    
		    if(!userEvent)
		        treeSelectorComposite.setSelectedMElement(mElement);
		}
		finally {
			setLayoutDeferred(false);			
			setCursor(null);
		}
	}

    /**
     * Conducts a depth-first search through the application tree to find the tree item that
     * has the given managed objects as data. The found tree items text will be updated according
     * to the managed objects data.
     *
     * @param treeItems Specifies the tree items to be used as root nodes for the search.
     * @param mObject Specifies the managed object.
     */
    /*?protected void updateTreeItem(TreeItem[] treeItems, MObject mObject) {
        for(int index = 0; index < treeItems.length; ++index) {
            if(treeItems[index].getData().equals(mObject)) {
                treeItems[index].setText(getTreeNodeText(mObject));
                treeItems[index].setImage(iconCache.get(mObject));
            }
            updateTreeItem(treeItems[index].getItems(), mObject);
        }
    }*/
    
    /**
     * Gets the text for an item in the application tree from a given managed object. 
     *
     * @param mObject Specifies the managed object for which to get the tree item text.
     * @return Returns the text for an item in the application tree from a given managed object.
     */
    /*?protected String getTreeNodeText(MObject mObject) {
        String result;
        if(mObject instanceof MStatefulObject && ((MStatefulObject) mObject).getStateProperty() != null) {
            result = mObject.getNameForUI()+" ("+((MStatefulObject) mObject).getStateProperty().getNameForUI();
        	if(mObject instanceof MStep) {
        	    Long progress = ((MStep) mObject).getProgressProperty();
        	    String progressStatus = ((MStep) mObject).getProgressStatusProperty();
        	    if(progress != null && !progress.equals(MStep.COMPLETED_PROGRESS))
        	        result+=" - "+progress+"%";
        	    else if(progressStatus != null)
      	        result+=" - "+progressStatus;
        	    	
        	}
        	result+=")";
        }
        else
            result = mObject.getNameForUI();
        
        return(result);
    }*/

    
    /**
     * Gets whether the Ctrl key is pressed.
     * 
     * @return Returns whether the Ctrl key is pressed.
     */
    public boolean getCtrlPressed() {
        return ctrlPressed;
    }
    

    /**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
        if(isDisposed())
            return;
        
        if(notification.getEventType() == Notification.SET  && notification.getNotifier() instanceof MValue) {
        	MValue mValue = (MValue) notification.getNotifier();
            if(mValue.eContainer() != null
            		&& (mValue.eContainingFeatureID() == LogicPackage.MOBJECT__MNAME_PROPERTY 
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_PROPERTY 
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY)) {
            	MObject mObject = (MObject) mValue.eContainer();
                //? updateTreeItem(applicationTree.getItems(), mObject);
                
                if(mObject instanceof MStep && !((MStep) mObject).isSynchronous() && mValue.eContainingFeatureID() == LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY) {
                    MStep mStep = (MStep) mObject;
                    State state = (State) notification.getNewValue();
                    State oldState = (State) notification.getOldValue();
                    
                    if(MStep.isProcessingState(oldState) && MStep.isNonProcessingState(state))
                        mStep.getMApplication().saveToXML();
                    
                    if(state.equals(MStepStateType.WARNING_STATE) || state.equals(MStepStateType.ERROR_STATE)) {
	                    Throwable exception = ((MStep) mObject).getException();
	
	                    Level level = Level.SEVERE;
	                    int icon = SWT.ICON_ERROR;
	                    if(state.equals(MStepStateType.WARNING_STATE)) {
	                    	level = Level.WARNING;
	                    	icon = SWT.ICON_WARNING;
	                    }
	                    
	                    Logger.getLogger().log(level, "'"+mStep.getNameForUI()+"' caused the following "+state.getNameForUI().toLowerCase()+": "+mStep.getException().getMessage(),  exception);	                     
	
	                    String message;
	                    if(exception instanceof DesktopException)
	                        message = ((DesktopException) exception).getMessageWithAdvice();
	                    else 
	                        message = exception.getMessage() != null ? exception.getMessage() : "The application raised a null pointer error.";
	                    
	                    MessageBox messageBox = new MessageBox(getShell(), SWT.OK | icon);
	                	messageBox.setMessage(message);
	                	messageBox.setText("Digital Media Service Desktop "+state.getNameForUI());
	                	messageBox.open();
	                	
	                	if(state.equals(MStepStateType.WARNING_STATE))
	                		mStep.setStateProperty(MStepStateType.COMPLETED_STATE);
	                }
					else if(MStep.isNonProcessingState((State) notification.getOldValue()) &&  state.equals(MStepStateType.PROCESSING_STATE)) {
						Logger.getLogger().info("'" + mStep.getNameForUI() + "' started.");
					}
                    else if(state.equals(MStepStateType.COMPLETED_STATE)) {
                    	Logger.getLogger().info("'"+mStep.getNameForUI()+"' completed successfully.");

                    	/*?if(mStep instanceof MDmsApplicationMUpgradeDataStep) {
                    		updateApplicationTree();
                    		selectMElement(MApplication.getInstance(), false);
                    	} */
                    	
                    	// Starts the next mStep if this has been previously requested.
                    	if(mNextStep != null && triggerStepForNextStep != null && state.equals(MStepStateType.COMPLETED_STATE) && mStep.equals(triggerStepForNextStep))
                    	try {
    	                    selectMElement(mNextStep, false);
    	                    
    	                    if(mElementComposite instanceof MStepComposite)
    	                        ((MStepComposite) mElementComposite).start();
                	    }
                	    finally {
    	                    triggerStepForNextStep = null;
    	                    mNextStep = null;
                	    }
                    }
                    else if(state.equals(MStepStateType.SKIPPED_STATE))
                    	Logger.getLogger().info("'"+mStep.getNameForUI()+"' skipped.");
                
                    startAutomaticSteps(mStep, state);
                }
            }
        }
        else if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MElementSelector){
            selectMElement((MElement) notification.getNewValue(), true);
        }
	}
    
    /**
     * Starts steps that depend on the given mStep (semi-) automatically if the given
     * state is 'Completed'.
     *
     * @param mStep Specifies mStep whose state changed.
     * @param state Speciifes the new state of the given mStep.
     */
    protected void startAutomaticSteps(MStep mStep, State state) {
        startAutomaticSteps(MApplication.getInstance(), mStep, state);
    }
    
    /**
     * Starts steps that depend on the given mStep (semi-) automatically if the given
     * state is 'Completed'.
     * 
     * @param mObject Specifies the managed object to use as a root for searching for
     *                     steps to automatically start.
     * @param mStep Specifies mStep whose state changed.
     * @param state Speciifes the new state of the given mStep.
     */
    protected void startAutomaticSteps(MObject mObject, MStep mStep, State state) {
        if(!state.equals(MStepStateType.COMPLETED_STATE))
            return;
        
        if(mObject instanceof MStep) {
            MStep currentMStep = (MStep) mObject;
            
            String startTrigger = currentMStep.getStartTriggerProperty();
            
            // Checks whether the current mStep depends on the changed mStep.
            if(currentMStep.getMInputSteps().contains(mStep) && (startTrigger.equals("Semi-automatic") || startTrigger.equals("Automatic")))
                try {
                    currentMStep.validate();
                    
                    // Starts the dependent mStep automatically if it has not a semi-automatic trigger.
                    // Otherwise it tries to obtain the users permission first.
                    if(!startTrigger.equals("Semi-automatic"))
                        currentMStep.run();
                    else {
                        MessageBox messageBox = new MessageBox(getShell(), SWT.YES | SWT.NO | SWT.ICON_WARNING);
                        messageBox.setMessage("Now that '"+mStep.getNameForUI()+"' has been completed. Would you like to start '"+currentMStep.getNameForUI()+"' now?");
                        messageBox.setText("Digital Media Service Desktop Warning");
                        if(messageBox.open() == SWT.YES)
                            currentMStep.run();
                    }
                        
                } catch (DesktopException exception) { }
        }
        
        /*?Iterator iterator = mObject.getMObjects().iterator();
        while(iterator.hasNext())
            startAutomaticSteps((MObject) iterator.next(), mStep, state);*/
    }

    
    /**
     * @see org.onceforall.dms.desktop.notify.ThreadAdapter#triggerNotifications()
     */
    @Override
	public void triggerNotifications() {
        super.triggerNotifications();
        
        triggerNotifications(this);
    }
    
    /**
     * Raises events in the child controls of the given composite.
     * 
     * @param composite Specifies the composite to whose childen the event raising should be propagated to. 
     * 
     */
    protected void triggerNotifications(Composite composite) {        
        Control[] children = composite.getChildren();
        for(int index = 0; index < children.length; ++index) {
            if(children[index] instanceof ThreadAdapter)
                ((ThreadAdapter) children[index]).triggerNotifications();
            
            if(children[index] instanceof Composite)  
                triggerNotifications((Composite) children[index]);
        }
    }
}
