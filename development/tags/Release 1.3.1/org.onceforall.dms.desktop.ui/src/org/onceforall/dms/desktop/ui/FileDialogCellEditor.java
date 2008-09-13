package org.onceforall.dms.desktop.ui;

import java.io.File;
import java.text.MessageFormat;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;

/**
 * Defines a cell editor that allows the user to specify a file selecting it in 
 * a file dialog. Apart from a button to open a file/folder dialog,
 * it displays either a combo box with choices or a text field, depending on the {@link org.eclipse.swt.SWT.SIMPLE} flag.
 * The other specified styles of cell editor are applied to the combo box ({@link org.eclipse.swt.custom.CCombo}) 
 * or text field ({@link org.eclipse.swt.widgets.Text}). 
 * 
 * @author Marc and Rach
 */
public class FileDialogCellEditor extends DialogCellEditor {
	/** Specifies the control used to show the value of this cell editor. */
	protected Control contents;
	
	/** Specifies combo box to be used if {@link org.eclipse.swt.SWT.SIMPLE} is not specified. */
	protected CCombo cCombo;

	/** Specifies the button that the user can press to open the file dialog. */
	protected Button button;
	
	/** Specifies the button focus listener that determines whether the button is loosing its focus. */
	protected FocusListener buttonFocusListener;
	
	/** Specifies whether the button is loosing the focus. */
	protected boolean buttonLoosingFocus;
	
	/** Specifies whether the multiple files can be selected in the file dialog. */
	protected boolean multiple;
	
	/** Specifies the whether folders or files can be selected in the file dialog. */
	protected boolean folder;

	/** Specifies the item to present in the combo box. */ 
	protected String[] items;

	/** Specifies the filter path to use when the dialog box opens. */
	protected String filterPath;
	
    /** Specifies the index of the selected item. */
	protected int selection;
	
	/** Specifies an hourglass cursor. */
	protected Cursor waitCursor;
	
	/** Specifies the parent composite of the cell editor. */
	protected Composite parent;
	
	/**
	 * Creates a new file dialog cell editor.
	 * 
	 * @param parent Specifies the parent composite of the cell editor.
	 * @param style Specifies the control style of the cell editor. Use {@link org.eclipse.swt.SWT.SIMPLE} to make sure
	 * that no drop down list is displayed.
	 */
	public FileDialogCellEditor(Composite parent, int style) {
		super(parent, style);
        
		this.parent = parent;
		
        // Creates the hourglass cursor.
        waitCursor = new Cursor(parent.getDisplay(), SWT.CURSOR_WAIT);
	}

	/**
	 * @see org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
	 */
	@Override
	protected Object openDialogBox(Control parentControl) {
		int style = SWT.OPEN;
		if(multiple)
			style |= SWT.MULTI;
		
		String value = null;
		String applicationPath = new File("").getAbsolutePath();
		parent.setCursor(waitCursor);
		try {
			// Removes the focus listener because the button is guaranteed to loose its focus when the dialog is opened.
			button.removeFocusListener(buttonFocusListener);
			if(!folder) {
				FileDialog fileDialog = new FileDialog(parentControl.getShell(), style);
				if(filterPath != null)
					fileDialog.setFilterPath(filterPath);
				
				if(fileDialog.open() != null) {		
					// Attempts to make the selected file paths relative to the application path.
					value = "";
					for(String fileName: fileDialog.getFileNames()) {
						if(value.length() > 0)
							value += ";";
						
						File file = new File(fileDialog.getFilterPath()+File.separator+fileName);
						String filePath = file.getAbsolutePath();
						if(filePath.startsWith(applicationPath+File.separator))
							value += filePath.substring(applicationPath.length()+File.separator.length(), filePath.length());
						else
							value += filePath;
					}
					
					filterPath = fileDialog.getFilterPath();
				}
			}
			else {
				DirectoryDialog directoryDialog = new DirectoryDialog(parentControl.getShell(), style);
				directoryDialog.setFilterPath(applicationPath);
				if(filterPath != null)
					directoryDialog.setFilterPath(filterPath);
				
				value = directoryDialog.open();
				
				// Attempts to make the selected directory path relative to the application path.
				if(value != null && value.startsWith(applicationPath+File.separator)) {
					value = value.substring(applicationPath.length()+File.separator.length(), value.length());
				}
				
				if(value != null)
					filterPath = directoryDialog.getFilterPath();
			}
		}
		finally {
			// Adds the focus listener again.
			button.addFocusListener(buttonFocusListener);
			parent.setCursor(null);
		}
		return value;
	}
	
    /**
     * Sets the list of choices for the combo box. This is method
     * should only be called if {@link org.eclipse.swt.SWT.SIMPLE}
     * was not specified as one of the style of this cell editor.
     *
     * @param items Specifies the list of choices for the combo box.
     */
    public void setItems(String[] items) {
    	if(!(contents instanceof CCombo))
    		throw new UnsupportedOperationException("This method must not be called if SWT.SIMPLE is specified as one of the style of this cell editor.");
   	
    	((CCombo) contents).setItems(items);
    }

    /**
     * Gets the list of choices for the combo box. This is method
     * should only be called if {@link org.eclipse.swt.SWT.SIMPLE}
     * was not specified as one of the style of this cell editor.
     *
     * @return Specifies the list of choices for the combo box.
     */
    public String[] getItems() {
    	if(!(contents instanceof CCombo))
    		throw new UnsupportedOperationException("This method must not be called if SWT.SIMPLE is specified as one of the style of this cell editor.");
       
    	return ((CCombo) contents).getItems();
    }
    
	/**
	 * @see org.eclipse.jface.viewers.DialogCellEditor#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite cell) {		
		if((getStyle() & SWT.SIMPLE) != 0)
	    contents = new Text(cell, getStyle());
		else {
			contents = new CCombo(cell, getStyle());
			cCombo = (CCombo) contents;
		}
		
		contents.setFont(cell.getFont());
		
		contents.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                keyReleaseOccured(e);
            }
        });

		if(contents instanceof CCombo)
			((CCombo) contents).addSelectionListener(new SelectionAdapter() {
            public void widgetDefaultSelected(SelectionEvent event) {
                applyEditorValueAndDeactivate();
            }

            public void widgetSelected(SelectionEvent event) {
                selection = ((CCombo) contents).getSelectionIndex();
            }
			});

		contents.addTraverseListener(new TraverseListener() {
            public void keyTraversed(TraverseEvent e) {
                if (e.detail == SWT.TRAVERSE_ESCAPE
                        || e.detail == SWT.TRAVERSE_RETURN) {
                    e.doit = false;
                }
            }
        });

		contents.addFocusListener(new FocusAdapter() {
			
            /**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusLost(FocusEvent event) {
		        String newValue = null;
				if(contents instanceof CCombo)
					newValue = ((CCombo) contents).getText();
		        else if(contents instanceof Text)
		        	newValue = ((Text) contents).getText();

            	if (newValue != null) {
                    boolean newValidState = isCorrect(newValue);
                    if (newValidState) {
                        markDirty();
                        doSetValue(newValue);
                    }

                    fireApplyEditorValue();
                }
            }
        });
        return contents;
	}

    /**
	 * @see org.eclipse.jface.viewers.DialogCellEditor#createButton(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Button createButton(Composite parent) {
		button =  super.createButton(parent);
		button.setToolTipText("Opens a dialog for selecting a file or folder.");
		
		buttonFocusListener = new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusLost(FocusEvent event) {
				buttonLoosingFocus = true;
			}
		};
		
		button.addFocusListener(buttonFocusListener);
		
		return button;
	}

	/**
	 * @see org.eclipse.jface.viewers.CellEditor#fireApplyEditorValue()
	 */
	@Override
	protected void fireApplyEditorValue() {
		if(contents.isFocusControl() || button.isFocusControl() && !buttonLoosingFocus) {
			buttonLoosingFocus = false;
			return;
		}
		
		buttonLoosingFocus = false;
		super.fireApplyEditorValue();
	}

	/**
	 * @see org.eclipse.jface.viewers.DialogCellEditor#doSetFocus()
	 */
	@Override
	protected void doSetFocus() {
		super.doSetFocus();
		
		contents.setFocus();
	}

	/**
	 * @see org.eclipse.jface.viewers.DialogCellEditor#updateContents(java.lang.Object)
	 */
	@Override
	protected void updateContents(Object value) {
        String text = "";
        if (value != null)
			text = value.toString();
        
        if(contents instanceof CCombo)
        	((CCombo) contents).setText(text);
        else if(contents instanceof Text)
        	((Text) contents).setText(text);
    }

    /**
     * Applies the currently selected value and deactiavates the cell editor
     */
    void applyEditorValueAndDeactivate() {
        //	must set the selection before getting value
        selection = ((CCombo) contents).getSelectionIndex();
        Object newValue = doGetValue();
        markDirty();
        boolean isValid = isCorrect(newValue);
        setValueValid(isValid);
        
        if (!isValid) {
        	// Only format if the 'index' is valid
        	if (items.length > 0 && selection >= 0 && selection < items.length) {
	            // try to insert the current value into the error message.
	            setErrorMessage(MessageFormat.format(getErrorMessage(),
	                    new Object[] { items[selection] }));
        	}
        	else {
	            // Since we don't have a valid index, assume we're using an 'edit'
        		// combo so format using its text value
	            setErrorMessage(MessageFormat.format(getErrorMessage(),
	                    new Object[] { ((CCombo) contents).getText() }));
        	}
        }

        fireApplyEditorValue();
        deactivate();
    }

	/**
	 * @see FileDialogCellEditor#multiple 
	 */
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * @see FileDialogCellEditor#multiple 
	 */
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	/**
	 * @see FileDialogCellEditor#folder 
	 */
	public boolean isFolder() {
		return folder;
	}

	/**
	 * @see FileDialogCellEditor#folder 
	 */
	public void setFolder(boolean folder) {
		this.folder = folder;
	}

	/**
	 * @see FileDialogCellEditor#filterPath 
	 */
	public String getFilterPath() {
		return filterPath;
	}

	/**
	 * @see FileDialogCellEditor#filterPath 
	 */
	public void setFilterPath(String filterPath) {
		this.filterPath = filterPath;
		
	}
}
