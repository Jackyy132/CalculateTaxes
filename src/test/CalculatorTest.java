package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class CalculatorTest {
	
	
	
	@Before
	public void setUp() {
		Calculator c  = new Calculator();
	}
	@Test
	public void addTest() {
		assertEquals("Numbers did not add correctly");
	}
}
