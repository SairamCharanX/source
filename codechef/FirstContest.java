package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FirstContest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(Math.abs(n-a) + " " + Math.abs(n-a-b));


    }
}
