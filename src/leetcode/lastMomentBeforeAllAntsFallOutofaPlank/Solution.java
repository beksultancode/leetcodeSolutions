package leetcode.lastMomentBeforeAllAntsFallOutofaPlank;

import java.lang.reflect.Array;
import java.util.Arrays;

// https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/
public class Solution {


    public int getLastMoment(int n, int[] left, int[] right) {
        if (left.length == 0) {
            return n - min(right);
        }
        if (right.length == 0) {
            return max(left);
        }
        int max = max(left);
        int min = min(right);
        int a1 = n - min;
        return Math.max(a1, max);
    }

    private int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int lastMoment = solution.getLastMoment(9, new int[]{3, 4}, new int[]{0, 1});
        System.out.println("lastMoment = " + lastMoment);
    }
}
