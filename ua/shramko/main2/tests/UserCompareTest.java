package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.UserCompare;

public class UserCompareTest {

	@Test
	public void test() {
		UserCompare test = new UserCompare();
		
		assertEquals(-1, test.userCompare("bb", 1, "zz", 2));
		assertEquals(1, test.userCompare("bb", 1, "aa", 2));
		assertEquals(0, test.userCompare("bb", 1, "bb", 1));
		assertEquals(1, test.userCompare("bb", 5, "bb", 1));
		assertEquals(-1, test.userCompare("bb", 5, "bb", 10));
		assertEquals(-1, test.userCompare("adam", 1, "bob", 2));
	}

}
