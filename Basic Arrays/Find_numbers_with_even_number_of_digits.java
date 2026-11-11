#Leetcode: Find Numbers With even Number of Digits
#Link:
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2193670710/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
