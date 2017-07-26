import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-23.
 */
public class circleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.PI*(r*r));
        System.out.println(2*Math.PI*r);
    }
}
