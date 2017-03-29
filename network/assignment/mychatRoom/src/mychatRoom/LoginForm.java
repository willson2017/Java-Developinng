package mychatRoom;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoginForm {

	protected Shell shlLoginform;
	private Text txtPasswd;
	private Text txtLoginName;
	private Display display;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoginForm window = new LoginForm();
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
		shlLoginform.open();
		shlLoginform.layout();
		while (!shlLoginform.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	// Show form in center position
	public void setCenter(Shell sh)
	{
		int width  = sh.getMonitor().getClientArea().width;   
		int height = sh.getMonitor().getClientArea().height;   
		int x = sh.getSize().x;   
		int y = sh.getSize().y;   
		if(x > width)   
		{   
			sh.getSize().x = width;   
		}   
		if(y > height)   
		{   
			sh.getSize().y = height;   
		}   
		sh.setLocation((width - x) / 2, (height - y) / 2);  
	}
	
	public void readFile()
	{
		
	}
	
	public void writeFile()
	{
		String fileName = "c:\\userlist.unitec";
		
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLoginform = new Shell();
		shlLoginform.setSize(385, 221);
		shlLoginform.setText("LoginForm");
		setCenter(shlLoginform);
		
		Label lblUsername = new Label(shlLoginform, SWT.NONE);
		lblUsername.setBounds(46, 34, 71, 15);
		lblUsername.setText("UserName:");
		
		Label lblPassword = new Label(shlLoginform, SWT.NONE);
		lblPassword.setText("PassWord:");
		lblPassword.setBounds(46, 76, 71, 15);
		
		txtPasswd = new Text(shlLoginform, SWT.BORDER | SWT.PASSWORD);
		txtPasswd.setBounds(124, 73, 150, 21);
		
		txtLoginName = new Text(shlLoginform, SWT.BORDER | SWT.PASSWORD);
		txtLoginName.setBounds(124, 31, 150, 21);
		
		Button btnLogin = new Button(shlLoginform, SWT.NONE);
		btnLogin.setBounds(124, 129, 75, 25);
		btnLogin.setText("Login");
		
		Button btnRegister = new Button(shlLoginform, SWT.NONE);
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.syncExec(new Runnable(){
					public void run(){
						RegisterForm regF = new RegisterForm();
						regF.registerDisplay();
					}
				});
			}
		});
		btnRegister.setText("Register");
		btnRegister.setBounds(205, 129, 75, 25);

	}
}
