import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        if (gender.equals("f")) {
            if(age<16){
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else if (gender.equals("m")) {
            if (age<16){
                System.out.println("Master");
            } else
            {
                System.out.println("Mr.");
            }
        } else {
            System.out.println("Please enter a valid value");
        }
        }
    }
