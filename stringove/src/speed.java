import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class speed {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        String figure = skan.nextLine();
        Double side1;
        Double side2;
        Double result;
        if (figure.equals("square")){
           side1 = Double.parseDouble(skan.nextLine());
           result = side1*side1;
            System.out.printf("%.3f", result);
        } else if (figure.equals("rectangle")){
            side1 = Double.parseDouble(skan.nextLine());
            side2 = Double.parseDouble(skan.nextLine());
            result = side1*side2;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")){
            side1 = Double.parseDouble(skan.nextLine());
            result = Math.PI*(side1*side1);
            System.out.printf("%.3f", result);
        } else if (figure.equals("triangle")){
            side1 = Double.parseDouble(skan.nextLine());
            side2 = Double.parseDouble(skan.nextLine());
            result = .5*(side1*side2);
            System.out.printf("%.3f", result);

        }
    }
}
