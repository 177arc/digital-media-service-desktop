package org.onceforall.dms.desktop.ui;

import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.notify.ThreadAdapter;

/**
 * Represents the button that are associated with a managed element.
 * 
 * @see org.onceforall.dms.desktop.logic.MElement
 */
public abstract class MElementButton extends Button implements ThreadAdapter, MElementControl {
    /** Specifies an icon factory that makes sure that that icons are reused.*/
    protected static IconFactory iconCache = IconFactory.getInstance();

	/** Specifies the managed element that this control is responsible for. */
    protected MElement mElement;

    /** Specifies the text that the button should show when it is not set to empty.
     * This is necessary because the empty string may be used to hide the button caption.  */
    protected String actualText;
    
    /**
     * Specifies the notification queue of the observer. Only notifications that are triggered by a thread that is different
     * to the user-interface thread are added to the queue and raised when <code>raiseNotifications</code>
     * is called.
     */
    protected Queue<Notification> messageQueue = new LinkedList<Notification>();
   
    /** 
     *  Specifices the target from which the adapter will receive notifications.
     * 	This variable is set by a notifier when this adapter is added to or removed 
     * 	from its adapter list. In general, an adapter may be shared by 
     *  more than one notifier.
     */
    protected Notifier target;
    
    /** Specifies the default height of the button. */
    protected int defaultHeight;

	/**
	 * Creates a new managed element button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MElementButton(Composite parent, int style) {
		super(parent, style);
		
		// Handle button click events.
		addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				performAction();
			}
		});

		defaultHeight = computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		setVisible(false);
	}

	/**
	 * @see org.onceforall.dms.desktop.notify.ThreadAdapter#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	public void processNotification(Notification notification) {
		// Does nothing by default.
		
	}

	/**
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
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	public Notifier getTarget() {
		return target;
	}

	/**
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object object) {
		return object instanceof MElementButton;
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
	 * @see org.onceforall.dms.desktop.ui.MElementControl#getMElement()
	 */
	public MElement getMElement() {
		return mElement;
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementControl#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	public void setMElement(MElement mElement) {
		this.mElement = mElement;
		
		setVisible(false);
	}

	/**
	 * Gets the default height of the button.
	 * 
	 * @return Returns the default height of the button.
	 */
	public int getDefaultHeight() {
		return defaultHeight;
	}

	/**
	 * @see org.eclipse.swt.widgets.Button#setText(java.lang.String)
	 */
	@Override
	public void setText(String text) {
		super.setText(text);
	
		// Stores the actual text because the empty string maybe used to hide the text.
		if(text == null || text.length() > 0)
			actualText = text;
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementControl#actualText
	 */
	public String getActualText() {
		return actualText;
	}
	
	/**
	 * Performs that action that this button represents.
	 */
	protected abstract void performAction();
}
