package ua.shramko.main2;

/*
 * Suppose the string "yak" is unlucky. Given a string, return a version where
 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
 * will not overlap.
 * 
 * stringYak("yakpak") → "pak" stringYak("pakyak") → "pak" stringYak("yak123ya")
 * → "123ya"
 */

public class StringYak {

	public String stringYak(String str) {
		if (str == null)
			return null;
		if (str.length() >= 3) {
			for (int i = 3; i <= str.length(); i++) {
				if ("yak".equals(str.substring(i - 3, i))) {
					str = str.substring(0, i - 3)
							+ str.substring(i, str.length());
				}
			}
		}
		return str;

	}

}
