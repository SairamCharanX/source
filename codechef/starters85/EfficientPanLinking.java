package codechef.starters85;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class EfficientPanLinking
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            BigInteger x = s.nextBigInteger();
            BigInteger y = new BigInteger("20");

            System.out.println(x.mod(y));
        }
    }
}
