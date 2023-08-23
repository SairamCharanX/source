/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BucketAndWaterFlow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int initialCapacity = s.nextInt();
            int capacity = s.nextInt();
            int litersPerHour = s.nextInt();
            int hours = s.nextInt();
            
            int target = (capacity - initialCapacity);
            int volume = litersPerHour * hours;
            
            if(volume > target)
            System.out.println("overFlow");
            else if (volume == target)
            System.out.println("filled");
            else
            System.out.println("Unfilled");
        }
	}
}
