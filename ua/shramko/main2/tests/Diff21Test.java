package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.Diff21;

public class Diff21Test {

	@Test
	public void test() {
		Diff21 test = new Diff21();
		
		assertEquals(21, test.diff21(0));
		assertEquals(16, test.diff21(5));
		assertEquals(22, test.diff21(-1));
		assertEquals(1, test.diff21(20));
		assertEquals(0, test.diff21(21));
		assertEquals(58, test.diff21(50));
	}

}
