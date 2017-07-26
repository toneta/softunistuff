import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        String unit = scanner.nextLine();
        String unitResult = scanner.nextLine();
        double meter = 1;
        double milimeters = 1000;
        double centimeters = 100;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double ft = 3.2808399;
        double yards = 1.0936133;
        switch (unit){
            case "m":
                break;
                  case "mm": input /= milimeters;
                break;
                  case "cm": input /= centimeters;
                break;
                  case "mi": input /=miles;
                break;
                  case "in": input /= inches;
                break;
                case "km": input /= kilometers;
                break;
                case "ft": input /= ft;
                break;
                case "yd": input /= yards;
                break;
        }
        switch (unitResult){
            case "m": input *= meter;
                break;
            case "mm": input *= milimeters;
                break;
            case "cm": input *= centimeters;
                break;
            case "mi": input *=miles;
                break;
            case "in": input *= inches;
                break;
            case "km": input *= kilometers;
                break;
            case "ft": input *= ft;
                break;
            case "yd": input *= yards;
                break;
        }
        System.out.printf("%f %s", input, unitResult);
    }
}
