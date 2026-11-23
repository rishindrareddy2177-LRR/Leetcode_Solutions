#LeetCode:Find smallest Letter Greater Than Target
#Link:
https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/2202010953/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
