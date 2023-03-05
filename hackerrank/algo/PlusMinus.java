package hackerrank.algo;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Met {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double pos=0,neg=0,nil=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                neg+=1;
            }
            else if(arr.get(i)>0){
                pos+=1;
            }
            else
                nil+=1;
        }
        System.out.println(String.format("%.6f",(pos/arr.size())));
        System.out.println(String.format("%.6f",(neg/arr.size())));
        System.out.println(String.format("%.6f",(nil/arr.size())));

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Met.plusMinus(arr);

        bufferedReader.close();
    }
}
