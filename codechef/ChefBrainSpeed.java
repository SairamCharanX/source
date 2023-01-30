package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefBrainSpeed
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int x=0,y=0;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        if(y>x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
