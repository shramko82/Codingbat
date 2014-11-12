package Main.Tests;


import static org.junit.Assert.*;

import org.junit.Test;

public class CanBalanceTest {

	@Test
	public void testCanBalance() {
		CanBalance cb = new CanBalance();
		assertTrue(cb.canBalance(new int[] { 1, 1, 1, 2, 1 }));
		assertFalse(cb.canBalance(new int[] { 13, 6, 1, 2, 3 }));

	}

}
