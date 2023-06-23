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
		//assertEquals(0, bilan.getMoyCO2(),0);

	}
	
@Test
	public void TestaddCasGeneral(){

<<<<<<< HEAD:tests/Model/BilanTest.java
		bilan.reset();//= new Bilan();
		bilan.add("Nourriture", 0, 50);
=======
		this.bilan.reset();//= new Bilan();
		this.bilan.add("Nourriture", 0, 50);

>>>>>>> Wassim-bilanTest:src/Model/BilanTest.java
		assertEquals(50, bilan.getMinCO2(), 0);
		assertEquals(50, bilan.getMaxCO2(), 0);
		//assertEquals(50, bilan.getMoyCO2(), 0);
	}

	@Test
	public void TestaddLimite(){

		bilan.reset();//= new Bilan();
		bilan.add("Nourriture", 0, 2147483647);
		assertEquals(2147483647, bilan.getMinCO2(), 0);
<<<<<<< HEAD:tests/Model/BilanTest.java
        assertEquals(2147483647, bilan.getMaxCO2(), 0);
        assertEquals(2147483647, bilan.getMoyCO2(), 0);
	}

	
    @Test
	public void TestaddValueNeg(){
	    bilan.reset();
	    double tmaxC02=bilan.getMaxCO2();
	    double tminC02=bilan.getMinCO2();
	    double tmoyC02=bilan.getMoyCO2();
		bilan.add("Nourriture", 0, -10 );
=======
        	assertEquals(2147483647, bilan.getMaxCO2(), 0);
        	//assertEquals(2147483647, bilan.getMoyCO2(), 0);


	}

	@Test
	public void TestaddValueZero(){
    		this.bilan.reset();//= new Bilan();
		assertEquals(0, bilan.getMinCO2(),0);
	        assertEquals(0, bilan.getMaxCO2(),0);
        	//assertEquals(0, bilan.getMoyCO2(),0);


	}

    	@Test
	public void TestaddValueNeg(){
		this.bilan.reset();
	    	double tmaxC02=bilan.getMaxCO2();
	    	double tminC02=bilan.getMinCO2();
	    	double tmoyC02=bilan.getMoyCO2();
		this.bilan.add("Nourriture", 0, -10 );
>>>>>>> Wassim-bilanTest:src/Model/BilanTest.java
		assertEquals(tmaxC02,bilan.getMaxCO2(), 0);
		assertEquals(tminC02, bilan.getMinCO2(), 0);
		assertEquals(tmoyC02, bilan.getMoyCO2(), 0);
	}

<<<<<<< HEAD:tests/Model/BilanTest.java
=======
	@Test
	public void TestNomInvalide(){
	   	this.bilan.reset();
	    	double tmaxC02=bilan.getMaxCO2();
	    	double tminC02=bilan.getMinCO2();
	    	double tmoyC02=bilan.getMoyCO2();
		this.bilan.add("toto", 0, 1);
		assertEquals(tmaxC02,bilan.getMaxCO2(),0);
		assertEquals(tminC02, bilan.getMinCO2(),0);
		//assertEquals(tmoyC02, bilan.getMoyCO2(),0);
	}

	@Test
	public void TestIndiceCasGeneral(){
	    	this.bilan.reset();
		Data data= new Data();
		this.bilan.add("Transport", 1, 0);
		assertEquals(data.getTransportMax()[1],bilan.getMaxCO2(),0);
		assertEquals(data.getTransportMin()[1], bilan.getMinCO2(),0);
		//assertEquals(tmoyC02, bilan.getMoyCO2(),0);
	}

	@Test
	public void TestIndiceInattendu(){

		this.bilan.reset();
                this.bilan.add("Transport", 10, 0);
                assertEquals(0,bilan.getMaxCO2(),0);
                assertEquals(0, bilan.getMinCO2(),0);
                //assertEquals(tmoyC02, bilan.getMoyCO2(),0);


	}

	@Test
	public void TestReset(){

		this.bilan = new Bilan();
		this.bilan.add("Nourriture", 0, 50);
		this.bilan.reset();
		assertEquals(0,bilan.getMaxCO2(),0);
                assertEquals(0, bilan.getMinCO2(),0);


	}
>>>>>>> Wassim-bilanTest:src/Model/BilanTest.java

}

