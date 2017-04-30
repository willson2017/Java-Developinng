package exe5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThread_Server {
	public static void main(String[] args) 
	{
		final int Port = 5000;
		ServerSocket server = null;
		try {
			server = new ServerSocket(Port);
			while (true) {
				Socket socket = server.accept();					
				ClientThread client = new ClientThread(socket);
				client.start();
			}
		
		} catch (IOException e) {				
			e.printStackTrace();
		}			
	}
}
