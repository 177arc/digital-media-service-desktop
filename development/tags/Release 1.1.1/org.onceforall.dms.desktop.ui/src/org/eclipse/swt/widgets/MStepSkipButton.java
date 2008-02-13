package org.eclipse.swt.widgets;

import java.io.File;

import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;
import org.onceforall.dms.desktop.ui.MStepButton;

/**
 * Defines a button that skips the action that is associated
 * with a managed step. 
 * 
 * @author Marc
 */
public class MStepSkipButton extends MStepButton {
	/** Specifies the skip icon file. */
	protected final static File SKIP_ICON_FILE = new File("Image Files\\Skip.gif");

	/**
	 * Creates a new managed step skip button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MStepSkipButton(Composite parent, int style) {
		super(parent, style);
		
		setImage(iconCache.get(SKIP_ICON_FILE));
		setText("Skip");
		setToolTipText("Skips this task.");
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#updateFromState()
	 */
	@Override
	protected void updateFromState() {		
		MStep step = (MStep) mElement;
		State state = step.getStateProperty();

		setVisible(true);
		setEnabled(state.equals(MStepStateType.ERROR_STATE) || state.equals(MStepStateType.PENDING_STATE));	
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MStepButton#performAction()
	 */
	@Override
	protected void performAction() {
		if (mElement == null)
			return;
		
		super.performAction();

		((MStep) mElement).skip();
	}
}
