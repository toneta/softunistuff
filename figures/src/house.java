import java.util.Scanner;

/**
 * Created by Toni on 3/8/2017.
 */
public class house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int roofHeight;
        int stars;
        if (n%2==0){
            roofHeight = n/2;
            stars = 2;
        } else {
            roofHeight = n/2 +1 ;
            stars = 1;
        }
        for (int i = 0 ; i < roofHeight  ; i++) {
            System.out.printf("%s%s%s\n", repeatStr("-", (n - stars)/2), repeatStr("*", stars), repeatStr(
                    "-", (n - stars)/2));
            stars += 2;
        }
        for (int base = 0 ; base < n-roofHeight ; base++) {
            System.out.printf("|%s|\n", repeatStr("*", stars-4));
        }
    }
    static String repeatStr(String str, int repeat){
        String text = "";
        for (int i = 0 ; i < repeat ; i++) {
            text += str;

        }
        return text;
    }
}
