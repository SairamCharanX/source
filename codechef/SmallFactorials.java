package codechef;

import java.util.Scanner;
public class SmallFactorials {

        static void getFactorial(Long num){
            long factorial = 1;

            while(num>=1){
                factorial = factorial*num;
                num--;
            }
            System.out.println(factorial);
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long cases = sc.nextLong();
        long temp = 1;

        for(long index=1;index<=cases;index++){
            //Getting the number for calculating factorial
            temp = sc.nextLong();
            getFactorial(temp);

        }
    }

}
