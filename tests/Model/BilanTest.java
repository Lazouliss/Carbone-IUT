package Model;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

public class BilanTest {



	private static Bilan bilan;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		bilan = new Bilan();
		assertEquals(0, bilan.getMinCO2(),0);
        assertEquals(0, bilan.getMaxCO2(),0);
		assertEquals(0, bilan.getMoyCO2(),0);
	}

	@Test
	public void TestaddCasGeneral(){

		this.bilan.add("Nourriture", 0, 50 );

		assertEquals(50, bilan.getMinCO2(),0);
		assertEquals(50, bilan.getMaxCO2(),0);
		assertEquals(50, bilan.getMoyCO2(),0);

		this.bilan = new Bilan();
		this.bilan.add("Nourriture", 0, 2147483647);

		assertEquals(2147483647, bilan.getMinCO2(),0);
        assertEquals(2147483647, bilan.getMaxCO2(),0);
        assertEquals(2147483647, bilan.getMoyCO2(),0);


	}
	
	@Test
	public void TestaddValueZero(){
	    double tmaxC02=bilan.getMaxCO2();
	    double tminC02=bilan.getMinCO2();
	    double tmoyC02=bilan.getMoyCO2();
 
		this.bilan.add("Nourriture", 0, 0 );
		assertEquals(tmaxC02,bilan.getMaxCO2(),0);
		assertEquals(tminC02, bilan.getMinCO2(),0);
		assertEquals(tmoyC02, bilan.getMoyCO2(),0);
	}
    @Test
	public void TestaddValueNeg(){
	    double tmaxC02=bilan.getMaxCO2();
	    double tminC02=bilan.getMinCO2();
	    double tmoyC02=bilan.getMoyCO2();
		this.bilan.add("Nourriture", 0, -10 );
		assertEquals(tmaxC02,bilan.getMaxCO2(),0);
		assertEquals(tminC02, bilan.getMinCO2(),0);
		assertEquals(tmoyC02, bilan.getMoyCO2(),0);
	}


}
