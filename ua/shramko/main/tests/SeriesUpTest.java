package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.SeriesUp;

public class SeriesUpTest {
    // Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2,
    // 3 .. n} (spaces added to show the grouping). Note that the length of the
    // array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n +
    // 1)/2.
    //
    // seriesUp(3) > {1, 1, 2, 1, 2, 3}
    // seriesUp(4) > {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
    // seriesUp(2) > {1, 1, 2}
	@Test
	public void test() {
		SeriesUp test  = new SeriesUp();
		
		assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, 
				test.seriesUp(3));
		assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4},
				test.seriesUp(4));
		assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4,1,2,3,4,5},
				test.seriesUp(5));

		assertArrayEquals(new int[]{},
				test.seriesUp(0));
	}

}
