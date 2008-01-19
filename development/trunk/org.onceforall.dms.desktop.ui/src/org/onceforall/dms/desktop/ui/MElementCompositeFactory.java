/*
 * Revision History:
 * $Log: MElementCompositeFactory.java,v $
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 */
package org.onceforall.dms.desktop.ui;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.logic.MElement;

/**
 * Defines an composite factory that makes sure that no duplicate instance are returned by the
 * factory. If the class or the owner of the composite in two factory requests are different
 * two instances are created. In other words, the factory regards the combination of the 
 * composite class and the owner as unique.
 *
 * @author Marc
 */
public class MElementCompositeFactory {
	// Specifies the map that contains the already created composites maps, indexed by their owner.
	protected Map<Composite, Map<Class, MElementComposite>> compositesMapsByOwner = new HashMap<Composite, Map<Class, MElementComposite>>();

	/**
	 * Gets an abstract managed object composite with the given owner. The composite will be an instance of the given class name.
	 * If a composite with given owner and class name already exists, it returns this instance.
	 * 
	 * @param owner Specifies the owner of the composite to be created.
	 * @param compositeClassName Specifies the fully-qualified class name of the composite to be created. 
	 * This must be a subclass of {@link org.onceforall.dms.desktop.ui.MElementComposite}.
	 * 
	 * @return Returns an abstract managed object composite with the given owner.
	 * @throws Exception Thrown if the composite could not be created, e.g. because the class with given class name could not be loaded.
	 */
	MElementComposite createComposite(Composite owner, String compositeClassName) throws Exception  {
		assert owner != null: "The parameter \"owner\" is not optional.";
		assert compositeClassName != null: "The parameter \"compositeClassName\" is not optional.";
		
		Map compositesByClass = compositesMapsByOwner.get(owner);
		if(compositesByClass == null) {
			compositesByClass = new HashMap<Class, MElementComposite>();
			compositesMapsByOwner.put(owner, compositesByClass);
		}
		
		Class compositeClass = Class.forName(compositeClassName);
		MElementComposite composite = (MElementComposite) compositesByClass.get(compositeClass);
		if(composite == null) {
			Constructor constructor = compositeClass.getConstructor(new Class[] {Composite.class, Integer.TYPE});
			composite = (MElementComposite) constructor.newInstance(new Object[] {owner, new Integer(SWT.NONE)});
			compositesByClass.put(compositeClass, composite);
		}
		
		return composite;
	}

	/**
	 * Gets an abstract managed element composite with the given owner. The composite will be an instance of the class
	 * that the managed element recommends. If a composite with given owner and recommended class already exists, it 
	 * returns this instance.
	 * 
	 * @param owner Specifies the owner of the composite to be created.
	 * @param mElement Specifies the managed element that should be used to get the fully-qualified name of the composite class.
	 * 
	 * @return Returns an abstract managed element composite with the given owner.
	 * @throws Exception Thrown if the composite could not be created, e.g. because the class with given class name could not be loaded.
	 */
	MElementComposite createComposite(Composite owner, MElement mElement) throws Exception  {
		return createComposite(owner, mElement.getCompositeClassName());
	}
}
