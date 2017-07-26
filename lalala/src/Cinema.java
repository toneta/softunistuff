import java.util.Scanner;

/**
 * Created by Toni on 2/5/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketType = scanner.nextLine();
        double row = Double.parseDouble(scanner.nextLine());
        double column = Double.parseDouble(scanner.nextLine());
        double ticketPrice;
        if (ticketType.equalsIgnoreCase("premiere")){
            ticketPrice = 12;
        } else if (ticketType.equalsIgnoreCase("normal")){
            ticketPrice = 7.5;
        } else if (ticketType.equalsIgnoreCase("discount")){
            ticketPrice = 5;
        } else {
            System.out.println("error");
            return;
        }
        System.out.println(row*column*ticketPrice);
    }
}
