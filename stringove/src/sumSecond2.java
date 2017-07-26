import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class sumSecond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int sum = time1+time2+time3;
        int minutes = sum/60;
        int seconds = sum%60;
        System.out.printf("%d:%02d", minutes, seconds);
    }
}
