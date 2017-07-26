    import java.util.Scanner;

    /**
    * Created by Toni on 1/28/2017.
    */
    public class invalidNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = Integer.parseInt(scanner.nextLine());
    boolean isValid = (input>=100 && input<=200) || input==0;
    if(!isValid){
        System.out.println("invalid");
    }

    }
    }
