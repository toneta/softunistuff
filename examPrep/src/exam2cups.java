import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam2cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsTarget = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = workers * days * 8; //8 sa chasovete koito rabotqt
        int cupsMade = totalHours / 5; // 5 e vremeto za izrabotka na edna chasha
        double cupPrice = 4.2;

        if(cupsMade < cupsTarget){
            double losses = (cupsTarget - cupsMade)*cupPrice;
            System.out.printf("Losses: %.2f", losses);
        } else {
            double winnings  = (cupsMade - cupsTarget)*cupPrice;
            System.out.printf("%.2f extra money", winnings);

        }
    }
}
