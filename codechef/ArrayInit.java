package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayInit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> weekPoints = new ArrayList<>();

        for(int i=0;i<4;i++){
            int x = s.nextInt();
            weekPoints.add(x);
        }

        int count = 0;

        for(int i=0;i<4;i++){
            if(weekPoints.get(i)>=10){
                count++;
            }
        }
        System.out.println(count);
    }
}
