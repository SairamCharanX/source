/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WhoIsTaller
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int index = 0;index < T;index++){
            int x = s.nextInt();
            int y = s.nextInt();

            if(x>y)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}
