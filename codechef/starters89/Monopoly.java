package codechef.starters89;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Monopoly
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int index = 0;index < cases;index++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();

            boolean flag = false;

            if(p > q+r+s || q > p+r+s || r > p+q+s || s > p+q+r)
                flag = true;
            else
                flag = false;

            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
