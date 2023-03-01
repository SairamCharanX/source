package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IntegerSumSameValue
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)==n){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
