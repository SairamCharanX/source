package codechef.Starters83;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Technex
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int r = s.nextInt();
            r = r * 1000;
            int remaining = r/2;
            System.out.println(remaining/5);
        }
    }
}
