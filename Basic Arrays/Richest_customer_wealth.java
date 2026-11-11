#Leetcode: Richest Customer Wealth
#Link:
https://leetcode.com/problems/richest-customer-wealth/submissions/2193665506/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
