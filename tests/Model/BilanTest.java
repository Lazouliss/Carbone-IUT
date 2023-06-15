package Model;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import Model.Bilan;

public class BilanTest {



	private static Bilan bilan;

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		bilan = new Bilan();
		assertEquals(0, bilan.getMinCO2());
                assertEquals(0, bilan.getMaxCO2());

	}

	@Before
	public void TestaddCasGeneral(){

		this.bilan.add("Nourriture", 0, 50 );

		assertEquals(50, bilan.getMinCO2());
		assertEquals(50, bilan.getMaxCO2());
	}

}


