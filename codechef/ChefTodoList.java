package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefTodoList
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int index = 0;index < T;index++){
            int n = s.nextInt();
            int rem = 0;
            ArrayList<Integer> d = new ArrayList<>();

            for(int i=0;i<n;i++){
                int ele = s.nextInt();
                d.add(ele);
            }

            for(int i=0;i<n;i++){
                if(d.get(i)>=1000){
                    rem++;
                }
            }
            System.out.println(rem);
        }
    }
}
