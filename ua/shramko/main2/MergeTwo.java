package ua.shramko.main2;

public class MergeTwo {
	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int currentN = 0, currentIndexA = 0, currentIndexB = 0;
		String currentA = a[0], currentB = b[0];
		while (currentN < n) {
			if ((currentA.compareTo(currentB) < 0)) {
				result[currentN++] = currentA;
				currentA = (++currentIndexA < a.length) ? a[currentIndexA] : "";
			} else if (currentA.equals(currentB)) {
				result[currentN++] = currentB;
				currentB = (++currentIndexB < b.length) ? b[currentIndexB] : "";
				currentA = (++currentIndexA < a.length) ? a[currentIndexA] : "";
			} else {
				result[currentN++] = currentB;
				currentB = (++currentIndexB < b.length) ? b[currentIndexB] : "";
			}
		}
		return result;
	}
}
