#Leetcode: https: Goal Parser Interpretation
#Link:
https://leetcode.com/problems/goal-parser-interpretation/submissions/2192584498/

class Solution {
    public String interpret(String command) {
        return command.replace("()", "o")
                      .replace("(al)", "al");
    }
}
