import java.util.Scanner;

public class p04_BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double even = 0;
        double odd = 0;
        double yearsOld = 0;

        for (int i = 1800; i <= year; i = i + 2 ) {
            even = (even + 1);
        }

        for (int i = 1801; i <= year; i = i + 2) {
            odd = odd + 1;
        }

        even = even % 10;
        odd = odd % 10;

        double moneyOdd = 0;

        yearsOld = 18 + even + odd;

        double moneyLeft = 0;

        double moneyNeeded = even * 12000 + odd * 12000 + ;

        moneyLeft = money - moneyNeeded;

        if (moneyLeft >= 0) {
            System.out.printf("Yes! He will live a carefree life" +
                    " and will have %.02f dollars left.", moneyOdd);
        } else {
            System.out.printf("He will need %.02f dollars to" +
                    " survive.", moneyOdd);
        }
    }
}
