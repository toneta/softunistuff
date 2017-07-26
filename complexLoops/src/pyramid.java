import java.util.Scanner;

/**
 * Created by Toni on 3/14/2017.
 */
public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int i=0;
        while (true) {
            i++;
            for (int j = 0; j < i; j++) {
                number++;
                if (number == n+1){
                    return;
                }
                System.out.print(number + " ");
                            }
//            if (number == n+1){
//                break;
//            }
            System.out.println();
        }
    }
}
