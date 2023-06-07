/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int alice = s.nextInt();
            int bob = s.nextInt();
            boolean flag = false;
            
            if(alice!=bob){
            
            int tempAliceOne = alice;
            int tempBobOne = bob;
            
            tempAliceOne-=1;
            tempBobOne+=1;
            
            if(tempAliceOne==tempBobOne)
            flag = true;
            
            int tempAliceTwo = alice;
            int tempBobTwo = bob;
            
            tempBobTwo-=1;
            tempAliceTwo +=3;
            
            if(tempAliceTwo==tempBobTwo)
            flag = true;
            
            if(flag)
            System.out.println("YES");
            else
            System.out.println("NO");
            }
            else
            System.out.println("YES");
            
        }
	}
}
