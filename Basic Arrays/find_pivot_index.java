LeetCode:Find The Pivot Index
Link:
https://leetcode.com/problems/find-pivot-index/submissions/2201872144/

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for (int n : nums)
            total += n;

        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];

            if (left == right)
                return i;

            left += nums[i];
        }

        return -1;
    }
}
