package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.LuckySum;
import ua.shramko.main2.SumLimit;

public class LuckySumTest {

	@Test
	public void test() {
		LuckySum test = new LuckySum();
		
		assertEquals(0, test.luckySum(0,0,0));
		assertEquals(14, test.luckySum(5,4,5));
		assertEquals(4, test.luckySum(-1,5,13));
		assertEquals(15, test.luckySum(5,5,5));
		assertEquals(10, test.luckySum(10,13,8));
		assertEquals(0, test.luckySum(13,1,10));
	}

}
