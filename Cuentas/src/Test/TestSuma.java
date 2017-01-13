package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.Suma;

public class TestSuma {

	@Test
 	public void testSuma() {
 		assertEquals(new Integer(4), Suma.suma(2,2));
 	}
	@Test
 	public void testSum3() {
 		assertEquals(new Integer(6), Suma.suma(2, 2, 2));
 	}
 	
 	@Test
 	public void testNeg() {
 		assertEquals(new Integer(8), Suma.suma(2, 2, 2));
 	}
 	
 	@Test
 	public void testNumNeg() {
 		assertEquals(new Integer(2), Suma.suma(2, -2, 2));
 	}

}
