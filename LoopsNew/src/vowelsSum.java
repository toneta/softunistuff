import java.util.Scanner;

/**
 * Created by Toni on 2/23/2017.
 */
public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            switch (currentChar){
                case 'a': sum++;
                break;
                case 'e': sum+=2;
                break;
                case 'i': sum+=3;
                break;
                case 'o': sum+=4;
                break;
                case 'u': sum+=5;
                break;
            }

        }
        System.out.println(sum);
    }
}
