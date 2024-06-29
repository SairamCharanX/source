import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        for(int index = 0;index < cases;index++){
            int toSell = scanner.nextInt();
            int sold = scanner.nextInt();
            
            int earned = 0;
            
            if(sold > toSell)
            earned = toSell + 2 * (sold - toSell);
            else earned = sold;
            
            System.out.println(earned);
        }
    }
}