package starters114;

import java.util.*;
import java.lang.*;
import java.io.*;

class ChristmasGreetings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        
        if(day == 25)
        System.out.println("CHRISTMAS");
        else
        System.out.println("ORDINARY");
	}
}
