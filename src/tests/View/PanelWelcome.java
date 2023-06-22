package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelWelcome extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel l;
	private JButton b;

	// Getters
	public JButton getB() {
		return b;
	}

	// Constructor
	public PanelWelcome() {		
		this.l = new JLabel("Bienvenue !");
		this.b = new JButton("Commencer");
		
		this.add(this.l);
		this.add(this.b);
	}

}