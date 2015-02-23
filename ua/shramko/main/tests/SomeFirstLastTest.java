package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.SomeFirstLast;

public class SomeFirstLastTest {
    // Given an array of ints, return true if the array is length 1 or more, and
    // the first element and the last element are equal.
    //
    // sameFirstLast({1, 2, 3}) > false
    // sameFirstLast({1, 2, 3, 1}) > true
    // sameFirstLast({1, 2, 1}) > true
	@Test
	public void test() {
		SomeFirstLast test = new SomeFirstLast();
		
		assertTrue(test.sameFirstLast( new int[]{1, 2, 3, 1}));
		assertTrue(test.sameFirstLast( new int[]{1, 2, 1}));
		assertTrue(test.sameFirstLast( new int[]{6,2,5,100000,6}));
		assertTrue(test.sameFirstLast( new int[]{5,5}));
		
		
		assertFalse(test.sameFirstLast( new int[]{1, 2, 3}));
		assertFalse(test.sameFirstLast( new int[]{}));
		assertFalse(test.sameFirstLast( new int[]{1,1,-1}));
	}

}
