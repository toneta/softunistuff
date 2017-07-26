import java.util.Scanner;

/**
 * Created by Toni on 3/12/2017.
 */
public class CGD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        while (m>0){
                int oldM = m;
                m = n % m;
                n = oldM;
        }
        System.out.println(n);
    }
}
