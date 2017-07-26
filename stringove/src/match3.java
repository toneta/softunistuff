import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class match3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double number1 = Double.parseDouble(scanner.nextLine());
        Double number2 = Double.parseDouble(scanner.nextLine());
        Double number3 = Double.parseDouble(scanner.nextLine());
        if (number1.equals(number2) && number3.equals(number2) && number1.equals(number3) ){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}