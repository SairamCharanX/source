import java.util.*;
import java.lang.*;
import java.io.*;

class WaterMixing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        for(int index = 0;index < cases;index++){
            int initialTemperature = scanner.nextInt();
            int desiredTemperature = scanner.nextInt();
            int hotWaterInLitres = scanner.nextInt();
            int coldWaterInLitres = scanner.nextInt();
            boolean flag = false;
            
            if(initialTemperature == desiredTemperature)
            flag = true;
            
            else{
                //Temperature needs to be decreased. Add cold water
                if(initialTemperature > desiredTemperature){
                    if(coldWaterInLitres >= (initialTemperature - desiredTemperature))
                        flag = true;
                }
                else{
                    //Temperature needs to be increased. Add hot water
                    if((hotWaterInLitres) >= (desiredTemperature - initialTemperature))
                        flag = true;
                }
            }
            if(flag)
            System.out.println("YES");
            else System.out.println("NO");
        }
	}
}