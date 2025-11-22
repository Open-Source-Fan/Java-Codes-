//LeetCode Problem: 1295 Find Numbers with Even Number of Digits
//Difficulty: Easy
  class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = (int)(Math.log10(num)) + 1; // count digits
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
