package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.ScoresIncreasing;

public class ScoresIncreasingTest {
    // Given an array of scores, return true if each score is equal or greater
    // than the one before. The array will be length 2 or more.
    //
    // scoresIncreasing({1, 3, 4}) > true
    // scoresIncreasing({1, 3, 2}) > false
    // scoresIncreasing({1, 1, 4}) > true
	
	@Test
	public void test() {
		ScoresIncreasing test = new ScoresIncreasing();
		
		assertTrue(test.scoresIncreasing( new int[]{1, 3, 4}));
		assertTrue(test.scoresIncreasing( new int[]{1, 1, 4}));
		assertTrue(test.scoresIncreasing( new int[]{1,1,2,3}));
		assertTrue(test.scoresIncreasing( new int[]{5,6,7,8,9}));
		
		
		assertFalse(test.scoresIncreasing( new int[]{1, 3, 2}));
		assertFalse(test.scoresIncreasing( new int[]{2, 4, 5, 1}));
		assertFalse(test.scoresIncreasing( new int[]{0,0,0,-1}));
		assertFalse(test.scoresIncreasing( new int[]{}));
	}

}
