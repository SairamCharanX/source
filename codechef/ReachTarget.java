package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReachTarget
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int index = 0;index < T;index++){
            int target = s.nextInt();
            int currentScore = s.nextInt();
            System.out.println(target-currentScore);
        }
    }
}
