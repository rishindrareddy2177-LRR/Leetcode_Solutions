#LeetCode: Add Digits
#Link:
https://leetcode.com/problems/add-digits/submissions/2159253441/


class Solution {
    public int addDigits(int num) {
        if (num ==0)
            return 0;
            
        return 1+(num -1)%9;
        
        
    }
}
