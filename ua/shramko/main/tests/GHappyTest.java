package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.GHappy;

public class GHappyTest {
    // We'll say that a lowercase 'g' in a string is "happy" if there is another
    // 'g' immediately to its left or right. Return true if all the g's in the
    // given string are happy.
    //
    // gHappy("xxggxx") > true
    // gHappy("xxgxx") > false
    // gHappy("xxggyygxx") > false
	@Test
	public void test() {
		GHappy test = new GHappy();
		
		assertTrue(test.gHappy("xxggxx"));
		assertTrue(test.gHappy("xxggyyggxx"));
		assertTrue(test.gHappy(""));
		assertTrue(test.gHappy("ggg"));
		assertTrue(test.gHappy("ggascascgg"));
		
		assertFalse(test.gHappy("g"));
		assertFalse(test.gHappy("gadagadawdg"));
		assertFalse(test.gHappy("gawdwdwg"));
		assertFalse(test.gHappy("awdawdgdadw awdw"));
	}

}
