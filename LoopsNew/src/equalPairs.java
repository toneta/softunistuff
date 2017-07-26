import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Toni on 2/24/2017.
 */
public class equalPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum[] = new int[input];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < input; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            sum[i] = number1+number2;
            if(i>0){
                if(sum[i]!=sum[i-1]){
                    if(maxDiff<Math.abs(sum[i]-sum[i-1])) {
                        maxDiff = Math.abs(sum[i] - sum[i - 1]);
                    }
                }
            }
        }
        if (maxDiff==Integer.MIN_VALUE) {
            System.out.println("Yes, value=" + sum[0]);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
