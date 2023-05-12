package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest1 {
	
	Calculator c = new Calculator();
	
	@Test
	public void addTest() {
		
		double expected = 5f;
		double actual = c.add(2f, 3f);
		assertEquals(expected, actual, 0);
		
		
	}
	
	@Test
	public void subTest() {
		
		double expected = 2f;
		double actual = c.sub(4f, 2f);
		assertEquals(expected, actual, 0);
		
		
	}
	
	@Test
	public void divTest() {
		
		double expected = 5f;
		double actual = c.div(10, 2f);
		assertEquals(expected, actual, 0);
		
		
	}
	
	@Test
	public void mulTest() {
		
		double expected = 10f;
		double actual = c.mul(5f, 2f);
		assertEquals(expected, actual, 0);
		
		
	}

}
