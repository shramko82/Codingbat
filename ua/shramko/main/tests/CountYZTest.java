package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.CommonEnd;
import ua.shramko.main.CountYZ;

public class CountYZTest {

	@Test
	public void testCountYZ() {
		CountYZ test = new CountYZ();
		
		assertEquals(2, test.countYZ("fez day"));
		assertEquals(2,test.countYZ("day fez"));
		assertEquals(1,test.countYZ("days fyyyz"));
	}

}
