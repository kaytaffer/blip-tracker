package integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Sets up a Socket that listens to localhost:5463 and parses what it receives 
 * TODO Observers notification, decide on format to parse Strings to
 */
public class DataParser implements Runnable {
	
	private Socket socket; 
	
	public DataParser() {		
	}

	@Override
	public void run() {

		try {
			this.socket = new Socket("localhost", 5463);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String inData;
			while ((inData = in.readLine()) != null) {
				parseData(inData);	
			}
		} catch (IOException iOException) {
			if(iOException.getClass() == ConnectException.class)
				System.out.println("Failed to connect to object data server. Please make sure server is running correctly, then restart application.");
			iOException.printStackTrace();
		}
		
	}

	private void parseData(String data) {
		
		System.out.println(data);
		/* TODO read and parse data inputed in format ID=<LONG>;X=<INT>;Y=<INT>;TYPE=<INT> 
		 */
		
	}
}
