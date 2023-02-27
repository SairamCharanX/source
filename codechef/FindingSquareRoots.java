package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class FindingSquareRoots
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int temp = s.nextInt();
            System.out.println((int)(Math.sqrt(temp)));
        }
    }
}

