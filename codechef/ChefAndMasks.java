/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndMasks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int tempMaskCost = s.nextInt();
            int clothMaskCost = s.nextInt();
            
            int tempMaskTotal = tempMaskCost * 100;
            int clothMaskTotal = clothMaskCost * 10;
            
            //Conditional checks for constraints on pricing
            
            if((clothMaskTotal <= tempMaskTotal)){
                System.out.println("Cloth");
            }
            else
            System.out.println("Disposable");
            
        }
	}
}
