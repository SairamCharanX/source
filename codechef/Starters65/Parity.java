package codechef.Starters65;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Parity
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int choc = s.nextInt();


            if(choc%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
