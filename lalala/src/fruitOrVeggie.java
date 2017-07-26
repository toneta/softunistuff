import java.util.Scanner;

/**
 * Created by Toni on 1/28/2017.
 */
public class fruitOrVeggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("banana") || input.equalsIgnoreCase("apple") || input.equalsIgnoreCase("kiwi")
                || input.equalsIgnoreCase("cherry") || input.equalsIgnoreCase("lemon") || input.equalsIgnoreCase("grapes")){
            System.out.println("fruit");
        } else if(input.equalsIgnoreCase("tomato") || input.equalsIgnoreCase("cucumber") ||
                input.equalsIgnoreCase("pepper") || input.equalsIgnoreCase("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
