#LeetCode:Height Checker
#Link:
https://leetcode.com/problems/height-checker/submissions/2202012891/

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
