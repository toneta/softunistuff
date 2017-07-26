import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class days1000 {

    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = scanner.nextLine();
        //String date = "16-05-2016";

        LocalDate localDate = LocalDate.parse(date, formatter);

        // System.out.println(localDate);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate.plusDays(999)));

    }

}