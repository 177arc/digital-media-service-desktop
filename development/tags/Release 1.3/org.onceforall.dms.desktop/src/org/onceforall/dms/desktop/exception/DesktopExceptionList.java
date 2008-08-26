/*
 * Revision History:
 * $Log: DesktopExceptionList.java,v $
 *
 */
package org.onceforall.dms.desktop.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Defines a list for holding desktop exception {@link org.onceforall.dms.desktop.exception.DesktopException}.
 * 
 * @author Marc
 */
public class DesktopExceptionList implements Iterable<DesktopException> {
	private List<DesktopException> exceptions = new ArrayList<DesktopException>();

	/**
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(DesktopException e) {
		return exceptions.add(e);
	}

	/**
	 * @see java.util.List#add(int, java.lang.Object)
	 */
	public void add(int index, DesktopException element) {
		exceptions.add(index, element);
	}

	/**
	 * @see java.util.List#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<? extends DesktopException> c) {
		return exceptions.addAll(c);
	}

	/**
	 * @see java.util.List#clear()
	 */
	public void clear() {
		exceptions.clear();
	}

	/**
	 * @see java.util.List#contains(java.lang.Object)
	 */
	public boolean contains(Object o) {
		return exceptions.contains(o);
	}

	/**
	 * @see java.util.List#get(int)
	 */
	public DesktopException get(int index) {
		return exceptions.get(index);
	}

	/**
	 * @see java.util.List#indexOf(java.lang.Object)
	 */
	public int indexOf(Object o) {
		return exceptions.indexOf(o);
	}

	/**
	 * @see java.util.List#iterator()
	 */
	public Iterator<DesktopException> iterator() {
		return exceptions.iterator();
	}

	/**
	 * @see java.util.List#remove(int)
	 */
	public DesktopException remove(int index) {
		return exceptions.remove(index);
	}

	/**
	 * @see java.util.List#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return exceptions.remove(o);
	}

	/**
	 * @see java.util.List#size()
	 */
	public int size() {
		return exceptions.size();
	}
	
	/**
	 * Gets the number of exceptions with the given severity.
	 * 
	 * @param severity Specifies the severity to count in the list of exceptions.
	 * @return Returns the number of exceptions with the given severity.
	 */
	public int getSeverityCount(int severity) {
		assert severity == DesktopException.INFORMATION_SEVERITY
			|| severity == DesktopException.WARNING_SEVERITY
			|| severity == DesktopException.ERROR_SEVERITY
			|| severity == DesktopException.CRITICAL_SEVERITY;
			
		int severityCount = 0;
		
		for(DesktopException exception: exceptions)
			if(exception.getSeverity() == severity)
				++severityCount;
		
		return severityCount;		
	}
	
	/**
	 * Gets the number of exceptions with critical severity.
	 * 
	 * @return Returns the number of exceptions with critical severity.
	 */
	public int getCriticalCount() {
		return getSeverityCount(DesktopException.CRITICAL_SEVERITY);
	}
	
	/**
	 * Gets the number of exceptions with error severity.
	 * 
	 * @return Returns the number of exceptions with error severity.
	 */
	public int getErrorCount() {
		return getSeverityCount(DesktopException.ERROR_SEVERITY);
	}
	
	/**
	 * Gets the number of exceptions with warning severity.
	 * 
	 * @return Returns the number of exceptions with warning severity.
	 */
	public int getWarningCount() {
		return getSeverityCount(DesktopException.WARNING_SEVERITY);
	}
	
	/**
	 * Gets the number of exceptions with info severity.
	 * 
	 * @return Returns the number of exceptions with info severity.
	 */
	public int getInfoCount() {
		return getSeverityCount(DesktopException.INFORMATION_SEVERITY);
	}
	
	/**
	 * Gets the maximum severity of all exceptions. It returns {@link DesktopException.INFORMATION_SEVERITY}
	 * if the list is empty.
	 * 
	 * @return Returns the maximum severity of all exceptions. 
	 */
	public int getMaxSeverity() {
		int maxSeverity = DesktopException.INFORMATION_SEVERITY;
		
		for(DesktopException exception: exceptions)
			maxSeverity = Math.max(maxSeverity, exception.getSeverity());
		
		return maxSeverity;
	}
	
	/**
	 * Gets a list (copy) of all exceptions with the given severity.
	 * 
	 * @param severity Specifies the severity of the exceptions to include.
	 * @return Returns a list (copy) of all exceptions with the given severity.
	 */
	public List<DesktopException> getExceptionsForSeverity(final int severity) {
		assert severity == DesktopException.INFORMATION_SEVERITY
		|| severity == DesktopException.WARNING_SEVERITY
		|| severity == DesktopException.ERROR_SEVERITY
		|| severity == DesktopException.CRITICAL_SEVERITY;
		
		List<DesktopException> severityExceptions = new ArrayList<DesktopException>();
		for(DesktopException exception: exceptions)
			if(exception.severity == severity)
				severityExceptions.add(exception);
		
		return severityExceptions;	
	}
}
