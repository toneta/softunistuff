import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner skener = new Scanner(System.in);
   //     System.out.print("vyvedete scanner: ");

        int skanira = Integer.parseInt(skener.nextLine());
        int arca = skanira*skanira;
        System.out.print(arca);
    }
}
