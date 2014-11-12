package ua.shramko.main;

public class CanBalance {
    // Given a non-empty array, return true if there is a place to split the
    // array so that the sum of the numbers on one side is equal to the sum of
    // the numbers on the other side.
    //
    // canBalance({1, 1, 1, 2, 1}) > true
    // canBalance({2, 1, 1, 2, 1}) > false
    // canBalance({10, 10}) > true
    public boolean canBalance(int[] nums) {
        if (nums.length < 2)
            return false;

        int i = 0;
        int j = nums.length - 1;

        int sumLeft = nums[i], sumRight = nums[j];

        while (i < j - 1) {
            if (sumLeft < sumRight)
                sumLeft += nums[++i];
            else
                sumRight += nums[--j];
        }

        return (sumLeft == sumRight);
    }
}
