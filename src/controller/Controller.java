package controller;

import integration.DataParser;
import model.BlipLocationModel;
import model.BlipLocationModelObserver;

/**
 * Singleton controller responsible for managing the interactions between the layers of the application. 
 */
public class Controller {
	
	private static Controller INSTANCE;
	private BlipLocationModel blipModel;
	private DataParser dataParser;
	private Thread dataParserThread;
	
	private Controller(BlipLocationModel blipModel, DataParser dataParser, Thread dataParserThread) {
		this.blipModel = blipModel;
		this.dataParser = dataParser;
		this.dataParserThread = dataParserThread;
	}
	
	/**
     * Returns the singleton instance of the {@code Controller}. If no instance exists,
     * it creates one using the provided {@code BlipLocationModel}, {@code DataParser}, and thread.
     * 
     * @param blipModel The model representing blip locations.
     * @param dataParser The data parser responsible for parsing external data.
     * @param dataParserThread The thread on which the data parser will run.
     * @return the singleton instance of the {@code Controller}
     */
	public static Controller getControllerInstance(BlipLocationModel blipModel, DataParser dataParser, Thread dataParserThread) {
		if(INSTANCE == null) {
			INSTANCE = new Controller(blipModel, dataParser, dataParserThread);
		}
		return INSTANCE;
	}
	
	/**
     * Connects the provided {@code BlipLocationModelObserver} to the {@code BlipLocationModel},
     * as well as sets initial subscriptions across the application. Then tasks the application
     * {@code DataParser} to connect to the external source and start receiving data.
     * 
     * @param observer The observer to be subscribed to the blip location model.
     */
	public void connectAndSubscribe(BlipLocationModelObserver observer) {
		blipModel.subscribeObserver(observer);
		dataParser.subscribeObserver(blipModel);
		dataParserThread.start();
	}
}
