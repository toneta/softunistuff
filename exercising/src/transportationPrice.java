import java.util.Scanner;

/**
 * Created by Toni on 3/17/2017.
 */
public class transportationPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        boolean isDay = scanner.nextLine().equalsIgnoreCase("day");
        double travelPrice = 0;
        if (km<20){
            //use taxi
            if (isDay){
                travelPrice = .7 + .79*km;
            } else {
                travelPrice = .7 + .90*km;
            }
        } else if (km < 100){
            //use bus
            travelPrice = km * .09;
        } else {
            //train
            travelPrice = km * .06;
        }
        System.out.println(travelPrice);
    }
}
