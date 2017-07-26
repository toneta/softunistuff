import java.util.Scanner;

/**
 * Created by Toni on 3/12/2017.
 */
public class numberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rest;
        int result = 0;
        do {
            rest = n%10;
            n = n/10;
           // n = temp;
            result +=rest;
        }while (n>0);
        System.out.println(result);
    }
}
