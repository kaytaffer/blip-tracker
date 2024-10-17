package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *TODO JavaDoc top level container
 *
 */
public class TrackerFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String APPLICATION_NAME = "Bliptracker";
	private final int X_FRAME_SIZE = 500;
	private final int Y_FRAME_SIZE = 500;
	private final boolean APP_IS_RESIZABLE = false; 
	private final String ICON_PATH = "map.gif";
	
	public TrackerFrame() {
		this.setTitle(APPLICATION_NAME);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(APP_IS_RESIZABLE);
		this.setSize(this.X_FRAME_SIZE, this.Y_FRAME_SIZE);
		this.setVisible(true);
		
		ImageIcon icon = new ImageIcon(ICON_PATH);
		this.setIconImage(icon.getImage());
	}
}
