import java.util.Scanner;

/**
 * Created by Toni on 3/19/2017.
 */
public class exam5hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sides = 2;
        System.out.printf("%s\n", repeatStr("*",2*n+1));
        System.out.printf(".*%s*.\n", repeatStr(" ", (2*n)-3));
        for (int i = (2*n)-5; i > 0; i -=2) {
            System.out.printf("%s*%s*%s\n", repeatStr(".",sides), repeatStr("@",i) ,
                    repeatStr(".",sides) );
            sides++;
        }
        System.out.printf("%s*%s\n",repeatStr(".",sides), repeatStr(".",sides));
        sides --;
        for (int i = 1; i <=(2*n)-5; i+=2) {
            System.out.printf("%s*%s@%s*%s\n", repeatStr(".",sides), repeatStr(" ",(i-1)/2) ,
                    repeatStr(" ",(i-1)/2),
                    repeatStr(".",sides) );
            sides--;
        }
        System.out.printf(".*%s*.\n", repeatStr("@", (2*n+1)-4));
        System.out.printf("%s", repeatStr("*",2*n+1));

    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0 ; i < count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
