import java.util.Scanner;

/**
 * Created by Toneta on 2017-01-22.
 */
public class wordCompare {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        String word1 = skan.nextLine();
        String word2 = skan.nextLine();
        if(word1.toLowerCase().equals(word2.toLowerCase())){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
