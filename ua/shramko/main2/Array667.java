package ua.shramko.main2;

public class Array667 {
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
