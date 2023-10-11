package starters103;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        
        getMedal(hours);
	}
	
	public static void getMedal(int hours) {
	    if (hours < 3)
	    System.out.println("GOLD");
	    if (hours >= 3 && hours < 6)
	    System.out.println("SILVER");
	    if (hours >= 6)
	    System.out.println("BRONZE");
	}
}
