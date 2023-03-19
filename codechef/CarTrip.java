package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class CarTrip
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int x = s.nextInt();

            if(x<=300)
                System.out.println(300*10);
            else
                System.out.println(x*10);
        }
    }
}

