import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-09.
 */
public class apples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstnum, secondnum, result;
        firstnum = scanner.nextDouble();
        secondnum = scanner.nextDouble();
        result = firstnum + secondnum;
        System.out.println(result);
    }
}
