package starters114;


import java.util.*;
import java.lang.*;
import java.io.*;

class PaintingWalls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int money = scanner.nextInt();
            int area = x * y;
            int cost = area * 2;
            
            //Subtract the cost from the money until it reaches a negative value
            int count = 0;
            while(money >= 0){
                money -= cost;
                if (money >= 0)
                count++;
            }
            System.out.println(count);
        }
	}
}
