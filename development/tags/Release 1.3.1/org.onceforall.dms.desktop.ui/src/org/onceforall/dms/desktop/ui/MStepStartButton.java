package org.onceforall.dms.desktop.ui;

import java.io.File;

import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.exception.DesktopExceptionList;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;

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
		else {
			DesktopExceptionList exceptions = mStep.validate();
	    	if(Utilities.showValidationExceptionsDialog(getShell(), exceptions))	
	    		getDisplay().asyncExec(((MStep) mElement).getRunnable());			
		}
	}
}
