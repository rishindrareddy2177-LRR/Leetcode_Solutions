#Leetcode: Kids with number of candies
#Link:
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/2193911659/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int n : candies)
            max = Math.max(max, n);

        List<Boolean> result = new ArrayList<>();

        for (int n : candies)
            result.add(n + extraCandies >= max);

        return result;
    }
}
