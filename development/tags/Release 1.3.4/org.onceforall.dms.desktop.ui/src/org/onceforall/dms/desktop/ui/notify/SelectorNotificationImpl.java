package org.onceforall.dms.desktop.ui.notify;

import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.onceforall.dms.desktop.ui.MElementSelector;

/**
 * Represents a notification that is created and triggered by a managed element selector.
 * 
 * @author Marc
 */
public class SelectorNotificationImpl extends NotificationImpl {
	/** Specifies the managed element selector that created this notification. */
	protected MElementSelector notifier;
	
	/**
	 * Creates a new selector notification object.
	 * @param mElementSelector Specifies the managed element selector that created this notification.
	 * @param eventType Specifies the type of the change.
	 * @param mOldElement Specifies the old managed element.
	 * @param mNewElement Specifies the new managed element.
	 */
	public SelectorNotificationImpl(MElementSelector notifier, int eventType, Object mOldElement, Object mNewElement) {
		super(eventType, mOldElement, mNewElement);
		
		this.notifier = notifier;
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.NotificationImpl#getNotifier()
	 */
	@Override
	public Object getNotifier() {
		return notifier;
	}
}
