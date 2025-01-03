package Leetcode_problem_solution;

import java.util.Arrays;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
public class Two_Sum {
    static int[] twosum(int[]nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
    public static void main(String[]args)
    {
     int[]nums={2,7,11,15};
     int target=9;
     int[] result = twosum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
