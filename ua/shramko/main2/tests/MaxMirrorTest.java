package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.MaxMirror;

public class MaxMirrorTest {

	@Test
	public void test() {
		MaxMirror test = new MaxMirror();
		
		assertEquals(3, test.maxMirror(new int[] {1, 2, 3, 8, 9, 3, 2, 1}));
		assertEquals(0, test.maxMirror(new int[] {}));
		assertEquals(1, test.maxMirror(new int[] {1}));
		assertEquals(0, test.maxMirror(new int[] {1, 0}));
		assertEquals(2, test.maxMirror(new int[] {1, 1}));
		assertEquals(5, test.maxMirror(new int[] {1, 2,3,2,1}));
		assertEquals(7, test.maxMirror(new int[] {1, 2,3,0,3,2,1,2,1}));
		assertEquals(3, test.maxMirror(new int[] {1, 2,3,0,2,3,2,1,2,1}));
		
		
	}

}
