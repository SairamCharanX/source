package codechef.starters84;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ElectionsInChefland
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int n = s.nextInt();
            int x = s.nextInt();
            int count = 0;
            List<Integer> ages = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                int temp = s.nextInt();
                ages.add(temp);
            }
            for(int j=0;j<n;j++){
                if(ages.get(j)>=x)
                    count+=1;
            }
            System.out.println(count);
        }
    }
}
