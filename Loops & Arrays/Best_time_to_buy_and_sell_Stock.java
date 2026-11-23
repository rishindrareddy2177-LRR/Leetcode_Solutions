#LeetCode:Best Time to Buy and Sell Stock
#Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/2201882531/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
