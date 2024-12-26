package Leetcode_problem_solution;
/*
 In : int[] arr = {100,200,300,400};
        int k = 4;
        op: 1000
*/
public class Max_sum_subarray {
    static int maxsumsubarray(int[]arr,int k)
    {
        int windowsum=0;
        int maxsum=Integer.MIN_VALUE;
        int i;
        for(i=0;i<k;i++)
        {
            windowsum+=arr[i];
        }
        maxsum=windowsum;
        for(int end=i;end<arr.length;end++)
        {
            windowsum+=arr[end]-arr[end-k];
            maxsum=Math.max(windowsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[]args)
    {
        int[]arr={100,200,300,400};
        int k=4;
        System.out.println(maxsumsubarray(arr,k));
    }
}
