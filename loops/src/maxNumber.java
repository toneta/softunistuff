import java.util.Scanner;

/**
 * Created by Toni on 2/12/2017.
 */
public class maxNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < numbers; i++) {
            int chislo = Integer.parseInt(scanner.nextLine());
            if (chislo<min){
                min = chislo;
            }
        }
        System.out.println(min);
    }
}
