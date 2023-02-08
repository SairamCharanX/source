package codechef.Starters70;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SpiceLevel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int x = s.nextInt();

            if(x<4)
                System.out.println("MILD");
            if(x>=4 && x<7)
                System.out.println("MEDIUM");
            if(x>=7)
                System.out.println("HOT");
        }
    }
}
