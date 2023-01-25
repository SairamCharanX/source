package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DetermineTheScore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int index = 0;index < T;index++){
            int totalPoints = s.nextInt();
            int casesPassed = s.nextInt();
            int pointsPerCase = totalPoints/10;
            int finalPoints = pointsPerCase * casesPassed;
            System.out.println(finalPoints);
        }
    }
}
