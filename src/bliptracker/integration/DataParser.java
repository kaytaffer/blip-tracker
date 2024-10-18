package bliptracker.integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Sets up a Socket that listens to localhost:5463 and parses what it receives and notifies any added 
 * {@code DataParserObserver}s with the parsed data.
 */
public class DataParser implements Runnable {
	
	private Socket socket; 
	private ArrayList<DataParserObserver> observers;
	
	/**
	 * Creates an instance of a {@code DataParser}.
	 */
	public DataParser() {
		this.observers = new ArrayList<>();
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
	
	/**
	 * Adds the indicated observer to be notified when new data has been parsed.
	 * @param observer The observer that will be notified when data has been parsed.
	 */
	public void subscribeObserver(DataParserObserver observer) {
		this.observers.add(observer);
	}

	private void parseData(String data) {
		String[] splitData = data.split(";");
		splitData[0] = splitData[0].replaceFirst("ID=", "");
		splitData[1] = splitData[1].replaceFirst("X=", "");
		splitData[2] = splitData[2].replaceFirst("Y=", "");
		splitData[3] = splitData[3].replaceFirst("TYPE=", "");
		BlipDTO blip = new BlipDTO(Long.parseLong(splitData[0]), Integer.parseInt(splitData[1]),
				Integer.parseInt(splitData[2]), Integer.parseInt(splitData[3]));
		
		notifyObservers(blip);	
	}
	
	private void notifyObservers(BlipDTO blip){
        for(DataParserObserver observer : this.observers){
            observer.notifyObserversNewDataReceived(blip);
        }
    }
}
