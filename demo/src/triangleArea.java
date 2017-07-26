import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-23.
 */
public class triangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strana = Double.parseDouble(scanner.nextLine());
        double visochina = Double.parseDouble(scanner.nextLine());
        double area = strana*visochina/2;
        System.out.printf("Areas is: %.2f", area);
        }
    }

