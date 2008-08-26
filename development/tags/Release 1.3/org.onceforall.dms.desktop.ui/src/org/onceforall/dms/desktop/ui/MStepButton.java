package org.onceforall.dms.desktop.ui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.widgets.Composite;
import org.onceforall.dms.desktop.logic.LogicPackage;
import org.onceforall.dms.desktop.logic.MElement;
import org.onceforall.dms.desktop.logic.MStep;
import org.onceforall.dms.desktop.logic.MValue;

/**
 * Represents the button that are associated with a managed step.
 * 
 * @see org.onceforall.dms.desktop.logic.MStep
 */
public abstract class MStepButton extends MElementButton {
	/**
	 * Creates a new managed step button.
	 * 
	 * @param parents Specifies the parent composite of this button.
	 * @param style Specifies the style of this button.
	 */
	public MStepButton(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementButton#setMElement(org.onceforall.dms.desktop.logic.MElement)
	 */
	@Override
	public void setMElement(MElement mElement) {
		// Makes sure that the new managed element is actually different to the
		// current one.
		if (mElement == null && this.mElement == null)
			return;

		if (mElement != null && mElement.equals(this.mElement))
			return;

		// Makes sure that the managed element is a managed step.
		if (mElement != null && !(mElement instanceof MStep)) {
			setVisible(false);
			throw new IllegalArgumentException("The parameter 'mElement' must be an instance of MStep.");
		}
		
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
			updateFromState();
		}
	}

	/**
	 * @see org.onceforall.dms.desktop.ui.MElementButton#processNotification(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void processNotification(Notification notification) {
		super.processNotification(notification);
		
		if(notification.getEventType() == Notification.SET && notification.getNotifier() instanceof MValue) {
			MValue mValue = (MValue) notification.getNotifier();
			if(mValue.eContainingFeatureID() == LogicPackage.MSTEP__MSTATE_PROPERTY) {
				updateFromState();
			}
		}
	}

	/**
	 * Updates the button's icon, caption, visibility and enabled state depending on the 
	 * state of the managed step that this button is associated with.
	 */
	protected abstract void updateFromState();
	
	/**
	 * Performs that action that this button represents.
	 */
	protected void performAction() {
		// Makes sure that the managed element is selected if there is a problem
		// so that the user has more information available albeit behind the message dialog.
		Composite parent = getParent();
		while(parent != null) {
			if(parent instanceof MElementSelector) {
				((MElementSelector) parent).setSelectedMElement(mElement);
				break;
			}
			
			parent = parent.getParent();
		}
	}
}
