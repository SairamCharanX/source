import java.util.*;
import java.lang.*;
import java.io.*;

class TradeSurplus
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        for(int index = 0;index < cases;index++){
            int[] tradeData = new int[4];
            for(int innerIndex = 0;innerIndex < 4;innerIndex++)
                tradeData[innerIndex] = scanner.nextInt();
            
            int netExport = (tradeData[0] - tradeData[1] + tradeData[2] - tradeData[3]);
            if(netExport < 0)
                System.out.println("YES");
            else System.out.println("NO");
        }
	}
}