package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.Suma;

public class TestSuma {

	@Test
 	public void testSuma() {
 		assertEquals(4, Suma.suma(2,2));
 	}

}
