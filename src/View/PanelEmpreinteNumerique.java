package View;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Presentation.Presentation;

public class PanelEmpreinteNumerique extends JPanel {
	private static final long serialVersionUID = 1L;
	private Presentation main;
	public String nomPnl="EmpreinteNumerique";
	
	private JRadioButton rdBtnList[];
	private JButton btnContinue;
	
	// Getters
	public JRadioButton[] getRdBtnList() {
		return rdBtnList;
	}
	public JButton getBtnContinue() {
		return btnContinue;
	}
	
	// Constructor
	public PanelEmpreinteNumerique(Presentation m) {
		this.main = m;
		
		this.add(new JLabel("Indiquez le type d'ordinateur que vous utilisez chaque semaine :"));
		
		JRadioButton rdBtnPcPerso = new JRadioButton("Portable personnel");
		this.add(rdBtnPcPerso);
		JRadioButton rdBtnPcIUT = new JRadioButton("Ordinateur de l'IUT");
		this.add(rdBtnPcIUT);
		
		// to only have one radio button selected at a time
		ButtonGroup grpRdBtn = new ButtonGroup();
		grpRdBtn.add(rdBtnPcPerso);
		grpRdBtn.add(rdBtnPcIUT);
		
		this.rdBtnList = new JRadioButton[] {rdBtnPcPerso, rdBtnPcIUT};
		
		this.btnContinue = new JButton("Valider");
		this.add(btnContinue);
	}
}
