package ua.shramko.main.tests;


import ua.shramko.main.CommonEnd;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommonEndTest {
    // Given 2 arrays of ints, a and b, return true if they have the same first
    // element or they have the same last element. Both arrays will be length 1
    // or more.
    //
    // commonEnd({1, 2, 3}, {7, 3}) > true
    // commonEnd({1, 2, 3}, {7, 3, 2}) > false
    // commonEnd({1, 2, 3}, {1, 3}) > true
	
	@Test
	public void testCommonEnd() {
		CommonEnd test = new CommonEnd();
		
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{1}));
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{1, 2}));
		
		assertFalse(test.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
		assertFalse(test.commonEnd(new int[]{2, 2, 2}, new int[]{1, 2, 3}));
		assertFalse(test.commonEnd(new int[]{3, 3, 3}, new int[]{7, 3, 2}));
		
	}

}
