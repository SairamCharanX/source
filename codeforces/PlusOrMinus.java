package codeforces;

import java.util.Scanner;

public class PlusOrMinus {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for (int index = 0;index < cases;index++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if(a+b==c)
                System.out.println("+");
            else
                System.out.println("-");
        }
    }

}
