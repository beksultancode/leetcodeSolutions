package leetcode.jewelsAndStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char aChar : stones.toCharArray()) {
            if (jewels.contains(String.valueOf(aChar))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int i = solution.numJewelsInStones("aA", "aAAbbbb");
        int i = solution.numJewelsInStones("z", "ZZ");
        System.out.println("i = " + i);
    }
}
