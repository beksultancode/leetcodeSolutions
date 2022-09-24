package leetcode.sortArrayByParityII;

public class Solution {

    public int[] sortArrayByParityII(int[] nums) {

        int[] newArray = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[evenIndex] = nums[i];
                evenIndex+=2;
            } else {
                newArray[oddIndex] = nums[i];
                oddIndex+=2;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 2, 5, 7};
        int[] sortArrayByParityII = solution.sortArrayByParityII(nums);

        for (int i : sortArrayByParityII) {
            System.out.print(i + ", ");
        }
    }
}
