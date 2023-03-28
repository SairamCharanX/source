package codechef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class age
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int cases = 0,currentAge = 0,minAge = 0,maxAge = 0,x=0;
        Scanner sc = new Scanner(System.in);
        //minAge,maxAge,currentAge input
        cases = sc.nextInt();
        while(x<cases){
            minAge = sc.nextInt();
            maxAge = sc.nextInt();
            currentAge = sc.nextInt();

            if(currentAge>=minAge && currentAge<=maxAge){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            x++;
        }

    }
}
