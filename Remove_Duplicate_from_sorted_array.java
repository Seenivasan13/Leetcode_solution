package Leetcode_problem_solution;
/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
public class Remove_Duplicate_from_sorted_array {
    static int removeduplicate(int[]arr)
    {
      int i=0;
      for(int j=1;j<arr.length;j++)
      {
          if(arr[i]!=arr[j])
          {
              i++;
          }
          arr[i]=arr[j];
      }
      return i+1;
    }
    public static void main(String[]args)
    {
        int[]arr={1,1,2};
        System.out.println(removeduplicate(arr));
    }
}
