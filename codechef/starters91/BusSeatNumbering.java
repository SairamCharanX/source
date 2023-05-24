package codechef.starters91;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BusSeatNumbering
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int seat = s.nextInt();
            if(seat>=1 && seat <=10)
                System.out.println("Lower Double");
            else if(seat>=11 && seat<=15)
                System.out.println("Lower Single");
            else if(seat>=16 && seat<=25)
                System.out.println("Upper Double");
            else
                System.out.println("Upper Single");
        }
    }
}
