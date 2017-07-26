import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-23.
 */
public class TRAPEzoid {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        double b1 = Double.parseDouble(skener.nextLine());
        double b2 = Double.parseDouble(skener.nextLine());
        double h = Double.parseDouble(skener.nextLine());

        System.out.println("Trapeca e: " + (b1+b2)*h/2);
    }
}
