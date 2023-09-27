package codechef.starters102;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SportsSection
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        

        int page = scanner.nextInt();
        boolean status = (page >= 8) ? true : false;
        
        if(status)
        System.out.println("YES");
        else System.out.println("NO");
	}
}
