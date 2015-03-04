package ua.shramko.main2;

public class Array667 {
//	Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7. 
//
//			array667({6, 6, 2}) → 1
//			array667({6, 6, 2, 6}) → 1
//			array667({6, 7, 2, 6}) → 1
	public int array667(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}  
		int n = 0;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i-1] == 6) && ((nums[i] == 6) || (nums[i] == 7))) n++;
		}
		return n;
	}
}
