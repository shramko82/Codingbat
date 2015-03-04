package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.Array667;
import ua.shramko.main2.ComboString;

public class Array667Test {

	@Test
	public void test() {
		Array667 test = new Array667();
		
		assertEquals(0, test.array667(new int[] {}));
		assertEquals(0, test.array667(new int[] {1}));
		assertEquals(0, test.array667(new int[] {1,2}));
		assertEquals(2, test.array667(new int[] {6,6,6}));
		assertEquals(2, test.array667(new int[] {6,6,7}));
		assertEquals(1, test.array667(new int[] {6,7,6}));
	}

}
