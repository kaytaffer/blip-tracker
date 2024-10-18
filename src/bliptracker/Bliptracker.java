/**
 * 
 */
package bliptracker;

import bliptracker.controller.Controller;
import bliptracker.integration.DataParser;
import bliptracker.model.BlipLocationModel;
import bliptracker.view.TrackerFrame;

/**
 * This class bootstraps the Bliptracker application.
 */
public class Bliptracker {

	/**
	 * @param args No arguments expected. 
	 */
	public static void main(String[] args) {
		try {
			bootstrap();
		} catch (Exception anyUnhandledException) {
			System.out.println(anyUnhandledException);
		}
	}
	
	private static void bootstrap() {

		BlipLocationModel model = new BlipLocationModel();
		
		DataParser dataParser = new DataParser();
		Thread dataParserThread = new Thread(dataParser);
		
		Controller controller = Controller.getControllerInstance(model, dataParser, dataParserThread);
		
		new TrackerFrame(controller);
	}
}
