package Leetcode_problem_solution;

public class SingleNumber {

    static int singlenum(int[]nums)
    {
        int value_store=0;
        for(int i=0;i<nums.length;i++)
        {
            value_store=value_store^nums[i];
        }
        return value_store;
    }
    public static void main(String[]args)
    {
        int []nums={2,2,1,1,9};
        System.out.print(singlenum(nums));
    }
}
