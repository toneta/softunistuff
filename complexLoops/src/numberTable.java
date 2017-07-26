import java.util.Scanner;

/**
 * Created by Toni on 3/15/2017.
 */
public class numberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int rows = 0; rows < n; rows++) {
            for (int col = 0; col < n; col++) {
                int num = rows + col +1;
                if (num>n){
                    num = n*2 - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
