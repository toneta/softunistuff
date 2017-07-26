import java.util.Scanner;

/**
 * Created by Mitko on 2/14/2017.
 */
public class p01_RectangleOfStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < num; i++) {
            System.out.println(repeatStr(" ", num - i) +
            repeatStr("*", i) + " | " + repeatStr("*", i));
        }

        System.out.println(repeatStr("*", num) + " | "
                + repeatStr("*", num));



    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}

