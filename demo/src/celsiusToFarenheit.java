import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-23.
 */
public class celsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        double farenheit = celsius* 1.8 + 32;
        System.out.printf("celsius to farenheit is " + farenheit);
    }
}
