import java.util.Scanner;

/**
 * Created by Toni on 3/12/2017.
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());;
        int fact = 1;
        do {
            fact *= n;
            n--;

        } while (n>1);
        System.out.println(fact);
    }
}
