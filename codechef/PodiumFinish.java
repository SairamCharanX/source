package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PodiumFinish
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        int a=0,b=0;
        for (int index = 0;index < cases;index++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a+b);
        }
    }
}
