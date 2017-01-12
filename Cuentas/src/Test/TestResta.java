package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.Resta;

public class TestResta {

	@Test
	public void testRes2() {
		assertEquals(0, Resta.resta(2, 2));
	}
	@Test
	public void testRes3() {
		assertEquals(0, Resta.resta(6, 2, 4));
	}
	
 	@Test
 	public void testNeg() {
 		assertEquals(1, Resta.resta(2, 2, 2));
 	}
 	
 	@Test
 	public void testNumNeg() {
 		assertEquals(6, Resta.resta(2, -2, -2));
 	}

}
