package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import integration.BlipDTO;
import model.BlipLocationModelObserver;

/**
 * View component responsible for rendering the background map as well as the moving objects on a 2D surface.
 */
public class MapPanel extends JPanel implements BlipLocationModelObserver {

	private static final long serialVersionUID = 1L;
	private final int BLIP_DIAMETER = 10;
	private Map<Long, BlipDTO> blipsToRender; 
	private int[] visibleBlipTypes;
	
	/**
	 * Creates an instance of a {@code MapPanel}. 
	 * @param mapSize The requested dimensions of the resulting {@code JPanel}.
	 */
	public MapPanel(Dimension mapSize) {    
        this.setPreferredSize(mapSize);
        this.blipsToRender = new HashMap<>();
        this.visibleBlipTypes = new int[] {1, 2, 3}; //Defaults to all types visible.
    }

	/**
	 * See {@code Component} documentation. This method is called implicitly and should not be called 
	 * directly once this {@code MapPanel} has been instantiated.
	 */
	public void paint(Graphics g) {
		Image mapImage = new ImageIcon("map.gif").getImage();
		g.drawImage(mapImage, 0, 0, null);
		
		for(BlipDTO blipDTO : blipsToRender.values()) {
			int blipType = blipDTO.getType();
			
			for(int visibleType : visibleBlipTypes) {
				if(blipDTO.getType() == visibleType) {
					if(blipType == 1)
						g.setColor(Color.BLUE);
					else if(blipType == 2)
						g.setColor(Color.RED);
					else if(blipType == 3)
						g.setColor(Color.ORANGE);
					g.fillOval(blipDTO.getXCoordinate(), blipDTO.getYCoordinate(), BLIP_DIAMETER, BLIP_DIAMETER);
					break;
				}
			}
		}
	}
	
	/**
	 * Sets which types of blips should be visible and rendered by this {@code MapPanel}.
	 * @param visibleBlipTypes Which types should be visible.
	 */
	public void setVisibleBlipTypes(int[] visibleBlipTypes) {
		this.visibleBlipTypes = visibleBlipTypes;
	}

	@Override
	/**
	 * Re-renders this {@code MapPanel} with the supplied data.
	 * @param blipsToRender The current state of the blips to render.
	 */
	public void notifyObserversBlipsHaveChanged(Map<Long, BlipDTO> blips) {
		this.blipsToRender = blips;
		repaint();
	}
}
