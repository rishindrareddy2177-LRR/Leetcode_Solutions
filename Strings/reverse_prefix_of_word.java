#LEETCODE: REVERSE PREFIX OF WORD
#LINK:
class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1) return word;

        StringBuilder s = new StringBuilder(word.substring(0, i + 1));
        s.reverse();

        return s + word.substring(i + 1);
    }
}
