import java.util.Scanner;

/**
 * Created by Toni on 3/17/2017.
 */
public class studyHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine())*100;
        double w = Double.parseDouble(scanner.nextLine())*100;
        double hallFace = w*h;
        int hPlaces = (int)Math.floor(h/120);
        int wPlaces = (int)Math.floor((w-100)/70); // 100cm za koridora
        int numberOfPlaces = (hPlaces*wPlaces) - 3; //3 mesta se mahat po uslovie
       System.out.println(numberOfPlaces);

    }
}
