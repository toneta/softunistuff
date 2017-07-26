import java.util.Scanner;

/**
 * Created by Toni on 3/10/2017.
 */
public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int stars = 1;
        if (n<3){
            System.out.printf("%s", repeatStr("*",n));

        } else {
        if (n%2==0){
            stars++;
        }
        int side = (n-stars)/2;
        int middle = stars;
        System.out.printf("%s%s%s\n", repeatStr("-",side), repeatStr("*", stars), repeatStr("-",side));
        side--;
        for (int i = 0 ; i < (n-1)/2  ; i++) {

            draw(side, middle);
            side -=1;
            middle += 2;
        }
        side++;
        middle -=2;
        for (int j = ((n-1)/2)-1 ; j > 0  ; j--) {
            side ++;
            middle -= 2;
            draw(side, middle);
        }
side++;
        System.out.printf("%s%s%s\n", repeatStr("-",side), repeatStr("*", stars), repeatStr("-",side));
    }}

    private static void draw(int side, int middle) {
        System.out.printf("%s*%s*%s\n", repeatStr("-",side),repeatStr("-",middle),repeatStr("-",side) );
    }

    static String repeatStr(String str, int count){
        String text = "";
        for (int i = 0 ; i < count ; i++) {
            text += str;
        }
        return text;
    }
}
