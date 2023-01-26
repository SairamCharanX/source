package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SavingTaxes
{
    public static void main (String[] args) throws java.lang.Exception
    {

        int a = 0,b = 0,cases = 0;
        Scanner s = new Scanner(System.in);
        cases = s.nextInt();

        for(int index = 0;index<cases;index++){
            a = s.nextInt();
            b = s.nextInt();

            if(a>=b)
                System.out.println(a-b);

        }
    }
}
