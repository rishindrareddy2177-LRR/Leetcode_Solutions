#LeetCode: Fizz Buzz
#Problem:
https://leetcode.com/problems/fizz-buzz/submissions/2159234651/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i =1; i<=n; i++){
            if(i%3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if(i%3 == 0){
                ans.add("Fizz");
            }
            else if(i%5 == 0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
        
    }
}
