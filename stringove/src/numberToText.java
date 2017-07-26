import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-21.
 */
public class numberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = new String();
        switch (a){
            case 1: b = "one";
            break;
            case 2: b = "two";
                break;
                case 3: b = "three";
                break;            case 4: b = "four";
                break;            case 5: b = "five";
                break;            case 6: b = "six";
                break;            case 7: b = "seven";
                break;            case 8: b = "eight";
                break;            case 9: b = "nine";
                break;
                default: b = "number too big";
        }
        System.out.println(b);
    }
}
