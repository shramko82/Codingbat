package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.GroupSum;

public class GroupSumTest {
    // Given an array of ints, is it possible to choose a group of some of the
    // ints, such that the group sums to the given target?
    // This is a classic backtracking recursion problem. Once you understand the
    // recursive backtracking strategy in this problem,
    // you can use the same pattern for many problems to search a space of
    // choices. Rather than looking at the whole array,
    // our convention is to consider the part of the array starting at index
    // start and continuing to the end of the array.
    // The caller can specify the whole array simply by passing start as 0. No
    // loops are needed -- the recursive calls progress down the array.
    //
    // groupSum(0, {2, 4, 8}, 10) > true
    // groupSum(0, {2, 4, 8}, 14) > true
    // groupSum(0, {2, 4, 8}, 9) > false
	@Test
	public void test() {
		GroupSum test = new GroupSum();
		
		assertTrue(test.groupSum(0, new int[]{1, 2, 6}, 8));
		assertTrue(test.groupSum(0, new int[]{2, 4, 8}, 14));
		assertTrue(test.groupSum(0, new int[]{2, 4, 8}, 8));
		assertTrue(test.groupSum(1, new int[]{2, 4, 8}, 8));
		assertTrue(test.groupSum(0, new int[]{10, 2, 2, 5}, 15));
		assertTrue(test.groupSum(0, new int[]{}, 0));
		
		assertFalse(test.groupSum(1, new int[]{2, 4, 8}, 2));
		assertFalse(test.groupSum(0, new int[]{9}, 1));
		assertFalse(test.groupSum(0, new int[]{2, 4, 8}, 9));
		

	}

}
