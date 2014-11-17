package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.RotateLeft;

public class RotateLeftTest {
    // Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    //
    // rotateLeft3({1, 2, 3}) > {2, 3, 1}
    // rotateLeft3({5, 11, 9}) > {11, 9, 5}
    // rotateLeft3({7, 0, 0}) > {0, 0, 7}
	
	@Test
	public void test() {
		RotateLeft test = new RotateLeft();
		
		assertArrayEquals(new int[]{2, 3, 1}, 
				test.rotateLeft3(new int[] {1, 2, 3}));
		assertArrayEquals(new int[]{11, 9, 5},
				test.rotateLeft3(new int[] {5, 11, 9}));
		assertArrayEquals(new int[]{0, 0, 7},
				test.rotateLeft3(new int[] {7, 0, 0}));
		assertArrayEquals(new int[]{58,55,56},
				test.rotateLeft3(new int[] {56,58,55}));
		assertArrayEquals(new int[]{1,1,1},
				test.rotateLeft3(new int[] {1,1,1}));

		
	}

}
