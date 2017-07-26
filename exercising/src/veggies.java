import java.util.Scanner;

/**
 * Created by Toni on 3/17/2017.
 */
public class veggies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int kgVeg = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());
        double vegCost = vegPrice *kgVeg;//74.99
        double fruitCost = fruitPrice *kgFruit; //44.37
        double total = (vegCost + fruitCost)/1.94;
        System.out.println(total);
    }
}
