import java.util.Scanner;

public class changeTiles { // kato vtora
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleHeight = Double.parseDouble(scanner.nextLine());
        double pricePerTile = Double.parseDouble(scanner.nextLine());
        double handyman = Double.parseDouble(scanner.nextLine());

        double floorArea = floorLength * floorWidth;
        double tileArea = (triangleHeight*triangleSide)/2;
        int tilesNeeded = (int)Math.ceil(floorArea/tileArea) + 5;
        double price = (tilesNeeded * pricePerTile) + handyman;
        if (budget>=price){
            System.out.printf("%.2f lv left.", budget - price);
        } else {
            System.out.printf("You'll need %.2f lv more.", price - budget);
        }
    }
}
