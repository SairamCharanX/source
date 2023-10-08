/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndStocks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
					
						int elementCount = scanner.nextInt();
						int[] elements = new int[elementCount];
						for (int innerIndex = 0; innerIndex < elementCount; innerIndex++){
							int temp = scanner.nextInt();
							elements[innerIndex] = temp;
						}
						int result = sum(elements) - findMinimum(elements);
						System.out.println(result);
        }
	}

	public static int sum(int[] numbers){
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return sum;
	}

	public static int findMinimum(int[] numbers){
		int minimum = Integer.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] < minimum){
				minimum = numbers[i];
			}
		}
		return minimum;
	}
}
