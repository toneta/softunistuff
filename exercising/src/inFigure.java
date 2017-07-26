import java.util.Scanner;

/**
 * Created by Toni on 3/17/2017.
 */
public class inFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int rectUpLeft = h;
        int rectUpTop = h*4;
        int rectUpRight = h*2;
        int rectUpBottom = 0;
        int rectDownLeft = 0;
        int rectDownTop = h;
        int rectDownRight = 3*h;
        int rectDownBottom = 0;
        boolean isInsideUp = (x>rectUpLeft && x<rectUpRight && y > rectUpBottom && y < rectUpTop);
        boolean isInsideDown = (x > rectDownLeft && x < rectDownRight && y < rectDownTop && y > rectDownBottom);
        boolean inYBorber = (y == rectDownBottom && x >= rectDownLeft && x <= rectDownRight)
                || (y == rectDownTop && x >= rectDownLeft && x <= rectDownRight)
                || (y ==rectUpTop && x >= rectUpLeft && x <= rectUpRight);
        boolean inXBorder = (x == rectDownLeft && y >= rectDownBottom && y <= rectDownTop) ||
                (x == rectDownRight && y >= rectDownBottom && y <= rectDownTop) ||
                (x == rectUpLeft && y <= rectUpTop && y>=rectDownTop) ||
                (x == rectUpRight && y <= rectUpTop && y>=rectDownTop);
        if (isInsideUp || isInsideDown){
            System.out.println("inside");
        } else if (inYBorber || inXBorder){ //dali syvpada i s gornite i s dolnite strani
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
