package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.WithoutX2;

public class WithoutX2Test {

	@Test
	public void test() {
		WithoutX2 test = new WithoutX2();
		
		assertEquals("XXx", test.withoutX2("XXx"));
		assertEquals("Hi", test.withoutX2("Hi"));
		assertEquals("test", test.withoutX2("xtest"));
		assertEquals("Xtest", test.withoutX2("Xtest"));
		assertEquals("x", test.withoutX2("xxx"));
		assertEquals("", test.withoutX2("x"));
		assertEquals("", test.withoutX2("xx"));
		assertEquals("", test.withoutX2(""));
		assertEquals(null, test.withoutX2(null));
	}

}
