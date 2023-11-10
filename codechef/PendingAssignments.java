import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int index = 0;index < cases;index++){
            int assignmentCount = scanner.nextInt();
            int timeRequiredInMinutes = scanner.nextInt();
            int days = scanner.nextInt();
            
            if (assignmentCount * timeRequiredInMinutes <= days * 24 * 60){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
	}
}
