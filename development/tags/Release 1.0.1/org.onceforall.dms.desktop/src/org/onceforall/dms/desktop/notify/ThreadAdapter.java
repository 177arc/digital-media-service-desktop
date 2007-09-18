/*
 * Revision History:
 * $Log: ThreadAdapter.java,v $
 * Revision 1.3  2006/10/17 02:32:27  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.notify;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;

/**
 * Defines an adapter with methods to support notifications across threads.
 * Implementing classes should define {@link org.eclipse.emf.common.notify.Adapter#notifyChanged(Notification)}
 * as a <code>final</code> method that stores the notifications in a queue if they cannot be processed.
 * in the thread of the notifier. Otherwise it should call {@link #processNotification(Notification)} 
 * to process the notifications immediately.
 *
 * @author Marc
 */
public interface ThreadAdapter extends Adapter, Cloneable {
	/**
	 * Triggers the notifications that have not been handled yet. Notifications that are triggered
     * in the same thread as the notified thread are handled immediately. Other notifications have
     * to be polled by calling this method. This ensures that notifications across threads are executed
     * in the thread of the adapter, which is particularly important for communication between 
     * {@link org.onceforall.dms.desktop.logic.MStep} and the GUI.
     */
	public void triggerNotifications();
	
	/**
	 * Processes the given notification. Implementing classes should override this method to define
	 * what should happen in response the notification, instead of overriding the 
	 * {@link org.eclipse.emf.common.notify.Adapter#notifyChanged(Notification)} method.
     *
	 * @param notification Specifies the notification to process.
	 */
	public void processNotification(Notification notification);
}
