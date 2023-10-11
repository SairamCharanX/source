package starters103;


import java.util.*;
import java.lang.*;
import java.io.*;

class DiceNumber
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
            int[] numbers = new int[6];
            for (int innerIndex = 0;innerIndex < 6; innerIndex++){
                int temp = scanner.nextInt();
                numbers[innerIndex] = temp;
            }

            ArrayList<Integer> aliceScores = new ArrayList<>();
            aliceScores.add(numbers[0]);
            aliceScores.add(numbers[1]);
            aliceScores.add(numbers[2]);
            
            ArrayList<Integer> bobScores = new ArrayList<>();
            bobScores.add(numbers[3]);
            bobScores.add(numbers[4]);
            bobScores.add(numbers[5]);
            
            Collections.sort(aliceScores);
            Collections.sort(bobScores);
            
            
            int aliceResult = (aliceScores.get(2) * 100) + (aliceScores.get(1) * 10) + aliceScores.get(0);
            int bobResult = (bobScores.get(2) * 100) + (bobScores.get(1) * 10) + bobScores.get(0);
            
            if (aliceResult > bobResult)
                System.out.println("ALICE");
            else if (bobResult > aliceResult)
                System.out.println("BOB");
            else
                System.out.println("TIE");
        
	}
	}
	
}
