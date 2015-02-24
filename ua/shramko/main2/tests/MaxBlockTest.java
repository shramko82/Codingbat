package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.MaxBlock;

public class MaxBlockTest {

	@Test
	public void test() {
		MaxBlock test = new MaxBlock();
		
		assertEquals(0, test.maxBlock(""));
		assertEquals(1, test.maxBlock("d"));
		assertEquals(1, test.maxBlock("xyz"));
		assertEquals(2, test.maxBlock("xxyz"));
		assertEquals(2, test.maxBlock("xyyz"));
		assertEquals(4, test.maxBlock("scscsdcccc"));
		assertEquals(2, test.maxBlock("aabbCcc"));
	}

}
