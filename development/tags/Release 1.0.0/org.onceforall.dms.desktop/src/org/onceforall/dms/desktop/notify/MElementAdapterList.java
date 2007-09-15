/*
 * Revision History:
 * $Log: MElementAdapterList.java,v $
 * Revision 1.2  2006/09/19 12:52:10  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:21  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:16  marc
 * First revision after rearchitecting.
 *
 */
package org.onceforall.dms.desktop.notify;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines an adapter list that belongs to a managed element. It 
 * activates the {@link org.onceforall.dms.desktop.logic.MElement managed element} 
 * as soon as adapters are added and deactivates it when all adapters are removed.
 *
 * @author Marc
 */
public class MElementAdapterList extends EAdapterList {

	/**
	 * Creates a new managed element adapter list.
	 *
	 * @param notifier Specifies the notifier that owns this list.
	 */
	public MElementAdapterList(Notifier notifier) {
		super(notifier);
		
		if(!(notifier instanceof MElement))
			throw new IllegalArgumentException("The parameter 'notifier' must be an instance of 'MElement'.");
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(java.util.Collection)
	 */
	@Override
	public boolean addAllUnique(Collection collection) {
		boolean result = super.addAllUnique(collection);
		if(result)
			activateMElement(collection.size());
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(int, java.util.Collection)
	 */
	@Override
	public boolean addAllUnique(int index, Collection collection) {
		boolean result = super.addAllUnique(index, collection);
		if(result)
			activateMElement(collection.size());
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(int, java.lang.Object[], int, int)
	 */
	@Override
	public boolean addAllUnique(int index, Object[] objects, int start, int end) {
		boolean result = super.addAllUnique(index, objects, start, end);
		if(result)
			activateMElement(objects.length);
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(java.lang.Object[], int, int)
	 */
	@Override
	public boolean addAllUnique(Object[] objects, int start, int end) {
		boolean result = super.addAllUnique(objects, start, end);
		if(result)
			activateMElement(objects.length);
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(int, java.lang.Object)
	 */
	@Override
	public void addUnique(int index, Object object) {
		super.addUnique(index, object);
		activateMElement(1);
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(java.lang.Object)
	 */
	@Override
	public void addUnique(Object object) {
		super.addUnique(object);
		activateMElement(1);
	}
	

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList#clear()
	 */
	@Override
	public void clear() {
		super.clear();
		((MElement) notifier).deactivate();
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList#remove(int)
	 */
	@Override
	public Object remove(int index) {
		Object result = super.remove(index);
		if(result != null && size() == 0)
			((MElement) notifier).deactivate();

		return result;
	}	

	/**
	 * Activates the managed element if the adapter list has now one element.
	 * 
	 * @param addedCount Specifies the number of added managed elements.
	 */
	protected void activateMElement(int addedCount) {
		if(size() == addedCount) {
			((MElement) notifier).activate();
		}
	}
}
