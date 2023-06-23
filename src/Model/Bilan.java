package Model;

import javax.swing.JTextField;

import Presentation.Presentation;

public class Bilan {
	private double minCO2;
	private double maxCO2;
	private Data data;
	
	private double moyCO2=0;
	private double nbCO2=0;
	
	public Bilan() {
		this.data = new Data();
	}
	
	public void add(String nomPnl, int indice, double valueToAdd) {
	    if(!(valueToAdd < 0 || indice > data.getTransportMax().length || indice < 0)) {
	        switch(nomPnl) {
			    case "Transport" : {
				    this.minCO2+=data.getTransportMin()[indice];
				    this.maxCO2+=data.getTransportMax()[indice];
				    this.moyCO2+=(data.getTransportMin()[indice]+data.getTransportMax()[indice])/2;
				    break;
			    }
			    case "Nourriture" : {
				    this.minCO2+=valueToAdd;
				    this.maxCO2+=valueToAdd;
				    this.moyCO2+=valueToAdd;
				    break;
			    }
			    case "EmpreinteNumerique" : {
				    this.minCO2+=valueToAdd;
				    this.maxCO2+=valueToAdd;
				    this.moyCO2+=valueToAdd;
				    break;
			    }
		    }
	    }
	}

	public double getMinCO2() {
		return (double)Math.round(minCO2 * 1000d) / 1000d;		// round to 0.001
	}

	public double getMaxCO2() {
		return (double)Math.round(maxCO2 * 1000d) / 1000d;		// round to 0.001
	}
	
	public double getMoyCO2() {
		return (double)Math.round(moyCO2/nbCO2 * 1000d) / 1000d;		// round to 0.001
	}

	public void reset() {
		this.minCO2=0;
		this.maxCO2=0;
		//this.moyCO2=0;		// pas sûr d'avoir besoin de reset la moyenne, elle peut être calculée sur plusieurs semaines / tentatives
		this.nbCO2++;			// pour permettre la moyenne sur plusieurs semaines
	}

// TP3 : inventer : methode moyenne pondérée 
// spec tests
// prog
// methode minimal qui rep au tests
// verif que tests marchent
// implémenter methode

	public double moyennePonderee(double pondMin, double pondMax) {
		if(pondMin > 0 && pondMin <= 100 && pondMax > 0 && pondMax <= 100) {
			return ((this.minCO2*pondMin+this.maxCO2*pondMax)/(pondMin+pondMax));
		} else {
			return -1;
		}
	}
}
