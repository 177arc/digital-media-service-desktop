/*
 * Revision History:
 * $Log: MInputValuesList.java,v $
 * Revision 1.2  2006/10/17 02:32:27  marc
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
import java.util.List;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MValue;

/**
 * Defines the list of managed input values that belongs to a {@link org.onceforall.dms.desktop.logic.MValue managed value}. It 
 * adds the managed value as adapter to each managed input value that is added to the list.
 * It also removes the adapters when the input values are removed from the list.
 *
 * @author Marc
 */
public class MInputValuesList extends EObjectEList {

	/**
	 * Creates a new managed input values list.
	 *
	 * @param owner Specifies the owner of this list. The owner must be an {@link MValue} object.
	 */
	public MInputValuesList(InternalEObject owner) {
		super(MValue.class, owner, LogicPackage.MVALUE__MINPUT_VALUES);
		
		if(!(owner instanceof MValue))
			throw new IllegalArgumentException("The parameter 'notifier' must be an instance of 'MElement'.");
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(int, java.util.Collection)
	 */
	@Override
	public boolean addAllUnique(int index, Collection collection) {
		// Checks the type of the collection elements.
		for(Object object: collection)
			if(!(object instanceof MValue))
				throw new IllegalArgumentException("The parameter 'objects' must be a collection of MValue objects.");
		
		boolean result = super.addAllUnique(index, collection);
		
		if(result)
			// Adds owning managed value as adapter to the input value.
			for(MValue mValue: (Collection<MValue>) collection)
				((MValue) mValue).eAdapters().add(owner);
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addAllUnique(int, java.lang.Object[], int, int)
	 */
	@Override
	public boolean addAllUnique(int index, Object[] objects, int start, int end) {
		// Checks the type of the array elements.
		for(int idx = start; idx < end; ++idx)
			if(!(objects[idx] instanceof MValue))
				throw new IllegalArgumentException("The parameter 'objects' must be an array of MValue objects.");

		boolean result = super.addAllUnique(index, objects, start, end);
		
		if(result)
			// Adds owning managed value as adapter to the input values.
			for(int idx = start; idx < end; ++idx)
				((MValue) owner).eAdapters().add(objects[idx]);
		
		return result;
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(int, java.lang.Object)
	 */
	@Override
	public void addUnique(int index, Object object) {
		if(!(object instanceof MValue))
			throw new IllegalArgumentException("The parameter 'object' must be of type MValue.");
			
		super.addUnique(index, object);

		// Adds owning managed value as adapter to the input value.
		((MValue) object).eAdapters().add(owner);
	}

	/**
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(java.lang.Object)
	 */
	@Override
	public void addUnique(Object object) {
		if(!(object instanceof MValue))
			throw new IllegalArgumentException("The parameter 'object' must be of type MValue.");

		super.addUnique(object);
		
		// Adds owning managed value as adapter to the input value.
		((MValue) object).eAdapters().add(owner);
	}
	

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList#clear()
	 */
	@Override
	public void clear() {		
		super.clear();

		// Removes the owning managed value has adapter from the managed input values.
		for(MValue mValue: (List<MValue>) this)
			mValue.eAdapters().remove(owner);
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EAdapterList#remove(int)
	 */
	@Override
	public Object remove(int index) {
		Object result = super.remove(index);
		
		// Removes the owning managed value has adapter from the managed input value.
		((MValue) result).eAdapters().remove(owner);

		return result;
	}
}
