package bliptracker.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

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
	}
	
	/**
	 * See {@code Component} documentation. This method is called implicitly and should not be called 
	 * directly once this {@code InfoPanel} has been instantiated.
	 */
	public void paint(Graphics g) {
		int blip_size = 10;
	
		g.setColor(Color.BLUE);
		g.fillOval(100, 30, blip_size, blip_size);
		
		g.setColor(Color.RED);
		g.fillOval(100, 50, blip_size, blip_size);
		
		g.setColor(Color.ORANGE);
		g.fillOval(100, 70, blip_size, blip_size);
		
		g.setColor(Color.BLACK);
		g.drawString("Type 1 object (category 1)", 112, 39);
		g.drawString("Type 2 object (category 1)" , 112, 59);
		g.drawString("Type 3 object (category 2)", 112, 79);
		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, 14));
		g.drawString("Legend", 100, 15);
	}
}
