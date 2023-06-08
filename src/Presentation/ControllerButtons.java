package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerButtons implements ActionListener {

	Presentation main;
	String nomPnl;
	int indice;

	public ControllerButtons(Presentation m) {
		this.main = m;
		this.indice=-1;
	}
	
	public ControllerButtons(Presentation m, String nom, int x) {
		this.main = m;
		this.nomPnl=nom;
		this.indice=x;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.indice!=-1) {
			main.add(nomPnl, indice);
		} else {
			this.main.resetBilan();
		}
		main.changePanel();
	}

}