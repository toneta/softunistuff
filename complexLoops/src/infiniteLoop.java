import java.util.Scanner;

/**
 * Created by Toni on 3/13/2017.
 */
public class infiniteLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        if (n>2){
            for (int i = 2; i < n; i++) {
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        if (isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
