import java.util.Scanner;

/**
 * Created by Toni on 3/14/2017.
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int f1 = 1;
        int f2 = 1;
        if (n < 2){
            System.out.println(f1);
        } else {
            for (int i = 0; i < n-1; i++) {
                int  fNew = f1 + f2;
                f1 = f2;
                f2 = fNew;
                // System.out.println(f2);

            }
            System.out.println(f2);
        }
    }
}
