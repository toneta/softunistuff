import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenSides = (2*(x*y)) - (2*(1.5*1.5));
        double greenFrontBack = 2*(x*x) - (1.2*2);
        double greenArea = greenSides + greenFrontBack;

        double redSides = 2*(x*y);
        double redTriangle = 2*((x*h)/2);
        double redArea = redSides + redTriangle;

        double greenPaintLeters = greenArea / 3.4;
        double redPaintLeters = redArea / 4.3;

        System.out.printf("%.2f\n%.2f", greenPaintLeters, redPaintLeters);

    }
}
