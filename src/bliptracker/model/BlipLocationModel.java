package bliptracker.model;

import java.util.ArrayList;
import java.util.HashMap;

import bliptracker.integration.BlipDTO;
import bliptracker.integration.DataParserObserver;

public class BlipLocationModel implements DataParserObserver {
	
	private HashMap<Long, BlipDTO> blips; 
	private ArrayList<BlipLocationModelObserver> observers;
	
	public BlipLocationModel() {
		this.blips = new HashMap<>();
		this.observers = new ArrayList<>();
	}
	
	/**
	 * Adds the indicated observer to be notified when the state of blips managed by this {@code BlipLocationModel} is updated.
	 * @param observer The observer that will be notified when the state of blips changes.
	 */
	public void subscribeObserver(BlipLocationModelObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void notifyObserversNewDataReceived(BlipDTO parsedData) {
		blips.put(parsedData.getId(), parsedData);
		notifyObservers();
	}
	
	private void notifyObservers(){
        for(BlipLocationModelObserver observer : this.observers){
            observer.notifyObserversBlipsHaveChanged(blips);
        }
    }
}
