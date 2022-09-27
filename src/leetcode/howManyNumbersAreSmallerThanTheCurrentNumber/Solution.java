package leetcode.howManyNumbersAreSmallerThanTheCurrentNumber;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] > nums[j]) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {8, 1, 2, 2, 3};

        int[] ints = solution.smallerNumbersThanCurrent(nums);

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
