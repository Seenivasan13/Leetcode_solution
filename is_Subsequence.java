package Leetcode_problem_solution;

public class is_Subsequence {

    static boolean subseq(String s,String t)
    {
        if(s.length()==0)
        {
            return true;
        }
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }else{
                j++;
            }
            if(i==s.length())
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        String s="abc";
        String t="ahbgoc";
        System.out.print(subseq(s,t));
    }
}
