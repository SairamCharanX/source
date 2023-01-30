package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rollercoaster
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for(int i=0;i<cases;i++){
            int X = s.nextInt();
            int H = s.nextInt();
            if(X>=H){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
