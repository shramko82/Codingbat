package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.ComboString;

public class ComboStringTest {

	@Test
	public void test() {
		ComboString test = new ComboString();
		
		assertEquals("adwawdwdadw", test.comboString("adw","awdwd"));
		assertEquals("ssfffss", test.comboString("ss","fff"));
		assertEquals("qwdcq", test.comboString("wdc","q"));
		assertEquals(null, test.comboString("er","er"));
		assertEquals("df", test.comboString("df",""));
		assertEquals(null, test.comboString(null,"asdsd"));
	}

}
