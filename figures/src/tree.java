import java.util.Scanner;

/**
 * Created by Toni on 3/3/2017.
 */
public class tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int stars = 0 ; stars <= n ; stars++) {
            System.out.printf("%s%s | %s\n", repeat(" ", n-stars),
                    repeat("*", stars),
                    repeat("*", stars));
            
        }
    }
static String repeat (String str, int count){
        String text = "";
    for (int i = 0 ; i < count ; i++) {
        text +=str;
    }
    return text;
}
}

