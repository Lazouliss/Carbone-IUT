package Model;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

public class BilanTest {



	private static Bilan bilan;

	@Test
	public static void setUpBeforeClass() throws Exception {

		bilan = new Bilan();
		assertEquals(0, bilan.getMinCO2());
        	assertEquals(0, bilan.getMaxCO2());
		assertEquals(0, bilan.getMoyCO2());
	}

	@Test
	public void TestaddCasGeneral(){

		this.bilan.add("Nourriture", 0, 50 );

		assertEquals(50, bilan.getMinCO2());
		assertEquals(50, bilan.getMaxCO2());
		assertEquals(50, bilan.getMoyCO2());

		this.bilan = new Bilan();
		this.bilan.add("Nourriture", 0, 2147483647);

		assertEquals(2147483647, bilan.getMinCO2());
                assertEquals(2147483647, bilan.getMaxCO2());
                assertEquals(2147483647, bilan.getMoyCO2());


	}
	
	/*@Test
	public void TestaddValueZero(){
	    private double tmaxC02=bilan.getMaxCO2();
	    private double tminC02=bilan.getMinCO2();
	    private double tmoyC02=bilan.getMoyCO2();
 
		this.bilan.add("Nourriture", 0, 0 );
		assertEquals(tmaxC02,bilan.getMaxCO2());
		assertEquals(tminC02, bilan.getMinCO2());
		assertEquals(tmoyC02, bilan.getMoyCO2());
	}

		public void TestaddValueNeg(){
	    private double tmaxC02=bilan.getMaxCO2();
	    private double tminC02=bilan.getMinCO2();
	    private double tmoyC02=bilan.getMoyCO2();
		this.bilan.add("Nourriture", 0, -10 );
		assertEquals(tmaxC02,bilan.getMaxCO2());
		assertEquals(tminC02, bilan.getMinCO2());
		assertEquals(tmoyC02, bilan.getMoyCO2());
	}*/

}
