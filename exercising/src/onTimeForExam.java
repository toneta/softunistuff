import java.util.Scanner;

/**
 * Created by Toni on 3/18/2017.
 */
public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = Integer.parseInt(scanner.nextLine());
        int m1 = Integer.parseInt(scanner.nextLine());
        int h2 = Integer.parseInt(scanner.nextLine());
        int m2 = Integer.parseInt(scanner.nextLine());
        if (m2>m1 && h1<=h2){
            System.out.printf("Late \n%d minutes after the start", m2-m1);
        } else if (h1==h2 && m1 == m2){
            System.out.println("On time");
        }
    }
}
