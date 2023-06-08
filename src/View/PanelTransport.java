package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Presentation.Presentation;

public class PanelTransport extends JPanel {

	private static final long serialVersionUID = 1L;
	private Presentation main;
	public String nomPnl="Transport";
	
	private JButton[] btnList;

	// Getters
	public JButton[] getBtnList() {
		return btnList;
	}

	// Constructor
	public PanelTransport(Presentation m) {
		this.main = m;
		
		JLabel l = new JLabel("Transport pour venir a l'IUT :");
		this.add(l);
		
		String[] transports = this.main.getData().getTransportNom();
		this.btnList = new JButton[transports.length];
		
		for(int i=0; i<transports.length; i++) {
			this.btnList[i] = new JButton(transports[i]);
			this.add(this.btnList[i]);
		}
	}

}