package ua.shramko.main.tests;

import static org.junit.Assert.*;
import ua.shramko.main.FirstLast6;

import org.junit.Test;

// Given an array of ints, return true if 6 appears as either the first or
// last element in the array. The array will be length 1 or more.
//
// firstLast6({1, 2, 6}) > true
// firstLast6({6, 1, 2, 3}) > true
// firstLast6({13, 6, 1, 2, 3}) > false
public class FirstLast6Test {

	@Test
	public void testFirstLast6() {
		FirstLast6 test = new FirstLast6();
		
		assertTrue(test.firstLast6(new int[]{1, 2, 6}));
		assertTrue(test.firstLast6(new int[]{1, 2, 3, 6}));
		assertTrue(test.firstLast6(new int[]{6, 1, 2, 3}));
		assertTrue(test.firstLast6(new int[]{6, 2, 6}));
		assertTrue(test.firstLast6(new int[]{6, 6, 6}));
		
		assertFalse(test.firstLast6(new int[]{1, 2, 3}));
		assertFalse(test.firstLast6(new int[]{2, 6, 2}));
		assertFalse(test.firstLast6(new int[]{3, 6, 3}));
		assertFalse(test.firstLast6(new int[]{66, 6, 66}));
	}

}
