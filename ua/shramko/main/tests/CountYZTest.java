package ua.shramko.main.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.shramko.main.CountYZ;

// Given a string, count the number of words ending in 'y' or 'z' -- so the
// 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
// (not case sensitive). We'll say that a y or z is at the end of a word if
// there is not an alphabetic letter immediately following it. (Note:
// Character.isLetter(char) tests if a char is an alphabetic letter.)
//
// countYZ("fez day") > 2
// countYZ("day fez") > 2
// countYZ("day fyyyz") > 2

public class CountYZTest {

	@Test
	public void testCountYZ() {
		CountYZ test = new CountYZ();
		
		assertEquals(2, test.countYZ("fez day"));
		assertEquals(3, test.countYZ("day fez thiz"));
		assertEquals(1, test.countYZ("days fyyyz"));
		assertEquals(3, test.countYZ("zui zoo fooz yay yyyyyyyyy"));
		assertEquals(3, test.countYZ("fez@day_lolz>"));
		assertEquals(0, test.countYZ(""));
	}

}
