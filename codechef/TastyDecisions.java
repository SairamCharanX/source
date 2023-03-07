package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TastyDecisions
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int x = s.nextInt();
            int y = s.nextInt();

            int chocTaste = 2*x;
            int candyTaste = 5*y;

            if(chocTaste!=candyTaste){
                if(chocTaste>candyTaste){
                    System.out.println("Chocolate");
                }
                else{
                    System.out.println("Candy");
                }
            }
            else
                System.out.println("Either");
        }
    }
}
