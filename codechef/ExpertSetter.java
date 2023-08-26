/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ExpertSetter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            double x = s.nextDouble();
            double y = s.nextDouble();
            
            if((y/x) >= 0.50)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}
}
