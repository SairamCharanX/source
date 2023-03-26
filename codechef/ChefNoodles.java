package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefNoodles
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int stoves = s.nextInt();
        int minutes = s.nextInt();

        System.out.println(minutes*stoves);
    }
}
