package codechef.Starters81;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SunnyDay
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases=s.nextInt();

        for(int i=0;i<cases;i++)
        {
            int x=s.nextInt();
            if(x>24)
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
