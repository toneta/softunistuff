import java.util.Scanner;

/**
 * Created by Toni on 2/4/2017.
 */
public class animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "tortoise":
            case "crocodile":
            case "snake":
                System.out.println("reptile");
                break;
                default:
                    System.out.println("unknown");
        }
    }
}
