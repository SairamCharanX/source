package codechef.Starters79;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class BetterDeal
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();

            int firstPrice = 100 - (a);
            int secondPrice = 200 - (2*b);

            if(firstPrice!=secondPrice){
                if(firstPrice < secondPrice)
                    System.out.println("FIRST");
                else
                    System.out.println("SECOND");
            }
            else
                System.out.println("BOTH");
        }
    }
}
