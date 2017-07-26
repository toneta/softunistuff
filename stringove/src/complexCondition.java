import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-21.
 */
public class complexCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double grade = Double.parseDouble(scanner.nextLine());
        if (grade>=5.5){
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
