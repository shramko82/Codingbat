package ua.shramko.main2;


/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of
 * the same value. Return the number of clumps in the given array.
 * 
 * countClumps({1, 2, 2, 3, 4, 4}) → 2 countClumps({1, 1, 2, 1, 1}) → 2
 * countClumps({1, 1, 1, 1, 1}) → 1
 */

public class CountClumps {
	public int countClumps(int[] nums) {
		if (nums.length == 0) 
			return 0;
		int result = 0;
		boolean isClumping = false;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] == nums[i]) {
				if (!isClumping)
					result++;
				isClumping = true;
				
			} else
				isClumping = false;
		}
		
		return result;
	}
}
