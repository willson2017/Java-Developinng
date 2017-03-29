package mychatRoom;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class RegisterForm extends LoginForm {

	protected Shell shlRegisterform;
	private Text txtRegName;
	private Text txtRegPasswd;
	private Text txtConfirmPasswd;
	private UserManager usrManager;
	private Display display;
	
	RegisterForm()
	{
		usrManager = new UserManager();
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public void registerDisplay() {
		try {
			RegisterForm window = new RegisterForm();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		createContents();
		shlRegisterform.open();
		shlRegisterform.layout();
		while (!shlRegisterform.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public boolean chkPasswd(Integer oldPasswd, Integer newPasswd)
	{
		boolean ret = false;
		if(oldPasswd == newPasswd)
		{
			ret = true;
		}
		return ret;
	}
	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRegisterform = new Shell(SWT.SHELL_TRIM|SWT.APPLICATION_MODAL);
		shlRegisterform.setSize(450, 300);
		shlRegisterform.setText("RegisterForm");
		setCenter(shlRegisterform);		
		
		Label lblNewLabel = new Label(shlRegisterform, SWT.NONE);
		lblNewLabel.setBounds(107, 41, 55, 15);
		lblNewLabel.setText("Name: ");
		
		Label lblPassword = new Label(shlRegisterform, SWT.NONE);
		lblPassword.setBounds(107, 79, 55, 15);
		lblPassword.setText("Password:");
		
		Label lblConfirmPassword = new Label(shlRegisterform, SWT.NONE);
		lblConfirmPassword.setBounds(52, 120, 110, 15);
		lblConfirmPassword.setText("Confirm Password:");
		
		txtRegName = new Text(shlRegisterform, SWT.BORDER);
		txtRegName.setBounds(182, 35, 135, 21);
		
		txtRegPasswd = new Text(shlRegisterform, SWT.BORDER);
		txtRegPasswd.setBounds(182, 79, 135, 21);
		
		txtConfirmPasswd = new Text(shlRegisterform, SWT.BORDER);
		txtConfirmPasswd.setBounds(182, 120, 135, 21);
		
		Button btnRegister = new Button(shlRegisterform, SWT.NONE);		
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.syncExec(new Runnable(){
					public void run(){
						Integer oldPass = Integer.parseInt(txtRegPasswd.getText());
						Integer newPass = Integer.parseInt(txtConfirmPasswd.getText());
						boolean ret = chkPasswd(oldPass, newPass);
						MessageBox messageBox = new MessageBox(shlRegisterform, SWT.APPLICATION_MODAL);  
						if(!ret)
						{							  
							 messageBox.setText("Alert");
							 messageBox.setMessage("the password is not equal, please check it again!");
							 messageBox.open();					 
						}
						else
						{
							 messageBox.setText("Congratuation");
							 messageBox.setMessage("The user is registered to the system!");
							 messageBox.open();					 
						}
						usrManager.setUsrName(txtRegName.getText());
					}
				});
			}
		});
		btnRegister.setBounds(194, 185, 75, 25);
		btnRegister.setText("Register");

	}
}
