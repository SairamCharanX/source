package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WaterConsumption
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0;i < T;i++){
            int X = sc.nextInt();
            if(X>=2000)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
