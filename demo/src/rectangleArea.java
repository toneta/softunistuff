import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-23.
 */
public class rectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double dyljina = Math.max(y1,y2) - Math.min(y1,y2);
        double visochina = Math.max(x1,x2) - Math.min(x1,x2);
        double plosht = dyljina*visochina;
        double perimetyr = 2*(dyljina+visochina);
        System.out.println(plosht);
        System.out.println(perimetyr);

    }
}
