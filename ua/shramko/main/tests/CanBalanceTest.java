package ua.shramko.main.tests;

import ua.shramko.main.CanBalance;

import static org.junit.Assert.*;

import org.junit.Test;

public class CanBalanceTest {

	@Test
	public void testCanBalance() {
		CanBalance cb = new CanBalance();
		
		assertTrue(cb.canBalance(new int[] { 1, 1, 1, 2, 1 }));
		assertTrue(cb.canBalance(new int[] { 15,25,10,10,10,10 }));
		
		assertFalse(cb.canBalance(new int[] { 13, 6, 1, 2, 3 }));
		assertFalse(cb.canBalance(new int[] { 15, 1, 1, 2, 3 }));
		assertFalse(cb.canBalance(new int[] {  }));
	}

}
