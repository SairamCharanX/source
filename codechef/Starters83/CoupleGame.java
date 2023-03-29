package codechef.Starters83;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoupleGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int g = s.nextInt();
            int b = s.nextInt();
            System.out.println(Math.abs(g-b));
        }
    }
}
