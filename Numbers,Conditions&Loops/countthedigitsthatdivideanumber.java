#LeetCode: Count the digits that divide a Number
#Link:
  https://leetcode.com/problems/count-the-digits-that-divide-a-number/submissions/2160276361/

class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (num % digit == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
        
    }
}
