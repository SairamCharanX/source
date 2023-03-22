package codechef.JanuaryLong2022;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OverspeedingFine
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int fine = 0;
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int x = s.nextInt();
            if(x<=70)
                fine = 0;
            else if (x>70 && x<=100)
                fine = 500;
            else
                fine = 2000;

            System.out.println(fine);
        }
    }
}
