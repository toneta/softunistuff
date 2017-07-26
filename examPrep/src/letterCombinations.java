import java.util.Scanner;

/**
 * Created by Toni on 3/16/2017.
 */
public class letterCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char excluded = scanner.nextLine().charAt(0);
        int count = 0;
        for (char letter1 = first; letter1 <= second; letter1++) {
            for (char letter2 = first; letter2 <=second ; letter2++) {
                for (char letter3 = first; letter3 <= second; letter3++) {
                    boolean match = letter1 == excluded || letter2 == excluded || letter3 == excluded;
                    if (!match){
                        count++;
                        System.out.printf("%s%s%s ", letter1, letter2, letter3);
                    }
                }
            }
        }
        System.out.print(count);
    }
}
