package integration;


/**
 * Observer interface that informs classes that implements it that the {@code DataParser} has
 * received and parsed new data.
 */
public interface DataParserObserver {
	
	/**
     * Called by the observed {@code DataParser} when its has parsed new data.
     * @param A Data Transfer Object representing a real world object with its type and coordinates.
     */
    void notifyObserversNewDataReceived (BlipDTO parsedData);

}
