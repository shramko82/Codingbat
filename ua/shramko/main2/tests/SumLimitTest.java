package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.SumLimit;

public class SumLimitTest {

	@Test
	public void test() {
		SumLimit test = new SumLimit();
		
		assertEquals(0, test.sumLimit(0,0));
		assertEquals(9, test.sumLimit(5,4));
		assertEquals(0, test.sumLimit(-1,5));
		assertEquals(5, test.sumLimit(5,5));
		assertEquals(11, test.sumLimit(10,1));
		assertEquals(9, test.sumLimit(9,1));
	}

}
