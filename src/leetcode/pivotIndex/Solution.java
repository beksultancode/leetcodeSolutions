package leetcode.pivotIndex;

//
public class Solution {

    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int[][] ints = split(nums, i);
            if (sum(ints[0]) == sum(ints[1])) {
                return i;
            }
        }
        return -1;
    }

    private int sum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count += num;
        }
        return count;
    }
    private int[][] split(int[] nums, int index) {
        int[] right = new int[(nums.length - index) - 1];
        int[] left = new int[index];

        int rightIndex = 0;
        int leftIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == index) continue;
            if (i < index) {
                left[leftIndex] = nums[i];
                leftIndex++;
            } else {
                right[rightIndex] = nums[i];
                rightIndex++;
            }
        }

        return new int[][]{right, left};
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int index = solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        System.out.println("index = " + index);
    }
}
