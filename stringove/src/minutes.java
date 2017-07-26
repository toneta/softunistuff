import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  min = Integer.parseInt(scanner.nextLine());
        int  sec = Integer.parseInt(scanner.nextLine());
        if (sec<45){
            System.out.printf("%d:%02d", min, sec+15);
        } else {
            sec +=15;
            if (min==23) {
            min = -1;
            }
            min = min + sec/60;
            sec = sec%60;
            System.out.printf("%d:%02d", min, sec);
        }
    }
}
