import java.util.Scanner;

/**
 * Created by Toni on 2/11/2017.
 */
public class numSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= numCount; i++) {
            int chislo = Integer.parseInt(scanner.nextLine());
            sum +=chislo;
        }
        System.out.println(sum);
    }
}
