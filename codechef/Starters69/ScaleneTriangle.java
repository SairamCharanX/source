package codechef.Starters69;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ScaleneTriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(a);
            ar.add(b);
            ar.add(c);

            Set<Integer> hs = new HashSet<Integer>(ar);

            if(ar.size()!=hs.size())
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

