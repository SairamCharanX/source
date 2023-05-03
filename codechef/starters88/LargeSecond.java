package codechef.starters88;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LargeSecond
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int n = s.nextInt();

            List<Integer> inputList = new ArrayList<Integer>();

            for(int num=0;num<n;num++){
                int temp = s.nextInt();
                inputList.add(temp);
            }

            Set<Integer> numSet = new LinkedHashSet<Integer>(inputList);
            //System.out.println(numSet);
            //Distinct unordered elements are obtained

            List<Integer> finalList = new ArrayList<Integer>(numSet);
            Collections.sort(finalList);
            //System.out.println(finalList);

            int maxSum = finalList.get(finalList.size()-1) + finalList.get(finalList.size()-2);
            System.out.println(maxSum);
        }
    }
}
