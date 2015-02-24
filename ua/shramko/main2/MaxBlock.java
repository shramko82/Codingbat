package ua.shramko.main2;

/*Given a string, return the length of the largest "block" in the string. 
 * A block is a run of adjacent chars that are the same. 

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0 */


public class MaxBlock {
	public int maxBlock(String str) {
		if ((str == null)) {
			return 0;
		} else if (str.length() <= 1) {
			return str.length();
		}
		int n = 1;
		int max = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				n++;
				if (n>max) max = n;
			} else n = 1;
		}
		return max;
		  
	}
}
