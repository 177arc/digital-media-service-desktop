package org.onceforall.dms.desktop.ui;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.NotifierImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MStepSkipButton;
import org.eclipse.swt.widgets.MStepStartButton;
import org.eclipse.swt.widgets.MStepStopButton;
import org.eclipse.swt.widgets.MStepTerminateButton;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MApplication;
import org.onceforall.dms.desktop.logic.MDmsApplication;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MStatefulObject;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.ui.notify.SelectorNotificationImpl;

public class MElementTreeSelectorComposite extends MElementComposite implements MElementSelector {
	/** Specifies the spacing between the managed element buttons in pixels. */
	protected static final int BUTTON_SPACING = 5;
	
	/** Specifies the tree widget that allows the user to select a managed element. */
	protected Tree tree;
	
	/** Specifies the currently selected managed element. It is <code>null</null> if no managed element is selected. */
	protected MElement selectedMElement;
    
    /** Specifies the notifier to hold all adapters of this object.
      * The notfier is added by delegation and not inheritance because Java does not
      * support multiple inheritance and this class HAS TO inherit from Notifier. */
    protected Notifier notifier;
    
    /** Specifies the start button for managed steps. */
    protected MStepStartButton startButton;
    
    /** Specifies the stop button for managed steps. */
    protected MStepStopButton stopButton;
   
    /** Specifies the skip button for managed steps. */
    protected MStepSkipButton skipButton;
    
    /** Specifies the terminate button for managed steps. */
    protected MStepTerminateButton terminateButton;
    
    /** Specifies an array referencing the all managed element buttons. */
    protected MElementButton[] mElementButtons = new MElementButton[4];
    
    /** Specifies the current mouse position. */
    protected Point mousePosition = new Point(0, 0);
    
    /** Specifies the tree item under the current mouse position. */
    protected TreeItem pointedTreeItem;
    
    /** 
     * Specifies the area that the mouse pointer has to leave in order to hide the managed element buttons.
     * It extends from the first button to the right end of the tree control. The border has 5 pixels distance from the buttons.
     * It is <code>null</null> if the {@link #pointedTreeItem} is <code>null</null>. 
     */
    protected Rectangle pointedArea;
    
	/**
	 * Creates a new managed element tree selector composite.
	 * 
     * @param parent Specifies the composite that this composite belongs to. (mandatory)
     * @param style Specifies the SWT style of the composite.
	 */
	public MElementTreeSelectorComposite(Composite parent, int style) {
		super(parent, style);
		
		GridLayout layout = new GridLayout(1, false);
		layout.marginTop = 0;
		layout.marginBottom = 0;
		layout.marginLeft = 0;
		layout.marginRight = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		
		setLayout(layout);
		
		tree = getDefaultFormToolkit().createTree(this, SWT.SINGLE);
		tree.addSelectionListener(new SelectionAdapter() {
		    @Override
			public void widgetSelected(SelectionEvent event) {
		        treeSelected(event);
		    }
		});

		tree.addMouseTrackListener(new MouseTrackAdapter() {

			/**
			 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseExit(org.eclipse.swt.events.MouseEvent)
			 */
			@Override
			public void mouseExit(MouseEvent event) {
				// Makes sure that the buttons are hidden when the mouse pointer leave the tree area.
				mousePosition.x = event.x;
				mousePosition.y = mousePosition.y;
				if(tree.getBounds().contains(mousePosition))
					return;
				
				hideMElementButtons();
				
				pointedArea = null;
				pointedTreeItem = null;	
			}
				
			});
			
		tree.addMouseMoveListener(new MouseMoveListener() {

			public void mouseMove(MouseEvent event) {
				mousePosition.x = event.x;
				mousePosition.y = event.y;
				
				TreeItem treeItem = findTreeItem(tree.getTopItem(), mousePosition);
				
				if(treeItem == pointedTreeItem)
					return;
				
				if(pointedTreeItem != null
						&& treeItem == null 
						&& pointedArea != null 
						&& pointedArea.contains(mousePosition))
					return;
					
				pointedTreeItem = treeItem;
				hideMElementButtons();
				
				if(pointedTreeItem != null && pointedTreeItem.getData() != null && pointedTreeItem.getData() instanceof MStep) {
					MStep mStep = (MStep) pointedTreeItem.getData();
					
					int defaultHeight = startButton.getDefaultHeight();
				
					// Links the buttons to their managed elements and hides their captions.
					for(MElementButton mElementButton: mElementButtons) {
						if(mElementButton == null)
							continue;
						
						mElementButton.setMElement(mStep);
						if(mElementButton != startButton && mElementButton.getVisible())
							mElementButton.setText("");
					}
					
					Rectangle treeItemBounds = pointedTreeItem.getBounds();
					pointedArea = new Rectangle(treeItemBounds.x, treeItemBounds.y-(defaultHeight-pointedTreeItem.getBounds().height)/2-BUTTON_SPACING, tree.getBounds().width-treeItemBounds.x, defaultHeight+BUTTON_SPACING*2);		

					layoutMElementButtons();
					
				}
				else {
					pointedArea = null;
					pointedTreeItem = null;	
				}
			}});
		tree.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		
		startButton = new MStepStartButton(tree, SWT.NONE);
		stopButton = new MStepStopButton(tree, SWT.NONE);
		skipButton = new MStepSkipButton(tree, SWT.NONE);
		terminateButton = new MStepTerminateButton(tree, SWT.NONE);
		mElementButtons[0] = startButton;
		mElementButtons[1] = stopButton;
		mElementButtons[2] = skipButton;
		mElementButtons[3] = terminateButton;
		
		for(MElementButton mElementButton: mElementButtons) {
			if(mElementButton == null)
				continue;
			
			mElementButton.setVisible(false);
			//?mElementButton.addMouseTrackListener(new MStepButtonMouseTrackAdapter(mElementButton));
		}
		
        notifier = new NotifierImpl();
	}
	
	/**
	 * Implements the selection event handler for the tree.
	 * 
	 * @param event Specifies the selection event.
	 */
	protected void treeSelected(SelectionEvent event) {
		MElement mElement = (MElement) tree.getSelection()[0].getData();
		
		if(mElement == selectedMElement)
			return;
		
		MElement previousSelectedMElement = selectedMElement;
		selectedMElement = mElement;
		
		eNotify(new SelectorNotificationImpl(this, Notification.SET, previousSelectedMElement, mElement));
	}

	/**
	 * @see MElementSelector#getSelectedMElement()
	 */
	public MElement getSelectedMElement() {
		return selectedMElement;
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementSelector#setSelectedMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	public void setSelectedMElement(MElement selectedMElement) {
		if(selectedMElement == this.selectedMElement)
			return;
		
		TreeItem treeItem = findTreeItem(tree.getTopItem(), selectedMElement);
		if(treeItem != null) {
			tree.setSelection(treeItem);
			treeSelected(null);
		}
	}
		
	/**
	 * Updates the application tree. It clears the tree and adds all stateful objects that are in the 
	 * sub tree of the application object.
	 */
	protected void updateApplicationTree() {
	   tree.removeAll();
       TreeItem applicationTreeItem  = createTreeItem(getMElement(), tree);
       if(applicationTreeItem != null)
    	   applicationTreeItem.setExpanded(true); 
	}
	
	
	/**
	 * Creates the tree item and all its sub item for the given managed element. It adds the new tree item
	 * to the given parent, which can be either a tree or a tree item.
	 *
	 * @param mElement Specifies the managed element to be added.
	 * @param treeItemParent Specifies the parent of the tree item that represents the given managed object. 
	 * This can be a tree or a tree item.
	 * @retrun Returns the created tree item.
	 */
	protected TreeItem createTreeItem(MElement mElement, Widget treeItemParent) {
		// Makes sure that application data upgrade steps are not included. TODO: Makes these steps save for usage in the UI.
		if(mElement == ((MDmsApplication) MApplication.getInstance()).getMGetDataUpgradeInfoStep()
				|| mElement == ((MDmsApplication) MApplication.getInstance()).getMUpgradeDataStep())
			return null;
		
		TreeItem treeItem;
		if(treeItemParent instanceof Tree)
			treeItem = new TreeItem((Tree) treeItemParent, SWT.NULL);
		else
			treeItem = new TreeItem((TreeItem) treeItemParent, SWT.NULL);
			
	    treeItem.setData(mElement);
	    treeItem.setText(getTreeNodeText(mElement));
	    treeItem.setImage(iconCache.get(mElement));
	    mElement.eAdapters().add(this);
	    if(mElement instanceof MObject) {
	    	MObject mObject = (MObject) mElement;
	    	mObject.getMNameProperty().eAdapters().add(this);
	    	mObject.getMIconFilePathProperty().eAdapters().add(this);
	    }
	    
	    if(mElement instanceof MStatefulObject)
	    	((MStatefulObject) mElement).getMStateProperty().eAdapters().add(this);
	   
	    if(mElement instanceof MStep) {
		    MStep mStep = (MStep) mElement;
		    mStep.getMProgressProperty().eAdapters().add(this);
		    mStep.getMProgressStatusProperty().eAdapters().add(this);
	    }

	    Iterator<MObject> iterator = mElement.getReferencedMElements(MObject.class).iterator();
	    while(iterator.hasNext())  
	       createTreeItem(iterator.next(), treeItem);
	    
	    return treeItem;
	}
    
    /**
     * Gets the text for an item in the tree from a given managed element. 
     *
     * @param mElement Specifies the managed element for which to get the tree item text.
     * @return Returns the text for an item in the  tree from a given managed element.
     */
    protected String getTreeNodeText(MElement mElement) {
        String result;
        if(mElement instanceof MStatefulObject && ((MStatefulObject) mElement).getStateProperty() != null) {
            result = mElement.getNameForUI()+" ("+((MStatefulObject) mElement).getStateProperty().getNameForUI();
        	if(mElement instanceof MStep) {
        	    Long progress = ((MStep) mElement).getProgressProperty();
        	    String progressStatus = ((MStep) mElement).getProgressStatusProperty();
        	    if(progress != null && !progress.equals(MStep.COMPLETED_PROGRESS))
        	        result+=" - "+progress+"%";
        	    else if(progressStatus != null)
      	        result+=" - "+progressStatus;
        	    	
        	}
        	result+=")";
        }
        else
            result = mElement.getNameForUI();
        
        return(result);
    }

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eAdapters()
	 */
	public EList eAdapters() {
		return notifier.eAdapters();
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eDeliver()
	 */
	public boolean eDeliver() {
		return notifier.eDeliver();
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	public void eNotify(Notification notification) {
		notifier.eNotify(notification);
	}

	/**
	 * @see org.eclipse.emf.common.notify.Notifier#eSetDeliver(boolean)
	 */
	public void eSetDeliver(boolean deliver) {
		notifier.eSetDeliver(deliver);
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) throws IllegalArgumentException {
		MElement previousMElement = this.mElement;
		
		super.setMElement(mElement);
		
		if(previousMElement == mElement)
			return;
		
		updateApplicationTree();
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
            	    || mValue.eContainingFeatureID() == LogicPackage.MOBJECT__MICON_FILE_PATH_PROPERTY
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTATEFUL_OBJECT__MSTATE_PROPERTY
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_PROPERTY 
            		|| mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY)) {
            	MObject mObject = (MObject) mValue.eContainer();
                updateTreeItem(tree.getItems(), mObject);
            }
        }
        else if(notification.getEventType() == Notification.ADD && notification.getNotifier() instanceof MObject
        		&& notification.getFeature() instanceof EReference && ((EReference) notification.getFeature()).isContainment()) {
                addTreeItem(tree.getItems(), (MObject) notification.getNotifier(), (MObject) notification.getNewValue());
        }
        else if(notification.getEventType() == Notification.REMOVE && notification.getNotifier() instanceof MObject
        		&& notification.getFeature() instanceof EReference && ((EReference) notification.getFeature()).isContainment()) {
            removeTreeItem(tree.getItems(), (MObject) notification.getOldValue());
        }
	}
	
	/**
	 * Hides all managed element buttons.
	 */
	protected void hideMElementButtons() {
		for(MElementButton button: mElementButtons) {
			button.setVisible(false);
			button.setMElement(null);
		}
	}
	
	/**
	 * Lays out all visible managed element buttons.
	 */
	protected void layoutMElementButtons() {
		if(pointedTreeItem == null || startButton.getImage() == null)
			return;

		Rectangle treeItemBounds = pointedTreeItem.getBounds();
		
		Rectangle imageBounds = startButton.getImage().getBounds();
		
		// Determines the width of all visible buttons.
		int visibleButtonsWidth = 0;
		for(MElementButton mElementButton: mElementButtons) {
			if(mElementButton == null || !mElementButton.getVisible())
				continue;
			
			mElementButton.pack();
			
			// Sets the size of the button.
			Point buttonSize = mElementButton.getSize();
			String buttonText = mElementButton.getText();
			if(buttonText != null && buttonText.length() > 0)
				mElementButton.setSize(buttonSize.x, imageBounds.height+4);
			else
				mElementButton.setSize(buttonSize.x-buttonSize.y+imageBounds.height+4, imageBounds.height+4);
			
			visibleButtonsWidth += mElementButton.getBounds().width+BUTTON_SPACING;
		}
		
		int defaultHeight = startButton.getSize().y;
		
		if(visibleButtonsWidth > 0)
			visibleButtonsWidth -= BUTTON_SPACING;
		
		Rectangle buttonsArea = new Rectangle(Math.min(treeItemBounds.x+treeItemBounds.width+BUTTON_SPACING, tree.getBounds().width-visibleButtonsWidth-BUTTON_SPACING*2),
				treeItemBounds.y-(defaultHeight-treeItemBounds.height)/2,
			visibleButtonsWidth+BUTTON_SPACING*2, 
			defaultHeight);
		
		// Arranges the butttons.
		int currentX = buttonsArea.x+BUTTON_SPACING;
		for(MElementButton mElementButton: mElementButtons) {
			if(mElementButton == null || !mElementButton.getVisible())
				continue;
			
			mElementButton.setLocation(currentX, buttonsArea.y);					
			currentX += mElementButton.getBounds().width+BUTTON_SPACING;
		}	
	}
    
    /**
     * Conducts a depth-first search through the application tree to find the tree item that
     * has the given managed objects as data. It adds a tree node for the managed object to be added
     * under those tree nodes.
     *
     * @param treeItems Specifies the tree items to be used as root nodes for the search.
     * @param parentMObject Specifies the managed object to look for.
     * @param newMObject Specifies the managed object to be added.
     */
    protected void addTreeItem(TreeItem[] treeItems, MObject parentMObject, MObject newMObject) {
    	TreeItem[] targetTreeItems = getTreeItemsFromData(treeItems, parentMObject);
    	
    	for(TreeItem treeItem: targetTreeItems)
    		createTreeItem(newMObject, treeItem);
    }
    
    /**
     * Conducts a depth-first search through the application tree to find the tree item that
     * has the given managed objects as data. It removes the tree node that corresponds to the given managed object.
     *
     * @param treeItems Specifies the tree items to be used as root nodes for the search.
     * @param mObject Specifies the simple object to be removed.
     */
    protected void removeTreeItem(TreeItem[] treeItems, MObject mObject) {
    	for(TreeItem treeItem: treeItems) {
            if(treeItem.getData().equals(mObject))
            	treeItem.dispose();
            
            removeTreeItem(treeItem.getItems(), mObject);
        }
    }

	/**
	 * Performs a depth first search for a tree items whose data is the same as the
	 * given data object.
	 *
	 * @param rootTreeItems Specifies the root tree items from which to start the search.
	 * @param data Specifies the data to search for.
	 * @return Returns the tree items. If no tree items are found an empty array is returned.
	 */
	protected TreeItem[] getTreeItemsFromData(TreeItem rootTreeItems[], Object data) {
	    if(data == null)
	        return new TreeItem[] {};

	    ArrayList resultList = new ArrayList();
		getTreeItemsFromData(rootTreeItems, data, resultList);
		
		TreeItem[] result = new TreeItem[resultList.size()];
		int index = 0;
		Iterator iterator = resultList.iterator();
		while(iterator.hasNext())
		    result[index++] = (TreeItem) iterator.next();

		return result;		
	}
	
	/**
	 * Performs a depth first search for a tree items whose data is the same as the
	 * given data object.
	 *
	 * @param rootTreeItems Specifies the root tree items from which to start the search.
	 * @param data Specifies the data to search for.
	 * @param resultList Specifies a list of so far collected results.
	 */
	private void getTreeItemsFromData(TreeItem rootTreeItems[], Object data, ArrayList resultList) {
	    for(int index = 0; index < rootTreeItems.length; ++index) {
	        if(data.equals(rootTreeItems[index].getData()))
	            resultList.add(rootTreeItems[index]);
	        
	        getTreeItemsFromData(rootTreeItems[index].getItems(), data, resultList);
		}
	}
	
	/**
	 * Finds the tree item that is associated with the given managed element by performing
	 * a depth-first search. If no such item can be found, it returns <code>null</code>.
	 * If more than one tree item match, the first is returned.
	 * 
	 * @param startTreeItem Specifies the tree item from which to start the search.
	 * @param mElement Specifies the managed element to find.
	 * @return Returns the tree item that is associated with the given managed element.
	 */
	protected TreeItem findTreeItem(TreeItem startTreeItem, MElement mElement) {
		if(startTreeItem != null && startTreeItem.getData() == mElement)
			return startTreeItem;
		
		for(TreeItem treeItem: startTreeItem.getItems()) {
			TreeItem result = findTreeItem(treeItem, mElement);
			if(result != null)
				return result;
		}
		
		return null;
	}
	
	/**
	 * Finds the tree item that corresponds to the given point by performing a 
	 * depth-first search. If no tree item can be found, <code>null</code> is returned. It considers
	 * the whole bar from the start to the end of the tree as a hit, not just the tree item area.
	 *
	 * @param startTreeItem Specifies the tree item to use as the starting point for the search.
	 * @param point Specifies the point for which to find the corresponding tree item.
	 * @return Returns the tree item that corresponds to the given point.
	 */
	protected TreeItem findTreeItem(TreeItem startTreeItem, Point point) {
		if(startTreeItem == null)
			return null;
		
		Rectangle bounds = startTreeItem.getBounds();
		if(point.y >= bounds.y && point.y <= bounds.y+bounds.height)
			return startTreeItem;
		
		for(TreeItem treeItem: startTreeItem.getItems()) {
			TreeItem result = findTreeItem(treeItem, point);
			if(result != null)
				return result;
		}
		
		return null;
	}
	
    /**
     * Conducts a depth-first search through the application tree to find the tree item that
     * has the given managed objects as data. The found tree items text will be updated according
     * to the managed objects data.
     *
     * @param treeItems Specifies the tree items to be used as root nodes for the search.
     * @param mObject Specifies the managed object.
     */
    protected void updateTreeItem(TreeItem[] treeItems, MObject mObject) {
        for(int index = 0; index < treeItems.length; ++index) {
            if(treeItems[index].getData().equals(mObject)) {
                treeItems[index].setText(getTreeNodeText(mObject));
                treeItems[index].setImage(iconCache.get(mObject));
            }
            updateTreeItem(treeItems[index].getItems(), mObject);
        }
    }
    
    /**
     * Defines a mouse track adpater that makes the caption of 
     * managed step buttons visible when the mouse is over the button
     * and hides it when mouse leaves it.
     * 
     * @author Marc
     */
    protected class MStepButtonMouseTrackAdapter extends MouseTrackAdapter {
    	/** Specifies the managed step button that is associated with this mouse track adapter. */
    	MElementButton mElementButton;

		/**
		 * Creates a new mouse track adaper for managed step buttons.
		 * 
		 * @param mElementButton Specifies the managed step button that should be associated with this mouse track adapter.
		 */
		public MStepButtonMouseTrackAdapter(MElementButton stepButton) {
			super();
			
			mElementButton = stepButton;
		}

		/**
		 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseEnter(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseEnter(MouseEvent arg0) {
			mElementButton.setText(mElementButton.getActualText());
			
			layoutMElementButtons();
		}

		/**
		 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseExit(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseExit(MouseEvent arg0) {
			mElementButton.setText("");
			
			layoutMElementButtons();
		}
	}

}
