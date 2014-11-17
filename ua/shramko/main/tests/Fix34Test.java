package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.Fix34;

// Return an array that contains exactly the same numbers as the given
// array, but rearranged so that every 3 is immediately followed by a 4. Do
// not move the 3's, but every other number may move. The array contains the
// same number of 3's and 4's, every 3 has a number after it that is not a 3
// or 4, and a 3 appears in the array before any 4.
//
// fix34({1, 3, 1, 4}) > {1, 3, 4, 1}
// fix34({1, 3, 1, 4, 4, 3, 1}) > {1, 3, 4, 1, 1, 3, 4}
// fix34({3, 2, 2, 4}) > {3, 4, 2, 2}
public class Fix34Test {

	@Test
	public void test() {
		Fix34 test = new Fix34();
		
		
		assertArrayEquals(new int[]{1, 3, 4, 1}, test.fix34(new int[] {1, 3, 1, 4}));
		assertArrayEquals(new int[]{1, 3, 4, 1, 0, 3, 4,1},test.fix34(new int[] {1, 3, 1, 4, 0, 3, 1, 4}));
		assertArrayEquals(new int[]{3, 4, 2, 2},test.fix34(new int[] {3, 2, 2, 4}));
		assertArrayEquals(new int[]{2, 3, 4, 2,1},test.fix34(new int[] {2,3,2,4,1}));
		assertArrayEquals(new int[]{3, 4, 3, 4,3,4,0,1,2},test.fix34(new int[] {3,0,3,1,3,2,4,4,4}));
		assertArrayEquals(new int[]{},test.fix34(new int[] {}));
		
	}

}
