package Presentation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Model.Bilan;
import Model.Data;
import View.PanelMain;

public class Presentation implements IPresentation {

	private PanelMain pm;
	private Bilan bilan = new Bilan();
	private Data data = new Data();
	
	// Getters
	public Data getData() {
		return data;
	}
	public PanelMain getPm() {
		return pm;
	}

	// Constructor
	public Presentation(JFrame f) {
		this.pm = new PanelMain(this, f);
		
		// addActionListener for panelWelcome
		this.pm.getPw().getB().addActionListener(new ControllerButtons(this));
		
		// addActionListener for panelTransport
		JButton[] btnTransportList = this.pm.getPtr().getBtnList();
		for(int i=0; i<btnTransportList.length; i++) {
			btnTransportList[i].addActionListener(new ControllerButtons(this, this.pm.getPtr().nomPnl, i));
		}
		
		// addActionListener for panelFood
		this.pm.getPf().getBtnContinue().addActionListener(new ControllerButtons(this, this.pm.getPf().nomPnl, 0));
		
		// addActionListener for panelEmpreinteNumerique
		this.pm.getPen().getBtnContinue().addActionListener(new ControllerButtons(this, this.pm.getPen().nomPnl, 0));
		
		// addActionListener for panelThanks
		this.pm.getPth().getBtn().addActionListener(new ControllerButtons(this));
	}

	// Methods
	public void changePanel() {
		this.pm.changePanel();
	}
	
	public void add(String nom, int x) {
		double valueToAdd = 0;
		// if its the food panel
		if(nom == this.pm.getPf().nomPnl) {
			JTextField[] txtFieldList = this.getPm().getPf().getTxtFieldList();
			// Sum up the valueOfTextField*valueInData
			// where : valueOfTextField is textField.getText(), and valueInData the factor in the Data foodCO2 array
			for(int i=0; i<txtFieldList.length; i++) {
				int qttConsomme = 0;
				// check if the JTextField is empty, and if not change the value of qttConsomme to the value of the JTextField
				if(!(txtFieldList[i].getText().equals(""))) {
					qttConsomme = Integer.parseInt(txtFieldList[i].getText());
				} 
				valueToAdd+=data.getFoodCO2()[i]*qttConsomme;
			}
		// else if its the empreinte numerique panel
		} else if(nom == this.pm.getPen().nomPnl) {
			JRadioButton[] rdBtnList = this.getPm().getPen().getRdBtnList();
			for(int i=0; i<rdBtnList.length; i++) {
				if(rdBtnList[i].isSelected()) {
					valueToAdd += this.data.getComputerCO2()[i];
				}
			}
		}
		this.bilan.add(nom, x, valueToAdd);
	}
	
	@Override
	public String getBilan() {
		String str = "Vous emettez entre "+this.bilan.getMinCO2()+" et "+this.bilan.getMaxCO2()+" kg de CO2 par semaine. Avec une consommation moyenne de "+this.bilan.getMoyCO2()+" kg de CO2 par semaine.";
		return str;
	}
	
	public void resetBilan() {
		this.bilan.reset();
	}
}
