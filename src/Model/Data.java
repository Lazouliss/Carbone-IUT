package Model;

public class Data {
	private String[] transportNom;
	private double[] transportMin;
	private double[] transportMax;
	
	private double[] foodCO2;
	
	private double[] computerCO2;
	
	public Data() {
		this.transportNom= new String[]{"Voiture", "Co-voiturage", "Velo", "Transport en commun", "Autre"};
		this.transportMin= new double[]{4.5, 2, 0.001, 0.2, 1};
		this.transportMax= new double[]{20, 10, 0.22, 1, 20};
		
		this.foodCO2 = new double[] {0.4, 0.5, 7, 1.1};
		
		this.computerCO2 = new double[] {2.5, 5};
	}
	
	public String[] getTransportNom() {
		return transportNom;
	}

	public double[] getTransportMin() {
		return transportMin;
	}

	public double[] getTransportMax() {
		return transportMax;
	}
	
	public double[] getFoodCO2() {
		return foodCO2;
	}
	
	public double[] getComputerCO2() {
		return computerCO2;
	}
}
