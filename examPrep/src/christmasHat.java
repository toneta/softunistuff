import java.util.Scanner;

/**
 * Created by Toni on 3/16/2017.
 */
public class christmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int dotCount = n*2-1;
        int underscores = 0;
        System.out.printf("%s/|\\%s%n" , repeatStr(".",dotCount),repeatStr(".",dotCount));
        System.out.printf("%s\\|/%s%n", repeatStr(".",n*2-1),repeatStr(".",n*2-1));
        for (int i = dotCount; i >= 0; i--) {
            System.out.printf("%s*%s*%s*%s\n", repeatStr(".",i), repeatStr("-",underscores),
                    repeatStr("-",underscores),
                    repeatStr(".",i));
            underscores++;

        }
        String stars = repeatStr("*", n * 4 + 1);
        System.out.printf("%s %n" , stars, stars);
        System.out.printf("%s* %n" , repeatStr("*.",n*2));
        System.out.printf("%s %n" , stars, stars);
    }
    public static String repeatStr(String str, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str;
        }
        return text;
    }
}
