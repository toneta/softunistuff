import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-24.
 */
public class radianToDeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd*1.79549;
        System.out.printf("usd to bgn: %.2f", bgn);
    }
}
