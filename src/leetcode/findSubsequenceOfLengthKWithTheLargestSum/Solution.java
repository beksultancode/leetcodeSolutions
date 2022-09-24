package leetcode.findSubsequenceOfLengthKWithTheLargestSum;

import java.util.Arrays;

public class Solution {

    public int[] maxSubsequence(int[] nums, int k) {
        int t = 0;
        int[] indexes = new int[k];
        int[] result = new int[k];
        int[] copyOfNum = Arrays.copyOf(nums, nums.length);

        while ((t + 1) <= k) {

            int max = nums[0];
            int maxIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                    maxIndex = i;
                }
            }

            indexes[t] = maxIndex;
            t++;
            nums[maxIndex] = Integer.MIN_VALUE;
        }

        Arrays.sort(indexes);

        for (int i = 0; i < indexes.length; i++) {
            result[i] = copyOfNum[indexes[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{2,1,-232945234,-23456532};

        int k = 2;

        int[] maxSubsequence = solution.maxSubsequence(nums, k);

        for (int i : maxSubsequence) {
            System.out.print(i + " ");
        }
    }

}
