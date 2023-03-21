package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaxMinusMin
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            List<Integer> nums = new ArrayList<Integer>();
            nums.add(a);
            nums.add(b);
            nums.add(c);
            Collections.sort(nums);

            System.out.println(nums.get(2) - nums.get(0));
        }
    }
}
