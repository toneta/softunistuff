import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-21.
 */
public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Double bonus = .0;
        if (a <= 100){
            bonus +=5;
        } else if (a > 100 && a < 1000){
            bonus = a*0.2;
        } else if (a > 1000){
            bonus = a*0.1;
        }
        if (a%2==0){
            bonus++;
        }
        if (a%10==5){
            bonus +=2;
        }

        System.out.println(bonus);
        System.out.println(a+bonus);
    }
}
