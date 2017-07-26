import java.util.Scanner;

/**
 * Created by Toni on 3/16/2017.
 */
public class flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        boolean isHoliday = scanner.nextLine().equals("Y");
/*        3
        10
        9
        Winter
                N*/
        int totalFlowers = hrizantemi+roses+laleta;
        double hrizantemiPrice=0;
        double rosesPrice = 0;
        double laletaPrice = 0;
        switch (season){
            case "Spring":
            case "Summer":
                hrizantemiPrice = 2.00;
                rosesPrice = 4.10;
                laletaPrice = 2.5;
            break;
            case "Autumn":
            case "Winter":
                hrizantemiPrice = 3.75;
                rosesPrice = 4.50;
                laletaPrice = 4.15;
                break;
        }
        double flowerPrice = (hrizantemi*hrizantemiPrice) + (roses*rosesPrice) + (laleta*laletaPrice);
        if (isHoliday){
            flowerPrice *=1.15;
        }
        if (laleta>=7 && season.equalsIgnoreCase("Spring")){
            flowerPrice *=0.95;
        }
        if (roses >= 10 && season.equalsIgnoreCase("Winter")){
            flowerPrice *= 0.90;
        }
        if (totalFlowers>=20){
            flowerPrice *= .80;
        }
        System.out.printf("%.2f", flowerPrice+2); //69.39

    }
}
