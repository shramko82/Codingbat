package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.CountYZ;
import ua.shramko.main.Factorial;

public class FactorialTest {

	@Test
	public void testFactorial() {
		Factorial test = new Factorial();
		
		assertEquals(720, test.factorial(6));
		assertEquals(24,test.factorial(4));
		assertEquals(1,test.factorial(1));
	}

}
