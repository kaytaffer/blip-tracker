package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public OptionPanel(Dimension size) {
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(0xDDDDDD));
		this.setPreferredSize(size);
		
		JLabel infoLabel = new JLabel();
		infoLabel.setText("TODO category buttons");
		infoLabel.setHorizontalTextPosition(JLabel.CENTER);
		infoLabel.setVerticalTextPosition(JLabel.CENTER);
		
		this.add(infoLabel);
	}

}
