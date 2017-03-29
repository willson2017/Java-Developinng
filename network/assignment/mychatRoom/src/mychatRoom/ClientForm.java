package mychatRoom;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class ClientForm {

	protected Shell shlClientform;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ClientForm window = new ClientForm();
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
		shlClientform.open();
		shlClientform.layout();
		while (!shlClientform.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlClientform = new Shell();
		shlClientform.setSize(539, 496);
		shlClientform.setText("ClientForm");
		
		List list_1 = new List(shlClientform, SWT.BORDER);
		list_1.setBounds(10, 37, 137, 410);
		
		Label lblUserList = new Label(shlClientform, SWT.NONE);
		lblUserList.setBounds(43, 10, 55, 15);
		lblUserList.setText("User List:");
		
		Label lblMessages = new Label(shlClientform, SWT.NONE);
		lblMessages.setText("Messages:");
		lblMessages.setBounds(169, 13, 55, 15);
		
		text = new Text(shlClientform, SWT.BORDER);
		text.setBounds(169, 37, 344, 204);
		
		Button btnSend = new Button(shlClientform, SWT.NONE);
		btnSend.setBounds(202, 367, 75, 25);
		btnSend.setText("Send");
		
		Button btnSendAll = new Button(shlClientform, SWT.NONE);
		btnSendAll.setText("Send All");
		btnSendAll.setBounds(296, 367, 75, 25);
		
		Button btnSendFile = new Button(shlClientform, SWT.NONE);
		btnSendFile.setText("Send File");
		btnSendFile.setBounds(392, 367, 75, 25);
		
		Button btnBlock = new Button(shlClientform, SWT.NONE);
		btnBlock.setText("Block");
		btnBlock.setBounds(202, 410, 75, 25);
		
		Button btnUnblock = new Button(shlClientform, SWT.NONE);
		btnUnblock.setText("Unblock");
		btnUnblock.setBounds(296, 410, 75, 25);
		
		Button btnClear = new Button(shlClientform, SWT.NONE);
		btnClear.setText("Clear");
		btnClear.setBounds(392, 410, 75, 25);
		
		text_1 = new Text(shlClientform, SWT.BORDER);
		text_1.setBounds(174, 295, 339, 42);
		
		Label lblTextMessages = new Label(shlClientform, SWT.NONE);
		lblTextMessages.setBounds(174, 275, 108, 15);
		lblTextMessages.setText("Text Messages:");
		
		Label lblIpAddress = new Label(shlClientform, SWT.NONE);
		lblIpAddress.setBounds(332, 13, 68, 15);
		lblIpAddress.setText("IP Address:");
		
		text_2 = new Text(shlClientform, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(406, 10, 107, 21);

	}
}
