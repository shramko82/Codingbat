package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.MakeOutWord;

public class MakeOutWordTest {

	@Test
	public void test() {
		MakeOutWord test = new MakeOutWord();
		
		assertEquals("1256734", test.makeOutWord("1234","567"));
		assertEquals("  _  ", test.makeOutWord("    ","_"));
		assertEquals("((hi))", test.makeOutWord("(())","hi"));
		assertEquals(null, test.makeOutWord("(()","hi"));
		assertEquals(null, test.makeOutWord("",""));
		assertEquals(null, test.makeOutWord(new String(),new String()));
		assertEquals(null, test.makeOutWord(null,null));
	}

}
