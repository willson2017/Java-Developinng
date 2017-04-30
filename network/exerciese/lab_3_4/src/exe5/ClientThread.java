package exe5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientThread extends Thread {
	
	Socket socket = null;
	ClientThread(Socket socket)
	{
		this.socket = socket;
	}
	
	public void run(){
		DataOutputStream out;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			//get local time
			DateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			String str_date = dateformat.format(date);					
			//send time to client
			out.writeUTF(str_date);
			System.out.println("###################" + this.getName() + "###################");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
