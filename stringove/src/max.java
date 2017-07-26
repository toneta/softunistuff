import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-21.
 */
public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = Double.parseDouble(scanner.nextLine());
        Double b = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.max(a,b));
    }
}
