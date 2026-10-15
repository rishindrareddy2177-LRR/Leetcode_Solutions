#Leetcode: Length of last word
#Link:
https://leetcode.com/problems/length-of-last-word/submissions/2173041209/

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
        
    }
}
