package starters103;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
            int platesPrepared = scanner.nextInt();
            int platesTaken = scanner.nextInt();
            
            if ((platesPrepared / platesTaken) >= 20)
            System.out.println("20");
            
            else{
                System.out.println((int) Math.floor(platesPrepared / platesTaken));
            }
        }
	}
}
