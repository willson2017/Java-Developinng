package exe2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		
		final int Port = 5000;
		
		//create a server object		
		ServerSocket server = null;	
		Socket socket = null;
		InputStream is = null;
		OutputStream out = null;
		try {
			server = new ServerSocket(Port);
			System.out.println("Sever starting~~~");
			
			while(true) {
				socket = server.accept();
				System.out.println("Sever connecting~~~");
				
				//create input stream
				is = socket.getInputStream();
				
				//create output stream
				out = socket.getOutputStream();
							
				//send buffer to client				
				out.write("Hi there, got your message!".getBytes());
				
				//receive buffer from client and solve the dead loop about read function			
				int count = 0;
				while(count == 0)
				{
					count = is.available();
					//System.out.println(count);
				}
				byte[] txtMsg = new byte[count];
				
				is.read(txtMsg);
				String txt = new String(txtMsg);
				
				System.out.println(txt);			
			}
		} catch (IOException e) {			
			e.printStackTrace();
		} 
	}

}
