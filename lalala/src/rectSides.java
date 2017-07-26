import java.util.Scanner;

/**
 * Created by Toni on 1/28/2017.
 */
public class rectSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        boolean isOnUpper = x==x1 && (y<=y2 && y>=y1);
        boolean isOnRight = y==y2 && (x<=x2 && x>=x1);
        boolean isOnDown = x==x2 && (y<=y2 && y>=y1);
        boolean isOnLeft = y==y1 && (x<=x2 && x>=x1);
        boolean inside = (x>=x1 && x<=x2) && (y>=y1 && y<=y2);

        if(isOnUpper || isOnRight || isOnDown || isOnLeft){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }


    }
}
