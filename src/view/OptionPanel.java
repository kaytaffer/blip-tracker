package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class OptionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public OptionPanel(Dimension size) {
		this.setLayout(new GridLayout(3, 1, 0, 5)); //3 rows, one for each optional button. 5 pixel spacing.
		this.setBackground(new Color(0xDDDDDD));
		this.setPreferredSize(size);
		
		JRadioButton displayCategoryOneButton = new JRadioButton("Show Category 1");
		JRadioButton displayCategoryTwoButton = new JRadioButton("Show Category 2");
		JRadioButton displayAllButton = new JRadioButton("Show all");
		displayCategoryOneButton.addActionListener(event -> listenToButtons(event));
		displayCategoryTwoButton.addActionListener(event -> listenToButtons(event));
		displayAllButton.addActionListener(event -> listenToButtons(event));
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(displayCategoryOneButton);
		buttonGroup.add(displayCategoryTwoButton);
		buttonGroup.add(displayAllButton);
	
		this.add(displayCategoryOneButton);
		this.add(displayCategoryTwoButton);
		this.add(displayAllButton);
	}
	
	private void listenToButtons(ActionEvent buttonChoice) {
		//TODO implement
		System.out.println(buttonChoice.getSource().toString());
	}

}
