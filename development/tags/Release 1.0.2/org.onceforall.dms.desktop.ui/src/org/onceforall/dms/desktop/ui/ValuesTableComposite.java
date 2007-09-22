/*
 * Revision History:
 * $Log: ValuesTableComposite.java,v $
 * Revision 1.4  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.3  2006/10/17 02:35:33  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.8  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.7  2005/08/03 21:34:14  Marc
 * Added dependencies to the description of values to be displayed in the UI as tool tips.
 *
 * Revision 1.6  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.5  2005/06/12 12:09:49  Marc
 * Updated for version 0.4.3.
 *
 * Revision 1.4  2005/05/22 17:02:27  Marc
 * Implemented requirement 5: allow read-only field to be modified.
 *
 * Revision 1.3  2005/03/18 00:42:24  Marc
 * Made sure that the application shut-down does not throw exceptions.
 *
 * Revision 1.2  2005/03/13 14:20:39  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:03  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CComboWrapper;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;
import org.onceforall.dms.desktop.exception.ConversionException;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MParameter;
import org.onceforall.dms.desktop.logic.MProperty;
import org.onceforall.dms.desktop.logic.MResult;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.logic.types.Type;

/**
 * Defines a SWT composite that displays the managed values of a managed class object in a table.
 */

public class ValuesTableComposite extends MElementComposite {
	/** Specifies the class of the managed value that this composite should display.
     * 	It should be either {@link org.onceforall.dms.desktop.logic.MValue} or a subclass. The class acts as a filter for the 
     * 	member variables.*/
	protected Class valueClass;
    
    /** Specifies the managed values that this composite presents. The values are 
     * the fields of the managed object that match the value class specifies in the constructor. */
    protected MValue[] cachedMValues;
    
    /** Specifies the Eclipse form section that contains the table. */
    protected Section section;
    
    /** Specifies the label that displays the type of managed value collection, for example parameters. */
    protected Label typeLabel;
    
    /** Specifies the table that displays the managed value collection. */
    protected Table table;
    
    /** Specifies the table viewer that enables in place editing of the managed value collection. */
    protected TableViewer tableViewer;

    /** Specifies the text area that displays the description of the selected managed value. */
    //?protected Text descriptionText;
    
    /** Specifies a list of the column names. */
    protected List columnNames;
    
    /** Specifies the combo box cell editor that the table uses to allow the user to choose from a list of possible values. */
    protected ComboBoxCellEditor validValuesCellEditor;
    
    /** Specifies a wrapper for the CCombo control of the combo box cell editor that provides access to methods with default access. */
    protected CComboWrapper validValuesComboBoxWrapper;
    
    /** Specifies the combo box cell editor that the table uses to allow the user to choose from a list of historic values. */
    protected ComboBoxCellEditor historicValuesCellEditor;
    
    /** Specifies a wrapper for the CCombo control of the combo box cell editor that provides access to methods with default access. */
    protected CComboWrapper historicValuesComboBoxWrapper;
    
    /** Specifies the combo box cell editor that the table uses to allow the user to choose the null value. */
    protected ComboBoxCellEditor nullableCellEditor;
    
    /** Specifies a wrapper for the CCombo control of the combo box cell editor that provides access to methods with default access. */
    protected CComboWrapper nullableComboBoxWrapper;
    
    /** Specifies the text cell editor that the table uses to allow the user input text. */
    protected TextCellEditor textCellEditor;
    
    /** Specifies the assistantDialog that will be displayed when the user hover over a table item. */
    protected AssistantDialog assistantDialog;
    
    /**
     * Creates a new values table composite object.
     *
     * @param parent Specifies the parent of the values table composite.
     * @param valueClass Specifies the class of the managed value that this composite should display.
     * It should be either {@link org.onceforall.dms.desktop.logic.MValue} or a subclass. The class acts as a filter for the 
     * member variables.
     */
    public ValuesTableComposite(Composite parent, Class valueClass) {
        super(parent, SWT.NONE);
        
        this.valueClass = valueClass;
        
        setLayout(new FormLayout());  
        
        // Sets the background colour of the composite.
        Color backgroundColour = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
        setBackground(backgroundColour);
        
		// Adds the Eclipse form section that contains the table.
        section = getDefaultFormToolkit().createSection(this, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | ExpandableComposite.FOCUS_TITLE);
        FormData formData = new FormData();
		formData.top = new FormAttachment(0, 0);
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(100, 0);
        section.setLayoutData(formData);
        section.setText("");
        
        // Adds the values table.
        table = new Table(section, SWT.FULL_SELECTION);
        table.setHeaderVisible(true);
		table.setLinesVisible(false);
		table.setBackground(backgroundColour);
        section.setClient(table);    

		columnNames = Arrays.asList(new String[] { "Name", "Value", "Type", "Optional", "Read-only" });
		TableColumn column;
		column = new TableColumn(table, SWT.NONE);
		column.setText((String) columnNames.get(0));
		column.setWidth(150);
		
		column = new TableColumn(table, SWT.NONE);
		column.setText((String) columnNames.get(1));
		column.setWidth(300);
		
		column = new TableColumn(table, SWT.NONE);
		column.setText((String) columnNames.get(2));
		column.setWidth(90);
		
		column = new TableColumn(table, SWT.NONE);
		column.setText((String) columnNames.get(3));
		column.setWidth(60);
		
		column = new TableColumn(table, SWT.NONE);
		column.setText((String) columnNames.get(4));
		column.setWidth(70);
		
		table.addSelectionListener(new SelectionAdapter() { 
			@Override
			public void widgetSelected(SelectionEvent event) {    
			    tableSelected(event);
			}
		});
		table.addControlListener (new ControlAdapter () {
		       @Override
			public void controlResized (ControlEvent event) {
		           int totalColumnWidth = 0;
		           for(int index = 0; index < table.getColumnCount(); ++index)
		               if(index != 1)
		                   totalColumnWidth += table.getColumn(index).getWidth();
		                           
		           table.getColumn(1).setWidth(table.getSize().x-totalColumnWidth);
		       }
		    });
		
		assistantDialog = new AssistantDialog(table.getShell());
		
		table.addMouseTrackListener(new MouseTrackAdapter() {

			/**
			 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseExit(org.eclipse.swt.events.MouseEvent)
			 */
			@Override
			public void mouseExit(MouseEvent e) {
				//assistantDialog.close();
			}

			/**
			 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseHover(org.eclipse.swt.events.MouseEvent)
			 */
			@Override
			public void mouseHover(MouseEvent event) {
				/*// Gets the table item under the mouse.
				TableItem tableItem = table.getItem(new Point(event.x, event.y));
				if(tableItem == null)
					return;
				
				// Calculates the absolute position of the mouse and the table item.
				Point tableItemPosition = table.toDisplay(tableItem.getBounds().x, tableItem.getBounds().y);
				Point mousePosition = table.toDisplay(event.x, event.y);
				
				// Displays the assistant dialog.
				assistantDialog.close();
				assistantDialog.create((MValue) tableItem.getData(), new Point(mousePosition.x-50, tableItemPosition.y+tableItem.getBounds().height));
				assistantDialog.open();*/
			}});
		
		tableViewer = new TableViewer(table);    
	    tableViewer.setUseHashlookup(true);
	    tableViewer.setColumnProperties((String[]) columnNames.toArray());

	    textCellEditor = new TextCellEditor(table);
	    
	    // Creates the cell editor for valid values.
	    validValuesCellEditor = new ComboBoxCellEditor(table, new String[0], SWT.READ_ONLY);
	    validValuesComboBoxWrapper = new CComboWrapper(((CCombo) validValuesCellEditor.getControl()));
	    validValuesCellEditor.getControl().addFocusListener(new FocusAdapter() {
            @Override
			public void focusGained(FocusEvent e) {
                validValuesComboBoxWrapper.dropDown(true);
            }});
	    
	    // Creates the cell editor for historic values.
	    historicValuesCellEditor = new ComboBoxCellEditor(table, new String[0]);
	    historicValuesComboBoxWrapper = new CComboWrapper(((CCombo) historicValuesCellEditor.getControl()));
	    historicValuesCellEditor.getControl().addFocusListener(new FocusAdapter() {
            @Override
			public void focusGained(FocusEvent e) {
                historicValuesComboBoxWrapper.dropDown(true);
            }});
	    
	    // Creates the cell editor for the null value.
	    nullableCellEditor = new ComboBoxCellEditor(table, new String[0]);
	    nullableComboBoxWrapper = new CComboWrapper(((CCombo) nullableCellEditor.getControl()));
	    nullableCellEditor.getControl().addFocusListener(new FocusAdapter() {
            @Override
			public void focusGained(FocusEvent e) {
            	nullableComboBoxWrapper.dropDown(true);
            }});
	    nullableCellEditor.setItems(new String[] { Type.NULL_FOR_UI });
	    
	    CellEditor[] cellEditors = new CellEditor[5];
	    cellEditors[1] = textCellEditor;
	    tableViewer.setCellEditors(cellEditors);
	    tableViewer.setCellModifier(new ValueModifier(this));

        tableViewer.setContentProvider(new ValueContentProvider(this));
        tableViewer.setLabelProvider(new ValueLabelProvider(this));
	}

    /**
     * Handles table selection events. It updates the value description according to the
     * new selection.
     *
     * @param event Specifies the selection event.
     */
    protected void tableSelected(SelectionEvent event) {
        MValue selectedValue = (MValue) table.getSelection()[0].getData();
        StringBuffer description = new StringBuffer();
        if(selectedValue != null && selectedValue.getDescriptionForUI() != null) {
        	description.append(selectedValue.getDescriptionForUI());

            if(selectedValue.getMInputValues().size() > 0) {
            	description.append("\n\nThis "+selectedValue.getTypeNameForUI().toLowerCase()+" depends on:");
                
                for(MValue mValue: (List<MValue>) selectedValue.getMInputValues())
                	description.append("\n- '"+mValue.getNameForUI()+ "' "+mValue.getTypeNameForUI().toLowerCase()+" of the "+((MObject) mValue.eContainer()).getTypeNameForUI().toLowerCase()+ " '"+((MObject) mValue.eContainer()).getNameForUI()+"'");
            }
        }
        
        table.setToolTipText(description.toString());
    }
    
    /**
     * Gets the table that displays the managed value collection.
     * 
     * @return Returns the table that displays the managed value collection.
     */
    public Table getTable() {
        return table;
    }
    
    /**
     * Gets the table viewer that enables in place editing of the managed value collection.
     * 
     * @return Returns the table viewer that enables in place editing of the managed value collection.
     */
    public TableViewer getTableViewer() {
        return tableViewer;
    }
    
    /**
     * Gets the label that displays the type of managed value collection, for example parameters.
     * 
     * @return Returns the label that displays the type of managed value collection, for example parameters.
     */
    public Label getTableLabel() {
        return typeLabel;
    }
    
    /**
     * Gets the text area that displays the description of the selected managed value.
     * 
     * @return Returns the text area that displays the description of the selected managed value.
     */
    /*?public Text getDescriptionText() {
        return descriptionText;
    }*/
    
    /**
     * @see org.onceforall.dms.desktop.ui.DetailsComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
     */

    @Override
    public void setMElement(MElement mElement) {
        if(section == null || table == null)
            return;
        
        if(mElement == null && this.mElement == null)
            return;

        if(mElement != null && mElement.equals(this.mElement))
            return;

        if(this.mElement != null) {
        	// Unregisters itself from all notifiers and resets the cached managed values.
        	for(MValue mValue: cachedMValues) {
        		mValue.eAdapters().remove(this);
        	}
        	
        	cachedMValues = null;
        }

        this.mElement = mElement;

        if(isDisposed())
            return;
        
        table.removeAll();

        if(mElement != null) {
        	String sectionText;
        	if(valueClass.isAssignableFrom(MProperty.class))
        		sectionText = "Properties";
        	else if(valueClass.isAssignableFrom(MParameter.class))
        		sectionText = "Parameters";
        	else if(valueClass.isAssignableFrom(MResult.class))
        		sectionText = "Results";
        	else
        		sectionText = "Elements";
        	
        	section.setText(sectionText);
        	
        	// Registered itself as adapter on fields that match the value class and 
        	// adds the matching value to the managed value cache.
        	List<MValue> mValues = mElement.getReferencedMElements(valueClass);
        	cachedMValues = new MValue[mValues.size()];
        	for(int index = 0; index < mValues.size(); ++index) {
        		cachedMValues[index] = mValues.get(index);
        		cachedMValues[index].eAdapters().add(this);
        	}
        }
        else {
        	section.setText("(Not available)");
        	section.setToolTipText(null);
        }

        tableViewer.setInput(mElement);
        
        Color shadowColour = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);
        for(int index = 0; index < table.getItemCount(); ++index) {
            if(index%2 == 1)
                table.getItem(index).setBackground(shadowColour);
        }
    }


	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		Point computedSize = super.computeSize(wHint, hHint, changed);
		return new Point(100, computedSize.y);
	}

	/**
     * Converts the value into string array that can be passed a text to the table item to display the value. 
     *
     * @param mValue Holds the managed value to be converted.
     * @return Returns the value into string array that can be passed a text to the table item to display the value.
     */
    protected String[] getValueText(MValue mValue) {
        return new String[] { mValue.getNameForUI(), mValue.getValueForUI(), mValue.getValueType().getNameForUI(), Humaniser.getBooleanForUI(mValue.isRequired()), Humaniser.getBooleanForUI(mValue.isChangeable()) };
    }
    
    /**
     * Gets a list of the column names.
     * 
     * @return Returns a list of the column names.
     */
    public List getColumnNames() {
        return columnNames;
    }

    /**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
        if(isDisposed())
            return;
        
        super.processNotification(notification);
        
        if(notification.getNotifier() instanceof MValue && (notification.getEventType() == Notification.SET || notification.getEventType() == Notification.ADD_MANY || notification.getEventType() == Notification.ADD)) {
            MValue value = (MValue) notification.getNotifier();            
            tableViewer.update(value, null);
        }      
	}


    class ValueModifier implements ICellModifier {
        /** Specifies the owner of the value modifier. */
        protected ValuesTableComposite owner;
        
        /**
         * Creates a new value modifier object.
         *
         * @param owner Specifies the owner of the value modifier.
         */
        public ValueModifier(ValuesTableComposite owner) {
            this.owner = owner;
        }

        /**
         * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
         */
        public boolean canModify(Object element, String property) {
           if(element instanceof MParameter) { 
               	MStep step = (MStep) ((MParameter) element).eContainer();
                if(step.isInProcessingState())
                    return false;
           	}
           
           	MValue value = (MValue) element;
           	String valueForUI = value.getValueForUI();
   	    	boolean ctrlPressed = owner.getMainComposite().getCtrlPressed();
   	    	boolean result = ctrlPressed || !value.isReadOnly();

   	    	if(result) {
   	    		boolean isValueNullable = value instanceof MParameter ? true : !value.isRequired();
   		    	CellEditor[] editors = new CellEditor[5];
   		    	
   		    	String[] validValuesForUI = value.getValidObjectValuesForUI();
	    	    List<String> historyValuesForUI = value.getHistoricValuesForUI();
   	    	    if(validValuesForUI != null) {
   	    	    	if(!isValueNullable)
   	    	    		validValuesCellEditor.setItems(validValuesForUI);
   	    	    	else {
   	    		    	String[] listValues = new String[validValuesForUI.length+1];
   	    		    	listValues[0] = Type.NULL_FOR_UI;
   	    		    	for(int index = 0; index < validValuesForUI.length; ++index)
   	    		    		listValues[index+1] = validValuesForUI[index];
   	    		    	
   	    	    		validValuesCellEditor.setItems(listValues);	    	    		
   	    	    	}
   	    	    		
   	    	        editors[1] = validValuesCellEditor;
   	    	    }
   	    	    else if(historyValuesForUI != null && historyValuesForUI.size() > 0) {
   	    	    	String[] historicValuesArray;
   	    	        if(!historyValuesForUI.contains(valueForUI)) {
   	    	            // Adds the current value if it is not already part of the historic values. This is a workaround for SWT limitations.
   	    	            int index = 1;
	    	            if(isValueNullable && value.getValue() != null)
	    	            	index = 2;
	    	            
   	    	        	historicValuesArray = new String[historyValuesForUI.size()+index];
   	    	            historicValuesArray[0] = valueForUI;
   	    	            
	    	            if(isValueNullable && value.getValue() != null)
	    	            	historicValuesArray[1] = Type.NULL_FOR_UI;
   	    	            
   	    	            Iterator iterator = historyValuesForUI.iterator();
   	    	            while(iterator.hasNext())
   	    	            	historicValuesArray[index++] = (String) iterator.next();
   	    	            
   	    	            historicValuesCellEditor.setItems(historicValuesArray);
   	    	        }
   	    	        else {
   	    	            int index = 0;
	    	            if(isValueNullable)
	    	            	index = 1;

	    	            historicValuesArray = new String[historyValuesForUI.size() + index];
   	    	            
	    	            if(isValueNullable)
	    	            	historicValuesArray[0] = Type.NULL_FOR_UI;
	    	            
   	    	            Iterator iterator = historyValuesForUI.iterator();
   	    	            while(iterator.hasNext())
   	    	            	historicValuesArray[index++] = (String) iterator.next();

   	    	            historicValuesCellEditor.setItems(historicValuesArray);
   	    	        }
   	    	        editors[1] = historicValuesCellEditor;   	    	        
   	    	    	
   	    	    }
   	    	    else {
   	    	    	if(isValueNullable) {
   	    	            int index = 0;
	    	            if(value.getValue() != null)
	    	            	index = 1;

	   	    	    	String[] valuesArray = new String[index+1];
	   	    	    	
	   	    	    	if(value.getValue() != null)
	   	    	    		valuesArray[0] = Type.NULL_FOR_UI;
	   	    	    	
	   	    	    	valuesArray[index] = value.getValueForUI();
	   	    	    	
	   	    	    	nullableCellEditor.setItems(valuesArray);
   	    	    		editors[1] = nullableCellEditor;
   	    	    	}
   	    	    	else
   	    	    		editors[1] = textCellEditor;
   	    	    }
   	    	    
   	    	    tableViewer.setCellEditors(editors);
   	    	}
   	    	
            return result;
        }

        /**
         * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
         */
        public Object getValue(Object element, String property) {
            // Finds the index of the column.
            int columnIndex = owner.getColumnNames().indexOf(property);

            MValue mValue = (MValue) element;
            String valueForUI = mValue.getValueForUI();
            
            // Returns the value to be modified as text.
            if(columnIndex == 1) {
                CellEditor cellEditor = tableViewer.getCellEditors()[1];
   	    	    if(cellEditor instanceof ComboBoxCellEditor) {
   	    	        ComboBoxCellEditor comboBoxCellEditor = (ComboBoxCellEditor) cellEditor;
   	    	        String[] items = comboBoxCellEditor.getItems();
   	    	        int index;
   	    	        for(index = 0; index < items.length-1; ++index) {
   	    	            if(items[index] != null && items[index].equals(valueForUI))
   	    	                break;
   	    	        }
   	    	        
   	    	        return new Integer(index);
   	    	    }
   	    	    else
   	                return(mValue.getValueForUI());
            }
            else
                return "";
        }

        /**
         * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
         */
        public void modify(Object element, String property, Object newValue) {
            // Finds the index of the column.
            int columnIndex = owner.getColumnNames().indexOf(property);

            TableItem tableItem = (TableItem) element;
            MValue mValue = (MValue) tableItem.getData();
            
            // Sets the new value as text.
            if(columnIndex == 1) {
                try {
                    String valueForUI;
                    Control editorControl = tableViewer.getCellEditors()[1].getControl();
       	    	    if(editorControl instanceof CCombo) {
       	    	        CCombo comboBox = (CCombo) editorControl;
       	    	        valueForUI = comboBox.getText();
       	    	    }
       	    	    else
       	    	        valueForUI = (String) newValue;
       	    	    
       	    	    mValue.setValueForUI(valueForUI);
                } catch (ConversionException exception) {
                    MessageBox messageBox = new MessageBox(owner.getShell(), SWT.OK | SWT.ICON_ERROR);
                    messageBox.setMessage(exception.getMessageWithAdvice());
                    messageBox.setText("Digital Media Service Desktop Error");
                    messageBox.open();
    	        } catch (IllegalArgumentException exception) {
                    MessageBox messageBox = new MessageBox(owner.getShell(), SWT.OK | SWT.ICON_ERROR);
                    messageBox.setMessage(exception.getMessage());
                    messageBox.setText("Digital Media Service Desktop Error");
                    messageBox.open();
    	        }
            }
        }
        
    }

    class ValueContentProvider implements IStructuredContentProvider {
        /** Specifies the owner of the value content provider. */
        protected ValuesTableComposite owner;
        
        /**
         * Creates a new value content provide object.
         *
         * @param owner Specifies the owner of the value content provider.
         */
        public ValueContentProvider(ValuesTableComposite owner) {
            this.owner = owner;
        }
        
        /**
         * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
         */
        public Object[] getElements(Object inputElement) {
            return owner.cachedMValues;
        }

        /**
         * @see org.eclipse.jface.viewers.IContentProvider#dispose()
         */
        public void dispose() {       
        }

        /**
         * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
         */
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }
        
    }

    class ValueLabelProvider extends LabelProvider implements ITableLabelProvider {
        /** Specifies the owner of the value label provider. */
        protected ValuesTableComposite owner;
        
        /**
         * Creates a new value label provide object.
         *
         * @param owner Specifies the owner of the value label provider.
         */
        public ValueLabelProvider(ValuesTableComposite owner) {
            this.owner = owner;
        }

        /**
         * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
         */
        public Image getColumnImage(Object element, int columnIndex) {
            return null;
        }

        /**
         * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
         */
        public String getColumnText(Object element, int columnIndex) {
            MValue mValue = (MValue) element;

            switch (columnIndex) {
                case 0:
                    return mValue.getNameForUI();
                case 1 :
                    return mValue.getValueForUI();
                case 2 :
                    return mValue.getValueType().getNameForUI();
                case 3 :
                    return Humaniser.getBooleanForUI(!mValue.isRequired());
                case 4 :
                    return Humaniser.getBooleanForUI(mValue.isReadOnly());
                default:
                    return null;
            }
        }
        
    }

	/**
	 * @see org.eclipse.ui.forms.widgets.ExpandableComposite#isExpanded()
	 */
	public boolean isExpanded() {
		return section.isExpanded();
	}

	/**
	 * @see org.eclipse.ui.forms.widgets.ExpandableComposite#setExpanded(boolean)
	 */
	public void setExpanded(boolean expanded) {
		section.setExpanded(expanded);
	}

	/**
	 * Gets the class of the managed value that this composite should display.
     * It should be either {@link org.onceforall.dms.desktop.logic.MValue} or a subclass. 
     * The class acts as a filter for the member variables.
	 * @return Returns the class of the managed value that this composite should display.
	 */
	public Class getValueClass() {
		return valueClass;
	}
}

class AssistantDialog extends PopupDialog {
	/** Specifies the label that displays the information. */
	protected Label label;
	
	/** Specifies the absolute position of the dialog. */
	protected Point location;
	
	/** Specifies the managed values that this assistant presents. */
	protected MValue mValue;
	
	/**
	 * Creates a new assistantDialog dialog object.
	 *
	 * @param parentShell Specifies the parent shell.
	 */
	public AssistantDialog(Shell parentShell) {
		super(parentShell, SWT.ON_TOP | SWT.NO_FOCUS | SWT.TOOL | SWT.NO_TRIM, false, false, false, false, null, null);
	}

	/**
	 * @see org.eclipse.jface.window.Window#create()
	 */
	public void create(MValue mValue, Point location) {
		this.mValue = mValue;
		this.location = location;

		super.create();
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		label = new Label(parent, 0);
		label.setText(mValue.getDescription());
		label.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		label.setForeground(getShell().getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		
		return label;
	}

	/**
	 * Gets the label that displays the information.
	 *
	 * @return Returns the label that displays the information.
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#getInitialLocation(org.eclipse.swt.graphics.Point)
	 */
	@Override
	protected Point getInitialLocation(Point initialSize) {
		if(location != null)
			return location;
		
		return super.getInitialLocation(initialSize);
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		return label.computeSize(-1, -1);
	}	
}