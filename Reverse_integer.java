package Leetcode_problem_solution;
/*Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21  */
public class Reverse_integer {

    static int reverse(int x)
    {
       long sum=0;
       while(x!=0)
       {
           int lastdigit=x%10;
           sum+=lastdigit;
           sum=sum*10;
           x/=10;
       }
       sum/=10;
       if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
       {
           return 0;
       }
       if(x<0)
       {
           return (int)(-1*sum);
       }
       return (int)sum;
    }
    public static void main(String[]args)
    {
        int x=121;
        System.out.println(reverse(x));
    }
}
