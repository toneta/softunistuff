import java.util.Scanner;

/**
 * Created by Toni on 3/3/2017.
 */
public class frame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = "- ";
        System.out.printf("+ %s+ \n", repeatStr(str,n-2));
        for (int i = 0 ; i < n-2 ; i++) {
            System.out.printf("| %s| \n", repeatStr(str,n-2));

        }
        System.out.printf("+ %s+", repeatStr(str,n-2));

    }
    static String repeatStr(String repeatStr, int count) {
        String text = "";
        for (int i = 0 ; i < count ; i++) {
            text = text + repeatStr;
        }
        return text;
    }
}
