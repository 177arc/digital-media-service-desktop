/**
 * Revision History:
 * $Log: $
 */
package org.onceforall.dms.desktop.ui;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

/**
 * Defines (...). TODO Complete comment.
 *
 *
 * @author Marc
 */
public class UpdateComposite extends Composite {

	private FormToolkit formToolkit = null;   //  @jve:decl-index=0:visual-constraint=""
	private Button updateButton = null;
	private Button continueButton = null;
	private Browser messageBrowser = null;
	private Label promptLabel = null;
	public UpdateComposite(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		
		GridData continueButtonGridData = new GridData();
		continueButtonGridData.grabExcessHorizontalSpace = true;
		continueButtonGridData.horizontalAlignment = org.eclipse.swt.layout.GridData.END;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		GridData promptLabelGridData = new GridData();
		promptLabelGridData.grabExcessHorizontalSpace = true;
		promptLabelGridData.horizontalSpan = 2;
		promptLabel = new Label(this, SWT.WRAP);
		promptLabel.setText("The application has detected that there is an update waiting. Please read the following update message carefully:");
		promptLabel.setLayoutData(promptLabelGridData);
		createMessageBrowser();
		this.setLayout(gridLayout);
		FormData continueButtonFormData = new FormData();
		continueButtonFormData.bottom = new FormAttachment(100, -5);
		continueButtonFormData.right = new FormAttachment(100, -5);
		continueButtonFormData.left = new FormAttachment(100, -75);
		continueButton = getFormToolkit().createButton(this, "Continue", SWT.PUSH);
		continueButton.setLayoutData(continueButtonGridData);
		updateButton = getFormToolkit().createButton(this, "Update", SWT.PUSH | SWT.DEFAULT);
		setSize(new Point(300, 200));
	}

	/**
	 * This method initializes formToolkit	
	 * 	
	 * @return org.eclipse.ui.forms.widgets.FormToolkit	
	 */
	private FormToolkit getFormToolkit() {
		if (formToolkit == null) {
			formToolkit = new FormToolkit(Display.getCurrent());
		}
		return formToolkit;
	}

	/**
	 * This method initializes messageBrowser	
	 *
	 */
	private void createMessageBrowser() {
		GridData messageBrowserGridData = new GridData();
		messageBrowserGridData.grabExcessHorizontalSpace = true;
		messageBrowserGridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		messageBrowserGridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		messageBrowserGridData.horizontalSpan = 2;
		messageBrowserGridData.grabExcessVerticalSpace = true;
		messageBrowser = new Browser(this, SWT.NONE);
		messageBrowser.setLayoutData(messageBrowserGridData);
		messageBrowser.setText("<b>Message</b>");
	}

}
