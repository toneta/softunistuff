import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class guessPas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String pass = new String("s3cr3t!P@ssw0rd");
        if (login.equals(pass)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
