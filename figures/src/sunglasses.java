import java.util.Scanner;

/**
 * Created by Toni on 3/4/2017.
 */
public class sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.printf("%s%s%s \n", repeatStr("*",2*rows), repeatStr(" ", rows),
                repeatStr("*", 2*rows));
        int bridgeIndex = (rows/2)-1;
        if (rows%2==0){
            bridgeIndex -= 1;
        }
        for (int i = 0 ; i < rows-2 ; i++) {
            System.out.printf("*%s*", repeatStr("/", rows*2 - 2));
            if(i==bridgeIndex){
                System.out.print(repeatStr("|", rows));

            } else {
                System.out.print(repeatStr(" ", rows));
            }
            System.out.printf("*%s*", repeatStr("/", rows*2 - 2));
            System.out.println();
        }
        System.out.printf("%s%s%s \n", repeatStr("*",2*rows), repeatStr(" ", rows),
                repeatStr("*", 2*rows));
    }
    static String repeatStr(String repeatStr, int count) {
        String text = "";
        for (int i = 0 ; i < count ; i++) {
            text = text + repeatStr;
        }
        return text;
    }
}
