package ua.shramko.main2;

//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. 
//
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"

public class MakeOutWord {

	public String makeOutWord(String out, String word)  {
		if (out == null) {
			System.err.println("First param should not be null");
			return null;
		}
		if (word == null) {
			System.err.println("Second param should not be null");
			return null;
		}
		
		if (out.length() != 4) {
			System.err.println("First param should be 4 chars");
			return null;
		}
		return out.substring(0, 2)+word+out.substring(2, 4);
	}
}
