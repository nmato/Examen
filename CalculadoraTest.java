package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testDivideix() {
		Calculadora cal = new Calculadora(4,2);
		assertEquals(2,cal.divideix());
	}

	@Test
	public void testPotencia() {
		Calculadora cal = new Calculadora(3,2);
		assertEquals(9,cal.potencia());;
	}

	@Test
	public void testResiduCert() {
		Calculadora cal = new Calculadora(4,2);
		assertTrue(cal.residu());
	}

	@Test
	public void testResiduFalse() {
		Calculadora cal = new Calculadora(6,4);
		assertFalse(cal.residu());
	}
}
