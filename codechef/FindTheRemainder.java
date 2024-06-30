import java.util.*;
import java.lang.*;
import java.io.*;

class FindTheRemainder
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int index = 0;

        while (index < cases) {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            System.out.println(firstNumber % secondNumber);
            index++;
        }
    }
}