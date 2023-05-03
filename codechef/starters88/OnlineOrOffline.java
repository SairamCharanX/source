package codechef.starters88;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OnlineOrOffline
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            double onlineCost = s.nextInt(); //n
            double dineInCost = s.nextInt(); //m

            double afterDiscount = onlineCost - ((0.1)*onlineCost);

            if(afterDiscount == dineInCost)
                System.out.println("EITHER");

            else if(dineInCost>afterDiscount)
                System.out.println("ONLINE");

            else
                System.out.println("DINING");
        }
    }
}
