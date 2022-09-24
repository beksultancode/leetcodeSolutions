package leetcode.singleElementInASortedArray;

public class Solution {

    public int singleNonDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i+=2) {
            if (nums.length == i + 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int nonDuplicate = solution.singleNonDuplicate(nums);

        System.out.println("nonDuplicate = " + nonDuplicate);
    }
}
