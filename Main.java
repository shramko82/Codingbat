public class Main {

    // 1
    // Java > Array-1 > firstLast6
    //
    // Given an array of ints, return true if 6 appears as either the first or
    // last element in the array. The array will be length 1 or more.
    //
    // firstLast6({1, 2, 6}) > true
    // firstLast6({6, 1, 2, 3}) > true
    // firstLast6({13, 6, 1, 2, 3}) > false

    public boolean firstLast6(int[] nums) {
        if ((nums[0] == 6) || (nums[nums.length - 1] == 6))
            return true;
        else
            return false;
    }

    // 2
    // Java > Array-1 > commonEnd
    //
    //
    // Given 2 arrays of ints, a and b, return true if they have the same first
    // element or they have the same last element. Both arrays will be length 1
    // or more.
    //
    // commonEnd({1, 2, 3}, {7, 3}) > true
    // commonEnd({1, 2, 3}, {7, 3, 2}) > false
    // commonEnd({1, 2, 3}, {1, 3}) > true

    public boolean commonEnd(int[] a, int[] b) {
        if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]))
            return true;
        else
            return false;
    }

    // 3
    // Given an array of ints, return true if the array is length 1 or more, and
    // the first element and the last element are equal.
    //
    // sameFirstLast({1, 2, 3}) > false
    // sameFirstLast({1, 2, 3, 1}) > true
    // sameFirstLast({1, 2, 1}) > true

    public boolean sameFirstLast(int[] nums) {
        if ((nums.length >= 1) && (nums[0] == nums[nums.length - 1]))

            return true;
        return false;
    }

    // 4
    // Return an int array length 3 containing the first 3 digits of pi, {3, 1,
    // 4}.
    //
    // makePi() > {3, 1, 4}

    public int[] makePi() {
        return new int[] { 3, 1, 4 };
    }

    // 5
    // Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    //
    // rotateLeft3({1, 2, 3}) > {2, 3, 1}
    // rotateLeft3({5, 11, 9}) > {11, 9, 5}
    // rotateLeft3({7, 0, 0}) > {0, 0, 7}

    public int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };
    }

    // 6
    // Given a string, count the number of words ending in 'y' or 'z' -- so the
    // 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
    // (not case sensitive). We'll say that a y or z is at the end of a word if
    // there is not an alphabetic letter immediately following it. (Note:
    // Character.isLetter(char) tests if a char is an alphabetic letter.)
    //
    // countYZ("fez day") > 2
    // countYZ("day fez") > 2
    // countYZ("day fyyyz") > 2
    public int countYZ(String str) {

        // char[] ss = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (((Character.toLowerCase(str.charAt(i)) == 'y') || (Character
                    .toLowerCase(str.charAt(i)) == 'z'))
                    && ((i == str.length()) || (!Character.isLetter(str
                            .charAt(i + 1)))))
                count++;
        }

        // if ((Character.toLowerCase(ss[ss.length - 1]) == 'y')
        // || (Character.toLowerCase(ss[ss.length - 1]) == 'z'))
        // count++;
        return count;

    }

    // 7
    // We'll say that a lowercase 'g' in a string is "happy" if there is another
    // 'g' immediately to its left or right. Return true if all the g's in the
    // given string are happy.
    //
    // gHappy("xxggxx") > true
    // gHappy("xxgxx") > false
    // gHappy("xxggyygxx") > false
    public boolean gHappy(String str) {

        if (str.length() == 0)
            return true;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'g')

                if ((str.length() == 1)
                        || ((i == 0) && (str.charAt(i + 1) != 'g'))
                        || ((i == str.length() - 1) && (str
                                .charAt(str.length() - 2) != 'g'))
                        || ((i > 0) && (i < str.length() - 1)
                                && (str.charAt(i - 1) != 'g') && (str
                                .charAt(i + 1) != 'g')))
                    return false;

        return true;
    }

    // 8
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
        // for (int i = 1; i < nums.length; i++) {
        // int sum1 = 0, sum2 = 0;
        // for (int i1 = 0; i1 < i; i1++)
        // sum1 += nums[i1];
        // for (int i2 = i; i2 < nums.length; i2++)
        // sum2 += nums[i2];
        // if (sum1 == sum2)
        // return true;
        // }
        return (sumLeft == sumRight);
    }

    // 9
    // Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2,
    // 3 .. n} (spaces added to show the grouping). Note that the length of the
    // array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n +
    // 1)/2.
    //
    // seriesUp(3) > {1, 1, 2, 1, 2, 3}
    // seriesUp(4) > {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
    // seriesUp(2) > {1, 1, 2}

    public int[] seriesUp(int n) {
        int[] array = new int[n * (n + 1) / 2];
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                array[num++] = j;
            }
        }

        return array;
    }

    // 10
    // Return an array that contains exactly the same numbers as the given
    // array, but rearranged so that every 3 is immediately followed by a 4. Do
    // not move the 3's, but every other number may move. The array contains the
    // same number of 3's and 4's, every 3 has a number after it that is not a 3
    // or 4, and a 3 appears in the array before any 4.
    //
    // fix34({1, 3, 1, 4}) > {1, 3, 4, 1}
    // fix34({1, 3, 1, 4, 4, 3, 1}) > {1, 3, 4, 1, 1, 3, 4}
    // fix34({3, 2, 2, 4}) > {3, 4, 2, 2}
    public int[] fix34(int[] nums) {
        int[] nums34 = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 3) && (nums[i + 1] != 4)) {
                for (int j = 1; j < nums.length; j++) {
                    if ((nums[j] == 4) && (nums[j - 1] != 3)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = 4;
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return nums;

    }

    // 11
    // Given an array of scores, return true if each score is equal or greater
    // than the one before. The array will be length 2 or more.
    //
    // scoresIncreasing({1, 3, 4}) > true
    // scoresIncreasing({1, 3, 2}) > false
    // scoresIncreasing({1, 1, 4}) > true
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++)
            if (scores[i] < scores[i - 1])
                return false;
        return true;
    }

    // Given an array of scores, return true if there are scores of 100 next to
    // each other in the array. The array length will be at least 2.
    //
    // scores100({1, 100, 100}) > true
    // scores100({1, 100, 99, 100}) > false
    // scores100({100, 1, 100, 100}) > true
    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++)
            if (scores[i - 1] == 100 && scores[i] == 100)
                return true;
        return false;
    }

    // 12
    // Given an array of scores sorted in increasing order, return true if the
    // array contains 3 adjacent scores that differ from each other by at most
    // 2, such as with {3, 4, 5} or {3, 5, 5}.
    //
    // scoresClump({3, 4, 5}) > true
    // scoresClump({3, 4, 6}) > false
    // scoresClump({1, 3, 5, 5}) > true
    public boolean scoresClump(int[] scores) {
        int count = 0;
        for (int i = 2; i < scores.length; i++)

            if (scores[i] - scores[i - 2] <= 2)

                return true;

        return false;
    }

    // 13
    // Given n of 1 or more, return the factorial of n, which is n * (n-1) *
    // (n-2) ... 1. Compute the result recursively (without loops).
    //
    // factorial(1) > 1
    // factorial(2) > 2
    // factorial(3) > 6
    public int factorial(int n) {
        if (n == 1)
            return n;
        return n * factorial(n - 1);
    }

    // 14
    // Given an array of ints, is it possible to choose a group of some of the
    // ints, such that the group sums to the given target?
    // This is a classic backtracking recursion problem. Once you understand the
    // recursive backtracking strategy in this problem,
    // you can use the same pattern for many problems to search a space of
    // choices. Rather than looking at the whole array,
    // our convention is to consider the part of the array starting at index
    // start and continuing to the end of the array.
    // The caller can specify the whole array simply by passing start as 0. No
    // loops are needed -- the recursive calls progress down the array.
    //
    // groupSum(0, {2, 4, 8}, 10) > true
    // groupSum(0, {2, 4, 8}, 14) > true
    // groupSum(0, {2, 4, 8}, 9) > false

    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length)
            return false;
        if ((target == 0) || (groupSum(start + 1, nums, target - nums[start])))
            return true;
        return groupSum(start + 1, nums, target);
    }
}
