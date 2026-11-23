#LeetCode:Count Negative numbers in a sorted Matrix 
#Link:
https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/2202041504/
  
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
