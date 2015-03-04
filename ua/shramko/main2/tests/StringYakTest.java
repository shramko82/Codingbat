package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.StringYak;

public class StringYakTest {

	@Test
	public void test() {
		StringYak test = new StringYak();
		
		assertEquals("adw", test.stringYak("adw"));
		assertEquals("", test.stringYak(""));
		assertEquals("", test.stringYak("yak"));
		assertEquals("pak", test.stringYak("yakpak"));
		assertEquals("Hello", test.stringYak("Hyakello"));
		assertEquals("Hello", test.stringYak("Helloyak"));
	}

}
