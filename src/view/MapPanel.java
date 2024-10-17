package view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MapPanel(Dimension mapSize) {
        
        this.setPreferredSize(mapSize);
        this.setLayout(null); // Disable layout manager for absolute positioning
        // this.setBackground(new Color(0xA231FF)); // Purple background to test map scaling

        JLabel mapLabel = new JLabel();
        ImageIcon map = new ImageIcon("map.gif");
        mapLabel.setIcon(map);
        mapLabel.setBounds(0, 0, mapSize.width, mapSize.height); // Position at (0,0) with and square of mapSize
      
        this.add(mapLabel);
    }
	
}
