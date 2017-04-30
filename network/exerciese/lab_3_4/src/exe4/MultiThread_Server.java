package exe4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MultiThread_Server{

	public static void main(String[] args) {
		
		final int Port = 5000;
		ServerSocket server = null;
		//Socket socket = null; ??
		try {
			server = new ServerSocket(Port);
			while (true) {
				Socket socket = server.accept();
				//socket = server.accept(); ??
				System.out.println("The client has connected to the server");
				
				//create thread for clients
				Thread handleThread = new Thread(){
					public void run()
					{
						//create DataOutputStream object
						DataOutputStream out;
						try {
							out = new DataOutputStream(socket.getOutputStream());
							//get local time
							DateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
							Date date = new Date();
							String str_date = dateformat.format(date);
							//System.out.println(str_date);							
							//send time to client
							out.writeUTF(str_date);
							 System.out.println("***** "+this.getName()+" *****");
						} catch (IOException e) {							
							e.printStackTrace();
						}
					}			
				};
				handleThread.start();				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
