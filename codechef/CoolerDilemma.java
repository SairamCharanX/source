package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoolerDilemma
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int x = s.nextInt();
            int y = s.nextInt();
            int m = s.nextInt();


            if(x*m < y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
