package codechef.starters98;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MessiVsRonaldo
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();

        int messi = (2*a) + b;
        int ronaldo = (2*x) + y;

        if(messi==ronaldo)
            System.out.println("EQUAL");
        else if(messi>ronaldo)
            System.out.println("MESSI");
        else
            System.out.println("RONALDO");
    }
}
