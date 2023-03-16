/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		
		for(int index=0;index<cases;index++){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    
		    int doubleCost = 3*x;
		    int tripleCost = 2*y;
		    
		    if(doubleCost<tripleCost)
		    System.out.println(doubleCost);
		    else
		    System.out.println(tripleCost);
		}
	}
}
