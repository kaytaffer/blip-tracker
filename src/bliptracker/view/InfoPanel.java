package bliptracker.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates an instance of a {@code InfoPanel}. 
	 * @param size The requested dimensions of the resulting {@code JPanel}.
	 */
	public InfoPanel(Dimension size) {
		this.setBackground(new Color(0xDDDDDD));
		this.setPreferredSize(size);
		
		this.setLayout(null); //absolute placement of labels
		JLabel label = new JLabel();
		label.setFont(new Font(getFont().getFontName(), Font.BOLD, 14));
		label.setText("Legend");
		label.setBounds(100, 5, 200, 19);
		this.add(label);
		
		int numberOfTypes = 3;
		int yPlacement = 27;
		for (int i = 1; i <= numberOfTypes; i++) {
			int category; 
			if (i == 3)
				category = 2;
			else 
				category = 1;
			label = new JLabel();
			label.setText("Type " + i + " object (Category " + category + ")");
			label.setBounds(112, yPlacement, 250, 14);
			yPlacement += 23;
			this.add(label);
		}
		
	}
	
	/**
	 * See {@code Component} documentation. This method is called implicitly and should not be called 
	 * directly once this {@code InfoPanel} has been instantiated.
	 */
	public void paint(Graphics g) {
		super.paint(g);
		int blip_size = 10;
	
		g.setColor(Color.BLUE);
		g.fillOval(100, 30, blip_size, blip_size);
		
		g.setColor(Color.RED);
		g.fillOval(100, 53, blip_size, blip_size);
		
		g.setColor(Color.ORANGE);
		g.fillOval(100, 76, blip_size, blip_size);
		
		g.setColor(Color.BLACK);
		//g.drawString("Type 1 object (category 1)", 112, 39);
		//g.drawString("Type 2 object (category 1)" , 112, 59);
		//g.drawString("Type 3 object (category 2)", 112, 79);
		//g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, 14));
		//g.drawString("Legend", 100, 15);
	}
}
