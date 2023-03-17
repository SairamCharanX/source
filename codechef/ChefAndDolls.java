package codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Add to ArrayList, sort, return flag false if count mismatch.
//check count for each type individually. %2==0

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndDolls
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        boolean flag = false;
        int cases = s.nextInt();

        for(int index=0;index<cases;index++){
            int n = s.nextInt();
            List<Integer> dolls = new ArrayList<Integer>();

            //Adding dolls to ArrayList
            for(int j=0;j<n;j++){
                int dollType = s.nextInt();
                dolls.add(dollType);
            }
            Collections.sort(dolls);

            //Take each element and compare to all other elements in array.


        }
    }
}
