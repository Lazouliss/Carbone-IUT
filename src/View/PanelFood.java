package View;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Presentation.Presentation;

public class PanelFood extends JPanel {
	private static final long serialVersionUID = 1L;
	private Presentation main;
	public String nomPnl="Nourriture";
	
	private JTextField txtFieldList[];
	private JButton btnContinue;
	
	private GridLayout gridLTab = new GridLayout(2, 4, 3, 3);		// GridLayout(int rows, int columns, int hgap, int vgap)
	
	// Getters
	public JButton getBtnContinue() {
		return btnContinue;
	}
	public JTextField[] getTxtFieldList() {
		return txtFieldList;
	}
	
	// Constructor
	public PanelFood(Presentation m) {
		this.main = m;
		
		this.add(new JLabel("Indiquez le nombre de repas de chaque type pris par semaine :"));
		
		JPanel pnlGrid = new JPanel(new GridLayout());
		pnlGrid.setLayout(gridLTab);
		this.add(pnlGrid);
		
		// create the JLabels
		pnlGrid.add(new JLabel("Vegan"));
		pnlGrid.add(new JLabel("Vegetarien"));
		pnlGrid.add(new JLabel("A base de boeuf"));
		pnlGrid.add(new JLabel("A base d'une autre viande ou d'un poisson"));
		
		// create the JTextFields
		JTextField txtFieldVgn = new JTextField();
		pnlGrid.add(txtFieldVgn);
		JTextField txtFieldVg = new JTextField();
		pnlGrid.add(txtFieldVg);
		JTextField txtFieldBf = new JTextField();
		pnlGrid.add(txtFieldBf);
		JTextField txtFieldOther = new JTextField();
		pnlGrid.add(txtFieldOther);
		
		this.txtFieldList = new JTextField[] {txtFieldVgn, txtFieldVg, txtFieldBf, txtFieldOther};
		// initialize the JTextFields with a "0"
		for(JTextField txtField : txtFieldList) {
			txtField.setText("0");
			onlyInteger(txtField);
		}
		
		this.btnContinue = new JButton("Valider");
		this.add(btnContinue);
	}
	
	public void onlyInteger(JTextField txtFl) {
		txtFl.addKeyListener(new KeyAdapter() {
			@Override
	        public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			    if (c < '0' || c > '9') {
			        getToolkit().beep();		// make a sound
			        e.consume();				// delete the character
			    }
	        }
	    });
	}
	
} 
