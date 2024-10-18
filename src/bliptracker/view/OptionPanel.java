package bliptracker.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * A custom {@code JPanel} subclass for rendering and managing radio buttons the application user 
 * can use to select which types of blip objects are visible.
 */
public class OptionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MapPanel mapPanel;
	private JRadioButton displayCategoryOneButton;
	private JRadioButton displayCategoryTwoButton;
	private JRadioButton displayAllButton;
	
	/**
	 * Creates an instance of an {@code OptionPanel}. 
	 * @param size The requested dimensions of the resulting {@code JPanel}.
	 * @param mapPanel A {@code MapPanel} to inform when user selects their chosen options.
	 */
	public OptionPanel(Dimension size, MapPanel mapPanel) {
		this.mapPanel = mapPanel;
		this.setLayout(new GridLayout(3, 1, 0, 5)); //3 rows, one for each optional button. 5 pixel spacing.
		this.setBackground(new Color(0xDDDDDD));
		this.setPreferredSize(size);
		
		this.displayCategoryOneButton = new JRadioButton("Show Category 1");
		this.displayCategoryTwoButton = new JRadioButton("Show Category 2");
		this.displayAllButton = new JRadioButton("Show all");
		displayCategoryOneButton.addActionListener(event -> listenToButtons(event));
		displayCategoryTwoButton.addActionListener(event -> listenToButtons(event));
		displayAllButton.addActionListener(event -> listenToButtons(event));
		displayAllButton.setSelected(true); //default to all types visible
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(displayCategoryOneButton);
		buttonGroup.add(displayCategoryTwoButton);
		buttonGroup.add(displayAllButton);
	
		this.add(displayCategoryOneButton);
		this.add(displayCategoryTwoButton);
		this.add(displayAllButton);
	}
	
	// Method to perform when action listener is triggered: Set visibility of blip types in mapPanel.
	private void listenToButtons(ActionEvent buttonChoice) {
		Object selectedButton = buttonChoice.getSource();
		if(selectedButton == displayCategoryOneButton)
			mapPanel.setVisibleBlipTypes(new int[] {1, 2});
		else if(selectedButton == displayCategoryTwoButton) 
			mapPanel.setVisibleBlipTypes(new int[] {3});
		else if(selectedButton == displayAllButton)
			mapPanel.setVisibleBlipTypes(new int[] {1, 2, 3});
	}

}
