package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Presentation.Presentation;

public class PanelThanks extends JPanel {

	private static final long serialVersionUID = 1L;

	private Presentation main;
	
	private JLabel ack;
	private JButton btn;

	// Getters
	public JButton getBtn() {
		return btn;
	}

	// Constructor
	public PanelThanks(Presentation m) {
		this.main = m;
		
		this.ack = new JLabel("Vous emettez entre x et y kg de CO2 par semaine.");
		this.btn = new JButton("Recommencer");
		
		this.add(ack);
		this.add(this.btn);
	}

	// Methods
	public void refresh() {
		this.ack.setText(main.getBilan());
	}

}