/**
 * 
 */
package bliptracker;

import java.util.HashMap;

import controller.Controller;
import integration.BlipDTO;
import integration.DataParser;
import model.BlipLocationModel;
import view.TrackerFrame;

/**
 * This class bootstraps the Bliptracker application.
 */
public class Bliptracker {

	/**
	 * @param args No arguments expected. 
	 */
	public static void main(String[] args) {
		
		bootstrap();
		
		HashMap<Long,BlipDTO> blipsToRender = new HashMap<>();
        blipsToRender.put(1L, new BlipDTO(1L, 130, 140, 1));
        blipsToRender.put(3L, new BlipDTO(2L, 165, 120, 2));        
        blipsToRender.put(2L, new BlipDTO(3L, 55, 210, 3));
	}
	
	private static void bootstrap() {

		BlipLocationModel model = new BlipLocationModel();
		
		DataParser dataParser = new DataParser();
		Thread dataParserThread = new Thread(dataParser);
		
		Controller controller = Controller.getControllerInstance(model, dataParser, dataParserThread);
		
		new TrackerFrame(controller);
	}
}
