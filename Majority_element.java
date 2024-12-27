package Leetcode_problem_solution;
/*
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class Majority_element {

    static int majorityelement(int[]nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                if(count>(nums.length)/2)
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int[]nums={3,2,3};
        System.out.println(majorityelement(nums));
    }
}
