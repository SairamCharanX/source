package codechef;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SastaSharkTank
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();

            if((a*10)!=(b*5)){
                if((a*10)>(b*5))
                    System.out.println("FIRST");
                else
                    System.out.println("SECOND");
            }
            else{
                System.out.println("ANY");
            }
        }
    }
}
