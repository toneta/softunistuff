import java.util.Scanner;

/**
 * Created by Toneta on 2016-12-22.
 */
public class names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fistrname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s. %n sdfs", fistrname, lastname, age, town);
        System.out.printf("You are %s %s, a %d-years old person from %s. \n sdfs \n", fistrname, lastname, age, town);
        System.out.println(4.0/0);

    }
}
