package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Burgers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int index = 0;index < T;index++){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a==b)
                System.out.println(a);
            if(a>b)
                System.out.println(b);
            if(a<b)
                System.out.println(a);
        }
    }
}

