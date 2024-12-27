package Leetcode_problem_solution;

import java.util.HashSet;
import java.util.Set;

/*
Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false
 */
public class Happy_Number {

    static boolean happynumber(int n)
    {
        Set<Integer> cycle=new HashSet<>();
        while(true)
        {
            int sum=0;
            while(n!=0)
            {
                sum+=Math.pow(n%10,2.0);
                n/=10;
            }
            if(sum==1)
            {
                return true;
            }
            n=sum;
            if(cycle.contains(n))
            return false;
            cycle.add(n);
        }

    }
    public static void main(String[]args)
    {
        int n=19;
        System.out.println(happynumber(n));
    }
}
