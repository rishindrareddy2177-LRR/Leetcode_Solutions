#Leetcode: Running sum of 1D Array
#Link:
  https://leetcode.com/problems/running-sum-of-1d-array/submissions/2192598469/

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
