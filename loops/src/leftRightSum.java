import java.util.Scanner;

/**
 * Created by Toni on 2/12/2017.
 */
public class leftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            leftSum +=currentNumber;
        }
        for (int j = 0; j < n; j++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            rightSum +=currentNumber;

        }
        if (leftSum==rightSum){
            System.out.println("Yes, sum = " + rightSum);
        } else {
            System.out.println("No, diff = " + (Math.abs(rightSum-leftSum)));
        }
    }
}
