package exe5;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThread_Client{

	public static void main(String[] args) {
		final int Port = 5000;
		
		Socket socket;
		try {
			socket = new Socket("localhost", Port);			
			//receive msg from server
			DataInputStream in = new DataInputStream(socket.getInputStream());
			System.out.println("Time is: " + in.readUTF());			
			
			//close connection
			in.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
