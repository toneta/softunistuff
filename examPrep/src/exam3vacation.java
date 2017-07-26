import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam3vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        String place = "";
        String location = "";
        double moneySpent = 0.0;
        if (budget <= 1000){
            place = "Camp";
            if (season.equalsIgnoreCase("summer")){
                location = "Alaska";
                moneySpent = budget*0.65;
            } else {
                location = "Morocco";
                moneySpent = budget*0.45;
            }

        } else if (budget > 1000 && budget <= 3000){
            place = "Hut";
            if (season.equalsIgnoreCase("summer")){
                location = "Alaska";
                moneySpent = budget*0.8;
            } else {
                location = "Morocco";
                moneySpent = budget*0.6;
            }
        } else {
            place = "Hotel";
            if (season.equalsIgnoreCase("summer")){
                location = "Alaska";
                moneySpent = budget*0.9;
            } else {
                location = "Morocco";
                moneySpent = budget*0.9;
            }
        }
        System.out.printf("%s - %s - %.2f",location, place, moneySpent);
    }
}
