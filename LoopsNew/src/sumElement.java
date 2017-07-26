import java.util.Scanner;

/**
 * Created by Toni on 2/23/2017.
 */
public class sumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
            if (currentNum > max) {
                max = currentNum;
            }
        }
        if ((sum - max) == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff =" + Math.abs((sum-max)-max));
        }
    }
}
