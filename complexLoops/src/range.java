import java.util.Scanner;

/**
 * Created by Toni on 3/12/2017.
 */
public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n>100 || n<1){
            System.out.println("Enter a value in the range [1...100]: " + n);
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(n);
    }
}
