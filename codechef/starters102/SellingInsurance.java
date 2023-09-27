package codechef.starters102;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SellingInsurance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
            int costPerInsurance = scanner.nextInt();
            double commission = 0.2 * costPerInsurance;
            
            System.out.println((int) Math.ceil(100 / commission));
        }
	}
}