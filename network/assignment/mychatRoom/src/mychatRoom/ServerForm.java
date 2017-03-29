package mychatRoom;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ServerForm {

	protected Shell shlServerform;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerForm window = new ServerForm();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlServerform.open();
		shlServerform.layout();
		while (!shlServerform.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlServerform = new Shell();
		shlServerform.setSize(336, 187);
		shlServerform.setText("ServerForm");
		
		Button btnStart = new Button(shlServerform, SWT.NONE);
		btnStart.setBounds(10, 10, 75, 25);
		btnStart.setText("Start");
		
		Button btnStop = new Button(shlServerform, SWT.NONE);
		btnStop.setBounds(10, 54, 75, 25);
		btnStop.setText("Stop");
		
		Button btnReset = new Button(shlServerform, SWT.NONE);
		btnReset.setText("Reset");
		btnReset.setBounds(10, 99, 75, 25);
		
		Label lblServerIp = new Label(shlServerform, SWT.NONE);
		lblServerIp.setBounds(111, 15, 55, 15);
		lblServerIp.setText("Server IP:");
		
		text = new Text(shlServerform, SWT.BORDER);
		text.setEnabled(false);
		text.setEditable(false);
		text.setBounds(172, 33, 132, 21);
		
		Label lblServerPort = new Label(shlServerform, SWT.NONE);
		lblServerPort.setText("Server Port:");
		lblServerPort.setBounds(111, 72, 75, 15);
		
		text_1 = new Text(shlServerform, SWT.BORDER);
		text_1.setEnabled(false);
		text_1.setEditable(false);
		text_1.setBounds(172, 101, 132, 21);
		
		Label lblDesign = new Label(shlServerform, SWT.NONE);
		lblDesign.setAlignment(SWT.CENTER);
		lblDesign.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		lblDesign.setBounds(255, 133, 65, 15);
		lblDesign.setText("Design: Will");

	}

}
