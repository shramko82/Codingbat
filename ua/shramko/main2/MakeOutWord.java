package ua.shramko.main2;



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
