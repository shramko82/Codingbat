package ua.shramko.main2;

//a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). 
//
//comboString("Hello", "hi") → "hiHellohi"
//comboString("hi", "Hello") → "hiHellohi"
//comboString("aaa", "b") → "baaab

public class ComboString {
	public String comboString(String a, String b) {
		if ((a == null) || (b == null)) {
			System.err.println("income strings should not be null");
			return null;
		} else if (a.length() == b.length()) {
			System.err.println("income strings should be different lengh");
			return null;
		} 
		
		return (a.length() < b.length()) ? (a+b+a) : (b+a+b);

	}
}
