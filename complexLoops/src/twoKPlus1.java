import java.util.Scanner;

/**
 * Created by Toni on 3/12/2017.
 */
public class twoKPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;
        while (k <= n){
            System.out.println(k);
            k = k*2 + 1;

        }
    }
}
