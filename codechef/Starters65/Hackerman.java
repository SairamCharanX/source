package codechef.Starters65;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import com.google.common.math.IntMath;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hackerman
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();

            if(IntMath.isPrime(a+b))
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
    }
}
