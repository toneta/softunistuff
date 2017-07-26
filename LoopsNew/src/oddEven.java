import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/**
 * Created by Toni on 2/21/2017.
 */
public class oddEven {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("#.##");
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -800;
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -800;
        boolean isThereOdd = false;
        boolean isThereEven = false;

        for (int i = 1; i <= n; i++) {
            Double currentNumber = Double.parseDouble(scanner.nextLine());
            if(i%2==0) {
                isThereEven = true;
                evenSum += currentNumber;
                if (currentNumber<evenMin){
                    evenMin = currentNumber;
                }
                if (currentNumber>evenMax){
                    evenMax=currentNumber;
                }
            }
            else {
                isThereOdd = true;
                oddSum += currentNumber;
                if (currentNumber<oddMin){
                    oddMin = currentNumber;
                }
                if (currentNumber>oddMax){
                    oddMax=currentNumber;
                }
            }
        }
        if (isThereOdd) {
            System.out.println("OddSum=" + df.format(oddSum));
            System.out.println("OddMin=" + df.format(oddMin));
            System.out.println("OddMax=" + df.format(oddMax));
        } else {
            System.out.println("OddSum=" + 0);
            System.out.println("OddMin=No");
            System.out.println("OddMax=No" );
        }
        if(isThereEven) {
            System.out.println("EvenSum=" + df.format(evenSum));
            System.out.println("EvenMin=" + df.format(evenMin));
            System.out.println("EvenMax=" + df.format(evenMax));
        } else {
            System.out.println("EvenSum=" + 0);
            System.out.println("EvenMin=No" );
            System.out.println("EvenMax=No" );


        }
    }
}

