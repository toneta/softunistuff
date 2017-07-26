import java.util.Scanner;

/**
 * Created by Toni on 3/3/2017.
 */
public class rhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1 ; i <= n  ; i++) {
            for (int j = 0 ; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < i ; k++) {
                System.out.print("* ");
            }

            System.out.printf("\n");
        }
        for (int l = n-1 ; l >= 1  ; l--) {
            for (int j = 0 ; j < n-l ; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < l ; k++) {
                System.out.print("* ");
            }

            System.out.printf("\n");
        }
    }
}
