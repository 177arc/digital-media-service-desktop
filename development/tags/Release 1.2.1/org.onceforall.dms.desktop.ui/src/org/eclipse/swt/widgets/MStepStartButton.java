package org.eclipse.swt.widgets;

import java.io.File;

import org.eclipse.swt.SWT;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.ui.MStepButton;

/**
 * Defines a button that starts the action that is associated
 * with a managed step. 
 * 
 * @author Marc
 */
public class MStepStartButton extends MStepButton {
	/** Specifies the pause icon file. */
	protected final static File PAUSE_ICON_FILE = new File("Image Files\\Pause.gif");

	/**
	 * Creates a new managed step start button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MStepStartButton(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#updateFromState()
	 */
	@Override
	protected void updateFromState() {
		MStep step = (MStep) mElement;
		State state = step.getStateProperty();

		if (state.equals(MStepStateType.PROCESSING_STATE) && step.isInterruptable()) {
			setImage(iconCache.get(PAUSE_ICON_FILE));
			setText("Pause");
			setToolTipText("Pauses this task.");
		}
		else if (state.equals(MStepStateType.PAUSED_STATE)) {
			setImage(iconCache.get(step.getActionIconFilePath()));
			setText("Resume");
			setToolTipText("Resumes this task.");
		}
		else {
			setImage(iconCache.get(step.getActionIconFilePath()));
			setText(step.getActionName() != null ? step.getActionName() : "Mark as completed");
			setToolTipText(step.getDescriptionForUI());
		}
		
		setVisible(true);
		setEnabled(state.equals(MStepStateType.COMPLETED_STATE) || state.equals(MStepStateType.TERMINATED_STATE) || state.equals(MStepStateType.ERROR_STATE) || state.equals(MStepStateType.PENDING_STATE)
				|| state.equals(MStepStateType.SKIPPED_STATE) || (step.isInterruptable() && !state.equals(MStepStateType.STOPPING_STATE) && !state.equals(MStepStateType.TERMINATING_STATE)));
	
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#performAction()
	 */
	@Override
	protected void performAction() {
		if (mElement == null)
			return;
		
		super.performAction();
		
		MStep mStep = (MStep) getMElement();
		State state = mStep.getStateProperty();

		if (state.equals(MStepStateType.PROCESSING_STATE))
			mStep.pause();
		else if (state.equals(MStepStateType.PAUSED_STATE))
			mStep.resume();
		else
			try {
				mStep.validate();
				getDisplay().asyncExec((MStep) mElement);
			} catch (DesktopException exception) {
				
				if (exception.getSeverity() >= DesktopException.ERROR_SEVERITY) {
					MessageBox messageBox = new MessageBox(this.getShell(), SWT.OK | SWT.ICON_ERROR);
					messageBox.setMessage(exception.getMessageWithAdvice());
					messageBox.setText("Digital Media Service Desktop Error");
					messageBox.open();
				}
				else if (exception.getSeverity() == DesktopException.WARNING_SEVERITY) {
					MessageBox messageBox = new MessageBox(this.getShell(), SWT.YES | SWT.NO | SWT.ICON_WARNING);
					messageBox.setMessage(exception.getMessageWithAdvice() + "\n\nWould you like to continue anyway?");
					messageBox.setText("Digital Media Service Desktop Warning");
					if (messageBox.open() == SWT.YES)
						getDisplay().asyncExec((MStep) mElement);
				}
				else  {
					MessageBox messageBox = new MessageBox(this.getShell(), SWT.YES | SWT.NO | SWT.ICON_QUESTION);
					messageBox.setMessage(exception.getMessageWithAdvice() + "\n\nWould you like to continue anyway?");
					messageBox.setText("Digital Media Service Desktop Information");
					if (messageBox.open() == SWT.YES)
						getDisplay().asyncExec((MStep) mElement);
				}
			}
	}

}
