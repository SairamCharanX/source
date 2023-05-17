package codechef.starters90;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FavouriteNumbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();

            if(a%2 == 0 && a%7 == 0)
                System.out.println("Alice");
            else if(a%2 != 0 && a%9 == 0)
                System.out.println("Bob");
            else
                System.out.println("Charlie");
        }
    }
}
