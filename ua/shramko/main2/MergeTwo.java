package ua.shramko.main2;

/*Start with two arrays of strings, A and B, each with its elements 
in alphabetical order and without duplicates. Return a new array 
containing the first N elements from the two arrays. The result 
array should be in alphabetical order and without duplicates. 
A and B will both have a length which is N or more. The best 
"linear" solution makes a single pass over A and B, taking advantage 
of the fact that they are in alphabetical order, copying elements 
directly to the new array. 

mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}*/

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
