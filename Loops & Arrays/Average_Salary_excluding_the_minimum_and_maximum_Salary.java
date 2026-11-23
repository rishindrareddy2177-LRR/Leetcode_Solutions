#LeetCode:Average Salary Excluding the Minimum and Maximum Salary
#Link:https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/2202020797/

class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];

            if (salary[i] < min) {
                min = salary[i];
            }

            if (salary[i] > max) {
                max = salary[i];
            }
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}
