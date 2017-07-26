import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam6twoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine()); //po golqmoto
        int end = Integer.parseInt(scanner.nextLine()); // po malkoto
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean isEqual = false;
        for (int i = start; i >=end ; i--) {
            for (int j = start; j >=end ; j--) {
                combination++;
             //   System.out.printf("%d %d\n", i, j);
                if ((i+j) == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, i+j);
                    isEqual = true;
                    return;
                }
            }
        }
        if (!isEqual){
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
