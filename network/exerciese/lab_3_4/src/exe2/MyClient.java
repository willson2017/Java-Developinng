package exe2;

import java.io.IOException;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) {
		final int Port = 5000;
		
		try {
			//create client object
			Socket client = new Socket("localhost", Port);
			
			//create output stream
			OutputStream os = client.getOutputStream();
			
			//send message to server
			String str_out = "Hello";
			os.write(str_out.getBytes());
			
			//crate input stream
			InputStream is = client.getInputStream();		

			//receive buffer from client and solve the dead loop about read function
			int count = 0;
			while(count == 0)
			{
				count = is.available();
			}
			byte[] txtMsg = new byte[count];
			is.read(txtMsg);
			String txt = new String(txtMsg);

			//close the connection
			os.close();
			is.close();
			client.close();
			System.out.print(txt);
			
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
