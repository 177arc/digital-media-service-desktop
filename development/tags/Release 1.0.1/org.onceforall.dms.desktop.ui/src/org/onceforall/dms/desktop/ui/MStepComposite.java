/*
 * Revision History:
 * $Log: MStepComposite.java,v $
 * Revision 1.3  2007/05/12 11:03:37  marc
 * Moved to EMF model-based application.
 *
 * Revision 1.2  2006/09/19 12:55:59  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:56:25  marc
 * Added initial revision.
 *
 * Revision 1.7  2005/09/10 09:03:25  Marc
 * Fixed defect 13. Added spaceholder to protect control buttons from being hidden.
 *
 * Revision 1.6  2005/07/20 10:54:27  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.5  2005/06/12 12:09:50  Marc
 * Updated for version 0.4.3.
 *
 * Revision 1.4  2005/04/09 17:57:54  Marc
 * Updated for version 0.4.
 *
 * Revision 1.3  2005/03/18 00:42:24  Marc
 * Made sure that the application shut-down does not throw exceptions.
 *
 * Revision 1.2  2005/03/13 14:21:35  Marc
 * Added burn CDs mStep and generally improve application.
 *
 * Revision 1.1  2005/03/04 00:19:03  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.ui;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.ProgressBar;
import org.onceforall.dms.desktop.exception.DesktopException;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MObject;
import org.onceforall.dms.desktop.logic.MParameter;
import org.onceforall.dms.desktop.logic.MProperty;
import org.onceforall.dms.desktop.logic.MResult;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;
import org.onceforall.dms.desktop.logic.types.MStepStateType;
import org.onceforall.dms.desktop.logic.types.State;

/**
 * Defines a SWT composite that is responsible for displaying a mStep.
 */

public class MStepComposite extends DetailsComposite {
	/** Specifies the values table composite that displays the mStep parameters. */
	protected ValuesTableComposite parametersTableComposite;

	/** Specifies the values table composite that displays the mStep results. */
	protected ValuesTableComposite resultsTableComposite;

	/** Specifies the values table composite that displays the mStep properties. */
	protected ValuesTableComposite propertiesTableComposite;

	/** Specifies the start button. */
	protected Button startButton;

	/** Specifies the stop button. */
	protected Button stopButton;

	/** Specifies the terminate button. */
	protected Button terminateButton;

	/** Specifies the skip button. */
	protected Button skipButton;

	/** Specifies the progress bar. */
	protected ProgressBar progressBar;

	/**
	 * Specifies the progress bar that is displayed when the progress is
	 * indeterminate.
	 */
	protected ProgressBar indeterminateProgressBar;

	/** Specifies the progress status indicator. */
	protected Label progressStatusLabel;

	/**
	 * Specifies a spaceholder composite that ensures that all buttons will be
	 * accessible even if the parent composite area is small.
	 */
	protected Composite spaceHolderComposite;

	/** Specifies the maximum number of buttons. */
	protected static final int MAX_NUMBER_OF_BUTTONS = 4;

	/** Specifies the layout data for the button positions. */
	protected FormData[] positionLayoutData = new FormData[MAX_NUMBER_OF_BUTTONS];

	/** Specifies all the buttons from left to right. */
	protected Button[] buttons = new Button[MAX_NUMBER_OF_BUTTONS];

	/** Specifes area where the values (properties, parameters and results) will be displayed. */
	protected Composite valuesComposite;
	
	/** Specifies a sidebar that can contain additional information, e.g. the MAudioStepComposite uses the sidebar to display the level indicators.
	 *  The side bar is invisible and excluded from the layout by default. */
	protected Composite sideBarComposite;
	
	/**
	 * Specifies a bar that contains the dynmically displayed buttons and the
	 * progress bar.
	 */
	protected Composite buttonBarComposite;
	/**
	 * Creates a new mStep composite object.
	 * 
	 * @param parent Specifies the parent of the mStep composite object.
	 * @param style Specifies the style of the mStep composite object.
	 */
	public MStepComposite(Composite parent, int style) {
		super(parent, style);

		Color backgroundColour = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
		setBackground(backgroundColour);
		
		GridData layoutData;

		// Adds the values composite.
		valuesComposite = getDefaultFormToolkit().createComposite(this);
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, true);
		valuesComposite.setLayoutData(layoutData);
		valuesComposite.setLayout(new GridLayout());

		// Adds the parameters table composite.
		parametersTableComposite = new ValuesTableComposite(valuesComposite, MParameter.class);
		parametersTableComposite.setExpanded(true);
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
		parametersTableComposite.setLayoutData(layoutData);

		// Adds the result table composite.
		resultsTableComposite = new ValuesTableComposite(valuesComposite, MResult.class);
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, false);
		resultsTableComposite.setLayoutData(layoutData);

		// Adds the properties table composite.
		propertiesTableComposite = new ValuesTableComposite(valuesComposite, MProperty.class);
		layoutData = new GridData(GridData.FILL, GridData.FILL, true, true);
		propertiesTableComposite.setLayoutData(layoutData);
		
		// Adds the side bar.
		sideBarComposite = getDefaultFormToolkit().createComposite(this);
		sideBarComposite.setVisible(false);
		layoutData = new GridData(GridData.FILL, GridData.FILL, false, true);
		layoutData.exclude = true;
		sideBarComposite.setLayoutData(layoutData);
		
		// Adds the button bar.
		buttonBarComposite = getDefaultFormToolkit().createComposite(this);
		layoutData = new GridData(GridData.FILL, GridData.END, true, false);
		buttonBarComposite.setLayoutData(layoutData);
		buttonBarComposite.setLayout(new FormLayout());

		FormData formData;
		
		// Adds the progress indicators to the button bar.
		progressStatusLabel = getDefaultFormToolkit().createLabel(buttonBarComposite, null);
		progressStatusLabel.setBackground(getBackground());	
		formData = new FormData(); 
		formData.top = new FormAttachment(100,-25);
		formData.bottom = new FormAttachment(100, -10);
		formData.left = new FormAttachment(0, 0); formData.right = new FormAttachment(100,-MAX_NUMBER_OF_BUTTONS*100+(1-MAX_NUMBER_OF_BUTTONS)*5-10);
		progressStatusLabel.setLayoutData(formData);

		progressBar = new ProgressBar(buttonBarComposite, SWT.HORIZONTAL | SWT.SMOOTH);
		progressBar.setBackground(backgroundColour);
	
		// TODO: Move to toolkit.
		formData = new FormData(); 
		formData.top = new FormAttachment(100,-10);
		formData.bottom = new FormAttachment(100, 0);
		formData.left = new FormAttachment(0, 0); formData.right = new FormAttachment(100,-MAX_NUMBER_OF_BUTTONS*100+(1-MAX_NUMBER_OF_BUTTONS)*5-10);
		progressBar.setLayoutData(formData);

		indeterminateProgressBar = new ProgressBar(buttonBarComposite, SWT.HORIZONTAL | SWT.INDETERMINATE | SWT.SMOOTH);
		indeterminateProgressBar.setBackground(backgroundColour);
		indeterminateProgressBar.setLayoutData(formData);
		
		// Adds the start button to the button bar.
		startButton = new Button(buttonBarComposite, SWT.NONE);
		startButton.setText("Start");
		startButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				start();
			}
		});

		// Adds the stop button to the button bar.
		stopButton = new Button(buttonBarComposite, SWT.NONE);
		stopButton.setText("Stop");
		stopButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				stop();
			}
		});

		// Adds the terminate button to the button bar.
		terminateButton = new Button(buttonBarComposite, SWT.NONE);
		terminateButton.setText("Terminate");
		terminateButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				terminate();
			}
		});

		// Adds the skip button to the button bar.
		skipButton = new Button(buttonBarComposite, SWT.NONE);
		skipButton.setText("Skip");
		skipButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				skip();
			}
		});
    	
      for(int index = 0; index < MAX_NUMBER_OF_BUTTONS; ++index) {
        positionLayoutData[index] = new FormData();
        positionLayoutData[index].top = new FormAttachment(100, -25);
        positionLayoutData[index].bottom = new FormAttachment(100, 0);
        positionLayoutData[index].left = new FormAttachment(100, (index-MAX_NUMBER_OF_BUTTONS)*100+(index+1-MAX_NUMBER_OF_BUTTONS)*5);
        positionLayoutData[index].right = new FormAttachment(100, (index+1-MAX_NUMBER_OF_BUTTONS)*100+(index+1-MAX_NUMBER_OF_BUTTONS)*5);
      }

		buttons[0] = startButton;
		buttons[1] = stopButton;
		buttons[2] = terminateButton;
		buttons[3] = skipButton;

		setMElement(null);
	}

	/**
	 * Requests the start/pause/resume of the mStep that this composite is
	 * responsible for.
	 */
	public void start() {
		if (mElement == null)
			return;

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

	/**
	 * Requests the stop of the mStep that this composite is responsible for.
	 */
	public void stop() {
		if (mElement == null)
			return;

		((MStep) mElement).stop();
	}

	/**
	 * Requests the skipping of the mStep that this composite is responsible for.
	 */
	public void skip() {
		if (mElement == null)
			return;

		((MStep) mElement).skip();
	}

	/**
	 * Requests the termination of the mStep that this composite is responsible
	 * for.
	 */
	public void terminate() {
		if (mElement == null)
			return;

		MessageBox messageBox = new MessageBox(this.getShell(), SWT.YES | SWT.NO | SWT.ICON_WARNING);
		messageBox.setMessage("You are about to terminate '" + mElement.getNameForUI() + "' forcefully.\n\nWould you like to continue anyway?");
		messageBox.setText("Digital Media Service Desktop Warning");
		if (messageBox.open() == SWT.YES)
			((MStep) mElement).terminate();
	}

	/**
	 * Updates the start and stop buttons according to the mStep state.
	 */
	protected void updateState() {
		MStep step = (MStep) getMElement();
		if (step != null) {
			State state = step.getStateProperty();

			if (state.equals(MStepStateType.PENDING_STATE) || state.equals(MStepStateType.COMPLETED_STATE) || state.equals(MStepStateType.ERROR_STATE) || state.equals(MStepStateType.TERMINATED_STATE) || !step.isInterruptable())
				startButton.setText(step.getActionName() != null ? step.getActionName() : "Start");
			else if (state.equals(MStepStateType.PAUSED_STATE))
				startButton.setText("Resume");
			else
				startButton.setText("Pause");

			startButton.setEnabled(state.equals(MStepStateType.COMPLETED_STATE) || state.equals(MStepStateType.TERMINATED_STATE) || state.equals(MStepStateType.ERROR_STATE) || state.equals(MStepStateType.PENDING_STATE)
					|| state.equals(MStepStateType.SKIPPED_STATE) || (step.isInterruptable() && !state.equals(MStepStateType.STOPPING_STATE) && !state.equals(MStepStateType.TERMINATING_STATE)));
			stopButton.setEnabled(!state.equals(MStepStateType.PENDING_STATE) && !state.equals(MStepStateType.COMPLETED_STATE) && !state.equals(MStepStateType.ERROR_STATE) && !state.equals(MStepStateType.TERMINATED_STATE));
			terminateButton.setEnabled(!startButton.getEnabled());
			skipButton.setEnabled(state.equals(MStepStateType.ERROR_STATE) || state.equals(MStepStateType.PENDING_STATE));
			
			resultsTableComposite.setExpanded(state.equals(MStepStateType.COMPLETED_STATE));
		} else {
			startButton.setEnabled(false);
			stopButton.setEnabled(false);
			terminateButton.setEnabled(false);
			skipButton.setEnabled(false);
		}
	}

	/**
	 * Updates the progress bar and the progress status label.
	 */
	protected void updateProgress() {
		MStep mStep = (MStep) getMElement();
		if (mStep != null) {
			Long progress = mStep.getProgressProperty();
			String progressStatus = mStep.getProgressStatusProperty();
			State state = mStep.getStateProperty();

			boolean pending = state.equals(MStepStateType.PENDING_STATE);
			boolean inderterminate = state.equals(MStepStateType.PROCESSING_STATE) && progress == null;
			progressBar.setVisible(!inderterminate && !pending);
			indeterminateProgressBar.setVisible(inderterminate && !pending);
			progressStatusLabel.setVisible(!pending);

			if (progress != null)
				progressBar.setSelection((int) progress.longValue());
			else
				progressBar.setSelection(0);

			progressStatusLabel.setText(progressStatus != null ? progressStatus : state.getNameForUI());
		}
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
		if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MValue) {
			MValue mValue = (MValue) notification.getNotifier();
			if(mValue.eContainingFeatureID() == LogicPackage.MSTEP__MSTATE_PROPERTY) {
				updateState();
				updateProgress();
			}
			else if(mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_PROPERTY || mValue.eContainingFeatureID() == LogicPackage.MSTEP__MPROGRESS_STATUS_PROPERTY)
				updateProgress();
		}
	}

	/**
	 * Gets the values table composite that displays the mStep parameters.
	 * 
	 * @return Returns the values table composite that displays the mStep
	 *         parameters.
	 */
	public ValuesTableComposite getParametersTableComposite() {
		return parametersTableComposite;
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementComposite#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) throws IllegalArgumentException {
		// Makes sure that the new simple object is actually different to the
		// current one.
		if (mElement == null && this.mElement == null)
			return;

		if (mElement != null && mElement.equals(this.mElement))
			return;

		// Makes sure that the simple object is a mStep.
		if (mElement != null && !(mElement instanceof MStep))
			throw new IllegalArgumentException("The parameter 'mElement' must be an instance of MStep.");

		// Deletes itself as observer from the previous managed step if it is
		// not null.
		if (this.mElement != null) {
			MStep mStep = (MStep) this.mElement;
			mStep.getMProgressProperty().eAdapters().remove(this);
			mStep.getMStateProperty().eAdapters().remove(this);
			mStep.getMProgressProperty().eAdapters().remove(this);
			mStep.getMProgressStatusProperty().eAdapters().remove(this);
		}
		
		super.setMElement(mElement);

		if (isDisposed())
			return;

		// Adds itself as observer to the new managed step if it is not null.
		if (mElement != null) {
			MStep mStep = (MStep) this.mElement;
			mStep.getMStateProperty().eAdapters().add(this);
			mStep.getMProgressProperty().eAdapters().add(this);
			mStep.getMProgressStatusProperty().eAdapters().add(this);
		}

		MStep step = (MStep) mElement;
		if (step != null) {
			displayValuesTableComposite(parametersTableComposite, step, step.getFixedMParameters());
			displayValuesTableComposite(resultsTableComposite, step, step.getFixedMResults());
			displayValuesTableComposite(propertiesTableComposite, step, step.getFixedMProperties());
			
			stopButton.setVisible(step.isStoppable());
			terminateButton.setVisible(step.isTerminatable());
			
			layout();
		} else {
			displayValuesTableComposite(parametersTableComposite, null, null);
			displayValuesTableComposite(resultsTableComposite, null, null);
			displayValuesTableComposite(propertiesTableComposite, null, null);
		}
		
		/*for(ValuesTableComposite valuesTableComposite: valuesTableComposites)
			((GridData) valuesTableComposite.getLayoutData()).exclude =
				!valuesTableComposite.isVisible();*/
		
		int visibleButtonsCount = 0;
		for (Button button : buttons)
			if(button.getVisible())
				visibleButtonsCount++;

		int index = MAX_NUMBER_OF_BUTTONS-visibleButtonsCount;
		for (Button button : buttons)
			if (button.getVisible())
				button.setLayoutData(positionLayoutData[index++]);

		updateState();
		updateProgress();
	}
	
	/**
	 * Sets the given values for the given values table composite. If 
	 * there are no values, it excludes the composite from the layout and 
	 * makes it invisible.
	 * 
	 * @param valuesTableComposite Specifies the composite that should display the managed values in a table.
	 * @param  mObject Specifies the managed object whose values should be displayed.
	 * @param  mValues Specifies the managed values to be displayed.
	 */
	protected void displayValuesTableComposite(ValuesTableComposite valuesTableComposite, MObject mObject, List mValues) {
		if (mValues != null && mValues.size() > 0) {
			valuesTableComposite.setMElement(mObject);
			((GridData) valuesTableComposite.getLayoutData()).exclude = false;
			valuesTableComposite.setVisible(true);
		} else {
			valuesTableComposite.setMElement(null);
			((GridData) valuesTableComposite.getLayoutData()).exclude = true;
			valuesTableComposite.setVisible(false);
		}		
	}

	/**
	 * Gets the start button.
	 * 
	 * @return Returns the start button.
	 */
	public Button getStartButton() {
		return startButton;
	}

	/**
	 * Gets the pause/resume button.
	 * 
	 * @return Returns the pause/resume button.
	 */
	/*
	 * ?public Button getPauseResumeButton() { return pauseResumeButton; }
	 */

	/**
	 * Gets the stop button.
	 * 
	 * @return Returns the stop button.
	 */
	public Button getStopButton() {
		return stopButton;
	}

	/**
	 * Gets the terminate button.
	 * 
	 * @return Returns the terminate button.
	 */
	public Button getTerminateButton() {
		return terminateButton;
	}

	/**
	 * Gets the skip button.
	 * 
	 * @return Returns the skip button.
	 */
	public Button getSkipButton() {
		return skipButton;
	}

	/**
	 * Gets the values table composite that displays the mStep results.
	 * 
	 * @return Returns the values table composite that displays the mStep
	 *         results.
	 */
	public ValuesTableComposite getResultsTableComposite() {
		return resultsTableComposite;
	}
}
