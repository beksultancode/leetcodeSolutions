package leetcode.relativeSortArray;

import java.util.Arrays;

// https://leetcode.com/problems/relative-sort-array/
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    int temp = arr1[index];
                    arr1[index] = arr1[j];
                    arr1[j] = temp;
                    index++;
                }
            }
        }

        for (int t = 0; t < arr1.length - index; t++) {
            for (int i = index; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                }
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {21,11,26,20,50,34,1,18};

        int[] arr2 = {21,11,26,20};

        for (int i : solution.relativeSortArray(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
