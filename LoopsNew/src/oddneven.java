import java.util.Scanner;

/**
 * Created by Toni on 2/24/2017.
 */
public class oddneven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 1; i <= n; i++) {
                int currentNumber = Integer.parseInt(scanner.nextLine());
                if(i%2==0) {
                    evenSum += currentNumber;
                }
                else {
                    oddSum += currentNumber;
                }
            }
            if(evenSum == oddSum) {
                System.out.println("Yes, sum = " + oddSum);
            } else {
                System.out.println("No, diff = " + Math.abs(oddSum - evenSum));
            }
        }
    }
