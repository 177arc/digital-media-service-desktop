package org.onceforall.dms.desktop.ui;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.StyledText;

public class Test {

	private Shell sShell = null;
	private CLabel cLabel = null;
	private Label label = null;
	private Composite composite = null;
	private StyledText styledText = null;

	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		composite = new Composite(sShell, SWT.NO_BACKGROUND);
		composite.setLayout(new GridLayout());
		composite.setBackground(null);
		composite.setBounds(new Rectangle(32, 71, 98, 43));
	}

	/**
	 * TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Before this is run, be sure to set up the launch configuration (Arguments->VM Arguments)
		 * for the correct SWT library path in order to run with the SWT dlls. 
		 * The dlls are located in the SWT plugin jar.  
		 * For example, on Windows the Eclipse SWT 3.1 plugin jar is:
		 *       installation_directory\plugins\org.eclipse.swt.win32_3.1.0.jar
		 */
		Display display = Display.getDefault();
		Test thisClass = new Test();
		thisClass.createSShell();
		thisClass.sShell.open();

		while (!thisClass.sShell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		sShell = new Shell();
		sShell.setText("Shell");
		sShell.setSize(new Point(300, 200));
		sShell.setLayout(null);
		cLabel = new CLabel(sShell, SWT.DRAW_TRANSPARENT);
		cLabel.setText("CLabel");
		cLabel.setBounds(new Rectangle(8, 82, 247, 24));
		label = new Label(sShell, SWT.DRAW_TRANSPARENT);
		label.setBounds(new Rectangle(65, 16, 139, 53));
		label.setText("Label");
		label.setBackground(null);
		createComposite();
		styledText = new StyledText(sShell, SWT.DRAW_TRANSPARENT);
		styledText.setBounds(new Rectangle(182, 35, 64, 59));
	}

}
