package ua.shramko.main2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main2.GreenTicket;

public class GreenTicketTest {

	@Test
	public void test() {
		GreenTicket test = new GreenTicket();
		
		assertEquals(20, test.greenTicket(0,0,0));
		assertEquals(20, test.greenTicket(25,25,25));
		assertEquals(10, test.greenTicket(0,1,0));
		assertEquals(10, test.greenTicket(2,5,5));
		assertEquals(0, test.greenTicket(1,2,3));
		assertEquals(0, test.greenTicket(150,5,386542));
	}

}
