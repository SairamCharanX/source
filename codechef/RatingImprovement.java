package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RatingImprovement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int rating = s.nextInt();
            int diff = s.nextInt();

            //diff should lie between x and x+200 (Inclusive)
            if(diff>=rating && diff<=(rating+200))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
