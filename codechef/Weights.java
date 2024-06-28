import java.util.*;
import java.lang.*;
import java.io.*;

class Weights
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        for(int index = 0;index < cases;index++){
            int weight = scanner.nextInt();
            int[] weights = new int[3];
            
            for(int innerIndex = 0;innerIndex < 3;innerIndex++)
                weights[innerIndex] = scanner.nextInt();
            
            int[] singles = new int[]{weights[0], weights[1], weights[2]};
            int[] duos = new int[]{weights[0] + weights[1],weights[0] + weights[2],weights[1] + weights[2]};
            int[] trios = new int[]{weights[0] + weights[1] + weights[2]};
            
            boolean flag = false;
            for(int indexAgain = 0;indexAgain < 3;indexAgain++){
                if(weight == singles[indexAgain] || weight == duos[indexAgain] || weight == trios[0])
                    flag = true;
            }
            
            if(flag)
            System.out.println("YES");
            else System.out.println("NO");
        }
	}
}