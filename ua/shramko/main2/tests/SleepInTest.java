package ua.shramko.main2.tests;

import static org.junit.Assert.*;
import ua.shramko.main2.SleepIn;

import org.junit.Test;

public class SleepInTest {

	@Test
	public void test() {
		SleepIn cb = new SleepIn();
		
		assertTrue(cb.sleepIn(false, false));
		assertTrue(cb.sleepIn(false, true));
		assertTrue(cb.sleepIn(true, true));
		
		assertFalse(cb.sleepIn(true,false));

	}

}
