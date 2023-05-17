package codechef.starters90;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LearningSql
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        int rows = s.nextInt();
        int cols = s.nextInt();
        int extraRows = s.nextInt();

        System.out.println((rows + extraRows) * cols);

    }
}
