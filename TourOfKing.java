public class TourOfKing {
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {

            Scanner s = new Scanner(System.in);
            int T = s.nextInt();

            for (int index = 0;index < T;index++){
                int fiveSeater = s.nextInt();
                int sevenSeater = s.nextInt();
                System.out.println(5*fiveSeater + 7*sevenSeater);
            }
        }


}
