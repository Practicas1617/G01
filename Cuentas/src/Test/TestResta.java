package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.Resta;

public class TestResta {

	@Test
	public void testRes2() {
		assertEquals(0, Resta.resta(2, 2));
	}

}
