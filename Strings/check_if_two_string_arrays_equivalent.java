#Leetcode: CHECK IF TWO STRING ARRAY ARE EQUIVALENT
#Link:
  https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/2189947993/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);

        return s1.equals(s2);
    }
}
