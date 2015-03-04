package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.MakeBricks;

public class MakeBricksTest {

	@Test
	public void test() {
		MakeBricks test = new MakeBricks();
		
		assertEquals(true, test.makeBricks(0,0,0));
		assertEquals(true, test.makeBricks(25,25,25));
		assertEquals(true, test.makeBricks(0,1,0));
		assertEquals(true, test.makeBricks(2,5,5));
		assertEquals(false, test.makeBricks(1,2,3));
		assertEquals(false, test.makeBricks(150,5,386542));
	}

}
