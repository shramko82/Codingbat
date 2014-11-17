package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.Scores100;
import ua.shramko.main.ScoresClump;

public class scoresClumpTest {
    // Given an array of scores sorted in increasing order, return true if the
    // array contains 3 adjacent scores that differ from each other by at most
    // 2, such as with {3, 4, 5} or {3, 5, 5}.
    //
    // scoresClump({3, 4, 5}) > true
    // scoresClump({3, 4, 6}) > false
    // scoresClump({1, 3, 5, 5}) > true
	
	@Test
	public void test() {
		ScoresClump test = new ScoresClump();
		
		assertTrue(test.scoresClump( new int[]{3, 4, 5}));
		assertTrue(test.scoresClump( new int[]{1, 3, 5, 5}));
		assertTrue(test.scoresClump( new int[]{1,1,2,3}));
		assertTrue(test.scoresClump( new int[]{5,6,7,8,9}));
		
		
		assertFalse(test.scoresClump( new int[]{3, 4, 6}));
		assertFalse(test.scoresClump( new int[]{2, 4, 5, 7}));
		assertFalse(test.scoresClump( new int[]{3, 3, 6, 7, 9}));
		assertFalse(test.scoresClump( new int[]{}));
	}

}
