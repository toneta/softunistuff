import java.util.Scanner;

/**
 * Created by Toni on 3/13/2017.
 */
public class tryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(n);
        } catch (NumberFormatException ex){
            System.out.println("Invalid");
        }
    }
}
