LeetCode: Find The Highest Altitude
Link:
https://leetcode.com/problems/find-the-highest-altitude/submissions/2201870719/

class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            max = Math.max(max, altitude);
        }

        return max;
    }
}
