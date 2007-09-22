/*
 * Revision History:
 * $Log: MElementComposite.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 *
 */
package org.onceforall.dms.desktop.ui;

import java.util.LinkedList;
import java.util.Queue;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * Defines a SWT composite that can be associtated with a managed element. However, it does not define how to
 * display this element and therefore this class is abstract.
 * 
 * It defines a event handling that allows notification across threads.
 */

public abstract class MElementComposite extends Composite implements ThreadAdapter {
    /** Specifies an icon factory that makes sure that that icons are reused.*/
    protected static IconFactory iconCache = new IconFactory();

    /** Specifies a managed element composite factory that makes sure that that icons are reused.*/
    protected static MElementCompositeFactory compositeFactory = new MElementCompositeFactory();
    
	/** Specifies the managed element that this composite is responsible for. */
    protected MElement mElement;
    
    /** 
     *  Specifices the target from which the adapter will receive notifications.
     * 	This variable is set by a notifier when this adapter is added to or removed 
     * 	from its adapter list. In general, an adapter may be shared by 
     *  more than one notifier.
     */
    protected Notifier target;

    /**
     * Specifies the notification queue of the observer. Only notifications that are triggered by a thread that is different
     * to the user-interface thread are added to the queue and raised when <code>raiseNotifications</code>
     * is called.
     */
    protected Queue<Notification> messageQueue = new LinkedList<Notification>();
    
    /** Specifies the default form toolkit for the composite. It can be used make sure
	 * that the widgets have a uniform look and process navigation events correctly. */
    protected static FormToolkit defaultFormToolkit;
    
    /**
     * Creates a new managed element composite object.
     *
     * @param parent Specifies the composite that this composite belongs to. (mandatory)
     * @param style Specifies the SWT style of the composite.
     */
    public MElementComposite(Composite parent, int style) {
        super(parent, style);
        
	    setLayout(parent.getLayout());
    }
    
    /**
     * Gets the managed element that this composite is responsible for.
     * 
     * @return Returns the managed element that this composite is responsible for.
     */
    public MElement getMElement() {
        return mElement;
    }
    
    /**
     * Sets the managed element that this composite is responsible for.
     * 
     * @param mElement Specifies the managed element that this composite is responsible for.
     * @throws IllegalArgumentException Thrown if the managed element is of the wrong type. Sub-classes typically
     * impose restrictions of the type of managed element that can be set, e.g. <code>MStepComposite</code>
     * will only accept mStep managed elements.
     */
    public void setMElement(MElement mElement) throws IllegalArgumentException {
    	if(this.mElement == mElement)
    		return;
    	
    	if(this.mElement != null)
    		this.mElement.deactivate();
    	
        this.mElement = mElement;
        
        if(mElement != null)
        	mElement.activate();
   }
    
    /**
     * Gets the main composite that this composite belongs to by searching upwards from this
     * basic composite through the parent hierarchy.
     * 
     * @return Returns the main composite that this composite belongs to.
     */
    public MainComposite getMainComposite() {
        Composite currentComposite = this;
        while(currentComposite != null && !(currentComposite instanceof MainComposite))
            currentComposite = currentComposite.getParent();
    
    	if(currentComposite instanceof MainComposite)
    	    return (MainComposite) currentComposite;
    	else
    	    return null;
    }
    
	/**
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	public Notifier getTarget() {
		return target;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object object) {
		return object instanceof MElementComposite;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	final public void notifyChanged(Notification notification) {
        if(isDisposed())
            return;
        
        // Makes sure that events that are not raised in the user-interface thread are send to the message queue and
        // then later processed by the user-interface thread through the raiseNotificationsmethod.
        if(getDisplay().getThread() != Thread.currentThread()) {
            synchronized(messageQueue) {
            	if(messageQueue.size() > 100)
            		messageQueue.remove();
                messageQueue.add(notification);
            }       
        }
        else
        	processNotification(notification);
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	public void setTarget(Notifier target) {
		this.target = target;
	}

	/**
	 * @see org.onceforall.dms.desktop.notify.ThreadAdapter#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	public void processNotification(Notification notification) {
		// Does nothing by default.
	}

	/**
	 * Triggers notifications so that notification can be added/removed to/from the message queue with notification are processed.
	 * 
	 * @see org.onceforall.dms.desktop.notify.ThreadAdapter#triggerNotifications()
	 */
	public void triggerNotifications() {
		// Copies the message queue.
		Queue<Notification> messageQueueClone = new LinkedList<Notification>();
       synchronized(messageQueue) {
    	   messageQueueClone.addAll(messageQueue);
    	   messageQueue.clear();
       }
       
       // Processes the copied message queue.
       while(messageQueueClone.size() > 0)
    	   processNotification(messageQueueClone.poll());
	}

	/**
	 * Gets the default form toolkit for the composite. It can be used to make sure
	 * that the widgets have a uniform look and process navigation events correctly.
	 * 	
	 * @return Returns the default form toolkit for the composite.
	 * @see org.eclipse.ui.forms.widgets.FormToolkit	
	 */
	protected static FormToolkit getDefaultFormToolkit() {
		if (defaultFormToolkit == null) {
			defaultFormToolkit = new FormToolkit(Display.getCurrent());
			defaultFormToolkit.setBorderStyle(SWT.NULL);
			defaultFormToolkit.getColors().initializeSectionToolBarColors();
		}
		return defaultFormToolkit;
	}
}
