import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-21.
 */
public class sumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result1 = Double.parseDouble(scanner.nextLine());
        double result2 = Double.parseDouble(scanner.nextLine());
        double result3 = Double.parseDouble(scanner.nextLine());
        double result = (result1+result2+result3);
        if (result<60){
            if (result<9) {
                System.out.printf("0:0%.0f", result);
            } else {
                System.out.printf("0:%.0f", result);
            }
        }
        if (result>=60 && result<120)
        {
            result -=60;
            if (result<9) {
                System.out.printf("1:0%.0f", result);
            } else {
                System.out.printf("1:%.0f", result);
            }
        }
        if (result>=120 && result<180)
        {
            result -=2*60;
            if (result<9) {
                System.out.printf("2:0%.0f", result);
            } else {
                System.out.printf("2:%.0f", result);
            }
        }
    }
}
