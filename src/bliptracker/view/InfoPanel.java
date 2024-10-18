package bliptracker.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public InfoPanel(Dimension size) {
		this.setBackground(new Color(0xDDDDDD));
		this.setPreferredSize(size);
		
		JLabel infoLabel = new JLabel();
		infoLabel.setText("TODO info about blip types/legend");
		infoLabel.setHorizontalTextPosition(JLabel.CENTER);
		infoLabel.setVerticalTextPosition(JLabel.TOP);
		//infoLabel.setIconTextGap(number of pixels); 
		//infoLabel.setForeground(new Color(0x000000); //Text color
		//infoLabel.setFont(...); //set font, styling, size
		
		this.add(infoLabel);
	}
	
}
