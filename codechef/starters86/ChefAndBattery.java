package codechef.starters86;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndBattery
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        int minutes = 0;

        for (int index = 0;index < cases;index++){
            int n = s.nextInt();

            //Edge cases first
            if(n==50){
                System.out.println("0");
            }
            else if(n==0){
                System.out.println("25");
            }
            else{
                while(n<=50){
                    n+=2;
                    minutes++;
                }
                while(n%2==1){
                    n-=3;
                    minutes++;
                }
                while(n!=50){
                    n+=2;
                    minutes++;
                }
                System.out.println(minutes);
                minutes = 0;
            }

        }
    }
}
