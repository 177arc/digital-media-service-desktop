package org.eclipse.swt.widgets;

import java.io.File;

import org.eclipse.swt.SWT;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.ui.MStepButton;

/**
 * Defines a button that terminates the action that is associated
 * with a managed step. 
 * 
 * @author Marc
 */
public class MStepTerminateButton extends MStepButton {
	/** Specifies the terminate icon file. */
	protected final static File TERMINATE_ICON_FILE = new File("Image Files\\Terminate.gif");

	/**
	 * Creates a new managed step terminate button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MStepTerminateButton(Composite parent, int style) {
		super(parent, style);
		
		setImage(iconCache.get(TERMINATE_ICON_FILE));
		setText("Terminate");
		setToolTipText("Terminates this task immediately. This may leave the application in an inconsistent state.");
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#updateFromState()
	 */
	@Override
	protected void updateFromState() {		
		MStep step = (MStep) mElement;
		State state = step.getStateProperty();

		setVisible(step.isTerminatable());
		setEnabled(state.equals(MStepStateType.PROCESSING_STATE));
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#performAction()
	 */
	@Override
	protected void performAction() {
		if (mElement == null)
			return;
		
		super.performAction();
		
		MessageBox messageBox = new MessageBox(this.getShell(), SWT.YES | SWT.NO | SWT.ICON_WARNING);
		messageBox.setMessage("You are about to terminate '" + mElement.getNameForUI() + "' forcefully.\n\nWould you like to continue anyway?");
		messageBox.setText("Digital Media Service Desktop Warning");
		if (messageBox.open() == SWT.YES)
			((MStep) mElement).terminate();
	}
}
