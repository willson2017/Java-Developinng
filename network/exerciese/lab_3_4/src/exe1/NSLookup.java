package exe1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

	public static void main(String[] args)  {
		
		//Command parameter check
		if (args.length == 0)
		{
			System.out.println("please input an website address!");
			return;
		}
		
		//get ip addrss of the website
		String IPAddress;		
		try {
			IPAddress = InetAddress.getByName(args[0]).getHostAddress();
			System.out.println("Host name: " + args[0]);
			System.out.println("IP address: " + IPAddress);
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		}
	}

}
