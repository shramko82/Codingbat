package ua.shramko.main.tests;


import ua.shramko.main.CommonEnd;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommonEndTest {

	@Test
	public void testCommonEnd() {
		CommonEnd test = new CommonEnd();
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
		assertFalse(test.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
		assertTrue(test.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
	}

}
