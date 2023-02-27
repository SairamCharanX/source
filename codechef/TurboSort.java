package codechef;

import java.util.*;
import java.util.Arrays;

class TurboSort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        List<Integer> nums = new ArrayList<>();

        //Adding all numbers to the List
        for(int i=0;i<cases;i++){
            int x = s.nextInt();
            nums.add(x);
        }

        Collections.sort(nums);

        //Elements are to be printed on separate lines

        for(int i=0;i<cases;i++){
            System.out.println(nums.get(i));
        }
    }
}



