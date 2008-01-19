package org.eclipse.swt.widgets;

import java.io.File;

import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.ui.MStepButton;

/**
 * Defines a button that stop the action that is associated
 * with a managed step. 
 * 
 * @author Marc
 */
public class MStepStopButton extends MStepButton {
	/** Specifies the stop icon file. */
	protected final static File STOP_ICON_FILE = new File("Image Files\\Stop.gif");

	/**
	 * Creates a new managed step stop button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MStepStopButton(Composite parent, int style) {
		super(parent, style);
		
		setImage(iconCache.get(STOP_ICON_FILE));
		setText("Stop");
		setToolTipText("Stops this task.");
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#updateFromState()
	 */
	@Override
	protected void updateFromState() {		
		MStep step = (MStep) mElement;
		State state = step.getStateProperty();
		
		setVisible(step.isStoppable());
		setEnabled(!state.equals(MStepStateType.PENDING_STATE) && !state.equals(MStepStateType.COMPLETED_STATE) && !state.equals(MStepStateType.ERROR_STATE) && !state.equals(MStepStateType.TERMINATED_STATE));
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#performAction()
	 */
	@Override
	protected void performAction() {
		if (mElement == null)
			return;
		
		super.performAction();
		
		((MStep) mElement).stop();
	}
}
