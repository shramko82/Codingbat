package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.Scores100;

public class Scores100Test {
    // Given an array of scores, return true if there are scores of 100 next to
    // each other in the array. The array length will be at least 2.
    //
    // scores100({1, 100, 100}) > true
    // scores100({1, 100, 99, 100}) > false
    // scores100({100, 1, 100, 100}) > true
	
	@Test
	public void test() {
		Scores100 test = new Scores100();
		
		assertTrue(test.scores100( new int[]{1, 100, 100}));
		assertTrue(test.scores100( new int[]{1, 100, 100, 100}));
		assertTrue(test.scores100( new int[]{100, 1, 100, 100}));
		assertTrue(test.scores100( new int[]{2, 4, 8, 100, 100, 5, 8}));
		
		
		assertFalse(test.scores100( new int[]{1, 100, 99, 100}));
		assertFalse(test.scores100( new int[]{100, 50, 100, 99}));
		assertFalse(test.scores100( new int[]{-1, 0, 100}));
		
	}

}
