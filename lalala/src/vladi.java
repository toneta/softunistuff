import java.util.Scanner;

/**
 * Created by Toni on 2/5/2017.
 */
public class vladi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        Double holidaysPerYear = Double.parseDouble(scanner.nextLine());
        Double goesCity = Double.parseDouble(scanner.nextLine());
        int weekendPerYear = 48;
        Double gamesSofia = (weekendPerYear - goesCity)*(3.0/4);
        // igrae i 2 igri v rodniq si grad TRQBVA DA SE DOBAVI
        Double gamesHolidays = holidaysPerYear*(2.0/3);
        Double playedVolley = gamesSofia+goesCity+gamesHolidays;
        if (year.equalsIgnoreCase("normal")){

        } else if (year.equalsIgnoreCase("leap")){
            playedVolley = playedVolley+(playedVolley*0.15);
        }


        System.out.println(Math.floor(playedVolley));
    }
}
